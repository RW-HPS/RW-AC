package com.corrodinggames.rts.game.units.custom.p016a.p017a;

import android.graphics.PointF;
import com.corrodinggames.rts.game.EnumC0200q;
import com.corrodinggames.rts.game.units.AbstractC0244am;
import com.corrodinggames.rts.game.units.AbstractC0629y;
import com.corrodinggames.rts.game.units.custom.C0417bo;
import com.corrodinggames.rts.game.units.custom.C0453g;
import com.corrodinggames.rts.game.units.custom.C0454h;
import com.corrodinggames.rts.game.units.custom.C0456j;
import com.corrodinggames.rts.game.units.custom.C0458l;
import com.corrodinggames.rts.game.units.custom.C0468u;
import com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean;
import com.corrodinggames.rts.game.units.custom.logicBooleans.UnitReference;
import com.corrodinggames.rts.game.units.custom.p016a.AbstractC0321a;
import com.corrodinggames.rts.game.units.custom.p016a.C0339d;
import com.corrodinggames.rts.game.units.custom.p020d.C0429b;
import com.corrodinggames.rts.game.units.p013a.AbstractC0224s;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.utility.C1107ab;
import com.corrodinggames.rts.gameFramework.utility.C1136m;
import java.util.Iterator;

/* renamed from: com.corrodinggames.rts.game.units.custom.a.a.m */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/a/a/m.class */
public class C0334m extends AbstractC0321a {

    /* renamed from: a */
    public C0429b f2010a;

    /* renamed from: b */
    public boolean f2011b;

    /* renamed from: c */
    public boolean f2012c;

    /* renamed from: e */
    public EnumC0200q f2014e;

    /* renamed from: f */
    public LogicBoolean f2015f;

    /* renamed from: g */
    public C0454h f2016g;

    /* renamed from: i */
    public C0429b f2018i;

    /* renamed from: j */
    public UnitReference f2019j;

    /* renamed from: l */
    public C0468u f2021l;

    /* renamed from: m */
    public C0468u f2022m;

    /* renamed from: n */
    public C0468u f2023n;

    /* renamed from: o */
    public boolean f2024o;

    /* renamed from: p */
    public boolean f2025p;

    /* renamed from: q */
    public boolean f2026q;

    /* renamed from: r */
    public boolean f2027r;

    /* renamed from: t */
    public static final C1136m f2029t = new C1136m();

    /* renamed from: u */
    public static final C0335n f2030u = new C0335n();

    /* renamed from: d */
    public float f2013d = -1.0f;

    /* renamed from: h */
    public boolean f2017h = true;

    /* renamed from: k */
    public int f2020k = 1;

    /* renamed from: s */
    public boolean f2028s = false;

    /* renamed from: a */
    public static void m4094a(C0458l c0458l, C1107ab c1107ab, String str, String str2, C0339d c0339d, String str3, boolean z) {
        boolean booleanValue = c1107ab.m685a(str, str2 + "takeResources_includeUnitsInTransport", (Boolean) false).booleanValue();
        boolean booleanValue2 = c1107ab.m685a(str, str2 + "takeResources_includeParent", (Boolean) false).booleanValue();
        LogicBoolean m671b = c1107ab.m671b(c0458l, str, str2 + "takeResources_includeReference", null);
        float floatValue = c1107ab.m683a(str, str2 + "takeResources_includeUnitsWithinRange", Float.valueOf(-1.0f)).floatValue();
        boolean booleanValue3 = c1107ab.m685a(str, str2 + "takeResources_searchOnly", (Boolean) false).booleanValue();
        C0429b m3840a = C0429b.m3840a(c0458l, c1107ab, str, str2 + "takeResources", true);
        if (booleanValue3 && m3840a != null && !m3840a.m3822c()) {
            throw new C0417bo("[" + str + "]takeResources not supported with takeResources_searchOnly");
        }
        boolean booleanValue4 = c1107ab.m685a(str, str2 + "takeResources_saveFirstUnitToCustomTarget1", (Boolean) false).booleanValue();
        boolean booleanValue5 = c1107ab.m685a(str, str2 + "takeResources_saveFirstUnitToCustomTarget2", (Boolean) false).booleanValue();
        if (!booleanValue && !booleanValue2 && floatValue < 0.0f && m671b == null) {
            if (m3840a != null && !m3840a.m3822c()) {
                throw new C0417bo("[" + str + "]takeResources requires an include (eg: takeResources_includeUnitsWithinRange, takeResources_includeUnitsInTransport) otherwise no results would be found");
            }
            if (booleanValue3) {
                throw new C0417bo("[" + str + "]takeResources_searchOnly requires an include (eg: takeResources_includeUnitsWithinRange) otherwise no results would be found");
            }
            return;
        }
        C0334m c0334m = new C0334m();
        c0339d.f2112ac.add(c0334m);
        c0334m.f2011b = booleanValue;
        c0334m.f2013d = floatValue;
        c0334m.f2012c = booleanValue2;
        c0334m.f2015f = m671b;
        c0334m.f2010a = m3840a;
        c0334m.f2028s = c1107ab.m685a(str, str2 + "takeResources_directTransferStoppingAtZero", Boolean.valueOf(c0334m.f2028s)).booleanValue();
        c0334m.f2014e = (EnumC0200q) c1107ab.m684a(str, "takeResources_includeUnitsWithinRange_team", EnumC0200q.own, EnumC0200q.class);
        c0334m.f2016g = c1107ab.m705a(c0458l, str, str2 + "takeResources_excludeUnitsWithoutTags", (C0454h) null);
        c0334m.f2019j = UnitReference.parseUnitReferenceFromConf(c0458l, c1107ab, str, str2 + "takeResources_excludeUnitsWithoutCustomTarget1EqualTo", null);
        if (c0334m.f2028s) {
            c0334m.f2017h = false;
        }
        c0334m.f2017h = c1107ab.m685a(str, str2 + "takeResources_excludeUnitsWithoutAllResources", Boolean.valueOf(c0334m.f2017h)).booleanValue();
        if (booleanValue3) {
            c0334m.f2020k = 200;
            c0334m.f2026q = true;
            c0334m.f2027r = true;
        }
        c0334m.f2020k = c1107ab.m667b(str, str2 + "takeResources_maxUnits", Integer.valueOf(c0334m.f2020k)).intValue();
        c0334m.f2021l = c1107ab.m702a(c0458l, str, str2 + "takeResources_triggerActionIfAnyCollected", (C0468u) null);
        c0334m.f2022m = c1107ab.m702a(c0458l, str, str2 + "takeResources_triggerActionIfNoneCollected", (C0468u) null);
        c0334m.f2023n = c1107ab.m702a(c0458l, str, str2 + "takeResources_triggerActionForEach", (C0468u) null);
        c0334m.f2024o = booleanValue4;
        c0334m.f2025p = booleanValue5;
        c0334m.f2026q = c1107ab.m685a(str, str2 + "takeResources_discardCollected", Boolean.valueOf(c0334m.f2026q)).booleanValue();
        c0334m.f2027r = c1107ab.m685a(str, str2 + "takeResources_keepResourcesOnTarget", Boolean.valueOf(c0334m.f2027r)).booleanValue();
        if (booleanValue3 && (!c0334m.f2026q || !c0334m.f2027r)) {
            throw new C0417bo("[" + str + "]takeResources_searchOnly shortcut expects takeResources_discardCollected and takeResources_keepResourcesOnTarget to be true");
        }
        c0334m.f2018i = C0429b.m3840a(c0458l, c1107ab, str, str2 + "takeResources_excludeUnitsWithTheseResources", true);
        if (c0334m.f2018i != null && c0334m.f2018i.m3822c()) {
            c0334m.f2018i = null;
        }
        if (c0334m.f2028s) {
            if (c0334m.f2010a.m3814e()) {
                throw new C0417bo("[" + str + "]takeResources_directTransferStoppingAtZero:true only supports custom resources right now");
            }
            if (c0334m.f2017h) {
                throw new C0417bo("[" + str + "]takeResources_directTransferStoppingAtZero:true is not supported at the same time as takeResources_excludeUnitsWithoutAllResources:true");
            }
            if (c0334m.f2027r) {
                throw new C0417bo("[" + str + "]takeResources_directTransferStoppingAtZero:true is not supported at the same time as takeResources_keepResourcesOnTarget:true");
            }
            if (c0334m.f2026q) {
                throw new C0417bo("[" + str + "]takeResources_directTransferStoppingAtZero:true is not supported at the same time as takeResources_discardCollected:true");
            }
        }
    }

    @Override // com.corrodinggames.rts.game.units.custom.p016a.AbstractC0321a
    /* renamed from: a */
    public boolean mo4093a(C0456j c0456j, AbstractC0224s abstractC0224s, PointF pointF, AbstractC0244am abstractC0244am, int i) {
        AbstractC0244am readUnit;
        C1136m c1136m = f2029t;
        c1136m.clear();
        if (this.f2011b) {
            Iterator it = c0456j.f2895B.iterator();
            while (it.hasNext()) {
                AbstractC0244am abstractC0244am2 = (AbstractC0244am) it.next();
                if (abstractC0244am2 != null && !abstractC0244am2.f1612bV) {
                    c1136m.add(abstractC0244am2);
                }
            }
        }
        if (this.f2012c) {
            if (c0456j.f1657cO != null) {
                c1136m.add(c0456j.f1657cO);
            } else if (c0456j.f1656cN != null) {
                c1136m.add(c0456j.f1657cO);
            }
        }
        if (this.f2015f != null && (readUnit = this.f2015f.readUnit(c0456j)) != null && !readUnit.f1612bV) {
            c1136m.add(readUnit);
        }
        if (this.f2013d > 0.0f) {
            f2030u.f2032b = this.f2013d * this.f2013d;
            f2030u.f2031a = this.f2016g;
            f2030u.f2033c = true;
            f2030u.f2034d = this.f2014e;
            f2030u.f2035e = c1136m;
            GameEngine.getGameEngine().f6388cc.m3209a(c0456j.f7173eo, c0456j.f7174ep, this.f2013d, c0456j, 0.0f, f2030u);
        }
        if (this.f2016g != null) {
            for (int size = c1136m.size() - 1; size >= 0; size--) {
                if (!C0453g.m3684a(this.f2016g, ((AbstractC0244am) c1136m.get(size)).mo3599de())) {
                    c1136m.remove(size);
                }
            }
        }
        if (this.f2017h) {
            for (int size2 = c1136m.size() - 1; size2 >= 0; size2--) {
                if (!this.f2010a.mo3800b((AbstractC0244am) c1136m.get(size2))) {
                    c1136m.remove(size2);
                }
            }
        }
        if (this.f2018i != null) {
            for (int size3 = c1136m.size() - 1; size3 >= 0; size3--) {
                if (this.f2018i.mo3800b((AbstractC0244am) c1136m.get(size3))) {
                    c1136m.remove(size3);
                }
            }
        }
        if (this.f2019j != null) {
            AbstractC0244am abstractC0244am3 = this.f2019j.get((AbstractC0629y) c0456j);
            for (int size4 = c1136m.size() - 1; size4 >= 0; size4--) {
                if (((AbstractC0244am) c1136m.get(size4)).f1584bu != abstractC0244am3) {
                    c1136m.remove(size4);
                }
            }
        }
        if (this.f2023n != null) {
            c1136m = new C1136m(c1136m);
        }
        boolean z = false;
        AbstractC0244am abstractC0244am4 = null;
        int i2 = 0;
        int i3 = 0;
        for (int i4 = 0; i4 < c1136m.size(); i4++) {
            AbstractC0244am abstractC0244am5 = (AbstractC0244am) c1136m.get(i4);
            if (abstractC0244am4 == null) {
                abstractC0244am4 = abstractC0244am5;
            }
            if (this.f2028s) {
                if (!this.f2010a.m3846a(abstractC0244am5, c0456j)) {
                    continue;
                }
            } else {
                if (!this.f2027r) {
                    this.f2010a.mo3806a(abstractC0244am5);
                }
                if (!this.f2026q) {
                    this.f2010a.m3809h(c0456j);
                }
            }
            if (this.f2023n != null && abstractC0244am5 != null) {
                this.f2023n.m3475a(c0456j, new PointF(abstractC0244am5.f7173eo, abstractC0244am5.f7174ep), abstractC0244am5, i + 1, i3);
                i3++;
            }
            z = true;
            i2++;
            if (i2 >= this.f2020k) {
                break;
            }
        }
        if (abstractC0244am4 != null) {
            if (this.f2024o) {
                c0456j.f1584bu = abstractC0244am4;
            }
            if (this.f2025p) {
                c0456j.f1585bv = abstractC0244am4;
            }
        }
        if (z) {
            if (this.f2021l != null) {
                this.f2021l.m3475a(c0456j, pointF, abstractC0244am, i + 1, 0);
            }
        } else if (this.f2022m != null) {
            this.f2022m.m3475a(c0456j, pointF, abstractC0244am, i + 1, 0);
        }
        c1136m.clear();
        return true;
    }
}