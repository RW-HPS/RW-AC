package com.corrodinggames.rts.game.units.custom.p016a.p017a;

import android.graphics.PointF;
import com.corrodinggames.rts.game.units.AbstractC0244am;
import com.corrodinggames.rts.game.units.custom.C0456j;
import com.corrodinggames.rts.game.units.custom.C0458l;
import com.corrodinggames.rts.game.units.custom.p016a.AbstractC0321a;
import com.corrodinggames.rts.game.units.custom.p016a.C0339d;
import com.corrodinggames.rts.game.units.custom.p020d.C0430c;
import com.corrodinggames.rts.game.units.custom.p021e.C0433a;
import com.corrodinggames.rts.game.units.p013a.AbstractC0224s;
import com.corrodinggames.rts.gameFramework.utility.C1107ab;

/* renamed from: com.corrodinggames.rts.game.units.custom.a.a.a */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/a/a/a.class */
public class C0322a extends AbstractC0321a {

    /* renamed from: a */
    C0433a f1916a;

    /* renamed from: c */
    C0433a f1918c;

    /* renamed from: e */
    C0430c f1920e;

    /* renamed from: f */
    C0430c f1921f;

    /* renamed from: b */
    double f1917b = -1.7976931348623157E308d;

    /* renamed from: d */
    float f1919d = 1.0f;

    /* renamed from: a */
    public static void m4108a(C0458l c0458l, C1107ab c1107ab, String str, String str2, C0339d c0339d, String str3, boolean z) {
        C0433a m706a = c1107ab.m706a(c0458l, str, str2 + "resourceAmount", (C0433a) null, true);
        if (m706a != null) {
            C0322a c0322a = new C0322a();
            c0322a.f1916a = m706a;
            c0322a.f1917b = c1107ab.m691a(str, str2 + "resourceAmount_setValue", -1.7976931348623157E308d);
            c0322a.f1918c = c1107ab.m706a(c0458l, str, str2 + "resourceAmount_addOtherResource", (C0433a) null, true);
            c0322a.f1919d = c1107ab.m683a(str, str2 + "resourceAmount_multiplyBy", Float.valueOf(1.0f)).floatValue();
            c0339d.f2112ac.add(c0322a);
        }
        C0430c m3804a = C0430c.m3804a(c0458l, c1107ab, str, str2 + "addResourcesWithLogic", null);
        C0430c m3804a2 = C0430c.m3804a(c0458l, c1107ab, str, str2 + "setResourcesWithLogic", null);
        if (m3804a != null || m3804a2 != null) {
            C0322a c0322a2 = new C0322a();
            c0322a2.f1921f = m3804a2;
            c0322a2.f1920e = m3804a;
            c0339d.f2112ac.add(c0322a2);
        }
    }

    @Override // com.corrodinggames.rts.game.units.custom.p016a.AbstractC0321a
    /* renamed from: a */
    public boolean mo4093a(C0456j c0456j, AbstractC0224s abstractC0224s, PointF pointF, AbstractC0244am abstractC0244am, int i) {
        double mo3763a;
        if (this.f1916a != null) {
            if (this.f1917b != -1.7976931348623157E308d) {
                mo3763a = this.f1917b;
            } else {
                mo3763a = this.f1916a.mo3763a(c0456j);
            }
            if (this.f1918c != null) {
                mo3763a += this.f1918c.mo3763a(c0456j);
            }
            this.f1916a.mo3762a(c0456j, mo3763a * this.f1919d);
        }
        if (this.f1921f != null) {
            this.f1921f.m3798d(c0456j);
        }
        if (this.f1920e != null) {
            this.f1920e.m3797e(c0456j);
            return true;
        }
        return true;
    }
}