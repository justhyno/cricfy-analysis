package okhttp3.internal.dns;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import okhttp3.Dns;
import okhttp3.internal.concurrent.TaskRunner;
import okhttp3.internal.dns.DnsQuery;

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
/* loaded from: classes22.dex */
public final class StateMachineDnsCall implements Dns.Call {
    private final boolean includeIPv6;
    private final boolean includeServiceMetadata;
    private final DnsQuery.Factory queryFactory;
    private final Dns.Request request;
    private final AtomicReference<State> state;
    private final TaskRunner taskRunner;

    /* compiled from: r8-map-id-48d9907f4e93732c11cf9c906afc42aa7d1b8bfe35a58b5c97659e3a4b269d57 */
    public interface State {

        /* compiled from: r8-map-id-48d9907f4e93732c11cf9c906afc42aa7d1b8bfe35a58b5c97659e3a4b269d57 */
        /* loaded from: classes27.dex */
        public static final class Complete implements State {
            private final boolean canceled;

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1468208878 < 0) in method: okhttp3.internal.dns.StateMachineDnsCall.State.Complete.<init>(boolean):void, file: classes27.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1468208878 < 0)
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
            public Complete(boolean r1) {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1468208878 < 0) in method: okhttp3.internal.dns.StateMachineDnsCall.State.Complete.<init>(boolean):void, file: classes27.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.dns.StateMachineDnsCall.State.Complete.<init>(boolean):void");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1371830832 < 0) in method: okhttp3.internal.dns.StateMachineDnsCall.State.Complete.cancel():okhttp3.internal.dns.StateMachineDnsCall$State$Idle, file: classes27.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1371830832 < 0)
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
            @Override // okhttp3.internal.dns.StateMachineDnsCall.State
            public okhttp3.internal.dns.StateMachineDnsCall.State.Idle cancel() {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1371830832 < 0) in method: okhttp3.internal.dns.StateMachineDnsCall.State.Complete.cancel():okhttp3.internal.dns.StateMachineDnsCall$State$Idle, file: classes27.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.dns.StateMachineDnsCall.State.Complete.cancel():okhttp3.internal.dns.StateMachineDnsCall$State$Idle");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-455037043 < 0) in method: okhttp3.internal.dns.StateMachineDnsCall.State.Complete.cancel():okhttp3.internal.dns.StateMachineDnsCall$State, file: classes27.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-455037043 < 0)
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
            @Override // okhttp3.internal.dns.StateMachineDnsCall.State
            public /* bridge */ /* synthetic */ okhttp3.internal.dns.StateMachineDnsCall.State cancel() {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-455037043 < 0) in method: okhttp3.internal.dns.StateMachineDnsCall.State.Complete.cancel():okhttp3.internal.dns.StateMachineDnsCall$State, file: classes27.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.dns.StateMachineDnsCall.State.Complete.cancel():okhttp3.internal.dns.StateMachineDnsCall$State");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (258673700 > 347704) in method: okhttp3.internal.dns.StateMachineDnsCall.State.Complete.getCanceled():boolean, file: classes27.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition > limit: (258673700 > 347704)
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
            @Override // okhttp3.internal.dns.StateMachineDnsCall.State
            public boolean getCanceled() {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (258673700 > 347704) in method: okhttp3.internal.dns.StateMachineDnsCall.State.Complete.getCanceled():boolean, file: classes27.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.dns.StateMachineDnsCall.State.Complete.getCanceled():boolean");
            }
        }

        /* compiled from: r8-map-id-48d9907f4e93732c11cf9c906afc42aa7d1b8bfe35a58b5c97659e3a4b269d57 */
        /* loaded from: classes40.dex */
        public static final class Idle implements State {
            private final boolean canceled;

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1393768864 < 0) in method: okhttp3.internal.dns.StateMachineDnsCall.State.Idle.<init>():void, file: classes40.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1393768864 < 0)
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
            public Idle() {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1393768864 < 0) in method: okhttp3.internal.dns.StateMachineDnsCall.State.Idle.<init>():void, file: classes40.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.dns.StateMachineDnsCall.State.Idle.<init>():void");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1086153074 > 417452) in method: okhttp3.internal.dns.StateMachineDnsCall.State.Idle.<init>(boolean):void, file: classes40.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1086153074 > 417452)
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
            public Idle(boolean r1) {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1086153074 > 417452) in method: okhttp3.internal.dns.StateMachineDnsCall.State.Idle.<init>(boolean):void, file: classes40.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.dns.StateMachineDnsCall.State.Idle.<init>(boolean):void");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (24182329 > 417452) in method: okhttp3.internal.dns.StateMachineDnsCall.State.Idle.<init>(boolean, int, bd0):void, file: classes40.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition > limit: (24182329 > 417452)
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
            public /* synthetic */ Idle(boolean r1, int r2, p000.bd0 r3) {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (24182329 > 417452) in method: okhttp3.internal.dns.StateMachineDnsCall.State.Idle.<init>(boolean, int, bd0):void, file: classes40.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.dns.StateMachineDnsCall.State.Idle.<init>(boolean, int, bd0):void");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1171503930 > 417452) in method: okhttp3.internal.dns.StateMachineDnsCall.State.Idle.cancel():okhttp3.internal.dns.StateMachineDnsCall$State$Idle, file: classes40.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1171503930 > 417452)
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
            @Override // okhttp3.internal.dns.StateMachineDnsCall.State
            public okhttp3.internal.dns.StateMachineDnsCall.State.Idle cancel() {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1171503930 > 417452) in method: okhttp3.internal.dns.StateMachineDnsCall.State.Idle.cancel():okhttp3.internal.dns.StateMachineDnsCall$State$Idle, file: classes40.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.dns.StateMachineDnsCall.State.Idle.cancel():okhttp3.internal.dns.StateMachineDnsCall$State$Idle");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-590535610 < 0) in method: okhttp3.internal.dns.StateMachineDnsCall.State.Idle.cancel():okhttp3.internal.dns.StateMachineDnsCall$State, file: classes40.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-590535610 < 0)
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
            @Override // okhttp3.internal.dns.StateMachineDnsCall.State
            public /* bridge */ /* synthetic */ okhttp3.internal.dns.StateMachineDnsCall.State cancel() {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-590535610 < 0) in method: okhttp3.internal.dns.StateMachineDnsCall.State.Idle.cancel():okhttp3.internal.dns.StateMachineDnsCall$State, file: classes40.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.dns.StateMachineDnsCall.State.Idle.cancel():okhttp3.internal.dns.StateMachineDnsCall$State");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1407888909 < 0) in method: okhttp3.internal.dns.StateMachineDnsCall.State.Idle.getCanceled():boolean, file: classes40.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1407888909 < 0)
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
            @Override // okhttp3.internal.dns.StateMachineDnsCall.State
            public boolean getCanceled() {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1407888909 < 0) in method: okhttp3.internal.dns.StateMachineDnsCall.State.Idle.getCanceled():boolean, file: classes40.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.dns.StateMachineDnsCall.State.Idle.getCanceled():boolean");
            }
        }

        /* compiled from: r8-map-id-48d9907f4e93732c11cf9c906afc42aa7d1b8bfe35a58b5c97659e3a4b269d57 */
        /* loaded from: classes10.dex */
        public static final class Running implements State {
            private final Dns.Callback callback;
            private final boolean canceled;
            private final boolean lockHeld;
            private final List<IOException> pendingExceptions;
            private final List<Dns.Record> pendingRecords;
            private final List<DnsQuery> runningQueries;

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (935678180 > 376268) in method: okhttp3.internal.dns.StateMachineDnsCall.State.Running.<init>(boolean, okhttp3.Dns$Callback, boolean, java.util.List<? extends okhttp3.internal.dns.DnsQuery>, java.util.List<? extends okhttp3.Dns$Record>, java.util.List<? extends java.io.IOException>):void, file: classes10.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition > limit: (935678180 > 376268)
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
            public Running(boolean r1, okhttp3.Dns.Callback r2, boolean r3, java.util.List<? extends okhttp3.internal.dns.DnsQuery> r4, java.util.List<? extends okhttp3.Dns.Record> r5, java.util.List<? extends java.io.IOException> r6) {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (935678180 > 376268) in method: okhttp3.internal.dns.StateMachineDnsCall.State.Running.<init>(boolean, okhttp3.Dns$Callback, boolean, java.util.List<? extends okhttp3.internal.dns.DnsQuery>, java.util.List<? extends okhttp3.Dns$Record>, java.util.List<? extends java.io.IOException>):void, file: classes10.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.dns.StateMachineDnsCall.State.Running.<init>(boolean, okhttp3.Dns$Callback, boolean, java.util.List, java.util.List, java.util.List):void");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (667723199 > 376268) in method: okhttp3.internal.dns.StateMachineDnsCall.State.Running.<init>(boolean, okhttp3.Dns$Callback, boolean, java.util.List, java.util.List, java.util.List, int, bd0):void, file: classes10.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition > limit: (667723199 > 376268)
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
            public /* synthetic */ Running(boolean r1, okhttp3.Dns.Callback r2, boolean r3, java.util.List r4, java.util.List r5, java.util.List r6, int r7, p000.bd0 r8) {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (667723199 > 376268) in method: okhttp3.internal.dns.StateMachineDnsCall.State.Running.<init>(boolean, okhttp3.Dns$Callback, boolean, java.util.List, java.util.List, java.util.List, int, bd0):void, file: classes10.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.dns.StateMachineDnsCall.State.Running.<init>(boolean, okhttp3.Dns$Callback, boolean, java.util.List, java.util.List, java.util.List, int, bd0):void");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (973981469 > 376268) in method: okhttp3.internal.dns.StateMachineDnsCall.State.Running.cancel():okhttp3.internal.dns.StateMachineDnsCall$State$Running, file: classes10.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition > limit: (973981469 > 376268)
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
            @Override // okhttp3.internal.dns.StateMachineDnsCall.State
            public okhttp3.internal.dns.StateMachineDnsCall.State.Running cancel() {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (973981469 > 376268) in method: okhttp3.internal.dns.StateMachineDnsCall.State.Running.cancel():okhttp3.internal.dns.StateMachineDnsCall$State$Running, file: classes10.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.dns.StateMachineDnsCall.State.Running.cancel():okhttp3.internal.dns.StateMachineDnsCall$State$Running");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1044422331 < 0) in method: okhttp3.internal.dns.StateMachineDnsCall.State.Running.cancel():okhttp3.internal.dns.StateMachineDnsCall$State, file: classes10.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1044422331 < 0)
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
            @Override // okhttp3.internal.dns.StateMachineDnsCall.State
            public /* bridge */ /* synthetic */ okhttp3.internal.dns.StateMachineDnsCall.State cancel() {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1044422331 < 0) in method: okhttp3.internal.dns.StateMachineDnsCall.State.Running.cancel():okhttp3.internal.dns.StateMachineDnsCall$State, file: classes10.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.dns.StateMachineDnsCall.State.Running.cancel():okhttp3.internal.dns.StateMachineDnsCall$State");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1164411149 > 376268) in method: okhttp3.internal.dns.StateMachineDnsCall.State.Running.getCallback():okhttp3.Dns$Callback, file: classes10.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1164411149 > 376268)
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
            public final okhttp3.Dns.Callback getCallback() {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1164411149 > 376268) in method: okhttp3.internal.dns.StateMachineDnsCall.State.Running.getCallback():okhttp3.Dns$Callback, file: classes10.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.dns.StateMachineDnsCall.State.Running.getCallback():okhttp3.Dns$Callback");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-2087333149 < 0) in method: okhttp3.internal.dns.StateMachineDnsCall.State.Running.getCanceled():boolean, file: classes10.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-2087333149 < 0)
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
            @Override // okhttp3.internal.dns.StateMachineDnsCall.State
            public boolean getCanceled() {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-2087333149 < 0) in method: okhttp3.internal.dns.StateMachineDnsCall.State.Running.getCanceled():boolean, file: classes10.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.dns.StateMachineDnsCall.State.Running.getCanceled():boolean");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-528529949 < 0) in method: okhttp3.internal.dns.StateMachineDnsCall.State.Running.getLockHeld():boolean, file: classes10.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-528529949 < 0)
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
            public final boolean getLockHeld() {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-528529949 < 0) in method: okhttp3.internal.dns.StateMachineDnsCall.State.Running.getLockHeld():boolean, file: classes10.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.dns.StateMachineDnsCall.State.Running.getLockHeld():boolean");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (1678685388 > 376268) in method: okhttp3.internal.dns.StateMachineDnsCall.State.Running.getPendingExceptions():java.util.List<java.io.IOException>, file: classes10.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition > limit: (1678685388 > 376268)
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
            public final java.util.List<java.io.IOException> getPendingExceptions() {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (1678685388 > 376268) in method: okhttp3.internal.dns.StateMachineDnsCall.State.Running.getPendingExceptions():java.util.List<java.io.IOException>, file: classes10.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.dns.StateMachineDnsCall.State.Running.getPendingExceptions():java.util.List");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (274085030 > 376268) in method: okhttp3.internal.dns.StateMachineDnsCall.State.Running.getPendingRecords():java.util.List<okhttp3.Dns$Record>, file: classes10.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition > limit: (274085030 > 376268)
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
            public final java.util.List<okhttp3.Dns.Record> getPendingRecords() {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (274085030 > 376268) in method: okhttp3.internal.dns.StateMachineDnsCall.State.Running.getPendingRecords():java.util.List<okhttp3.Dns$Record>, file: classes10.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.dns.StateMachineDnsCall.State.Running.getPendingRecords():java.util.List");
            }

            /*  JADX ERROR: Method load error
                jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (868947260 > 376268) in method: okhttp3.internal.dns.StateMachineDnsCall.State.Running.getRunningQueries():java.util.List<okhttp3.internal.dns.DnsQuery>, file: classes10.dex
                	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
                	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:451)
                Caused by: java.lang.IllegalArgumentException: newPosition > limit: (868947260 > 376268)
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
            public final java.util.List<okhttp3.internal.dns.DnsQuery> getRunningQueries() {
                /*
                // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (868947260 > 376268) in method: okhttp3.internal.dns.StateMachineDnsCall.State.Running.getRunningQueries():java.util.List<okhttp3.internal.dns.DnsQuery>, file: classes10.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.dns.StateMachineDnsCall.State.Running.getRunningQueries():java.util.List");
            }
        }

        State cancel();

        boolean getCanceled();
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-364204544 < 0) in method: okhttp3.internal.dns.StateMachineDnsCall.<init>(okhttp3.internal.concurrent.TaskRunner, okhttp3.Dns$Request, okhttp3.internal.dns.DnsQuery$Factory, boolean, boolean):void, file: classes22.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:114)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-364204544 < 0)
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
    public StateMachineDnsCall(okhttp3.internal.concurrent.TaskRunner r1, okhttp3.Dns.Request r2, okhttp3.internal.dns.DnsQuery.Factory r3, boolean r4, boolean r5) {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-364204544 < 0) in method: okhttp3.internal.dns.StateMachineDnsCall.<init>(okhttp3.internal.concurrent.TaskRunner, okhttp3.Dns$Request, okhttp3.internal.dns.DnsQuery$Factory, boolean, boolean):void, file: classes22.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.dns.StateMachineDnsCall.<init>(okhttp3.internal.concurrent.TaskRunner, okhttp3.Dns$Request, okhttp3.internal.dns.DnsQuery$Factory, boolean, boolean):void");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (505670990 > 384920) in method: okhttp3.internal.dns.StateMachineDnsCall.a(okhttp3.Dns$Callback, okhttp3.internal.dns.StateMachineDnsCall):mu3, file: classes22.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:114)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition > limit: (505670990 > 384920)
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
    /* renamed from: a */
    public static /* synthetic */ p000.mu3 m7788a(okhttp3.Dns.Callback r0, okhttp3.internal.dns.StateMachineDnsCall r1) {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (505670990 > 384920) in method: okhttp3.internal.dns.StateMachineDnsCall.a(okhttp3.Dns$Callback, okhttp3.internal.dns.StateMachineDnsCall):mu3, file: classes22.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.dns.StateMachineDnsCall.m7788a(okhttp3.Dns$Callback, okhttp3.internal.dns.StateMachineDnsCall):mu3");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-144349991 < 0) in method: okhttp3.internal.dns.StateMachineDnsCall.access$updateStateAndCallCallbacks(okhttp3.internal.dns.StateMachineDnsCall, okhttp3.internal.dns.Question, okhttp3.internal.dns.DnsQuery, okhttp3.internal.dns.DnsMessage):void, file: classes22.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:114)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-144349991 < 0)
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
    public static final /* synthetic */ void access$updateStateAndCallCallbacks(okhttp3.internal.dns.StateMachineDnsCall r0, okhttp3.internal.dns.Question r1, okhttp3.internal.dns.DnsQuery r2, okhttp3.internal.dns.DnsMessage r3) {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-144349991 < 0) in method: okhttp3.internal.dns.StateMachineDnsCall.access$updateStateAndCallCallbacks(okhttp3.internal.dns.StateMachineDnsCall, okhttp3.internal.dns.Question, okhttp3.internal.dns.DnsQuery, okhttp3.internal.dns.DnsMessage):void, file: classes22.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.dns.StateMachineDnsCall.access$updateStateAndCallCallbacks(okhttp3.internal.dns.StateMachineDnsCall, okhttp3.internal.dns.Question, okhttp3.internal.dns.DnsQuery, okhttp3.internal.dns.DnsMessage):void");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-794495542 < 0) in method: okhttp3.internal.dns.StateMachineDnsCall.enqueue$lambda$1(okhttp3.Dns$Callback, okhttp3.internal.dns.StateMachineDnsCall):mu3, file: classes22.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:114)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-794495542 < 0)
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
    private static final p000.mu3 enqueue$lambda$1(okhttp3.Dns.Callback r0, okhttp3.internal.dns.StateMachineDnsCall r1) {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-794495542 < 0) in method: okhttp3.internal.dns.StateMachineDnsCall.enqueue$lambda$1(okhttp3.Dns$Callback, okhttp3.internal.dns.StateMachineDnsCall):mu3, file: classes22.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.dns.StateMachineDnsCall.enqueue$lambda$1(okhttp3.Dns$Callback, okhttp3.internal.dns.StateMachineDnsCall):mu3");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (184929684 > 384920) in method: okhttp3.internal.dns.StateMachineDnsCall.updateStateAndCallCallbacks(okhttp3.internal.dns.DnsQuery, java.util.List<? extends okhttp3.Dns$Record>, java.io.IOException, boolean):void, file: classes22.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:114)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition > limit: (184929684 > 384920)
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
    private final void updateStateAndCallCallbacks(okhttp3.internal.dns.DnsQuery r1, java.util.List<? extends okhttp3.Dns.Record> r2, java.io.IOException r3, boolean r4) {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (184929684 > 384920) in method: okhttp3.internal.dns.StateMachineDnsCall.updateStateAndCallCallbacks(okhttp3.internal.dns.DnsQuery, java.util.List<? extends okhttp3.Dns$Record>, java.io.IOException, boolean):void, file: classes22.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.dns.StateMachineDnsCall.updateStateAndCallCallbacks(okhttp3.internal.dns.DnsQuery, java.util.List, java.io.IOException, boolean):void");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-886190674 < 0) in method: okhttp3.internal.dns.StateMachineDnsCall.updateStateAndCallCallbacks(okhttp3.internal.dns.Question, okhttp3.internal.dns.DnsQuery, okhttp3.internal.dns.DnsMessage):void, file: classes22.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:114)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-886190674 < 0)
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
    private final void updateStateAndCallCallbacks(okhttp3.internal.dns.Question r1, okhttp3.internal.dns.DnsQuery r2, okhttp3.internal.dns.DnsMessage r3) {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-886190674 < 0) in method: okhttp3.internal.dns.StateMachineDnsCall.updateStateAndCallCallbacks(okhttp3.internal.dns.Question, okhttp3.internal.dns.DnsQuery, okhttp3.internal.dns.DnsMessage):void, file: classes22.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.dns.StateMachineDnsCall.updateStateAndCallCallbacks(okhttp3.internal.dns.Question, okhttp3.internal.dns.DnsQuery, okhttp3.internal.dns.DnsMessage):void");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (412446121 > 384920) in method: okhttp3.internal.dns.StateMachineDnsCall.updateStateAndCallCallbacks$default(okhttp3.internal.dns.StateMachineDnsCall, okhttp3.internal.dns.DnsQuery, java.util.List, java.io.IOException, boolean, int, java.lang.Object):void, file: classes22.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:114)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition > limit: (412446121 > 384920)
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
    public static /* synthetic */ void updateStateAndCallCallbacks$default(okhttp3.internal.dns.StateMachineDnsCall r0, okhttp3.internal.dns.DnsQuery r1, java.util.List r2, java.io.IOException r3, boolean r4, int r5, java.lang.Object r6) {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (412446121 > 384920) in method: okhttp3.internal.dns.StateMachineDnsCall.updateStateAndCallCallbacks$default(okhttp3.internal.dns.StateMachineDnsCall, okhttp3.internal.dns.DnsQuery, java.util.List, java.io.IOException, boolean, int, java.lang.Object):void, file: classes22.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.dns.StateMachineDnsCall.updateStateAndCallCallbacks$default(okhttp3.internal.dns.StateMachineDnsCall, okhttp3.internal.dns.DnsQuery, java.util.List, java.io.IOException, boolean, int, java.lang.Object):void");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-68890677 < 0) in method: okhttp3.internal.dns.StateMachineDnsCall.cancel():void, file: classes22.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:114)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-68890677 < 0)
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
    @Override // okhttp3.Dns.Call
    public void cancel() {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-68890677 < 0) in method: okhttp3.internal.dns.StateMachineDnsCall.cancel():void, file: classes22.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.dns.StateMachineDnsCall.cancel():void");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition > limit: (6321430 > 384920) in method: okhttp3.internal.dns.StateMachineDnsCall.enqueue(okhttp3.Dns$Callback):void, file: classes22.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:114)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition > limit: (6321430 > 384920)
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
    @Override // okhttp3.Dns.Call
    public void enqueue(okhttp3.Dns.Callback r1) {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition > limit: (6321430 > 384920) in method: okhttp3.internal.dns.StateMachineDnsCall.enqueue(okhttp3.Dns$Callback):void, file: classes22.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.dns.StateMachineDnsCall.enqueue(okhttp3.Dns$Callback):void");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-1740312962 < 0) in method: okhttp3.internal.dns.StateMachineDnsCall.getRequest():okhttp3.Dns$Request, file: classes22.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:114)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-1740312962 < 0)
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
    @Override // okhttp3.Dns.Call
    public okhttp3.Dns.Request getRequest() {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-1740312962 < 0) in method: okhttp3.internal.dns.StateMachineDnsCall.getRequest():okhttp3.Dns$Request, file: classes22.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.dns.StateMachineDnsCall.getRequest():okhttp3.Dns$Request");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: IllegalArgumentException: newPosition < 0: (-429392403 < 0) in method: okhttp3.internal.dns.StateMachineDnsCall.isCanceled():boolean, file: classes22.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:167)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:445)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:114)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        Caused by: java.lang.IllegalArgumentException: newPosition < 0: (-429392403 < 0)
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
    @Override // okhttp3.Dns.Call
    public boolean isCanceled() {
        /*
        // Can't load method instructions: Load method exception: IllegalArgumentException: newPosition < 0: (-429392403 < 0) in method: okhttp3.internal.dns.StateMachineDnsCall.isCanceled():boolean, file: classes22.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.dns.StateMachineDnsCall.isCanceled():boolean");
    }
}
