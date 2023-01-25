package com.corrodinggames.rts.java.audio.p051a;

/* renamed from: com.corrodinggames.rts.java.audio.a.n */
/* loaded from: game-lib.jar:com/corrodinggames/rts/java/audio/a/n.class */
class C1178n {

    /* renamed from: a */
    static final float[] f7274a = new float[16384];

    static {
        for (int i = 0; i < 16384; i++) {
            f7274a[i] = (float) Math.sin(((i + 0.5f) / 16384.0f) * 6.2831855f);
        }
        for (int i2 = 0; i2 < 360; i2 += 90) {
            f7274a[((int) (i2 * 45.511112f)) & 16383] = (float) Math.sin(i2 * 0.017453292f);
        }
    }
}