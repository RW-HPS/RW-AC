package com.corrodinggames.rts.game.units.c;

import android.graphics.PointF;
import android.graphics.Rect;
import com.corrodinggames.rts.AssetsID;
import com.corrodinggames.rts.game.PlayerData;
import com.corrodinggames.rts.game.Projectile;
import com.corrodinggames.rts.game.ScorchMark;
import com.corrodinggames.rts.game.units.am;
import com.corrodinggames.rts.game.units.ar;
import com.corrodinggames.rts.game.units.e.j;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.emitter.d;
import com.corrodinggames.rts.gameFramework.emitter.h;
import com.corrodinggames.rts.gameFramework.f;
import com.corrodinggames.rts.gameFramework.unitAction.e;

/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/c/a.class */
public class a extends j {
    static e a = null;
    static e b = null;
    static e c = null;
    static e[] d = new e[10];
    int e;
    float f;
    Rect g;
    Rect h;

    @Override // com.corrodinggames.rts.game.units.am
    /* renamed from: b */
    public ar mo1r() {
        return ar.ladybug;
    }

    public static void f() {
        b = GameEngine.getGameEngine().bO.a(AssetsID.drawable.ladybug);
        d = PlayerData.a(b);
    }

    @Override // com.corrodinggames.rts.game.units.y
    public e d() {
        if (this.bV) {
            return a;
        }
        return d[this.bX.R()];
    }

    @Override // com.corrodinggames.rts.game.units.y
    public e k() {
        return null;
    }

    @Override // com.corrodinggames.rts.game.units.y
    public e d(int i) {
        return null;
    }

    @Override // com.corrodinggames.rts.game.units.am
    public boolean e() {
        GameEngine gameEngine = GameEngine.getGameEngine();
        if (gameEngine.bR.b(this.eo, this.ep, this.eq, d.blood, false, h.high) != null) {
        }
        gameEngine.bM.a(com.corrodinggames.rts.gameFramework.a.e.A, 0.8f, this.eo, this.ep);
        ScorchMark.a(this, 1);
        return false;
    }

    public a(boolean z) {
        super(z);
        this.e = 0;
        this.f = 0.0f;
        this.g = new Rect();
        this.h = new Rect();
        T(17);
        U(26);
        this.cj = 5.0f;
        this.ck = this.cj + 3.0f;
        this.cv = 130.0f;
        this.cu = this.cv;
        this.M = b;
        this.P = com.corrodinggames.rts.game.units.a.outOfRange;
    }

    @Override // com.corrodinggames.rts.game.units.am
    public Rect a_(boolean z) {
        int i = this.e * this.es;
        this.g.a(i, 0, i + this.es, 0 + this.et);
        return this.g;
    }

    @Override // com.corrodinggames.rts.game.units.am
    public boolean bP() {
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.am
    public boolean bO() {
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.e.j, com.corrodinggames.rts.game.units.y, com.corrodinggames.rts.game.units.am, com.corrodinggames.rts.gameFramework.w
    public void a(float f) {
        super.a(f);
        if (this.cK) {
            if (this.e == 0) {
                this.e = 1;
            } else {
                this.e = 0;
            }
        }
        if (this.f != 0.0f) {
            this.f = f.a(this.f, f);
            this.e = 2;
        }
    }

    @Override // com.corrodinggames.rts.game.units.y
    public void a(am amVar, int i) {
        Projectile.a((am) this, amVar, 14.0f, (Projectile) null, false);
        this.f = 4.0f;
        PointF E = E(i);
        GameEngine.getGameEngine().bM.a(com.corrodinggames.rts.gameFramework.a.e.B, 0.3f, E.x, E.y);
    }

    @Override // com.corrodinggames.rts.game.units.y
    public float m() {
        return 43.0f;
    }

    @Override // com.corrodinggames.rts.game.units.y
    public float b(int i) {
        return 17.0f;
    }

    @Override // com.corrodinggames.rts.game.units.y
    public float z() {
        return 1.7f;
    }

    @Override // com.corrodinggames.rts.game.units.y
    public float A() {
        return 5.5f;
    }

    @Override // com.corrodinggames.rts.game.units.y
    public float c(int i) {
        return 99.0f;
    }

    @Override // com.corrodinggames.rts.game.units.y, com.corrodinggames.rts.game.units.am, com.corrodinggames.rts.gameFramework.w
    public boolean c(float f) {
        return super.c(f);
    }

    @Override // com.corrodinggames.rts.game.units.y
    public float C() {
        return 0.07f;
    }

    @Override // com.corrodinggames.rts.game.units.y
    public float D() {
        return 0.12f;
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
    public float g(int i) {
        return 7.0f;
    }

    @Override // com.corrodinggames.rts.game.units.y
    public boolean E() {
        return true;
    }
}