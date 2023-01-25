package com.corrodinggames.rts.java.librocket;

import com.corrodinggames.librocket.AbstractC0049c;
import com.corrodinggames.rts.gameFramework.EnumC1100u;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.utility.AbstractC1111af;
import com.corrodinggames.rts.gameFramework.utility.C1110ae;
import com.corrodinggames.rts.java.C1208e;
import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import org.newdawn.slick.Image;
import org.newdawn.slick.ImageBuffer;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.opengl.PNGImageData;

/* renamed from: com.corrodinggames.rts.java.d.b */
/* loaded from: game-lib.jar:com/corrodinggames/rts/java/d/b.class */
public class C1207b extends AbstractC0049c {

    /* renamed from: h */
    Image f7369h;

    /* renamed from: i */
    boolean f7370i;

    /* renamed from: j */
    ImageBuffer f7371j;

    /* renamed from: k */
    final /* synthetic */ SlickLibRocket f7372k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1207b(SlickLibRocket slickLibRocket) {
        super(slickLibRocket);
        this.f7372k = slickLibRocket;
    }

    @Override // com.corrodinggames.librocket.AbstractC0049c
    /* renamed from: a */
    public boolean mo233a() {
        InputStream fileInputStream;
        BufferedInputStream bufferedInputStream;
        AbstractC1111af m630a = C1110ae.m630a(this.f368a);
        if (m630a != null) {
            fileInputStream = m630a.mo621b(this.f368a, true);
            if (fileInputStream == null) {
                GameEngine.m990g("Failed to open zipped file: " + this.f368a);
                return false;
            }
        } else {
            try {
                fileInputStream = new FileInputStream(this.f368a);
            } catch (IOException e) {
                e.printStackTrace();
                return false;
            }
        }
        try {
            bufferedInputStream = new BufferedInputStream(fileInputStream);
        } catch (IOException e2) {
            GameEngine.m1061a("Exception loading image: " + this.f368a, (Throwable) e2);
            this.f7369h = C1208e.f7392s.mo73C();
            this.f7370i = true;
        } catch (OutOfMemoryError e3) {
            GameEngine.m1068a(EnumC1100u.uiImage, e3);
            this.f7369h = C1208e.f7391r.mo73C();
            this.f7370i = true;
        } catch (UnsupportedOperationException e4) {
            e4.printStackTrace();
            GameEngine.m1061a("Exception loading image: " + this.f368a, (Throwable) e4);
            this.f7369h = C1208e.f7392s.mo73C();
            this.f7370i = true;
        }
        try {
            PNGImageData pNGImageData = new PNGImageData();
            pNGImageData.loadImage(bufferedInputStream);
            bufferedInputStream.close();
            this.f7369h = new Image(pNGImageData);
            this.width = this.f7369h.getWidth();
            this.height = this.f7369h.getHeight();
            if (this.f370c) {
                if (this.width > 500 || this.height > 500) {
                    GameEngine.m5777e("Map thumbnail is too large. Size:(" + this.width + "," + this.height + ") (max:500 pixels)");
                    this.f7369h = C1208e.f7393t.mo73C();
                    this.f7370i = true;
                    this.width = this.f7369h.getWidth();
                    this.height = this.f7369h.getHeight();
                    return true;
                }
                return true;
            }
            return true;
        } catch (Throwable th) {
            bufferedInputStream.close();
            throw th;
        }
    }

    @Override // com.LibRocket.TextureHolder
    public void remove() {
        if (this.f7369h != null && !this.f7370i) {
            try {
                this.f7369h.destroy();
            } catch (SlickException e) {
                e.printStackTrace();
            }
        }
        this.f368a = null;
        this.f7371j = null;
        this.f7369h = null;
        this.f7370i = false;
    }
}