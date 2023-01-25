package com.corrodinggames.rts.game.units.p026e;

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
import com.corrodinggames.rts.gameFramework.p030a.C0637e;
import com.corrodinggames.rts.gameFramework.unitAction.C0970e;
import com.corrodinggames.rts.gameFramework.utility.C1152y;

/* renamed from: com.corrodinggames.rts.game.units.e.n */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/e/n.class */
public class C0538n extends AbstractC0534j {

    /* renamed from: a */
    static C0970e f3703a = null;

    /* renamed from: b */
    static C0970e f3704b = null;

    /* renamed from: c */
    static C0970e f3705c = null;

    /* renamed from: d */
    static C0970e f3706d = null;

    /* renamed from: e */
    static C0970e[] f3707e = new C0970e[10];

    /* renamed from: f */
    int f3708f;

    /* renamed from: g */
    float f3709g;

    /* renamed from: h */
    float f3710h;

    /* renamed from: i */
    Rect f3711i;

    @Override // com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: b */
    public EnumC0249ar mo5458r() {
        return EnumC0249ar.tank;
    }

    /* renamed from: f */
    public static void m3225f() {
        GameEngine gameEngine = GameEngine.getGameEngine();
        f3704b = gameEngine.f6326bO.mo222a(C0067R.drawable.tank2);
        f3703a = gameEngine.f6326bO.mo222a(C0067R.drawable.tank2_dead);
        f3705c = gameEngine.f6326bO.mo222a(C0067R.drawable.tank2_turret);
        f3706d = gameEngine.f6326bO.mo222a(C0067R.drawable.tank2_shadow);
        f3707e = PlayerData.m4432a(f3704b);
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: d */
    public C0970e mo2879d() {
        if (this.f1612bV) {
            return f3703a;
        }
        return f3707e[this.f1614bX.m4454R()];
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: k */
    public C0970e mo2853k() {
        return f3706d;
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
        return f3705c;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: e */
    public boolean mo3071e() {
        this.f3917M = f3703a;
        m448S(0);
        this.f1610bT = false;
        m3014a(EnumC0233ab.small);
        return true;
    }

    public C0538n(boolean z) {
        super(z);
        this.f3711i = new Rect();
        m2725a(f3704b, 3);
        this.f1626cj = 11.0f;
        this.f1627ck = this.f1626cj + 1.0f;
        this.f1638cv = 210.0f;
        this.f1637cu = this.f1638cv;
        this.f3917M = f3704b;
    }

    @Override // com.corrodinggames.rts.game.units.p026e.AbstractC0534j, com.corrodinggames.rts.game.units.AbstractC0629y, com.corrodinggames.rts.game.units.AbstractC0244am, com.corrodinggames.rts.gameFramework.AbstractC1155w
    /* renamed from: a */
    public void mo446a(float f) {
        super.mo446a(f);
        if (!this.f1612bV && this.f1622cf != 0.0f) {
            this.f3709g += f;
            if (this.f3709g > 1.0f) {
                this.f3709g = 0.0f;
                this.f3708f++;
                if (this.f3708f > 2) {
                    this.f3708f = 0;
                }
            }
            if (this.f1622cf > 0.0f && this.f7169el) {
                this.f3710h += f;
                if (this.f3710h > 9.0f) {
                    this.f3710h = 0.0f;
                    m3228K();
                }
            }
        }
    }

    /* renamed from: K */
    public void m3228K() {
        GameEngine gameEngine = GameEngine.getGameEngine();
        int i = 0;
        while (i <= 1) {
            float f = i == 0 ? -20 : 20;
            gameEngine.f6329bR.m2362c(this.f7172eo + (C0773f.m2107k(this.f1623cg + 180.0f + f) * this.f1626cj), this.f7173ep + (C0773f.m2110j(this.f1623cg + 180.0f + f) * this.f1626cj), this.f7174eq, this.f1623cg + 180.0f, 0);
            i++;
        }
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: a */
    public void mo3008a(AbstractC0244am abstractC0244am, int i) {
        PointF E = mo3056E(i);
        C0188f m4525a = C0188f.m4525a(this, E.x, E.y);
        PointF K = mo3046K(i);
        m4525a.f1012K = K.x;
        m4525a.f1013L = K.y;
        m4525a.f1022U = 30.0f;
        m4525a.f987l = abstractC0244am;
        m4525a.f983h = 60.0f;
        m4525a.f995t = 3.0f;
        m4525a.f1017P = (short) 1;
        m4525a.f999x = 1.0f;
        GameEngine gameEngine = GameEngine.getGameEngine();
        gameEngine.f6329bR.m2385a(E.x, E.y, this.f7174eq, -1127220);
        gameEngine.f6329bR.m2390a(E.x, E.y, this.f7174eq, this.f1654cL[i].f1717a);
        gameEngine.f6324bM.m2811a(C0637e.f4083q, 0.3f, 1.0f + C0773f.m2151c(-0.07f, 0.07f), E.x, E.y);
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: m */
    public float mo2846m() {
        return 130.0f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: b */
    public float mo2930b(int i) {
        return 75.0f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: z */
    public float mo2822z() {
        return 1.0f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: A */
    public float mo3065A() {
        return 4.1f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: c */
    public float mo2883c(int i) {
        return 4.0f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: B */
    public float mo3063B() {
        return 0.25f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y, com.corrodinggames.rts.game.units.AbstractC0244am, com.corrodinggames.rts.gameFramework.AbstractC1155w
    /* renamed from: c */
    public boolean mo438c(float f) {
        if (!super.mo438c(f)) {
            return false;
        }
        C1152y.m463a((AbstractC0629y) this);
        if (!this.f1612bV) {
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
        return 0.17f;
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
    /* renamed from: g */
    public float mo2866g(int i) {
        return 20.0f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: a_ */
    public Rect mo3227a_(boolean z) {
        if (z) {
            return super.mo3227a_(z);
        }
        if (this.f1612bV) {
            return super.mo3227a_(z);
        }
        return super.m4239a(z, this.f3708f);
    }
}