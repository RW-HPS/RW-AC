package com.corrodinggames.rts.gameFramework.p031b;

import android.opengl.GLES20;
import java.nio.FloatBuffer;
import java.nio.ShortBuffer;

/* renamed from: com.corrodinggames.rts.gameFramework.b.al */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/b/al.class */
public class C0698al {

    /* renamed from: a */
    public final FloatBuffer f4406a;

    /* renamed from: b */
    public final ShortBuffer f4407b;

    /* renamed from: c */
    public int f4408c;

    /* renamed from: d */
    int[] f4409d;

    /* renamed from: e */
    int f4410e;

    /* renamed from: f */
    final /* synthetic */ C0696aj f4411f;

    /* renamed from: a */
    public void m2650a(float[] fArr, int i, int i2) {
        this.f4406a.clear();
        int i3 = i + i2;
        this.f4406a.put(fArr, 0, i2);
        this.f4406a.flip();
        this.f4408c = i2;
    }

    /* renamed from: a */
    public void m2652a() {
        GLES20.glEnableVertexAttribArray(this.f4411f.f4390h.f4403a.f4498a);
        GLES20.glEnableVertexAttribArray(this.f4411f.f4390h.f4404b.f4498a);
    }

    /* renamed from: b */
    public void m2649b() {
        C0712n.m2539q();
        if (this.f4409d == null) {
            this.f4409d = new int[1];
            GLES20.glGenBuffers(1, this.f4409d, 0);
            C0712n.m2538r();
        }
        this.f4410e++;
        if (this.f4410e >= 1) {
            this.f4410e = 0;
        }
        GLES20.glBindBuffer(34962, this.f4409d[this.f4410e]);
        GLES20.glBufferData(34962, this.f4408c * 4, this.f4406a, 35040);
        GLES20.glVertexAttribPointer(this.f4411f.f4390h.f4403a.f4498a, 2, 5126, false, 32, 0);
        C0712n.m2539q();
        C0712n.m2539q();
        GLES20.glVertexAttribPointer(this.f4411f.f4390h.f4404b.f4498a, 4, 5126, false, 32, 16);
        C0712n.m2539q();
    }

    /* renamed from: a */
    public void m2651a(int i, int i2, int i3) {
        if (this.f4407b != null) {
            this.f4407b.position(i2);
            GLES20.glDrawElements(i, i3, 5123, this.f4407b);
            return;
        }
        GLES20.glDrawArrays(i, i2, i3);
    }

    /* renamed from: c */
    public void m2648c() {
        GLES20.glBindBuffer(34962, 0);
    }

    /* renamed from: d */
    public void m2647d() {
        m2652a();
    }

    /* renamed from: e */
    public void m2646e() {
        GLES20.glDisableVertexAttribArray(this.f4411f.f4390h.f4404b.f4498a);
    }
}