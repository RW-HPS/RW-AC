package com.corrodinggames.rts.gameFramework.utility;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: com.corrodinggames.rts.gameFramework.utility.n */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/utility/n.class */
class C1138n implements Iterator {

    /* renamed from: b */
    private int f7111b;

    /* renamed from: c */
    private int f7112c;

    /* renamed from: d */
    private int f7113d;

    /* renamed from: a */
    final /* synthetic */ C1136m f7114a;

    private C1138n(C1136m c1136m) {
        int i;
        this.f7114a = c1136m;
        this.f7111b = this.f7114a.f7109a;
        this.f7112c = -1;
        i = this.f7114a.modCount;
        this.f7113d = i;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f7111b != 0;
    }

    @Override // java.util.Iterator
    public Object next() {
        int i;
        C1136m c1136m = this.f7114a;
        int i2 = this.f7111b;
        i = c1136m.modCount;
        if (i != this.f7113d) {
            throw new ConcurrentModificationException();
        }
        if (i2 == 0) {
            throw new NoSuchElementException();
        }
        this.f7111b = i2 - 1;
        Object[] objArr = c1136m.f7110b;
        int i3 = c1136m.f7109a - i2;
        this.f7112c = i3;
        return objArr[i3];
    }

    @Override // java.util.Iterator
    public void remove() {
        int i;
        Object[] objArr = this.f7114a.f7110b;
        int i2 = this.f7112c;
        i = this.f7114a.modCount;
        if (i != this.f7113d) {
            throw new ConcurrentModificationException();
        }
        if (i2 < 0) {
            throw new IllegalStateException();
        }
        System.arraycopy(objArr, i2 + 1, objArr, i2, this.f7111b);
        C1136m c1136m = this.f7114a;
        int i3 = c1136m.f7109a - 1;
        c1136m.f7109a = i3;
        objArr[i3] = null;
        this.f7112c = -1;
        this.f7113d = C1136m.m526d(this.f7114a);
    }
}