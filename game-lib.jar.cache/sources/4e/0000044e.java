package com.corrodinggames.rts.gameFramework.b.a;

import android.content.res.AssetManager;
import android.graphics.Paint;
import android.opengl.GLES20;
import android.opengl.Matrix;
import android.util.Log;
import com.corrodinggames.rts.gameFramework.utility.SlickToAndroidKeycodes;
import java.util.ArrayList;

/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/b/a/b.class */
public class b {
    AssetManager a;
    d b;
    int c;
    int d;
    float e;
    float f;
    float g;
    float h;
    float i;
    int j;
    int k;
    int l;
    int m;
    float n;
    float o;
    float p;
    boolean q;
    private com.corrodinggames.rts.gameFramework.b.a.a.b x;
    private int y;
    private int z;
    public Paint r;
    public ArrayList s;
    c[][] t;
    boolean u;
    int v;
    public static boolean w = true;

    public c a(char c) {
        c b = b(c);
        if (b == null && this.u) {
            b("Loading glyph:" + c);
            c(c);
            a();
        }
        return b;
    }

    public c b(char c) {
        c[] cVarArr;
        if (c <= '\uffff' && (cVarArr = this.t[c / SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_CONTENTS_MENU]) != null) {
            return cVarArr[c & '\u00ff'];
        }
        return null;
    }

    public void a(char c, c cVar) {
        c[] cVarArr = this.t[c / SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_CONTENTS_MENU];
        if (cVarArr == null) {
            cVarArr = new c[SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_MEDIA_CONTEXT_MENU];
            this.t[c / SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_CONTENTS_MENU] = cVarArr;
        }
        cVarArr[c & '\u00ff'] = cVar;
    }

    public void c(char c) {
        if (c > '\uffff') {
            return;
        }
        if (this.s.size() == 0) {
            b();
        }
        if (!((e) this.s.get(this.s.size() - 1)).a()) {
            if (this.s.size() < this.v) {
                b();
            } else {
                return;
            }
        }
        a(c, ((e) this.s.get(this.s.size() - 1)).a(c, this.r));
    }

    public void a() {
        if (this.s.size() > 0) {
            ((e) this.s.get(this.s.size() - 1)).c();
        }
    }

    public void b() {
        a();
        this.s.add(new e(512, this.s.size(), this.j, this.k, this.c, this.d));
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [com.corrodinggames.rts.gameFramework.b.a.c[], com.corrodinggames.rts.gameFramework.b.a.c[][]] */
    public b(com.corrodinggames.rts.gameFramework.b.a.a.b bVar, AssetManager assetManager) {
        this.q = true;
        this.s = new ArrayList();
        this.t = new c[SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_CONTENTS_MENU];
        this.v = Integer.MAX_VALUE;
        if (bVar == null) {
            bVar = new com.corrodinggames.rts.gameFramework.b.a.a.a();
            bVar.a();
        }
        this.a = assetManager;
        this.b = new d(24, bVar, this);
        this.c = 0;
        this.d = 0;
        this.e = 0.0f;
        this.f = 0.0f;
        this.g = 0.0f;
        this.h = 0.0f;
        this.i = 0.0f;
        this.j = 0;
        this.k = 0;
        this.l = 0;
        this.m = 0;
        this.n = 1.0f;
        this.o = 1.0f;
        this.p = 0.0f;
        this.x = bVar;
        this.y = GLES20.glGetUniformLocation(this.x.b(), "u_Color");
        this.z = GLES20.glGetUniformLocation(this.x.b(), "u_Texture");
    }

    public void a(boolean z) {
        this.u = z;
    }

    public void a(int i) {
        this.v = i;
    }

    public b(AssetManager assetManager) {
        this(null, assetManager);
    }

    public boolean a(Paint paint, int i, int i2, int i3) {
        if (this.r != null) {
            throw new RuntimeException("Already loaded");
        }
        this.c = i2;
        this.d = i3;
        this.r = paint;
        this.r.a(true);
        this.r.b(i);
        this.r.b(-1);
        Paint.FontMetrics n = this.r.n();
        this.e = (float) Math.ceil(Math.abs(n.d) + Math.abs(n.a));
        this.f = (float) Math.ceil(Math.abs(n.b));
        this.g = (float) Math.ceil(Math.abs(n.c));
        char[] cArr = new char[2];
        this.i = 0.0f;
        this.h = 0.0f;
        float[] fArr = new float[2];
        int i4 = 0;
        char c = ' ';
        while (true) {
            char c2 = c;
            if (c2 > '~') {
                break;
            }
            cArr[0] = c2;
            paint.a(cArr, 0, 1, fArr);
            float f = fArr[0];
            if (f > this.h) {
                this.h = f;
            }
            i4++;
            c = (char) (c2 + 1);
        }
        this.i = this.e;
        this.j = ((int) this.h) + (2 * this.c);
        this.k = ((int) this.i) + (2 * this.d);
        char c3 = ' ';
        while (true) {
            char c4 = c3;
            if (c4 <= '~') {
                c(c4);
                c3 = (char) (c4 + 1);
            } else {
                a();
                return true;
            }
        }
    }

    public void a(float f, float f2, float f3, float f4, float[] fArr) {
        a(f, f2, f3, f4);
        this.b.a(fArr);
    }

    public static void c() {
        int glGetError;
        if (w && (glGetError = GLES20.glGetError()) != 0) {
            Log.b("GLTEXT", "GL error: " + glGetError, new Throwable());
        }
    }

    void a(float f, float f2, float f3, float f4) {
        GLES20.glUseProgram(this.x.b());
        GLES20.glUniform4fv(this.y, 1, new float[]{f, f2, f3, f4}, 0);
        GLES20.glActiveTexture(33984);
        GLES20.glUniform1i(this.z, 0);
        c();
    }

    public void d() {
        this.b.a();
    }

    public void a(String str, float f, float f2, float f3, float f4, float f5, float f6) {
        float f7 = this.k * this.o;
        float f8 = this.j * this.n;
        int length = str.length();
        float f9 = (f8 / 2.0f) - (this.c * this.n);
        float f10 = ((f7 / 2.0f) - (this.d * this.o)) - (this.g * this.o);
        if (this.q) {
            f9 = (int) f9;
            f10 = (int) f10;
        }
        float f11 = f + f9;
        float f12 = f2 + f10;
        boolean z = false;
        if (f3 == 0.0f && f6 == 0.0f && f4 == 0.0f && f5 == 0.0f) {
            z = true;
        } else {
            float[] fArr = new float[16];
            Matrix.setIdentityM(fArr, 0);
            Matrix.translateM(fArr, 0, f11, f12, f3);
            if (f6 != 0.0f || f4 != 0.0f || f5 != 0.0f) {
                Matrix.rotateM(fArr, 0, f6, 0.0f, 0.0f, 1.0f);
                Matrix.rotateM(fArr, 0, f4, 1.0f, 0.0f, 0.0f);
                Matrix.rotateM(fArr, 0, f5, 0.0f, 1.0f, 0.0f);
            }
        }
        float f13 = 0.0f;
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            int i2 = charAt - ' ';
            if (i2 < 0 || i2 >= 96) {
            }
            float f14 = f13;
            float f15 = 0.0f;
            if (z) {
                f14 += f11;
                f15 = 0.0f + f12;
            }
            c a = a(charAt);
            if (a != null) {
                this.b.a(f14, f15, f8, f7, a);
                float f16 = (a.c + this.p) * this.n;
                if (this.q) {
                    f16 = (int) (f16 + 0.95f);
                }
                f13 += f16;
            }
        }
    }

    public void a(String str, float f, float f2, float f3, float f4) {
        a(str, f, f2, f3, 0.0f, 0.0f, f4);
    }

    public void a(String str, float f, float f2, float f3) {
        a(str, f, f2, 0.0f, f3);
    }

    public void a(String str, float f, float f2) {
        a(str, f, f2, 0.0f, 0.0f);
    }

    public void a(float f) {
        this.o = f;
        this.n = f;
    }

    public float a(String str) {
        float f = 0.0f;
        int length = str.length();
        for (int i = 0; i < length; i++) {
            c b = b(str.charAt(i));
            if (b != null) {
                f += b.c * this.n;
            }
        }
        return f + (length > 1 ? (length - 1) * this.p * this.n : 0.0f);
    }

    public static void b(String str) {
        Log.b("GLTEXT", "debug:" + str);
    }
}