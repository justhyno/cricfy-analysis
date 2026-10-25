package okhttp3.internal.http2;

import java.io.IOException;
import java.util.List;
import p000.rp;

/* compiled from: r8-map-id-48d9907f4e93732c11cf9c906afc42aa7d1b8bfe35a58b5c97659e3a4b269d57 */
/* loaded from: classes15.dex */
public interface PushObserver {
    public static final PushObserver CANCEL = null;
    public static final Companion Companion = null;

    /* compiled from: r8-map-id-48d9907f4e93732c11cf9c906afc42aa7d1b8bfe35a58b5c97659e3a4b269d57 */
    /* loaded from: classes41.dex */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = null;

        /* compiled from: r8-map-id-48d9907f4e93732c11cf9c906afc42aa7d1b8bfe35a58b5c97659e3a4b269d57 */
        /* loaded from: classes32.dex */
        public static final class PushObserverCancel implements PushObserver {
            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-508203120 < 0) in method: okhttp3.internal.http2.PushObserver.Companion.PushObserverCancel.onData(int, rp, int, boolean):boolean, file: classes32.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-508203120 < 0)
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
            @Override // okhttp3.internal.http2.PushObserver
            public boolean onData(int r1, p000.rp r2, int r3, boolean r4) throws java.io.IOException {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-508203120 < 0) in method: okhttp3.internal.http2.PushObserver.Companion.PushObserverCancel.onData(int, rp, int, boolean):boolean, file: classes32.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.http2.PushObserver.Companion.PushObserverCancel.onData(int, rp, int, boolean):boolean");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1443733053 > 420208) in method: okhttp3.internal.http2.PushObserver.Companion.PushObserverCancel.onHeaders(int, java.util.List<okhttp3.internal.http2.Header>, boolean):boolean, file: classes32.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1443733053 > 420208)
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
            @Override // okhttp3.internal.http2.PushObserver
            public boolean onHeaders(int r1, java.util.List<okhttp3.internal.http2.Header> r2, boolean r3) {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1443733053 > 420208) in method: okhttp3.internal.http2.PushObserver.Companion.PushObserverCancel.onHeaders(int, java.util.List<okhttp3.internal.http2.Header>, boolean):boolean, file: classes32.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.http2.PushObserver.Companion.PushObserverCancel.onHeaders(int, java.util.List, boolean):boolean");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (145625801 > 420208) in method: okhttp3.internal.http2.PushObserver.Companion.PushObserverCancel.onRequest(int, java.util.List<okhttp3.internal.http2.Header>):boolean, file: classes32.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition > limit: (145625801 > 420208)
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
            @Override // okhttp3.internal.http2.PushObserver
            public boolean onRequest(int r1, java.util.List<okhttp3.internal.http2.Header> r2) {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (145625801 > 420208) in method: okhttp3.internal.http2.PushObserver.Companion.PushObserverCancel.onRequest(int, java.util.List<okhttp3.internal.http2.Header>):boolean, file: classes32.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.http2.PushObserver.Companion.PushObserverCancel.onRequest(int, java.util.List):boolean");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-232920390 < 0) in method: okhttp3.internal.http2.PushObserver.Companion.PushObserverCancel.onReset(int, okhttp3.internal.http2.ErrorCode):void, file: classes32.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-232920390 < 0)
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
            @Override // okhttp3.internal.http2.PushObserver
            public void onReset(int r1, okhttp3.internal.http2.ErrorCode r2) {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-232920390 < 0) in method: okhttp3.internal.http2.PushObserver.Companion.PushObserverCancel.onReset(int, okhttp3.internal.http2.ErrorCode):void, file: classes32.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.http2.PushObserver.Companion.PushObserverCancel.onReset(int, okhttp3.internal.http2.ErrorCode):void");
            }
        }

        /*  JADX ERROR: Method load error
            jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (385663816 > 396432) in method: okhttp3.internal.http2.PushObserver.Companion.<init>():void, file: classes41.dex
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
            	at jadx.core.ProcessClass.process(ProcessClass.java:69)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:117)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            Caused by: java.lang.IllegalArgumentException: newPosition > limit: (385663816 > 396432)
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
            // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (385663816 > 396432) in method: okhttp3.internal.http2.PushObserver.Companion.<init>():void, file: classes41.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.http2.PushObserver.Companion.<init>():void");
        }
    }

    boolean onData(int i, rp rpVar, int i2, boolean z) throws IOException;

    boolean onHeaders(int i, List<Header> list, boolean z);

    boolean onRequest(int i, List<Header> list);

    void onReset(int i, ErrorCode errorCode);
}
