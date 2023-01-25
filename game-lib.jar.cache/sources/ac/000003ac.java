package com.corrodinggames.rts.game.units.p024d;

import com.corrodinggames.rts.C0067R;
import com.corrodinggames.rts.game.PlayerData;
import com.corrodinggames.rts.game.units.AbstractC0244am;
import com.corrodinggames.rts.game.units.EnumC0249ar;
import com.corrodinggames.rts.game.units.p013a.AbstractC0224s;
import com.corrodinggames.rts.game.units.p013a.AbstractC0228w;
import com.corrodinggames.rts.game.units.p013a.C0208c;
import com.corrodinggames.rts.game.units.p013a.EnumC0225t;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.net.GameInputStream;
import com.corrodinggames.rts.gameFramework.net.GameOutputStream;
import com.corrodinggames.rts.gameFramework.p030a.C0637e;
import com.corrodinggames.rts.gameFramework.translations.C0855a;
import com.corrodinggames.rts.gameFramework.unitAction.C0970e;
import java.util.ArrayList;

/* renamed from: com.corrodinggames.rts.game.units.d.v */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/d/v.class */
public class C0519v extends AbstractC0503i {

    /* renamed from: f */
    int f3596f;

    /* renamed from: g */
    float f3597g;

    /* renamed from: h */
    int f3598h;

    /* renamed from: a */
    static C0970e f3591a = null;

    /* renamed from: b */
    static C0970e f3592b = null;

    /* renamed from: c */
    static C0970e[] f3593c = new C0970e[10];

    /* renamed from: d */
    static C0970e[] f3594d = new C0970e[10];

    /* renamed from: e */
    static C0970e f3595e = null;

    /* renamed from: i */
    public static int f3599i = 0;

    /* renamed from: j */
    static AbstractC0224s f3600j = new AbstractC0228w(102) { // from class: com.corrodinggames.rts.game.units.d.v.1
        @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
        /* renamed from: g */
        public boolean mo3089g() {
            return false;
        }

        @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
        /* renamed from: a */
        public String mo3098a() {
            return C0855a.m1714a("units.supplyDepot.upgrade.description", new Object[0]);
        }

        @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
        /* renamed from: b */
        public String mo3095b() {
            return C0855a.m1714a("units.supplyDepot.upgrade.name", new Object[0]);
        }

        @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
        /* renamed from: c */
        public int mo3092c() {
            return 1000;
        }

        @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0228w
        /* renamed from: K */
        public float mo3291K() {
            return 4.0E-4f;
        }

        @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
        /* renamed from: a */
        public boolean mo3096a(AbstractC0244am abstractC0244am, boolean z) {
            C0519v c0519v = (C0519v) abstractC0244am;
            if (c0519v.f3596f != 1 || c0519v.mo3337a(m4309N(), z) > 0) {
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

    /* renamed from: k */
    static ArrayList f3601k = new ArrayList();

    static {
        f3601k.add(f3600j);
    }

    @Override // com.corrodinggames.rts.game.units.p024d.AbstractC0503i, com.corrodinggames.rts.game.units.p024d.AbstractC0493d, com.corrodinggames.rts.game.units.AbstractC0629y, com.corrodinggames.rts.game.units.AbstractC0244am, com.corrodinggames.rts.gameFramework.AbstractC0674az, com.corrodinggames.rts.gameFramework.AbstractC1155w, com.corrodinggames.rts.gameFramework.AbstractC0741bq
    /* renamed from: a */
    public void mo442a(GameOutputStream gameOutputStream) {
        gameOutputStream.writeInt(this.f3596f);
        super.mo442a(gameOutputStream);
    }

    @Override // com.corrodinggames.rts.game.units.p024d.AbstractC0503i, com.corrodinggames.rts.game.units.p024d.AbstractC0493d, com.corrodinggames.rts.game.units.AbstractC0629y, com.corrodinggames.rts.game.units.AbstractC0244am, com.corrodinggames.rts.gameFramework.AbstractC0674az, com.corrodinggames.rts.gameFramework.AbstractC1155w
    /* renamed from: a */
    public void mo441a(GameInputStream gameInputStream) {
        mo3021a(gameInputStream.readInt());
        super.mo441a(gameInputStream);
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: b */
    public EnumC0249ar mo5458r() {
        return EnumC0249ar.supplyDepot;
    }

    /* renamed from: K */
    public static void m3297K() {
        GameEngine gameEngine = GameEngine.getGameEngine();
        f3591a = gameEngine.f6326bO.mo222a(C0067R.drawable.supply_depot);
        f3592b = gameEngine.f6326bO.mo222a(C0067R.drawable.supply_depot_t2);
        f3593c = PlayerData.m4432a(f3591a);
        f3594d = PlayerData.m4432a(f3592b);
        f3595e = gameEngine.f6326bO.mo222a(C0067R.drawable.supply_depot_dead);
    }

    @Override // com.corrodinggames.rts.game.units.p024d.AbstractC0493d
    /* renamed from: L */
    public boolean mo3296L() {
        GameEngine gameEngine = GameEngine.getGameEngine();
        gameEngine.f6329bR.m2391a(this.f7172eo, this.f7173ep, this.f7174eq);
        this.f3917M = f3595e;
        m448S(0);
        this.f1610bT = false;
        gameEngine.f6324bM.m2812a(C0637e.f4082p, 0.8f, this.f7172eo, this.f7173ep);
        return false;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: d */
    public C0970e mo2879d() {
        if (this.f1612bV) {
            return f3595e;
        }
        if (this.f1614bX == null) {
            return f3593c[f3593c.length - 1];
        }
        if (this.f3596f == 1) {
            return f3593c[this.f1614bX.m4454R()];
        }
        return f3594d[this.f1614bX.m4454R()];
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: k */
    public C0970e mo2853k() {
        return null;
    }

    public C0519v(boolean z) {
        super(z);
        this.f3596f = 1;
        this.f3597g = 0.0f;
        this.f3598h = 0;
        this.f3917M = f3591a;
        m2725a(this.f3917M, 1);
        this.f1626cj = 20.0f;
        this.f1627ck = this.f1626cj;
        this.f1638cv = 800.0f;
        this.f1637cu = this.f1638cv;
        this.f3457n.m5172a(-1, -1, 0, 0);
        this.f3458o.m5171a(this.f3457n);
    }

    @Override // com.corrodinggames.rts.game.units.p024d.AbstractC0503i, com.corrodinggames.rts.game.units.AbstractC0629y, com.corrodinggames.rts.game.units.AbstractC0244am, com.corrodinggames.rts.gameFramework.AbstractC1155w
    /* renamed from: a */
    public void mo446a(float f) {
        super.mo446a(f);
        if (!m4226bT() || this.f1612bV) {
        }
    }

    @Override // com.corrodinggames.rts.game.units.p024d.AbstractC0503i, com.corrodinggames.rts.game.units.p024d.InterfaceC0506l
    /* renamed from: a */
    public void mo3294a(C0504j c0504j) {
        if (c0504j.f3525j.equals(f3600j.m4309N())) {
            m3295M();
            m3037W();
        }
    }

    @Override // com.corrodinggames.rts.game.units.p024d.AbstractC0493d, com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: a */
    public void mo3021a(int i) {
        this.f3596f = i;
    }

    /* renamed from: M */
    public void m3295M() {
        if (this.f3596f == 1) {
            this.f3596f = 2;
            mo3041S();
        }
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: cm */
    public C0208c mo3292cm() {
        if (this.f3596f == 1) {
            return f3600j.m4309N();
        }
        return AbstractC0224s.f1466i;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: N */
    public ArrayList mo3131N() {
        return f3601k;
    }
}