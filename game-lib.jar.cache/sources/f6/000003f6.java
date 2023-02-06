package com.corrodinggames.rts.game.units.h;

import android.graphics.Color;
import android.graphics.PointF;
import com.corrodinggames.rts.AssetsID;
import com.corrodinggames.rts.game.PlayerData;
import com.corrodinggames.rts.game.Projectile;
import com.corrodinggames.rts.game.units.a.s;
import com.corrodinggames.rts.game.units.a.x;
import com.corrodinggames.rts.game.units.am;
import com.corrodinggames.rts.game.units.ao;
import com.corrodinggames.rts.game.units.ar;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.net.GameInputStream;
import com.corrodinggames.rts.gameFramework.net.GameOutputStream;
import com.corrodinggames.rts.gameFramework.utility.SlickToAndroidKeycodes;
import com.corrodinggames.rts.gameFramework.utility.y;
import java.util.ArrayList;

/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/h/e.class */
public class e extends f {
    boolean a;
    boolean b;
    float c;
    static com.corrodinggames.rts.gameFramework.unitAction.e d = null;
    static com.corrodinggames.rts.gameFramework.unitAction.e e = null;
    static com.corrodinggames.rts.gameFramework.unitAction.e f = null;
    public static com.corrodinggames.rts.gameFramework.unitAction.e g = null;
    public static com.corrodinggames.rts.gameFramework.unitAction.e[] h = new com.corrodinggames.rts.gameFramework.unitAction.e[10];
    static com.corrodinggames.rts.gameFramework.unitAction.e[] i = new com.corrodinggames.rts.gameFramework.unitAction.e[10];
    public static final s j = new x(151) { // from class: com.corrodinggames.rts.game.units.h.e.1
        @Override // com.corrodinggames.rts.game.units.a.s
        public String a() {
            return "-Surface unit. Allows it to fire missiles";
        }

        @Override // com.corrodinggames.rts.game.units.a.s
        public String b() {
            return "Surface";
        }

        @Override // com.corrodinggames.rts.game.units.a.s
        public boolean a(am amVar, boolean z) {
            return !((e) amVar).a;
        }
    };
    public static final s k = new x(152) { // from class: com.corrodinggames.rts.game.units.h.e.2
        @Override // com.corrodinggames.rts.game.units.a.s
        public String a() {
            return "-Dive unit underwater. Evades most attacks";
        }

        @Override // com.corrodinggames.rts.game.units.a.s
        public String b() {
            return "Dive";
        }

        @Override // com.corrodinggames.rts.game.units.a.s
        public boolean a(am amVar, boolean z) {
            return ((e) amVar).a;
        }
    };
    static ArrayList l = new ArrayList();

    @Override // com.corrodinggames.rts.game.units.h.f, com.corrodinggames.rts.game.units.y, com.corrodinggames.rts.game.units.am, com.corrodinggames.rts.gameFramework.az, com.corrodinggames.rts.gameFramework.w, com.corrodinggames.rts.gameFramework.bq
    public void a(GameOutputStream gameOutputStream) {
        gameOutputStream.writeBoolean(this.a);
        gameOutputStream.writeFloat(this.c);
        super.a(gameOutputStream);
    }

    @Override // com.corrodinggames.rts.game.units.h.f, com.corrodinggames.rts.game.units.y, com.corrodinggames.rts.game.units.am, com.corrodinggames.rts.gameFramework.az, com.corrodinggames.rts.gameFramework.w
    public void a(GameInputStream gameInputStream) {
        this.a = gameInputStream.readBoolean();
        this.b = !Q();
        if (gameInputStream.b() >= 21) {
            this.c = gameInputStream.readFloat();
        }
        L();
        super.a(gameInputStream);
    }

    static {
        l.add(j);
        l.add(k);
    }

    @Override // com.corrodinggames.rts.game.units.h.f, com.corrodinggames.rts.game.units.am
    public com.corrodinggames.rts.gameFramework.unitAction.e v() {
        if (this.bX.site == -1) {
            return null;
        }
        return h[this.bX.R()];
    }

    public static void b() {
        GameEngine gameEngine = GameEngine.getGameEngine();
        e = gameEngine.bO.a(AssetsID.drawable.attack_submarine);
        f = a(e, e.m(), e.l());
        d = gameEngine.bO.a(AssetsID.drawable.attack_submarine_dead);
        g = gameEngine.bO.a(AssetsID.drawable.unit_icon_water);
        h = PlayerData.a(g);
        i = PlayerData.a(e);
    }

    @Override // com.corrodinggames.rts.game.units.y
    public boolean F() {
        return GameEngine.getGameEngine().settingsEngine.renderExtraShadows && this.eq >= 0.0f;
    }

    @Override // com.corrodinggames.rts.game.units.y
    public float G() {
        return 0.0f;
    }

    @Override // com.corrodinggames.rts.game.units.y
    public float H() {
        return 0.0f;
    }

    @Override // com.corrodinggames.rts.game.units.y
    public com.corrodinggames.rts.gameFramework.unitAction.e d() {
        if (this.bV) {
            return d;
        }
        return i[this.bX.R()];
    }

    @Override // com.corrodinggames.rts.game.units.y
    public com.corrodinggames.rts.gameFramework.unitAction.e k() {
        return f;
    }

    @Override // com.corrodinggames.rts.game.units.h.f, com.corrodinggames.rts.game.units.am
    public ao h() {
        return ao.WATER;
    }

    @Override // com.corrodinggames.rts.game.units.am
    /* renamed from: f */
    public ar mo1r() {
        return ar.attackSubmarine;
    }

    @Override // com.corrodinggames.rts.game.units.h.f
    public boolean K() {
        if (!Q()) {
            return true;
        }
        return false;
    }

    public e(boolean z) {
        super(z);
        this.a = false;
        this.b = true;
        this.c = 0.0f;
        b(e);
        this.cj = 15.0f;
        this.ck = this.cj - 2.0f;
        this.cv = 260.0f;
        this.cu = this.cv;
        this.M = e;
    }

    public void L() {
        if (!this.b) {
            S(1);
        } else {
            S(2);
        }
    }

    @Override // com.corrodinggames.rts.game.units.h.f
    public void s(float f2) {
        float f3;
        GameEngine gameEngine = GameEngine.getGameEngine();
        if (this.a) {
            f3 = 1.0f;
        } else {
            f3 = -8.0f;
        }
        if (com.corrodinggames.rts.gameFramework.f.c(this.eq - f3) > 2.0f) {
            this.c = com.corrodinggames.rts.gameFramework.f.a(this.c, 0.08f, 0.003f * f2);
        } else {
            this.c = com.corrodinggames.rts.gameFramework.f.a(this.c, 0.02f, 0.003f * f2);
        }
        this.eq = com.corrodinggames.rts.gameFramework.f.a(this.eq, f3, this.c * f2);
        boolean z = false;
        if (this.b && Q()) {
            this.b = false;
            L();
            z = true;
        }
        if (!this.b && !Q()) {
            this.b = true;
            L();
            z = true;
        }
        if (z) {
            gameEngine.bR.a(this.eo, this.ep, 0.0f, 0, 0.0f, 0.0f, this.cg);
        }
    }

    @Override // com.corrodinggames.rts.game.units.h.f, com.corrodinggames.rts.game.units.y, com.corrodinggames.rts.game.units.am, com.corrodinggames.rts.gameFramework.w
    public void a(float f2) {
        super.a(f2);
        if (!bT() || this.bV) {
        }
    }

    @Override // com.corrodinggames.rts.game.units.y
    public float m() {
        if (!Q()) {
            return 250.0f;
        }
        return 180.0f;
    }

    @Override // com.corrodinggames.rts.game.units.y
    public float b(int i2) {
        return 170.0f;
    }

    @Override // com.corrodinggames.rts.game.units.y
    public float e(int i2) {
        return 10.0f;
    }

    @Override // com.corrodinggames.rts.game.units.y
    public float z() {
        if (!Q()) {
            return 0.8f;
        }
        return 0.45f;
    }

    @Override // com.corrodinggames.rts.game.units.y
    public float A() {
        return 1.2f;
    }

    @Override // com.corrodinggames.rts.game.units.y
    public float B() {
        return 0.06f;
    }

    @Override // com.corrodinggames.rts.game.units.y
    public float c(int i2) {
        return 2.5f;
    }

    @Override // com.corrodinggames.rts.game.units.y
    public float w(int i2) {
        return 0.08f;
    }

    @Override // com.corrodinggames.rts.game.units.y
    public float C() {
        return 0.018f;
    }

    @Override // com.corrodinggames.rts.game.units.y
    public float D() {
        return 0.1f;
    }

    @Override // com.corrodinggames.rts.game.units.y
    public com.corrodinggames.rts.gameFramework.unitAction.e d(int i2) {
        return null;
    }

    @Override // com.corrodinggames.rts.game.units.am
    public boolean l() {
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.w, com.corrodinggames.rts.game.units.am
    public boolean Q() {
        return this.eq < -1.0f;
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

    @Override // com.corrodinggames.rts.game.units.y
    public float q(int i2) {
        return 42.0f;
    }

    @Override // com.corrodinggames.rts.game.units.y
    public void a(am amVar, int i2) {
        if (!Q()) {
            PointF E = E(i2);
            Projectile a = Projectile.a(this, E.x, E.y, this.eq, i2);
            PointF K = K(i2);
            a.K = K.x;
            a.L = K.y;
            a.ar = Color.a(255, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_DATA_SERVICE, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_DATA_SERVICE, 50);
            a.U = 42.0f;
            a.l = amVar;
            a.h = 190.0f;
            a.t = 2.0f;
            a.aH = true;
            a.aM = true;
            a.aQ = true;
            GameEngine gameEngine = GameEngine.getGameEngine();
            gameEngine.bM.a(com.corrodinggames.rts.gameFramework.a.e.m, 0.8f, this.eo, this.ep);
            gameEngine.bR.a(this.eo, this.ep, this.eq, -1118720);
            return;
        }
        PointF E2 = E(i2);
        Projectile a2 = Projectile.a(this, E2.x, E2.y, this.eq, i2);
        PointF K2 = K(i2);
        a2.K = K2.x;
        a2.L = K2.y;
        a2.ar = Color.a(255, 30, 30, 150);
        a2.x = 1.0f;
        a2.U = 42.0f;
        a2.l = amVar;
        a2.h = 250.0f;
        a2.t = 1.3f;
        a2.aH = false;
        a2.aM = true;
        a2.aQ = true;
        GameEngine.getGameEngine();
    }

    @Override // com.corrodinggames.rts.game.units.am
    public boolean e() {
        GameEngine.getGameEngine().bR.b(this.eo, this.ep, this.eq);
        this.M = d;
        S(0);
        this.bT = false;
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.am
    public void a(s sVar, boolean z) {
        if (sVar == j) {
            this.a = true;
        }
        if (sVar == k) {
            this.a = false;
        }
    }

    @Override // com.corrodinggames.rts.game.units.am
    public ArrayList N() {
        return l;
    }

    @Override // com.corrodinggames.rts.game.units.am, com.corrodinggames.rts.gameFramework.w
    public void e(float f2) {
        super.e(f2);
        y.a(this, m());
    }
}