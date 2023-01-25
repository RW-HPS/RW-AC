package com.corrodinggames.rts.game.units.custom.p016a.p017a;

import android.graphics.PointF;
import com.corrodinggames.rts.game.units.AbstractC0244am;
import com.corrodinggames.rts.game.units.custom.C0417bo;
import com.corrodinggames.rts.game.units.custom.C0456j;
import com.corrodinggames.rts.game.units.custom.C0458l;
import com.corrodinggames.rts.game.units.custom.p016a.AbstractC0321a;
import com.corrodinggames.rts.game.units.custom.p016a.C0339d;
import com.corrodinggames.rts.game.units.custom.p021e.C0433a;
import com.corrodinggames.rts.game.units.p013a.AbstractC0224s;
import com.corrodinggames.rts.gameFramework.C0773f;
import com.corrodinggames.rts.gameFramework.utility.C1107ab;

/* renamed from: com.corrodinggames.rts.game.units.custom.a.a.g */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/a/a/g.class */
public class C0328g extends AbstractC0321a {

    /* renamed from: a */
    C0433a f1973a;

    /* renamed from: b */
    C0433a f1974b;

    /* renamed from: c */
    double f1975c;

    /* renamed from: d */
    double f1976d;

    /* renamed from: e */
    float f1977e;

    /* renamed from: a */
    public static void m4101a(C0458l c0458l, C1107ab c1107ab, String str, String str2, C0339d c0339d, String str3, boolean z) {
        C0433a m706a = c1107ab.m706a(c0458l, str, "convertResource_from", (C0433a) null, true);
        C0433a m706a2 = c1107ab.m706a(c0458l, str, "convertResource_to", (C0433a) null, true);
        if ((m706a != null || m706a2 != null) && (m706a == null || m706a2 == null)) {
            throw new C0417bo("[" + str + "] Both convertResource_from and convertResource_to are required together");
        }
        if (m706a != null && m706a2 != null) {
            C0328g c0328g = new C0328g();
            c0328g.f1973a = m706a;
            c0328g.f1974b = m706a2;
            c0328g.f1975c = c1107ab.m691a(str, "convertResource_minAmount", 0.0d);
            c0328g.f1976d = c1107ab.m641j(str, "convertResource_maxAmount");
            if (c0328g.f1975c < 0.0d) {
                throw new C0417bo("[" + str + "] convertResource_minAmount cannot be < 0");
            }
            if (c0328g.f1976d < 0.0d) {
                throw new C0417bo("[" + str + "] convertResource_maxAmount cannot be < 0");
            }
            if (c0328g.f1976d < c0328g.f1975c) {
                throw new C0417bo("[" + str + "] convertResource_maxAmount cannot be < convertResource_minAmount");
            }
            c0328g.f1977e = c1107ab.m683a(str, "convertResource_multiplyAmountBy", Float.valueOf(1.0f)).floatValue();
            c0339d.f2112ac.add(c0328g);
        }
    }

    @Override // com.corrodinggames.rts.game.units.custom.p016a.AbstractC0321a
    /* renamed from: a */
    public boolean mo4093a(C0456j c0456j, AbstractC0224s abstractC0224s, PointF pointF, AbstractC0244am abstractC0244am, int i) {
        double mo3763a = this.f1973a.mo3763a(c0456j);
        if (mo3763a > this.f1975c) {
            double m2221a = C0773f.m2221a(mo3763a, this.f1976d);
            this.f1973a.mo3761b(c0456j, -m2221a);
            this.f1974b.mo3761b(c0456j, m2221a * this.f1977e);
            return true;
        }
        return true;
    }
}