package com.corrodinggames.rts.game;

import com.corrodinggames.rts.game.units.am;
import com.corrodinggames.rts.game.units.custom.z;

/* loaded from: game-lib.jar:com/corrodinggames/rts/game/h.class */
public class h {
    public com.corrodinggames.rts.game.units.custom.h a;
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
        if (this.a != null && !com.corrodinggames.rts.game.units.custom.g.a(this.a, amVar.de())) {
            return false;
        }
        return true;
    }
}