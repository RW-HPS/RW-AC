package com.corrodinggames.rts.gameFramework.unitAction;

import android.graphics.Paint;
import android.graphics.Typeface;
import com.corrodinggames.rts.gameFramework.GameEngine;

/* renamed from: com.corrodinggames.rts.gameFramework.m.ag */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/m/ag.class */
public class ag extends Paint {
    public static final ag r = new ag();
    ae t;
    boolean s = false;
    boolean u = false;

    static {
        r.b(-1);
        r.o();
    }

    public void o() {
        this.u = true;
    }

    public void c(float f) {
        super.b(f);
    }

    @Override // android.graphics.Paint
    public void b(float f) {
        if (this.u) {
            GameEngine.print("UniquePaint changed when locked down:");
            GameEngine.print("from:" + k() + " to: " + f);
            GameEngine.T();
        }
        super.b(f);
    }

    @Override // android.graphics.Paint
    public Typeface a(Typeface typeface) {
        if (this.u) {
            GameEngine.print("UniquePaint changed when locked down:");
            GameEngine.T();
        }
        return super.a(typeface);
    }

    public static void b(Paint paint) {
        ((ag) paint).o();
    }

    public boolean p() {
        return this.s;
    }

    @Override // android.graphics.Paint
    public void a(boolean z) {
        this.s = z;
        super.a(z);
    }

    public ae q() {
        return this.t;
    }

    public void a(ae aeVar) {
        this.t = aeVar;
    }
}