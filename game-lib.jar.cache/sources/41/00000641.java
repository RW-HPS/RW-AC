package com.corrodinggames.rts.java.audio.p051a;

/* renamed from: com.corrodinggames.rts.java.audio.a.b */
/* loaded from: game-lib.jar:com/corrodinggames/rts/java/audio/a/b.class */
public class C1166b {

    /* renamed from: a */
    public float[] f7221a;

    /* renamed from: b */
    public int f7222b;

    /* renamed from: c */
    public boolean f7223c;

    public C1166b() {
        this(true, 16);
    }

    public C1166b(int i) {
        this(true, i);
    }

    public C1166b(boolean z, int i) {
        this.f7223c = z;
        this.f7221a = new float[i];
    }

    /* renamed from: a */
    public void m380a(float f) {
        float[] fArr = this.f7221a;
        if (this.f7222b == fArr.length) {
            fArr = m379a(Math.max(8, (int) (this.f7222b * 1.75f)));
        }
        int i = this.f7222b;
        this.f7222b = i + 1;
        fArr[i] = f;
    }

    /* renamed from: a */
    public void m378a(int i, float f) {
        if (i >= this.f7222b) {
            throw new IndexOutOfBoundsException("index can't be >= size: " + i + " >= " + this.f7222b);
        }
        this.f7221a[i] = f;
    }

    /* renamed from: b */
    public void m376b(int i, float f) {
        if (i > this.f7222b) {
            throw new IndexOutOfBoundsException("index can't be > size: " + i + " > " + this.f7222b);
        }
        float[] fArr = this.f7221a;
        if (this.f7222b == fArr.length) {
            fArr = m379a(Math.max(8, (int) (this.f7222b * 1.75f)));
        }
        if (this.f7223c) {
            System.arraycopy(fArr, i, fArr, i + 1, this.f7222b - i);
        } else {
            fArr[this.f7222b] = fArr[i];
        }
        this.f7222b++;
        fArr[i] = f;
    }

    /* renamed from: a */
    public float m381a() {
        float[] fArr = this.f7221a;
        int i = this.f7222b - 1;
        this.f7222b = i;
        return fArr[i];
    }

    /* renamed from: b */
    public float m377b() {
        if (this.f7222b == 0) {
            throw new IllegalStateException("Array is empty.");
        }
        return this.f7221a[0];
    }

    /* renamed from: c */
    public void m375c() {
        this.f7222b = 0;
    }

    /* renamed from: a */
    protected float[] m379a(int i) {
        float[] fArr = new float[i];
        System.arraycopy(this.f7221a, 0, fArr, 0, Math.min(this.f7222b, fArr.length));
        this.f7221a = fArr;
        return fArr;
    }

    public int hashCode() {
        if (this.f7223c) {
            float[] fArr = this.f7221a;
            int i = 1;
            int i2 = this.f7222b;
            for (int i3 = 0; i3 < i2; i3++) {
                i = (i * 31) + Float.floatToIntBits(fArr[i3]);
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
        if (this.f7223c && (obj instanceof C1166b)) {
            C1166b c1166b = (C1166b) obj;
            if (c1166b.f7223c && (i = this.f7222b) == c1166b.f7222b) {
                float[] fArr = this.f7221a;
                float[] fArr2 = c1166b.f7221a;
                for (int i2 = 0; i2 < i; i2++) {
                    if (fArr[i2] != fArr2[i2]) {
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
        if (this.f7222b == 0) {
            return "[]";
        }
        float[] fArr = this.f7221a;
        StringBuilder sb = new StringBuilder(32);
        sb.append('[');
        sb.append(fArr[0]);
        for (int i = 1; i < this.f7222b; i++) {
            sb.append(", ");
            sb.append(fArr[i]);
        }
        sb.append(']');
        return sb.toString();
    }
}