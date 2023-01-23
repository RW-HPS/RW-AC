package com.corrodinggames.rts.gameFramework.utility;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/utility/p.class */
public class p implements Iterator {
    private int b;
    private int c;
    private int d;

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ o f692a;

    private p(o oVar) {
        this.f692a = oVar;
        this.b = this.f692a.c;
        this.c = -1;
        this.d = o.a(this.f692a);
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.b != 0;
    }

    @Override // java.util.Iterator
    public Object next() {
        o oVar = this.f692a;
        int i = this.b;
        if (o.b(oVar) != this.d) {
            throw new ConcurrentModificationException();
        }
        if (i == 0) {
            throw new NoSuchElementException();
        }
        this.b = i - 1;
        Object[] objArr = oVar.d;
        int i2 = oVar.c - i;
        this.c = i2;
        return objArr[i2];
    }

    @Override // java.util.Iterator
    public void remove() {
        Object[] objArr = this.f692a.d;
        int i = this.c;
        if (o.c(this.f692a) != this.d) {
            throw new ConcurrentModificationException();
        }
        if (i < 0) {
            throw new IllegalStateException();
        }
        System.arraycopy(objArr, i + 1, objArr, i, this.b);
        o oVar = this.f692a;
        int i2 = oVar.c - 1;
        oVar.c = i2;
        objArr[i2] = null;
        this.c = -1;
        this.d = o.d(this.f692a);
    }
}