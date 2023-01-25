package com.corrodinggames.rts.java.audio.p051a;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: com.corrodinggames.rts.java.audio.a.f */
/* loaded from: game-lib.jar:com/corrodinggames/rts/java/audio/a/f.class */
public class C1170f extends C1172h implements Iterable, Iterator {

    /* renamed from: f */
    private C1171g f7242f;

    @Override // com.corrodinggames.rts.java.audio.p051a.C1172h
    /* renamed from: b */
    public /* bridge */ /* synthetic */ void mo353b() {
        super.mo353b();
    }

    public C1170f(C1169e c1169e) {
        super(c1169e);
        this.f7242f = new C1171g();
    }

    @Override // java.util.Iterator
    /* renamed from: a */
    public C1171g next() {
        if (this.f7245a) {
            if (this.f7249e) {
                int[] iArr = this.f7246b.f7228b;
                if (this.f7247c == -1) {
                    this.f7242f.f7243a = 0;
                    this.f7242f.f7244b = this.f7246b.f7232f;
                } else {
                    this.f7242f.f7243a = iArr[this.f7247c];
                    this.f7242f.f7244b = this.f7246b.f7229c[this.f7247c];
                }
                this.f7248d = this.f7247c;
                m352c();
                return this.f7242f;
            }
            throw new C1167c("#iterator() cannot be used nested.");
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        if (this.f7249e) {
            return this.f7245a;
        }
        throw new C1167c("#iterator() cannot be used nested.");
    }

    @Override // java.lang.Iterable
    public Iterator iterator() {
        return this;
    }

    @Override // com.corrodinggames.rts.java.audio.p051a.C1172h, java.util.Iterator
    public void remove() {
        super.remove();
    }
}