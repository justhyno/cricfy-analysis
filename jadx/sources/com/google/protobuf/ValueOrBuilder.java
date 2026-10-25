package com.google.protobuf;

import com.google.protobuf.Value;

/* compiled from: r8-map-id-48d9907f4e93732c11cf9c906afc42aa7d1b8bfe35a58b5c97659e3a4b269d57 */
/* loaded from: classes50.dex */
public interface ValueOrBuilder extends MessageLiteOrBuilder {
    boolean getBoolValue();

    Value.KindCase getKindCase();

    ListValue getListValue();

    NullValue getNullValue();

    int getNullValueValue();

    double getNumberValue();

    String getStringValue();

    ByteString getStringValueBytes();

    Struct getStructValue();

    boolean hasBoolValue();

    boolean hasListValue();

    boolean hasNullValue();

    boolean hasNumberValue();

    boolean hasStringValue();

    boolean hasStructValue();
}
