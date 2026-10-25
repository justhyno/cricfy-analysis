package com.google.protobuf;

import java.util.List;

/* compiled from: r8-map-id-48d9907f4e93732c11cf9c906afc42aa7d1b8bfe35a58b5c97659e3a4b269d57 */
/* loaded from: classes43.dex */
public interface ApiOrBuilder extends MessageLiteOrBuilder {
    Method getMethods(int i);

    int getMethodsCount();

    List<Method> getMethodsList();

    Mixin getMixins(int i);

    int getMixinsCount();

    List<Mixin> getMixinsList();

    String getName();

    ByteString getNameBytes();

    Option getOptions(int i);

    int getOptionsCount();

    List<Option> getOptionsList();

    SourceContext getSourceContext();

    Syntax getSyntax();

    int getSyntaxValue();

    String getVersion();

    ByteString getVersionBytes();

    boolean hasSourceContext();
}
