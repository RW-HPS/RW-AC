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
public class C1064z implements InterfaceC1063y {

    /* renamed from: a */
    C0970e f6810a;

    /* renamed from: b */
    C0970e f6811b;

    @Override // com.corrodinggames.rts.gameFramework.unitAction.InterfaceC1063y
    /* renamed from: a */
    public InterfaceC1063y mo202a(C0970e c0970e) {
        return mo161b(c0970e);
    }

    @Override // com.corrodinggames.rts.gameFramework.unitAction.InterfaceC1063y
    /* renamed from: b */
    public InterfaceC1063y mo161b(C0970e c0970e) {
        return new C1064z();
    }

    @Override // com.corrodinggames.rts.gameFramework.unitAction.InterfaceC1063y
    /* renamed from: a */
    public boolean mo231a() {
        return false;
    }

    @Override // com.corrodinggames.rts.gameFramework.unitAction.InterfaceC1063y
    /* renamed from: a */
    public void mo215a(Context context) {
    }

    @Override // com.corrodinggames.rts.gameFramework.unitAction.InterfaceC1063y
    /* renamed from: b */
    public void mo170b() {
        this.f6810a = new C0970e();
        this.f6811b = new C0970e();
    }

    @Override // com.corrodinggames.rts.gameFramework.unitAction.InterfaceC1063y
    /* renamed from: d */
    public InterfaceC0977l mo148d() {
        return null;
    }

    @Override // com.corrodinggames.rts.gameFramework.unitAction.InterfaceC1063y
    /* renamed from: a */
    public void mo190a(InterfaceC0977l interfaceC0977l) {
    }

    @Override // com.corrodinggames.rts.gameFramework.unitAction.InterfaceC1063y
    /* renamed from: a */
    public void mo205a(C0959a c0959a) {
    }

    @Override // com.corrodinggames.rts.gameFramework.unitAction.InterfaceC1063y
    /* renamed from: a */
    public C0970e mo222a(int i) {
        return mo216a(i, true);
    }

    @Override // com.corrodinggames.rts.gameFramework.unitAction.InterfaceC1063y
    /* renamed from: a */
    public C0970e mo216a(int i, boolean z) {
        return new C0970e();
    }

    @Override // com.corrodinggames.rts.gameFramework.unitAction.InterfaceC1063y
    /* renamed from: a */
    public C0970e mo184a(InputStream inputStream, boolean z) {
        return new C0970e();
    }

    @Override // com.corrodinggames.rts.gameFramework.unitAction.InterfaceC1063y
    /* renamed from: a */
    public C0970e mo219a(int i, int i2, boolean z) {
        return mo166b(i, i2, z);
    }

    @Override // com.corrodinggames.rts.gameFramework.unitAction.InterfaceC1063y
    /* renamed from: b */
    public C0970e mo166b(int i, int i2, boolean z) {
        return new C0970e();
    }

    @Override // com.corrodinggames.rts.gameFramework.unitAction.InterfaceC1063y
    /* renamed from: e */
    public void mo145e() {
    }

    @Override // com.corrodinggames.rts.gameFramework.unitAction.InterfaceC1063y
    /* renamed from: a */
    public void mo200a(C0970e c0970e, float f, float f2, float f3, Paint paint) {
    }

    @Override // com.corrodinggames.rts.gameFramework.unitAction.InterfaceC1063y
    /* renamed from: a */
    public void mo197a(C0970e c0970e, Rect rect, float f, float f2, float f3, Paint paint) {
    }

    @Override // com.corrodinggames.rts.gameFramework.unitAction.InterfaceC1063y
    /* renamed from: a */
    public void mo194a(C0970e c0970e, Rect rect, Rect rect2, Paint paint) {
    }

    @Override // com.corrodinggames.rts.gameFramework.unitAction.InterfaceC1063y
    /* renamed from: b */
    public void mo159b(C0970e c0970e, Rect rect, Rect rect2, Paint paint) {
        mo194a(c0970e, rect, rect2, paint);
    }

    @Override // com.corrodinggames.rts.gameFramework.unitAction.InterfaceC1063y
    /* renamed from: a */
    public void mo208a(Rect rect, Paint paint) {
        mo163b(rect, paint);
    }

    @Override // com.corrodinggames.rts.gameFramework.unitAction.InterfaceC1063y
    /* renamed from: a */
    public void mo173a(boolean z) {
    }

    @Override // com.corrodinggames.rts.gameFramework.unitAction.InterfaceC1063y
    /* renamed from: f */
    public void mo142f() {
    }

    @Override // com.corrodinggames.rts.gameFramework.unitAction.InterfaceC1063y
    /* renamed from: a */
    public void mo193a(C0970e c0970e, Rect rect, RectF rectF, Paint paint) {
    }

    @Override // com.corrodinggames.rts.gameFramework.unitAction.InterfaceC1063y
    /* renamed from: a */
    public void mo199a(C0970e c0970e, float f, float f2, Paint paint) {
    }

    @Override // com.corrodinggames.rts.gameFramework.unitAction.InterfaceC1063y
    /* renamed from: a */
    public void mo198a(C0970e c0970e, float f, float f2, Paint paint, float f3, float f4) {
    }

    @Override // com.corrodinggames.rts.gameFramework.unitAction.InterfaceC1063y
    /* renamed from: b */
    public void mo160b(C0970e c0970e, float f, float f2, Paint paint) {
    }

    @Override // com.corrodinggames.rts.gameFramework.unitAction.InterfaceC1063y
    /* renamed from: a */
    public void mo196a(C0970e c0970e, Rect rect, Paint paint) {
    }

    @Override // com.corrodinggames.rts.gameFramework.unitAction.InterfaceC1063y
    /* renamed from: a */
    public void mo195a(C0970e c0970e, Rect rect, Paint paint, int i, int i2, int i3, int i4) {
    }

    @Override // com.corrodinggames.rts.gameFramework.unitAction.InterfaceC1063y
    /* renamed from: a */
    public void mo192a(C0970e c0970e, RectF rectF, Paint paint, float f, float f2, int i, int i2) {
    }

    @Override // com.corrodinggames.rts.gameFramework.unitAction.InterfaceC1063y
    /* renamed from: b */
    public void mo167b(int i) {
    }

    @Override // com.corrodinggames.rts.gameFramework.unitAction.InterfaceC1063y
    /* renamed from: a */
    public void mo218a(int i, PorterDuff.Mode mode) {
    }

    @Override // com.corrodinggames.rts.gameFramework.unitAction.InterfaceC1063y
    /* renamed from: a */
    public void mo181a(String str, float f, float f2, Paint paint, Paint paint2, float f3) {
    }

    @Override // com.corrodinggames.rts.gameFramework.unitAction.InterfaceC1063y
    /* renamed from: a */
    public void mo182a(String str, float f, float f2, Paint paint) {
    }

    @Override // com.corrodinggames.rts.gameFramework.unitAction.InterfaceC1063y
    /* renamed from: b */
    public void mo163b(Rect rect, Paint paint) {
    }

    @Override // com.corrodinggames.rts.gameFramework.unitAction.InterfaceC1063y
    /* renamed from: a */
    public void mo206a(RectF rectF, Paint paint) {
    }

    @Override // com.corrodinggames.rts.gameFramework.unitAction.InterfaceC1063y
    /* renamed from: g */
    public void mo140g() {
    }

    @Override // com.corrodinggames.rts.gameFramework.unitAction.InterfaceC1063y
    /* renamed from: h */
    public void mo139h() {
    }

    @Override // com.corrodinggames.rts.gameFramework.unitAction.InterfaceC1063y
    /* renamed from: c */
    public void mo152c(Rect rect, Paint paint) {
    }

    @Override // com.corrodinggames.rts.gameFramework.unitAction.InterfaceC1063y
    /* renamed from: a */
    public void mo209a(Rect rect) {
    }

    @Override // com.corrodinggames.rts.gameFramework.unitAction.InterfaceC1063y
    /* renamed from: a */
    public void mo207a(RectF rectF) {
    }

    @Override // com.corrodinggames.rts.gameFramework.unitAction.InterfaceC1063y
    /* renamed from: a */
    public void mo224a(float f, float f2, float f3, Paint paint) {
    }

    @Override // com.corrodinggames.rts.gameFramework.unitAction.InterfaceC1063y
    /* renamed from: b */
    public void mo168b(float f, float f2, float f3, Paint paint) {
        mo224a(f, f2, f3, paint);
    }

    @Override // com.corrodinggames.rts.gameFramework.unitAction.InterfaceC1063y
    /* renamed from: a */
    public void mo171a(float[] fArr, int i, int i2, Paint paint) {
    }

    @Override // com.corrodinggames.rts.gameFramework.unitAction.InterfaceC1063y
    /* renamed from: i */
    public void mo138i() {
    }

    @Override // com.corrodinggames.rts.gameFramework.unitAction.InterfaceC1063y
    /* renamed from: j */
    public void mo137j() {
    }

    @Override // com.corrodinggames.rts.gameFramework.unitAction.InterfaceC1063y
    /* renamed from: k */
    public void mo136k() {
        mo138i();
    }

    @Override // com.corrodinggames.rts.gameFramework.unitAction.InterfaceC1063y
    /* renamed from: l */
    public void mo135l() {
        mo137j();
    }

    @Override // com.corrodinggames.rts.gameFramework.unitAction.InterfaceC1063y
    /* renamed from: a */
    public void mo228a(float f, float f2, float f3) {
    }

    @Override // com.corrodinggames.rts.gameFramework.unitAction.InterfaceC1063y
    /* renamed from: a */
    public void mo229a(float f, float f2) {
    }

    @Override // com.corrodinggames.rts.gameFramework.unitAction.InterfaceC1063y
    /* renamed from: a */
    public void mo227a(float f, float f2, float f3, float f4) {
    }

    @Override // com.corrodinggames.rts.gameFramework.unitAction.InterfaceC1063y
    /* renamed from: b */
    public void mo169b(float f, float f2) {
    }

    @Override // com.corrodinggames.rts.gameFramework.unitAction.InterfaceC1063y
    /* renamed from: a */
    public void mo189a(AbstractC0978m abstractC0978m) {
        abstractC0978m.mo875a(this);
    }

    @Override // com.corrodinggames.rts.gameFramework.unitAction.InterfaceC1063y
    /* renamed from: a */
    public void mo226a(float f, float f2, float f3, float f4, Paint paint) {
    }

    @Override // com.corrodinggames.rts.gameFramework.unitAction.InterfaceC1063y
    /* renamed from: m */
    public int mo134m() {
        return 0;
    }

    @Override // com.corrodinggames.rts.gameFramework.unitAction.InterfaceC1063y
    /* renamed from: n */
    public int mo133n() {
        return 0;
    }

    @Override // com.corrodinggames.rts.gameFramework.unitAction.InterfaceC1063y
    /* renamed from: a */
    public void mo221a(int i, int i2) {
    }

    @Override // com.corrodinggames.rts.gameFramework.unitAction.InterfaceC1063y
    /* renamed from: o */
    public void mo132o() {
    }

    @Override // com.corrodinggames.rts.gameFramework.unitAction.InterfaceC1063y
    /* renamed from: a */
    public void mo214a(Paint paint) {
    }

    @Override // com.corrodinggames.rts.gameFramework.unitAction.InterfaceC1063y
    /* renamed from: a */
    public void mo204a(C0964ae c0964ae) {
    }

    @Override // com.corrodinggames.rts.gameFramework.unitAction.InterfaceC1063y
    /* renamed from: p */
    public void mo131p() {
    }

    @Override // com.corrodinggames.rts.gameFramework.unitAction.InterfaceC1063y
    /* renamed from: q */
    public void mo130q() {
    }

    @Override // com.corrodinggames.rts.gameFramework.unitAction.InterfaceC1063y
    /* renamed from: a */
    public int mo180a(String str, Paint paint) {
        return 1;
    }

    @Override // com.corrodinggames.rts.gameFramework.unitAction.InterfaceC1063y
    /* renamed from: b */
    public int mo158b(String str, Paint paint) {
        return 1;
    }

    @Override // com.corrodinggames.rts.gameFramework.unitAction.InterfaceC1063y
    /* renamed from: r */
    public C0970e mo129r() {
        return this.f6811b;
    }

    @Override // com.corrodinggames.rts.gameFramework.unitAction.InterfaceC1063y
    /* renamed from: a */
    public void mo191a(C0970e c0970e, File file) {
        throw new RuntimeException("writeImageToFile not yet supported");
    }

    @Override // com.corrodinggames.rts.gameFramework.unitAction.InterfaceC1063y
    /* renamed from: a */
    public void mo179a(Lock lock) {
    }

    @Override // com.corrodinggames.rts.gameFramework.unitAction.InterfaceC1063y
    /* renamed from: b */
    public void mo157b(Lock lock) {
    }

    @Override // com.corrodinggames.rts.gameFramework.unitAction.InterfaceC1063y
    /* renamed from: s */
    public float mo128s() {
        return 1.0f;
    }
}