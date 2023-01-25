package com.corrodinggames.rts.gameFramework.utility;

import com.corrodinggames.rts.gameFramework.AbstractC1155w;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: com.corrodinggames.rts.gameFramework.utility.t */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/utility/t.class */
class C1146t implements Iterator {

    /* renamed from: b */
    private int f7132b;

    /* renamed from: c */
    private int f7133c;

    /* renamed from: d */
    private int f7134d;

    /* renamed from: a */
    final /* synthetic */ C1144s f7135a;

    private C1146t(C1144s c1144s) {
        int i;
        this.f7135a = c1144s;
        this.f7132b = this.f7135a.f7129b;
        this.f7133c = -1;
        i = this.f7135a.modCount;
        this.f7134d = i;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f7132b != 0;
    }

    @Override // java.util.Iterator
    /* renamed from: a */
    public AbstractC1155w next() {
        int i;
        int i2;
        C1144s c1144s = this.f7135a;
        int i3 = this.f7132b;
        i = c1144s.modCount;
        if (i != this.f7134d) {
            StringBuilder append = new StringBuilder().append("on:").append(this.f7135a.f7131d).append(" (modCount:");
            i2 = this.f7135a.modCount;
            throw new ConcurrentModificationException(append.append(i2).append(" expectedModCount:").append(this.f7134d).append(")").toString());
        } else if (i3 == 0) {
            throw new NoSuchElementException();
        } else {
            this.f7132b = i3 - 1;
            AbstractC1155w[] abstractC1155wArr = c1144s.f7130c;
            int i4 = c1144s.f7129b - i3;
            this.f7133c = i4;
            return abstractC1155wArr[i4];
        }
    }

    @Override // java.util.Iterator
    public void remove() {
        int i;
        int i2;
        AbstractC1155w[] abstractC1155wArr = this.f7135a.f7130c;
        int i3 = this.f7133c;
        i = this.f7135a.modCount;
        if (i != this.f7134d) {
            StringBuilder append = new StringBuilder().append("on:").append(this.f7135a.f7131d).append(" (modCount:");
            i2 = this.f7135a.modCount;
            throw new ConcurrentModificationException(append.append(i2).append(" expectedModCount:").append(this.f7134d).append(")").toString());
        } else if (i3 < 0) {
            throw new IllegalStateException();
        } else {
            System.arraycopy(abstractC1155wArr, i3 + 1, abstractC1155wArr, i3, this.f7132b);
            C1144s c1144s = this.f7135a;
            int i4 = c1144s.f7129b - 1;
            c1144s.f7129b = i4;
            abstractC1155wArr[i4] = null;
            this.f7133c = -1;
            this.f7134d = C1144s.m501f(this.f7135a);
        }
    }
}