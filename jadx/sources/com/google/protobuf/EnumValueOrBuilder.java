package com.google.protobuf;

import java.util.List;

/* compiled from: r8-map-id-48d9907f4e93732c11cf9c906afc42aa7d1b8bfe35a58b5c97659e3a4b269d57 */
/* loaded from: classes49.dex */
public interface EnumValueOrBuilder extends MessageLiteOrBuilder {
    String getName();

    ByteString getNameBytes();

    int getNumber();

    Option getOptions(int i);

    int getOptionsCount();

    List<Option> getOptionsList();
}
