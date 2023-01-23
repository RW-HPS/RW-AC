package com.corrodinggames.rts.game.units.a;

import com.corrodinggames.rts.game.units.am;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.ad;

/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/a/q.class */
public class q extends p {
    public q() {
        super("c__cut_chat");
    }

    @Override // com.corrodinggames.rts.game.units.a.s
    public String b() {
        return "Team Chat";
    }

    @Override // com.corrodinggames.rts.game.units.a.s
    public String a() {
        return "Send a team chat message to your allies";
    }

    @Override // com.corrodinggames.rts.game.units.a.s
    public boolean c(am amVar, boolean z) {
        GameEngine.getGameEngine().bS.g.n();
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.a.s
    public ad M() {
        return GameEngine.getGameEngine().bT.u;
    }
}