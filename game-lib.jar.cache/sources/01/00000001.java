package net.rudp.a;

/* renamed from: a.a.a.a */
/* loaded from: game-lib.jar:a/a/a/a.class */
public class ACKSegment extends Segment {
    protected ACKSegment() {
    }

    public ACKSegment(int i, int i2) {
        init(64, i, 6);
        setAck(i2);
    }

    @Override // net.rudp.a.Segment
    /* renamed from: a */
    public String type() {
        return "ACK";
    }
}