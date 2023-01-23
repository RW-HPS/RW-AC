package android.graphics;

import java.util.HashMap;
import java.util.Locale;

/* loaded from: game-lib.jar:android/graphics/Color.class */
public class Color {

    /* renamed from: a  reason: collision with root package name */
    private static final HashMap f34a = new HashMap();

    public static int a(int i) {
        return i >>> 24;
    }

    public static int b(int i) {
        return (i >> 16) & 255;
    }

    public static int c(int i) {
        return (i >> 8) & 255;
    }

    public static int d(int i) {
        return i & 255;
    }

    public static int a(int i, int i2, int i3) {
        return (-16777216) | (i << 16) | (i2 << 8) | i3;
    }

    public static int a(int i, int i2, int i3, int i4) {
        return (i << 24) | (i2 << 16) | (i3 << 8) | i4;
    }

    public static int a(String str) {
        if (str.charAt(0) == '#') {
            long parseLong = Long.parseLong(str.substring(1), 16);
            if (str.length() == 7) {
                parseLong |= -16777216;
            } else if (str.length() != 9) {
                throw new IllegalArgumentException("Unknown color");
            }
            return (int) parseLong;
        }
        Integer num = (Integer) f34a.get(str.toLowerCase(Locale.ROOT));
        if (num != null) {
            return num.intValue();
        }
        throw new IllegalArgumentException("Unknown color");
    }

    static {
        f34a.put("black", -16777216);
        f34a.put("darkgray", -12303292);
        f34a.put("gray", -7829368);
        f34a.put("lightgray", -3355444);
        f34a.put("white", -1);
        f34a.put("red", -65536);
        f34a.put("green", -16711936);
        f34a.put("blue", -16776961);
        f34a.put("yellow", -256);
        f34a.put("cyan", -16711681);
        f34a.put("magenta", -65281);
        f34a.put("aqua", -16711681);
        f34a.put("fuchsia", -65281);
        f34a.put("darkgrey", -12303292);
        f34a.put("grey", -7829368);
        f34a.put("lightgrey", -3355444);
        f34a.put("lime", -16711936);
        f34a.put("maroon", -8388608);
        f34a.put("navy", -16777088);
        f34a.put("olive", -8355840);
        f34a.put("purple", -8388480);
        f34a.put("silver", -4144960);
        f34a.put("teal", -16744320);
    }
}