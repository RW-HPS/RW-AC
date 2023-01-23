package com.corrodinggames.rts.java;

import com.corrodinggames.rts.gameFramework.GameEngine;

/* loaded from: game-lib.jar:com/corrodinggames/rts/java/d.class */
public class d implements com.corrodinggames.rts.appFramework.f {

    /* renamed from: a */
    public int f742a;
    public int b;
    com.corrodinggames.rts.appFramework.m d;
    public Object e = new Object();
    public Object f = new Object();
    com.corrodinggames.rts.gameFramework.unitAction.n g = new com.corrodinggames.rts.gameFramework.unitAction.n();
    h c = new h();

    public void j() {
    }

    public void a() {
    }

    public boolean b() {
        return true;
    }

    public boolean c() {
        return false;
    }

    public com.corrodinggames.rts.gameFramework.unitAction.a d() {
        return null;
    }

    public boolean e() {
        return false;
    }

    public boolean f() {
        GameEngine gameEngine = GameEngine.getGameEngine();
        if (gameEngine != null && gameEngine.settingsEngine.slick2dFullScreen) {
            return true;
        }
        return false;
    }

    public Object g() {
        return null;
    }

    public int o() {
        return this.f742a;
    }

    public int p() {
        return this.b;
    }

    public void h() {
    }

    public com.corrodinggames.rts.appFramework.g i() {
        return this.c;
    }

    public com.corrodinggames.rts.appFramework.m k() {
        return this.d;
    }

    public void a(float f, int i) {
        synchronized (this.f) {
            this.f.notifyAll();
        }
    }

    public void b(float f, int i) {
    }

    public void l() {
    }

    public com.corrodinggames.rts.gameFramework.unitAction.l b(boolean z) {
        return this.g;
    }

    public void a(com.corrodinggames.rts.gameFramework.unitAction.l lVar, boolean z) {
    }

    public void m() {
    }

    public boolean n() {
        return true;
    }

    public void a(boolean z) {
    }
}