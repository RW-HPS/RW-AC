package com.corrodinggames.rts.game.b;

import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.Log;
import com.corrodinggames.rts.game.PlayerData;
import com.corrodinggames.rts.game.units.ar;
import com.corrodinggames.rts.game.units.as;
import com.corrodinggames.rts.game.units.custom.l;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.m.y;
import com.corrodinggames.rts.gameFramework.utility.SlickToAndroidKeycodes;
import com.corrodinggames.rts.gameFramework.w;
import java.util.Properties;

/* loaded from: game-lib.jar:com/corrodinggames/rts/game/b/g.class */
public final class g {

    /* renamed from: a  reason: collision with root package name */
    public j f152a;
    public int b;
    public int c = -2;
    public short d = -1;
    public boolean e;
    public boolean f;
    public boolean g;
    public boolean h;
    public boolean i;
    public byte j;
    public boolean k;
    public boolean l;
    public g[] m;
    static final Rect n = new Rect();

    public static boolean a(g gVar, g gVar2) {
        if (gVar == gVar2) {
            return true;
        }
        return gVar != null && gVar2 != null && gVar.f152a == gVar2.f152a && gVar.b == gVar2.b;
    }

    /* renamed from: a */
    public g clone() {
        g gVar = new g();
        gVar.f152a = this.f152a;
        gVar.b = this.b;
        gVar.e = this.e;
        gVar.f = this.f;
        gVar.g = this.g;
        gVar.h = this.h;
        gVar.i = this.i;
        gVar.j = this.j;
        gVar.k = this.k;
        gVar.l = this.l;
        return gVar;
    }

    public static void a(String str) {
        GameEngine.print(str);
        GameEngine.getGameEngine().a("Missing unit data while loading map: " + str, 1);
        try {
            Thread.sleep(2L);
        } catch (InterruptedException e) {
        }
    }

    public static g a(b bVar, e eVar, j jVar, int i, short s, short s2, boolean z) {
        String str;
        PlayerData k;
        Properties a2 = jVar.a(jVar.l + i);
        if (a2 != null) {
            String property = a2.getProperty("showFog");
            if (property != null) {
                int parseInt = Integer.parseInt(property);
                GameEngine gameEngine = GameEngine.getGameEngine();
                bVar.a((int) s, (int) s2);
                gameEngine.bL.a(bVar.T + bVar.p, bVar.U + bVar.q, parseInt, gameEngine.bs, false);
                return null;
            }
            String property2 = a2.getProperty("unit");
            String property3 = a2.getProperty("customUnit");
            if (property2 != null || property3 != null) {
                String property4 = a2.getProperty("team");
                if ("none".equalsIgnoreCase(property4)) {
                    k = PlayerData.k(-1);
                } else if (property4 == null) {
                    GameEngine.b("map", "warning: unit has no team property:" + property2 + " at: " + ((int) s) + "," + ((int) s2));
                    return null;
                } else {
                    k = PlayerData.k(Integer.valueOf(property4).intValue());
                    if (k == null) {
                        GameEngine.b("map", "skipping unit without player:" + property2 + " at: " + ((int) s) + "," + ((int) s2) + " team:" + property4);
                        return null;
                    } else if (k.b()) {
                        GameEngine.b("map", "Unit team is marked as spectator:" + property2 + " (skipping unit)");
                        return null;
                    }
                }
                com.corrodinggames.rts.game.units.custom.j jVar2 = null;
                if (property3 != null) {
                    l n2 = l.n(property3);
                    if (n2 == null) {
                        String str2 = "Could not find custom unit of:" + property3 + " at x:" + ((int) s) + ", y:" + ((int) s2);
                        a(str2);
                        throw new f(str2);
                    }
                    as c = l.c(n2);
                    if (c != null) {
                        if (c instanceof l) {
                            n2 = (l) c;
                        } else {
                            GameEngine.print("replacement not a custom unit:" + c.i());
                        }
                    }
                    jVar2 = l.a(false, n2);
                    if (jVar2 == null) {
                        String str3 = "Metadata unit is null for:" + property3;
                        a(str3);
                        throw new f(str3);
                    }
                } else {
                    as a3 = ar.a(property2);
                    if (a3 != null) {
                        jVar2 = a3.a();
                    }
                    if (jVar2 == null && "scoutShip".equalsIgnoreCase(property2)) {
                        jVar2 = new com.corrodinggames.rts.game.units.h.d(false);
                    }
                    if (jVar2 == null) {
                        String str4 = "Could not find unit:" + property2 + " at: " + ((int) s) + "," + ((int) s2);
                        a(str4);
                        throw new f(str4);
                    }
                }
                bVar.a((int) s, (int) s2);
                jVar2.eo = bVar.T + jVar2.cZ();
                jVar2.ep = bVar.U + jVar2.da();
                if (k != null) {
                    jVar2.b(k);
                    if (a2.getProperty("type") != null) {
                        jVar2.a_(a2.getProperty("type"));
                    }
                    if (a2.getProperty("randomRotate") != null) {
                        jVar2.cg = com.corrodinggames.rts.gameFramework.f.a(jVar2, -180, (int) SlickToAndroidKeycodes.AndroidCodes.KEYCODE_STB_INPUT);
                    }
                    jVar2.bO = "builder".equalsIgnoreCase(property2) || "builder".equalsIgnoreCase(property3);
                    jVar2.bP = "commandCenter".equalsIgnoreCase(property2) || "commandCenter".equalsIgnoreCase(property3);
                    jVar2.bM = true;
                    jVar2.n();
                    PlayerData.c(jVar2);
                    w.dL();
                    return null;
                }
                throw new f("team has not been set for:" + property2);
            } else if (eVar != null && eVar.l.equals("units")) {
                Log.d("RustedWarfare", "non unit on units layer at:" + ((int) s) + "," + ((int) s2));
                return null;
            }
        }
        g gVar = new g();
        gVar.f152a = jVar;
        jVar.p = true;
        if (eVar != null && !eVar.r) {
            jVar.r = true;
        }
        if (z) {
            jVar.q = true;
        }
        gVar.b = i;
        if (a2 != null) {
            if (a2.getProperty("water") != null) {
                gVar.e = true;
            }
            if (a2.getProperty("water-bridge") != null) {
                gVar.f = true;
            }
            if (a2.getProperty("lava") != null || a2.getProperty("lava-cliff") != null) {
                gVar.g = true;
                if (a2.getProperty("lava-cliff") != null) {
                    gVar.h = true;
                }
            }
            if (a2.getProperty("cliff-soft") != null) {
                gVar.h = true;
            }
            if (a2.getProperty("cliff") != null) {
                gVar.h = true;
            }
            if (a2.getProperty("large-cliff") != null) {
                gVar.k = true;
            }
            if (a2.getProperty("trees") != null) {
                gVar.k = true;
            }
            if (a2.getProperty("res_pool") != null) {
                gVar.i = true;
            }
            if (a2.getProperty("tree") != null) {
            }
            if (a2.getProperty("small-rock") != null) {
                gVar.j = (byte) 40;
            }
            if (a2.getProperty("large-rock") != null) {
                gVar.j = (byte) -1;
            }
            if (a2.getProperty("block-land") != null) {
                gVar.j = (byte) -1;
            }
            if (a2.getProperty("block-buildings") != null) {
                gVar.l = true;
            }
        }
        int i2 = 0;
        int i3 = 0;
        if (gVar.f152a != null && (str = gVar.f152a.c) != null) {
            if (gVar.b == 0 && str.equals("shallowwater.png")) {
                i2 = 5;
            }
            if (gVar.b == 0 && str.equals("deepwater.png")) {
                i2 = 2;
            }
            if (gVar.b == 0 && str.equals("water.png")) {
                i2 = 2;
            }
            if (gVar.b == 0 && str.equals("longgrass.png")) {
                i2 = 3;
            }
            if (gVar.b == 0 && str.equals("mountain.png")) {
                i2 = 3;
            }
            if (gVar.b == 7 && str.equals("stone.png")) {
                i2 = 4;
                i3 = 23;
            }
            if (gVar.b != 0 || str.equals("lava.png")) {
            }
            if (gVar.b == 0 && str.equals("snow.png")) {
                i2 = 2;
            }
        }
        if (a2 != null && a2.getProperty("randomTileBy") != null) {
            try {
                i2 = Integer.parseInt(a2.getProperty("randomTileBy"));
                if (a2.getProperty("randomTileFixedOffset") != null) {
                    try {
                        i3 = Integer.parseInt(a2.getProperty("randomTileFixedOffset"));
                    } catch (NumberFormatException e) {
                        throw new f("(x:" + ((int) s) + "y:" + ((int) s2) + ") - randomTileFixedOffset: Unexpected integer value:'" + a2.getProperty("randomTileBy") + "'");
                    }
                }
            } catch (NumberFormatException e2) {
                throw new f("(x:" + ((int) s) + "y:" + ((int) s2) + ") - randomTileBy: Unexpected integer value:'" + a2.getProperty("randomTileBy") + "'");
            }
        }
        if (i2 > 0) {
            g[] gVarArr = new g[i2];
            for (int i4 = 0; i4 < i2; i4++) {
                gVarArr[i4] = gVar.clone();
                gVarArr[i4].b += i4 + 1 + i3;
            }
            gVar.m = gVarArr;
        }
        return gVar;
    }

    g() {
    }

    public void a(y yVar, RectF rectF, float f, Paint paint) {
        j jVar = this.f152a;
        yVar.a(jVar.b, jVar.b(this.b), rectF, paint);
    }
}