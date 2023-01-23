package com.corrodinggames.rts.game.units.e;

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

/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/e/m.class */
public class m extends j {

    /* renamed from: a  reason: collision with root package name */
    static com.corrodinggames.rts.gameFramework.m.e f354a = null;
    static com.corrodinggames.rts.gameFramework.m.e b = null;
    static com.corrodinggames.rts.gameFramework.m.e c = null;
    static com.corrodinggames.rts.gameFramework.m.e[] d = new com.corrodinggames.rts.gameFramework.m.e[10];
    Rect e;

    @Override // com.corrodinggames.rts.game.units.am
    /* renamed from: b */
    public ar r() {
        return ar.megaTank;
    }

    public static void f() {
        GameEngine gameEngine = GameEngine.getGameEngine();
        b = gameEngine.bO.a(R.drawable.mega_tank);
        f354a = gameEngine.bO.a(R.drawable.mega_tank_dead);
        c = gameEngine.bO.a(R.drawable.mega_tank_turret);
        d = PlayerData.a(b);
    }

    @Override // com.corrodinggames.rts.game.units.y
    public com.corrodinggames.rts.gameFramework.m.e d() {
        if (this.bV) {
            return f354a;
        }
        return d[this.bX.R()];
    }

    @Override // com.corrodinggames.rts.game.units.y
    public com.corrodinggames.rts.gameFramework.m.e k() {
        return null;
    }

    @Override // com.corrodinggames.rts.game.units.y
    public com.corrodinggames.rts.gameFramework.m.e d(int i) {
        return c;
    }

    @Override // com.corrodinggames.rts.game.units.am
    public boolean e() {
        GameEngine gameEngine = GameEngine.getGameEngine();
        gameEngine.bR.b(this.eo, this.ep, this.eq);
        this.M = f354a;
        S(0);
        this.bT = false;
        gameEngine.bM.a(com.corrodinggames.rts.gameFramework.a.e.o, 0.8f, this.eo, this.ep);
        bq();
        return true;
    }

    public m(boolean z) {
        super(z);
        this.e = new Rect();
        T(20);
        U(25);
        this.cj = 12.0f;
        this.ck = this.cj + 1.0f;
        this.cv = 550.0f;
        this.cu = this.cv;
        this.M = b;
    }

    @Override // com.corrodinggames.rts.game.units.e.j, com.corrodinggames.rts.game.units.y, com.corrodinggames.rts.game.units.am, com.corrodinggames.rts.gameFramework.w
    public void a(float f) {
        super.a(f);
    }

    @Override // com.corrodinggames.rts.game.units.am
    public float bN() {
        return 7000.0f;
    }

    @Override // com.corrodinggames.rts.game.units.y
    public void a(am amVar, int i) {
        if (!amVar.i()) {
            PointF E = E(i);
            com.corrodinggames.rts.game.f a2 = com.corrodinggames.rts.game.f.a(this, E.x, E.y);
            a2.ar = Color.a(255, 150, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_DATA_SERVICE, 40);
            a2.U = 50.0f;
            a2.l = amVar;
            a2.h = 60.0f;
            a2.t = 3.0f;
            a2.x = 2.0f;
            a2.aQ = true;
            GameEngine gameEngine = GameEngine.getGameEngine();
            gameEngine.bR.a(E.x, E.y, this.eq, -1127220);
            gameEngine.bR.a(E.x, E.y, this.eq, this.cL[i].f203a);
            gameEngine.bM.a(com.corrodinggames.rts.gameFramework.a.e.u, 0.3f, this.eo, this.ep);
            return;
        }
        com.corrodinggames.rts.game.f a3 = com.corrodinggames.rts.game.f.a(this, this.eo, this.ep);
        a3.ar = Color.a(255, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_DATA_SERVICE, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_DATA_SERVICE, 50);
        a3.U = 40.0f;
        a3.l = amVar;
        a3.h = 190.0f;
        a3.t = 4.0f;
        a3.aH = true;
        a3.aI = 10.0f;
        a3.aJ = 15.0f;
        a3.aM = true;
        a3.aQ = true;
        GameEngine.getGameEngine().bM.a(com.corrodinggames.rts.gameFramework.a.e.m, 0.2f, this.eo, this.ep);
    }

    @Override // com.corrodinggames.rts.game.units.y
    public float m() {
        return 140.0f;
    }

    @Override // com.corrodinggames.rts.game.units.y
    public float b(int i) {
        return 70.0f;
    }

    @Override // com.corrodinggames.rts.game.units.y
    public float z() {
        return 0.8f;
    }

    @Override // com.corrodinggames.rts.game.units.y
    public float A() {
        return 1.2f;
    }

    @Override // com.corrodinggames.rts.game.units.y
    public float c(int i) {
        return 2.0f;
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
        if (!super.c(f)) {
            return false;
        }
        y.a((com.corrodinggames.rts.game.units.y) this);
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.am
    public boolean l() {
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.y
    public boolean af() {
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.y
    public float g(int i) {
        return 12.0f;
    }
}