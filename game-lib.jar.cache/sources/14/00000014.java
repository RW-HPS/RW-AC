package net.rudp;

/* renamed from: a.a.j */
/* loaded from: game-lib.jar:a/a/j.class */
class j implements Runnable {
    final /* synthetic */ ReliableSocket a;

    private j(ReliableSocket reliableSocket) {
        this.a = reliableSocket;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.a.o();
    }
}