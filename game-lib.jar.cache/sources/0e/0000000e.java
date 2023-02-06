package net.rudp;

import java.net.DatagramSocket;
import java.net.SocketAddress;
import java.util.ArrayList;
import net.rudp.a.Segment;

/* renamed from: a.a.e */
/* loaded from: game-lib.jar:a/a/e.class */
class e extends ReliableSocket {
    boolean a;
    private ArrayList i;
    final /* synthetic */ ReliableServerSocket b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(ReliableServerSocket reliableServerSocket, DatagramSocket datagramSocket, SocketAddress socketAddress) {
        super(datagramSocket);
        this.b = reliableServerSocket;
        this.d = socketAddress;
    }

    @Override // net.rudp.ReliableSocket
    protected void a(DatagramSocket datagramSocket, ReliableSocketProfile reliableSocketProfile) {
        this.i = new ArrayList();
        this.c = datagramSocket;
        this.g = reliableSocketProfile;
    }

    @Override // net.rudp.ReliableSocket
    protected Segment a() {
        Segment segment;
        synchronized (this.i) {
            while (this.i.isEmpty()) {
                try {
                    this.i.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            segment = (Segment) this.i.remove(0);
        }
        return segment;
    }

    protected void a(Segment segment) {
        synchronized (this.i) {
            if (!this.a) {
                this.a = true;
                super.a(this.c, this.g);
            }
            this.i.add(segment);
            this.i.notify();
        }
    }

    @Override // net.rudp.ReliableSocket
    protected void b() {
        synchronized (this.i) {
            this.i.clear();
            this.i.add(null);
            this.i.notify();
        }
    }

    @Override // net.rudp.ReliableSocket
    protected void a(String str) {
        System.out.println(getPort() + ": " + str);
    }
}