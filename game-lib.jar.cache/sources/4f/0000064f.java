package com.corrodinggames.rts.java.audio.p051a;

import java.util.NoSuchElementException;

/* renamed from: com.corrodinggames.rts.java.audio.a.p */
/* loaded from: game-lib.jar:com/corrodinggames/rts/java/audio/a/p.class */
public class C1180p extends AbstractC1182r {

    /* renamed from: a */
    C1181q f7288a;

    @Override // com.corrodinggames.rts.java.audio.p051a.AbstractC1182r, java.util.Iterator
    public /* bridge */ /* synthetic */ void remove() {
        super.remove();
    }

    @Override // com.corrodinggames.rts.java.audio.p051a.AbstractC1182r
    /* renamed from: c */
    public /* bridge */ /* synthetic */ void mo309c() {
        super.mo309c();
    }

    public C1180p(C1179o c1179o) {
        super(c1179o);
        this.f7288a = new C1181q();
    }

    @Override // java.util.Iterator
    /* renamed from: a */
    public C1181q next() {
        if (this.f7291b) {
            if (this.f7295f) {
                Object[] objArr = this.f7292c.f7276b;
                this.f7288a.f7289a = objArr[this.f7293d];
                this.f7288a.f7290b = this.f7292c.f7277c[this.f7293d];
                this.f7294e = this.f7293d;
                m308d();
                return this.f7288a;
            }
            throw new C1167c("#iterator() cannot be used nested.");
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        if (this.f7295f) {
            return this.f7291b;
        }
        throw new C1167c("#iterator() cannot be used nested.");
    }

    @Override // java.lang.Iterable
    /* renamed from: b */
    public C1180p iterator() {
        return this;
    }
}