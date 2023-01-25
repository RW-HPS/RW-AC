package com.corrodinggames.rts.game.units.p029h;

import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.Rect;
import com.corrodinggames.rts.C0067R;
import com.corrodinggames.rts.game.PlayerData;
import com.corrodinggames.rts.game.units.AbstractC0244am;
import com.corrodinggames.rts.game.units.AbstractC0629y;
import com.corrodinggames.rts.game.units.EnumC0249ar;
import com.corrodinggames.rts.game.units.InterfaceC0303as;
import com.corrodinggames.rts.game.units.InterfaceC0474d;
import com.corrodinggames.rts.game.units.p013a.AbstractC0224s;
import com.corrodinggames.rts.game.units.p013a.C0218m;
import com.corrodinggames.rts.game.units.p013a.C0227v;
import com.corrodinggames.rts.game.units.p026e.C0524b;
import com.corrodinggames.rts.gameFramework.C0773f;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.unitAction.C0970e;
import com.corrodinggames.rts.gameFramework.utility.C1152y;
import java.util.ArrayList;

/* renamed from: com.corrodinggames.rts.game.units.h.b */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/h/b.class */
public class C0590b extends AbstractC0596f implements InterfaceC0474d {

    /* renamed from: f */
    PointF[] f3850f;

    /* renamed from: g */
    PointF[] f3851g;

    /* renamed from: h */
    Rect f3852h;

    /* renamed from: a */
    static C0970e f3845a = null;

    /* renamed from: b */
    static C0970e f3846b = null;

    /* renamed from: c */
    static C0970e f3847c = null;

    /* renamed from: d */
    static C0970e f3848d = null;

    /* renamed from: e */
    static C0970e[] f3849e = new C0970e[10];

    /* renamed from: i */
    static AbstractC0224s f3853i = new C0218m(false);

    @Override // com.corrodinggames.rts.game.units.p029h.AbstractC0596f, com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: v */
    public C0970e mo3066v() {
        if (this.f1614bX.site == -1) {
            return null;
        }
        return C0524b.f3624h[this.f1614bX.m4454R()];
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: f */
    public EnumC0249ar mo5458r() {
        return EnumC0249ar.builderShip;
    }

    @Override // com.corrodinggames.rts.game.units.InterfaceC0474d
    /* renamed from: b */
    public PointF[] mo3146b() {
        return this.f3850f;
    }

    @Override // com.corrodinggames.rts.game.units.InterfaceC0474d
    /* renamed from: e_ */
    public PointF[] mo3145e_() {
        return this.f3851g;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: bN */
    public float mo3136bN() {
        return 6000.0f;
    }

    /* renamed from: t_ */
    public static void m3141t_() {
        GameEngine gameEngine = GameEngine.getGameEngine();
        f3846b = gameEngine.f6326bO.mo222a(C0067R.drawable.builder_ship);
        f3845a = gameEngine.f6326bO.mo222a(C0067R.drawable.builder_ship_dead);
        f3847c = gameEngine.f6326bO.mo222a(C0067R.drawable.builder_ship_turret);
        f3849e = PlayerData.m4432a(f3846b);
        f3848d = m4240a(f3846b, f3846b.mo387m(), f3846b.mo388l());
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: d */
    public C0970e mo2879d() {
        if (this.f1612bV) {
            return f3845a;
        }
        return f3849e[this.f1614bX.m4454R()];
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: d */
    public C0970e mo2876d(int i) {
        return f3847c;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: k */
    public C0970e mo2853k() {
        return f3848d;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: F */
    public boolean mo3055F() {
        return GameEngine.getGameEngine().settingsEngine.renderExtraShadows && this.f7174eq > -2.0f;
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

    @Override // com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: e */
    public boolean mo3071e() {
        GameEngine.getGameEngine().f6329bR.m2370b(this.f7172eo, this.f7173ep, this.f7174eq);
        this.f3917M = f3845a;
        m448S(0);
        this.f1610bT = false;
        return true;
    }

    public C0590b(boolean z) {
        super(z);
        this.f3850f = new PointF[6];
        this.f3851g = new PointF[this.f3850f.length];
        this.f3852h = new Rect();
        m2724b(f3846b);
        this.f1626cj = 13.0f;
        this.f1627ck = this.f1626cj;
        this.f1638cv = 500.0f;
        this.f1637cu = this.f1638cv;
        this.f3917M = f3846b;
        for (int i = 0; i < this.f3850f.length; i++) {
            this.f3850f[i] = new PointF();
            this.f3851g[i] = new PointF();
        }
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: m */
    public float mo2846m() {
        return 240.0f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: z */
    public float mo2822z() {
        return 0.8f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: A */
    public float mo3065A() {
        return 1.9f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: B */
    public float mo3063B() {
        return 0.12f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: c */
    public float mo2883c(int i) {
        return 3.5f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: w */
    public float mo2825w(int i) {
        return 0.25f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: C */
    public float mo3061C() {
        return 0.03f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: D */
    public float mo3059D() {
        return 0.1f;
    }

    @Override // com.corrodinggames.rts.game.units.p029h.AbstractC0596f, com.corrodinggames.rts.game.units.AbstractC0629y, com.corrodinggames.rts.game.units.AbstractC0244am, com.corrodinggames.rts.gameFramework.AbstractC1155w
    /* renamed from: a */
    public void mo446a(float f) {
        super.mo446a(f);
        if (!this.f1612bV) {
            C0524b.m3276a(f, this);
        }
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0244am, com.corrodinggames.rts.gameFramework.AbstractC1155w
    /* renamed from: a */
    public void mo445a(float f, boolean z) {
        super.mo445a(f, z);
        if (!this.f1612bV) {
            C0524b.m3274b(f, this);
        }
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y, com.corrodinggames.rts.game.units.AbstractC0244am, com.corrodinggames.rts.gameFramework.AbstractC1155w
    /* renamed from: c */
    public boolean mo438c(float f) {
        if (!super.mo438c(f)) {
            return false;
        }
        GameEngine gameEngine = GameEngine.getGameEngine();
        C1152y.m463a((AbstractC0629y) this);
        if (!this.f1612bV) {
            float mo2872e = this.f1654cL[0].f1722f / mo2872e(0);
            if (mo2872e != 0.0f) {
                PointF E = mo3056E(0);
                gameEngine.f6326bO.mo138i();
                gameEngine.f6326bO.mo169b(E.x - gameEngine.f6357cw, (E.y - gameEngine.f6358cx) - this.f7174eq);
                gameEngine.f6326bO.mo229a(mo2872e, mo2872e);
                if (m3035Y()) {
                    gameEngine.f6326bO.mo199a(C0524b.f3622f, 0.0f, 0.0f, (Paint) null);
                } else {
                    gameEngine.f6326bO.mo199a(C0524b.f3621e, 0.0f, 0.0f, (Paint) null);
                }
                gameEngine.f6326bO.mo137j();
                return true;
            }
            return true;
        }
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: l */
    public boolean mo3067l() {
        return false;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: g */
    public float mo2866g(int i) {
        return 11.0f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y, com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: bl */
    public int mo2900bl() {
        return 1;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: G */
    public PointF mo3052G(int i) {
        f4018bh.setSite(this.f7172eo + (C0773f.m2107k(this.f1623cg) * 8.0f), this.f7173ep + (C0773f.m2110j(this.f1623cg) * 8.0f));
        return f4018bh;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: b */
    public float mo2930b(int i) {
        return 120 - (i * 28);
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

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: a */
    public boolean mo3011a(AbstractC0244am abstractC0244am) {
        if (!abstractC0244am.mo3280q() && abstractC0244am.mo3397bI()) {
            return true;
        }
        return false;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: a */
    public void mo3130a(AbstractC0224s abstractC0224s, boolean z) {
    }

    /* renamed from: a */
    public static void m3147a(ArrayList arrayList, int i) {
        arrayList.add(f3853i);
        arrayList.add(new C0227v(EnumC0249ar.extractor, 1, 1));
        arrayList.add(new C0227v(EnumC0249ar.turret, 1, 2));
        arrayList.add(new C0227v(EnumC0249ar.antiAirTurret, 1, 3));
        arrayList.add(new C0227v(EnumC0249ar.landFactory, 1, 4));
        arrayList.add(new C0227v(EnumC0249ar.airFactory, 1, 5));
        arrayList.add(new C0227v(EnumC0249ar.seaFactory, 1, 6));
        arrayList.add(new C0227v(EnumC0249ar.fabricator, 1, 7));
        arrayList.add(new C0227v(EnumC0249ar.laserDefence, 1, 8));
        arrayList.add(new C0227v(EnumC0249ar.repairbay, 1, 9));
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: N */
    public ArrayList mo3131N() {
        return mo5458r().mo3563a(mo3038V());
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: a */
    public void mo3008a(AbstractC0244am abstractC0244am, int i) {
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: y */
    public int mo3138y() {
        return 145;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: g */
    public boolean mo3142g(AbstractC0244am abstractC0244am, boolean z) {
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: f */
    public float mo3143f(InterfaceC0303as interfaceC0303as) {
        int mo3138y = mo3138y();
        int mo3561a = interfaceC0303as.mo3561a(this);
        if (mo3561a == 0 && interfaceC0303as.mo3499p()) {
            mo3561a = 110;
        }
        return mo3138y + mo3561a;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: u */
    public int mo3140u(AbstractC0244am abstractC0244am) {
        return (int) mo3143f(abstractC0244am.mo5458r());
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: v */
    public int mo3139v(AbstractC0244am abstractC0244am) {
        return (int) mo3143f(abstractC0244am.mo5458r());
    }
}