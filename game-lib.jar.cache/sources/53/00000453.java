package com.corrodinggames.rts.gameFramework.p031b.p032a;

import android.opengl.GLES20;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.IntBuffer;
import java.nio.ShortBuffer;

/* renamed from: com.corrodinggames.rts.gameFramework.b.a.g */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/b/a/g.class */
public class C0685g {

    /* renamed from: a */
    public final int f4334a = 2;

    /* renamed from: b */
    public final int f4335b = this.f4334a + 2;

    /* renamed from: c */
    public final int f4336c = this.f4335b * 4;

    /* renamed from: d */
    public final IntBuffer f4337d;

    /* renamed from: e */
    public final ShortBuffer f4338e;

    /* renamed from: f */
    public int f4339f;

    /* renamed from: g */
    public int f4340g;

    /* renamed from: h */
    final int[] f4341h;

    /* renamed from: i */
    private int f4342i;

    /* renamed from: j */
    private int f4343j;

    public C0685g(int i, int i2) {
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(i * this.f4336c);
        allocateDirect.order(ByteOrder.nativeOrder());
        this.f4337d = allocateDirect.asIntBuffer();
        if (i2 > 0) {
            ByteBuffer allocateDirect2 = ByteBuffer.allocateDirect(i2 * 2);
            allocateDirect2.order(ByteOrder.nativeOrder());
            this.f4338e = allocateDirect2.asShortBuffer();
        } else {
            this.f4338e = null;
        }
        this.f4339f = 0;
        this.f4340g = 0;
        this.f4341h = new int[(i * this.f4336c) / 4];
        this.f4342i = EnumC0677a.A_TexCoordinate.m2722a();
        this.f4343j = EnumC0677a.A_Position.m2722a();
    }

    /* renamed from: a */
    public void m2684a(float[] fArr, int i, int i2) {
        this.f4337d.clear();
        int i3 = i + i2;
        int i4 = i;
        int i5 = 0;
        while (i4 < i3) {
            this.f4341h[i5] = Float.floatToRawIntBits(fArr[i4]);
            i4++;
            i5++;
        }
        this.f4337d.put(this.f4341h, 0, i2);
        this.f4337d.flip();
        this.f4339f = i2 / this.f4335b;
    }

    /* renamed from: a */
    public void m2683a(short[] sArr, int i, int i2) {
        this.f4338e.clear();
        this.f4338e.put(sArr, i, i2);
        this.f4338e.flip();
        this.f4340g = i2;
    }

    /* renamed from: a */
    public void m2686a() {
        this.f4337d.position(0);
        GLES20.glVertexAttribPointer(this.f4343j, this.f4334a, 5126, false, this.f4336c, (Buffer) this.f4337d);
        GLES20.glEnableVertexAttribArray(this.f4343j);
        this.f4337d.position(this.f4334a);
        GLES20.glVertexAttribPointer(this.f4342i, 2, 5126, false, this.f4336c, (Buffer) this.f4337d);
        GLES20.glEnableVertexAttribArray(this.f4342i);
    }

    /* renamed from: a */
    public void m2685a(int i, int i2, int i3) {
        if (this.f4338e != null) {
            this.f4338e.position(i2);
            GLES20.glDrawElements(i, i3, 5123, this.f4338e);
            return;
        }
        GLES20.glDrawArrays(i, i2, i3);
    }

    /* renamed from: b */
    public void m2682b() {
        GLES20.glDisableVertexAttribArray(this.f4342i);
    }
}