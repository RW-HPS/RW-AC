package net.rudp;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import net.rudp.p002a.Segment;

/* renamed from: a.a.n */
/* loaded from: game-lib.jar:a/a/n.class */
class RunnableC0024n implements Runnable {

    /* renamed from: a */
    final /* synthetic */ ReliableSocket f92a;

    private RunnableC0024n(ReliableSocket reliableSocket) {
        this.f92a = reliableSocket;
    }

    @Override // java.lang.Runnable
    public void run() {
        ArrayList arrayList;
        ArrayList arrayList2;
        arrayList = this.f92a.f66u;
        synchronized (arrayList) {
            arrayList2 = this.f92a.f66u;
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                try {
                    this.f92a.m5379f((Segment) it.next());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}