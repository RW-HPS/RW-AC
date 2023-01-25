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
import com.corrodinggames.rts.gameFramework.C0773f;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.net.GameInputStream;
import com.corrodinggames.rts.gameFramework.net.GameOutputStream;
import com.corrodinggames.rts.gameFramework.unitAction.C0970e;
import java.util.ArrayList;

/* renamed from: com.corrodinggames.rts.game.units.d.a */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/d/a.class */
public class C0475a extends AbstractC0503i {

    /* renamed from: f */
    int f3398f;

    /* renamed from: g */
    float f3399g;

    /* renamed from: a */
    static C0970e f3393a = null;

    /* renamed from: b */
    static C0970e f3394b = null;

    /* renamed from: c */
    static C0970e[] f3395c = new C0970e[10];

    /* renamed from: d */
    static C0970e[] f3396d = new C0970e[10];

    /* renamed from: e */
    static C0970e f3397e = null;

    /* renamed from: h */
    static final C0208c f3400h = C0208c.m4336a(String.valueOf(110));

    @Override // com.corrodinggames.rts.game.units.p024d.AbstractC0503i, com.corrodinggames.rts.game.units.p024d.AbstractC0493d, com.corrodinggames.rts.game.units.AbstractC0629y, com.corrodinggames.rts.game.units.AbstractC0244am, com.corrodinggames.rts.gameFramework.AbstractC0674az, com.corrodinggames.rts.gameFramework.AbstractC1155w, com.corrodinggames.rts.gameFramework.AbstractC0741bq
    /* renamed from: a */
    public void mo442a(GameOutputStream gameOutputStream) {
        gameOutputStream.writeInt(this.f3398f);
        super.mo442a(gameOutputStream);
    }

    @Override // com.corrodinggames.rts.game.units.p024d.AbstractC0503i, com.corrodinggames.rts.game.units.p024d.AbstractC0493d, com.corrodinggames.rts.game.units.AbstractC0629y, com.corrodinggames.rts.game.units.AbstractC0244am, com.corrodinggames.rts.gameFramework.AbstractC0674az, com.corrodinggames.rts.gameFramework.AbstractC1155w
    /* renamed from: a */
    public void mo441a(GameInputStream gameInputStream) {
        if (gameInputStream.m1311b() >= 17) {
            mo3021a(gameInputStream.readInt());
        }
        super.mo441a(gameInputStream);
    }

    /* renamed from: b */
    public static void m3459b() {
        GameEngine gameEngine = GameEngine.getGameEngine();
        f3393a = gameEngine.f6326bO.mo222a(C0067R.drawable.air_factory);
        f3394b = gameEngine.f6326bO.mo222a(C0067R.drawable.air_factory_t2);
        f3397e = gameEngine.f6326bO.mo222a(C0067R.drawable.air_factory_dead);
        f3395c = PlayerData.m4432a(f3393a);
        f3396d = PlayerData.m4432a(f3394b);
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: K */
    public EnumC0249ar mo5458r() {
        return EnumC0249ar.airFactory;
    }

    @Override // com.corrodinggames.rts.game.units.p024d.AbstractC0493d
    /* renamed from: L */
    public boolean mo3296L() {
        this.f3917M = f3397e;
        m448S(0);
        this.f1610bT = false;
        m3014a(EnumC0233ab.large);
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: d */
    public C0970e mo2879d() {
        if (this.f1612bV) {
            return f3397e;
        }
        if (this.f1614bX == null) {
            return f3395c[f3395c.length - 1];
        }
        if (this.f3398f == 1) {
            return f3395c[this.f1614bX.m4454R()];
        }
        return f3396d[this.f1614bX.m4454R()];
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: k */
    public C0970e mo2853k() {
        return null;
    }

    public C0475a(boolean z) {
        super(z);
        this.f3398f = 1;
        this.f3399g = 0.0f;
        this.f3917M = f3393a;
        m2729T(40);
        m2728U(61);
        this.f1626cj = 30.0f;
        this.f1627ck = this.f1626cj;
        this.f1638cv = 1000.0f;
        this.f1637cu = this.f1638cv;
        this.f3457n.m5172a(-1, -1, 1, 1);
        this.f3458o.m5172a(-1, -1, 1, 2);
    }

    @Override // com.corrodinggames.rts.game.units.p024d.AbstractC0503i, com.corrodinggames.rts.game.units.AbstractC0629y, com.corrodinggames.rts.game.units.AbstractC0244am, com.corrodinggames.rts.gameFramework.AbstractC1155w
    /* renamed from: a */
    public void mo446a(float f) {
        super.mo446a(f);
        if (!m4226bT() || this.f1612bV) {
            return;
        }
        this.f3399g = C0773f.m2218a(this.f3399g, f);
        if (this.f3399g == 0.0f) {
            this.f3399g = 27.0f;
            this.f3462s++;
            if (this.f3462s > 4) {
                this.f3462s = 0;
            }
        }
    }

    @Override // com.corrodinggames.rts.game.units.p024d.AbstractC0503i, com.corrodinggames.rts.game.units.p024d.InterfaceC0506l
    /* renamed from: a */
    public void mo3294a(C0504j c0504j) {
        if (c0504j.f3525j.equals(f3400h)) {
            PlayerData.m4417b((AbstractC0244am) this);
            mo3021a(2);
            PlayerData.m4401c(this);
            m3037W();
            return;
        }
        super.mo3294a(c0504j);
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y, com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: V */
    public int mo3038V() {
        return this.f3398f;
    }

    @Override // com.corrodinggames.rts.game.units.p024d.AbstractC0493d, com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: a */
    public void mo3021a(int i) {
        if (i == 1) {
            this.f3398f = 1;
        } else if (i == 2 && this.f3398f == 1) {
            this.f3398f = 2;
        }
        mo3041S();
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: cm */
    public C0208c mo3292cm() {
        if (this.f3398f == 1) {
            return f3400h;
        }
        return AbstractC0224s.f1466i;
    }

    /* renamed from: a */
    public static void m3460a(ArrayList arrayList, int i) {
        arrayList.add(new C0220o());
        if (i == 1) {
            arrayList.add(new C0489b());
        }
        if (i > 1) {
            arrayList.add(new C0217l(EnumC0249ar.dropship, 3.2f));
            arrayList.add(new C0217l(EnumC0249ar.gunShip, 4.0f));
            arrayList.add(new C0217l(EnumC0249ar.amphibiousJet, 5.0f));
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