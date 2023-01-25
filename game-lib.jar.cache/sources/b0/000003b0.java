package com.corrodinggames.rts.game.units.p026e;

import android.graphics.Color;
import android.graphics.PointF;
import com.corrodinggames.rts.C0067R;
import com.corrodinggames.rts.game.C0188f;
import com.corrodinggames.rts.game.PlayerData;
import com.corrodinggames.rts.game.units.AbstractC0244am;
import com.corrodinggames.rts.game.units.EnumC0233ab;
import com.corrodinggames.rts.game.units.EnumC0249ar;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.p030a.C0637e;
import com.corrodinggames.rts.gameFramework.p035d.C0760e;
import com.corrodinggames.rts.gameFramework.unitAction.C0970e;
import com.corrodinggames.rts.gameFramework.utility.C1152y;
import com.corrodinggames.rts.gameFramework.utility.SlickToAndroidKeycodes;

/* renamed from: com.corrodinggames.rts.game.units.e.a */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/e/a.class */
public class C0523a extends AbstractC0534j {

    /* renamed from: a */
    static C0970e f3608a = null;

    /* renamed from: b */
    static C0970e f3609b = null;

    /* renamed from: c */
    static C0970e f3610c = null;

    /* renamed from: d */
    static C0970e[] f3611d = new C0970e[10];

    @Override // com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: b */
    public EnumC0249ar mo5458r() {
        return EnumC0249ar.artillery;
    }

    /* renamed from: f */
    public static void m3278f() {
        GameEngine gameEngine = GameEngine.getGameEngine();
        f3608a = gameEngine.f6326bO.mo222a(C0067R.drawable.artillery2);
        f3609b = gameEngine.f6326bO.mo222a(C0067R.drawable.artillery1_dead);
        f3611d = PlayerData.m4432a(f3608a);
        f3610c = m4241a(f3608a);
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: d */
    public C0970e mo2879d() {
        if (this.f1612bV) {
            return f3609b;
        }
        return f3611d[this.f1614bX.m4454R()];
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: k */
    public C0970e mo2853k() {
        return f3610c;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: F */
    public boolean mo3055F() {
        return GameEngine.getGameEngine().settingsEngine.renderExtraShadows && !this.f1612bV;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: G */
    public float mo3053G() {
        return 3.0f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: H */
    public float mo3051H() {
        return 3.0f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: d */
    public C0970e mo2876d(int i) {
        return null;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: e */
    public boolean mo3071e() {
        GameEngine.getGameEngine();
        this.f3917M = f3609b;
        m448S(0);
        this.f1610bT = false;
        m3014a(EnumC0233ab.normal);
        return true;
    }

    public C0523a(boolean z) {
        super(z);
        m2729T(28);
        m2728U(50);
        this.f1626cj = 18.0f;
        this.f1627ck = this.f1626cj;
        this.f1638cv = 140.0f;
        this.f1637cu = this.f1638cv;
        this.f3917M = f3608a;
    }

    @Override // com.corrodinggames.rts.game.units.p026e.AbstractC0534j, com.corrodinggames.rts.game.units.AbstractC0629y, com.corrodinggames.rts.game.units.AbstractC0244am, com.corrodinggames.rts.gameFramework.AbstractC1155w
    /* renamed from: a */
    public void mo446a(float f) {
        super.mo446a(f);
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: a */
    public void mo3008a(AbstractC0244am abstractC0244am, int i) {
        PointF E = mo3056E(i);
        C0188f m4525a = C0188f.m4525a(this, E.x, E.y);
        PointF K = mo3046K(i);
        m4525a.f1012K = K.x;
        m4525a.f1013L = K.y;
        m4525a.f983h = 150.0f;
        m4525a.f995t = 4.0f;
        m4525a.f1069aQ = true;
        m4525a.f1044ar = Color.m5243a(255, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_BUTTON_3, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_BUTTON_3, 80);
        m4525a.f1019R = (short) 2;
        m4525a.f1017P = (short) 1;
        m4525a.f999x = 0.9f;
        PointF m4252a = abstractC0244am.m4252a(E.x, E.y, m4525a.f995t, m4525a.f983h, mo2846m());
        m4525a.f1055aC = true;
        m4525a.f988m = true;
        m4525a.f989n = m4252a.x;
        m4525a.f990o = m4252a.y;
        m4525a.f1026Y = 80.0f;
        m4525a.f1027Z = 45.0f;
        m4525a.f1028aa = true;
        GameEngine gameEngine = GameEngine.getGameEngine();
        gameEngine.f6324bM.m2812a(C0637e.f4084r, 0.3f, E.x, E.y);
        gameEngine.f6329bR.m2390a(E.x, E.y, this.f7174eq, this.f1654cL[i].f1717a);
        C0760e m2385a = gameEngine.f6329bR.m2385a(E.x, E.y, this.f7174eq, -1118482);
        if (m2385a != null) {
            m2385a.f4831V = 15.0f;
            m2385a.f4832W = m2385a.f4831V;
        }
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: bW */
    public float mo3235bW() {
        if (this.f1654cL[0].f1721e > 0.0f) {
            return 1.0f - (this.f1654cL[0].f1721e / mo2930b(0));
        }
        return super.mo3235bW();
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: m */
    public float mo2846m() {
        return 290.0f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: b */
    public float mo2930b(int i) {
        return 240.0f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: z */
    public float mo2822z() {
        return 0.9f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: A */
    public float mo3065A() {
        return 1.7f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: B */
    public float mo3063B() {
        return 0.05f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: c */
    public float mo2883c(int i) {
        return 99.0f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: l */
    public boolean mo3067l() {
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: af */
    public boolean mo2955af() {
        return false;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: E */
    public boolean mo3057E() {
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: g */
    public float mo2866g(int i) {
        return 20.0f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: C */
    public float mo3061C() {
        return 0.05f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: D */
    public float mo3059D() {
        return 0.12f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0244am, com.corrodinggames.rts.gameFramework.AbstractC1155w
    /* renamed from: e */
    public void mo434e(float f) {
        super.mo434e(f);
        C1152y.m471a(this, mo2846m());
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: bN */
    public float mo3136bN() {
        return 14000.0f;
    }
}