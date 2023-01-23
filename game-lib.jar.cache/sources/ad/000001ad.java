package com.corrodinggames.rts.game.units.a;

import com.corrodinggames.rts.game.units.am;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.ad;

/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/a/r.class */
public class r extends p {
    public r() {
        super("c__cut_ping");
    }

    @Override // com.corrodinggames.rts.game.units.a.s
    public String b() {
        return "Map Ping";
    }

    @Override // com.corrodinggames.rts.game.units.a.s
    public String a() {
        return "Send a map ping to your allies";
    }

    @Override // com.corrodinggames.rts.game.units.a.s
    public boolean c(am amVar, boolean z) {
        GameEngine.getGameEngine().bS.I();
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.a.s
    public ad M() {
        return GameEngine.getGameEngine().bT.v;
    }
}