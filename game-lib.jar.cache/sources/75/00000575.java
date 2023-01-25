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
public class C0975j implements InterfaceC0977l {

    /* renamed from: a */
    public Canvas f6663a;

    /* renamed from: b */
    boolean f6664b = false;

    public C0975j(Canvas canvas) {
        this.f6663a = canvas;
    }

    @Override // com.corrodinggames.rts.gameFramework.unitAction.InterfaceC0977l
    /* renamed from: a */
    public void mo865a(Rect rect) {
        this.f6663a.m5248a(rect);
    }

    @Override // com.corrodinggames.rts.gameFramework.unitAction.InterfaceC0977l
    /* renamed from: a */
    public void mo863a(RectF rectF) {
        this.f6663a.m5246a(rectF);
    }

    @Override // com.corrodinggames.rts.gameFramework.unitAction.InterfaceC0977l
    /* renamed from: a */
    public void mo859a(C0970e c0970e, float f, float f2, Paint paint) {
        this.f6663a.m5251a(C0960aa.m950a(c0970e), f, f2, paint);
    }

    @Override // com.corrodinggames.rts.gameFramework.unitAction.InterfaceC0977l
    /* renamed from: a */
    public void mo858a(C0970e c0970e, Rect rect, Rect rect2, Paint paint) {
        this.f6663a.m5250a(C0960aa.m950a(c0970e), rect, rect2, paint);
    }

    @Override // com.corrodinggames.rts.gameFramework.unitAction.InterfaceC0977l
    /* renamed from: a */
    public void mo857a(C0970e c0970e, Rect rect, RectF rectF, Paint paint) {
        this.f6663a.m5249a(C0960aa.m950a(c0970e), rect, rectF, paint);
    }

    @Override // com.corrodinggames.rts.gameFramework.unitAction.InterfaceC0977l
    /* renamed from: a */
    public void mo869a(float f, float f2, float f3, Paint paint) {
        this.f6663a.m5255a(f, f2, f3, paint);
    }

    @Override // com.corrodinggames.rts.gameFramework.unitAction.InterfaceC0977l
    /* renamed from: a */
    public void mo867a(int i, PorterDuff.Mode mode) {
        this.f6663a.m5253a(i, mode);
    }

    @Override // com.corrodinggames.rts.gameFramework.unitAction.InterfaceC0977l
    /* renamed from: a */
    public void mo868a(int i) {
        this.f6663a.m5254a(i);
    }

    @Override // com.corrodinggames.rts.gameFramework.unitAction.InterfaceC0977l
    /* renamed from: a */
    public void mo870a(float f, float f2, float f3, float f4, Paint paint) {
        this.f6663a.m5256a(f, f2, f3, f4, paint);
    }

    @Override // com.corrodinggames.rts.gameFramework.unitAction.InterfaceC0977l
    /* renamed from: a */
    public void mo848a(float[] fArr, int i, int i2, Paint paint) {
        this.f6663a.m5242a(fArr, i, i2, paint);
    }

    @Override // com.corrodinggames.rts.gameFramework.unitAction.InterfaceC0977l
    /* renamed from: a */
    public void mo864a(Rect rect, Paint paint) {
        this.f6663a.m5247a(rect, paint);
    }

    @Override // com.corrodinggames.rts.gameFramework.unitAction.InterfaceC0977l
    /* renamed from: a */
    public void mo862a(RectF rectF, Paint paint) {
        this.f6663a.m5245a(rectF, paint);
    }

    @Override // com.corrodinggames.rts.gameFramework.unitAction.InterfaceC0977l
    /* renamed from: a */
    public void mo851a(String str, float f, float f2, Paint paint) {
        this.f6663a.m5244a(str, f, f2, paint);
    }

    public boolean equals(Object obj) {
        return this.f6663a.equals(obj);
    }

    public int hashCode() {
        return this.f6663a.hashCode();
    }

    @Override // com.corrodinggames.rts.gameFramework.unitAction.InterfaceC0977l
    /* renamed from: a */
    public void mo874a() {
        this.f6663a.m5241b();
    }

    @Override // com.corrodinggames.rts.gameFramework.unitAction.InterfaceC0977l
    /* renamed from: a */
    public void mo872a(float f, float f2, float f3) {
        this.f6663a.m5258a(f, f2, f3);
    }

    @Override // com.corrodinggames.rts.gameFramework.unitAction.InterfaceC0977l
    /* renamed from: b */
    public void mo847b() {
        this.f6663a.m5260a();
    }

    @Override // com.corrodinggames.rts.gameFramework.unitAction.InterfaceC0977l
    /* renamed from: a */
    public void mo871a(float f, float f2, float f3, float f4) {
        this.f6663a.m5257a(f, f2, f3, f4);
    }

    @Override // com.corrodinggames.rts.gameFramework.unitAction.InterfaceC0977l
    /* renamed from: a */
    public void mo873a(float f, float f2) {
        this.f6663a.m5240b(f, f2);
    }

    @Override // com.corrodinggames.rts.gameFramework.unitAction.InterfaceC0977l
    /* renamed from: a */
    public void mo860a(C0970e c0970e) {
        this.f6663a.m5252a(c0970e.mo391b());
    }

    public String toString() {
        return this.f6663a.toString();
    }

    @Override // com.corrodinggames.rts.gameFramework.unitAction.InterfaceC0977l
    /* renamed from: b */
    public void mo846b(float f, float f2) {
        this.f6663a.m5259a(f, f2);
    }

    @Override // com.corrodinggames.rts.gameFramework.unitAction.InterfaceC0977l
    /* renamed from: a */
    public void mo849a(boolean z) {
        this.f6664b = z;
    }

    @Override // com.corrodinggames.rts.gameFramework.unitAction.InterfaceC0977l
    /* renamed from: c */
    public boolean mo844c() {
        return this.f6664b;
    }

    @Override // com.corrodinggames.rts.gameFramework.unitAction.InterfaceC0977l
    /* renamed from: a */
    public void mo856a(AbstractC0978m abstractC0978m) {
        abstractC0978m.mo875a(GameEngine.getGameEngine().f6374bO);
    }

    @Override // com.corrodinggames.rts.gameFramework.unitAction.InterfaceC0977l
    /* renamed from: a */
    public void mo866a(Bitmap bitmap) {
    }

    @Override // com.corrodinggames.rts.gameFramework.unitAction.InterfaceC0977l
    /* renamed from: a */
    public void mo850a(Lock lock) {
    }

    @Override // com.corrodinggames.rts.gameFramework.unitAction.InterfaceC0977l
    /* renamed from: b */
    public void mo845b(Lock lock) {
    }

    @Override // com.corrodinggames.rts.gameFramework.unitAction.InterfaceC0977l
    /* renamed from: a */
    public boolean mo861a(C0964ae c0964ae) {
        return false;
    }
}