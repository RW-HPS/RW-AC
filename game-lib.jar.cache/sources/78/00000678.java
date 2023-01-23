package com.corrodinggames.rts.java.librocket;

import android.graphics.Rect;
import android.graphics.RectF;
import com.LibRocket;
import com.corrodinggames.librocket.b;
import com.corrodinggames.librocket.scripts.ScriptEngine;
import com.corrodinggames.rts.game.PlayerData;
import com.corrodinggames.rts.game.units.ar;
import com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.f;
import com.corrodinggames.rts.gameFramework.u;
import com.corrodinggames.rts.gameFramework.unitAction.y;
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
public class SlickLibRocket extends b {
    private static SGL k = Renderer.get();
    Graphics j;

    @Override // com.corrodinggames.librocket.b
    public void a() {
        throw new RuntimeException("startNewFrame() not supported on SlickLibRocket");
    }

    public void a(Graphics graphics) {
        this.j = graphics;
        super.a();
    }

    @Override // com.LibRocket
    public boolean GenerateTexture(int i, byte[] bArr) {
        try {
            b bVar = (b) findTextureHolder(i);
            ImageBuffer imageBuffer = new ImageBuffer(bVar.width, bVar.height);
            byte[] rgba = imageBuffer.getRGBA();
            for (int i2 = 0; i2 < bArr.length; i2++) {
                rgba[i2] = bArr[i2];
            }
            bVar.h = new Image(imageBuffer);
            if (bVar.h == null) {
                throw new RuntimeException("slickTextureHolder.image==null");
            }
            return true;
        } catch (OutOfMemoryError e) {
            GameEngine.a(u.uiImage, e);
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
            b bVar = null;
            if (i != 0) {
                bVar = (b) findTextureHolder(i);
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
                        if (rectF.a()) {
                            rectF.a(f3, f4, f3 + 1.0f, f4 + 1.0f);
                        } else {
                            rectF.c(f3, f4);
                        }
                    }
                }
                rectF.g();
                if (compiledGeometry != null) {
                    compiledGeometry.bbox = rectF;
                }
            }
            RectF rectF2 = new RectF(rectF);
            rectF2.a(f, f2);
            if (this.h && !f.a(rectF2, this.g)) {
                boolean z = true;
                if (bVar != null && bVar.h == null && bVar.b && bVar.f == null) {
                    z = false;
                }
                if (z) {
                    return;
                }
            }
            if (bVar != null && bVar.j != null) {
                System.out.println("Loading image for: " + bVar.index);
                bVar.h = new Image(bVar.j);
                if (bVar.h == null) {
                    throw new RuntimeException("slickTextureHolder.image==null");
                }
                bVar.j = null;
            }
            this.j.pushTransform();
            this.j.setDrawMode(Graphics.MODE_NORMAL);
            this.j.translate(f, f2);
            float f5 = 1.0f;
            float f6 = 1.0f;
            boolean z2 = false;
            float f7 = 1.0f;
            boolean z3 = false;
            if (bVar != null) {
                z2 = bVar.d;
                f7 = bVar.e;
                TextureImpl.getLastBind();
                if (bVar.h == null && bVar.b) {
                    if (bVar.f != null) {
                        y yVar = GameEngine.getGameEngine().bO;
                        this.j.pushTransform();
                        yVar.i();
                        float f8 = (((GameEngine.getGameEngine().bA / 1000.0f) / 10.0f) * 360.0f) % 360.0f;
                        this.j.translate(-f, -f2);
                        Rect rect = new Rect(this.f.f47a, this.f.b, this.f.c, this.f.d);
                        this.j.setClip((Rectangle) null);
                        this.j.setWorldClip((Rectangle) null);
                        yVar.a(rect);
                        PlayerData k2 = PlayerData.k(0);
                        if (k2 == null) {
                            k2 = PlayerData.i;
                        }
                        ar.a(bVar.f, rectF2.d(), rectF2.e(), f8, 3.0f, k2, rectF2.c() * 0.6f, rectF2.c(), false, false, 1, null);
                        yVar.p();
                        f7 = 0.0f;
                        yVar.j();
                        this.j.popTransform();
                    } else if (this.d < 1) {
                        bVar.a();
                        this.d++;
                    }
                }
                if (bVar.h != null) {
                    bVar.h.getTexture().bind();
                    f5 = bVar.h.getTextureWidth();
                    f6 = bVar.h.getTextureHeight();
                    z3 = true;
                } else if (bVar.b) {
                    f7 = 0.1f;
                }
            }
            if (!z3) {
                TextureImpl.bindNone();
            }
            Color color = new Color(1.0f, 1.0f, 1.0f, f7);
            this.j.setColor(color);
            k.glBegin(4);
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
                    k.glTexCoord2f(fArr2[(i10 * 2) + 0] * f5, fArr2[(i10 * 2) + 1] * f6);
                    k.glVertex2f(fArr[(i10 * 2) + 0], fArr[(i10 * 2) + 1]);
                }
            }
            k.glEnd();
            this.j.popTransform();
        } catch (Throwable th) {
            ScriptEngine.throwDelayedException("UI Render Failed", th);
        }
    }

    @Override // com.LibRocket
    public LibRocket.TextureHolder getFromTextureHolderFactory() {
        return new b(this);
    }

    @Override // com.corrodinggames.librocket.b, com.LibRocket
    public void EnableScissorRegion(boolean z) {
        if (z) {
            this.j.setWorldClip(this.f.f47a, this.f.b, this.f.b(), this.f.c());
            this.h = true;
            return;
        }
        this.j.clearWorldClip();
        this.h = false;
    }
}