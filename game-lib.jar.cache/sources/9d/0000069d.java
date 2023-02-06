package org.a.a.d;

/* loaded from: game-lib.jar:org/a/a/d/d.class */
public interface d extends org.a.a.a.d, c {
    @Override // org.a.a.a.d, java.util.Collection, java.lang.Iterable, org.a.a.b.c
    /* renamed from: a */
    org.a.a.c.d iterator();

    @Override // java.util.List
    /* renamed from: b */
    org.a.a.e.d listIterator();

    @Override // java.util.List
    /* renamed from: a */
    org.a.a.e.d listIterator(int i);

    @Override // java.util.List
    /* renamed from: a */
    d subList(int i, int i2);

    @Override // java.util.List
    @Deprecated
    /* renamed from: b */
    Short remove(int i);
}