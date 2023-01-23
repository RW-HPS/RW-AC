package a.a;

import java.io.OutputStream;

/* loaded from: game-lib.jar:a/a/q.class */
class q extends OutputStream {

    /* renamed from: a  reason: collision with root package name */
    protected h f23a;
    protected byte[] b;
    protected int c;

    public q(h hVar) {
        if (hVar == null) {
            throw new NullPointerException("sock");
        }
        this.f23a = hVar;
        this.b = new byte[this.f23a.getSendBufferSize()];
        this.c = 0;
    }

    @Override // java.io.OutputStream
    public synchronized void write(int i) {
        if (this.c >= this.b.length) {
            flush();
        }
        byte[] bArr = this.b;
        int i2 = this.c;
        this.c = i2 + 1;
        bArr[i2] = (byte) (i & 255);
    }

    @Override // java.io.OutputStream
    public synchronized void write(byte[] bArr) {
        write(bArr, 0, bArr.length);
    }

    @Override // java.io.OutputStream
    public synchronized void write(byte[] bArr, int i, int i2) {
        if (bArr == null) {
            throw new NullPointerException();
        }
        if (i < 0 || i2 < 0 || i + i2 > bArr.length) {
            throw new IndexOutOfBoundsException();
        }
        int i3 = 0;
        while (true) {
            int i4 = i3;
            if (i4 < i2) {
                int min = Math.min(this.b.length, i2 - i4);
                if (min > this.b.length - this.c) {
                    flush();
                }
                System.arraycopy(bArr, i + i4, this.b, this.c, min);
                this.c += min;
                i3 = i4 + min;
            } else {
                return;
            }
        }
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public synchronized void flush() {
        if (this.c > 0) {
            this.f23a.a(this.b, 0, this.c);
            this.c = 0;
        }
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        flush();
        this.f23a.shutdownOutput();
    }
}