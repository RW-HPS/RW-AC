package net.rudp.p002a;

import com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope;
import java.io.IOException;

/* renamed from: a.a.a.h */
/* loaded from: game-lib.jar:a/a/a/h.class */
public abstract class Segment {

    /* renamed from: a */
    private int flags;

    /* renamed from: b */
    private int hlen;

    /* renamed from: c */
    private int seqn;

    /* renamed from: e */
    private int nretx = 0;

    /* renamed from: d */
    private int f16d = -1;

    /* renamed from: a */
    public abstract String type();

    protected Segment() {
    }

    /* renamed from: m */
    public int m5435m() {
        return this.seqn;
    }

    /* renamed from: b */
    public int mo5439b() {
        return this.hlen;
    }

    /* renamed from: a */
    public void setAck(int i) {
        this.flags |= 64;
        this.f16d = i;
    }

    /* renamed from: n */
    public int getAck() {
        if ((this.flags & 64) == 64) {
            return this.f16d;
        }
        return -1;
    }

    /* renamed from: o */
    public int getRetxCounter() {
        return this.nretx;
    }

    /* renamed from: b */
    public void m5438b(int i) {
        this.nretx = i;
    }

    /* renamed from: d */
    public byte[] getBytes() {
        byte[] bArr = new byte[mo5439b()];
        bArr[0] = (byte) (this.flags & 255);
        bArr[1] = (byte) (this.hlen & 255);
        bArr[2] = (byte) (this.seqn & 255);
        bArr[3] = (byte) (this.f16d & 255);
        return bArr;
    }

    public String toString() {
        return type() + " [ SEQ = " + m5435m() + ", ACK = " + (getAck() >= 0 ? VariableScope.nullOrMissingString + getAck() : "N/A") + ", LEN = " + mo5439b() + " ]";
    }

    /* renamed from: b */
    public static Segment parse(byte[] bArr, int i, int i2) {
        Segment segment = null;
        if (i2 < 6) {
            throw new IOException("Invalid segment:" + i2);
        }
        byte b = bArr[i];
        if ((b & Byte.MIN_VALUE) != 0) {
            segment = new SYNSegment();
        } else if ((b & 8) != 0) {
            segment = new NULSegment();
        } else if ((b & 32) != 0) {
            segment = new EAKSegment();
        } else if ((b & 16) != 0) {
            segment = new RSTSegment();
        } else if ((b & 2) != 0) {
            segment = new FINSegment();
        } else if ((b & 64) != 0) {
            if (i2 == 6) {
                segment = new ACKSegment();
            } else {
                segment = new DATSegment();
            }
        }
        if (segment == null) {
            throw new IOException("Invalid segment");
        }
        segment.parseBytes(bArr, i, i2);
        return segment;
    }

    /* renamed from: a */
    protected void init(int i, int i2, int i3) {
        this.flags = i;
        this.seqn = i2;
        this.hlen = i3;
    }

    /* renamed from: a */
    protected void parseBytes(byte[] bArr, int i, int i2) {
        this.flags = bArr[i] & 255;
        this.hlen = bArr[i + 1] & 255;
        this.seqn = bArr[i + 2] & 255;
        this.f16d = bArr[i + 3] & 255;
    }
}