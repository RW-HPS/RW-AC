package com.corrodinggames.rts.game.units.d;

import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.Rect;
import com.corrodinggames.rts.game.PlayerData;
import com.corrodinggames.rts.game.units.am;
import com.corrodinggames.rts.game.units.as;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.net.GameInputStream;
import com.corrodinggames.rts.gameFramework.net.GameOutputStream;

/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/d/i.class */
public abstract class i extends d implements l {
    public static final Paint y = new Paint();
    k z;
    Rect A;
    Rect B;

    static {
        y.a(255, 0, 255, 0);
        y.a(1.5f);
        y.a(true);
    }

    public i(boolean z) {
        super(z);
        this.z = du();
        this.A = new Rect();
        this.B = new Rect();
    }

    @Override // com.corrodinggames.rts.game.units.d.d, com.corrodinggames.rts.game.units.y, com.corrodinggames.rts.game.units.am, com.corrodinggames.rts.gameFramework.az, com.corrodinggames.rts.gameFramework.w, com.corrodinggames.rts.gameFramework.bq
    public void a(GameOutputStream gameOutputStream) {
        gameOutputStream.writeInt(this.r);
        this.z.a(gameOutputStream);
        super.a(gameOutputStream);
    }

    @Override // com.corrodinggames.rts.game.units.d.d, com.corrodinggames.rts.game.units.y, com.corrodinggames.rts.game.units.am, com.corrodinggames.rts.gameFramework.az, com.corrodinggames.rts.gameFramework.w
    public void a(GameInputStream gameInputStream) {
        if (gameInputStream.b() >= 69) {
            R(gameInputStream.readInt());
        }
        this.z.a(gameInputStream);
        super.a(gameInputStream);
    }

    public k du() {
        return new k(this);
    }

    @Override // com.corrodinggames.rts.game.units.d.l
    public void b(j jVar) {
    }

    @Override // com.corrodinggames.rts.game.units.d.l
    public boolean c(j jVar) {
        return true;
    }

    public void a(j jVar) {
        float f;
        if (this.z.b != null) {
            f = this.cj * 2.0f;
        } else {
            f = this.cj * 3.0f;
        }
        am a2 = this.z.a(jVar, f, false, 0.0f);
        if (a2 != null) {
            if (a2.ep - a2.cj < this.ep + dv()) {
                a2.ep = this.ep + dv() + a2.cj;
            }
            PlayerData.c(a2);
        }
    }

    public int dv() {
        return -100;
    }

    @Override // com.corrodinggames.rts.game.units.d.l
    public int f(boolean z) {
        return this.z.a(com.corrodinggames.rts.game.units.a.s.i, z, true);
    }

    @Override // com.corrodinggames.rts.game.units.d.l
    public final int a(com.corrodinggames.rts.game.units.a.c cVar, boolean z) {
        return this.z.a(cVar, z);
    }

    @Override // com.corrodinggames.rts.game.units.d.l
    public j dw() {
        return this.z.b();
    }

    @Override // com.corrodinggames.rts.game.units.y
    public com.corrodinggames.rts.game.units.custom.d.b bD() {
        return this.z.c();
    }

    @Override // com.corrodinggames.rts.game.units.d.l
    public com.corrodinggames.rts.gameFramework.utility.m dx() {
        return this.z.c;
    }

    @Override // com.corrodinggames.rts.game.units.d.l
    public int h(as asVar) {
        return this.z.a(asVar);
    }

    @Override // com.corrodinggames.rts.game.units.d.l
    public boolean dy() {
        return this.z.a();
    }

    @Override // com.corrodinggames.rts.game.units.d.l
    public void dz() {
        this.z.e = 1.0f;
    }

    @Override // com.corrodinggames.rts.game.units.d.l
    public void a(PointF pointF) {
        this.z.b = pointF;
    }

    @Override // com.corrodinggames.rts.game.units.d.l
    public boolean dA() {
        return false;
    }

    @Override // com.corrodinggames.rts.game.units.am
    public float bV() {
        if (bT() && !this.z.a()) {
            return this.z.e;
        }
        return super.bV();
    }

    @Override // com.corrodinggames.rts.game.units.am
    public com.corrodinggames.rts.game.units.a.s e(as asVar) {
        return this.z.b(asVar);
    }

    @Override // com.corrodinggames.rts.game.units.am
    public void a(com.corrodinggames.rts.game.units.a.s sVar, boolean z) {
        this.z.a(sVar, z, (PointF) null, (am) null);
    }

    @Override // com.corrodinggames.rts.game.units.am
    public void b(com.corrodinggames.rts.game.units.a.s sVar, boolean z) {
        this.z.a(sVar, z);
    }

    @Override // com.corrodinggames.rts.game.units.am
    public void a(com.corrodinggames.rts.game.units.a.s sVar) {
        this.z.a(sVar);
    }

    @Override // com.corrodinggames.rts.game.units.y, com.corrodinggames.rts.game.units.am, com.corrodinggames.rts.gameFramework.w
    public void a(float f) {
        super.a(f);
        if (!bT() || this.bV) {
            return;
        }
        this.z.a(f);
    }

    @Override // com.corrodinggames.rts.game.units.d.d, com.corrodinggames.rts.game.units.y, com.corrodinggames.rts.game.units.am, com.corrodinggames.rts.gameFramework.w
    public boolean c(float f) {
        return super.c(f);
    }

    @Override // com.corrodinggames.rts.game.units.y, com.corrodinggames.rts.game.units.am
    public void bv() {
        PlayerData.a((am) this);
        this.z.a(true);
        super.bv();
    }

    @Override // com.corrodinggames.rts.game.units.y, com.corrodinggames.rts.game.units.am, com.corrodinggames.rts.gameFramework.ay, com.corrodinggames.rts.gameFramework.w
    public void a() {
        PlayerData.a((am) this);
        this.z.a(true);
        super.a();
    }

    @Override // com.corrodinggames.rts.game.units.am
    public boolean l() {
        return false;
    }

    @Override // com.corrodinggames.rts.game.units.y
    public void a(am amVar, int i) {
        throw new RuntimeException("Unit cannot shoot");
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

    @Override // com.corrodinggames.rts.game.units.am
    public void ca() {
        if (this.z.b != null) {
            GameEngine gameEngine = GameEngine.getGameEngine();
            gameEngine.bO.a((int) (this.eo - gameEngine.cw), (int) (this.ep - gameEngine.cx), (int) (this.z.b.x - gameEngine.cw), (int) (this.z.b.y - gameEngine.cx), y);
        }
    }

    @Override // com.corrodinggames.rts.game.units.am
    public int a(com.corrodinggames.rts.game.units.custom.g gVar) {
        return this.z.a(gVar);
    }
}