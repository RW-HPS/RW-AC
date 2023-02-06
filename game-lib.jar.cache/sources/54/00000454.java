package com.corrodinggames.rts.gameFramework.b;

import android.opengl.GLES20;
import java.nio.FloatBuffer;
import java.nio.ShortBuffer;

/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/b/aa.class */
public class aa {
    public final FloatBuffer a;
    public final ShortBuffer b;
    public int c;
    public int d;
    int[] e;
    int f;
    final /* synthetic */ y g;

    public void a(float[] fArr, int i, int i2) {
        this.a.clear();
        int i3 = i + i2;
        this.a.put(fArr, 0, i2);
        this.a.flip();
        this.d = i2;
    }

    public void a() {
        GLES20.glEnableVertexAttribArray(this.g.j.a.a);
        GLES20.glEnableVertexAttribArray(this.g.j.b.a);
        GLES20.glEnableVertexAttribArray(this.g.j.c.a);
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
        GLES20.glBufferData(34962, this.d * 4, this.a, 35040);
        GLES20.glVertexAttribPointer(this.g.j.a.a, 2, 5126, false, 32, 0);
        n.q();
        GLES20.glVertexAttribPointer(this.g.j.b.a, 2, 5126, false, 32, 8);
        n.q();
        GLES20.glVertexAttribPointer(this.g.j.c.a, 4, 5126, false, 32, 16);
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
        GLES20.glDisableVertexAttribArray(this.g.j.b.a);
        GLES20.glDisableVertexAttribArray(this.g.j.c.a);
        GLES20.glBindBuffer(34963, 0);
    }
}