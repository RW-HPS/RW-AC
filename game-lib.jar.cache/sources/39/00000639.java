package com.corrodinggames.rts.java.image;

import java.nio.ByteBuffer;

/* renamed from: com.corrodinggames.rts.java.a.a */
/* loaded from: game-lib.jar:com/corrodinggames/rts/java/a/a.class */
public class ImageData implements org.newdawn.slick.opengl.ImageData {

    /* renamed from: a */
    org.newdawn.slick.opengl.ImageData f7216a;

    /* renamed from: b */
    ByteBuffer f7217b;

    public ImageData(org.newdawn.slick.opengl.ImageData imageData, ByteBuffer byteBuffer) {
        this.f7216a = imageData;
        this.f7217b = byteBuffer;
    }

    public int getDepth() {
        return this.f7216a.getDepth();
    }

    public int getHeight() {
        return this.f7216a.getHeight();
    }

    public ByteBuffer getImageBufferData() {
        return this.f7217b;
    }

    public int getTexHeight() {
        return this.f7216a.getTexHeight();
    }

    public int getTexWidth() {
        return this.f7216a.getTexWidth();
    }

    public int getWidth() {
        return this.f7216a.getWidth();
    }
}