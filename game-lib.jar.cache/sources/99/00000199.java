package com.corrodinggames.rts.game;

/* renamed from: com.corrodinggames.rts.game.t */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/t.class */
public class C0203t {

    /* renamed from: a */
    public static final C0199p[] f1419a = new C0199p[0];

    /* renamed from: b */
    C0199p[] f1420b = f1419a;

    /* renamed from: c */
    int f1421c = 0;

    /* renamed from: a */
    public boolean m4342a(C0199p c0199p) {
        C0199p[] c0199pArr = this.f1420b;
        int i = this.f1421c;
        if (i == c0199pArr.length) {
            C0199p[] c0199pArr2 = new C0199p[i + (i < 6 ? 12 : i >> 1)];
            System.arraycopy(c0199pArr, 0, c0199pArr2, 0, i);
            c0199pArr = c0199pArr2;
            this.f1420b = c0199pArr2;
        }
        c0199pArr[i] = c0199p;
        this.f1421c = i + 1;
        return true;
    }
}