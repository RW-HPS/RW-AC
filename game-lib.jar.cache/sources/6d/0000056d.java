package com.corrodinggames.rts.gameFramework.unitAction;

import android.graphics.Rect;
import android.graphics.RectF;
import javax.microedition.khronos.opengles.GL10;

/* renamed from: com.corrodinggames.rts.gameFramework.m.b */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/m/b.class */
public class C0967b {

    /* renamed from: a */
    EnumC0969d f6594a;

    /* renamed from: b */
    C0970e f6595b;

    /* renamed from: c */
    float f6596c;

    /* renamed from: d */
    float f6597d;

    /* renamed from: e */
    Rect f6598e;

    /* renamed from: f */
    RectF f6599f;

    /* renamed from: g */
    final /* synthetic */ C0959a f6600g;

    /* renamed from: a */
    void m907a(GL10 gl10) {
        if (this.f6600g.f6523i != this.f6595b.f6614h.intValue()) {
            gl10.glBindTexture(3553, this.f6595b.f6614h.intValue());
            this.f6600g.f6523i = this.f6595b.f6614h.intValue();
        }
        gl10.glPushMatrix();
        gl10.glLoadIdentity();
        if (this.f6594a == EnumC0969d.Rect) {
            gl10.glTranslatef(this.f6599f.f234a, (this.f6600g.f6517c - this.f6599f.f235b) - this.f6598e.m5166c(), 0.0f);
            C0962ac c0962ac = this.f6600g.f6522h;
            float mo387m = this.f6598e.f230a / this.f6595b.mo387m();
            float mo387m2 = this.f6598e.f232c / this.f6595b.mo387m();
            float mo388l = this.f6598e.f231b / this.f6595b.mo388l();
            float mo388l2 = this.f6598e.f233d / this.f6595b.mo388l();
            if (this.f6600g.f6524j == this.f6598e.m5166c() && this.f6600g.f6525k == this.f6598e.m5170b()) {
                c0962ac.m938a(0, 0, mo387m, mo388l2);
                c0962ac.m938a(1, 0, mo387m2, mo388l2);
                c0962ac.m938a(0, 1, mo387m, mo388l);
                c0962ac.m938a(1, 1, mo387m2, mo388l);
            } else {
                this.f6600g.f6524j = this.f6598e.m5166c();
                this.f6600g.f6525k = this.f6598e.m5170b();
                c0962ac.m937a(0, 0, 0.0f, 0.0f, 0.0f, mo387m, mo388l2, null);
                c0962ac.m937a(1, 0, this.f6598e.m5170b(), 0.0f, 0.0f, mo387m2, mo388l2, null);
                c0962ac.m937a(0, 1, 0.0f, this.f6598e.m5166c(), 0.0f, mo387m, mo388l, null);
                c0962ac.m937a(1, 1, this.f6598e.m5170b(), this.f6598e.m5166c(), 0.0f, mo387m2, mo388l, null);
            }
            c0962ac.m934b(gl10, true, false);
            gl10.glPopMatrix();
            return;
        }
        gl10.glTranslatef(this.f6596c, (this.f6600g.f6517c - this.f6597d) - this.f6595b.mo388l(), 0.0f);
        throw new RuntimeException("Not supported");
    }
}