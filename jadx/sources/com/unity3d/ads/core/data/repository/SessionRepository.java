package com.unity3d.ads.core.data.repository;

import com.google.protobuf.ByteString;
import com.unity3d.ads.core.data.model.InitializationConfigurationInternal;
import com.unity3d.ads.core.data.model.InitializationState;
import com.unity3d.ads.core.data.model.TokenCounters;
import com.unity3d.ads.core.data.model.exception.InitializationException;
import gatewayprotocol.v1.InitializationResponseOuterClass;
import gatewayprotocol.v1.NativeConfigurationOuterClass;
import gatewayprotocol.v1.SessionCountersOuterClass;
import java.util.List;
import p000.ay0;
import p000.ta3;
import p000.z50;

/* compiled from: r8-map-id-48d9907f4e93732c11cf9c906afc42aa7d1b8bfe35a58b5c97659e3a4b269d57 */
/* loaded from: classes23.dex */
public interface SessionRepository {
    void addTimeToGlobalAdsFocusTime(int i);

    NativeConfigurationOuterClass.FeatureFlags getFeatureFlags();

    String getGameId();

    Object getGatewayCache(z50 z50Var);

    ByteString getGatewayState();

    String getGatewayUrl();

    int getHeaderBiddingTokenCounter();

    InitializationConfigurationInternal getInitializationConfiguration();

    InitializationException getInitializationError();

    InitializationState getInitializationState();

    NativeConfigurationOuterClass.NativeConfiguration getNativeConfiguration();

    ay0 getObserveInitializationState();

    ta3 getOnChange();

    Object getPrivacy(z50 z50Var);

    Object getPrivacyFsm(z50 z50Var);

    List<InitializationResponseOuterClass.RequestUrlOverride> getRequestUrlOverrides();

    SessionCountersOuterClass.SessionCounters getSessionCounters();

    ByteString getSessionId();

    ByteString getSessionToken();

    boolean getShouldInitialize();

    TokenCounters getTokenCounters();

    String getUnityInstallationId();

    String getUnityMegaSessionId();

    void incrementAllErrorsCount();

    void incrementBannerImpressionCount();

    void incrementBannerLoadRequestAdmCount();

    void incrementBannerLoadRequestCount();

    void incrementCacheTimeoutErrorsCount();

    void incrementFocusChangeCount();

    void incrementGlobalAdsFocusChangeCount();

    void incrementLoadRequestAdmCount();

    void incrementLoadRequestCount();

    void incrementSuccessCount();

    void incrementTokenSequenceNumber();

    void incrementTokenStartsCount();

    void incrementTokenWinsCount();

    boolean isDiagnosticsEnabled();

    boolean isFirstInitAttempt();

    boolean isNativeConfigReady();

    boolean isOmEnabled();

    boolean isSdkInitialized();

    boolean isTestModeEnabled();

    Object persistNativeConfiguration(z50 z50Var);

    void resetTokenCounters();

    void setGameId(String str);

    Object setGatewayCache(ByteString byteString, z50 z50Var);

    void setGatewayState(ByteString byteString);

    void setGatewayUrl(String str);

    void setInitializationConfiguration(InitializationConfigurationInternal initializationConfigurationInternal);

    void setInitializationError(InitializationException initializationException);

    void setInitializationLatency(int i);

    void setInitializationState(InitializationState initializationState);

    void setLastLoadLatency(int i);

    void setNativeConfiguration(NativeConfigurationOuterClass.NativeConfiguration nativeConfiguration);

    Object setPrivacy(ByteString byteString, z50 z50Var);

    Object setPrivacyFsm(ByteString byteString, z50 z50Var);

    void setRequestUrlOverrides(List<InitializationResponseOuterClass.RequestUrlOverride> list);

    void setSessionCounters(SessionCountersOuterClass.SessionCounters sessionCounters);

    void setSessionToken(ByteString byteString);

    void setShouldInitialize(boolean z);

    void setTokenCounters(TokenCounters tokenCounters);
}
