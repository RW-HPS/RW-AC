package android.os;

import android.util.Log;

/* loaded from: game-lib.jar:android/os/Handler.class */
public class Handler {

    /* renamed from: a  reason: collision with root package name */
    final MessageQueue f56a;
    final Looper b;
    final Callback c;
    final boolean d;

    /* loaded from: game-lib.jar:android/os/Handler$Callback.class */
    public interface Callback {
        boolean a(Message message);
    }

    public void a(Message message) {
    }

    public void b(Message message) {
        if (message.k != null) {
            d(message);
        } else if (this.c != null && this.c.a(message)) {
        } else {
            a(message);
        }
    }

    public Handler() {
        this(null, false);
    }

    public Handler(Looper looper) {
        this(looper, null, false);
    }

    public Handler(Callback callback, boolean z) {
        this.b = Looper.d();
        if (this.b == null) {
            throw new RuntimeException("Can't create handler inside thread that has not called Looper.prepare()");
        }
        this.f56a = this.b.b;
        this.c = callback;
        this.d = z;
    }

    public Handler(Looper looper, Callback callback, boolean z) {
        this.b = looper;
        this.f56a = looper.b;
        this.c = callback;
        this.d = z;
    }

    public final Message a() {
        return Message.a(this);
    }

    public final boolean a(Runnable runnable) {
        return a(b(runnable), 0L);
    }

    public final boolean c(Message message) {
        return a(message, 0L);
    }

    public final boolean a(Message message, long j) {
        if (j < 0) {
            j = 0;
        }
        return b(message, SystemClock.a() + j);
    }

    public boolean b(Message message, long j) {
        MessageQueue messageQueue = this.f56a;
        if (messageQueue == null) {
            RuntimeException runtimeException = new RuntimeException(this + " sendMessageAtTime() called with no mQueue");
            Log.a("Looper", runtimeException.getMessage(), runtimeException);
            return false;
        }
        return a(messageQueue, message, j);
    }

    private boolean a(MessageQueue messageQueue, Message message, long j) {
        message.j = this;
        if (this.d) {
            message.a(true);
        }
        return messageQueue.a(message, j);
    }

    public String toString() {
        return "Handler (" + getClass().getName() + ") {" + Integer.toHexString(System.identityHashCode(this)) + "}";
    }

    private static Message b(Runnable runnable) {
        Message a2 = Message.a();
        a2.k = runnable;
        return a2;
    }

    private static void d(Message message) {
        message.k.run();
    }
}