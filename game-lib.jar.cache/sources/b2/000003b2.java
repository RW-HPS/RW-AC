package com.corrodinggames.rts.game.units.p026e;

import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.Rect;
import com.corrodinggames.rts.C0067R;
import com.corrodinggames.rts.game.C0188f;
import com.corrodinggames.rts.game.PlayerData;
import com.corrodinggames.rts.game.units.AbstractC0244am;
import com.corrodinggames.rts.game.units.AbstractC0629y;
import com.corrodinggames.rts.game.units.EnumC0233ab;
import com.corrodinggames.rts.game.units.EnumC0249ar;
import com.corrodinggames.rts.gameFramework.C0773f;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.net.GameInputStream;
import com.corrodinggames.rts.gameFramework.net.GameOutputStream;
import com.corrodinggames.rts.gameFramework.unitAction.C0970e;
import com.corrodinggames.rts.gameFramework.utility.C1152y;

/* renamed from: com.corrodinggames.rts.game.units.e.c */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/e/c.class */
public class C0525c extends AbstractC0530h {

    /* renamed from: a */
    static C0970e f3626a = null;

    /* renamed from: b */
    static C0970e f3627b = null;

    /* renamed from: c */
    static C0970e f3628c = null;

    /* renamed from: d */
    public static C0970e f3629d = null;

    /* renamed from: e */
    public static C0970e f3630e = null;

    /* renamed from: f */
    static C0970e[] f3631f = new C0970e[10];

    /* renamed from: g */
    int f3632g;

    /* renamed from: h */
    float f3633h;

    /* renamed from: i */
    C0188f f3634i;

    /* renamed from: j */
    Rect f3635j;

    /* renamed from: k */
    Paint f3636k;

    @Override // com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: b */
    public EnumC0249ar mo5458r() {
        return EnumC0249ar.experimentalHoverTank;
    }

    /* renamed from: f */
    public static void m3271f() {
        GameEngine gameEngine = GameEngine.getGameEngine();
        C0970e mo222a = gameEngine.f6326bO.mo222a(C0067R.drawable.experimental_hovertank);
        f3631f = PlayerData.m4432a(mo222a);
        f3626a = gameEngine.f6326bO.mo222a(C0067R.drawable.experimental_hovertank_dead);
        f3627b = gameEngine.f6326bO.mo222a(C0067R.drawable.experimental_hovertank_turret);
        f3628c = m4240a(mo222a, mo222a.mo387m() / 1, mo222a.mo388l());
        f3629d = gameEngine.f6326bO.mo222a(C0067R.drawable.experimental_hovertank_shield);
        f3630e = gameEngine.f6326bO.mo222a(C0067R.drawable.shield_mid);
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y, com.corrodinggames.rts.game.units.AbstractC0244am, com.corrodinggames.rts.gameFramework.AbstractC0674az, com.corrodinggames.rts.gameFramework.AbstractC1155w, com.corrodinggames.rts.gameFramework.AbstractC0741bq
    /* renamed from: a */
    public void mo442a(GameOutputStream gameOutputStream) {
        if (this.f3634i != null && this.f3634i.f7167ej) {
            this.f3634i = null;
        }
        gameOutputStream.mo1383a(this.f3634i);
        super.mo442a(gameOutputStream);
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y, com.corrodinggames.rts.game.units.AbstractC0244am, com.corrodinggames.rts.gameFramework.AbstractC0674az, com.corrodinggames.rts.gameFramework.AbstractC1155w
    /* renamed from: a */
    public void mo441a(GameInputStream gameInputStream) {
        this.f3634i = (C0188f) gameInputStream.m1316a(C0188f.class);
        super.mo441a(gameInputStream);
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: d */
    public C0970e mo2879d() {
        if (this.f1612bV) {
            return f3626a;
        }
        return f3631f[this.f1614bX.m4454R()];
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: k */
    public C0970e mo2853k() {
        return f3628c;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: F */
    public boolean mo3055F() {
        return GameEngine.getGameEngine().settingsEngine.renderExtraShadows && this.f7174eq > -2.0f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: G */
    public float mo3053G() {
        return 4.0f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: H */
    public float mo3051H() {
        return 4.0f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: d */
    public C0970e mo2876d(int i) {
        return f3627b;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: T */
    public C0970e mo3040T() {
        return f3629d;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: e */
    public boolean mo3071e() {
        GameEngine.getGameEngine();
        this.f3917M = f3626a;
        m448S(0);
        this.f1610bT = false;
        m3014a(EnumC0233ab.largeUnit);
        return true;
    }

    public C0525c(boolean z) {
        super(z);
        this.f3633h = 0.0f;
        this.f3635j = new Rect();
        this.f3636k = C1152y.m481a();
        m2725a(f3631f[7], 1);
        this.f1626cj = 30.0f;
        this.f1627ck = this.f1626cj + 1.0f;
        this.f1638cv = 3500.0f;
        this.f1637cu = this.f1638cv;
        this.f1643cA = 5000.0f;
        this.f1640cx = this.f1643cA;
        this.f3917M = f3631f[7];
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: bW */
    public float mo3235bW() {
        if (this.f1643cA > 0.0f && this.f1640cx < this.f1643cA) {
            return this.f1640cx / this.f1643cA;
        }
        return super.mo3235bW();
    }

    @Override // com.corrodinggames.rts.game.units.p026e.AbstractC0530h, com.corrodinggames.rts.game.units.p026e.AbstractC0534j, com.corrodinggames.rts.game.units.AbstractC0629y, com.corrodinggames.rts.game.units.AbstractC0244am, com.corrodinggames.rts.gameFramework.AbstractC1155w
    /* renamed from: a */
    public void mo446a(float f) {
        super.mo446a(f);
        if (this.f1612bV || !m4226bT()) {
            return;
        }
        if (!this.f1612bV) {
            if (this.f1628cl != 0.0f) {
                m448S(2);
            } else {
                m448S(4);
            }
        }
        if (this.f1653cK) {
        }
        this.f3633h += 1.0f * f;
        if (this.f3633h > 360.0f) {
            this.f3633h -= 360.0f;
        }
        this.f7174eq = C0773f.m2217a(this.f7174eq, 4.0f + (C0773f.m2110j(this.f3633h) * 2.0f), 0.1f * f);
        this.f1640cx = C0773f.m2217a(this.f1640cx, this.f1643cA, 0.25f * f);
        this.f1641cy = C0773f.m2217a(this.f1641cy, 0.0f, 4.0f * f);
        if (this.f1641cy > 50.0f) {
            this.f1641cy = 50.0f;
        }
        if (this.f3634i != null) {
            PointF E = mo3056E(0);
            this.f3634i.f7172eo = E.x;
            this.f3634i.f7173ep = E.y;
            this.f3634i.f7174eq = this.f7174eq;
            if (this.f3634i.f7167ej) {
                this.f3634i = null;
            }
        }
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: bN */
    public float mo3136bN() {
        return 80000.0f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: L */
    public float mo3045L(int i) {
        return 0.0f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: K */
    public PointF mo3046K(int i) {
        PointF K = super.mo3046K(i);
        if (this.f3634i != null) {
            K.x += this.f3634i.f1012K;
            K.y += this.f3634i.f1013L;
        }
        return K;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: q */
    public float mo2835q(int i) {
        return 0.0f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: a */
    public void mo3008a(AbstractC0244am abstractC0244am, int i) {
        GameEngine.getGameEngine();
        PointF E = mo3056E(i);
        if (this.f3634i != null) {
            boolean z = false;
            if (this.f3634i.f7167ej) {
                z = true;
            }
            if (this.f3634i.f987l != abstractC0244am) {
                z = true;
            }
            if (z) {
                this.f3634i = null;
            }
        }
        float mo2930b = mo2930b(i) + mo2872e(i) + 5.0f;
        if (this.f3634i != null) {
            this.f3634i.f983h = mo2930b;
            return;
        }
        C0188f m4525a = C0188f.m4525a(this, E.x, E.y);
        m4525a.f1022U = 380.0f;
        m4525a.f987l = abstractC0244am;
        m4525a.f983h = mo2930b;
        m4525a.f1003B = true;
        m4525a.f1002A = true;
        m4525a.f1069aQ = true;
        m4525a.f1006E = true;
        m4525a.f1011J = 70.0f;
        m4525a.f1007F = 230.0f;
        m4525a.f1038ak = 0.75f;
        m4525a.f7170em = this.f7170em;
        this.f3634i = m4525a;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: m */
    public float mo2846m() {
        return 180.0f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: b */
    public float mo2930b(int i) {
        return 8.0f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: e */
    public float mo2872e(int i) {
        return 8.0f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: z */
    public float mo2822z() {
        return 0.6f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: bc */
    public float mo2909bc() {
        return 1.0f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: A */
    public float mo3065A() {
        return 1.1f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: B */
    public float mo3063B() {
        return 0.03f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: c */
    public float mo2883c(int i) {
        return 1.5f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: C */
    public float mo3061C() {
        return 0.02f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: D */
    public float mo3059D() {
        return 0.02f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: a_ */
    public Rect mo3227a_(boolean z) {
        if (this.f1612bV && !z) {
            return super.mo3227a_(z);
        }
        if (z) {
            return super.mo3227a_(z);
        }
        int i = 0 + (this.f3632g * this.f4260es);
        this.f3635j.m5172a(i, 0, i + this.f4260es, 0 + this.f4261et);
        return this.f3635j;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y, com.corrodinggames.rts.game.units.AbstractC0244am, com.corrodinggames.rts.gameFramework.AbstractC1155w
    /* renamed from: c */
    public boolean mo438c(float f) {
        C0970e mo3040T;
        if (!super.mo438c(f)) {
            return false;
        }
        C1152y.m463a((AbstractC0629y) this);
        if (!this.f1612bV) {
            float f2 = 0.0f;
            if (this.f3634i != null) {
                f2 = C0773f.m2172b(this.f3634i.m4516e(), 0.25f) * 3.0f;
            }
            C1152y.m461a(this, C0536l.f3694e, f2, 0);
        }
        GameEngine gameEngine = GameEngine.getGameEngine();
        if (!this.f1612bV && this.f1640cx > 0.0f && this.f1642cz == 0.0f && (mo3040T = mo3040T()) != null) {
            this.f3636k.m5228a((int) ((0.09f + ((this.f1640cx / this.f1643cA) * 0.4f) + ((C0773f.m2172b(this.f1641cy, 50.0f) / 50.0f) * 0.5f)) * 255.0f), 255, 255, 255);
            gameEngine.f6326bO.mo200a(mo3040T, this.f7172eo - gameEngine.f6357cw, (this.f7173ep - gameEngine.f6358cx) - this.f7174eq, mo3259d(false) - 90.0f, this.f3636k);
            return true;
        }
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: l */
    public boolean mo3067l() {
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: af */
    public boolean mo2955af() {
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: g */
    public float mo2866g(int i) {
        return 8.0f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: G */
    public PointF mo3052G(int i) {
        f4018bh.setSite(this.f7172eo, this.f7173ep);
        return f4018bh;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y, com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: bl */
    public int mo2900bl() {
        return 1;
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

    @Override // com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: cw */
    public int mo3268cw() {
        return 5;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: dd */
    public boolean mo3267dd() {
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0244am, com.corrodinggames.rts.gameFramework.AbstractC1155w
    /* renamed from: e */
    public void mo434e(float f) {
        super.mo434e(f);
        C1152y.m471a(this, mo2846m());
    }
}