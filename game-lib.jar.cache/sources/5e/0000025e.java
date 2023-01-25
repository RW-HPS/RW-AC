package com.corrodinggames.rts.game.units.custom.p018b;

import com.corrodinggames.rts.game.units.custom.C0456j;
import com.corrodinggames.rts.game.units.custom.C0458l;
import com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean;
import com.corrodinggames.rts.gameFramework.C0773f;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.utility.C1107ab;

/* renamed from: com.corrodinggames.rts.game.units.custom.b.l */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/b/l.class */
public class C0400l extends AbstractC0389a {

    /* renamed from: a */
    LogicBoolean f2413a;

    /* renamed from: b */
    float f2414b;

    /* renamed from: c */
    float f2415c;

    /* renamed from: d */
    int f2416d;

    /* renamed from: a */
    public static void m3932a(C0458l c0458l, C1107ab c1107ab) {
        if (c1107ab.m648g("movement_random")) {
            C0400l c0400l = new C0400l();
            c0400l.m3931a(c0458l, c1107ab, "movement_random", "movement_random");
            if (!LogicBoolean.isStaticFalse(c0400l.f2413a)) {
                c0458l.m3558a(c0400l);
            }
        }
    }

    /* renamed from: a */
    public void m3931a(C0458l c0458l, C1107ab c1107ab, String str, String str2) {
        this.f2413a = c1107ab.m707a(c0458l, str, "enabled");
        this.f2414b = c1107ab.m643i(str, "speed");
        this.f2415c = c1107ab.m683a(str, "maxSpeed", Float.valueOf(5.0f)).floatValue();
        this.f2416d = c1107ab.m667b(str, "awayFromEdge", (Integer) 75).intValue();
    }

    @Override // com.corrodinggames.rts.game.units.custom.p018b.AbstractC0389a
    /* renamed from: b */
    public void mo3919b(C0456j c0456j, float f) {
        if (!this.f2413a.read(c0456j)) {
            return;
        }
        GameEngine gameEngine = GameEngine.getGameEngine();
        if (c0456j.mo2903bi()) {
            if (C0773f.m2152c(c0456j.f1619cc) < this.f2415c) {
                c0456j.f1619cc += C0773f.m2162b(c0456j, -this.f2414b, this.f2414b, 1);
            }
            if (C0773f.m2152c(c0456j.f1620cd) < this.f2415c) {
                c0456j.f1620cd += C0773f.m2162b(c0456j, -this.f2414b, this.f2414b, 2);
            }
        } else {
            if (C0773f.m2152c(c0456j.f1622cf) < this.f2415c) {
                c0456j.f1622cf += C0773f.m2162b(c0456j, -this.f2414b, this.f2414b, 1);
            }
            c0456j.f1623cg += C0773f.m2162b(c0456j, -1.0f, 1.0f, 2);
        }
        if (this.f2416d > 0) {
            if (c0456j.f7174ep > gameEngine.f6371bL.m4598j() - this.f2416d) {
                c0456j.f1620cd -= C0773f.m2162b(c0456j, 0.0f, this.f2414b * 0.25f, 10);
            }
            if (c0456j.f7174ep < this.f2416d) {
                c0456j.f1620cd += C0773f.m2162b(c0456j, 0.0f, this.f2414b * 0.25f, 11);
            }
            if (c0456j.f7173eo > gameEngine.f6371bL.m4599i() - this.f2416d) {
                c0456j.f1619cc -= C0773f.m2162b(c0456j, 0.0f, this.f2414b * 0.25f, 12);
            }
            if (c0456j.f7173eo < this.f2416d) {
                c0456j.f1619cc += C0773f.m2162b(c0456j, 0.0f, this.f2414b * 0.25f, 13);
            }
        }
        c0456j.f3979ay = true;
    }
}