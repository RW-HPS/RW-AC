package com.corrodinggames.rts.java.audio.a;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: game-lib.jar:com/corrodinggames/rts/java/audio/a/f.class */
public class f extends h implements Iterable, Iterator {
    private g f;

    @Override // com.corrodinggames.rts.java.audio.a.h
    public /* bridge */ /* synthetic */ void b() {
        super.b();
    }

    public f(e eVar) {
        super(eVar);
        this.f = new g();
    }

    @Override // java.util.Iterator
    /* renamed from: a */
    public g next() {
        if (this.f716a) {
            if (this.e) {
                int[] iArr = this.b.b;
                if (this.c == -1) {
                    this.f.f715a = 0;
                    this.f.b = this.b.f;
                } else {
                    this.f.f715a = iArr[this.c];
                    this.f.b = this.b.c[this.c];
                }
                this.d = this.c;
                c();
                return this.f;
            }
            throw new c("#iterator() cannot be used nested.");
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        if (this.e) {
            return this.f716a;
        }
        throw new c("#iterator() cannot be used nested.");
    }

    @Override // java.lang.Iterable
    public Iterator iterator() {
        return this;
    }

    @Override // com.corrodinggames.rts.java.audio.a.h, java.util.Iterator
    public void remove() {
        super.remove();
    }
}