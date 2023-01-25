package com.corrodinggames.rts.java.audio.p051a;

import com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope;

/* renamed from: com.corrodinggames.rts.java.audio.a.o */
/* loaded from: game-lib.jar:com/corrodinggames/rts/java/audio/a/o.class */
public class C1179o implements Iterable {

    /* renamed from: a */
    public int f7275a;

    /* renamed from: b */
    Object[] f7276b;

    /* renamed from: c */
    Object[] f7277c;

    /* renamed from: d */
    int f7278d;

    /* renamed from: e */
    int f7279e;

    /* renamed from: f */
    private float f7280f;

    /* renamed from: g */
    private int f7281g;

    /* renamed from: h */
    private int f7282h;

    /* renamed from: i */
    private int f7283i;

    /* renamed from: j */
    private int f7284j;

    /* renamed from: k */
    private int f7285k;

    /* renamed from: l */
    private C1180p f7286l;

    /* renamed from: m */
    private C1180p f7287m;

    public C1179o() {
        this(51, 0.8f);
    }

    public C1179o(int i, float f) {
        if (i < 0) {
            throw new IllegalArgumentException("initialCapacity must be >= 0: " + i);
        }
        int m328b = C1177m.m328b((int) Math.ceil(i / f));
        if (m328b > 1073741824) {
            throw new IllegalArgumentException("initialCapacity is too large: " + m328b);
        }
        this.f7278d = m328b;
        if (f <= 0.0f) {
            throw new IllegalArgumentException("loadFactor must be > 0: " + f);
        }
        this.f7280f = f;
        this.f7283i = (int) (this.f7278d * f);
        this.f7282h = this.f7278d - 1;
        this.f7281g = 31 - Integer.numberOfTrailingZeros(this.f7278d);
        this.f7284j = Math.max(3, ((int) Math.ceil(Math.log(this.f7278d))) * 2);
        this.f7285k = Math.max(Math.min(this.f7278d, 8), ((int) Math.sqrt(this.f7278d)) / 8);
        this.f7276b = new Object[this.f7278d + this.f7284j];
        this.f7277c = new Object[this.f7276b.length];
    }

    /* renamed from: a */
    public Object m324a(Object obj, Object obj2) {
        if (obj == null) {
            throw new IllegalArgumentException("key cannot be null.");
        }
        return m318b(obj, obj2);
    }

    /* renamed from: b */
    private Object m318b(Object obj, Object obj2) {
        Object[] objArr = this.f7276b;
        int hashCode = obj.hashCode();
        int i = hashCode & this.f7282h;
        Object obj3 = objArr[i];
        if (obj.equals(obj3)) {
            Object obj4 = this.f7277c[i];
            this.f7277c[i] = obj2;
            return obj4;
        }
        int m317c = m317c(hashCode);
        Object obj5 = objArr[m317c];
        if (obj.equals(obj5)) {
            Object obj6 = this.f7277c[m317c];
            this.f7277c[m317c] = obj2;
            return obj6;
        }
        int m314d = m314d(hashCode);
        Object obj7 = objArr[m314d];
        if (obj.equals(obj7)) {
            Object obj8 = this.f7277c[m314d];
            this.f7277c[m314d] = obj2;
            return obj8;
        }
        int i2 = this.f7278d;
        int i3 = i2 + this.f7279e;
        while (i2 < i3) {
            if (!obj.equals(objArr[i2])) {
                i2++;
            } else {
                Object obj9 = this.f7277c[i2];
                this.f7277c[i2] = obj2;
                return obj9;
            }
        }
        if (obj3 == null) {
            objArr[i] = obj;
            this.f7277c[i] = obj2;
            int i4 = this.f7275a;
            this.f7275a = i4 + 1;
            if (i4 >= this.f7283i) {
                m320b(this.f7278d << 1);
                return null;
            }
            return null;
        } else if (obj5 == null) {
            objArr[m317c] = obj;
            this.f7277c[m317c] = obj2;
            int i5 = this.f7275a;
            this.f7275a = i5 + 1;
            if (i5 >= this.f7283i) {
                m320b(this.f7278d << 1);
                return null;
            }
            return null;
        } else if (obj7 == null) {
            objArr[m314d] = obj;
            this.f7277c[m314d] = obj2;
            int i6 = this.f7275a;
            this.f7275a = i6 + 1;
            if (i6 >= this.f7283i) {
                m320b(this.f7278d << 1);
                return null;
            }
            return null;
        } else {
            m323a(obj, obj2, i, obj3, m317c, obj5, m314d, obj7);
            return null;
        }
    }

    /* renamed from: c */
    private void m315c(Object obj, Object obj2) {
        int hashCode = obj.hashCode();
        int i = hashCode & this.f7282h;
        Object obj3 = this.f7276b[i];
        if (obj3 == null) {
            this.f7276b[i] = obj;
            this.f7277c[i] = obj2;
            int i2 = this.f7275a;
            this.f7275a = i2 + 1;
            if (i2 >= this.f7283i) {
                m320b(this.f7278d << 1);
                return;
            }
            return;
        }
        int m317c = m317c(hashCode);
        Object obj4 = this.f7276b[m317c];
        if (obj4 == null) {
            this.f7276b[m317c] = obj;
            this.f7277c[m317c] = obj2;
            int i3 = this.f7275a;
            this.f7275a = i3 + 1;
            if (i3 >= this.f7283i) {
                m320b(this.f7278d << 1);
                return;
            }
            return;
        }
        int m314d = m314d(hashCode);
        Object obj5 = this.f7276b[m314d];
        if (obj5 == null) {
            this.f7276b[m314d] = obj;
            this.f7277c[m314d] = obj2;
            int i4 = this.f7275a;
            this.f7275a = i4 + 1;
            if (i4 >= this.f7283i) {
                m320b(this.f7278d << 1);
                return;
            }
            return;
        }
        m323a(obj, obj2, i, obj3, m317c, obj4, m314d, obj5);
    }

    /* renamed from: a */
    private void m323a(Object obj, Object obj2, int i, Object obj3, int i2, Object obj4, int i3, Object obj5) {
        Object obj6;
        Object obj7;
        Object[] objArr = this.f7276b;
        Object[] objArr2 = this.f7277c;
        int i4 = this.f7282h;
        int i5 = 0;
        int i6 = this.f7285k;
        while (true) {
            switch (C1177m.m330a(2)) {
                case 0:
                    obj6 = obj3;
                    obj7 = objArr2[i];
                    objArr[i] = obj;
                    objArr2[i] = obj2;
                    break;
                case 1:
                    obj6 = obj4;
                    obj7 = objArr2[i2];
                    objArr[i2] = obj;
                    objArr2[i2] = obj2;
                    break;
                default:
                    obj6 = obj5;
                    obj7 = objArr2[i3];
                    objArr[i3] = obj;
                    objArr2[i3] = obj2;
                    break;
            }
            int hashCode = obj6.hashCode();
            i = hashCode & i4;
            obj3 = objArr[i];
            if (obj3 == null) {
                objArr[i] = obj6;
                objArr2[i] = obj7;
                int i7 = this.f7275a;
                this.f7275a = i7 + 1;
                if (i7 >= this.f7283i) {
                    m320b(this.f7278d << 1);
                    return;
                }
                return;
            }
            i2 = m317c(hashCode);
            obj4 = objArr[i2];
            if (obj4 == null) {
                objArr[i2] = obj6;
                objArr2[i2] = obj7;
                int i8 = this.f7275a;
                this.f7275a = i8 + 1;
                if (i8 >= this.f7283i) {
                    m320b(this.f7278d << 1);
                    return;
                }
                return;
            }
            i3 = m314d(hashCode);
            obj5 = objArr[i3];
            if (obj5 == null) {
                objArr[i3] = obj6;
                objArr2[i3] = obj7;
                int i9 = this.f7275a;
                this.f7275a = i9 + 1;
                if (i9 >= this.f7283i) {
                    m320b(this.f7278d << 1);
                    return;
                }
                return;
            }
            i5++;
            if (i5 != i6) {
                obj = obj6;
                obj2 = obj7;
            } else {
                m313d(obj6, obj7);
                return;
            }
        }
    }

    /* renamed from: d */
    private void m313d(Object obj, Object obj2) {
        if (this.f7279e == this.f7284j) {
            m320b(this.f7278d << 1);
            m318b(obj, obj2);
            return;
        }
        int i = this.f7278d + this.f7279e;
        this.f7276b[i] = obj;
        this.f7277c[i] = obj2;
        this.f7279e++;
        this.f7275a++;
    }

    /* renamed from: a */
    public Object m325a(Object obj) {
        int hashCode = obj.hashCode();
        int i = hashCode & this.f7282h;
        if (!obj.equals(this.f7276b[i])) {
            i = m317c(hashCode);
            if (!obj.equals(this.f7276b[i])) {
                i = m314d(hashCode);
                if (!obj.equals(this.f7276b[i])) {
                    return m312e(obj, null);
                }
            }
        }
        return this.f7277c[i];
    }

    /* renamed from: e */
    private Object m312e(Object obj, Object obj2) {
        Object[] objArr = this.f7276b;
        int i = this.f7278d;
        int i2 = i + this.f7279e;
        while (i < i2) {
            if (obj.equals(objArr[i])) {
                return this.f7277c[i];
            }
            i++;
        }
        return obj2;
    }

    /* renamed from: a */
    void m326a(int i) {
        this.f7279e--;
        int i2 = this.f7278d + this.f7279e;
        if (i < i2) {
            this.f7276b[i] = this.f7276b[i2];
            this.f7277c[i] = this.f7277c[i2];
            this.f7277c[i2] = null;
            return;
        }
        this.f7277c[i] = null;
    }

    /* renamed from: b */
    public boolean m319b(Object obj) {
        int hashCode = obj.hashCode();
        if (!obj.equals(this.f7276b[hashCode & this.f7282h])) {
            if (!obj.equals(this.f7276b[m317c(hashCode)])) {
                if (obj.equals(this.f7276b[m314d(hashCode)])) {
                    return true;
                }
                return m316c(obj);
            }
            return true;
        }
        return true;
    }

    /* renamed from: c */
    private boolean m316c(Object obj) {
        Object[] objArr = this.f7276b;
        int i = this.f7278d;
        int i2 = i + this.f7279e;
        while (i < i2) {
            if (obj.equals(objArr[i])) {
                return true;
            }
            i++;
        }
        return false;
    }

    /* renamed from: b */
    private void m320b(int i) {
        int i2 = this.f7278d + this.f7279e;
        this.f7278d = i;
        this.f7283i = (int) (i * this.f7280f);
        this.f7282h = i - 1;
        this.f7281g = 31 - Integer.numberOfTrailingZeros(i);
        this.f7284j = Math.max(3, ((int) Math.ceil(Math.log(i))) * 2);
        this.f7285k = Math.max(Math.min(i, 8), ((int) Math.sqrt(i)) / 8);
        Object[] objArr = this.f7276b;
        Object[] objArr2 = this.f7277c;
        this.f7276b = new Object[i + this.f7284j];
        this.f7277c = new Object[i + this.f7284j];
        int i3 = this.f7275a;
        this.f7275a = 0;
        this.f7279e = 0;
        if (i3 > 0) {
            for (int i4 = 0; i4 < i2; i4++) {
                Object obj = objArr[i4];
                if (obj != null) {
                    m315c(obj, objArr2[i4]);
                }
            }
        }
    }

    /* renamed from: c */
    private int m317c(int i) {
        int i2 = i * (-1262997959);
        return (i2 ^ (i2 >>> this.f7281g)) & this.f7282h;
    }

    /* renamed from: d */
    private int m314d(int i) {
        int i2 = i * (-825114047);
        return (i2 ^ (i2 >>> this.f7281g)) & this.f7282h;
    }

    public int hashCode() {
        int i = 0;
        Object[] objArr = this.f7276b;
        Object[] objArr2 = this.f7277c;
        int i2 = this.f7278d + this.f7279e;
        for (int i3 = 0; i3 < i2; i3++) {
            Object obj = objArr[i3];
            if (obj != null) {
                i += obj.hashCode() * 31;
                Object obj2 = objArr2[i3];
                if (obj2 != null) {
                    i += obj2.hashCode();
                }
            }
        }
        return i;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C1179o) {
            C1179o c1179o = (C1179o) obj;
            if (c1179o.f7275a != this.f7275a) {
                return false;
            }
            Object[] objArr = this.f7276b;
            Object[] objArr2 = this.f7277c;
            int i = this.f7278d + this.f7279e;
            for (int i2 = 0; i2 < i; i2++) {
                Object obj2 = objArr[i2];
                if (obj2 != null) {
                    Object obj3 = objArr2[i2];
                    if (obj3 == null) {
                        if (!c1179o.m319b(obj2) || c1179o.m325a(obj2) != null) {
                            return false;
                        }
                    } else if (!obj3.equals(c1179o.m325a(obj2))) {
                        return false;
                    }
                }
            }
            return true;
        }
        return false;
    }

    public String toString() {
        return m322a(", ", true);
    }

    /* renamed from: a */
    private String m322a(String str, boolean z) {
        if (this.f7275a == 0) {
            return z ? "{}" : VariableScope.nullOrMissingString;
        }
        StringBuilder sb = new StringBuilder(32);
        if (z) {
            sb.append('{');
        }
        Object[] objArr = this.f7276b;
        Object[] objArr2 = this.f7277c;
        int length = objArr.length;
        while (true) {
            int i = length;
            length--;
            if (i > 0) {
                Object obj = objArr[length];
                if (obj != null) {
                    sb.append(obj);
                    sb.append('=');
                    sb.append(objArr2[length]);
                    break;
                }
            } else {
                break;
            }
        }
        while (true) {
            int i2 = length;
            length--;
            if (i2 <= 0) {
                break;
            }
            Object obj2 = objArr[length];
            if (obj2 != null) {
                sb.append(str);
                sb.append(obj2);
                sb.append('=');
                sb.append(objArr2[length]);
            }
        }
        if (z) {
            sb.append('}');
        }
        return sb.toString();
    }

    @Override // java.lang.Iterable
    /* renamed from: a */
    public C1180p iterator() {
        return m321b();
    }

    /* renamed from: b */
    public C1180p m321b() {
        if (this.f7286l == null) {
            this.f7286l = new C1180p(this);
            this.f7287m = new C1180p(this);
        }
        if (!this.f7286l.f7295f) {
            this.f7286l.mo309c();
            this.f7286l.f7295f = true;
            this.f7287m.f7295f = false;
            return this.f7286l;
        }
        this.f7287m.mo309c();
        this.f7287m.f7295f = true;
        this.f7286l.f7295f = false;
        return this.f7287m;
    }
}