package com.corrodinggames.rts.gameFramework.utility;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/utility/n.class */
class n implements Iterator {
    private int b;
    private int c;
    private int d;
    final /* synthetic */ m a;

    private n(m mVar) {
        int i;
        this.a = mVar;
        this.b = this.a.a;
        this.c = -1;
        i = this.a.modCount;
        this.d = i;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.b != 0;
    }

    @Override // java.util.Iterator
    public Object next() {
        int i;
        m mVar = this.a;
        int i2 = this.b;
        i = mVar.modCount;
        if (i != this.d) {
            throw new ConcurrentModificationException();
        }
        if (i2 == 0) {
            throw new NoSuchElementException();
        }
        this.b = i2 - 1;
        Object[] objArr = mVar.b;
        int i3 = mVar.a - i2;
        this.c = i3;
        return objArr[i3];
    }

    @Override // java.util.Iterator
    public void remove() {
        int i;
        Object[] objArr = this.a.b;
        int i2 = this.c;
        i = this.a.modCount;
        if (i != this.d) {
            throw new ConcurrentModificationException();
        }
        if (i2 < 0) {
            throw new IllegalStateException();
        }
        System.arraycopy(objArr, i2 + 1, objArr, i2, this.b);
        m mVar = this.a;
        int i3 = mVar.a - 1;
        mVar.a = i3;
        objArr[i3] = null;
        this.c = -1;
        this.d = m.d(this.a);
    }
}