package com.corrodinggames.rts.java.audio.p051a;

import java.util.Iterator;

/* renamed from: com.corrodinggames.rts.java.audio.a.e */
/* loaded from: game-lib.jar:com/corrodinggames/rts/java/audio/a/e.class */
public class C1169e implements Iterable {

    /* renamed from: a */
    public int f7227a;

    /* renamed from: b */
    int[] f7228b;

    /* renamed from: c */
    Object[] f7229c;

    /* renamed from: d */
    int f7230d;

    /* renamed from: e */
    int f7231e;

    /* renamed from: f */
    Object f7232f;

    /* renamed from: g */
    boolean f7233g;

    /* renamed from: h */
    private float f7234h;

    /* renamed from: i */
    private int f7235i;

    /* renamed from: j */
    private int f7236j;

    /* renamed from: k */
    private int f7237k;

    /* renamed from: l */
    private int f7238l;

    /* renamed from: m */
    private int f7239m;

    /* renamed from: n */
    private C1170f f7240n;

    /* renamed from: o */
    private C1170f f7241o;

    public C1169e() {
        this(51, 0.8f);
    }

    public C1169e(int i, float f) {
        if (i < 0) {
            throw new IllegalArgumentException("initialCapacity must be >= 0: " + i);
        }
        int m328b = C1177m.m328b((int) Math.ceil(i / f));
        if (m328b > 1073741824) {
            throw new IllegalArgumentException("initialCapacity is too large: " + m328b);
        }
        this.f7230d = m328b;
        if (f <= 0.0f) {
            throw new IllegalArgumentException("loadFactor must be > 0: " + f);
        }
        this.f7234h = f;
        this.f7237k = (int) (this.f7230d * f);
        this.f7236j = this.f7230d - 1;
        this.f7235i = 31 - Integer.numberOfTrailingZeros(this.f7230d);
        this.f7238l = Math.max(3, ((int) Math.ceil(Math.log(this.f7230d))) * 2);
        this.f7239m = Math.max(Math.min(this.f7230d, 8), ((int) Math.sqrt(this.f7230d)) / 8);
        this.f7228b = new int[this.f7230d + this.f7238l];
        this.f7229c = new Object[this.f7228b.length];
    }

    /* renamed from: a */
    public Object m368a(int i, Object obj) {
        if (i == 0) {
            Object obj2 = this.f7232f;
            this.f7232f = obj;
            if (!this.f7233g) {
                this.f7233g = true;
                this.f7227a++;
            }
            return obj2;
        }
        int[] iArr = this.f7228b;
        int i2 = i & this.f7236j;
        int i3 = iArr[i2];
        if (i3 == i) {
            Object obj3 = this.f7229c[i2];
            this.f7229c[i2] = obj;
            return obj3;
        }
        int m356h = m356h(i);
        int i4 = iArr[m356h];
        if (i4 == i) {
            Object obj4 = this.f7229c[m356h];
            this.f7229c[m356h] = obj;
            return obj4;
        }
        int m355i = m355i(i);
        int i5 = iArr[m355i];
        if (i5 == i) {
            Object obj5 = this.f7229c[m355i];
            this.f7229c[m355i] = obj;
            return obj5;
        }
        int i6 = this.f7230d;
        int i7 = i6 + this.f7231e;
        while (i6 < i7) {
            if (iArr[i6] != i) {
                i6++;
            } else {
                Object obj6 = this.f7229c[i6];
                this.f7229c[i6] = obj;
                return obj6;
            }
        }
        if (i3 == 0) {
            iArr[i2] = i;
            this.f7229c[i2] = obj;
            int i8 = this.f7227a;
            this.f7227a = i8 + 1;
            if (i8 >= this.f7237k) {
                m357g(this.f7230d << 1);
                return null;
            }
            return null;
        } else if (i4 == 0) {
            iArr[m356h] = i;
            this.f7229c[m356h] = obj;
            int i9 = this.f7227a;
            this.f7227a = i9 + 1;
            if (i9 >= this.f7237k) {
                m357g(this.f7230d << 1);
                return null;
            }
            return null;
        } else if (i5 == 0) {
            iArr[m355i] = i;
            this.f7229c[m355i] = obj;
            int i10 = this.f7227a;
            this.f7227a = i10 + 1;
            if (i10 >= this.f7237k) {
                m357g(this.f7230d << 1);
                return null;
            }
            return null;
        } else {
            m367a(i, obj, i2, i3, m356h, i4, m355i, i5);
            return null;
        }
    }

    /* renamed from: b */
    private void m364b(int i, Object obj) {
        if (i == 0) {
            this.f7232f = obj;
            this.f7233g = true;
            return;
        }
        int i2 = i & this.f7236j;
        int i3 = this.f7228b[i2];
        if (i3 == 0) {
            this.f7228b[i2] = i;
            this.f7229c[i2] = obj;
            int i4 = this.f7227a;
            this.f7227a = i4 + 1;
            if (i4 >= this.f7237k) {
                m357g(this.f7230d << 1);
                return;
            }
            return;
        }
        int m356h = m356h(i);
        int i5 = this.f7228b[m356h];
        if (i5 == 0) {
            this.f7228b[m356h] = i;
            this.f7229c[m356h] = obj;
            int i6 = this.f7227a;
            this.f7227a = i6 + 1;
            if (i6 >= this.f7237k) {
                m357g(this.f7230d << 1);
                return;
            }
            return;
        }
        int m355i = m355i(i);
        int i7 = this.f7228b[m355i];
        if (i7 == 0) {
            this.f7228b[m355i] = i;
            this.f7229c[m355i] = obj;
            int i8 = this.f7227a;
            this.f7227a = i8 + 1;
            if (i8 >= this.f7237k) {
                m357g(this.f7230d << 1);
                return;
            }
            return;
        }
        m367a(i, obj, i2, i3, m356h, i5, m355i, i7);
    }

    /* renamed from: a */
    private void m367a(int i, Object obj, int i2, int i3, int i4, int i5, int i6, int i7) {
        int i8;
        Object obj2;
        int[] iArr = this.f7228b;
        Object[] objArr = this.f7229c;
        int i9 = this.f7236j;
        int i10 = 0;
        int i11 = this.f7239m;
        while (true) {
            switch (C1177m.m330a(2)) {
                case 0:
                    i8 = i3;
                    obj2 = objArr[i2];
                    iArr[i2] = i;
                    objArr[i2] = obj;
                    break;
                case 1:
                    i8 = i5;
                    obj2 = objArr[i4];
                    iArr[i4] = i;
                    objArr[i4] = obj;
                    break;
                default:
                    i8 = i7;
                    obj2 = objArr[i6];
                    iArr[i6] = i;
                    objArr[i6] = obj;
                    break;
            }
            i2 = i8 & i9;
            i3 = iArr[i2];
            if (i3 == 0) {
                iArr[i2] = i8;
                objArr[i2] = obj2;
                int i12 = this.f7227a;
                this.f7227a = i12 + 1;
                if (i12 >= this.f7237k) {
                    m357g(this.f7230d << 1);
                    return;
                }
                return;
            }
            i4 = m356h(i8);
            i5 = iArr[i4];
            if (i5 == 0) {
                iArr[i4] = i8;
                objArr[i4] = obj2;
                int i13 = this.f7227a;
                this.f7227a = i13 + 1;
                if (i13 >= this.f7237k) {
                    m357g(this.f7230d << 1);
                    return;
                }
                return;
            }
            i6 = m355i(i8);
            i7 = iArr[i6];
            if (i7 == 0) {
                iArr[i6] = i8;
                objArr[i6] = obj2;
                int i14 = this.f7227a;
                this.f7227a = i14 + 1;
                if (i14 >= this.f7237k) {
                    m357g(this.f7230d << 1);
                    return;
                }
                return;
            }
            i10++;
            if (i10 != i11) {
                i = i8;
                obj = obj2;
            } else {
                m362c(i8, obj2);
                return;
            }
        }
    }

    /* renamed from: c */
    private void m362c(int i, Object obj) {
        if (this.f7231e == this.f7238l) {
            m357g(this.f7230d << 1);
            m368a(i, obj);
            return;
        }
        int i2 = this.f7230d + this.f7231e;
        this.f7228b[i2] = i;
        this.f7229c[i2] = obj;
        this.f7231e++;
        this.f7227a++;
    }

    /* renamed from: a */
    public Object m369a(int i) {
        if (i == 0) {
            if (this.f7233g) {
                return this.f7232f;
            }
            return null;
        }
        int i2 = i & this.f7236j;
        if (this.f7228b[i2] != i) {
            i2 = m356h(i);
            if (this.f7228b[i2] != i) {
                i2 = m355i(i);
                if (this.f7228b[i2] != i) {
                    return m360d(i, null);
                }
            }
        }
        return this.f7229c[i2];
    }

    /* renamed from: d */
    private Object m360d(int i, Object obj) {
        int[] iArr = this.f7228b;
        int i2 = this.f7230d;
        int i3 = i2 + this.f7231e;
        while (i2 < i3) {
            if (iArr[i2] == i) {
                return this.f7229c[i2];
            }
            i2++;
        }
        return obj;
    }

    /* renamed from: b */
    public Object m365b(int i) {
        if (i == 0) {
            if (this.f7233g) {
                Object obj = this.f7232f;
                this.f7232f = null;
                this.f7233g = false;
                this.f7227a--;
                return obj;
            }
            return null;
        }
        int i2 = i & this.f7236j;
        if (this.f7228b[i2] == i) {
            this.f7228b[i2] = 0;
            Object obj2 = this.f7229c[i2];
            this.f7229c[i2] = null;
            this.f7227a--;
            return obj2;
        }
        int m356h = m356h(i);
        if (this.f7228b[m356h] == i) {
            this.f7228b[m356h] = 0;
            Object obj3 = this.f7229c[m356h];
            this.f7229c[m356h] = null;
            this.f7227a--;
            return obj3;
        }
        int m355i = m355i(i);
        if (this.f7228b[m355i] == i) {
            this.f7228b[m355i] = 0;
            Object obj4 = this.f7229c[m355i];
            this.f7229c[m355i] = null;
            this.f7227a--;
            return obj4;
        }
        return m363c(i);
    }

    /* renamed from: c */
    Object m363c(int i) {
        int[] iArr = this.f7228b;
        int i2 = this.f7230d;
        int i3 = i2 + this.f7231e;
        while (i2 < i3) {
            if (iArr[i2] != i) {
                i2++;
            } else {
                Object obj = this.f7229c[i2];
                m361d(i2);
                this.f7227a--;
                return obj;
            }
        }
        return null;
    }

    /* renamed from: d */
    void m361d(int i) {
        this.f7231e--;
        int i2 = this.f7230d + this.f7231e;
        if (i < i2) {
            this.f7228b[i] = this.f7228b[i2];
            this.f7229c[i] = this.f7229c[i2];
            this.f7229c[i2] = null;
            return;
        }
        this.f7229c[i] = null;
    }

    /* renamed from: a */
    public void m370a() {
        if (this.f7227a == 0) {
            return;
        }
        int[] iArr = this.f7228b;
        Object[] objArr = this.f7229c;
        int i = this.f7230d + this.f7231e;
        while (true) {
            int i2 = i;
            i--;
            if (i2 > 0) {
                iArr[i] = 0;
                objArr[i] = null;
            } else {
                this.f7227a = 0;
                this.f7231e = 0;
                this.f7232f = null;
                this.f7233g = false;
                return;
            }
        }
    }

    /* renamed from: e */
    public boolean m359e(int i) {
        if (i == 0) {
            return this.f7233g;
        }
        if (this.f7228b[i & this.f7236j] != i) {
            if (this.f7228b[m356h(i)] != i) {
                if (this.f7228b[m355i(i)] != i) {
                    return m358f(i);
                }
                return true;
            }
            return true;
        }
        return true;
    }

    /* renamed from: f */
    private boolean m358f(int i) {
        int[] iArr = this.f7228b;
        int i2 = this.f7230d;
        int i3 = i2 + this.f7231e;
        while (i2 < i3) {
            if (iArr[i2] == i) {
                return true;
            }
            i2++;
        }
        return false;
    }

    /* renamed from: g */
    private void m357g(int i) {
        int i2 = this.f7230d + this.f7231e;
        this.f7230d = i;
        this.f7237k = (int) (i * this.f7234h);
        this.f7236j = i - 1;
        this.f7235i = 31 - Integer.numberOfTrailingZeros(i);
        this.f7238l = Math.max(3, ((int) Math.ceil(Math.log(i))) * 2);
        this.f7239m = Math.max(Math.min(i, 8), ((int) Math.sqrt(i)) / 8);
        int[] iArr = this.f7228b;
        Object[] objArr = this.f7229c;
        this.f7228b = new int[i + this.f7238l];
        this.f7229c = new Object[i + this.f7238l];
        int i3 = this.f7227a;
        this.f7227a = this.f7233g ? 1 : 0;
        this.f7231e = 0;
        if (i3 > 0) {
            for (int i4 = 0; i4 < i2; i4++) {
                int i5 = iArr[i4];
                if (i5 != 0) {
                    m364b(i5, objArr[i4]);
                }
            }
        }
    }

    /* renamed from: h */
    private int m356h(int i) {
        int i2 = i * (-1262997959);
        return (i2 ^ (i2 >>> this.f7235i)) & this.f7236j;
    }

    /* renamed from: i */
    private int m355i(int i) {
        int i2 = i * (-825114047);
        return (i2 ^ (i2 >>> this.f7235i)) & this.f7236j;
    }

    public int hashCode() {
        int i = 0;
        if (this.f7233g && this.f7232f != null) {
            i = 0 + this.f7232f.hashCode();
        }
        int[] iArr = this.f7228b;
        Object[] objArr = this.f7229c;
        int i2 = this.f7230d + this.f7231e;
        for (int i3 = 0; i3 < i2; i3++) {
            int i4 = iArr[i3];
            if (i4 != 0) {
                i += i4 * 31;
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
        if (obj instanceof C1169e) {
            C1169e c1169e = (C1169e) obj;
            if (c1169e.f7227a == this.f7227a && c1169e.f7233g == this.f7233g) {
                if (this.f7233g) {
                    if (c1169e.f7232f == null) {
                        if (this.f7232f != null) {
                            return false;
                        }
                    } else if (!c1169e.f7232f.equals(this.f7232f)) {
                        return false;
                    }
                }
                int[] iArr = this.f7228b;
                Object[] objArr = this.f7229c;
                int i = this.f7230d + this.f7231e;
                for (int i2 = 0; i2 < i; i2++) {
                    int i3 = iArr[i2];
                    if (i3 != 0) {
                        Object obj2 = objArr[i2];
                        if (obj2 == null) {
                            if (!c1169e.m359e(i3) || c1169e.m369a(i3) != null) {
                                return false;
                            }
                        } else if (!obj2.equals(c1169e.m369a(i3))) {
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
        int i;
        if (this.f7227a == 0) {
            return "[]";
        }
        StringBuilder sb = new StringBuilder(32);
        sb.append('[');
        int[] iArr = this.f7228b;
        Object[] objArr = this.f7229c;
        int length = iArr.length;
        if (this.f7233g) {
            sb.append("0=");
            sb.append(this.f7232f);
        } else {
            do {
                int i2 = length;
                length--;
                if (i2 > 0) {
                    i = iArr[length];
                }
            } while (i == 0);
            sb.append(i);
            sb.append('=');
            sb.append(objArr[length]);
        }
        while (true) {
            int i3 = length;
            length--;
            if (i3 > 0) {
                int i4 = iArr[length];
                if (i4 != 0) {
                    sb.append(", ");
                    sb.append(i4);
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
        return m366b();
    }

    /* renamed from: b */
    public C1170f m366b() {
        if (this.f7240n == null) {
            this.f7240n = new C1170f(this);
            this.f7241o = new C1170f(this);
        }
        if (!this.f7240n.f7249e) {
            this.f7240n.mo353b();
            this.f7240n.f7249e = true;
            this.f7241o.f7249e = false;
            return this.f7240n;
        }
        this.f7241o.mo353b();
        this.f7241o.f7249e = true;
        this.f7240n.f7249e = false;
        return this.f7241o;
    }
}