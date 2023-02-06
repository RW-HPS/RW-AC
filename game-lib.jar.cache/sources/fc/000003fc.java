package com.corrodinggames.rts.game.units;

import com.corrodinggames.rts.game.PlayerData;
import com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.Interface.InterfaceEngine;
import java.util.Iterator;

/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/k.class */
class k extends com.corrodinggames.rts.game.units.a.x {
    boolean a;
    boolean b;

    public k(boolean z, boolean z2) {
        super("changeTeam" + z + "d:" + z2);
        this.a = z;
        this.b = z2;
    }

    @Override // com.corrodinggames.rts.game.units.a.s
    public String b() {
        if (this.b) {
            return "Selected player";
        }
        if (this.a) {
            return "<- Set player";
        }
        return "Set player ->";
    }

    @Override // com.corrodinggames.rts.game.units.a.s
    public String d() {
        if (!this.b) {
            if (this.a) {
                return "<-";
            }
            return "->";
        }
        GameEngine gameEngine = GameEngine.getGameEngine();
        PlayerData playerData = null;
        Iterator it = gameEngine.bS.bZ.iterator();
        while (it.hasNext()) {
            am amVar = (am) it.next();
            if (amVar instanceof y) {
                y yVar = (y) amVar;
                if (yVar.cG && gameEngine.bS.m(yVar)) {
                    playerData = yVar.bX;
                }
            }
        }
        String str = VariableScope.nullOrMissingString;
        if (playerData != null) {
            str = str + "Team - " + (playerData.site + 1) + VariableScope.nullOrMissingString;
        }
        return str;
    }

    @Override // com.corrodinggames.rts.game.units.a.s
    public String a() {
        return "Change targeted player for editor";
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