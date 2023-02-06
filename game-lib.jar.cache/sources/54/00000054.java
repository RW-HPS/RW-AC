package android.os;

import android.util.Log;
import java.util.ArrayList;

/* loaded from: game-lib.jar:android/os/MessageQueue.class */
public final class MessageQueue {
    private final boolean c;
    Message a;
    private IdleHandler[] f;
    private boolean g;
    private boolean h;
    static Object b = new Object();
    private final ArrayList e = new ArrayList();
    private long d = b();

    /* loaded from: game-lib.jar:android/os/MessageQueue$IdleHandler.class */
    public interface IdleHandler {
        boolean a();
    }

    private long b() {
        return 100L;
    }

    private void a(long j) {
    }

    private void a(long j, int i) {
        synchronized (b) {
            try {
                b.wait(i);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    private void b(long j) {
        synchronized (b) {
            b.notifyAll();
        }
    }

    MessageQueue(boolean z) {
        this.c = z;
    }

    protected void finalize() {
        try {
            c();
        } finally {
            super.finalize();
        }
    }

    private void c() {
        if (this.d != 0) {
            a(this.d);
            this.d = 0L;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:61:0x0141, code lost:
        r10 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0147, code lost:
        if (r10 >= r8) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x014a, code lost:
        r0 = r5.f[r10];
        r5.f[r10] = null;
        r12 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x015e, code lost:
        r12 = r0.a();
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x016a, code lost:
        r13 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x016c, code lost:
        android.util.Log.c("MessageQueue", "IdleHandler threw exception", r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x019e, code lost:
        r8 = 0;
        r9 = 0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    Message a() {
        IdleHandler idleHandler;
        boolean z;
        long j = this.d;
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
            a(j, i2);
            synchronized (this) {
                long a = SystemClock.a();
                Message message = null;
                Message message2 = this.a;
                if (message2 != null && message2.j == null) {
                    do {
                        message = message2;
                        message2 = message2.l;
                        if (message2 == null) {
                            break;
                        }
                    } while (!message2.e());
                }
                if (message2 != null) {
                    if (a < message2.h) {
                        i2 = (int) Math.min(message2.h - a, 2147483647L);
                    } else {
                        this.h = false;
                        if (message != null) {
                            message.l = message2.l;
                        } else {
                            this.a = message2.l;
                        }
                        message2.l = null;
                        return message2;
                    }
                } else {
                    i2 = -1;
                }
                if (this.g) {
                    c();
                    return null;
                }
                if (i < 0 && (this.a == null || a < this.a.h)) {
                    i = this.e.size();
                }
                if (i <= 0) {
                    this.h = true;
                } else {
                    if (this.f == null) {
                        this.f = new IdleHandler[Math.max(i, 4)];
                    }
                    this.f = (IdleHandler[]) this.e.toArray(this.f);
                }
            }
        }
        if (!z) {
            synchronized (this) {
                this.e.remove(idleHandler);
            }
        }
        int i3 = i3 + 1;
    }

    boolean a(Message message, long j) {
        Message message2;
        if (message.j == null) {
            throw new IllegalArgumentException("Message must have a target.");
        }
        if (message.f()) {
            throw new IllegalStateException(message + " This message is already in use.");
        }
        synchronized (this) {
            if (this.g) {
                IllegalStateException illegalStateException = new IllegalStateException(message.j + " sending message to a Handler on a dead thread");
                Log.a("MessageQueue", illegalStateException.getMessage(), illegalStateException);
                message.b();
                return false;
            }
            message.g();
            message.h = j;
            Message message3 = this.a;
            if (message3 == null || j == 0 || j < message3.h) {
                message.l = message3;
                this.a = message;
                boolean z = this.h;
            } else {
                boolean z2 = this.h && message3.j == null && message.e();
                while (true) {
                    message2 = message3;
                    message3 = message3.l;
                    if (message3 == null || j < message3.h) {
                        break;
                    } else if (z2 && message3.e()) {
                        z2 = false;
                    }
                }
                message.l = message3;
                message2.l = message;
            }
            b(this.d);
            return true;
        }
    }
}