package com.corrodinggames.rts.game.units.custom.p023f;

import java.util.HashMap;

/* renamed from: com.corrodinggames.rts.game.units.custom.f.d */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/f/d.class */
public class C0451d {

    /* renamed from: a */
    HashMap f2861a = new HashMap();

    /* renamed from: a */
    public void m3687a(String str, String str2) {
        this.f2861a.put(str, str2);
    }

    /* renamed from: a */
    public String m3688a(String str) {
        return (String) this.f2861a.get(str);
    }

    /* renamed from: a */
    public void m3689a() {
        this.f2861a.clear();
    }
}