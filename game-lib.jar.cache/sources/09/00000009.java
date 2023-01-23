package a.a.a;

/* loaded from: game-lib.jar:a/a/a/i.class */
public class i implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    boolean f8a;
    String b;
    private Runnable c;
    private boolean f;
    private boolean g;
    private boolean h;
    private boolean i;
    private Object j = new Object();
    private long d = 0;
    private long e = 0;

    public i(String str, Runnable runnable) {
        this.b = str;
        this.c = runnable;
    }

    public void a() {
        this.f8a = true;
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
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void run() {
        /*
            Method dump skipped, instructions count: 248
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: a.a.a.i.run():void");
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