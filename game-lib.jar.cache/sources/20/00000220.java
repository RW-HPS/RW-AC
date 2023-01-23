package com.corrodinggames.rts.game.units.custom.a;

import com.corrodinggames.rts.game.units.am;
import com.corrodinggames.rts.game.units.custom.aj;
import com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean;
import com.corrodinggames.rts.game.units.custom.p;
import com.corrodinggames.rts.game.units.y;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.f.an;

/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/a/c.class */
public class c extends com.corrodinggames.rts.game.units.a.a {
    public LogicBoolean b;
    public LogicBoolean c;
    public aj d;
    public LogicBoolean e;
    public aj f;
    public LogicBoolean g;
    public aj h;
    public boolean i;
    public LogicBoolean j;
    public com.corrodinggames.rts.game.units.custom.d.b k;
    public com.corrodinggames.rts.game.units.custom.d.b l;
    public com.corrodinggames.rts.game.units.custom.d.b m;

    public static com.corrodinggames.rts.game.units.a.a a(d dVar) {
        boolean z = false;
        if (dVar.z != null && dVar.z != LogicBoolean.falseBoolean) {
            z = true;
        }
        if (dVar.B != null && dVar.B != LogicBoolean.falseBoolean) {
            z = true;
        }
        if (dVar.D != null && dVar.D != LogicBoolean.falseBoolean) {
            z = true;
        }
        if (dVar.v != null && dVar.v != LogicBoolean.trueBoolean) {
            z = true;
        }
        if (dVar.aF != null && dVar.aF != LogicBoolean.falseBoolean) {
            z = true;
        }
        if (dVar.ae != null) {
            z = true;
        }
        if (dVar.q != null) {
            z = true;
        }
        if (!z) {
            return com.corrodinggames.rts.game.units.a.a.f174a;
        }
        c cVar = new c();
        cVar.c = dVar.z;
        cVar.d = dVar.A;
        cVar.e = dVar.B;
        cVar.f = dVar.C;
        cVar.g = dVar.D;
        cVar.h = dVar.E;
        cVar.b = dVar.v;
        cVar.j = dVar.aF;
        cVar.l = dVar.ae;
        cVar.k = dVar.q;
        cVar.m = dVar.r;
        cVar.i = dVar.y;
        return cVar;
    }

    public static com.corrodinggames.rts.game.units.a.a a(p pVar) {
        boolean z = false;
        if (pVar.f != null && pVar.f != LogicBoolean.falseBoolean) {
            z = true;
        }
        if (!z) {
            return com.corrodinggames.rts.game.units.a.a.f174a;
        }
        c cVar = new c();
        cVar.c = pVar.f;
        cVar.d = aj.a(pVar.g);
        return cVar;
    }

    @Override // com.corrodinggames.rts.game.units.a.a
    public boolean a(am amVar) {
        return this.i;
    }

    @Override // com.corrodinggames.rts.game.units.a.a
    public boolean b(am amVar) {
        return a(amVar, -1);
    }

    public boolean a(am amVar, int i) {
        if (this.c != null && (i == -1 || i == 1)) {
            if (!(amVar instanceof y)) {
                GameEngine.n("CustomActionConfig lockedInGame:" + amVar.r().i() + " is not a OrderableUnit unit");
                return false;
            } else if (this.c.read((y) amVar)) {
                return true;
            }
        }
        if (this.e != null && (i == -1 || i == 2)) {
            if (!(amVar instanceof y)) {
                GameEngine.n("CustomActionConfig lockedInGame:" + amVar.r().i() + " is not a OrderableUnit unit");
                return false;
            } else if (this.e.read((y) amVar)) {
                return true;
            }
        }
        if (this.g != null) {
            if (i == -1 || i == 3) {
                if (!(amVar instanceof y)) {
                    GameEngine.n("CustomActionConfig lockedInGame:" + amVar.r().i() + " is not a OrderableUnit unit");
                    return false;
                } else if (this.g.read((y) amVar)) {
                    return true;
                } else {
                    return false;
                }
            }
            return false;
        }
        return false;
    }

    @Override // com.corrodinggames.rts.game.units.a.a
    public String c(am amVar) {
        if (a(amVar, 1) && this.d != null) {
            return this.d.b(amVar);
        }
        if (a(amVar, 2) && this.f != null) {
            return this.f.b(amVar);
        }
        if (a(amVar, 3) && this.h != null) {
            return this.h.b(amVar);
        }
        return null;
    }

    @Override // com.corrodinggames.rts.game.units.a.a
    public boolean a(am amVar, boolean z) {
        if (this.b != null) {
            if (!(amVar instanceof y)) {
                GameEngine.n("CustomActionConfig isAvailable:" + amVar.r().i() + " is not a OrderableUnit unit");
                return true;
            } else if (z) {
                return an.a(this.b, (y) amVar);
            } else {
                return this.b.read((y) amVar);
            }
        }
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.a.a
    public boolean d(am amVar) {
        if (this.j != null) {
            if (!(amVar instanceof y)) {
                GameEngine.n("CustomActionConfig isGuiBlinking:" + amVar.r().i() + " is not a OrderableUnit unit");
                return true;
            }
            return this.j.read((y) amVar);
        }
        return false;
    }

    @Override // com.corrodinggames.rts.game.units.a.a
    public void a(am amVar, am amVar2) {
        if (this.l != null) {
            this.l.h(amVar);
        }
    }

    @Override // com.corrodinggames.rts.game.units.a.a
    public com.corrodinggames.rts.game.units.custom.d.b a() {
        return this.k;
    }

    @Override // com.corrodinggames.rts.game.units.a.a
    public com.corrodinggames.rts.game.units.custom.d.b b() {
        return this.m;
    }
}