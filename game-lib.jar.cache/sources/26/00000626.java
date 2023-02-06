package com.corrodinggames.rts.gameFramework.utility;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/utility/t.class */
class t implements Iterator {
    private int b;
    private int c;
    private int d;
    final /* synthetic */ s a;

    private t(s sVar) {
        int i;
        this.a = sVar;
        this.b = this.a.b;
        this.c = -1;
        i = this.a.modCount;
        this.d = i;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.b != 0;
    }

    @Override // java.util.Iterator
    /* renamed from: a */
    public com.corrodinggames.rts.gameFramework.w next() {
        int i;
        int i2;
        s sVar = this.a;
        int i3 = this.b;
        i = sVar.modCount;
        if (i != this.d) {
            StringBuilder append = new StringBuilder().append("on:").append(this.a.d).append(" (modCount:");
            i2 = this.a.modCount;
            throw new ConcurrentModificationException(append.append(i2).append(" expectedModCount:").append(this.d).append(")").toString());
        } else if (i3 == 0) {
            throw new NoSuchElementException();
        } else {
            this.b = i3 - 1;
            com.corrodinggames.rts.gameFramework.w[] wVarArr = sVar.c;
            int i4 = sVar.b - i3;
            this.c = i4;
            return wVarArr[i4];
        }
    }

    @Override // java.util.Iterator
    public void remove() {
        int i;
        int i2;
        com.corrodinggames.rts.gameFramework.w[] wVarArr = this.a.c;
        int i3 = this.c;
        i = this.a.modCount;
        if (i != this.d) {
            StringBuilder append = new StringBuilder().append("on:").append(this.a.d).append(" (modCount:");
            i2 = this.a.modCount;
            throw new ConcurrentModificationException(append.append(i2).append(" expectedModCount:").append(this.d).append(")").toString());
        } else if (i3 < 0) {
            throw new IllegalStateException();
        } else {
            System.arraycopy(wVarArr, i3 + 1, wVarArr, i3, this.b);
            s sVar = this.a;
            int i4 = sVar.b - 1;
            sVar.b = i4;
            wVarArr[i4] = null;
            this.c = -1;
            this.d = s.f(this.a);
        }
    }
}