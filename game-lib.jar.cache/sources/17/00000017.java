package net.rudp;

import java.io.IOException;
import net.rudp.p002a.ACKSegment;
import net.rudp.p002a.EAKSegment;
import net.rudp.p002a.SYNSegment;
import net.rudp.p002a.Segment;

/* renamed from: a.a.m */
/* loaded from: game-lib.jar:a/a/m.class */
class C0023m extends Thread {

    /* renamed from: a */
    final /* synthetic */ ReliableSocket f91a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0023m(ReliableSocket reliableSocket) {
        super("ReliableSocket");
        this.f91a = reliableSocket;
        setDaemon(true);
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        Segment m5371i;
        while (true) {
            try {
                m5371i = this.f91a.m5371i();
                if (m5371i != null) {
                    if (m5371i instanceof SYNSegment) {
                        this.f91a.m5406a((SYNSegment) m5371i);
                    } else if (m5371i instanceof EAKSegment) {
                        this.f91a.m5407a((EAKSegment) m5371i);
                    } else if (!(m5371i instanceof ACKSegment)) {
                        this.f91a.m5376g(m5371i);
                    }
                    this.f91a.m5389c(m5371i);
                } else {
                    return;
                }
            } catch (IOException e) {
                e.printStackTrace();
                return;
            }
        }
    }
}