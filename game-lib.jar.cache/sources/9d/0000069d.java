package org.p055a.p056a.p060d;

import org.p055a.p056a.p057a.InterfaceC1232d;
import org.p055a.p056a.p059c.InterfaceC1239d;
import org.p055a.p056a.p061e.InterfaceC1247d;

/* renamed from: org.a.a.d.d */
/* loaded from: game-lib.jar:org/a/a/d/d.class */
public interface InterfaceC1243d extends InterfaceC1232d, InterfaceC1242c {
    @Override // org.p055a.p056a.p057a.InterfaceC1232d, java.util.Collection, java.lang.Iterable, org.p055a.p056a.p058b.InterfaceC1235c
    /* renamed from: a */
    InterfaceC1239d iterator();

    @Override // java.util.List
    /* renamed from: b */
    InterfaceC1247d listIterator();

    @Override // java.util.List
    /* renamed from: a */
    InterfaceC1247d listIterator(int i);

    @Override // java.util.List
    /* renamed from: a */
    InterfaceC1243d subList(int i, int i2);

    @Override // java.util.List
    @Deprecated
    /* renamed from: b */
    Short remove(int i);
}