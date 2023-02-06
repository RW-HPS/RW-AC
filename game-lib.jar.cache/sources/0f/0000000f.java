package net.rudp;

import java.util.ArrayList;

/* renamed from: a.a.f */
/* loaded from: game-lib.jar:a/a/f.class */
class f implements ReliableSocketStateListener {
    final /* synthetic */ ReliableServerSocket a;

    private f(ReliableServerSocket reliableServerSocket) {
        this.a = reliableServerSocket;
    }

    @Override // net.rudp.ReliableSocketStateListener
    public void a(ReliableSocket reliableSocket) {
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        ArrayList arrayList4;
        ArrayList arrayList5;
        if (reliableSocket instanceof e) {
            arrayList = this.a.h;
            synchronized (arrayList) {
                while (true) {
                    arrayList2 = this.a.h;
                    if (arrayList2.size() > 50) {
                        try {
                            arrayList5 = this.a.h;
                            arrayList5.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    } else {
                        arrayList3 = this.a.h;
                        arrayList3.add((e) reliableSocket);
                        arrayList4 = this.a.h;
                        arrayList4.notify();
                    }
                }
            }
        }
    }

    @Override // net.rudp.ReliableSocketStateListener
    public void b(ReliableSocket reliableSocket) {
    }

    @Override // net.rudp.ReliableSocketStateListener
    public void c(ReliableSocket reliableSocket) {
        if (reliableSocket instanceof e) {
            this.a.a(((e) reliableSocket).c());
        }
    }

    @Override // net.rudp.ReliableSocketStateListener
    public void d(ReliableSocket reliableSocket) {
        if (reliableSocket instanceof e) {
            this.a.a(((e) reliableSocket).c());
        }
    }

    @Override // net.rudp.ReliableSocketStateListener
    public void e(ReliableSocket reliableSocket) {
    }
}