package com.google.protobuf;

import java.util.List;

/* compiled from: r8-map-id-48d9907f4e93732c11cf9c906afc42aa7d1b8bfe35a58b5c97659e3a4b269d57 */
/* loaded from: classes25.dex */
public interface MethodOrBuilder extends MessageLiteOrBuilder {
    String getName();

    ByteString getNameBytes();

    Option getOptions(int i);

    int getOptionsCount();

    List<Option> getOptionsList();

    boolean getRequestStreaming();

    String getRequestTypeUrl();

    ByteString getRequestTypeUrlBytes();

    boolean getResponseStreaming();

    String getResponseTypeUrl();

    ByteString getResponseTypeUrlBytes();

    Syntax getSyntax();

    int getSyntaxValue();
}
