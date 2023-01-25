package android.util;

import java.io.StringWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

/* loaded from: game-lib.jar:android/util/Log.class */
public final class Log {

    /* renamed from: a */
    private static final ThreadLocal f302a = new ThreadLocal() { // from class: android.util.Log.1
        /* JADX INFO: Access modifiers changed from: protected */
        @Override // java.lang.ThreadLocal
        /* renamed from: a */
        public SimpleDateFormat mo5068a() {
            return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
        }
    };

    /* loaded from: game-lib.jar:android/util/Log$TerribleFailureHandler.class */
    public interface TerribleFailureHandler {
    }

    public static native boolean isLoggable(String str, int i);

    private Log() {
    }

    /* renamed from: a */
    public static int m5076a(String str, String str2) {
        return m5079a(0, 2, str, str2);
    }

    /* renamed from: b */
    public static int m5073b(String str, String str2) {
        return m5079a(0, 3, str, str2);
    }

    /* renamed from: c */
    public static int m5071c(String str, String str2) {
        return m5079a(0, 5, str, str2);
    }

    /* renamed from: a */
    public static int m5075a(String str, String str2, Throwable th) {
        return m5079a(0, 5, str, str2 + '\n' + m5074a(th));
    }

    /* renamed from: d */
    public static int m5069d(String str, String str2) {
        return m5079a(0, 6, str, str2);
    }

    /* renamed from: b */
    public static int m5072b(String str, String str2, Throwable th) {
        return m5079a(0, 6, str, str2 + '\n' + m5074a(th));
    }

    /* renamed from: c */
    public static int m5070c(String str, String str2, Throwable th) {
        return m5077a(0, str, str2, th, false);
    }

    /* renamed from: a */
    static int m5077a(int i, String str, String str2, Throwable th, boolean z) {
        throw new RuntimeException("removed");
    }

    /* renamed from: a */
    public static String m5074a(Throwable th) {
        StackTraceElement[] stackTrace;
        StringWriter stringWriter = new StringWriter();
        int length = new Throwable().getStackTrace().length;
        for (int i = 0; i < length; i++) {
            stringWriter.write(stackTrace[i].toString() + "\n");
        }
        return stringWriter.toString();
    }

    /* renamed from: a */
    public static int m5079a(int i, int i2, String str, String str2) {
        m5078a(i, str, str2);
        return 0;
    }

    /* renamed from: a */
    public static int m5078a(int i, String str, String str2) {
        System.out.println(((SimpleDateFormat) f302a.get()).format(new Date()) + ": " + str2);
        return 0;
    }
}