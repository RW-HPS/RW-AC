package com.corrodinggames.rts.gameFramework.unitAction;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import com.corrodinggames.rts.gameFramework.GameEngine;
import java.util.concurrent.locks.Lock;

/* renamed from: com.corrodinggames.rts.gameFramework.m.j */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/m/j.class */
public class j implements l {
    public Canvas a;
    boolean b = false;

    public j(Canvas canvas) {
        this.a = canvas;
    }

    @Override // com.corrodinggames.rts.gameFramework.unitAction.l
    public void a(Rect rect) {
        this.a.a(rect);
    }

    @Override // com.corrodinggames.rts.gameFramework.unitAction.l
    public void a(RectF rectF) {
        this.a.a(rectF);
    }

    @Override // com.corrodinggames.rts.gameFramework.unitAction.l
    public void a(e eVar, float f, float f2, Paint paint) {
        this.a.a(aa.a(eVar), f, f2, paint);
    }

    @Override // com.corrodinggames.rts.gameFramework.unitAction.l
    public void a(e eVar, Rect rect, Rect rect2, Paint paint) {
        this.a.a(aa.a(eVar), rect, rect2, paint);
    }

    @Override // com.corrodinggames.rts.gameFramework.unitAction.l
    public void a(e eVar, Rect rect, RectF rectF, Paint paint) {
        this.a.a(aa.a(eVar), rect, rectF, paint);
    }

    @Override // com.corrodinggames.rts.gameFramework.unitAction.l
    public void a(float f, float f2, float f3, Paint paint) {
        this.a.a(f, f2, f3, paint);
    }

    @Override // com.corrodinggames.rts.gameFramework.unitAction.l
    public void a(int i, PorterDuff.Mode mode) {
        this.a.a(i, mode);
    }

    @Override // com.corrodinggames.rts.gameFramework.unitAction.l
    public void a(int i) {
        this.a.a(i);
    }

    @Override // com.corrodinggames.rts.gameFramework.unitAction.l
    public void a(float f, float f2, float f3, float f4, Paint paint) {
        this.a.a(f, f2, f3, f4, paint);
    }

    @Override // com.corrodinggames.rts.gameFramework.unitAction.l
    public void a(float[] fArr, int i, int i2, Paint paint) {
        this.a.a(fArr, i, i2, paint);
    }

    @Override // com.corrodinggames.rts.gameFramework.unitAction.l
    public void a(Rect rect, Paint paint) {
        this.a.a(rect, paint);
    }

    @Override // com.corrodinggames.rts.gameFramework.unitAction.l
    public void a(RectF rectF, Paint paint) {
        this.a.a(rectF, paint);
    }

    @Override // com.corrodinggames.rts.gameFramework.unitAction.l
    public void a(String str, float f, float f2, Paint paint) {
        this.a.a(str, f, f2, paint);
    }

    public boolean equals(Object obj) {
        return this.a.equals(obj);
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    @Override // com.corrodinggames.rts.gameFramework.unitAction.l
    public void a() {
        this.a.b();
    }

    @Override // com.corrodinggames.rts.gameFramework.unitAction.l
    public void a(float f, float f2, float f3) {
        this.a.a(f, f2, f3);
    }

    @Override // com.corrodinggames.rts.gameFramework.unitAction.l
    public void b() {
        this.a.a();
    }

    @Override // com.corrodinggames.rts.gameFramework.unitAction.l
    public void a(float f, float f2, float f3, float f4) {
        this.a.a(f, f2, f3, f4);
    }

    @Override // com.corrodinggames.rts.gameFramework.unitAction.l
    public void a(float f, float f2) {
        this.a.b(f, f2);
    }

    @Override // com.corrodinggames.rts.gameFramework.unitAction.l
    public void a(e eVar) {
        this.a.a(eVar.b());
    }

    public String toString() {
        return this.a.toString();
    }

    @Override // com.corrodinggames.rts.gameFramework.unitAction.l
    public void b(float f, float f2) {
        this.a.a(f, f2);
    }

    @Override // com.corrodinggames.rts.gameFramework.unitAction.l
    public void a(boolean z) {
        this.b = z;
    }

    @Override // com.corrodinggames.rts.gameFramework.unitAction.l
    public boolean c() {
        return this.b;
    }

    @Override // com.corrodinggames.rts.gameFramework.unitAction.l
    public void a(m mVar) {
        mVar.a(GameEngine.getGameEngine().bO);
    }

    @Override // com.corrodinggames.rts.gameFramework.unitAction.l
    public void a(Bitmap bitmap) {
    }

    @Override // com.corrodinggames.rts.gameFramework.unitAction.l
    public void a(Lock lock) {
    }

    @Override // com.corrodinggames.rts.gameFramework.unitAction.l
    public void b(Lock lock) {
    }

    @Override // com.corrodinggames.rts.gameFramework.unitAction.l
    public boolean a(ae aeVar) {
        return false;
    }
}