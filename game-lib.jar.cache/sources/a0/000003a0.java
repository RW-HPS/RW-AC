package com.corrodinggames.rts.game.units.p024d;

import com.corrodinggames.rts.C0067R;
import com.corrodinggames.rts.game.PlayerData;
import com.corrodinggames.rts.game.units.AbstractC0244am;
import com.corrodinggames.rts.game.units.EnumC0249ar;
import com.corrodinggames.rts.game.units.p013a.AbstractC0224s;
import com.corrodinggames.rts.game.units.p013a.C0208c;
import com.corrodinggames.rts.game.units.p013a.C0217l;
import com.corrodinggames.rts.game.units.p013a.C0220o;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.net.GameInputStream;
import com.corrodinggames.rts.gameFramework.net.GameOutputStream;
import com.corrodinggames.rts.gameFramework.p030a.C0637e;
import com.corrodinggames.rts.gameFramework.unitAction.C0970e;
import java.util.ArrayList;

/* renamed from: com.corrodinggames.rts.game.units.d.m */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/d/m.class */
public class C0507m extends AbstractC0503i {

    /* renamed from: g */
    boolean f3542g;

    /* renamed from: a */
    static C0970e f3536a = null;

    /* renamed from: b */
    static C0970e f3537b = null;

    /* renamed from: c */
    static C0970e f3538c = null;

    /* renamed from: d */
    static C0970e[] f3539d = new C0970e[10];

    /* renamed from: e */
    static C0970e[] f3540e = new C0970e[10];

    /* renamed from: f */
    static C0970e f3541f = null;

    /* renamed from: h */
    static final C0208c f3543h = C0208c.m4336a(String.valueOf(110));

    @Override // com.corrodinggames.rts.game.units.p024d.AbstractC0503i, com.corrodinggames.rts.game.units.p024d.AbstractC0493d, com.corrodinggames.rts.game.units.AbstractC0629y, com.corrodinggames.rts.game.units.AbstractC0244am, com.corrodinggames.rts.gameFramework.AbstractC0674az, com.corrodinggames.rts.gameFramework.AbstractC1155w, com.corrodinggames.rts.gameFramework.AbstractC0741bq
    /* renamed from: a */
    public void mo442a(GameOutputStream gameOutputStream) {
        gameOutputStream.writeBoolean(this.f3542g);
        gameOutputStream.writeByte(0);
        super.mo442a(gameOutputStream);
    }

    @Override // com.corrodinggames.rts.game.units.p024d.AbstractC0503i, com.corrodinggames.rts.game.units.p024d.AbstractC0493d, com.corrodinggames.rts.game.units.AbstractC0629y, com.corrodinggames.rts.game.units.AbstractC0244am, com.corrodinggames.rts.gameFramework.AbstractC0674az, com.corrodinggames.rts.gameFramework.AbstractC1155w
    /* renamed from: a */
    public void mo441a(GameInputStream gameInputStream) {
        if (gameInputStream.readBoolean()) {
            mo3021a(2);
        }
        gameInputStream.readByte();
        super.mo441a(gameInputStream);
    }

    /* renamed from: b */
    public static void m3325b() {
        GameEngine gameEngine = GameEngine.getGameEngine();
        f3536a = gameEngine.f6326bO.mo222a(C0067R.drawable.land_factory_front);
        f3537b = gameEngine.f6326bO.mo222a(C0067R.drawable.land_factory_front_t2);
        f3538c = gameEngine.f6326bO.mo222a(C0067R.drawable.land_factory_back);
        f3541f = gameEngine.f6326bO.mo222a(C0067R.drawable.land_factory_dead);
        f3539d = PlayerData.m4432a(f3536a);
        f3540e = PlayerData.m4432a(f3537b);
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: K */
    public EnumC0249ar mo5458r() {
        return EnumC0249ar.landFactory;
    }

    @Override // com.corrodinggames.rts.game.units.p024d.AbstractC0493d
    /* renamed from: L */
    public boolean mo3296L() {
        GameEngine gameEngine = GameEngine.getGameEngine();
        gameEngine.f6329bR.m2391a(this.f7172eo, this.f7173ep, this.f7174eq);
        this.f3456m = null;
        this.f3917M = f3541f;
        m448S(0);
        this.f1610bT = false;
        gameEngine.f6324bM.m2812a(C0637e.f4082p, 0.8f, this.f7172eo, this.f7173ep);
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: S */
    public void mo3041S() {
        super.mo3041S();
        if (this.f1612bV) {
            this.f3456m = null;
        } else {
            this.f3456m = f3538c;
        }
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: d */
    public C0970e mo2879d() {
        if (this.f1612bV) {
            return f3541f;
        }
        if (this.f1614bX == null) {
            return f3539d[f3539d.length - 1];
        }
        if (!this.f3542g) {
            return f3539d[this.f1614bX.m4454R()];
        }
        return f3540e[this.f1614bX.m4454R()];
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: k */
    public C0970e mo2853k() {
        return null;
    }

    public C0507m(boolean z) {
        super(z);
        this.f3917M = f3536a;
        this.f3456m = f3538c;
        m2724b(this.f3917M);
        this.f1626cj = 30.0f;
        this.f1627ck = this.f1626cj;
        this.f1638cv = 1200.0f;
        this.f1637cu = this.f1638cv;
        m448S(3);
        this.f3457n.m5172a(-1, -1, 1, 1);
        this.f3458o.m5172a(-1, -1, 1, 3);
    }

    @Override // com.corrodinggames.rts.game.units.p024d.AbstractC0503i, com.corrodinggames.rts.game.units.p024d.InterfaceC0506l
    /* renamed from: a */
    public void mo3294a(C0504j c0504j) {
        if (f3543h.m4339a(c0504j.f3525j)) {
            PlayerData.m4417b((AbstractC0244am) this);
            mo3021a(2);
            PlayerData.m4401c(this);
            m3037W();
            return;
        }
        super.mo3294a(c0504j);
    }

    @Override // com.corrodinggames.rts.game.units.p024d.AbstractC0493d, com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: a */
    public void mo3021a(int i) {
        if (i == 1) {
            this.f3542g = false;
        } else if (i == 2 && !this.f3542g) {
            this.f3542g = true;
        }
        mo3041S();
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: cm */
    public C0208c mo3292cm() {
        if (!this.f3542g) {
            return f3543h;
        }
        return AbstractC0224s.f1466i;
    }

    /* renamed from: a */
    public static void m3326a(ArrayList arrayList, int i) {
        arrayList.add(new C0220o());
        if (i == 1) {
            arrayList.add(new C0508n());
        }
        arrayList.add(new C0217l(EnumC0249ar.builder, 1.0f));
        arrayList.add(new C0217l(EnumC0249ar.tank, 2.0f));
        arrayList.add(new C0217l(EnumC0249ar.hoverTank, 3.0f));
        arrayList.add(new C0217l(EnumC0249ar.artillery, 4.0f));
        if (i >= 2) {
            arrayList.add(new C0217l(EnumC0249ar.hovercraft, 5.0f));
            arrayList.add(new C0217l(EnumC0249ar.heavyTank, 6.0f));
            arrayList.add(new C0217l(EnumC0249ar.heavyHoverTank, 7.0f));
            arrayList.add(new C0217l(EnumC0249ar.laserTank, 8.0f));
        }
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: N */
    public ArrayList mo3131N() {
        return mo5458r().mo3563a(mo3038V());
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y, com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: V */
    public int mo3038V() {
        if (this.f3542g) {
            return 2;
        }
        return 1;
    }

    @Override // com.corrodinggames.rts.game.units.p024d.AbstractC0503i
    /* renamed from: du */
    public C0505k mo3324du() {
        return new C0509o(this);
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: bJ */
    public boolean mo3300bJ() {
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: db */
    public float mo3317db() {
        return super.mo3317db() - 8.0f;
    }
}