package com.corrodinggames.rts.gameFramework;

/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/ay.class */
public abstract class ay extends az {
    public int es;
    public int et;
    public float eu;
    public float ev;
    public boolean ew;

    public void b(com.corrodinggames.rts.gameFramework.unitAction.e eVar) {
        T(eVar.p);
        U(eVar.q);
        this.ew = true;
    }

    public void a(com.corrodinggames.rts.gameFramework.unitAction.e eVar, int i) {
        T(eVar.p / i);
        U(eVar.q);
        this.ew = false;
    }

    public void T(int i) {
        this.es = i;
        this.eu = i / 2;
    }

    public void U(int i) {
        this.et = i;
        this.ev = i / 2;
    }

    public void V(int i) {
        this.es = i;
        this.eu = i / 2.0f;
    }

    public void W(int i) {
        this.et = i;
        this.ev = i / 2.0f;
    }

    protected ay(boolean z) {
        super(z);
    }

    @Override // com.corrodinggames.rts.gameFramework.w
    public void a() {
        super.a();
    }
}