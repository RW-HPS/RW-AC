package com.corrodinggames.rts.game.units.custom.a.a;

import android.graphics.PointF;
import com.corrodinggames.rts.game.units.a.s;
import com.corrodinggames.rts.game.units.am;
import com.corrodinggames.rts.gameFramework.utility.ab;

/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/a/a/l.class */
public class l extends com.corrodinggames.rts.game.units.custom.a.a {

    /* renamed from: a  reason: collision with root package name */
    boolean f228a;
    com.corrodinggames.rts.game.units.custom.h b;
    com.corrodinggames.rts.game.units.custom.h c;
    com.corrodinggames.rts.game.units.custom.h d;
    com.corrodinggames.rts.game.units.custom.h e;

    public static void a(com.corrodinggames.rts.game.units.custom.l lVar, ab abVar, String str, String str2, com.corrodinggames.rts.game.units.custom.a.d dVar, String str3, boolean z) {
        boolean booleanValue = abVar.a(str, str2 + "resetToDefaultTags", (Boolean) false).booleanValue();
        com.corrodinggames.rts.game.units.custom.h a2 = abVar.a(lVar, str, str2 + "temporarilyAddTags", (com.corrodinggames.rts.game.units.custom.h) null);
        com.corrodinggames.rts.game.units.custom.h a3 = abVar.a(lVar, str, str2 + "temporarilyRemoveTags", (com.corrodinggames.rts.game.units.custom.h) null);
        if (booleanValue || a2 != null || a3 != null) {
            l lVar2 = new l();
            lVar2.f228a = booleanValue;
            lVar2.b = a2;
            lVar2.c = a3;
            dVar.ac.add(lVar2);
        }
        com.corrodinggames.rts.game.units.custom.h a4 = abVar.a(lVar, str, str2 + "addGlobalTeamTags", (com.corrodinggames.rts.game.units.custom.h) null);
        com.corrodinggames.rts.game.units.custom.h a5 = abVar.a(lVar, str, str2 + "removeGlobalTeamTags", (com.corrodinggames.rts.game.units.custom.h) null);
        if (a4 != null || a5 != null) {
            l lVar3 = new l();
            lVar3.d = a4;
            lVar3.e = a5;
            dVar.ac.add(lVar3);
        }
    }

    @Override // com.corrodinggames.rts.game.units.custom.a.a
    public boolean a(com.corrodinggames.rts.game.units.custom.j jVar, s sVar, PointF pointF, am amVar, int i) {
        if (this.f228a) {
            jVar.j(false);
        }
        if (this.c != null) {
            jVar.b(this.c);
        }
        if (this.b != null) {
            jVar.a(this.b);
        }
        if (this.d != null) {
            jVar.bX.b(this.d);
        }
        if (this.e != null) {
            jVar.bX.c(this.e);
            return true;
        }
        return true;
    }
}