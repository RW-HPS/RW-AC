package com.corrodinggames.rts.java.audio.p051a;

/* renamed from: com.corrodinggames.rts.java.audio.a.d */
/* loaded from: game-lib.jar:com/corrodinggames/rts/java/audio/a/d.class */
public class C1168d {

    /* renamed from: a */
    public int[] f7224a;

    /* renamed from: b */
    public int f7225b;

    /* renamed from: c */
    public boolean f7226c;

    public C1168d() {
        this(true, 16);
    }

    public C1168d(boolean z, int i) {
        this.f7226c = z;
        this.f7224a = new int[i];
    }

    public C1168d(C1168d c1168d) {
        this.f7226c = c1168d.f7226c;
        this.f7225b = c1168d.f7225b;
        this.f7224a = new int[this.f7225b];
        System.arraycopy(c1168d.f7224a, 0, this.f7224a, 0, this.f7225b);
    }

    /* renamed from: a */
    public void m374a(int i) {
        int[] iArr = this.f7224a;
        if (this.f7225b == iArr.length) {
            iArr = m371d(Math.max(8, (int) (this.f7225b * 1.75f)));
        }
        int i2 = this.f7225b;
        this.f7225b = i2 + 1;
        iArr[i2] = i;
    }

    /* renamed from: b */
    public int m373b(int i) {
        if (i >= this.f7225b) {
            throw new IndexOutOfBoundsException("index can't be >= size: " + i + " >= " + this.f7225b);
        }
        return this.f7224a[i];
    }

    /* renamed from: c */
    public int m372c(int i) {
        if (i >= this.f7225b) {
            throw new IndexOutOfBoundsException("index can't be >= size: " + i + " >= " + this.f7225b);
        }
        int[] iArr = this.f7224a;
        int i2 = iArr[i];
        this.f7225b--;
        if (this.f7226c) {
            System.arraycopy(iArr, i + 1, iArr, i, this.f7225b - i);
        } else {
            iArr[i] = iArr[this.f7225b];
        }
        return i2;
    }

    /* renamed from: d */
    protected int[] m371d(int i) {
        int[] iArr = new int[i];
        System.arraycopy(this.f7224a, 0, iArr, 0, Math.min(this.f7225b, iArr.length));
        this.f7224a = iArr;
        return iArr;
    }

    public int hashCode() {
        if (this.f7226c) {
            int[] iArr = this.f7224a;
            int i = 1;
            int i2 = this.f7225b;
            for (int i3 = 0; i3 < i2; i3++) {
                i = (i * 31) + iArr[i3];
            }
            return i;
        }
        return super.hashCode();
    }

    public boolean equals(Object obj) {
        int i;
        if (obj == this) {
            return true;
        }
        if (this.f7226c && (obj instanceof C1168d)) {
            C1168d c1168d = (C1168d) obj;
            if (c1168d.f7226c && (i = this.f7225b) == c1168d.f7225b) {
                int[] iArr = this.f7224a;
                int[] iArr2 = c1168d.f7224a;
                for (int i2 = 0; i2 < i; i2++) {
                    if (this.f7224a[i2] != c1168d.f7224a[i2]) {
                        return false;
                    }
                }
                return true;
            }
            return false;
        }
        return false;
    }

    public String toString() {
        if (this.f7225b == 0) {
            return "[]";
        }
        int[] iArr = this.f7224a;
        StringBuilder sb = new StringBuilder(32);
        sb.append('[');
        sb.append(iArr[0]);
        for (int i = 1; i < this.f7225b; i++) {
            sb.append(", ");
            sb.append(iArr[i]);
        }
        sb.append(']');
        return sb.toString();
    }
}