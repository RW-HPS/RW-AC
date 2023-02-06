package com.corrodinggames.rts.java.audio.a;

/* loaded from: game-lib.jar:com/corrodinggames/rts/java/audio/a/d.class */
public class d {
    public int[] a;
    public int b;
    public boolean c;

    public d() {
        this(true, 16);
    }

    public d(boolean z, int i) {
        this.c = z;
        this.a = new int[i];
    }

    public d(d dVar) {
        this.c = dVar.c;
        this.b = dVar.b;
        this.a = new int[this.b];
        System.arraycopy(dVar.a, 0, this.a, 0, this.b);
    }

    public void a(int i) {
        int[] iArr = this.a;
        if (this.b == iArr.length) {
            iArr = d(Math.max(8, (int) (this.b * 1.75f)));
        }
        int i2 = this.b;
        this.b = i2 + 1;
        iArr[i2] = i;
    }

    public int b(int i) {
        if (i >= this.b) {
            throw new IndexOutOfBoundsException("index can't be >= size: " + i + " >= " + this.b);
        }
        return this.a[i];
    }

    public int c(int i) {
        if (i >= this.b) {
            throw new IndexOutOfBoundsException("index can't be >= size: " + i + " >= " + this.b);
        }
        int[] iArr = this.a;
        int i2 = iArr[i];
        this.b--;
        if (this.c) {
            System.arraycopy(iArr, i + 1, iArr, i, this.b - i);
        } else {
            iArr[i] = iArr[this.b];
        }
        return i2;
    }

    protected int[] d(int i) {
        int[] iArr = new int[i];
        System.arraycopy(this.a, 0, iArr, 0, Math.min(this.b, iArr.length));
        this.a = iArr;
        return iArr;
    }

    public int hashCode() {
        if (this.c) {
            int[] iArr = this.a;
            int i = 1;
            int i2 = this.b;
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
        if (this.c && (obj instanceof d)) {
            d dVar = (d) obj;
            if (dVar.c && (i = this.b) == dVar.b) {
                int[] iArr = this.a;
                int[] iArr2 = dVar.a;
                for (int i2 = 0; i2 < i; i2++) {
                    if (this.a[i2] != dVar.a[i2]) {
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
        int[] iArr = this.a;
        StringBuilder sb = new StringBuilder(32);
        sb.append('[');
        sb.append(iArr[0]);
        for (int i = 1; i < this.b; i++) {
            sb.append(", ");
            sb.append(iArr[i]);
        }
        sb.append(']');
        return sb.toString();
    }
}