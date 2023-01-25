package com.corrodinggames.rts.java.librocket;

import android.graphics.Rect;
import android.graphics.RectF;
import com.LibRocket;
import com.corrodinggames.librocket.AbstractC0048b;
import com.corrodinggames.librocket.scripts.ScriptEngine;
import com.corrodinggames.rts.game.PlayerData;
import com.corrodinggames.rts.game.units.EnumC0249ar;
import com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope;
import com.corrodinggames.rts.gameFramework.C0773f;
import com.corrodinggames.rts.gameFramework.EnumC1100u;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.unitAction.InterfaceC1063y;
import org.newdawn.slick.Color;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;
import org.newdawn.slick.ImageBuffer;
import org.newdawn.slick.geom.Rectangle;
import org.newdawn.slick.opengl.TextureImpl;
import org.newdawn.slick.opengl.renderer.Renderer;
import org.newdawn.slick.opengl.renderer.SGL;

/* renamed from: com.corrodinggames.rts.java.d.a */
/* loaded from: game-lib.jar:com/corrodinggames/rts/java/d/a.class */
public class SlickLibRocket extends AbstractC0048b {

    /* renamed from: k */
    private static SGL f7367k = Renderer.get();

    /* renamed from: j */
    Graphics f7368j;

    @Override // com.corrodinggames.librocket.AbstractC0048b
    /* renamed from: a */
    public void mo235a() {
        throw new RuntimeException("startNewFrame() not supported on SlickLibRocket");
    }

    /* renamed from: a */
    public void m234a(Graphics graphics) {
        this.f7368j = graphics;
        super.mo235a();
    }

    @Override // com.LibRocket
    public boolean GenerateTexture(int i, byte[] bArr) {
        try {
            C1207b c1207b = (C1207b) findTextureHolder(i);
            ImageBuffer imageBuffer = new ImageBuffer(c1207b.width, c1207b.height);
            byte[] rgba = imageBuffer.getRGBA();
            for (int i2 = 0; i2 < bArr.length; i2++) {
                rgba[i2] = bArr[i2];
            }
            c1207b.f7369h = new Image(imageBuffer);
            if (c1207b.f7369h == null) {
                throw new RuntimeException("slickTextureHolder.image==null");
            }
            return true;
        } catch (OutOfMemoryError e) {
            GameEngine.m1068a(EnumC1100u.uiImage, e);
            return false;
        } catch (Throwable th) {
            ScriptEngine.throwDelayedException("GenerateTexture Failed", th);
            return true;
        }
    }

    @Override // com.LibRocket
    public void RenderGeometryPossiblyCompiled(float[] fArr, float[] fArr2, int[] iArr, int[] iArr2, int i, float f, float f2, LibRocket.CompiledGeometry compiledGeometry) {
        try {
            if (this.debug) {
                System.out.println("SlickLibRocket:RenderGeometry(" + fArr.length + "," + i + ")");
                System.out.println("indices.length=" + iArr2.length + VariableScope.nullOrMissingString);
            }
            C1207b c1207b = null;
            if (i != 0) {
                c1207b = (C1207b) findTextureHolder(i);
            }
            RectF rectF = null;
            if (compiledGeometry != null) {
                rectF = (RectF) compiledGeometry.bbox;
            }
            if (rectF == null) {
                rectF = new RectF();
                for (int i2 = 0; i2 < iArr2.length; i2 += 3) {
                    int i3 = iArr2[i2];
                    for (int i4 = 0; i4 <= 2; i4++) {
                        int i5 = iArr2[i2 + i4];
                        float f3 = fArr[(i5 * 2) + 0];
                        float f4 = fArr[(i5 * 2) + 1];
                        if (rectF.m5160a()) {
                            rectF.m5158a(f3, f4, f3 + 1.0f, f4 + 1.0f);
                        } else {
                            rectF.m5148c(f3, f4);
                        }
                    }
                }
                rectF.m5144g();
                if (compiledGeometry != null) {
                    compiledGeometry.bbox = rectF;
                }
            }
            RectF rectF2 = new RectF(rectF);
            rectF2.m5159a(f, f2);
            if (this.f365h && !C0773f.m2198a(rectF2, this.f364g)) {
                boolean z = true;
                if (c1207b != null && c1207b.f7369h == null && c1207b.f369b && c1207b.f373f == null) {
                    z = false;
                }
                if (z) {
                    return;
                }
            }
            if (c1207b != null && c1207b.f7371j != null) {
                System.out.println("Loading image for: " + c1207b.index);
                c1207b.f7369h = new Image(c1207b.f7371j);
                if (c1207b.f7369h == null) {
                    throw new RuntimeException("slickTextureHolder.image==null");
                }
                c1207b.f7371j = null;
            }
            this.f7368j.pushTransform();
            this.f7368j.setDrawMode(Graphics.MODE_NORMAL);
            this.f7368j.translate(f, f2);
            float f5 = 1.0f;
            float f6 = 1.0f;
            boolean z2 = false;
            float f7 = 1.0f;
            boolean z3 = false;
            if (c1207b != null) {
                z2 = c1207b.f371d;
                f7 = c1207b.f372e;
                TextureImpl.getLastBind();
                if (c1207b.f7369h == null && c1207b.f369b) {
                    if (c1207b.f373f != null) {
                        InterfaceC1063y interfaceC1063y = GameEngine.getGameEngine().f6326bO;
                        this.f7368j.pushTransform();
                        interfaceC1063y.mo138i();
                        float f8 = (((GameEngine.getGameEngine().f6317bA / 1000.0f) / 10.0f) * 360.0f) % 360.0f;
                        this.f7368j.translate(-f, -f2);
                        Rect rect = new Rect(this.f363f.f230a, this.f363f.f231b, this.f363f.f232c, this.f363f.f233d);
                        this.f7368j.setClip((Rectangle) null);
                        this.f7368j.setWorldClip((Rectangle) null);
                        interfaceC1063y.mo209a(rect);
                        PlayerData m4365k = PlayerData.m4365k(0);
                        if (m4365k == null) {
                            m4365k = PlayerData.f1373i;
                        }
                        EnumC0249ar.m4177a(c1207b.f373f, rectF2.m5147d(), rectF2.m5146e(), f8, 3.0f, m4365k, rectF2.m5149c() * 0.6f, rectF2.m5149c(), false, false, 1, null);
                        interfaceC1063y.mo131p();
                        f7 = 0.0f;
                        interfaceC1063y.mo137j();
                        this.f7368j.popTransform();
                    } else if (this.f362d < 1) {
                        c1207b.mo233a();
                        this.f362d++;
                    }
                }
                if (c1207b.f7369h != null) {
                    c1207b.f7369h.getTexture().bind();
                    f5 = c1207b.f7369h.getTextureWidth();
                    f6 = c1207b.f7369h.getTextureHeight();
                    z3 = true;
                } else if (c1207b.f369b) {
                    f7 = 0.1f;
                }
            }
            if (!z3) {
                TextureImpl.bindNone();
            }
            Color color = new Color(1.0f, 1.0f, 1.0f, f7);
            this.f7368j.setColor(color);
            f7367k.glBegin(4);
            for (int i6 = 0; i6 < iArr2.length; i6 += 3) {
                int i7 = iArr2[i6];
                if (!z2) {
                    int i8 = iArr[i7];
                    color.r = ((i8 >> 24) & 255) / 255.0f;
                    color.g = ((i8 >> 16) & 255) / 255.0f;
                    color.b = ((i8 >> 8) & 255) / 255.0f;
                    color.a = (i8 & 255) / 255.0f;
                    color.a *= f7;
                    color.bind();
                }
                for (int i9 = 0; i9 <= 2; i9++) {
                    int i10 = iArr2[i6 + i9];
                    f7367k.glTexCoord2f(fArr2[(i10 * 2) + 0] * f5, fArr2[(i10 * 2) + 1] * f6);
                    f7367k.glVertex2f(fArr[(i10 * 2) + 0], fArr[(i10 * 2) + 1]);
                }
            }
            f7367k.glEnd();
            this.f7368j.popTransform();
        } catch (Throwable th) {
            ScriptEngine.throwDelayedException("UI Render Failed", th);
        }
    }

    @Override // com.LibRocket
    public LibRocket.TextureHolder getFromTextureHolderFactory() {
        return new C1207b(this);
    }

    @Override // com.corrodinggames.librocket.AbstractC0048b, com.LibRocket
    public void EnableScissorRegion(boolean z) {
        if (z) {
            this.f7368j.setWorldClip(this.f363f.f230a, this.f363f.f231b, this.f363f.m5170b(), this.f363f.m5166c());
            this.f365h = true;
            return;
        }
        this.f7368j.clearWorldClip();
        this.f365h = false;
    }
}