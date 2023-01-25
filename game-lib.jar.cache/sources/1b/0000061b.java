package com.corrodinggames.rts.gameFramework.utility;

import java.io.IOException;
import java.io.Reader;

/* renamed from: com.corrodinggames.rts.gameFramework.utility.l */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/utility/l.class */
public class C1135l extends Reader {

    /* renamed from: a */
    private Reader f7103a;

    /* renamed from: b */
    private char[] f7104b;

    /* renamed from: c */
    private int f7105c;

    /* renamed from: d */
    private int f7106d;

    /* renamed from: e */
    private int f7107e;

    /* renamed from: f */
    private int f7108f;

    public C1135l(Reader reader) {
        this(reader, 8192);
    }

    public C1135l(Reader reader, int i) {
        super(reader);
        this.f7107e = -1;
        this.f7108f = -1;
        if (i <= 0) {
            throw new IllegalArgumentException("size <= 0");
        }
        this.f7103a = reader;
        this.f7104b = new char[i];
    }

    @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        synchronized (this.lock) {
            if (!m537c()) {
                this.f7103a.close();
                this.f7104b = null;
            }
        }
    }

    /* renamed from: b */
    private int m538b() {
        if (this.f7107e == -1 || this.f7105c - this.f7107e >= this.f7108f) {
            int read = this.f7103a.read(this.f7104b, 0, this.f7104b.length);
            if (read > 0) {
                this.f7107e = -1;
                this.f7105c = 0;
                this.f7106d = read;
            }
            return read;
        }
        if (this.f7107e == 0 && this.f7108f > this.f7104b.length) {
            int length = this.f7104b.length * 2;
            if (length > this.f7108f) {
                length = this.f7108f;
            }
            char[] cArr = new char[length];
            System.arraycopy(this.f7104b, 0, cArr, 0, this.f7104b.length);
            this.f7104b = cArr;
        } else if (this.f7107e > 0) {
            System.arraycopy(this.f7104b, this.f7107e, this.f7104b, 0, this.f7104b.length - this.f7107e);
            this.f7105c -= this.f7107e;
            this.f7106d -= this.f7107e;
            this.f7107e = 0;
        }
        int read2 = this.f7103a.read(this.f7104b, this.f7105c, this.f7104b.length - this.f7105c);
        if (read2 != -1) {
            this.f7106d += read2;
        }
        return read2;
    }

    /* renamed from: c */
    private boolean m537c() {
        return this.f7104b == null;
    }

    @Override // java.io.Reader
    public void mark(int i) {
        if (i < 0) {
            throw new IllegalArgumentException();
        }
        synchronized (this.lock) {
            m536d();
            this.f7108f = i;
            this.f7107e = this.f7105c;
        }
    }

    /* renamed from: d */
    private void m536d() {
        if (m537c()) {
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
            m536d();
            if (this.f7105c < this.f7106d || m538b() != -1) {
                char[] cArr = this.f7104b;
                int i = this.f7105c;
                this.f7105c = i + 1;
                return cArr[i];
            }
            return -1;
        }
    }

    /* renamed from: a */
    public static void m539a(int i, int i2, int i3) {
        if ((i2 | i3) < 0 || i2 > i || i - i2 < i3) {
            throw new IndexOutOfBoundsException();
        }
    }

    @Override // java.io.Reader
    public int read(char[] cArr, int i, int i2) {
        int i3;
        synchronized (this.lock) {
            m536d();
            m539a(cArr.length, i, i2);
            int i4 = i2;
            while (true) {
                if (i4 <= 0) {
                    break;
                }
                int i5 = this.f7106d - this.f7105c;
                if (i5 > 0) {
                    int i6 = i5 >= i4 ? i4 : i5;
                    System.arraycopy(this.f7104b, this.f7105c, cArr, i, i6);
                    this.f7105c += i6;
                    i += i6;
                    i4 -= i6;
                }
                if (i4 == 0 || (i4 < i2 && !this.f7103a.ready())) {
                    break;
                } else if ((this.f7107e == -1 || this.f7105c - this.f7107e >= this.f7108f) && i4 >= this.f7104b.length) {
                    int read = this.f7103a.read(cArr, i, i4);
                    if (read > 0) {
                        i4 -= read;
                        this.f7107e = -1;
                    }
                } else if (m538b() == -1) {
                    break;
                }
            }
            int i7 = i2 - i4;
            i3 = (i7 > 0 || i7 == i2) ? i7 : -1;
        }
        return i3;
    }

    /* renamed from: a */
    public String m540a() {
        synchronized (this.lock) {
            m536d();
            if (this.f7105c == this.f7106d && m538b() == -1) {
                return null;
            }
            for (int i = this.f7105c; i < this.f7106d; i++) {
                char c = this.f7104b[i];
                if (c <= '\r') {
                    if (c == '\n') {
                        String str = new String(this.f7104b, this.f7105c, i - this.f7105c);
                        this.f7105c = i + 1;
                        return str;
                    } else if (c == '\r') {
                        String str2 = new String(this.f7104b, this.f7105c, i - this.f7105c);
                        this.f7105c = i + 1;
                        if ((this.f7105c < this.f7106d || m538b() != -1) && this.f7104b[this.f7105c] == '\n') {
                            this.f7105c++;
                        }
                        return str2;
                    }
                }
            }
            char c2 = 0;
            StringBuilder sb = new StringBuilder(80);
            sb.append(this.f7104b, this.f7105c, this.f7106d - this.f7105c);
            while (true) {
                this.f7105c = this.f7106d;
                if (c2 == '\n') {
                    return sb.toString();
                } else if (m538b() == -1) {
                    return (sb.length() > 0 || c2 != 0) ? sb.toString() : null;
                } else {
                    for (int i2 = this.f7105c; i2 < this.f7106d; i2++) {
                        char c3 = this.f7104b[i2];
                        if (c2 == 0) {
                            if (c3 == '\n' || c3 == '\r') {
                                c2 = c3;
                            }
                        } else if (c2 == '\r' && c3 == '\n') {
                            if (i2 > this.f7105c) {
                                sb.append(this.f7104b, this.f7105c, (i2 - this.f7105c) - 1);
                            }
                            this.f7105c = i2 + 1;
                            return sb.toString();
                        } else {
                            if (i2 > this.f7105c) {
                                sb.append(this.f7104b, this.f7105c, (i2 - this.f7105c) - 1);
                            }
                            this.f7105c = i2;
                            return sb.toString();
                        }
                    }
                    if (c2 == 0) {
                        sb.append(this.f7104b, this.f7105c, this.f7106d - this.f7105c);
                    } else {
                        sb.append(this.f7104b, this.f7105c, (this.f7106d - this.f7105c) - 1);
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
            m536d();
            z = this.f7106d - this.f7105c > 0 || this.f7103a.ready();
        }
        return z;
    }

    @Override // java.io.Reader
    public void reset() {
        synchronized (this.lock) {
            m536d();
            if (this.f7107e == -1) {
                throw new IOException("Invalid mark");
            }
            this.f7105c = this.f7107e;
        }
    }

    @Override // java.io.Reader
    public long skip(long j) {
        if (j < 0) {
            throw new IllegalArgumentException("byteCount < 0: " + j);
        }
        synchronized (this.lock) {
            m536d();
            if (j < 1) {
                return 0L;
            }
            if (this.f7106d - this.f7105c >= j) {
                this.f7105c = (int) (this.f7105c + j);
                return j;
            }
            long j2 = this.f7106d - this.f7105c;
            this.f7105c = this.f7106d;
            while (j2 < j) {
                if (m538b() == -1) {
                    return j2;
                } else if (this.f7106d - this.f7105c >= j - j2) {
                    this.f7105c = (int) (this.f7105c + (j - j2));
                    return j;
                } else {
                    j2 += this.f7106d - this.f7105c;
                    this.f7105c = this.f7106d;
                }
            }
            return j;
        }
    }
}