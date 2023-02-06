package com.corrodinggames.rts.java.audio.a;

import java.io.Closeable;
import java.io.InputStream;
import java.io.OutputStream;

/* loaded from: game-lib.jar:com/corrodinggames/rts/java/audio/a/s.class */
public final class s {
    public static final byte[] a = new byte[0];

    public static void a(InputStream inputStream, OutputStream outputStream) {
        a(inputStream, outputStream, new byte[4096]);
    }

    public static void a(InputStream inputStream, OutputStream outputStream, byte[] bArr) {
        while (true) {
            int read = inputStream.read(bArr);
            if (read != -1) {
                outputStream.write(bArr, 0, read);
            } else {
                return;
            }
        }
    }

    public static byte[] a(InputStream inputStream, int i) {
        t tVar = new t(Math.max(0, i));
        a(inputStream, tVar);
        return tVar.toByteArray();
    }

    public static void a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Throwable th) {
            }
        }
    }
}