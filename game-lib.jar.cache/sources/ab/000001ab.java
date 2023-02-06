package com.corrodinggames.rts.game.units.a;

import com.corrodinggames.rts.game.units.am;
import com.corrodinggames.rts.game.units.as;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.Interface.InterfaceEngine;
import java.util.Iterator;

/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/a/p.class */
public abstract class p extends s {
    public p(String str) {
        super("c__cut_" + str);
        this.g = 0.0f;
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
        com.corrodinggames.rts.game.units.y yVar = null;
        Iterator it = com.corrodinggames.rts.gameFramework.w.er.iterator();
        while (it.hasNext()) {
            com.corrodinggames.rts.gameFramework.w wVar = (com.corrodinggames.rts.gameFramework.w) it.next();
            if (wVar instanceof com.corrodinggames.rts.game.units.y) {
                com.corrodinggames.rts.game.units.y yVar2 = (com.corrodinggames.rts.game.units.y) wVar;
                if (yVar2.cG) {
                    yVar = yVar2;
                }
            }
        }
        return yVar;
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
        return b();
    }

    @Override // com.corrodinggames.rts.game.units.a.s
    public boolean h_() {
        return false;
    }

    @Override // com.corrodinggames.rts.game.units.a.s
    public boolean s() {
        if (!L()) {
            return true;
        }
        return false;
    }

    @Override // com.corrodinggames.rts.game.units.a.s
    public boolean G() {
        return false;
    }

    @Override // com.corrodinggames.rts.game.units.a.s
    public float l() {
        if (!InterfaceEngine.bP) {
            return 1.0f;
        }
        return 1.0f;
    }
}