package com.corrodinggames.rts.game.units.p024d;

import com.corrodinggames.rts.C0067R;
import com.corrodinggames.rts.game.PlayerData;
import com.corrodinggames.rts.game.units.AbstractC0244am;
import com.corrodinggames.rts.game.units.EnumC0233ab;
import com.corrodinggames.rts.game.units.EnumC0249ar;
import com.corrodinggames.rts.game.units.p013a.AbstractC0224s;
import com.corrodinggames.rts.game.units.p013a.C0208c;
import com.corrodinggames.rts.game.units.p013a.C0217l;
import com.corrodinggames.rts.game.units.p013a.C0220o;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.unitAction.C0970e;
import java.util.ArrayList;

/* renamed from: com.corrodinggames.rts.game.units.d.t */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/d/t.class */
public class C0517t extends AbstractC0503i {

    /* renamed from: a */
    static C0970e f3584a = null;

    /* renamed from: b */
    static C0970e f3585b = null;

    /* renamed from: c */
    static C0970e f3586c = null;

    /* renamed from: d */
    static C0970e[] f3587d = new C0970e[10];

    /* renamed from: e */
    static C0970e[] f3588e = new C0970e[10];

    /* renamed from: f */
    static C0970e f3589f = null;

    /* renamed from: g */
    static final C0208c f3590g = C0208c.m4336a(String.valueOf(110));

    /* renamed from: b */
    public static void m3301b() {
        GameEngine gameEngine = GameEngine.getGameEngine();
        f3584a = gameEngine.f6326bO.mo222a(C0067R.drawable.sea_factory);
        f3585b = gameEngine.f6326bO.mo222a(C0067R.drawable.sea_factory_t2);
        f3589f = gameEngine.f6326bO.mo222a(C0067R.drawable.sea_factory_dead);
        f3587d = PlayerData.m4432a(f3584a);
        f3588e = PlayerData.m4432a(f3585b);
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: K */
    public EnumC0249ar mo5458r() {
        return EnumC0249ar.seaFactory;
    }

    @Override // com.corrodinggames.rts.game.units.p024d.AbstractC0493d
    /* renamed from: L */
    public boolean mo3296L() {
        this.f3456m = null;
        this.f3917M = f3589f;
        m448S(0);
        this.f1610bT = false;
        m3014a(EnumC0233ab.large);
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: d */
    public C0970e mo2879d() {
        if (this.f1612bV) {
            return f3589f;
        }
        if (this.f1614bX == null) {
            return f3587d[f3587d.length - 1];
        }
        if (this.f3461r == 1) {
            return f3587d[this.f1614bX.m4454R()];
        }
        return f3588e[this.f1614bX.m4454R()];
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: k */
    public C0970e mo2853k() {
        return null;
    }

    public C0517t(boolean z) {
        super(z);
        this.f3917M = f3584a;
        m2724b(f3584a);
        this.f1626cj = 45.0f;
        this.f1627ck = this.f1626cj;
        this.f1638cv = 1000.0f;
        this.f1637cu = this.f1638cv;
        m448S(2);
        this.f3457n.m5172a(-1, -1, 1, 2);
        this.f3458o.m5172a(-2, -1, 2, 4);
    }

    @Override // com.corrodinggames.rts.game.units.p024d.AbstractC0503i, com.corrodinggames.rts.game.units.p024d.InterfaceC0506l
    /* renamed from: a */
    public void mo3294a(C0504j c0504j) {
        if (c0504j.f3525j.equals(f3590g)) {
            PlayerData.m4417b((AbstractC0244am) this);
            mo3021a(2);
            PlayerData.m4401c(this);
            m3037W();
            return;
        }
        super.mo3294a(c0504j);
    }

    @Override // com.corrodinggames.rts.game.units.p024d.AbstractC0503i
    /* renamed from: dv */
    public int mo3299dv() {
        return -20;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y, com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: V */
    public int mo3038V() {
        return this.f3461r;
    }

    @Override // com.corrodinggames.rts.game.units.p024d.AbstractC0493d, com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: a */
    public void mo3021a(int i) {
        if (i == 1) {
            this.f3461r = 1;
        } else if (i == 2 && this.f3461r == 1) {
            this.f3461r = 2;
        }
        mo3041S();
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: cm */
    public C0208c mo3292cm() {
        if (this.f3461r == 1) {
            return f3590g;
        }
        return AbstractC0224s.f1466i;
    }

    /* renamed from: a */
    public static void m3302a(ArrayList arrayList, int i) {
        arrayList.add(new C0220o());
        arrayList.add(new C0518u());
        arrayList.add(new C0217l(EnumC0249ar.builderShip, 1.0f));
        arrayList.add(new C0217l(EnumC0249ar.gunBoat, 2.0f));
        arrayList.add(new C0217l(EnumC0249ar.missileShip, 3.0f));
        arrayList.add(new C0217l(EnumC0249ar.hovercraft, 4.0f));
        arrayList.add(new C0217l(EnumC0249ar.battleShip, 5.0f));
        arrayList.add(new C0217l(EnumC0249ar.attackSubmarine, 6.0f));
        if (i > 1) {
        }
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: N */
    public ArrayList mo3131N() {
        return mo5458r().mo3563a(mo3038V());
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: bJ */
    public boolean mo3300bJ() {
        return true;
    }
}