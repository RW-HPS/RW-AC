package com.corrodinggames.rts.game.units.b;

import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.Rect;
import com.corrodinggames.rts.R;
import com.corrodinggames.rts.game.PlayerData;
import com.corrodinggames.rts.game.units.a.s;
import com.corrodinggames.rts.game.units.a.x;
import com.corrodinggames.rts.game.units.am;
import com.corrodinggames.rts.game.units.ao;
import com.corrodinggames.rts.game.units.ar;
import com.corrodinggames.rts.game.units.e.l;
import com.corrodinggames.rts.game.units.y;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.m.ag;
import com.corrodinggames.rts.gameFramework.net.GameInputStream;
import com.corrodinggames.rts.gameFramework.net.GameOutputStream;
import com.corrodinggames.rts.gameFramework.utility.SlickToAndroidKeycodes;
import java.util.ArrayList;

/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/b/c.class */
public class c extends b {
    float q;
    boolean r;
    boolean s;
    float t;
    float u;
    protected Paint v;
    PointF w;
    Rect x;

    /* renamed from: a  reason: collision with root package name */
    static com.corrodinggames.rts.gameFramework.m.e f211a = null;
    static com.corrodinggames.rts.gameFramework.m.e b = null;
    static com.corrodinggames.rts.gameFramework.m.e c = null;
    static com.corrodinggames.rts.gameFramework.m.e d = null;
    static com.corrodinggames.rts.gameFramework.m.e[] e = new com.corrodinggames.rts.gameFramework.m.e[10];
    static com.corrodinggames.rts.gameFramework.m.e[] f = new com.corrodinggames.rts.gameFramework.m.e[10];
    static com.corrodinggames.rts.gameFramework.m.e[] g = new com.corrodinggames.rts.gameFramework.m.e[10];
    static com.corrodinggames.rts.gameFramework.m.e o = null;
    static com.corrodinggames.rts.gameFramework.m.e p = null;
    public static final s y = new x(151) { // from class: com.corrodinggames.rts.game.units.b.c.1
        @Override // com.corrodinggames.rts.game.units.a.s
        public String a() {
            return "-Surface unit.";
        }

        @Override // com.corrodinggames.rts.game.units.a.s
        public String b() {
            return "Fly";
        }

        @Override // com.corrodinggames.rts.game.units.a.s
        public boolean a(am amVar, boolean z2) {
            return !((c) amVar).r;
        }
    };
    public static final s z = new x(152) { // from class: com.corrodinggames.rts.game.units.b.c.2
        @Override // com.corrodinggames.rts.game.units.a.s
        public String a() {
            return "-Dive unit underwater.";
        }

        @Override // com.corrodinggames.rts.game.units.a.s
        public String b() {
            return "Dive";
        }

        @Override // com.corrodinggames.rts.game.units.a.s
        public boolean a(am amVar, boolean z2) {
            return ((c) amVar).r && ((y) amVar).cJ();
        }
    };
    static ArrayList A = new ArrayList();

    static {
        A.add(y);
        A.add(z);
    }

    @Override // com.corrodinggames.rts.game.units.b.b, com.corrodinggames.rts.game.units.y, com.corrodinggames.rts.game.units.am, com.corrodinggames.rts.gameFramework.az, com.corrodinggames.rts.gameFramework.w, com.corrodinggames.rts.gameFramework.bq
    public void a(GameOutputStream gameOutputStream) {
        gameOutputStream.writeBoolean(this.r);
        gameOutputStream.writeFloat(this.t);
        gameOutputStream.writeFloat(this.u);
        super.a(gameOutputStream);
    }

    @Override // com.corrodinggames.rts.game.units.b.b, com.corrodinggames.rts.game.units.y, com.corrodinggames.rts.game.units.am, com.corrodinggames.rts.gameFramework.az, com.corrodinggames.rts.gameFramework.w
    public void a(GameInputStream gameInputStream) {
        this.r = gameInputStream.readBoolean();
        this.s = !Q();
        if (gameInputStream.b() >= 21) {
            this.t = gameInputStream.readFloat();
        }
        if (gameInputStream.b() >= 22) {
            this.u = gameInputStream.readFloat();
        }
        M();
        super.a(gameInputStream);
    }

    @Override // com.corrodinggames.rts.game.units.w, com.corrodinggames.rts.game.units.am
    public boolean Q() {
        return this.eq < -1.0f;
    }

    public boolean b() {
        if (!this.r || this.eq < 0.0f) {
            return true;
        }
        return false;
    }

    @Override // com.corrodinggames.rts.game.units.b.b, com.corrodinggames.rts.game.units.am
    public ao h() {
        if (this.cp) {
            return ao.AIR;
        }
        if (b()) {
            return ao.WATER;
        }
        return ao.AIR;
    }

    @Override // com.corrodinggames.rts.game.units.am
    /* renamed from: f */
    public ar r() {
        return ar.amphibiousJet;
    }

    public static void L() {
        GameEngine gameEngine = GameEngine.getGameEngine();
        b = gameEngine.bO.a(R.drawable.amphibious_jet);
        c = gameEngine.bO.a(R.drawable.amphibious_jet_shadow);
        f211a = gameEngine.bO.a(R.drawable.amphibious_jet_dead);
        e = PlayerData.a(b);
        com.corrodinggames.rts.gameFramework.m.e a2 = gameEngine.bO.a(R.drawable.amphibious_jet_p1);
        com.corrodinggames.rts.gameFramework.m.e a3 = gameEngine.bO.a(R.drawable.amphibious_jet_p2);
        f = PlayerData.a(a2);
        g = PlayerData.a(a3);
        o = a(a2);
        p = a(a3);
    }

    @Override // com.corrodinggames.rts.game.units.y
    public boolean aQ() {
        if (super.aQ()) {
            f(true);
            return true;
        }
        return false;
    }

    @Override // com.corrodinggames.rts.game.units.y, com.corrodinggames.rts.game.units.am, com.corrodinggames.rts.gameFramework.w
    public boolean c(float f2) {
        if (!super.c(f2)) {
            return false;
        }
        if (this.bV) {
            return true;
        }
        f(false);
        if (!this.bV) {
            for (int i = 0; i < bl(); i++) {
                if (i != ds()) {
                    float e2 = this.cL[i].f / e(i);
                    if (e2 != 0.0f) {
                        GameEngine gameEngine = GameEngine.getGameEngine();
                        PointF E = E(i);
                        gameEngine.bO.i();
                        gameEngine.bO.b(E.x - gameEngine.cw, (E.y - gameEngine.cx) - this.eq);
                        gameEngine.bO.a(e2 * 0.7f, e2 * 0.7f);
                        gameEngine.bO.a(l.e, 0.0f, 0.0f, (Paint) null);
                        gameEngine.bO.j();
                    }
                }
            }
            return true;
        }
        return true;
    }

    public void f(boolean z2) {
        Paint paint;
        com.corrodinggames.rts.gameFramework.m.e eVar;
        float f2;
        GameEngine gameEngine = GameEngine.getGameEngine();
        if (!z2) {
            paint = aN();
        } else {
            this.v.a(50, 255, 255, 255);
            paint = this.v;
        }
        for (int i = 0; i <= 1; i++) {
            PointF a2 = a(i, z2);
            float f3 = a2.x - gameEngine.cw;
            float f4 = a2.y - gameEngine.cx;
            float d2 = d(false) - 90.0f;
            if (!z2) {
                f4 -= this.eq;
            }
            if (i == 0) {
                if (z2) {
                    eVar = p;
                } else {
                    eVar = g[this.bX.R()];
                }
                f2 = d2 + 0.0f;
            } else {
                if (z2) {
                    eVar = o;
                } else {
                    eVar = f[this.bX.R()];
                }
                f2 = d2 - 0.0f;
            }
            gameEngine.bO.a(eVar, f3, f4, f2, paint);
        }
    }

    @Override // com.corrodinggames.rts.game.units.y, com.corrodinggames.rts.game.units.am
    public int bl() {
        return 3;
    }

    @Override // com.corrodinggames.rts.game.units.y
    public PointF G(int i) {
        if (i == ds()) {
            return super.G(i);
        }
        float d2 = d(false) - 90.0f;
        PointF a2 = a(i, false);
        float f2 = a2.x;
        float f3 = a2.y;
        bh.setSite(f2 + (com.corrodinggames.rts.gameFramework.f.k(d2) * 5.0f), f3 + (com.corrodinggames.rts.gameFramework.f.j(d2) * 5.0f));
        return bh;
    }

    public PointF a(int i, boolean z2) {
        float d2 = d(false) - 90.0f;
        if (i == ds()) {
            throw new RuntimeException("index==2 is for base");
        }
        float f2 = this.eo;
        float f3 = this.ep;
        float b2 = com.corrodinggames.rts.gameFramework.f.b(this.u * 4.0f, 0.0f, 1.0f);
        float b3 = com.corrodinggames.rts.gameFramework.f.b((this.u * 2.0f) - 1.0f, 0.0f, 1.0f);
        float k = f2 + (com.corrodinggames.rts.gameFramework.f.k(d2) * (7.0f - (5.0f * b2)));
        float j = f3 + (com.corrodinggames.rts.gameFramework.f.j(d2) * (7.0f - (5.0f * b2)));
        float f4 = (-90) + (SlickToAndroidKeycodes.AndroidCodes.KEYCODE_STB_INPUT * i);
        this.w.setSite(k + (com.corrodinggames.rts.gameFramework.f.k(d2 + f4) * (12.0f - (5.0f * b3))), j + (com.corrodinggames.rts.gameFramework.f.j(d2 + f4) * (12.0f - (5.0f * b3))));
        return this.w;
    }

    @Override // com.corrodinggames.rts.game.units.y
    public com.corrodinggames.rts.gameFramework.m.e d() {
        if (this.bV) {
            return f211a;
        }
        return e[this.bX.R()];
    }

    @Override // com.corrodinggames.rts.game.units.y
    public com.corrodinggames.rts.gameFramework.m.e k() {
        return c;
    }

    @Override // com.corrodinggames.rts.game.units.y
    public com.corrodinggames.rts.gameFramework.m.e d(int i) {
        return d;
    }

    @Override // com.corrodinggames.rts.game.units.b.b, com.corrodinggames.rts.game.units.am
    public boolean e() {
        GameEngine.getGameEngine().bR.b(this.eo, this.ep, this.eq);
        this.M = f211a;
        S(0);
        this.bT = false;
        return true;
    }

    public c(boolean z2) {
        super(z2);
        this.r = true;
        this.s = true;
        this.t = 0.0f;
        this.u = 0.0f;
        this.v = new ag();
        this.w = new PointF();
        this.x = new Rect();
        b(b);
        this.cj = 12.0f;
        this.ck = this.cj + 1.0f;
        this.cv = 530.0f;
        this.cu = this.cv;
        this.M = b;
        this.N = c;
        this.eq = 0.0f;
        S(5);
    }

    @Override // com.corrodinggames.rts.game.units.w, com.corrodinggames.rts.game.units.am
    public boolean i() {
        return !b();
    }

    public void M() {
        if (!this.s) {
            S(1);
        } else {
            S(5);
        }
    }

    @Override // com.corrodinggames.rts.game.units.b.b, com.corrodinggames.rts.game.units.y, com.corrodinggames.rts.game.units.am, com.corrodinggames.rts.gameFramework.w
    public void a(float f2) {
        float f3;
        super.a(f2);
        if (!bT() || this.bV) {
            return;
        }
        GameEngine gameEngine = GameEngine.getGameEngine();
        this.q += 2.0f * f2;
        if (this.q > 360.0f) {
            this.q -= 360.0f;
        }
        if (this.r) {
            f3 = 20.0f + (com.corrodinggames.rts.gameFramework.f.j(this.q) * 1.5f);
        } else {
            f3 = -8.0f;
        }
        if (this.r && !Q()) {
            this.u = com.corrodinggames.rts.gameFramework.f.a(this.u, 0.0f, 0.018f * f2);
        } else {
            this.u = com.corrodinggames.rts.gameFramework.f.a(this.u, 1.0f, 0.018f * f2);
        }
        if (com.corrodinggames.rts.gameFramework.f.c(this.eq - f3) > 3.0f) {
            float f4 = 0.6f;
            if (Q()) {
                f4 = 0.6f / 6.0f;
            }
            this.t = com.corrodinggames.rts.gameFramework.f.b(this.t, f4);
            this.t = com.corrodinggames.rts.gameFramework.f.a(this.t, f4, 0.006f * f2);
        } else {
            this.t = com.corrodinggames.rts.gameFramework.f.a(this.t, 0.07f, 0.006f * f2);
        }
        this.eq = com.corrodinggames.rts.gameFramework.f.a(this.eq, f3, this.t * f2);
        boolean z2 = false;
        if (this.s && Q()) {
            if (!cJ()) {
                this.r = true;
            } else {
                this.s = false;
                M();
                z2 = true;
            }
        }
        if (!this.s && !Q()) {
            this.s = true;
            M();
            z2 = true;
        }
        if (z2) {
            gameEngine.bR.a(this.eo, this.ep, 0.0f, 0, 0.0f, 0.0f);
            for (int i = -180; i < 180; i += 45) {
                float f5 = this.cg + i;
                com.corrodinggames.rts.gameFramework.d.e b2 = gameEngine.bR.b((float) (this.eo + (Math.cos(Math.toRadians(f5)) * (-5.0d))), (float) (this.ep + (Math.sin(Math.toRadians(f5)) * (-5.0d))), 0.0f, f5);
                if (b2 != null) {
                    b2.ar = (short) 2;
                    b2.s = true;
                    b2.t = 7.0f;
                }
            }
        }
    }

    @Override // com.corrodinggames.rts.game.units.y
    public float q(int i) {
        if (i == ds()) {
            return 0.0f;
        }
        return 45.0f;
    }

    @Override // com.corrodinggames.rts.game.units.y
    public void a(am amVar, int i) {
        if (i == ds()) {
            return;
        }
        PointF E = E(i);
        com.corrodinggames.rts.game.f a2 = com.corrodinggames.rts.game.f.a(this, E.x, E.y, this.eq, i);
        a2.ar = Color.a(255, 247, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_EISU, 129);
        a2.U = q(i);
        a2.l = amVar;
        a2.h = 10.0f;
        a2.t = 4.0f;
        a2.x = 2.0f;
        a2.aQ = false;
        a2.A = true;
        a2.M = true;
        a2.ai = 0.5f;
        a2.ak = 1.0f;
        a2.al = 0.1f;
        GameEngine gameEngine = GameEngine.getGameEngine();
        gameEngine.bR.a(E.x, E.y, this.eq, -1118482);
        gameEngine.bM.a(com.corrodinggames.rts.gameFramework.a.e.x, 0.2f, this.eo, this.ep);
    }

    @Override // com.corrodinggames.rts.game.units.y
    public float m() {
        if (b()) {
            return 100.0f;
        }
        return 170.0f;
    }

    @Override // com.corrodinggames.rts.game.units.y
    public float b(int i) {
        return 110.0f;
    }

    @Override // com.corrodinggames.rts.game.units.y
    public float e(int i) {
        return 25 + (i * 10);
    }

    @Override // com.corrodinggames.rts.game.units.y
    public float f(int i) {
        return 0.2f;
    }

    @Override // com.corrodinggames.rts.game.units.y
    public float z() {
        if (!Q()) {
            return 1.4f;
        }
        return 0.4f;
    }

    @Override // com.corrodinggames.rts.game.units.y
    public float A() {
        if (!Q()) {
            return 3.8f;
        }
        return 1.5f;
    }

    @Override // com.corrodinggames.rts.game.units.y
    public float B() {
        return 0.3f;
    }

    @Override // com.corrodinggames.rts.game.units.y
    public float c(int i) {
        return 4.0f;
    }

    @Override // com.corrodinggames.rts.game.units.y
    public float w(int i) {
        return 0.35f;
    }

    @Override // com.corrodinggames.rts.game.units.y
    public float y(int i) {
        return 0.38f;
    }

    @Override // com.corrodinggames.rts.game.units.y
    public boolean E() {
        return false;
    }

    @Override // com.corrodinggames.rts.game.units.y
    public float C() {
        return 0.03f;
    }

    @Override // com.corrodinggames.rts.game.units.y
    public float D() {
        return 0.1f;
    }

    @Override // com.corrodinggames.rts.game.units.am
    public boolean l() {
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.y
    public boolean bi() {
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.y
    public boolean bj() {
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.y
    public void i(float f2) {
        if (!Z()) {
            super.i(f2);
            return;
        }
        this.cg += f2;
        if (this.cg > 180.0f) {
            this.cg -= 360.0f;
        }
        if (this.cg < -180.0f) {
            this.cg += 360.0f;
        }
    }

    public int ds() {
        return 2;
    }

    @Override // com.corrodinggames.rts.game.units.am
    public float d(boolean z2) {
        return this.cL[ds()].f203a + 90.0f;
    }

    @Override // com.corrodinggames.rts.game.units.y
    public boolean ah() {
        if (!Q()) {
            return true;
        }
        return false;
    }

    @Override // com.corrodinggames.rts.game.units.y
    public boolean ae() {
        if (!Q()) {
            return false;
        }
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.y
    public boolean af() {
        if (!Q()) {
            return true;
        }
        return false;
    }

    @Override // com.corrodinggames.rts.game.units.y
    public boolean ag() {
        if (!Q()) {
            return true;
        }
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.am
    public void a(s sVar, boolean z2) {
        if (sVar == y) {
            this.r = true;
        }
        if (sVar == z) {
            this.r = false;
        }
    }

    @Override // com.corrodinggames.rts.game.units.am
    public ArrayList N() {
        return A;
    }

    @Override // com.corrodinggames.rts.game.units.am, com.corrodinggames.rts.gameFramework.w
    public void e(float f2) {
        super.e(f2);
        com.corrodinggames.rts.gameFramework.utility.y.a(this, m());
    }
}