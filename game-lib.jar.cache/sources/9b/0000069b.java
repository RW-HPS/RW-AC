package org.p055a.p056a.p060d;

import org.p055a.p056a.p057a.InterfaceC1230b;
import org.p055a.p056a.p059c.InterfaceC1237b;
import org.p055a.p056a.p061e.InterfaceC1245b;

/* renamed from: org.a.a.d.b */
/* loaded from: game-lib.jar:org/a/a/d/b.class */
public interface InterfaceC1241b extends InterfaceC1230b, InterfaceC1242c {
    @Override // org.p055a.p056a.p057a.InterfaceC1230b, java.util.Collection, java.lang.Iterable, org.p055a.p056a.p058b.InterfaceC1234b
    /* renamed from: a */
    InterfaceC1237b iterator();

    @Override // java.util.List
    /* renamed from: b */
    InterfaceC1245b listIterator();

    @Override // java.util.List
    /* renamed from: a */
    InterfaceC1245b listIterator(int i);

    @Override // java.util.List
    /* renamed from: a */
    InterfaceC1241b subList(int i, int i2);

    @Override // java.util.List
    @Deprecated
    /* renamed from: b */
    Integer remove(int i);
}