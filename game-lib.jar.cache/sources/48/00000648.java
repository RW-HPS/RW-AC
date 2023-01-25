package com.corrodinggames.rts.java.audio.p051a;

import java.util.Iterator;

/* renamed from: com.corrodinggames.rts.java.audio.a.i */
/* loaded from: game-lib.jar:com/corrodinggames/rts/java/audio/a/i.class */
public class C1173i implements Iterable {

    /* renamed from: a */
    public int f7250a;

    /* renamed from: b */
    long[] f7251b;

    /* renamed from: c */
    Object[] f7252c;

    /* renamed from: d */
    int f7253d;

    /* renamed from: e */
    int f7254e;

    /* renamed from: f */
    Object f7255f;

    /* renamed from: g */
    boolean f7256g;

    /* renamed from: h */
    private float f7257h;

    /* renamed from: i */
    private int f7258i;

    /* renamed from: j */
    private int f7259j;

    /* renamed from: k */
    private int f7260k;

    /* renamed from: l */
    private int f7261l;

    /* renamed from: m */
    private int f7262m;

    /* renamed from: n */
    private C1174j f7263n;

    /* renamed from: o */
    private C1174j f7264o;

    public C1173i() {
        this(51, 0.8f);
    }

    public C1173i(int i, float f) {
        if (i < 0) {
            throw new IllegalArgumentException("initialCapacity must be >= 0: " + i);
        }
        int m328b = C1177m.m328b((int) Math.ceil(i / f));
        if (m328b > 1073741824) {
            throw new IllegalArgumentException("initialCapacity is too large: " + m328b);
        }
        this.f7253d = m328b;
        if (f <= 0.0f) {
            throw new IllegalArgumentException("loadFactor must be > 0: " + f);
        }
        this.f7257h = f;
        this.f7260k = (int) (this.f7253d * f);
        this.f7259j = this.f7253d - 1;
        this.f7258i = 63 - Long.numberOfTrailingZeros(this.f7253d);
        this.f7261l = Math.max(3, ((int) Math.ceil(Math.log(this.f7253d))) * 2);
        this.f7262m = Math.max(Math.min(this.f7253d, 8), ((int) Math.sqrt(this.f7253d)) / 8);
        this.f7251b = new long[this.f7253d + this.f7261l];
        this.f7252c = new Object[this.f7251b.length];
    }

    /* renamed from: a */
    public Object m348a(long j, Object obj) {
        if (j == 0) {
            Object obj2 = this.f7255f;
            this.f7255f = obj;
            if (!this.f7256g) {
                this.f7256g = true;
                this.f7250a++;
            }
            return obj2;
        }
        long[] jArr = this.f7251b;
        int i = (int) (j & this.f7259j);
        long j2 = jArr[i];
        if (j2 == j) {
            Object obj3 = this.f7252c[i];
            this.f7252c[i] = obj;
            return obj3;
        }
        int m337f = m337f(j);
        long j3 = jArr[m337f];
        if (j3 == j) {
            Object obj4 = this.f7252c[m337f];
            this.f7252c[m337f] = obj;
            return obj4;
        }
        int m336g = m336g(j);
        long j4 = jArr[m336g];
        if (j4 == j) {
            Object obj5 = this.f7252c[m336g];
            this.f7252c[m336g] = obj;
            return obj5;
        }
        int i2 = this.f7253d;
        int i3 = i2 + this.f7254e;
        while (i2 < i3) {
            if (jArr[i2] != j) {
                i2++;
            } else {
                Object obj6 = this.f7252c[i2];
                this.f7252c[i2] = obj;
                return obj6;
            }
        }
        if (j2 == 0) {
            jArr[i] = j;
            this.f7252c[i] = obj;
            int i4 = this.f7250a;
            this.f7250a = i4 + 1;
            if (i4 >= this.f7260k) {
                m345b(this.f7253d << 1);
                return null;
            }
            return null;
        } else if (j3 == 0) {
            jArr[m337f] = j;
            this.f7252c[m337f] = obj;
            int i5 = this.f7250a;
            this.f7250a = i5 + 1;
            if (i5 >= this.f7260k) {
                m345b(this.f7253d << 1);
                return null;
            }
            return null;
        } else if (j4 == 0) {
            jArr[m336g] = j;
            this.f7252c[m336g] = obj;
            int i6 = this.f7250a;
            this.f7250a = i6 + 1;
            if (i6 >= this.f7260k) {
                m345b(this.f7253d << 1);
                return null;
            }
            return null;
        } else {
            m347a(j, obj, i, j2, m337f, j3, m336g, j4);
            return null;
        }
    }

    /* renamed from: b */
    private void m343b(long j, Object obj) {
        if (j == 0) {
            this.f7255f = obj;
            this.f7256g = true;
            return;
        }
        int i = (int) (j & this.f7259j);
        long j2 = this.f7251b[i];
        if (j2 == 0) {
            this.f7251b[i] = j;
            this.f7252c[i] = obj;
            int i2 = this.f7250a;
            this.f7250a = i2 + 1;
            if (i2 >= this.f7260k) {
                m345b(this.f7253d << 1);
                return;
            }
            return;
        }
        int m337f = m337f(j);
        long j3 = this.f7251b[m337f];
        if (j3 == 0) {
            this.f7251b[m337f] = j;
            this.f7252c[m337f] = obj;
            int i3 = this.f7250a;
            this.f7250a = i3 + 1;
            if (i3 >= this.f7260k) {
                m345b(this.f7253d << 1);
                return;
            }
            return;
        }
        int m336g = m336g(j);
        long j4 = this.f7251b[m336g];
        if (j4 == 0) {
            this.f7251b[m336g] = j;
            this.f7252c[m336g] = obj;
            int i4 = this.f7250a;
            this.f7250a = i4 + 1;
            if (i4 >= this.f7260k) {
                m345b(this.f7253d << 1);
                return;
            }
            return;
        }
        m347a(j, obj, i, j2, m337f, j3, m336g, j4);
    }

    /* renamed from: a */
    private void m347a(long j, Object obj, int i, long j2, int i2, long j3, int i3, long j4) {
        long j5;
        Object obj2;
        long[] jArr = this.f7251b;
        Object[] objArr = this.f7252c;
        int i4 = this.f7259j;
        int i5 = 0;
        int i6 = this.f7262m;
        while (true) {
            switch (C1177m.m330a(2)) {
                case 0:
                    j5 = j2;
                    obj2 = objArr[i];
                    jArr[i] = j;
                    objArr[i] = obj;
                    break;
                case 1:
                    j5 = j3;
                    obj2 = objArr[i2];
                    jArr[i2] = j;
                    objArr[i2] = obj;
                    break;
                default:
                    j5 = j4;
                    obj2 = objArr[i3];
                    jArr[i3] = j;
                    objArr[i3] = obj;
                    break;
            }
            i = (int) (j5 & i4);
            j2 = jArr[i];
            if (j2 == 0) {
                jArr[i] = j5;
                objArr[i] = obj2;
                int i7 = this.f7250a;
                this.f7250a = i7 + 1;
                if (i7 >= this.f7260k) {
                    m345b(this.f7253d << 1);
                    return;
                }
                return;
            }
            i2 = m337f(j5);
            j3 = jArr[i2];
            if (j3 == 0) {
                jArr[i2] = j5;
                objArr[i2] = obj2;
                int i8 = this.f7250a;
                this.f7250a = i8 + 1;
                if (i8 >= this.f7260k) {
                    m345b(this.f7253d << 1);
                    return;
                }
                return;
            }
            i3 = m336g(j5);
            j4 = jArr[i3];
            if (j4 == 0) {
                jArr[i3] = j5;
                objArr[i3] = obj2;
                int i9 = this.f7250a;
                this.f7250a = i9 + 1;
                if (i9 >= this.f7260k) {
                    m345b(this.f7253d << 1);
                    return;
                }
                return;
            }
            i5++;
            if (i5 != i6) {
                j = j5;
                obj = obj2;
            } else {
                m341c(j5, obj2);
                return;
            }
        }
    }

    /* renamed from: c */
    private void m341c(long j, Object obj) {
        if (this.f7254e == this.f7261l) {
            m345b(this.f7253d << 1);
            m348a(j, obj);
            return;
        }
        int i = this.f7253d + this.f7254e;
        this.f7251b[i] = j;
        this.f7252c[i] = obj;
        this.f7254e++;
        this.f7250a++;
    }

    /* renamed from: a */
    public Object m349a(long j) {
        if (j == 0) {
            if (this.f7256g) {
                return this.f7255f;
            }
            return null;
        }
        int i = (int) (j & this.f7259j);
        if (this.f7251b[i] != j) {
            i = m337f(j);
            if (this.f7251b[i] != j) {
                i = m336g(j);
                if (this.f7251b[i] != j) {
                    return m339d(j, null);
                }
            }
        }
        return this.f7252c[i];
    }

    /* renamed from: d */
    private Object m339d(long j, Object obj) {
        long[] jArr = this.f7251b;
        int i = this.f7253d;
        int i2 = i + this.f7254e;
        while (i < i2) {
            if (jArr[i] == j) {
                return this.f7252c[i];
            }
            i++;
        }
        return obj;
    }

    /* renamed from: b */
    public Object m344b(long j) {
        if (j == 0) {
            if (this.f7256g) {
                Object obj = this.f7255f;
                this.f7255f = null;
                this.f7256g = false;
                this.f7250a--;
                return obj;
            }
            return null;
        }
        int i = (int) (j & this.f7259j);
        if (this.f7251b[i] == j) {
            this.f7251b[i] = 0;
            Object obj2 = this.f7252c[i];
            this.f7252c[i] = null;
            this.f7250a--;
            return obj2;
        }
        int m337f = m337f(j);
        if (this.f7251b[m337f] == j) {
            this.f7251b[m337f] = 0;
            Object obj3 = this.f7252c[m337f];
            this.f7252c[m337f] = null;
            this.f7250a--;
            return obj3;
        }
        int m336g = m336g(j);
        if (this.f7251b[m336g] == j) {
            this.f7251b[m336g] = 0;
            Object obj4 = this.f7252c[m336g];
            this.f7252c[m336g] = null;
            this.f7250a--;
            return obj4;
        }
        return m342c(j);
    }

    /* renamed from: c */
    Object m342c(long j) {
        long[] jArr = this.f7251b;
        int i = this.f7253d;
        int i2 = i + this.f7254e;
        while (i < i2) {
            if (jArr[i] != j) {
                i++;
            } else {
                Object obj = this.f7252c[i];
                m350a(i);
                this.f7250a--;
                return obj;
            }
        }
        return null;
    }

    /* renamed from: a */
    void m350a(int i) {
        this.f7254e--;
        int i2 = this.f7253d + this.f7254e;
        if (i < i2) {
            this.f7251b[i] = this.f7251b[i2];
            this.f7252c[i] = this.f7252c[i2];
            this.f7252c[i2] = null;
            return;
        }
        this.f7252c[i] = null;
    }

    /* renamed from: a */
    public void m351a() {
        if (this.f7250a == 0) {
            return;
        }
        long[] jArr = this.f7251b;
        Object[] objArr = this.f7252c;
        int i = this.f7253d + this.f7254e;
        while (true) {
            int i2 = i;
            i--;
            if (i2 > 0) {
                jArr[i] = 0;
                objArr[i] = null;
            } else {
                this.f7250a = 0;
                this.f7254e = 0;
                this.f7255f = null;
                this.f7256g = false;
                return;
            }
        }
    }

    /* renamed from: d */
    public boolean m340d(long j) {
        if (j == 0) {
            return this.f7256g;
        }
        if (this.f7251b[(int) (j & this.f7259j)] != j) {
            if (this.f7251b[m337f(j)] != j) {
                if (this.f7251b[m336g(j)] != j) {
                    return m338e(j);
                }
                return true;
            }
            return true;
        }
        return true;
    }

    /* renamed from: e */
    private boolean m338e(long j) {
        long[] jArr = this.f7251b;
        int i = this.f7253d;
        int i2 = i + this.f7254e;
        while (i < i2) {
            if (jArr[i] == j) {
                return true;
            }
            i++;
        }
        return false;
    }

    /* renamed from: b */
    private void m345b(int i) {
        int i2 = this.f7253d + this.f7254e;
        this.f7253d = i;
        this.f7260k = (int) (i * this.f7257h);
        this.f7259j = i - 1;
        this.f7258i = 63 - Long.numberOfTrailingZeros(i);
        this.f7261l = Math.max(3, ((int) Math.ceil(Math.log(i))) * 2);
        this.f7262m = Math.max(Math.min(i, 8), ((int) Math.sqrt(i)) / 8);
        long[] jArr = this.f7251b;
        Object[] objArr = this.f7252c;
        this.f7251b = new long[i + this.f7261l];
        this.f7252c = new Object[i + this.f7261l];
        int i3 = this.f7250a;
        this.f7250a = this.f7256g ? 1 : 0;
        this.f7254e = 0;
        if (i3 > 0) {
            for (int i4 = 0; i4 < i2; i4++) {
                long j = jArr[i4];
                if (j != 0) {
                    m343b(j, objArr[i4]);
                }
            }
        }
    }

    /* renamed from: f */
    private int m337f(long j) {
        long j2 = j * (-1262997959);
        return (int) ((j2 ^ (j2 >>> this.f7258i)) & this.f7259j);
    }

    /* renamed from: g */
    private int m336g(long j) {
        long j2 = j * (-825114047);
        return (int) ((j2 ^ (j2 >>> this.f7258i)) & this.f7259j);
    }

    public int hashCode() {
        int i = 0;
        if (this.f7256g && this.f7255f != null) {
            i = 0 + this.f7255f.hashCode();
        }
        long[] jArr = this.f7251b;
        Object[] objArr = this.f7252c;
        int i2 = this.f7253d + this.f7254e;
        for (int i3 = 0; i3 < i2; i3++) {
            long j = jArr[i3];
            if (j != 0) {
                i += ((int) (j ^ (j >>> 32))) * 31;
                Object obj = objArr[i3];
                if (obj != null) {
                    i += obj.hashCode();
                }
            }
        }
        return i;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C1173i) {
            C1173i c1173i = (C1173i) obj;
            if (c1173i.f7250a == this.f7250a && c1173i.f7256g == this.f7256g) {
                if (this.f7256g) {
                    if (c1173i.f7255f == null) {
                        if (this.f7255f != null) {
                            return false;
                        }
                    } else if (!c1173i.f7255f.equals(this.f7255f)) {
                        return false;
                    }
                }
                long[] jArr = this.f7251b;
                Object[] objArr = this.f7252c;
                int i = this.f7253d + this.f7254e;
                for (int i2 = 0; i2 < i; i2++) {
                    long j = jArr[i2];
                    if (j != 0) {
                        Object obj2 = objArr[i2];
                        if (obj2 == null) {
                            if (!c1173i.m340d(j) || c1173i.m349a(j) != null) {
                                return false;
                            }
                        } else if (!obj2.equals(c1173i.m349a(j))) {
                            return false;
                        }
                    }
                }
                return true;
            }
            return false;
        }
        return false;
    }

    public String toString() {
        if (this.f7250a == 0) {
            return "[]";
        }
        StringBuilder sb = new StringBuilder(32);
        sb.append('[');
        long[] jArr = this.f7251b;
        Object[] objArr = this.f7252c;
        int length = jArr.length;
        while (true) {
            int i = length;
            length--;
            if (i <= 0) {
                break;
            }
            long j = jArr[length];
            if (j != 0) {
                sb.append(j);
                sb.append('=');
                sb.append(objArr[length]);
                break;
            }
        }
        while (true) {
            int i2 = length;
            length--;
            if (i2 > 0) {
                long j2 = jArr[length];
                if (j2 != 0) {
                    sb.append(", ");
                    sb.append(j2);
                    sb.append('=');
                    sb.append(objArr[length]);
                }
            } else {
                sb.append(']');
                return sb.toString();
            }
        }
    }

    @Override // java.lang.Iterable
    public Iterator iterator() {
        return m346b();
    }

    /* renamed from: b */
    public C1174j m346b() {
        if (this.f7263n == null) {
            this.f7263n = new C1174j(this);
            this.f7264o = new C1174j(this);
        }
        if (!this.f7263n.f7272e) {
            this.f7263n.mo334b();
            this.f7263n.f7272e = true;
            this.f7264o.f7272e = false;
            return this.f7263n;
        }
        this.f7264o.mo334b();
        this.f7264o.f7272e = true;
        this.f7263n.f7272e = false;
        return this.f7264o;
    }
}