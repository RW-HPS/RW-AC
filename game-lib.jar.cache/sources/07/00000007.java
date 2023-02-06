package net.rudp.a;

import java.io.IOException;

/* renamed from: a.a.a.g */
/* loaded from: game-lib.jar:a/a/a/g.class */
public class SYNSegment extends Segment {
    private int a;
    private int b;
    private int c;
    private int d;
    private int e;
    private int f;
    private int g;
    private int h;
    private int i;
    private int j;
    private int k;

    protected SYNSegment() {
    }

    public SYNSegment(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10) {
        init(-128, i, 22);
        this.a = 1;
        this.b = i2;
        this.c = 1;
        this.d = i3;
        this.e = i4;
        this.f = i5;
        this.g = i6;
        this.h = i7;
        this.i = i8;
        this.j = i9;
        this.k = i10;
    }

    @Override // net.rudp.a.Segment
    /* renamed from: a */
    public String type() {
        return "SYN";
    }

    public int c() {
        return this.b;
    }

    public int e() {
        return this.d;
    }

    public int f() {
        return this.e;
    }

    public int g() {
        return this.f;
    }

    public int h() {
        return this.g;
    }

    public int i() {
        return this.h;
    }

    public int j() {
        return this.i;
    }

    public int k() {
        return this.j;
    }

    public int l() {
        return this.k;
    }

    @Override // net.rudp.a.Segment
    /* renamed from: d */
    public byte[] getBytes() {
        byte[] bytes = super.getBytes();
        bytes[4] = (byte) ((this.a << 4) & 255);
        bytes[5] = (byte) (this.b & 255);
        bytes[6] = (byte) (this.c & 255);
        bytes[7] = 0;
        bytes[8] = (byte) ((this.d >>> 8) & 255);
        bytes[9] = (byte) ((this.d >>> 0) & 255);
        bytes[10] = (byte) ((this.e >>> 8) & 255);
        bytes[11] = (byte) ((this.e >>> 0) & 255);
        bytes[12] = (byte) ((this.f >>> 8) & 255);
        bytes[13] = (byte) ((this.f >>> 0) & 255);
        bytes[14] = (byte) ((this.g >>> 8) & 255);
        bytes[15] = (byte) ((this.g >>> 0) & 255);
        bytes[16] = (byte) (this.h & 255);
        bytes[17] = (byte) (this.i & 255);
        bytes[18] = (byte) (this.j & 255);
        bytes[19] = (byte) (this.k & 255);
        return bytes;
    }

    @Override // net.rudp.a.Segment
    /* renamed from: a */
    protected void parseBytes(byte[] bArr, int i, int i2) {
        super.parseBytes(bArr, i, i2);
        if (i2 < 22) {
            throw new IOException("Invalid SYN segment");
        }
        this.a = (bArr[i + 4] & 255) >>> 4;
        if (this.a != 1) {
            throw new IOException("Invalid RUDP version:" + this.a);
        }
        this.b = bArr[i + 5] & 255;
        this.c = bArr[i + 6] & 255;
        this.d = ((bArr[i + 8] & 255) << 8) | ((bArr[i + 9] & 255) << 0);
        this.e = ((bArr[i + 10] & 255) << 8) | ((bArr[i + 11] & 255) << 0);
        this.f = ((bArr[i + 12] & 255) << 8) | ((bArr[i + 13] & 255) << 0);
        this.g = ((bArr[i + 14] & 255) << 8) | ((bArr[i + 15] & 255) << 0);
        this.h = bArr[i + 16] & 255;
        this.i = bArr[i + 17] & 255;
        this.j = bArr[i + 18] & 255;
        this.k = bArr[i + 19] & 255;
    }
}