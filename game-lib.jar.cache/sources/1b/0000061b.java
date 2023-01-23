package com.corrodinggames.rts.gameFramework.utility;

import java.io.IOException;
import java.io.Reader;

/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/utility/l.class */
public class l extends Reader {

    /* renamed from: a  reason: collision with root package name */
    private Reader f688a;
    private char[] b;
    private int c;
    private int d;
    private int e;
    private int f;

    public l(Reader reader) {
        this(reader, 8192);
    }

    public l(Reader reader, int i) {
        super(reader);
        this.e = -1;
        this.f = -1;
        if (i <= 0) {
            throw new IllegalArgumentException("size <= 0");
        }
        this.f688a = reader;
        this.b = new char[i];
    }

    @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        synchronized (this.lock) {
            if (!c()) {
                this.f688a.close();
                this.b = null;
            }
        }
    }

    private int b() {
        if (this.e == -1 || this.c - this.e >= this.f) {
            int read = this.f688a.read(this.b, 0, this.b.length);
            if (read > 0) {
                this.e = -1;
                this.c = 0;
                this.d = read;
            }
            return read;
        }
        if (this.e == 0 && this.f > this.b.length) {
            int length = this.b.length * 2;
            if (length > this.f) {
                length = this.f;
            }
            char[] cArr = new char[length];
            System.arraycopy(this.b, 0, cArr, 0, this.b.length);
            this.b = cArr;
        } else if (this.e > 0) {
            System.arraycopy(this.b, this.e, this.b, 0, this.b.length - this.e);
            this.c -= this.e;
            this.d -= this.e;
            this.e = 0;
        }
        int read2 = this.f688a.read(this.b, this.c, this.b.length - this.c);
        if (read2 != -1) {
            this.d += read2;
        }
        return read2;
    }

    private boolean c() {
        return this.b == null;
    }

    @Override // java.io.Reader
    public void mark(int i) {
        if (i < 0) {
            throw new IllegalArgumentException();
        }
        synchronized (this.lock) {
            d();
            this.f = i;
            this.e = this.c;
        }
    }

    private void d() {
        if (c()) {
            throw new IOException("BufferedReader is closed");
        }
    }

    @Override // java.io.Reader
    public boolean markSupported() {
        return true;
    }

    @Override // java.io.Reader
    public int read() {
        synchronized (this.lock) {
            d();
            if (this.c < this.d || b() != -1) {
                char[] cArr = this.b;
                int i = this.c;
                this.c = i + 1;
                return cArr[i];
            }
            return -1;
        }
    }

    public static void a(int i, int i2, int i3) {
        if ((i2 | i3) < 0 || i2 > i || i - i2 < i3) {
            throw new IndexOutOfBoundsException();
        }
    }

    @Override // java.io.Reader
    public int read(char[] cArr, int i, int i2) {
        int i3;
        synchronized (this.lock) {
            d();
            a(cArr.length, i, i2);
            int i4 = i2;
            while (true) {
                if (i4 <= 0) {
                    break;
                }
                int i5 = this.d - this.c;
                if (i5 > 0) {
                    int i6 = i5 >= i4 ? i4 : i5;
                    System.arraycopy(this.b, this.c, cArr, i, i6);
                    this.c += i6;
                    i += i6;
                    i4 -= i6;
                }
                if (i4 == 0 || (i4 < i2 && !this.f688a.ready())) {
                    break;
                } else if ((this.e == -1 || this.c - this.e >= this.f) && i4 >= this.b.length) {
                    int read = this.f688a.read(cArr, i, i4);
                    if (read > 0) {
                        i4 -= read;
                        this.e = -1;
                    }
                } else if (b() == -1) {
                    break;
                }
            }
            int i7 = i2 - i4;
            i3 = (i7 > 0 || i7 == i2) ? i7 : -1;
        }
        return i3;
    }

    public String a() {
        synchronized (this.lock) {
            d();
            if (this.c == this.d && b() == -1) {
                return null;
            }
            for (int i = this.c; i < this.d; i++) {
                char c = this.b[i];
                if (c <= '\r') {
                    if (c == '\n') {
                        String str = new String(this.b, this.c, i - this.c);
                        this.c = i + 1;
                        return str;
                    } else if (c == '\r') {
                        String str2 = new String(this.b, this.c, i - this.c);
                        this.c = i + 1;
                        if ((this.c < this.d || b() != -1) && this.b[this.c] == '\n') {
                            this.c++;
                        }
                        return str2;
                    }
                }
            }
            char c2 = 0;
            StringBuilder sb = new StringBuilder(80);
            sb.append(this.b, this.c, this.d - this.c);
            while (true) {
                this.c = this.d;
                if (c2 == '\n') {
                    return sb.toString();
                } else if (b() == -1) {
                    return (sb.length() > 0 || c2 != 0) ? sb.toString() : null;
                } else {
                    for (int i2 = this.c; i2 < this.d; i2++) {
                        char c3 = this.b[i2];
                        if (c2 == 0) {
                            if (c3 == '\n' || c3 == '\r') {
                                c2 = c3;
                            }
                        } else if (c2 == '\r' && c3 == '\n') {
                            if (i2 > this.c) {
                                sb.append(this.b, this.c, (i2 - this.c) - 1);
                            }
                            this.c = i2 + 1;
                            return sb.toString();
                        } else {
                            if (i2 > this.c) {
                                sb.append(this.b, this.c, (i2 - this.c) - 1);
                            }
                            this.c = i2;
                            return sb.toString();
                        }
                    }
                    if (c2 == 0) {
                        sb.append(this.b, this.c, this.d - this.c);
                    } else {
                        sb.append(this.b, this.c, (this.d - this.c) - 1);
                    }
                    try {
                        Thread.sleep(5L);
                    } catch (InterruptedException e) {
                    }
                }
            }
        }
    }

    @Override // java.io.Reader
    public boolean ready() {
        boolean z;
        synchronized (this.lock) {
            d();
            z = this.d - this.c > 0 || this.f688a.ready();
        }
        return z;
    }

    @Override // java.io.Reader
    public void reset() {
        synchronized (this.lock) {
            d();
            if (this.e == -1) {
                throw new IOException("Invalid mark");
            }
            this.c = this.e;
        }
    }

    @Override // java.io.Reader
    public long skip(long j) {
        if (j < 0) {
            throw new IllegalArgumentException("byteCount < 0: " + j);
        }
        synchronized (this.lock) {
            d();
            if (j < 1) {
                return 0L;
            }
            if (this.d - this.c >= j) {
                this.c = (int) (this.c + j);
                return j;
            }
            long j2 = this.d - this.c;
            this.c = this.d;
            while (j2 < j) {
                if (b() == -1) {
                    return j2;
                } else if (this.d - this.c >= j - j2) {
                    this.c = (int) (this.c + (j - j2));
                    return j;
                } else {
                    j2 += this.d - this.c;
                    this.c = this.d;
                }
            }
            return j;
        }
    }
}