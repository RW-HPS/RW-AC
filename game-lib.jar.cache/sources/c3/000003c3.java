package com.corrodinggames.rts.game.units.p027f;

import com.corrodinggames.rts.game.units.AbstractC0244am;

/* renamed from: com.corrodinggames.rts.game.units.f.b */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/f/b.class */
public final class C0542b {

    /* renamed from: a */
    public static final AbstractC0244am[] f3740a = new AbstractC0244am[0];

    /* renamed from: b */
    public int f3741b;

    /* renamed from: c */
    transient AbstractC0244am[] f3742c = f3740a;

    /* renamed from: a */
    public boolean m3213a(AbstractC0244am abstractC0244am) {
        AbstractC0244am[] abstractC0244amArr = this.f3742c;
        int i = this.f3741b;
        if (i == abstractC0244amArr.length) {
            AbstractC0244am[] abstractC0244amArr2 = new AbstractC0244am[i + (i < 6 ? 12 : i >> 1)];
            System.arraycopy(abstractC0244amArr, 0, abstractC0244amArr2, 0, i);
            abstractC0244amArr = abstractC0244amArr2;
            this.f3742c = abstractC0244amArr2;
        }
        abstractC0244amArr[i] = abstractC0244am;
        this.f3741b = i + 1;
        return true;
    }

    /* renamed from: b */
    public boolean m3212b(AbstractC0244am abstractC0244am) {
        AbstractC0244am[] abstractC0244amArr = this.f3742c;
        int i = this.f3741b;
        if (abstractC0244am != null) {
            for (int i2 = 0; i2 < i; i2++) {
                if (abstractC0244am.equals(abstractC0244amArr[i2])) {
                    int i3 = i - 1;
                    System.arraycopy(abstractC0244amArr, i2 + 1, abstractC0244amArr, i2, i3 - i2);
                    abstractC0244amArr[i3] = null;
                    this.f3741b = i3;
                    return true;
                }
            }
            return false;
        }
        for (int i4 = 0; i4 < i; i4++) {
            if (abstractC0244amArr[i4] == null) {
                int i5 = i - 1;
                System.arraycopy(abstractC0244amArr, i4 + 1, abstractC0244amArr, i4, i5 - i4);
                abstractC0244amArr[i5] = null;
                this.f3741b = i5;
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public final AbstractC0244am[] m3214a() {
        return this.f3742c;
    }
}