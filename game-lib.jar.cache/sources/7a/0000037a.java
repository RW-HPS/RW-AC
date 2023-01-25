package com.corrodinggames.rts.game.units.custom;

import com.corrodinggames.rts.game.units.InterfaceC0303as;
import com.corrodinggames.rts.gameFramework.GameEngine;

/* renamed from: com.corrodinggames.rts.game.units.custom.v */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/v.class */
public class C0469v {

    /* renamed from: a */
    String f3381a;

    /* renamed from: b */
    String f3382b;

    /* renamed from: c */
    String f3383c;

    /* renamed from: d */
    InterfaceC0303as f3384d;

    /* renamed from: e */
    boolean f3385e;

    /* renamed from: f */
    public boolean f3386f;

    /* renamed from: a */
    public void mo3469a() {
        if (!this.f3385e) {
            this.f3384d = C0458l.m3492s(this.f3383c);
            if (this.f3384d == null) {
                GameEngine.m5460e("AllUnitTypes: " + C0458l.m3566E());
                if (this.f3386f) {
                    throw new C0417bo("Could not find unit type:" + this.f3383c + " used on:" + this.f3381a + " in section:" + this.f3382b + " (Note: Prefix with 'unitref' if not using a unit type here)");
                }
                throw new C0417bo("Could not find unit type:" + this.f3383c + " used on:" + this.f3381a + " in section:" + this.f3382b);
            }
        }
    }

    /* renamed from: b */
    public void mo3468b() {
    }

    /* renamed from: c */
    public InterfaceC0303as mo3471c() {
        return this.f3384d;
    }

    /* renamed from: d */
    public String m3472d() {
        if (this.f3385e) {
            if (this.f3384d != null) {
                return this.f3384d.mo3513i();
            }
            return "(Error: known type is null)";
        }
        return this.f3383c;
    }
}