package com.corrodinggames.rts.game.units.d.a;

import android.graphics.PointF;
import android.graphics.Rect;
import com.corrodinggames.rts.AssetsID;
import com.corrodinggames.rts.game.PlayerData;
import com.corrodinggames.rts.game.units.a.s;
import com.corrodinggames.rts.game.units.a.t;
import com.corrodinggames.rts.game.units.a.w;
import com.corrodinggames.rts.game.units.ab;
import com.corrodinggames.rts.game.units.am;
import com.corrodinggames.rts.game.units.ar;
import com.corrodinggames.rts.game.units.d.i;
import com.corrodinggames.rts.game.units.d.j;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.net.GameInputStream;
import com.corrodinggames.rts.gameFramework.net.GameNetEngine;
import com.corrodinggames.rts.gameFramework.net.GameOutputStream;
import com.corrodinggames.rts.gameFramework.utility.SlickToAndroidKeycodes;
import com.corrodinggames.rts.gameFramework.utility.y;
import java.util.ArrayList;

/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/d/a/b.class */
public class b extends i {
    boolean j;
    int k;
    c l;
    boolean H;
    float I;
    float J;
    boolean K;
    Rect dK;
    static com.corrodinggames.rts.gameFramework.unitAction.e g = null;
    private static com.corrodinggames.rts.gameFramework.unitAction.e a = null;
    private static com.corrodinggames.rts.gameFramework.unitAction.e b = null;
    private static com.corrodinggames.rts.gameFramework.unitAction.e c = null;
    private static com.corrodinggames.rts.gameFramework.unitAction.e d = null;
    private static com.corrodinggames.rts.gameFramework.unitAction.e e = null;
    static com.corrodinggames.rts.gameFramework.unitAction.e[] h = new com.corrodinggames.rts.gameFramework.unitAction.e[10];
    static com.corrodinggames.rts.gameFramework.unitAction.e i = null;
    static String t = "gun";
    static String u = "gunT2";
    static String v = "gunT3";
    static String w = "artillery";
    static String x = "flamethrower";
    static String C = "aa_t1";
    static String D = "aa_t2";
    static String E = "aa_flak";
    static com.corrodinggames.rts.gameFramework.unitAction.e F = null;
    static com.corrodinggames.rts.gameFramework.unitAction.e[] G = new com.corrodinggames.rts.gameFramework.unitAction.e[10];
    public static s dL = new w(101) { // from class: com.corrodinggames.rts.game.units.d.a.b.1
        @Override // com.corrodinggames.rts.game.units.a.s
        public boolean g() {
            return false;
        }

        @Override // com.corrodinggames.rts.game.units.a.s
        public String a() {
            return "-Increases HP, attack damage, and range";
        }

        @Override // com.corrodinggames.rts.game.units.a.s
        public String b() {
            return com.corrodinggames.rts.gameFramework.translations.a.a("gui.actions.upgradeToGunT2", new Object[0]);
        }

        @Override // com.corrodinggames.rts.game.units.a.s
        public int c() {
            return 1000;
        }

        @Override // com.corrodinggames.rts.game.units.a.w
        public float K() {
            return 0.001f;
        }

        @Override // com.corrodinggames.rts.game.units.a.s
        public boolean a(am amVar, boolean z) {
            b bVar = (b) amVar;
            if (bVar.M() != 1 || bVar.a(s.i, z) > 0) {
                return false;
            }
            return super.a(amVar, z);
        }

        @Override // com.corrodinggames.rts.game.units.a.s
        public boolean b(am amVar) {
            if (((b) amVar).M() != 1) {
                return false;
            }
            return true;
        }

        @Override // com.corrodinggames.rts.game.units.a.s
        /* renamed from: L */
        public ar mo3i() {
            return null;
        }

        @Override // com.corrodinggames.rts.game.units.a.s
        public t f() {
            return t.upgrade;
        }

        @Override // com.corrodinggames.rts.game.units.a.s
        public void f(am amVar) {
            b bVar = (b) amVar;
            bVar.b(b.u);
            bVar.W();
        }
    };
    public static s dM = new w(104) { // from class: com.corrodinggames.rts.game.units.d.a.b.2
        @Override // com.corrodinggames.rts.game.units.a.s
        public boolean g() {
            return false;
        }

        @Override // com.corrodinggames.rts.game.units.a.s
        public String a() {
            return "-Extra attack damage, and range.\n-Large amount of HP\n-Self repair";
        }

        @Override // com.corrodinggames.rts.game.units.a.s
        public String b() {
            return com.corrodinggames.rts.gameFramework.translations.a.a("gui.actions.upgradeToGunT3", new Object[0]);
        }

        @Override // com.corrodinggames.rts.game.units.a.s
        public int c() {
            return 11000;
        }

        @Override // com.corrodinggames.rts.game.units.a.w
        public float K() {
            return 3.0E-4f;
        }

        @Override // com.corrodinggames.rts.game.units.a.s
        public boolean a(am amVar, boolean z) {
            if (((b) amVar).a(s.i, z) > 0) {
                return false;
            }
            return super.a(amVar, z);
        }

        @Override // com.corrodinggames.rts.game.units.a.s
        public boolean b(am amVar) {
            if (!(((b) amVar).l instanceof f)) {
                return false;
            }
            return true;
        }

        @Override // com.corrodinggames.rts.game.units.a.s
        /* renamed from: L */
        public ar mo3i() {
            return null;
        }

        @Override // com.corrodinggames.rts.game.units.a.s
        public t f() {
            return t.upgrade;
        }

        @Override // com.corrodinggames.rts.game.units.a.s
        public void f(am amVar) {
            b bVar = (b) amVar;
            bVar.b(b.v);
            bVar.W();
        }
    };
    public static s dN = new w(102) { // from class: com.corrodinggames.rts.game.units.d.a.b.3
        @Override // com.corrodinggames.rts.game.units.a.s
        public boolean g() {
            return false;
        }

        @Override // com.corrodinggames.rts.game.units.a.s
        public String a() {
            return "-Large increase in range";
        }

        @Override // com.corrodinggames.rts.game.units.a.s
        public String b() {
            return com.corrodinggames.rts.gameFramework.translations.a.a("gui.actions.upgradeToArtillery", new Object[0]);
        }

        @Override // com.corrodinggames.rts.game.units.a.s
        public int c() {
            return 1600;
        }

        @Override // com.corrodinggames.rts.game.units.a.w
        public float K() {
            return 4.0E-4f;
        }

        @Override // com.corrodinggames.rts.game.units.a.s
        public boolean a(am amVar, boolean z) {
            b bVar = (b) amVar;
            if (bVar.M() != 1 || bVar.a(s.i, z) > 0) {
                return false;
            }
            return super.a(amVar, z);
        }

        @Override // com.corrodinggames.rts.game.units.a.s
        public boolean b(am amVar) {
            if (((b) amVar).M() != 1) {
                return false;
            }
            return true;
        }

        @Override // com.corrodinggames.rts.game.units.a.s
        /* renamed from: L */
        public ar mo3i() {
            return null;
        }

        @Override // com.corrodinggames.rts.game.units.a.s
        public t f() {
            return t.upgrade;
        }

        @Override // com.corrodinggames.rts.game.units.a.s
        public void f(am amVar) {
            b bVar = (b) amVar;
            bVar.b(b.w);
            bVar.W();
        }
    };
    public static s dO = new w(103) { // from class: com.corrodinggames.rts.game.units.d.a.b.4
        @Override // com.corrodinggames.rts.game.units.a.s
        public boolean g() {
            return false;
        }

        @Override // com.corrodinggames.rts.game.units.a.s
        public String a() {
            return "-Short range area affect\n-Adds self-repair";
        }

        @Override // com.corrodinggames.rts.game.units.a.s
        public String b() {
            return com.corrodinggames.rts.gameFramework.translations.a.a("gui.actions.upgradeToFlamethrower", new Object[0]);
        }

        @Override // com.corrodinggames.rts.game.units.a.s
        public int c() {
            return 700;
        }

        @Override // com.corrodinggames.rts.game.units.a.w
        public float K() {
            return 0.002f;
        }

        @Override // com.corrodinggames.rts.game.units.a.s
        public boolean a(am amVar, boolean z) {
            b bVar = (b) amVar;
            if (bVar.M() != 1 || bVar.a(s.i, z) > 0) {
                return false;
            }
            return super.a(amVar, z);
        }

        @Override // com.corrodinggames.rts.game.units.a.s
        public boolean b(am amVar) {
            if (((b) amVar).M() != 1) {
                return false;
            }
            return true;
        }

        @Override // com.corrodinggames.rts.game.units.a.s
        /* renamed from: L */
        public ar mo3i() {
            return null;
        }

        @Override // com.corrodinggames.rts.game.units.a.s
        public t f() {
            return t.upgrade;
        }

        @Override // com.corrodinggames.rts.game.units.a.s
        public void f(am amVar) {
            b bVar = (b) amVar;
            bVar.b(b.x);
            bVar.W();
        }
    };
    static ArrayList dP = new ArrayList();

    static {
        dP.add(dL);
        dP.add(dM);
        dP.add(dN);
        dP.add(dO);
    }

    public int M() {
        return this.l.b();
    }

    @Override // com.corrodinggames.rts.game.units.y
    public float H(int i2) {
        return this.l.h(i2);
    }

    @Override // com.corrodinggames.rts.game.units.am
    public void a_(String str) {
        b(str);
    }

    public void b(String str) {
        if (!this.l.a(str)) {
            c cVar = this.l;
            this.l = c(str);
            this.l.a(cVar);
        }
    }

    public c c(String str) {
        if (str.equals(t)) {
            return new h(this);
        }
        if (str.equals(u)) {
            return new f(this);
        }
        if (str.equals(v)) {
            return new g(this);
        }
        if (str.equals(w)) {
            return new d(this);
        }
        if (str.equals(x)) {
            return new e(this);
        }
        return null;
    }

    @Override // com.corrodinggames.rts.game.units.d.i, com.corrodinggames.rts.game.units.d.d, com.corrodinggames.rts.game.units.y, com.corrodinggames.rts.game.units.am, com.corrodinggames.rts.gameFramework.az, com.corrodinggames.rts.gameFramework.w, com.corrodinggames.rts.gameFramework.bq
    public void a(GameOutputStream gameOutputStream) {
        gameOutputStream.writeBoolean(this.j);
        gameOutputStream.writeBoolean(this.k == 1);
        gameOutputStream.writeString(this.l.c());
        gameOutputStream.writeInt(this.k);
        super.a(gameOutputStream);
    }

    @Override // com.corrodinggames.rts.game.units.d.i, com.corrodinggames.rts.game.units.d.d, com.corrodinggames.rts.game.units.y, com.corrodinggames.rts.game.units.am, com.corrodinggames.rts.gameFramework.az, com.corrodinggames.rts.gameFramework.w
    public void a(GameInputStream gameInputStream) {
        boolean readBoolean = gameInputStream.readBoolean();
        if (readBoolean) {
            a(2);
        }
        if (gameInputStream.b() >= 27) {
            this.k = gameInputStream.readBoolean() ? 1 : 0;
        }
        if (gameInputStream.b() >= 35) {
            String readString = gameInputStream.readString();
            if (!this.l.a(readString)) {
                b(readString);
            }
            this.k = gameInputStream.readInt();
        } else if (readBoolean && !(this instanceof a)) {
            b(u);
        }
        super.a(gameInputStream);
    }

    @Override // com.corrodinggames.rts.game.units.d.d, com.corrodinggames.rts.game.units.am
    public com.corrodinggames.rts.gameFramework.unitAction.e v() {
        if (this.bX.site == -1) {
            return null;
        }
        return G[this.bX.R()];
    }

    public static void dB() {
        GameEngine gameEngine = GameEngine.getGameEngine();
        g = gameEngine.bO.a(AssetsID.drawable.turret_base);
        i = gameEngine.bO.a(AssetsID.drawable.turret_base_dead);
        a = gameEngine.bO.a(AssetsID.drawable.turret_top);
        b = gameEngine.bO.a(AssetsID.drawable.turret_top_l2);
        c = gameEngine.bO.a(AssetsID.drawable.turret_top_l3);
        d = gameEngine.bO.a(AssetsID.drawable.turret_top_artillery);
        e = gameEngine.bO.a(AssetsID.drawable.turret_top_flame);
        h = PlayerData.a(g);
        F = gameEngine.bO.a(AssetsID.drawable.unit_icon_building_turrent);
        G = PlayerData.a(F);
    }

    @Override // com.corrodinggames.rts.game.units.d.d
    public boolean L() {
        this.M = i;
        S(0);
        this.bT = false;
        a(ab.large);
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.y
    public com.corrodinggames.rts.gameFramework.unitAction.e d() {
        if (this.bV) {
            return i;
        }
        if (this.bX == null) {
            return h[h.length - 1];
        }
        return h[this.bX.R()];
    }

    @Override // com.corrodinggames.rts.game.units.y
    public com.corrodinggames.rts.gameFramework.unitAction.e k() {
        return null;
    }

    @Override // com.corrodinggames.rts.game.units.d.d, com.corrodinggames.rts.game.units.y
    public com.corrodinggames.rts.gameFramework.unitAction.e d(int i2) {
        return this.l.d(i2);
    }

    public b(boolean z) {
        super(z);
        this.l = new h(this);
        this.H = true;
        this.dK = new Rect();
        T(35);
        U(42);
        this.cj = 16.0f;
        this.ck = this.cj;
        this.cv = 700.0f;
        this.cu = this.cv;
        this.M = g;
        this.cL[0].a = com.corrodinggames.rts.gameFramework.f.a(this, -180, (int) SlickToAndroidKeycodes.AndroidCodes.KEYCODE_STB_INPUT);
        this.n.a(0, 0, 1, 1);
        this.o.a(0, 0, 1, 1);
    }

    public void s(float f) {
        if (this.cL[0].a()) {
            if (this.H) {
                this.I = this.cL[0].a;
                this.H = false;
                this.J = com.corrodinggames.rts.gameFramework.f.a(this, 0, 120);
            }
            this.J += f;
            if (this.J > 450.0f) {
                this.J = com.corrodinggames.rts.gameFramework.f.a(this, 0, 30);
                this.K = !this.K;
            }
            if (this.J < 120.0f) {
                if (this.K) {
                    a(f * 0.3f, this.I - 20.0f, 0);
                    return;
                } else {
                    a(f * 0.3f, this.I + 20.0f, 0);
                    return;
                }
            }
            return;
        }
        this.H = true;
    }

    @Override // com.corrodinggames.rts.game.units.d.i, com.corrodinggames.rts.game.units.y, com.corrodinggames.rts.game.units.am, com.corrodinggames.rts.gameFramework.w
    public void a(float f) {
        super.a(f);
        if (bT()) {
            this.l.a(f);
        }
    }

    @Override // com.corrodinggames.rts.game.units.d.i, com.corrodinggames.rts.game.units.y
    public void a(am amVar, int i2) {
        this.l.a(amVar, i2);
    }

    @Override // com.corrodinggames.rts.game.units.d.i, com.corrodinggames.rts.game.units.y
    public float m() {
        return this.l.a();
    }

    @Override // com.corrodinggames.rts.game.units.d.i, com.corrodinggames.rts.game.units.y
    public float b(int i2) {
        return this.l.a(i2);
    }

    @Override // com.corrodinggames.rts.game.units.d.i, com.corrodinggames.rts.game.units.y
    public float c(int i2) {
        return this.l.e(i2);
    }

    @Override // com.corrodinggames.rts.game.units.y
    public float w(int i2) {
        return this.l.f(i2);
    }

    @Override // com.corrodinggames.rts.game.units.y
    public boolean b(int i2, float f) {
        return false;
    }

    @Override // com.corrodinggames.rts.game.units.d.i, com.corrodinggames.rts.game.units.d.d, com.corrodinggames.rts.game.units.y, com.corrodinggames.rts.game.units.am, com.corrodinggames.rts.gameFramework.w
    public boolean c(float f) {
        if (!super.c(f)) {
            return false;
        }
        if (!this.bV) {
            dC();
            return true;
        }
        return true;
    }

    void dC() {
        GameEngine gameEngine = GameEngine.getGameEngine();
        com.corrodinggames.rts.gameFramework.unitAction.e d2 = d(0);
        PointF G2 = G(0);
        gameEngine.bO.a(d2, G2.x - GameEngine.getGameEngine().cw, G2.y - GameEngine.getGameEngine().cx, this.cL[0].a, f());
    }

    @Override // com.corrodinggames.rts.game.units.am
    /* renamed from: K */
    public ar mo1r() {
        return ar.turret;
    }

    @Override // com.corrodinggames.rts.game.units.d.i, com.corrodinggames.rts.game.units.am
    public boolean l() {
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.y
    public boolean af() {
        return false;
    }

    @Override // com.corrodinggames.rts.game.units.y
    public float g(int i2) {
        return this.l.g(i2);
    }

    @Override // com.corrodinggames.rts.game.units.y
    public void M(int i2) {
        if (b(i2) < 10.0f) {
            return;
        }
        super.M(i2);
    }

    @Override // com.corrodinggames.rts.game.units.d.i, com.corrodinggames.rts.game.units.d.l
    public void a(j jVar) {
        s a2 = a(jVar.j);
        if (a2 != null) {
            a2.f(this);
        } else {
            GameNetEngine.a("specialAction=null on completeQueueItem(turret) for item.uIndex:" + jVar.j + " id:" + this.eh, true);
        }
    }

    @Override // com.corrodinggames.rts.game.units.am
    public com.corrodinggames.rts.game.units.a.c cm() {
        if (M() == 1) {
            return dL.N();
        }
        if (this.l instanceof f) {
            return dM.N();
        }
        return s.i;
    }

    @Override // com.corrodinggames.rts.game.units.am
    public void a(ArrayList arrayList) {
        arrayList.clear();
        if (M() == 1) {
            arrayList.add(dN.N());
            arrayList.add(dO.N());
        }
    }

    @Override // com.corrodinggames.rts.game.units.d.d, com.corrodinggames.rts.game.units.y
    public void a(int i2) {
        if (i2 == 1) {
            this.j = false;
        } else if (i2 == 2 && !this.j) {
            this.j = true;
        }
    }

    @Override // com.corrodinggames.rts.game.units.y
    public PointF E(int i2) {
        return this.l.c(i2);
    }

    @Override // com.corrodinggames.rts.game.units.d.i, com.corrodinggames.rts.game.units.am
    public float bV() {
        if (this.cL[0].e > 0.0f && this.l.a(w)) {
            return 1.0f - (this.cL[0].e / b(0));
        }
        return super.bV();
    }

    @Override // com.corrodinggames.rts.game.units.y
    public PointF G(int i2) {
        bh.setSite(super.G(i2));
        bh.moveAdd(0.0f, -5.0f);
        return bh;
    }

    @Override // com.corrodinggames.rts.game.units.am
    public ArrayList N() {
        return dP;
    }

    @Override // com.corrodinggames.rts.game.units.am, com.corrodinggames.rts.gameFramework.w
    public void e(float f) {
        super.e(f);
        y.a(this, m());
    }

    @Override // com.corrodinggames.rts.game.units.am
    public float cZ() {
        return GameEngine.getGameEngine().bL.n;
    }

    @Override // com.corrodinggames.rts.game.units.am
    public float da() {
        return GameEngine.getGameEngine().bL.o;
    }

    @Override // com.corrodinggames.rts.game.units.am
    public float db() {
        return super.db() - 8.0f;
    }

    @Override // com.corrodinggames.rts.game.units.am
    public int cL() {
        return this.l.d();
    }

    @Override // com.corrodinggames.rts.game.units.y
    public float q(int i2) {
        return this.l.b(i2);
    }
}