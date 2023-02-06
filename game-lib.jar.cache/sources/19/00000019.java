package net.rudp;

import java.io.InputStream;

/* renamed from: a.a.o */
/* loaded from: game-lib.jar:a/a/o.class */
class ReliableSocketInputStream extends InputStream {
    protected ReliableSocket a;
    protected byte[] b;
    protected int c;
    protected int d;

    public ReliableSocketInputStream(ReliableSocket reliableSocket) {
        if (reliableSocket == null) {
            throw new NullPointerException("sock");
        }
        this.a = reliableSocket;
        this.b = new byte[this.a.getReceiveBufferSize()];
        this.d = 0;
        this.c = 0;
    }

    @Override // java.io.InputStream
    public synchronized int read() {
        if (a() < 0) {
            return -1;
        }
        byte[] bArr = this.b;
        int i = this.c;
        this.c = i + 1;
        return bArr[i] & 255;
    }

    @Override // java.io.InputStream
    public synchronized int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.InputStream
    public synchronized int read(byte[] bArr, int i, int i2) {
        if (bArr == null) {
            throw new NullPointerException();
        }
        if (i < 0 || i2 < 0 || i + i2 > bArr.length) {
            throw new IndexOutOfBoundsException();
        }
        if (a() < 0) {
            return -1;
        }
        int min = Math.min(available(), i2);
        System.arraycopy(this.b, this.c, bArr, i, min);
        this.c += min;
        return min;
    }

    @Override // java.io.InputStream
    public synchronized int available() {
        return this.d - this.c;
    }

    @Override // java.io.InputStream
    public boolean markSupported() {
        return false;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.a.shutdownInput();
    }

    private int a() {
        if (available() == 0) {
            this.d = this.a.b(this.b, 0, this.b.length);
            this.c = 0;
        }
        return this.d;
    }
}