package android.p003os;

import android.util.Log;
import java.util.ArrayList;

/* renamed from: android.os.MessageQueue */
/* loaded from: game-lib.jar:android/os/MessageQueue.class */
public final class MessageQueue {

    /* renamed from: c */
    private final boolean f294c;

    /* renamed from: a */
    Message f296a;

    /* renamed from: f */
    private IdleHandler[] f298f;

    /* renamed from: g */
    private boolean f299g;

    /* renamed from: h */
    private boolean f300h;

    /* renamed from: b */
    static Object f301b = new Object();

    /* renamed from: e */
    private final ArrayList f297e = new ArrayList();

    /* renamed from: d */
    private long f295d = m5086b();

    /* renamed from: android.os.MessageQueue$IdleHandler */
    /* loaded from: game-lib.jar:android/os/MessageQueue$IdleHandler.class */
    public interface IdleHandler {
        /* renamed from: a */
        boolean m5083a();
    }

    /* renamed from: b */
    private long m5086b() {
        return 100L;
    }

    /* renamed from: a */
    private void m5089a(long j) {
    }

    /* renamed from: a */
    private void m5088a(long j, int i) {
        synchronized (f301b) {
            try {
                f301b.wait(i);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: b */
    private void m5085b(long j) {
        synchronized (f301b) {
            f301b.notifyAll();
        }
    }

    MessageQueue(boolean z) {
        this.f294c = z;
    }

    protected void finalize() {
        try {
            m5084c();
        } finally {
            super.finalize();
        }
    }

    /* renamed from: c */
    private void m5084c() {
        if (this.f295d != 0) {
            m5089a(this.f295d);
            this.f295d = 0L;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:61:0x0141, code lost:
        r10 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0147, code lost:
        if (r10 >= r8) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x014a, code lost:
        r0 = r5.f298f[r10];
        r5.f298f[r10] = null;
        r12 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x015e, code lost:
        r12 = r0.m5083a();
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x016a, code lost:
        r13 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x016c, code lost:
        android.util.Log.m5070c("MessageQueue", "IdleHandler threw exception", r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x019e, code lost:
        r8 = 0;
        r9 = 0;
     */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    Message m5090a() {
        IdleHandler idleHandler;
        boolean z;
        long j = this.f295d;
        if (j == 0) {
            return null;
        }
        int i = -1;
        int i2 = 0;
        while (true) {
            if (i2 != 0) {
                Binder.flushPendingCommands();
            }
            System.out.println("corroding: nativePollOnce:" + j + "," + i2);
            m5088a(j, i2);
            synchronized (this) {
                long m5082a = SystemClock.m5082a();
                Message message = null;
                Message message2 = this.f296a;
                if (message2 != null && message2.f286j == null) {
                    do {
                        message = message2;
                        message2 = message2.f288l;
                        if (message2 == null) {
                            break;
                        }
                    } while (!message2.m5095e());
                }
                if (message2 != null) {
                    if (m5082a < message2.f284h) {
                        i2 = (int) Math.min(message2.f284h - m5082a, 2147483647L);
                    } else {
                        this.f300h = false;
                        if (message != null) {
                            message.f288l = message2.f288l;
                        } else {
                            this.f296a = message2.f288l;
                        }
                        message2.f288l = null;
                        return message2;
                    }
                } else {
                    i2 = -1;
                }
                if (this.f299g) {
                    m5084c();
                    return null;
                }
                if (i < 0 && (this.f296a == null || m5082a < this.f296a.f284h)) {
                    i = this.f297e.size();
                }
                if (i <= 0) {
                    this.f300h = true;
                } else {
                    if (this.f298f == null) {
                        this.f298f = new IdleHandler[Math.max(i, 4)];
                    }
                    this.f298f = (IdleHandler[]) this.f297e.toArray(this.f298f);
                }
            }
        }
        if (!z) {
            synchronized (this) {
                this.f297e.remove(idleHandler);
            }
        }
        int i3 = i3 + 1;
    }

    /* renamed from: a */
    boolean m5087a(Message message, long j) {
        Message message2;
        if (message.f286j == null) {
            throw new IllegalArgumentException("Message must have a target.");
        }
        if (message.m5094f()) {
            throw new IllegalStateException(message + " This message is already in use.");
        }
        synchronized (this) {
            if (this.f299g) {
                IllegalStateException illegalStateException = new IllegalStateException(message.f286j + " sending message to a Handler on a dead thread");
                Log.m5075a("MessageQueue", illegalStateException.getMessage(), illegalStateException);
                message.m5098b();
                return false;
            }
            message.m5093g();
            message.f284h = j;
            Message message3 = this.f296a;
            if (message3 == null || j == 0 || j < message3.f284h) {
                message.f288l = message3;
                this.f296a = message;
                boolean z = this.f300h;
            } else {
                boolean z2 = this.f300h && message3.f286j == null && message.m5095e();
                while (true) {
                    message2 = message3;
                    message3 = message3.f288l;
                    if (message3 == null || j < message3.f284h) {
                        break;
                    } else if (z2 && message3.m5095e()) {
                        z2 = false;
                    }
                }
                message.f288l = message3;
                message2.f288l = message;
            }
            m5085b(this.f295d);
            return true;
        }
    }
}