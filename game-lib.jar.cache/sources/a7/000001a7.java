package com.corrodinggames.rts.game.units.a;

import com.corrodinggames.rts.game.units.am;
import com.corrodinggames.rts.game.units.as;

/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/a/l.class */
public class l extends w {
    as a;

    public l(as asVar) {
        this(asVar, -999.0f);
    }

    public l(as asVar, float f) {
        super("u_" + asVar.v());
        as c = com.corrodinggames.rts.game.units.custom.l.c(asVar);
        if (c != null) {
            asVar = c;
            a("u_" + asVar.v());
        }
        this.g = f;
        this.a = asVar;
    }

    @Override // com.corrodinggames.rts.game.units.a.s
    public String a() {
        return this.a.f() + "\n\n" + com.corrodinggames.rts.gameFramework.Interface.a.a(am.c(this.a), false, false, true);
    }

    @Override // com.corrodinggames.rts.game.units.a.s
    public String b() {
        return this.a.e();
    }

    @Override // com.corrodinggames.rts.game.units.a.s
    public int c() {
        return B().a();
    }

    @Override // com.corrodinggames.rts.game.units.a.s
    public com.corrodinggames.rts.game.units.custom.d.b B() {
        com.corrodinggames.rts.game.units.custom.d.b a = this.h.a();
        if (a != null) {
            return a;
        }
        return this.a.u();
    }

    @Override // com.corrodinggames.rts.game.units.a.s
    public com.corrodinggames.rts.game.units.custom.d.b r_() {
        com.corrodinggames.rts.game.units.custom.d.b b = this.h.b();
        if (b != null) {
            return b;
        }
        return this.a.B();
    }

    @Override // com.corrodinggames.rts.game.units.a.s
    /* renamed from: i */
    public as mo3i() {
        return this.a;
    }

    @Override // com.corrodinggames.rts.game.units.a.w
    public float K() {
        return this.a.D();
    }

    @Override // com.corrodinggames.rts.game.units.a.s
    public t f() {
        return t.queueUnit;
    }

    @Override // com.corrodinggames.rts.game.units.a.s
    public boolean n_() {
        return !this.a.C();
    }

    @Override // com.corrodinggames.rts.game.units.a.s
    public boolean g(am amVar) {
        if (mo3i().w()) {
            return true;
        }
        return super.g(amVar);
    }

    @Override // com.corrodinggames.rts.game.units.a.s
    public boolean g() {
        return true;
    }
}