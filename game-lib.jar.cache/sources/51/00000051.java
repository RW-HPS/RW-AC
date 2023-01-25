package android.p003os;

import android.util.Printer;

/* renamed from: android.os.Looper */
/* loaded from: game-lib.jar:android/os/Looper.class */
public final class Looper {

    /* renamed from: a */
    static final ThreadLocal f272a = new ThreadLocal();

    /* renamed from: d */
    private static Looper f273d;

    /* renamed from: b */
    final MessageQueue f274b;

    /* renamed from: c */
    final Thread f275c = Thread.currentThread();

    /* renamed from: e */
    private Printer f276e;

    /* renamed from: a */
    private static void m5109a(boolean z) {
        if (f272a.get() != null) {
            throw new RuntimeException("Only one Looper may be created per thread");
        }
        f272a.set(new Looper(z));
    }

    /* renamed from: a */
    public static void m5110a() {
        m5109a(false);
        synchronized (Looper.class) {
            if (f273d != null) {
                throw new IllegalStateException("The main Looper has already been prepared.");
            }
            f273d = m5106d();
        }
    }

    /* renamed from: b */
    public static Looper m5108b() {
        Looper looper;
        synchronized (Looper.class) {
            looper = f273d;
        }
        return looper;
    }

    /* renamed from: c */
    public static void m5107c() {
        Looper m5106d = m5106d();
        if (m5106d == null) {
            throw new RuntimeException("No Looper; Looper.prepare() wasn't called on this thread.");
        }
        MessageQueue messageQueue = m5106d.f274b;
        while (true) {
            Message m5090a = messageQueue.m5090a();
            if (m5090a == null) {
                return;
            }
            Printer printer = m5106d.f276e;
            if (printer != null) {
                printer.println(">>>>> Dispatching to " + m5090a.f286j + " " + m5090a.f287k + ": " + m5090a.f277a);
            }
            m5090a.f286j.m5117b(m5090a);
            if (printer != null) {
                printer.println("<<<<< Finished to " + m5090a.f286j + " " + m5090a.f287k);
            }
            m5090a.m5097c();
        }
    }

    /* renamed from: d */
    public static Looper m5106d() {
        return (Looper) f272a.get();
    }

    private Looper(boolean z) {
        this.f274b = new MessageQueue(z);
    }

    /* renamed from: e */
    public Thread m5105e() {
        return this.f275c;
    }

    public String toString() {
        return "Looper (" + this.f275c.getName() + ", tid " + this.f275c.getId() + ") {" + Integer.toHexString(System.identityHashCode(this)) + "}";
    }
}