package com.corrodinggames.rts.gameFramework.p031b.p032a;

import android.content.res.AssetManager;
import android.graphics.Paint;
import android.opengl.GLES20;
import android.opengl.Matrix;
import android.util.Log;
import com.corrodinggames.rts.gameFramework.p031b.p032a.p033a.AbstractC0679b;
import com.corrodinggames.rts.gameFramework.p031b.p032a.p033a.C0678a;
import com.corrodinggames.rts.gameFramework.utility.SlickToAndroidKeycodes;
import java.util.ArrayList;

/* renamed from: com.corrodinggames.rts.gameFramework.b.a.b */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/b/a/b.class */
public class C0680b {

    /* renamed from: a */
    AssetManager f4278a;

    /* renamed from: b */
    C0682d f4279b;

    /* renamed from: c */
    int f4280c;

    /* renamed from: d */
    int f4281d;

    /* renamed from: e */
    float f4282e;

    /* renamed from: f */
    float f4283f;

    /* renamed from: g */
    float f4284g;

    /* renamed from: h */
    float f4285h;

    /* renamed from: i */
    float f4286i;

    /* renamed from: j */
    int f4287j;

    /* renamed from: k */
    int f4288k;

    /* renamed from: l */
    int f4289l;

    /* renamed from: m */
    int f4290m;

    /* renamed from: n */
    float f4291n;

    /* renamed from: o */
    float f4292o;

    /* renamed from: p */
    float f4293p;

    /* renamed from: q */
    boolean f4294q;

    /* renamed from: x */
    private AbstractC0679b f4295x;

    /* renamed from: y */
    private int f4296y;

    /* renamed from: z */
    private int f4297z;

    /* renamed from: r */
    public Paint f4298r;

    /* renamed from: s */
    public ArrayList f4299s;

    /* renamed from: t */
    C0681c[][] f4300t;

    /* renamed from: u */
    boolean f4301u;

    /* renamed from: v */
    int f4302v;

    /* renamed from: w */
    public static boolean f4303w = true;

    /* renamed from: a */
    public C0681c m2716a(char c) {
        C0681c m2702b = m2702b(c);
        if (m2702b == null && this.f4301u) {
            m2701b("Loading glyph:" + c);
            m2699c(c);
            m2717a();
        }
        return m2702b;
    }

    /* renamed from: b */
    public C0681c m2702b(char c) {
        C0681c[] c0681cArr;
        if (c <= '\uffff' && (c0681cArr = this.f4300t[c / SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_CONTENTS_MENU]) != null) {
            return c0681cArr[c & '\u00ff'];
        }
        return null;
    }

    /* renamed from: a */
    public void m2715a(char c, C0681c c0681c) {
        C0681c[] c0681cArr = this.f4300t[c / SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_CONTENTS_MENU];
        if (c0681cArr == null) {
            c0681cArr = new C0681c[SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_MEDIA_CONTEXT_MENU];
            this.f4300t[c / SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_CONTENTS_MENU] = c0681cArr;
        }
        c0681cArr[c & '\u00ff'] = c0681c;
    }

    /* renamed from: c */
    public void m2699c(char c) {
        if (c > '\uffff') {
            return;
        }
        if (this.f4299s.size() == 0) {
            m2703b();
        }
        if (!((C0683e) this.f4299s.get(this.f4299s.size() - 1)).m2693a()) {
            if (this.f4299s.size() < this.f4302v) {
                m2703b();
            } else {
                return;
            }
        }
        m2715a(c, ((C0683e) this.f4299s.get(this.f4299s.size() - 1)).m2692a(c, this.f4298r));
    }

    /* renamed from: a */
    public void m2717a() {
        if (this.f4299s.size() > 0) {
            ((C0683e) this.f4299s.get(this.f4299s.size() - 1)).m2689c();
        }
    }

    /* renamed from: b */
    public void m2703b() {
        m2717a();
        this.f4299s.add(new C0683e(512, this.f4299s.size(), this.f4287j, this.f4288k, this.f4280c, this.f4281d));
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [com.corrodinggames.rts.gameFramework.b.a.c[], com.corrodinggames.rts.gameFramework.b.a.c[][]] */
    public C0680b(AbstractC0679b abstractC0679b, AssetManager assetManager) {
        this.f4294q = true;
        this.f4299s = new ArrayList();
        this.f4300t = new C0681c[SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_CONTENTS_MENU];
        this.f4302v = Integer.MAX_VALUE;
        if (abstractC0679b == null) {
            abstractC0679b = new C0678a();
            abstractC0679b.mo2720a();
        }
        this.f4278a = assetManager;
        this.f4279b = new C0682d(24, abstractC0679b, this);
        this.f4280c = 0;
        this.f4281d = 0;
        this.f4282e = 0.0f;
        this.f4283f = 0.0f;
        this.f4284g = 0.0f;
        this.f4285h = 0.0f;
        this.f4286i = 0.0f;
        this.f4287j = 0;
        this.f4288k = 0;
        this.f4289l = 0;
        this.f4290m = 0;
        this.f4291n = 1.0f;
        this.f4292o = 1.0f;
        this.f4293p = 0.0f;
        this.f4295x = abstractC0679b;
        this.f4296y = GLES20.glGetUniformLocation(this.f4295x.m2718b(), "u_Color");
        this.f4297z = GLES20.glGetUniformLocation(this.f4295x.m2718b(), "u_Texture");
    }

    /* renamed from: a */
    public void m2704a(boolean z) {
        this.f4301u = z;
    }

    /* renamed from: a */
    public void m2711a(int i) {
        this.f4302v = i;
    }

    public C0680b(AssetManager assetManager) {
        this(null, assetManager);
    }

    /* renamed from: a */
    public boolean m2710a(Paint paint, int i, int i2, int i3) {
        if (this.f4298r != null) {
            throw new RuntimeException("Already loaded");
        }
        this.f4280c = i2;
        this.f4281d = i3;
        this.f4298r = paint;
        this.f4298r.mo914a(true);
        this.f4298r.mo913b(i);
        this.f4298r.m5206b(-1);
        Paint.FontMetrics m5183n = this.f4298r.m5183n();
        this.f4282e = (float) Math.ceil(Math.abs(m5183n.f208d) + Math.abs(m5183n.f205a));
        this.f4283f = (float) Math.ceil(Math.abs(m5183n.f206b));
        this.f4284g = (float) Math.ceil(Math.abs(m5183n.f207c));
        char[] cArr = new char[2];
        this.f4286i = 0.0f;
        this.f4285h = 0.0f;
        float[] fArr = new float[2];
        int i4 = 0;
        char c = ' ';
        while (true) {
            char c2 = c;
            if (c2 > '~') {
                break;
            }
            cArr[0] = c2;
            paint.m5208a(cArr, 0, 1, fArr);
            float f = fArr[0];
            if (f > this.f4285h) {
                this.f4285h = f;
            }
            i4++;
            c = (char) (c2 + 1);
        }
        this.f4286i = this.f4282e;
        this.f4287j = ((int) this.f4285h) + (2 * this.f4280c);
        this.f4288k = ((int) this.f4286i) + (2 * this.f4281d);
        char c3 = ' ';
        while (true) {
            char c4 = c3;
            if (c4 <= '~') {
                m2699c(c4);
                c3 = (char) (c4 + 1);
            } else {
                m2717a();
                return true;
            }
        }
    }

    /* renamed from: a */
    public void m2712a(float f, float f2, float f3, float f4, float[] fArr) {
        m2713a(f, f2, f3, f4);
        this.f4279b.m2694a(fArr);
    }

    /* renamed from: c */
    public static void m2700c() {
        int glGetError;
        if (f4303w && (glGetError = GLES20.glGetError()) != 0) {
            Log.m5072b("GLTEXT", "GL error: " + glGetError, new Throwable());
        }
    }

    /* renamed from: a */
    void m2713a(float f, float f2, float f3, float f4) {
        GLES20.glUseProgram(this.f4295x.m2718b());
        GLES20.glUniform4fv(this.f4296y, 1, new float[]{f, f2, f3, f4}, 0);
        GLES20.glActiveTexture(33984);
        GLES20.glUniform1i(this.f4297z, 0);
        m2700c();
    }

    /* renamed from: d */
    public void m2698d() {
        this.f4279b.m2697a();
    }

    /* renamed from: a */
    public void m2705a(String str, float f, float f2, float f3, float f4, float f5, float f6) {
        float f7 = this.f4288k * this.f4292o;
        float f8 = this.f4287j * this.f4291n;
        int length = str.length();
        float f9 = (f8 / 2.0f) - (this.f4280c * this.f4291n);
        float f10 = ((f7 / 2.0f) - (this.f4281d * this.f4292o)) - (this.f4284g * this.f4292o);
        if (this.f4294q) {
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
            C0681c m2716a = m2716a(charAt);
            if (m2716a != null) {
                this.f4279b.m2696a(f14, f15, f8, f7, m2716a);
                float f16 = (m2716a.f4306c + this.f4293p) * this.f4291n;
                if (this.f4294q) {
                    f16 = (int) (f16 + 0.95f);
                }
                f13 += f16;
            }
        }
    }

    /* renamed from: a */
    public void m2706a(String str, float f, float f2, float f3, float f4) {
        m2705a(str, f, f2, f3, 0.0f, 0.0f, f4);
    }

    /* renamed from: a */
    public void m2707a(String str, float f, float f2, float f3) {
        m2706a(str, f, f2, 0.0f, f3);
    }

    /* renamed from: a */
    public void m2708a(String str, float f, float f2) {
        m2706a(str, f, f2, 0.0f, 0.0f);
    }

    /* renamed from: a */
    public void m2714a(float f) {
        this.f4292o = f;
        this.f4291n = f;
    }

    /* renamed from: a */
    public float m2709a(String str) {
        float f = 0.0f;
        int length = str.length();
        for (int i = 0; i < length; i++) {
            C0681c m2702b = m2702b(str.charAt(i));
            if (m2702b != null) {
                f += m2702b.f4306c * this.f4291n;
            }
        }
        return f + (length > 1 ? (length - 1) * this.f4293p * this.f4291n : 0.0f);
    }

    /* renamed from: b */
    public static void m2701b(String str) {
        Log.m5073b("GLTEXT", "debug:" + str);
    }
}