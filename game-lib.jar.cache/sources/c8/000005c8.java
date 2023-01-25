package com.corrodinggames.rts.gameFramework.unitAction;

/* renamed from: com.corrodinggames.rts.gameFramework.m.t */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/m/t.class */
public final class C1058t {

    /* renamed from: a */
    public int f6775a;

    /* renamed from: b */
    public C1057s[] f6776b;

    public C1058t(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("capacity < 0: " + i);
        }
        this.f6776b = i == 0 ? new C1057s[0] : new C1057s[i];
    }

    /* renamed from: a */
    public final boolean m840a(C1057s c1057s) {
        C1057s[] c1057sArr = this.f6776b;
        int i = this.f6775a;
        if (i == c1057sArr.length) {
            C1057s[] c1057sArr2 = new C1057s[i + (i < 6 ? 12 : i >> 1)];
            System.arraycopy(c1057sArr, 0, c1057sArr2, 0, i);
            c1057sArr = c1057sArr2;
            this.f6776b = c1057sArr2;
        }
        c1057sArr[i] = c1057s;
        this.f6775a = i + 1;
        return true;
    }
}