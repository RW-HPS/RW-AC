package com.corrodinggames.rts.gameFramework.utility;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: com.corrodinggames.rts.gameFramework.utility.p */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/utility/p.class */
class C1141p implements Iterator {

    /* renamed from: b */
    private int f7119b;

    /* renamed from: c */
    private int f7120c;

    /* renamed from: d */
    private int f7121d;

    /* renamed from: a */
    final /* synthetic */ C1139o f7122a;

    private C1141p(C1139o c1139o) {
        int i;
        this.f7122a = c1139o;
        this.f7119b = this.f7122a.f7115c;
        this.f7120c = -1;
        i = this.f7122a.modCount;
        this.f7121d = i;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f7119b != 0;
    }

    @Override // java.util.Iterator
    public Object next() {
        int i;
        C1139o c1139o = this.f7122a;
        int i2 = this.f7119b;
        i = c1139o.modCount;
        if (i != this.f7121d) {
            throw new ConcurrentModificationException();
        }
        if (i2 == 0) {
            throw new NoSuchElementException();
        }
        this.f7119b = i2 - 1;
        Object[] objArr = c1139o.f7118d;
        int i3 = c1139o.f7115c - i2;
        this.f7120c = i3;
        return objArr[i3];
    }

    @Override // java.util.Iterator
    public void remove() {
        int i;
        Object[] objArr = this.f7122a.f7118d;
        int i2 = this.f7120c;
        i = this.f7122a.modCount;
        if (i != this.f7121d) {
            throw new ConcurrentModificationException();
        }
        if (i2 < 0) {
            throw new IllegalStateException();
        }
        System.arraycopy(objArr, i2 + 1, objArr, i2, this.f7119b);
        C1139o c1139o = this.f7122a;
        int i3 = c1139o.f7115c - 1;
        c1139o.f7115c = i3;
        objArr[i3] = null;
        this.f7120c = -1;
        this.f7121d = C1139o.m516d(this.f7122a);
    }
}