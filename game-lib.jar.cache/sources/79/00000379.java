package com.corrodinggames.rts.game.units.custom;

import android.graphics.PointF;
import com.corrodinggames.rts.gameFramework.net.GameNetEngine;
import java.util.Iterator;

/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/u.class */
public class u {
    com.corrodinggames.rts.gameFramework.utility.m a = new com.corrodinggames.rts.gameFramework.utility.m();
    com.corrodinggames.rts.gameFramework.utility.m b;
    String c;
    String d;

    public void a(l lVar) {
    }

    public void b(l lVar) {
        com.corrodinggames.rts.gameFramework.utility.m mVar = new com.corrodinggames.rts.gameFramework.utility.m();
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            com.corrodinggames.rts.game.units.a.s h = lVar.h(str);
            if (h == null) {
                throw new bo("[" + this.d + "]" + this.c + " Could not find action:" + str + " on unit: " + lVar.b());
            }
            if (h instanceof com.corrodinggames.rts.game.units.a.w) {
                mVar.add((com.corrodinggames.rts.game.units.a.w) h);
            } else {
                throw new bo("[" + this.d + "]" + this.c + " Action:" + str + " on unit: " + lVar.b() + " doesn't have the right type");
            }
        }
        this.b = mVar;
    }

    public void a(j jVar, PointF pointF, com.corrodinggames.rts.game.units.am amVar, int i, int i2) {
        if (this.b == null) {
            GameNetEngine.g("Action on " + jVar.r().i() + " has not been linked");
            return;
        }
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            jVar.a((com.corrodinggames.rts.game.units.a.s) it.next(), pointF, amVar, i, i2);
        }
    }

    public com.corrodinggames.rts.gameFramework.utility.m a() {
        if (this.b == null) {
            GameNetEngine.g("Action on [" + this.d + "]" + this.c + " has not been linked");
            return new com.corrodinggames.rts.gameFramework.utility.m();
        }
        return this.b;
    }

    public void a(j jVar, PointF pointF, com.corrodinggames.rts.game.units.am amVar) {
        if (this.b == null) {
            GameNetEngine.g("Action on " + jVar.r().i() + " has not been linked");
            return;
        }
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            jVar.dL.a((com.corrodinggames.rts.game.units.a.w) ((com.corrodinggames.rts.game.units.a.s) it.next()), false, pointF, amVar);
        }
    }
}