package com.corrodinggames.rts.java.audio.p051a;

import java.io.ByteArrayOutputStream;

/* renamed from: com.corrodinggames.rts.java.audio.a.t */
/* loaded from: game-lib.jar:com/corrodinggames/rts/java/audio/a/t.class */
public class C1184t extends ByteArrayOutputStream {
    public C1184t(int i) {
        super(i);
    }

    @Override // java.io.ByteArrayOutputStream
    public synchronized byte[] toByteArray() {
        return this.count == this.buf.length ? this.buf : super.toByteArray();
    }
}