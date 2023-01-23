package com.corrodinggames.rts.game.units.custom.a.a;

import android.graphics.PointF;
import com.corrodinggames.rts.game.units.a.s;
import com.corrodinggames.rts.game.units.am;
import com.corrodinggames.rts.game.units.custom.ag;
import com.corrodinggames.rts.game.units.custom.aj;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.net.GameNetEngine;
import com.corrodinggames.rts.gameFramework.utility.ab;
import java.util.regex.Pattern;

/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/a/a/f.class */
public class f extends com.corrodinggames.rts.game.units.custom.a.a {

    /* renamed from: a  reason: collision with root package name */
    aj f222a;
    aj b;
    aj c;
    aj d;
    aj e;
    aj f;
    static final Pattern g = Pattern.compile("%\\{([^\\]]*?)\\}");

    public static void a(com.corrodinggames.rts.game.units.custom.l lVar, ab abVar, String str, String str2, com.corrodinggames.rts.game.units.custom.a.d dVar, String str3, boolean z) {
        aj a2 = ag.a(lVar, abVar, str, "showMessageToPlayer", (String) null);
        aj a3 = ag.a(lVar, abVar, str, "showMessageToAllPlayers", (String) null);
        aj a4 = ag.a(lVar, abVar, str, "showMessageToAllEnemyPlayers", (String) null);
        aj a5 = ag.a(lVar, abVar, str, "showQuickWarLogToPlayer", (String) null);
        aj a6 = ag.a(lVar, abVar, str, "showQuickWarLogToAllPlayers", (String) null);
        aj a7 = ag.a(lVar, abVar, str, "debugMessage", (String) null);
        if (a2 != null || a3 != null || a4 != null || a5 != null || a6 != null || a7 != null) {
            f fVar = new f();
            fVar.f222a = a2;
            fVar.b = a3;
            fVar.c = a4;
            fVar.d = a5;
            fVar.e = a6;
            fVar.f = a7;
            dVar.ac.add(fVar);
        }
    }

    public String a(com.corrodinggames.rts.game.units.custom.j jVar, String str) {
        if (str == null) {
            str = null;
        }
        return str;
    }

    @Override // com.corrodinggames.rts.game.units.custom.a.a
    public boolean a(com.corrodinggames.rts.game.units.custom.j jVar, s sVar, PointF pointF, am amVar, int i) {
        GameEngine gameEngine = GameEngine.getGameEngine();
        if (this.f222a != null && jVar.bX == gameEngine.bs) {
            GameNetEngine.a((String) null, a(jVar, this.f222a.b(jVar)));
        }
        if (this.b != null) {
            GameNetEngine.a((String) null, a(jVar, this.b.b(jVar)));
        }
        if (this.c != null && gameEngine.bs != null && jVar.bX.c(gameEngine.bs)) {
            GameNetEngine.a((String) null, a(jVar, this.c.b(jVar)));
        }
        if (this.d != null && jVar.bX == gameEngine.bs) {
            gameEngine.bS.i.a(a(jVar, this.d.b(jVar)));
        }
        if (this.e != null) {
            gameEngine.bS.i.a(a(jVar, this.e.b(jVar)));
        }
        if (this.f != null && gameEngine.bv && gameEngine.bl) {
            GameNetEngine.a((String) null, jVar.r().i() + "(" + jVar.eh + ") Debug: " + a(jVar, this.f.b(jVar)));
            return true;
        }
        return true;
    }
}