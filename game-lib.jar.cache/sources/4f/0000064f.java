package com.corrodinggames.rts.java.audio.a;

import java.util.NoSuchElementException;

/* loaded from: game-lib.jar:com/corrodinggames/rts/java/audio/a/p.class */
public class p extends r {

    /* renamed from: a  reason: collision with root package name */
    q f723a;

    @Override // com.corrodinggames.rts.java.audio.a.r, java.util.Iterator
    public /* bridge */ /* synthetic */ void remove() {
        super.remove();
    }

    @Override // com.corrodinggames.rts.java.audio.a.r
    public /* bridge */ /* synthetic */ void c() {
        super.c();
    }

    public p(o oVar) {
        super(oVar);
        this.f723a = new q();
    }

    @Override // java.util.Iterator
    /* renamed from: a */
    public q next() {
        if (this.b) {
            if (this.f) {
                Object[] objArr = this.c.b;
                this.f723a.f724a = objArr[this.d];
                this.f723a.b = this.c.c[this.d];
                this.e = this.d;
                d();
                return this.f723a;
            }
            throw new c("#iterator() cannot be used nested.");
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        if (this.f) {
            return this.b;
        }
        throw new c("#iterator() cannot be used nested.");
    }

    @Override // java.lang.Iterable
    /* renamed from: b */
    public p iterator() {
        return this;
    }
}