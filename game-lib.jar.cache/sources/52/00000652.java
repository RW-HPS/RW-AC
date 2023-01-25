package com.corrodinggames.rts.java.audio.p051a;

import java.io.Closeable;
import java.io.InputStream;
import java.io.OutputStream;

/* renamed from: com.corrodinggames.rts.java.audio.a.s */
/* loaded from: game-lib.jar:com/corrodinggames/rts/java/audio/a/s.class */
public final class C1183s {

    /* renamed from: a */
    public static final byte[] f7296a = new byte[0];

    /* renamed from: a */
    public static void m305a(InputStream inputStream, OutputStream outputStream) {
        m304a(inputStream, outputStream, new byte[4096]);
    }

    /* renamed from: a */
    public static void m304a(InputStream inputStream, OutputStream outputStream, byte[] bArr) {
        while (true) {
            int read = inputStream.read(bArr);
            if (read != -1) {
                outputStream.write(bArr, 0, read);
            } else {
                return;
            }
        }
    }

    /* renamed from: a */
    public static byte[] m306a(InputStream inputStream, int i) {
        C1184t c1184t = new C1184t(Math.max(0, i));
        m305a(inputStream, c1184t);
        return c1184t.toByteArray();
    }

    /* renamed from: a */
    public static void m307a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Throwable th) {
            }
        }
    }
}