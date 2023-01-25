package android.p003os;

import android.util.Log;

/* renamed from: android.os.Handler */
/* loaded from: game-lib.jar:android/os/Handler.class */
public class Handler {

    /* renamed from: a */
    final MessageQueue f268a;

    /* renamed from: b */
    final Looper f269b;

    /* renamed from: c */
    final Callback f270c;

    /* renamed from: d */
    final boolean f271d;

    /* renamed from: android.os.Handler$Callback */
    /* loaded from: game-lib.jar:android/os/Handler$Callback.class */
    public interface Callback {
        /* renamed from: a */
        boolean m5112a(Message message);
    }

    /* renamed from: a */
    public void m5121a(Message message) {
    }

    /* renamed from: b */
    public void m5117b(Message message) {
        if (message.f287k != null) {
            m5113d(message);
        } else if (this.f270c != null && this.f270c.m5112a(message)) {
        } else {
            m5121a(message);
        }
    }

    public Handler() {
        this(null, false);
    }

    public Handler(Looper looper) {
        this(looper, null, false);
    }

    public Handler(Callback callback, boolean z) {
        this.f269b = Looper.m5106d();
        if (this.f269b == null) {
            throw new RuntimeException("Can't create handler inside thread that has not called Looper.prepare()");
        }
        this.f268a = this.f269b.f274b;
        this.f270c = callback;
        this.f271d = z;
    }

    public Handler(Looper looper, Callback callback, boolean z) {
        this.f269b = looper;
        this.f268a = looper.f274b;
        this.f270c = callback;
        this.f271d = z;
    }

    /* renamed from: a */
    public final Message m5122a() {
        return Message.m5102a(this);
    }

    /* renamed from: a */
    public final boolean m5118a(Runnable runnable) {
        return m5120a(m5115b(runnable), 0L);
    }

    /* renamed from: c */
    public final boolean m5114c(Message message) {
        return m5120a(message, 0L);
    }

    /* renamed from: a */
    public final boolean m5120a(Message message, long j) {
        if (j < 0) {
            j = 0;
        }
        return m5116b(message, SystemClock.m5082a() + j);
    }

    /* renamed from: b */
    public boolean m5116b(Message message, long j) {
        MessageQueue messageQueue = this.f268a;
        if (messageQueue == null) {
            RuntimeException runtimeException = new RuntimeException(this + " sendMessageAtTime() called with no mQueue");
            Log.m5075a("Looper", runtimeException.getMessage(), runtimeException);
            return false;
        }
        return m5119a(messageQueue, message, j);
    }

    /* renamed from: a */
    private boolean m5119a(MessageQueue messageQueue, Message message, long j) {
        message.f286j = this;
        if (this.f271d) {
            message.m5099a(true);
        }
        return messageQueue.m5087a(message, j);
    }

    public String toString() {
        return "Handler (" + getClass().getName() + ") {" + Integer.toHexString(System.identityHashCode(this)) + "}";
    }

    /* renamed from: b */
    private static Message m5115b(Runnable runnable) {
        Message m5104a = Message.m5104a();
        m5104a.f287k = runnable;
        return m5104a;
    }

    /* renamed from: d */
    private static void m5113d(Message message) {
        message.f287k.run();
    }
}