package a.a;

import java.net.DatagramSocket;
import java.net.SocketAddress;
import java.util.ArrayList;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: game-lib.jar:a/a/e.class */
public class e extends h {

    /* renamed from: a  reason: collision with root package name */
    boolean f11a;
    private ArrayList i;
    final /* synthetic */ RUDPServerSocket b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(RUDPServerSocket rUDPServerSocket, DatagramSocket datagramSocket, SocketAddress socketAddress) {
        super(datagramSocket);
        this.b = rUDPServerSocket;
        this.d = socketAddress;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // a.a.h
    public void a(DatagramSocket datagramSocket, r rVar) {
        this.i = new ArrayList();
        this.c = datagramSocket;
        this.g = rVar;
    }

    @Override // a.a.h
    protected a.a.a.h a() {
        a.a.a.h hVar;
        synchronized (this.i) {
            while (this.i.isEmpty()) {
                try {
                    this.i.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            hVar = (a.a.a.h) this.i.remove(0);
        }
        return hVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void a(a.a.a.h hVar) {
        synchronized (this.i) {
            if (!this.f11a) {
                this.f11a = true;
                super.a(this.c, this.g);
            }
            this.i.add(hVar);
            this.i.notify();
        }
    }

    @Override // a.a.h
    protected void b() {
        synchronized (this.i) {
            this.i.clear();
            this.i.add(null);
            this.i.notify();
        }
    }

    @Override // a.a.h
    protected void a(String str) {
        System.out.println(getPort() + ": " + str);
    }
}