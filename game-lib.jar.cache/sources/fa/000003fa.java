package com.corrodinggames.rts.game.units;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/i.class */
public class i extends com.corrodinggames.rts.game.units.a.x {
    public i() {
        super("addCredits");
    }

    @Override // com.corrodinggames.rts.game.units.a.s
    public String b() {
        return "Add credits";
    }

    @Override // com.corrodinggames.rts.game.units.a.s
    public String a() {
        return "Add $10000 to this team";
    }

    @Override // com.corrodinggames.rts.game.units.a.x, com.corrodinggames.rts.game.units.a.s
    public boolean h() {
        return true;
    }
}