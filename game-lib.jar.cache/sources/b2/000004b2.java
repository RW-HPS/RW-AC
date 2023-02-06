package com.corrodinggames.rts.gameFramework.Interface.a;

import android.graphics.Paint;
import android.graphics.Rect;
import com.corrodinggames.rts.gameFramework.unitAction.aa;
import com.corrodinggames.rts.gameFramework.unitAction.y;

/* renamed from: com.corrodinggames.rts.gameFramework.f.a.e */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/f/a/e.class */
public class e extends h {
    int a;
    int b;
    float c;
    float d;
    public boolean e = true;
    public boolean f = false;
    public float g = 1.0f;
    static Rect h = new Rect();
    static Rect i = new Rect();

    public e() {
    }

    public e(com.corrodinggames.rts.gameFramework.unitAction.e eVar, int i2, int i3) {
        a(eVar);
        a(eVar, i2, i3);
    }

    public void a(com.corrodinggames.rts.gameFramework.unitAction.e eVar, int i2, int i3) {
        this.a = i2;
        this.b = i3;
        this.c = i2 / eVar.p;
        this.d = i3 / eVar.q;
    }

    /* renamed from: a */
    public e clone() {
        e eVar = new e();
        eVar.a(this);
        return eVar;
    }

    @Override // com.corrodinggames.rts.gameFramework.Interface.a.h
    public void a(h hVar) {
        e eVar = (e) hVar;
        this.a = eVar.a;
        this.b = eVar.b;
        this.c = eVar.c;
        this.d = eVar.d;
        this.e = eVar.e;
        super.a(eVar);
    }

    @Override // com.corrodinggames.rts.gameFramework.Interface.a.h
    public void a(com.corrodinggames.rts.gameFramework.unitAction.e eVar) {
        super.a(eVar);
    }

    @Override // com.corrodinggames.rts.gameFramework.Interface.a.h
    public void a(y yVar, Rect rect) {
        b(yVar, rect);
        if (this.q != null) {
        }
    }

    public void b(y yVar, Rect rect) {
        a(yVar, this.p, this.o, rect);
    }

    private boolean c() {
        return true;
    }

    private void a(y yVar, com.corrodinggames.rts.gameFramework.unitAction.e eVar, Paint paint, Rect rect) {
        int i2 = rect.a;
        int i3 = rect.b;
        int b = rect.b();
        int c = rect.c();
        int i4 = this.a;
        int i5 = this.b;
        if (!this.e) {
            if (i4 > b / 2) {
                i4 = b / 2;
            }
            if (i5 > c / 2) {
                i5 = c / 2;
            }
        } else {
            float f = 1.0f;
            int i6 = b / 2;
            int i7 = c / 2;
            if (i4 * 1.0f > i6) {
                f = i6 / i4;
            }
            if (i5 * f > i7) {
                f = i7 / i5;
            }
            i4 = (int) (this.a * f);
            i5 = (int) (this.b * f);
        }
        int i8 = b - (2 * i4);
        int i9 = c - (2 * i5);
        float f2 = this.c;
        float f3 = this.d;
        if (c()) {
            a(yVar, eVar, paint, i2 + i4, i3 + 0, i8, i5, f2, 0.0f, 1.0f - f2, f3, this.f);
            a(yVar, eVar, paint, i2 + 0, i3 + i5, i4, i9, 0.0f, f3, f2, 1.0f - f3, this.f);
            a(yVar, eVar, paint, i2 + i4, (i3 + c) - i5, i8, i5, f2, 1.0f - f3, 1.0f - f2, 1.0f, this.f);
            a(yVar, eVar, paint, (i2 + b) - i4, i3 + i5, i4, i9, 1.0f - f2, f3, 1.0f, 1.0f - f3, this.f);
            a(yVar, eVar, paint, i2 + 0, i3 + 0, i4, i5, 0.0f, 0.0f, this.c, this.d);
            a(yVar, eVar, paint, (i2 + b) - i4, i3 + 0, i4, i5, 1.0f - this.c, 0.0f, 1.0f, this.d);
            a(yVar, eVar, paint, i2 + 0, (i3 + c) - i5, i4, i5, 0.0f, 1.0f - this.d, this.c, 1.0f);
            a(yVar, eVar, paint, (i2 + b) - i4, (i3 + c) - i5, i4, i5, 1.0f - this.c, 1.0f - this.d, 1.0f, 1.0f);
        }
        a(yVar, eVar, paint, i2 + i4, i3 + i5, i8, i9, f2, f3, 1.0f - f2, 1.0f - f3, this.f);
    }

    public void a(y yVar, com.corrodinggames.rts.gameFramework.unitAction.e eVar, Paint paint, int i2, int i3, int i4, int i5, float f, float f2, float f3, float f4) {
        a(yVar, eVar, paint, i2, i3, i4, i5, f, f2, f3, f4, false);
    }

    public void a(y yVar, com.corrodinggames.rts.gameFramework.unitAction.e eVar, Paint paint, int i2, int i3, int i4, int i5, float f, float f2, float f3, float f4, boolean z) {
        Rect rect = h;
        Rect rect2 = i;
        rect.a((int) (f * eVar.p), (int) (f2 * eVar.q), (int) (f3 * eVar.p), (int) (f4 * eVar.q));
        rect2.a(i2, i3, i2 + i4, i3 + i5);
        if (!z) {
            yVar.a(eVar, rect, rect2, paint);
        } else {
            aa.a(yVar, eVar, rect, rect2, paint, 0, 0, 0, 0, this.g);
        }
    }
}