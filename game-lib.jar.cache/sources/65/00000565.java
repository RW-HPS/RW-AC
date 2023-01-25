package com.corrodinggames.rts.gameFramework.unitAction;

import android.graphics.BitmapFactory;
import android.opengl.GLSurfaceView;
import android.util.Log;
import com.corrodinggames.rts.gameFramework.GameEngine;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;

/* renamed from: com.corrodinggames.rts.gameFramework.m.a */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/m/a.class */
public class C0959a implements GLSurfaceView.Renderer {

    /* renamed from: q */
    private static BitmapFactory.Options f6514q = new BitmapFactory.Options();

    /* renamed from: a */
    public boolean f6515a;

    /* renamed from: b */
    GL10 f6516b;

    /* renamed from: c */
    float f6517c;

    /* renamed from: d */
    float f6518d;

    /* renamed from: e */
    int f6519e;

    /* renamed from: f */
    int f6520f;

    /* renamed from: g */
    C0968c[] f6521g;

    /* renamed from: h */
    C0962ac f6522h;

    /* renamed from: i */
    int f6523i;

    /* renamed from: j */
    int f6524j;

    /* renamed from: k */
    int f6525k;

    /* renamed from: l */
    int f6526l;

    /* renamed from: m */
    int f6527m;

    /* renamed from: n */
    int f6528n;

    /* renamed from: o */
    String f6529o;

    /* renamed from: p */
    long f6530p;

    @Override // android.opengl.GLSurfaceView.Renderer
    public void onDrawFrame(GL10 gl10) {
        if (this.f6519e == -1) {
            Log.m5069d("RustedWarfare", "---- render: no buffer is ready!");
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        this.f6530p = currentTimeMillis;
        this.f6526l += (int) (currentTimeMillis - this.f6530p);
        this.f6527m++;
        if (this.f6527m == 10) {
            this.f6528n = 10000 / this.f6526l;
            this.f6526l = 0;
            this.f6527m = 0;
            this.f6529o = this.f6528n + "fps";
            Log.m5069d("RustedWarfare", "render:" + this.f6529o + ", this renders has " + this.f6521g[this.f6519e].f6602b + " draws");
        }
        this.f6520f = this.f6519e;
        gl10.glClear(16640);
        gl10.glMatrixMode(5888);
        C0962ac.m935a(gl10, true, false);
        C0968c c0968c = this.f6521g[this.f6520f];
        this.f6523i = -1;
        this.f6524j = -1;
        this.f6525k = -1;
        for (int i = 0; i < c0968c.f6602b; i++) {
            c0968c.f6601a[i].m907a(gl10);
        }
        C0962ac.m936a(gl10);
        this.f6520f = -1;
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public void onSurfaceChanged(GL10 gl10, int i, int i2) {
        Log.m5069d("RustedWarfare", "2d gl onSurfaceChanged:" + i + "," + i2);
        this.f6516b = gl10;
        this.f6517c = i2;
        this.f6518d = i;
        gl10.glViewport(0, 0, i, i2);
        gl10.glMatrixMode(5889);
        gl10.glLoadIdentity();
        gl10.glOrthof(0.0f, i, 0.0f, i2, 0.0f, 1.0f);
        gl10.glShadeModel(7424);
        gl10.glEnable(3042);
        gl10.glBlendFunc(770, 771);
        gl10.glColor4x(65536, 65536, 65536, 65536);
        gl10.glEnable(3553);
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
        Log.m5069d("RustedWarfare", "2d gl onSurfaceCreated");
        this.f6516b = gl10;
        gl10.glHint(3152, 4353);
        gl10.glClearColor(0.3f, 0.3f, 0.5f, 1.0f);
        gl10.glShadeModel(7424);
        gl10.glDisable(2929);
        gl10.glEnable(3553);
        gl10.glDisable(3024);
        gl10.glDisable(2896);
        gl10.glClear(16640);
        if (GameEngine.getGameEngine() != null) {
        }
        this.f6515a = true;
    }
}