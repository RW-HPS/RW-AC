package com.corrodinggames.rts.game.units.p014b;

import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.Rect;
import com.corrodinggames.rts.C0067R;
import com.corrodinggames.rts.game.C0188f;
import com.corrodinggames.rts.game.PlayerData;
import com.corrodinggames.rts.game.units.AbstractC0244am;
import com.corrodinggames.rts.game.units.EnumC0249ar;
import com.corrodinggames.rts.gameFramework.C0773f;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.net.GameInputStream;
import com.corrodinggames.rts.gameFramework.net.GameOutputStream;
import com.corrodinggames.rts.gameFramework.p030a.C0637e;
import com.corrodinggames.rts.gameFramework.unitAction.C0970e;
import com.corrodinggames.rts.gameFramework.utility.SlickToAndroidKeycodes;

/* renamed from: com.corrodinggames.rts.game.units.b.f */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/b/f.class */
public class C0317f extends AbstractC0309b {

    /* renamed from: a */
    static C0970e f1892a = null;

    /* renamed from: b */
    static C0970e f1893b = null;

    /* renamed from: c */
    static C0970e f1894c = null;

    /* renamed from: d */
    static C0970e f1895d = null;

    /* renamed from: e */
    static C0970e f1896e = null;

    /* renamed from: f */
    static C0970e[] f1897f = new C0970e[10];

    /* renamed from: g */
    boolean f1898g;

    /* renamed from: o */
    float f1899o;

    /* renamed from: p */
    float f1900p;

    /* renamed from: q */
    float f1901q;

    /* renamed from: r */
    Rect f1902r;

    /* renamed from: s */
    Rect f1903s;

    @Override // com.corrodinggames.rts.game.units.p014b.AbstractC0309b, com.corrodinggames.rts.game.units.AbstractC0629y, com.corrodinggames.rts.game.units.AbstractC0244am, com.corrodinggames.rts.gameFramework.AbstractC0674az, com.corrodinggames.rts.gameFramework.AbstractC1155w, com.corrodinggames.rts.gameFramework.AbstractC0741bq
    /* renamed from: a */
    public void mo442a(GameOutputStream gameOutputStream) {
        gameOutputStream.writeFloat(this.f1900p);
        gameOutputStream.writeFloat(this.f1899o);
        super.mo442a(gameOutputStream);
    }

    @Override // com.corrodinggames.rts.game.units.p014b.AbstractC0309b, com.corrodinggames.rts.game.units.AbstractC0629y, com.corrodinggames.rts.game.units.AbstractC0244am, com.corrodinggames.rts.gameFramework.AbstractC0674az, com.corrodinggames.rts.gameFramework.AbstractC1155w
    /* renamed from: a */
    public void mo441a(GameInputStream gameInputStream) {
        if (gameInputStream.m1311b() >= 9) {
            this.f1900p = gameInputStream.readFloat();
            this.f1899o = gameInputStream.readFloat();
            if (gameInputStream.m1311b() == 8) {
                this.f1898g = gameInputStream.readBoolean();
            }
        } else {
            this.f1899o = 0.5f;
        }
        super.mo441a(gameInputStream);
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: b */
    public EnumC0249ar mo5458r() {
        return EnumC0249ar.helicopter;
    }

    /* renamed from: f */
    public static void m4112f() {
        GameEngine gameEngine = GameEngine.getGameEngine();
        f1893b = gameEngine.f6326bO.mo222a(C0067R.drawable.helicopter);
        f1894c = gameEngine.f6326bO.mo222a(C0067R.drawable.helicopter_blades);
        f1895d = gameEngine.f6326bO.mo222a(C0067R.drawable.helicopter_shadow);
        f1896e = gameEngine.f6326bO.mo222a(C0067R.drawable.helicopter_shadow_blades);
        f1892a = gameEngine.f6326bO.mo222a(C0067R.drawable.helicopter_dead);
        f1897f = PlayerData.m4432a(f1893b);
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: d */
    public C0970e mo2879d() {
        if (this.f1612bV) {
            return f1892a;
        }
        return f1897f[this.f1614bX.m4454R()];
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: k */
    public C0970e mo2853k() {
        return f1895d;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: d */
    public C0970e mo2876d(int i) {
        return null;
    }

    @Override // com.corrodinggames.rts.game.units.p014b.AbstractC0309b, com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: e */
    public boolean mo3071e() {
        GameEngine.getGameEngine().f6329bR.m2370b(this.f7172eo, this.f7173ep, this.f7174eq);
        this.f3917M = f1892a;
        m448S(0);
        this.f1610bT = false;
        return true;
    }

    public C0317f(boolean z) {
        super(z);
        this.f1898g = false;
        this.f1900p = 0.0f;
        this.f1902r = new Rect();
        this.f1903s = new Rect();
        m2729T(26);
        m2728U(46);
        this.f1626cj = 13.0f;
        this.f1627ck = this.f1626cj + 2.0f;
        this.f1638cv = 150.0f;
        this.f1637cu = this.f1638cv;
        this.f3917M = f1893b;
        this.f3918N = f1895d;
        this.f7174eq = 0.0f;
        this.f1899o = 0.14f;
        this.f1901q = 0.0f;
        m448S(5);
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: n */
    public void mo3283n() {
        super.mo3283n();
        this.f7174eq = 20.0f;
        this.f1899o = 0.5f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0627w, com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: I */
    public boolean mo3049I() {
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0627w, com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: i */
    public boolean mo3068i() {
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.p014b.AbstractC0309b, com.corrodinggames.rts.game.units.AbstractC0629y, com.corrodinggames.rts.game.units.AbstractC0244am, com.corrodinggames.rts.gameFramework.AbstractC1155w
    /* renamed from: a */
    public void mo446a(float f) {
        super.mo446a(f);
        if (this.f1612bV) {
            return;
        }
        this.f1899o = C0773f.m2217a(this.f1899o, 0.5f, 0.003f * f);
        this.f1901q += 70.0f * this.f1899o * f;
        if (this.f1901q >= 360.0f) {
            this.f1901q -= 360.0f;
            this.f1901q += C0773f.m2196a(this, 0, 4);
        }
        if (this.f1899o > 0.4f) {
            this.f1900p += 2.0f * f;
            if (this.f1900p > 360.0f) {
                this.f1900p -= 360.0f;
            }
            this.f7174eq = C0773f.m2217a(this.f7174eq, 20.0f + (C0773f.m2110j(this.f1900p) * 1.5f), 0.1f * f);
        }
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: a */
    public void mo3008a(AbstractC0244am abstractC0244am, int i) {
        PointF E = mo3056E(i);
        C0188f m4523a = C0188f.m4523a(this, E.x, E.y, this.f7174eq, i);
        PointF K = mo3046K(i);
        m4523a.f1012K = K.x;
        m4523a.f1013L = K.y;
        m4523a.f1022U = 17.0f;
        m4523a.f987l = abstractC0244am;
        m4523a.f983h = 30.0f;
        m4523a.f995t = 8.0f;
        m4523a.f1020S = false;
        m4523a.f1044ar = Color.m5243a(255, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_STB_INPUT, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_STB_INPUT, 0);
        m4523a.f1002A = true;
        m4523a.f1070aR = false;
        GameEngine gameEngine = GameEngine.getGameEngine();
        gameEngine.f6324bM.m2811a(C0637e.f4085s, 0.2f, 1.0f + C0773f.m2151c(-0.08f, 0.08f), E.x, E.y);
        gameEngine.f6329bR.m2390a(E.x, E.y, this.f7174eq, this.f1654cL[i].f1717a);
        gameEngine.f6329bR.m2385a(E.x, E.y, this.f7174eq, -1118720);
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: m */
    public float mo2846m() {
        return 130.0f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: b */
    public float mo2930b(int i) {
        return 60.0f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: z */
    public float mo2822z() {
        if (this.f7174eq < 15.0f) {
            return 0.0f;
        }
        return 2.2f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: bc */
    public float mo2909bc() {
        return 0.1f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: A */
    public float mo3065A() {
        return 6.0f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: B */
    public float mo3063B() {
        return 0.4f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: bi */
    public boolean mo2903bi() {
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: bj */
    public boolean mo2902bj() {
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: c */
    public float mo2883c(int i) {
        return 16.0f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: a_ */
    public Rect mo3227a_(boolean z) {
        return super.mo3227a_(z);
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y, com.corrodinggames.rts.game.units.AbstractC0244am, com.corrodinggames.rts.gameFramework.AbstractC1155w
    /* renamed from: c */
    public boolean mo438c(float f) {
        if (!super.mo438c(f)) {
            return false;
        }
        if (!this.f1612bV) {
            Paint aN = mo2974aN();
            GameEngine gameEngine = GameEngine.getGameEngine();
            this.f1903s.m5172a(0, 0, f1894c.mo387m(), f1894c.mo388l());
            float f2 = this.f1901q;
            if (this.f1631co) {
            }
            gameEngine.f6326bO.mo197a(f1894c, this.f1903s, this.f7172eo - GameEngine.getGameEngine().f6357cw, (this.f7173ep - GameEngine.getGameEngine().f6358cx) - this.f7174eq, f2, aN);
            return true;
        }
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: C */
    public float mo3061C() {
        return 0.07f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: D */
    public float mo3059D() {
        return 0.1f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: l */
    public boolean mo3067l() {
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: g */
    public float mo2866g(int i) {
        return 7.0f;
    }
}