package com.corrodinggames.rts.java.audio.a;

/* loaded from: game-lib.jar:com/corrodinggames/rts/java/audio/a/b.class */
public class b {

    /* renamed from: a  reason: collision with root package name */
    public float[] f712a;
    public int b;
    public boolean c;

    public b() {
        this(true, 16);
    }

    public b(int i) {
        this(true, i);
    }

    public b(boolean z, int i) {
        this.c = z;
        this.f712a = new float[i];
    }

    public void a(float f) {
        float[] fArr = this.f712a;
        if (this.b == fArr.length) {
            fArr = a(Math.max(8, (int) (this.b * 1.75f)));
        }
        int i = this.b;
        this.b = i + 1;
        fArr[i] = f;
    }

    public void a(int i, float f) {
        if (i >= this.b) {
            throw new IndexOutOfBoundsException("index can't be >= size: " + i + " >= " + this.b);
        }
        this.f712a[i] = f;
    }

    public void b(int i, float f) {
        if (i > this.b) {
            throw new IndexOutOfBoundsException("index can't be > size: " + i + " > " + this.b);
        }
        float[] fArr = this.f712a;
        if (this.b == fArr.length) {
            fArr = a(Math.max(8, (int) (this.b * 1.75f)));
        }
        if (this.c) {
            System.arraycopy(fArr, i, fArr, i + 1, this.b - i);
        } else {
            fArr[this.b] = fArr[i];
        }
        this.b++;
        fArr[i] = f;
    }

    public float a() {
        float[] fArr = this.f712a;
        int i = this.b - 1;
        this.b = i;
        return fArr[i];
    }

    public float b() {
        if (this.b == 0) {
            throw new IllegalStateException("Array is empty.");
        }
        return this.f712a[0];
    }

    public void c() {
        this.b = 0;
    }

    protected float[] a(int i) {
        float[] fArr = new float[i];
        System.arraycopy(this.f712a, 0, fArr, 0, Math.min(this.b, fArr.length));
        this.f712a = fArr;
        return fArr;
    }

    public int hashCode() {
        if (this.c) {
            float[] fArr = this.f712a;
            int i = 1;
            int i2 = this.b;
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
        if (this.c && (obj instanceof b)) {
            b bVar = (b) obj;
            if (bVar.c && (i = this.b) == bVar.b) {
                float[] fArr = this.f712a;
                float[] fArr2 = bVar.f712a;
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
        if (this.b == 0) {
            return "[]";
        }
        float[] fArr = this.f712a;
        StringBuilder sb = new StringBuilder(32);
        sb.append('[');
        sb.append(fArr[0]);
        for (int i = 1; i < this.b; i++) {
            sb.append(", ");
            sb.append(fArr[i]);
        }
        sb.append(']');
        return sb.toString();
    }
}