package com.corrodinggames.rts.gameFramework.p043k;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: com.corrodinggames.rts.gameFramework.k.b */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/k/b.class */
class C0933b implements Iterator {

    /* renamed from: b */
    private int f6129b;

    /* renamed from: c */
    private int f6130c;

    /* renamed from: d */
    private int f6131d;

    /* renamed from: a */
    final /* synthetic */ C0931a f6132a;

    private C0933b(C0931a c0931a) {
        int i;
        this.f6132a = c0931a;
        this.f6129b = this.f6132a.f6127b;
        this.f6130c = -1;
        i = this.f6132a.modCount;
        this.f6131d = i;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f6129b != 0;
    }

    @Override // java.util.Iterator
    /* renamed from: a */
    public C0945n next() {
        int i;
        C0931a c0931a = this.f6132a;
        int i2 = this.f6129b;
        i = c0931a.modCount;
        if (i != this.f6131d) {
            throw new ConcurrentModificationException();
        }
        if (i2 == 0) {
            throw new NoSuchElementException();
        }
        this.f6129b = i2 - 1;
        C0945n[] c0945nArr = c0931a.f6128c;
        int i3 = c0931a.f6127b - i2;
        this.f6130c = i3;
        return c0945nArr[i3];
    }

    @Override // java.util.Iterator
    public void remove() {
        int i;
        C0945n[] c0945nArr = this.f6132a.f6128c;
        int i2 = this.f6130c;
        i = this.f6132a.modCount;
        if (i != this.f6131d) {
            throw new ConcurrentModificationException();
        }
        if (i2 < 0) {
            throw new IllegalStateException();
        }
        System.arraycopy(c0945nArr, i2 + 1, c0945nArr, i2, this.f6129b);
        C0931a c0931a = this.f6132a;
        int i3 = c0931a.f6127b - 1;
        c0931a.f6127b = i3;
        c0945nArr[i3] = null;
        this.f6130c = -1;
        this.f6131d = C0931a.m1240d(this.f6132a);
    }
}