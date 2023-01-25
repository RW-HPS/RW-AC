package com.corrodinggames.rts.game.units.p024d.p025a;

import android.graphics.Color;
import android.graphics.PointF;
import com.corrodinggames.rts.C0067R;
import com.corrodinggames.rts.game.C0188f;
import com.corrodinggames.rts.game.PlayerData;
import com.corrodinggames.rts.game.units.AbstractC0244am;
import com.corrodinggames.rts.game.units.EnumC0249ar;
import com.corrodinggames.rts.game.units.p013a.AbstractC0224s;
import com.corrodinggames.rts.game.units.p013a.AbstractC0228w;
import com.corrodinggames.rts.game.units.p013a.C0208c;
import com.corrodinggames.rts.game.units.p013a.EnumC0225t;
import com.corrodinggames.rts.game.units.p024d.C0504j;
import com.corrodinggames.rts.gameFramework.C0773f;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.p030a.C0637e;
import com.corrodinggames.rts.gameFramework.unitAction.C0970e;
import com.corrodinggames.rts.gameFramework.utility.SlickToAndroidKeycodes;
import java.util.ArrayList;

/* renamed from: com.corrodinggames.rts.game.units.d.a.a */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/d/a/a.class */
public class C0476a extends C0478b {

    /* renamed from: a */
    static C0970e f3401a = null;

    /* renamed from: b */
    static C0970e f3402b = null;

    /* renamed from: c */
    static C0970e f3403c = null;

    /* renamed from: d */
    static C0970e[] f3404d = new C0970e[10];

    /* renamed from: e */
    public static AbstractC0224s f3405e = new AbstractC0228w(102) { // from class: com.corrodinggames.rts.game.units.d.a.a.1
        @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
        /* renamed from: g */
        public boolean mo3089g() {
            return false;
        }

        @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
        /* renamed from: a */
        public String mo3098a() {
            return "-Increases HP, attack damage, and range";
        }

        @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
        /* renamed from: b */
        public String mo3095b() {
            return "Upgrade";
        }

        @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
        /* renamed from: c */
        public int mo3092c() {
            return 1200;
        }

        @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0228w
        /* renamed from: K */
        public float mo3291K() {
            return 0.001f;
        }

        @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
        /* renamed from: a */
        public boolean mo3096a(AbstractC0244am abstractC0244am, boolean z) {
            C0478b c0478b = (C0478b) abstractC0244am;
            if (c0478b.f3407j || c0478b.mo3337a(m4309N(), z) > 0) {
                return false;
            }
            return super.mo3096a(abstractC0244am, z);
        }

        @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
        /* renamed from: b */
        public boolean mo3094b(AbstractC0244am abstractC0244am) {
            if (((C0478b) abstractC0244am).f3407j) {
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

    /* renamed from: f */
    static ArrayList f3406f = new ArrayList();

    static {
        f3406f.add(f3405e);
    }

    @Override // com.corrodinggames.rts.game.units.p024d.p025a.C0478b, com.corrodinggames.rts.game.units.p024d.AbstractC0493d, com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: v */
    public C0970e mo3066v() {
        if (this.f1614bX.site == -1) {
            return null;
        }
        return f3404d[this.f1614bX.m4454R()];
    }

    /* renamed from: b */
    public static void m3457b() {
        GameEngine gameEngine = GameEngine.getGameEngine();
        f3401a = gameEngine.f6326bO.mo222a(C0067R.drawable.anti_air_top);
        f3402b = gameEngine.f6326bO.mo222a(C0067R.drawable.anti_air_top_l2);
        f3403c = gameEngine.f6326bO.mo222a(C0067R.drawable.unit_icon_building_air_turrent);
        f3404d = PlayerData.m4432a(f3403c);
    }

    public C0476a(boolean z) {
        super(z);
        this.f1638cv = 800.0f;
        this.f1637cu = this.f1638cv;
    }

    @Override // com.corrodinggames.rts.game.units.p024d.p025a.C0478b, com.corrodinggames.rts.game.units.p024d.AbstractC0503i, com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: m */
    public float mo2846m() {
        if (!this.f3407j) {
            return 250.0f;
        }
        return 320.0f;
    }

    @Override // com.corrodinggames.rts.game.units.p024d.p025a.C0478b, com.corrodinggames.rts.game.units.p024d.AbstractC0503i, com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: b */
    public float mo2930b(int i) {
        if (!this.f3407j) {
            return 80.0f;
        }
        return 70.0f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: e */
    public float mo2872e(int i) {
        if (!this.f3407j) {
            return super.mo2872e(i);
        }
        if (i == 2) {
            return 25.0f;
        }
        return super.mo2872e(i);
    }

    @Override // com.corrodinggames.rts.game.units.p024d.p025a.C0478b, com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: E */
    public PointF mo3056E(int i) {
        if (!this.f3407j || i == 0) {
            return super.mo3056E(i);
        }
        float f = mo3057E() ? this.f1623cg : this.f1654cL[i].f1717a;
        PointF G = mo3052G(i);
        float f2 = f + (i == 1 ? -30.0f : 30.0f);
        f4017bg.setSite(G.x + (C0773f.m2107k(f2) * 10.0f), G.y + (C0773f.m2110j(f2) * 10.0f));
        return f4017bg;
    }

    @Override // com.corrodinggames.rts.game.units.p024d.p025a.C0478b, com.corrodinggames.rts.game.units.p024d.AbstractC0503i, com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: a */
    public void mo3008a(AbstractC0244am abstractC0244am, int i) {
        PointF mo3056E = mo3056E(i);
        C0188f m4525a = C0188f.m4525a(this, mo3056E.x, mo3056E.y);
        PointF K = mo3046K(i);
        m4525a.f1012K = K.x;
        m4525a.f1013L = K.y;
        m4525a.f995t = 0.3f;
        m4525a.f993r = 6.0f;
        if (!this.f3407j) {
            m4525a.f1044ar = Color.m5243a(255, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_DATA_SERVICE, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_DATA_SERVICE, 50);
            m4525a.f1022U = 60.0f;
            m4525a.f983h = 220.0f;
        } else {
            m4525a.f1044ar = Color.m5243a(255, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_DATA_SERVICE, 50, 50);
            m4525a.f1022U = 60.0f;
            m4525a.f983h = 250.0f;
            m4525a.f995t = 0.5f;
            m4525a.f993r = 7.0f;
        }
        m4525a.f1017P = (short) 4;
        m4525a.f999x = 1.0f;
        m4525a.f987l = abstractC0244am;
        m4525a.f1060aH = false;
        m4525a.f1061aI = 0.0f;
        m4525a.f1062aJ = 0.0f;
        m4525a.f1065aM = true;
        m4525a.f1069aQ = true;
        m4525a.f1059aG = true;
        GameEngine gameEngine = GameEngine.getGameEngine();
        gameEngine.f6324bM.m2811a(C0637e.f4079m, 0.3f, 1.0f + C0773f.m2151c(-0.07f, 0.07f), mo3056E.x, mo3056E.y);
        gameEngine.f6329bR.m2377a(m4525a, -1118720);
        gameEngine.f6329bR.m2385a(mo3056E.x, mo3056E.y, this.f7174eq, -1127220);
    }

    @Override // com.corrodinggames.rts.game.units.p024d.p025a.C0478b, com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: K */
    public EnumC0249ar mo5458r() {
        if (this.f3407j) {
            return EnumC0249ar.antiAirTurretT2;
        }
        return EnumC0249ar.antiAirTurret;
    }

    @Override // com.corrodinggames.rts.game.units.p024d.p025a.C0478b, com.corrodinggames.rts.game.units.p024d.AbstractC0493d, com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: d */
    public C0970e mo2876d(int i) {
        if (!this.f3407j) {
            return f3401a;
        }
        return f3402b;
    }

    @Override // com.corrodinggames.rts.game.units.p024d.p025a.C0478b, com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: af */
    public boolean mo2955af() {
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: ag */
    public boolean mo2954ag() {
        return false;
    }

    @Override // com.corrodinggames.rts.game.units.p024d.p025a.C0478b
    /* renamed from: s */
    public void mo3434s(float f) {
        if (this.f1654cL[0].m4189a()) {
            this.f1654cL[0].f1717a += mo2883c(0) * f * 0.1f;
        }
    }

    @Override // com.corrodinggames.rts.game.units.p024d.p025a.C0478b, com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: g */
    public float mo2866g(int i) {
        return 9.0f;
    }

    @Override // com.corrodinggames.rts.game.units.p024d.p025a.C0478b, com.corrodinggames.rts.game.units.p024d.AbstractC0503i, com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: c */
    public float mo2883c(int i) {
        return 6.0f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: B */
    public float mo3063B() {
        return 1.0f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: u */
    public boolean mo2827u(int i) {
        if (!this.f3407j) {
            return super.mo2827u(i);
        }
        if (i == 0) {
            return false;
        }
        return super.mo2827u(i);
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: v */
    public int mo2826v(int i) {
        if (!this.f3407j) {
            return -1;
        }
        if (i == 1 || i == 2) {
            return 0;
        }
        return -1;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y, com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: bl */
    public int mo2900bl() {
        return 3;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: r */
    public boolean mo2833r(int i) {
        if (!this.f3407j && i > 1) {
            return false;
        }
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.p024d.p025a.C0478b, com.corrodinggames.rts.game.units.p024d.AbstractC0503i, com.corrodinggames.rts.game.units.p024d.InterfaceC0506l
    /* renamed from: a */
    public void mo3294a(C0504j c0504j) {
        if (c0504j.f3525j.equals(f3405e.m4309N())) {
            mo3021a(2);
            m3037W();
        }
    }

    @Override // com.corrodinggames.rts.game.units.p024d.p025a.C0478b, com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: cm */
    public C0208c mo3292cm() {
        if (!this.f3407j) {
            return f3405e.m4309N();
        }
        return AbstractC0224s.f1466i;
    }

    @Override // com.corrodinggames.rts.game.units.p024d.p025a.C0478b, com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: a */
    public void mo3451a(ArrayList arrayList) {
        arrayList.clear();
    }

    @Override // com.corrodinggames.rts.game.units.p024d.p025a.C0478b, com.corrodinggames.rts.game.units.p024d.AbstractC0493d, com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: a */
    public void mo3021a(int i) {
        if (i == 1) {
            this.f3407j = false;
        } else if (i == 2 && !this.f3407j) {
            this.f3407j = true;
            this.f1638cv += 600.0f;
            this.f1637cu += 600.0f;
        }
    }

    @Override // com.corrodinggames.rts.game.units.p024d.p025a.C0478b, com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: N */
    public ArrayList mo3131N() {
        return f3406f;
    }
}