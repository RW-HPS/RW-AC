package com.corrodinggames.rts.gameFramework.p031b;

import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.opengl.GLES11Ext;
import android.opengl.GLES20;
import android.opengl.GLUtils;
import android.opengl.Matrix;
import android.util.Log;
import com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope;
import com.corrodinggames.rts.gameFramework.C0773f;
import com.corrodinggames.rts.gameFramework.EnumC1100u;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.p031b.p032a.C0680b;
import com.corrodinggames.rts.gameFramework.unitAction.C0964ae;
import com.corrodinggames.rts.gameFramework.unitAction.C0965af;
import com.corrodinggames.rts.gameFramework.unitAction.C0976k;
import com.corrodinggames.rts.gameFramework.utility.C1136m;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;

/* renamed from: com.corrodinggames.rts.gameFramework.b.n */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/b/n.class */
public class C0712n implements InterfaceC0709k {

    /* renamed from: a */
    public C0688ac f4439a;

    /* renamed from: J */
    private Map f4443J;

    /* renamed from: K */
    private float[] f4444K;

    /* renamed from: L */
    private int f4445L;

    /* renamed from: b */
    int f4446b;

    /* renamed from: c */
    int f4447c;

    /* renamed from: d */
    float[] f4448d;

    /* renamed from: M */
    private int f4449M;

    /* renamed from: N */
    private int f4450N;

    /* renamed from: O */
    private int f4451O;

    /* renamed from: P */
    private int f4452P;

    /* renamed from: Q */
    private int f4453Q;

    /* renamed from: R */
    private int f4454R;

    /* renamed from: S */
    private InterfaceC0706h f4455S;

    /* renamed from: T */
    private InterfaceC0711m f4456T;

    /* renamed from: e */
    AbstractC0715q[] f4457e;

    /* renamed from: f */
    AbstractC0715q[] f4458f;

    /* renamed from: g */
    AbstractC0715q[] f4459g;

    /* renamed from: U */
    private final C0721w f4460U;

    /* renamed from: V */
    private int[] f4461V;

    /* renamed from: W */
    private ArrayList f4462W;

    /* renamed from: X */
    private final float[] f4463X;

    /* renamed from: Y */
    private final float[] f4464Y;

    /* renamed from: Z */
    private final RectF f4465Z;

    /* renamed from: aa */
    private final RectF f4466aa;

    /* renamed from: ab */
    private final int[] f4467ab;

    /* renamed from: h */
    boolean f4469h;

    /* renamed from: i */
    boolean f4470i;

    /* renamed from: j */
    C0723y f4471j;

    /* renamed from: k */
    C0696aj f4472k;

    /* renamed from: l */
    C0703f f4473l;

    /* renamed from: m */
    float[] f4474m;

    /* renamed from: n */
    C0716r f4475n;

    /* renamed from: o */
    public int f4476o;

    /* renamed from: p */
    C1136m f4477p;

    /* renamed from: q */
    static RectF f4478q;

    /* renamed from: r */
    int f4479r;

    /* renamed from: s */
    boolean f4480s;

    /* renamed from: t */
    boolean f4481t;

    /* renamed from: u */
    int f4482u;

    /* renamed from: v */
    C0964ae f4483v;

    /* renamed from: w */
    public int f4484w;

    /* renamed from: x */
    static int f4485x;

    /* renamed from: y */
    static int f4486y;

    /* renamed from: z */
    InterfaceC0687ab f4487z;

    /* renamed from: C */
    C1136m f4490C;

    /* renamed from: D */
    C0714p f4491D;

    /* renamed from: E */
    public static C0976k f4492E;

    /* renamed from: F */
    FloatBuffer f4493F;

    /* renamed from: G */
    private static final String f4440G = C0712n.class.getSimpleName();

    /* renamed from: H */
    private static final float[] f4441H = {0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f, 0.0f, 0.0f, 1.0f, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f, 1.0f, 0.0f};

    /* renamed from: I */
    private static final float[] f4442I = {0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f, 0.0f, 1.0f};

    /* renamed from: ac */
    private static final InterfaceC0719u f4468ac = new C0718t();

    /* renamed from: A */
    public static boolean f4488A = false;

    /* renamed from: B */
    static int f4489B = 0;

    /* renamed from: a */
    private int m2593a(int i, int i2, AbstractC0715q[] abstractC0715qArr, int[] iArr) {
        int glCreateProgram = GLES20.glCreateProgram();
        m2538r();
        if (glCreateProgram == 0) {
            throw new RuntimeException("Cannot create GL program: " + GLES20.glGetError());
        }
        GLES20.glAttachShader(glCreateProgram, i);
        m2538r();
        GLES20.glAttachShader(glCreateProgram, i2);
        m2538r();
        GLES20.glLinkProgram(glCreateProgram);
        m2538r();
        GLES20.glGetProgramiv(glCreateProgram, 35714, iArr, 0);
        if (iArr[0] != 1) {
            Log.m5069d(f4440G, "======= ERROR =========");
            Log.m5069d(f4440G, "Could not link program: ");
            String glGetProgramInfoLog = GLES20.glGetProgramInfoLog(glCreateProgram);
            Log.m5069d(f4440G, glGetProgramInfoLog);
            GLES20.glDeleteProgram(glCreateProgram);
            throw new RuntimeException("Cannot link GL program: " + glGetProgramInfoLog);
        }
        m2569a(abstractC0715qArr, glCreateProgram);
        return glCreateProgram;
    }

    /* renamed from: a */
    private static void m2569a(AbstractC0715q[] abstractC0715qArr, int i) {
        for (AbstractC0715q abstractC0715q : abstractC0715qArr) {
            abstractC0715q.mo2531a(i);
        }
    }

    /* renamed from: a */
    private static String m2591a(int i, String str) {
        String[] split;
        StringBuffer stringBuffer = new StringBuffer();
        boolean z = false;
        for (String str2 : str.split("\n")) {
            if (!z && str2.contains("version")) {
                z = true;
            } else {
                if (z) {
                }
                if (!str2.equals(str2)) {
                    GameEngine.m5460e("Changing: " + str2 + " to " + str2);
                }
                stringBuffer.append(str2);
                stringBuffer.append("\n");
            }
        }
        if (!z) {
        }
        return stringBuffer.toString();
    }

    /* renamed from: b */
    private static int m2563b(int i, String str) {
        int glCreateShader = GLES20.glCreateShader(i);
        if (str == null) {
            throw new RuntimeException("Shader Compilation Failed: shaderCode==null");
        }
        GLES20.glShaderSource(glCreateShader, m2591a(i, str));
        m2539q();
        GLES20.glCompileShader(glCreateShader);
        m2539q();
        int[] iArr = new int[1];
        GLES20.glGetShaderiv(glCreateShader, 35713, iArr, 0);
        if (iArr[0] == 0) {
            String str2 = "Shader Compilation Failed: " + GLES20.glGetShaderInfoLog(glCreateShader);
            Log.m5069d(f4440G, str2);
            throw new RuntimeException(str2);
        }
        return glCreateShader;
    }

    /* renamed from: a */
    public void m2597a(int i, int i2) {
        this.f4446b = i;
        this.f4447c = i2;
        m2539q();
        Matrix.setIdentityM(this.f4444K, this.f4445L);
        Matrix.orthoM(this.f4448d, 0, 0.0f, i, 0.0f, i2, -1.0f, 1.0f);
        m2539q();
        if (m2536t() == null) {
            this.f4449M = i;
            this.f4450N = i2;
            Matrix.translateM(this.f4444K, this.f4445L, 0.0f, i2, 0.0f);
            Matrix.scaleM(this.f4444K, this.f4445L, 1.0f, -1.0f, 1.0f);
            m2539q();
        }
        GLES20.glViewport(0, 0, this.f4446b, this.f4447c);
        m2549g();
    }

    /* renamed from: a */
    public void m2589a(int i, AbstractC0715q[] abstractC0715qArr) {
        m2539q();
        mo2550f();
        m2539q();
        m2598a(i);
        GLES20.glUniformMatrix4fv(abstractC0715qArr[5].f4498a, 1, false, this.f4448d, 0);
        m2539q();
    }

    /* renamed from: g */
    public void m2549g() {
        if (this.f4451O != 0) {
            m2589a(this.f4451O, this.f4457e);
        }
        if (this.f4452P != 0) {
            m2589a(this.f4452P, this.f4458f);
        }
        if (this.f4453Q != 0) {
            m2589a(this.f4453Q, this.f4459g);
        }
    }

    /* renamed from: a */
    public void m2573a(float[] fArr) {
        GLES20.glClearColor(fArr[1], fArr[2], fArr[3], fArr[0]);
        m2539q();
        GLES20.glClear(16384);
        m2539q();
    }

    /* renamed from: h */
    public float m2548h() {
        return 1.0f;
    }

    /* renamed from: a */
    public void m2602a(float f, float f2) {
        int i = this.f4445L;
        float[] fArr = this.f4444K;
        int i2 = i + 12;
        fArr[i2] = fArr[i2] + (fArr[i + 0] * f) + (fArr[i + 4] * f2);
        int i3 = i + 13;
        fArr[i3] = fArr[i3] + (fArr[i + 1] * f) + (fArr[i + 5] * f2);
        int i4 = i + 14;
        fArr[i4] = fArr[i4] + (fArr[i + 2] * f) + (fArr[i + 6] * f2);
        int i5 = i + 15;
        fArr[i5] = fArr[i5] + (fArr[i + 3] * f) + (fArr[i + 7] * f2);
    }

    /* renamed from: a */
    public void m2601a(float f, float f2, float f3) {
        Matrix.scaleM(this.f4444K, this.f4445L, f, f2, f3);
    }

    /* renamed from: a */
    public void m2603a(float f) {
        if (f == 0.0f) {
            return;
        }
        m2572a(this.f4444K, this.f4445L, f);
    }

    /* renamed from: a */
    public final void m2572a(float[] fArr, int i, float f) {
        float m2110j = C0773f.m2110j(f);
        float m2107k = C0773f.m2107k(f);
        if (f == 90.0f) {
            m2110j = 1.0f;
            m2107k = 0.0f;
        }
        float f2 = fArr[0 + i];
        float f3 = fArr[1 + i];
        float f4 = fArr[2 + i];
        float f5 = fArr[3 + i];
        float f6 = fArr[4 + i];
        float f7 = fArr[5 + i];
        float f8 = fArr[6 + i];
        float f9 = fArr[7 + i];
        float f10 = (f2 * m2107k) + (f6 * m2110j);
        float f11 = (f3 * m2107k) + (f7 * m2110j);
        float f12 = (f4 * m2107k) + (f8 * m2110j);
        float f13 = (f5 * m2107k) + (f9 * m2110j);
        int i2 = 0 + i;
        fArr[i2 + 0] = f10;
        fArr[i2 + 1] = f11;
        fArr[i2 + 2] = f12;
        fArr[i2 + 3] = f13;
        float f14 = (f2 * (-m2110j)) + (f6 * m2107k);
        float f15 = (f3 * (-m2110j)) + (f7 * m2107k);
        float f16 = (f4 * (-m2110j)) + (f8 * m2107k);
        float f17 = (f5 * (-m2110j)) + (f9 * m2107k);
        int i3 = 4 + i;
        fArr[i3 + 0] = f14;
        fArr[i3 + 1] = f15;
        fArr[i3 + 2] = f16;
        fArr[i3 + 3] = f17;
    }

    /* renamed from: i */
    public float[] m2547i() {
        float[] fArr = this.f4444K;
        int i = this.f4445L;
        float[] fArr2 = this.f4474m;
        for (int i2 = 0; i2 < 16; i2++) {
            fArr2[i2] = fArr[i + i2];
        }
        return fArr2;
    }

    @Override // com.corrodinggames.rts.gameFramework.p031b.InterfaceC0709k
    /* renamed from: b */
    public void mo2566b() {
        if (1 != 0) {
            int i = this.f4445L;
            this.f4445L += 16;
            if (this.f4444K.length <= this.f4445L + 16) {
                this.f4444K = Arrays.copyOf(this.f4444K, this.f4444K.length * 2);
            }
            for (int i2 = 0; i2 < 16; i2++) {
                this.f4444K[this.f4445L + i2] = this.f4444K[i + i2];
            }
        }
        m2546j();
    }

    @Override // com.corrodinggames.rts.gameFramework.p031b.InterfaceC0709k
    /* renamed from: c */
    public void mo2558c() {
        this.f4445L -= 16;
        if (this.f4445L < 0) {
            GameEngine.m990g("restore: error mCurrentMatrixIndex: " + this.f4445L);
            this.f4445L = 0;
        }
        m2545k();
    }

    /* renamed from: j */
    public void m2546j() {
        C1136m c1136m = this.f4477p;
        this.f4476o++;
        if (this.f4476o >= c1136m.f7109a) {
            c1136m.add(new C0716r());
        }
        C0716r c0716r = (C0716r) c1136m.get(this.f4476o);
        this.f4475n.m2532a(c0716r);
        this.f4475n = c0716r;
    }

    /* renamed from: k */
    public void m2545k() {
        C1136m c1136m = this.f4477p;
        this.f4476o--;
        if (this.f4476o < 0) {
            GameEngine.m990g("popTransformStack: error currentTransformIndex: " + this.f4476o);
            c1136m.set(0, new C0716r());
            this.f4476o = 0;
        }
        this.f4475n = (C0716r) c1136m.get(this.f4476o);
        m2574a(false);
    }

    /* renamed from: a */
    public void m2574a(boolean z) {
        RectF rectF = this.f4475n.f4501a;
        if (f4478q == rectF && !z) {
            return;
        }
        mo2551e();
        if (rectF != null) {
            GLES20.glEnable(3089);
            GLES20.glScissor((int) rectF.f234a, (int) (this.f4450N - rectF.f237d), (int) rectF.m5153b(), (int) rectF.m5149c());
        } else {
            GLES20.glDisable(3089);
        }
        f4478q = rectF;
    }

    @Override // com.corrodinggames.rts.gameFramework.p031b.InterfaceC0709k
    /* renamed from: a */
    public void mo2599a(float f, float f2, float f3, C0720v c0720v, InterfaceC0706h interfaceC0706h) {
        m2578a(interfaceC0706h);
        m2595a(5, 0, 4, f, f2, 2.0f * f3, 2.0f * f3, c0720v.m2529a(), 0.0f);
    }

    @Override // com.corrodinggames.rts.gameFramework.p031b.InterfaceC0709k
    /* renamed from: a */
    public void mo2600a(float f, float f2, float f3, float f4, C0720v c0720v, InterfaceC0706h interfaceC0706h) {
        m2542n();
        m2539q();
        this.f4472k.m2655b(1);
        if (c0720v == null) {
            this.f4472k.m2658a(-1);
        } else {
            this.f4472k.m2658a(c0720v.m2529a());
        }
        float m2525b = c0720v.m2525b();
        if (m2525b > 0.0f) {
            this.f4472k.m2661a(m2525b * this.f4444K[this.f4445L]);
        } else {
            this.f4472k.m2661a(1.0f);
        }
        m2539q();
        float[] m2547i = m2547i();
        this.f4472k.m2659a(f, f2, m2547i);
        this.f4472k.m2659a(f3, f4, m2547i);
        m2539q();
    }

    /* renamed from: a */
    private void m2595a(int i, int i2, int i3, float f, float f2, float f3, float f4, int i4, float f5) {
        m2596a(i2, i4, f5);
        if (this.f4456T != null) {
            this.f4456T.m2605a(this.f4451O, this.f4455S);
        }
        m2568a(this.f4457e, i, i3, f, f2, f3, f4, null);
    }

    /* renamed from: a */
    public void m2598a(int i) {
        if (this.f4479r != i) {
            GLES20.glUseProgram(i);
            m2539q();
            this.f4481t = false;
            this.f4479r = i;
        }
    }

    /* renamed from: a */
    private void m2596a(int i, int i2, float f) {
        mo2550f();
        m2598a(this.f4451O);
        if (f > 0.0f) {
            GLES20.glLineWidth(f * this.f4444K[this.f4445L]);
            m2539q();
        } else {
            GLES20.glLineWidth(1.0f);
            m2539q();
        }
        float[] m2565b = m2565b(i2);
        m2560b(true);
        GLES20.glBlendColor(m2565b[0], m2565b[1], m2565b[2], m2565b[3]);
        m2539q();
        GLES20.glUniform4fv(this.f4457e[2].f4498a, 1, m2565b, 0);
        m2559b(this.f4457e, i);
        m2539q();
    }

    /* renamed from: b */
    float[] m2565b(int i) {
        float m2548h = ((i >>> 24) & 255) * 0.003921569f * m2548h();
        float f = ((i >>> 16) & 255) * 0.003921569f * m2548h;
        float f2 = ((i >>> 8) & 255) * 0.003921569f * m2548h;
        this.f4464Y[0] = f;
        this.f4464Y[1] = f2;
        this.f4464Y[2] = (i & 255) * 0.003921569f * m2548h;
        this.f4464Y[3] = m2548h;
        return this.f4464Y;
    }

    /* renamed from: b */
    private void m2560b(boolean z) {
        if (z) {
            if (!this.f4480s) {
                GLES20.glEnable(3042);
                m2539q();
                this.f4480s = true;
            }
        } else if (this.f4480s) {
            GLES20.glDisable(3042);
            m2539q();
            this.f4480s = false;
        }
    }

    /* renamed from: l */
    public void m2544l() {
        m2561b((C0964ae) null);
        this.f4481t = false;
        this.f4479r = -1;
        this.f4487z = null;
        this.f4480s = false;
        m2538r();
        mo2550f();
    }

    /* renamed from: b */
    private void m2559b(AbstractC0715q[] abstractC0715qArr, int i) {
        if (!this.f4481t || this.f4482u != i) {
            GLES20.glBindBuffer(34962, this.f4454R);
            m2539q();
            GLES20.glVertexAttribPointer(abstractC0715qArr[0].f4498a, 2, 5126, false, 8, i * 8);
            m2539q();
            GLES20.glBindBuffer(34962, 0);
            m2539q();
            this.f4481t = true;
            this.f4482u = i;
        }
    }

    /* renamed from: a */
    private void m2568a(AbstractC0715q[] abstractC0715qArr, int i, int i2, float f, float f2, float f3, float f4, InterfaceC0710l interfaceC0710l) {
        m2570a(abstractC0715qArr, f, f2, f3, f4, interfaceC0710l);
        int i3 = abstractC0715qArr[0].f4498a;
        GLES20.glEnableVertexAttribArray(i3);
        m2539q();
        GLES20.glDrawArrays(i, 0, i2);
        m2539q();
        GLES20.glDisableVertexAttribArray(i3);
        m2539q();
    }

    /* renamed from: a */
    private void m2570a(AbstractC0715q[] abstractC0715qArr, float f, float f2, float f3, float f4, InterfaceC0710l interfaceC0710l) {
        if (interfaceC0710l != null) {
            GLES20.glUniformMatrix4fv(abstractC0715qArr[1].f4498a, 1, false, interfaceC0710l.m2606a(this.f4449M, this.f4450N, f, f2, f3, f4), 0);
            m2539q();
            return;
        }
        Matrix.translateM(this.f4463X, 0, this.f4444K, this.f4445L, f, f2, 0.0f);
        Matrix.scaleM(this.f4463X, 0, f3, f4, 1.0f);
        GLES20.glUniformMatrix4fv(abstractC0715qArr[1].f4498a, 1, false, this.f4463X, 0);
        m2539q();
    }

    @Override // com.corrodinggames.rts.gameFramework.p031b.InterfaceC0709k
    /* renamed from: a */
    public void mo2584a(AbstractC0699b abstractC0699b, int i, int i2, int i3, int i4, InterfaceC0691af interfaceC0691af, InterfaceC0710l interfaceC0710l) {
        if (i3 <= 0 || i4 <= 0) {
            return;
        }
        m2592a(abstractC0699b.mo2519g(), interfaceC0691af);
        C0692ag.m2671a(abstractC0699b, this.f4465Z);
        this.f4466aa.m5158a(i, i2, i + i3, i2 + i4);
        abstractC0699b.mo2642a(this.f4465Z);
        abstractC0699b.mo2641a(this.f4465Z, this.f4466aa);
        m2580a(abstractC0699b, this.f4465Z, this.f4466aa, interfaceC0710l);
    }

    /* renamed from: a */
    public void m2577a(C0964ae c0964ae) {
        if (this.f4483v == c0964ae) {
            return;
        }
        if (c0964ae == null && this.f4483v != null && this.f4483v.mo886a()) {
            if (this.f4483v.mo884b()) {
                mo2551e();
                m2541o();
                return;
            }
            return;
        }
        m2561b(c0964ae);
    }

    /* renamed from: b */
    public void m2561b(C0964ae c0964ae) {
        if (this.f4483v == c0964ae) {
            return;
        }
        mo2550f();
        if (c0964ae != null) {
            if (c0964ae.f6577n == 0) {
                m2552d(c0964ae);
            }
            if (c0964ae.f6577n == 0) {
                this.f4483v = null;
                return;
            }
            this.f4471j.f4520j = (C0724z) c0964ae.f6580q;
        }
        if (c0964ae == null) {
            this.f4471j.f4520j = this.f4471j.f4519i;
        }
        this.f4483v = c0964ae;
    }

    /* renamed from: c */
    public void m2555c(C0964ae c0964ae) {
        C0965af[] c0965afArr;
        for (C0965af c0965af : c0964ae.f6579p) {
            if (c0965af.f6585c || c0965af.f6588f != null) {
                c0965af.f6585c = false;
                if (c0965af.f6584b == -1) {
                    c0965af.f6584b = GLES20.glGetUniformLocation(c0964ae.f6577n, c0965af.f6583a);
                    if (c0965af.f6584b == -1 && !c0965af.f6586d) {
                        c0965af.f6586d = true;
                        c0964ae.m927b("Unknown parameter: " + c0965af.f6583a);
                        return;
                    }
                }
                if (c0965af.f6588f != null) {
                    AbstractC0699b m2622a = this.f4473l.m2622a(c0965af.f6588f.mo391b(), c0965af.f6588f);
                    if (c0965af.f6589g) {
                        GLES20.glUniform2f(c0965af.f6584b, m2622a.f4416e, m2622a.f4417f);
                    } else {
                        int m2645a = m2622a.m2645a();
                        GLES20.glActiveTexture(33985);
                        GLES20.glBindTexture(3553, m2645a);
                        GLES20.glUniform1i(c0965af.f6584b, 1);
                        GLES20.glActiveTexture(33984);
                    }
                } else if (c0965af.f6587e.length == 1) {
                    GLES20.glUniform1f(c0965af.f6584b, c0965af.f6587e[0]);
                } else if (c0965af.f6587e.length == 2) {
                    GLES20.glUniform2f(c0965af.f6584b, c0965af.f6587e[0], c0965af.f6587e[1]);
                } else if (c0965af.f6587e.length == 4) {
                    GLES20.glUniform4f(c0965af.f6584b, c0965af.f6587e[0], c0965af.f6587e[1], c0965af.f6587e[2], c0965af.f6587e[3]);
                } else {
                    c0964ae.m927b("Unhandled parameter size: " + c0965af.f6583a + " - " + c0965af.f6587e.length);
                }
            }
        }
    }

    /* renamed from: d */
    public boolean m2552d(C0964ae c0964ae) {
        if (c0964ae.f6578o != 0) {
            return false;
        }
        if (c0964ae.f6577n != 0 && !c0964ae.f6576m) {
            return true;
        }
        m2538r();
        c0964ae.f6576m = false;
        c0964ae.m927b("== Compiling shader ==");
        C0724z c0724z = new C0724z();
        c0964ae.f6580q = c0724z;
        try {
            c0964ae.f6577n = m2567a(c0724z.f4534f, this.f4471j.f4518h.m2630a(), c0964ae.f6569f);
        } catch (RuntimeException e) {
            c0964ae.m925c("Failed to compile shader: " + e.getMessage());
            e.printStackTrace();
            c0964ae.f6578o = 1;
        }
        if (c0964ae.f6578o != 0 && c0964ae.f6577n == 0) {
            c0964ae.m925c("Shader program_handle == 0");
            c0964ae.f6578o = 1;
        }
        m2538r();
        return true;
    }

    /* renamed from: a */
    public void m2581a(AbstractC0699b abstractC0699b, RectF rectF, RectF rectF2, InterfaceC0691af interfaceC0691af, InterfaceC0710l interfaceC0710l) {
        if (rectF2.m5153b() <= 0.0f || rectF2.m5149c() <= 0.0f) {
            return;
        }
        m2592a(abstractC0699b.mo2519g(), interfaceC0691af);
        this.f4465Z.m5156a(rectF);
        this.f4466aa.m5156a(rectF2);
        abstractC0699b.mo2642a(this.f4465Z);
        abstractC0699b.mo2641a(this.f4465Z, this.f4466aa);
        m2580a(abstractC0699b, this.f4465Z, this.f4466aa, interfaceC0710l);
    }

    /* renamed from: a */
    private void m2580a(AbstractC0699b abstractC0699b, RectF rectF, RectF rectF2, InterfaceC0710l interfaceC0710l) {
        m2543m();
        this.f4471j.m2515a(this.f4484w);
        this.f4471j.m2513a(abstractC0699b, rectF, rectF2, m2547i());
    }

    /* renamed from: m */
    public void m2543m() {
        if (!this.f4469h) {
            if (this.f4470i) {
                mo2550f();
            }
            m2560b(true);
            this.f4471j.m2512a(this.f4483v);
            this.f4469h = true;
        }
    }

    /* renamed from: n */
    public void m2542n() {
        if (!this.f4470i) {
            if (this.f4469h) {
                mo2550f();
            }
            m2560b(true);
            this.f4472k.m2657a((C0964ae) null);
            this.f4470i = true;
        }
    }

    @Override // com.corrodinggames.rts.gameFramework.p031b.InterfaceC0709k
    /* renamed from: f */
    public void mo2550f() {
        if (this.f4469h) {
            this.f4471j.m2508d();
            this.f4469h = false;
        }
        if (this.f4470i) {
            this.f4472k.m2653c();
            this.f4470i = false;
        }
    }

    @Override // com.corrodinggames.rts.gameFramework.p031b.InterfaceC0709k
    /* renamed from: e */
    public void mo2551e() {
        if (this.f4469h) {
            this.f4471j.m2509c();
        }
        if (this.f4470i) {
            this.f4472k.m2656b();
        }
    }

    /* renamed from: o */
    public void m2541o() {
        this.f4471j.m2511b();
    }

    @Override // com.corrodinggames.rts.gameFramework.p031b.InterfaceC0709k
    /* renamed from: a */
    public boolean mo2587a(AbstractC0699b abstractC0699b) {
        boolean m2633i = abstractC0699b.m2633i();
        if (m2633i) {
            m2557c(abstractC0699b.f4416e, abstractC0699b.f4417f);
            synchronized (this.f4460U) {
                this.f4460U.m2523a(abstractC0699b.m2645a());
            }
        }
        return m2633i;
    }

    /* renamed from: b */
    public static void m2564b(int i, int i2) {
        f4485x++;
        f4486y += i * i2 * 4;
    }

    /* renamed from: c */
    public static void m2557c(int i, int i2) {
        f4485x--;
        f4486y -= (i * i2) * 4;
    }

    @Override // com.corrodinggames.rts.gameFramework.p031b.InterfaceC0709k
    /* renamed from: d */
    public void mo2554d() {
        m2579a((AbstractC0699b) this.f4462W.remove(this.f4462W.size() - 1), m2536t());
        mo2558c();
        m2544l();
    }

    @Override // com.corrodinggames.rts.gameFramework.p031b.InterfaceC0709k
    /* renamed from: c */
    public void mo2556c(AbstractC0699b abstractC0699b) {
        mo2566b();
        AbstractC0699b m2536t = m2536t();
        this.f4462W.add(abstractC0699b);
        m2579a(m2536t, abstractC0699b);
    }

    /* renamed from: t */
    private AbstractC0699b m2536t() {
        return (AbstractC0699b) this.f4462W.get(this.f4462W.size() - 1);
    }

    /* renamed from: a */
    private void m2579a(AbstractC0699b abstractC0699b, AbstractC0699b abstractC0699b2) {
        mo2550f();
        if (abstractC0699b == null && abstractC0699b2 != null) {
            if (abstractC0699b2.mo2519g() == 3553) {
                GLES20.glGenFramebuffers(1, this.f4461V, 0);
                m2539q();
                GLES20.glBindFramebuffer(36160, this.f4461V[0]);
                m2539q();
            } else {
                GLES11Ext.glGenFramebuffersOES(1, this.f4461V, 0);
                m2539q();
                GLES11Ext.glBindFramebufferOES(36160, this.f4461V[0]);
                m2539q();
            }
        } else if (abstractC0699b != null && abstractC0699b2 == null) {
            if (abstractC0699b.mo2519g() == 3553) {
                GLES20.glBindFramebuffer(36160, 0);
                m2539q();
                GLES20.glDeleteFramebuffers(1, this.f4461V, 0);
                m2539q();
            } else {
                GLES11Ext.glBindFramebufferOES(36160, 0);
                m2539q();
                GLES11Ext.glDeleteFramebuffersOES(1, this.f4461V, 0);
                m2539q();
            }
        }
        if (abstractC0699b2 == null) {
            m2597a(this.f4449M, this.f4450N);
            return;
        }
        m2597a(abstractC0699b2.mo2638b(), abstractC0699b2.mo2637c());
        if (!abstractC0699b2.m2633i()) {
            abstractC0699b2.mo2521b(this);
        }
        if (abstractC0699b2.mo2519g() == 3553) {
            GLES20.glFramebufferTexture2D(36160, 36064, abstractC0699b2.mo2519g(), abstractC0699b2.m2645a(), 0);
            m2539q();
            m2535u();
            return;
        }
        GLES11Ext.glFramebufferTexture2DOES(36160, 36064, abstractC0699b2.mo2519g(), abstractC0699b2.m2645a(), 0);
        m2539q();
        m2534v();
    }

    /* renamed from: u */
    private static void m2535u() {
        int glCheckFramebufferStatus = GLES20.glCheckFramebufferStatus(36160);
        if (glCheckFramebufferStatus != 36053) {
            String str = VariableScope.nullOrMissingString;
            switch (glCheckFramebufferStatus) {
                case 36054:
                    str = "GL_FRAMEBUFFER_INCOMPLETE_ATTACHMENT";
                    break;
                case 36055:
                    str = "GL_FRAMEBUFFER_INCOMPLETE_MISSING_ATTACHMENT";
                    break;
                case 36057:
                    str = "GL_FRAMEBUFFER_INCOMPLETE_DIMENSIONS";
                    break;
                case 36061:
                    str = "GL_FRAMEBUFFER_UNSUPPORTED";
                    break;
            }
            throw new RuntimeException(str + ":" + Integer.toHexString(glCheckFramebufferStatus));
        }
    }

    /* renamed from: v */
    private static void m2534v() {
        int glCheckFramebufferStatusOES = GLES11Ext.glCheckFramebufferStatusOES(36160);
        if (glCheckFramebufferStatusOES != 36053) {
            String str = VariableScope.nullOrMissingString;
            switch (glCheckFramebufferStatusOES) {
                case 36054:
                    str = "GL_FRAMEBUFFER_INCOMPLETE_ATTACHMENT";
                    break;
                case 36055:
                    str = "GL_FRAMEBUFFER_INCOMPLETE_MISSING_ATTACHMENT";
                    break;
                case 36057:
                    str = "GL_FRAMEBUFFER_INCOMPLETE_DIMENSIONS";
                    break;
                case 36061:
                    str = "GL_FRAMEBUFFER_UNSUPPORTED";
                    break;
            }
            throw new RuntimeException(str + ":" + Integer.toHexString(glCheckFramebufferStatusOES));
        }
    }

    @Override // com.corrodinggames.rts.gameFramework.p031b.InterfaceC0709k
    /* renamed from: d */
    public void mo2553d(AbstractC0699b abstractC0699b) {
        int mo2519g = abstractC0699b.mo2519g();
        mo2562b(abstractC0699b);
        m2539q();
        GLES20.glTexParameteri(mo2519g, 10242, 33071);
        GLES20.glTexParameteri(mo2519g, 10243, 33071);
        int mo2518h = abstractC0699b.mo2518h();
        GLES20.glTexParameterf(mo2519g, 10241, mo2518h);
        GLES20.glTexParameterf(mo2519g, 10240, mo2518h);
    }

    /* renamed from: a */
    public void m2586a(AbstractC0699b abstractC0699b, int i) {
        if (abstractC0699b.mo2518h() != i && abstractC0699b.m2645a() != -1) {
            mo2562b(abstractC0699b);
            abstractC0699b.mo2522b(i);
        }
    }

    @Override // com.corrodinggames.rts.gameFramework.p031b.InterfaceC0709k
    /* renamed from: b */
    public void mo2562b(AbstractC0699b abstractC0699b) {
        if (this.f4487z == abstractC0699b) {
        }
        mo2551e();
        GLES20.glBindTexture(abstractC0699b.mo2519g(), abstractC0699b.m2645a());
        this.f4487z = abstractC0699b;
    }

    @Override // com.corrodinggames.rts.gameFramework.p031b.InterfaceC0709k
    /* renamed from: a */
    public void mo2585a(AbstractC0699b abstractC0699b, int i, int i2, int i3) {
        int mo2519g = abstractC0699b.mo2519g();
        mo2562b(abstractC0699b);
        m2539q();
        GLES20.glTexImage2D(mo2519g, 0, i3, abstractC0699b.m2636d(), abstractC0699b.m2635e(), 0, i, i2, null);
    }

    @Override // com.corrodinggames.rts.gameFramework.p031b.InterfaceC0709k
    /* renamed from: a */
    public void mo2582a(AbstractC0699b abstractC0699b, Bitmap bitmap, int i) {
        int mo2519g = abstractC0699b.mo2519g();
        mo2562b(abstractC0699b);
        m2539q();
        if (i == 0) {
            GLUtils.texImage2D(mo2519g, 0, bitmap, 0);
        } else {
            GLUtils.texImage2D(mo2519g, 0, i, bitmap, 0);
        }
    }

    @Override // com.corrodinggames.rts.gameFramework.p031b.InterfaceC0709k
    /* renamed from: a */
    public void mo2583a(AbstractC0699b abstractC0699b, int i, int i2, Bitmap bitmap, int i3, int i4) {
        int mo2519g = abstractC0699b.mo2519g();
        mo2562b(abstractC0699b);
        m2539q();
        GLUtils.texSubImage2D(mo2519g, 0, i, i2, bitmap, i3, i4);
    }

    /* renamed from: a */
    public static void m2575a(String str, Throwable th) {
        if (f4489B > 1000) {
            return;
        }
        f4489B++;
        if (th != null) {
            Log.m5072b(f4440G, str, th);
        } else {
            Log.m5069d(f4440G, str);
        }
    }

    /* renamed from: p */
    public static void m2540p() {
        int i;
        int i2 = 255;
        int glGetError = GLES20.glGetError();
        while (true) {
            i = glGetError;
            if (i == 0 || i2 <= 0) {
                break;
            }
            i2--;
            glGetError = GLES20.glGetError();
        }
        if (i != 0) {
            m2575a("clearGlError: Failed to clear", (Throwable) null);
        }
    }

    /* renamed from: q */
    public static void m2539q() {
        int glGetError;
        if (f4488A && (glGetError = GLES20.glGetError()) != 0) {
            m2575a("GL error: " + glGetError, new Throwable());
            m2540p();
        }
    }

    /* renamed from: r */
    public static void m2538r() {
        int glGetError = GLES20.glGetError();
        if (glGetError != 0) {
            m2575a("GL error: " + glGetError, new Throwable());
            m2540p();
        }
    }

    @Override // com.corrodinggames.rts.gameFramework.p031b.InterfaceC0709k
    /* renamed from: a */
    public InterfaceC0719u mo2604a() {
        return f4468ac;
    }

    @Override // com.corrodinggames.rts.gameFramework.p031b.InterfaceC0709k
    /* renamed from: a */
    public void mo2594a(int i, int i2, int i3, int i4) {
        float f = this.f4444K[this.f4445L];
        this.f4475n.f4501a = new RectF();
        this.f4475n.f4501a.f234a = i;
        this.f4475n.f4501a.f236c = i3;
        this.f4475n.f4501a.f235b = i2;
        this.f4475n.f4501a.f237d = i4;
        this.f4475n.f4501a.f234a *= f;
        this.f4475n.f4501a.f236c *= f;
        this.f4475n.f4501a.f235b *= f;
        this.f4475n.f4501a.f237d *= f;
        m2574a(false);
    }

    /* renamed from: a */
    private void m2578a(InterfaceC0706h interfaceC0706h) {
        if (interfaceC0706h == null) {
            throw new NullPointerException("draw shape filter is null.");
        }
        this.f4455S = interfaceC0706h;
        if (this.f4443J.containsKey(interfaceC0706h)) {
            int i = this.f4451O;
            this.f4451O = ((Integer) this.f4443J.get(interfaceC0706h)).intValue();
            m2569a(this.f4457e, this.f4451O);
            if (i != this.f4451O) {
                m2589a(this.f4451O, this.f4457e);
                return;
            }
            return;
        }
        this.f4451O = m2567a(this.f4457e, interfaceC0706h.mo2612a(), interfaceC0706h.mo2611b());
        m2589a(this.f4451O, this.f4457e);
        this.f4443J.put(interfaceC0706h, Integer.valueOf(this.f4451O));
    }

    /* renamed from: a */
    private void m2592a(int i, InterfaceC0691af interfaceC0691af) {
        if (interfaceC0691af == null) {
            throw new NullPointerException("Texture filter is null.");
        }
    }

    /* renamed from: a */
    public int m2567a(AbstractC0715q[] abstractC0715qArr, String str, String str2) {
        return m2593a(m2563b(35633, str), m2563b(35632, str2), abstractC0715qArr, this.f4467ab);
    }

    /* renamed from: a */
    public C0714p m2590a(int i, boolean z, boolean z2) {
        GameEngine.m5460e("Loading new font size:" + i + " bold:" + z + " unicode:" + z2);
        try {
            C0714p c0714p = new C0714p(this);
            c0714p.f4494a = i;
            c0714p.f4495b = z;
            Paint paint = new Paint();
            paint.m5199c(true);
            paint.mo914a(true);
            if (!z) {
                paint.mo916a(Typeface.m5137a(Typeface.f246c, 0));
            } else {
                paint.mo916a(Typeface.m5137a(Typeface.f246c, 1));
            }
            c0714p.f4496c = new C0680b(null);
            c0714p.f4496c.m2710a(paint, i, 3, 2);
            c0714p.f4496c.m2704a(true);
            c0714p.f4496c.m2711a(12);
            this.f4490C.add(c0714p);
            return c0714p;
        } catch (OutOfMemoryError e) {
            GameEngine.m1068a(EnumC1100u.gameFont, e);
            C0714p c0714p2 = new C0714p(this);
            c0714p2.f4494a = i;
            c0714p2.f4495b = z;
            if (this.f4491D != null) {
                c0714p2.f4496c = this.f4491D.f4496c;
            }
            this.f4490C.add(c0714p2);
            return c0714p2;
        }
    }

    @Override // com.corrodinggames.rts.gameFramework.p031b.InterfaceC0709k
    /* renamed from: a */
    public void mo2576a(String str, float f, float f2, Paint paint) {
        mo2550f();
        boolean z = false;
        Typeface m5188i = paint.m5188i();
        if (m5188i != null) {
            z = m5188i.m5139a();
        }
        int m5186k = (int) paint.m5186k();
        if (m5186k > 42) {
            m5186k = 42;
        }
        if (m5186k < 10) {
            m5186k = 10;
        }
        if (m5186k % 2 != 0) {
        }
        boolean m2102n = C0773f.m2102n(str);
        if (m2102n) {
            m5186k = 24;
        }
        if (this.f4491D == null) {
            this.f4491D = m2590a(24, false, true);
        }
        C0714p c0714p = null;
        Iterator it = this.f4490C.iterator();
        while (it.hasNext()) {
            C0714p c0714p2 = (C0714p) it.next();
            if (c0714p2.f4494a == m5186k && c0714p2.f4495b == z) {
                c0714p = c0714p2;
            }
        }
        if (c0714p == null) {
            c0714p = m2590a(m5186k, z, m2102n);
        }
        if (c0714p.f4496c == null) {
            m2575a("font.glText==null", (Throwable) null);
            return;
        }
        C0680b c0680b = c0714p.f4496c;
        m2538r();
        int m5194e = paint.m5194e();
        float m5245a = Color.m5245a(m5194e) * 0.003921569f;
        float m5241b = Color.m5241b(m5194e) * 0.003921569f * m5245a;
        float m5240c = Color.m5240c(m5194e) * 0.003921569f * m5245a;
        float m5239d = Color.m5239d(m5194e) * 0.003921569f * m5245a;
        float m5186k2 = paint.m5186k();
        if (m5186k2 != c0714p.f4494a) {
        }
        c0680b.m2712a(m5241b, m5240c, m5239d, m5245a, this.f4448d);
        c0680b.m2714a(m5186k2 / c0714p.f4494a);
        m2538r();
        if (paint.m5187j() == Paint.Align.CENTER) {
            c0680b.m2708a(str, f - ((int) (c0680b.m2709a(str) * 0.5f)), this.f4447c - f2);
        } else {
            c0680b.m2707a(str, f, this.f4447c - f2, 0.0f);
        }
        m2538r();
        c0680b.m2698d();
        m2544l();
    }

    @Override // com.corrodinggames.rts.gameFramework.p031b.InterfaceC0709k
    /* renamed from: a */
    public void mo2571a(float[] fArr, int i, int i2, C0720v c0720v, InterfaceC0706h interfaceC0706h) {
        if (this.f4493F == null || this.f4493F.capacity() < i2 * 4) {
            ByteBuffer allocateDirect = ByteBuffer.allocateDirect((i2 * 4) + 10);
            allocateDirect.order(ByteOrder.nativeOrder());
            this.f4493F = allocateDirect.asFloatBuffer();
        }
        this.f4493F.clear();
        this.f4493F.put(fArr, i, i2);
        this.f4493F.flip();
        this.f4493F.position(0);
        float m2525b = c0720v.m2525b();
        int m2529a = c0720v.m2529a();
        if (m2525b == 0.0f) {
            m2525b = 1.0f;
        }
        m2578a(interfaceC0706h);
        m2596a(0, m2529a, m2525b);
        if (this.f4456T != null) {
            this.f4456T.m2605a(this.f4451O, this.f4455S);
        }
        AbstractC0715q[] abstractC0715qArr = this.f4457e;
        int i3 = abstractC0715qArr[0].f4498a;
        GLES20.glEnableVertexAttribArray(i3);
        m2539q();
        GLES20.glVertexAttribPointer(i3, 2, 5126, false, 0, (Buffer) this.f4493F);
        m2570a(abstractC0715qArr, 0.0f, 0.0f, 1.0f, 1.0f, (InterfaceC0710l) null);
        GLES20.glDrawArrays(0, 0, i2 / 2);
        m2539q();
        GLES20.glDisableVertexAttribArray(i3);
        m2539q();
    }

    @Override // com.corrodinggames.rts.gameFramework.p031b.InterfaceC0709k
    /* renamed from: a */
    public void mo2588a(Bitmap bitmap) {
        if (this.f4439a != null) {
            this.f4439a.m2673b(bitmap);
        }
    }
}