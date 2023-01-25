package net.rudp;

import java.io.IOException;
import java.util.ArrayList;
import net.rudp.p002a.NULSegment;

/* renamed from: a.a.l */
/* loaded from: game-lib.jar:a/a/l.class */
class RunnableC0022l implements Runnable {

    /* renamed from: a */
    final /* synthetic */ ReliableSocket f90a;

    private RunnableC0022l(ReliableSocket reliableSocket) {
        this.f90a = reliableSocket;
    }

    @Override // java.lang.Runnable
    public void run() {
        ArrayList arrayList;
        ArrayList arrayList2;
        boolean z;
        C0019i c0019i;
        arrayList = this.f90a.f66u;
        synchronized (arrayList) {
            arrayList2 = this.f90a.f66u;
            if (arrayList2.isEmpty()) {
                try {
                    ReliableSocket reliableSocket = this.f90a;
                    c0019i = this.f90a.f70y;
                    reliableSocket.m5382e(new NULSegment(c0019i.m5359a()));
                } catch (IOException e) {
                    z = ReliableSocket.f81I;
                    if (z) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }
}