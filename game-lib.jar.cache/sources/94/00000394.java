package com.corrodinggames.rts.game.units.p024d;

import com.corrodinggames.rts.C0067R;
import com.corrodinggames.rts.game.PlayerData;
import com.corrodinggames.rts.game.units.AbstractC0244am;
import com.corrodinggames.rts.game.units.EnumC0233ab;
import com.corrodinggames.rts.game.units.EnumC0249ar;
import com.corrodinggames.rts.game.units.p013a.AbstractC0224s;
import com.corrodinggames.rts.game.units.p013a.AbstractC0228w;
import com.corrodinggames.rts.game.units.p013a.C0208c;
import com.corrodinggames.rts.game.units.p013a.C0217l;
import com.corrodinggames.rts.game.units.p013a.C0220o;
import com.corrodinggames.rts.game.units.p013a.EnumC0225t;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.net.GameInputStream;
import com.corrodinggames.rts.gameFramework.net.GameOutputStream;
import com.corrodinggames.rts.gameFramework.translations.C0855a;
import com.corrodinggames.rts.gameFramework.unitAction.C0970e;
import java.util.ArrayList;

/* renamed from: com.corrodinggames.rts.game.units.d.f */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/d/f.class */
public class C0495f extends AbstractC0503i {

    /* renamed from: f */
    boolean f3480f;

    /* renamed from: a */
    static C0970e f3475a = null;

    /* renamed from: b */
    static C0970e f3476b = null;

    /* renamed from: c */
    static C0970e[] f3477c = new C0970e[10];

    /* renamed from: d */
    static C0970e[] f3478d = new C0970e[10];

    /* renamed from: e */
    static C0970e f3479e = null;

    /* renamed from: g */
    static AbstractC0224s f3481g = new AbstractC0228w(110) { // from class: com.corrodinggames.rts.game.units.d.f.1
        @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
        /* renamed from: g */
        public boolean mo3089g() {
            return false;
        }

        @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
        /* renamed from: a */
        public String mo3098a() {
            return "-Allows factory to build Tech 2 units";
        }

        @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
        /* renamed from: b */
        public String mo3095b() {
            return C0855a.m1714a("gui.actions.upgradeT2", new Object[0]);
        }

        @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
        /* renamed from: c */
        public int mo3092c() {
            return 1500;
        }

        @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0228w
        /* renamed from: K */
        public float mo3291K() {
            return 5.0E-4f;
        }

        @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
        /* renamed from: a */
        public boolean mo3096a(AbstractC0244am abstractC0244am, boolean z) {
            C0495f c0495f = (C0495f) abstractC0244am;
            if (c0495f.f3480f || c0495f.mo3337a(m4309N(), z) > 0) {
                return false;
            }
            return super.mo3096a(abstractC0244am, z);
        }

        @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
        /* renamed from: L */
        public EnumC0249ar mo5457i() {
            return null;
        }

        @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
        /* renamed from: f */
        public EnumC0225t mo3090f() {
            return EnumC0225t.f1471c;
        }
    };

    @Override // com.corrodinggames.rts.game.units.p024d.AbstractC0503i, com.corrodinggames.rts.game.units.p024d.AbstractC0493d, com.corrodinggames.rts.game.units.AbstractC0629y, com.corrodinggames.rts.game.units.AbstractC0244am, com.corrodinggames.rts.gameFramework.AbstractC0674az, com.corrodinggames.rts.gameFramework.AbstractC1155w, com.corrodinggames.rts.gameFramework.AbstractC0741bq
    /* renamed from: a */
    public void mo442a(GameOutputStream gameOutputStream) {
        gameOutputStream.writeBoolean(this.f3480f);
        gameOutputStream.writeByte(0);
        super.mo442a(gameOutputStream);
    }

    @Override // com.corrodinggames.rts.game.units.p024d.AbstractC0503i, com.corrodinggames.rts.game.units.p024d.AbstractC0493d, com.corrodinggames.rts.game.units.AbstractC0629y, com.corrodinggames.rts.game.units.AbstractC0244am, com.corrodinggames.rts.gameFramework.AbstractC0674az, com.corrodinggames.rts.gameFramework.AbstractC1155w
    /* renamed from: a */
    public void mo441a(GameInputStream gameInputStream) {
        if (gameInputStream.readBoolean()) {
            m3387M();
        }
        gameInputStream.readByte();
        super.mo441a(gameInputStream);
    }

    /* renamed from: b */
    public static void m3385b() {
        GameEngine gameEngine = GameEngine.getGameEngine();
        f3475a = gameEngine.f6326bO.mo222a(C0067R.drawable.experimental_unit_factory_front);
        f3476b = gameEngine.f6326bO.mo222a(C0067R.drawable.experimental_unit_factory_base);
        f3479e = gameEngine.f6326bO.mo222a(C0067R.drawable.experimental_unit_factory_dead);
        f3477c = PlayerData.m4432a(f3475a);
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: K */
    public EnumC0249ar mo5458r() {
        return EnumC0249ar.experimentalLandFactory;
    }

    @Override // com.corrodinggames.rts.game.units.p024d.AbstractC0493d
    /* renamed from: L */
    public boolean mo3296L() {
        GameEngine.getGameEngine();
        this.f3456m = null;
        this.f3917M = f3479e;
        m448S(0);
        this.f1610bT = false;
        m3014a(EnumC0233ab.verylargeBuilding);
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.p024d.AbstractC0493d, com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: a */
    public void mo3021a(int i) {
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: d */
    public C0970e mo2879d() {
        if (this.f1612bV) {
            return f3479e;
        }
        if (this.f1614bX == null) {
            return f3477c[f3477c.length - 1];
        }
        if (!this.f3480f) {
            return f3477c[this.f1614bX.m4454R()];
        }
        return f3478d[this.f1614bX.m4454R()];
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: S */
    public void mo3041S() {
        super.mo3041S();
        if (this.f1612bV) {
            this.f3456m = null;
        } else {
            this.f3456m = f3476b;
        }
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: k */
    public C0970e mo2853k() {
        return null;
    }

    public C0495f(boolean z) {
        super(z);
        this.f3917M = f3475a;
        this.f3456m = f3476b;
        m2724b(this.f3917M);
        this.f1626cj = 55.0f;
        this.f1627ck = this.f1626cj;
        this.f1638cv = 3200.0f;
        this.f1637cu = this.f1638cv;
        m448S(4);
        this.f3457n.m5172a(-2, -2, 2, 2);
        this.f3458o.m5172a(-2, -2, 2, 4);
    }

    @Override // com.corrodinggames.rts.game.units.p024d.AbstractC0503i, com.corrodinggames.rts.game.units.p024d.InterfaceC0506l
    /* renamed from: a */
    public void mo3294a(C0504j c0504j) {
        if (c0504j.f3525j.equals(f3481g.m4309N())) {
            m3387M();
        } else {
            super.mo3294a(c0504j);
        }
    }

    /* renamed from: M */
    public void m3387M() {
        if (!this.f3480f) {
            this.f3480f = true;
            mo3041S();
        }
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: cm */
    public C0208c mo3292cm() {
        return AbstractC0224s.f1466i;
    }

    /* renamed from: a */
    public static void m3386a(ArrayList arrayList, int i) {
        arrayList.add(new C0220o());
        arrayList.add(new C0217l(EnumC0249ar.experimentalTank, 2.0f));
        arrayList.add(new C0217l(EnumC0249ar.experimentalHoverTank, 3.0f));
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

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y, com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: V */
    public int mo3038V() {
        return 2;
    }
}