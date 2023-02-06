package android.util;

/* loaded from: game-lib.jar:android/util/a.class */
class a {
    static final boolean[] a = new boolean[0];
    static final int[] b = new int[0];
    static final long[] c = new long[0];
    static final Object[] d = new Object[0];

    static int a(int[] iArr, int i, int i2) {
        int i3 = 0;
        int i4 = i - 1;
        while (i3 <= i4) {
            int i5 = (i3 + i4) >>> 1;
            int i6 = iArr[i5];
            if (i6 < i2) {
                i3 = i5 + 1;
            } else if (i6 > i2) {
                i4 = i5 - 1;
            } else {
                return i5;
            }
        }
        return i3 ^ (-1);
    }
}