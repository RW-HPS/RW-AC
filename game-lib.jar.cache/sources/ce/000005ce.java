package com.corrodinggames.rts.gameFramework.unitAction;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import java.io.File;
import java.io.InputStream;
import java.util.concurrent.locks.Lock;

/* renamed from: com.corrodinggames.rts.gameFramework.m.z */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/m/z.class */
public class z implements y {
    e a;
    e b;

    @Override // com.corrodinggames.rts.gameFramework.unitAction.y
    /* renamed from: a */
    public y mo9a(e eVar) {
        return mo10b(eVar);
    }

    @Override // com.corrodinggames.rts.gameFramework.unitAction.y
    /* renamed from: b */
    public y mo10b(e eVar) {
        return new z();
    }

    @Override // com.corrodinggames.rts.gameFramework.unitAction.y
    public boolean a() {
        return false;
    }

    @Override // com.corrodinggames.rts.gameFramework.unitAction.y
    public void a(Context context) {
    }

    @Override // com.corrodinggames.rts.gameFramework.unitAction.y
    public void b() {
        this.a = new e();
        this.b = new e();
    }

    @Override // com.corrodinggames.rts.gameFramework.unitAction.y
    public l d() {
        return null;
    }

    @Override // com.corrodinggames.rts.gameFramework.unitAction.y
    public void a(l lVar) {
    }

    @Override // com.corrodinggames.rts.gameFramework.unitAction.y
    public void a(a aVar) {
    }

    @Override // com.corrodinggames.rts.gameFramework.unitAction.y
    public e a(int i) {
        return a(i, true);
    }

    @Override // com.corrodinggames.rts.gameFramework.unitAction.y
    public e a(int i, boolean z) {
        return new e();
    }

    @Override // com.corrodinggames.rts.gameFramework.unitAction.y
    public e a(InputStream inputStream, boolean z) {
        return new e();
    }

    @Override // com.corrodinggames.rts.gameFramework.unitAction.y
    public e a(int i, int i2, boolean z) {
        return b(i, i2, z);
    }

    @Override // com.corrodinggames.rts.gameFramework.unitAction.y
    public e b(int i, int i2, boolean z) {
        return new e();
    }

    @Override // com.corrodinggames.rts.gameFramework.unitAction.y
    public void e() {
    }

    @Override // com.corrodinggames.rts.gameFramework.unitAction.y
    public void a(e eVar, float f, float f2, float f3, Paint paint) {
    }

    @Override // com.corrodinggames.rts.gameFramework.unitAction.y
    public void a(e eVar, Rect rect, float f, float f2, float f3, Paint paint) {
    }

    @Override // com.corrodinggames.rts.gameFramework.unitAction.y
    public void a(e eVar, Rect rect, Rect rect2, Paint paint) {
    }

    @Override // com.corrodinggames.rts.gameFramework.unitAction.y
    public void b(e eVar, Rect rect, Rect rect2, Paint paint) {
        a(eVar, rect, rect2, paint);
    }

    @Override // com.corrodinggames.rts.gameFramework.unitAction.y
    public void a(Rect rect, Paint paint) {
        b(rect, paint);
    }

    @Override // com.corrodinggames.rts.gameFramework.unitAction.y
    public void a(boolean z) {
    }

    @Override // com.corrodinggames.rts.gameFramework.unitAction.y
    public void f() {
    }

    @Override // com.corrodinggames.rts.gameFramework.unitAction.y
    public void a(e eVar, Rect rect, RectF rectF, Paint paint) {
    }

    @Override // com.corrodinggames.rts.gameFramework.unitAction.y
    public void a(e eVar, float f, float f2, Paint paint) {
    }

    @Override // com.corrodinggames.rts.gameFramework.unitAction.y
    public void a(e eVar, float f, float f2, Paint paint, float f3, float f4) {
    }

    @Override // com.corrodinggames.rts.gameFramework.unitAction.y
    public void b(e eVar, float f, float f2, Paint paint) {
    }

    @Override // com.corrodinggames.rts.gameFramework.unitAction.y
    public void a(e eVar, Rect rect, Paint paint) {
    }

    @Override // com.corrodinggames.rts.gameFramework.unitAction.y
    public void a(e eVar, Rect rect, Paint paint, int i, int i2, int i3, int i4) {
    }

    @Override // com.corrodinggames.rts.gameFramework.unitAction.y
    public void a(e eVar, RectF rectF, Paint paint, float f, float f2, int i, int i2) {
    }

    @Override // com.corrodinggames.rts.gameFramework.unitAction.y
    public void b(int i) {
    }

    @Override // com.corrodinggames.rts.gameFramework.unitAction.y
    public void a(int i, PorterDuff.Mode mode) {
    }

    @Override // com.corrodinggames.rts.gameFramework.unitAction.y
    public void a(String str, float f, float f2, Paint paint, Paint paint2, float f3) {
    }

    @Override // com.corrodinggames.rts.gameFramework.unitAction.y
    public void a(String str, float f, float f2, Paint paint) {
    }

    @Override // com.corrodinggames.rts.gameFramework.unitAction.y
    public void b(Rect rect, Paint paint) {
    }

    @Override // com.corrodinggames.rts.gameFramework.unitAction.y
    public void a(RectF rectF, Paint paint) {
    }

    @Override // com.corrodinggames.rts.gameFramework.unitAction.y
    public void g() {
    }

    @Override // com.corrodinggames.rts.gameFramework.unitAction.y
    public void h() {
    }

    @Override // com.corrodinggames.rts.gameFramework.unitAction.y
    public void c(Rect rect, Paint paint) {
    }

    @Override // com.corrodinggames.rts.gameFramework.unitAction.y
    public void a(Rect rect) {
    }

    @Override // com.corrodinggames.rts.gameFramework.unitAction.y
    public void a(RectF rectF) {
    }

    @Override // com.corrodinggames.rts.gameFramework.unitAction.y
    public void a(float f, float f2, float f3, Paint paint) {
    }

    @Override // com.corrodinggames.rts.gameFramework.unitAction.y
    public void b(float f, float f2, float f3, Paint paint) {
        a(f, f2, f3, paint);
    }

    @Override // com.corrodinggames.rts.gameFramework.unitAction.y
    public void a(float[] fArr, int i, int i2, Paint paint) {
    }

    @Override // com.corrodinggames.rts.gameFramework.unitAction.y
    public void i() {
    }

    @Override // com.corrodinggames.rts.gameFramework.unitAction.y
    public void j() {
    }

    @Override // com.corrodinggames.rts.gameFramework.unitAction.y
    public void k() {
        i();
    }

    @Override // com.corrodinggames.rts.gameFramework.unitAction.y
    public void l() {
        j();
    }

    @Override // com.corrodinggames.rts.gameFramework.unitAction.y
    public void a(float f, float f2, float f3) {
    }

    @Override // com.corrodinggames.rts.gameFramework.unitAction.y
    public void a(float f, float f2) {
    }

    @Override // com.corrodinggames.rts.gameFramework.unitAction.y
    public void a(float f, float f2, float f3, float f4) {
    }

    @Override // com.corrodinggames.rts.gameFramework.unitAction.y
    public void b(float f, float f2) {
    }

    @Override // com.corrodinggames.rts.gameFramework.unitAction.y
    public void a(m mVar) {
        mVar.a(this);
    }

    @Override // com.corrodinggames.rts.gameFramework.unitAction.y
    public void a(float f, float f2, float f3, float f4, Paint paint) {
    }

    @Override // com.corrodinggames.rts.gameFramework.unitAction.y
    public int m() {
        return 0;
    }

    @Override // com.corrodinggames.rts.gameFramework.unitAction.y
    public int n() {
        return 0;
    }

    @Override // com.corrodinggames.rts.gameFramework.unitAction.y
    public void a(int i, int i2) {
    }

    @Override // com.corrodinggames.rts.gameFramework.unitAction.y
    public void o() {
    }

    @Override // com.corrodinggames.rts.gameFramework.unitAction.y
    public void a(Paint paint) {
    }

    @Override // com.corrodinggames.rts.gameFramework.unitAction.y
    public void a(ae aeVar) {
    }

    @Override // com.corrodinggames.rts.gameFramework.unitAction.y
    public void p() {
    }

    @Override // com.corrodinggames.rts.gameFramework.unitAction.y
    public void q() {
    }

    @Override // com.corrodinggames.rts.gameFramework.unitAction.y
    public int a(String str, Paint paint) {
        return 1;
    }

    @Override // com.corrodinggames.rts.gameFramework.unitAction.y
    public int b(String str, Paint paint) {
        return 1;
    }

    @Override // com.corrodinggames.rts.gameFramework.unitAction.y
    public e r() {
        return this.b;
    }

    @Override // com.corrodinggames.rts.gameFramework.unitAction.y
    public void a(e eVar, File file) {
        throw new RuntimeException("writeImageToFile not yet supported");
    }

    @Override // com.corrodinggames.rts.gameFramework.unitAction.y
    public void a(Lock lock) {
    }

    @Override // com.corrodinggames.rts.gameFramework.unitAction.y
    public void b(Lock lock) {
    }

    @Override // com.corrodinggames.rts.gameFramework.unitAction.y
    public float s() {
        return 1.0f;
    }
}