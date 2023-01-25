package com.corrodinggames.rts.game.units;

import com.corrodinggames.rts.game.units.p013a.AbstractC0229x;

/* renamed from: com.corrodinggames.rts.game.units.i */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/i.class */
class C0597i extends AbstractC0229x {
    public C0597i() {
        super("addCredits");
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
    /* renamed from: b */
    public String mo3095b() {
        return "Add credits";
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
    /* renamed from: a */
    public String mo3098a() {
        return "Add $10000 to this team";
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0229x, com.corrodinggames.rts.game.units.p013a.AbstractC0224s
    /* renamed from: h */
    public boolean mo3088h() {
        return true;
    }
}