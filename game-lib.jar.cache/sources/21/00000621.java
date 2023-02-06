package com.corrodinggames.rts.gameFramework.utility;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/utility/p.class */
class p implements Iterator {
    private int b;
    private int c;
    private int d;
    final /* synthetic */ o a;

    private p(o oVar) {
        int i;
        this.a = oVar;
        this.b = this.a.c;
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
        o oVar = this.a;
        int i2 = this.b;
        i = oVar.modCount;
        if (i != this.d) {
            throw new ConcurrentModificationException();
        }
        if (i2 == 0) {
            throw new NoSuchElementException();
        }
        this.b = i2 - 1;
        Object[] objArr = oVar.d;
        int i3 = oVar.c - i2;
        this.c = i3;
        return objArr[i3];
    }

    @Override // java.util.Iterator
    public void remove() {
        int i;
        Object[] objArr = this.a.d;
        int i2 = this.c;
        i = this.a.modCount;
        if (i != this.d) {
            throw new ConcurrentModificationException();
        }
        if (i2 < 0) {
            throw new IllegalStateException();
        }
        System.arraycopy(objArr, i2 + 1, objArr, i2, this.b);
        o oVar = this.a;
        int i3 = oVar.c - 1;
        oVar.c = i3;
        objArr[i3] = null;
        this.c = -1;
        this.d = o.d(this.a);
    }
}