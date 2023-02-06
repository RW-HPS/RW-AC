package com.corrodinggames.rts.game.units.a;

import com.corrodinggames.rts.game.units.am;
import com.corrodinggames.rts.game.units.as;
import com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.net.Unknown_GameOutBlockStream;
import java.io.IOException;

/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/a/y.class */
public class y extends s {
    public boolean a;

    public y(boolean z) {
        super("c_5");
        this.g = -9990.0f;
        this.a = z;
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
    /* renamed from: i */
    public as mo3i() {
        return null;
    }

    @Override // com.corrodinggames.rts.game.units.a.s
    public u e() {
        return u.infoOnly;
    }

    @Override // com.corrodinggames.rts.game.units.a.s
    public t f() {
        return t.infoOnly;
    }

    @Override // com.corrodinggames.rts.game.units.a.s
    public boolean g() {
        return false;
    }

    public com.corrodinggames.rts.game.units.y K() {
        GameEngine gameEngine = GameEngine.getGameEngine();
        am[] a = gameEngine.bS.bZ.a();
        int size = gameEngine.bS.bZ.size();
        for (int i = 0; i < size; i++) {
            am amVar = a[i];
            if (amVar instanceof com.corrodinggames.rts.game.units.y) {
                com.corrodinggames.rts.game.units.y yVar = (com.corrodinggames.rts.game.units.y) amVar;
                if (yVar.cG) {
                    return yVar;
                }
            }
        }
        return null;
    }

    public boolean L() {
        GameEngine gameEngine = GameEngine.getGameEngine();
        com.corrodinggames.rts.game.units.y K = K();
        if (K != null) {
            return (K instanceof com.corrodinggames.rts.game.units.h) || gameEngine.playerTeam == K.bX;
        }
        return false;
    }

    @Override // com.corrodinggames.rts.game.units.a.s
    public String d() {
        String str = "UnitInfo";
        GameEngine gameEngine = GameEngine.getGameEngine();
        com.corrodinggames.rts.game.units.y K = K();
        if (K != null) {
            if (K instanceof com.corrodinggames.rts.game.units.h) {
                return "Editor";
            }
            if (!this.a) {
                str = gameEngine.bS.g.a((am) K, false);
            } else {
                str = gameEngine.bS.g.a(K.bX);
            }
        }
        return str;
    }

    @Override // com.corrodinggames.rts.game.units.a.s
    public boolean h_() {
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.a.s
    public String b() {
        return "UnitInfo";
    }

    @Override // com.corrodinggames.rts.game.units.a.s
    public String d(am amVar) {
        if (this.a) {
            return VariableScope.nullOrMissingString;
        }
        if (amVar != null) {
            return amVar.mo1r().e();
        }
        return "UnitInfo";
    }

    @Override // com.corrodinggames.rts.game.units.a.s
    public boolean s() {
        if (!this.a || !L()) {
            return true;
        }
        return false;
    }

    @Override // com.corrodinggames.rts.game.units.a.s
    public boolean u() {
        if (this.a) {
            return false;
        }
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.a.s
    public boolean C() {
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.a.s
    public String a() {
        Unknown_GameOutBlockStream unknown_GameOutBlockStream;
        if (this.a) {
            return VariableScope.nullOrMissingString;
        }
        com.corrodinggames.rts.game.units.y K = K();
        if (K != null) {
            String a = com.corrodinggames.rts.gameFramework.Interface.a.a(K, false, true, false);
            if (0 != 0) {
                try {
                    K.a(new Unknown_GameOutBlockStream());
                } catch (IOException e) {
                    e.printStackTrace();
                }
                a = a + "\n" + unknown_GameOutBlockStream.a;
            }
            return a;
        }
        return VariableScope.nullOrMissingString;
    }

    @Override // com.corrodinggames.rts.game.units.a.s
    public boolean G() {
        return true;
    }
}