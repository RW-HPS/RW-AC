package com.corrodinggames.rts.gameFramework.b;

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
import com.corrodinggames.rts.gameFramework.GameEngine;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;

/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/b/n.class */
public class n implements k {
    public ac a;
    private Map J;
    private float[] K;
    private int L;
    int b;
    int c;
    float[] d;
    private int M;
    private int N;
    private int O;
    private int P;
    private int Q;
    private int R;
    private h S;
    private m T;
    q[] e;
    q[] f;
    q[] g;
    private final w U;
    private int[] V;
    private ArrayList W;
    private final float[] X;
    private final float[] Y;
    private final RectF Z;
    private final RectF aa;
    private final int[] ab;
    boolean h;
    boolean i;
    y j;
    aj k;
    f l;
    float[] m;
    r n;
    public int o;
    com.corrodinggames.rts.gameFramework.utility.m p;
    static RectF q;
    int r;
    boolean s;
    boolean t;
    int u;
    com.corrodinggames.rts.gameFramework.unitAction.ae v;
    public int w;
    static int x;
    static int y;
    ab z;
    com.corrodinggames.rts.gameFramework.utility.m C;
    p D;
    public static com.corrodinggames.rts.gameFramework.unitAction.k E;
    FloatBuffer F;
    private static final String G = n.class.getSimpleName();
    private static final float[] H = {0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f, 0.0f, 0.0f, 1.0f, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f, 1.0f, 0.0f};
    private static final float[] I = {0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f, 0.0f, 1.0f};
    private static final u ac = new t();
    public static boolean A = false;
    static int B = 0;

    private int a(int i, int i2, q[] qVarArr, int[] iArr) {
        int glCreateProgram = GLES20.glCreateProgram();
        r();
        if (glCreateProgram == 0) {
            throw new RuntimeException("Cannot create GL program: " + GLES20.glGetError());
        }
        GLES20.glAttachShader(glCreateProgram, i);
        r();
        GLES20.glAttachShader(glCreateProgram, i2);
        r();
        GLES20.glLinkProgram(glCreateProgram);
        r();
        GLES20.glGetProgramiv(glCreateProgram, 35714, iArr, 0);
        if (iArr[0] != 1) {
            Log.d(G, "======= ERROR =========");
            Log.d(G, "Could not link program: ");
            String glGetProgramInfoLog = GLES20.glGetProgramInfoLog(glCreateProgram);
            Log.d(G, glGetProgramInfoLog);
            GLES20.glDeleteProgram(glCreateProgram);
            throw new RuntimeException("Cannot link GL program: " + glGetProgramInfoLog);
        }
        a(qVarArr, glCreateProgram);
        return glCreateProgram;
    }

    private static void a(q[] qVarArr, int i) {
        for (q qVar : qVarArr) {
            qVar.a(i);
        }
    }

    private static String a(int i, String str) {
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
                    GameEngine.m5e("Changing: " + str2 + " to " + str2);
                }
                stringBuffer.append(str2);
                stringBuffer.append("\n");
            }
        }
        if (!z) {
        }
        return stringBuffer.toString();
    }

    private static int b(int i, String str) {
        int glCreateShader = GLES20.glCreateShader(i);
        if (str == null) {
            throw new RuntimeException("Shader Compilation Failed: shaderCode==null");
        }
        GLES20.glShaderSource(glCreateShader, a(i, str));
        q();
        GLES20.glCompileShader(glCreateShader);
        q();
        int[] iArr = new int[1];
        GLES20.glGetShaderiv(glCreateShader, 35713, iArr, 0);
        if (iArr[0] == 0) {
            String str2 = "Shader Compilation Failed: " + GLES20.glGetShaderInfoLog(glCreateShader);
            Log.d(G, str2);
            throw new RuntimeException(str2);
        }
        return glCreateShader;
    }

    public void a(int i, int i2) {
        this.b = i;
        this.c = i2;
        q();
        Matrix.setIdentityM(this.K, this.L);
        Matrix.orthoM(this.d, 0, 0.0f, i, 0.0f, i2, -1.0f, 1.0f);
        q();
        if (t() == null) {
            this.M = i;
            this.N = i2;
            Matrix.translateM(this.K, this.L, 0.0f, i2, 0.0f);
            Matrix.scaleM(this.K, this.L, 1.0f, -1.0f, 1.0f);
            q();
        }
        GLES20.glViewport(0, 0, this.b, this.c);
        g();
    }

    public void a(int i, q[] qVarArr) {
        q();
        f();
        q();
        a(i);
        GLES20.glUniformMatrix4fv(qVarArr[5].a, 1, false, this.d, 0);
        q();
    }

    public void g() {
        if (this.O != 0) {
            a(this.O, this.e);
        }
        if (this.P != 0) {
            a(this.P, this.f);
        }
        if (this.Q != 0) {
            a(this.Q, this.g);
        }
    }

    public void a(float[] fArr) {
        GLES20.glClearColor(fArr[1], fArr[2], fArr[3], fArr[0]);
        q();
        GLES20.glClear(16384);
        q();
    }

    public float h() {
        return 1.0f;
    }

    public void a(float f, float f2) {
        int i = this.L;
        float[] fArr = this.K;
        int i2 = i + 12;
        fArr[i2] = fArr[i2] + (fArr[i + 0] * f) + (fArr[i + 4] * f2);
        int i3 = i + 13;
        fArr[i3] = fArr[i3] + (fArr[i + 1] * f) + (fArr[i + 5] * f2);
        int i4 = i + 14;
        fArr[i4] = fArr[i4] + (fArr[i + 2] * f) + (fArr[i + 6] * f2);
        int i5 = i + 15;
        fArr[i5] = fArr[i5] + (fArr[i + 3] * f) + (fArr[i + 7] * f2);
    }

    public void a(float f, float f2, float f3) {
        Matrix.scaleM(this.K, this.L, f, f2, f3);
    }

    public void a(float f) {
        if (f == 0.0f) {
            return;
        }
        a(this.K, this.L, f);
    }

    public final void a(float[] fArr, int i, float f) {
        float j = com.corrodinggames.rts.gameFramework.f.j(f);
        float k = com.corrodinggames.rts.gameFramework.f.k(f);
        if (f == 90.0f) {
            j = 1.0f;
            k = 0.0f;
        }
        float f2 = fArr[0 + i];
        float f3 = fArr[1 + i];
        float f4 = fArr[2 + i];
        float f5 = fArr[3 + i];
        float f6 = fArr[4 + i];
        float f7 = fArr[5 + i];
        float f8 = fArr[6 + i];
        float f9 = fArr[7 + i];
        float f10 = (f2 * k) + (f6 * j);
        float f11 = (f3 * k) + (f7 * j);
        float f12 = (f4 * k) + (f8 * j);
        float f13 = (f5 * k) + (f9 * j);
        int i2 = 0 + i;
        fArr[i2 + 0] = f10;
        fArr[i2 + 1] = f11;
        fArr[i2 + 2] = f12;
        fArr[i2 + 3] = f13;
        float f14 = (f2 * (-j)) + (f6 * k);
        float f15 = (f3 * (-j)) + (f7 * k);
        float f16 = (f4 * (-j)) + (f8 * k);
        float f17 = (f5 * (-j)) + (f9 * k);
        int i3 = 4 + i;
        fArr[i3 + 0] = f14;
        fArr[i3 + 1] = f15;
        fArr[i3 + 2] = f16;
        fArr[i3 + 3] = f17;
    }

    public float[] i() {
        float[] fArr = this.K;
        int i = this.L;
        float[] fArr2 = this.m;
        for (int i2 = 0; i2 < 16; i2++) {
            fArr2[i2] = fArr[i + i2];
        }
        return fArr2;
    }

    @Override // com.corrodinggames.rts.gameFramework.b.k
    public void b() {
        if (1 != 0) {
            int i = this.L;
            this.L += 16;
            if (this.K.length <= this.L + 16) {
                this.K = Arrays.copyOf(this.K, this.K.length * 2);
            }
            for (int i2 = 0; i2 < 16; i2++) {
                this.K[this.L + i2] = this.K[i + i2];
            }
        }
        j();
    }

    @Override // com.corrodinggames.rts.gameFramework.b.k
    public void c() {
        this.L -= 16;
        if (this.L < 0) {
            GameEngine.g("restore: error mCurrentMatrixIndex: " + this.L);
            this.L = 0;
        }
        k();
    }

    public void j() {
        com.corrodinggames.rts.gameFramework.utility.m mVar = this.p;
        this.o++;
        if (this.o >= mVar.a) {
            mVar.add(new r());
        }
        r rVar = (r) mVar.get(this.o);
        this.n.a(rVar);
        this.n = rVar;
    }

    public void k() {
        com.corrodinggames.rts.gameFramework.utility.m mVar = this.p;
        this.o--;
        if (this.o < 0) {
            GameEngine.g("popTransformStack: error currentTransformIndex: " + this.o);
            mVar.set(0, new r());
            this.o = 0;
        }
        this.n = (r) mVar.get(this.o);
        a(false);
    }

    public void a(boolean z) {
        RectF rectF = this.n.a;
        if (q == rectF && !z) {
            return;
        }
        e();
        if (rectF != null) {
            GLES20.glEnable(3089);
            GLES20.glScissor((int) rectF.a, (int) (this.N - rectF.d), (int) rectF.b(), (int) rectF.c());
        } else {
            GLES20.glDisable(3089);
        }
        q = rectF;
    }

    @Override // com.corrodinggames.rts.gameFramework.b.k
    public void a(float f, float f2, float f3, v vVar, h hVar) {
        a(hVar);
        a(5, 0, 4, f, f2, 2.0f * f3, 2.0f * f3, vVar.a(), 0.0f);
    }

    @Override // com.corrodinggames.rts.gameFramework.b.k
    public void a(float f, float f2, float f3, float f4, v vVar, h hVar) {
        n();
        q();
        this.k.b(1);
        if (vVar == null) {
            this.k.a(-1);
        } else {
            this.k.a(vVar.a());
        }
        float b = vVar.b();
        if (b > 0.0f) {
            this.k.a(b * this.K[this.L]);
        } else {
            this.k.a(1.0f);
        }
        q();
        float[] i = i();
        this.k.a(f, f2, i);
        this.k.a(f3, f4, i);
        q();
    }

    private void a(int i, int i2, int i3, float f, float f2, float f3, float f4, int i4, float f5) {
        a(i2, i4, f5);
        if (this.T != null) {
            this.T.a(this.O, this.S);
        }
        a(this.e, i, i3, f, f2, f3, f4, null);
    }

    public void a(int i) {
        if (this.r != i) {
            GLES20.glUseProgram(i);
            q();
            this.t = false;
            this.r = i;
        }
    }

    private void a(int i, int i2, float f) {
        f();
        a(this.O);
        if (f > 0.0f) {
            GLES20.glLineWidth(f * this.K[this.L]);
            q();
        } else {
            GLES20.glLineWidth(1.0f);
            q();
        }
        float[] b = b(i2);
        b(true);
        GLES20.glBlendColor(b[0], b[1], b[2], b[3]);
        q();
        GLES20.glUniform4fv(this.e[2].a, 1, b, 0);
        b(this.e, i);
        q();
    }

    float[] b(int i) {
        float h = ((i >>> 24) & 255) * 0.003921569f * h();
        float f = ((i >>> 16) & 255) * 0.003921569f * h;
        float f2 = ((i >>> 8) & 255) * 0.003921569f * h;
        this.Y[0] = f;
        this.Y[1] = f2;
        this.Y[2] = (i & 255) * 0.003921569f * h;
        this.Y[3] = h;
        return this.Y;
    }

    private void b(boolean z) {
        if (z) {
            if (!this.s) {
                GLES20.glEnable(3042);
                q();
                this.s = true;
            }
        } else if (this.s) {
            GLES20.glDisable(3042);
            q();
            this.s = false;
        }
    }

    public void l() {
        b((com.corrodinggames.rts.gameFramework.unitAction.ae) null);
        this.t = false;
        this.r = -1;
        this.z = null;
        this.s = false;
        r();
        f();
    }

    private void b(q[] qVarArr, int i) {
        if (!this.t || this.u != i) {
            GLES20.glBindBuffer(34962, this.R);
            q();
            GLES20.glVertexAttribPointer(qVarArr[0].a, 2, 5126, false, 8, i * 8);
            q();
            GLES20.glBindBuffer(34962, 0);
            q();
            this.t = true;
            this.u = i;
        }
    }

    private void a(q[] qVarArr, int i, int i2, float f, float f2, float f3, float f4, l lVar) {
        a(qVarArr, f, f2, f3, f4, lVar);
        int i3 = qVarArr[0].a;
        GLES20.glEnableVertexAttribArray(i3);
        q();
        GLES20.glDrawArrays(i, 0, i2);
        q();
        GLES20.glDisableVertexAttribArray(i3);
        q();
    }

    private void a(q[] qVarArr, float f, float f2, float f3, float f4, l lVar) {
        if (lVar != null) {
            GLES20.glUniformMatrix4fv(qVarArr[1].a, 1, false, lVar.a(this.M, this.N, f, f2, f3, f4), 0);
            q();
            return;
        }
        Matrix.translateM(this.X, 0, this.K, this.L, f, f2, 0.0f);
        Matrix.scaleM(this.X, 0, f3, f4, 1.0f);
        GLES20.glUniformMatrix4fv(qVarArr[1].a, 1, false, this.X, 0);
        q();
    }

    @Override // com.corrodinggames.rts.gameFramework.b.k
    public void a(b bVar, int i, int i2, int i3, int i4, af afVar, l lVar) {
        if (i3 <= 0 || i4 <= 0) {
            return;
        }
        a(bVar.g(), afVar);
        ag.a(bVar, this.Z);
        this.aa.a(i, i2, i + i3, i2 + i4);
        bVar.a(this.Z);
        bVar.a(this.Z, this.aa);
        a(bVar, this.Z, this.aa, lVar);
    }

    public void a(com.corrodinggames.rts.gameFramework.unitAction.ae aeVar) {
        if (this.v == aeVar) {
            return;
        }
        if (aeVar == null && this.v != null && this.v.a()) {
            if (this.v.b()) {
                e();
                o();
                return;
            }
            return;
        }
        b(aeVar);
    }

    public void b(com.corrodinggames.rts.gameFramework.unitAction.ae aeVar) {
        if (this.v == aeVar) {
            return;
        }
        f();
        if (aeVar != null) {
            if (aeVar.n == 0) {
                d(aeVar);
            }
            if (aeVar.n == 0) {
                this.v = null;
                return;
            }
            this.j.j = (z) aeVar.q;
        }
        if (aeVar == null) {
            this.j.j = this.j.i;
        }
        this.v = aeVar;
    }

    public void c(com.corrodinggames.rts.gameFramework.unitAction.ae aeVar) {
        com.corrodinggames.rts.gameFramework.unitAction.af[] afVarArr;
        for (com.corrodinggames.rts.gameFramework.unitAction.af afVar : aeVar.p) {
            if (afVar.c || afVar.f != null) {
                afVar.c = false;
                if (afVar.b == -1) {
                    afVar.b = GLES20.glGetUniformLocation(aeVar.n, afVar.a);
                    if (afVar.b == -1 && !afVar.d) {
                        afVar.d = true;
                        aeVar.b("Unknown parameter: " + afVar.a);
                        return;
                    }
                }
                if (afVar.f != null) {
                    b a = this.l.a(afVar.f.b(), afVar.f);
                    if (afVar.g) {
                        GLES20.glUniform2f(afVar.b, a.e, a.f);
                    } else {
                        int a2 = a.a();
                        GLES20.glActiveTexture(33985);
                        GLES20.glBindTexture(3553, a2);
                        GLES20.glUniform1i(afVar.b, 1);
                        GLES20.glActiveTexture(33984);
                    }
                } else if (afVar.e.length == 1) {
                    GLES20.glUniform1f(afVar.b, afVar.e[0]);
                } else if (afVar.e.length == 2) {
                    GLES20.glUniform2f(afVar.b, afVar.e[0], afVar.e[1]);
                } else if (afVar.e.length == 4) {
                    GLES20.glUniform4f(afVar.b, afVar.e[0], afVar.e[1], afVar.e[2], afVar.e[3]);
                } else {
                    aeVar.b("Unhandled parameter size: " + afVar.a + " - " + afVar.e.length);
                }
            }
        }
    }

    public boolean d(com.corrodinggames.rts.gameFramework.unitAction.ae aeVar) {
        if (aeVar.o != 0) {
            return false;
        }
        if (aeVar.n != 0 && !aeVar.m) {
            return true;
        }
        r();
        aeVar.m = false;
        aeVar.b("== Compiling shader ==");
        z zVar = new z();
        aeVar.q = zVar;
        try {
            aeVar.n = a(zVar.f, this.j.h.a(), aeVar.f);
        } catch (RuntimeException e) {
            aeVar.c("Failed to compile shader: " + e.getMessage());
            e.printStackTrace();
            aeVar.o = 1;
        }
        if (aeVar.o != 0 && aeVar.n == 0) {
            aeVar.c("Shader program_handle == 0");
            aeVar.o = 1;
        }
        r();
        return true;
    }

    public void a(b bVar, RectF rectF, RectF rectF2, af afVar, l lVar) {
        if (rectF2.b() <= 0.0f || rectF2.c() <= 0.0f) {
            return;
        }
        a(bVar.g(), afVar);
        this.Z.a(rectF);
        this.aa.a(rectF2);
        bVar.a(this.Z);
        bVar.a(this.Z, this.aa);
        a(bVar, this.Z, this.aa, lVar);
    }

    private void a(b bVar, RectF rectF, RectF rectF2, l lVar) {
        m();
        this.j.a(this.w);
        this.j.a(bVar, rectF, rectF2, i());
    }

    public void m() {
        if (!this.h) {
            if (this.i) {
                f();
            }
            b(true);
            this.j.a(this.v);
            this.h = true;
        }
    }

    public void n() {
        if (!this.i) {
            if (this.h) {
                f();
            }
            b(true);
            this.k.a((com.corrodinggames.rts.gameFramework.unitAction.ae) null);
            this.i = true;
        }
    }

    @Override // com.corrodinggames.rts.gameFramework.b.k
    public void f() {
        if (this.h) {
            this.j.d();
            this.h = false;
        }
        if (this.i) {
            this.k.c();
            this.i = false;
        }
    }

    @Override // com.corrodinggames.rts.gameFramework.b.k
    public void e() {
        if (this.h) {
            this.j.c();
        }
        if (this.i) {
            this.k.b();
        }
    }

    public void o() {
        this.j.b();
    }

    @Override // com.corrodinggames.rts.gameFramework.b.k
    public boolean a(b bVar) {
        boolean i = bVar.i();
        if (i) {
            c(bVar.e, bVar.f);
            synchronized (this.U) {
                this.U.a(bVar.a());
            }
        }
        return i;
    }

    public static void b(int i, int i2) {
        x++;
        y += i * i2 * 4;
    }

    public static void c(int i, int i2) {
        x--;
        y -= (i * i2) * 4;
    }

    @Override // com.corrodinggames.rts.gameFramework.b.k
    public void d() {
        a((b) this.W.remove(this.W.size() - 1), t());
        c();
        l();
    }

    @Override // com.corrodinggames.rts.gameFramework.b.k
    public void c(b bVar) {
        b();
        b t = t();
        this.W.add(bVar);
        a(t, bVar);
    }

    private b t() {
        return (b) this.W.get(this.W.size() - 1);
    }

    private void a(b bVar, b bVar2) {
        f();
        if (bVar == null && bVar2 != null) {
            if (bVar2.g() == 3553) {
                GLES20.glGenFramebuffers(1, this.V, 0);
                q();
                GLES20.glBindFramebuffer(36160, this.V[0]);
                q();
            } else {
                GLES11Ext.glGenFramebuffersOES(1, this.V, 0);
                q();
                GLES11Ext.glBindFramebufferOES(36160, this.V[0]);
                q();
            }
        } else if (bVar != null && bVar2 == null) {
            if (bVar.g() == 3553) {
                GLES20.glBindFramebuffer(36160, 0);
                q();
                GLES20.glDeleteFramebuffers(1, this.V, 0);
                q();
            } else {
                GLES11Ext.glBindFramebufferOES(36160, 0);
                q();
                GLES11Ext.glDeleteFramebuffersOES(1, this.V, 0);
                q();
            }
        }
        if (bVar2 == null) {
            a(this.M, this.N);
            return;
        }
        a(bVar2.b(), bVar2.c());
        if (!bVar2.i()) {
            bVar2.b(this);
        }
        if (bVar2.g() == 3553) {
            GLES20.glFramebufferTexture2D(36160, 36064, bVar2.g(), bVar2.a(), 0);
            q();
            u();
            return;
        }
        GLES11Ext.glFramebufferTexture2DOES(36160, 36064, bVar2.g(), bVar2.a(), 0);
        q();
        v();
    }

    private static void u() {
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

    private static void v() {
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

    @Override // com.corrodinggames.rts.gameFramework.b.k
    public void d(b bVar) {
        int g = bVar.g();
        b(bVar);
        q();
        GLES20.glTexParameteri(g, 10242, 33071);
        GLES20.glTexParameteri(g, 10243, 33071);
        int h = bVar.h();
        GLES20.glTexParameterf(g, 10241, h);
        GLES20.glTexParameterf(g, 10240, h);
    }

    public void a(b bVar, int i) {
        if (bVar.h() != i && bVar.a() != -1) {
            b(bVar);
            bVar.b(i);
        }
    }

    @Override // com.corrodinggames.rts.gameFramework.b.k
    public void b(b bVar) {
        if (this.z == bVar) {
        }
        e();
        GLES20.glBindTexture(bVar.g(), bVar.a());
        this.z = bVar;
    }

    @Override // com.corrodinggames.rts.gameFramework.b.k
    public void a(b bVar, int i, int i2, int i3) {
        int g = bVar.g();
        b(bVar);
        q();
        GLES20.glTexImage2D(g, 0, i3, bVar.d(), bVar.e(), 0, i, i2, null);
    }

    @Override // com.corrodinggames.rts.gameFramework.b.k
    public void a(b bVar, Bitmap bitmap, int i) {
        int g = bVar.g();
        b(bVar);
        q();
        if (i == 0) {
            GLUtils.texImage2D(g, 0, bitmap, 0);
        } else {
            GLUtils.texImage2D(g, 0, i, bitmap, 0);
        }
    }

    @Override // com.corrodinggames.rts.gameFramework.b.k
    public void a(b bVar, int i, int i2, Bitmap bitmap, int i3, int i4) {
        int g = bVar.g();
        b(bVar);
        q();
        GLUtils.texSubImage2D(g, 0, i, i2, bitmap, i3, i4);
    }

    public static void a(String str, Throwable th) {
        if (B > 1000) {
            return;
        }
        B++;
        if (th != null) {
            Log.b(G, str, th);
        } else {
            Log.d(G, str);
        }
    }

    public static void p() {
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
            a("clearGlError: Failed to clear", (Throwable) null);
        }
    }

    public static void q() {
        int glGetError;
        if (A && (glGetError = GLES20.glGetError()) != 0) {
            a("GL error: " + glGetError, new Throwable());
            p();
        }
    }

    public static void r() {
        int glGetError = GLES20.glGetError();
        if (glGetError != 0) {
            a("GL error: " + glGetError, new Throwable());
            p();
        }
    }

    @Override // com.corrodinggames.rts.gameFramework.b.k
    public u a() {
        return ac;
    }

    @Override // com.corrodinggames.rts.gameFramework.b.k
    public void a(int i, int i2, int i3, int i4) {
        float f = this.K[this.L];
        this.n.a = new RectF();
        this.n.a.a = i;
        this.n.a.c = i3;
        this.n.a.b = i2;
        this.n.a.d = i4;
        this.n.a.a *= f;
        this.n.a.c *= f;
        this.n.a.b *= f;
        this.n.a.d *= f;
        a(false);
    }

    private void a(h hVar) {
        if (hVar == null) {
            throw new NullPointerException("draw shape filter is null.");
        }
        this.S = hVar;
        if (this.J.containsKey(hVar)) {
            int i = this.O;
            this.O = ((Integer) this.J.get(hVar)).intValue();
            a(this.e, this.O);
            if (i != this.O) {
                a(this.O, this.e);
                return;
            }
            return;
        }
        this.O = a(this.e, hVar.a(), hVar.b());
        a(this.O, this.e);
        this.J.put(hVar, Integer.valueOf(this.O));
    }

    private void a(int i, af afVar) {
        if (afVar == null) {
            throw new NullPointerException("Texture filter is null.");
        }
    }

    public int a(q[] qVarArr, String str, String str2) {
        return a(b(35633, str), b(35632, str2), qVarArr, this.ab);
    }

    public p a(int i, boolean z, boolean z2) {
        GameEngine.m5e("Loading new font size:" + i + " bold:" + z + " unicode:" + z2);
        try {
            p pVar = new p(this);
            pVar.a = i;
            pVar.b = z;
            Paint paint = new Paint();
            paint.c(true);
            paint.a(true);
            if (!z) {
                paint.a(Typeface.a(Typeface.c, 0));
            } else {
                paint.a(Typeface.a(Typeface.c, 1));
            }
            pVar.c = new com.corrodinggames.rts.gameFramework.b.a.b(null);
            pVar.c.a(paint, i, 3, 2);
            pVar.c.a(true);
            pVar.c.a(12);
            this.C.add(pVar);
            return pVar;
        } catch (OutOfMemoryError e) {
            GameEngine.a(com.corrodinggames.rts.gameFramework.u.gameFont, e);
            p pVar2 = new p(this);
            pVar2.a = i;
            pVar2.b = z;
            if (this.D != null) {
                pVar2.c = this.D.c;
            }
            this.C.add(pVar2);
            return pVar2;
        }
    }

    @Override // com.corrodinggames.rts.gameFramework.b.k
    public void a(String str, float f, float f2, Paint paint) {
        f();
        boolean z = false;
        Typeface i = paint.i();
        if (i != null) {
            z = i.a();
        }
        int k = (int) paint.k();
        if (k > 42) {
            k = 42;
        }
        if (k < 10) {
            k = 10;
        }
        if (k % 2 != 0) {
        }
        boolean n = com.corrodinggames.rts.gameFramework.f.n(str);
        if (n) {
            k = 24;
        }
        if (this.D == null) {
            this.D = a(24, false, true);
        }
        p pVar = null;
        Iterator it = this.C.iterator();
        while (it.hasNext()) {
            p pVar2 = (p) it.next();
            if (pVar2.a == k && pVar2.b == z) {
                pVar = pVar2;
            }
        }
        if (pVar == null) {
            pVar = a(k, z, n);
        }
        if (pVar.c == null) {
            a("font.glText==null", (Throwable) null);
            return;
        }
        com.corrodinggames.rts.gameFramework.b.a.b bVar = pVar.c;
        r();
        int e = paint.e();
        float a = Color.a(e) * 0.003921569f;
        float b = Color.b(e) * 0.003921569f * a;
        float c = Color.c(e) * 0.003921569f * a;
        float d = Color.d(e) * 0.003921569f * a;
        float k2 = paint.k();
        if (k2 != pVar.a) {
        }
        bVar.a(b, c, d, a, this.d);
        bVar.a(k2 / pVar.a);
        r();
        if (paint.j() == Paint.Align.CENTER) {
            bVar.a(str, f - ((int) (bVar.a(str) * 0.5f)), this.c - f2);
        } else {
            bVar.a(str, f, this.c - f2, 0.0f);
        }
        r();
        bVar.d();
        l();
    }

    @Override // com.corrodinggames.rts.gameFramework.b.k
    public void a(float[] fArr, int i, int i2, v vVar, h hVar) {
        if (this.F == null || this.F.capacity() < i2 * 4) {
            ByteBuffer allocateDirect = ByteBuffer.allocateDirect((i2 * 4) + 10);
            allocateDirect.order(ByteOrder.nativeOrder());
            this.F = allocateDirect.asFloatBuffer();
        }
        this.F.clear();
        this.F.put(fArr, i, i2);
        this.F.flip();
        this.F.position(0);
        float b = vVar.b();
        int a = vVar.a();
        if (b == 0.0f) {
            b = 1.0f;
        }
        a(hVar);
        a(0, a, b);
        if (this.T != null) {
            this.T.a(this.O, this.S);
        }
        q[] qVarArr = this.e;
        int i3 = qVarArr[0].a;
        GLES20.glEnableVertexAttribArray(i3);
        q();
        GLES20.glVertexAttribPointer(i3, 2, 5126, false, 0, (Buffer) this.F);
        a(qVarArr, 0.0f, 0.0f, 1.0f, 1.0f, (l) null);
        GLES20.glDrawArrays(0, 0, i2 / 2);
        q();
        GLES20.glDisableVertexAttribArray(i3);
        q();
    }

    @Override // com.corrodinggames.rts.gameFramework.b.k
    public void a(Bitmap bitmap) {
        if (this.a != null) {
            this.a.b(bitmap);
        }
    }
}