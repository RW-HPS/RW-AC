package com.corrodinggames.rts.gameFramework.status;

import android.graphics.Paint;
import android.graphics.Typeface;
import com.corrodinggames.rts.game.PlayerData;
import com.corrodinggames.rts.game.maps.a;
import com.corrodinggames.rts.game.maps.f;
import com.corrodinggames.rts.game.units.custom.bb;
import com.corrodinggames.rts.game.units.custom.bo;
import com.corrodinggames.rts.game.units.custom.bp;
import com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.status.a.b;
import java.util.Iterator;

/* renamed from: com.corrodinggames.rts.gameFramework.n.c */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/n/c.class */
public class c {
    public static a a(f fVar, a aVar) {
        try {
            GameEngine gameEngine = GameEngine.getGameEngine();
            String str = aVar.b;
            if (str == null) {
                str = "NULL";
            }
            String b = aVar.b("id");
            if (b != null && !b.equals(VariableScope.nullOrMissingString)) {
                str = b;
            }
            String trim = str.trim();
            String str2 = aVar.d;
            if (str2 != null) {
                e a = e.a(str2);
                if (a == null) {
                    f.c("Error: Unknown type:" + str2 + " found on " + trim);
                    return null;
                }
                a aVar2 = new a();
                aVar2.t = aVar;
                aVar2.g = a;
                aVar2.b = trim;
                int i = 0;
                Iterator it = fVar.J.iterator();
                while (it.hasNext()) {
                    if (((a) it.next()).b.equalsIgnoreCase(aVar2.b)) {
                        i++;
                    }
                }
                aVar2.c = aVar2.b;
                if (i != 0) {
                    aVar2.c += "_" + i;
                }
                aVar2.a = aVar.b;
                Integer d = aVar2.d("team");
                if (d != null) {
                    aVar2.y = PlayerData.getPlayerData(d.intValue());
                    if (aVar2.y == null) {
                        aVar2.g("Cannot find team:" + d);
                        return null;
                    }
                }
                aVar2.r = aVar2.b("delay", aVar2.r);
                aVar2.p = aVar2.b("repeatDelay", aVar2.p);
                aVar2.o = aVar2.a("repeatCount", aVar2.o);
                aVar2.q = aVar2.b("resetActivationAfter", aVar2.q);
                aVar2.h = aVar2.a("allToActivate", false);
                aVar2.d.b = aVar2.h;
                aVar2.s = aVar2.b("warmup", aVar2.s);
                aVar2.A = aVar2.a("globalMessage", (bb) null);
                aVar2.w = aVar2.a("textOffsetX", 0.0f);
                aVar2.x = aVar2.a("textOffsetY", 0.0f);
                if (aVar2.g == e.mapText || aVar2.g == e.objective) {
                    aVar2.z = aVar2.a("text", (bb) null);
                }
                if (aVar2.g == e.mapText) {
                    fVar.i = true;
                    aVar2.B = new Paint();
                    aVar2.B.a(true);
                    aVar2.B.a(Paint.Align.CENTER);
                    aVar2.B.a(Typeface.a(Typeface.c, 1));
                    aVar2.B.b(aVar2.c("textColor", -1));
                    gameEngine.b(aVar2.B, aVar2.a("textSize", 20));
                    if (aVar2.B.f() == 0) {
                        aVar2.g("Text has an alpha of 0");
                    }
                    String b2 = aVar2.b("style");
                    if (b2 != null && !b2.equals(VariableScope.nullOrMissingString)) {
                        if (b2.equalsIgnoreCase("arrow")) {
                            aVar2.C = true;
                        } else {
                            aVar2.g("Unknown style: " + b2);
                        }
                    }
                }
                if (aVar2.g == e.event_unitAdd) {
                    try {
                        aVar2.v = bp.a(aVar2.b("spawnUnits"), "<unitAdd>", "spawnUnits");
                        if (aVar2.a() == null) {
                            aVar2.g("No team set");
                        }
                    } catch (bo e) {
                        f.c(e.getMessage());
                        return null;
                    }
                }
                if (aVar2.g == e.event_teamTags) {
                    aVar2.a("addTeamTags");
                    aVar2.a("removeTeamTags");
                }
                if (aVar2.g == e.event_changeCredits) {
                    aVar2.a("add");
                    aVar2.a("set");
                }
                if (aVar2.g == e.trigger_unitDetect) {
                    aVar2.a(com.corrodinggames.rts.gameFramework.status.a.c.d(aVar2));
                }
                if (aVar2.g == e.trigger_teamTagDetect) {
                    aVar2.a(b.d(aVar2));
                }
                aVar2.a("comment");
                aVar2.a("team");
                aVar2.a("globalMessage");
                aVar2.a("globalMessage_delayPerChar");
                aVar2.a("globalMessage_textColor");
                aVar2.a("debugMessage");
                aVar2.a("showOnMap");
                aVar2.a("text");
                aVar2.a("target");
                aVar2.a("onlyIfEmpty");
                if (aVar2.g == e.event_move) {
                    aVar2.a("unload");
                }
                if (aVar2.g == e.event_unitRemove) {
                    aVar2.a("onlyIfEmpty");
                }
                return aVar2;
            }
            f.c("Error: no type field set for: " + trim);
            return null;
        } catch (RuntimeException e2) {
            throw new f("Error while reading: " + aVar.b(), e2);
        }
    }
}