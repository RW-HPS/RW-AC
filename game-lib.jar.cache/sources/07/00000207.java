package com.corrodinggames.rts.game.units.b;

import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.Rect;
import com.corrodinggames.rts.AssetsID;
import com.corrodinggames.rts.game.PlayerData;
import com.corrodinggames.rts.game.Projectile;
import com.corrodinggames.rts.game.units.a.s;
import com.corrodinggames.rts.game.units.a.x;
import com.corrodinggames.rts.game.units.ak;
import com.corrodinggames.rts.game.units.am;
import com.corrodinggames.rts.game.units.ar;
import com.corrodinggames.rts.game.units.e.i;
import com.corrodinggames.rts.game.units.y;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.net.GameInputStream;
import com.corrodinggames.rts.gameFramework.net.GameOutputStream;
import com.corrodinggames.rts.gameFramework.utility.SlickToAndroidKeycodes;
import com.corrodinggames.rts.gameFramework.utility.m;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/b/d.class */
public class d extends b implements ak {
    float e;
    float f;
    boolean g;
    m o;
    Rect p;
    static com.corrodinggames.rts.gameFramework.unitAction.e a = null;
    static com.corrodinggames.rts.gameFramework.unitAction.e b = null;
    static com.corrodinggames.rts.gameFramework.unitAction.e c = null;
    static com.corrodinggames.rts.gameFramework.unitAction.e[] d = new com.corrodinggames.rts.gameFramework.unitAction.e[10];
    public static final s q = new x(109) { // from class: com.corrodinggames.rts.game.units.b.d.1
        @Override // com.corrodinggames.rts.game.units.a.s
        public String a() {
            return "-Will unload all units when stopped";
        }

        @Override // com.corrodinggames.rts.game.units.a.s
        public String b() {
            return com.corrodinggames.rts.gameFramework.translations.a.a("gui.actions.unload", new Object[0]);
        }

        @Override // com.corrodinggames.rts.game.units.a.x, com.corrodinggames.rts.game.units.a.s
        public int b(am amVar, boolean z) {
            return ((d) amVar).o.size();
        }

        @Override // com.corrodinggames.rts.game.units.a.s
        public boolean a(am amVar, boolean z) {
            return (((d) amVar).g || ((y) amVar).cK() || ((d) amVar).o.size() <= 0) ? false : true;
        }
    };
    public static final s r = new x(110) { // from class: com.corrodinggames.rts.game.units.b.d.2
        @Override // com.corrodinggames.rts.game.units.a.s
        public String a() {
            return "-Stop unloading";
        }

        @Override // com.corrodinggames.rts.game.units.a.s
        public String b() {
            return com.corrodinggames.rts.gameFramework.translations.a.a("gui.actions.cancel", new Object[0]);
        }

        @Override // com.corrodinggames.rts.game.units.a.s
        public boolean a(am amVar, boolean z) {
            return ((d) amVar).g;
        }

        @Override // com.corrodinggames.rts.game.units.a.s
        public boolean b(am amVar) {
            return a(amVar, false);
        }
    };
    static ArrayList s = new ArrayList();

    static {
        s.add(q);
        s.add(r);
    }

    @Override // com.corrodinggames.rts.game.units.b.b, com.corrodinggames.rts.game.units.y, com.corrodinggames.rts.game.units.am, com.corrodinggames.rts.gameFramework.az, com.corrodinggames.rts.gameFramework.w, com.corrodinggames.rts.gameFramework.bq
    public void a(GameOutputStream gameOutputStream) {
        gameOutputStream.writeFloat(this.e);
        gameOutputStream.writeFloat(this.f);
        gameOutputStream.writeBoolean(this.g);
        gameOutputStream.writeInt(this.o.size());
        Iterator it = this.o.iterator();
        while (it.hasNext()) {
            gameOutputStream.a((am) it.next());
        }
        super.a(gameOutputStream);
    }

    @Override // com.corrodinggames.rts.game.units.b.b, com.corrodinggames.rts.game.units.y, com.corrodinggames.rts.game.units.am, com.corrodinggames.rts.gameFramework.az, com.corrodinggames.rts.gameFramework.w
    public void a(GameInputStream gameInputStream) {
        this.e = gameInputStream.readFloat();
        this.f = gameInputStream.readFloat();
        this.g = gameInputStream.readBoolean();
        this.o.clear();
        int readInt = gameInputStream.readInt();
        for (int i = 0; i < readInt; i++) {
            am o = gameInputStream.o();
            if (o != null) {
                this.o.add(o);
            }
        }
        super.a(gameInputStream);
    }

    @Override // com.corrodinggames.rts.game.units.am
    public int bY() {
        return i.a(this.o);
    }

    @Override // com.corrodinggames.rts.game.units.am
    public int bZ() {
        return 4;
    }

    @Override // com.corrodinggames.rts.game.units.am
    /* renamed from: b */
    public ar mo1r() {
        return ar.dropship;
    }

    public static void L() {
        GameEngine gameEngine = GameEngine.getGameEngine();
        b = gameEngine.bO.a(AssetsID.drawable.dropship);
        c = gameEngine.bO.a(AssetsID.drawable.dropship_shadow);
        a = gameEngine.bO.a(AssetsID.drawable.dropship_dead);
        d = PlayerData.a(b);
    }

    @Override // com.corrodinggames.rts.game.units.y
    public com.corrodinggames.rts.gameFramework.unitAction.e d() {
        if (this.bV) {
            return a;
        }
        return d[this.bX.R()];
    }

    @Override // com.corrodinggames.rts.game.units.y
    public com.corrodinggames.rts.gameFramework.unitAction.e k() {
        return c;
    }

    @Override // com.corrodinggames.rts.game.units.y
    public com.corrodinggames.rts.gameFramework.unitAction.e d(int i) {
        return null;
    }

    @Override // com.corrodinggames.rts.game.units.b.b, com.corrodinggames.rts.game.units.am
    public boolean e() {
        GameEngine.getGameEngine().bR.b(this.eo, this.ep, this.eq);
        this.M = a;
        S(0);
        this.bT = false;
        f(true);
        return true;
    }

    public d(boolean z) {
        super(z);
        this.e = 0.0f;
        this.o = new m();
        this.p = new Rect();
        T(45);
        U(47);
        this.cj = 20.0f;
        this.ck = this.cj + 0.0f;
        this.cv = 500.0f;
        this.cu = this.cv;
        this.M = b;
        this.N = c;
        this.eq = 0.0f;
    }

    @Override // com.corrodinggames.rts.game.units.w, com.corrodinggames.rts.game.units.y
    public boolean I() {
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.w, com.corrodinggames.rts.game.units.am
    public boolean i() {
        return this.eq >= 4.0f;
    }

    @Override // com.corrodinggames.rts.game.units.am
    public boolean ct() {
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.b.b, com.corrodinggames.rts.game.units.y, com.corrodinggames.rts.game.units.am, com.corrodinggames.rts.gameFramework.w
    public void a(float f) {
        super.a(f);
        if (this.bV) {
            return;
        }
        boolean cK = cK();
        if (this.g && !cK && !this.cK && this.eq < 4.0f) {
            this.f = com.corrodinggames.rts.gameFramework.f.a(this.f, f);
            if (this.f == 0.0f) {
                this.f = 30.0f;
                if (this.o.size() == 0) {
                    this.g = false;
                } else {
                    boolean z = this.o.size() % 2 == 0;
                    float k = this.eo + (com.corrodinggames.rts.gameFramework.f.k(this.cg) * (-9.0f));
                    float j = this.ep + (com.corrodinggames.rts.gameFramework.f.j(this.cg) * (-9.0f));
                    float k2 = k + (com.corrodinggames.rts.gameFramework.f.k(this.cg + 90.0f) * (z ? -7 : 7)) + (com.corrodinggames.rts.gameFramework.f.j(this.cg + 90.0f) * (z ? -7 : 7));
                    am amVar = (am) this.o.remove(this.o.size() - 1);
                    if (!com.corrodinggames.rts.gameFramework.utility.y.a(amVar, k2, j)) {
                        k2 += 10.0f;
                    }
                    if (!com.corrodinggames.rts.gameFramework.utility.y.a(amVar, k2, j)) {
                        k2 -= 20.0f;
                    }
                    if (!com.corrodinggames.rts.gameFramework.utility.y.a(amVar, k2, j)) {
                        k2 -= 10.0f;
                        j += 10.0f;
                    }
                    if (!com.corrodinggames.rts.gameFramework.utility.y.a(amVar, k2, j)) {
                        j -= 20.0f;
                    }
                    if (!com.corrodinggames.rts.gameFramework.utility.y.a(amVar, k2, j)) {
                        this.o.add(amVar);
                    } else {
                        amVar.cN = null;
                        amVar.eo = k2;
                        amVar.ep = j;
                        amVar.bZ += 0.1f;
                        amVar.cg = this.cg + 180.0f;
                        amVar.bR = this;
                        amVar.bS = 45.0f;
                        if (amVar instanceof y) {
                            y yVar = (y) amVar;
                            yVar.az();
                            yVar.d(this.eo + (com.corrodinggames.rts.gameFramework.f.k(this.cg) * (-66.0f)), this.ep + (com.corrodinggames.rts.gameFramework.f.j(this.cg) * (-66.0f)));
                        }
                        if (this.o.size() == 0) {
                            this.g = false;
                        }
                    }
                }
            }
        }
        this.e += 2.0f * f;
        if (this.e > 360.0f) {
            this.e -= 360.0f;
        }
        boolean i = i();
        if (bT()) {
            if (aq() && !cK) {
                this.eq = com.corrodinggames.rts.gameFramework.f.a(this.eq, 2.0f, 0.4f * f);
            } else {
                this.eq = com.corrodinggames.rts.gameFramework.f.a(this.eq, 35.0f + (com.corrodinggames.rts.gameFramework.f.j(this.e) * 1.5f), 0.35f * f);
            }
        }
        if (i != i()) {
            this.ay = true;
            if (i()) {
                S(5);
            } else {
                S(2);
            }
        }
    }

    @Override // com.corrodinggames.rts.game.units.y
    public PointF E(int i) {
        float g = g(i);
        float f = this.cg;
        bg.setSite(this.eo + (com.corrodinggames.rts.gameFramework.f.k(f) * g), this.ep + (com.corrodinggames.rts.gameFramework.f.j(f) * g));
        return bg;
    }

    @Override // com.corrodinggames.rts.game.units.y
    public void a(am amVar, int i) {
        PointF E = E(i);
        Projectile a2 = Projectile.a(this, E.x, E.y, this.eq, i);
        a2.ar = Color.a(255, 150, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_DATA_SERVICE, 40);
        a2.U = 35.0f;
        a2.l = amVar;
        a2.h = 80.0f;
        a2.t = 4.0f;
        a2.x = 2.0f;
        GameEngine gameEngine = GameEngine.getGameEngine();
        gameEngine.bR.a(E.x, E.y, this.eq, -1127220);
        gameEngine.bR.a(E.x, E.y, this.eq, this.cL[i].a);
        gameEngine.bM.a(com.corrodinggames.rts.gameFramework.a.e.u, 0.3f, this.eo, this.ep);
    }

    @Override // com.corrodinggames.rts.game.units.y
    public float m() {
        return 140.0f;
    }

    @Override // com.corrodinggames.rts.game.units.y
    public float b(int i) {
        return 40.0f;
    }

    @Override // com.corrodinggames.rts.game.units.y
    public float z() {
        return 2.3f;
    }

    @Override // com.corrodinggames.rts.game.units.y
    public float A() {
        return 1.4f;
    }

    @Override // com.corrodinggames.rts.game.units.y
    public float c(int i) {
        return 99.0f;
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
        return 0.05f;
    }

    @Override // com.corrodinggames.rts.game.units.am
    public boolean l() {
        return false;
    }

    @Override // com.corrodinggames.rts.game.units.y
    public float g(int i) {
        return 15.0f;
    }

    @Override // com.corrodinggames.rts.game.units.y, com.corrodinggames.rts.game.units.am, com.corrodinggames.rts.gameFramework.ay, com.corrodinggames.rts.gameFramework.w
    public void a() {
        f(true);
        super.a();
    }

    public void f(boolean z) {
        Iterator it = this.o.iterator();
        while (it.hasNext()) {
            am amVar = (am) it.next();
            amVar.cN = null;
            amVar.eo = this.eo + (com.corrodinggames.rts.gameFramework.f.k(this.cg) * (-9.0f));
            amVar.ep = this.ep + (com.corrodinggames.rts.gameFramework.f.j(this.cg) * (-9.0f));
            if (z) {
                amVar.cj();
            }
        }
        this.o.clear();
    }

    @Override // com.corrodinggames.rts.game.units.y, com.corrodinggames.rts.game.units.ak
    public boolean bA() {
        return this.g;
    }

    public void M() {
        this.g = true;
        this.f = 30.0f;
    }

    public void ds() {
        this.g = false;
    }

    @Override // com.corrodinggames.rts.game.units.am
    public float bN() {
        return 16000.0f;
    }

    @Override // com.corrodinggames.rts.game.units.am
    public boolean d(am amVar, boolean z) {
        if (this.g || !i.a(this.o, 4, amVar) || amVar == this) {
            return false;
        }
        if (this.bX != amVar.bX && !z) {
            return false;
        }
        return com.corrodinggames.rts.gameFramework.utility.y.a(amVar, true, true);
    }

    @Override // com.corrodinggames.rts.game.units.am
    public boolean e(am amVar, boolean z) {
        if (!d(amVar, z)) {
            return false;
        }
        C(amVar);
        return true;
    }

    public void C(am amVar) {
        amVar.cN = this;
        this.o.add(amVar);
        GameEngine.getGameEngine().bS.l(amVar);
    }

    @Override // com.corrodinggames.rts.game.units.ak
    public void e(am amVar) {
        if (amVar.cN == this) {
            this.o.remove(amVar);
            amVar.cN = null;
            return;
        }
        GameEngine.g("Unit is not being transported");
    }

    @Override // com.corrodinggames.rts.game.units.am
    public void a(s sVar, boolean z) {
        if (sVar == q) {
            M();
        }
        if (sVar == r) {
            ds();
        }
    }

    @Override // com.corrodinggames.rts.game.units.y, com.corrodinggames.rts.game.units.ak
    public int bB() {
        return this.o.size();
    }

    @Override // com.corrodinggames.rts.game.units.am
    public boolean cr() {
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.am
    public com.corrodinggames.rts.game.units.a.c cp() {
        return q.N();
    }

    @Override // com.corrodinggames.rts.game.units.am
    public ArrayList N() {
        return s;
    }

    @Override // com.corrodinggames.rts.game.units.ak
    public boolean f() {
        return !cK();
    }

    @Override // com.corrodinggames.rts.game.units.ak
    public boolean j() {
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.y
    public m bz() {
        return this.o;
    }
}