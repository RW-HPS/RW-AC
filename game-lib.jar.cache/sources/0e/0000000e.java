package net.rudp;

import java.net.DatagramSocket;
import java.net.SocketAddress;
import java.util.ArrayList;
import net.rudp.p002a.Segment;

/* renamed from: a.a.e */
/* loaded from: game-lib.jar:a/a/e.class */
class C0014e extends ReliableSocket {

    /* renamed from: a */
    boolean f41a;

    /* renamed from: i */
    private ArrayList f42i;

    /* renamed from: b */
    final /* synthetic */ ReliableServerSocket f43b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0014e(ReliableServerSocket reliableServerSocket, DatagramSocket datagramSocket, SocketAddress socketAddress) {
        super(datagramSocket);
        this.f43b = reliableServerSocket;
        this.f48d = socketAddress;
    }

    @Override // net.rudp.ReliableSocket
    /* renamed from: a */
    protected void mo5399a(DatagramSocket datagramSocket, ReliableSocketProfile reliableSocketProfile) {
        this.f42i = new ArrayList();
        this.f47c = datagramSocket;
        this.f65g = reliableSocketProfile;
    }

    @Override // net.rudp.ReliableSocket
    /* renamed from: a */
    protected Segment mo5410a() {
        Segment segment;
        synchronized (this.f42i) {
            while (this.f42i.isEmpty()) {
                try {
                    this.f42i.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            segment = (Segment) this.f42i.remove(0);
        }
        return segment;
    }

    /* renamed from: a */
    protected void m5411a(Segment segment) {
        synchronized (this.f42i) {
            if (!this.f41a) {
                this.f41a = true;
                super.mo5399a(this.f47c, this.f65g);
            }
            this.f42i.add(segment);
            this.f42i.notify();
        }
    }

    @Override // net.rudp.ReliableSocket
    /* renamed from: b */
    protected void mo5396b() {
        synchronized (this.f42i) {
            this.f42i.clear();
            this.f42i.add(null);
            this.f42i.notify();
        }
    }

    @Override // net.rudp.ReliableSocket
    /* renamed from: a */
    protected void mo5400a(String str) {
        System.out.println(getPort() + ": " + str);
    }
}