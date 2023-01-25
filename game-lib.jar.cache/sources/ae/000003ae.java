package com.corrodinggames.rts.game.units.p024d;

import com.corrodinggames.rts.C0067R;
import com.corrodinggames.rts.game.PlayerData;
import com.corrodinggames.rts.game.units.EnumC0249ar;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.unitAction.C0970e;

/* renamed from: com.corrodinggames.rts.game.units.d.w */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/d/w.class */
public class C0521w extends AbstractC0503i {

    /* renamed from: a */
    static C0970e f3602a = null;

    /* renamed from: b */
    static C0970e[] f3603b = new C0970e[10];

    /* renamed from: c */
    static C0970e f3604c = null;

    /* renamed from: b */
    public static void m3288b() {
        GameEngine gameEngine = GameEngine.getGameEngine();
        f3602a = gameEngine.f6326bO.mo222a(C0067R.drawable.wall_v);
        f3604c = gameEngine.f6326bO.mo222a(C0067R.drawable.wall_v);
        f3603b = PlayerData.m4432a(f3602a);
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: d */
    public C0970e mo2879d() {
        if (this.f1612bV) {
            return f3604c;
        }
        if (this.f1614bX == null) {
            return f3603b[f3603b.length - 1];
        }
        return f3603b[this.f1614bX.m4454R()];
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: k */
    public C0970e mo2853k() {
        return null;
    }

    @Override // com.corrodinggames.rts.game.units.p024d.AbstractC0493d, com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: a */
    public void mo3021a(int i) {
    }

    public C0521w(boolean z) {
        super(z);
        m2724b(f3602a);
        this.f1626cj = 15.0f;
        this.f1627ck = this.f1626cj;
        this.f1638cv = 700.0f;
        this.f1637cu = this.f1638cv;
        this.f3917M = f3602a;
        this.f3457n.m5172a(0, 0, 1, 0);
        this.f3458o.m5172a(0, 0, 1, 0);
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: K */
    public EnumC0249ar mo5458r() {
        return EnumC0249ar.wall_v;
    }
}