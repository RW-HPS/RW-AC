package com.corrodinggames.rts.game.units.f;

import com.corrodinggames.rts.game.units.am;

/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/f/b.class */
public final class b {
    public static final am[] a = new am[0];
    public int b;
    transient am[] c = a;

    public boolean a(am amVar) {
        am[] amVarArr = this.c;
        int i = this.b;
        if (i == amVarArr.length) {
            am[] amVarArr2 = new am[i + (i < 6 ? 12 : i >> 1)];
            System.arraycopy(amVarArr, 0, amVarArr2, 0, i);
            amVarArr = amVarArr2;
            this.c = amVarArr2;
        }
        amVarArr[i] = amVar;
        this.b = i + 1;
        return true;
    }

    public boolean b(am amVar) {
        am[] amVarArr = this.c;
        int i = this.b;
        if (amVar != null) {
            for (int i2 = 0; i2 < i; i2++) {
                if (amVar.equals(amVarArr[i2])) {
                    int i3 = i - 1;
                    System.arraycopy(amVarArr, i2 + 1, amVarArr, i2, i3 - i2);
                    amVarArr[i3] = null;
                    this.b = i3;
                    return true;
                }
            }
            return false;
        }
        for (int i4 = 0; i4 < i; i4++) {
            if (amVarArr[i4] == null) {
                int i5 = i - 1;
                System.arraycopy(amVarArr, i4 + 1, amVarArr, i4, i5 - i4);
                amVarArr[i5] = null;
                this.b = i5;
                return true;
            }
        }
        return false;
    }

    public final am[] a() {
        return this.c;
    }
}