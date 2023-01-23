package com.corrodinggames.rts.gameFramework.b;

import android.graphics.Bitmap;
import android.opengl.GLES20;
import android.opengl.GLUtils;
import com.corrodinggames.rts.gameFramework.GameEngine;
import java.util.HashMap;

/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/b/ah.class */
public abstract class ah extends b {
    private static HashMap l = new HashMap();
    private static ai o = new ai();
    private boolean p;
    private boolean q;
    private boolean r;
    private boolean s;
    private boolean t;
    private static int u;
    protected Bitmap m;
    private int v;
    int n;

    protected abstract Bitmap k();

    protected abstract void a(Bitmap bitmap);

    protected ah() {
        this(false);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public ah(boolean z) {
        super(null, 0, 0);
        this.p = true;
        this.q = false;
        this.r = false;
        this.s = false;
        this.t = false;
        this.n = 9729;
        if (z) {
            a(true);
            this.v = 1;
        }
    }

    private static Bitmap a(boolean z, Bitmap.Config config, int i) {
        Bitmap a2;
        ai aiVar = o;
        aiVar.f427a = z;
        aiVar.b = config;
        aiVar.c = i;
        Bitmap bitmap = (Bitmap) l.get(aiVar);
        if (bitmap == null) {
            if (z) {
                a2 = Bitmap.a(1, i, config);
            } else {
                a2 = Bitmap.a(i, 1, config);
            }
            bitmap = a2;
            l.put(aiVar.clone(), bitmap);
        }
        return bitmap;
    }

    private Bitmap n() {
        if (this.m == null) {
            this.m = k();
            int b = this.m.b() + (this.v * 2);
            int c = this.m.c() + (this.v * 2);
            if (this.c == -1) {
                a(b, c);
            }
        }
        return this.m;
    }

    private void o() {
        a(this.m);
        this.m = null;
    }

    @Override // com.corrodinggames.rts.gameFramework.b.b
    public int b() {
        if (this.c == -1) {
            n();
        }
        return this.c;
    }

    @Override // com.corrodinggames.rts.gameFramework.b.b
    public int c() {
        if (this.c == -1) {
            n();
        }
        return this.d;
    }

    public void l() {
        if (this.m != null) {
            o();
        }
        this.p = false;
    }

    public boolean m() {
        return i() && this.p;
    }

    public void d(k kVar) {
        int i;
        if (!i()) {
            if (this.t) {
                int i2 = u + 1;
                u = i2;
                if (i2 > 100) {
                    return;
                }
            }
            e(kVar);
        } else if (!this.p) {
            Bitmap n = n();
            int internalFormat = GLUtils.getInternalFormat(n);
            try {
                i = GLUtils.getType(n);
            } catch (IllegalArgumentException e) {
                GameEngine.a("updateContent: GLUtils.getType failed, defaulting to GL_UNSIGNED_BYTE", (Throwable) e);
                i = 5121;
            }
            kVar.a(this, this.v, this.v, n, internalFormat, i);
            o();
            this.p = true;
        }
    }

    @Override // com.corrodinggames.rts.gameFramework.b.b
    public void b(int i) {
        if (this.n != i) {
            if (this.p) {
                int g = g();
                GLES20.glTexParameterf(g, 10241, i);
                GLES20.glTexParameterf(g, 10240, i);
            }
            this.n = i;
        }
    }

    @Override // com.corrodinggames.rts.gameFramework.b.b
    public int h() {
        return this.n;
    }

    private void e(k kVar) {
        int i;
        Bitmap n = n();
        if (n != null) {
            try {
                int b = n.b();
                int c = n.c();
                int i2 = b + (this.v * 2);
                int i3 = c + (this.v * 2);
                int d = d();
                int e = e();
                this.f431a = kVar.a().a();
                this.p = true;
                kVar.d(this);
                if (b == d && c == e) {
                    kVar.a(this, n, 0);
                    n.q();
                } else {
                    int internalFormat = GLUtils.getInternalFormat(n);
                    try {
                        i = GLUtils.getType(n);
                    } catch (IllegalArgumentException e2) {
                        GameEngine.a("uploadToCanvas: GLUtils.getType failed, defaulting to GL_UNSIGNED_BYTE", (Throwable) e2);
                        i = 5121;
                    }
                    Bitmap.Config d2 = n.d();
                    kVar.a(this, internalFormat, i, internalFormat);
                    n.q();
                    kVar.a(this, this.v, this.v, n, internalFormat, i);
                    n.q();
                    if (this.v > 0) {
                        kVar.a(this, 0, 0, a(true, d2, e), internalFormat, i);
                        kVar.a(this, 0, 0, a(false, d2, d), internalFormat, i);
                    }
                    if (this.v > 0) {
                        if (this.v + b < d) {
                            kVar.a(this, this.v + b, 0, a(true, d2, e), internalFormat, i);
                        }
                        if (this.v + c < e) {
                            kVar.a(this, 0, this.v + c, a(false, d2, d), internalFormat, i);
                        }
                    }
                }
                a(kVar);
                this.b = 1;
                this.p = true;
                return;
            } finally {
                o();
            }
        }
        this.b = -1;
        throw new RuntimeException("Texture load fail, no bitmap");
    }

    @Override // com.corrodinggames.rts.gameFramework.b.b
    public boolean c(k kVar) {
        d(kVar);
        this.i++;
        return m();
    }

    @Override // com.corrodinggames.rts.gameFramework.b.b
    public void b(k kVar) {
        this.f431a = kVar.a().a();
        if (3553 == 3553) {
            kVar.a(this, 6408, 5121, 6408);
        }
        kVar.d(this);
        this.b = 1;
        a(kVar);
    }

    @Override // com.corrodinggames.rts.gameFramework.b.b
    public int g() {
        return 3553;
    }

    @Override // com.corrodinggames.rts.gameFramework.b.b
    public void j() {
        super.j();
        if (this.m != null) {
            o();
        }
    }
}