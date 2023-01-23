package com.corrodinggames.rts.game.units.custom.f;

import java.util.HashMap;

/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/f/d.class */
public class d {

    /* renamed from: a  reason: collision with root package name */
    HashMap f304a = new HashMap();

    public void a(String str, String str2) {
        this.f304a.put(str, str2);
    }

    public String a(String str) {
        return (String) this.f304a.get(str);
    }

    public void a() {
        this.f304a.clear();
    }
}