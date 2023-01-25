package com.corrodinggames.rts.gameFramework.p031b;

import android.opengl.GLES20;
import java.nio.FloatBuffer;
import java.nio.ShortBuffer;

/* renamed from: com.corrodinggames.rts.gameFramework.b.aa */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/b/aa.class */
public class C0686aa {

    /* renamed from: a */
    public final FloatBuffer f4344a;

    /* renamed from: b */
    public final ShortBuffer f4345b;

    /* renamed from: c */
    public int f4346c;

    /* renamed from: d */
    public int f4347d;

    /* renamed from: e */
    int[] f4348e;

    /* renamed from: f */
    int f4349f;

    /* renamed from: g */
    final /* synthetic */ C0723y f4350g;

    /* renamed from: a */
    public void m2679a(float[] fArr, int i, int i2) {
        this.f4344a.clear();
        int i3 = i + i2;
        this.f4344a.put(fArr, 0, i2);
        this.f4344a.flip();
        this.f4347d = i2;
    }

    /* renamed from: a */
    public void m2681a() {
        GLES20.glEnableVertexAttribArray(this.f4350g.f4520j.f4529a.f4498a);
        GLES20.glEnableVertexAttribArray(this.f4350g.f4520j.f4530b.f4498a);
        GLES20.glEnableVertexAttribArray(this.f4350g.f4520j.f4531c.f4498a);
    }

    /* renamed from: b */
    public void m2678b() {
        C0712n.m2539q();
        if (this.f4348e == null) {
            this.f4348e = new int[1];
            GLES20.glGenBuffers(1, this.f4348e, 0);
            C0712n.m2538r();
        }
        this.f4349f++;
        if (this.f4349f >= 1) {
            this.f4349f = 0;
        }
        GLES20.glBindBuffer(34962, this.f4348e[this.f4349f]);
        GLES20.glBufferData(34962, this.f4347d * 4, this.f4344a, 35040);
        GLES20.glVertexAttribPointer(this.f4350g.f4520j.f4529a.f4498a, 2, 5126, false, 32, 0);
        C0712n.m2539q();
        GLES20.glVertexAttribPointer(this.f4350g.f4520j.f4530b.f4498a, 2, 5126, false, 32, 8);
        C0712n.m2539q();
        GLES20.glVertexAttribPointer(this.f4350g.f4520j.f4531c.f4498a, 4, 5126, false, 32, 16);
        C0712n.m2539q();
    }

    /* renamed from: a */
    public void m2680a(int i, int i2, int i3) {
        if (this.f4345b != null) {
            GLES20.glDrawElements(i, i3, 5123, 0);
        } else {
            GLES20.glDrawArrays(i, i2, i3);
        }
    }

    /* renamed from: c */
    public void m2677c() {
        GLES20.glBindBuffer(34962, 0);
    }

    /* renamed from: d */
    public void m2676d() {
        GLES20.glBindBuffer(34963, this.f4346c);
        m2681a();
    }

    /* renamed from: e */
    public void m2675e() {
        GLES20.glDisableVertexAttribArray(this.f4350g.f4520j.f4530b.f4498a);
        GLES20.glDisableVertexAttribArray(this.f4350g.f4520j.f4531c.f4498a);
        GLES20.glBindBuffer(34963, 0);
    }
}