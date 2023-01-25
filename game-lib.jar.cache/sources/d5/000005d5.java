package com.corrodinggames.rts.gameFramework.status;

import android.graphics.Paint;
import android.graphics.Typeface;
import com.corrodinggames.rts.game.PlayerData;
import com.corrodinggames.rts.game.p012b.C0172a;
import com.corrodinggames.rts.game.p012b.C0179f;
import com.corrodinggames.rts.game.units.custom.C0404bb;
import com.corrodinggames.rts.game.units.custom.C0417bo;
import com.corrodinggames.rts.game.units.custom.C0418bp;
import com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.status.p047a.C1068b;
import com.corrodinggames.rts.gameFramework.status.p047a.C1069c;
import java.util.Iterator;

/* renamed from: com.corrodinggames.rts.gameFramework.n.c */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/n/c.class */
public class C1071c {
    /* renamed from: a */
    public static C1066a m797a(C1085f c1085f, C0172a c0172a) {
        try {
            GameEngine gameEngine = GameEngine.getGameEngine();
            String str = c0172a.f768b;
            if (str == null) {
                str = "NULL";
            }
            String m4669b = c0172a.m4669b("id");
            if (m4669b != null && !m4669b.equals(VariableScope.nullOrMissingString)) {
                str = m4669b;
            }
            String trim = str.trim();
            String str2 = c0172a.f770d;
            if (str2 != null) {
                EnumC1073e m795a = EnumC1073e.m795a(str2);
                if (m795a == null) {
                    C1085f.m776c("Error: Unknown type:" + str2 + " found on " + trim);
                    return null;
                }
                C1066a c1066a = new C1066a();
                c1066a.f6823t = c0172a;
                c1066a.f6815g = m795a;
                c1066a.f6813b = trim;
                int i = 0;
                Iterator it = c1085f.f6909J.iterator();
                while (it.hasNext()) {
                    if (((C1066a) it.next()).f6813b.equalsIgnoreCase(c1066a.f6813b)) {
                        i++;
                    }
                }
                c1066a.f6814c = c1066a.f6813b;
                if (i != 0) {
                    c1066a.f6814c += "_" + i;
                }
                c1066a.f6812a = c0172a.f768b;
                Integer m811d = c1066a.m811d("team");
                if (m811d != null) {
                    c1066a.f6827y = PlayerData.m4365k(m811d.intValue());
                    if (c1066a.f6827y == null) {
                        c1066a.m808g("Cannot find team:" + m811d);
                        return null;
                    }
                }
                c1066a.f6838r = c1066a.m816b("delay", c1066a.f6838r);
                c1066a.f6822p = c1066a.m816b("repeatDelay", c1066a.f6822p);
                c1066a.f6836o = c1066a.m825a("repeatCount", c1066a.f6836o);
                c1066a.f6837q = c1066a.m816b("resetActivationAfter", c1066a.f6837q);
                c1066a.f6816h = c1066a.m820a("allToActivate", false);
                c1066a.f6832d.f6860b = c1066a.f6816h;
                c1066a.f6839s = c1066a.m816b("warmup", c1066a.f6839s);
                c1066a.f6829A = c1066a.m824a("globalMessage", (C0404bb) null);
                c1066a.f6825w = c1066a.m826a("textOffsetX", 0.0f);
                c1066a.f6826x = c1066a.m826a("textOffsetY", 0.0f);
                if (c1066a.f6815g == EnumC1073e.f6867g || c1066a.f6815g == EnumC1073e.f6861a) {
                    c1066a.f6828z = c1066a.m824a("text", (C0404bb) null);
                }
                if (c1066a.f6815g == EnumC1073e.f6867g) {
                    c1085f.f6879i = true;
                    c1066a.f6830B = new Paint();
                    c1066a.f6830B.mo914a(true);
                    c1066a.f6830B.m5224a(Paint.Align.f196b);
                    c1066a.f6830B.mo916a(Typeface.m5137a(Typeface.f246c, 1));
                    c1066a.f6830B.m5206b(c1066a.m813c("textColor", -1));
                    gameEngine.m1017b(c1066a.f6830B, c1066a.m825a("textSize", 20));
                    if (c1066a.f6830B.m5192f() == 0) {
                        c1066a.m808g("Text has an alpha of 0");
                    }
                    String m817b = c1066a.m817b("style");
                    if (m817b != null && !m817b.equals(VariableScope.nullOrMissingString)) {
                        if (m817b.equalsIgnoreCase("arrow")) {
                            c1066a.f6831C = true;
                        } else {
                            c1066a.m808g("Unknown style: " + m817b);
                        }
                    }
                }
                if (c1066a.f6815g == EnumC1073e.f6865e) {
                    try {
                        c1066a.f6824v = C0418bp.m3873a(c1066a.m817b("spawnUnits"), "<unitAdd>", "spawnUnits");
                        if (c1066a.m830a() == null) {
                            c1066a.m808g("No team set");
                        }
                    } catch (C0417bo e) {
                        C1085f.m776c(e.getMessage());
                        return null;
                    }
                }
                if (c1066a.f6815g == EnumC1073e.f6864d) {
                    c1066a.m827a("addTeamTags");
                    c1066a.m827a("removeTeamTags");
                }
                if (c1066a.f6815g == EnumC1073e.f6863c) {
                    c1066a.m827a("add");
                    c1066a.m827a("set");
                }
                if (c1066a.f6815g == EnumC1073e.f6869i) {
                    c1066a.m828a(C1069c.m802d(c1066a));
                }
                if (c1066a.f6815g == EnumC1073e.f6870j) {
                    c1066a.m828a(C1068b.m804d(c1066a));
                }
                c1066a.m827a("comment");
                c1066a.m827a("team");
                c1066a.m827a("globalMessage");
                c1066a.m827a("globalMessage_delayPerChar");
                c1066a.m827a("globalMessage_textColor");
                c1066a.m827a("debugMessage");
                c1066a.m827a("showOnMap");
                c1066a.m827a("text");
                c1066a.m827a("target");
                c1066a.m827a("onlyIfEmpty");
                if (c1066a.f6815g == EnumC1073e.f6862b) {
                    c1066a.m827a("unload");
                }
                if (c1066a.f6815g == EnumC1073e.f6866f) {
                    c1066a.m827a("onlyIfEmpty");
                }
                return c1066a;
            }
            C1085f.m776c("Error: no type field set for: " + trim);
            return null;
        } catch (RuntimeException e2) {
            throw new C0179f("Error while reading: " + c0172a.m4670b(), e2);
        }
    }
}