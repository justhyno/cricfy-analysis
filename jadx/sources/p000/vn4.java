package p000;

import android.content.Intent;
import android.os.Bundle;
import android.os.IInterface;
import java.util.Map;

/* compiled from: r8-map-id-48d9907f4e93732c11cf9c906afc42aa7d1b8bfe35a58b5c97659e3a4b269d57 */
/* loaded from: classes13.dex */
public interface vn4 extends IInterface {
    void beginAdUnitExposure(String str, long j);

    void clearConditionalUserProperty(String str, String str2, Bundle bundle);

    void clearMeasurementEnabled(long j);

    void endAdUnitExposure(String str, long j);

    void generateEventId(zn4 zn4Var);

    void getAppInstanceId(zn4 zn4Var);

    void getCachedAppInstanceId(zn4 zn4Var);

    void getConditionalUserProperties(String str, String str2, zn4 zn4Var);

    void getCurrentScreenClass(zn4 zn4Var);

    void getCurrentScreenName(zn4 zn4Var);

    void getGmpAppId(zn4 zn4Var);

    void getMaxUserProperties(String str, zn4 zn4Var);

    void getSessionId(zn4 zn4Var);

    void getTestFlag(zn4 zn4Var, int i);

    void getUserProperties(String str, String str2, boolean z, zn4 zn4Var);

    void initForTests(Map map);

    void initialize(fc1 fc1Var, uo4 uo4Var, long j);

    void initializeWithElapsedTime(fc1 fc1Var, uo4 uo4Var, long j, long j2);

    void isDataCollectionEnabled(zn4 zn4Var);

    void logEvent(String str, String str2, Bundle bundle, boolean z, boolean z2, long j);

    void logEventAndBundle(String str, String str2, Bundle bundle, zn4 zn4Var, long j);

    void logEventWithElapsedTime(String str, String str2, Bundle bundle, boolean z, boolean z2, long j, long j2);

    void logHealthData(int i, String str, fc1 fc1Var, fc1 fc1Var2, fc1 fc1Var3);

    void onActivityCreated(fc1 fc1Var, Bundle bundle, long j);

    void onActivityCreatedByScionActivityInfo(wo4 wo4Var, Bundle bundle, long j);

    void onActivityDestroyed(fc1 fc1Var, long j);

    void onActivityDestroyedByScionActivityInfo(wo4 wo4Var, long j);

    void onActivityPaused(fc1 fc1Var, long j);

    void onActivityPausedByScionActivityInfo(wo4 wo4Var, long j);

    void onActivityResumed(fc1 fc1Var, long j);

    void onActivityResumedByScionActivityInfo(wo4 wo4Var, long j);

    void onActivitySaveInstanceState(fc1 fc1Var, zn4 zn4Var, long j);

    void onActivitySaveInstanceStateByScionActivityInfo(wo4 wo4Var, zn4 zn4Var, long j);

    void onActivityStarted(fc1 fc1Var, long j);

    void onActivityStartedByScionActivityInfo(wo4 wo4Var, long j);

    void onActivityStopped(fc1 fc1Var, long j);

    void onActivityStoppedByScionActivityInfo(wo4 wo4Var, long j);

    void performAction(Bundle bundle, zn4 zn4Var, long j);

    void registerOnMeasurementEventListener(eo4 eo4Var);

    void resetAnalyticsData(long j);

    void resetAnalyticsDataWithElapsedTime(long j, long j2);

    void retrieveAndUploadBatches(co4 co4Var);

    void setConditionalUserProperty(Bundle bundle, long j);

    void setConsent(Bundle bundle, long j);

    void setConsentThirdParty(Bundle bundle, long j);

    void setCurrentScreen(fc1 fc1Var, String str, String str2, long j);

    void setCurrentScreenByScionActivityInfo(wo4 wo4Var, String str, String str2, long j);

    void setDataCollectionEnabled(boolean z);

    void setDefaultEventParameters(Bundle bundle);

    void setEventInterceptor(eo4 eo4Var);

    void setInstanceIdProvider(so4 so4Var);

    void setMeasurementEnabled(boolean z, long j);

    void setMinimumSessionDuration(long j);

    void setSessionTimeoutDuration(long j);

    void setSgtmDebugInfo(Intent intent);

    void setUserId(String str, long j);

    void setUserProperty(String str, String str2, fc1 fc1Var, boolean z, long j);

    void unregisterOnMeasurementEventListener(eo4 eo4Var);
}
