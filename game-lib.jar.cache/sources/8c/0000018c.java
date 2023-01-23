package com.corrodinggames.rts.game;

import com.corrodinggames.rts.game.units.am;
import com.corrodinggames.rts.game.units.custom.z;

/* loaded from: game-lib.jar:com/corrodinggames/rts/game/h.class */
public class h {

    /* renamed from: a  reason: collision with root package name */
    public com.corrodinggames.rts.game.units.custom.h f159a;
    public com.corrodinggames.rts.game.units.custom.h b;
    public float c;
    public float d;
    public com.corrodinggames.rts.game.units.custom.d.b e;
    public com.corrodinggames.rts.game.units.custom.d.b f;
    public z g;

    public boolean a(am amVar) {
        if (this.b != null && com.corrodinggames.rts.game.units.custom.g.a(this.b, amVar.de())) {
            return false;
        }
        if (this.f159a != null && !com.corrodinggames.rts.game.units.custom.g.a(this.f159a, amVar.de())) {
            return false;
        }
        return true;
    }
}