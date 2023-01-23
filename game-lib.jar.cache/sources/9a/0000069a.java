package org.a.a.d;

/* loaded from: game-lib.jar:org/a/a/d/a.class */
public interface a extends org.a.a.a.a, c {
    @Override // org.a.a.a.a, java.util.Collection, java.lang.Iterable, org.a.a.b.a
    /* renamed from: a */
    org.a.a.c.a iterator();

    @Override // java.util.List
    /* renamed from: b */
    org.a.a.e.a listIterator();

    @Override // java.util.List
    /* renamed from: a */
    org.a.a.e.a listIterator(int i);

    @Override // java.util.List
    /* renamed from: a */
    a subList(int i, int i2);

    @Override // java.util.List
    @Deprecated
    /* renamed from: b */
    Float remove(int i);
}