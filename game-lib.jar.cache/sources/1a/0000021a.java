package com.corrodinggames.rts.game.units.custom.p016a.p017a;

import android.graphics.PointF;
import com.corrodinggames.rts.game.units.AbstractC0244am;
import com.corrodinggames.rts.game.units.custom.C0418bp;
import com.corrodinggames.rts.game.units.custom.C0456j;
import com.corrodinggames.rts.game.units.custom.C0458l;
import com.corrodinggames.rts.game.units.custom.p016a.AbstractC0321a;
import com.corrodinggames.rts.game.units.custom.p016a.C0339d;
import com.corrodinggames.rts.game.units.p013a.AbstractC0224s;
import com.corrodinggames.rts.gameFramework.utility.C1107ab;
import com.corrodinggames.rts.gameFramework.utility.C1136m;
import java.util.Iterator;

/* renamed from: com.corrodinggames.rts.game.units.custom.a.a.k */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/a/a/k.class */
public class C0332k extends AbstractC0321a {

    /* renamed from: a */
    public C0418bp f2003a;

    /* renamed from: b */
    public C0418bp f2004b;

    /* renamed from: a */
    public static void m4096a(C0458l c0458l, C1107ab c1107ab, String str, String str2, C0339d c0339d, String str3, boolean z) {
        C0418bp m3877a = C0418bp.m3877a(c0458l, c1107ab, str, str2 + "produceUnits");
        if (!m3877a.m3872b()) {
            C0332k c0332k = new C0332k();
            c0332k.f2003a = m3877a;
            c0339d.f2112ac.add(c0332k);
        }
        C0418bp m3877a2 = C0418bp.m3877a(c0458l, c1107ab, str, str2 + "spawnUnits");
        if (!m3877a2.m3872b()) {
            C0332k c0332k2 = new C0332k();
            c0332k2.f2004b = m3877a2;
            c0339d.f2112ac.add(c0332k2);
        }
    }

    @Override // com.corrodinggames.rts.game.units.custom.p016a.AbstractC0321a
    /* renamed from: a */
    public boolean mo4093a(C0456j c0456j, AbstractC0224s abstractC0224s, PointF pointF, AbstractC0244am abstractC0244am, int i) {
        if (this.f2003a != null) {
            C1136m c1136m = new C1136m();
            this.f2003a.m3874a(c1136m, c0456j.f1614bX, (AbstractC0244am) c0456j, false);
            Iterator it = c1136m.iterator();
            while (it.hasNext()) {
                AbstractC0244am abstractC0244am2 = (AbstractC0244am) it.next();
                c0456j.m3666E(abstractC0244am2);
                c0456j.m3665F(abstractC0244am2);
            }
        }
        if (this.f2004b != null) {
            this.f2004b.m3879a(c0456j.f7172eo, c0456j.f7173ep, c0456j.f7174eq, c0456j.f1623cg, c0456j.f1614bX, false, c0456j);
            return true;
        }
        return true;
    }
}