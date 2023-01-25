package com.corrodinggames.rts.game.units.custom;

/* renamed from: com.corrodinggames.rts.game.units.custom.w */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/w.class */
public class C0470w extends C0469v {
    @Override // com.corrodinggames.rts.game.units.custom.C0469v
    /* renamed from: a */
    public void mo3469a() {
        if (!this.f3385e) {
            this.f3384d = C0458l.m3502n(this.f3383c);
            if (this.f3384d == null) {
                throw new C0417bo("Could not find customUnit target:" + m3472d() + " used on:" + this.f3381a + " in section:" + this.f3382b);
            }
        }
    }

    @Override // com.corrodinggames.rts.game.units.custom.C0469v
    /* renamed from: e */
    public C0458l mo3471c() {
        return (C0458l) this.f3384d;
    }
}