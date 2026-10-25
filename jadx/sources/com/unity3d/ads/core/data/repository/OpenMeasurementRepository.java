package com.unity3d.ads.core.data.repository;

import android.content.Context;
import android.webkit.WebView;
import com.google.protobuf.ByteString;
import com.unity3d.ads.core.data.model.OMData;
import com.unity3d.ads.core.data.model.OmidOptions;
import p000.z50;

/* compiled from: r8-map-id-48d9907f4e93732c11cf9c906afc42aa7d1b8bfe35a58b5c97659e3a4b269d57 */
/* loaded from: classes26.dex */
public interface OpenMeasurementRepository {
    Object activateOM(Context context, z50 z50Var);

    Object finishSession(ByteString byteString, z50 z50Var);

    OMData getOmData();

    boolean hasSessionFinished(ByteString byteString);

    Object impressionOccurred(ByteString byteString, boolean z, z50 z50Var);

    boolean isOMActive();

    void setOMActive(boolean z);

    Object startSession(ByteString byteString, WebView webView, OmidOptions omidOptions, z50 z50Var);
}
