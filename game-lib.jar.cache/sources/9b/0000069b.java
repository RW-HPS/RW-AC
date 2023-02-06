package org.a.a.d;

/* loaded from: game-lib.jar:org/a/a/d/b.class */
public interface b extends org.a.a.a.b, c {
    @Override // org.a.a.a.b, java.util.Collection, java.lang.Iterable, org.a.a.b.b
    /* renamed from: a */
    org.a.a.c.b iterator();

    @Override // java.util.List
    /* renamed from: b */
    org.a.a.e.b listIterator();

    @Override // java.util.List
    /* renamed from: a */
    org.a.a.e.b listIterator(int i);

    @Override // java.util.List
    /* renamed from: a */
    b subList(int i, int i2);

    @Override // java.util.List
    @Deprecated
    /* renamed from: b */
    Integer remove(int i);
}