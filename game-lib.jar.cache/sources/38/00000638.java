package com.corrodinggames.rts.java;

import android.graphics.Bitmap;
import org.newdawn.slick.Image;
import org.newdawn.slick.opengl.ImageData;

/* loaded from: game-lib.jar:com/corrodinggames/rts/java/a.class */
public class a extends LoadImage {
    LoadImage x;

    public a(LoadImage loadImage) {
        this.x = loadImage;
    }

    @Override // com.corrodinggames.rts.java.LoadImage
    public Image C() {
        return this.x.C();
    }

    @Override // com.corrodinggames.rts.gameFramework.unitAction.e
    public Bitmap b() {
        return this.x.b();
    }

    @Override // com.corrodinggames.rts.gameFramework.unitAction.e
    public com.corrodinggames.rts.gameFramework.unitAction.e c() {
        return this.x.c();
    }

    @Override // com.corrodinggames.rts.java.LoadImage, com.corrodinggames.rts.gameFramework.unitAction.e
    public String a() {
        return this.x.a();
    }

    @Override // com.corrodinggames.rts.gameFramework.unitAction.e
    public int l() {
        return this.x.l();
    }

    @Override // com.corrodinggames.rts.gameFramework.unitAction.e
    public int m() {
        return this.x.m();
    }

    @Override // com.corrodinggames.rts.gameFramework.unitAction.e
    public int u() {
        return this.x.u();
    }

    @Override // com.corrodinggames.rts.gameFramework.unitAction.e
    public void w() {
    }

    @Override // com.corrodinggames.rts.java.LoadImage, com.corrodinggames.rts.gameFramework.unitAction.e
    public com.corrodinggames.rts.gameFramework.unitAction.e a(int i, int i2, boolean z) {
        return this;
    }

    @Override // com.corrodinggames.rts.java.LoadImage, com.corrodinggames.rts.gameFramework.unitAction.e
    public int a(int i, int i2) {
        return this.x.a(i, i2);
    }

    @Override // com.corrodinggames.rts.java.LoadImage, com.corrodinggames.rts.gameFramework.unitAction.e
    public void p() {
    }

    @Override // com.corrodinggames.rts.java.LoadImage, com.corrodinggames.rts.gameFramework.unitAction.e
    public void r() {
    }

    @Override // com.corrodinggames.rts.java.LoadImage, com.corrodinggames.rts.gameFramework.unitAction.e
    public void n() {
    }

    @Override // com.corrodinggames.rts.java.LoadImage, com.corrodinggames.rts.gameFramework.unitAction.e
    /* renamed from: h */
    public com.corrodinggames.rts.gameFramework.unitAction.e mo15clone() {
        return this;
    }

    @Override // com.corrodinggames.rts.java.LoadImage, com.corrodinggames.rts.gameFramework.unitAction.e
    public void t() {
    }

    @Override // com.corrodinggames.rts.java.LoadImage
    public long c(boolean z) {
        return this.x.c(z);
    }

    @Override // com.corrodinggames.rts.gameFramework.unitAction.e
    public void a(boolean z) {
    }

    @Override // com.corrodinggames.rts.gameFramework.unitAction.e
    public void a(Bitmap bitmap) {
    }

    @Override // com.corrodinggames.rts.gameFramework.unitAction.e
    public void g() {
    }

    @Override // com.corrodinggames.rts.gameFramework.unitAction.e
    public void a(com.corrodinggames.rts.gameFramework.unitAction.e eVar) {
        this.x.a(eVar);
    }

    @Override // com.corrodinggames.rts.java.LoadImage
    public void D() {
    }

    @Override // com.corrodinggames.rts.java.LoadImage
    public void a(Image image, String str) {
    }

    @Override // com.corrodinggames.rts.java.LoadImage
    public void a(ImageData imageData, String str, boolean z) {
    }

    @Override // com.corrodinggames.rts.gameFramework.unitAction.e
    public void v() {
    }

    @Override // com.corrodinggames.rts.java.LoadImage, com.corrodinggames.rts.gameFramework.unitAction.e
    public void i() {
    }

    @Override // com.corrodinggames.rts.java.LoadImage, com.corrodinggames.rts.gameFramework.unitAction.e
    public void j() {
    }

    @Override // com.corrodinggames.rts.java.LoadImage, com.corrodinggames.rts.gameFramework.unitAction.e
    public void a(int i, int i2, int i3) {
    }

    @Override // com.corrodinggames.rts.java.LoadImage, com.corrodinggames.rts.gameFramework.unitAction.e
    public void o() {
    }

    @Override // com.corrodinggames.rts.java.LoadImage
    public void E() {
    }

    @Override // com.corrodinggames.rts.java.LoadImage
    public void F() {
    }

    @Override // com.corrodinggames.rts.java.LoadImage
    public void G() {
        this.x.G();
    }

    public String toString() {
        return this.x.toString();
    }

    @Override // com.corrodinggames.rts.gameFramework.unitAction.e
    public boolean A() {
        return true;
    }
}