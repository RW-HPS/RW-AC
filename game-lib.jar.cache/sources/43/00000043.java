package android.graphics;

import com.a.a.a.a;

/* loaded from: game-lib.jar:android/graphics/TemporaryBuffer.class */
public class TemporaryBuffer {

    /* renamed from: a  reason: collision with root package name */
    private static char[] f49a = null;

    public static char[] a(int i) {
        char[] cArr;
        synchronized (TemporaryBuffer.class) {
            cArr = f49a;
            f49a = null;
        }
        if (cArr == null || cArr.length < i) {
            cArr = new char[a.b(i)];
        }
        return cArr;
    }

    public static void a(char[] cArr) {
        if (cArr.length > 1000) {
            return;
        }
        synchronized (TemporaryBuffer.class) {
            f49a = cArr;
        }
    }
}