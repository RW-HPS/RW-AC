package com.corrodinggames.rts.game.units.p024d;

import android.graphics.PointF;
import android.graphics.Rect;
import com.corrodinggames.rts.C0067R;
import com.corrodinggames.rts.game.C0188f;
import com.corrodinggames.rts.game.PlayerData;
import com.corrodinggames.rts.game.units.AbstractC0244am;
import com.corrodinggames.rts.game.units.AbstractC0629y;
import com.corrodinggames.rts.game.units.EnumC0249ar;
import com.corrodinggames.rts.game.units.p013a.AbstractC0224s;
import com.corrodinggames.rts.game.units.p013a.AbstractC0228w;
import com.corrodinggames.rts.game.units.p013a.C0208c;
import com.corrodinggames.rts.game.units.p013a.EnumC0225t;
import com.corrodinggames.rts.gameFramework.C0773f;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.net.GameInputStream;
import com.corrodinggames.rts.gameFramework.net.GameOutputStream;
import com.corrodinggames.rts.gameFramework.p030a.C0637e;
import com.corrodinggames.rts.gameFramework.p035d.C0760e;
import com.corrodinggames.rts.gameFramework.p035d.EnumC0759d;
import com.corrodinggames.rts.gameFramework.p035d.EnumC0763h;
import com.corrodinggames.rts.gameFramework.translations.C0855a;
import com.corrodinggames.rts.gameFramework.unitAction.C0970e;
import com.corrodinggames.rts.gameFramework.utility.C1152y;
import java.util.ArrayList;

/* renamed from: com.corrodinggames.rts.game.units.d.p */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/d/p.class */
public class C0510p extends AbstractC0503i {

    /* renamed from: d */
    boolean f3547d;

    /* renamed from: e */
    boolean f3548e;

    /* renamed from: f */
    float f3549f;

    /* renamed from: i */
    PointF f3552i;

    /* renamed from: j */
    Rect f3553j;

    /* renamed from: a */
    static C0970e[] f3544a = new C0970e[10];

    /* renamed from: b */
    static C0970e[] f3545b = new C0970e[10];

    /* renamed from: c */
    static C0970e f3546c = null;

    /* renamed from: g */
    static C0970e f3550g = null;

    /* renamed from: h */
    static C0970e[] f3551h = new C0970e[10];

    /* renamed from: k */
    static AbstractC0224s f3554k = new AbstractC0228w(102) { // from class: com.corrodinggames.rts.game.units.d.p.1
        @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
        /* renamed from: g */
        public boolean mo3089g() {
            return false;
        }

        @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
        /* renamed from: a */
        public String mo3098a() {
            return C0855a.m1714a("units.laserDefence.upgrade.description", new Object[0]);
        }

        @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
        /* renamed from: b */
        public String mo3095b() {
            return C0855a.m1714a("units.laserDefence.upgrade.name", new Object[0]);
        }

        @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
        /* renamed from: c */
        public int mo3092c() {
            return EnumC0249ar.laserDefence.mo4166c(2);
        }

        @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0228w
        /* renamed from: K */
        public float mo3291K() {
            return 3.0E-4f;
        }

        @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
        /* renamed from: a */
        public boolean mo3096a(AbstractC0244am abstractC0244am, boolean z) {
            C0510p c0510p = (C0510p) abstractC0244am;
            if (c0510p.f3547d || c0510p.mo3337a(m4309N(), z) > 0) {
                return false;
            }
            return super.mo3096a(abstractC0244am, z);
        }

        @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
        /* renamed from: b */
        public boolean mo3094b(AbstractC0244am abstractC0244am) {
            if (((C0510p) abstractC0244am).f3547d) {
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

    /* renamed from: l */
    static ArrayList f3555l = new ArrayList();

    static {
        f3555l.add(f3554k);
    }

    @Override // com.corrodinggames.rts.game.units.p024d.AbstractC0503i, com.corrodinggames.rts.game.units.p024d.AbstractC0493d, com.corrodinggames.rts.game.units.AbstractC0629y, com.corrodinggames.rts.game.units.AbstractC0244am, com.corrodinggames.rts.gameFramework.AbstractC0674az, com.corrodinggames.rts.gameFramework.AbstractC1155w, com.corrodinggames.rts.gameFramework.AbstractC0741bq
    /* renamed from: a */
    public void mo442a(GameOutputStream gameOutputStream) {
        gameOutputStream.writeBoolean(this.f3547d);
        gameOutputStream.writeFloat(this.f1644cB);
        gameOutputStream.writeBoolean(this.f3548e);
        gameOutputStream.writeFloat(this.f3549f);
        super.mo442a(gameOutputStream);
    }

    @Override // com.corrodinggames.rts.game.units.p024d.AbstractC0503i, com.corrodinggames.rts.game.units.p024d.AbstractC0493d, com.corrodinggames.rts.game.units.AbstractC0629y, com.corrodinggames.rts.game.units.AbstractC0244am, com.corrodinggames.rts.gameFramework.AbstractC0674az, com.corrodinggames.rts.gameFramework.AbstractC1155w
    /* renamed from: a */
    public void mo441a(GameInputStream gameInputStream) {
        this.f3547d = gameInputStream.readBoolean();
        this.f1644cB = gameInputStream.readFloat();
        this.f3548e = gameInputStream.readBoolean();
        if (gameInputStream.m1311b() >= 38) {
            this.f3549f = gameInputStream.readFloat();
        }
        super.mo441a(gameInputStream);
    }

    @Override // com.corrodinggames.rts.game.units.p024d.AbstractC0493d, com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: v */
    public C0970e mo3066v() {
        if (this.f1614bX.site == -1) {
            return null;
        }
        return f3551h[this.f1614bX.m4454R()];
    }

    /* renamed from: b */
    public static void m3320b() {
        GameEngine gameEngine = GameEngine.getGameEngine();
        f3546c = gameEngine.f6326bO.mo222a(C0067R.drawable.laser_defence_dead);
        C0970e mo222a = gameEngine.f6326bO.mo222a(C0067R.drawable.laser_defence);
        C0970e mo222a2 = gameEngine.f6326bO.mo222a(C0067R.drawable.laser_defence_t2);
        f3544a = PlayerData.m4432a(mo222a);
        f3545b = PlayerData.m4432a(mo222a2);
        mo222a.mo51n();
        mo222a2.mo51n();
        f3550g = gameEngine.f6326bO.mo222a(C0067R.drawable.unit_icon_building_turrent);
        f3551h = PlayerData.m4432a(f3550g);
    }

    @Override // com.corrodinggames.rts.game.units.p024d.AbstractC0493d
    /* renamed from: L */
    public boolean mo3296L() {
        GameEngine gameEngine = GameEngine.getGameEngine();
        gameEngine.f6329bR.m2391a(this.f7172eo, this.f7173ep, this.f7174eq);
        this.f3917M = f3546c;
        m448S(0);
        this.f1610bT = false;
        gameEngine.f6324bM.m2812a(C0637e.f4082p, 0.8f, this.f7172eo, this.f7173ep);
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: d */
    public C0970e mo2879d() {
        if (this.f1612bV) {
            return f3546c;
        }
        if (this.f1614bX == null) {
            return f3544a[f3544a.length - 1];
        }
        if (!this.f3547d) {
            return f3544a[this.f1614bX.m4454R()];
        }
        return f3545b[this.f1614bX.m4454R()];
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: k */
    public C0970e mo2853k() {
        return null;
    }

    public C0510p(boolean z) {
        super(z);
        this.f3552i = new PointF();
        this.f3553j = new Rect();
        m2725a(f3544a[0], 2);
        this.f1644cB = 1.0f;
        this.f1626cj = 19.0f;
        this.f1627ck = this.f1626cj;
        this.f1638cv = 500.0f;
        this.f1637cu = this.f1638cv;
        this.f3917M = f3544a[f3544a.length - 1];
        this.f3457n.m5172a(0, 0, 1, 1);
        this.f3458o.m5172a(0, 0, 1, 1);
    }

    @Override // com.corrodinggames.rts.game.units.p024d.AbstractC0503i, com.corrodinggames.rts.game.units.AbstractC0629y, com.corrodinggames.rts.game.units.AbstractC0244am, com.corrodinggames.rts.gameFramework.AbstractC1155w
    /* renamed from: a */
    public void mo446a(float f) {
        float f2;
        super.mo446a(f);
        if (!m4226bT() || this.f1612bV) {
            return;
        }
        GameEngine.getGameEngine();
        float f3 = 4.0E-4f * f;
        if (this.f3547d) {
            f3 += 2.0E-4f * f;
        }
        this.f1644cB = C0773f.m2217a(this.f1644cB, 1.0f, f3);
        if (this.f1644cB >= 1.0f) {
            this.f3548e = false;
        }
        this.f3549f -= f;
        this.f3552i.setSite(mo3056E(0));
        if (this.f1644cB > 0.0f && !this.f3548e) {
            if (!this.f3547d) {
                f2 = 0.11f;
            } else {
                f2 = 0.05f;
            }
            if (m3321a(this, this.f3552i.x, this.f3552i.y, this.f7174eq, mo2846m(), f2)) {
                this.f3549f = 3.0f;
            }
            if (this.f1644cB < 0.0f) {
                this.f1644cB = 0.0f;
                this.f3548e = true;
            }
        }
        if (this.f3548e) {
            this.f3462s = 1;
        } else {
            this.f3462s = 0;
        }
    }

    /* renamed from: a */
    public static boolean m3321a(AbstractC0629y abstractC0629y, float f, float f2, float f3, float f4, float f5) {
        GameEngine gameEngine = GameEngine.getGameEngine();
        float f6 = f4 * f4;
        Object[] m535a = C0188f.f1084a.m535a();
        int i = C0188f.f1084a.f7109a;
        for (int i2 = 0; i2 < i; i2++) {
            C0188f c0188f = (C0188f) m535a[i2];
            if (!c0188f.f1002A && !c0188f.f1004C && ((c0188f.f1011J > 7.0f || (c0188f.f1011J > 2.0f && c0188f.f995t > 8.0f)) && !c0188f.f1072aS && ((c0188f.f7172eo - f) * (c0188f.f7172eo - f)) + ((c0188f.f7173ep - f2) * (c0188f.f7173ep - f2)) < f6 && c0188f.f7174eq >= -1.0f)) {
                boolean z = false;
                if (c0188f.f987l != null && abstractC0629y.f1614bX.m4390d(c0188f.f987l.f1614bX)) {
                    z = true;
                }
                if (!z && c0188f.f985j != null && abstractC0629y.f1614bX.m4402c(c0188f.f985j.f1614bX)) {
                    z = true;
                }
                if (z) {
                    C0760e m2388a = gameEngine.f6329bR.m2388a(f, f2, f3, c0188f.f7172eo, c0188f.f7173ep, c0188f.f7174eq);
                    if (m2388a != null) {
                        m2388a.f4831V = 10.0f;
                        m2388a.f4832W = m2388a.f4831V;
                    }
                    C0760e m2365b = gameEngine.f6329bR.m2365b(f, f2, f3, EnumC0759d.custom, false, EnumC0763h.high);
                    if (m2365b != null) {
                        m2365b.f4825P = 0.0f;
                        m2365b.f4826Q = 0.0f;
                        m2365b.f4848ap = 4;
                        m2365b.f4831V = 39.0f;
                        m2365b.f4832W = m2365b.f4831V;
                        m2365b.f4806r = true;
                        m2365b.f4814E = 1.3f;
                        m2365b.f4816G = 1.1f;
                        m2365b.f4815F = 0.7f;
                    }
                    c0188f.f1009H -= 1.01f;
                    if (c0188f.f1009H <= 0.0f) {
                        c0188f.m4517d();
                        C0760e m2365b2 = gameEngine.f6329bR.m2365b(c0188f.f7172eo, c0188f.f7173ep, c0188f.f7174eq, EnumC0759d.custom, false, EnumC0763h.high);
                        if (m2365b2 != null) {
                            m2365b2.f4825P = 0.0f;
                            m2365b2.f4826Q = 0.0f;
                            m2365b2.f4848ap = 4;
                            m2365b2.f4831V = 23.0f;
                            m2365b2.f4832W = m2365b2.f4831V;
                            m2365b2.f4806r = true;
                            m2365b2.f4814E = 0.9f;
                            m2365b2.f4816G = 0.5f;
                            m2365b2.f4815F = 0.2f;
                        }
                        gameEngine.f6324bM.m2811a(C0637e.f4098F, 0.2f, 1.0f + C0773f.m2151c(-0.07f, 0.07f), c0188f.f7172eo, c0188f.f7173ep);
                    }
                    abstractC0629y.f1644cB -= f5;
                    return true;
                }
            }
        }
        return false;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: E */
    public PointF mo3056E(int i) {
        f4017bg.setSite(this.f7172eo, this.f7173ep - 13.0f);
        return f4017bg;
    }

    @Override // com.corrodinggames.rts.game.units.p024d.AbstractC0503i, com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: a */
    public void mo3008a(AbstractC0244am abstractC0244am, int i) {
    }

    @Override // com.corrodinggames.rts.game.units.p024d.AbstractC0503i, com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: m */
    public float mo2846m() {
        if (!this.f3547d) {
            return 160.0f;
        }
        return 210.0f;
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
        return EnumC0249ar.laserDefence;
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

    @Override // com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: bW */
    public float mo3235bW() {
        if (this.f1644cB != 1.0f) {
            return this.f1644cB;
        }
        return super.mo3235bW();
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: bX */
    public boolean mo3234bX() {
        return this.f3548e;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y, com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: bd */
    public float mo2908bd() {
        return 1.0f;
    }

    @Override // com.corrodinggames.rts.game.units.p024d.AbstractC0503i, com.corrodinggames.rts.game.units.p024d.InterfaceC0506l
    /* renamed from: a */
    public void mo3294a(C0504j c0504j) {
        if (c0504j.f3525j.equals(f3554k.m4309N())) {
            PlayerData.m4417b((AbstractC0244am) this);
            mo3021a(2);
            PlayerData.m4401c(this);
            m3037W();
        }
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: cm */
    public C0208c mo3292cm() {
        if (!this.f3547d) {
            return f3554k.m4309N();
        }
        return AbstractC0224s.f1466i;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y, com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: V */
    public int mo3038V() {
        if (this.f3547d) {
            return 2;
        }
        return 1;
    }

    @Override // com.corrodinggames.rts.game.units.p024d.AbstractC0493d, com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: a */
    public void mo3021a(int i) {
        if (i == 1) {
            this.f3547d = false;
        } else if (i == 2 && !this.f3547d) {
            this.f3547d = true;
            this.f1638cv += 900.0f;
            this.f1637cu += 900.0f;
        }
        mo3041S();
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: N */
    public ArrayList mo3131N() {
        return f3555l;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0244am, com.corrodinggames.rts.gameFramework.AbstractC1155w
    /* renamed from: e */
    public void mo434e(float f) {
        super.mo434e(f);
        C1152y.m471a(this, mo2846m());
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: cZ */
    public float mo3319cZ() {
        return GameEngine.getGameEngine().f6323bL.f786n;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: da */
    public float mo3318da() {
        return GameEngine.getGameEngine().f6323bL.f787o;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: db */
    public float mo3317db() {
        return super.mo3317db() - 8.0f;
    }
}