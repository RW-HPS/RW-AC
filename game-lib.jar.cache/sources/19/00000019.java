package a.a;

import java.io.InputStream;

/* loaded from: game-lib.jar:a/a/o.class */
class o extends InputStream {

    /* renamed from: a  reason: collision with root package name */
    protected h f22a;
    protected byte[] b;
    protected int c;
    protected int d;

    public o(h hVar) {
        if (hVar == null) {
            throw new NullPointerException("sock");
        }
        this.f22a = hVar;
        this.b = new byte[this.f22a.getReceiveBufferSize()];
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
        this.f22a.shutdownInput();
    }

    private int a() {
        if (available() == 0) {
            this.d = this.f22a.b(this.b, 0, this.b.length);
            this.c = 0;
        }
        return this.d;
    }
}