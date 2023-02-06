package net.rudp;

import java.io.IOException;

/* renamed from: a.a.r */
/* loaded from: game-lib.jar:a/a/r.class */
public class ReliableSocketProfile {
    public static final ReliableSocketProfile a = new ReliableSocketProfile();
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
    private int l;

    public ReliableSocketProfile() {
        try {
            a(32, 32, 300, 70, 0, 3, 3, 3, 2000, 600, 300);
        } catch (IOException e) {
            throw new RuntimeException("IOException on ReliableSocketProfile default:" + e);
        }
    }

    public ReliableSocketProfile(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11) {
        a(i, i2, i3, i4, i5, i6, i7, i8, i9, i10, i11);
    }

    private void a(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11) {
        a("maxSendQueueSize", i, 1, 255);
        a("maxRecvQueueSize", i2, 1, 255);
        a("maxSegmentSize", i3, 22, 6535);
        a("maxOutstandingSegs", i4, 1, 255);
        a("maxRetrans", i5, 0, 255);
        a("maxCumulativeAcks", i6, 0, 255);
        a("maxOutOfSequence", i7, 0, 255);
        a("maxAutoReset", i8, 0, 255);
        a("nullSegmentTimeout", i9, 0, 65535);
        a("retransmissionTimeout", i10, 100, 65535);
        a("cumulativeAckTimeout", i11, 100, 65535);
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = i4;
        this.f = i5;
        this.g = i6;
        this.h = i7;
        this.i = i8;
        this.j = i9;
        this.k = i10;
        this.l = i11;
    }

    public int a() {
        return this.d;
    }

    public int b() {
        return this.e;
    }

    public int c() {
        return this.f;
    }

    public int d() {
        return this.g;
    }

    public int e() {
        return this.h;
    }

    public int f() {
        return this.i;
    }

    public int g() {
        return this.j;
    }

    public int h() {
        return this.k;
    }

    public int i() {
        return this.l;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        sb.append(this.b).append(", ");
        sb.append(this.c).append(", ");
        sb.append(this.d).append(", ");
        sb.append(this.e).append(", ");
        sb.append(this.f).append(", ");
        sb.append(this.g).append(", ");
        sb.append(this.h).append(", ");
        sb.append(this.i).append(", ");
        sb.append(this.j).append(", ");
        sb.append(this.k).append(", ");
        sb.append(this.l);
        sb.append("]");
        return sb.toString();
    }

    private void a(String str, int i, int i2, int i3) {
        if (i < i2 || i > i3) {
            throw new IOException(str + " out of range");
        }
    }
}