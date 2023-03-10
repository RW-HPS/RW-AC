package com.corrodinggames.rts.gameFramework.status.a;

import com.corrodinggames.rts.game.PlayerData;
import com.corrodinggames.rts.game.maps.f;
import com.corrodinggames.rts.game.units.am;
import com.corrodinggames.rts.game.units.ar;
import com.corrodinggames.rts.game.units.as;
import com.corrodinggames.rts.game.units.custom.bo;
import com.corrodinggames.rts.game.units.custom.g;
import com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope;
import com.corrodinggames.rts.game.units.y;
import com.corrodinggames.rts.gameFramework.status.a;

/* renamed from: com.corrodinggames.rts.gameFramework.n.a.c */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/n/a/c.class */
public class c extends a {
    Integer a;
    Integer b;
    PlayerData c;
    as d;
    boolean e;
    boolean f;
    boolean g;
    boolean h;
    boolean i;
    boolean j;
    int k;
    boolean l;
    boolean m;
    boolean n;
    g o;
    boolean p;

    public static c d(a aVar) {
        c cVar = new c();
        cVar.a = aVar.d("maxUnits");
        int i = 1;
        if (cVar.a != null) {
            i = 0;
        }
        cVar.b = Integer.valueOf(aVar.a("minUnits", i));
        cVar.c = aVar.a();
        as asVar = null;
        String b = aVar.b("unitType");
        if (b != null) {
            asVar = ar.a(b);
            if (asVar == null) {
                aVar.g("Cound not find unitType:" + b);
            }
        }
        cVar.d = asVar;
        cVar.e = aVar.a("onlybuildings", "onlyBuildings", false);
        cVar.g = aVar.a("onlyMainBuildings", false);
        cVar.h = aVar.a("onlyOnResourcePool", false);
        cVar.f = aVar.a("onlyidle", "onlyIdle", false);
        cVar.k = aVar.a("onlyTechLevel", -1);
        cVar.j = aVar.a("onlyBuilders", false);
        cVar.i = aVar.a("onlyEmptyQueue", false);
        cVar.l = aVar.a("onlyAttack", false);
        cVar.m = aVar.a("onlyAttackAir", false);
        cVar.n = aVar.a("onlyIfEmpty", false);
        String b2 = aVar.b("onlyWithTag");
        if (b2 != null && !b2.equals(VariableScope.nullOrMissingString)) {
            try {
                cVar.o = g.b(b2);
            } catch (bo e) {
                throw new f(e.getMessage());
            }
        }
        cVar.p = aVar.a("includeIncomplete", false);
        return cVar;
    }

    @Override // com.corrodinggames.rts.gameFramework.status.a.a
    public boolean b(a aVar) {
        return e(aVar);
    }

    public boolean e(a aVar) {
        int i = 0;
        am[] a = am.bE.a();
        int size = am.bE.size();
        for (int i2 = 0; i2 < size; i2++) {
            am amVar = a[i2];
            if ((this.c == null || amVar.bX == this.c) && (amVar instanceof y) && amVar.cN == null && aVar.a(amVar) && (this.d == null || amVar.mo1r() == this.d)) {
                y yVar = (y) amVar;
                if ((this.p || amVar.bT()) && ((!this.l || amVar.l()) && ((!this.m || (amVar.l() && yVar.af())) && ((!this.e || amVar.bI()) && ((!this.g || (amVar.bI() && amVar.bJ())) && ((!this.h || amVar.mo1r().p()) && ((!this.j || amVar.ak()) && ((!this.f || yVar.aq()) && ((!this.i || yVar.a((g) null) <= 0) && ((this.k == -1 || amVar.V() == this.k) && ((this.o == null || g.a(this.o, amVar.de())) && (!this.n || yVar.bB() <= 0)))))))))))) {
                    i++;
                }
            }
        }
        if (i >= this.b.intValue()) {
            if (this.a == null || i <= this.a.intValue()) {
                return true;
            }
            return false;
        }
        return false;
    }
}