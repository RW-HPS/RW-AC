package com.corrodinggames.rts.game.units.a;

import com.corrodinggames.rts.game.units.am;
import com.corrodinggames.rts.game.units.as;

/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/a/l.class */
public class l extends w {

    /* renamed from: a  reason: collision with root package name */
    as f181a;

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
        this.f181a = asVar;
    }

    @Override // com.corrodinggames.rts.game.units.a.s
    public String a() {
        return this.f181a.f() + "\n\n" + com.corrodinggames.rts.gameFramework.f.a.a(am.c(this.f181a), false, false, true);
    }

    @Override // com.corrodinggames.rts.game.units.a.s
    public String b() {
        return this.f181a.e();
    }

    @Override // com.corrodinggames.rts.game.units.a.s
    public int c() {
        return B().a();
    }

    @Override // com.corrodinggames.rts.game.units.a.s
    public com.corrodinggames.rts.game.units.custom.d.b B() {
        com.corrodinggames.rts.game.units.custom.d.b a2 = this.h.a();
        if (a2 != null) {
            return a2;
        }
        return this.f181a.u();
    }

    @Override // com.corrodinggames.rts.game.units.a.s
    public com.corrodinggames.rts.game.units.custom.d.b r_() {
        com.corrodinggames.rts.game.units.custom.d.b b = this.h.b();
        if (b != null) {
            return b;
        }
        return this.f181a.B();
    }

    @Override // com.corrodinggames.rts.game.units.a.s
    public as i() {
        return this.f181a;
    }

    @Override // com.corrodinggames.rts.game.units.a.w
    public float K() {
        return this.f181a.D();
    }

    @Override // com.corrodinggames.rts.game.units.a.s
    public t f() {
        return t.queueUnit;
    }

    @Override // com.corrodinggames.rts.game.units.a.s
    public boolean n_() {
        return !this.f181a.C();
    }

    @Override // com.corrodinggames.rts.game.units.a.s
    public boolean g(am amVar) {
        if (i().w()) {
            return true;
        }
        return super.g(amVar);
    }

    @Override // com.corrodinggames.rts.game.units.a.s
    public boolean g() {
        return true;
    }
}