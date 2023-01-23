package com.corrodinggames.rts.game.a;

import com.corrodinggames.rts.game.units.as;
import com.corrodinggames.rts.game.units.y;
import java.util.HashMap;

/* loaded from: game-lib.jar:com/corrodinggames/rts/game/a/c.class */
public class c {

    /* renamed from: a  reason: collision with root package name */
    HashMap f136a = new HashMap();
    HashMap b = new HashMap();
    HashMap c = new HashMap();

    public Integer a(boolean z, as asVar, boolean z2) {
        if (z) {
            return (Integer) this.c.get(asVar);
        }
        if (!z2) {
            return (Integer) this.b.get(asVar);
        }
        return (Integer) this.f136a.get(asVar);
    }

    public void a(boolean z, as asVar, boolean z2, Integer num) {
        if (z) {
            this.c.put(asVar, num);
        } else if (!z2) {
            this.b.put(asVar, num);
        } else {
            this.f136a.put(asVar, num);
        }
    }

    public void a() {
        this.f136a.clear();
        this.b.clear();
    }

    public void a(as asVar) {
        this.f136a.put(asVar, null);
        this.b.put(asVar, null);
    }

    public void a(y yVar) {
        this.c.put(yVar.dz, null);
    }

    public void b() {
        this.c.clear();
    }
}