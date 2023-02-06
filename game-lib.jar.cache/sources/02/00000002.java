package net.rudp.a;

/* renamed from: a.a.a.b */
/* loaded from: game-lib.jar:a/a/a/b.class */
public class DATSegment extends Segment {

    /* renamed from: a */
    private byte[] data;

    protected DATSegment() {
    }

    public DATSegment(int i, int i2, byte[] bArr, int i3, int i4) {
        init(64, i, 6);
        setAck(i2);
        this.data = new byte[i4];
        System.arraycopy(bArr, i3, this.data, 0, i4);
    }

    @Override // net.rudp.a.Segment
    public int b() {
        return this.data.length + super.b();
    }

    @Override // net.rudp.a.Segment
    /* renamed from: a */
    public String type() {
        return "DAT";
    }

    public byte[] c() {
        return this.data;
    }

    @Override // net.rudp.a.Segment
    /* renamed from: d */
    public byte[] getBytes() {
        byte[] bytes = super.getBytes();
        System.arraycopy(this.data, 0, bytes, 6, this.data.length);
        return bytes;
    }

    @Override // net.rudp.a.Segment
    /* renamed from: a */
    public void parseBytes(byte[] bArr, int i, int i2) {
        super.parseBytes(bArr, i, i2);
        this.data = new byte[i2 - 6];
        System.arraycopy(bArr, i + 6, this.data, 0, this.data.length);
    }
}