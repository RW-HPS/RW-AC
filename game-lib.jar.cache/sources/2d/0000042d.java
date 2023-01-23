package com.corrodinggames.rts.gameFramework;

/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/af.class */
public abstract class af {

    /* renamed from: a  reason: collision with root package name */
    public int f402a = -1;
    public int b = 0;
    protected boolean c;
    public boolean d;

    public abstract boolean a();

    public abstract boolean b();

    public abstract String c();

    public abstract boolean d();

    public boolean a(af afVar) {
        if (this.b != afVar.b || this.f402a != afVar.f402a) {
            return false;
        }
        return true;
    }
}