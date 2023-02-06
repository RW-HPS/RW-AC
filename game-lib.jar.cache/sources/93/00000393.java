package com.corrodinggames.rts.game.units.d;

import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.RectF;
import com.corrodinggames.rts.AssetsID;
import com.corrodinggames.rts.game.PlayerData;
import com.corrodinggames.rts.game.Projectile;
import com.corrodinggames.rts.game.units.ab;
import com.corrodinggames.rts.game.units.am;
import com.corrodinggames.rts.game.units.ar;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.emitter.Emitter;
import com.corrodinggames.rts.gameFramework.net.GameInputStream;
import com.corrodinggames.rts.gameFramework.net.GameOutputStream;
import com.corrodinggames.rts.gameFramework.utility.SlickToAndroidKeycodes;
import com.corrodinggames.rts.gameFramework.utility.y;
import java.util.ArrayList;

/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/d/e.class */
public class e extends i {
    static com.corrodinggames.rts.gameFramework.unitAction.e a = null;
    static com.corrodinggames.rts.gameFramework.unitAction.e[] b = new com.corrodinggames.rts.gameFramework.unitAction.e[10];
    static com.corrodinggames.rts.gameFramework.unitAction.e c = null;
    static com.corrodinggames.rts.gameFramework.unitAction.e d = null;
    float e;
    public float f;
    public float g;
    public int h;
    public float i;
    public float j;
    float k;
    int l;

    @Override // com.corrodinggames.rts.game.units.d.i, com.corrodinggames.rts.game.units.d.d, com.corrodinggames.rts.game.units.y, com.corrodinggames.rts.game.units.am, com.corrodinggames.rts.gameFramework.az, com.corrodinggames.rts.gameFramework.w, com.corrodinggames.rts.gameFramework.bq
    public void a(GameOutputStream gameOutputStream) {
        gameOutputStream.writeFloat(this.e);
        super.a(gameOutputStream);
    }

    @Override // com.corrodinggames.rts.game.units.d.i, com.corrodinggames.rts.game.units.d.d, com.corrodinggames.rts.game.units.y, com.corrodinggames.rts.game.units.am, com.corrodinggames.rts.gameFramework.az, com.corrodinggames.rts.gameFramework.w
    public void a(GameInputStream gameInputStream) {
        this.e = gameInputStream.readFloat();
        super.a(gameInputStream);
    }

    public static void b() {
        GameEngine gameEngine = GameEngine.getGameEngine();
        a = gameEngine.bO.a(AssetsID.drawable.base);
        c = gameEngine.bO.a(AssetsID.drawable.base_dead);
        d = gameEngine.bO.a(AssetsID.drawable.base_back);
        b = PlayerData.a(a);
    }

    @Override // com.corrodinggames.rts.game.units.am
    /* renamed from: K */
    public ar mo1r() {
        return ar.commandCenter;
    }

    @Override // com.corrodinggames.rts.game.units.d.d
    public boolean L() {
        GameEngine gameEngine = GameEngine.getGameEngine();
        this.M = c;
        this.m = null;
        S(0);
        this.bT = false;
        a(ab.large);
        float f = this.eo;
        float f2 = this.ep;
        gameEngine.bR.b(com.corrodinggames.rts.gameFramework.emitter.h.critical);
        com.corrodinggames.rts.gameFramework.emitter.e a2 = gameEngine.bR.a(f, f2, this.eq, Color.a(255, 255, 255, 255));
        if (a2 != null) {
            a2.G = 8.0f;
            a2.F = 5.0f;
            a2.E = 0.9f;
            a2.V = 20.0f;
            a2.W = a2.V;
            a2.r = true;
        }
        gameEngine.bR.b(com.corrodinggames.rts.gameFramework.emitter.h.critical);
        com.corrodinggames.rts.gameFramework.emitter.e c2 = gameEngine.bR.c(f, f2, 0.0f, -1127220);
        if (c2 != null) {
            c2.G = 0.2f;
            c2.F = 2.0f;
            c2.ar = (short) 2;
            c2.V = 45.0f;
            c2.W = c2.V;
            c2.U = 0.0f;
        }
        gameEngine.bR.a(this.eo, this.ep, this.eq, 40.0f, 70.0f);
        Emitter.a(this.eo, this.ep);
        Emitter.b(this.eo, this.ep).a = 800.0f;
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.d.d, com.corrodinggames.rts.game.units.y
    public void a(int i) {
    }

    @Override // com.corrodinggames.rts.game.units.y
    public void S() {
        super.S();
        if (this.bV) {
            this.m = null;
        } else {
            this.m = d;
        }
    }

    @Override // com.corrodinggames.rts.game.units.y
    public com.corrodinggames.rts.gameFramework.unitAction.e d() {
        if (this.bV) {
            return c;
        }
        return b[this.bX.R()];
    }

    @Override // com.corrodinggames.rts.game.units.y
    public com.corrodinggames.rts.gameFramework.unitAction.e k() {
        return null;
    }

    public e(boolean z) {
        super(z);
        this.k = 20.0f;
        this.l = 0;
        this.M = a;
        this.m = d;
        T(53);
        U(68);
        this.cj = 30.0f;
        this.ck = this.cj;
        this.cv = 4000.0f;
        this.cu = this.cv;
        S(3);
        this.n.a(-1, -1, 1, 1);
        this.o.a(-1, -1, 1, 2);
    }

    @Override // com.corrodinggames.rts.game.units.am
    public RectF cF() {
        RectF cF = super.cF();
        cF.a(6.0f, 0.0f);
        return cF;
    }

    @Override // com.corrodinggames.rts.game.units.d.i, com.corrodinggames.rts.game.units.y, com.corrodinggames.rts.game.units.am, com.corrodinggames.rts.gameFramework.w
    public void a(float f) {
        GameEngine.getGameEngine();
        super.a(f);
        if (!bT() || this.bV) {
            return;
        }
        this.k = com.corrodinggames.rts.gameFramework.f.a(this.k, f);
        if (this.k == 0.0f) {
            this.k = 5.0f;
            this.l++;
            if (this.l > 6) {
                this.l = 0;
                this.k = 70.0f;
            }
            if (this.l <= 3) {
                this.s = this.l;
            } else {
                this.s = 6 - this.l;
            }
        }
        this.f += f;
        this.h++;
        this.i += 10.0f;
        if (this.j > f) {
            this.j = f;
        }
        this.g += f;
        this.e += f;
        if (this.e > PlayerData.ap - 0.1f) {
            this.e -= PlayerData.ap;
            this.bX.b(cy() * (PlayerData.ap / PlayerData.ao));
        }
    }

    @Override // com.corrodinggames.rts.game.units.am
    public float cy() {
        return 18.0f;
    }

    @Override // com.corrodinggames.rts.game.units.y
    public float q(int i) {
        return 70.0f;
    }

    @Override // com.corrodinggames.rts.game.units.d.i, com.corrodinggames.rts.game.units.y
    public void a(am amVar, int i) {
        Projectile a2 = Projectile.a(this, this.eo, this.ep);
        PointF K = K(i);
        a2.K = K.x;
        a2.L = K.y;
        a2.ar = Color.a(255, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_DATA_SERVICE, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_DATA_SERVICE, 50);
        a2.U = q(i);
        a2.l = amVar;
        a2.h = 180.0f;
        a2.t = 2.0f;
        a2.r = 5.0f;
        a2.aH = true;
        a2.aM = true;
        a2.aQ = true;
        a2.aG = true;
        GameEngine gameEngine = GameEngine.getGameEngine();
        gameEngine.bR.a(a2, -1118720);
        gameEngine.bM.a(com.corrodinggames.rts.gameFramework.a.e.m, 0.8f, this.eo, this.ep);
    }

    @Override // com.corrodinggames.rts.game.units.d.i, com.corrodinggames.rts.game.units.y
    public float m() {
        return 280.0f;
    }

    @Override // com.corrodinggames.rts.game.units.d.i, com.corrodinggames.rts.game.units.y
    public float b(int i) {
        return 70.0f;
    }

    @Override // com.corrodinggames.rts.game.units.d.i, com.corrodinggames.rts.game.units.y
    public float c(int i) {
        return 999.0f;
    }

    @Override // com.corrodinggames.rts.game.units.y
    public boolean b(int i, float f) {
        return false;
    }

    @Override // com.corrodinggames.rts.game.units.d.i, com.corrodinggames.rts.game.units.am
    public boolean l() {
        return true;
    }

    public static void a(ArrayList arrayList, int i) {
        arrayList.add(new com.corrodinggames.rts.game.units.a.o());
        arrayList.add(new com.corrodinggames.rts.game.units.a.l(ar.builder, 1.0f));
    }

    @Override // com.corrodinggames.rts.game.units.am
    public ArrayList N() {
        return mo1r().a(V());
    }

    @Override // com.corrodinggames.rts.game.units.am
    public float a(am amVar, float f, Projectile projectile) {
        if (f > 2500.0f) {
            f = 2500.0f;
        }
        return super.a(amVar, f, projectile);
    }

    @Override // com.corrodinggames.rts.game.units.am
    public boolean bJ() {
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.am, com.corrodinggames.rts.gameFramework.w
    public void e(float f) {
        super.e(f);
        y.a(this, m());
    }

    @Override // com.corrodinggames.rts.game.units.y
    public int s() {
        return 20;
    }

    @Override // com.corrodinggames.rts.game.units.y
    public int bp() {
        return 35;
    }
}