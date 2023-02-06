package com.corrodinggames.rts.java.audio.a;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: game-lib.jar:com/corrodinggames/rts/java/audio/a/j.class */
public class j extends l implements Iterable, Iterator {
    private k f;

    @Override // com.corrodinggames.rts.java.audio.a.l
    public /* bridge */ /* synthetic */ void b() {
        super.b();
    }

    public j(i iVar) {
        super(iVar);
        this.f = new k();
    }

    @Override // java.util.Iterator
    /* renamed from: a */
    public k next() {
        if (this.a) {
            if (this.e) {
                long[] jArr = this.b.b;
                if (this.c == -1) {
                    this.f.a = 0L;
                    this.f.b = this.b.f;
                } else {
                    this.f.a = jArr[this.c];
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
            return this.a;
        }
        throw new c("#iterator() cannot be used nested.");
    }

    @Override // java.lang.Iterable
    public Iterator iterator() {
        return this;
    }

    @Override // com.corrodinggames.rts.java.audio.a.l, java.util.Iterator
    public void remove() {
        super.remove();
    }
}