package com.corrodinggames.rts.gameFramework.path;

import com.corrodinggames.rts.gameFramework.f;

/* renamed from: com.corrodinggames.rts.gameFramework.k.n */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/k/n.class */
public final class n implements Comparable {
    public short a;
    public short b;
    public int c;

    public final void a(short s, short s2) {
        this.a = s;
        this.b = s2;
    }

    public final void a(int i, int i2, int i3) {
        int i4 = i2 - this.a;
        int i5 = i3 - this.b;
        int i6 = i4 > 0 ? i4 : -i4;
        int i7 = i5 > 0 ? i5 : -i5;
        this.c = i + ((i6 + i7) * 11) + (f.c(i6, i7) * (-7));
    }

    @Override // java.lang.Comparable
    /* renamed from: a */
    public final int compareTo(n nVar) {
        if (this.c == nVar.c) {
            if (this.a - nVar.a != 0) {
                return this.a - nVar.a;
            }
            return this.b - nVar.b;
        }
        return this.c - nVar.c;
    }

    public String toString() {
        return "PathOpenListNode [x=" + ((int) this.a) + ", y=" + ((int) this.b) + ", score=" + this.c + "]";
    }
}