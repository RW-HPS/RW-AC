package com.corrodinggames.rts.java.audio.p051a;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: com.corrodinggames.rts.java.audio.a.j */
/* loaded from: game-lib.jar:com/corrodinggames/rts/java/audio/a/j.class */
public class C1174j extends C1176l implements Iterable, Iterator {

    /* renamed from: f */
    private C1175k f7265f;

    @Override // com.corrodinggames.rts.java.audio.p051a.C1176l
    /* renamed from: b */
    public /* bridge */ /* synthetic */ void mo334b() {
        super.mo334b();
    }

    public C1174j(C1173i c1173i) {
        super(c1173i);
        this.f7265f = new C1175k();
    }

    @Override // java.util.Iterator
    /* renamed from: a */
    public C1175k next() {
        if (this.f7268a) {
            if (this.f7272e) {
                long[] jArr = this.f7269b.f7251b;
                if (this.f7270c == -1) {
                    this.f7265f.f7266a = 0L;
                    this.f7265f.f7267b = this.f7269b.f7255f;
                } else {
                    this.f7265f.f7266a = jArr[this.f7270c];
                    this.f7265f.f7267b = this.f7269b.f7252c[this.f7270c];
                }
                this.f7271d = this.f7270c;
                m333c();
                return this.f7265f;
            }
            throw new C1167c("#iterator() cannot be used nested.");
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        if (this.f7272e) {
            return this.f7268a;
        }
        throw new C1167c("#iterator() cannot be used nested.");
    }

    @Override // java.lang.Iterable
    public Iterator iterator() {
        return this;
    }

    @Override // com.corrodinggames.rts.java.audio.p051a.C1176l, java.util.Iterator
    public void remove() {
        super.remove();
    }
}