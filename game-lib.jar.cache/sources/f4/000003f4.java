package com.corrodinggames.rts.game.units.h;

import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.Rect;
import com.corrodinggames.rts.AssetsID;
import com.corrodinggames.rts.game.PlayerData;
import com.corrodinggames.rts.game.Projectile;
import com.corrodinggames.rts.game.units.am;
import com.corrodinggames.rts.game.units.ar;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.utility.SlickToAndroidKeycodes;

/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/h/c.class */
public class c extends f {
    static com.corrodinggames.rts.gameFramework.unitAction.e a = null;
    static com.corrodinggames.rts.gameFramework.unitAction.e b = null;
    static com.corrodinggames.rts.gameFramework.unitAction.e c = null;
    static com.corrodinggames.rts.gameFramework.unitAction.e[] d = new com.corrodinggames.rts.gameFramework.unitAction.e[10];
    Rect e;

    @Override // com.corrodinggames.rts.game.units.am
    /* renamed from: b */
    public ar mo1r() {
        return ar.gunBoat;
    }

    @Override // com.corrodinggames.rts.game.units.am
    public float bN() {
        return 1500.0f;
    }

    public static void f() {
        GameEngine gameEngine = GameEngine.getGameEngine();
        b = gameEngine.bO.a(AssetsID.drawable.gun_boat);
        a = gameEngine.bO.a(AssetsID.drawable.gun_boat_dead);
        c = a(b, b.m(), b.l());
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
    public boolean F() {
        return GameEngine.getGameEngine().settingsEngine.renderExtraShadows && this.eq > -2.0f;
    }

    @Override // com.corrodinggames.rts.game.units.y
    public float G() {
        return 1.0f;
    }

    @Override // com.corrodinggames.rts.game.units.y
    public float H() {
        return 1.0f;
    }

    @Override // com.corrodinggames.rts.game.units.y
    public com.corrodinggames.rts.gameFramework.unitAction.e d(int i) {
        return null;
    }

    @Override // com.corrodinggames.rts.game.units.am
    public boolean e() {
        GameEngine.getGameEngine().bR.b(this.eo, this.ep, this.eq);
        this.M = a;
        S(0);
        this.bT = false;
        return true;
    }

    public c(boolean z) {
        super(z);
        this.e = new Rect();
        T(15);
        U(27);
        this.cj = 12.0f;
        this.ck = this.cj - 2.0f;
        this.cv = 170.0f;
        this.cu = this.cv;
        this.M = b;
    }

    @Override // com.corrodinggames.rts.game.units.h.f, com.corrodinggames.rts.game.units.y, com.corrodinggames.rts.game.units.am, com.corrodinggames.rts.gameFramework.w
    public void a(float f) {
        super.a(f);
    }

    @Override // com.corrodinggames.rts.game.units.y
    public float q(int i) {
        return 12.0f;
    }

    @Override // com.corrodinggames.rts.game.units.y
    public void a(am amVar, int i) {
        PointF E = E(i);
        Projectile a2 = Projectile.a(this, E.x, E.y);
        PointF K = K(i);
        a2.K = K.x;
        a2.L = K.y;
        a2.eq = this.eq;
        a2.U = q(i);
        a2.l = amVar;
        a2.h = 30.0f;
        a2.t = 8.0f;
        a2.S = false;
        a2.ar = Color.a(255, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_STB_INPUT, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_STB_INPUT, 0);
        GameEngine gameEngine = GameEngine.getGameEngine();
        gameEngine.bM.a(com.corrodinggames.rts.gameFramework.a.e.s, 0.2f, E.x, E.y);
        gameEngine.bR.a(E.x, E.y, this.eq, this.cL[i].a);
        gameEngine.bR.a(E.x, E.y, this.eq, -1118720);
    }

    @Override // com.corrodinggames.rts.game.units.y
    public float m() {
        return 120.0f;
    }

    @Override // com.corrodinggames.rts.game.units.y
    public float b(int i) {
        return 60.0f;
    }

    @Override // com.corrodinggames.rts.game.units.y
    public float z() {
        return 1.5f;
    }

    @Override // com.corrodinggames.rts.game.units.y
    public float A() {
        return 2.8f;
    }

    @Override // com.corrodinggames.rts.game.units.y
    public float B() {
        return 0.35f;
    }

    @Override // com.corrodinggames.rts.game.units.y
    public float c(int i) {
        return 99.0f;
    }

    @Override // com.corrodinggames.rts.game.units.y
    public float C() {
        return 0.06f;
    }

    @Override // com.corrodinggames.rts.game.units.y
    public float D() {
        return 0.2f;
    }

    @Override // com.corrodinggames.rts.game.units.y, com.corrodinggames.rts.game.units.am, com.corrodinggames.rts.gameFramework.w
    public boolean c(float f) {
        return super.c(f);
    }

    @Override // com.corrodinggames.rts.game.units.am
    public boolean l() {
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.y
    public boolean af() {
        return false;
    }
}