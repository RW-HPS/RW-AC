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
    aj a;
    aj b;
    aj c;
    aj d;
    aj e;
    aj f;
    static final Pattern g = Pattern.compile("%\\{([^\\]]*?)\\}");

    public static void a(com.corrodinggames.rts.game.units.custom.l lVar, ab abVar, String str, String str2, com.corrodinggames.rts.game.units.custom.a.d dVar, String str3, boolean z) {
        aj a = ag.a(lVar, abVar, str, "showMessageToPlayer", (String) null);
        aj a2 = ag.a(lVar, abVar, str, "showMessageToAllPlayers", (String) null);
        aj a3 = ag.a(lVar, abVar, str, "showMessageToAllEnemyPlayers", (String) null);
        aj a4 = ag.a(lVar, abVar, str, "showQuickWarLogToPlayer", (String) null);
        aj a5 = ag.a(lVar, abVar, str, "showQuickWarLogToAllPlayers", (String) null);
        aj a6 = ag.a(lVar, abVar, str, "debugMessage", (String) null);
        if (a != null || a2 != null || a3 != null || a4 != null || a5 != null || a6 != null) {
            f fVar = new f();
            fVar.a = a;
            fVar.b = a2;
            fVar.c = a3;
            fVar.d = a4;
            fVar.e = a5;
            fVar.f = a6;
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
        if (this.a != null && jVar.bX == gameEngine.playerTeam) {
            GameNetEngine.a((String) null, a(jVar, this.a.b(jVar)));
        }
        if (this.b != null) {
            GameNetEngine.a((String) null, a(jVar, this.b.b(jVar)));
        }
        if (this.c != null && gameEngine.playerTeam != null && jVar.bX.c(gameEngine.playerTeam)) {
            GameNetEngine.a((String) null, a(jVar, this.c.b(jVar)));
        }
        if (this.d != null && jVar.bX == gameEngine.playerTeam) {
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