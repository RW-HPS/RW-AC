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
import com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope;
import com.corrodinggames.rts.game.units.p013a.AbstractC0224s;
import com.corrodinggames.rts.game.units.p013a.AbstractC0228w;
import com.corrodinggames.rts.game.units.p013a.C0208c;
import com.corrodinggames.rts.game.units.p013a.EnumC0225t;
import com.corrodinggames.rts.game.units.p013a.EnumC0226u;
import com.corrodinggames.rts.gameFramework.C0773f;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.net.GameInputStream;
import com.corrodinggames.rts.gameFramework.net.GameOutputStream;
import com.corrodinggames.rts.gameFramework.p030a.C0637e;
import com.corrodinggames.rts.gameFramework.p035d.C0760e;
import com.corrodinggames.rts.gameFramework.translations.C0855a;
import com.corrodinggames.rts.gameFramework.unitAction.C0970e;
import com.corrodinggames.rts.gameFramework.utility.C1152y;
import com.corrodinggames.rts.gameFramework.utility.SlickToAndroidKeycodes;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: com.corrodinggames.rts.game.units.d.c */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/d/c.class */
public class C0490c extends AbstractC0503i {

    /* renamed from: c */
    boolean f3446c;

    /* renamed from: d */
    int f3447d;

    /* renamed from: e */
    float f3448e;

    /* renamed from: h */
    PointF f3451h;

    /* renamed from: i */
    Rect f3452i;

    /* renamed from: a */
    static C0970e[] f3444a = new C0970e[10];

    /* renamed from: b */
    static C0970e f3445b = null;

    /* renamed from: f */
    static C0970e f3449f = null;

    /* renamed from: g */
    static C0970e[] f3450g = new C0970e[10];

    /* renamed from: j */
    static AbstractC0224s f3453j = new AbstractC0224s(145) { // from class: com.corrodinggames.rts.game.units.d.c.1
        @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
        /* renamed from: g */
        public boolean mo3089g() {
            return false;
        }

        @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
        /* renamed from: a */
        public String mo3098a() {
            return VariableScope.nullOrMissingString;
        }

        @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
        /* renamed from: b */
        public String mo3095b() {
            return C0855a.m1714a("gui.actions.antiNukeCount", new Object[0]);
        }

        @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
        /* renamed from: c */
        public int mo3092c() {
            return 0;
        }

        @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
        /* renamed from: a */
        public boolean mo3096a(AbstractC0244am abstractC0244am, boolean z) {
            if (mo3093b(abstractC0244am, false) == 0) {
                return false;
            }
            return true;
        }

        @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
        /* renamed from: K */
        public EnumC0249ar mo5457i() {
            return null;
        }

        @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
        /* renamed from: e */
        public EnumC0226u mo3091e() {
            return EnumC0226u.f1479a;
        }

        @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
        /* renamed from: f */
        public EnumC0225t mo3090f() {
            return EnumC0225t.f1469a;
        }

        @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
        /* renamed from: b */
        public int mo3093b(AbstractC0244am abstractC0244am, boolean z) {
            return ((C0490c) abstractC0244am).f3447d;
        }
    };

    /* renamed from: k */
    static AbstractC0224s f3454k = new AbstractC0228w(144) { // from class: com.corrodinggames.rts.game.units.d.c.2
        @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
        /* renamed from: g */
        public boolean mo3089g() {
            return false;
        }

        @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
        /* renamed from: a */
        public String mo3098a() {
            return C0855a.m1714a("gui.actions.buildAntiNuke.description", new Object[0]);
        }

        @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
        /* renamed from: b */
        public String mo3095b() {
            return C0855a.m1714a("gui.actions.buildAntiNuke", new Object[0]);
        }

        @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
        /* renamed from: c */
        public int mo3092c() {
            return 4000;
        }

        @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0228w
        /* renamed from: K */
        public float mo3291K() {
            return 7.0E-4f;
        }

        @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
        /* renamed from: a */
        public boolean mo3096a(AbstractC0244am abstractC0244am, boolean z) {
            C0490c c0490c = (C0490c) abstractC0244am;
            if (c0490c.f3447d + c0490c.mo3337a(m4309N(), z) >= 12.0f) {
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

    /* renamed from: l */
    static ArrayList f3455l = new ArrayList();

    static {
        f3455l.add(f3453j);
        f3455l.add(f3454k);
    }

    @Override // com.corrodinggames.rts.game.units.p024d.AbstractC0503i, com.corrodinggames.rts.game.units.p024d.AbstractC0493d, com.corrodinggames.rts.game.units.AbstractC0629y, com.corrodinggames.rts.game.units.AbstractC0244am, com.corrodinggames.rts.gameFramework.AbstractC0674az, com.corrodinggames.rts.gameFramework.AbstractC1155w, com.corrodinggames.rts.gameFramework.AbstractC0741bq
    /* renamed from: a */
    public void mo442a(GameOutputStream gameOutputStream) {
        gameOutputStream.writeBoolean(this.f3446c);
        gameOutputStream.writeInt(this.f3447d);
        super.mo442a(gameOutputStream);
    }

    @Override // com.corrodinggames.rts.game.units.p024d.AbstractC0503i, com.corrodinggames.rts.game.units.p024d.AbstractC0493d, com.corrodinggames.rts.game.units.AbstractC0629y, com.corrodinggames.rts.game.units.AbstractC0244am, com.corrodinggames.rts.gameFramework.AbstractC0674az, com.corrodinggames.rts.gameFramework.AbstractC1155w
    /* renamed from: a */
    public void mo441a(GameInputStream gameInputStream) {
        this.f3446c = gameInputStream.readBoolean();
        if (gameInputStream.m1311b() >= 30) {
            this.f3447d = gameInputStream.readInt();
        }
        super.mo441a(gameInputStream);
    }

    @Override // com.corrodinggames.rts.game.units.p024d.AbstractC0493d, com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: v */
    public C0970e mo3066v() {
        if (this.f1614bX.site == -1) {
            return null;
        }
        return f3450g[this.f1614bX.m4454R()];
    }

    /* renamed from: b */
    public static void m3408b() {
        GameEngine gameEngine = GameEngine.getGameEngine();
        f3445b = gameEngine.f6326bO.mo222a(C0067R.drawable.antinuke_launcher_dead);
        C0970e mo222a = gameEngine.f6326bO.mo222a(C0067R.drawable.antinuke_launcher);
        f3444a = PlayerData.m4432a(mo222a);
        mo222a.mo51n();
        f3449f = gameEngine.f6326bO.mo222a(C0067R.drawable.unit_icon_building_turrent);
        f3450g = PlayerData.m4432a(f3449f);
    }

    @Override // com.corrodinggames.rts.game.units.p024d.AbstractC0493d
    /* renamed from: L */
    public boolean mo3296L() {
        GameEngine.getGameEngine();
        this.f3917M = f3445b;
        m448S(0);
        this.f1610bT = false;
        m3014a(EnumC0233ab.verylargeBuilding);
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: d */
    public C0970e mo2879d() {
        if (this.f1612bV) {
            return f3445b;
        }
        return f3444a[this.f1614bX.m4454R()];
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

    public C0490c(boolean z) {
        super(z);
        this.f3451h = new PointF();
        this.f3452i = new Rect();
        this.f3917M = f3444a[f3444a.length - 1];
        m2724b(this.f3917M);
        this.f1626cj = 24.0f;
        this.f1627ck = this.f1626cj;
        this.f1638cv = 2800.0f;
        this.f1637cu = this.f1638cv;
        this.f3457n.m5172a(-1, -1, 1, 1);
        this.f3458o.m5172a(-1, -1, 1, 1);
    }

    @Override // com.corrodinggames.rts.game.units.p024d.AbstractC0503i, com.corrodinggames.rts.game.units.AbstractC0629y, com.corrodinggames.rts.game.units.AbstractC0244am, com.corrodinggames.rts.gameFramework.AbstractC1155w
    /* renamed from: a */
    public void mo446a(float f) {
        super.mo446a(f);
        if (m4226bT() && !this.f1612bV && this.f3447d > 0) {
            C0188f c0188f = null;
            this.f3448e = C0773f.m2218a(this.f3448e, f);
            if (this.f3448e == 0.0f) {
                this.f3448e = 15.0f;
                Iterator it = C0188f.f1084a.iterator();
                while (it.hasNext()) {
                    C0188f c0188f2 = (C0188f) it.next();
                    if (c0188f2.f1005D && c0188f2.f7174eq > 50.0f && C0773f.m2216a(this.f7172eo, this.f7173ep, c0188f2.f7172eo, c0188f2.f7173ep) < 2200.0f * 2200.0f && C0773f.m2216a(this.f7172eo, this.f7173ep, c0188f2.f989n, c0188f2.f990o) < 1000000.0f && (c0188f2.f985j == null || (!c0188f2.f985j.f1614bX.m4390d(this.f1614bX) && c0188f2.f985j.f1614bX != this.f1614bX))) {
                        if (!m3409a(c0188f2)) {
                            c0188f = c0188f2;
                        }
                    }
                }
            }
            if (c0188f != null) {
                m3407b(c0188f);
            }
        }
    }

    /* renamed from: a */
    public boolean m3409a(C0188f c0188f) {
        Object[] m535a = C0188f.f1084a.m535a();
        int i = C0188f.f1084a.f7109a;
        for (int i2 = 0; i2 < i; i2++) {
            C0188f c0188f2 = (C0188f) m535a[i2];
            if (c0188f2 != c0188f && c0188f2.f992q == c0188f) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    public void m3407b(C0188f c0188f) {
        GameEngine gameEngine = GameEngine.getGameEngine();
        if (this.f3447d <= 0) {
            return;
        }
        this.f3447d--;
        PointF mo3056E = mo3056E(0);
        C0188f m4525a = C0188f.m4525a(this, mo3056E.x, mo3056E.y);
        m4525a.m448S(10);
        m4525a.f1017P = (short) 10;
        m4525a.f1019R = (short) 0;
        m4525a.f999x = 1.0f;
        m4525a.f1055aC = true;
        m4525a.f992q = c0188f;
        m4525a.f983h = 99999.0f;
        m4525a.f995t = 0.2f;
        m4525a.f993r = 6.5f;
        m4525a.f1044ar = Color.m5243a(255, 80, 60, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_STB_INPUT);
        m4525a.f1022U = 600.0f;
        m4525a.f1060aH = true;
        m4525a.f1065aM = true;
        m4525a.f1069aQ = true;
        m4525a.f1004C = true;
        m4525a.f1061aI = 80.0f;
        m4525a.f1062aJ = 100.0f;
        m4525a.f1064aL = 2.0f;
        gameEngine.f6329bR.m2385a(mo3056E.x, mo3056E.y, this.f7174eq, -1127220);
        C0760e m2359d = gameEngine.f6329bR.m2359d(mo3056E.x, mo3056E.y, 0.0f, -1);
        if (m2359d != null) {
            m2359d.f4816G = 0.5f;
            m2359d.f4815F = 2.1f;
            m2359d.f4873ar = (short) 2;
            m2359d.f4831V = 90.0f;
            m2359d.f4832W = m2359d.f4831V;
            m2359d.f4830U = 0.0f;
        }
        gameEngine.f6324bM.m2811a(C0637e.f4096D, 0.15f, 1.5f, mo3056E.x, mo3056E.y);
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: E */
    public PointF mo3056E(int i) {
        f4017bg.setSite(this.f7172eo, this.f7173ep - 9.0f);
        return f4017bg;
    }

    @Override // com.corrodinggames.rts.game.units.p024d.AbstractC0503i, com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: a */
    public void mo3008a(AbstractC0244am abstractC0244am, int i) {
    }

    @Override // com.corrodinggames.rts.game.units.p024d.AbstractC0503i, com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: m */
    public float mo2846m() {
        return 1000.0f;
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
        return EnumC0249ar.AntiNukeLaucher;
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

    /* renamed from: M */
    public void m3410M() {
        this.f3447d++;
    }

    @Override // com.corrodinggames.rts.game.units.p024d.AbstractC0503i, com.corrodinggames.rts.game.units.p024d.InterfaceC0506l
    /* renamed from: a */
    public void mo3294a(C0504j c0504j) {
        if (c0504j.f3525j.equals(f3454k.m4309N())) {
            m3410M();
        }
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: cm */
    public C0208c mo3292cm() {
        if (this.f3447d < 4) {
            return f3454k.m4309N();
        }
        return AbstractC0224s.f1466i;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: ck */
    public boolean mo3405ck() {
        return false;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: N */
    public ArrayList mo3131N() {
        return f3455l;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0244am, com.corrodinggames.rts.gameFramework.AbstractC1155w
    /* renamed from: e */
    public void mo434e(float f) {
        super.mo434e(f);
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: O */
    public void mo3170O() {
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: cb */
    public void mo3406cb() {
        C1152y.m466a((AbstractC0244am) this, 990.0f, false, true);
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0244am, com.corrodinggames.rts.gameFramework.AbstractC1155w
    /* renamed from: a */
    public boolean mo440a(GameEngine gameEngine) {
        if (this.f1649cG) {
            return true;
        }
        return super.mo440a(gameEngine);
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: a */
    public float mo3073a(AbstractC0244am abstractC0244am, float f, C0188f c0188f) {
        if (f > 2600.0f) {
            f = 2600.0f;
        }
        return super.mo3073a(abstractC0244am, f, c0188f);
    }
}