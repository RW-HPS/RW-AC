package com.corrodinggames.rts.java.image;

import java.nio.ByteBuffer;

/* renamed from: com.corrodinggames.rts.java.a.a */
/* loaded from: game-lib.jar:com/corrodinggames/rts/java/a/a.class */
public class ImageData implements org.newdawn.slick.opengl.ImageData {

    /* renamed from: a */
    org.newdawn.slick.opengl.ImageData f710a;
    ByteBuffer b;

    public ImageData(org.newdawn.slick.opengl.ImageData imageData, ByteBuffer byteBuffer) {
        this.f710a = imageData;
        this.b = byteBuffer;
    }

    public int getDepth() {
        return this.f710a.getDepth();
    }

    public int getHeight() {
        return this.f710a.getHeight();
    }

    public ByteBuffer getImageBufferData() {
        return this.b;
    }

    public int getTexHeight() {
        return this.f710a.getTexHeight();
    }

    public int getTexWidth() {
        return this.f710a.getTexWidth();
    }

    public int getWidth() {
        return this.f710a.getWidth();
    }
}