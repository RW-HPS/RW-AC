package net.rudp.p002a;

/* renamed from: a.a.a.c */
/* loaded from: game-lib.jar:a/a/a/c.class */
public class EAKSegment extends ACKSegment {

    /* renamed from: a */
    private int[] data;

    protected EAKSegment() {
    }

    public EAKSegment(int i, int i2, int[] iArr) {
        init(32, i, 6 + iArr.length);
        setAck(i2);
        this.data = iArr;
    }

    @Override // net.rudp.p002a.ACKSegment, net.rudp.p002a.Segment
    /* renamed from: a */
    public String type() {
        return "EAK";
    }

    /* renamed from: c */
    public int[] m5453c() {
        return this.data;
    }

    @Override // net.rudp.p002a.Segment
    /* renamed from: d */
    public byte[] getBytes() {
        byte[] d = super.getBytes();
        for (int i = 0; i < this.data.length; i++) {
            d[4 + i] = (byte) (this.data[i] & 255);
        }
        return d;
    }

    @Override // net.rudp.p002a.Segment
    /* renamed from: a */
    protected void parseBytes(byte[] bArr, int i, int i2) {
        super.parseBytes(bArr, i, i2);
        this.data = new int[i2 - 6];
        for (int i3 = 0; i3 < this.data.length; i3++) {
            this.data[i3] = bArr[i + 4 + i3] & 255;
        }
    }
}