package com.corrodinggames.rts.game.units.p027f;

import com.corrodinggames.rts.game.units.AbstractC0244am;
import com.corrodinggames.rts.gameFramework.utility.C1147u;
import java.util.Iterator;

/* renamed from: com.corrodinggames.rts.game.units.f.f */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/f/f.class */
public class C0546f implements Iterable, Iterator {

    /* renamed from: a */
    int f3764a;

    /* renamed from: b */
    AbstractC0244am[] f3765b;

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f3764a > 0;
    }

    @Override // java.util.Iterator
    /* renamed from: a */
    public AbstractC0244am mo3197a() {
        this.f3764a--;
        return this.f3765b[this.f3764a];
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new RuntimeException("Not supported");
    }

    @Override // java.lang.Iterable
    public Iterator iterator() {
        return this;
    }

    /* renamed from: a */
    public void m3196a(C1147u c1147u) {
        this.f3765b = c1147u.m499a();
        this.f3764a = c1147u.f7137b;
    }
}