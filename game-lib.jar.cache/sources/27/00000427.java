package com.corrodinggames.rts.gameFramework.a;

/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/a/i.class */
public abstract class i {
    public String e;
    public boolean g;
    public float d = 1.0f;
    public boolean f = false;

    public abstract void a(float f, float f2, int i, int i2, float f3);

    public abstract int a();

    public i(String str, h hVar) {
        this.e = com.corrodinggames.rts.gameFramework.f.g(str);
        if (hVar != null) {
            hVar.h.put(this.e, this);
        }
    }
}