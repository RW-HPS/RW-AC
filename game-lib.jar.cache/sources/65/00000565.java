package com.corrodinggames.rts.gameFramework.m;

import android.graphics.BitmapFactory;
import android.opengl.GLSurfaceView;
import android.util.Log;
import com.corrodinggames.rts.gameFramework.GameEngine;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;

/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/m/a.class */
public class a implements GLSurfaceView.Renderer {
    private static BitmapFactory.Options q = new BitmapFactory.Options();

    /* renamed from: a  reason: collision with root package name */
    public boolean f621a;
    GL10 b;
    float c;
    float d;
    int e;
    int f;
    c[] g;
    ac h;
    int i;
    int j;
    int k;
    int l;
    int m;
    int n;
    String o;
    long p;

    @Override // android.opengl.GLSurfaceView.Renderer
    public void onDrawFrame(GL10 gl10) {
        if (this.e == -1) {
            Log.d("RustedWarfare", "---- render: no buffer is ready!");
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        this.p = currentTimeMillis;
        this.l += (int) (currentTimeMillis - this.p);
        this.m++;
        if (this.m == 10) {
            this.n = 10000 / this.l;
            this.l = 0;
            this.m = 0;
            this.o = this.n + "fps";
            Log.d("RustedWarfare", "render:" + this.o + ", this renders has " + this.g[this.e].b + " draws");
        }
        this.f = this.e;
        gl10.glClear(16640);
        gl10.glMatrixMode(5888);
        ac.a(gl10, true, false);
        c cVar = this.g[this.f];
        this.i = -1;
        this.j = -1;
        this.k = -1;
        for (int i = 0; i < cVar.b; i++) {
            cVar.f627a[i].a(gl10);
        }
        ac.a(gl10);
        this.f = -1;
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public void onSurfaceChanged(GL10 gl10, int i, int i2) {
        Log.d("RustedWarfare", "2d gl onSurfaceChanged:" + i + "," + i2);
        this.b = gl10;
        this.c = i2;
        this.d = i;
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
        Log.d("RustedWarfare", "2d gl onSurfaceCreated");
        this.b = gl10;
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
        this.f621a = true;
    }
}