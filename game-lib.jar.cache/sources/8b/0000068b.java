package com.corrodinggames.rts.java;

import java.nio.ByteBuffer;
import org.newdawn.slick.Image;
import org.newdawn.slick.opengl.Texture;
import org.newdawn.slick.util.MiscUtils;

/* renamed from: com.corrodinggames.rts.java.t */
/* loaded from: game-lib.jar:com/corrodinggames/rts/java/t.class */
public class ImageData implements org.newdawn.slick.opengl.ImageData {
    int a;
    private int c;
    private int d;
    private int e;
    private int f;
    private byte[] g;
    final /* synthetic */ LoadImage b;

    public ImageData(LoadImage loadImage, Image image) {
        this.b = loadImage;
        Texture texture = image.getTexture();
        this.g = texture.getTextureData();
        this.a = texture.hasAlpha() ? 32 : 24;
        this.c = texture.getImageWidth();
        this.d = texture.getImageHeight();
        this.e = texture.getTextureWidth();
        this.f = texture.getTextureHeight();
    }

    public int getDepth() {
        return this.a;
    }

    public int getWidth() {
        return this.c;
    }

    public int getHeight() {
        return this.d;
    }

    public int getTexWidth() {
        return this.e;
    }

    public int getTexHeight() {
        return this.f;
    }

    public ByteBuffer getImageBufferData() {
        ByteBuffer createByteBuffer = MiscUtils.createByteBuffer(this.g.length);
        createByteBuffer.put(this.g);
        createByteBuffer.flip();
        return createByteBuffer;
    }

    public byte[] a() {
        return this.g;
    }
}