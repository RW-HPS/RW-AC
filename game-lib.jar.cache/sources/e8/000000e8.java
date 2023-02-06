package com.corrodinggames.librocket;

import com.LibRocket;
import com.corrodinggames.rts.game.units.as;

/* loaded from: game-lib.jar:com/corrodinggames/librocket/c.class */
public abstract class c extends LibRocket.TextureHolder {
    public String a;
    public boolean b;
    public boolean c;
    public boolean d;
    public float e;
    public as f;
    final /* synthetic */ b g;

    public abstract boolean a();

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(b bVar) {
        super();
        this.g = bVar;
        this.e = 1.0f;
    }
}