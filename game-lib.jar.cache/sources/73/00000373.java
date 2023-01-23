package com.corrodinggames.rts.game.units.custom;

import java.util.Iterator;

/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/o.class */
public class o {

    /* renamed from: a  reason: collision with root package name */
    String f316a;
    f b;
    final /* synthetic */ l c;

    public o(l lVar) {
        this.c = lVar;
    }

    public void a() {
        if (this.f316a != null && b() == null) {
            throw new RuntimeException("Failed to find animation:" + this.f316a);
        }
    }

    public f b() {
        if (this.f316a == null) {
            return null;
        }
        if (this.b != null) {
            return this.b;
        }
        Iterator it = this.c.dr.iterator();
        while (it.hasNext()) {
            f fVar = (f) it.next();
            if (fVar.f299a.equalsIgnoreCase(this.f316a)) {
                this.b = fVar;
                return fVar;
            }
        }
        return null;
    }
}