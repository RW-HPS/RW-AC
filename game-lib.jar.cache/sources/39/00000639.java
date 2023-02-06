package com.corrodinggames.rts.java.image;

import java.nio.ByteBuffer;

/* renamed from: com.corrodinggames.rts.java.a.a */
/* loaded from: game-lib.jar:com/corrodinggames/rts/java/a/a.class */
public class ImageData implements org.newdawn.slick.opengl.ImageData {
    org.newdawn.slick.opengl.ImageData a;
    ByteBuffer b;

    public ImageData(org.newdawn.slick.opengl.ImageData imageData, ByteBuffer byteBuffer) {
        this.a = imageData;
        this.b = byteBuffer;
    }

    public int getDepth() {
        return this.a.getDepth();
    }

    public int getHeight() {
        return this.a.getHeight();
    }

    public ByteBuffer getImageBufferData() {
        return this.b;
    }

    public int getTexHeight() {
        return this.a.getTexHeight();
    }

    public int getTexWidth() {
        return this.a.getTexWidth();
    }

    public int getWidth() {
        return this.a.getWidth();
    }
}