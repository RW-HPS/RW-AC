package com.corrodinggames.rts.java.audio.a;

import java.io.ByteArrayOutputStream;

/* loaded from: game-lib.jar:com/corrodinggames/rts/java/audio/a/t.class */
public class t extends ByteArrayOutputStream {
    public t(int i) {
        super(i);
    }

    @Override // java.io.ByteArrayOutputStream
    public synchronized byte[] toByteArray() {
        return this.count == this.buf.length ? this.buf : super.toByteArray();
    }
}