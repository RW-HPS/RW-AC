package com.corrodinggames.rts.gameFramework.utility;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/utility/v.class */
class v implements Iterator {
    private int b;
    private int c;
    private int d;
    final /* synthetic */ u a;

    private v(u uVar) {
        int i;
        this.a = uVar;
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
    public com.corrodinggames.rts.game.units.am next() {
        int i;
        u uVar = this.a;
        int i2 = this.b;
        i = uVar.modCount;
        if (i != this.d) {
            throw new ConcurrentModificationException();
        }
        if (i2 == 0) {
            throw new NoSuchElementException();
        }
        this.b = i2 - 1;
        com.corrodinggames.rts.game.units.am[] amVarArr = uVar.c;
        int i3 = uVar.b - i2;
        this.c = i3;
        return amVarArr[i3];
    }

    @Override // java.util.Iterator
    public void remove() {
        int i;
        com.corrodinggames.rts.game.units.am[] amVarArr = this.a.c;
        int i2 = this.c;
        i = this.a.modCount;
        if (i != this.d) {
            throw new ConcurrentModificationException();
        }
        if (i2 < 0) {
            throw new IllegalStateException();
        }
        System.arraycopy(amVarArr, i2 + 1, amVarArr, i2, this.b);
        u uVar = this.a;
        int i3 = uVar.b - 1;
        uVar.b = i3;
        amVarArr[i3] = null;
        this.c = -1;
        this.d = u.d(this.a);
    }
}