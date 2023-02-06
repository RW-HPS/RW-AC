package net.rudp.a;

/* renamed from: a.a.a.d */
/* loaded from: game-lib.jar:a/a/a/d.class */
public class FINSegment extends Segment {
    protected FINSegment() {
    }

    public FINSegment(int i) {
        init(2, i, 6);
    }

    @Override // net.rudp.a.Segment
    /* renamed from: a */
    public String type() {
        return "FIN";
    }
}