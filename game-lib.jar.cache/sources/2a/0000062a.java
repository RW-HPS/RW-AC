package com.corrodinggames.rts.gameFramework.utility;

import java.io.OutputStream;

/* renamed from: com.corrodinggames.rts.gameFramework.utility.w */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/utility/w.class */
public class C1150w extends OutputStream {

    /* renamed from: a */
    public byte[] f7143a;

    /* renamed from: b */
    protected int f7144b;

    public C1150w() {
        this.f7143a = new byte[32];
    }

    public C1150w(int i) {
        if (i >= 0) {
            this.f7143a = new byte[i];
            return;
        }
        throw new IllegalArgumentException("size < 0");
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        super.close();
    }

    /* renamed from: a */
    private void m484a(int i) {
        if (this.f7144b + i <= this.f7143a.length) {
            return;
        }
        byte[] bArr = new byte[(this.f7144b + i) * 2];
        System.arraycopy(this.f7143a, 0, bArr, 0, this.f7144b);
        this.f7143a = bArr;
    }

    /* renamed from: a */
    public synchronized void m485a() {
        this.f7144b = 0;
    }

    /* renamed from: b */
    public int m482b() {
        return this.f7144b;
    }

    public String toString() {
        return new String(this.f7143a, 0, this.f7144b);
    }

    /* renamed from: a */
    public static void m483a(int i, int i2, int i3) {
        if ((i2 | i3) < 0 || i2 > i || i - i2 < i3) {
            throw new ArrayIndexOutOfBoundsException();
        }
    }

    @Override // java.io.OutputStream
    public synchronized void write(byte[] bArr, int i, int i2) {
        m483a(bArr.length, i, i2);
        if (i2 == 0) {
            return;
        }
        m484a(i2);
        System.arraycopy(bArr, i, this.f7143a, this.f7144b, i2);
        this.f7144b += i2;
    }

    @Override // java.io.OutputStream
    public synchronized void write(int i) {
        if (this.f7144b == this.f7143a.length) {
            m484a(1);
        }
        byte[] bArr = this.f7143a;
        int i2 = this.f7144b;
        this.f7144b = i2 + 1;
        bArr[i2] = (byte) i;
    }
}