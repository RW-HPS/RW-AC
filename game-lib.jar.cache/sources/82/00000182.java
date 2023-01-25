package com.corrodinggames.rts.game.p012b;

import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.Log;
import com.corrodinggames.rts.game.PlayerData;
import com.corrodinggames.rts.game.units.EnumC0249ar;
import com.corrodinggames.rts.game.units.InterfaceC0303as;
import com.corrodinggames.rts.game.units.custom.C0456j;
import com.corrodinggames.rts.game.units.custom.C0458l;
import com.corrodinggames.rts.game.units.p029h.C0592d;
import com.corrodinggames.rts.gameFramework.AbstractC1155w;
import com.corrodinggames.rts.gameFramework.C0773f;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.unitAction.InterfaceC1063y;
import com.corrodinggames.rts.gameFramework.utility.SlickToAndroidKeycodes;
import java.util.Properties;

/* renamed from: com.corrodinggames.rts.game.b.g */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/b/g.class */
public final class C0180g {

    /* renamed from: a */
    public C0183j f915a;

    /* renamed from: b */
    public int f916b;

    /* renamed from: c */
    public int f917c = -2;

    /* renamed from: d */
    public short f918d = -1;

    /* renamed from: e */
    public boolean f919e;

    /* renamed from: f */
    public boolean f920f;

    /* renamed from: g */
    public boolean f921g;

    /* renamed from: h */
    public boolean f922h;

    /* renamed from: i */
    public boolean f923i;

    /* renamed from: j */
    public byte f924j;

    /* renamed from: k */
    public boolean f925k;

    /* renamed from: l */
    public boolean f926l;

    /* renamed from: m */
    public C0180g[] f927m;

    /* renamed from: n */
    static final Rect f928n = new Rect();

    /* renamed from: a */
    public static boolean m4562a(C0180g c0180g, C0180g c0180g2) {
        if (c0180g == c0180g2) {
            return true;
        }
        return c0180g != null && c0180g2 != null && c0180g.f915a == c0180g2.f915a && c0180g.f916b == c0180g2.f916b;
    }

    /* renamed from: a */
    public C0180g clone() {
        C0180g c0180g = new C0180g();
        c0180g.f915a = this.f915a;
        c0180g.f916b = this.f916b;
        c0180g.f919e = this.f919e;
        c0180g.f920f = this.f920f;
        c0180g.f921g = this.f921g;
        c0180g.f922h = this.f922h;
        c0180g.f923i = this.f923i;
        c0180g.f924j = this.f924j;
        c0180g.f925k = this.f925k;
        c0180g.f926l = this.f926l;
        return c0180g;
    }

    /* renamed from: a */
    public static void m4560a(String str) {
        GameEngine.print(str);
        GameEngine.getGameEngine().m1065a("Missing unit data while loading map: " + str, 1);
        try {
            Thread.sleep(2L);
        } catch (InterruptedException e) {
        }
    }

    /* renamed from: a */
    public static C0180g m4563a(C0173b c0173b, C0178e c0178e, C0183j c0183j, int i, short s, short s2, boolean z) {
        String str;
        PlayerData m4365k;
        Properties m4545a = c0183j.m4545a(c0183j.f960l + i);
        if (m4545a != null) {
            String property = m4545a.getProperty("showFog");
            if (property != null) {
                int parseInt = Integer.parseInt(property);
                GameEngine gameEngine = GameEngine.getGameEngine();
                c0173b.m4660a((int) s, (int) s2);
                gameEngine.f6323bL.m4663a(c0173b.f802T + c0173b.f788p, c0173b.f803U + c0173b.f789q, parseInt, gameEngine.f6312bs, false);
                return null;
            }
            String property2 = m4545a.getProperty("unit");
            String property3 = m4545a.getProperty("customUnit");
            if (property2 != null || property3 != null) {
                String property4 = m4545a.getProperty("team");
                if ("none".equalsIgnoreCase(property4)) {
                    m4365k = PlayerData.m4365k(-1);
                } else if (property4 == null) {
                    GameEngine.m1015b("map", "warning: unit has no team property:" + property2 + " at: " + ((int) s) + "," + ((int) s2));
                    return null;
                } else {
                    m4365k = PlayerData.m4365k(Integer.valueOf(property4).intValue());
                    if (m4365k == null) {
                        GameEngine.m1015b("map", "skipping unit without player:" + property2 + " at: " + ((int) s) + "," + ((int) s2) + " team:" + property4);
                        return null;
                    } else if (m4365k.m4422b()) {
                        GameEngine.m1015b("map", "Unit team is marked as spectator:" + property2 + " (skipping unit)");
                        return null;
                    }
                }
                C0456j c0456j = null;
                if (property3 != null) {
                    C0458l m3502n = C0458l.m3502n(property3);
                    if (m3502n == null) {
                        String str2 = "Could not find custom unit of:" + property3 + " at x:" + ((int) s) + ", y:" + ((int) s2);
                        m4560a(str2);
                        throw new C0179f(str2);
                    }
                    InterfaceC0303as m3527c = C0458l.m3527c(m3502n);
                    if (m3527c != null) {
                        if (m3527c instanceof C0458l) {
                            m3502n = (C0458l) m3527c;
                        } else {
                            GameEngine.print("replacement not a custom unit:" + m3527c.mo3513i());
                        }
                    }
                    c0456j = C0458l.m3536a(false, m3502n);
                    if (c0456j == null) {
                        String str3 = "Metadata unit is null for:" + property3;
                        m4560a(str3);
                        throw new C0179f(str3);
                    }
                } else {
                    InterfaceC0303as m4174a = EnumC0249ar.m4174a(property2);
                    if (m4174a != null) {
                        c0456j = m4174a.mo3564a();
                    }
                    if (c0456j == null && "scoutShip".equalsIgnoreCase(property2)) {
                        c0456j = new C0592d(false);
                    }
                    if (c0456j == null) {
                        String str4 = "Could not find unit:" + property2 + " at: " + ((int) s) + "," + ((int) s2);
                        m4560a(str4);
                        throw new C0179f(str4);
                    }
                }
                c0173b.m4660a((int) s, (int) s2);
                c0456j.f7172eo = c0173b.f802T + c0456j.mo3319cZ();
                c0456j.f7173ep = c0173b.f803U + c0456j.mo3318da();
                if (m4365k != null) {
                    c0456j.mo2928b(m4365k);
                    if (m4545a.getProperty("type") != null) {
                        c0456j.mo3450a_(m4545a.getProperty("type"));
                    }
                    if (m4545a.getProperty("randomRotate") != null) {
                        c0456j.f1623cg = C0773f.m2196a(c0456j, -180, (int) SlickToAndroidKeycodes.AndroidCodes.KEYCODE_STB_INPUT);
                    }
                    c0456j.f1605bO = "builder".equalsIgnoreCase(property2) || "builder".equalsIgnoreCase(property3);
                    c0456j.f1606bP = "commandCenter".equalsIgnoreCase(property2) || "commandCenter".equalsIgnoreCase(property3);
                    c0456j.f1603bM = true;
                    c0456j.mo3283n();
                    PlayerData.m4401c(c0456j);
                    AbstractC1155w.m435dL();
                    return null;
                }
                throw new C0179f("team has not been set for:" + property2);
            } else if (c0178e != null && c0178e.f903l.equals("units")) {
                Log.m5069d("RustedWarfare", "non unit on units layer at:" + ((int) s) + "," + ((int) s2));
                return null;
            }
        }
        C0180g c0180g = new C0180g();
        c0180g.f915a = c0183j;
        c0183j.f968p = true;
        if (c0178e != null && !c0178e.f909r) {
            c0183j.f970r = true;
        }
        if (z) {
            c0183j.f969q = true;
        }
        c0180g.f916b = i;
        if (m4545a != null) {
            if (m4545a.getProperty("water") != null) {
                c0180g.f919e = true;
            }
            if (m4545a.getProperty("water-bridge") != null) {
                c0180g.f920f = true;
            }
            if (m4545a.getProperty("lava") != null || m4545a.getProperty("lava-cliff") != null) {
                c0180g.f921g = true;
                if (m4545a.getProperty("lava-cliff") != null) {
                    c0180g.f922h = true;
                }
            }
            if (m4545a.getProperty("cliff-soft") != null) {
                c0180g.f922h = true;
            }
            if (m4545a.getProperty("cliff") != null) {
                c0180g.f922h = true;
            }
            if (m4545a.getProperty("large-cliff") != null) {
                c0180g.f925k = true;
            }
            if (m4545a.getProperty("trees") != null) {
                c0180g.f925k = true;
            }
            if (m4545a.getProperty("res_pool") != null) {
                c0180g.f923i = true;
            }
            if (m4545a.getProperty("tree") != null) {
            }
            if (m4545a.getProperty("small-rock") != null) {
                c0180g.f924j = (byte) 40;
            }
            if (m4545a.getProperty("large-rock") != null) {
                c0180g.f924j = (byte) -1;
            }
            if (m4545a.getProperty("block-land") != null) {
                c0180g.f924j = (byte) -1;
            }
            if (m4545a.getProperty("block-buildings") != null) {
                c0180g.f926l = true;
            }
        }
        int i2 = 0;
        int i3 = 0;
        if (c0180g.f915a != null && (str = c0180g.f915a.f953c) != null) {
            if (c0180g.f916b == 0 && str.equals("shallowwater.png")) {
                i2 = 5;
            }
            if (c0180g.f916b == 0 && str.equals("deepwater.png")) {
                i2 = 2;
            }
            if (c0180g.f916b == 0 && str.equals("water.png")) {
                i2 = 2;
            }
            if (c0180g.f916b == 0 && str.equals("longgrass.png")) {
                i2 = 3;
            }
            if (c0180g.f916b == 0 && str.equals("mountain.png")) {
                i2 = 3;
            }
            if (c0180g.f916b == 7 && str.equals("stone.png")) {
                i2 = 4;
                i3 = 23;
            }
            if (c0180g.f916b != 0 || str.equals("lava.png")) {
            }
            if (c0180g.f916b == 0 && str.equals("snow.png")) {
                i2 = 2;
            }
        }
        if (m4545a != null && m4545a.getProperty("randomTileBy") != null) {
            try {
                i2 = Integer.parseInt(m4545a.getProperty("randomTileBy"));
                if (m4545a.getProperty("randomTileFixedOffset") != null) {
                    try {
                        i3 = Integer.parseInt(m4545a.getProperty("randomTileFixedOffset"));
                    } catch (NumberFormatException e) {
                        throw new C0179f("(x:" + ((int) s) + "y:" + ((int) s2) + ") - randomTileFixedOffset: Unexpected integer value:'" + m4545a.getProperty("randomTileBy") + "'");
                    }
                }
            } catch (NumberFormatException e2) {
                throw new C0179f("(x:" + ((int) s) + "y:" + ((int) s2) + ") - randomTileBy: Unexpected integer value:'" + m4545a.getProperty("randomTileBy") + "'");
            }
        }
        if (i2 > 0) {
            C0180g[] c0180gArr = new C0180g[i2];
            for (int i4 = 0; i4 < i2; i4++) {
                c0180gArr[i4] = c0180g.m4564a();
                c0180gArr[i4].f916b += i4 + 1 + i3;
            }
            c0180g.f927m = c0180gArr;
        }
        return c0180g;
    }

    C0180g() {
    }

    /* renamed from: a */
    public void m4561a(InterfaceC1063y interfaceC1063y, RectF rectF, float f, Paint paint) {
        C0183j c0183j = this.f915a;
        interfaceC1063y.mo193a(c0183j.f952b, c0183j.m4536b(this.f916b), rectF, paint);
    }
}