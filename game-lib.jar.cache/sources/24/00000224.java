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
import com.corrodinggames.rts.gameFramework.f.an;

/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/a/g.class */
public class g extends w {

    /* renamed from: a  reason: collision with root package name */
    public d f235a;
    public v b;
    public e c;

    public g(d dVar, v vVar) {
        super((String) null);
        this.c = e.disabled;
        String str = VariableScope.nullOrMissingString;
        a(dVar.b != null ? dVar.b : (dVar.k != null ? str + dVar.k : str) + "_" + dVar.f232a);
        this.f235a = dVar;
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
        return this.f235a.s;
    }

    @Override // com.corrodinggames.rts.game.units.a.s
    public boolean F() {
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.a.s
    public boolean d(am amVar, boolean z) {
        return this.f235a.M;
    }

    @Override // com.corrodinggames.rts.game.units.a.s
    public boolean k(am amVar) {
        return this.f235a.O;
    }

    @Override // com.corrodinggames.rts.game.units.a.s
    public boolean l(am amVar) {
        return this.f235a.P;
    }

    @Override // com.corrodinggames.rts.game.units.a.w, com.corrodinggames.rts.game.units.a.s
    public boolean u() {
        return super.u();
    }

    @Override // com.corrodinggames.rts.game.units.a.s
    public boolean a(am amVar, boolean z) {
        j jVar = (j) amVar;
        if (!this.f235a.N && jVar.a(N(), z) > 0) {
            return false;
        }
        if (this.f235a.u != null) {
            if (z && Q()) {
                if (!an.a(this.f235a.u, jVar)) {
                    return false;
                }
            } else if (!this.f235a.u.read(jVar)) {
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
        if (this.f235a.z != null && (i == -1 || i == 1)) {
            if (!(amVar instanceof j)) {
                GameEngine.n("CustomActionConfig lockedInGame:" + amVar.r().i() + " is not a custom unit");
                return false;
            } else if (this.f235a.z.read((j) amVar)) {
                return true;
            }
        }
        if (this.f235a.B != null && (i == -1 || i == 2)) {
            if (!(amVar instanceof j)) {
                GameEngine.n("CustomActionConfig lockedInGame:" + amVar.r().i() + " is not a custom unit");
                return false;
            } else if (this.f235a.B.read((j) amVar)) {
                return true;
            }
        }
        if (this.f235a.D != null) {
            if (i == -1 || i == 3) {
                if (!(amVar instanceof j)) {
                    GameEngine.n("CustomActionConfig lockedInGame:" + amVar.r().i() + " is not a custom unit");
                    return false;
                } else if (this.f235a.D.read((j) amVar)) {
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
        if (a(amVar, 1) && this.f235a.A != null) {
            return this.f235a.A.b(amVar);
        }
        if (a(amVar, 2) && this.f235a.C != null) {
            return this.f235a.C.b(amVar);
        }
        if (a(amVar, 3) && this.f235a.E != null) {
            return this.f235a.E.b(amVar);
        }
        return super.j(amVar);
    }

    @Override // com.corrodinggames.rts.game.units.a.s
    public boolean r(am amVar) {
        j jVar = (j) amVar;
        if (this.f235a.v != null) {
            if (Q()) {
                return an.a(this.f235a.v, jVar);
            }
            return this.f235a.v.read(jVar);
        }
        return super.b(amVar);
    }

    @Override // com.corrodinggames.rts.game.units.a.s
    public boolean b(am amVar) {
        j jVar = (j) amVar;
        if (this.f235a.v != null) {
            return this.f235a.v.read(jVar);
        }
        return super.b(amVar);
    }

    @Override // com.corrodinggames.rts.game.units.a.s
    public boolean a(am amVar, PlayerData playerData) {
        if (!this.f235a.w && !this.f235a.x) {
            return false;
        }
        if (amVar.bX.d(playerData)) {
            return this.f235a.w;
        }
        return this.f235a.x;
    }

    @Override // com.corrodinggames.rts.game.units.a.s
    public com.corrodinggames.rts.game.units.custom.d.b r_() {
        com.corrodinggames.rts.game.units.custom.d.b b = this.h.b();
        if (b != null) {
            return b;
        }
        return this.f235a.r;
    }

    @Override // com.corrodinggames.rts.game.units.a.w, com.corrodinggames.rts.game.units.a.s
    public int b(am amVar, boolean z) {
        if (this.f235a.aI) {
            return this.f235a.q.a(amVar, true);
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
        if (this.f235a.d != null) {
            str = this.f235a.d.b();
        }
        return str;
    }

    @Override // com.corrodinggames.rts.game.units.a.s
    public String d(am amVar) {
        as typeOrNull;
        String str = null;
        if (this.f235a.d != null) {
            str = this.f235a.d.b(amVar);
        }
        if (this.f235a.e != null && (typeOrNull = this.f235a.e.getTypeOrNull(amVar)) != null) {
            if (str == null) {
                str = VariableScope.nullOrMissingString;
            } else if (!str.equals(VariableScope.nullOrMissingString)) {
                str = str + " ";
            }
            str = str + typeOrNull.e();
        }
        if (this.f235a.h != null) {
            if (str == null) {
                str = VariableScope.nullOrMissingString;
            } else if (!str.equals(VariableScope.nullOrMissingString)) {
                str = str + " ";
            }
            str = str + this.f235a.h.b();
        }
        return str;
    }

    @Override // com.corrodinggames.rts.game.units.a.s
    public String a() {
        String str = null;
        if (this.f235a.i != null) {
            str = this.f235a.i.b();
        }
        return str;
    }

    @Override // com.corrodinggames.rts.game.units.a.s
    public String e(am amVar) {
        am unitReferenceOrNull;
        am unitOrSharedUnit;
        as typeOrNull;
        String str = null;
        if (this.f235a.i != null) {
            str = this.f235a.i.b(amVar);
        }
        if (this.f235a.f != null && (typeOrNull = this.f235a.f.getTypeOrNull(amVar)) != null) {
            if (str == null) {
                str = VariableScope.nullOrMissingString;
            } else if (!str.equals(VariableScope.nullOrMissingString)) {
                str = str + " ";
            }
            str = str + typeOrNull.f();
        }
        if (this.f235a.g != null) {
            if (this.f235a.g.getUnitReferenceOrNull(amVar) != null) {
                if (str == null) {
                    str = VariableScope.nullOrMissingString;
                } else if (!str.equals(VariableScope.nullOrMissingString)) {
                    str = str + "\n\n";
                }
                str = str + com.corrodinggames.rts.gameFramework.f.a.a(unitReferenceOrNull, false, false, false);
            } else {
                if (this.f235a.g.getUnitOrSharedUnit(amVar) != null) {
                    if (str == null) {
                        str = VariableScope.nullOrMissingString;
                    } else if (!str.equals(VariableScope.nullOrMissingString)) {
                        str = str + "\n\n";
                    }
                    str = str + com.corrodinggames.rts.gameFramework.f.a.a(unitOrSharedUnit, false, false, true);
                }
            }
        }
        return str;
    }

    public boolean L() {
        return this.f235a.U;
    }

    @Override // com.corrodinggames.rts.game.units.a.w
    public float K() {
        if (this.f235a.S >= 1.0f) {
            return 1000.0f;
        }
        return this.f235a.S;
    }

    @Override // com.corrodinggames.rts.game.units.a.w, com.corrodinggames.rts.game.units.a.s
    public u e() {
        return this.f235a.j;
    }

    @Override // com.corrodinggames.rts.game.units.a.s
    public com.corrodinggames.rts.game.units.custom.d.b B() {
        com.corrodinggames.rts.game.units.custom.d.b a2 = this.h.a();
        if (a2 != null) {
            return a2;
        }
        return this.f235a.q;
    }

    @Override // com.corrodinggames.rts.game.units.a.s
    public int c() {
        return B().a();
    }

    @Override // com.corrodinggames.rts.game.units.a.s
    public as i() {
        if (this.b == null) {
            return null;
        }
        return this.b.c();
    }

    @Override // com.corrodinggames.rts.game.units.a.s
    public as y() {
        if (this.f235a.J != null) {
            return this.f235a.J.c();
        }
        return null;
    }

    @Override // com.corrodinggames.rts.game.units.a.s
    public as E() {
        if (this.f235a.I != null) {
            return this.f235a.I.c();
        }
        return null;
    }

    @Override // com.corrodinggames.rts.game.units.a.s
    public boolean A() {
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.a.s
    public boolean g() {
        if (this.f235a.J != null) {
            return true;
        }
        return false;
    }

    @Override // com.corrodinggames.rts.game.units.a.s
    public t f() {
        return this.f235a.aG;
    }

    @Override // com.corrodinggames.rts.game.units.a.s
    public boolean m(am amVar) {
        return this.f235a.G.read((j) amVar);
    }

    @Override // com.corrodinggames.rts.game.units.a.s
    public boolean n(am amVar) {
        if (this.f235a.F == null) {
            return false;
        }
        if (!(amVar instanceof j)) {
            GameEngine.print("ai_isHighPriority non customUnit:" + amVar.r().i());
            return false;
        }
        return this.f235a.F.read((j) amVar);
    }

    @Override // com.corrodinggames.rts.game.units.a.s
    public e v(am amVar) {
        return this.c;
    }

    @Override // com.corrodinggames.rts.game.units.a.s
    public boolean H() {
        return this.f235a.K;
    }

    @Override // com.corrodinggames.rts.game.units.a.s
    public boolean I() {
        return this.f235a.L;
    }

    @Override // com.corrodinggames.rts.game.units.a.s
    public com.corrodinggames.rts.gameFramework.m.e j() {
        return this.f235a.ay;
    }

    @Override // com.corrodinggames.rts.game.units.a.s
    public com.corrodinggames.rts.gameFramework.m.e h(am amVar) {
        if (this.f235a.aB != null && (amVar instanceof j) && !an.a(this.f235a.aB, (j) amVar)) {
            return null;
        }
        return this.f235a.az;
    }

    @Override // com.corrodinggames.rts.game.units.a.s
    public int J() {
        return this.f235a.aA;
    }

    @Override // com.corrodinggames.rts.game.units.a.s
    public am i(am amVar) {
        if (this.f235a.aC != null) {
            return this.f235a.aC.getUnitOrSharedUnit(amVar);
        }
        return null;
    }

    @Override // com.corrodinggames.rts.game.units.a.s
    public boolean s(am amVar) {
        return this.f235a.aD;
    }

    @Override // com.corrodinggames.rts.game.units.a.s
    public boolean t(am amVar) {
        return this.f235a.aE;
    }

    @Override // com.corrodinggames.rts.game.units.a.s
    public boolean a(am amVar) {
        if (this.f235a.aF != null) {
            return an.a(this.f235a.aF, (j) amVar);
        }
        return false;
    }

    @Override // com.corrodinggames.rts.game.units.a.s
    public boolean Q() {
        return this.f235a.o;
    }

    @Override // com.corrodinggames.rts.game.units.a.s
    public void a(y yVar) {
        if (this.f235a.ae != null) {
            an.b(yVar, this.f235a.ae);
        }
    }
}