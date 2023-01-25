package com.corrodinggames.rts.gameFramework.p031b;

import android.graphics.Bitmap;
import android.opengl.GLES20;
import android.opengl.GLUtils;
import com.corrodinggames.rts.gameFramework.GameEngine;
import java.util.HashMap;

/* renamed from: com.corrodinggames.rts.gameFramework.b.ah */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/b/ah.class */
public abstract class AbstractC0693ah extends AbstractC0699b {

    /* renamed from: l */
    private static HashMap f4369l = new HashMap();

    /* renamed from: o */
    private static C0695ai f4370o = new C0695ai();

    /* renamed from: p */
    private boolean f4371p;

    /* renamed from: q */
    private boolean f4372q;

    /* renamed from: r */
    private boolean f4373r;

    /* renamed from: s */
    private boolean f4374s;

    /* renamed from: t */
    private boolean f4375t;

    /* renamed from: u */
    private static int f4376u;

    /* renamed from: m */
    protected Bitmap f4377m;

    /* renamed from: v */
    private int f4378v;

    /* renamed from: n */
    int f4379n;

    /* renamed from: k */
    protected abstract Bitmap mo2628k();

    /* renamed from: a */
    protected abstract void mo2629a(Bitmap bitmap);

    protected AbstractC0693ah() {
        this(false);
    }

    protected AbstractC0693ah(boolean z) {
        super(null, 0, 0);
        this.f4371p = true;
        this.f4372q = false;
        this.f4373r = false;
        this.f4374s = false;
        this.f4375t = false;
        this.f4379n = 9729;
        if (z) {
            m2639a(true);
            this.f4378v = 1;
        }
    }

    /* renamed from: a */
    private static Bitmap m2670a(boolean z, Bitmap.Config config, int i) {
        Bitmap m5284a;
        C0695ai c0695ai = f4370o;
        c0695ai.f4380a = z;
        c0695ai.f4381b = config;
        c0695ai.f4382c = i;
        Bitmap bitmap = (Bitmap) f4369l.get(c0695ai);
        if (bitmap == null) {
            if (z) {
                m5284a = Bitmap.m5284a(1, i, config);
            } else {
                m5284a = Bitmap.m5284a(i, 1, config);
            }
            bitmap = m5284a;
            f4369l.put(c0695ai.clone(), bitmap);
        }
        return bitmap;
    }

    /* renamed from: n */
    private Bitmap m2665n() {
        if (this.f4377m == null) {
            this.f4377m = mo2628k();
            int m5275b = this.f4377m.m5275b() + (this.f4378v * 2);
            int m5272c = this.f4377m.m5272c() + (this.f4378v * 2);
            if (this.f4414c == -1) {
                m2643a(m5275b, m5272c);
            }
        }
        return this.f4377m;
    }

    /* renamed from: o */
    private void m2664o() {
        mo2629a(this.f4377m);
        this.f4377m = null;
    }

    @Override // com.corrodinggames.rts.gameFramework.p031b.AbstractC0699b
    /* renamed from: b */
    public int mo2638b() {
        if (this.f4414c == -1) {
            m2665n();
        }
        return this.f4414c;
    }

    @Override // com.corrodinggames.rts.gameFramework.p031b.AbstractC0699b
    /* renamed from: c */
    public int mo2637c() {
        if (this.f4414c == -1) {
            m2665n();
        }
        return this.f4415d;
    }

    /* renamed from: l */
    public void m2667l() {
        if (this.f4377m != null) {
            m2664o();
        }
        this.f4371p = false;
    }

    /* renamed from: m */
    public boolean m2666m() {
        return m2633i() && this.f4371p;
    }

    /* renamed from: d */
    public void m2669d(InterfaceC0709k interfaceC0709k) {
        int i;
        if (!m2633i()) {
            if (this.f4375t) {
                int i2 = f4376u + 1;
                f4376u = i2;
                if (i2 > 100) {
                    return;
                }
            }
            m2668e(interfaceC0709k);
        } else if (!this.f4371p) {
            Bitmap m2665n = m2665n();
            int internalFormat = GLUtils.getInternalFormat(m2665n);
            try {
                i = GLUtils.getType(m2665n);
            } catch (IllegalArgumentException e) {
                GameEngine.m1061a("updateContent: GLUtils.getType failed, defaulting to GL_UNSIGNED_BYTE", (Throwable) e);
                i = 5121;
            }
            interfaceC0709k.mo2583a(this, this.f4378v, this.f4378v, m2665n, internalFormat, i);
            m2664o();
            this.f4371p = true;
        }
    }

    @Override // com.corrodinggames.rts.gameFramework.p031b.AbstractC0699b
    /* renamed from: b */
    public void mo2522b(int i) {
        if (this.f4379n != i) {
            if (this.f4371p) {
                int mo2519g = mo2519g();
                GLES20.glTexParameterf(mo2519g, 10241, i);
                GLES20.glTexParameterf(mo2519g, 10240, i);
            }
            this.f4379n = i;
        }
    }

    @Override // com.corrodinggames.rts.gameFramework.p031b.AbstractC0699b
    /* renamed from: h */
    public int mo2518h() {
        return this.f4379n;
    }

    /* renamed from: e */
    private void m2668e(InterfaceC0709k interfaceC0709k) {
        int i;
        Bitmap m2665n = m2665n();
        if (m2665n != null) {
            try {
                int m5275b = m2665n.m5275b();
                int m5272c = m2665n.m5272c();
                int i2 = m5275b + (this.f4378v * 2);
                int i3 = m5272c + (this.f4378v * 2);
                int d = m2636d();
                int e = m2635e();
                this.f4412a = interfaceC0709k.mo2604a().mo2530a();
                this.f4371p = true;
                interfaceC0709k.mo2553d(this);
                if (m5275b == d && m5272c == e) {
                    interfaceC0709k.mo2582a(this, m2665n, 0);
                    C0712n.m2539q();
                } else {
                    int internalFormat = GLUtils.getInternalFormat(m2665n);
                    try {
                        i = GLUtils.getType(m2665n);
                    } catch (IllegalArgumentException e2) {
                        GameEngine.m1061a("uploadToCanvas: GLUtils.getType failed, defaulting to GL_UNSIGNED_BYTE", (Throwable) e2);
                        i = 5121;
                    }
                    Bitmap.Config m5270d = m2665n.m5270d();
                    interfaceC0709k.mo2585a(this, internalFormat, i, internalFormat);
                    C0712n.m2539q();
                    interfaceC0709k.mo2583a(this, this.f4378v, this.f4378v, m2665n, internalFormat, i);
                    C0712n.m2539q();
                    if (this.f4378v > 0) {
                        interfaceC0709k.mo2583a(this, 0, 0, m2670a(true, m5270d, e), internalFormat, i);
                        interfaceC0709k.mo2583a(this, 0, 0, m2670a(false, m5270d, d), internalFormat, i);
                    }
                    if (this.f4378v > 0) {
                        if (this.f4378v + m5275b < d) {
                            interfaceC0709k.mo2583a(this, this.f4378v + m5275b, 0, m2670a(true, m5270d, e), internalFormat, i);
                        }
                        if (this.f4378v + m5272c < e) {
                            interfaceC0709k.mo2583a(this, 0, this.f4378v + m5272c, m2670a(false, m5270d, d), internalFormat, i);
                        }
                    }
                }
                m2640a(interfaceC0709k);
                this.f4413b = 1;
                this.f4371p = true;
                return;
            } finally {
                m2664o();
            }
        }
        this.f4413b = -1;
        throw new RuntimeException("Texture load fail, no bitmap");
    }

    @Override // com.corrodinggames.rts.gameFramework.p031b.AbstractC0699b
    /* renamed from: c */
    public boolean mo2520c(InterfaceC0709k interfaceC0709k) {
        m2669d(interfaceC0709k);
        this.f4422i++;
        return m2666m();
    }

    @Override // com.corrodinggames.rts.gameFramework.p031b.AbstractC0699b
    /* renamed from: b */
    public void mo2521b(InterfaceC0709k interfaceC0709k) {
        this.f4412a = interfaceC0709k.mo2604a().mo2530a();
        if (3553 == 3553) {
            interfaceC0709k.mo2585a(this, 6408, 5121, 6408);
        }
        interfaceC0709k.mo2553d(this);
        this.f4413b = 1;
        m2640a(interfaceC0709k);
    }

    @Override // com.corrodinggames.rts.gameFramework.p031b.AbstractC0699b
    /* renamed from: g */
    public int mo2519g() {
        return 3553;
    }

    @Override // com.corrodinggames.rts.gameFramework.p031b.AbstractC0699b
    /* renamed from: j */
    public void mo2632j() {
        super.mo2632j();
        if (this.f4377m != null) {
            m2664o();
        }
    }
}