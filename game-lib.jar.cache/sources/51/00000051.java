package android.os;

import android.util.Printer;

/* loaded from: game-lib.jar:android/os/Looper.class */
public final class Looper {

    /* renamed from: a  reason: collision with root package name */
    static final ThreadLocal f57a = new ThreadLocal();
    private static Looper d;
    final MessageQueue b;
    final Thread c = Thread.currentThread();
    private Printer e;

    private static void a(boolean z) {
        if (f57a.get() != null) {
            throw new RuntimeException("Only one Looper may be created per thread");
        }
        f57a.set(new Looper(z));
    }

    public static void a() {
        a(false);
        synchronized (Looper.class) {
            if (d != null) {
                throw new IllegalStateException("The main Looper has already been prepared.");
            }
            d = d();
        }
    }

    public static Looper b() {
        Looper looper;
        synchronized (Looper.class) {
            looper = d;
        }
        return looper;
    }

    public static void c() {
        Looper d2 = d();
        if (d2 == null) {
            throw new RuntimeException("No Looper; Looper.prepare() wasn't called on this thread.");
        }
        MessageQueue messageQueue = d2.b;
        while (true) {
            Message a2 = messageQueue.a();
            if (a2 == null) {
                return;
            }
            Printer printer = d2.e;
            if (printer != null) {
                printer.println(">>>>> Dispatching to " + a2.j + " " + a2.k + ": " + a2.f58a);
            }
            a2.j.b(a2);
            if (printer != null) {
                printer.println("<<<<< Finished to " + a2.j + " " + a2.k);
            }
            a2.c();
        }
    }

    public static Looper d() {
        return (Looper) f57a.get();
    }

    private Looper(boolean z) {
        this.b = new MessageQueue(z);
    }

    public Thread e() {
        return this.c;
    }

    public String toString() {
        return "Looper (" + this.c.getName() + ", tid " + this.c.getId() + ") {" + Integer.toHexString(System.identityHashCode(this)) + "}";
    }
}