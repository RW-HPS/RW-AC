package org.p055a.p056a.p060d;

import org.p055a.p056a.p057a.InterfaceC1229a;
import org.p055a.p056a.p059c.InterfaceC1236a;
import org.p055a.p056a.p061e.InterfaceC1244a;

/* renamed from: org.a.a.d.a */
/* loaded from: game-lib.jar:org/a/a/d/a.class */
public interface InterfaceC1240a extends InterfaceC1229a, InterfaceC1242c {
    @Override // org.p055a.p056a.p057a.InterfaceC1229a, java.util.Collection, java.lang.Iterable, org.p055a.p056a.p058b.InterfaceC1233a
    /* renamed from: a */
    InterfaceC1236a iterator();

    @Override // java.util.List
    /* renamed from: b */
    InterfaceC1244a listIterator();

    @Override // java.util.List
    /* renamed from: a */
    InterfaceC1244a listIterator(int i);

    @Override // java.util.List
    /* renamed from: a */
    InterfaceC1240a subList(int i, int i2);

    @Override // java.util.List
    @Deprecated
    /* renamed from: b */
    Float remove(int i);
}