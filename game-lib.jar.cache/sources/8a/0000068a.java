package com.corrodinggames.rts.java;

import android.graphics.Color;
import com.corrodinggames.rts.gameFramework.FileChangeEngine;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.Unit;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import org.newdawn.slick.Image;
import org.newdawn.slick.ImageBuffer;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.opengl.ImageData;

/* renamed from: com.corrodinggames.rts.java.s */
/* loaded from: game-lib.jar:com/corrodinggames/rts/java/s.class */
public class LoadImage extends com.corrodinggames.rts.gameFramework.unitAction.e {
    public static ArrayList y;
    private Image x;
    ImageData z;
    ByteBuffer A;
    int B;
    String C;
    boolean H;
    static boolean F = true;
    static int K = 1000;
    boolean D = false;
    int E = 1;
    boolean G = false;
    boolean I = false;
    long J = -1;

    public Image C() {
        return this.x;
    }

    private void a(ImageData imageData) {
        this.z = imageData;
        if (this.z instanceof ImageBuffer) {
            this.A = ByteBuffer.wrap(((ImageBuffer) imageData).getRGBA());
        } else {
            this.A = imageData.getImageBufferData();
        }
        this.B = imageData.getDepth() / 8;
        if (this.B == 4) {
            int texHeight = imageData.getTexHeight();
            int texWidth = imageData.getTexWidth();
            int height = imageData.getHeight();
            int width = imageData.getWidth();
            for (int i = 0; i < height; i++) {
                for (int i2 = 0; i2 < width; i2++) {
                    int i3 = (i2 * 4) + (i * texWidth * 4);
                    try {
                        if (this.A.get(i3 + 3) == 0) {
                            this.A.put(i3 + 0, (byte) 0);
                            this.A.put(i3 + 1, (byte) 0);
                            this.A.put(i3 + 2, (byte) 0);
                        }
                    } catch (IndexOutOfBoundsException e) {
                        throw new IndexOutOfBoundsException("offset:" + i3 + " x:" + i2 + " y:" + i + " height:" + height + " width:" + width + " texHeight:" + texHeight + " texWidth:" + texWidth);
                    }
                }
            }
        }
        if (F) {
        }
    }

    @Override // com.corrodinggames.rts.gameFramework.unitAction.e
    public String a() {
        if (this.g != null) {
            return this.g;
        }
        return this.C;
    }

    public LoadImage() {
        if (y == null) {
            y = new ArrayList();
        }
        y.add(this);
    }

    public void D() {
        if (this.z == null && this.x != null) {
            GameEngine.print("reloadFromImageData: slickImageData==null and slickImage!=null. Ignoring");
            return;
        }
        if (this.x != null) {
            try {
                this.x.destroy();
            } catch (SlickException e) {
                throw new RuntimeException((Throwable) e);
            }
        }
        Image image = null;
        if (0 == 0) {
            image = new Image(this.z);
        }
        this.x = image;
        E();
        this.p = this.x.getWidth();
        this.q = this.x.getHeight();
        g();
        v();
    }

    public void a(Image image, String str) {
        if (this.x != null) {
            GameEngine.g("this.slickImage!=null");
        }
        this.x = image;
        E();
        this.p = this.x.getWidth();
        this.q = this.x.getHeight();
        g();
        this.C = str;
        if (this.C != null) {
            if (!new File(this.C).exists()) {
                throw new RuntimeException(this.C + " does not exist");
            }
            this.J = c(true);
        }
    }

    public void a(ImageData imageData, String str, boolean z) {
        a(imageData);
        if (!z) {
            D();
        }
        this.C = str;
        if (this.C != null && !this.C.contains(".rwmod")) {
            if (!new File(this.C).exists()) {
                throw new RuntimeException(this.C + " does not exist");
            }
            this.J = c(true);
        }
        g();
    }

    public static ByteBuffer a(ByteBuffer byteBuffer, ByteBuffer byteBuffer2) {
        byteBuffer.rewind();
        byteBuffer2.put(byteBuffer);
        byteBuffer.rewind();
        byteBuffer2.flip();
        return byteBuffer2;
    }

    @Override // com.corrodinggames.rts.gameFramework.unitAction.e
    public com.corrodinggames.rts.gameFramework.unitAction.e a(int i, int i2, boolean z) {
        LoadImage loadImage = new LoadImage();
        loadImage.a((ImageData) new ImageBuffer(i, i2), (String) null, true);
        if (z) {
            if (1 != 0 && this.B == 4) {
                H();
                a(this.z.getImageBufferData(), loadImage.A);
            } else {
                H();
                for (int i3 = 0; i3 < i2; i3++) {
                    for (int i4 = 0; i4 < i; i4++) {
                        loadImage.a(i4, i3, a(i4, i3));
                    }
                }
            }
        }
        loadImage.p = i;
        loadImage.q = i2;
        loadImage.g();
        loadImage.D = true;
        return loadImage;
    }

    @Override // com.corrodinggames.rts.gameFramework.unitAction.e
    public void i() {
        if (!this.G) {
            j();
        } else if (F && this.A == null) {
            j();
        }
    }

    @Override // com.corrodinggames.rts.gameFramework.unitAction.e
    public void x() {
        H();
    }

    @Override // com.corrodinggames.rts.gameFramework.unitAction.e
    public void y() {
    }

    @Override // com.corrodinggames.rts.gameFramework.unitAction.e
    public void j() {
        this.G = true;
        if (this.H) {
            G();
            throw new RuntimeException("Cannot buffer pixels, we have discarded the PixelBuffer");
        } else {
            H();
        }
    }

    public void H() {
        if (F && this.A == null) {
            J();
        }
    }

    @Override // com.corrodinggames.rts.gameFramework.unitAction.e
    public void q() {
        I();
    }

    public void I() {
        if (F) {
            this.z = null;
            this.A = null;
        }
    }

    public void J() {
        if (this.x == null) {
            throw new RuntimeException("Cannot buffer pixels, we have no slickImage");
        }
        long loadAllUnitsTook = Unit.loadAllUnitsTook();
        ImageData imageData = new ImageData(this, this.x);
        this.z = imageData;
        this.A = ByteBuffer.wrap(imageData.a());
        GameEngine.m5e("Recreating image data from texture: " + a() + " (" + Unit.a(Unit.a(loadAllUnitsTook)) + ")");
    }

    @Override // com.corrodinggames.rts.gameFramework.unitAction.e
    public boolean k() {
        if (this.z == null) {
            if (F && this.x != null) {
                return true;
            }
            return false;
        }
        return true;
    }

    @Override // com.corrodinggames.rts.gameFramework.unitAction.e
    public int a(int i, int i2) {
        try {
            return e.a(this.z, this.A, i, i2, this.B);
        } catch (IndexOutOfBoundsException e) {
            throw new RuntimeException("getPixel out of bounds (x:" + i + " y:" + i2 + " perPixel:" + this.B + " TexWidth:" + this.z.getTexWidth() + " TexHeight:" + this.z.getTexHeight() + " imageByteBuffer:" + this.A.limit() + " width:" + this.p + " height:" + this.q + ")", e);
        }
    }

    @Override // com.corrodinggames.rts.gameFramework.unitAction.e
    public void a(int i, int i2, int i3) {
        try {
            e.a(this.z, this.A, i, i2, Color.b(i3), Color.c(i3), Color.d(i3), Color.a(i3), this.B);
        } catch (IndexOutOfBoundsException e) {
            throw new RuntimeException("setPixel out of bounds (x:" + i + " y:" + i2 + " perPixel:" + this.B + " TexWidth:" + this.z.getTexWidth() + " TexHeight:" + this.z.getTexHeight() + " imageByteBuffer:" + this.A.limit() + " width:" + this.p + " height:" + this.q + ")", e);
        }
    }

    @Override // com.corrodinggames.rts.gameFramework.unitAction.e
    public void p() {
        if (this.G) {
            this.G = false;
            D();
        }
    }

    @Override // com.corrodinggames.rts.gameFramework.unitAction.e
    public void r() {
    }

    @Override // com.corrodinggames.rts.gameFramework.unitAction.e
    public void s() {
        this.H = true;
        this.z = null;
        this.A = null;
    }

    @Override // com.corrodinggames.rts.gameFramework.unitAction.e
    public void n() {
        this.I = true;
    }

    @Override // com.corrodinggames.rts.gameFramework.unitAction.e
    public void o() {
        this.z = null;
        this.A = null;
        if (y != null) {
            y.remove(this);
        }
        if (this.x != null) {
            try {
                this.x.destroy();
            } catch (SlickException e) {
                e.printStackTrace();
            }
            this.x = null;
        }
    }

    protected void finalize() {
        if (this.I) {
            o();
        }
        if (this.x != null) {
            GameEngine.print("SlickBitmapOrTexture: Leak detection: finalize called with slickImage!=null");
        }
    }

    @Override // com.corrodinggames.rts.gameFramework.unitAction.e
    /* renamed from: h */
    public com.corrodinggames.rts.gameFramework.unitAction.e mo8clone() {
        return a(this.p, this.q, true);
    }

    @Override // com.corrodinggames.rts.gameFramework.unitAction.e
    protected void e() {
        E();
    }

    public void E() {
        if (this.x == null) {
            GameEngine.print("slickImage==null");
            GameEngine.T();
        }
        if (!this.o) {
            this.E = 2;
            this.x.setFilter(2);
            return;
        }
        this.E = 1;
        this.x.setFilter(1);
    }

    public void F() {
        FileInputStream fileInputStream;
        if (this.D) {
            GameEngine.m5e("reloadImage: skipping cloned image:" + this.C);
        } else if (this.C == null) {
            GameEngine.m5e("reloadImage: filepath is null, skipping");
        } else {
            try {
                GameEngine.m5e("reloadImage: reloading:" + this.C);
                if (this.x != null) {
                    this.x.destroy();
                } else {
                    GameEngine.m5e("slickImage==null cannot free");
                }
                K++;
                fileInputStream = new FileInputStream(this.C);
            } catch (IOException e) {
                GameEngine.m5e("reloadImage: failed");
                e.printStackTrace();
            } catch (SlickException e2) {
                GameEngine.m5e("reloadImage: failed");
                e2.printStackTrace();
            }
            try {
                this.x = new Image(fileInputStream, "reload_" + K, false);
                v();
                E();
                this.p = this.x.getWidth();
                this.q = this.x.getHeight();
                g();
                fileInputStream.close();
                GameEngine gameEngine = GameEngine.getGameEngine();
                if (gameEngine != null && gameEngine.bL != null) {
                    gameEngine.bL.g();
                }
            } catch (NullPointerException e3) {
                throw new IOException("Failed to reload", e3);
            }
        }
    }

    public long c(boolean z) {
        if (this.C == null) {
            return -2L;
        }
        return FileChangeEngine.a(this.C, z);
    }

    @Override // com.corrodinggames.rts.gameFramework.unitAction.e
    public void t() {
        long c = c(false);
        if (this.J == -1) {
            this.J = c;
        } else if (this.J != c) {
            GameEngine.m5e("reloadImage: '" + this.C + "' reloading current now:" + c);
            F();
            this.J = c;
        }
    }

    public void G() {
        GameEngine.m5e("SlickBitmapOrTexture: " + a());
        GameEngine.m5e(" className:" + getClass().getSimpleName());
        GameEngine.m5e(" filepath:" + this.C);
        GameEngine.m5e(" slickImage:" + (this.x != null));
        GameEngine.m5e(" cloned:" + this.D);
    }
}