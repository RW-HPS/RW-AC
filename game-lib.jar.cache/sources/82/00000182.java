package com.corrodinggames.rts.game.maps;

import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.Log;
import com.corrodinggames.rts.game.PlayerData;
import com.corrodinggames.rts.game.units.ar;
import com.corrodinggames.rts.game.units.as;
import com.corrodinggames.rts.game.units.custom.j;
import com.corrodinggames.rts.game.units.custom.l;
import com.corrodinggames.rts.game.units.h.d;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.f;
import com.corrodinggames.rts.gameFramework.unitAction.y;
import com.corrodinggames.rts.gameFramework.utility.SlickToAndroidKeycodes;
import com.corrodinggames.rts.gameFramework.w;
import java.util.Properties;

/* renamed from: com.corrodinggames.rts.game.b.g */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/b/g.class */
public final class g {
    public TileSet a;
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
        return gVar != null && gVar2 != null && gVar.a == gVar2.a && gVar.b == gVar2.b;
    }

    /* renamed from: a */
    public g m0clone() {
        g gVar = new g();
        gVar.a = this.a;
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

    public static g a(b bVar, Layer layer, TileSet tileSet, int i, short s, short s2, boolean z) {
        String str;
        PlayerData playerData;
        Properties a = tileSet.a(tileSet.l + i);
        if (a != null) {
            String property = a.getProperty("showFog");
            if (property != null) {
                int parseInt = Integer.parseInt(property);
                GameEngine gameEngine = GameEngine.getGameEngine();
                bVar.a((int) s, (int) s2);
                gameEngine.bL.a(bVar.T + bVar.p, bVar.U + bVar.q, parseInt, gameEngine.playerTeam, false);
                return null;
            }
            String property2 = a.getProperty("unit");
            String property3 = a.getProperty("customUnit");
            if (property2 != null || property3 != null) {
                String property4 = a.getProperty("team");
                if ("none".equalsIgnoreCase(property4)) {
                    playerData = PlayerData.getPlayerData(-1);
                } else if (property4 == null) {
                    GameEngine.b("map", "warning: unit has no team property:" + property2 + " at: " + ((int) s) + "," + ((int) s2));
                    return null;
                } else {
                    playerData = PlayerData.getPlayerData(Integer.valueOf(property4).intValue());
                    if (playerData == null) {
                        GameEngine.b("map", "skipping unit without player:" + property2 + " at: " + ((int) s) + "," + ((int) s2) + " team:" + property4);
                        return null;
                    } else if (playerData.b()) {
                        GameEngine.b("map", "Unit team is marked as spectator:" + property2 + " (skipping unit)");
                        return null;
                    }
                }
                j jVar = null;
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
                    jVar = l.a(false, n2);
                    if (jVar == null) {
                        String str3 = "Metadata unit is null for:" + property3;
                        a(str3);
                        throw new f(str3);
                    }
                } else {
                    as a2 = ar.a(property2);
                    if (a2 != null) {
                        jVar = a2.a();
                    }
                    if (jVar == null && "scoutShip".equalsIgnoreCase(property2)) {
                        jVar = new d(false);
                    }
                    if (jVar == null) {
                        String str4 = "Could not find unit:" + property2 + " at: " + ((int) s) + "," + ((int) s2);
                        a(str4);
                        throw new f(str4);
                    }
                }
                bVar.a((int) s, (int) s2);
                jVar.eo = bVar.T + jVar.cZ();
                jVar.ep = bVar.U + jVar.da();
                if (playerData != null) {
                    jVar.b(playerData);
                    if (a.getProperty("type") != null) {
                        jVar.a_(a.getProperty("type"));
                    }
                    if (a.getProperty("randomRotate") != null) {
                        jVar.cg = f.a(jVar, -180, (int) SlickToAndroidKeycodes.AndroidCodes.KEYCODE_STB_INPUT);
                    }
                    jVar.bO = "builder".equalsIgnoreCase(property2) || "builder".equalsIgnoreCase(property3);
                    jVar.bP = "commandCenter".equalsIgnoreCase(property2) || "commandCenter".equalsIgnoreCase(property3);
                    jVar.bM = true;
                    jVar.n();
                    PlayerData.c(jVar);
                    w.dL();
                    return null;
                }
                throw new f("team has not been set for:" + property2);
            } else if (layer != null && layer.l.equals("units")) {
                Log.d("RustedWarfare", "non unit on units layer at:" + ((int) s) + "," + ((int) s2));
                return null;
            }
        }
        g gVar = new g();
        gVar.a = tileSet;
        tileSet.p = true;
        if (layer != null && !layer.r) {
            tileSet.r = true;
        }
        if (z) {
            tileSet.q = true;
        }
        gVar.b = i;
        if (a != null) {
            if (a.getProperty("water") != null) {
                gVar.e = true;
            }
            if (a.getProperty("water-bridge") != null) {
                gVar.f = true;
            }
            if (a.getProperty("lava") != null || a.getProperty("lava-cliff") != null) {
                gVar.g = true;
                if (a.getProperty("lava-cliff") != null) {
                    gVar.h = true;
                }
            }
            if (a.getProperty("cliff-soft") != null) {
                gVar.h = true;
            }
            if (a.getProperty("cliff") != null) {
                gVar.h = true;
            }
            if (a.getProperty("large-cliff") != null) {
                gVar.k = true;
            }
            if (a.getProperty("trees") != null) {
                gVar.k = true;
            }
            if (a.getProperty("res_pool") != null) {
                gVar.i = true;
            }
            if (a.getProperty("tree") != null) {
            }
            if (a.getProperty("small-rock") != null) {
                gVar.j = (byte) 40;
            }
            if (a.getProperty("large-rock") != null) {
                gVar.j = (byte) -1;
            }
            if (a.getProperty("block-land") != null) {
                gVar.j = (byte) -1;
            }
            if (a.getProperty("block-buildings") != null) {
                gVar.l = true;
            }
        }
        int i2 = 0;
        int i3 = 0;
        if (gVar.a != null && (str = gVar.a.c) != null) {
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
        if (a != null && a.getProperty("randomTileBy") != null) {
            try {
                i2 = Integer.parseInt(a.getProperty("randomTileBy"));
                if (a.getProperty("randomTileFixedOffset") != null) {
                    try {
                        i3 = Integer.parseInt(a.getProperty("randomTileFixedOffset"));
                    } catch (NumberFormatException e) {
                        throw new f("(x:" + ((int) s) + "y:" + ((int) s2) + ") - randomTileFixedOffset: Unexpected integer value:'" + a.getProperty("randomTileBy") + "'");
                    }
                }
            } catch (NumberFormatException e2) {
                throw new f("(x:" + ((int) s) + "y:" + ((int) s2) + ") - randomTileBy: Unexpected integer value:'" + a.getProperty("randomTileBy") + "'");
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
        TileSet tileSet = this.a;
        yVar.a(tileSet.b, tileSet.b(this.b), rectF, paint);
    }
}