package com.corrodinggames.rts.gameFramework.m;

/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/m/t.class */
public final class t {

    /* renamed from: a  reason: collision with root package name */
    public int f640a;
    public s[] b;

    public t(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("capacity < 0: " + i);
        }
        this.b = i == 0 ? new s[0] : new s[i];
    }

    public final boolean a(s sVar) {
        s[] sVarArr = this.b;
        int i = this.f640a;
        if (i == sVarArr.length) {
            s[] sVarArr2 = new s[i + (i < 6 ? 12 : i >> 1)];
            System.arraycopy(sVarArr, 0, sVarArr2, 0, i);
            sVarArr = sVarArr2;
            this.b = sVarArr2;
        }
        sVarArr[i] = sVar;
        this.f640a = i + 1;
        return true;
    }
}