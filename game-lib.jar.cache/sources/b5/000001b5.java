package com.corrodinggames.rts.game.units.a;

import com.corrodinggames.rts.game.units.am;
import com.corrodinggames.rts.game.units.as;
import com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope;
import com.corrodinggames.rts.gameFramework.GameEngine;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/a/z.class */
public class z extends s {

    /* renamed from: a  reason: collision with root package name */
    as f188a;
    ArrayList b;
    int c;
    boolean d;
    com.corrodinggames.rts.game.units.y e;
    int f;

    public z(as asVar) {
        super("s_" + asVar.v());
        this.b = new ArrayList();
        this.c = 0;
        this.e = null;
        this.g = -9999.0f;
        this.f188a = asVar;
    }

    @Override // com.corrodinggames.rts.game.units.a.s
    public int b(am amVar, boolean z) {
        return -1;
    }

    @Override // com.corrodinggames.rts.game.units.a.s
    public int c() {
        return 0;
    }

    @Override // com.corrodinggames.rts.game.units.a.s
    public as i() {
        return this.f188a;
    }

    @Override // com.corrodinggames.rts.game.units.a.s
    public u e() {
        return u.infoOnly;
    }

    @Override // com.corrodinggames.rts.game.units.a.s
    public t f() {
        if (GameEngine.at() && !com.corrodinggames.rts.gameFramework.f.g.bO) {
            return t.infoOnlyNoBox;
        }
        return t.infoOnly;
    }

    @Override // com.corrodinggames.rts.game.units.a.s
    public boolean g() {
        return false;
    }

    @Override // com.corrodinggames.rts.game.units.a.s
    public boolean c(am amVar, boolean z) {
        GameEngine gameEngine = GameEngine.getGameEngine();
        if (!z) {
            if (gameEngine.bS.q() == 1) {
                return false;
            }
            boolean z2 = false;
            Iterator it = am.bE.iterator();
            while (it.hasNext()) {
                am amVar2 = (am) it.next();
                if (amVar2.cG && amVar2.r() != this.f188a) {
                    gameEngine.bS.l(amVar2);
                    z2 = true;
                }
            }
            if (!z2) {
                return false;
            }
            return true;
        }
        Iterator it2 = am.bE.iterator();
        while (it2.hasNext()) {
            am amVar3 = (am) it2.next();
            if (amVar3.cG && amVar3.r() == this.f188a) {
                gameEngine.bS.l(amVar3);
            }
        }
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.a.s
    public String d() {
        GameEngine.getGameEngine();
        if (this.e instanceof com.corrodinggames.rts.game.units.h) {
            return "Editor";
        }
        return VariableScope.nullOrMissingString + this.f188a.e() + " x" + this.c;
    }

    @Override // com.corrodinggames.rts.game.units.a.s
    public String b() {
        return "UnitInfo";
    }

    @Override // com.corrodinggames.rts.game.units.a.s
    public String w(am amVar) {
        if (this.e instanceof com.corrodinggames.rts.game.units.h) {
            return "Editor";
        }
        return this.f188a.e();
    }

    @Override // com.corrodinggames.rts.game.units.a.s
    public boolean h_() {
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.a.s
    public boolean s() {
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.a.s
    public boolean u() {
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.a.s
    public boolean C() {
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.a.s
    public String a() {
        String str = VariableScope.nullOrMissingString;
        if (this.e instanceof com.corrodinggames.rts.game.units.h) {
            return VariableScope.nullOrMissingString;
        }
        if (this.d) {
            str = "(Left click to exclusively select / Right click to unselect)\n";
        }
        return str + this.f188a.f();
    }

    public void K() {
        GameEngine gameEngine = GameEngine.getGameEngine();
        if (this.f == gameEngine.bS.Y) {
            return;
        }
        this.f = gameEngine.bS.Y;
        this.c = 0;
        this.d = false;
        this.e = null;
        am[] a2 = gameEngine.bS.bZ.a();
        int size = gameEngine.bS.bZ.size();
        for (int i = 0; i < size; i++) {
            am amVar = a2[i];
            if (amVar instanceof com.corrodinggames.rts.game.units.y) {
                com.corrodinggames.rts.game.units.y yVar = (com.corrodinggames.rts.game.units.y) amVar;
                if (yVar.cG) {
                    if (yVar.r() == this.f188a) {
                        this.c++;
                        if (this.e == null) {
                            this.e = yVar;
                        }
                    } else {
                        this.d = true;
                    }
                }
            }
        }
    }

    @Override // com.corrodinggames.rts.game.units.a.s
    public float m_() {
        return this.g - this.c;
    }

    @Override // com.corrodinggames.rts.game.units.a.s
    public boolean G() {
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.a.s
    public boolean o_() {
        return true;
    }
}