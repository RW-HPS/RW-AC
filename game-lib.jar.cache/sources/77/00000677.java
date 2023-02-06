package com.corrodinggames.rts.java;

import com.corrodinggames.rts.gameFramework.GameEngine;

/* loaded from: game-lib.jar:com/corrodinggames/rts/java/d.class */
public class d implements com.corrodinggames.rts.appFramework.f {
    public int a;
    public int b;
    com.corrodinggames.rts.appFramework.m d;
    public Object e = new Object();
    public Object f = new Object();
    com.corrodinggames.rts.gameFramework.unitAction.n g = new com.corrodinggames.rts.gameFramework.unitAction.n();
    h c = new h();

    @Override // com.corrodinggames.rts.appFramework.f
    public void j() {
    }

    @Override // com.corrodinggames.rts.appFramework.f
    public void a() {
    }

    @Override // com.corrodinggames.rts.appFramework.f
    public boolean b() {
        return true;
    }

    @Override // com.corrodinggames.rts.appFramework.f
    public boolean c() {
        return false;
    }

    @Override // com.corrodinggames.rts.appFramework.f
    public com.corrodinggames.rts.gameFramework.unitAction.a d() {
        return null;
    }

    @Override // com.corrodinggames.rts.appFramework.f
    public boolean e() {
        return false;
    }

    @Override // com.corrodinggames.rts.appFramework.f
    public boolean f() {
        GameEngine gameEngine = GameEngine.getGameEngine();
        if (gameEngine != null && gameEngine.settingsEngine.slick2dFullScreen) {
            return true;
        }
        return false;
    }

    @Override // com.corrodinggames.rts.appFramework.f
    public Object g() {
        return null;
    }

    public int o() {
        return this.a;
    }

    public int p() {
        return this.b;
    }

    @Override // com.corrodinggames.rts.appFramework.f
    public void h() {
    }

    @Override // com.corrodinggames.rts.appFramework.f
    public com.corrodinggames.rts.appFramework.g i() {
        return this.c;
    }

    @Override // com.corrodinggames.rts.appFramework.f
    public com.corrodinggames.rts.appFramework.m k() {
        return this.d;
    }

    @Override // com.corrodinggames.rts.appFramework.f
    public void a(float f, int i) {
        synchronized (this.f) {
            this.f.notifyAll();
        }
    }

    @Override // com.corrodinggames.rts.appFramework.f
    public void b(float f, int i) {
    }

    @Override // com.corrodinggames.rts.appFramework.f
    public void l() {
    }

    @Override // com.corrodinggames.rts.appFramework.f
    public com.corrodinggames.rts.gameFramework.unitAction.l b(boolean z) {
        return this.g;
    }

    @Override // com.corrodinggames.rts.appFramework.f
    public void a(com.corrodinggames.rts.gameFramework.unitAction.l lVar, boolean z) {
    }

    @Override // com.corrodinggames.rts.appFramework.f
    public void m() {
    }

    @Override // com.corrodinggames.rts.appFramework.f
    public boolean n() {
        return true;
    }

    @Override // com.corrodinggames.rts.appFramework.f
    public void a(boolean z) {
    }
}