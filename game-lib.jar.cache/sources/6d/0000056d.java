package com.corrodinggames.rts.gameFramework.unitAction;

import android.graphics.Rect;
import android.graphics.RectF;
import javax.microedition.khronos.opengles.GL10;

/* renamed from: com.corrodinggames.rts.gameFramework.m.b */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/m/b.class */
public class b {
    d a;
    e b;
    float c;
    float d;
    Rect e;
    RectF f;
    final /* synthetic */ a g;

    void a(GL10 gl10) {
        if (this.g.i != this.b.h.intValue()) {
            gl10.glBindTexture(3553, this.b.h.intValue());
            this.g.i = this.b.h.intValue();
        }
        gl10.glPushMatrix();
        gl10.glLoadIdentity();
        if (this.a == d.Rect) {
            gl10.glTranslatef(this.f.a, (this.g.c - this.f.b) - this.e.c(), 0.0f);
            ac acVar = this.g.h;
            float m = this.e.a / this.b.m();
            float m2 = this.e.c / this.b.m();
            float l = this.e.b / this.b.l();
            float l2 = this.e.d / this.b.l();
            if (this.g.j == this.e.c() && this.g.k == this.e.b()) {
                acVar.a(0, 0, m, l2);
                acVar.a(1, 0, m2, l2);
                acVar.a(0, 1, m, l);
                acVar.a(1, 1, m2, l);
            } else {
                this.g.j = this.e.c();
                this.g.k = this.e.b();
                acVar.a(0, 0, 0.0f, 0.0f, 0.0f, m, l2, null);
                acVar.a(1, 0, this.e.b(), 0.0f, 0.0f, m2, l2, null);
                acVar.a(0, 1, 0.0f, this.e.c(), 0.0f, m, l, null);
                acVar.a(1, 1, this.e.b(), this.e.c(), 0.0f, m2, l, null);
            }
            acVar.b(gl10, true, false);
            gl10.glPopMatrix();
            return;
        }
        gl10.glTranslatef(this.c, (this.g.c - this.d) - this.b.l(), 0.0f);
        throw new RuntimeException("Not supported");
    }
}