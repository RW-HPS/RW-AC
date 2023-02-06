package com.corrodinggames.rts.game.units.f;

import com.corrodinggames.rts.game.units.am;
import com.corrodinggames.rts.gameFramework.utility.u;
import java.util.Iterator;

/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/f/f.class */
public class f implements Iterable, Iterator {
    int a;
    am[] b;

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.a > 0;
    }

    @Override // java.util.Iterator
    /* renamed from: a */
    public am next() {
        this.a--;
        return this.b[this.a];
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new RuntimeException("Not supported");
    }

    @Override // java.lang.Iterable
    public Iterator iterator() {
        return this;
    }

    public void a(u uVar) {
        this.b = uVar.a();
        this.a = uVar.b;
    }
}