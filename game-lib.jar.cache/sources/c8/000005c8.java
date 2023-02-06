package com.corrodinggames.rts.gameFramework.unitAction;

/* renamed from: com.corrodinggames.rts.gameFramework.m.t */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/m/t.class */
public final class t {
    public int a;
    public s[] b;

    public t(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("capacity < 0: " + i);
        }
        this.b = i == 0 ? new s[0] : new s[i];
    }

    public final boolean a(s sVar) {
        s[] sVarArr = this.b;
        int i = this.a;
        if (i == sVarArr.length) {
            s[] sVarArr2 = new s[i + (i < 6 ? 12 : i >> 1)];
            System.arraycopy(sVarArr, 0, sVarArr2, 0, i);
            sVarArr = sVarArr2;
            this.b = sVarArr2;
        }
        sVarArr[i] = sVar;
        this.a = i + 1;
        return true;
    }
}