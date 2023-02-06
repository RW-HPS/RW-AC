package com.corrodinggames.rts.java.audio.a;

import com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope;

/* loaded from: game-lib.jar:com/corrodinggames/rts/java/audio/a/o.class */
public class o implements Iterable {
    public int a;
    Object[] b;
    Object[] c;
    int d;
    int e;
    private float f;
    private int g;
    private int h;
    private int i;
    private int j;
    private int k;
    private p l;
    private p m;

    public o() {
        this(51, 0.8f);
    }

    public o(int i, float f) {
        if (i < 0) {
            throw new IllegalArgumentException("initialCapacity must be >= 0: " + i);
        }
        int b = m.b((int) Math.ceil(i / f));
        if (b > 1073741824) {
            throw new IllegalArgumentException("initialCapacity is too large: " + b);
        }
        this.d = b;
        if (f <= 0.0f) {
            throw new IllegalArgumentException("loadFactor must be > 0: " + f);
        }
        this.f = f;
        this.i = (int) (this.d * f);
        this.h = this.d - 1;
        this.g = 31 - Integer.numberOfTrailingZeros(this.d);
        this.j = Math.max(3, ((int) Math.ceil(Math.log(this.d))) * 2);
        this.k = Math.max(Math.min(this.d, 8), ((int) Math.sqrt(this.d)) / 8);
        this.b = new Object[this.d + this.j];
        this.c = new Object[this.b.length];
    }

    public Object a(Object obj, Object obj2) {
        if (obj == null) {
            throw new IllegalArgumentException("key cannot be null.");
        }
        return b(obj, obj2);
    }

    private Object b(Object obj, Object obj2) {
        Object[] objArr = this.b;
        int hashCode = obj.hashCode();
        int i = hashCode & this.h;
        Object obj3 = objArr[i];
        if (obj.equals(obj3)) {
            Object obj4 = this.c[i];
            this.c[i] = obj2;
            return obj4;
        }
        int c = c(hashCode);
        Object obj5 = objArr[c];
        if (obj.equals(obj5)) {
            Object obj6 = this.c[c];
            this.c[c] = obj2;
            return obj6;
        }
        int d = d(hashCode);
        Object obj7 = objArr[d];
        if (obj.equals(obj7)) {
            Object obj8 = this.c[d];
            this.c[d] = obj2;
            return obj8;
        }
        int i2 = this.d;
        int i3 = i2 + this.e;
        while (i2 < i3) {
            if (!obj.equals(objArr[i2])) {
                i2++;
            } else {
                Object obj9 = this.c[i2];
                this.c[i2] = obj2;
                return obj9;
            }
        }
        if (obj3 == null) {
            objArr[i] = obj;
            this.c[i] = obj2;
            int i4 = this.a;
            this.a = i4 + 1;
            if (i4 >= this.i) {
                b(this.d << 1);
                return null;
            }
            return null;
        } else if (obj5 == null) {
            objArr[c] = obj;
            this.c[c] = obj2;
            int i5 = this.a;
            this.a = i5 + 1;
            if (i5 >= this.i) {
                b(this.d << 1);
                return null;
            }
            return null;
        } else if (obj7 == null) {
            objArr[d] = obj;
            this.c[d] = obj2;
            int i6 = this.a;
            this.a = i6 + 1;
            if (i6 >= this.i) {
                b(this.d << 1);
                return null;
            }
            return null;
        } else {
            a(obj, obj2, i, obj3, c, obj5, d, obj7);
            return null;
        }
    }

    private void c(Object obj, Object obj2) {
        int hashCode = obj.hashCode();
        int i = hashCode & this.h;
        Object obj3 = this.b[i];
        if (obj3 == null) {
            this.b[i] = obj;
            this.c[i] = obj2;
            int i2 = this.a;
            this.a = i2 + 1;
            if (i2 >= this.i) {
                b(this.d << 1);
                return;
            }
            return;
        }
        int c = c(hashCode);
        Object obj4 = this.b[c];
        if (obj4 == null) {
            this.b[c] = obj;
            this.c[c] = obj2;
            int i3 = this.a;
            this.a = i3 + 1;
            if (i3 >= this.i) {
                b(this.d << 1);
                return;
            }
            return;
        }
        int d = d(hashCode);
        Object obj5 = this.b[d];
        if (obj5 == null) {
            this.b[d] = obj;
            this.c[d] = obj2;
            int i4 = this.a;
            this.a = i4 + 1;
            if (i4 >= this.i) {
                b(this.d << 1);
                return;
            }
            return;
        }
        a(obj, obj2, i, obj3, c, obj4, d, obj5);
    }

    private void a(Object obj, Object obj2, int i, Object obj3, int i2, Object obj4, int i3, Object obj5) {
        Object obj6;
        Object obj7;
        Object[] objArr = this.b;
        Object[] objArr2 = this.c;
        int i4 = this.h;
        int i5 = 0;
        int i6 = this.k;
        while (true) {
            switch (m.a(2)) {
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
                int i7 = this.a;
                this.a = i7 + 1;
                if (i7 >= this.i) {
                    b(this.d << 1);
                    return;
                }
                return;
            }
            i2 = c(hashCode);
            obj4 = objArr[i2];
            if (obj4 == null) {
                objArr[i2] = obj6;
                objArr2[i2] = obj7;
                int i8 = this.a;
                this.a = i8 + 1;
                if (i8 >= this.i) {
                    b(this.d << 1);
                    return;
                }
                return;
            }
            i3 = d(hashCode);
            obj5 = objArr[i3];
            if (obj5 == null) {
                objArr[i3] = obj6;
                objArr2[i3] = obj7;
                int i9 = this.a;
                this.a = i9 + 1;
                if (i9 >= this.i) {
                    b(this.d << 1);
                    return;
                }
                return;
            }
            i5++;
            if (i5 != i6) {
                obj = obj6;
                obj2 = obj7;
            } else {
                d(obj6, obj7);
                return;
            }
        }
    }

    private void d(Object obj, Object obj2) {
        if (this.e == this.j) {
            b(this.d << 1);
            b(obj, obj2);
            return;
        }
        int i = this.d + this.e;
        this.b[i] = obj;
        this.c[i] = obj2;
        this.e++;
        this.a++;
    }

    public Object a(Object obj) {
        int hashCode = obj.hashCode();
        int i = hashCode & this.h;
        if (!obj.equals(this.b[i])) {
            i = c(hashCode);
            if (!obj.equals(this.b[i])) {
                i = d(hashCode);
                if (!obj.equals(this.b[i])) {
                    return e(obj, null);
                }
            }
        }
        return this.c[i];
    }

    private Object e(Object obj, Object obj2) {
        Object[] objArr = this.b;
        int i = this.d;
        int i2 = i + this.e;
        while (i < i2) {
            if (obj.equals(objArr[i])) {
                return this.c[i];
            }
            i++;
        }
        return obj2;
    }

    void a(int i) {
        this.e--;
        int i2 = this.d + this.e;
        if (i < i2) {
            this.b[i] = this.b[i2];
            this.c[i] = this.c[i2];
            this.c[i2] = null;
            return;
        }
        this.c[i] = null;
    }

    public boolean b(Object obj) {
        int hashCode = obj.hashCode();
        if (!obj.equals(this.b[hashCode & this.h])) {
            if (!obj.equals(this.b[c(hashCode)])) {
                if (obj.equals(this.b[d(hashCode)])) {
                    return true;
                }
                return c(obj);
            }
            return true;
        }
        return true;
    }

    private boolean c(Object obj) {
        Object[] objArr = this.b;
        int i = this.d;
        int i2 = i + this.e;
        while (i < i2) {
            if (obj.equals(objArr[i])) {
                return true;
            }
            i++;
        }
        return false;
    }

    private void b(int i) {
        int i2 = this.d + this.e;
        this.d = i;
        this.i = (int) (i * this.f);
        this.h = i - 1;
        this.g = 31 - Integer.numberOfTrailingZeros(i);
        this.j = Math.max(3, ((int) Math.ceil(Math.log(i))) * 2);
        this.k = Math.max(Math.min(i, 8), ((int) Math.sqrt(i)) / 8);
        Object[] objArr = this.b;
        Object[] objArr2 = this.c;
        this.b = new Object[i + this.j];
        this.c = new Object[i + this.j];
        int i3 = this.a;
        this.a = 0;
        this.e = 0;
        if (i3 > 0) {
            for (int i4 = 0; i4 < i2; i4++) {
                Object obj = objArr[i4];
                if (obj != null) {
                    c(obj, objArr2[i4]);
                }
            }
        }
    }

    private int c(int i) {
        int i2 = i * (-1262997959);
        return (i2 ^ (i2 >>> this.g)) & this.h;
    }

    private int d(int i) {
        int i2 = i * (-825114047);
        return (i2 ^ (i2 >>> this.g)) & this.h;
    }

    public int hashCode() {
        int i = 0;
        Object[] objArr = this.b;
        Object[] objArr2 = this.c;
        int i2 = this.d + this.e;
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
        if (obj instanceof o) {
            o oVar = (o) obj;
            if (oVar.a != this.a) {
                return false;
            }
            Object[] objArr = this.b;
            Object[] objArr2 = this.c;
            int i = this.d + this.e;
            for (int i2 = 0; i2 < i; i2++) {
                Object obj2 = objArr[i2];
                if (obj2 != null) {
                    Object obj3 = objArr2[i2];
                    if (obj3 == null) {
                        if (!oVar.b(obj2) || oVar.a(obj2) != null) {
                            return false;
                        }
                    } else if (!obj3.equals(oVar.a(obj2))) {
                        return false;
                    }
                }
            }
            return true;
        }
        return false;
    }

    public String toString() {
        return a(", ", true);
    }

    private String a(String str, boolean z) {
        if (this.a == 0) {
            return z ? "{}" : VariableScope.nullOrMissingString;
        }
        StringBuilder sb = new StringBuilder(32);
        if (z) {
            sb.append('{');
        }
        Object[] objArr = this.b;
        Object[] objArr2 = this.c;
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
    public p iterator() {
        return b();
    }

    public p b() {
        if (this.l == null) {
            this.l = new p(this);
            this.m = new p(this);
        }
        if (!this.l.f) {
            this.l.c();
            this.l.f = true;
            this.m.f = false;
            return this.l;
        }
        this.m.c();
        this.m.f = true;
        this.l.f = false;
        return this.m;
    }
}