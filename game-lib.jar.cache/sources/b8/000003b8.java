package com.corrodinggames.rts.game.units.e;

import com.corrodinggames.rts.R;
import com.corrodinggames.rts.game.PlayerData;
import com.corrodinggames.rts.game.units.a.s;
import com.corrodinggames.rts.game.units.a.x;
import com.corrodinggames.rts.game.units.ab;
import com.corrodinggames.rts.game.units.ak;
import com.corrodinggames.rts.game.units.am;
import com.corrodinggames.rts.game.units.ar;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.net.GameInputStream;
import com.corrodinggames.rts.gameFramework.net.GameOutputStream;
import com.corrodinggames.rts.gameFramework.utility.y;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/e/i.class */
public class i extends h implements ak {
    float e;
    float f;
    boolean g;
    com.corrodinggames.rts.gameFramework.utility.m h;

    /* renamed from: a  reason: collision with root package name */
    static com.corrodinggames.rts.gameFramework.m.e f351a = null;
    static com.corrodinggames.rts.gameFramework.m.e b = null;
    static com.corrodinggames.rts.gameFramework.m.e c = null;
    static com.corrodinggames.rts.gameFramework.m.e[] d = new com.corrodinggames.rts.gameFramework.m.e[10];
    public static final s i = new x(109) { // from class: com.corrodinggames.rts.game.units.e.i.1
        @Override // com.corrodinggames.rts.game.units.a.s
        public String a() {
            return "-Will unload all units when stopped";
        }

        @Override // com.corrodinggames.rts.game.units.a.s
        public String b() {
            return com.corrodinggames.rts.gameFramework.h.a.a("gui.actions.unload", new Object[0]);
        }

        @Override // com.corrodinggames.rts.game.units.a.x, com.corrodinggames.rts.game.units.a.s
        public int b(am amVar, boolean z) {
            return ((ak) amVar).bB();
        }

        @Override // com.corrodinggames.rts.game.units.a.s
        public boolean a(am amVar, boolean z) {
            return !((ak) amVar).bA() && ((ak) amVar).f() && ((ak) amVar).bB() > 0;
        }

        @Override // com.corrodinggames.rts.game.units.a.s
        public boolean b(am amVar) {
            return ((ak) amVar).j();
        }
    };
    public static final s j = new x(110) { // from class: com.corrodinggames.rts.game.units.e.i.2
        @Override // com.corrodinggames.rts.game.units.a.s
        public String a() {
            return "-Stop unloading";
        }

        @Override // com.corrodinggames.rts.game.units.a.s
        public String b() {
            return com.corrodinggames.rts.gameFramework.h.a.a("gui.actions.cancel", new Object[0]);
        }

        @Override // com.corrodinggames.rts.game.units.a.s
        public boolean a(am amVar, boolean z) {
            return ((ak) amVar).bA();
        }

        @Override // com.corrodinggames.rts.game.units.a.s
        public boolean b(am amVar) {
            return a(amVar, false);
        }
    };
    static ArrayList k = new ArrayList();

    static {
        k.add(i);
        k.add(j);
    }

    @Override // com.corrodinggames.rts.game.units.y, com.corrodinggames.rts.game.units.am, com.corrodinggames.rts.gameFramework.az, com.corrodinggames.rts.gameFramework.w, com.corrodinggames.rts.gameFramework.bq
    public void a(GameOutputStream gameOutputStream) {
        gameOutputStream.writeFloat(this.e);
        gameOutputStream.writeFloat(this.f);
        gameOutputStream.writeBoolean(this.g);
        gameOutputStream.writeInt(this.h.size());
        Iterator it = this.h.iterator();
        while (it.hasNext()) {
            gameOutputStream.a((am) it.next());
        }
        super.a(gameOutputStream);
    }

    @Override // com.corrodinggames.rts.game.units.y, com.corrodinggames.rts.game.units.am, com.corrodinggames.rts.gameFramework.az, com.corrodinggames.rts.gameFramework.w
    public void a(GameInputStream gameInputStream) {
        this.e = gameInputStream.readFloat();
        this.f = gameInputStream.readFloat();
        this.g = gameInputStream.readBoolean();
        this.h.clear();
        int readInt = gameInputStream.readInt();
        for (int i2 = 0; i2 < readInt; i2++) {
            am o = gameInputStream.o();
            if (o != null) {
                this.h.add(o);
            }
        }
        super.a(gameInputStream);
    }

    @Override // com.corrodinggames.rts.game.units.am
    /* renamed from: b */
    public ar r() {
        return ar.hovercraft;
    }

    public static void L() {
        GameEngine gameEngine = GameEngine.getGameEngine();
        f351a = gameEngine.bO.a(R.drawable.hovercraft);
        c = gameEngine.bO.a(R.drawable.hovercraft_shadow);
        b = gameEngine.bO.a(R.drawable.hovercraft_dead);
        d = PlayerData.a(f351a);
    }

    @Override // com.corrodinggames.rts.game.units.y
    public com.corrodinggames.rts.gameFramework.m.e d() {
        if (this.bV) {
            return b;
        }
        return d[this.bX.R()];
    }

    @Override // com.corrodinggames.rts.game.units.y
    public com.corrodinggames.rts.gameFramework.m.e k() {
        return c;
    }

    @Override // com.corrodinggames.rts.game.units.y
    public com.corrodinggames.rts.gameFramework.m.e d(int i2) {
        return null;
    }

    @Override // com.corrodinggames.rts.game.units.am
    public boolean e() {
        this.M = b;
        S(0);
        this.bT = false;
        f(true);
        a(ab.small);
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.y, com.corrodinggames.rts.game.units.am, com.corrodinggames.rts.gameFramework.ay, com.corrodinggames.rts.gameFramework.w
    public void a() {
        f(true);
        super.a();
    }

    public void f(boolean z) {
        Iterator it = this.h.iterator();
        while (it.hasNext()) {
            am amVar = (am) it.next();
            amVar.cN = null;
            amVar.eo = this.eo + (com.corrodinggames.rts.gameFramework.f.k(this.cg) * (-9.0f));
            amVar.ep = this.ep + (com.corrodinggames.rts.gameFramework.f.j(this.cg) * (-9.0f));
            if (z) {
                amVar.cj();
            }
        }
        this.h.clear();
    }

    public i(boolean z) {
        super(z);
        this.e = 0.0f;
        this.h = new com.corrodinggames.rts.gameFramework.utility.m();
        T(20);
        U(32);
        this.cj = 15.0f;
        this.ck = this.cj;
        this.cv = 450.0f;
        this.cu = this.cv;
        this.M = f351a;
        this.N = c;
    }

    public static int a(com.corrodinggames.rts.gameFramework.utility.m mVar) {
        int i2 = 0;
        Iterator it = mVar.iterator();
        while (it.hasNext()) {
            i2 += ((am) it.next()).cw();
        }
        return i2;
    }

    public static boolean a(com.corrodinggames.rts.gameFramework.utility.m mVar, int i2, am amVar) {
        if (a(mVar) + amVar.cw() <= i2) {
            return true;
        }
        return false;
    }

    @Override // com.corrodinggames.rts.game.units.am
    public int bY() {
        return a(this.h);
    }

    @Override // com.corrodinggames.rts.game.units.am
    public int bZ() {
        return 4;
    }

    public static boolean a(am amVar, am amVar2, boolean z) {
        return a(amVar, amVar2, z, 9.0f, -180.0f, 70.0f, 0.0f, 7.0f);
    }

    public static boolean a(am amVar, am amVar2, boolean z, float f, float f2, float f3, float f4, float f5) {
        float k2 = (amVar.eo + (com.corrodinggames.rts.gameFramework.f.k(amVar.cg + f2) * f5)) - (com.corrodinggames.rts.gameFramework.f.j(amVar.cg + f2) * f4);
        float j2 = amVar.ep + (com.corrodinggames.rts.gameFramework.f.j(amVar.cg + f2) * f5) + (com.corrodinggames.rts.gameFramework.f.k(amVar.cg + f2) * f4);
        float k3 = k2 + (com.corrodinggames.rts.gameFramework.f.k(amVar.cg + 90.0f) * (z ? -f : f));
        float j3 = j2 + (com.corrodinggames.rts.gameFramework.f.j(amVar.cg + 90.0f) * (z ? -f : f));
        if (!y.a(amVar2, k3, j3)) {
            k3 += 10.0f;
        }
        if (!y.a(amVar2, k3, j3)) {
            k3 -= 20.0f;
        }
        if (!y.a(amVar2, k3, j3)) {
            k3 -= 10.0f;
            j3 += 10.0f;
        }
        if (!y.a(amVar2, k3, j3)) {
            j3 -= 20.0f;
        }
        if (!y.a(amVar2, k3, j3)) {
            return false;
        }
        amVar2.cN = null;
        amVar2.eo = k3;
        amVar2.ep = j3;
        amVar2.bZ += 0.1f;
        amVar2.cg = amVar.cg + f2;
        amVar2.bR = amVar;
        amVar2.bS = 45.0f;
        if (amVar2 instanceof com.corrodinggames.rts.game.units.y) {
            com.corrodinggames.rts.game.units.y yVar = (com.corrodinggames.rts.game.units.y) amVar2;
            yVar.j(amVar2.cg);
            yVar.az();
            yVar.d(amVar2.eo + (com.corrodinggames.rts.gameFramework.f.k(amVar2.cg + (z ? -f : f)) * f3), amVar2.ep + (com.corrodinggames.rts.gameFramework.f.j(amVar2.cg + (z ? -f : f)) * f3));
            yVar.ac = 0;
            return true;
        }
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.e.h, com.corrodinggames.rts.game.units.e.j, com.corrodinggames.rts.game.units.y, com.corrodinggames.rts.game.units.am, com.corrodinggames.rts.gameFramework.w
    public void a(float f) {
        super.a(f);
        if (this.bV || !bT()) {
            return;
        }
        if (this.cl == 0.0f && this.em != 3) {
            S(3);
        }
        if (this.g && !cK() && !this.cK) {
            this.f = com.corrodinggames.rts.gameFramework.f.a(this.f, f);
            if (this.f == 0.0f) {
                this.f = 30.0f;
                if (this.h.size() == 0) {
                    this.g = false;
                } else {
                    boolean z = this.h.size() % 2 == 0;
                    am amVar = (am) this.h.remove(this.h.size() - 1);
                    if (!a(this, amVar, z)) {
                        this.h.add(amVar);
                    }
                    if (this.h.size() == 0) {
                        this.g = false;
                    }
                }
            }
        }
        this.e += 4.0f * f;
        if (this.e > 360.0f) {
            this.e -= 360.0f;
        }
        if (!this.g) {
            this.eq = com.corrodinggames.rts.gameFramework.f.a(this.eq, 3.0f + (com.corrodinggames.rts.gameFramework.f.j(this.e) * 1.5f), 0.1f * f);
        } else {
            this.eq = com.corrodinggames.rts.gameFramework.f.a(this.eq, 0.0f, 0.1f * f);
        }
    }

    @Override // com.corrodinggames.rts.game.units.y
    public void a(am amVar, int i2) {
    }

    @Override // com.corrodinggames.rts.game.units.y
    public float m() {
        return 30.0f;
    }

    @Override // com.corrodinggames.rts.game.units.y
    public float b(int i2) {
        return 100.0f;
    }

    @Override // com.corrodinggames.rts.game.units.y
    public float z() {
        if (cK()) {
            return 1.2f;
        }
        return 0.9f;
    }

    @Override // com.corrodinggames.rts.game.units.y
    public float A() {
        if (cK()) {
            return 1.8f;
        }
        return 1.4f;
    }

    @Override // com.corrodinggames.rts.game.units.y
    public float B() {
        return 0.1f;
    }

    @Override // com.corrodinggames.rts.game.units.y
    public float C() {
        return 0.03f;
    }

    @Override // com.corrodinggames.rts.game.units.y
    public float D() {
        return 0.05f;
    }

    @Override // com.corrodinggames.rts.game.units.y
    public float c(int i2) {
        return 99.0f;
    }

    @Override // com.corrodinggames.rts.game.units.am
    public boolean l() {
        return false;
    }

    @Override // com.corrodinggames.rts.game.units.am
    public boolean d(am amVar, boolean z) {
        if (this.g || !a(this.h, 4, amVar) || amVar == this) {
            return false;
        }
        if (this.bX != amVar.bX && !z) {
            return false;
        }
        return y.a(amVar, true, true);
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
        this.h.add(amVar);
        GameEngine.getGameEngine().bS.l(amVar);
    }

    @Override // com.corrodinggames.rts.game.units.ak
    public void e(am amVar) {
        if (amVar.cN == this) {
            this.h.remove(amVar);
            amVar.cN = null;
            return;
        }
        GameEngine.g("Unit is not being transported");
    }

    @Override // com.corrodinggames.rts.game.units.am
    public float bN() {
        return 12000.0f;
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
    public void a(s sVar, boolean z) {
        if (sVar == i) {
            M();
        }
        if (sVar == j) {
            ds();
        }
    }

    @Override // com.corrodinggames.rts.game.units.am
    public boolean cr() {
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.y, com.corrodinggames.rts.game.units.ak
    public int bB() {
        return this.h.size();
    }

    @Override // com.corrodinggames.rts.game.units.am
    public com.corrodinggames.rts.game.units.a.c cp() {
        return i.N();
    }

    @Override // com.corrodinggames.rts.game.units.am
    public ArrayList N() {
        return k;
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
    public com.corrodinggames.rts.gameFramework.utility.m bz() {
        return this.h;
    }
}