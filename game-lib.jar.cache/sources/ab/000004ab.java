package com.corrodinggames.rts.gameFramework;

import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import com.corrodinggames.rts.AssetsID;
import com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileFilter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.Field;
import java.math.BigInteger;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Iterator;
import java.util.Random;
import java.util.UUID;
import java.util.regex.Pattern;

/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/f.class */
public final class f {
    static final Random a = new Random();
    static final Random b = new Random();
    public static final PointF c = new PointF();
    private static final byte[] j = new byte[1001];
    static final PointF d;
    static final PointF e;
    static final PointF f;
    static final PointF g;
    static final PointF h;
    private static final char[] k;
    private static final float[] l;
    private static final float[] m;
    private static final float[] n;
    private static final float[] o;
    private static final float[] p;
    private static final float[] q;
    private static final float[] r;
    private static final float[] s;
    static int i;
    private static final float[] t;
    private static final float[] u;

    static {
        for (int i2 = 0; i2 < j.length; i2++) {
            j[i2] = (byte) StrictMath.round(a(i2));
        }
        d = new PointF();
        e = new PointF();
        f = new PointF();
        g = new PointF();
        h = new PointF();
        k = new char[36];
        for (int i3 = 0; i3 < 10; i3++) {
            k[i3] = (char) (48 + i3);
        }
        for (int i4 = 10; i4 < 36; i4++) {
            k[i4] = (char) ((97 + i4) - 10);
        }
        l = new float[1025];
        m = new float[1025];
        n = new float[1025];
        o = new float[1025];
        p = new float[1025];
        q = new float[1025];
        r = new float[1025];
        s = new float[1025];
        for (int i5 = 0; i5 <= 1024; i5++) {
            l[i5] = (float) ((StrictMath.atan(i5 / 1024.0f) * 3.1415927410125732d) / 3.141592653589793d);
            m[i5] = 1.5707964f - l[i5];
            n[i5] = -l[i5];
            o[i5] = l[i5] - 1.5707964f;
            p[i5] = 3.1415927f - l[i5];
            q[i5] = l[i5] + 1.5707964f;
            r[i5] = l[i5] - 3.1415927f;
            s[i5] = (-1.5707964f) - l[i5];
        }
        i = 0;
        t = new float[8192];
        u = new float[8192];
        for (int i6 = 0; i6 < 8192; i6++) {
            t[i6] = (float) StrictMath.sin(((i6 + 0.5f) / 8192.0f) * 6.2831855f);
            u[i6] = (float) StrictMath.cos(((i6 + 0.5f) / 8192.0f) * 6.2831855f);
        }
    }

    public static final void a() {
        b.setSeed(0L);
    }

    public static final int a(com.corrodinggames.rts.game.units.am amVar, int i2, int i3) {
        return a((w) amVar, i2, i3, 0);
    }

    public static final float a(com.corrodinggames.rts.game.units.am amVar, float f2, float f3, int i2) {
        if (amVar == null) {
            return a((int) (f2 * 1000.0f), (int) (f3 * 1000.0f), i2) * 0.001f;
        }
        return a((w) amVar, (int) (f2 * 1000.0f), (int) (f3 * 1000.0f), i2) * 0.001f;
    }

    public static final float b(com.corrodinggames.rts.game.units.am amVar, float f2, float f3, int i2) {
        return a((w) amVar, (int) (f2 * 1000.0f), (int) (f3 * 1000.0f), i2) * 0.001f;
    }

    public static final int a(w wVar, int i2, int i3, int i4) {
        GameEngine gameEngine = GameEngine.getGameEngine();
        if (i2 >= i3) {
            if (i2 > i3) {
                GameEngine.print("min>max");
            }
            return i2;
        }
        int i5 = gameEngine.tick + 1;
        int i6 = (int) (((int) (((int) (((int) (((int) (gameEngine.bJ + (wVar.eh * 1313))) + (wVar.eo * 13.0f))) + (wVar.ep * 13.0f))) + (wVar.eo * 130.0f))) + (wVar.ep * 130.0f));
        if (wVar instanceof com.corrodinggames.rts.game.units.am) {
            int i7 = ((com.corrodinggames.rts.game.units.am) wVar).bC;
            i6 = i6 + (i7 * 13131) + (i7 * i5);
        }
        int i8 = ((((int) ((i6 + ((i4 * 133) * i3)) + ((i4 * wVar.eh) + i4))) + (i4 * (i5 * 1313))) + ((i5 * 13) + (i5 % 10))) % (i3 - i2);
        if (i8 < 0) {
            i8 = -i8;
        }
        return i8 + i2;
    }

    public static final float a(float f2, float f3, int i2) {
        return a((int) (f2 * 100.0f), (int) (f3 * 100.0f), i2) / 100.0f;
    }

    public static final float b(float f2, float f3, int i2) {
        return a((int) (f2 * 1000.0f), (int) (f3 * 1000.0f), i2) / 1000.0f;
    }

    public static final int a(int i2, int i3, int i4) {
        GameEngine gameEngine = GameEngine.getGameEngine();
        if (i2 >= i3) {
            if (i2 > i3) {
                GameEngine.print("min>max");
            }
            return i2;
        }
        int i5 = i3 - i2;
        int i6 = ((((gameEngine.bJ + ((i4 * 133333333) * i5)) + (i4 * 13131313)) + (i4 * (gameEngine.tick * 13131313))) + ((gameEngine.tick * 1313131313) + (gameEngine.tick % 10))) % i5;
        if (i6 < 0) {
            i6 = -i6;
        }
        int i7 = i6 + i2;
        if (i7 < i2 || i7 > i3) {
            GameEngine.print("notRandInt number not in range: " + i7 + " min:" + i2 + " max:" + i3);
        }
        return i7;
    }

    public static String a(String str) {
        return new SimpleDateFormat(str).format(Calendar.getInstance().getTime());
    }

    public static final void a(InputStream inputStream, OutputStream outputStream) {
        byte[] bArr = new byte[8192];
        while (true) {
            int read = inputStream.read(bArr);
            if (read != -1) {
                outputStream.write(bArr, 0, read);
            } else {
                return;
            }
        }
    }

    public static final String a(InputStream inputStream) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[8192];
        while (true) {
            try {
                int read = inputStream.read(bArr);
                if (read == -1) {
                    break;
                }
                byteArrayOutputStream.write(bArr, 0, read);
            } catch (IOException e2) {
                e2.printStackTrace();
            }
        }
        byteArrayOutputStream.close();
        inputStream.close();
        return byteArrayOutputStream.toString();
    }

    public static final float a(float f2) {
        return (float) StrictMath.sqrt(f2);
    }

    public static final int a(int i2) {
        if (i2 > 1000 || i2 < 0) {
            return StrictMath.round(a(i2));
        }
        return j[i2];
    }

    public static final float a(float f2, float f3) {
        if (f2 > f3) {
            return f2 - f3;
        }
        if (f2 < (-f3)) {
            return f2 + f3;
        }
        return 0.0f;
    }

    public static final float a(float f2, float f3, float f4) {
        if (f2 > f3 + f4) {
            return f2 - f4;
        }
        if (f2 < f3 - f4) {
            return f2 + f4;
        }
        return f3;
    }

    public static final float b(float f2, float f3) {
        if (f2 > f3) {
            return f3;
        }
        if (f2 < (-f3)) {
            return -f3;
        }
        return f2;
    }

    public static final float b(float f2, float f3, float f4) {
        if (f2 > f4) {
            return f4;
        }
        if (f2 < f3) {
            return f3;
        }
        return f2;
    }

    public static final int b(int i2, int i3, int i4) {
        if (i2 > i4) {
            return i4;
        }
        if (i2 < i3) {
            return i3;
        }
        return i2;
    }

    public static final int b(int i2) {
        if (i2 > 255) {
            return 255;
        }
        if (i2 < 0) {
            return 0;
        }
        return i2;
    }

    public static final void a(float f2, float f3, float f4, PointF pointF) {
        float j2 = j(f4);
        float k2 = k(f4);
        pointF.x -= f2;
        pointF.y -= f3;
        float f5 = (pointF.x * k2) - (pointF.y * j2);
        float f6 = (pointF.x * j2) + (pointF.y * k2);
        pointF.x = f5 + f2;
        pointF.y = f6 + f3;
    }

    public static final float a(float f2, float f3, float f4, float f5) {
        return ((f2 - f4) * (f2 - f4)) + ((f3 - f5) * (f3 - f5));
    }

    public static final float b(float f2, float f3, float f4, float f5) {
        return (float) StrictMath.sqrt(((f2 - f4) * (f2 - f4)) + ((f3 - f5) * (f3 - f5)));
    }

    public static final int c(float f2, float f3, float f4, float f5) {
        return a((int) (((f2 - f4) * (f2 - f4)) + ((f3 - f5) * (f3 - f5))));
    }

    public static final int a(int i2, int i3, int i4, int i5) {
        int i6 = i2 - i4;
        int i7 = i3 - i5;
        if (i6 < 0) {
            i6 = -i6;
        }
        if (i7 < 0) {
            i7 = -i7;
        }
        return i6 > i7 ? i6 : i7;
    }

    public static final float a(float f2, boolean z) {
        if (!z) {
            while (true) {
                if (f2 <= 180.0f && f2 >= -180.0f) {
                    break;
                }
                if (f2 > 180.0f) {
                    f2 -= 360.0f;
                }
                if (f2 < -180.0f) {
                    f2 += 360.0f;
                }
            }
        } else {
            while (true) {
                if (f2 <= 360.0f && f2 >= 0.0f) {
                    break;
                }
                if (f2 > 360.0f) {
                    f2 -= 360.0f;
                }
                if (f2 < 0.0f) {
                    f2 += 360.0f;
                }
            }
        }
        return f2;
    }

    public static final float c(float f2, float f3, float f4) {
        float f5 = (f3 % 360.0f) - (f2 % 360.0f);
        if (f5 > 180.0f) {
            f5 -= 360.0f;
        }
        if (f5 < -180.0f) {
            f5 += 360.0f;
        }
        return f5 > f4 ? f4 : f5 < (-f4) ? -f4 : f5;
    }

    public static final float d(float f2, float f3, float f4, float f5) {
        return b(i(f5 - f3, f4 - f2));
    }

    public static final boolean a(PointF pointF, PointF pointF2, PointF pointF3, PointF pointF4) {
        float f2 = ((pointF4.y - pointF3.y) * (pointF2.x - pointF.x)) - ((pointF4.x - pointF3.x) * (pointF2.y - pointF.y));
        float f3 = ((pointF4.x - pointF3.x) * (pointF.y - pointF3.y)) - ((pointF4.y - pointF3.y) * (pointF.x - pointF3.x));
        float f4 = ((pointF2.x - pointF.x) * (pointF.y - pointF3.y)) - ((pointF2.y - pointF.y) * (pointF.x - pointF3.x));
        if (f2 == 0.0f) {
            if (f3 != 0.0f || f4 == 0.0f) {
                return false;
            }
            return false;
        }
        float f5 = f3 / f2;
        float f6 = f4 / f2;
        return f5 >= 0.0f && f5 <= 1.0f && f6 >= 0.0f && f6 <= 1.0f;
    }

    public static final float c(float f2, float f3) {
        return (a.nextFloat() * (f3 - f2)) + f2;
    }

    public static final float d(float f2, float f3) {
        return (a.nextFloat() * (f3 - f2)) + f2;
    }

    public static final int c(int i2) {
        if (i2 == 0) {
            return 0;
        }
        return a.nextInt(i2);
    }

    /* renamed from: a */
    public static int rand(int i2, int i3) {
        int nextInt;
        if (i3 == i2) {
            nextInt = 0;
        } else {
            nextInt = a.nextInt((i3 - i2) + 1);
        }
        return i2 + nextInt;
    }

    public static final void a(Rect rect) {
        if (rect.c < rect.a) {
            int i2 = rect.c;
            rect.c = rect.a;
            rect.a = i2;
        }
        if (rect.d < rect.b) {
            int i3 = rect.d;
            rect.d = rect.b;
            rect.b = i3;
        }
    }

    public static final void a(RectF rectF) {
        if (rectF.c < rectF.a) {
            float f2 = rectF.c;
            rectF.c = rectF.a;
            rectF.a = f2;
        }
        if (rectF.d < rectF.b) {
            float f3 = rectF.d;
            rectF.d = rectF.b;
            rectF.b = f3;
        }
    }

    public static final PointF d(float f2, float f3, float f4) {
        h.setSite(f2, f3 - f4);
        return h;
    }

    public static final float b(float f2) {
        return f2 * 57.29578f;
    }

    public static final float e(float f2, float f3) {
        return (float) StrictMath.pow(f2, f3);
    }

    public static final double a(double d2) {
        return d2 < 0.0d ? -d2 : d2;
    }

    public static final float c(float f2) {
        return f2 < 0.0f ? -f2 : f2;
    }

    public static final int d(int i2) {
        return i2 < 0 ? -i2 : i2;
    }

    public static final int b(int i2, int i3) {
        return i2 > i3 ? i2 : i3;
    }

    public static final int c(int i2, int i3) {
        return i2 < i3 ? i2 : i3;
    }

    public static final float f(float f2, float f3) {
        return f2 > f3 ? f2 : f3;
    }

    public static final float g(float f2, float f3) {
        return f2 < f3 ? f2 : f3;
    }

    public static final boolean h(float f2, float f3) {
        return c(f2 - f3) < 0.05f;
    }

    public static final double a(double d2, double d3) {
        return d2 < d3 ? d2 : d3;
    }

    public static boolean e(float f2, float f3, float f4) {
        if (c(c(f2) - c(f3)) < f4) {
            return true;
        }
        return false;
    }

    public static float d(float f2) {
        return (int) (f2 + 0.5f);
    }

    public static float e(float f2) {
        return (float) StrictMath.ceil(f2);
    }

    public static final int f(float f2) {
        if (f2 > 0.0f) {
            return (int) f2;
        }
        if (f2 < 0.0f) {
            return ((int) f2) - 1;
        }
        return 0;
    }

    public static void a(RectF rectF, float f2) {
        rectF.a -= f2;
        rectF.b -= f2;
        rectF.c += f2;
        rectF.d += f2;
    }

    public static void a(Rect rect, float f2) {
        rect.a = (int) (rect.a - f2);
        rect.b = (int) (rect.b - f2);
        rect.c = (int) (rect.c + f2);
        rect.d = (int) (rect.d + f2);
    }

    public static void b(Rect rect, float f2) {
        rect.a = (int) (rect.a - f2);
        rect.b = (int) (rect.b - f2);
        rect.c = (int) (rect.c + (f2 * 2.0f));
        rect.d = (int) (rect.d + (f2 * 2.0f));
    }

    public static String e(int i2) {
        StringBuilder sb = new StringBuilder();
        for (int i3 = 0; i3 < i2; i3++) {
            sb.append(k[a.nextInt(k.length)]);
        }
        return sb.toString();
    }

    public static String b() {
        return UUID.randomUUID().toString();
    }

    public static String a(boolean z) {
        return z ? "true" : "false";
    }

    public static String b(double d2) {
        if (d2 == ((int) d2)) {
            return VariableScope.nullOrMissingString + ((int) d2);
        }
        return VariableScope.nullOrMissingString + d2;
    }

    public static String g(float f2) {
        return a(f2, 2);
    }

    public static String c(double d2) {
        if (d2 == ((int) d2)) {
            return VariableScope.nullOrMissingString + ((int) d2);
        }
        return b(d2, 2);
    }

    public static String a(float f2, int i2) {
        if (f2 == ((int) f2)) {
            return VariableScope.nullOrMissingString + ((int) f2);
        }
        return b(f2, i2);
    }

    public static String a(double d2, int i2) {
        if (d2 == ((int) d2)) {
            return VariableScope.nullOrMissingString + ((int) d2);
        }
        return b(d2, i2);
    }

    public static String h(float f2) {
        if (((int) (f2 * 10.0f)) == ((int) f2) * 10) {
            return VariableScope.nullOrMissingString + ((int) f2) + "s";
        }
        return b(f2, 1) + "s";
    }

    public static String b(double d2, int i2) {
        String str = VariableScope.nullOrMissingString + d2;
        int indexOf = str.indexOf(".");
        if (indexOf == -1) {
            return str;
        }
        if (str.indexOf("E") != -1) {
            return String.format("%." + i2 + "f", Double.valueOf(d2));
        }
        int i3 = indexOf + i2 + 1;
        if (i3 > str.length()) {
            i3 = str.length();
        }
        return str.substring(0, i3);
    }

    public static String a(String str, int i2) {
        if (str == null) {
            return null;
        }
        if (str.length() < i2) {
            return str;
        }
        return str.substring(0, Math.min(str.length(), i2));
    }

    public static String b(String str, int i2) {
        if (str == null) {
            return null;
        }
        if (str.length() < i2) {
            return str;
        }
        int i3 = i2 - 3;
        if (i3 < 1) {
            i3 = 1;
        }
        return str.substring(0, Math.min(str.length(), i3)) + "...";
    }

    public static String b(String str) {
        try {
            byte[] digest = MessageDigest.getInstance("MD5").digest(str.getBytes("UTF-8"));
            StringBuilder sb = new StringBuilder(digest.length * 2);
            for (byte b2 : digest) {
                int i2 = b2 & 255;
                if (i2 < 16) {
                    sb.append('0');
                }
                sb.append(Integer.toHexString(i2));
            }
            return sb.toString();
        } catch (UnsupportedEncodingException e2) {
            throw new RuntimeException("UTF-8 should be supported", e2);
        } catch (NoSuchAlgorithmException e3) {
            throw new RuntimeException("MD5 should be supported", e3);
        }
    }

    public static String c(String str) {
        return a(a(f(str)), 14);
    }

    public static String d(String str) {
        return a(a(f(str)), 4);
    }

    public static String c(String str, int i2) {
        String a2 = a(f(str));
        for (int i3 = 0; i3 < i2; i3++) {
            a2 = a(f(a2));
        }
        return a2;
    }

    public static String e(String str) {
        return a(f(str));
    }

    static byte[] f(String str) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            messageDigest.reset();
            return messageDigest.digest(str.getBytes());
        } catch (NoSuchAlgorithmException e2) {
            throw new RuntimeException(e2);
        }
    }

    static String a(byte[] bArr) {
        return String.format("%0" + (bArr.length * 2) + "X", new BigInteger(1, bArr));
    }

    public static String b(byte[] bArr) {
        return a(c(bArr));
    }

    static byte[] c(byte[] bArr) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            messageDigest.reset();
            return messageDigest.digest(bArr);
        } catch (NoSuchAlgorithmException e2) {
            throw new RuntimeException(e2);
        }
    }

    public static int c() {
        int availableProcessors;
        int i2 = 1;
        try {
            File file = new File("/sys/devices/system/cpu/");
            if (file.exists()) {
                i2 = file.listFiles(new a()).length;
            }
        } catch (Exception e2) {
            e2.printStackTrace();
            i2 = 1;
        }
        if (i2 == 1 && (availableProcessors = Runtime.getRuntime().availableProcessors()) > 1) {
            i2 = availableProcessors;
        }
        return i2;
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/f$a.class */
    class a implements FileFilter {
        a() {
        }

        @Override // java.io.FileFilter
        public boolean accept(File file) {
            if (file != null && Pattern.matches("cpu[0-9]+", file.getName())) {
                return true;
            }
            return false;
        }
    }

    public static void a(byte[] bArr, byte[] bArr2) {
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
    }

    public static float f(float f2, float f3, float f4) {
        return f2 + ((f3 - f2) * f4);
    }

    public static float i(float f2) {
        float f3 = f2 - 1.0f;
        float f4 = f2 * 2.0f;
        return f4 < 1.0f ? f2 * f4 : 1.0f - ((f3 * f3) * 2.0f);
    }

    public static int a(int i2, int i3, float f2) {
        int a2 = Color.a(i2);
        int b2 = Color.b(i2);
        int c2 = Color.c(i2);
        int d2 = Color.d(i2);
        return Color.a((int) f(a2, Color.a(i3), f2), (int) f(b2, Color.b(i3), f2), (int) f(c2, Color.c(i3), f2), (int) f(d2, Color.d(i3), f2));
    }

    public static String d(String str, int i2) {
        String str2 = VariableScope.nullOrMissingString;
        for (int i3 = 0; i3 <= i2; i3++) {
            str2 = str2 + str;
        }
        return str2;
    }

    public static String e(String str, int i2) {
        for (int length = str.length(); length < i2; length++) {
            str = str + " ";
        }
        return str;
    }

    public static String a(String str, int i2, String str2) {
        for (int length = str.length(); length < i2; length++) {
            str = str2 + str;
        }
        return str;
    }

    public static String f(String str, int i2) {
        return String.format("%1$-" + i2 + "s", str);
    }

    public static String a(Class cls, int i2) {
        Field[] fields;
        try {
            for (Field field : cls.getFields()) {
                if (field.getInt(null) == i2) {
                    return field.getName();
                }
            }
            return null;
        } catch (IllegalAccessException e2) {
            throw new RuntimeException(e2);
        } catch (IllegalArgumentException e3) {
            throw new RuntimeException(e3);
        }
    }

    public static String f(int i2) {
        String a2 = a(AssetsID.drawable.class, i2);
        if (a2 != null) {
            return com.corrodinggames.rts.gameFramework.file.a.a("res/drawable", a2);
        }
        String a3 = a(AssetsID.raw.class, i2);
        if (a3 != null) {
            return com.corrodinggames.rts.gameFramework.file.a.a("res/raw", a3);
        }
        return null;
    }

    public static final String g(int i2) {
        if (-1000 < i2 && i2 < 1000) {
            return i2 + " B";
        }
        int i3 = 0;
        while (i3 < "kMGTPE".length() && (i2 <= -999950 || i2 >= 999950)) {
            i2 /= 1000;
            i3++;
        }
        return String.format("%.1f %cB", Double.valueOf(i2 / 1000.0d), Character.valueOf("kMGTPE".charAt(i3)));
    }

    public static final String h(int i2) {
        return String.format("#%06X", Integer.valueOf(16777215 & i2));
    }

    public static final String g(String str) {
        if (str == null) {
            return null;
        }
        return new File(str).getName().replaceFirst("[.][^.]+$", VariableScope.nullOrMissingString);
    }

    public static final String h(String str) {
        if (str.contains("\\")) {
            str = str.replace('\\', '/');
        }
        return new File(str).getParent();
    }

    public static final boolean a(Rect rect, RectF rectF) {
        return ((float) rect.a) < rectF.c && rectF.a < ((float) rect.c) && ((float) rect.b) < rectF.d && rectF.b < ((float) rect.d);
    }

    public static final boolean a(RectF rectF, RectF rectF2) {
        return rectF.a < rectF2.c && rectF2.a < rectF.c && rectF.b < rectF2.d && rectF2.b < rectF.d;
    }

    public static final int b(int i2, int i3, int i4, int i5) {
        return (i2 << 24) | (i3 << 16) | (i4 << 8) | i5;
    }

    public static final long a(long j2, long j3) {
        return (j3 - j2) / 1000000;
    }

    public static final int a(String str, char c2) {
        int i2 = 0;
        for (int i3 = 0; i3 < str.length(); i3++) {
            if (str.charAt(i3) == c2) {
                i2++;
            }
        }
        return i2;
    }

    public static final String i(String str) {
        return str.replace("&", "&amp;").replace("<", "&lt;").replace(">", "&gt;").replace("${", "$ {");
    }

    public static String a(File file) {
        int read;
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            try {
                byte[] bArr = new byte[(int) file.length()];
                int length = bArr.length;
                int i2 = 0;
                while (i2 < length && (read = fileInputStream.read(bArr, i2, length - i2)) != -1) {
                    i2 += read;
                }
                String str = new String(bArr, Charset.forName("UTF-8"));
                fileInputStream.close();
                return str;
            } catch (Throwable th) {
                fileInputStream.close();
                throw th;
            }
        } catch (FileNotFoundException e2) {
            throw new RuntimeException(e2);
        } catch (IOException e3) {
            throw new RuntimeException(e3);
        }
    }

    public static String b(InputStream inputStream) {
        int read;
        try {
            try {
                byte[] bArr = new byte[inputStream.available()];
                int length = bArr.length;
                int i2 = 0;
                while (i2 < length && (read = inputStream.read(bArr, i2, length - i2)) != -1) {
                    i2 += read;
                }
                String str = new String(bArr, Charset.forName("UTF-8"));
                inputStream.close();
                return str;
            } catch (FileNotFoundException e2) {
                throw new RuntimeException(e2);
            } catch (IOException e3) {
                throw new RuntimeException(e3);
            }
        } catch (Throwable th) {
            inputStream.close();
            throw th;
        }
    }

    public static final String a(Exception exc) {
        StringWriter stringWriter = new StringWriter();
        exc.printStackTrace(new PrintWriter(stringWriter));
        return stringWriter.toString();
    }

    public static final String b(Exception exc) {
        return a(exc, false);
    }

    public static final String a(Exception exc, boolean z) {
        Throwable th;
        String message = exc.getMessage();
        if (message == null) {
            message = exc.getClass().getName();
        } else {
            boolean z2 = false;
            if (exc instanceof NumberFormatException) {
                z2 = true;
            }
            if (exc instanceof ArrayIndexOutOfBoundsException) {
                z2 = true;
            }
            if (z2 || z) {
                message = exc.getClass().getName() + " - " + message;
            }
        }
        if (message != null && message.startsWith("java.io.IOException")) {
            message = message.substring("java.io.".length());
        }
        Throwable th2 = exc;
        while (true) {
            th = th2;
            if (th != null) {
                Throwable cause = th.getCause();
                if (cause == null || cause == exc || cause == th) {
                    break;
                }
                th2 = cause;
            } else {
                break;
            }
        }
        if (th != null && th != exc) {
            String message2 = th.getMessage();
            if (message2 == null) {
                message2 = th.getClass().getName();
            }
            boolean z3 = true;
            if (message2.equals(message)) {
                z3 = false;
            }
            if (message != null && message.contains(message2)) {
                z3 = false;
            }
            if (z3) {
                message = message + " caused by (" + message2 + ")";
            }
        }
        return message;
    }

    public static String j(String str) {
        if (str.endsWith("\n")) {
            return str.substring(0, str.length() - 1);
        }
        return str;
    }

    public static String a(String str, String str2) {
        if (str.endsWith(str2)) {
            return str.substring(0, str.length() - str2.length());
        }
        return str;
    }

    public static String k(String str) {
        return new File(str).getName();
    }

    public static String b(String str, String str2) {
        if (str2.startsWith("/") || str2.startsWith("\\")) {
            str2 = str2.substring(1);
        }
        if (str.endsWith("/")) {
            return str + str2;
        }
        if (str.endsWith("\\")) {
            str = str.substring(0, str.length() - 1);
        }
        return str + "/" + str2;
    }

    public static String a(CharSequence charSequence, Iterable iterable) {
        StringBuilder sb = new StringBuilder();
        boolean z = true;
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            if (z) {
                z = false;
            } else {
                sb.append(charSequence);
            }
            sb.append(str);
        }
        return sb.toString();
    }

    public static Integer l(String str) {
        try {
            return Integer.valueOf(str);
        } catch (NumberFormatException e2) {
            GameEngine.m5e(e2.toString());
            return null;
        }
    }

    public static Long m(String str) {
        try {
            return Long.valueOf(str);
        } catch (NumberFormatException e2) {
            GameEngine.m5e(e2.toString());
            return null;
        }
    }

    public static boolean n(String str) {
        int length = str.length();
        int i2 = 0;
        while (true) {
            int i3 = i2;
            if (i3 < length) {
                int codePointAt = str.codePointAt(i3);
                if (codePointAt > 128) {
                    return true;
                }
                i2 = i3 + Character.charCount(codePointAt);
            } else {
                return false;
            }
        }
    }

    public static String a(long j2) {
        int[] b2;
        String str;
        if (b(j2)[0] == 0) {
            str = a(VariableScope.nullOrMissingString + b2[1], 2, "0") + ":" + a(VariableScope.nullOrMissingString + b2[2], 2, "0");
        } else {
            str = a(VariableScope.nullOrMissingString + b2[0], 2, "0") + ":" + a(VariableScope.nullOrMissingString + b2[1], 2, "0") + ":" + a(VariableScope.nullOrMissingString + b2[2], 2, "0");
        }
        return str;
    }

    public static int[] b(long j2) {
        int i2 = ((int) j2) / 3600;
        int i3 = ((int) j2) - (i2 * 3600);
        int i4 = i3 / 60;
        return new int[]{i2, i4, i3 - (i4 * 60)};
    }

    public static final float i(float f2, float f3) {
        try {
            if (f3 >= 0.0f) {
                if (f2 >= 0.0f) {
                    if (f3 >= f2) {
                        return l[(int) (((1024.0f * f2) / f3) + 0.5d)];
                    }
                    return m[(int) (((1024.0f * f3) / f2) + 0.5d)];
                } else if (f3 >= (-f2)) {
                    return n[(int) ((((-1024.0f) * f2) / f3) + 0.5d)];
                } else {
                    return o[(int) ((((-1024.0f) * f3) / f2) + 0.5d)];
                }
            } else if (f2 >= 0.0f) {
                if ((-f3) >= f2) {
                    return p[(int) ((((-1024.0f) * f2) / f3) + 0.5d)];
                }
                return q[(int) ((((-1024.0f) * f3) / f2) + 0.5d)];
            } else if (f3 <= f2) {
                return r[(int) (((1024.0f * f2) / f3) + 0.5d)];
            } else {
                return s[(int) (((1024.0f * f3) / f2) + 0.5d)];
            }
        } catch (ArrayIndexOutOfBoundsException e2) {
            if (i < 100) {
                GameEngine.m5e("atan2 slow fallback for y:" + f2 + " x:" + f3);
                i++;
            }
            return (float) StrictMath.atan2(f2, f3);
        }
    }

    public static final float j(float f2) {
        return t[((int) (f2 * 22.755556f)) & 8191];
    }

    public static final float k(float f2) {
        return u[((int) (f2 * 22.755556f)) & 8191];
    }

    public static String o(String str) {
        if (str.contains("&")) {
            str = str.replace("&lt;", "<").replace("&gt;", ">").replace("&apos;", "'").replace("&quot;", "\"").replace("&amp;", "&");
        }
        return str;
    }

    public static String p(String str) {
        if (str == null || str.length() < 2) {
            return null;
        }
        char charAt = str.charAt(0);
        if ((charAt != '\"' && charAt != '\'') || str.charAt(str.length() - 1) != charAt) {
            return null;
        }
        boolean z = false;
        StringBuilder sb = new StringBuilder();
        for (int i2 = 1; i2 < str.length() - 1; i2++) {
            char charAt2 = str.charAt(i2);
            boolean z2 = z;
            z = false;
            if (!z2) {
                if (charAt2 == '\\') {
                    z = true;
                } else if (charAt2 == charAt) {
                    return null;
                }
            }
            sb.append(charAt2);
        }
        return sb.toString();
    }

    public static String q(String str) {
        char[] charArray;
        boolean z = false;
        StringBuilder sb = new StringBuilder();
        for (char c2 : str.toCharArray()) {
            boolean z2 = z;
            z = false;
            if (!z2 && c2 == '\\') {
                z = true;
            } else {
                sb.append(c2);
            }
        }
        return sb.toString();
    }

    public static final String a(String str, String str2, String str3) {
        if (!c(str, str2)) {
            return str;
        }
        return str.replace(str2, str3);
    }

    public static final boolean c(String str, String str2) {
        return str.indexOf(str2) > -1;
    }

    public static final boolean b(String str, char c2) {
        return str.indexOf(c2) > -1;
    }

    public static String[] c(String str, char c2) {
        int i2;
        if (str.length() == 0) {
            return new String[]{VariableScope.nullOrMissingString};
        }
        int i3 = 0;
        int i4 = 0;
        while (true) {
            i2 = i4;
            int indexOf = str.indexOf(c2, i2);
            if (indexOf == -1) {
                break;
            }
            i3++;
            i4 = indexOf + 1;
        }
        if (i3 == 0) {
            return new String[]{str};
        }
        int length = str.length();
        if (i2 == length) {
            if (i3 == length) {
                return new String[0];
            }
            do {
                i2--;
            } while (str.charAt(i2 - 1) == c2);
            i3 -= str.length() - i2;
            length = i2;
        }
        String[] strArr = new String[i3 + 1];
        int i5 = 0;
        for (int i6 = 0; i6 != i3; i6++) {
            int indexOf2 = str.indexOf(c2, i5);
            strArr[i6] = str.substring(i5, indexOf2);
            i5 = indexOf2 + 1;
        }
        strArr[i3] = str.substring(i5, length);
        return strArr;
    }

    public static boolean r(String str) {
        for (int i2 = 0; i2 < str.length(); i2++) {
            char charAt = str.charAt(i2);
            if (!Character.isDigit(charAt) && charAt != '.' && (charAt != '-' || i2 != 0)) {
                return false;
            }
        }
        return true;
    }

    public static boolean s(String str) {
        boolean z = false;
        for (int i2 = 0; i2 < str.length(); i2++) {
            char charAt = str.charAt(i2);
            if (!Character.isDigit(charAt) && (charAt != '-' || i2 != 0)) {
                if (!z && charAt == '.') {
                    z = true;
                } else {
                    return false;
                }
            }
        }
        return true;
    }

    public static final boolean j(float f2, float f3) {
        return c(f2 - f3) < 1.0E-4f;
    }

    public static final boolean k(float f2, float f3) {
        return c(f2 - f3) < 1.0E-7f;
    }

    public static boolean b(double d2, double d3) {
        return a(d2 - d3) < 1.0000000116860974E-7d;
    }

    public static final boolean d(String str, String str2) {
        if (str == null) {
            return str2 == null;
        }
        return str.equals(str2);
    }

    public static final boolean a(Integer num, Integer num2) {
        if (num == null) {
            return num2 == null;
        }
        return num.equals(num2);
    }
}