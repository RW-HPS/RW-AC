package net.rudp;

import java.util.ArrayList;

/* renamed from: a.a.f */
/* loaded from: game-lib.jar:a/a/f.class */
class C0015f implements ReliableSocketStateListener {

    /* renamed from: a */
    final /* synthetic */ ReliableServerSocket f44a;

    private C0015f(ReliableServerSocket reliableServerSocket) {
        this.f44a = reliableServerSocket;
    }

    @Override // net.rudp.ReliableSocketStateListener
    /* renamed from: a */
    public void mo5329a(ReliableSocket reliableSocket) {
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        ArrayList arrayList4;
        ArrayList arrayList5;
        if (reliableSocket instanceof C0014e) {
            arrayList = this.f44a.f33h;
            synchronized (arrayList) {
                while (true) {
                    arrayList2 = this.f44a.f33h;
                    if (arrayList2.size() > 50) {
                        try {
                            arrayList5 = this.f44a.f33h;
                            arrayList5.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    } else {
                        arrayList3 = this.f44a.f33h;
                        arrayList3.add((C0014e) reliableSocket);
                        arrayList4 = this.f44a.f33h;
                        arrayList4.notify();
                    }
                }
            }
        }
    }

    @Override // net.rudp.ReliableSocketStateListener
    /* renamed from: b */
    public void mo5328b(ReliableSocket reliableSocket) {
    }

    @Override // net.rudp.ReliableSocketStateListener
    /* renamed from: c */
    public void mo5327c(ReliableSocket reliableSocket) {
        if (reliableSocket instanceof C0014e) {
            this.f44a.m5417a(((C0014e) reliableSocket).m5390c());
        }
    }

    @Override // net.rudp.ReliableSocketStateListener
    /* renamed from: d */
    public void mo5326d(ReliableSocket reliableSocket) {
        if (reliableSocket instanceof C0014e) {
            this.f44a.m5417a(((C0014e) reliableSocket).m5390c());
        }
    }

    @Override // net.rudp.ReliableSocketStateListener
    /* renamed from: e */
    public void mo5325e(ReliableSocket reliableSocket) {
    }
}