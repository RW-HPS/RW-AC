package com.corrodinggames.rts.game.units.custom.f;

import java.util.HashMap;

/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/f/d.class */
public class d {
    HashMap a = new HashMap();

    public void a(String str, String str2) {
        this.a.put(str, str2);
    }

    public String a(String str) {
        return (String) this.a.get(str);
    }

    public void a() {
        this.a.clear();
    }
}