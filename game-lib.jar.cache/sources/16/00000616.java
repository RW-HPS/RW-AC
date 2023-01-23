package com.corrodinggames.rts.gameFramework.utility;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/utility/h.class */
class h implements Iterator {
    private int b;
    private int c;
    private int d;

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ g f683a;

    private h(g gVar) {
        int i;
        int i2;
        this.f683a = gVar;
        i = this.f683a.c;
        this.b = i;
        i2 = this.f683a.d;
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
            objArr = this.f683a.b;
            Object obj = objArr[this.b];
            i = this.f683a.d;
            if (i != this.c || obj == null) {
                throw new ConcurrentModificationException();
            }
            this.d = this.b;
            objArr2 = this.f683a.b;
            this.b = (this.b + 1) & (objArr2.length - 1);
            return obj;
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public void remove() {
        boolean a2;
        Object[] objArr;
        int i;
        if (this.d >= 0) {
            a2 = this.f683a.a(this.d);
            if (a2) {
                objArr = this.f683a.b;
                this.b = (this.b - 1) & (objArr.length - 1);
                i = this.f683a.d;
                this.c = i;
            }
            this.d = -1;
            return;
        }
        throw new IllegalStateException();
    }
}