package com.corrodinggames.rts.game.units.p013a;

import com.corrodinggames.rts.game.units.AbstractC0244am;
import com.corrodinggames.rts.gameFramework.C0645ad;
import com.corrodinggames.rts.gameFramework.GameEngine;

/* renamed from: com.corrodinggames.rts.game.units.a.r */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/a/r.class */
public class C0223r extends AbstractC0221p {
    public C0223r() {
        super("c__cut_ping");
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
    /* renamed from: b */
    public String mo3096b() {
        return "Map Ping";
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
    /* renamed from: a */
    public String mo3099a() {
        return "Send a map ping to your allies";
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
    /* renamed from: c */
    public boolean mo3152c(AbstractC0244am abstractC0244am, boolean z) {
        GameEngine.getGameEngine().f6378bS.m1905I();
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
    /* renamed from: M */
    public C0645ad mo4310M() {
        return GameEngine.getGameEngine().f6379bT.f4135v;
    }
}