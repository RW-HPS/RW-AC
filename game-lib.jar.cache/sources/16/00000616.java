package com.corrodinggames.rts.gameFramework.utility;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/utility/h.class */
class h implements Iterator {
    private int b;
    private int c;
    private int d;
    final /* synthetic */ g a;

    private h(g gVar) {
        int i;
        int i2;
        this.a = gVar;
        i = this.a.c;
        this.b = i;
        i2 = this.a.d;
        this.c = i2;
        this.d = -1;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.b != this.c;
    }

    @Override // java.util.Iterator
    public Object next() {
        Object[] objArr;
        int i;
        Object[] objArr2;
        if (this.b != this.c) {
            objArr = this.a.b;
            Object obj = objArr[this.b];
            i = this.a.d;
            if (i != this.c || obj == null) {
                throw new ConcurrentModificationException();
            }
            this.d = this.b;
            objArr2 = this.a.b;
            this.b = (this.b + 1) & (objArr2.length - 1);
            return obj;
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public void remove() {
        boolean a;
        Object[] objArr;
        int i;
        if (this.d >= 0) {
            a = this.a.a(this.d);
            if (a) {
                objArr = this.a.b;
                this.b = (this.b - 1) & (objArr.length - 1);
                i = this.a.d;
                this.c = i;
            }
            this.d = -1;
            return;
        }
        throw new IllegalStateException();
    }
}