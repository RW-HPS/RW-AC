package net.rudp;

/* renamed from: a.a.k */
/* loaded from: game-lib.jar:a/a/k.class */
class k implements Runnable {
    final /* synthetic */ ReliableSocket a;

    private k(ReliableSocket reliableSocket) {
        this.a = reliableSocket;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.a.m();
    }
}