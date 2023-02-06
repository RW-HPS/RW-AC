package net.rudp;

import java.io.IOException;
import net.rudp.a.ACKSegment;
import net.rudp.a.EAKSegment;
import net.rudp.a.SYNSegment;
import net.rudp.a.Segment;

/* renamed from: a.a.m */
/* loaded from: game-lib.jar:a/a/m.class */
class m extends Thread {
    final /* synthetic */ ReliableSocket a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(ReliableSocket reliableSocket) {
        super("ReliableSocket");
        this.a = reliableSocket;
        setDaemon(true);
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        Segment i;
        while (true) {
            try {
                i = this.a.i();
                if (i != null) {
                    if (i instanceof SYNSegment) {
                        this.a.a((SYNSegment) i);
                    } else if (i instanceof EAKSegment) {
                        this.a.a((EAKSegment) i);
                    } else if (!(i instanceof ACKSegment)) {
                        this.a.g(i);
                    }
                    this.a.c(i);
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