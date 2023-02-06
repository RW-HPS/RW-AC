package com.corrodinggames.rts.game.units;

import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import com.corrodinggames.rts.AssetsID;
import com.corrodinggames.rts.gameFramework.GameEngine;

/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/e.class */
public class e extends com.corrodinggames.rts.game.units.d.d {
    float b;
    static com.corrodinggames.rts.gameFramework.unitAction.e a = null;
    static PorterDuffColorFilter c = new PorterDuffColorFilter(Color.a(200, 200, 200), PorterDuff.Mode.MULTIPLY);

    @Override // com.corrodinggames.rts.game.units.am
    /* renamed from: b */
    public ar mo1r() {
        return ar.crystalResource;
    }

    public static void a_() {
        a = GameEngine.getGameEngine().bO.a(AssetsID.drawable.crystal);
    }

    @Override // com.corrodinggames.rts.game.units.y
    public com.corrodinggames.rts.gameFramework.unitAction.e d() {
        return a;
    }

    @Override // com.corrodinggames.rts.game.units.d.d, com.corrodinggames.rts.game.units.am
    public boolean e() {
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.d.d, com.corrodinggames.rts.game.units.y
    public void a(int i) {
    }

    public e(boolean z) {
        super(z);
        this.M = a;
        b(a);
        this.cj = 11.0f;
        this.ck = this.cj + 1.0f;
        this.cv = 600.0f;
        this.cu = this.cv;
        S(1);
        this.n.a(0, -1, 0, 0);
        this.o.a(this.n);
    }

    @Override // com.corrodinggames.rts.game.units.d.d
    public Paint f() {
        return super.f();
    }

    @Override // com.corrodinggames.rts.game.units.y, com.corrodinggames.rts.game.units.am, com.corrodinggames.rts.gameFramework.w
    public void a(float f) {
        super.a(f);
        this.b += 0.01f * f;
        if (this.b > 1.0f) {
            this.b -= 1.0f;
            if (this.b > 1.0f) {
                this.b = 0.0f;
            }
        }
    }

    @Override // com.corrodinggames.rts.game.units.am
    public float g() {
        return 0.02f;
    }

    @Override // com.corrodinggames.rts.game.units.d.d, com.corrodinggames.rts.game.units.am
    public ao h() {
        return ao.NONE;
    }

    @Override // com.corrodinggames.rts.game.units.d.d, com.corrodinggames.rts.game.units.am
    public boolean i() {
        return false;
    }

    @Override // com.corrodinggames.rts.game.units.y, com.corrodinggames.rts.game.units.am
    public boolean s_() {
        GameEngine gameEngine = GameEngine.getGameEngine();
        du.a(cE());
        return RectF.a(gameEngine.cM, du);
    }

    @Override // com.corrodinggames.rts.game.units.y
    public com.corrodinggames.rts.gameFramework.unitAction.e k() {
        return null;
    }

    @Override // com.corrodinggames.rts.game.units.am
    public boolean l() {
        return false;
    }

    @Override // com.corrodinggames.rts.game.units.y
    public float m() {
        return 0.0f;
    }

    @Override // com.corrodinggames.rts.game.units.y
    public float b(int i) {
        return 0.0f;
    }

    @Override // com.corrodinggames.rts.game.units.y
    public float c(int i) {
        return 0.0f;
    }

    @Override // com.corrodinggames.rts.game.units.y
    public void a(am amVar, int i) {
    }

    @Override // com.corrodinggames.rts.game.units.am
    public void n() {
        super.n();
        this.b = ((this.ep * 5.0f) + (this.eo * 3.0f)) % 1.0f;
    }

    @Override // com.corrodinggames.rts.game.units.am
    public boolean o() {
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.am
    public boolean p() {
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.am
    public boolean q() {
        return true;
    }
}