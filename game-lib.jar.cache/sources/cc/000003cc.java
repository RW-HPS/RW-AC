package com.corrodinggames.rts.game.units;

import android.graphics.Paint;
import android.graphics.PointF;
import com.corrodinggames.rts.game.C0188f;
import com.corrodinggames.rts.game.PlayerData;
import com.corrodinggames.rts.game.p012b.C0179f;
import com.corrodinggames.rts.game.units.custom.C0458l;
import com.corrodinggames.rts.game.units.p026e.AbstractC0534j;
import com.corrodinggames.rts.game.units.p026e.C0524b;
import com.corrodinggames.rts.gameFramework.AbstractC1155w;
import com.corrodinggames.rts.gameFramework.C0773f;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.p030a.C0637e;
import com.corrodinggames.rts.gameFramework.unitAction.C0970e;

/* renamed from: com.corrodinggames.rts.game.units.g */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/g.class */
public class C0551g extends AbstractC0534j implements InterfaceC0474d {

    /* renamed from: a */
    public boolean f3776a;

    /* renamed from: b */
    PointF[] f3777b;

    /* renamed from: c */
    PointF[] f3778c;

    /* renamed from: d */
    static Paint f3779d;

    /* renamed from: e */
    static Paint f3780e;

    /* renamed from: f */
    static Paint f3781f;

    /* renamed from: g */
    int f3782g;

    /* renamed from: h */
    float f3783h;

    /* renamed from: i */
    float f3784i;

    /* renamed from: j */
    int f3785j;

    @Override // com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: f */
    public EnumC0249ar mo5458r() {
        return EnumC0249ar.f1747h;
    }

    @Override // com.corrodinggames.rts.game.units.InterfaceC0474d
    /* renamed from: b */
    public PointF[] mo3146b() {
        return this.f3777b;
    }

    @Override // com.corrodinggames.rts.game.units.InterfaceC0474d
    /* renamed from: e_ */
    public PointF[] mo3145e_() {
        return this.f3778c;
    }

    @Override // com.corrodinggames.rts.game.units.p026e.AbstractC0534j, com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: v */
    public C0970e mo3066v() {
        if (this.f1614bX.site == -1) {
            return null;
        }
        return f3681dN[this.f1614bX.m4454R()];
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: a */
    public boolean mo3011a(AbstractC0244am abstractC0244am) {
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: d */
    public C0970e mo2879d() {
        if (this.f1612bV) {
            return C0524b.f3618b;
        }
        return C0524b.f3620d[this.f1614bX.m4454R()];
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: k */
    public C0970e mo2853k() {
        return null;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: d */
    public C0970e mo2876d(int i) {
        return null;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: e */
    public boolean mo3071e() {
        GameEngine gameEngine = GameEngine.getGameEngine();
        gameEngine.f6329bR.m2370b(this.f7172eo, this.f7173ep, this.f7174eq);
        this.f3917M = C0524b.f3618b;
        m448S(0);
        this.f1610bT = false;
        gameEngine.f6324bM.m2812a(C0637e.f4081o, 0.8f, this.f7172eo, this.f7173ep);
        mo2895bq();
        return true;
    }

    public C0551g(boolean z) {
        super(z);
        this.f3777b = new PointF[6];
        this.f3778c = new PointF[this.f3777b.length];
        f3779d = new Paint();
        f3779d.m5228a(40, 0, 255, 0);
        f3779d.mo914a(true);
        f3779d.m5231a(2.0f);
        f3779d.m5223a(Paint.Cap.f201b);
        f3780e = new Paint();
        f3780e.m5220a(f3779d);
        f3780e.m5228a(55, 255, 60, 60);
        f3781f = new Paint();
        f3781f.m5228a(60, 255, 255, 255);
        m2729T(20);
        m2728U(20);
        this.f1626cj = 10.0f;
        this.f7172eo = -1000.0f;
        this.f7173ep = -1000.0f;
        this.f1627ck = this.f1626cj;
        this.f1638cv = 170000.0f;
        this.f1637cu = this.f1638cv;
        this.f3917M = C0524b.f3618b;
        for (int i = 0; i < this.f3777b.length; i++) {
            this.f3777b[i] = new PointF();
            this.f3778c[i] = new PointF();
        }
    }

    /* renamed from: a */
    public static void m3193a(float f, InterfaceC0474d interfaceC0474d) {
        AbstractC0629y abstractC0629y = (AbstractC0629y) interfaceC0474d;
        PointF[] mo3146b = interfaceC0474d.mo3146b();
        PointF[] mo3145e_ = interfaceC0474d.mo3145e_();
        AbstractC0244am m3036X = abstractC0629y.m3036X();
        abstractC0629y.f3998aN = m3036X != null;
        if (m3036X != null) {
            for (int i = 0; i < mo3146b.length; i++) {
                PointF pointF = mo3146b[i];
                PointF pointF2 = mo3145e_[i];
                pointF.x = C0773f.m2217a(pointF.x, pointF2.x, 0.1f * f);
                pointF.y = C0773f.m2217a(pointF.y, pointF2.y, 0.1f * f);
                pointF.x += (pointF2.x - pointF.x) * 0.04f * f;
                pointF.y += (pointF2.y - pointF.y) * 0.04f * f;
                float f2 = m3036X.f1626cj * 0.75f;
                if (C0773f.m2152c(pointF.x - pointF2.x) < 1.0f) {
                    pointF2.x = C0773f.m2140d(-f2, f2);
                }
                if (C0773f.m2152c(pointF.y - pointF2.y) < 1.0f) {
                    pointF2.y = C0773f.m2140d(-f2, f2);
                }
            }
        } else if (mo3146b[0].x != 0.0f || mo3146b[0].y != 0.0f) {
            for (int i2 = 0; i2 < mo3146b.length; i2++) {
                PointF pointF3 = mo3146b[i2];
                PointF pointF4 = mo3145e_[i2];
                pointF3.x = 0.0f;
                pointF3.y = 0.0f;
                pointF4.x = 0.0f;
                pointF4.y = 0.0f;
            }
        }
    }

    @Override // com.corrodinggames.rts.game.units.p026e.AbstractC0534j, com.corrodinggames.rts.game.units.AbstractC0629y, com.corrodinggames.rts.game.units.AbstractC0244am, com.corrodinggames.rts.gameFramework.AbstractC1155w
    /* renamed from: a */
    public void mo446a(float f) {
        super.mo446a(f);
        if (!this.f1612bV) {
            m3193a(f, this);
        }
        this.f1637cu = this.f1638cv;
        this.f3782g++;
        this.f3783h += f;
        this.f3784i += f;
        GameEngine.getGameEngine();
        if (this.f3776a) {
            GameEngine.m5460e("Stress test active");
            for (int i = 0; i < 6000; i++) {
                m3191w();
            }
            m4210ci();
        } else if (this.f3784i > 3.0f) {
            this.f3784i = 0.0f;
            m3191w();
        }
    }

    /* renamed from: w */
    public void m3191w() {
        GameEngine gameEngine = GameEngine.getGameEngine();
        this.f3785j++;
        InterfaceC0303as interfaceC0303as = (InterfaceC0303as) EnumC0249ar.f1796ae.get(C0773f.m2195a((AbstractC1155w) this, 0, EnumC0249ar.f1796ae.size() - 1, 1 + this.f3785j));
        boolean z = true;
        if (C0458l.f2933b == interfaceC0303as) {
            z = false;
        }
        if (interfaceC0303as == EnumC0249ar.f1784S) {
            z = false;
        }
        if (z) {
            AbstractC0244am mo3564a = interfaceC0303as.mo3564a();
            mo3564a.f7172eo = C0773f.m2195a((AbstractC1155w) this, 200, ((int) gameEngine.f6323bL.m4601i()) - 200, 2 + this.f3782g + this.f3785j);
            mo3564a.f7173ep = C0773f.m2195a((AbstractC1155w) this, 200, ((int) gameEngine.f6323bL.m4600j()) - 200, 3 + this.f3782g + this.f3785j + (this.f3785j * 9));
            try {
                mo3564a.m4253Q(C0773f.m2195a((AbstractC1155w) this, 0, 3, 4 + this.f3782g + this.f3785j + (this.f3785j * 9)));
                PlayerData.m4401c(mo3564a);
                if (mo3564a.mo1745u()) {
                    mo3564a.mo447a();
                }
                if (mo3564a.mo3635bO()) {
                    mo3564a.mo447a();
                }
            } catch (C0179f e) {
                throw new RuntimeException(e);
            }
        }
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0244am, com.corrodinggames.rts.gameFramework.AbstractC1155w
    /* renamed from: a */
    public void mo445a(float f, boolean z) {
        if (!this.f1612bV) {
        }
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: e */
    public float mo2872e(int i) {
        return 0.0f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: f */
    public float mo2870f(int i) {
        return 0.0f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y, com.corrodinggames.rts.game.units.AbstractC0244am, com.corrodinggames.rts.gameFramework.AbstractC1155w
    /* renamed from: c */
    public boolean mo438c(float f) {
        if (!super.mo438c(f)) {
            return false;
        }
        GameEngine.getGameEngine();
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: a */
    public void mo3008a(AbstractC0244am abstractC0244am, int i) {
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: b_ */
    public boolean mo2912b_() {
        return false;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: y */
    public int mo3138y() {
        return 850000;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: b */
    public float mo3164b(AbstractC0244am abstractC0244am) {
        return 1.0E7f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: c */
    public float mo3163c(AbstractC0244am abstractC0244am) {
        return 1.0E7f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: m */
    public float mo2846m() {
        return 30.0f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: b */
    public float mo2930b(int i) {
        return 100.0f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: z */
    public float mo2822z() {
        return 0.0f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: A */
    public float mo3065A() {
        if (m4215cK()) {
            return 4.7f;
        }
        return 4.8f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: B */
    public float mo3063B() {
        return 0.35f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: c */
    public float mo2883c(int i) {
        return 99.0f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: l */
    public boolean mo3067l() {
        return false;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: C */
    public float mo3061C() {
        return 0.04f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: D */
    public float mo3059D() {
        return 0.1f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: E */
    public boolean mo3057E() {
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: g */
    public float mo2866g(int i) {
        return 10.0f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: F */
    public boolean mo3055F() {
        return GameEngine.getGameEngine().settingsEngine.renderExtraShadows && !this.f1612bV;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: G */
    public float mo3053G() {
        return 1.0f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: H */
    public float mo3051H() {
        return 1.0f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: u */
    public boolean mo1745u() {
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0627w, com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: I */
    public boolean mo3049I() {
        return false;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: d */
    public boolean mo3072d(AbstractC0244am abstractC0244am) {
        return false;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: J */
    public boolean mo3076J() {
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: a */
    public float mo3073a(AbstractC0244am abstractC0244am, float f, C0188f c0188f) {
        return super.mo3073a(abstractC0244am, 0.0f, c0188f);
    }
}