package net.rudp;

import java.io.IOException;
import java.util.ArrayList;
import net.rudp.a.NULSegment;

/* renamed from: a.a.l */
/* loaded from: game-lib.jar:a/a/l.class */
class l implements Runnable {
    final /* synthetic */ ReliableSocket a;

    private l(ReliableSocket reliableSocket) {
        this.a = reliableSocket;
    }

    @Override // java.lang.Runnable
    public void run() {
        ArrayList arrayList;
        ArrayList arrayList2;
        boolean z;
        i iVar;
        arrayList = this.a.u;
        synchronized (arrayList) {
            arrayList2 = this.a.u;
            if (arrayList2.isEmpty()) {
                try {
                    ReliableSocket reliableSocket = this.a;
                    iVar = this.a.y;
                    reliableSocket.e(new NULSegment(iVar.a()));
                } catch (IOException e) {
                    z = ReliableSocket.I;
                    if (z) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }
}