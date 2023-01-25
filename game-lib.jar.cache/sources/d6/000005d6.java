package com.corrodinggames.rts.gameFramework.status;

import android.graphics.PointF;
import com.corrodinggames.rts.game.PlayerData;
import com.corrodinggames.rts.game.units.AbstractC0244am;
import com.corrodinggames.rts.game.units.AbstractC0629y;
import com.corrodinggames.rts.game.units.custom.C0453g;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.SyncPacket;
import com.corrodinggames.rts.gameFramework.net.GameNetEngine;
import com.corrodinggames.rts.gameFramework.p037f.C0832n;
import com.corrodinggames.rts.gameFramework.p037f.EnumC0837r;
import com.corrodinggames.rts.gameFramework.status.p047a.AbstractC1067a;
import com.corrodinggames.rts.gameFramework.utility.C1136m;
import java.util.Iterator;

/* renamed from: com.corrodinggames.rts.gameFramework.n.d */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/n/d.class */
public class C1072d {
    /* renamed from: a */
    public static void m796a(C1085f c1085f, C1066a c1066a) {
        Integer m811d;
        Integer m811d2;
        GameEngine gameEngine = GameEngine.getGameEngine();
        boolean z = false;
        if (!c1066a.f6818j) {
            z = true;
        }
        c1085f.m789a(c1066a);
        c1066a.f6817i = true;
        c1066a.f6818j = true;
        c1066a.f6819k = gameEngine.f6315by;
        boolean z2 = false;
        if (c1066a.f6829A != null) {
            C0832n m1782a = gameEngine.f6330bS.f5264h.m1782a((String) null, c1066a.f6829A.m3910b());
            if (m1782a != null) {
                String m817b = c1066a.m817b("globalMessage_delayPerChar");
                if (m817b != null) {
                    if (m817b.equals("slow")) {
                        m1782a.f5462e = 18;
                    } else {
                        int m816b = c1066a.m816b("globalMessage_delayPerChar", -1);
                        if (m816b != -1) {
                            m1782a.f5462e = m816b;
                        }
                    }
                }
                int m813c = c1066a.m813c("globalMessage_textColor", -1);
                if (m813c != -1) {
                    m1782a.f5463f = m813c;
                }
            }
            z2 = true;
        }
        String m817b2 = c1066a.m817b("debugMessage");
        if (m817b2 != null) {
            c1066a.m807h("Debug: " + m817b2);
            if (gameEngine.f6313bv && gameEngine.f6444bl) {
                GameNetEngine.m1564a((String) null, "Debug: " + m817b2);
            }
            z2 = true;
        }
        if (c1066a.m820a("showOnMap", false)) {
            gameEngine.f6334bW.m1772a(c1066a.m819b(), c1066a.m815c(), EnumC0837r.message);
            z2 = true;
        }
        if (c1066a.f6834f.f7109a > 0) {
            Iterator it = c1066a.f6834f.iterator();
            while (it.hasNext()) {
                if (((AbstractC1067a) it.next()).m805c(c1066a)) {
                    z2 = true;
                }
            }
        }
        if (c1066a.f6815g == EnumC1073e.f6861a) {
            if (z) {
                c1066a.m807h("objective met");
            }
            z2 = true;
        }
        if (c1066a.f6815g == EnumC1073e.f6871k) {
            z2 = true;
        }
        if (c1066a.f6815g == EnumC1073e.f6869i) {
            z2 = true;
        }
        if (c1066a.f6815g == EnumC1073e.f6870j) {
            z2 = true;
        }
        if (c1066a.f6815g == EnumC1073e.f6867g) {
            z2 = true;
        }
        if (c1066a.f6815g == EnumC1073e.f6868h) {
            z2 = true;
            gameEngine.m1022b(c1066a.m819b(), c1066a.m815c());
        }
        if (c1066a.f6815g == EnumC1073e.f6865e) {
            float m819b = c1066a.m819b();
            float m815c = c1066a.m815c();
            PlayerData m830a = c1066a.m830a();
            if (m830a == null) {
                c1066a.m808g("No team set, cannot spawn");
            } else if (c1066a.f6824v != null) {
                c1066a.f6824v.m3878a(m819b, m815c, 0.0f, 0.0f, m830a, false, null, null, false);
            } else {
                c1066a.m808g("No valid unit list to spawn");
            }
            z2 = true;
        }
        if (c1066a.f6815g == EnumC1073e.f6863c) {
            PlayerData m830a2 = c1066a.m830a();
            if (m830a2 == null) {
                c1066a.m808g("Team not set for changeCredits");
                return;
            }
            if (c1066a.m811d("set") != null) {
                m830a2.credits = m811d.intValue();
            }
            if (c1066a.m811d("add") != null) {
                m830a2.m4392d(m811d2.intValue());
            }
        } else if (c1066a.f6815g == EnumC1073e.f6864d) {
            PlayerData m830a3 = c1066a.m830a();
            if (m830a3 == null) {
                c1066a.m808g("Team not set for event_teamTags");
                return;
            }
            String m822a = c1066a.m822a("addTeamTags", (String) null);
            if (m822a != null) {
                m830a3.m4414b(C0453g.m3681a(m822a));
            }
            String m822a2 = c1066a.m822a("removeTeamTags", (String) null);
            if (m822a2 != null) {
                m830a3.m4398c(C0453g.m3681a(m822a2));
            }
        } else if (c1066a.f6815g == EnumC1073e.f6862b) {
            String m817b3 = c1066a.m817b("target");
            if (m817b3 == null) {
                C1085f.m764i("Move trigger has no target id:" + c1066a.f6812a);
                return;
            }
            PointF m769f = c1085f.m769f(m817b3);
            if (m769f == null) {
                C1085f.m764i("Move trigger: Cannot find target for:" + c1066a.f6812a + " target:" + m817b3);
                return;
            }
            PlayerData m830a4 = c1066a.m830a();
            if (m830a4 == null) {
                C1085f.m764i("Team not set map trigger:" + c1066a.f6812a);
                return;
            }
            int i = 0;
            SyncPacket m2419b = gameEngine.f6343cf.m2419b(m830a4);
            Iterator it2 = AbstractC0244am.f1594bE.iterator();
            while (it2.hasNext()) {
                AbstractC0244am abstractC0244am = (AbstractC0244am) it2.next();
                if (abstractC0244am.f1614bX == m830a4 && (abstractC0244am instanceof AbstractC0629y) && c1066a.m829a(abstractC0244am) && c1066a.m818b(abstractC0244am)) {
                    m2419b.m2327a((AbstractC0629y) abstractC0244am);
                    i++;
                }
            }
            m2419b.m2337a(m769f.x, m769f.y);
            if (z) {
                c1085f.m780b("firstActivation: move at:" + gameEngine.f6315by + " for teamId:" + m830a4.site + " to targetId:" + m817b3 + " (#units:" + i + ")");
            }
            if (c1066a.m817b("unload") != null) {
                Iterator it3 = AbstractC0244am.f1594bE.iterator();
                while (it3.hasNext()) {
                    AbstractC0244am abstractC0244am2 = (AbstractC0244am) it3.next();
                    if (abstractC0244am2.f1614bX == m830a4 && (abstractC0244am2 instanceof AbstractC0629y) && c1066a.m829a(abstractC0244am2) && c1066a.m818b(abstractC0244am2) && abstractC0244am2.mo3245cr()) {
                        AbstractC0629y abstractC0629y = (AbstractC0629y) abstractC0244am2;
                        SyncPacket m2419b2 = gameEngine.f6343cf.m2419b(m830a4);
                        m2419b2.f4936e = true;
                        m2419b2.m2327a(abstractC0629y);
                        m2419b2.m2332a(abstractC0629y.mo3246cp());
                    }
                }
            }
        } else {
            if (c1066a.f6815g == EnumC1073e.f6866f) {
                C1136m c1136m = new C1136m();
                Iterator it4 = AbstractC0244am.f1594bE.iterator();
                while (it4.hasNext()) {
                    AbstractC0244am abstractC0244am3 = (AbstractC0244am) it4.next();
                    if ((abstractC0244am3 instanceof AbstractC0629y) && c1066a.m829a(abstractC0244am3) && c1066a.m818b(abstractC0244am3)) {
                        c1136m.add(abstractC0244am3);
                    }
                }
                if (c1136m.size() > 0) {
                    Iterator it5 = c1136m.iterator();
                    while (it5.hasNext()) {
                        AbstractC0244am abstractC0244am4 = (AbstractC0244am) it5.next();
                        abstractC0244am4.m4210ci();
                        if ((abstractC0244am4 instanceof AbstractC0629y) && abstractC0244am4.mo3397bI()) {
                            gameEngine.f6332bU.m1176a((AbstractC0629y) abstractC0244am4);
                        }
                    }
                }
                z2 = true;
            }
            if (!z2) {
                c1066a.m807h("Trigger activated with no effect");
            }
        }
    }
}