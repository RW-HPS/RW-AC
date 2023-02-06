package com.corrodinggames.rts.game.units.e;

import android.graphics.Color;
import android.graphics.PointF;
import com.corrodinggames.rts.AssetsID;
import com.corrodinggames.rts.game.PlayerData;
import com.corrodinggames.rts.game.Projectile;
import com.corrodinggames.rts.game.units.ab;
import com.corrodinggames.rts.game.units.am;
import com.corrodinggames.rts.game.units.ar;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.utility.SlickToAndroidKeycodes;
import com.corrodinggames.rts.gameFramework.utility.y;

/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/e/a.class */
public class a extends j {
    static com.corrodinggames.rts.gameFramework.unitAction.e a = null;
    static com.corrodinggames.rts.gameFramework.unitAction.e b = null;
    static com.corrodinggames.rts.gameFramework.unitAction.e c = null;
    static com.corrodinggames.rts.gameFramework.unitAction.e[] d = new com.corrodinggames.rts.gameFramework.unitAction.e[10];

    @Override // com.corrodinggames.rts.game.units.am
    /* renamed from: b */
    public ar mo1r() {
        return ar.artillery;
    }

    public static void f() {
        GameEngine gameEngine = GameEngine.getGameEngine();
        a = gameEngine.bO.a(AssetsID.drawable.artillery2);
        b = gameEngine.bO.a(AssetsID.drawable.artillery1_dead);
        d = PlayerData.a(a);
        c = a(a);
    }

    @Override // com.corrodinggames.rts.game.units.y
    public com.corrodinggames.rts.gameFramework.unitAction.e d() {
        if (this.bV) {
            return b;
        }
        return d[this.bX.R()];
    }

    @Override // com.corrodinggames.rts.game.units.y
    public com.corrodinggames.rts.gameFramework.unitAction.e k() {
        return c;
    }

    @Override // com.corrodinggames.rts.game.units.y
    public boolean F() {
        return GameEngine.getGameEngine().settingsEngine.renderExtraShadows && !this.bV;
    }

    @Override // com.corrodinggames.rts.game.units.y
    public float G() {
        return 3.0f;
    }

    @Override // com.corrodinggames.rts.game.units.y
    public float H() {
        return 3.0f;
    }

    @Override // com.corrodinggames.rts.game.units.y
    public com.corrodinggames.rts.gameFramework.unitAction.e d(int i) {
        return null;
    }

    @Override // com.corrodinggames.rts.game.units.am
    public boolean e() {
        GameEngine.getGameEngine();
        this.M = b;
        S(0);
        this.bT = false;
        a(ab.normal);
        return true;
    }

    public a(boolean z) {
        super(z);
        T(28);
        U(50);
        this.cj = 18.0f;
        this.ck = this.cj;
        this.cv = 140.0f;
        this.cu = this.cv;
        this.M = a;
    }

    @Override // com.corrodinggames.rts.game.units.e.j, com.corrodinggames.rts.game.units.y, com.corrodinggames.rts.game.units.am, com.corrodinggames.rts.gameFramework.w
    public void a(float f) {
        super.a(f);
    }

    @Override // com.corrodinggames.rts.game.units.y
    public void a(am amVar, int i) {
        PointF E = E(i);
        Projectile a2 = Projectile.a(this, E.x, E.y);
        PointF K = K(i);
        a2.K = K.x;
        a2.L = K.y;
        a2.h = 150.0f;
        a2.t = 4.0f;
        a2.aQ = true;
        a2.ar = Color.a(255, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_BUTTON_3, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_BUTTON_3, 80);
        a2.R = (short) 2;
        a2.P = (short) 1;
        a2.x = 0.9f;
        PointF a3 = amVar.a(E.x, E.y, a2.t, a2.h, m());
        a2.aC = true;
        a2.m = true;
        a2.n = a3.x;
        a2.o = a3.y;
        a2.Y = 80.0f;
        a2.Z = 45.0f;
        a2.aa = true;
        GameEngine gameEngine = GameEngine.getGameEngine();
        gameEngine.bM.a(com.corrodinggames.rts.gameFramework.a.e.r, 0.3f, E.x, E.y);
        gameEngine.bR.a(E.x, E.y, this.eq, this.cL[i].a);
        com.corrodinggames.rts.gameFramework.emitter.e a4 = gameEngine.bR.a(E.x, E.y, this.eq, -1118482);
        if (a4 != null) {
            a4.V = 15.0f;
            a4.W = a4.V;
        }
    }

    @Override // com.corrodinggames.rts.game.units.am
    public float bW() {
        if (this.cL[0].e > 0.0f) {
            return 1.0f - (this.cL[0].e / b(0));
        }
        return super.bW();
    }

    @Override // com.corrodinggames.rts.game.units.y
    public float m() {
        return 290.0f;
    }

    @Override // com.corrodinggames.rts.game.units.y
    public float b(int i) {
        return 240.0f;
    }

    @Override // com.corrodinggames.rts.game.units.y
    public float z() {
        return 0.9f;
    }

    @Override // com.corrodinggames.rts.game.units.y
    public float A() {
        return 1.7f;
    }

    @Override // com.corrodinggames.rts.game.units.y
    public float B() {
        return 0.05f;
    }

    @Override // com.corrodinggames.rts.game.units.y
    public float c(int i) {
        return 99.0f;
    }

    @Override // com.corrodinggames.rts.game.units.am
    public boolean l() {
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.y
    public boolean af() {
        return false;
    }

    @Override // com.corrodinggames.rts.game.units.y
    public boolean E() {
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.y
    public float g(int i) {
        return 20.0f;
    }

    @Override // com.corrodinggames.rts.game.units.y
    public float C() {
        return 0.05f;
    }

    @Override // com.corrodinggames.rts.game.units.y
    public float D() {
        return 0.12f;
    }

    @Override // com.corrodinggames.rts.game.units.am, com.corrodinggames.rts.gameFramework.w
    public void e(float f) {
        super.e(f);
        y.a(this, m());
    }

    @Override // com.corrodinggames.rts.game.units.am
    public float bN() {
        return 14000.0f;
    }
}