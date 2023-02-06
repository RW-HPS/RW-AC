package com.corrodinggames.rts.game.units.custom.a.a;

import android.graphics.PointF;
import com.corrodinggames.rts.game.units.a.s;
import com.corrodinggames.rts.game.units.am;
import com.corrodinggames.rts.gameFramework.utility.ab;

/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/a/a/d.class */
public class d extends com.corrodinggames.rts.game.units.custom.a.a {
    boolean a;
    boolean b;
    com.corrodinggames.rts.game.units.custom.o c;
    com.corrodinggames.rts.game.units.custom.o d;
    boolean e;
    int f = Integer.MIN_VALUE;
    int g = Integer.MIN_VALUE;

    public static void a(com.corrodinggames.rts.game.units.custom.l lVar, ab abVar, String str, String str2, com.corrodinggames.rts.game.units.custom.a.d dVar, String str3, boolean z) {
        boolean booleanValue = abVar.a(str, str2 + "finishPlayingLastAnimation", (Boolean) false).booleanValue();
        boolean booleanValue2 = abVar.a(str, str2 + "stopLastAnimation", (Boolean) false).booleanValue();
        com.corrodinggames.rts.game.units.custom.o a = lVar.a(abVar.b(str, str2 + "playAnimation", (String) null), (com.corrodinggames.rts.game.units.custom.o) null);
        com.corrodinggames.rts.game.units.custom.o a2 = lVar.a(abVar.b(str, str2 + "playAnimationIfNotPlaying", (String) null), (com.corrodinggames.rts.game.units.custom.o) null);
        if (a != null && a2 != null) {
            throw new RuntimeException("Cannot use playAnimation and playAnimationIfNotPlaying at same time");
        }
        if (booleanValue2 && booleanValue) {
            throw new RuntimeException("Cannot use stopLastAnimation and finishPlayingLastAnimation at same time");
        }
        if (a != null || a2 != null || booleanValue || booleanValue2) {
            d dVar2 = new d();
            dVar2.a = booleanValue;
            dVar2.b = booleanValue2;
            dVar2.c = a;
            dVar2.d = a2;
            dVar2.e = abVar.a(str, str2 + "playAnimation_lowPriority", (Boolean) false).booleanValue();
            dVar.ac.add(dVar2);
        }
    }

    @Override // com.corrodinggames.rts.game.units.custom.a.a
    public boolean a(com.corrodinggames.rts.game.units.custom.j jVar, s sVar, PointF pointF, am amVar, int i) {
        if (this.a) {
            jVar.b.b();
        }
        if (this.b) {
            jVar.b.a();
        }
        if (this.c != null) {
            int i2 = 15;
            if (this.e) {
                i2 = 4;
            }
            jVar.b.a(this.c.b(), i2, true);
        }
        if (this.d != null) {
            int i3 = 15;
            if (this.e) {
                i3 = 4;
            }
            if (!jVar.b.a(this.d.b())) {
                jVar.b.a(this.d.b(), i3, true);
                return true;
            }
            return true;
        }
        return true;
    }
}