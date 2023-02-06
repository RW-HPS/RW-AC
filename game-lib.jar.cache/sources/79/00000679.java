package com.corrodinggames.rts.java.librocket;

import com.corrodinggames.librocket.c;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.u;
import com.corrodinggames.rts.gameFramework.utility.ae;
import com.corrodinggames.rts.gameFramework.utility.af;
import com.corrodinggames.rts.java.e;
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
public class b extends c {
    Image h;
    boolean i;
    ImageBuffer j;
    final /* synthetic */ SlickLibRocket k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(SlickLibRocket slickLibRocket) {
        super(slickLibRocket);
        this.k = slickLibRocket;
    }

    @Override // com.corrodinggames.librocket.c
    public boolean a() {
        InputStream fileInputStream;
        BufferedInputStream bufferedInputStream;
        af a = ae.a(this.a);
        if (a != null) {
            fileInputStream = a.b(this.a, true);
            if (fileInputStream == null) {
                GameEngine.g("Failed to open zipped file: " + this.a);
                return false;
            }
        } else {
            try {
                fileInputStream = new FileInputStream(this.a);
            } catch (IOException e) {
                e.printStackTrace();
                return false;
            }
        }
        try {
            bufferedInputStream = new BufferedInputStream(fileInputStream);
        } catch (IOException e2) {
            GameEngine.a("Exception loading image: " + this.a, (Throwable) e2);
            this.h = e.s.C();
            this.i = true;
        } catch (OutOfMemoryError e3) {
            GameEngine.a(u.uiImage, e3);
            this.h = e.r.C();
            this.i = true;
        } catch (UnsupportedOperationException e4) {
            e4.printStackTrace();
            GameEngine.a("Exception loading image: " + this.a, (Throwable) e4);
            this.h = e.s.C();
            this.i = true;
        }
        try {
            PNGImageData pNGImageData = new PNGImageData();
            pNGImageData.loadImage(bufferedInputStream);
            bufferedInputStream.close();
            this.h = new Image(pNGImageData);
            this.width = this.h.getWidth();
            this.height = this.h.getHeight();
            if (this.c) {
                if (this.width > 500 || this.height > 500) {
                    GameEngine.m5e("Map thumbnail is too large. Size:(" + this.width + "," + this.height + ") (max:500 pixels)");
                    this.h = e.t.C();
                    this.i = true;
                    this.width = this.h.getWidth();
                    this.height = this.h.getHeight();
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
        if (this.h != null && !this.i) {
            try {
                this.h.destroy();
            } catch (SlickException e) {
                e.printStackTrace();
            }
        }
        this.a = null;
        this.j = null;
        this.h = null;
        this.i = false;
    }
}