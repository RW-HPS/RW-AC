package com.corrodinggames.rts.game.units.a;

import com.corrodinggames.rts.game.units.am;
import com.corrodinggames.rts.game.units.ar;
import com.corrodinggames.rts.game.units.as;
import com.corrodinggames.rts.gameFramework.GameEngine;

/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/a/v.class */
public class v extends s {
    as a;
    int b;

    @Override // com.corrodinggames.rts.game.units.a.s
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || obj.getClass() != getClass()) {
            return false;
        }
        v vVar = (v) obj;
        if (this.b != vVar.b || this.a != vVar.a) {
            return false;
        }
        return super.equals(obj);
    }

    public v(as asVar) {
        this(asVar, 1, null);
    }

    public v(as asVar, int i, Integer num) {
        super("b_" + asVar.v());
        this.b = 1;
        as c = com.corrodinggames.rts.game.units.custom.l.c(asVar);
        if (c != null) {
            asVar = c;
            a("b_" + asVar.v());
        }
        if (i != 1) {
            a(N() + "_" + i);
        }
        this.a = asVar;
        this.b = i;
        if (num != null) {
            this.g = num.intValue();
        }
    }

    @Override // com.corrodinggames.rts.game.units.a.s
    /* renamed from: i */
    public as mo3i() {
        return this.a;
    }

    @Override // com.corrodinggames.rts.game.units.a.s
    public as y() {
        return this.a;
    }

    @Override // com.corrodinggames.rts.game.units.a.s
    public int t() {
        return this.b;
    }

    @Override // com.corrodinggames.rts.game.units.a.s
    public String a() {
        String f = mo3i().f();
        am c = am.c(mo3i());
        if (this.b != 1 && (c instanceof com.corrodinggames.rts.game.units.y)) {
            ((com.corrodinggames.rts.game.units.y) c).a(this.b);
        }
        String str = f + "\n\n" + com.corrodinggames.rts.gameFramework.Interface.a.a(c, false, false, true);
        if (this.b != 1 && (c instanceof com.corrodinggames.rts.game.units.y)) {
            ((com.corrodinggames.rts.game.units.y) c).a(1);
        }
        return str;
    }

    @Override // com.corrodinggames.rts.game.units.a.s
    public String b() {
        as mo3i = mo3i();
        String e = mo3i().e();
        if (!(mo3i instanceof com.corrodinggames.rts.game.units.custom.l)) {
            if (t() == 2) {
                e = e + " T-2";
            }
            if (t() == 3) {
                e = e + " T-3";
            }
        }
        return e;
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
        return mo3i().d(t());
    }

    @Override // com.corrodinggames.rts.game.units.a.s
    public com.corrodinggames.rts.game.units.custom.d.b r_() {
        com.corrodinggames.rts.game.units.custom.d.b b = this.h.b();
        if (b != null) {
            return b;
        }
        return mo3i().B();
    }

    @Override // com.corrodinggames.rts.game.units.a.s
    public int b(am amVar, boolean z) {
        return -1;
    }

    @Override // com.corrodinggames.rts.game.units.a.s
    public u e() {
        return u.placeBuilding;
    }

    @Override // com.corrodinggames.rts.game.units.a.s
    public t f() {
        return t.building;
    }

    @Override // com.corrodinggames.rts.game.units.a.s
    public boolean n_() {
        return !mo3i().C();
    }

    @Override // com.corrodinggames.rts.game.units.a.s
    public boolean g(am amVar) {
        GameEngine gameEngine = GameEngine.getGameEngine();
        if (((mo3i() == ar.AntiNukeLaucher || mo3i() == ar.NukeLaucher) && gameEngine.O() && gameEngine.netEngine.gameMapData.nukes) || mo3i().w()) {
            return true;
        }
        return super.g(amVar);
    }

    @Override // com.corrodinggames.rts.game.units.a.s
    public boolean g() {
        return false;
    }

    @Override // com.corrodinggames.rts.game.units.a.s
    public boolean u() {
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.a.s
    public boolean D() {
        return false;
    }

    @Override // com.corrodinggames.rts.game.units.a.s
    public float p(am amVar) {
        am X;
        if ((amVar instanceof com.corrodinggames.rts.game.units.y) && (X = ((com.corrodinggames.rts.game.units.y) amVar).X()) != null && X.cm < 1.0f && X.mo1r() == mo3i()) {
            return X.cm;
        }
        return -1.0f;
    }

    @Override // com.corrodinggames.rts.game.units.a.s
    public boolean r(am amVar) {
        return this.h.a(amVar, true);
    }

    @Override // com.corrodinggames.rts.game.units.a.s
    public boolean b(am amVar) {
        return this.h.a(amVar, false);
    }
}