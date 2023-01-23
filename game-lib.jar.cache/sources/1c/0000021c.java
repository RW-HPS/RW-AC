package com.corrodinggames.rts.game.units.custom.a.a;

import android.graphics.PointF;
import com.corrodinggames.rts.game.q;
import com.corrodinggames.rts.game.units.a.s;
import com.corrodinggames.rts.game.units.am;
import com.corrodinggames.rts.game.units.custom.bo;
import com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean;
import com.corrodinggames.rts.game.units.custom.logicBooleans.UnitReference;
import com.corrodinggames.rts.game.units.custom.u;
import com.corrodinggames.rts.game.units.y;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.utility.ab;
import java.util.Iterator;

/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/a/a/m.class */
public class m extends com.corrodinggames.rts.game.units.custom.a.a {

    /* renamed from: a  reason: collision with root package name */
    public com.corrodinggames.rts.game.units.custom.d.b f229a;
    public boolean b;
    public boolean c;
    public q e;
    public LogicBoolean f;
    public com.corrodinggames.rts.game.units.custom.h g;
    public com.corrodinggames.rts.game.units.custom.d.b i;
    public UnitReference j;
    public u l;
    public u m;
    public u n;
    public boolean o;
    public boolean p;
    public boolean q;
    public boolean r;
    public static final com.corrodinggames.rts.gameFramework.utility.m t = new com.corrodinggames.rts.gameFramework.utility.m();
    public static final n u = new n();
    public float d = -1.0f;
    public boolean h = true;
    public int k = 1;
    public boolean s = false;

    public static void a(com.corrodinggames.rts.game.units.custom.l lVar, ab abVar, String str, String str2, com.corrodinggames.rts.game.units.custom.a.d dVar, String str3, boolean z) {
        boolean booleanValue = abVar.a(str, str2 + "takeResources_includeUnitsInTransport", (Boolean) false).booleanValue();
        boolean booleanValue2 = abVar.a(str, str2 + "takeResources_includeParent", (Boolean) false).booleanValue();
        LogicBoolean b = abVar.b(lVar, str, str2 + "takeResources_includeReference", null);
        float floatValue = abVar.a(str, str2 + "takeResources_includeUnitsWithinRange", Float.valueOf(-1.0f)).floatValue();
        boolean booleanValue3 = abVar.a(str, str2 + "takeResources_searchOnly", (Boolean) false).booleanValue();
        com.corrodinggames.rts.game.units.custom.d.b a2 = com.corrodinggames.rts.game.units.custom.d.b.a(lVar, abVar, str, str2 + "takeResources", true);
        if (booleanValue3 && a2 != null && !a2.c()) {
            throw new bo("[" + str + "]takeResources not supported with takeResources_searchOnly");
        }
        boolean booleanValue4 = abVar.a(str, str2 + "takeResources_saveFirstUnitToCustomTarget1", (Boolean) false).booleanValue();
        boolean booleanValue5 = abVar.a(str, str2 + "takeResources_saveFirstUnitToCustomTarget2", (Boolean) false).booleanValue();
        if (!booleanValue && !booleanValue2 && floatValue < 0.0f && b == null) {
            if (a2 != null && !a2.c()) {
                throw new bo("[" + str + "]takeResources requires an include (eg: takeResources_includeUnitsWithinRange, takeResources_includeUnitsInTransport) otherwise no results would be found");
            }
            if (booleanValue3) {
                throw new bo("[" + str + "]takeResources_searchOnly requires an include (eg: takeResources_includeUnitsWithinRange) otherwise no results would be found");
            }
            return;
        }
        m mVar = new m();
        dVar.ac.add(mVar);
        mVar.b = booleanValue;
        mVar.d = floatValue;
        mVar.c = booleanValue2;
        mVar.f = b;
        mVar.f229a = a2;
        mVar.s = abVar.a(str, str2 + "takeResources_directTransferStoppingAtZero", Boolean.valueOf(mVar.s)).booleanValue();
        mVar.e = (q) abVar.a(str, "takeResources_includeUnitsWithinRange_team", q.own, q.class);
        mVar.g = abVar.a(lVar, str, str2 + "takeResources_excludeUnitsWithoutTags", (com.corrodinggames.rts.game.units.custom.h) null);
        mVar.j = UnitReference.parseUnitReferenceFromConf(lVar, abVar, str, str2 + "takeResources_excludeUnitsWithoutCustomTarget1EqualTo", null);
        if (mVar.s) {
            mVar.h = false;
        }
        mVar.h = abVar.a(str, str2 + "takeResources_excludeUnitsWithoutAllResources", Boolean.valueOf(mVar.h)).booleanValue();
        if (booleanValue3) {
            mVar.k = 200;
            mVar.q = true;
            mVar.r = true;
        }
        mVar.k = abVar.b(str, str2 + "takeResources_maxUnits", Integer.valueOf(mVar.k)).intValue();
        mVar.l = abVar.a(lVar, str, str2 + "takeResources_triggerActionIfAnyCollected", (u) null);
        mVar.m = abVar.a(lVar, str, str2 + "takeResources_triggerActionIfNoneCollected", (u) null);
        mVar.n = abVar.a(lVar, str, str2 + "takeResources_triggerActionForEach", (u) null);
        mVar.o = booleanValue4;
        mVar.p = booleanValue5;
        mVar.q = abVar.a(str, str2 + "takeResources_discardCollected", Boolean.valueOf(mVar.q)).booleanValue();
        mVar.r = abVar.a(str, str2 + "takeResources_keepResourcesOnTarget", Boolean.valueOf(mVar.r)).booleanValue();
        if (booleanValue3 && (!mVar.q || !mVar.r)) {
            throw new bo("[" + str + "]takeResources_searchOnly shortcut expects takeResources_discardCollected and takeResources_keepResourcesOnTarget to be true");
        }
        mVar.i = com.corrodinggames.rts.game.units.custom.d.b.a(lVar, abVar, str, str2 + "takeResources_excludeUnitsWithTheseResources", true);
        if (mVar.i != null && mVar.i.c()) {
            mVar.i = null;
        }
        if (mVar.s) {
            if (mVar.f229a.e()) {
                throw new bo("[" + str + "]takeResources_directTransferStoppingAtZero:true only supports custom resources right now");
            }
            if (mVar.h) {
                throw new bo("[" + str + "]takeResources_directTransferStoppingAtZero:true is not supported at the same time as takeResources_excludeUnitsWithoutAllResources:true");
            }
            if (mVar.r) {
                throw new bo("[" + str + "]takeResources_directTransferStoppingAtZero:true is not supported at the same time as takeResources_keepResourcesOnTarget:true");
            }
            if (mVar.q) {
                throw new bo("[" + str + "]takeResources_directTransferStoppingAtZero:true is not supported at the same time as takeResources_discardCollected:true");
            }
        }
    }

    @Override // com.corrodinggames.rts.game.units.custom.a.a
    public boolean a(com.corrodinggames.rts.game.units.custom.j jVar, s sVar, PointF pointF, am amVar, int i) {
        am readUnit;
        com.corrodinggames.rts.gameFramework.utility.m mVar = t;
        mVar.clear();
        if (this.b) {
            Iterator it = jVar.B.iterator();
            while (it.hasNext()) {
                am amVar2 = (am) it.next();
                if (amVar2 != null && !amVar2.bV) {
                    mVar.add(amVar2);
                }
            }
        }
        if (this.c) {
            if (jVar.cO != null) {
                mVar.add(jVar.cO);
            } else if (jVar.cN != null) {
                mVar.add(jVar.cO);
            }
        }
        if (this.f != null && (readUnit = this.f.readUnit(jVar)) != null && !readUnit.bV) {
            mVar.add(readUnit);
        }
        if (this.d > 0.0f) {
            u.b = this.d * this.d;
            u.f230a = this.g;
            u.c = true;
            u.d = this.e;
            u.e = mVar;
            GameEngine.getGameEngine().cc.a(jVar.eo, jVar.ep, this.d, jVar, 0.0f, u);
        }
        if (this.g != null) {
            for (int size = mVar.size() - 1; size >= 0; size--) {
                if (!com.corrodinggames.rts.game.units.custom.g.a(this.g, ((am) mVar.get(size)).de())) {
                    mVar.remove(size);
                }
            }
        }
        if (this.h) {
            for (int size2 = mVar.size() - 1; size2 >= 0; size2--) {
                if (!this.f229a.b((am) mVar.get(size2))) {
                    mVar.remove(size2);
                }
            }
        }
        if (this.i != null) {
            for (int size3 = mVar.size() - 1; size3 >= 0; size3--) {
                if (this.i.b((am) mVar.get(size3))) {
                    mVar.remove(size3);
                }
            }
        }
        if (this.j != null) {
            am amVar3 = this.j.get((y) jVar);
            for (int size4 = mVar.size() - 1; size4 >= 0; size4--) {
                if (((am) mVar.get(size4)).bu != amVar3) {
                    mVar.remove(size4);
                }
            }
        }
        if (this.n != null) {
            mVar = new com.corrodinggames.rts.gameFramework.utility.m(mVar);
        }
        boolean z = false;
        am amVar4 = null;
        int i2 = 0;
        int i3 = 0;
        for (int i4 = 0; i4 < mVar.size(); i4++) {
            am amVar5 = (am) mVar.get(i4);
            if (amVar4 == null) {
                amVar4 = amVar5;
            }
            if (this.s) {
                if (!this.f229a.a(amVar5, jVar)) {
                    continue;
                }
            } else {
                if (!this.r) {
                    this.f229a.a(amVar5);
                }
                if (!this.q) {
                    this.f229a.h(jVar);
                }
            }
            if (this.n != null && amVar5 != null) {
                this.n.a(jVar, new PointF(amVar5.eo, amVar5.ep), amVar5, i + 1, i3);
                i3++;
            }
            z = true;
            i2++;
            if (i2 >= this.k) {
                break;
            }
        }
        if (amVar4 != null) {
            if (this.o) {
                jVar.bu = amVar4;
            }
            if (this.p) {
                jVar.bv = amVar4;
            }
        }
        if (z) {
            if (this.l != null) {
                this.l.a(jVar, pointF, amVar, i + 1, 0);
            }
        } else if (this.m != null) {
            this.m.a(jVar, pointF, amVar, i + 1, 0);
        }
        mVar.clear();
        return true;
    }
}