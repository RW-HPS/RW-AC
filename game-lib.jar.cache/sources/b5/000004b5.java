package com.corrodinggames.rts.gameFramework.f.a;

/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/f/a/g.class */
public class g extends l {
    public g() {
    }

    public g(m mVar) {
        this.x = mVar;
    }

    @Override // com.corrodinggames.rts.gameFramework.f.a.l
    public void a(float f, float f2) {
        super.a(f, f2);
    }

    @Override // com.corrodinggames.rts.gameFramework.f.a.l
    public void b() {
        super.b();
        d();
        this.i = this.z;
        this.j = this.y;
        this.i += this.m + this.n;
        this.j += this.k + this.l;
    }
}