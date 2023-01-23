package com.corrodinggames.rts.game.units.e;

import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.Rect;
import com.corrodinggames.rts.R;
import com.corrodinggames.rts.game.PlayerData;
import com.corrodinggames.rts.game.units.ab;
import com.corrodinggames.rts.game.units.am;
import com.corrodinggames.rts.game.units.ar;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.utility.SlickToAndroidKeycodes;
import com.corrodinggames.rts.gameFramework.utility.y;

/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/e/l.class */
public class l extends j {

    /* renamed from: a  reason: collision with root package name */
    static com.corrodinggames.rts.gameFramework.m.e f353a = null;
    static com.corrodinggames.rts.gameFramework.m.e b = null;
    static com.corrodinggames.rts.gameFramework.m.e[] c = new com.corrodinggames.rts.gameFramework.m.e[10];
    static com.corrodinggames.rts.gameFramework.m.e d = null;
    public static com.corrodinggames.rts.gameFramework.m.e e = null;
    int f;
    float g;
    Rect h;

    @Override // com.corrodinggames.rts.game.units.am
    /* renamed from: b */
    public ar r() {
        return ar.mammothTank;
    }

    public static void f() {
        GameEngine gameEngine = GameEngine.getGameEngine();
        com.corrodinggames.rts.gameFramework.m.e a2 = gameEngine.bO.a(R.drawable.mammoth_tank);
        c = PlayerData.a(a2);
        f353a = gameEngine.bO.a(R.drawable.mammoth_tank_dead);
        b = gameEngine.bO.a(R.drawable.mammoth_tank_turret);
        e = gameEngine.bO.a(R.drawable.lighting_charge);
        d = a(a2, a2.m() / 2, a2.l());
    }

    @Override // com.corrodinggames.rts.game.units.y
    public com.corrodinggames.rts.gameFramework.m.e d() {
        if (this.bV) {
            return f353a;
        }
        return c[this.bX.R()];
    }

    @Override // com.corrodinggames.rts.game.units.y
    public com.corrodinggames.rts.gameFramework.m.e k() {
        return d;
    }

    @Override // com.corrodinggames.rts.game.units.y
    public com.corrodinggames.rts.gameFramework.m.e d(int i) {
        return b;
    }

    @Override // com.corrodinggames.rts.game.units.y
    public boolean F() {
        return GameEngine.getGameEngine().settingsEngine.renderExtraShadows && this.eq > -2.0f && !this.bV;
    }

    @Override // com.corrodinggames.rts.game.units.y
    public float G() {
        return 3.0f;
    }

    @Override // com.corrodinggames.rts.game.units.y
    public float H() {
        return 3.0f;
    }

    @Override // com.corrodinggames.rts.game.units.am
    public boolean e() {
        GameEngine.getGameEngine();
        this.M = f353a;
        S(0);
        this.bT = false;
        a(ab.largeUnit);
        return true;
    }

    public l(boolean z) {
        super(z);
        this.h = new Rect();
        a(c[7], 2);
        this.cj = 21.0f;
        this.ck = this.cj + 1.0f;
        this.cv = 2900.0f;
        this.cu = this.cv;
        this.M = c[7];
    }

    @Override // com.corrodinggames.rts.game.units.e.j, com.corrodinggames.rts.game.units.y, com.corrodinggames.rts.game.units.am, com.corrodinggames.rts.gameFramework.w
    public void a(float f) {
        super.a(f);
        if (this.cK) {
            this.g += f;
            if (this.g > 3.0f) {
                this.g = 0.0f;
                this.f = 1 - this.f;
            }
        }
    }

    @Override // com.corrodinggames.rts.game.units.am
    public float bN() {
        return 14000.0f;
    }

    @Override // com.corrodinggames.rts.game.units.y
    public void a(am amVar, int i) {
        PointF E = E(i);
        com.corrodinggames.rts.game.f a2 = com.corrodinggames.rts.game.f.a(this, E.x, E.y);
        a2.ar = Color.a(255, 247, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_EISU, 129);
        a2.U = 260.0f;
        a2.l = amVar;
        a2.h = 20.0f;
        a2.t = 4.0f;
        a2.x = 2.0f;
        a2.aQ = true;
        a2.A = true;
        a2.M = true;
        a2.ai = 0.5f;
        a2.ak = 1.0f;
        a2.al = 0.0f;
        GameEngine gameEngine = GameEngine.getGameEngine();
        gameEngine.bR.a(E.x, E.y, this.eq, -1118482);
        gameEngine.bM.a(com.corrodinggames.rts.gameFramework.a.e.x, 0.2f, this.eo, this.ep);
    }

    @Override // com.corrodinggames.rts.game.units.y
    public float m() {
        return 210.0f;
    }

    @Override // com.corrodinggames.rts.game.units.y
    public float b(int i) {
        return 140.0f;
    }

    @Override // com.corrodinggames.rts.game.units.y
    public float z() {
        return 0.5f;
    }

    @Override // com.corrodinggames.rts.game.units.y
    public float bc() {
        return 1.0f;
    }

    @Override // com.corrodinggames.rts.game.units.y
    public float A() {
        return 1.0f;
    }

    @Override // com.corrodinggames.rts.game.units.y
    public float B() {
        return 0.5f;
    }

    @Override // com.corrodinggames.rts.game.units.y
    public float w(int i) {
        return 0.08f;
    }

    @Override // com.corrodinggames.rts.game.units.y
    public float c(int i) {
        return 2.5f;
    }

    @Override // com.corrodinggames.rts.game.units.y
    public float C() {
        return 0.04f;
    }

    @Override // com.corrodinggames.rts.game.units.y
    public float D() {
        return 0.08f;
    }

    @Override // com.corrodinggames.rts.game.units.am
    public Rect a_(boolean z) {
        if (this.bV && !z) {
            return super.a_(z);
        }
        return super.a(z, this.f);
    }

    @Override // com.corrodinggames.rts.game.units.y, com.corrodinggames.rts.game.units.am, com.corrodinggames.rts.gameFramework.w
    public boolean c(float f) {
        if (!super.c(f)) {
            return false;
        }
        y.a((com.corrodinggames.rts.game.units.y) this);
        y.a(this, e, this.cL[0].f / e(0), 0);
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
        return 22.0f;
    }

    @Override // com.corrodinggames.rts.game.units.y
    public float e(int i) {
        return 60.0f;
    }
}