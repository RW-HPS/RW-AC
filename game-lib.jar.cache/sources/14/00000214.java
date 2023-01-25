package com.corrodinggames.rts.game.units.custom.p016a.p017a;

import android.graphics.PointF;
import com.corrodinggames.rts.game.units.AbstractC0244am;
import com.corrodinggames.rts.game.units.AbstractC0629y;
import com.corrodinggames.rts.game.units.InterfaceC0242ak;
import com.corrodinggames.rts.game.units.custom.C0417bo;
import com.corrodinggames.rts.game.units.custom.C0418bp;
import com.corrodinggames.rts.game.units.custom.C0456j;
import com.corrodinggames.rts.game.units.custom.C0458l;
import com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope;
import com.corrodinggames.rts.game.units.custom.p016a.AbstractC0321a;
import com.corrodinggames.rts.game.units.custom.p016a.C0339d;
import com.corrodinggames.rts.game.units.custom.p018b.C0402n;
import com.corrodinggames.rts.game.units.p013a.AbstractC0224s;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.utility.C1107ab;
import com.corrodinggames.rts.gameFramework.utility.C1136m;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: com.corrodinggames.rts.game.units.custom.a.a.e */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/a/a/e.class */
public class C0326e extends AbstractC0321a {

    /* renamed from: a */
    public C0418bp f1960a;

    /* renamed from: b */
    public ArrayList f1961b;

    /* renamed from: c */
    public int f1962c;

    /* renamed from: d */
    public boolean f1963d;

    /* renamed from: e */
    public boolean f1964e;

    /* renamed from: f */
    public boolean f1965f;

    /* renamed from: a */
    public static void m4104a(C0458l c0458l, C1107ab c1107ab, String str, String str2, C0339d c0339d, String str3, boolean z) {
        C0418bp m3877a = C0418bp.m3877a(c0458l, c1107ab, str, str2 + "attachments_addNewUnits");
        int intValue = c1107ab.m667b(str, str2 + "attachments_deleteNumUnits", (Integer) 0).intValue();
        boolean booleanValue = c1107ab.m685a(str, str2 + "attachments_disconnect", (Boolean) false).booleanValue();
        boolean booleanValue2 = c1107ab.m685a(str, str2 + "attachments_unload", (Boolean) false).booleanValue();
        boolean booleanValue3 = c1107ab.m685a(str, str2 + "disconnectFromParent", (Boolean) false).booleanValue();
        if (!m3877a.m3872b() || intValue != 0 || booleanValue3 || booleanValue || booleanValue2) {
            C0326e c0326e = new C0326e();
            c0326e.f1960a = m3877a;
            String m666b = c1107ab.m666b(str, "attachments_onlyOnSlots", (String) null);
            if (m666b != null) {
                for (String str4 : m666b.split(",")) {
                    String trim = str4.trim();
                    if (!trim.equals(VariableScope.nullOrMissingString)) {
                        C0402n m3512i = c0458l.m3512i(trim);
                        if (c0326e.f1961b == null) {
                            c0326e.f1961b = new ArrayList();
                        }
                        if (m3512i == null) {
                            throw new C0417bo("[" + str + "]attachments_onlyOnSlots: Could not find attachment slot with name: " + trim);
                        }
                        c0326e.f1961b.add(m3512i);
                    }
                }
            }
            c0326e.f1962c = intValue;
            c0326e.f1965f = booleanValue3;
            c0326e.f1963d = booleanValue;
            c0326e.f1964e = booleanValue2;
            c0339d.f2112ac.add(c0326e);
        }
    }

    @Override // com.corrodinggames.rts.game.units.custom.p016a.AbstractC0321a
    /* renamed from: a */
    public boolean mo4093a(C0456j c0456j, AbstractC0224s abstractC0224s, PointF pointF, AbstractC0244am abstractC0244am, int i) {
        if ((this.f1963d || this.f1964e) && c0456j.f2896C != null && c0456j.f2896C.size() > 0) {
            int size = c0456j.f2896C.size() - 1;
            while (true) {
                if (size < 0) {
                    break;
                }
                AbstractC0244am abstractC0244am2 = (AbstractC0244am) c0456j.f2896C.get(size);
                if (abstractC0244am2 != null) {
                    if (this.f1961b != null) {
                        boolean z = false;
                        Iterator it = this.f1961b.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                if (((C0402n) it.next()).m3917a() == size) {
                                    z = true;
                                    break;
                                }
                            } else {
                                break;
                            }
                        }
                        if (!z) {
                            continue;
                        }
                    }
                    if (!(abstractC0244am2 instanceof AbstractC0629y)) {
                        GameEngine.m5460e("Failed to deattach unit:" + abstractC0244am2.mo5458r().mo3513i() + " is not an OrderableUnit");
                    } else {
                        AbstractC0629y abstractC0629y = (AbstractC0629y) abstractC0244am2;
                        if (this.f1964e) {
                            c0456j.m3650a((AbstractC0244am) abstractC0629y, true, c0456j.f2895B.size() % 2 == 0);
                        } else {
                            abstractC0629y.m2888bx();
                        }
                    }
                }
                size--;
            }
        }
        if (this.f1962c != 0) {
            for (int i2 = 0; i2 < this.f1962c; i2++) {
                if (c0456j.f2896C != null && c0456j.f2896C.size() > 0) {
                    for (int size2 = c0456j.f2896C.size() - 1; size2 >= 0; size2--) {
                        AbstractC0244am abstractC0244am3 = (AbstractC0244am) c0456j.f2896C.get(size2);
                        if (abstractC0244am3 != null) {
                            if (this.f1961b != null) {
                                boolean z2 = false;
                                Iterator it2 = this.f1961b.iterator();
                                while (true) {
                                    if (it2.hasNext()) {
                                        if (((C0402n) it2.next()).m3917a() == size2) {
                                            z2 = true;
                                            break;
                                        }
                                    } else {
                                        break;
                                    }
                                }
                                if (!z2) {
                                }
                            }
                            abstractC0244am3.m4210ci();
                            break;
                        }
                    }
                }
            }
        }
        if (this.f1960a != null) {
            C1136m c1136m = new C1136m();
            this.f1960a.m3874a(c1136m, c0456j.f1614bX, (AbstractC0244am) c0456j, true);
            Iterator it3 = c1136m.iterator();
            while (it3.hasNext()) {
                AbstractC0244am abstractC0244am4 = (AbstractC0244am) it3.next();
                boolean z3 = false;
                if (!(abstractC0244am4 instanceof AbstractC0629y)) {
                    GameEngine.m5460e("Failed to attach unit:" + abstractC0244am4.mo5458r().mo3513i() + " is not an OrderableUnit");
                } else {
                    AbstractC0629y abstractC0629y2 = (AbstractC0629y) abstractC0244am4;
                    if (this.f1961b != null) {
                        Iterator it4 = this.f1961b.iterator();
                        while (true) {
                            if (!it4.hasNext()) {
                                break;
                            }
                            C0402n c0402n = (C0402n) it4.next();
                            if (c0456j.m3648a(c0402n) == null && c0456j.mo2996a(abstractC0629y2, c0402n)) {
                                abstractC0629y2.f1659cQ = -9999;
                                z3 = true;
                                break;
                            }
                        }
                    } else {
                        Iterator it5 = c0456j.f2891x.f3258aA.iterator();
                        while (true) {
                            if (!it5.hasNext()) {
                                break;
                            }
                            C0402n c0402n2 = (C0402n) it5.next();
                            if (c0456j.m3648a(c0402n2) == null && c0456j.mo2996a(abstractC0629y2, c0402n2)) {
                                abstractC0629y2.f1659cQ = -9999;
                                z3 = true;
                                break;
                            }
                        }
                    }
                    if (!z3) {
                        abstractC0629y2.mo447a();
                    }
                }
            }
        }
        if (this.f1965f) {
            if (c0456j.f1657cO != null) {
                c0456j.m2888bx();
            }
            if (c0456j.f1656cN != null) {
                if (c0456j.f1656cN instanceof InterfaceC0242ak) {
                    ((InterfaceC0242ak) c0456j.f1656cN).mo3242e(c0456j);
                    return true;
                }
                GameEngine.m990g("transportedBy is not a TransportInterface");
                c0456j.f1656cN = null;
                return true;
            }
            return true;
        }
        return true;
    }
}