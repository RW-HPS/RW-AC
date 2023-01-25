package com.corrodinggames.rts.gameFramework.p037f;

import com.corrodinggames.rts.game.PlayerData;
import com.corrodinggames.rts.game.units.AbstractC0628x;
import com.corrodinggames.rts.game.units.EnumC0249ar;
import com.corrodinggames.rts.game.units.custom.p021e.C0444f;
import com.corrodinggames.rts.gameFramework.GameEngine;

/* renamed from: com.corrodinggames.rts.gameFramework.f.x */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/f/x.class */
public class C0843x extends AbstractC0628x {

    /* renamed from: a */
    C0444f f5559a;

    @Override // com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: b */
    public EnumC0249ar mo5458r() {
        return EnumC0249ar.fogRevealer;
    }

    public C0843x() {
        super(true);
        this.f5559a = new C0444f();
        this.f1614bX = PlayerData.f1373i;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0628x, com.corrodinggames.rts.game.units.AbstractC0629y, com.corrodinggames.rts.game.units.AbstractC0244am, com.corrodinggames.rts.gameFramework.AbstractC1155w
    /* renamed from: a */
    public void mo446a(float f) {
        super.mo446a(f);
        GameEngine.m1066a("PlaceholderUnit was updated");
        m4210ci();
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: t */
    public boolean mo1746t() {
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0628x, com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: u */
    public boolean mo1745u() {
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: df */
    public C0444f mo1748df() {
        return this.f5559a;
    }

    /* renamed from: a */
    public void m1750a(C0444f c0444f) {
        this.f5559a = c0444f;
    }
}