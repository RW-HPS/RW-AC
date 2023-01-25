package com.corrodinggames.rts.game.units.p013a;

import com.corrodinggames.rts.game.units.AbstractC0244am;
import com.corrodinggames.rts.gameFramework.C0645ad;
import com.corrodinggames.rts.gameFramework.GameEngine;

/* renamed from: com.corrodinggames.rts.game.units.a.q */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/a/q.class */
public class C0222q extends AbstractC0221p {
    public C0222q() {
        super("c__cut_chat");
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
    /* renamed from: b */
    public String mo3096b() {
        return "Team Chat";
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
    /* renamed from: a */
    public String mo3099a() {
        return "Send a team chat message to your allies";
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
    /* renamed from: c */
    public boolean mo3152c(AbstractC0244am abstractC0244am, boolean z) {
        GameEngine.getGameEngine().f6378bS.f5268g.m2053n();
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
    /* renamed from: M */
    public C0645ad mo4310M() {
        return GameEngine.getGameEngine().f6379bT.f4134u;
    }
}