package com.corrodinggames.rts.gameFramework.m;

import android.graphics.Bitmap;

/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/m/ad.class */
public class ad extends e {
    e x;

    public ad(e eVar) {
        this.x = eVar;
        this.k = eVar.k;
    }

    @Override // com.corrodinggames.rts.gameFramework.m.e
    public String a() {
        return this.x.a();
    }

    @Override // com.corrodinggames.rts.gameFramework.m.e
    public Bitmap b() {
        return this.x.b();
    }

    @Override // com.corrodinggames.rts.gameFramework.m.e
    public e c() {
        return this.x.c();
    }

    @Override // com.corrodinggames.rts.gameFramework.m.e
    public void a(boolean z) {
    }

    @Override // com.corrodinggames.rts.gameFramework.m.e
    public void a(Bitmap bitmap) {
    }

    @Override // com.corrodinggames.rts.gameFramework.m.e
    public void g() {
        this.x.g();
    }

    @Override // com.corrodinggames.rts.gameFramework.m.e
    public void a(e eVar) {
        this.x.a(eVar);
    }

    @Override // com.corrodinggames.rts.gameFramework.m.e
    /* renamed from: h */
    public e clone() {
        return this;
    }

    @Override // com.corrodinggames.rts.gameFramework.m.e
    public e a(int i, int i2, boolean z) {
        return this;
    }

    @Override // com.corrodinggames.rts.gameFramework.m.e
    public void i() {
    }

    @Override // com.corrodinggames.rts.gameFramework.m.e
    public void j() {
    }

    @Override // com.corrodinggames.rts.gameFramework.m.e
    public int a(int i, int i2) {
        return this.x.a(i, i2);
    }

    @Override // com.corrodinggames.rts.gameFramework.m.e
    public void a(int i, int i2, int i3) {
    }

    @Override // com.corrodinggames.rts.gameFramework.m.e
    public int l() {
        return this.x.l();
    }

    @Override // com.corrodinggames.rts.gameFramework.m.e
    public int m() {
        return this.x.m();
    }

    @Override // com.corrodinggames.rts.gameFramework.m.e
    public void n() {
    }

    @Override // com.corrodinggames.rts.gameFramework.m.e
    public void o() {
    }

    @Override // com.corrodinggames.rts.gameFramework.m.e
    public void p() {
    }

    @Override // com.corrodinggames.rts.gameFramework.m.e
    public void r() {
    }

    @Override // com.corrodinggames.rts.gameFramework.m.e
    public void t() {
    }

    @Override // com.corrodinggames.rts.gameFramework.m.e
    public int u() {
        return this.x.u();
    }

    @Override // com.corrodinggames.rts.gameFramework.m.e
    public void v() {
    }

    @Override // com.corrodinggames.rts.gameFramework.m.e
    public void w() {
    }

    public String toString() {
        return "MutableBitmapOrTexture(" + this.x.toString() + ")";
    }

    @Override // com.corrodinggames.rts.gameFramework.m.e
    public ae B() {
        return this.x.i;
    }

    @Override // com.corrodinggames.rts.gameFramework.m.e
    public void a(ae aeVar) {
    }
}