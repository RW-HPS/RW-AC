package com.corrodinggames.rts.game.units.p024d;

import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.Rect;
import com.corrodinggames.rts.C0067R;
import com.corrodinggames.rts.game.C0188f;
import com.corrodinggames.rts.game.PlayerData;
import com.corrodinggames.rts.game.units.AbstractC0244am;
import com.corrodinggames.rts.game.units.EnumC0233ab;
import com.corrodinggames.rts.game.units.EnumC0249ar;
import com.corrodinggames.rts.game.units.p013a.AbstractC0224s;
import com.corrodinggames.rts.game.units.p013a.AbstractC0228w;
import com.corrodinggames.rts.game.units.p013a.C0208c;
import com.corrodinggames.rts.game.units.p013a.EnumC0225t;
import com.corrodinggames.rts.game.units.p013a.EnumC0226u;
import com.corrodinggames.rts.gameFramework.C0773f;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.net.GameInputStream;
import com.corrodinggames.rts.gameFramework.net.GameNetEngine;
import com.corrodinggames.rts.gameFramework.net.GameOutputStream;
import com.corrodinggames.rts.gameFramework.p030a.C0637e;
import com.corrodinggames.rts.gameFramework.p035d.C0760e;
import com.corrodinggames.rts.gameFramework.p035d.EnumC0763h;
import com.corrodinggames.rts.gameFramework.translations.C0855a;
import com.corrodinggames.rts.gameFramework.unitAction.C0970e;
import com.corrodinggames.rts.gameFramework.utility.C1152y;
import com.corrodinggames.rts.gameFramework.utility.SlickToAndroidKeycodes;
import java.util.ArrayList;

/* renamed from: com.corrodinggames.rts.game.units.d.q */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/d/q.class */
public class C0512q extends AbstractC0503i {

    /* renamed from: c */
    int f3556c;

    /* renamed from: f */
    PointF f3557f;

    /* renamed from: g */
    Rect f3558g;

    /* renamed from: a */
    static C0970e[] f3559a = new C0970e[10];

    /* renamed from: b */
    static C0970e f3560b = null;

    /* renamed from: d */
    static C0970e f3561d = null;

    /* renamed from: e */
    static C0970e[] f3562e = new C0970e[10];

    /* renamed from: h */
    static AbstractC0224s f3563h = new AbstractC0224s(142) { // from class: com.corrodinggames.rts.game.units.d.q.1
        @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
        /* renamed from: a */
        public String mo3098a() {
            return C0855a.m1714a("gui.actions.launchNuke", new Object[0]);
        }

        @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
        /* renamed from: b */
        public String mo3095b() {
            return C0855a.m1714a("gui.actions.launchNuke", new Object[0]);
        }

        @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
        /* renamed from: c */
        public int mo3092c() {
            return 0;
        }

        @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
        /* renamed from: b */
        public int mo3093b(AbstractC0244am abstractC0244am, boolean z) {
            return ((C0512q) abstractC0244am).f3556c;
        }

        @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
        /* renamed from: K */
        public EnumC0249ar mo5457i() {
            return null;
        }

        @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
        /* renamed from: e */
        public EnumC0226u mo3091e() {
            return EnumC0226u.f1485g;
        }

        @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
        /* renamed from: f */
        public EnumC0225t mo3090f() {
            return EnumC0225t.f1474f;
        }

        @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
        /* renamed from: g */
        public boolean mo3089g() {
            return false;
        }

        @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
        /* renamed from: a */
        public boolean mo3096a(AbstractC0244am abstractC0244am, boolean z) {
            return ((C0512q) abstractC0244am).f3556c > 0;
        }
    };

    /* renamed from: i */
    static AbstractC0224s f3564i = new AbstractC0228w(143) { // from class: com.corrodinggames.rts.game.units.d.q.2
        @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
        /* renamed from: g */
        public boolean mo3089g() {
            return false;
        }

        @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
        /* renamed from: a */
        public String mo3098a() {
            return C0855a.m1714a("gui.actions.buildNuke.description", new Object[0]);
        }

        @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
        /* renamed from: b */
        public String mo3095b() {
            return C0855a.m1714a("gui.actions.buildNuke", new Object[0]);
        }

        @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
        /* renamed from: c */
        public int mo3092c() {
            return 11000;
        }

        @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0228w
        /* renamed from: K */
        public float mo3291K() {
            return 3.0E-4f;
        }

        @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
        /* renamed from: a */
        public boolean mo3096a(AbstractC0244am abstractC0244am, boolean z) {
            C0512q c0512q = (C0512q) abstractC0244am;
            if (c0512q.f3556c + c0512q.mo3337a(m4309N(), z) >= 4.0f) {
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
            return EnumC0225t.f1472d;
        }
    };

    /* renamed from: j */
    static ArrayList f3565j = new ArrayList();

    static {
        f3565j.add(f3563h);
        f3565j.add(f3564i);
    }

    @Override // com.corrodinggames.rts.game.units.p024d.AbstractC0503i, com.corrodinggames.rts.game.units.p024d.AbstractC0493d, com.corrodinggames.rts.game.units.AbstractC0629y, com.corrodinggames.rts.game.units.AbstractC0244am, com.corrodinggames.rts.gameFramework.AbstractC0674az, com.corrodinggames.rts.gameFramework.AbstractC1155w, com.corrodinggames.rts.gameFramework.AbstractC0741bq
    /* renamed from: a */
    public void mo442a(GameOutputStream gameOutputStream) {
        gameOutputStream.writeInt(this.f3556c);
        super.mo442a(gameOutputStream);
    }

    @Override // com.corrodinggames.rts.game.units.p024d.AbstractC0503i, com.corrodinggames.rts.game.units.p024d.AbstractC0493d, com.corrodinggames.rts.game.units.AbstractC0629y, com.corrodinggames.rts.game.units.AbstractC0244am, com.corrodinggames.rts.gameFramework.AbstractC0674az, com.corrodinggames.rts.gameFramework.AbstractC1155w
    /* renamed from: a */
    public void mo441a(GameInputStream gameInputStream) {
        this.f3556c = gameInputStream.readInt();
        super.mo441a(gameInputStream);
    }

    @Override // com.corrodinggames.rts.game.units.p024d.AbstractC0493d, com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: v */
    public C0970e mo3066v() {
        if (this.f1614bX.site == -1) {
            return null;
        }
        return f3562e[this.f1614bX.m4454R()];
    }

    /* renamed from: b */
    public static void m3311b() {
        GameEngine gameEngine = GameEngine.getGameEngine();
        f3560b = gameEngine.f6326bO.mo222a(C0067R.drawable.nuke_launcher_dead);
        C0970e mo222a = gameEngine.f6326bO.mo222a(C0067R.drawable.nuke_launcher);
        f3559a = PlayerData.m4432a(mo222a);
        mo222a.mo51n();
        f3561d = gameEngine.f6326bO.mo222a(C0067R.drawable.unit_icon_building);
        f3562e = PlayerData.m4432a(f3561d);
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: bp */
    public int mo2896bp() {
        return 20;
    }

    @Override // com.corrodinggames.rts.game.units.p024d.AbstractC0493d
    /* renamed from: L */
    public boolean mo3296L() {
        GameEngine gameEngine = GameEngine.getGameEngine();
        this.f3917M = f3560b;
        m448S(0);
        this.f1610bT = false;
        m3014a(EnumC0233ab.verylargeBuilding);
        float f = this.f7172eo;
        float f2 = this.f7173ep;
        gameEngine.f6329bR.m2364b(EnumC0763h.critical);
        C0760e m2385a = gameEngine.f6329bR.m2385a(f, f2, this.f7174eq, Color.m5243a(255, 255, 255, 255));
        if (m2385a != null) {
            m2385a.f4816G = 8.0f;
            m2385a.f4815F = 5.0f;
            m2385a.f4814E = 0.9f;
            m2385a.f4831V = 20.0f;
            m2385a.f4832W = m2385a.f4831V;
            m2385a.f4806r = true;
        }
        gameEngine.f6329bR.m2364b(EnumC0763h.critical);
        C0760e m2361c = gameEngine.f6329bR.m2361c(f, f2, 0.0f, -1127220);
        if (m2361c != null) {
            m2361c.f4816G = 0.2f;
            m2361c.f4815F = 2.0f;
            m2361c.f4873ar = (short) 2;
            m2361c.f4831V = 45.0f;
            m2361c.f4832W = m2361c.f4831V;
            m2361c.f4830U = 0.0f;
        }
        gameEngine.f6329bR.m2389a(this.f7172eo, this.f7173ep, this.f7174eq, 40.0f, 120.0f);
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: d */
    public C0970e mo2879d() {
        if (this.f1612bV) {
            return f3560b;
        }
        return f3559a[this.f1614bX.m4454R()];
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

    public C0512q(boolean z) {
        super(z);
        this.f3557f = new PointF();
        this.f3558g = new Rect();
        this.f3917M = f3559a[f3559a.length - 1];
        m2724b(this.f3917M);
        this.f1626cj = 40.0f;
        this.f1627ck = this.f1626cj;
        this.f1638cv = 1500.0f;
        this.f1637cu = this.f1638cv;
        this.f3457n.m5172a(-2, -1, 2, 1);
        this.f3458o.m5172a(-2, -1, 2, 2);
    }

    @Override // com.corrodinggames.rts.game.units.p024d.AbstractC0503i, com.corrodinggames.rts.game.units.AbstractC0629y, com.corrodinggames.rts.game.units.AbstractC0244am, com.corrodinggames.rts.gameFramework.AbstractC1155w
    /* renamed from: a */
    public void mo446a(float f) {
        super.mo446a(f);
        if (!m4226bT() || this.f1612bV) {
        }
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: E */
    public PointF mo3056E(int i) {
        f4017bg.setSite(this.f7172eo, this.f7173ep - 3.0f);
        return f4017bg;
    }

    @Override // com.corrodinggames.rts.game.units.p024d.AbstractC0503i, com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: a */
    public void mo3008a(AbstractC0244am abstractC0244am, int i) {
    }

    @Override // com.corrodinggames.rts.game.units.p024d.AbstractC0503i, com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: c */
    public float mo2883c(int i) {
        return 4.0f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: b */
    public boolean mo2929b(int i, float f) {
        return false;
    }

    @Override // com.corrodinggames.rts.game.units.p024d.AbstractC0503i, com.corrodinggames.rts.game.units.p024d.AbstractC0493d, com.corrodinggames.rts.game.units.AbstractC0629y, com.corrodinggames.rts.game.units.AbstractC0244am, com.corrodinggames.rts.gameFramework.AbstractC1155w
    /* renamed from: c */
    public boolean mo438c(float f) {
        return super.mo438c(f);
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: K */
    public EnumC0249ar mo5458r() {
        return EnumC0249ar.NukeLaucher;
    }

    @Override // com.corrodinggames.rts.game.units.p024d.AbstractC0503i, com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: l */
    public boolean mo3067l() {
        return false;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: g */
    public float mo2866g(int i) {
        return 1.0f;
    }

    @Override // com.corrodinggames.rts.game.units.p024d.AbstractC0503i, com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: bV */
    public float mo3310bV() {
        return super.mo3310bV();
    }

    /* renamed from: a */
    public void m3313a(float f, float f2) {
        GameEngine gameEngine = GameEngine.getGameEngine();
        if (this.f3556c <= 0) {
            return;
        }
        if (C0773f.m2216a(this.f7172eo, this.f7173ep, f, f2) < 202500.0f) {
            if (this.f1614bX == gameEngine.f6312bs) {
                gameEngine.f6330bS.m1840b("Nuke target too close");
                return;
            }
            return;
        }
        this.f3556c--;
        PointF mo3056E = mo3056E(0);
        m3312a(this, mo3056E.x, mo3056E.y, f, f2).f984i = 5.0f;
        C0760e m2385a = gameEngine.f6329bR.m2385a(mo3056E.x, mo3056E.y, this.f7174eq, -1127220);
        if (m2385a != null) {
            m2385a.f4830U = 5.0f;
            m2385a.f4816G = 2.1f;
            m2385a.f4815F = 2.1f;
            m2385a.f4873ar = (short) 2;
            m2385a.f4807s = true;
            m2385a.f4808t = 70.0f;
            m2385a.f4831V = 370.0f;
            m2385a.f4832W = m2385a.f4831V;
            m2385a.f4814E = 1.0f;
        }
        C0760e m2359d = gameEngine.f6329bR.m2359d(mo3056E.x, mo3056E.y, 0.0f, -1);
        if (m2359d != null) {
            m2359d.f4816G = 1.0f;
            m2359d.f4815F = 3.1f;
            m2359d.f4873ar = (short) 2;
            m2359d.f4831V = 170.0f;
            m2359d.f4832W = m2359d.f4831V;
            m2359d.f4830U = 5.0f + 20.0f;
        }
        gameEngine.f6324bM.m2811a(C0637e.f4096D, 0.27f, 0.8f, mo3056E.x, mo3056E.y);
    }

    /* renamed from: a */
    public static C0188f m3312a(AbstractC0244am abstractC0244am, float f, float f2, float f3, float f4) {
        C0188f m4525a = C0188f.m4525a(abstractC0244am, f, f2);
        m4525a.m448S(10);
        m4525a.f1017P = (short) 0;
        m4525a.f1018Q = (short) 1;
        m4525a.f1019R = (short) 1;
        m4525a.f999x = 1.0f;
        m4525a.f1055aC = true;
        m4525a.f988m = true;
        m4525a.f989n = f3;
        m4525a.f990o = f4;
        m4525a.f983h = 99999.0f;
        m4525a.f995t = 0.1f;
        m4525a.f993r = 2.7f;
        m4525a.f1044ar = Color.m5243a(255, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_PAIRING, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_PAIRING, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_PAIRING);
        m4525a.f1022U = 300.0f;
        m4525a.f1060aH = true;
        m4525a.f1065aM = true;
        m4525a.f1069aQ = true;
        m4525a.f1004C = true;
        m4525a.f1005D = true;
        m4525a.f1061aI = 80.0f;
        m4525a.f1062aJ = 100.0f;
        m4525a.f1064aL = 1.1f;
        m4525a.f1026Y = 5400.0f;
        m4525a.f1027Z = 250.0f;
        m4525a.f1031ad = true;
        m4525a.f1032ae = false;
        m4525a.f1042ao = true;
        m4525a.f1024W = 75.0f;
        m4525a.f1025X = m4525a.f1024W;
        m4525a.f1078aY = true;
        GameEngine gameEngine = GameEngine.getGameEngine();
        gameEngine.f6329bR.m2364b(EnumC0763h.critical);
        C0760e m2377a = gameEngine.f6329bR.m2377a(m4525a, -1118720);
        if (m2377a != null) {
            m2377a.f4831V = 1300.0f;
            m2377a.f4832W = m2377a.f4831V;
            m2377a.f4814E = 0.2f;
            m2377a.f4816G = 1.0f;
        }
        return m4525a;
    }

    /* renamed from: M */
    public void m3314M() {
        this.f3556c++;
    }

    @Override // com.corrodinggames.rts.game.units.p024d.AbstractC0503i, com.corrodinggames.rts.game.units.p024d.InterfaceC0506l
    /* renamed from: a */
    public void mo3294a(C0504j c0504j) {
        if (c0504j.f3525j.equals(f3564i.m4309N())) {
            m3314M();
        }
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: cm */
    public C0208c mo3292cm() {
        return AbstractC0224s.f1466i;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: a */
    public void mo3167a(AbstractC0224s abstractC0224s, boolean z, PointF pointF, AbstractC0244am abstractC0244am) {
        if (z) {
            return;
        }
        if (abstractC0224s == f3563h) {
            if (pointF == null) {
                GameNetEngine.m1468g("action:" + f3563h.m4309N() + " needs point but it is missing");
                return;
            } else {
                m3313a(pointF.x, pointF.y);
                return;
            }
        }
        super.mo3167a(abstractC0224s, z, pointF, abstractC0244am);
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: N */
    public ArrayList mo3131N() {
        return f3565j;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0244am, com.corrodinggames.rts.gameFramework.AbstractC1155w
    /* renamed from: e */
    public void mo434e(float f) {
        super.mo434e(f);
        C1152y.m453b((AbstractC0244am) this, 450.0f, false);
    }
}