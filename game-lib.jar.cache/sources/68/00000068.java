package com.a.a.a;

/* loaded from: game-lib.jar:com/a/a/a/a.class */
public class a {
    private static Object[] a = new Object[0];
    private static Object[] b = new Object[73];

    public static int a(int i) {
        for (int i2 = 4; i2 < 32; i2++) {
            if (i <= (1 << i2) - 12) {
                return (1 << i2) - 12;
            }
        }
        return i;
    }

    public static int b(int i) {
        return a(i * 2) / 2;
    }

    public static int c(int i) {
        return a(i * 4) / 4;
    }
}