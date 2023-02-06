package com.corrodinggames.rts.game.units.custom.a;

import com.corrodinggames.rts.game.PlayerData;
import com.corrodinggames.rts.game.units.a.t;
import com.corrodinggames.rts.game.units.a.u;
import com.corrodinggames.rts.game.units.a.w;
import com.corrodinggames.rts.game.units.am;
import com.corrodinggames.rts.game.units.as;
import com.corrodinggames.rts.game.units.custom.h;
import com.corrodinggames.rts.game.units.custom.j;
import com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope;
import com.corrodinggames.rts.game.units.custom.v;
import com.corrodinggames.rts.game.units.y;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.Interface.an;

/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/a/g.class */
public class g extends w {
    public d a;
    public v b;
    public e c;

    public g(d dVar, v vVar) {
        super((String) null);
        this.c = e.disabled;
        String str = VariableScope.nullOrMissingString;
        a(dVar.b != null ? dVar.b : (dVar.k != null ? str + dVar.k : str) + "_" + dVar.a);
        this.a = dVar;
        this.b = vVar;
        if (dVar.J != null) {
            this.b = dVar.J;
        }
        this.c = dVar.aN;
        if (this.c == e.auto) {
            boolean z = false;
            boolean z2 = false;
            if (dVar.ag != null && dVar.ah == null) {
                z2 = true;
            }
            if (dVar.q.d()) {
                z = true;
                this.c = e.upgrade;
            }
            if (z && !z2) {
                this.c = e.upgrade;
            } else {
                this.c = e.movementChange;
            }
            if (dVar.I != null) {
                this.c = e.sameAsBuilding;
            }
        }
    }

    @Override // com.corrodinggames.rts.game.units.a.s
    public h P() {
        return this.a.s;
    }

    @Override // com.corrodinggames.rts.game.units.a.s
    public boolean F() {
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.a.s
    public boolean d(am amVar, boolean z) {
        return this.a.M;
    }

    @Override // com.corrodinggames.rts.game.units.a.s
    public boolean k(am amVar) {
        return this.a.O;
    }

    @Override // com.corrodinggames.rts.game.units.a.s
    public boolean l(am amVar) {
        return this.a.P;
    }

    @Override // com.corrodinggames.rts.game.units.a.w, com.corrodinggames.rts.game.units.a.s
    public boolean u() {
        return super.u();
    }

    @Override // com.corrodinggames.rts.game.units.a.s
    public boolean a(am amVar, boolean z) {
        j jVar = (j) amVar;
        if (!this.a.N && jVar.a(N(), z) > 0) {
            return false;
        }
        if (this.a.u != null) {
            if (z && Q()) {
                if (!an.a(this.a.u, jVar)) {
                    return false;
                }
            } else if (!this.a.u.read(jVar)) {
                return false;
            }
        }
        return super.a(amVar, z);
    }

    @Override // com.corrodinggames.rts.game.units.a.s
    public boolean g(am amVar) {
        if (a(amVar, -1)) {
            return true;
        }
        return super.g(amVar);
    }

    public boolean a(am amVar, int i) {
        if (this.a.z != null && (i == -1 || i == 1)) {
            if (!(amVar instanceof j)) {
                GameEngine.n("CustomActionConfig lockedInGame:" + amVar.mo1r().i() + " is not a custom unit");
                return false;
            } else if (this.a.z.read((j) amVar)) {
                return true;
            }
        }
        if (this.a.B != null && (i == -1 || i == 2)) {
            if (!(amVar instanceof j)) {
                GameEngine.n("CustomActionConfig lockedInGame:" + amVar.mo1r().i() + " is not a custom unit");
                return false;
            } else if (this.a.B.read((j) amVar)) {
                return true;
            }
        }
        if (this.a.D != null) {
            if (i == -1 || i == 3) {
                if (!(amVar instanceof j)) {
                    GameEngine.n("CustomActionConfig lockedInGame:" + amVar.mo1r().i() + " is not a custom unit");
                    return false;
                } else if (this.a.D.read((j) amVar)) {
                    return true;
                } else {
                    return false;
                }
            }
            return false;
        }
        return false;
    }

    @Override // com.corrodinggames.rts.game.units.a.s
    public String j(am amVar) {
        if (a(amVar, 1) && this.a.A != null) {
            return this.a.A.b(amVar);
        }
        if (a(amVar, 2) && this.a.C != null) {
            return this.a.C.b(amVar);
        }
        if (a(amVar, 3) && this.a.E != null) {
            return this.a.E.b(amVar);
        }
        return super.j(amVar);
    }

    @Override // com.corrodinggames.rts.game.units.a.s
    public boolean r(am amVar) {
        j jVar = (j) amVar;
        if (this.a.v != null) {
            if (Q()) {
                return an.a(this.a.v, jVar);
            }
            return this.a.v.read(jVar);
        }
        return super.b(amVar);
    }

    @Override // com.corrodinggames.rts.game.units.a.s
    public boolean b(am amVar) {
        j jVar = (j) amVar;
        if (this.a.v != null) {
            return this.a.v.read(jVar);
        }
        return super.b(amVar);
    }

    @Override // com.corrodinggames.rts.game.units.a.s
    public boolean a(am amVar, PlayerData playerData) {
        if (!this.a.w && !this.a.x) {
            return false;
        }
        if (amVar.bX.d(playerData)) {
            return this.a.w;
        }
        return this.a.x;
    }

    @Override // com.corrodinggames.rts.game.units.a.s
    public com.corrodinggames.rts.game.units.custom.d.b r_() {
        com.corrodinggames.rts.game.units.custom.d.b b = this.h.b();
        if (b != null) {
            return b;
        }
        return this.a.r;
    }

    @Override // com.corrodinggames.rts.game.units.a.w, com.corrodinggames.rts.game.units.a.s
    public int b(am amVar, boolean z) {
        if (this.a.aI) {
            return this.a.q.a(amVar, true);
        }
        return super.b(amVar, z);
    }

    @Override // com.corrodinggames.rts.game.units.a.s
    public String d() {
        return super.d();
    }

    @Override // com.corrodinggames.rts.game.units.a.s
    public String b() {
        String str = null;
        if (this.a.d != null) {
            str = this.a.d.b();
        }
        return str;
    }

    @Override // com.corrodinggames.rts.game.units.a.s
    public String d(am amVar) {
        as typeOrNull;
        String str = null;
        if (this.a.d != null) {
            str = this.a.d.b(amVar);
        }
        if (this.a.e != null && (typeOrNull = this.a.e.getTypeOrNull(amVar)) != null) {
            if (str == null) {
                str = VariableScope.nullOrMissingString;
            } else if (!str.equals(VariableScope.nullOrMissingString)) {
                str = str + " ";
            }
            str = str + typeOrNull.e();
        }
        if (this.a.h != null) {
            if (str == null) {
                str = VariableScope.nullOrMissingString;
            } else if (!str.equals(VariableScope.nullOrMissingString)) {
                str = str + " ";
            }
            str = str + this.a.h.b();
        }
        return str;
    }

    @Override // com.corrodinggames.rts.game.units.a.s
    public String a() {
        String str = null;
        if (this.a.i != null) {
            str = this.a.i.b();
        }
        return str;
    }

    @Override // com.corrodinggames.rts.game.units.a.s
    public String e(am amVar) {
        am unitReferenceOrNull;
        am unitOrSharedUnit;
        as typeOrNull;
        String str = null;
        if (this.a.i != null) {
            str = this.a.i.b(amVar);
        }
        if (this.a.f != null && (typeOrNull = this.a.f.getTypeOrNull(amVar)) != null) {
            if (str == null) {
                str = VariableScope.nullOrMissingString;
            } else if (!str.equals(VariableScope.nullOrMissingString)) {
                str = str + " ";
            }
            str = str + typeOrNull.f();
        }
        if (this.a.g != null) {
            if (this.a.g.getUnitReferenceOrNull(amVar) != null) {
                if (str == null) {
                    str = VariableScope.nullOrMissingString;
                } else if (!str.equals(VariableScope.nullOrMissingString)) {
                    str = str + "\n\n";
                }
                str = str + com.corrodinggames.rts.gameFramework.Interface.a.a(unitReferenceOrNull, false, false, false);
            } else {
                if (this.a.g.getUnitOrSharedUnit(amVar) != null) {
                    if (str == null) {
                        str = VariableScope.nullOrMissingString;
                    } else if (!str.equals(VariableScope.nullOrMissingString)) {
                        str = str + "\n\n";
                    }
                    str = str + com.corrodinggames.rts.gameFramework.Interface.a.a(unitOrSharedUnit, false, false, true);
                }
            }
        }
        return str;
    }

    public boolean L() {
        return this.a.U;
    }

    @Override // com.corrodinggames.rts.game.units.a.w
    public float K() {
        if (this.a.S >= 1.0f) {
            return 1000.0f;
        }
        return this.a.S;
    }

    @Override // com.corrodinggames.rts.game.units.a.w, com.corrodinggames.rts.game.units.a.s
    public u e() {
        return this.a.j;
    }

    @Override // com.corrodinggames.rts.game.units.a.s
    public com.corrodinggames.rts.game.units.custom.d.b B() {
        com.corrodinggames.rts.game.units.custom.d.b a = this.h.a();
        if (a != null) {
            return a;
        }
        return this.a.q;
    }

    @Override // com.corrodinggames.rts.game.units.a.s
    public int c() {
        return B().a();
    }

    @Override // com.corrodinggames.rts.game.units.a.s
    /* renamed from: i */
    public as mo3i() {
        if (this.b == null) {
            return null;
        }
        return this.b.c();
    }

    @Override // com.corrodinggames.rts.game.units.a.s
    public as y() {
        if (this.a.J != null) {
            return this.a.J.c();
        }
        return null;
    }

    @Override // com.corrodinggames.rts.game.units.a.s
    public as E() {
        if (this.a.I != null) {
            return this.a.I.c();
        }
        return null;
    }

    @Override // com.corrodinggames.rts.game.units.a.s
    public boolean A() {
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.a.s
    public boolean g() {
        if (this.a.J != null) {
            return true;
        }
        return false;
    }

    @Override // com.corrodinggames.rts.game.units.a.s
    public t f() {
        return this.a.aG;
    }

    @Override // com.corrodinggames.rts.game.units.a.s
    public boolean m(am amVar) {
        return this.a.G.read((j) amVar);
    }

    @Override // com.corrodinggames.rts.game.units.a.s
    public boolean n(am amVar) {
        if (this.a.F == null) {
            return false;
        }
        if (!(amVar instanceof j)) {
            GameEngine.print("ai_isHighPriority non customUnit:" + amVar.mo1r().i());
            return false;
        }
        return this.a.F.read((j) amVar);
    }

    @Override // com.corrodinggames.rts.game.units.a.s
    public e v(am amVar) {
        return this.c;
    }

    @Override // com.corrodinggames.rts.game.units.a.s
    public boolean H() {
        return this.a.K;
    }

    @Override // com.corrodinggames.rts.game.units.a.s
    public boolean I() {
        return this.a.L;
    }

    @Override // com.corrodinggames.rts.game.units.a.s
    public com.corrodinggames.rts.gameFramework.unitAction.e j() {
        return this.a.ay;
    }

    @Override // com.corrodinggames.rts.game.units.a.s
    public com.corrodinggames.rts.gameFramework.unitAction.e h(am amVar) {
        if (this.a.aB != null && (amVar instanceof j) && !an.a(this.a.aB, (j) amVar)) {
            return null;
        }
        return this.a.az;
    }

    @Override // com.corrodinggames.rts.game.units.a.s
    public int J() {
        return this.a.aA;
    }

    @Override // com.corrodinggames.rts.game.units.a.s
    public am i(am amVar) {
        if (this.a.aC != null) {
            return this.a.aC.getUnitOrSharedUnit(amVar);
        }
        return null;
    }

    @Override // com.corrodinggames.rts.game.units.a.s
    public boolean s(am amVar) {
        return this.a.aD;
    }

    @Override // com.corrodinggames.rts.game.units.a.s
    public boolean t(am amVar) {
        return this.a.aE;
    }

    @Override // com.corrodinggames.rts.game.units.a.s
    public boolean a(am amVar) {
        if (this.a.aF != null) {
            return an.a(this.a.aF, (j) amVar);
        }
        return false;
    }

    @Override // com.corrodinggames.rts.game.units.a.s
    public boolean Q() {
        return this.a.o;
    }

    @Override // com.corrodinggames.rts.game.units.a.s
    public void a(y yVar) {
        if (this.a.ae != null) {
            an.b(yVar, this.a.ae);
        }
    }
}