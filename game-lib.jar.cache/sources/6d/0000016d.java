package com.corrodinggames.rts.game.a;

import com.corrodinggames.rts.game.units.ao;
import com.corrodinggames.rts.game.units.ar;
import com.corrodinggames.rts.game.units.as;
import com.corrodinggames.rts.gameFramework.GameEngine;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/* loaded from: game-lib.jar:com/corrodinggames/rts/game/a/d.class */
public abstract class d {
    String b;
    public ArrayList c = new ArrayList();
    private ArrayList a = new ArrayList();
    final /* synthetic */ a d;

    public abstract boolean a(as asVar);

    public d(a aVar, String str) {
        this.d = aVar;
        this.b = str;
        aVar.bq.add(this);
    }

    public boolean b(as asVar) {
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            if (((e) it.next()).a == asVar) {
                return true;
            }
        }
        return false;
    }

    public float c(as asVar) {
        return 10.0f;
    }

    public ArrayList a() {
        Collections.shuffle(this.a);
        return this.a;
    }

    public void b() {
        this.c = new ArrayList();
        float f = 0.0f;
        Iterator it = ar.ae.iterator();
        while (it.hasNext()) {
            as asVar = (as) it.next();
            if (a(asVar)) {
                float c = c(asVar);
                f += c;
                this.c.add(new e(this, asVar, c));
            }
        }
        this.a = new ArrayList(this.c);
        if (this.c.size() == 0) {
            GameEngine.m5e("AI: rebuildUnitMix: no units in unitMix:" + this.b);
        }
    }

    public as c() {
        return a((ao) null, -1);
    }

    public as a(ao aoVar) {
        return a(aoVar, -1);
    }

    public boolean a(as asVar, ao aoVar) {
        if (aoVar == null) {
            return true;
        }
        ao o = asVar.o();
        if (o == ao.OVER_CLIFF) {
            o = ao.LAND;
        }
        if (o == ao.OVER_CLIFF_WATER) {
            o = ao.HOVER;
        }
        if (o == aoVar) {
            return true;
        }
        return false;
    }

    public as a(ao aoVar, int i) {
        if (this.c.size() == 0) {
            GameEngine.m5e("AI: getRandomUnitType: no units in unitMix:" + this.b);
            return null;
        }
        float f = 0.0f;
        int i2 = 0;
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            e eVar = (e) it.next();
            if (a(eVar.a, aoVar) && (i == -1 || eVar.a.c() <= i)) {
                f += eVar.b;
                i2++;
            }
        }
        if (i2 == 0) {
            return null;
        }
        float c = com.corrodinggames.rts.gameFramework.f.c(0.0f, f);
        float f2 = 0.0f;
        Iterator it2 = this.c.iterator();
        while (it2.hasNext()) {
            e eVar2 = (e) it2.next();
            if (a(eVar2.a, aoVar) && (i == -1 || eVar2.a.c() <= i)) {
                f2 += eVar2.b;
                if (f2 > c) {
                    return eVar2.a;
                }
            }
        }
        GameEngine.m5e("Did not find getRandomUnit, this should only happen very rarely, name:" + this.b + " unitMix.size:" + this.c.size() + " minPrice:" + i + " movementType:" + aoVar + " totalUnits:" + i2);
        return ((e) this.c.get(this.c.size() - 1)).a;
    }
}