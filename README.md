# Análise: CRICFy TV (`com.cricfytv.sports`) v7.1

Código descompilado para análise de segurança. A APK foi extraída da TV TCL Smart TV Pro (Android 14, Google TV) em 25/10/2026.

| Campo | Valor |
|---|---|
| Pacote | `com.cricfytv.sports` |
| Versão | 7.1 (versionCode 51), minSdk 24, targetSdk 37 |
| SHA-256 da APK | ver `APK_SHA256.txt` |
| Certificado | CN=Sona Natwar Walia, O=Individual, L=Calangute, ST=Goa, C=91 |
| Firebase | projeto `cfynewtv`, sender `185914741153` |
| Instalação na TV | sideload (`com.google.android.packageinstaller`), 1.ª vez em 28/01/2026, atualizada em 15/09/2026 |

## Estrutura do repositório

| Pasta | Conteúdo |
|---|---|
| `jadx/sources/` | Fonte Java completa gerada pelo **jadx 1.5.1** (`--deobf --show-bad-code`). Cobre os SDKs e a maior parte do código. |
| `jadx/res/` | Recursos (layouts, strings, drawables). |
| `app-androguard/` | **O código próprio da app** (`com.android.vending.*` e `com.cricfytv.*`) descompilado com o **androguard DAD**. Cada classe tem também o `.bytecode.txt` com o Dalvik desmontado. **Comece por aqui.** |
| `manifest/` | `AndroidManifest.xml` (jadx e apktool) e o resumo do androguard (serviços, recetores, permissões, URLs). |
| `native/arm64-v8a/` | Bibliotecas nativas originais. `native/strings/` tem o `strings` de cada uma. |

### Porque há duas descompilações

As classes da própria app estão **protegidas contra descompilação**: depois de cada `return` há um `fill-array-data-payload` com lixo (tamanhos e larguras inválidos). O jadx e o baksmali/apktool rebentam nesses métodos (`JADX ERROR: Method load error` / `Invalid element width`), e os métodos importantes, como `App.onCreate()`, ficam vazios em `jadx/`. O androguard ignora o payload morto e consegue reconstruir esses métodos, por isso a versão boa dessas classes está em `app-androguard/`.

Outros truques de ofuscação:
- O código da app está no pacote **`com.android.vending`**, que é o nome de pacote da Google Play Store. Isto engana quem olha para stack traces ou listas de serviços (`com.android.vending.helpers.PushService`, `com.android.vending.player.FloatingPlayerService`).
- R8 com nomes curtos (`p000.*`).
- `com.cricfytv.sports.FuckOff.fuckYou()` e `com.android.vending.networking.Baker.merge(String, Context)`: este último é `native` e está em `libnative-lib.so` (`Java_com_android_vending_networking_Baker_merge`). Usa `SecretKeySpec` e `Base64`, portanto **desencripta configuração escondida** (provavelmente URLs e chaves de servidores). Está por analisar.

## Principais achados

### 1. Proxyware CashRaven ativado sem o ecrã de consentimento

**Inicialização:** `app-androguard/com/android/vending/App.java`, em `onCreate()`:
```java
CashRaven.Companion.createBranded("edge.cashraven.io", 9000,
        "97a90ab6b90a5bc3774fa72c34d36cb55c64ed84", /* android_id */ ...);
cashRaven.setAppId(getPackageName());
CashRavenService.Companion.configure(cashRaven, new CashRavenService.Config(..., Splash.class, ...));
```
- Servidor: `edge.cashraven.io:9000`. A string longa é a chave do programador no CashRaven.
- O dispositivo é identificado pelo `Settings.Secure.ANDROID_ID`.

**Opt-in forçado:** `app-androguard/com/android/vending/activities/Splash.java`, em `W()`:
```java
// espera até this.y ficar TRUE
app.cashRaven.optIn();
CashRavenService.Companion.start(this);
```
`this.y` passa a `TRUE` em `onCreate()` e em `onRequestPermissionsResult(101)`, **quer o utilizador aceite quer recuse a permissão de notificações**. Ou seja, `optIn()` é chamado de forma programática, sem o ecrã de consentimento do SDK (`CashRavenConsent` / `consent_screen`) e sem verificar `has_consent_decision`. O utilizador nunca chega a ver o texto que está em `libcr_android.so`: *"your device will be used to relay web traffic"*.

**Persistência:** `io.cashraven.sdk.CrBootReceiver` (BOOT_COMPLETED) e `CashRavenService` como foreground service (`FOREGROUND_SERVICE_DATA_SYNC`, canal de notificação `cr_share`).

**Motor:** `native/arm64-v8a/libcr_android.so` (Rust: tokio, snow/Noise protocol, curve25519, AES) mais a ponte `uniffi`. Verifica o IP público em `checkip.amazonaws.com`, `api.ipify.org`, `ifconfig.me` e `icanhazip.com`, e serve túneis TCP e UDP para terceiros.

### 2. Permissões excessivas para um player
`QUERY_ALL_PACKAGES`, `REQUEST_INSTALL_PACKAGES`, `REQUEST_DELETE_PACKAGES`, `SYSTEM_ALERT_WINDOW`, `RECEIVE_BOOT_COMPLETED`, ID de publicidade e Topics/Attribution API.

### 3. Backend e streams
- A base da API vem do Firebase Remote Config, na chave **`cric_api2`** (`App.onCreate`, `zd2.b`).
- Domínios de stream fixos no código: `dokoplay.xyz` (`/server_lookup.php?channel_id=premium`), `newembedplay.xyz`, `rtstv.xyz`.
- Publicidade: Unity Ads (o maior SDK da app), ironSource Ad Quality, AdMob e OMSDK.

## Por onde continuar

1. `app-androguard/com/android/vending/activities/Splash.java` e `App.java`: fluxo de arranque e CashRaven.
2. `jadx/sources/io/cashraven/sdk/`: API pública do SDK (`optIn`, `start`, `setAutostart`, `isServingAllowed`...).
3. `native/arm64-v8a/libnative-lib.so`: abrir no Ghidra e seguir `Java_com_android_vending_networking_Baker_merge` para recuperar a configuração encriptada.
4. `app-androguard/com/android/vending/networking/` e `zd2` (cliente OkHttp): pedidos à API.
5. Remote Config do projeto Firebase `cfynewtv`: confirmar se há outros interruptores remotos.

## Ferramentas
jadx 1.5.1, apktool 2.10.0 (falha parcial devido à anti-descompilação), androguard 4 (DAD), GNU strings.

> Repositório privado, apenas para análise de segurança. Não redistribuir.
