package net.rudp;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import net.rudp.a.Segment;

/* renamed from: a.a.n */
/* loaded from: game-lib.jar:a/a/n.class */
class n implements Runnable {
    final /* synthetic */ ReliableSocket a;

    private n(ReliableSocket reliableSocket) {
        this.a = reliableSocket;
    }

    @Override // java.lang.Runnable
    public void run() {
        ArrayList arrayList;
        ArrayList arrayList2;
        arrayList = this.a.u;
        synchronized (arrayList) {
            arrayList2 = this.a.u;
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                try {
                    this.a.f((Segment) it.next());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}