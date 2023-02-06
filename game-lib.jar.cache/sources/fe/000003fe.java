package com.corrodinggames.rts.game.units;

import com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.Interface.InterfaceEngine;

/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/m.class */
class m extends com.corrodinggames.rts.game.units.a.x {
    boolean a;
    boolean b;

    public m(boolean z, boolean z2) {
        super("changeUnitTab" + z + "d:" + z2);
        this.a = z;
        this.b = z2;
    }

    @Override // com.corrodinggames.rts.game.units.a.s
    public String b() {
        return d();
    }

    @Override // com.corrodinggames.rts.game.units.a.s
    public String d() {
        h L = h.L();
        if (L == null) {
            return "<NULL>";
        }
        if (this.b) {
            return L.G.a();
        }
        String str = VariableScope.nullOrMissingString;
        if (this.a) {
            str = str + "<- ";
        }
        if (!this.a) {
            str = str + " ->";
        }
        return str;
    }

    public void n() {
        h L = h.L();
        if (L == null) {
            GameEngine.print("Editor not active");
        } else if (this.b) {
        } else {
            L.G = L.G.a(this.a);
        }
    }

    @Override // com.corrodinggames.rts.game.units.a.s
    public String a() {
        return "Change unit tab in editor";
    }

    @Override // com.corrodinggames.rts.game.units.a.s
    public float l() {
        if (!InterfaceEngine.bP) {
            return 0.8f;
        }
        return 0.5f;
    }

    @Override // com.corrodinggames.rts.game.units.a.s
    public int m() {
        if (this.b) {
            return 2;
        }
        return 4;
    }

    @Override // com.corrodinggames.rts.game.units.a.x, com.corrodinggames.rts.game.units.a.s
    public com.corrodinggames.rts.game.units.a.t f() {
        if (this.b) {
            return com.corrodinggames.rts.game.units.a.t.infoOnly;
        }
        return super.f();
    }

    @Override // com.corrodinggames.rts.game.units.a.x, com.corrodinggames.rts.game.units.a.s
    public com.corrodinggames.rts.game.units.a.u e() {
        if (this.b) {
            return com.corrodinggames.rts.game.units.a.u.infoOnly;
        }
        return super.e();
    }
}