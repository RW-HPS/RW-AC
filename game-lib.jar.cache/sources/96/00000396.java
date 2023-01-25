package com.corrodinggames.rts.game.units.p024d;

import android.graphics.Rect;
import com.corrodinggames.rts.C0067R;
import com.corrodinggames.rts.game.PlayerData;
import com.corrodinggames.rts.game.p012b.C0180g;
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
import com.corrodinggames.rts.gameFramework.p035d.C0761f;
import com.corrodinggames.rts.gameFramework.p035d.EnumC0763h;
import com.corrodinggames.rts.gameFramework.translations.C0855a;
import com.corrodinggames.rts.gameFramework.unitAction.C0970e;
import java.util.ArrayList;

/* renamed from: com.corrodinggames.rts.game.units.d.g */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/d/g.class */
public class C0497g extends AbstractC0503i {

    /* renamed from: a */
    float f3482a;

    /* renamed from: b */
    int f3483b;

    /* renamed from: c */
    float f3484c;

    /* renamed from: d */
    int f3485d;

    /* renamed from: j */
    Rect f3486j;

    /* renamed from: k */
    Rect f3487k;

    /* renamed from: w */
    static ArrayList f3488w;

    /* renamed from: x */
    static ArrayList f3489x;

    /* renamed from: e */
    static C0970e[] f3490e = new C0970e[10];

    /* renamed from: f */
    static C0970e[] f3491f = new C0970e[10];

    /* renamed from: g */
    static C0970e[] f3492g = new C0970e[10];

    /* renamed from: h */
    static C0970e f3493h = null;

    /* renamed from: i */
    static C0970e f3494i = null;

    /* renamed from: l */
    public static int f3495l = 0;

    /* renamed from: t */
    static AbstractC0224s f3496t = new AbstractC0228w(102) { // from class: com.corrodinggames.rts.game.units.d.g.1
        @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
        /* renamed from: g */
        public boolean mo3089g() {
            return false;
        }

        @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
        /* renamed from: a */
        public String mo3098a() {
            return C0855a.m1714a("units.extractor.upgrade.description", new Object[0]);
        }

        @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
        /* renamed from: b */
        public String mo3095b() {
            return C0855a.m1714a("gui.actions.upgradeT2", new Object[0]);
        }

        @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
        /* renamed from: c */
        public int mo3092c() {
            return EnumC0249ar.extractor.mo4166c(2);
        }

        @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0228w
        /* renamed from: K */
        public float mo3291K() {
            return 6.0E-4f;
        }

        @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
        /* renamed from: a */
        public boolean mo3096a(AbstractC0244am abstractC0244am, boolean z) {
            C0497g c0497g = (C0497g) abstractC0244am;
            if (c0497g.f3483b != 1 || c0497g.mo3337a(m4309N(), z) > 0) {
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

    /* renamed from: u */
    static AbstractC0224s f3497u = new AbstractC0228w(103) { // from class: com.corrodinggames.rts.game.units.d.g.2
        @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
        /* renamed from: g */
        public boolean mo3089g() {
            return false;
        }

        @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
        /* renamed from: a */
        public String mo3098a() {
            return C0855a.m1714a("units.extractor.upgrade.descriptionT3", new Object[0]);
        }

        @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
        /* renamed from: b */
        public String mo3095b() {
            return C0855a.m1714a("gui.actions.upgradeT3", new Object[0]);
        }

        @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
        /* renamed from: c */
        public int mo3092c() {
            return EnumC0249ar.extractor.mo4166c(3);
        }

        @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0228w
        /* renamed from: K */
        public float mo3291K() {
            return 3.0E-4f;
        }

        @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
        /* renamed from: a */
        public boolean mo3096a(AbstractC0244am abstractC0244am, boolean z) {
            C0497g c0497g = (C0497g) abstractC0244am;
            if (c0497g.f3483b != 2 || c0497g.mo3337a(m4309N(), z) > 0) {
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

    /* renamed from: v */
    static ArrayList f3498v = new ArrayList();

    @Override // com.corrodinggames.rts.game.units.p024d.AbstractC0503i, com.corrodinggames.rts.game.units.p024d.AbstractC0493d, com.corrodinggames.rts.game.units.AbstractC0629y, com.corrodinggames.rts.game.units.AbstractC0244am, com.corrodinggames.rts.gameFramework.AbstractC0674az, com.corrodinggames.rts.gameFramework.AbstractC1155w, com.corrodinggames.rts.gameFramework.AbstractC0741bq
    /* renamed from: a */
    public void mo442a(GameOutputStream gameOutputStream) {
        gameOutputStream.writeFloat(this.f3482a);
        gameOutputStream.writeBoolean(this.f3483b > 1);
        gameOutputStream.writeInt(this.f3483b);
        super.mo442a(gameOutputStream);
    }

    @Override // com.corrodinggames.rts.game.units.p024d.AbstractC0503i, com.corrodinggames.rts.game.units.p024d.AbstractC0493d, com.corrodinggames.rts.game.units.AbstractC0629y, com.corrodinggames.rts.game.units.AbstractC0244am, com.corrodinggames.rts.gameFramework.AbstractC0674az, com.corrodinggames.rts.gameFramework.AbstractC1155w
    /* renamed from: a */
    public void mo441a(GameInputStream gameInputStream) {
        this.f3482a = gameInputStream.readFloat();
        int i = 1;
        if (gameInputStream.readBoolean()) {
            i = 2;
        }
        if (gameInputStream.m1311b() >= 31) {
            i = gameInputStream.readInt();
        }
        if (i != 1) {
            mo3021a(i);
        }
        super.mo441a(gameInputStream);
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: b */
    public EnumC0249ar mo5458r() {
        return EnumC0249ar.extractor;
    }

    static {
        f3498v.add(f3496t);
        f3488w = new ArrayList();
        f3488w.add(f3497u);
        f3489x = new ArrayList();
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: c */
    public boolean mo2882c(PlayerData playerData) {
        GameEngine gameEngine = GameEngine.getGameEngine();
        gameEngine.f6323bL.m4664a(this.f7172eo, this.f7173ep);
        C0180g m4610e = gameEngine.f6323bL.m4610e(gameEngine.f6323bL.f802T, gameEngine.f6323bL.f803U);
        if (m4610e == null || !m4610e.f923i) {
            return false;
        }
        return super.mo2882c(playerData);
    }

    /* renamed from: K */
    public static void m3383K() {
        GameEngine gameEngine = GameEngine.getGameEngine();
        C0970e mo222a = gameEngine.f6326bO.mo222a(C0067R.drawable.extractor);
        C0970e mo222a2 = gameEngine.f6326bO.mo222a(C0067R.drawable.extractor_t2);
        C0970e mo222a3 = gameEngine.f6326bO.mo222a(C0067R.drawable.extractor_t3);
        f3494i = gameEngine.f6326bO.mo222a(C0067R.drawable.extractor_dead);
        f3490e = PlayerData.m4432a(mo222a);
        f3491f = PlayerData.m4432a(mo222a2);
        f3492g = PlayerData.m4432a(mo222a3);
        mo222a.mo51n();
        mo222a2.mo51n();
        mo222a3.mo51n();
        f3493h = gameEngine.f6326bO.mo222a(C0067R.drawable.extractor_back);
    }

    @Override // com.corrodinggames.rts.game.units.p024d.AbstractC0493d
    /* renamed from: L */
    public boolean mo3296L() {
        GameEngine gameEngine = GameEngine.getGameEngine();
        gameEngine.f6329bR.m2391a(this.f7172eo, this.f7173ep, this.f7174eq);
        this.f3917M = f3494i;
        this.f3456m = null;
        m448S(0);
        this.f1610bT = false;
        gameEngine.f6324bM.m2812a(C0637e.f4082p, 0.8f, this.f7172eo, this.f7173ep);
        C0761f.m2348a(this.f7172eo, this.f7173ep).f4896j = -6684775;
        C0761f m2344b = C0761f.m2344b(this.f7172eo, this.f7173ep);
        m2344b.f4876a = 500.0f;
        m2344b.f4896j = -6684775;
        gameEngine.f6329bR.m2364b(EnumC0763h.critical);
        C0760e m2361c = gameEngine.f6329bR.m2361c(this.f7172eo, this.f7173ep, this.f7174eq, -1127220);
        if (m2361c != null) {
            m2361c.f4816G = 0.15f;
            m2361c.f4815F = 1.0f;
            m2361c.f4873ar = (short) 2;
            m2361c.f4831V = 35.0f;
            m2361c.f4832W = m2361c.f4831V;
            m2361c.f4830U = 0.0f;
            m2361c.f4811x = -13378253;
        }
        m2897bo();
        return false;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: bp */
    public int mo2896bp() {
        return 16;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: S */
    public void mo3041S() {
        super.mo3041S();
        if (this.f1612bV) {
            this.f3456m = null;
        } else {
            this.f3456m = f3493h;
        }
    }

    @Override // com.corrodinggames.rts.game.units.p024d.AbstractC0493d
    /* renamed from: ds */
    public boolean mo3381ds() {
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: d */
    public C0970e mo2879d() {
        if (this.f1612bV) {
            return f3494i;
        }
        if (this.f1614bX == null) {
            return f3490e[f3490e.length - 1];
        }
        if (this.f3483b == 3) {
            return f3492g[this.f1614bX.m4454R()];
        }
        if (this.f3483b == 2) {
            return f3491f[this.f1614bX.m4454R()];
        }
        return f3490e[this.f1614bX.m4454R()];
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: k */
    public C0970e mo2853k() {
        return null;
    }

    public C0497g(boolean z) {
        super(z);
        this.f3483b = 1;
        this.f3484c = 0.0f;
        this.f3485d = 0;
        this.f3486j = new Rect();
        this.f3487k = new Rect();
        this.f3917M = f3490e[9];
        m2729T(37);
        m2728U(56);
        this.f1626cj = 18.0f;
        this.f1627ck = this.f1626cj;
        this.f1638cv = 800.0f;
        this.f1637cu = this.f1638cv;
        this.f3457n.m5172a(0, -1, 0, 0);
        this.f3458o.m5171a(this.f3457n);
        mo3041S();
    }

    @Override // com.corrodinggames.rts.game.units.p024d.AbstractC0503i, com.corrodinggames.rts.game.units.AbstractC0629y, com.corrodinggames.rts.game.units.AbstractC0244am, com.corrodinggames.rts.gameFramework.AbstractC1155w
    /* renamed from: a */
    public void mo446a(float f) {
        super.mo446a(f);
        if (!m4226bT() || this.f1612bV) {
            return;
        }
        this.f3484c = C0773f.m2218a(this.f3484c, f * this.f3483b);
        if (this.f3484c == 0.0f) {
            this.f3484c = 17.0f;
            this.f3485d++;
            if (this.f3485d > 7) {
                this.f3485d = 0;
            }
            if (this.f3485d <= 3) {
                this.f3462s = this.f3485d;
            } else {
                this.f3462s = 7 - this.f3485d;
            }
        }
        this.f3482a += f;
        if (this.f3482a > PlayerData.f1380ap - 0.1f) {
            this.f3482a -= PlayerData.f1380ap;
            this.f1614bX.m4421b(mo3375cy() * (PlayerData.f1380ap / PlayerData.f1379ao));
        }
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: cy */
    public float mo3375cy() {
        if (this.f3483b == 3) {
            return 18.0f;
        }
        if (this.f3483b == 2) {
            return 12.0f;
        }
        return 8.0f;
    }

    @Override // com.corrodinggames.rts.game.units.p024d.AbstractC0503i, com.corrodinggames.rts.game.units.p024d.AbstractC0493d, com.corrodinggames.rts.game.units.AbstractC0629y, com.corrodinggames.rts.game.units.AbstractC0244am, com.corrodinggames.rts.gameFramework.AbstractC1155w
    /* renamed from: c */
    public boolean mo438c(float f) {
        return super.mo438c(f);
    }

    @Override // com.corrodinggames.rts.game.units.p024d.AbstractC0503i, com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: l */
    public boolean mo3067l() {
        return false;
    }

    @Override // com.corrodinggames.rts.game.units.p024d.AbstractC0503i, com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: a */
    public void mo3008a(AbstractC0244am abstractC0244am, int i) {
        throw new RuntimeException("Unit cannot shoot");
    }

    @Override // com.corrodinggames.rts.game.units.p024d.AbstractC0503i, com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: m */
    public float mo2846m() {
        return 0.0f;
    }

    @Override // com.corrodinggames.rts.game.units.p024d.AbstractC0503i, com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: b */
    public float mo2930b(int i) {
        return 0.0f;
    }

    @Override // com.corrodinggames.rts.game.units.p024d.AbstractC0503i, com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: c */
    public float mo2883c(int i) {
        return 0.0f;
    }

    @Override // com.corrodinggames.rts.game.units.p024d.AbstractC0503i, com.corrodinggames.rts.game.units.p024d.InterfaceC0506l
    /* renamed from: a */
    public void mo3294a(C0504j c0504j) {
        if (c0504j.f3525j.equals(f3496t.m4309N())) {
            mo3021a(2);
            m3037W();
        }
        if (c0504j.f3525j.equals(f3497u.m4309N())) {
            mo3021a(3);
            m3037W();
        }
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: cm */
    public C0208c mo3292cm() {
        if (this.f3483b == 1) {
            return f3496t.m4309N();
        }
        if (this.f3483b == 2) {
            return f3497u.m4309N();
        }
        return AbstractC0224s.f1466i;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y, com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: V */
    public int mo3038V() {
        return this.f3483b;
    }

    @Override // com.corrodinggames.rts.game.units.p024d.AbstractC0493d, com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: a */
    public void mo3021a(int i) {
        PlayerData.m4417b((AbstractC0244am) this);
        if (this.f3483b > i) {
            this.f3483b = 1;
            this.f1638cv = 800.0f;
            if (this.f1637cu > this.f1638cv) {
                this.f1637cu = this.f1638cv;
            }
        }
        if (this.f3483b < 2 && i >= 2) {
            this.f1638cv += 200.0f;
            this.f1637cu += 200.0f;
        }
        if (this.f3483b < 3 && i >= 3) {
            this.f1638cv += 1000.0f;
            this.f1637cu += 1000.0f;
        }
        this.f3483b = i;
        PlayerData.m4401c(this);
        mo3041S();
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: N */
    public ArrayList mo3131N() {
        if (this.f3483b == 1) {
            return f3498v;
        }
        if (this.f3483b == 2) {
            return f3488w;
        }
        return f3489x;
    }
}