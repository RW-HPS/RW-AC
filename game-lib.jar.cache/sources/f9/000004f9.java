package com.corrodinggames.rts.gameFramework.player;

/* renamed from: com.corrodinggames.rts.gameFramework.g.d */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/g/d.class */
public abstract class AbstractC0851d implements Comparable {

    /* renamed from: a */
    private int f5598a;

    /* renamed from: b */
    public abstract String mo1723b();

    /* renamed from: a */
    public abstract boolean mo1725a();

    /* renamed from: c */
    public abstract int mo1722c();

    /* renamed from: d */
    public abstract int mo1721d();

    /* renamed from: a */
    public abstract int mo1724a(EnumC0853f enumC0853f);

    /* renamed from: b */
    public void m1726b(EnumC0853f enumC0853f) {
        this.f5598a = mo1724a(enumC0853f);
    }

    @Override // java.lang.Comparable
    /* renamed from: a */
    public int mo1728a(AbstractC0851d abstractC0851d) {
        if (this.f5598a == abstractC0851d.f5598a) {
            return mo1723b().compareTo(abstractC0851d.mo1723b());
        }
        return abstractC0851d.f5598a - this.f5598a;
    }
}