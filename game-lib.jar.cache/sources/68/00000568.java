package com.corrodinggames.rts.gameFramework.unitAction;

import java.nio.Buffer;
import java.nio.CharBuffer;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import javax.microedition.khronos.opengles.GL10;
import javax.microedition.khronos.opengles.GL11;

/* renamed from: com.corrodinggames.rts.gameFramework.m.ac */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/m/ac.class */
class C0962ac {

    /* renamed from: b */
    private FloatBuffer f6545b;

    /* renamed from: c */
    private FloatBuffer f6546c;

    /* renamed from: d */
    private FloatBuffer f6547d;

    /* renamed from: e */
    private IntBuffer f6548e;

    /* renamed from: f */
    private IntBuffer f6549f;

    /* renamed from: g */
    private IntBuffer f6550g;

    /* renamed from: h */
    private CharBuffer f6551h;

    /* renamed from: i */
    private Buffer f6552i;

    /* renamed from: j */
    private Buffer f6553j;

    /* renamed from: k */
    private Buffer f6554k;

    /* renamed from: l */
    private int f6555l;

    /* renamed from: m */
    private int f6556m;

    /* renamed from: n */
    private int f6557n;

    /* renamed from: o */
    private int f6558o;

    /* renamed from: p */
    private boolean f6559p;

    /* renamed from: q */
    private int f6560q;

    /* renamed from: r */
    private int f6561r;

    /* renamed from: s */
    private int f6562s;

    /* renamed from: t */
    private int f6563t;

    /* renamed from: a */
    static final /* synthetic */ boolean f6564a;

    static {
        f6564a = !C0962ac.class.desiredAssertionStatus();
    }

    /* renamed from: a */
    void m938a(int i, int i2, float f, float f2) {
        if (i < 0 || i >= this.f6556m) {
            throw new IllegalArgumentException("i");
        }
        if (i2 < 0 || i2 >= this.f6557n) {
            throw new IllegalArgumentException("j");
        }
        int i3 = ((this.f6556m * i2) + i) * 2;
        if (this.f6555l == 5126) {
            this.f6546c.put(i3, f);
            this.f6546c.put(i3 + 1, f2);
            return;
        }
        this.f6549f.put(i3, (int) (f * 65536.0f));
        this.f6549f.put(i3 + 1, (int) (f2 * 65536.0f));
    }

    /* renamed from: a */
    void m937a(int i, int i2, float f, float f2, float f3, float f4, float f5, float[] fArr) {
        if (i < 0 || i >= this.f6556m) {
            throw new IllegalArgumentException("i");
        }
        if (i2 < 0 || i2 >= this.f6557n) {
            throw new IllegalArgumentException("j");
        }
        int i3 = (this.f6556m * i2) + i;
        int i4 = i3 * 3;
        int i5 = i3 * 2;
        int i6 = i3 * 4;
        if (this.f6555l == 5126) {
            this.f6545b.put(i4, f);
            this.f6545b.put(i4 + 1, f2);
            this.f6545b.put(i4 + 2, f3);
            this.f6546c.put(i5, f4);
            this.f6546c.put(i5 + 1, f5);
            if (fArr != null) {
                this.f6547d.put(i6, fArr[0]);
                this.f6547d.put(i6 + 1, fArr[1]);
                this.f6547d.put(i6 + 2, fArr[2]);
                this.f6547d.put(i6 + 3, fArr[3]);
                return;
            }
            return;
        }
        this.f6548e.put(i4, (int) (f * 65536.0f));
        this.f6548e.put(i4 + 1, (int) (f2 * 65536.0f));
        this.f6548e.put(i4 + 2, (int) (f3 * 65536.0f));
        this.f6549f.put(i5, (int) (f4 * 65536.0f));
        this.f6549f.put(i5 + 1, (int) (f5 * 65536.0f));
        if (fArr != null) {
            this.f6550g.put(i6, (int) (fArr[0] * 65536.0f));
            this.f6550g.put(i6 + 1, (int) (fArr[1] * 65536.0f));
            this.f6550g.put(i6 + 2, (int) (fArr[2] * 65536.0f));
            this.f6550g.put(i6 + 3, (int) (fArr[3] * 65536.0f));
        }
    }

    /* renamed from: a */
    public static void m935a(GL10 gl10, boolean z, boolean z2) {
        gl10.glEnableClientState(32884);
        if (z) {
            gl10.glEnableClientState(32888);
            gl10.glEnable(3553);
        } else {
            gl10.glDisableClientState(32888);
            gl10.glDisable(3553);
        }
        if (z2) {
            gl10.glEnableClientState(32886);
        } else {
            gl10.glDisableClientState(32886);
        }
    }

    /* renamed from: b */
    public void m934b(GL10 gl10, boolean z, boolean z2) {
        if (!this.f6559p) {
            gl10.glVertexPointer(3, this.f6555l, 0, this.f6552i);
            if (z) {
                gl10.glTexCoordPointer(2, this.f6555l, 0, this.f6553j);
            }
            if (z2) {
                gl10.glColorPointer(4, this.f6555l, 0, this.f6554k);
            }
            gl10.glDrawElements(4, this.f6558o, 5123, this.f6551h);
            return;
        }
        GL11 gl11 = (GL11) gl10;
        gl11.glBindBuffer(34962, this.f6560q);
        gl11.glVertexPointer(3, this.f6555l, 0, 0);
        if (z) {
            gl11.glBindBuffer(34962, this.f6562s);
            gl11.glTexCoordPointer(2, this.f6555l, 0, 0);
        }
        if (z2) {
            gl11.glBindBuffer(34962, this.f6563t);
            gl11.glColorPointer(4, this.f6555l, 0, 0);
        }
        gl11.glBindBuffer(34963, this.f6561r);
        gl11.glDrawElements(4, this.f6558o, 5123, 0);
        gl11.glBindBuffer(34962, 0);
        gl11.glBindBuffer(34963, 0);
    }

    /* renamed from: a */
    public static void m936a(GL10 gl10) {
        gl10.glDisableClientState(32884);
    }
}