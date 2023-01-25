package com.corrodinggames.rts.gameFramework.p037f;

import android.graphics.Paint;
import android.graphics.Rect;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.unitAction.C0970e;
import com.corrodinggames.rts.gameFramework.utility.C1136m;
import java.util.Iterator;

/* renamed from: com.corrodinggames.rts.gameFramework.f.aj */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/f/aj.class */
public class C0800aj {

    /* renamed from: a */
    C1136m f5184a;

    /* renamed from: b */
    Rect f5185b;

    /* renamed from: c */
    Paint f5186c;

    /* renamed from: d */
    Paint f5187d;

    /* renamed from: a */
    public void m1967a(float f, float f2) {
        C0970e c0970e;
        GameEngine gameEngine = GameEngine.getGameEngine();
        int i = 0;
        int m1927a = C0820d.m1927a(this.f5186c);
        Iterator it = this.f5184a.iterator();
        while (it.hasNext()) {
            C0801ak c0801ak = (C0801ak) it.next();
            int i2 = 0;
            C0796af c0796af = null;
            Iterator it2 = c0801ak.f5188a.iterator();
            while (it2.hasNext()) {
                C0796af c0796af2 = (C0796af) it2.next();
                if (c0796af != null) {
                    i2 += c0796af.mo1970a(this.f5186c);
                }
                int m5159d = ((int) ((f + i2) + this.f5185b.m5159d())) - (c0801ak.f5189b / 2);
                int i3 = (int) (f2 + this.f5185b.f231b + (m1927a / 2) + (i * m1927a));
                if (!(c0796af2 instanceof C0799ai)) {
                    if (c0796af2 instanceof C0798ah) {
                        C0798ah c0798ah = (C0798ah) c0796af2;
                        gameEngine.f6374bO.mo198a(c0798ah.f5177a, m5159d, i3 - (c0970e.f6623q * c0798ah.f5178b), C0795ae.f5167c, 0.0f, c0798ah.f5178b);
                    }
                    c0796af = c0796af2;
                } else {
                    C0799ai c0799ai = (C0799ai) c0796af2;
                    gameEngine.f6374bO.mo182a(c0799ai.f5182d, m5159d, i3, c0799ai.mo1969b(this.f5186c));
                    c0796af = c0796af2;
                }
            }
            i++;
        }
    }
}