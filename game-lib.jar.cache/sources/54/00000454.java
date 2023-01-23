package com.corrodinggames.rts.gameFramework.b;

import android.opengl.GLES20;
import java.nio.FloatBuffer;
import java.nio.ShortBuffer;

/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/b/aa.class */
public class aa {

    /* renamed from: a  reason: collision with root package name */
    public final FloatBuffer f425a;
    public final ShortBuffer b;
    public int c;
    public int d;
    int[] e;
    int f;
    final /* synthetic */ y g;

    public void a(float[] fArr, int i, int i2) {
        this.f425a.clear();
        int i3 = i + i2;
        this.f425a.put(fArr, 0, i2);
        this.f425a.flip();
        this.d = i2;
    }

    public void a() {
        GLES20.glEnableVertexAttribArray(this.g.j.f444a.f438a);
        GLES20.glEnableVertexAttribArray(this.g.j.b.f438a);
        GLES20.glEnableVertexAttribArray(this.g.j.c.f438a);
    }

    public void b() {
        n.q();
        if (this.e == null) {
            this.e = new int[1];
            GLES20.glGenBuffers(1, this.e, 0);
            n.r();
        }
        this.f++;
        if (this.f >= 1) {
            this.f = 0;
        }
        GLES20.glBindBuffer(34962, this.e[this.f]);
        GLES20.glBufferData(34962, this.d * 4, this.f425a, 35040);
        GLES20.glVertexAttribPointer(this.g.j.f444a.f438a, 2, 5126, false, 32, 0);
        n.q();
        GLES20.glVertexAttribPointer(this.g.j.b.f438a, 2, 5126, false, 32, 8);
        n.q();
        GLES20.glVertexAttribPointer(this.g.j.c.f438a, 4, 5126, false, 32, 16);
        n.q();
    }

    public void a(int i, int i2, int i3) {
        if (this.b != null) {
            GLES20.glDrawElements(i, i3, 5123, 0);
        } else {
            GLES20.glDrawArrays(i, i2, i3);
        }
    }

    public void c() {
        GLES20.glBindBuffer(34962, 0);
    }

    public void d() {
        GLES20.glBindBuffer(34963, this.c);
        a();
    }

    public void e() {
        GLES20.glDisableVertexAttribArray(this.g.j.b.f438a);
        GLES20.glDisableVertexAttribArray(this.g.j.c.f438a);
        GLES20.glBindBuffer(34963, 0);
    }
}