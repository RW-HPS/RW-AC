package com.corrodinggames.rts.gameFramework.utility;

import com.corrodinggames.rts.game.units.AbstractC0244am;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: com.corrodinggames.rts.gameFramework.utility.v */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/utility/v.class */
class C1149v implements Iterator {

    /* renamed from: b */
    private int f7139b;

    /* renamed from: c */
    private int f7140c;

    /* renamed from: d */
    private int f7141d;

    /* renamed from: a */
    final /* synthetic */ C1147u f7142a;

    private C1149v(C1147u c1147u) {
        int i;
        this.f7142a = c1147u;
        this.f7139b = this.f7142a.f7137b;
        this.f7140c = -1;
        i = this.f7142a.modCount;
        this.f7141d = i;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f7139b != 0;
    }

    @Override // java.util.Iterator
    /* renamed from: a */
    public AbstractC0244am next() {
        int i;
        C1147u c1147u = this.f7142a;
        int i2 = this.f7139b;
        i = c1147u.modCount;
        if (i != this.f7141d) {
            throw new ConcurrentModificationException();
        }
        if (i2 == 0) {
            throw new NoSuchElementException();
        }
        this.f7139b = i2 - 1;
        AbstractC0244am[] abstractC0244amArr = c1147u.f7138c;
        int i3 = c1147u.f7137b - i2;
        this.f7140c = i3;
        return abstractC0244amArr[i3];
    }

    @Override // java.util.Iterator
    public void remove() {
        int i;
        AbstractC0244am[] abstractC0244amArr = this.f7142a.f7138c;
        int i2 = this.f7140c;
        i = this.f7142a.modCount;
        if (i != this.f7141d) {
            throw new ConcurrentModificationException();
        }
        if (i2 < 0) {
            throw new IllegalStateException();
        }
        System.arraycopy(abstractC0244amArr, i2 + 1, abstractC0244amArr, i2, this.f7139b);
        C1147u c1147u = this.f7142a;
        int i3 = c1147u.f7137b - 1;
        c1147u.f7137b = i3;
        abstractC0244amArr[i3] = null;
        this.f7140c = -1;
        this.f7141d = C1147u.m487d(this.f7142a);
    }
}