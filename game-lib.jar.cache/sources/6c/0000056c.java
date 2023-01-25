package com.corrodinggames.rts.gameFramework.unitAction;

import android.graphics.Paint;
import android.graphics.Typeface;
import com.corrodinggames.rts.gameFramework.GameEngine;

/* renamed from: com.corrodinggames.rts.gameFramework.m.ag */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/m/ag.class */
public class C0966ag extends Paint {

    /* renamed from: r */
    public static final C0966ag f6590r = new C0966ag();

    /* renamed from: t */
    C0964ae f6591t;

    /* renamed from: s */
    boolean f6592s = false;

    /* renamed from: u */
    boolean f6593u = false;

    static {
        f6590r.m5206b(-1);
        f6590r.m910o();
    }

    /* renamed from: o */
    public void m910o() {
        this.f6593u = true;
    }

    /* renamed from: c */
    public void m911c(float f) {
        super.mo913b(f);
    }

    @Override // android.graphics.Paint
    /* renamed from: b */
    public void mo913b(float f) {
        if (this.f6593u) {
            GameEngine.print("UniquePaint changed when locked down:");
            GameEngine.print("from:" + m5186k() + " to: " + f);
            GameEngine.m1089T();
        }
        super.mo913b(f);
    }

    @Override // android.graphics.Paint
    /* renamed from: a */
    public Typeface mo916a(Typeface typeface) {
        if (this.f6593u) {
            GameEngine.print("UniquePaint changed when locked down:");
            GameEngine.m1089T();
        }
        return super.mo916a(typeface);
    }

    /* renamed from: b */
    public static void m912b(Paint paint) {
        ((C0966ag) paint).m910o();
    }

    /* renamed from: p */
    public boolean m909p() {
        return this.f6592s;
    }

    @Override // android.graphics.Paint
    /* renamed from: a */
    public void mo914a(boolean z) {
        this.f6592s = z;
        super.mo914a(z);
    }

    /* renamed from: q */
    public C0964ae m908q() {
        return this.f6591t;
    }

    /* renamed from: a */
    public void m915a(C0964ae c0964ae) {
        this.f6591t = c0964ae;
    }
}