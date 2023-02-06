package com.corrodinggames.rts.gameFramework.path;

/* renamed from: com.corrodinggames.rts.gameFramework.k.g */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/k/g.class */
public class g {
    int a;
    int b;
    int c;
    int d;
    byte[] e;
    byte[] f;

    public g(int i, int i2) {
        this.a = i;
        this.b = i2;
        this.e = new byte[i * i2];
        this.f = new byte[i * i2];
    }

    public final byte a(int i, int i2) {
        return this.e[(i * this.b) + i2];
    }

    public final byte a(p pVar) {
        return this.e[(pVar.a * this.b) + pVar.b];
    }

    public boolean b(p pVar) {
        return a(pVar) <= 0;
    }

    public void a(p pVar, byte b) {
        this.e[(pVar.a * this.b) + pVar.b] = b;
    }

    public void a(p pVar, boolean z) {
        this.f[(pVar.a * this.b) + pVar.b] = (byte) (z ? 1 : 0);
    }

    public boolean c(p pVar) {
        return this.f[(pVar.a * this.b) + pVar.b] == 1;
    }
}