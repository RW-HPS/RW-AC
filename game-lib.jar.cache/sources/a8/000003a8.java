package com.corrodinggames.rts.game.units.p024d;

import android.graphics.PointF;
import android.graphics.Rect;
import com.corrodinggames.rts.C0067R;
import com.corrodinggames.rts.game.PlayerData;
import com.corrodinggames.rts.game.units.AbstractC0244am;
import com.corrodinggames.rts.game.units.AbstractC0629y;
import com.corrodinggames.rts.game.units.C0305au;
import com.corrodinggames.rts.game.units.EnumC0233ab;
import com.corrodinggames.rts.game.units.EnumC0249ar;
import com.corrodinggames.rts.game.units.InterfaceC0474d;
import com.corrodinggames.rts.game.units.p013a.C0218m;
import com.corrodinggames.rts.game.units.p013a.C0219n;
import com.corrodinggames.rts.game.units.p026e.C0524b;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.net.GameInputStream;
import com.corrodinggames.rts.gameFramework.net.GameOutputStream;
import com.corrodinggames.rts.gameFramework.unitAction.C0970e;
import com.corrodinggames.rts.gameFramework.utility.C1152y;
import com.corrodinggames.rts.gameFramework.utility.SlickToAndroidKeycodes;
import java.util.ArrayList;

/* renamed from: com.corrodinggames.rts.game.units.d.r */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/d/r.class */
public class C0515r extends AbstractC0493d implements InterfaceC0474d {

    /* renamed from: d */
    float f3569d;

    /* renamed from: f */
    Rect f3571f;

    /* renamed from: g */
    Rect f3572g;

    /* renamed from: i */
    PointF[] f3574i;

    /* renamed from: j */
    PointF[] f3575j;

    /* renamed from: a */
    static C0970e f3566a = null;

    /* renamed from: b */
    static C0970e[] f3567b = new C0970e[10];

    /* renamed from: c */
    static C0970e f3568c = null;

    /* renamed from: e */
    public static C0516s f3570e = new C0516s(true);

    /* renamed from: h */
    static ArrayList f3573h = new ArrayList();

    @Override // com.corrodinggames.rts.game.units.p024d.AbstractC0493d, com.corrodinggames.rts.game.units.AbstractC0629y, com.corrodinggames.rts.game.units.AbstractC0244am, com.corrodinggames.rts.gameFramework.AbstractC0674az, com.corrodinggames.rts.gameFramework.AbstractC1155w, com.corrodinggames.rts.gameFramework.AbstractC0741bq
    /* renamed from: a */
    public void mo442a(GameOutputStream gameOutputStream) {
        super.mo442a(gameOutputStream);
    }

    @Override // com.corrodinggames.rts.game.units.p024d.AbstractC0493d, com.corrodinggames.rts.game.units.AbstractC0629y, com.corrodinggames.rts.game.units.AbstractC0244am, com.corrodinggames.rts.gameFramework.AbstractC0674az, com.corrodinggames.rts.gameFramework.AbstractC1155w
    /* renamed from: a */
    public void mo441a(GameInputStream gameInputStream) {
        super.mo441a(gameInputStream);
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: K */
    public EnumC0249ar mo5458r() {
        return EnumC0249ar.repairbay;
    }

    static {
        f3573h.add(new C0218m(true));
        f3573h.add(new C0219n());
    }

    /* renamed from: M */
    public static void m3306M() {
        GameEngine gameEngine = GameEngine.getGameEngine();
        f3566a = gameEngine.f6326bO.mo222a(C0067R.drawable.repair_bay);
        f3568c = gameEngine.f6326bO.mo222a(C0067R.drawable.repair_bay_dead);
        f3567b = PlayerData.m4432a(f3566a);
    }

    @Override // com.corrodinggames.rts.game.units.p024d.AbstractC0493d
    /* renamed from: L */
    public boolean mo3296L() {
        this.f3917M = f3568c;
        m448S(0);
        this.f1610bT = false;
        m3014a(EnumC0233ab.normal);
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: d */
    public C0970e mo2879d() {
        if (this.f1612bV) {
            return f3568c;
        }
        if (this.f1614bX == null) {
            return f3567b[f3567b.length - 1];
        }
        return f3567b[this.f1614bX.m4454R()];
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

    public C0515r(boolean z) {
        super(z);
        this.f3571f = new Rect();
        this.f3572g = new Rect();
        this.f3574i = new PointF[6];
        this.f3575j = new PointF[this.f3574i.length];
        this.f3917M = f3566a;
        m2724b(f3566a);
        this.f1626cj = 30.0f;
        this.f1627ck = this.f1626cj;
        this.f1638cv = 1000.0f;
        this.f1637cu = this.f1638cv;
        this.f3457n.m5172a(-1, -1, 1, 1);
        this.f3458o.m5172a(-1, -1, 1, 1);
        for (int i = 0; i < this.f3574i.length; i++) {
            this.f3574i[i] = new PointF();
            this.f3575j[i] = new PointF();
        }
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: y */
    public int mo3138y() {
        return SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_DATA_SERVICE;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: c */
    public float mo3163c(AbstractC0244am abstractC0244am) {
        return 0.2f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: a */
    public boolean mo3011a(AbstractC0244am abstractC0244am) {
        if (abstractC0244am.mo3280q()) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static C0305au m3305a(AbstractC0629y abstractC0629y, float f, float f2, boolean z) {
        GameEngine gameEngine = GameEngine.getGameEngine();
        f3570e.m3304a(abstractC0629y.mo3138y() + f2, z);
        gameEngine.f6340cc.m3208a(abstractC0629y.f7172eo, abstractC0629y.f7173ep, abstractC0629y.mo3138y() + f2, abstractC0629y, f, f3570e);
        AbstractC0244am abstractC0244am = f3570e.f3580e;
        if (abstractC0244am != null) {
            C0305au m2946ao = abstractC0629y.m2946ao();
            m2946ao.m4151b(abstractC0244am);
            if (m2946ao != null) {
                m2946ao.f1814k = f2;
                m2946ao.f1809m = true;
                return m2946ao;
            }
            return null;
        }
        return null;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y, com.corrodinggames.rts.game.units.AbstractC0244am, com.corrodinggames.rts.gameFramework.AbstractC1155w
    /* renamed from: a */
    public void mo446a(float f) {
        super.mo446a(f);
        if (!m4226bT() || this.f1612bV) {
            return;
        }
        this.f3569d += f;
        if (m2944aq() && this.f3569d > 40.0f) {
            this.f3569d = 0.0f;
            m3305a((AbstractC0629y) this, f, 0.0f, false);
        }
        if (!this.f1612bV) {
            C0524b.m3276a(f, this);
        }
    }

    @Override // com.corrodinggames.rts.game.units.p024d.AbstractC0493d, com.corrodinggames.rts.game.units.AbstractC0629y, com.corrodinggames.rts.game.units.AbstractC0244am, com.corrodinggames.rts.gameFramework.AbstractC1155w
    /* renamed from: c */
    public boolean mo438c(float f) {
        return super.mo438c(f);
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0244am, com.corrodinggames.rts.gameFramework.AbstractC1155w
    /* renamed from: a */
    public void mo445a(float f, boolean z) {
        super.mo445a(f, z);
        if (!this.f1612bV) {
            C0524b.m3274b(f, this);
        }
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: l */
    public boolean mo3067l() {
        return false;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: a */
    public void mo3008a(AbstractC0244am abstractC0244am, int i) {
        throw new RuntimeException("Unit cannot shoot");
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: b */
    public float mo2930b(int i) {
        return 0.0f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: c */
    public float mo2883c(int i) {
        return 0.0f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: E */
    public PointF mo3056E(int i) {
        PointF G = mo3052G(i);
        f4017bg.setSite(G.x + 0.0f, G.y - 33.0f);
        return f4017bg;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: N */
    public ArrayList mo3131N() {
        return f3573h;
    }

    @Override // com.corrodinggames.rts.game.units.InterfaceC0474d
    /* renamed from: b */
    public PointF[] mo3146b() {
        return this.f3574i;
    }

    @Override // com.corrodinggames.rts.game.units.InterfaceC0474d
    /* renamed from: e_ */
    public PointF[] mo3145e_() {
        return this.f3575j;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: m */
    public float mo2846m() {
        return mo3138y();
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0244am, com.corrodinggames.rts.gameFramework.AbstractC1155w
    /* renamed from: e */
    public void mo434e(float f) {
        super.mo434e(f);
        C1152y.m471a(this, mo3138y());
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: g */
    public boolean mo3142g(AbstractC0244am abstractC0244am, boolean z) {
        return true;
    }
}