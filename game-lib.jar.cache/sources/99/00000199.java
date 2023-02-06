package com.corrodinggames.rts.game;

/* loaded from: game-lib.jar:com/corrodinggames/rts/game/t.class */
public class t {
    public static final p[] a = new p[0];
    p[] b = a;
    int c = 0;

    public boolean a(p pVar) {
        p[] pVarArr = this.b;
        int i = this.c;
        if (i == pVarArr.length) {
            p[] pVarArr2 = new p[i + (i < 6 ? 12 : i >> 1)];
            System.arraycopy(pVarArr, 0, pVarArr2, 0, i);
            pVarArr = pVarArr2;
            this.b = pVarArr2;
        }
        pVarArr[i] = pVar;
        this.c = i + 1;
        return true;
    }
}