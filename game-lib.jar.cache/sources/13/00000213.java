package com.corrodinggames.rts.game.units.custom.p016a.p017a;

import android.graphics.PointF;
import com.corrodinggames.rts.game.units.AbstractC0244am;
import com.corrodinggames.rts.game.units.custom.C0456j;
import com.corrodinggames.rts.game.units.custom.C0458l;
import com.corrodinggames.rts.game.units.custom.C0462o;
import com.corrodinggames.rts.game.units.custom.p016a.AbstractC0321a;
import com.corrodinggames.rts.game.units.custom.p016a.C0339d;
import com.corrodinggames.rts.game.units.p013a.AbstractC0224s;
import com.corrodinggames.rts.gameFramework.utility.C1107ab;

/* renamed from: com.corrodinggames.rts.game.units.custom.a.a.d */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/a/a/d.class */
public class C0325d extends AbstractC0321a {

    /* renamed from: a */
    boolean f1953a;

    /* renamed from: b */
    boolean f1954b;

    /* renamed from: c */
    C0462o f1955c;

    /* renamed from: d */
    C0462o f1956d;

    /* renamed from: e */
    boolean f1957e;

    /* renamed from: f */
    int f1958f = Integer.MIN_VALUE;

    /* renamed from: g */
    int f1959g = Integer.MIN_VALUE;

    /* renamed from: a */
    public static void m4105a(C0458l c0458l, C1107ab c1107ab, String str, String str2, C0339d c0339d, String str3, boolean z) {
        boolean booleanValue = c1107ab.m685a(str, str2 + "finishPlayingLastAnimation", (Boolean) false).booleanValue();
        boolean booleanValue2 = c1107ab.m685a(str, str2 + "stopLastAnimation", (Boolean) false).booleanValue();
        C0462o m3543a = c0458l.m3543a(c1107ab.m666b(str, str2 + "playAnimation", (String) null), (C0462o) null);
        C0462o m3543a2 = c0458l.m3543a(c1107ab.m666b(str, str2 + "playAnimationIfNotPlaying", (String) null), (C0462o) null);
        if (m3543a != null && m3543a2 != null) {
            throw new RuntimeException("Cannot use playAnimation and playAnimationIfNotPlaying at same time");
        }
        if (booleanValue2 && booleanValue) {
            throw new RuntimeException("Cannot use stopLastAnimation and finishPlayingLastAnimation at same time");
        }
        if (m3543a != null || m3543a2 != null || booleanValue || booleanValue2) {
            C0325d c0325d = new C0325d();
            c0325d.f1953a = booleanValue;
            c0325d.f1954b = booleanValue2;
            c0325d.f1955c = m3543a;
            c0325d.f1956d = m3543a2;
            c0325d.f1957e = c1107ab.m685a(str, str2 + "playAnimation_lowPriority", (Boolean) false).booleanValue();
            c0339d.f2112ac.add(c0325d);
        }
    }

    @Override // com.corrodinggames.rts.game.units.custom.p016a.AbstractC0321a
    /* renamed from: a */
    public boolean mo4093a(C0456j c0456j, AbstractC0224s abstractC0224s, PointF pointF, AbstractC0244am abstractC0244am, int i) {
        if (this.f1953a) {
            c0456j.f2869b.m3788b();
        }
        if (this.f1954b) {
            c0456j.f2869b.m3794a();
        }
        if (this.f1955c != null) {
            int i2 = 15;
            if (this.f1957e) {
                i2 = 4;
            }
            c0456j.f2869b.m3790a(this.f1955c.m3480b(), i2, true);
        }
        if (this.f1956d != null) {
            int i3 = 15;
            if (this.f1957e) {
                i3 = 4;
            }
            if (!c0456j.f2869b.m3792a(this.f1956d.m3480b())) {
                c0456j.f2869b.m3790a(this.f1956d.m3480b(), i3, true);
                return true;
            }
            return true;
        }
        return true;
    }
}