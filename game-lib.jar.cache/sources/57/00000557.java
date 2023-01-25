package com.corrodinggames.rts.gameFramework.p043k;

import com.corrodinggames.rts.gameFramework.C0773f;

/* renamed from: com.corrodinggames.rts.gameFramework.k.n */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/k/n.class */
public final class C0945n implements Comparable {

    /* renamed from: a */
    public short f6256a;

    /* renamed from: b */
    public short f6257b;

    /* renamed from: c */
    public int f6258c;

    /* renamed from: a */
    public final void m1142a(short s, short s2) {
        this.f6256a = s;
        this.f6257b = s2;
    }

    /* renamed from: a */
    public final void m1144a(int i, int i2, int i3) {
        int i4 = i2 - this.f6256a;
        int i5 = i3 - this.f6257b;
        int i6 = i4 > 0 ? i4 : -i4;
        int i7 = i5 > 0 ? i5 : -i5;
        this.f6258c = i + ((i6 + i7) * 11) + (C0773f.m2147c(i6, i7) * (-7));
    }

    @Override // java.lang.Comparable
    /* renamed from: a */
    public final int compareTo(C0945n c0945n) {
        if (this.f6258c == c0945n.f6258c) {
            if (this.f6256a - c0945n.f6256a != 0) {
                return this.f6256a - c0945n.f6256a;
            }
            return this.f6257b - c0945n.f6257b;
        }
        return this.f6258c - c0945n.f6258c;
    }

    public String toString() {
        return "PathOpenListNode [x=" + ((int) this.f6256a) + ", y=" + ((int) this.f6257b) + ", score=" + this.f6258c + "]";
    }
}