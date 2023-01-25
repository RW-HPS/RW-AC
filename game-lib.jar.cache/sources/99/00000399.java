package com.corrodinggames.rts.game.units.p024d;

import com.corrodinggames.rts.C0067R;
import com.corrodinggames.rts.game.PlayerData;
import com.corrodinggames.rts.game.units.AbstractC0244am;
import com.corrodinggames.rts.game.units.EnumC0249ar;
import com.corrodinggames.rts.game.units.p013a.AbstractC0224s;
import com.corrodinggames.rts.game.units.p013a.AbstractC0228w;
import com.corrodinggames.rts.game.units.p013a.C0208c;
import com.corrodinggames.rts.game.units.p013a.EnumC0225t;
import com.corrodinggames.rts.gameFramework.C0773f;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.net.GameInputStream;
import com.corrodinggames.rts.gameFramework.net.GameOutputStream;
import com.corrodinggames.rts.gameFramework.p030a.C0637e;
import com.corrodinggames.rts.gameFramework.p035d.C0760e;
import com.corrodinggames.rts.gameFramework.p035d.EnumC0763h;
import com.corrodinggames.rts.gameFramework.translations.C0855a;
import com.corrodinggames.rts.gameFramework.unitAction.C0970e;
import java.util.ArrayList;

/* renamed from: com.corrodinggames.rts.game.units.d.h */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/d/h.class */
public class C0500h extends AbstractC0503i {

    /* renamed from: h */
    float f3506h;

    /* renamed from: i */
    float f3507i;

    /* renamed from: j */
    int f3508j;

    /* renamed from: a */
    static C0970e f3499a = null;

    /* renamed from: b */
    static C0970e f3500b = null;

    /* renamed from: c */
    static C0970e f3501c = null;

    /* renamed from: d */
    static C0970e[] f3502d = new C0970e[10];

    /* renamed from: e */
    static C0970e[] f3503e = new C0970e[10];

    /* renamed from: f */
    static C0970e[] f3504f = new C0970e[10];

    /* renamed from: g */
    static C0970e f3505g = null;

    /* renamed from: k */
    static AbstractC0224s f3509k = new AbstractC0228w(102) { // from class: com.corrodinggames.rts.game.units.d.h.1
        @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
        /* renamed from: g */
        public boolean mo3089g() {
            return false;
        }

        @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
        /* renamed from: a */
        public String mo3098a() {
            return C0855a.m1714a("units.fabricator.upgrade.description", new Object[0]);
        }

        @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
        /* renamed from: b */
        public String mo3095b() {
            return C0855a.m1714a("units.fabricator.upgrade.name", new Object[0]);
        }

        @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
        /* renamed from: c */
        public int mo3092c() {
            return EnumC0249ar.fabricator.mo4166c(2);
        }

        @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0228w
        /* renamed from: K */
        public float mo3291K() {
            return 3.0E-4f;
        }

        @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
        /* renamed from: a */
        public boolean mo3096a(AbstractC0244am abstractC0244am, boolean z) {
            C0500h c0500h = (C0500h) abstractC0244am;
            if (c0500h.f3461r != 1 || c0500h.mo3337a(m4309N(), z) > 0) {
                return false;
            }
            return super.mo3096a(abstractC0244am, z);
        }

        @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
        /* renamed from: b */
        public boolean mo3094b(AbstractC0244am abstractC0244am) {
            if (((C0500h) abstractC0244am).f3461r != 1) {
                return false;
            }
            return true;
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

    /* renamed from: l */
    static AbstractC0224s f3510l = new AbstractC0228w(103) { // from class: com.corrodinggames.rts.game.units.d.h.2
        @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
        /* renamed from: g */
        public boolean mo3089g() {
            return false;
        }

        @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
        /* renamed from: a */
        public String mo3098a() {
            return C0855a.m1714a("units.fabricator.upgrade.descriptionT3", new Object[0]);
        }

        @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
        /* renamed from: b */
        public String mo3095b() {
            return C0855a.m1714a("units.fabricator.upgrade.nameT3", new Object[0]);
        }

        @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
        /* renamed from: c */
        public int mo3092c() {
            return EnumC0249ar.fabricator.mo4166c(3);
        }

        @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0228w
        /* renamed from: K */
        public float mo3291K() {
            return 2.0E-4f;
        }

        @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
        /* renamed from: a */
        public boolean mo3096a(AbstractC0244am abstractC0244am, boolean z) {
            C0500h c0500h = (C0500h) abstractC0244am;
            if (c0500h.f3461r != 2 || c0500h.mo3337a(m4309N(), z) > 0) {
                return false;
            }
            return super.mo3096a(abstractC0244am, z);
        }

        @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
        /* renamed from: b */
        public boolean mo3094b(AbstractC0244am abstractC0244am) {
            if (((C0500h) abstractC0244am).f3461r != 2) {
                return false;
            }
            return true;
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

    /* renamed from: t */
    static ArrayList f3511t = new ArrayList();

    static {
        f3511t.add(f3509k);
        f3511t.add(f3510l);
    }

    @Override // com.corrodinggames.rts.game.units.p024d.AbstractC0503i, com.corrodinggames.rts.game.units.p024d.AbstractC0493d, com.corrodinggames.rts.game.units.AbstractC0629y, com.corrodinggames.rts.game.units.AbstractC0244am, com.corrodinggames.rts.gameFramework.AbstractC0674az, com.corrodinggames.rts.gameFramework.AbstractC1155w, com.corrodinggames.rts.gameFramework.AbstractC0741bq
    /* renamed from: a */
    public void mo442a(GameOutputStream gameOutputStream) {
        gameOutputStream.writeFloat(this.f3506h);
        gameOutputStream.writeBoolean(this.f3461r == 2);
        super.mo442a(gameOutputStream);
    }

    @Override // com.corrodinggames.rts.game.units.p024d.AbstractC0503i, com.corrodinggames.rts.game.units.p024d.AbstractC0493d, com.corrodinggames.rts.game.units.AbstractC0629y, com.corrodinggames.rts.game.units.AbstractC0244am, com.corrodinggames.rts.gameFramework.AbstractC0674az, com.corrodinggames.rts.gameFramework.AbstractC1155w
    /* renamed from: a */
    public void mo441a(GameInputStream gameInputStream) {
        this.f3506h = gameInputStream.readFloat();
        boolean readBoolean = gameInputStream.readBoolean();
        if (gameInputStream.m1311b() < 51 && readBoolean) {
            mo3021a(2);
        }
        super.mo441a(gameInputStream);
    }

    @Override // com.corrodinggames.rts.game.units.p024d.AbstractC0493d
    /* renamed from: R */
    public void mo3377R(int i) {
        mo3021a(i);
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: b */
    public EnumC0249ar mo5458r() {
        return EnumC0249ar.fabricator;
    }

    /* renamed from: K */
    public static void m3378K() {
        GameEngine gameEngine = GameEngine.getGameEngine();
        f3499a = gameEngine.f6326bO.mo222a(C0067R.drawable.power);
        f3500b = gameEngine.f6326bO.mo222a(C0067R.drawable.power_t2);
        f3501c = gameEngine.f6326bO.mo222a(C0067R.drawable.power_t3);
        f3502d = PlayerData.m4432a(f3499a);
        f3503e = PlayerData.m4432a(f3500b);
        f3504f = PlayerData.m4432a(f3501c);
        f3505g = gameEngine.f6326bO.mo222a(C0067R.drawable.power_dead);
    }

    @Override // com.corrodinggames.rts.game.units.p024d.AbstractC0493d
    /* renamed from: L */
    public boolean mo3296L() {
        GameEngine gameEngine = GameEngine.getGameEngine();
        gameEngine.f6329bR.m2391a(this.f7172eo, this.f7173ep, this.f7174eq);
        this.f3917M = f3505g;
        m448S(0);
        this.f1610bT = false;
        gameEngine.f6324bM.m2812a(C0637e.f4082p, 0.8f, this.f7172eo, this.f7173ep);
        gameEngine.f6329bR.m2364b(EnumC0763h.critical);
        C0760e m2361c = gameEngine.f6329bR.m2361c(this.f7172eo, this.f7173ep, this.f7174eq, -1127220);
        if (m2361c != null) {
            m2361c.f4816G = 0.15f;
            m2361c.f4815F = 1.0f;
            m2361c.f4873ar = (short) 2;
            m2361c.f4831V = 35.0f;
            m2361c.f4832W = m2361c.f4831V;
            m2361c.f4830U = 0.0f;
            m2361c.f4811x = -14492382;
        }
        m2897bo();
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: d */
    public C0970e mo2879d() {
        if (this.f1612bV) {
            return f3505g;
        }
        if (this.f1614bX == null) {
            return f3502d[f3502d.length - 1];
        }
        if (this.f3461r == 1) {
            return f3502d[this.f1614bX.m4454R()];
        }
        if (this.f3461r == 2) {
            return f3503e[this.f1614bX.m4454R()];
        }
        if (this.f3461r == 3) {
            return f3504f[this.f1614bX.m4454R()];
        }
        GameEngine.m5460e("Unknown tech level:" + this.f3461r);
        return f3502d[this.f1614bX.m4454R()];
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: k */
    public C0970e mo2853k() {
        return null;
    }

    public C0500h(boolean z) {
        super(z);
        this.f3507i = 0.0f;
        this.f3508j = 0;
        this.f3917M = f3499a;
        m2725a(this.f3917M, 3);
        this.f1626cj = 25.0f;
        this.f1627ck = this.f1626cj;
        this.f1638cv = 800.0f;
        this.f1637cu = this.f1638cv;
        this.f3457n.m5172a(-1, -1, 1, 1);
        this.f3458o.m5171a(this.f3457n);
    }

    @Override // com.corrodinggames.rts.game.units.p024d.AbstractC0503i, com.corrodinggames.rts.game.units.AbstractC0629y, com.corrodinggames.rts.game.units.AbstractC0244am, com.corrodinggames.rts.gameFramework.AbstractC1155w
    /* renamed from: a */
    public void mo446a(float f) {
        super.mo446a(f);
        if (!m4226bT() || this.f1612bV) {
            return;
        }
        this.f3507i = C0773f.m2218a(this.f3507i, f);
        if (this.f3507i == 0.0f) {
            this.f3507i = 17.0f;
            this.f3508j++;
            if (this.f3508j > 5) {
                this.f3508j = 0;
            }
            if (this.f3508j <= 2) {
                this.f3462s = this.f3508j;
            } else {
                this.f3462s = 5 - this.f3508j;
            }
        }
        this.f3506h += f;
        if (this.f3506h > PlayerData.f1380ap - 0.1f) {
            this.f3506h -= PlayerData.f1380ap;
            this.f1614bX.m4421b(mo3375cy() * (PlayerData.f1380ap / PlayerData.f1379ao));
        }
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: cy */
    public float mo3375cy() {
        if (this.f3461r == 1) {
            return 2.0f;
        }
        if (this.f3461r == 2) {
            return 7.0f;
        }
        return 14.0f;
    }

    @Override // com.corrodinggames.rts.game.units.p024d.AbstractC0503i, com.corrodinggames.rts.game.units.p024d.InterfaceC0506l
    /* renamed from: a */
    public void mo3294a(C0504j c0504j) {
        if (c0504j.f3525j.equals(f3509k.m4309N())) {
            mo3021a(2);
            m3037W();
        }
        if (c0504j.f3525j.equals(f3510l.m4309N())) {
            mo3021a(3);
            m3037W();
        }
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: cm */
    public C0208c mo3292cm() {
        if (this.f3461r == 1) {
            return f3509k.m4309N();
        }
        if (this.f3461r == 2) {
            return f3510l.m4309N();
        }
        return AbstractC0224s.f1466i;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y, com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: V */
    public int mo3038V() {
        return this.f3461r;
    }

    @Override // com.corrodinggames.rts.game.units.p024d.AbstractC0493d, com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: a */
    public void mo3021a(int i) {
        PlayerData.m4417b((AbstractC0244am) this);
        if (this.f3461r > i) {
            this.f3461r = 1;
            this.f1638cv = 800.0f;
            if (this.f1637cu > this.f1638cv) {
                this.f1637cu = this.f1638cv;
            }
        }
        if (this.f3461r < 2 && i >= 2) {
            this.f1638cv += 500.0f;
            this.f1637cu += 500.0f;
        }
        if (this.f3461r < 3 && i >= 3) {
            this.f1638cv += 1300.0f;
            this.f1637cu += 1300.0f;
        }
        this.f3461r = i;
        PlayerData.m4401c(this);
        mo3041S();
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: N */
    public ArrayList mo3131N() {
        return f3511t;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: db */
    public float mo3317db() {
        return super.mo3317db() - 8.0f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: bp */
    public int mo2896bp() {
        return 12;
    }
}