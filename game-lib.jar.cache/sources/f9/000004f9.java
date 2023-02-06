package com.corrodinggames.rts.gameFramework.player;

/* renamed from: com.corrodinggames.rts.gameFramework.g.d */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/g/d.class */
public abstract class d implements Comparable {
    private int a;

    public abstract String b();

    public abstract boolean a();

    public abstract int c();

    public abstract int d();

    public abstract int a(f fVar);

    static /* synthetic */ int b(d dVar) {
        return dVar.a;
    }

    public void b(f fVar) {
        this.a = a(fVar);
    }

    @Override // java.lang.Comparable
    /* renamed from: a */
    public int compareTo(d dVar) {
        if (this.a == dVar.a) {
            return b().compareTo(dVar.b());
        }
        return dVar.a - this.a;
    }
}