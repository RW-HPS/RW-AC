package net.rudp.a;

/* renamed from: a.a.a.e */
/* loaded from: game-lib.jar:a/a/a/e.class */
public class NULSegment extends Segment {
    protected NULSegment() {
    }

    public NULSegment(int i) {
        init(8, i, 6);
    }

    @Override // net.rudp.a.Segment
    /* renamed from: a */
    public String type() {
        return "NUL";
    }
}