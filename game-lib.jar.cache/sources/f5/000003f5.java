package com.corrodinggames.rts.game.units.h;

import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.Rect;
import com.corrodinggames.rts.R;
import com.corrodinggames.rts.game.PlayerData;
import com.corrodinggames.rts.game.units.am;
import com.corrodinggames.rts.game.units.ar;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.utility.SlickToAndroidKeycodes;
import com.corrodinggames.rts.gameFramework.utility.y;

/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/h/d.class */
public class d extends f {

    /* renamed from: a  reason: collision with root package name */
    static com.corrodinggames.rts.gameFramework.m.e f377a = null;
    static com.corrodinggames.rts.gameFramework.m.e b = null;
    static com.corrodinggames.rts.gameFramework.m.e c = null;
    static com.corrodinggames.rts.gameFramework.m.e[] d = new com.corrodinggames.rts.gameFramework.m.e[10];
    static PointF e = new PointF();
    Rect f;

    @Override // com.corrodinggames.rts.game.units.am
    /* renamed from: b */
    public ar r() {
        return ar.missileShip;
    }

    public static void f() {
        GameEngine gameEngine = GameEngine.getGameEngine();
        b = gameEngine.bO.a(R.drawable.scout_ship);
        f377a = gameEngine.bO.a(R.drawable.scout_ship_dead);
        c = a(b, b.m(), b.l());
        d = PlayerData.a(b);
    }

    @Override // com.corrodinggames.rts.game.units.y
    public com.corrodinggames.rts.gameFramework.m.e d() {
        if (this.bV) {
            return f377a;
        }
        return d[this.bX.R()];
    }

    @Override // com.corrodinggames.rts.game.units.y
    public com.corrodinggames.rts.gameFramework.m.e k() {
        return c;
    }

    @Override // com.corrodinggames.rts.game.units.y
    public boolean F() {
        return GameEngine.getGameEngine().settingsEngine.renderExtraShadows && this.eq > -2.0f;
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
    public com.corrodinggames.rts.gameFramework.m.e d(int i) {
        return null;
    }

    @Override // com.corrodinggames.rts.game.units.am
    public boolean e() {
        GameEngine.getGameEngine().bR.b(this.eo, this.ep, this.eq);
        this.M = f377a;
        S(0);
        this.bT = false;
        return true;
    }

    public d(boolean z) {
        super(z);
        this.f = new Rect();
        T(17);
        U(31);
        this.cj = 15.0f;
        this.ck = this.cj - 2.0f;
        this.cv = 350.0f;
        this.cu = this.cv;
        this.M = b;
    }

    @Override // com.corrodinggames.rts.game.units.h.f, com.corrodinggames.rts.game.units.y, com.corrodinggames.rts.game.units.am, com.corrodinggames.rts.gameFramework.w
    public void a(float f) {
        super.a(f);
    }

    @Override // com.corrodinggames.rts.game.units.y
    public PointF E(int i) {
        float f = this.cg;
        e.setSite(this.eo + (com.corrodinggames.rts.gameFramework.f.k(f) * 6.0f), this.ep + (com.corrodinggames.rts.gameFramework.f.j(f) * 6.0f));
        return e;
    }

    @Override // com.corrodinggames.rts.game.units.y
    public float q(int i) {
        return 62.0f;
    }

    @Override // com.corrodinggames.rts.game.units.y
    public void a(am amVar, int i) {
        GameEngine gameEngine = GameEngine.getGameEngine();
        PointF E = E(i);
        if (!amVar.Q()) {
            com.corrodinggames.rts.game.f a2 = com.corrodinggames.rts.game.f.a(this, E.x, E.y, this.eq, i);
            PointF K = K(i);
            a2.K = K.x;
            a2.L = K.y;
            a2.ar = Color.a(255, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_DATA_SERVICE, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_DATA_SERVICE, 50);
            a2.U = 62.0f;
            a2.l = amVar;
            a2.h = 190.0f;
            a2.t = 2.0f;
            a2.aH = true;
            a2.aM = true;
            a2.aQ = true;
            gameEngine.bM.a(com.corrodinggames.rts.gameFramework.a.e.m, 0.8f, this.eo, this.ep);
            gameEngine.bR.a(this.eo, this.ep, this.eq, -1118720);
            gameEngine.bR.a(a2, -1118720);
            return;
        }
        com.corrodinggames.rts.game.f a3 = com.corrodinggames.rts.game.f.a(this, E.x, E.y, this.eq - 1.0f, i);
        a3.ar = Color.a(255, 0, 0, 150);
        a3.x = 1.0f;
        a3.U = 42.0f;
        a3.l = amVar;
        a3.h = 220.0f;
        a3.t = 1.9f;
        a3.aM = true;
        a3.aQ = true;
        gameEngine.bM.a(com.corrodinggames.rts.gameFramework.a.e.m, 0.8f, this.eo, this.ep);
        gameEngine.bR.a(this.eo, this.ep, this.eq, -1118720);
    }

    @Override // com.corrodinggames.rts.game.units.y
    public float m() {
        return 200.0f;
    }

    @Override // com.corrodinggames.rts.game.units.y
    public float b(int i) {
        return 170.0f;
    }

    @Override // com.corrodinggames.rts.game.units.y
    public float z() {
        return 1.2f;
    }

    @Override // com.corrodinggames.rts.game.units.y
    public float bc() {
        return 1.0f;
    }

    @Override // com.corrodinggames.rts.game.units.y
    public float A() {
        return 1.9f;
    }

    @Override // com.corrodinggames.rts.game.units.y
    public float B() {
        return 0.2f;
    }

    @Override // com.corrodinggames.rts.game.units.y
    public float c(int i) {
        return 99.0f;
    }

    @Override // com.corrodinggames.rts.game.units.y
    public float C() {
        return 0.05f;
    }

    @Override // com.corrodinggames.rts.game.units.y
    public float D() {
        return 0.1f;
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
    public boolean ae() {
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.am, com.corrodinggames.rts.gameFramework.w
    public void e(float f) {
        super.e(f);
        y.a(this, m());
    }
}