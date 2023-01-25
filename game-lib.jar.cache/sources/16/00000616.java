package com.corrodinggames.rts.gameFramework.utility;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: com.corrodinggames.rts.gameFramework.utility.h */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/utility/h.class */
class C1130h implements Iterator {

    /* renamed from: b */
    private int f7089b;

    /* renamed from: c */
    private int f7090c;

    /* renamed from: d */
    private int f7091d;

    /* renamed from: a */
    final /* synthetic */ C1128g f7092a;

    private C1130h(C1128g c1128g) {
        int i;
        int i2;
        this.f7092a = c1128g;
        i = this.f7092a.f7086c;
        this.f7089b = i;
        i2 = this.f7092a.f7087d;
        this.f7090c = i2;
        this.f7091d = -1;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f7089b != this.f7090c;
    }

    @Override // java.util.Iterator
    public Object next() {
        Object[] objArr;
        int i;
        Object[] objArr2;
        if (this.f7089b != this.f7090c) {
            objArr = this.f7092a.f7085b;
            Object obj = objArr[this.f7089b];
            i = this.f7092a.f7087d;
            if (i != this.f7090c || obj == null) {
                throw new ConcurrentModificationException();
            }
            this.f7091d = this.f7089b;
            objArr2 = this.f7092a.f7085b;
            this.f7089b = (this.f7089b + 1) & (objArr2.length - 1);
            return obj;
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public void remove() {
        boolean m561a;
        Object[] objArr;
        int i;
        if (this.f7091d >= 0) {
            m561a = this.f7092a.m561a(this.f7091d);
            if (m561a) {
                objArr = this.f7092a.f7085b;
                this.f7089b = (this.f7089b - 1) & (objArr.length - 1);
                i = this.f7092a.f7087d;
                this.f7090c = i;
            }
            this.f7091d = -1;
            return;
        }
        throw new IllegalStateException();
    }
}