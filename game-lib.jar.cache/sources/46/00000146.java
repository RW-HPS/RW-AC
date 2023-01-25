package com.corrodinggames.rts.appFramework;

import android.util.Log;
import android.view.MotionEvent;
import java.lang.reflect.Method;

/* renamed from: com.corrodinggames.rts.appFramework.l */
/* loaded from: game-lib.jar:com/corrodinggames/rts/appFramework/l.class */
public class C0120l {

    /* renamed from: a */
    public static final boolean f479a;

    /* renamed from: b */
    public static final boolean f480b;

    /* renamed from: c */
    private static Method f481c;

    /* renamed from: d */
    private static Method f482d;

    /* renamed from: e */
    private static Method f483e;

    /* renamed from: f */
    private static Method f484f;

    /* renamed from: g */
    private static Method f485g;

    /* renamed from: h */
    private static Method f486h;

    /* renamed from: i */
    private static Method f487i;

    /* renamed from: j */
    private static Method f488j;

    /* renamed from: k */
    private static Method f489k;

    /* renamed from: l */
    private static int f490l;

    /* renamed from: m */
    private static int f491m;

    /* renamed from: n */
    private static final float[] f492n;

    /* renamed from: o */
    private static final float[] f493o;

    /* renamed from: p */
    private static final float[] f494p;

    /* renamed from: q */
    private static final int[] f495q;

    /* renamed from: r */
    private static final int[] f496r;

    /* renamed from: a */
    static /* synthetic */ int[] m4911a() {
        return f496r;
    }

    static {
        f490l = 6;
        f491m = 8;
        boolean z = false;
        try {
            f482d = MotionEvent.class.getMethod("getPointerCount", new Class[0]);
            f483e = MotionEvent.class.getMethod("findPointerIndex", Integer.TYPE);
            f484f = MotionEvent.class.getMethod("getPressure", Integer.TYPE);
            f485g = MotionEvent.class.getMethod("getHistoricalX", Integer.TYPE, Integer.TYPE);
            f486h = MotionEvent.class.getMethod("getHistoricalY", Integer.TYPE, Integer.TYPE);
            f487i = MotionEvent.class.getMethod("getHistoricalPressure", Integer.TYPE, Integer.TYPE);
            f488j = MotionEvent.class.getMethod("getX", Integer.TYPE);
            f489k = MotionEvent.class.getMethod("getY", Integer.TYPE);
            z = true;
        } catch (Exception e) {
            Log.m5072b("MultiTouchController", "static initializer failed", e);
        }
        f479a = z;
        if (f479a) {
            try {
                f490l = MotionEvent.class.getField("ACTION_POINTER_UP").getInt(null);
                f491m = MotionEvent.class.getField("ACTION_POINTER_INDEX_SHIFT").getInt(null);
            } catch (Exception e2) {
            }
        }
        boolean z2 = false;
        try {
            f481c = MotionEvent.class.getMethod("getButtonState", new Class[0]);
            z2 = true;
            Log.m5073b("MultiTouchController", "--- Mouse API succeeded");
        } catch (Exception e3) {
            Log.m5072b("MultiTouchController", "static initializer for mouse failed", e3);
        }
        f480b = z2;
        f492n = new float[10];
        f493o = new float[10];
        f494p = new float[10];
        f495q = new int[10];
        f496r = new int[10];
    }
}