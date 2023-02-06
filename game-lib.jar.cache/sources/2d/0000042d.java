package com.corrodinggames.rts.gameFramework;

/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/af.class */
public abstract class af {
    public int a = -1;
    public int b = 0;
    protected boolean c;
    public boolean d;

    public abstract boolean a();

    public abstract boolean b();

    public abstract String c();

    public abstract boolean d();

    public boolean a(af afVar) {
        if (this.b != afVar.b || this.a != afVar.a) {
            return false;
        }
        return true;
    }
}