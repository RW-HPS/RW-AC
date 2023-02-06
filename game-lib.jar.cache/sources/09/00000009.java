package net.rudp.a;

/* renamed from: a.a.a.i */
/* loaded from: game-lib.jar:a/a/a/i.class */
public class Timer implements Runnable {
    boolean a;
    String b;
    private Runnable c;
    private boolean f;
    private boolean g;
    private boolean h;
    private boolean i;
    private Object j = new Object();
    private long d = 0;
    private long e = 0;

    public Timer(String str, Runnable runnable) {
        this.b = str;
        this.c = runnable;
    }

    public void a() {
        this.a = true;
        Thread thread = new Thread(this, this.b);
        thread.setDaemon(true);
        thread.start();
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x003e, code lost:
        r0 = r5.j;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0044, code lost:
        monitor-enter(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0045, code lost:
        r5.h = false;
        r5.f = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0055, code lost:
        if (r5.d <= 0) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0058, code lost:
        r5.j.wait(r5.d);
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0066, code lost:
        r7 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0067, code lost:
        r7.printStackTrace();
     */
    /* JADX WARN: Removed duplicated region for block: B:107:0x00c2 A[EDGE_INSN: B:107:0x00c2->B:59:0x00c2 ?: BREAK  , SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00c7 A[Catch: all -> 0x00d8, TRY_ENTER, TryCatch #3 {, blocks: (B:53:0x00a3, B:54:0x00a8, B:57:0x00bb, B:60:0x00c3, B:62:0x00c7, B:65:0x00cf, B:68:0x00d4, B:56:0x00b7), top: B:86:0x00a3, inners: #0 }] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void run() {
        Object obj;
        while (true) {
            if (!this.i) {
                synchronized (this) {
                    while (!this.g && !this.i) {
                        try {
                            wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    if (this.i) {
                        break;
                    }
                }
                break;
            }
            break;
        }
        if (this.i) {
            this.c = null;
            return;
        }
        return;
        if (this.f) {
            if (!this.h) {
                this.c.run();
            }
        }
        if (this.f) {
        } else {
            if (!this.h) {
                this.c.run();
            }
            if (this.e > 0) {
                while (true) {
                    synchronized (this.j) {
                        this.h = false;
                        try {
                            this.j.wait(this.e);
                        } catch (InterruptedException e2) {
                            e2.printStackTrace();
                        }
                        if (this.f) {
                        }
                    }
                }
            } else {
                continue;
            }
        }
    }

    public synchronized void a(long j) {
        a(j, 0L);
    }

    public synchronized void a(long j, long j2) {
        this.d = j;
        this.e = j2;
        if (this.g) {
            throw new IllegalStateException("already scheduled");
        }
        this.g = true;
        notify();
        synchronized (this.j) {
            this.j.notify();
        }
    }

    public synchronized boolean b() {
        return this.g;
    }

    public synchronized boolean c() {
        return !b();
    }

    public synchronized void d() {
        synchronized (this.j) {
            this.h = true;
            this.j.notify();
        }
    }

    public synchronized void e() {
        this.g = false;
        synchronized (this.j) {
            this.f = true;
            this.j.notify();
        }
    }

    public synchronized void f() {
        e();
        this.i = true;
        notify();
    }
}