package com.corrodinggames.rts.gameFramework.p031b;

import android.graphics.RectF;

/* renamed from: com.corrodinggames.rts.gameFramework.b.ag */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/b/ag.class */
public class C0692ag {
    /* renamed from: a */
    public static void m2671a(AbstractC0699b abstractC0699b, RectF rectF) {
        int i = 0;
        int i2 = 0;
        int mo2638b = abstractC0699b.mo2638b();
        int mo2637c = abstractC0699b.mo2637c();
        if (abstractC0699b.m2634f()) {
            i = 1;
            i2 = 1;
            mo2638b--;
            mo2637c--;
        }
        rectF.m5158a(i, i2, mo2638b, mo2637c);
    }
}