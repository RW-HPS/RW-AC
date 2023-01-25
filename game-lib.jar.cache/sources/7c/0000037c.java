package com.corrodinggames.rts.game.units.custom;

/* renamed from: com.corrodinggames.rts.game.units.custom.x */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/x.class */
public class C0471x extends C0470w {

    /* renamed from: g */
    String f3387g;

    /* renamed from: h */
    C0410bh f3388h;

    @Override // com.corrodinggames.rts.game.units.custom.C0470w, com.corrodinggames.rts.game.units.custom.C0469v
    /* renamed from: a */
    public void mo3469a() {
    }

    @Override // com.corrodinggames.rts.game.units.custom.C0469v
    /* renamed from: b */
    public void mo3468b() {
        super.mo3469a();
        this.f3388h = mo3471c().m3518f(this.f3387g);
        if (this.f3388h == null) {
            throw new C0417bo("Could not find projectile:" + this.f3387g + " on unit target:" + m3472d() + " used on:" + this.f3381a + " in section:" + this.f3382b);
        }
    }

    /* renamed from: f */
    public C0410bh m3467f() {
        return this.f3388h;
    }
}