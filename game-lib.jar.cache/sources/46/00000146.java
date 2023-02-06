package com.corrodinggames.rts.appFramework;

import android.util.Log;
import android.view.MotionEvent;
import java.lang.reflect.Method;

/* loaded from: game-lib.jar:com/corrodinggames/rts/appFramework/l.class */
public class l {
    public static final boolean a;
    public static final boolean b;
    private static Method c;
    private static Method d;
    private static Method e;
    private static Method f;
    private static Method g;
    private static Method h;
    private static Method i;
    private static Method j;
    private static Method k;
    private static int l;
    private static int m;
    private static final float[] n;
    private static final float[] o;
    private static final float[] p;
    private static final int[] q;
    private static final int[] r;

    static /* synthetic */ int[] a() {
        return r;
    }

    static {
        l = 6;
        m = 8;
        boolean z = false;
        try {
            d = MotionEvent.class.getMethod("getPointerCount", new Class[0]);
            e = MotionEvent.class.getMethod("findPointerIndex", Integer.TYPE);
            f = MotionEvent.class.getMethod("getPressure", Integer.TYPE);
            g = MotionEvent.class.getMethod("getHistoricalX", Integer.TYPE, Integer.TYPE);
            h = MotionEvent.class.getMethod("getHistoricalY", Integer.TYPE, Integer.TYPE);
            i = MotionEvent.class.getMethod("getHistoricalPressure", Integer.TYPE, Integer.TYPE);
            j = MotionEvent.class.getMethod("getX", Integer.TYPE);
            k = MotionEvent.class.getMethod("getY", Integer.TYPE);
            z = true;
        } catch (Exception e2) {
            Log.b("MultiTouchController", "static initializer failed", e2);
        }
        a = z;
        if (a) {
            try {
                l = MotionEvent.class.getField("ACTION_POINTER_UP").getInt(null);
                m = MotionEvent.class.getField("ACTION_POINTER_INDEX_SHIFT").getInt(null);
            } catch (Exception e3) {
            }
        }
        boolean z2 = false;
        try {
            c = MotionEvent.class.getMethod("getButtonState", new Class[0]);
            z2 = true;
            Log.b("MultiTouchController", "--- Mouse API succeeded");
        } catch (Exception e4) {
            Log.b("MultiTouchController", "static initializer for mouse failed", e4);
        }
        b = z2;
        n = new float[10];
        o = new float[10];
        p = new float[10];
        q = new int[10];
        r = new int[10];
    }
}