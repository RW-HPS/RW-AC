package com.corrodinggames.rts.gameFramework.path;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: com.corrodinggames.rts.gameFramework.k.b */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/k/b.class */
class b implements Iterator {
    private int b;
    private int c;
    private int d;
    final /* synthetic */ a a;

    private b(a aVar) {
        this.a = aVar;
        this.b = this.a.b;
        this.c = -1;
        this.d = a.a(this.a);
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.b != 0;
    }

    @Override // java.util.Iterator
    /* renamed from: a */
    public n next() {
        a aVar = this.a;
        int i = this.b;
        if (aVar.modCount != this.d) {
            throw new ConcurrentModificationException();
        }
        if (i == 0) {
            throw new NoSuchElementException();
        }
        this.b = i - 1;
        n[] nVarArr = aVar.c;
        int i2 = aVar.b - i;
        this.c = i2;
        return nVarArr[i2];
    }

    @Override // java.util.Iterator
    public void remove() {
        n[] nVarArr = this.a.c;
        int i = this.c;
        if (this.a.modCount != this.d) {
            throw new ConcurrentModificationException();
        }
        if (i < 0) {
            throw new IllegalStateException();
        }
        System.arraycopy(nVarArr, i + 1, nVarArr, i, this.b);
        a aVar = this.a;
        int i2 = aVar.b - 1;
        aVar.b = i2;
        nVarArr[i2] = null;
        this.c = -1;
        this.d = a.d(this.a);
    }
}