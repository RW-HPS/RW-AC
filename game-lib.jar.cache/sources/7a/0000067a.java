package com.corrodinggames.rts.java;

import android.content.Context;
import android.graphics.ColorFilter;
import android.graphics.LightingColorFilter;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import com.corrodinggames.rts.AssetsID;
import com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.unitAction.aa;
import com.corrodinggames.rts.gameFramework.unitAction.ae;
import com.corrodinggames.rts.gameFramework.unitAction.af;
import com.corrodinggames.rts.gameFramework.unitAction.ag;
import com.corrodinggames.rts.gameFramework.unitAction.w;
import com.corrodinggames.rts.gameFramework.unitAction.y;
import java.awt.FontFormatException;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.locks.Lock;
import org.lwjgl.BufferUtils;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL13;
import org.lwjgl.opengl.GL14;
import org.lwjgl.opengl.GL20;
import org.newdawn.slick.Color;
import org.newdawn.slick.Font;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;
import org.newdawn.slick.ImageBuffer;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.UnicodeFont;
import org.newdawn.slick.font.GlyphPage;
import org.newdawn.slick.font.effects.ColorEffect;
import org.newdawn.slick.imageout.ImageOut;
import org.newdawn.slick.opengl.ImageData;
import org.newdawn.slick.opengl.ImageIOImageData;
import org.newdawn.slick.opengl.PNGImageData;
import org.newdawn.slick.opengl.Texture;
import org.newdawn.slick.opengl.TextureImpl;
import org.newdawn.slick.opengl.renderer.LineStripRenderer;
import org.newdawn.slick.opengl.renderer.Renderer;
import org.newdawn.slick.opengl.renderer.SGL;
import org.newdawn.slick.util.FastTrig;
import org.newdawn.slick.util.ResourceLoader;

/* loaded from: game-lib.jar:com/corrodinggames/rts/java/e.class */
public final class e implements y {
    public boolean b;
    public Graphics f;
    public com.corrodinggames.rts.gameFramework.unitAction.e g;
    public int h;
    public int i;
    public com.corrodinggames.rts.gameFramework.unitAction.f j;
    public static a r;
    public static a s;
    public static a t;
    boolean y;
    static RectF J;
    static RectF K;
    static RectF M;
    float Q;
    float R;
    float S;
    private static LineStripRenderer X;
    public static final Color c = new Color(0, 0, 0, 255);
    public static final Color d = new Color(0, 0, 0, 255);
    public static final Color e = new Color(0, 0, 0, 255);
    public static Graphics k = null;
    static e l = null;
    public static ae m = null;
    private static SGL W = Renderer.get();
    public static final Color A = new Color(0, 0, 0, 255);
    static float B = -1.0f;
    static ArrayList E = new ArrayList();
    static Paint I = new ag();
    static Paint H = new Paint();
    public boolean a = true;
    final Rect n = new Rect();
    final Rect o = new Rect();
    final RectF p = new RectF();
    final PointF q = new PointF();
    ArrayList u = new ArrayList();
    int v = -1;
    Paint w = null;
    LoadImage x = null;
    final Paint z = new Paint();
    f C = new f(this);
    byte[] D = new byte[4];
    int F = 0;
    RectF G = new RectF();
    public float L = 1.0f;
    FloatBuffer N = BufferUtils.createFloatBuffer(3);
    float[] O = new float[0];
    int P = -1;
    g T = new g();
    com.corrodinggames.rts.gameFramework.utility.m U = new com.corrodinggames.rts.gameFramework.utility.m();
    com.corrodinggames.rts.gameFramework.utility.m V = new com.corrodinggames.rts.gameFramework.utility.m();

    static {
        H.a(255, 255, 0, 0);
        H.a(Paint.Style.STROKE);
        J = new RectF();
        K = new RectF();
        X = Renderer.getLineStripRenderer();
    }

    public static void c() {
        W = Renderer.get();
    }

    public Color t() {
        return c;
    }

    @Override // com.corrodinggames.rts.gameFramework.unitAction.y
    /* renamed from: c */
    public e mo9a(com.corrodinggames.rts.gameFramework.unitAction.e eVar) {
        e b = b(eVar);
        b.j = this.j;
        return b;
    }

    @Override // com.corrodinggames.rts.gameFramework.unitAction.y
    /* renamed from: d */
    public e mo10b(com.corrodinggames.rts.gameFramework.unitAction.e eVar) {
        e eVar2 = new e();
        try {
            eVar2.f = e(eVar).C().getGraphics();
            eVar2.g = eVar;
            if (eVar != null) {
                eVar2.h = eVar.m();
                eVar2.i = eVar.l();
            }
            return eVar2;
        } catch (SlickException e2) {
            throw new RuntimeException((Throwable) e2);
        }
    }

    @Override // com.corrodinggames.rts.gameFramework.unitAction.y
    public int m() {
        if (this.g != null) {
            return this.h;
        }
        return (int) GameEngine.getGameEngine().cl;
    }

    @Override // com.corrodinggames.rts.gameFramework.unitAction.y
    public int n() {
        if (this.g != null) {
            return this.i;
        }
        return (int) GameEngine.getGameEngine().cm;
    }

    @Override // com.corrodinggames.rts.gameFramework.unitAction.y
    public void a(int i, int i2) {
        this.h = i;
        this.i = i2;
    }

    @Override // com.corrodinggames.rts.gameFramework.unitAction.y
    public boolean a() {
        return false;
    }

    @Override // com.corrodinggames.rts.gameFramework.unitAction.y
    public void a(Context context) {
    }

    @Override // com.corrodinggames.rts.gameFramework.unitAction.y
    public void b() {
        r = new a((LoadImage) a(AssetsID.drawable.error_outmem));
        r.a("Out of memory");
        s = new a((LoadImage) a(AssetsID.drawable.error_general));
        s.a("General Error");
        t = new a((LoadImage) a(AssetsID.drawable.error_toolargethumb));
        s.a("Too Large Thumbnail Error");
        if (!GameEngine.aC) {
            this.j = new com.corrodinggames.rts.gameFramework.unitAction.f(1024, 1024);
        }
    }

    @Override // com.corrodinggames.rts.gameFramework.unitAction.y
    public com.corrodinggames.rts.gameFramework.unitAction.l d() {
        return null;
    }

    @Override // com.corrodinggames.rts.gameFramework.unitAction.y
    public void a(com.corrodinggames.rts.gameFramework.unitAction.l lVar) {
    }

    @Override // com.corrodinggames.rts.gameFramework.unitAction.y
    public void a(com.corrodinggames.rts.gameFramework.unitAction.a aVar) {
    }

    public static boolean a(String str) {
        for (int i = 0; i < str.length(); i++) {
            if (str.codePointAt(i) > 255) {
                return true;
            }
        }
        return false;
    }

    Font a(f fVar, String str, boolean z) {
        f a = a(fVar, z);
        if (a.a(str)) {
            return a.d;
        }
        UnicodeFont unicodeFont = a.d;
        int i = 0;
        for (GlyphPage glyphPage : unicodeFont.getGlyphPages()) {
            i += glyphPage.getGlyphs().size();
        }
        for (int i2 = 0; i2 < str.length(); i2++) {
            str.charAt(i2);
            if (0 == 0) {
            }
        }
        unicodeFont.getGlyphPages().size();
        unicodeFont.addGlyphs(str);
        try {
            unicodeFont.loadGlyphs();
            int i3 = 0;
            for (GlyphPage glyphPage2 : unicodeFont.getGlyphPages()) {
                i3 += glyphPage2.getGlyphs().size();
            }
            unicodeFont.getGlyphPages().size();
            if (i != i3) {
                GameEngine.m5e("new glypth, " + i3 + " " + a.toString() + " for text:" + str);
            }
            a.b(str);
            return a.d;
        } catch (SlickException e2) {
            throw new RuntimeException((Throwable) e2);
        }
    }

    f a(f fVar, boolean z) {
        Iterator it = this.u.iterator();
        while (it.hasNext()) {
            f fVar2 = (f) it.next();
            if (fVar2.a == fVar.a && fVar2.b == fVar.b && fVar2.c == fVar.c) {
                return fVar2;
            }
        }
        f clone = fVar.clone();
        GameEngine.m5e("New font:" + clone.a + " bold:" + clone.b);
        if (z) {
        }
        String str = "font/Roboto-Regular.ttf";
        if (clone.b) {
            str = "font/Roboto-Bold.ttf";
        }
        if (clone.c) {
            str = "font/DroidSansFallback.ttf";
        }
        try {
            UnicodeFont unicodeFont = new UnicodeFont(java.awt.Font.createFont(0, ResourceLoader.getResourceAsStream(str)).deriveFont(clone.a));
            unicodeFont.addAsciiGlyphs();
            unicodeFont.getEffects().add(new ColorEffect(new java.awt.Color(255, 255, 255)));
            try {
                unicodeFont.loadGlyphs();
            } catch (SlickException e2) {
                throw new RuntimeException((Throwable) e2);
            } catch (OutOfMemoryError e3) {
                GameEngine.a(com.corrodinggames.rts.gameFramework.u.gameImage, e3);
            }
            GameEngine.m5e("loadGlyphs");
            clone.d = unicodeFont;
            this.u.add(clone);
            return clone;
        } catch (FontFormatException e4) {
            throw new RuntimeException((Throwable) e4);
        } catch (IOException e5) {
            throw new RuntimeException(e5);
        }
    }

    public void a(Paint paint, String str) {
        a(paint, true, str, (LoadImage) null, (com.corrodinggames.rts.gameFramework.unitAction.e) null);
    }

    public void b(Paint paint) {
        a(paint, false, (String) null, (LoadImage) null, (com.corrodinggames.rts.gameFramework.unitAction.e) null);
    }

    public void a(Paint paint, LoadImage loadImage, com.corrodinggames.rts.gameFramework.unitAction.e eVar) {
        a(paint, false, (String) null, loadImage, eVar);
    }

    public void u() {
        y();
        Graphics.setCurrent(this.f);
        b(true);
        this.b = true;
        B = -1.0f;
        Color.setRebindRequired();
        this.w = this.z;
        l = this;
    }

    public void a(Paint paint, boolean z, String str, LoadImage loadImage, com.corrodinggames.rts.gameFramework.unitAction.e eVar) {
        boolean c2;
        boolean z2 = false;
        if (k != this.f) {
            u();
            z2 = true;
            k = this.f;
        }
        if ((paint == null || (paint instanceof ag)) && this.w == paint && this.x == loadImage && !z) {
            ae aeVar = null;
            if (this.a) {
                if (paint != null && (paint instanceof ag)) {
                    aeVar = ((ag) paint).q();
                }
                if (eVar != null && aeVar == null) {
                    aeVar = eVar.B();
                }
            }
            if (m == aeVar) {
                if (m != null && m.a(paint, eVar)) {
                    this.f.flushBuffer();
                    b(m);
                    return;
                }
                return;
            }
        }
        this.w = paint;
        this.x = loadImage;
        boolean z3 = loadImage == null && !z;
        if (this.v != Graphics.MODE_NORMAL) {
            this.v = Graphics.MODE_NORMAL;
            this.f.setDrawMode(this.v);
        }
        if (z2 && this.g != null) {
            W.glEnable(3042);
            W.glColorMask(true, true, true, true);
            GL14.glBlendFuncSeparate(770, 771, 770, 1);
        }
        if (paint == null) {
            c2 = false;
            a(Color.white);
            if (z3) {
                a(1.0f);
            }
            if (z) {
                this.f.resetFont();
            }
        } else {
            c2 = paint.c();
        }
        if (this.a) {
            ae aeVar2 = null;
            if (paint != null && (paint instanceof ag)) {
                aeVar2 = ((ag) paint).q();
            }
            if (eVar != null && aeVar2 == null) {
                aeVar2 = eVar.B();
            }
            if (m != aeVar2) {
                this.f.flushBuffer();
                if (aeVar2 == null) {
                    v();
                } else {
                    aeVar2.f();
                    if (!c(aeVar2)) {
                        if (m != null) {
                            v();
                        }
                    } else {
                        aeVar2.a(paint, eVar);
                        b(aeVar2);
                    }
                }
                m = aeVar2;
            } else if (m != null && m.a(paint, eVar)) {
                this.f.flushBuffer();
                b(m);
            }
        }
        if (loadImage != null) {
            if ((loadImage.E == 1) != c2) {
                this.f.flushBuffer();
                int i = c2 ? 1 : 2;
                loadImage.C().setFilter(i);
                loadImage.E = i;
            }
        }
        if (paint != null) {
            boolean z4 = true;
            ColorFilter h = paint.h();
            if (h != null) {
                if (h instanceof LightingColorFilter) {
                    LightingColorFilter lightingColorFilter = (LightingColorFilter) h;
                    if (lightingColorFilter.a != 0 && lightingColorFilter.a != -1) {
                        int i2 = lightingColorFilter.a;
                        d.r = android.graphics.Color.b(i2) * 0.003921569f;
                        d.g = android.graphics.Color.c(i2) * 0.003921569f;
                        d.b = android.graphics.Color.d(i2) * 0.003921569f;
                        d.a = android.graphics.Color.a(i2) * 0.003921569f;
                        a(paint.e(), e);
                        d.r *= e.r;
                        d.g *= e.g;
                        d.b *= e.b;
                        d.a *= e.a;
                        a(d);
                        this.v = Graphics.MODE_ADD;
                        this.f.setDrawMode(this.v);
                        W.glEnable(3042);
                        W.glColorMask(true, true, true, true);
                        W.glBlendFunc(770, 1);
                        z4 = false;
                    }
                } else if (h instanceof com.corrodinggames.rts.gameFramework.unitAction.v) {
                    com.corrodinggames.rts.gameFramework.unitAction.v vVar = (com.corrodinggames.rts.gameFramework.unitAction.v) h;
                    if (vVar.a == w.copy) {
                        f(paint.e());
                        this.v = 99;
                        W.glEnable(3042);
                        W.glColorMask(true, true, true, true);
                        W.glBlendFunc(1, 1);
                        z4 = false;
                    } else if (vVar.a == w.additive) {
                        f(paint.e());
                        this.v = 99;
                        W.glEnable(3042);
                        W.glColorMask(true, true, true, true);
                        W.glBlendFunc(774, 771);
                        z4 = false;
                    }
                }
            }
            if (z4) {
                f(paint.e());
            }
            if (z3) {
                if (paint.g() != 0.0f) {
                    a(paint.g());
                } else {
                    a(1.0f);
                }
            }
            if (z) {
                this.f.setFont(a(paint, str, true));
            }
        }
    }

    public void v() {
        GL20.glUseProgram(0);
    }

    public void b(ae aeVar) {
        af[] afVarArr;
        for (af afVar : aeVar.p) {
            if (afVar.c) {
                afVar.c = false;
                if (afVar.b == -1) {
                    afVar.b = GL20.glGetUniformLocation(aeVar.n, afVar.a);
                    if (afVar.b == -1 && !afVar.d) {
                        afVar.d = true;
                        aeVar.b("Unknown parameter: " + afVar.a);
                        int glGetProgrami = GL20.glGetProgrami(aeVar.n, 35718);
                        int glGetProgrami2 = GL20.glGetProgrami(aeVar.n, 35719);
                        for (int i = 0; i < glGetProgrami; i++) {
                            aeVar.b("Possible parameter: " + GL20.glGetActiveUniform(aeVar.n, i, glGetProgrami2));
                        }
                        return;
                    }
                }
                if (afVar.f != null) {
                    Texture texture = e(afVar.f).C().getTexture();
                    if (afVar.g) {
                        GL20.glUniform2f(afVar.b, texture.getTextureWidth(), texture.getTextureHeight());
                    } else {
                        int textureID = texture.getTextureID();
                        aeVar.b("Updating texture to:" + textureID);
                        GL20.glUniform1i(afVar.b, 1);
                        GL13.glActiveTexture(33985);
                        GL11.glBindTexture(3553, textureID);
                        GL13.glActiveTexture(33984);
                    }
                } else if (afVar.e.length == 1) {
                    GL20.glUniform1f(afVar.b, afVar.e[0]);
                } else if (afVar.e.length == 2) {
                    GL20.glUniform2f(afVar.b, afVar.e[0], afVar.e[1]);
                } else if (afVar.e.length == 4) {
                    GL20.glUniform4f(afVar.b, afVar.e[0], afVar.e[1], afVar.e[2], afVar.e[3]);
                } else {
                    aeVar.b("Unhandled parameter size: " + afVar.a + " - " + afVar.e.length);
                }
            }
        }
    }

    public boolean c(ae aeVar) {
        if (aeVar.o != 0) {
            return false;
        }
        if (aeVar.n != 0 && !aeVar.m) {
            GL20.glUseProgram(aeVar.n);
            return true;
        }
        aeVar.m = false;
        aeVar.b("Compiling shader");
        aeVar.g = a(aeVar, 35633, aeVar.e);
        aeVar.h = a(aeVar, 35632, aeVar.f);
        if (aeVar.o != 0) {
            return false;
        }
        aeVar.n = GL20.glCreateProgram();
        if (aeVar.n == 0) {
            aeVar.c("could not create program; check ShaderProgram.isSupported()");
            return false;
        }
        GL20.glAttachShader(aeVar.n, aeVar.g);
        GL20.glAttachShader(aeVar.n, aeVar.h);
        GL20.glLinkProgram(aeVar.n);
        int glGetProgrami = GL20.glGetProgrami(aeVar.n, 35714);
        String glGetProgramInfoLog = GL20.glGetProgramInfoLog(aeVar.n, GL20.glGetProgrami(aeVar.n, 35716));
        if (glGetProgramInfoLog != null && glGetProgramInfoLog.length() != 0) {
            aeVar.d = glGetProgramInfoLog + "\n" + aeVar.d;
        }
        if (aeVar.d != null) {
            aeVar.d = aeVar.d.trim();
        }
        if (glGetProgrami == 0) {
            aeVar.c(aeVar.d.length() != 0 ? aeVar.d : "Could not link program");
            return false;
        }
        GL20.glUseProgram(aeVar.n);
        return true;
    }

    protected int a(ae aeVar, int i, String str) {
        int glCreateShader = GL20.glCreateShader(i);
        if (glCreateShader == 0) {
            aeVar.c("could not create shader object; check ShaderProgram.isSupported()");
        }
        GL20.glShaderSource(glCreateShader, str);
        GL20.glCompileShader(glCreateShader);
        int glGetShaderi = GL20.glGetShaderi(glCreateShader, 35713);
        int glGetShaderi2 = GL20.glGetShaderi(glCreateShader, 35716);
        String e2 = e(i);
        String glGetShaderInfoLog = GL20.glGetShaderInfoLog(glCreateShader, glGetShaderi2);
        if (glGetShaderInfoLog != null && glGetShaderInfoLog.length() != 0) {
            aeVar.d += e2 + " compile log:\n" + glGetShaderInfoLog + "\n";
        }
        if (glGetShaderi == 0) {
            aeVar.c(aeVar.d.length() != 0 ? aeVar.d : "Could not compile " + e(i));
        }
        return glCreateShader;
    }

    private String e(int i) {
        if (i == 35632) {
            return "FRAGMENT_SHADER";
        }
        if (i == 35633) {
            return "VERTEX_SHADER";
        }
        return "shader";
    }

    private void f(int i) {
        a(i, A);
        a(A);
    }

    private void a(Color color) {
        Color color2 = c;
        if (this.b) {
            this.b = false;
        } else if (color2.r == color.r && color2.g == color.g && color2.b == color.b && color2.a == color.a) {
            return;
        }
        color2.a = color.a;
        color2.r = color.r;
        color2.g = color.g;
        color2.b = color.b;
        this.f.setColor(color2);
    }

    public void a(float f) {
        if (B != f) {
            B = f;
            this.f.setLineWidth(f);
        }
    }

    public Font a(Paint paint, String str, boolean z) {
        f fVar = this.C;
        fVar.a = (int) paint.k();
        if (x()) {
            fVar.a = (int) (fVar.a * this.L);
        }
        Typeface i = paint.i();
        fVar.b = false;
        if (i != null) {
            fVar.b = i.a();
        }
        fVar.c = false;
        if (a(str)) {
            fVar.c = true;
        }
        return a(fVar, str, z);
    }

    public static void a(ImageData imageData, ByteBuffer byteBuffer, int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        int texWidth = (i + (i2 * imageData.getTexWidth())) * i7;
        if (ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN) {
            byteBuffer.put(texWidth, (byte) i5);
            byteBuffer.put(texWidth + 1, (byte) i4);
            byteBuffer.put(texWidth + 2, (byte) i3);
            byteBuffer.put(texWidth + 3, (byte) i6);
            return;
        }
        byteBuffer.put(texWidth, (byte) i3);
        byteBuffer.put(texWidth + 1, (byte) i4);
        byteBuffer.put(texWidth + 2, (byte) i5);
        byteBuffer.put(texWidth + 3, (byte) i6);
    }

    public static int a(ImageData imageData, ByteBuffer byteBuffer, int i, int i2, int i3) {
        int i4;
        int i5;
        int i6;
        int i7;
        int texWidth = (i + (i2 * imageData.getTexWidth())) * i3;
        if (i3 == 4) {
        }
        if (ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN) {
            i6 = byteBuffer.get(texWidth) & 255;
            i5 = byteBuffer.get(texWidth + 1) & 255;
            i4 = byteBuffer.get(texWidth + 2) & 255;
        } else {
            i4 = byteBuffer.get(texWidth) & 255;
            i5 = byteBuffer.get(texWidth + 1) & 255;
            i6 = byteBuffer.get(texWidth + 2) & 255;
        }
        if (i3 < 4) {
            i7 = 255;
        } else {
            i7 = byteBuffer.get(texWidth + 3) & 255;
        }
        return a(i7, i4, i5, i6);
    }

    public static final int a(int i, int i2, int i3, int i4) {
        return (i << 24) | (i2 << 16) | (i3 << 8) | i4;
    }

    public static Color a(int i, Color color) {
        color.r = ((i >> 16) & 255) * 0.003921569f;
        color.g = ((i >> 8) & 255) * 0.003921569f;
        color.b = (i & 255) * 0.003921569f;
        color.a = (i >>> 24) * 0.003921569f;
        return color;
    }

    @Override // com.corrodinggames.rts.gameFramework.unitAction.y
    public com.corrodinggames.rts.gameFramework.unitAction.e a(int i) {
        return a(i, true);
    }

    @Override // com.corrodinggames.rts.gameFramework.unitAction.y
    public void e() {
        w();
    }

    public static void w() {
        if (E.size() == 0) {
            return;
        }
        Iterator it = E.iterator();
        while (it.hasNext()) {
            ((LoadImage) it.next()).I();
        }
        E.clear();
    }

    public static void a(LoadImage loadImage) {
        E.add(loadImage);
        if (E.size() > 15) {
            w();
        }
    }

    public static LoadImage b(int i, boolean z) {
        String f = com.corrodinggames.rts.gameFramework.f.f(i);
        try {
            FileInputStream fileInputStream = new FileInputStream(f);
            ImageData a = a(fileInputStream);
            fileInputStream.close();
            return a(a, f);
        } catch (IOException e2) {
            throw new RuntimeException(e2);
        } catch (OutOfMemoryError e3) {
            GameEngine.a(com.corrodinggames.rts.gameFramework.u.gameImage, e3);
            if (r == null) {
                throw new RuntimeException("outOfMemoryErrorImage==null", e3);
            }
            return r;
        }
    }

    @Override // com.corrodinggames.rts.gameFramework.unitAction.y
    public com.corrodinggames.rts.gameFramework.unitAction.e a(int i, boolean z) {
        return b(i, z);
    }

    public static ImageData a(InputStream inputStream) {
        PNGImageData imageData;
        BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream);
        try {
            try {
                bufferedInputStream.mark(Integer.MAX_VALUE);
                PNGImageData pNGImageData = new PNGImageData();
                pNGImageData.loadImage(bufferedInputStream);
                imageData = pNGImageData;
            } catch (IOException e2) {
                bufferedInputStream.reset();
                GameEngine.m5e("PNG load failed: " + e2.getMessage());
                GameEngine.m5e("Attempting load with ImageIO..");
                ImageIOImageData imageIOImageData = new ImageIOImageData();
                imageData = new com.corrodinggames.rts.java.image.ImageData(imageIOImageData, imageIOImageData.loadImage(bufferedInputStream, false, (int[]) null));
            }
            return imageData;
        } finally {
            bufferedInputStream.close();
        }
    }

    @Override // com.corrodinggames.rts.gameFramework.unitAction.y
    public com.corrodinggames.rts.gameFramework.unitAction.e a(InputStream inputStream, boolean z) {
        try {
            String str = null;
            if (inputStream instanceof com.corrodinggames.rts.gameFramework.utility.j) {
                str = ((com.corrodinggames.rts.gameFramework.utility.j) inputStream).d();
            } else {
                GameEngine.print("loadImage InputStream is not AssetInputStream");
                GameEngine.T();
            }
            this.F++;
            return a(a(inputStream), str);
        } catch (IOException e2) {
            throw new RuntimeException(e2);
        } catch (OutOfMemoryError e3) {
            GameEngine.a(com.corrodinggames.rts.gameFramework.u.gameImage, e3);
            if (r == null) {
                throw new RuntimeException("outOfMemoryErrorImage==null", e3);
            }
            return r;
        }
    }

    public static LoadImage a(ImageData imageData, String str) {
        LoadImage loadImage = new LoadImage();
        loadImage.a(imageData, str, false);
        a(loadImage);
        return loadImage;
    }

    @Override // com.corrodinggames.rts.gameFramework.unitAction.y
    public com.corrodinggames.rts.gameFramework.unitAction.e a(int i, int i2, boolean z) {
        LoadImage loadImage = new LoadImage();
        try {
            loadImage.a(new Image(i, i2), (String) null);
            a(loadImage);
            return loadImage;
        } catch (SlickException e2) {
            throw new RuntimeException((Throwable) e2);
        } catch (OutOfMemoryError e3) {
            GameEngine.a(com.corrodinggames.rts.gameFramework.u.gameImageCreate, e3);
            if (r == null) {
                throw new RuntimeException("outOfMemoryErrorImage==null", e3);
            }
            return r;
        }
    }

    @Override // com.corrodinggames.rts.gameFramework.unitAction.y
    public com.corrodinggames.rts.gameFramework.unitAction.e b(int i, int i2, boolean z) {
        return a((ImageData) new ImageBuffer(i, i2), (String) null);
    }

    @Override // com.corrodinggames.rts.gameFramework.unitAction.y
    public void a(com.corrodinggames.rts.gameFramework.unitAction.e eVar, float f, float f2, float f3, Paint paint) {
        k();
        a(f3 + 90.0f, f, f2);
        c(eVar, f - eVar.r, f2 - eVar.s, paint);
        l();
    }

    @Override // com.corrodinggames.rts.gameFramework.unitAction.y
    public void a(com.corrodinggames.rts.gameFramework.unitAction.e eVar, Rect rect, float f, float f2, float f3, Paint paint) {
        k();
        a(f3, f, f2);
        this.G.a(f - eVar.r, f2 - eVar.s, eVar.p, eVar.q);
        a(eVar, rect, this.G, paint);
        l();
    }

    @Override // com.corrodinggames.rts.gameFramework.unitAction.y
    public void a(com.corrodinggames.rts.gameFramework.unitAction.e eVar, Rect rect, Rect rect2, Paint paint) {
        this.G.a(rect2);
        a(eVar, rect, this.G, paint);
    }

    @Override // com.corrodinggames.rts.gameFramework.unitAction.y
    public void b(com.corrodinggames.rts.gameFramework.unitAction.e eVar, Rect rect, Rect rect2, Paint paint) {
        this.G.a(rect2);
        a(eVar, rect, this.G, paint);
    }

    @Override // com.corrodinggames.rts.gameFramework.unitAction.y
    public void a(Rect rect, Paint paint) {
        this.G.a(rect);
        a(this.G, paint);
    }

    @Override // com.corrodinggames.rts.gameFramework.unitAction.y
    public void a(boolean z) {
    }

    @Override // com.corrodinggames.rts.gameFramework.unitAction.y
    public void f() {
    }

    private final LoadImage e(com.corrodinggames.rts.gameFramework.unitAction.e eVar) {
        return (LoadImage) eVar.c();
    }

    @Override // com.corrodinggames.rts.gameFramework.unitAction.y
    public void a(com.corrodinggames.rts.gameFramework.unitAction.e eVar, Rect rect, RectF rectF, Paint paint) {
        a(eVar, rectF.a, rectF.b, rectF.c, rectF.d, rect.a, rect.b, rect.c, rect.d, paint);
    }

    private void c(com.corrodinggames.rts.gameFramework.unitAction.e eVar, float f, float f2, Paint paint) {
        float m2 = eVar.m();
        float l2 = eVar.l();
        a(eVar, f, f2, f + m2, f2 + l2, 0.0f, 0.0f, m2, l2, paint);
    }

    private void a(com.corrodinggames.rts.gameFramework.unitAction.e eVar, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, Paint paint) {
        com.corrodinggames.rts.gameFramework.unitAction.g a;
        g gVar = this.T;
        float f9 = f3 - f;
        float f10 = f4 - f2;
        if (gVar.c != -90.0f) {
            float f11 = f9 / 2.0f;
            float f12 = f10 / 2.0f;
            float f13 = (f + f11) - gVar.g;
            float f14 = (f2 + f12) - gVar.h;
            if ((f13 != 0.0f || f14 != 0.0f) && (f13 > 0.01f || f14 > 0.01f || f13 < -0.01f || f14 < -0.01f)) {
                PointF pointF = this.q;
                pointF.x = f13;
                pointF.y = f14;
                a(gVar.c + 180.0f, pointF);
                float f15 = (pointF.x + gVar.g) - f11;
                float f16 = (pointF.y + gVar.h) - f12;
                f3 += f15 - f;
                f4 += f16 - f2;
                f = f15;
                f2 = f16;
            }
        }
        LoadImage e2 = e(eVar);
        if (this.j != null && e2.m() < 450 && e2.l() < 100 && (a = this.j.a(e2)) != null) {
            e2 = e(a.a);
            if (f5 < 0.0f) {
                f += -f5;
                f5 = 0.0f;
            }
            if (f6 < 0.0f) {
                f2 += -f6;
                f6 = 0.0f;
            }
            if (f7 > a.d) {
                f3 += -(a.d - f7);
                f7 = a.d;
            }
            if (f8 > a.e) {
                f4 += -(a.e - f8);
                f8 = a.e;
            }
            f5 += a.b;
            f7 += a.b;
            f6 += a.c;
            f8 += a.c;
        }
        float f17 = f * gVar.d;
        float f18 = f2 * gVar.e;
        float f19 = (f3 - f) * gVar.d;
        float f20 = (f4 - f2) * gVar.e;
        float f21 = f17 + gVar.a;
        float f22 = f18 + gVar.b;
        float f23 = f19 / 2.0f;
        float f24 = f20 / 2.0f;
        a(paint, e2, eVar);
        Image C = e2.C();
        if (C == null) {
            e2.G();
            throw new RuntimeException("getSlickImage==null");
        } else {
            a(C, f21 + f23, f22 + f24, f19, f20, f5, f6, f7, f8, t(), gVar.c);
        }
    }

    private void a(Image image, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, Color color, float f9) {
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        float f15;
        float f16;
        float f17;
        Graphics.setCurrent(this.f);
        image.startUse();
        if (color != null) {
            color.bind();
        }
        float f18 = f3 * 0.5f;
        float f19 = f4 * 0.5f;
        float textureWidth = image.getTextureWidth() / image.getWidth();
        float textureHeight = image.getTextureHeight() / image.getHeight();
        float f20 = f5 * textureWidth;
        float f21 = f6 * textureHeight;
        float f22 = (f7 - f5) * textureWidth;
        float f23 = (f8 - f6) * textureHeight;
        float f24 = f9 + 90.0f;
        if (f24 == 0.0f) {
            f10 = (-f18) + f;
            f11 = (-f19) + f2;
            f12 = f18 + f;
            f13 = (-f19) + f2;
            f14 = (-f18) + f;
            f15 = f19 + f2;
            f16 = f18 + f;
            f17 = f19 + f2;
        } else {
            float k2 = com.corrodinggames.rts.gameFramework.f.k(f24);
            float j = com.corrodinggames.rts.gameFramework.f.j(f24);
            float f25 = f18 * k2;
            float f26 = f19 * k2;
            float f27 = f18 * j;
            float f28 = f19 * j;
            f10 = (-f25) + f28 + f;
            f11 = ((-f27) - f26) + f2;
            f12 = f25 + f28 + f;
            f13 = (f27 - f26) + f2;
            f14 = ((-f25) - f28) + f;
            f15 = (-f27) + f26 + f2;
            f16 = (f25 - f28) + f;
            f17 = f27 + f26 + f2;
        }
        W.glTexCoord2f(f20, f21);
        W.glVertex3f(f10, f11, 0.0f);
        W.glTexCoord2f(f20, f21 + f23);
        W.glVertex3f(f14, f15, 0.0f);
        W.glTexCoord2f(f20 + f22, f21 + f23);
        W.glVertex3f(f16, f17, 0.0f);
        W.glTexCoord2f(f20 + f22, f21);
        W.glVertex3f(f12, f13, 0.0f);
        image.endUse();
        this.f.getColor().bind();
    }

    @Override // com.corrodinggames.rts.gameFramework.unitAction.y
    public void a(com.corrodinggames.rts.gameFramework.unitAction.e eVar, float f, float f2, Paint paint) {
        b(eVar, f - eVar.t, f2 - eVar.u, paint);
    }

    @Override // com.corrodinggames.rts.gameFramework.unitAction.y
    public void a(com.corrodinggames.rts.gameFramework.unitAction.e eVar, float f, float f2, Paint paint, float f3, float f4) {
        k();
        b(f, f2);
        a(f4, f4);
        a(f3, f, f2);
        c(eVar, 0.0f, 0.0f, paint);
        l();
    }

    @Override // com.corrodinggames.rts.gameFramework.unitAction.y
    public void b(com.corrodinggames.rts.gameFramework.unitAction.e eVar, float f, float f2, Paint paint) {
        c(eVar, f, f2, paint);
    }

    @Override // com.corrodinggames.rts.gameFramework.unitAction.y
    public void a(com.corrodinggames.rts.gameFramework.unitAction.e eVar, Rect rect, Paint paint) {
        a(eVar, rect, paint, 0, 0, 0, 0);
    }

    @Override // com.corrodinggames.rts.gameFramework.unitAction.y
    public void a(com.corrodinggames.rts.gameFramework.unitAction.e eVar, Rect rect, Paint paint, int i, int i2, int i3, int i4) {
        aa.a(this, eVar, rect, paint, i, i2, i3, i4);
    }

    @Override // com.corrodinggames.rts.gameFramework.unitAction.y
    public void a(com.corrodinggames.rts.gameFramework.unitAction.e eVar, RectF rectF, Paint paint, float f, float f2, int i, int i2) {
        aa.a(this, eVar, rectF, paint, f, f2, i, i2);
    }

    @Override // com.corrodinggames.rts.gameFramework.unitAction.y
    public void b(int i) {
        if (l != this) {
            u();
        }
        b(false);
        this.w = null;
        this.f.setBackground(a(i, e));
        this.f.clear();
    }

    @Override // com.corrodinggames.rts.gameFramework.unitAction.y
    public void o() {
        if (l != this) {
            u();
        }
        this.w = null;
        this.f.clearAlphaMap();
    }

    @Override // com.corrodinggames.rts.gameFramework.unitAction.y
    public void a(int i, PorterDuff.Mode mode) {
        this.w = null;
        if (mode != PorterDuff.Mode.CLEAR) {
            b(i);
            return;
        }
        b(i);
        this.f.clearAlphaMap();
    }

    @Override // com.corrodinggames.rts.gameFramework.unitAction.y
    public void a(String str, float f, float f2, Paint paint, Paint paint2, float f3) {
        float b = b(str, paint);
        J.a(f, f2, f + b, f2 + a(str, paint));
        com.corrodinggames.rts.gameFramework.f.a(J, f3);
        K.a(J);
        if (paint.j() == Paint.Align.CENTER) {
            J.a(-(b / 2.0f), 0.0f);
        }
        a(J, paint2);
        a(str, K.a + f3, K.d - f3, paint);
    }

    boolean x() {
        if (!GameEngine.getGameEngine().settingsEngine.resizeFontWithUIScale || this.L == 1.0f) {
            return false;
        }
        if (this.L < 1.0f) {
            return true;
        }
        return true;
    }

    @Override // com.corrodinggames.rts.gameFramework.unitAction.y
    public void a(String str, float f, float f2, Paint paint) {
        if (x()) {
            k();
            float f3 = 1.0f / this.L;
            a(f3, f3);
            f *= this.L;
            f2 *= this.L;
        }
        float f4 = f * this.T.d;
        float f5 = f2 * this.T.e;
        float f6 = f4 + this.T.a;
        float f7 = f5 + this.T.b;
        a(paint, str);
        int i = 0;
        if (paint.j() == Paint.Align.CENTER) {
            i = 0 - (this.f.getFont().getWidth(str) / 2);
        } else if (paint.j() == Paint.Align.RIGHT) {
            i = 0 - this.f.getFont().getWidth(str);
        }
        this.f.drawString(str, (int) (f6 + i), (int) (f7 + (0 - this.f.getFont().getLineHeight())));
        if (x()) {
            l();
        }
    }

    @Override // com.corrodinggames.rts.gameFramework.unitAction.y
    public void b(Rect rect, Paint paint) {
        this.G.a(rect);
        a(this.G, paint);
    }

    @Override // com.corrodinggames.rts.gameFramework.unitAction.y
    public void a(RectF rectF, Paint paint) {
        b(paint);
        if (paint.d() == Paint.Style.FILL || paint.d() == Paint.Style.FILL_AND_STROKE) {
            TextureImpl.bindNone();
            W.glBegin(7);
            float f = rectF.a;
            float f2 = rectF.b;
            float f3 = rectF.c;
            float f4 = rectF.d;
            float f5 = f * this.T.d;
            float f6 = f2 * this.T.e;
            float f7 = f5 + this.T.a;
            float f8 = f6 + this.T.b;
            float f9 = f3 * this.T.d;
            float f10 = f4 * this.T.e;
            float f11 = f9 + this.T.a;
            float f12 = f10 + this.T.b;
            W.glVertex2f(f7, f8);
            W.glVertex2f(f11, f8);
            W.glVertex2f(f11, f12);
            W.glVertex2f(f7, f12);
            W.glEnd();
            return;
        }
        float f13 = rectF.a;
        float f14 = rectF.b;
        float b = rectF.b();
        float c2 = rectF.c();
        float f15 = f13 * this.T.d;
        float f16 = f14 * this.T.e;
        this.f.drawRect(f15 + this.T.a, f16 + this.T.b, b * this.T.d, c2 * this.T.e);
    }

    @Override // com.corrodinggames.rts.gameFramework.unitAction.y
    public void g() {
        e();
        M = null;
        if (this.j != null) {
            this.j.c();
        }
    }

    @Override // com.corrodinggames.rts.gameFramework.unitAction.y
    public void h() {
        y();
        if (this.j != null) {
            this.j.d();
        }
        if (this.a && m != null) {
            v();
            m = null;
        }
        this.w = null;
        M = null;
        this.b = true;
        B = -1.0f;
        this.y = false;
    }

    @Override // com.corrodinggames.rts.gameFramework.unitAction.y
    public void c(Rect rect, Paint paint) {
        this.o.a(rect.a, rect.b, rect.a + rect.c, rect.b + rect.d);
        b(this.o, paint);
    }

    @Override // com.corrodinggames.rts.gameFramework.unitAction.y
    public void a(Rect rect) {
        if (rect != null) {
            this.T.f = new RectF(rect);
            this.T.f.a *= this.T.d;
            this.T.f.c *= this.T.d;
            this.T.f.b *= this.T.e;
            this.T.f.d *= this.T.e;
            this.T.f.a(this.T.a, this.T.b);
        } else {
            this.T.f = null;
        }
        b(false);
    }

    @Override // com.corrodinggames.rts.gameFramework.unitAction.y
    public void a(RectF rectF) {
        if (rectF != null) {
            this.T.f = new RectF(rectF);
            this.T.f.a *= this.T.d;
            this.T.f.c *= this.T.d;
            this.T.f.b *= this.T.e;
            this.T.f.d *= this.T.e;
            this.T.f.a(this.T.a, this.T.b);
        } else {
            this.T.f = null;
        }
        b(false);
    }

    public void b(boolean z) {
        RectF rectF = this.T.f;
        if (M == rectF && !z) {
            return;
        }
        y();
        if (rectF != null) {
            W.glEnable(3089);
            W.glScissor((int) rectF.a, (int) ((n() * this.L) - rectF.d), (int) rectF.b(), (int) rectF.c());
        } else {
            W.glDisable(3089);
        }
        M = rectF;
    }

    @Override // com.corrodinggames.rts.gameFramework.unitAction.y
    public void b(float f, float f2, float f3, Paint paint) {
        float f4 = f * this.T.d;
        float f5 = f2 * this.T.e;
        float f6 = f4 + this.T.a;
        float f7 = f5 + this.T.b;
        float f8 = f3 * this.T.d;
        b(paint);
        if (paint.d() == Paint.Style.STROKE) {
            int i = 40;
            if (f8 > 100.0f) {
                i = 60;
            }
            a(f6, f7, f8, i);
            return;
        }
        this.f.fillOval(f6 - f8, f7 - f8, f8 * 2.0f, f8 * 2.0f);
    }

    @Override // com.corrodinggames.rts.gameFramework.unitAction.y
    public void a(float f, float f2, float f3, Paint paint) {
        float f4 = this.T.d;
        if (f3 * f4 < 25.0f && paint.d() == Paint.Style.STROKE) {
            aa.a(this, f, f2, f3, paint, f4);
        } else {
            b(f, f2, f3, paint);
        }
    }

    public FloatBuffer c(int i) {
        if (this.N.capacity() < i) {
            this.N = BufferUtils.createFloatBuffer(i);
        }
        return this.N;
    }

    public FloatBuffer a(float[] fArr, int i) {
        FloatBuffer c2 = c(i);
        c2.clear();
        c2.put(fArr, 0, i);
        c2.flip();
        return c2;
    }

    public float[] d(int i) {
        if (this.O.length < i) {
            this.O = new float[i];
        }
        return this.O;
    }

    @Override // com.corrodinggames.rts.gameFramework.unitAction.y
    public void a(float[] fArr, int i, int i2, Paint paint) {
        if (i2 == 0) {
            return;
        }
        boolean z = true;
        if (Main.b) {
            z = false;
        }
        float g = paint.g();
        float f = 1.0f;
        float f2 = 0.0f;
        if (g > 1.0f) {
            f = 1.0f + ((g - 1.0f) * 0.5f);
            f2 = 0.0f + ((g - 1.0f) * 0.5f);
        }
        float f3 = this.T.d;
        float f4 = this.T.e;
        float f5 = this.T.a;
        float f6 = this.T.b;
        if (z) {
            float[] d2 = d(i2 * 4);
            int i3 = i2 * 4;
            int i4 = 0;
            for (int i5 = 0; i5 < i3; i5 += 8) {
                float f7 = fArr[i4];
                float f8 = fArr[i4 + 1];
                float f9 = f7 - f2;
                float f10 = f7 + f;
                float f11 = f8 - f2;
                float f12 = f8 + f;
                d2[i5 + 0] = f9;
                d2[i5 + 1] = f11;
                d2[i5 + 2] = f10;
                d2[i5 + 3] = f11;
                d2[i5 + 4] = f10;
                d2[i5 + 5] = f12;
                d2[i5 + 6] = f9;
                d2[i5 + 7] = f12;
                i4 += 2;
            }
            b(d2, 0, i2 * 4, paint);
            return;
        }
        b(paint);
        TextureImpl.bindNone();
        W.glBegin(7);
        int i6 = i + i2;
        for (int i7 = i; i7 < i6; i7 += 2) {
            float f13 = fArr[i7] * f3;
            float f14 = fArr[i7 + 1] * f4;
            float f15 = f13 + f5;
            float f16 = f14 + f6;
            float f17 = f15 - f2;
            float f18 = f15 + f;
            float f19 = f16 - f2;
            float f20 = f16 + f;
            W.glVertex2f(f17, f19);
            W.glVertex2f(f18, f19);
            W.glVertex2f(f18, f20);
            W.glVertex2f(f17, f20);
        }
        W.glEnd();
    }

    public void b(float[] fArr, int i, int i2, Paint paint) {
        boolean z = Main.a;
        if (z) {
            GL11.glDisableClientState(32886);
        }
        b(paint);
        TextureImpl.bindNone();
        GL11.glEnableClientState(32884);
        GL11.glVertexPointer(2, 0, a(fArr, i2));
        GL11.glDrawArrays(7, i, i2 / 2);
        if (z) {
            GL11.glEnableClientState(32886);
        }
    }

    public void a(float f, float f2, float f3, int i) {
        Graphics.setCurrent(this.f);
        TextureImpl.bindNone();
        if (this.P != i) {
            this.P = i;
            this.Q = 6.283185f / i;
            this.R = (float) FastTrig.cos(this.Q);
            this.S = (float) FastTrig.sin(this.Q);
        }
        float f4 = this.R;
        float f5 = this.S;
        float f6 = f3;
        float f7 = 0.0f;
        X.start();
        int i2 = i + 1;
        float f8 = f6 + f;
        float f9 = 0.0f + f2;
        for (int i3 = 0; i3 < i2; i3++) {
            X.vertex(f6 + f, f7 + f2);
            float f10 = f6;
            f6 = (f4 * f6) - (f5 * f7);
            f7 = (f5 * f10) + (f4 * f7);
        }
        X.end();
    }

    @Override // com.corrodinggames.rts.gameFramework.unitAction.y
    public void i() {
        z();
    }

    @Override // com.corrodinggames.rts.gameFramework.unitAction.y
    public void j() {
        A();
    }

    @Override // com.corrodinggames.rts.gameFramework.unitAction.y
    public void k() {
        z();
    }

    @Override // com.corrodinggames.rts.gameFramework.unitAction.y
    public void l() {
        A();
    }

    @Override // com.corrodinggames.rts.gameFramework.unitAction.y
    public void a(float f, float f2, float f3) {
        this.T.c += f;
        this.T.g = f2;
        this.T.h = f3;
    }

    public static void a(float f, PointF pointF) {
        float j = com.corrodinggames.rts.gameFramework.f.j(f);
        float k2 = com.corrodinggames.rts.gameFramework.f.k(f);
        float f2 = pointF.x;
        float f3 = pointF.y;
        pointF.x = (k2 * f3) - (j * f2);
        pointF.y = (j * f3) + (k2 * f2);
    }

    @Override // com.corrodinggames.rts.gameFramework.unitAction.y
    public void a(float f, float f2) {
        this.T.d *= f;
        this.T.e *= f2;
    }

    @Override // com.corrodinggames.rts.gameFramework.unitAction.y
    public void a(float f, float f2, float f3, float f4) {
        b(f3, f4);
        a(f, f2);
        b(-f3, -f4);
    }

    @Override // com.corrodinggames.rts.gameFramework.unitAction.y
    public void b(float f, float f2) {
        this.T.a += f * this.T.d;
        this.T.b += f2 * this.T.e;
    }

    @Override // com.corrodinggames.rts.gameFramework.unitAction.y
    public void a(com.corrodinggames.rts.gameFramework.unitAction.m mVar) {
        mVar.a(this);
    }

    @Override // com.corrodinggames.rts.gameFramework.unitAction.y
    public void a(float f, float f2, float f3, float f4, Paint paint) {
        b(paint);
        float f5 = f * this.T.d;
        float f6 = f2 * this.T.e;
        float f7 = f5 + this.T.a;
        float f8 = f6 + this.T.b;
        float f9 = f3 * this.T.d;
        float f10 = f4 * this.T.e;
        this.f.drawLine(f7, f8, f9 + this.T.a, f10 + this.T.b);
    }

    @Override // com.corrodinggames.rts.gameFramework.unitAction.y
    public void a(Paint paint) {
        a(paint, VariableScope.nullOrMissingString, false);
    }

    @Override // com.corrodinggames.rts.gameFramework.unitAction.y
    public void a(ae aeVar) {
        if (this.a) {
            c(aeVar);
            v();
            m = null;
        }
    }

    public void y() {
        this.f.flushBuffer();
    }

    @Override // com.corrodinggames.rts.gameFramework.unitAction.y
    public void p() {
        this.f.flushBuffer();
        this.w = null;
        this.f.flush();
    }

    @Override // com.corrodinggames.rts.gameFramework.unitAction.y
    public void q() {
        if (this.f != null) {
            this.f.destroy();
        }
        this.f = null;
    }

    @Override // com.corrodinggames.rts.gameFramework.unitAction.y
    public int a(String str, Paint paint) {
        a(paint, str);
        int lineHeight = this.f.getFont().getLineHeight();
        if (x()) {
            lineHeight = (int) (lineHeight / this.L);
        }
        return lineHeight;
    }

    @Override // com.corrodinggames.rts.gameFramework.unitAction.y
    public int b(String str, Paint paint) {
        a(paint, str);
        int width = this.f.getFont().getWidth(str);
        if (x()) {
            width = (int) (width / this.L);
        }
        return width;
    }

    @Override // com.corrodinggames.rts.gameFramework.unitAction.y
    public com.corrodinggames.rts.gameFramework.unitAction.e r() {
        return r;
    }

    @Override // com.corrodinggames.rts.gameFramework.unitAction.y
    public void a(com.corrodinggames.rts.gameFramework.unitAction.e eVar, File file) {
        LoadImage e2 = e(eVar);
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(fileOutputStream);
            ImageOut.write(e2.C(), "png", bufferedOutputStream);
            bufferedOutputStream.close();
            fileOutputStream.close();
        } catch (IOException e3) {
            throw new RuntimeException(e3);
        } catch (SlickException e4) {
            throw new RuntimeException((Throwable) e4);
        }
    }

    @Override // com.corrodinggames.rts.gameFramework.unitAction.y
    public void a(Lock lock) {
    }

    @Override // com.corrodinggames.rts.gameFramework.unitAction.y
    public void b(Lock lock) {
    }

    public void z() {
        g gVar;
        this.U.add(this.T);
        if (this.V.a == 0) {
            gVar = new g();
        } else {
            gVar = (g) this.V.c();
        }
        this.T.a(gVar);
        this.T = gVar;
    }

    public void A() {
        if (this.U.size() == 0) {
            throw new RuntimeException("tranform stack is empty");
        }
        this.V.add(this.T);
        this.T = (g) this.U.c();
        b(false);
    }

    @Override // com.corrodinggames.rts.gameFramework.unitAction.y
    public float s() {
        return this.L;
    }
}