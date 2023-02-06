package com.corrodinggames.rts.gameFramework.status;

import android.graphics.PointF;
import com.corrodinggames.rts.game.PlayerData;
import com.corrodinggames.rts.game.units.am;
import com.corrodinggames.rts.game.units.custom.g;
import com.corrodinggames.rts.game.units.y;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.Interface.n;
import com.corrodinggames.rts.gameFramework.Interface.r;
import com.corrodinggames.rts.gameFramework.SyncPacket;
import com.corrodinggames.rts.gameFramework.net.GameNetEngine;
import com.corrodinggames.rts.gameFramework.status.a.a;
import com.corrodinggames.rts.gameFramework.utility.m;
import java.util.Iterator;

/* renamed from: com.corrodinggames.rts.gameFramework.n.d */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/n/d.class */
public class d {
    public static void a(f fVar, a aVar) {
        Integer d;
        Integer d2;
        GameEngine gameEngine = GameEngine.getGameEngine();
        boolean z = false;
        if (!aVar.j) {
            z = true;
        }
        fVar.a(aVar);
        aVar.i = true;
        aVar.j = true;
        aVar.k = gameEngine.by;
        boolean z2 = false;
        if (aVar.A != null) {
            n a = gameEngine.bS.h.a((String) null, aVar.A.b());
            if (a != null) {
                String b = aVar.b("globalMessage_delayPerChar");
                if (b != null) {
                    if (b.equals("slow")) {
                        a.e = 18;
                    } else {
                        int b2 = aVar.b("globalMessage_delayPerChar", -1);
                        if (b2 != -1) {
                            a.e = b2;
                        }
                    }
                }
                int c = aVar.c("globalMessage_textColor", -1);
                if (c != -1) {
                    a.f = c;
                }
            }
            z2 = true;
        }
        String b3 = aVar.b("debugMessage");
        if (b3 != null) {
            aVar.h("Debug: " + b3);
            if (gameEngine.bv && gameEngine.bl) {
                GameNetEngine.a((String) null, "Debug: " + b3);
            }
            z2 = true;
        }
        if (aVar.a("showOnMap", false)) {
            gameEngine.bW.a(aVar.b(), aVar.c(), r.message);
            z2 = true;
        }
        if (aVar.f.a > 0) {
            Iterator it = aVar.f.iterator();
            while (it.hasNext()) {
                if (((a) it.next()).c(aVar)) {
                    z2 = true;
                }
            }
        }
        if (aVar.g == e.objective) {
            if (z) {
                aVar.h("objective met");
            }
            z2 = true;
        }
        if (aVar.g == e.trigger_basic) {
            z2 = true;
        }
        if (aVar.g == e.trigger_unitDetect) {
            z2 = true;
        }
        if (aVar.g == e.trigger_teamTagDetect) {
            z2 = true;
        }
        if (aVar.g == e.mapText) {
            z2 = true;
        }
        if (aVar.g == e.moveCamera) {
            z2 = true;
            gameEngine.b(aVar.b(), aVar.c());
        }
        if (aVar.g == e.event_unitAdd) {
            float b4 = aVar.b();
            float c2 = aVar.c();
            PlayerData a2 = aVar.a();
            if (a2 == null) {
                aVar.g("No team set, cannot spawn");
            } else if (aVar.v != null) {
                aVar.v.a(b4, c2, 0.0f, 0.0f, a2, false, null, null, false);
            } else {
                aVar.g("No valid unit list to spawn");
            }
            z2 = true;
        }
        if (aVar.g == e.event_changeCredits) {
            PlayerData a3 = aVar.a();
            if (a3 == null) {
                aVar.g("Team not set for changeCredits");
                return;
            }
            if (aVar.d("set") != null) {
                a3.credits = d.intValue();
            }
            if (aVar.d("add") != null) {
                a3.d(d2.intValue());
            }
        } else if (aVar.g == e.event_teamTags) {
            PlayerData a4 = aVar.a();
            if (a4 == null) {
                aVar.g("Team not set for event_teamTags");
                return;
            }
            String a5 = aVar.a("addTeamTags", (String) null);
            if (a5 != null) {
                a4.b(g.a(a5));
            }
            String a6 = aVar.a("removeTeamTags", (String) null);
            if (a6 != null) {
                a4.c(g.a(a6));
            }
        } else if (aVar.g == e.event_move) {
            String b5 = aVar.b("target");
            if (b5 == null) {
                f.i("Move trigger has no target id:" + aVar.a);
                return;
            }
            PointF f = fVar.f(b5);
            if (f == null) {
                f.i("Move trigger: Cannot find target for:" + aVar.a + " target:" + b5);
                return;
            }
            PlayerData a7 = aVar.a();
            if (a7 == null) {
                f.i("Team not set map trigger:" + aVar.a);
                return;
            }
            int i = 0;
            SyncPacket b6 = gameEngine.cf.b(a7);
            Iterator it2 = am.bE.iterator();
            while (it2.hasNext()) {
                am amVar = (am) it2.next();
                if (amVar.bX == a7 && (amVar instanceof y) && aVar.a(amVar) && aVar.b(amVar)) {
                    b6.a((y) amVar);
                    i++;
                }
            }
            b6.a(f.x, f.y);
            if (z) {
                fVar.b("firstActivation: move at:" + gameEngine.by + " for teamId:" + a7.site + " to targetId:" + b5 + " (#units:" + i + ")");
            }
            if (aVar.b("unload") != null) {
                Iterator it3 = am.bE.iterator();
                while (it3.hasNext()) {
                    am amVar2 = (am) it3.next();
                    if (amVar2.bX == a7 && (amVar2 instanceof y) && aVar.a(amVar2) && aVar.b(amVar2) && amVar2.cr()) {
                        y yVar = (y) amVar2;
                        SyncPacket b7 = gameEngine.cf.b(a7);
                        b7.e = true;
                        b7.a(yVar);
                        b7.a(yVar.cp());
                    }
                }
            }
        } else {
            if (aVar.g == e.event_unitRemove) {
                m mVar = new m();
                Iterator it4 = am.bE.iterator();
                while (it4.hasNext()) {
                    am amVar3 = (am) it4.next();
                    if ((amVar3 instanceof y) && aVar.a(amVar3) && aVar.b(amVar3)) {
                        mVar.add(amVar3);
                    }
                }
                if (mVar.size() > 0) {
                    Iterator it5 = mVar.iterator();
                    while (it5.hasNext()) {
                        am amVar4 = (am) it5.next();
                        amVar4.ci();
                        if ((amVar4 instanceof y) && amVar4.bI()) {
                            gameEngine.bU.a((y) amVar4);
                        }
                    }
                }
                z2 = true;
            }
            if (!z2) {
                aVar.h("Trigger activated with no effect");
            }
        }
    }
}