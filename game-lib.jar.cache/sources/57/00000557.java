package com.corrodinggames.rts.gameFramework.k;

/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/k/n.class */
public final class n implements Comparable {

    /* renamed from: a  reason: collision with root package name */
    public short f610a;
    public short b;
    public int c;

    public final void a(short s, short s2) {
        this.f610a = s;
        this.b = s2;
    }

    public final void a(int i, int i2, int i3) {
        int i4 = i2 - this.f610a;
        int i5 = i3 - this.b;
        int i6 = i4 > 0 ? i4 : -i4;
        int i7 = i5 > 0 ? i5 : -i5;
        this.c = i + ((i6 + i7) * 11) + (com.corrodinggames.rts.gameFramework.f.c(i6, i7) * (-7));
    }

    @Override // java.lang.Comparable
    /* renamed from: a */
    public final int compareTo(n nVar) {
        if (this.c == nVar.c) {
            if (this.f610a - nVar.f610a != 0) {
                return this.f610a - nVar.f610a;
            }
            return this.b - nVar.b;
        }
        return this.c - nVar.c;
    }

    public String toString() {
        return "PathOpenListNode [x=" + ((int) this.f610a) + ", y=" + ((int) this.b) + ", score=" + this.c + "]";
    }
}