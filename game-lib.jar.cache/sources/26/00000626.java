package com.corrodinggames.rts.gameFramework.utility;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/utility/t.class */
public class t implements Iterator {
    private int b;
    private int c;
    private int d;

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ s f696a;

    private t(s sVar) {
        int i;
        this.f696a = sVar;
        this.b = this.f696a.b;
        this.c = -1;
        i = this.f696a.modCount;
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
        s sVar = this.f696a;
        int i3 = this.b;
        i = sVar.modCount;
        if (i != this.d) {
            StringBuilder append = new StringBuilder().append("on:").append(this.f696a.d).append(" (modCount:");
            i2 = this.f696a.modCount;
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
        com.corrodinggames.rts.gameFramework.w[] wVarArr = this.f696a.c;
        int i3 = this.c;
        i = this.f696a.modCount;
        if (i != this.d) {
            StringBuilder append = new StringBuilder().append("on:").append(this.f696a.d).append(" (modCount:");
            i2 = this.f696a.modCount;
            throw new ConcurrentModificationException(append.append(i2).append(" expectedModCount:").append(this.d).append(")").toString());
        } else if (i3 < 0) {
            throw new IllegalStateException();
        } else {
            System.arraycopy(wVarArr, i3 + 1, wVarArr, i3, this.b);
            s sVar = this.f696a;
            int i4 = sVar.b - 1;
            sVar.b = i4;
            wVarArr[i4] = null;
            this.c = -1;
            this.d = s.f(this.f696a);
        }
    }
}