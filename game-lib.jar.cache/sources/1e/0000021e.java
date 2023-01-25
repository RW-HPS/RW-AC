package com.corrodinggames.rts.game.units.custom.p016a.p017a;

import android.graphics.PointF;
import com.corrodinggames.rts.game.units.AbstractC0244am;
import com.corrodinggames.rts.game.units.custom.C0417bo;
import com.corrodinggames.rts.game.units.custom.C0418bp;
import com.corrodinggames.rts.game.units.custom.C0453g;
import com.corrodinggames.rts.game.units.custom.C0454h;
import com.corrodinggames.rts.game.units.custom.C0456j;
import com.corrodinggames.rts.game.units.custom.C0458l;
import com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean;
import com.corrodinggames.rts.game.units.custom.p016a.AbstractC0321a;
import com.corrodinggames.rts.game.units.custom.p016a.C0339d;
import com.corrodinggames.rts.game.units.p013a.AbstractC0224s;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.utility.C1107ab;
import com.corrodinggames.rts.gameFramework.utility.C1136m;
import java.util.Iterator;

/* renamed from: com.corrodinggames.rts.game.units.custom.a.a.o */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/a/a/o.class */
public class C0336o extends AbstractC0321a {

    /* renamed from: a */
    public C0418bp f2036a;

    /* renamed from: b */
    public int f2037b;

    /* renamed from: c */
    public C0454h f2038c;

    /* renamed from: d */
    public boolean f2039d;

    /* renamed from: e */
    public boolean f2040e;

    /* renamed from: f */
    public int f2041f = -1;

    /* renamed from: g */
    public LogicBoolean f2042g;

    /* renamed from: a */
    public static void m4092a(C0458l c0458l, C1107ab c1107ab, String str, String str2, C0339d c0339d, String str3, boolean z) {
        C0418bp m3877a = C0418bp.m3877a(c0458l, c1107ab, str, str2 + "addUnitsIntoTransport");
        int intValue = c1107ab.m667b(str, str2 + "deleteNumUnitsFromTransport", (Integer) 0).intValue();
        C0454h m3680a = C0453g.m3680a(c1107ab.m666b(str, "deleteNumUnitsFromTransport_onlyWithTags", (String) null), (C0454h) null);
        boolean booleanValue = c1107ab.m685a(str, str2 + "startUnloadingTransport", (Boolean) false).booleanValue();
        boolean booleanValue2 = c1107ab.m685a(str, str2 + "forceUnloadTransportNow", (Boolean) false).booleanValue();
        int intValue2 = c1107ab.m667b(str, str2 + "forceUnloadTransportNow_onlyOnSlot", (Integer) (-1)).intValue();
        LogicBoolean m671b = c1107ab.m671b(c0458l, str, str2 + "transportTargetNow", null);
        if (intValue2 != -1 && !booleanValue2) {
            throw new C0417bo("forceUnloadTransportNow_onlyOnSlot expects forceUnloadTransportNow");
        }
        if (!m3877a.m3872b() || intValue > 0 || booleanValue || booleanValue2 || m671b != null) {
            C0336o c0336o = new C0336o();
            if (!m3877a.m3872b()) {
                c0336o.f2036a = m3877a;
            }
            if (intValue > 0) {
                c0336o.f2037b = intValue;
                c0336o.f2038c = m3680a;
            }
            c0336o.f2039d = booleanValue;
            c0336o.f2040e = booleanValue2;
            c0336o.f2041f = intValue2;
            c0336o.f2042g = m671b;
            c0339d.f2112ac.add(c0336o);
        }
    }

    @Override // com.corrodinggames.rts.game.units.custom.p016a.AbstractC0321a
    /* renamed from: a */
    public boolean mo4093a(C0456j c0456j, AbstractC0224s abstractC0224s, PointF pointF, AbstractC0244am abstractC0244am, int i) {
        AbstractC0244am readUnit;
        if (this.f2037b != 0) {
            for (int i2 = 0; i2 < this.f2037b; i2++) {
                if (c0456j.f2895B.size() > 0) {
                    for (int size = c0456j.f2895B.size() - 1; size >= 0; size--) {
                        AbstractC0244am abstractC0244am2 = (AbstractC0244am) c0456j.f2895B.get(size);
                        if (abstractC0244am2 == null) {
                            GameEngine.print("deleteNumUnitsFromTransport unit==null");
                        } else if (this.f2038c == null || C0453g.m3684a(this.f2038c, abstractC0244am2.mo3599de())) {
                            c0456j.f2895B.remove(size);
                            c0456j.m3667D(abstractC0244am2);
                            if (abstractC0244am2 != null) {
                                abstractC0244am2.m4210ci();
                            }
                        }
                    }
                }
            }
        }
        if (this.f2036a != null) {
            C1136m c1136m = new C1136m();
            this.f2036a.m3874a(c1136m, c0456j.f1614bX, (AbstractC0244am) c0456j, false);
            Iterator it = c1136m.iterator();
            while (it.hasNext()) {
                AbstractC0244am abstractC0244am3 = (AbstractC0244am) it.next();
                abstractC0244am3.f7172eo = c0456j.f7172eo;
                abstractC0244am3.f7173ep = c0456j.f7173ep;
                abstractC0244am3.f7174eq = c0456j.f7174eq;
                c0456j.m3668C(abstractC0244am3);
            }
        }
        if (this.f2039d) {
            c0456j.m3661L();
        }
        if (this.f2040e) {
            for (int size2 = c0456j.f2895B.size() - 1; size2 >= 0; size2--) {
                if (this.f2041f == -1 || this.f2041f == size2) {
                    c0456j.m3650a((AbstractC0244am) c0456j.f2895B.get(size2), true, c0456j.f2895B.size() % 2 == 0);
                }
            }
        }
        if (this.f2042g != null && (readUnit = this.f2042g.readUnit(c0456j)) != null && readUnit.f1602bL && c0456j.mo3244d(readUnit, true)) {
            c0456j.m3668C(c0456j);
            return true;
        }
        return true;
    }
}