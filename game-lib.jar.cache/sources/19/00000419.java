package com.corrodinggames.rts.game.units;

import com.corrodinggames.rts.game.Projectile;

/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/x.class */
public abstract class x extends y {
    @Override // com.corrodinggames.rts.game.units.am
    public com.corrodinggames.rts.gameFramework.unitAction.e v() {
        return null;
    }

    @Override // com.corrodinggames.rts.game.units.y
    public com.corrodinggames.rts.gameFramework.unitAction.e d() {
        return com.corrodinggames.rts.game.units.e.b.b;
    }

    @Override // com.corrodinggames.rts.game.units.y
    public com.corrodinggames.rts.gameFramework.unitAction.e k() {
        return null;
    }

    @Override // com.corrodinggames.rts.game.units.y
    public com.corrodinggames.rts.gameFramework.unitAction.e d(int i) {
        return null;
    }

    @Override // com.corrodinggames.rts.game.units.am
    public boolean e() {
        return false;
    }

    public x(boolean z) {
        super(z);
        T(20);
        U(20);
        this.cj = 1.0f;
        this.ck = this.cj;
        this.bT = false;
        this.cv = 100.0f;
        this.cu = this.cv;
        this.M = com.corrodinggames.rts.game.units.e.b.b;
    }

    @Override // com.corrodinggames.rts.game.units.am
    public void f_() {
        this.bT = false;
    }

    @Override // com.corrodinggames.rts.game.units.y, com.corrodinggames.rts.game.units.am, com.corrodinggames.rts.gameFramework.w
    public void a(float f) {
        super.a(f);
    }

    @Override // com.corrodinggames.rts.game.units.am, com.corrodinggames.rts.gameFramework.w
    public void a(float f, boolean z) {
    }

    @Override // com.corrodinggames.rts.game.units.y
    public float e(int i) {
        return 0.0f;
    }

    @Override // com.corrodinggames.rts.game.units.y
    public float f(int i) {
        return 0.0f;
    }

    @Override // com.corrodinggames.rts.game.units.y, com.corrodinggames.rts.game.units.am, com.corrodinggames.rts.gameFramework.w
    public boolean c(float f) {
        return false;
    }

    @Override // com.corrodinggames.rts.game.units.y
    public void a(am amVar, int i) {
    }

    @Override // com.corrodinggames.rts.game.units.y
    public float m() {
        return 30.0f;
    }

    @Override // com.corrodinggames.rts.game.units.y
    public float b(int i) {
        return 100.0f;
    }

    @Override // com.corrodinggames.rts.game.units.y
    public float z() {
        return 0.0f;
    }

    @Override // com.corrodinggames.rts.game.units.y
    public float A() {
        return 4.8f;
    }

    @Override // com.corrodinggames.rts.game.units.y
    public float B() {
        return 0.35f;
    }

    @Override // com.corrodinggames.rts.game.units.y
    public float c(int i) {
        return 99.0f;
    }

    @Override // com.corrodinggames.rts.game.units.am
    public boolean l() {
        return false;
    }

    @Override // com.corrodinggames.rts.game.units.y
    public float C() {
        return 0.04f;
    }

    @Override // com.corrodinggames.rts.game.units.y
    public float D() {
        return 0.1f;
    }

    @Override // com.corrodinggames.rts.game.units.y
    public boolean E() {
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.y
    public float g(int i) {
        return 10.0f;
    }

    @Override // com.corrodinggames.rts.game.units.y
    public boolean F() {
        return false;
    }

    @Override // com.corrodinggames.rts.game.units.y
    public float G() {
        return 1.0f;
    }

    @Override // com.corrodinggames.rts.game.units.y
    public float H() {
        return 1.0f;
    }

    @Override // com.corrodinggames.rts.game.units.am
    public boolean u() {
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.am
    public boolean d(am amVar) {
        return false;
    }

    @Override // com.corrodinggames.rts.game.units.y
    public boolean I() {
        return false;
    }

    @Override // com.corrodinggames.rts.game.units.am
    public boolean J() {
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.am
    public float a(am amVar, float f, Projectile projectile) {
        return super.a(amVar, 0.0f, projectile);
    }

    @Override // com.corrodinggames.rts.game.units.am
    public boolean P() {
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.am
    public boolean Q() {
        return false;
    }

    @Override // com.corrodinggames.rts.game.units.am
    public boolean i() {
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.am
    public ao h() {
        return ao.AIR;
    }
}