package com.unity3d.ads.core.domain;

import com.google.protobuf.ByteString;
import com.unity3d.ads.core.data.model.AdObject;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import java.util.Map;
import p000.y60;

/*  JADX ERROR: NullPointerException in pass: ClassModifier
    java.lang.NullPointerException: Cannot invoke "java.util.List.forEach(java.util.function.Consumer)" because "blocks" is null
    	at jadx.core.utils.BlockUtils.collectAllInsns(BlockUtils.java:1030)
    	at jadx.core.dex.visitors.ClassModifier.removeBridgeMethod(ClassModifier.java:240)
    	at jadx.core.dex.visitors.ClassModifier.removeSyntheticMethods(ClassModifier.java:155)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.ClassModifier.visit(ClassModifier.java:65)
    	at jadx.core.dex.visitors.ClassModifier.visit(ClassModifier.java:58)
    */
/* compiled from: r8-map-id-48d9907f4e93732c11cf9c906afc42aa7d1b8bfe35a58b5c97659e3a4b269d57 */
/* loaded from: classes14.dex */
public interface SendDiagnosticEvent {
    public static final String APP_ACTIVE = "app_active";
    public static final String ATTEMPT_INSERT_NULL_DIAGNOSTIC_EVENT = "attempt_insert_null_diagnostic_event";
    public static final String AVAILABLE = "available";
    public static final String AWAITED_INIT = "awaited_init";
    public static final String BANNER_DESTROYED = "native_banner_destroyed";
    public static final String BRIDGE_SEND_EVENT_FAILED = "bridge_send_event_failed";
    public static final String CACHE_SOURCE = "cache_source";
    public static final String COHERENCE_GET_COMMON_ATTRIBUTES_TIME = "native_coherence_get_common_attributes_time";
    public static final String COHERENCE_INIT_TIME = "native_coherence_init_time";
    public static final String COMPLETE_STATE = "complete_state";
    public static final String COROUTINE_NAME = "coroutine_name";
    public static final Companion Companion = null;
    public static final String EAGER_PRESHOW_PRELOAD_FAILURE_TIME = "native_eager_preshow_preload_failure_time";
    public static final String EAGER_PRESHOW_PRELOAD_SUCCESS_TIME = "native_eager_preshow_preload_success_time";
    public static final String GAME_ID = "game_id";
    public static final String IMPRESSION_OPPORTUNITY_ID = "impressionOpportunityId";
    public static final String INIT_GAME_ID_CHANGED = "native_initialize_game_id_changed";
    public static final String INIT_GAME_ID_SAME = "native_initialize_game_id_same";
    public static final String INIT_MISSED_NATIVE_PARSING = "native_initialize_missed_native_parsing";
    public static final String INIT_TEST_MODE_CHANGED = "native_initialize_test_mode_changed";
    public static final String INIT_TEST_MODE_SAME = "native_initialize_test_mode_same";
    public static final String INSTALL_REFERRAL_FETCH_COMPLETED = "install_referral_fetch_completed";
    public static final String INSTALL_REFERRAL_FETCH_FAILED = "install_referral_fetch_failed";
    public static final String INSTALL_REFERRAL_FETCH_TIMED_OUT = "install_referral_fetch_timed_out";
    public static final String IS_RETRY = "is_retry";
    public static final String KOTLIN_VERSION = "kotlin_version";
    public static final String LOAD_CONFIG_FAILURE_TIME = "native_load_config_failure_time";
    public static final String LOAD_CONFIG_SUCCESS_TIME = "native_load_config_success_time";
    public static final String MODULES_INIT_ENABLED = "modules_init_enabled";
    public static final String MODULE_COUNT = "module_count";
    public static final String MODULE_NAME = "module_name";
    public static final String NETWORK_CLIENT = "network_client";
    public static final String NETWORK_FAILURE = "native_network_failure_time";
    public static final String NETWORK_PARSE = "native_network_parse_failure";
    public static final String NEW_API = "new_api";
    public static final String NULL_DIAGNOSTIC_EVENT = "null_diagnostic_event";
    public static final String OM_ACTIVATE_FAILURE = "om_activate_failure_time";
    public static final String OM_ACTIVATE_STARTED = "om_activate_started";
    public static final String OM_ACTIVATE_SUCCESS = "om_activate_success_time";
    public static final String OM_IMPRESSION_OCCURRED_FAILURE = "om_impression_occurred_failure";
    public static final String OM_IMPRESSION_OCCURRED_SUCCESS = "om_impression_occurred_success";
    public static final String OM_SESSION_FINISH_FAILURE = "om_session_finish_failure";
    public static final String OM_SESSION_FINISH_SUCCESS = "om_session_finish_success";
    public static final String OM_SESSION_START_FAILURE = "om_session_start_failure";
    public static final String OM_SESSION_START_SUCCESS = "om_session_start_success";
    public static final String OPERATION = "operation";
    public static final String PREVIOUS_GAME_ID = "previous_game_id";
    public static final String PREVIOUS_TEST_MODE = "previous_test_mode";
    public static final String PROTOCOL = "protocol";
    public static final String REASON = "reason";
    public static final String REASON_AD_MARKUP_PARSE = "invalid_admarkup";
    public static final String REASON_AD_OBJECT_EXPIRED = "ad_object_expired";
    public static final String REASON_AD_OBJECT_NOT_FOUND = "ad_object_not_found";
    public static final String REASON_AD_PLAYER_SCOPE = "ad_player_scope_not_active";
    public static final String REASON_AD_VIEWER = "adviewer";
    public static final String REASON_ALREADY_SHOWING = "already_showing";
    public static final String REASON_CODE = "reason_code";
    public static final String REASON_DEBUG = "reason_debug";
    public static final String REASON_FAILED = "failed";
    public static final String REASON_GATEWAY = "gateway";
    public static final String REASON_INVALID_ENTRY_POINT = "invalid_url";
    public static final String REASON_INVALID_GAME_ID = "invalid_game_id";
    public static final String REASON_LISTENER_NULL = "listener_null";
    public static final String REASON_NETWORK = "network";
    public static final String REASON_NOT_INITIALIZED = "not_initialized";
    public static final String REASON_NO_CONFIG = "no_config";
    public static final String REASON_NO_FILL = "no_fill";
    public static final String REASON_NO_WEBVIEW_ENTRY_POINT = "no_webview_entry_point";
    public static final String REASON_OM_ALREADY_ACTIVE = "om_already_active";
    public static final String REASON_OM_CREATIVE_TYPE_INVALID = "om_creative_type_invalid";
    public static final String REASON_OM_CREATIVE_TYPE_NULL = "om_creative_type_null";
    public static final String REASON_OM_NOT_ACTIVE = "om_not_active";
    public static final String REASON_OM_SESSION_ALREADY_EXISTS = "om_session_already_exists";
    public static final String REASON_OM_SESSION_NOT_FOUND = "om_session_not_found";
    public static final String REASON_OPPORTUNITY_ID = "no_opportunity_id";
    public static final String REASON_OPPORTUNITY_USED = "opportunity_id_used";
    public static final String REASON_PLACEMENT_NOT_LOADED = "placement_not_loaded";
    public static final String REASON_PLACEMENT_NULL = "placement_null";
    public static final String REASON_PLACEMENT_VALIDATION = "placement_validation";
    public static final String REASON_PROTOBUF_PARSING = "protobuf_parsing";
    public static final String REASON_TIMEOUT = "timeout";
    public static final String REASON_TIMEOUT_INITIALIZATION = "timeout_initialization";
    public static final String REASON_UNCAUGHT_EXCEPTION = "uncaught_exception";
    public static final String REASON_UNKNOWN = "unknown";
    public static final String REASON_WEBVIEWLESS_AD_NOT_FOUND = "webviewless_ad_not_found";
    public static final String REASON_WEBVIEW_LESS_SHOW_FAIL = "webview_less_show_fail";
    public static final String REASON_WEBVIEW_RENDER_PROCESS_GONE = "webview_render_process_gone";
    public static final String RETRIES = "retries";
    public static final String SAME_SESSION = "same_session";
    public static final String SHOW_ACTIVITY_MISMATCH = "native_show_activity_mismatch";
    public static final String SHOW_ACTIVITY_NOT_AVAILABLE = "native_show_activity_not_available";
    public static final String SHOW_AD_VIEWER_FULLSCREEN = "native_show_ad_viewer_fullscreen";
    public static final String SHOW_CANCEL_TIMEOUT = "native_show_cancel_timeout";
    public static final String SHOW_CURRENT_ACTIVITY_NULL = "native_show_current_activity_null";
    public static final String SHOW_IS_FILE_CACHED_FAILURE = "native_show_is_file_cached_failure_time";
    public static final String SHOW_IS_FILE_CACHED_SUCCESS = "native_show_is_file_cached_success_time";
    public static final String SHOW_START_ACTIVITY_RETRIED_WITH_CURRENT_ACTIVITY = "native_show_start_activity_retried_with_current_activity";
    public static final String SIZE_KB = "size_kb";
    public static final String SOURCE = "source";
    public static final String SOURCE_GET_TOKEN_API = "get_token";
    public static final String SOURCE_INIT_API = "init";
    public static final String SOURCE_LOAD_API = "load";
    public static final String SOURCE_PUBLIC_API = "api";
    public static final String SOURCE_SHOW_API = "show";
    public static final String STATE = "state";
    public static final String SYNC = "sync";
    public static final String SYSTEM_CRONET_ENGINE_ERROR = "native_cronet_engine_error";
    public static final String SYSTEM_CRONET_FAILURE = "native_cronet_failure_time";
    public static final String SYSTEM_CRONET_FALLBACK_AVAILABLE = "native_cronet_fallback_available";
    public static final String SYSTEM_CRONET_INSTALL_ERROR = "native_cronet_install_error";
    public static final String SYSTEM_CRONET_SUCCESS = "native_cronet_success_time";
    public static final String SYSTEM_CRONET_TIMEOUT = "native_cronet_timeout";
    public static final String TEST_MODE = "test_mode";
    public static final String URL = "url";
    public static final String WEBVIEW_COULD_NOT_HANDLE_INTERCEPTED_URL = "webview_could_not_handle_intercepted_url";
    public static final String WEBVIEW_ERROR = "webview_error";
    public static final String WEBVIEW_ERROR_CODE = "webview_error_code";
    public static final String WEBVIEW_INVOCATION = "webview_invocation";
    public static final String WEBVIEW_INVOCATION_ERROR = "native_webview_invocation_error";
    public static final String WEBVIEW_LESS = "webviewless";
    public static final String WEBVIEW_LESS_AD_ACTIVITY_LAUNCHED = "native_webview_less_ad_activity_launched";
    public static final String WEBVIEW_LESS_AD_DISPLAY_STARTED = "native_webview_less_ad_display_started";
    public static final String WEBVIEW_LESS_ASSET_CACHE_FAIL = "native_webview_less_asset_cache_fail";
    public static final String WEBVIEW_LESS_ASSET_CACHE_TIMEOUT = "native_webview_less_asset_cache_timeout";
    public static final String WEBVIEW_LESS_SHOW_STARTED = "native_webview_less_show_started";
    public static final String WEBVIEW_URL = "webview_url";

    /* compiled from: r8-map-id-48d9907f4e93732c11cf9c906afc42aa7d1b8bfe35a58b5c97659e3a4b269d57 */
    /* loaded from: classes23.dex */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = null;
        public static final String APP_ACTIVE = "app_active";
        public static final String ATTEMPT_INSERT_NULL_DIAGNOSTIC_EVENT = "attempt_insert_null_diagnostic_event";
        public static final String AVAILABLE = "available";
        public static final String AWAITED_INIT = "awaited_init";
        public static final String BANNER_DESTROYED = "native_banner_destroyed";
        public static final String BRIDGE_SEND_EVENT_FAILED = "bridge_send_event_failed";
        public static final String CACHE_SOURCE = "cache_source";
        public static final String COHERENCE_GET_COMMON_ATTRIBUTES_TIME = "native_coherence_get_common_attributes_time";
        public static final String COHERENCE_INIT_TIME = "native_coherence_init_time";
        public static final String COMPLETE_STATE = "complete_state";
        public static final String COROUTINE_NAME = "coroutine_name";
        public static final String EAGER_PRESHOW_PRELOAD_FAILURE_TIME = "native_eager_preshow_preload_failure_time";
        public static final String EAGER_PRESHOW_PRELOAD_SUCCESS_TIME = "native_eager_preshow_preload_success_time";
        public static final String GAME_ID = "game_id";
        public static final String IMPRESSION_OPPORTUNITY_ID = "impressionOpportunityId";
        public static final String INIT_GAME_ID_CHANGED = "native_initialize_game_id_changed";
        public static final String INIT_GAME_ID_SAME = "native_initialize_game_id_same";
        public static final String INIT_MISSED_NATIVE_PARSING = "native_initialize_missed_native_parsing";
        public static final String INIT_TEST_MODE_CHANGED = "native_initialize_test_mode_changed";
        public static final String INIT_TEST_MODE_SAME = "native_initialize_test_mode_same";
        public static final String INSTALL_REFERRAL_FETCH_COMPLETED = "install_referral_fetch_completed";
        public static final String INSTALL_REFERRAL_FETCH_FAILED = "install_referral_fetch_failed";
        public static final String INSTALL_REFERRAL_FETCH_TIMED_OUT = "install_referral_fetch_timed_out";
        public static final String IS_RETRY = "is_retry";
        public static final String KOTLIN_VERSION = "kotlin_version";
        public static final String LOAD_CONFIG_FAILURE_TIME = "native_load_config_failure_time";
        public static final String LOAD_CONFIG_SUCCESS_TIME = "native_load_config_success_time";
        public static final String MODULES_INIT_ENABLED = "modules_init_enabled";
        public static final String MODULE_COUNT = "module_count";
        public static final String MODULE_NAME = "module_name";
        public static final String NETWORK_CLIENT = "network_client";
        public static final String NETWORK_FAILURE = "native_network_failure_time";
        public static final String NETWORK_PARSE = "native_network_parse_failure";
        public static final String NEW_API = "new_api";
        public static final String NULL_DIAGNOSTIC_EVENT = "null_diagnostic_event";
        public static final String OM_ACTIVATE_FAILURE = "om_activate_failure_time";
        public static final String OM_ACTIVATE_STARTED = "om_activate_started";
        public static final String OM_ACTIVATE_SUCCESS = "om_activate_success_time";
        public static final String OM_IMPRESSION_OCCURRED_FAILURE = "om_impression_occurred_failure";
        public static final String OM_IMPRESSION_OCCURRED_SUCCESS = "om_impression_occurred_success";
        public static final String OM_SESSION_FINISH_FAILURE = "om_session_finish_failure";
        public static final String OM_SESSION_FINISH_SUCCESS = "om_session_finish_success";
        public static final String OM_SESSION_START_FAILURE = "om_session_start_failure";
        public static final String OM_SESSION_START_SUCCESS = "om_session_start_success";
        public static final String OPERATION = "operation";
        public static final String PREVIOUS_GAME_ID = "previous_game_id";
        public static final String PREVIOUS_TEST_MODE = "previous_test_mode";
        public static final String PROTOCOL = "protocol";
        public static final String REASON = "reason";
        public static final String REASON_AD_MARKUP_PARSE = "invalid_admarkup";
        public static final String REASON_AD_OBJECT_EXPIRED = "ad_object_expired";
        public static final String REASON_AD_OBJECT_NOT_FOUND = "ad_object_not_found";
        public static final String REASON_AD_PLAYER_SCOPE = "ad_player_scope_not_active";
        public static final String REASON_AD_VIEWER = "adviewer";
        public static final String REASON_ALREADY_SHOWING = "already_showing";
        public static final String REASON_CODE = "reason_code";
        public static final String REASON_DEBUG = "reason_debug";
        public static final String REASON_FAILED = "failed";
        public static final String REASON_GATEWAY = "gateway";
        public static final String REASON_INVALID_ENTRY_POINT = "invalid_url";
        public static final String REASON_INVALID_GAME_ID = "invalid_game_id";
        public static final String REASON_LISTENER_NULL = "listener_null";
        public static final String REASON_NETWORK = "network";
        public static final String REASON_NOT_INITIALIZED = "not_initialized";
        public static final String REASON_NO_CONFIG = "no_config";
        public static final String REASON_NO_FILL = "no_fill";
        public static final String REASON_NO_WEBVIEW_ENTRY_POINT = "no_webview_entry_point";
        public static final String REASON_OM_ALREADY_ACTIVE = "om_already_active";
        public static final String REASON_OM_CREATIVE_TYPE_INVALID = "om_creative_type_invalid";
        public static final String REASON_OM_CREATIVE_TYPE_NULL = "om_creative_type_null";
        public static final String REASON_OM_NOT_ACTIVE = "om_not_active";
        public static final String REASON_OM_SESSION_ALREADY_EXISTS = "om_session_already_exists";
        public static final String REASON_OM_SESSION_NOT_FOUND = "om_session_not_found";
        public static final String REASON_OPPORTUNITY_ID = "no_opportunity_id";
        public static final String REASON_OPPORTUNITY_USED = "opportunity_id_used";
        public static final String REASON_PLACEMENT_NOT_LOADED = "placement_not_loaded";
        public static final String REASON_PLACEMENT_NULL = "placement_null";
        public static final String REASON_PLACEMENT_VALIDATION = "placement_validation";
        public static final String REASON_PROTOBUF_PARSING = "protobuf_parsing";
        public static final String REASON_TIMEOUT = "timeout";
        public static final String REASON_TIMEOUT_INITIALIZATION = "timeout_initialization";
        public static final String REASON_UNCAUGHT_EXCEPTION = "uncaught_exception";
        public static final String REASON_UNKNOWN = "unknown";
        public static final String REASON_WEBVIEWLESS_AD_NOT_FOUND = "webviewless_ad_not_found";
        public static final String REASON_WEBVIEW_LESS_SHOW_FAIL = "webview_less_show_fail";
        public static final String REASON_WEBVIEW_RENDER_PROCESS_GONE = "webview_render_process_gone";
        public static final String RETRIES = "retries";
        public static final String SAME_SESSION = "same_session";
        public static final String SHOW_ACTIVITY_MISMATCH = "native_show_activity_mismatch";
        public static final String SHOW_ACTIVITY_NOT_AVAILABLE = "native_show_activity_not_available";
        public static final String SHOW_AD_VIEWER_FULLSCREEN = "native_show_ad_viewer_fullscreen";
        public static final String SHOW_CANCEL_TIMEOUT = "native_show_cancel_timeout";
        public static final String SHOW_CURRENT_ACTIVITY_NULL = "native_show_current_activity_null";
        public static final String SHOW_IS_FILE_CACHED_FAILURE = "native_show_is_file_cached_failure_time";
        public static final String SHOW_IS_FILE_CACHED_SUCCESS = "native_show_is_file_cached_success_time";
        public static final String SHOW_START_ACTIVITY_RETRIED_WITH_CURRENT_ACTIVITY = "native_show_start_activity_retried_with_current_activity";
        public static final String SIZE_KB = "size_kb";
        public static final String SOURCE = "source";
        public static final String SOURCE_GET_TOKEN_API = "get_token";
        public static final String SOURCE_INIT_API = "init";
        public static final String SOURCE_LOAD_API = "load";
        public static final String SOURCE_PUBLIC_API = "api";
        public static final String SOURCE_SHOW_API = "show";
        public static final String STATE = "state";
        public static final String SYNC = "sync";
        public static final String SYSTEM_CRONET_ENGINE_ERROR = "native_cronet_engine_error";
        public static final String SYSTEM_CRONET_FAILURE = "native_cronet_failure_time";
        public static final String SYSTEM_CRONET_FALLBACK_AVAILABLE = "native_cronet_fallback_available";
        public static final String SYSTEM_CRONET_INSTALL_ERROR = "native_cronet_install_error";
        public static final String SYSTEM_CRONET_SUCCESS = "native_cronet_success_time";
        public static final String SYSTEM_CRONET_TIMEOUT = "native_cronet_timeout";
        public static final String TEST_MODE = "test_mode";
        public static final String URL = "url";
        public static final String WEBVIEW_COULD_NOT_HANDLE_INTERCEPTED_URL = "webview_could_not_handle_intercepted_url";
        public static final String WEBVIEW_ERROR = "webview_error";
        public static final String WEBVIEW_ERROR_CODE = "webview_error_code";
        public static final String WEBVIEW_INVOCATION = "webview_invocation";
        public static final String WEBVIEW_INVOCATION_ERROR = "native_webview_invocation_error";
        public static final String WEBVIEW_LESS = "webviewless";
        public static final String WEBVIEW_LESS_AD_ACTIVITY_LAUNCHED = "native_webview_less_ad_activity_launched";
        public static final String WEBVIEW_LESS_AD_DISPLAY_STARTED = "native_webview_less_ad_display_started";
        public static final String WEBVIEW_LESS_ASSET_CACHE_FAIL = "native_webview_less_asset_cache_fail";
        public static final String WEBVIEW_LESS_ASSET_CACHE_TIMEOUT = "native_webview_less_asset_cache_timeout";
        public static final String WEBVIEW_LESS_SHOW_STARTED = "native_webview_less_show_started";
        public static final String WEBVIEW_URL = "webview_url";

        /* compiled from: r8-map-id-48d9907f4e93732c11cf9c906afc42aa7d1b8bfe35a58b5c97659e3a4b269d57 */
        /* loaded from: classes5.dex */
        public static final class NoScopeCoroutineScope implements y60 {
            public static final NoScopeCoroutineScope INSTANCE = null;

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1435266145 < 0) in method: com.unity3d.ads.core.domain.SendDiagnosticEvent.Companion.NoScopeCoroutineScope.<init>():void, file: classes5.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1435266145 < 0)
                	at java.base/java.nio.Buffer.createPositionException(Buffer.java:352)
                	at java.base/java.nio.Buffer.position(Buffer.java:327)
                	at java.base/java.nio.ByteBuffer.position(ByteBuffer.java:1551)
                	at jadx.plugins.input.dex.sections.SectionReader.skip(SectionReader.java:92)
                	at jadx.plugins.input.dex.insns.DexInsnFormat$30.skip(DexInsnFormat.java:358)
                	at jadx.plugins.input.dex.sections.DexCodeReader.skip(DexCodeReader.java:105)
                	at jadx.plugins.input.dex.sections.DexCodeReader.visitInstructions(DexCodeReader.java:89)
                	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:46)
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:157)
                	... 2 more
                */
            private NoScopeCoroutineScope() {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1435266145 < 0) in method: com.unity3d.ads.core.domain.SendDiagnosticEvent.Companion.NoScopeCoroutineScope.<init>():void, file: classes5.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.SendDiagnosticEvent.Companion.NoScopeCoroutineScope.<init>():void");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-2133558432 < 0) in method: com.unity3d.ads.core.domain.SendDiagnosticEvent.Companion.NoScopeCoroutineScope.getCoroutineContext():m60, file: classes5.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-2133558432 < 0)
                	at java.base/java.nio.Buffer.createPositionException(Buffer.java:352)
                	at java.base/java.nio.Buffer.position(Buffer.java:327)
                	at java.base/java.nio.ByteBuffer.position(ByteBuffer.java:1551)
                	at jadx.plugins.input.dex.sections.SectionReader.skip(SectionReader.java:92)
                	at jadx.plugins.input.dex.insns.DexInsnFormat$30.skip(DexInsnFormat.java:358)
                	at jadx.plugins.input.dex.sections.DexCodeReader.skip(DexCodeReader.java:105)
                	at jadx.plugins.input.dex.sections.DexCodeReader.visitInstructions(DexCodeReader.java:89)
                	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:46)
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:157)
                	... 2 more
                */
            @Override // p000.y60
            public p000.m60 getCoroutineContext() {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-2133558432 < 0) in method: com.unity3d.ads.core.domain.SendDiagnosticEvent.Companion.NoScopeCoroutineScope.getCoroutineContext():m60, file: classes5.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.SendDiagnosticEvent.Companion.NoScopeCoroutineScope.getCoroutineContext():m60");
            }
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1253161110 < 0) in method: com.unity3d.ads.core.domain.SendDiagnosticEvent.Companion.<clinit>():void, file: classes23.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1253161110 < 0)
            	at java.base/java.nio.Buffer.createPositionException(Buffer.java:352)
            	at java.base/java.nio.Buffer.position(Buffer.java:327)
            	at java.base/java.nio.ByteBuffer.position(ByteBuffer.java:1551)
            	at jadx.plugins.input.dex.sections.SectionReader.skip(SectionReader.java:92)
            	at jadx.plugins.input.dex.insns.DexInsnFormat$30.skip(DexInsnFormat.java:358)
            	at jadx.plugins.input.dex.sections.DexCodeReader.skip(DexCodeReader.java:105)
            	at jadx.plugins.input.dex.sections.DexCodeReader.visitInstructions(DexCodeReader.java:89)
            	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:46)
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:157)
            	... 7 more
            */
        static {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1253161110 < 0) in method: com.unity3d.ads.core.domain.SendDiagnosticEvent.Companion.<clinit>():void, file: classes23.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.SendDiagnosticEvent.Companion.<clinit>():void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1910563095 < 0) in method: com.unity3d.ads.core.domain.SendDiagnosticEvent.Companion.<init>():void, file: classes23.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1910563095 < 0)
            	at java.base/java.nio.Buffer.createPositionException(Buffer.java:352)
            	at java.base/java.nio.Buffer.position(Buffer.java:327)
            	at java.base/java.nio.ByteBuffer.position(ByteBuffer.java:1551)
            	at jadx.plugins.input.dex.sections.SectionReader.skip(SectionReader.java:92)
            	at jadx.plugins.input.dex.insns.DexInsnFormat$30.skip(DexInsnFormat.java:358)
            	at jadx.plugins.input.dex.sections.DexCodeReader.skip(DexCodeReader.java:105)
            	at jadx.plugins.input.dex.sections.DexCodeReader.visitInstructions(DexCodeReader.java:89)
            	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:46)
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:157)
            	... 7 more
            */
        private Companion() {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1910563095 < 0) in method: com.unity3d.ads.core.domain.SendDiagnosticEvent.Companion.<init>():void, file: classes23.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.SendDiagnosticEvent.Companion.<init>():void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-12772110 < 0) in method: com.unity3d.ads.core.domain.SendDiagnosticEvent.Companion.getTmpAdObjectForEventSending$default(com.unity3d.ads.core.domain.SendDiagnosticEvent$Companion, com.google.protobuf.ByteString, java.lang.String, boolean, com.unity3d.ads.UnityAdsLoadOptions, gatewayprotocol.v1.DiagnosticEventRequestOuterClass$DiagnosticAdType, int, java.lang.Object):com.unity3d.ads.core.data.model.AdObject, file: classes23.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-12772110 < 0)
            	at java.base/java.nio.Buffer.createPositionException(Buffer.java:352)
            	at java.base/java.nio.Buffer.position(Buffer.java:327)
            	at java.base/java.nio.ByteBuffer.position(ByteBuffer.java:1551)
            	at jadx.plugins.input.dex.sections.SectionReader.skip(SectionReader.java:92)
            	at jadx.plugins.input.dex.insns.DexInsnFormat$30.skip(DexInsnFormat.java:358)
            	at jadx.plugins.input.dex.sections.DexCodeReader.skip(DexCodeReader.java:105)
            	at jadx.plugins.input.dex.sections.DexCodeReader.visitInstructions(DexCodeReader.java:89)
            	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:46)
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:157)
            	... 7 more
            */
        public static /* synthetic */ com.unity3d.ads.core.data.model.AdObject getTmpAdObjectForEventSending$default(com.unity3d.ads.core.domain.SendDiagnosticEvent.Companion r0, com.google.protobuf.ByteString r1, java.lang.String r2, boolean r3, com.unity3d.ads.UnityAdsLoadOptions r4, gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticAdType r5, int r6, java.lang.Object r7) {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-12772110 < 0) in method: com.unity3d.ads.core.domain.SendDiagnosticEvent.Companion.getTmpAdObjectForEventSending$default(com.unity3d.ads.core.domain.SendDiagnosticEvent$Companion, com.google.protobuf.ByteString, java.lang.String, boolean, com.unity3d.ads.UnityAdsLoadOptions, gatewayprotocol.v1.DiagnosticEventRequestOuterClass$DiagnosticAdType, int, java.lang.Object):com.unity3d.ads.core.data.model.AdObject, file: classes23.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.SendDiagnosticEvent.Companion.getTmpAdObjectForEventSending$default(com.unity3d.ads.core.domain.SendDiagnosticEvent$Companion, com.google.protobuf.ByteString, java.lang.String, boolean, com.unity3d.ads.UnityAdsLoadOptions, gatewayprotocol.v1.DiagnosticEventRequestOuterClass$DiagnosticAdType, int, java.lang.Object):com.unity3d.ads.core.data.model.AdObject");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (2073414490 > 406240) in method: com.unity3d.ads.core.domain.SendDiagnosticEvent.Companion.getTmpAdObjectForEventSending(com.google.protobuf.ByteString, java.lang.String, boolean, com.unity3d.ads.UnityAdsLoadOptions, gatewayprotocol.v1.DiagnosticEventRequestOuterClass$DiagnosticAdType):com.unity3d.ads.core.data.model.AdObject, file: classes23.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (2073414490 > 406240)
            	at java.base/java.nio.Buffer.createPositionException(Buffer.java:352)
            	at java.base/java.nio.Buffer.position(Buffer.java:327)
            	at java.base/java.nio.ByteBuffer.position(ByteBuffer.java:1551)
            	at jadx.plugins.input.dex.sections.SectionReader.skip(SectionReader.java:92)
            	at jadx.plugins.input.dex.insns.DexInsnFormat$30.skip(DexInsnFormat.java:358)
            	at jadx.plugins.input.dex.sections.DexCodeReader.skip(DexCodeReader.java:105)
            	at jadx.plugins.input.dex.sections.DexCodeReader.visitInstructions(DexCodeReader.java:89)
            	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:46)
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:157)
            	... 7 more
            */
        public final com.unity3d.ads.core.data.model.AdObject getTmpAdObjectForEventSending(com.google.protobuf.ByteString r1, java.lang.String r2, boolean r3, com.unity3d.ads.UnityAdsLoadOptions r4, gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticAdType r5) {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (2073414490 > 406240) in method: com.unity3d.ads.core.domain.SendDiagnosticEvent.Companion.getTmpAdObjectForEventSending(com.google.protobuf.ByteString, java.lang.String, boolean, com.unity3d.ads.UnityAdsLoadOptions, gatewayprotocol.v1.DiagnosticEventRequestOuterClass$DiagnosticAdType):com.unity3d.ads.core.data.model.AdObject, file: classes23.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.SendDiagnosticEvent.Companion.getTmpAdObjectForEventSending(com.google.protobuf.ByteString, java.lang.String, boolean, com.unity3d.ads.UnityAdsLoadOptions, gatewayprotocol.v1.DiagnosticEventRequestOuterClass$DiagnosticAdType):com.unity3d.ads.core.data.model.AdObject");
        }
    }

    /* compiled from: r8-map-id-48d9907f4e93732c11cf9c906afc42aa7d1b8bfe35a58b5c97659e3a4b269d57 */
    /* loaded from: classes8.dex */
    public static final class DefaultImpls {
        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1082341891 < 0) in method: com.unity3d.ads.core.domain.SendDiagnosticEvent.DefaultImpls.invoke$default(com.unity3d.ads.core.domain.SendDiagnosticEvent, gatewayprotocol.v1.DiagnosticEventRequestOuterClass$DiagnosticEventType, java.lang.Double, java.util.Map, java.util.Map, com.unity3d.ads.core.data.model.AdObject, java.lang.Integer, com.google.protobuf.ByteString, int, java.lang.Object):void, file: classes8.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1082341891 < 0)
            	at java.base/java.nio.Buffer.createPositionException(Buffer.java:352)
            	at java.base/java.nio.Buffer.position(Buffer.java:327)
            	at java.base/java.nio.ByteBuffer.position(ByteBuffer.java:1551)
            	at jadx.plugins.input.dex.sections.SectionReader.skip(SectionReader.java:92)
            	at jadx.plugins.input.dex.insns.DexInsnFormat$30.skip(DexInsnFormat.java:358)
            	at jadx.plugins.input.dex.sections.DexCodeReader.skip(DexCodeReader.java:105)
            	at jadx.plugins.input.dex.sections.DexCodeReader.visitInstructions(DexCodeReader.java:89)
            	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:46)
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:157)
            	... 7 more
            */
        public static /* synthetic */ void invoke$default(com.unity3d.ads.core.domain.SendDiagnosticEvent r0, gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEventType r1, java.lang.Double r2, java.util.Map r3, java.util.Map r4, com.unity3d.ads.core.data.model.AdObject r5, java.lang.Integer r6, com.google.protobuf.ByteString r7, int r8, java.lang.Object r9) {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1082341891 < 0) in method: com.unity3d.ads.core.domain.SendDiagnosticEvent.DefaultImpls.invoke$default(com.unity3d.ads.core.domain.SendDiagnosticEvent, gatewayprotocol.v1.DiagnosticEventRequestOuterClass$DiagnosticEventType, java.lang.Double, java.util.Map, java.util.Map, com.unity3d.ads.core.data.model.AdObject, java.lang.Integer, com.google.protobuf.ByteString, int, java.lang.Object):void, file: classes8.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.SendDiagnosticEvent.DefaultImpls.invoke$default(com.unity3d.ads.core.domain.SendDiagnosticEvent, gatewayprotocol.v1.DiagnosticEventRequestOuterClass$DiagnosticEventType, java.lang.Double, java.util.Map, java.util.Map, com.unity3d.ads.core.data.model.AdObject, java.lang.Integer, com.google.protobuf.ByteString, int, java.lang.Object):void");
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (544493503 > 380432) in method: com.unity3d.ads.core.domain.SendDiagnosticEvent.DefaultImpls.invoke$default(com.unity3d.ads.core.domain.SendDiagnosticEvent, java.lang.String, java.lang.Double, java.util.Map, java.util.Map, com.unity3d.ads.core.data.model.AdObject, java.lang.Integer, com.google.protobuf.ByteString, int, java.lang.Object):void, file: classes8.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (544493503 > 380432)
            	at java.base/java.nio.Buffer.createPositionException(Buffer.java:352)
            	at java.base/java.nio.Buffer.position(Buffer.java:327)
            	at java.base/java.nio.ByteBuffer.position(ByteBuffer.java:1551)
            	at jadx.plugins.input.dex.sections.SectionReader.skip(SectionReader.java:92)
            	at jadx.plugins.input.dex.insns.DexInsnFormat$30.skip(DexInsnFormat.java:358)
            	at jadx.plugins.input.dex.sections.DexCodeReader.skip(DexCodeReader.java:105)
            	at jadx.plugins.input.dex.sections.DexCodeReader.visitInstructions(DexCodeReader.java:89)
            	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:46)
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:157)
            	... 7 more
            */
        public static /* synthetic */ void invoke$default(com.unity3d.ads.core.domain.SendDiagnosticEvent r0, java.lang.String r1, java.lang.Double r2, java.util.Map r3, java.util.Map r4, com.unity3d.ads.core.data.model.AdObject r5, java.lang.Integer r6, com.google.protobuf.ByteString r7, int r8, java.lang.Object r9) {
            /*
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (544493503 > 380432) in method: com.unity3d.ads.core.domain.SendDiagnosticEvent.DefaultImpls.invoke$default(com.unity3d.ads.core.domain.SendDiagnosticEvent, java.lang.String, java.lang.Double, java.util.Map, java.util.Map, com.unity3d.ads.core.data.model.AdObject, java.lang.Integer, com.google.protobuf.ByteString, int, java.lang.Object):void, file: classes8.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.SendDiagnosticEvent.DefaultImpls.invoke$default(com.unity3d.ads.core.domain.SendDiagnosticEvent, java.lang.String, java.lang.Double, java.util.Map, java.util.Map, com.unity3d.ads.core.data.model.AdObject, java.lang.Integer, com.google.protobuf.ByteString, int, java.lang.Object):void");
        }
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1250005994 > 393876) in method: com.unity3d.ads.core.domain.SendDiagnosticEvent.<clinit>():void, file: classes14.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1250005994 > 393876)
        	at java.base/java.nio.Buffer.createPositionException(Buffer.java:352)
        	at java.base/java.nio.Buffer.position(Buffer.java:327)
        	at java.base/java.nio.ByteBuffer.position(ByteBuffer.java:1551)
        	at jadx.plugins.input.dex.sections.SectionReader.skip(SectionReader.java:92)
        	at jadx.plugins.input.dex.insns.DexInsnFormat$30.skip(DexInsnFormat.java:358)
        	at jadx.plugins.input.dex.sections.DexCodeReader.skip(DexCodeReader.java:105)
        	at jadx.plugins.input.dex.sections.DexCodeReader.visitInstructions(DexCodeReader.java:89)
        	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:46)
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:157)
        	... 6 more
        */
    static {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1250005994 > 393876) in method: com.unity3d.ads.core.domain.SendDiagnosticEvent.<clinit>():void, file: classes14.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.SendDiagnosticEvent.<clinit>():void");
    }

    void invoke(DiagnosticEventRequestOuterClass.DiagnosticEventType diagnosticEventType, Double d, Map<String, String> map, Map<String, Integer> map2, AdObject adObject, Integer num, ByteString byteString);

    void invoke(String str, Double d, Map<String, String> map, Map<String, Integer> map2, AdObject adObject, Integer num, ByteString byteString);
}
