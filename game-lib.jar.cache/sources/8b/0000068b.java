package com.corrodinggames.rts.java;

import java.nio.ByteBuffer;
import org.newdawn.slick.Image;
import org.newdawn.slick.opengl.Texture;
import org.newdawn.slick.util.MiscUtils;

/* renamed from: com.corrodinggames.rts.java.t */
/* loaded from: game-lib.jar:com/corrodinggames/rts/java/t.class */
public class ImageData implements org.newdawn.slick.opengl.ImageData {

    /* renamed from: a */
    int f7485a;

    /* renamed from: c */
    private int f7486c;

    /* renamed from: d */
    private int f7487d;

    /* renamed from: e */
    private int f7488e;

    /* renamed from: f */
    private int f7489f;

    /* renamed from: g */
    private byte[] f7490g;

    /* renamed from: b */
    final /* synthetic */ LoadImage f7491b;

    public ImageData(LoadImage loadImage, Image image) {
        this.f7491b = loadImage;
        Texture texture = image.getTexture();
        this.f7490g = texture.getTextureData();
        this.f7485a = texture.hasAlpha() ? 32 : 24;
        this.f7486c = texture.getImageWidth();
        this.f7487d = texture.getImageHeight();
        this.f7488e = texture.getTextureWidth();
        this.f7489f = texture.getTextureHeight();
    }

    public int getDepth() {
        return this.f7485a;
    }

    public int getWidth() {
        return this.f7486c;
    }

    public int getHeight() {
        return this.f7487d;
    }

    public int getTexWidth() {
        return this.f7488e;
    }

    public int getTexHeight() {
        return this.f7489f;
    }

    public ByteBuffer getImageBufferData() {
        ByteBuffer createByteBuffer = MiscUtils.createByteBuffer(this.f7490g.length);
        createByteBuffer.put(this.f7490g);
        createByteBuffer.flip();
        return createByteBuffer;
    }

    /* renamed from: a */
    public byte[] m42a() {
        return this.f7490g;
    }
}