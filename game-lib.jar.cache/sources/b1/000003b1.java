package com.corrodinggames.rts.game.units.p026e;

import android.graphics.Paint;
import android.graphics.PointF;
import com.corrodinggames.rts.C0067R;
import com.corrodinggames.rts.game.PlayerData;
import com.corrodinggames.rts.game.units.AbstractC0244am;
import com.corrodinggames.rts.game.units.AbstractC0629y;
import com.corrodinggames.rts.game.units.EnumC0233ab;
import com.corrodinggames.rts.game.units.EnumC0249ar;
import com.corrodinggames.rts.game.units.InterfaceC0474d;
import com.corrodinggames.rts.game.units.p013a.AbstractC0224s;
import com.corrodinggames.rts.game.units.p013a.C0218m;
import com.corrodinggames.rts.game.units.p013a.C0227v;
import com.corrodinggames.rts.gameFramework.C0773f;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.unitAction.C0970e;
import com.corrodinggames.rts.gameFramework.utility.C1115ai;
import java.util.ArrayList;

/* renamed from: com.corrodinggames.rts.game.units.e.b */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/e/b.class */
public class C0524b extends AbstractC0534j implements InterfaceC0474d {

    /* renamed from: i */
    PointF[] f3612i;

    /* renamed from: j */
    PointF[] f3613j;

    /* renamed from: k */
    static Paint f3614k;

    /* renamed from: l */
    static Paint f3615l;

    /* renamed from: m */
    static Paint f3616m;

    /* renamed from: a */
    static C0970e f3617a = null;

    /* renamed from: b */
    public static C0970e f3618b = null;

    /* renamed from: c */
    static C0970e f3619c = null;

    /* renamed from: d */
    public static C0970e[] f3620d = new C0970e[10];

    /* renamed from: e */
    public static C0970e f3621e = null;

    /* renamed from: f */
    public static C0970e f3622f = null;

    /* renamed from: g */
    static C0970e f3623g = null;

    /* renamed from: h */
    public static C0970e[] f3624h = new C0970e[10];

    /* renamed from: n */
    static AbstractC0224s f3625n = new C0218m(false);

    @Override // com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: f */
    public EnumC0249ar mo5458r() {
        return EnumC0249ar.builder;
    }

    @Override // com.corrodinggames.rts.game.units.InterfaceC0474d
    /* renamed from: b */
    public PointF[] mo3146b() {
        return this.f3612i;
    }

    @Override // com.corrodinggames.rts.game.units.InterfaceC0474d
    /* renamed from: e_ */
    public PointF[] mo3145e_() {
        return this.f3613j;
    }

    @Override // com.corrodinggames.rts.game.units.p026e.AbstractC0534j, com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: v */
    public C0970e mo3066v() {
        if (this.f1614bX.site == -1) {
            return null;
        }
        return f3624h[this.f1614bX.m4454R()];
    }

    /* renamed from: K */
    public static void m3277K() {
        GameEngine gameEngine = GameEngine.getGameEngine();
        f3617a = gameEngine.f6326bO.mo222a(C0067R.drawable.builder);
        f3618b = gameEngine.f6326bO.mo222a(C0067R.drawable.builder_dead);
        f3619c = m4240a(f3617a, f3617a.mo387m(), f3617a.mo388l());
        f3620d = PlayerData.m4432a(f3617a);
        f3621e = gameEngine.f6326bO.mo222a(C0067R.drawable.builder_charge);
        f3622f = gameEngine.f6326bO.mo222a(C0067R.drawable.builder_decharge);
        f3623g = gameEngine.f6326bO.mo222a(C0067R.drawable.unit_icon_builder);
        f3624h = PlayerData.m4432a(f3623g);
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: a */
    public boolean mo3011a(AbstractC0244am abstractC0244am) {
        if (!abstractC0244am.mo3280q() && abstractC0244am.mo3397bI()) {
            return true;
        }
        return false;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: d */
    public C0970e mo2879d() {
        if (this.f1612bV) {
            return f3618b;
        }
        return f3620d[this.f1614bX.m4454R()];
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: k */
    public C0970e mo2853k() {
        return f3619c;
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
        this.f3917M = f3618b;
        m448S(0);
        this.f1610bT = false;
        m3014a(EnumC0233ab.small);
        return true;
    }

    public C0524b(boolean z) {
        super(z);
        this.f3612i = new PointF[6];
        this.f3613j = new PointF[this.f3612i.length];
        f3614k = new Paint();
        f3614k.m5228a(40, 0, 255, 0);
        f3614k.mo914a(true);
        f3614k.m5231a(2.0f);
        f3614k.m5223a(Paint.Cap.f201b);
        f3615l = new Paint();
        f3615l.m5220a(f3614k);
        f3615l.m5228a(55, 255, 60, 60);
        f3616m = new Paint();
        f3616m.m5228a(60, 255, 255, 255);
        m2729T(20);
        m2728U(20);
        this.f1626cj = 10.0f;
        this.f1627ck = this.f1626cj + 2.0f;
        this.f1638cv = 170.0f;
        this.f1637cu = this.f1638cv;
        this.f3917M = f3617a;
        for (int i = 0; i < this.f3612i.length; i++) {
            this.f3612i[i] = new PointF();
            this.f3613j[i] = new PointF();
        }
    }

    /* renamed from: a */
    public static void m3276a(float f, InterfaceC0474d interfaceC0474d) {
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

    /* renamed from: b */
    public static void m3274b(float f, InterfaceC0474d interfaceC0474d) {
        AbstractC0629y abstractC0629y = (AbstractC0629y) interfaceC0474d;
        AbstractC0244am m3036X = abstractC0629y.m3036X();
        if (m3036X != null) {
            boolean m3035Y = abstractC0629y.m3035Y();
            if (!m3035Y && abstractC0629y.f3999aO) {
                return;
            }
            GameEngine gameEngine = GameEngine.getGameEngine();
            PointF[] mo3146b = interfaceC0474d.mo3146b();
            Paint paint = f3614k;
            if (m3035Y) {
                paint = f3615l;
            }
            C1115ai m2898bn = abstractC0629y.m2898bn();
            for (PointF pointF : mo3146b) {
                float f2 = (m3036X.f7172eo + pointF.x) - gameEngine.f6357cw;
                float f3 = ((m3036X.f7173ep - m3036X.f7174eq) + pointF.y) - gameEngine.f6358cx;
                gameEngine.f6326bO.mo226a((m2898bn.f7064a + (pointF.x * 0.15f)) - gameEngine.f6357cw, (((m2898bn.f7065b - m2898bn.f7066c) + (pointF.y * 0.15f)) - gameEngine.f6358cx) - abstractC0629y.f7174eq, f2, f3, paint);
                gameEngine.f6326bO.mo136k();
                gameEngine.f6326bO.mo169b(f2, f3);
                gameEngine.f6326bO.mo229a(0.5f, 0.5f);
                if (m3035Y) {
                    gameEngine.f6326bO.mo199a(f3622f, 0.0f, 0.0f, f3616m);
                } else {
                    gameEngine.f6326bO.mo199a(f3621e, 0.0f, 0.0f, f3616m);
                }
                gameEngine.f6326bO.mo135l();
            }
        }
    }

    @Override // com.corrodinggames.rts.game.units.p026e.AbstractC0534j, com.corrodinggames.rts.game.units.AbstractC0629y, com.corrodinggames.rts.game.units.AbstractC0244am, com.corrodinggames.rts.gameFramework.AbstractC1155w
    /* renamed from: a */
    public void mo446a(float f) {
        super.mo446a(f);
        if (!this.f1612bV) {
            m3276a(f, this);
        }
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0244am, com.corrodinggames.rts.gameFramework.AbstractC1155w
    /* renamed from: a */
    public void mo445a(float f, boolean z) {
        super.mo445a(f, z);
        if (!this.f1612bV) {
            m3274b(f, this);
        }
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: e */
    public float mo2872e(int i) {
        return 30.0f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: f */
    public float mo2870f(int i) {
        return 1.3f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y, com.corrodinggames.rts.game.units.AbstractC0244am, com.corrodinggames.rts.gameFramework.AbstractC1155w
    /* renamed from: c */
    public boolean mo438c(float f) {
        if (!super.mo438c(f)) {
            return false;
        }
        GameEngine gameEngine = GameEngine.getGameEngine();
        if (!this.f1612bV) {
            float mo2872e = this.f1654cL[0].f1722f / mo2872e(0);
            if (mo2872e != 0.0f) {
                C1115ai bn = m2898bn();
                gameEngine.f6326bO.mo138i();
                gameEngine.f6326bO.mo169b(bn.f7064a - gameEngine.f6357cw, (bn.f7065b - bn.f7066c) - gameEngine.f6358cx);
                gameEngine.f6326bO.mo229a(mo2872e, mo2872e);
                if (m3035Y()) {
                    gameEngine.f6326bO.mo199a(f3622f, 0.0f, 0.0f, (Paint) null);
                } else {
                    gameEngine.f6326bO.mo199a(f3621e, 0.0f, 0.0f, (Paint) null);
                }
                gameEngine.f6326bO.mo137j();
                return true;
            }
            return true;
        }
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: a */
    public void mo3008a(AbstractC0244am abstractC0244am, int i) {
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
        if (m4215cK()) {
            return 0.6f;
        }
        return 0.8f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: A */
    public float mo3065A() {
        if (m4215cK()) {
            return 1.7f;
        }
        return 3.8f;
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

    @Override // com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: a */
    public void mo3130a(AbstractC0224s abstractC0224s, boolean z) {
    }

    /* renamed from: a */
    public static void m3275a(ArrayList arrayList, int i) {
        arrayList.add(f3625n);
        arrayList.add(new C0227v(EnumC0249ar.extractor, 1, 1));
        arrayList.add(new C0227v(EnumC0249ar.turret, 1, 2));
        arrayList.add(new C0227v(EnumC0249ar.antiAirTurret, 1, 3));
        arrayList.add(new C0227v(EnumC0249ar.landFactory, 1, 4));
        arrayList.add(new C0227v(EnumC0249ar.airFactory, 1, 5));
        arrayList.add(new C0227v(EnumC0249ar.seaFactory, 1, 6));
        arrayList.add(new C0227v(EnumC0249ar.laserDefence, 1, 7));
        arrayList.add(new C0227v(EnumC0249ar.repairbay, 1, 8));
        arrayList.add(new C0227v(EnumC0249ar.fabricator, 1, 9));
        arrayList.add(new C0227v(EnumC0249ar.experimentalLandFactory, 1, 10));
        arrayList.add(new C0227v(EnumC0249ar.NukeLaucher, 1, 14));
        arrayList.add(new C0227v(EnumC0249ar.AntiNukeLaucher, 1, 15));
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: N */
    public ArrayList mo3131N() {
        return mo3273f().mo3563a(mo3038V());
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
    /* renamed from: g */
    public boolean mo3142g(AbstractC0244am abstractC0244am, boolean z) {
        return true;
    }
}