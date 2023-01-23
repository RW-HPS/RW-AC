package com.corrodinggames.rts.gameFramework.b;

import android.opengl.GLES20;
import java.nio.FloatBuffer;
import java.nio.ShortBuffer;

/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/b/al.class */
public class al {

    /* renamed from: a  reason: collision with root package name */
    public final FloatBuffer f430a;
    public final ShortBuffer b;
    public int c;
    int[] d;
    int e;
    final /* synthetic */ aj f;

    public void a(float[] fArr, int i, int i2) {
        this.f430a.clear();
        int i3 = i + i2;
        this.f430a.put(fArr, 0, i2);
        this.f430a.flip();
        this.c = i2;
    }

    public void a() {
        GLES20.glEnableVertexAttribArray(this.f.h.f429a.f438a);
        GLES20.glEnableVertexAttribArray(this.f.h.b.f438a);
    }

    public void b() {
        n.q();
        if (this.d == null) {
            this.d = new int[1];
            GLES20.glGenBuffers(1, this.d, 0);
            n.r();
        }
        this.e++;
        if (this.e >= 1) {
            this.e = 0;
        }
        GLES20.glBindBuffer(34962, this.d[this.e]);
        GLES20.glBufferData(34962, this.c * 4, this.f430a, 35040);
        GLES20.glVertexAttribPointer(this.f.h.f429a.f438a, 2, 5126, false, 32, 0);
        n.q();
        n.q();
        GLES20.glVertexAttribPointer(this.f.h.b.f438a, 4, 5126, false, 32, 16);
        n.q();
    }

    public void a(int i, int i2, int i3) {
        if (this.b != null) {
            this.b.position(i2);
            GLES20.glDrawElements(i, i3, 5123, this.b);
            return;
        }
        GLES20.glDrawArrays(i, i2, i3);
    }

    public void c() {
        GLES20.glBindBuffer(34962, 0);
    }

    public void d() {
        a();
    }

    public void e() {
        GLES20.glDisableVertexAttribArray(this.f.h.b.f438a);
    }
}