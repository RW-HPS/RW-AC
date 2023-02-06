package com.corrodinggames.rts.gameFramework.status;

import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.Typeface;
import com.corrodinggames.rts.game.PlayerData;
import com.corrodinggames.rts.game.maps.ObjectGroup;
import com.corrodinggames.rts.game.maps.a;
import com.corrodinggames.rts.game.units.al;
import com.corrodinggames.rts.game.units.am;
import com.corrodinggames.rts.game.units.ar;
import com.corrodinggames.rts.game.units.as;
import com.corrodinggames.rts.game.units.custom.bb;
import com.corrodinggames.rts.game.units.custom.l;
import com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope;
import com.corrodinggames.rts.game.units.d.a.b;
import com.corrodinggames.rts.game.units.d.e;
import com.corrodinggames.rts.game.units.y;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.bq;
import com.corrodinggames.rts.gameFramework.emitter.c;
import com.corrodinggames.rts.gameFramework.emitter.g;
import com.corrodinggames.rts.gameFramework.net.GameInputStream;
import com.corrodinggames.rts.gameFramework.net.GameNetEngine;
import com.corrodinggames.rts.gameFramework.net.GameOutputStream;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: com.corrodinggames.rts.gameFramework.n.f */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/n/f.class */
public class f extends bq {
    public static boolean a = false;
    int b;
    int c;
    PlayerData d;
    l e;
    public bb h;
    boolean i;
    boolean j;
    public boolean k;
    public boolean l;
    boolean m;
    boolean n;
    boolean o;
    boolean p;
    public boolean q;
    public Paint E;
    public Paint F;
    public Paint G;
    public Paint H;
    public boolean N;
    l f = l.allUnitsAndBuildings;
    public ArrayList g = new ArrayList();
    public int r = 0;
    String s = null;
    String t = null;
    int u = 0;
    int v = 2;
    int w = 1;
    int x = 0;
    public int y = 0;
    float z = 3000.0f;
    float A = 0.0f;
    float B = 0.0f;
    h C = h.normal;
    ArrayList D = new ArrayList();
    final boolean I = true;
    public ArrayList J = new ArrayList();
    PointF K = new PointF();
    int L = 0;
    float M = 0.0f;
    public ArrayList O = new ArrayList();
    PointF P = new PointF();
    boolean Q = false;
    boolean R = false;
    ArrayList S = new ArrayList();
    ArrayList T = new ArrayList();

    public void a(String str) {
        GameEngine.b("MissionEngine", "Map warning: " + str);
        GameNetEngine.a((String) null, "Map error: " + str);
    }

    @Override // com.corrodinggames.rts.gameFramework.bq
    public void a(GameOutputStream gameOutputStream) {
        gameOutputStream.writeBoolean(this.j);
        gameOutputStream.writeInt(this.r);
        gameOutputStream.writeInt(this.u);
        gameOutputStream.writeInt(this.v);
        gameOutputStream.writeInt(this.w);
        gameOutputStream.writeInt(this.x);
        gameOutputStream.writeFloat(this.z);
        gameOutputStream.writeFloat(this.A);
        gameOutputStream.writeFloat(this.B);
        gameOutputStream.writeBoolean(this.m);
        gameOutputStream.writeInt(6);
        gameOutputStream.writeInt(this.J.size());
        Iterator it = this.J.iterator();
        while (it.hasNext()) {
            a aVar = (a) it.next();
            gameOutputStream.writeString(aVar.c);
            gameOutputStream.writeBoolean(aVar.j);
            gameOutputStream.writeInt(aVar.k);
            gameOutputStream.writeInt(aVar.l);
            gameOutputStream.writeBoolean(aVar.m);
            gameOutputStream.writeInt(aVar.n);
        }
        gameOutputStream.writeInt(this.y);
        gameOutputStream.writeBoolean(this.l);
    }

    public void a(GameInputStream gameInputStream) {
        this.j = gameInputStream.readBoolean();
        this.r = gameInputStream.readInt();
        this.u = gameInputStream.readInt();
        this.v = gameInputStream.readInt();
        this.w = gameInputStream.readInt();
        this.x = gameInputStream.readInt();
        this.z = gameInputStream.readFloat();
        this.A = gameInputStream.readFloat();
        this.B = gameInputStream.readFloat();
        this.m = gameInputStream.readBoolean();
        int readInt = gameInputStream.readInt();
        if (readInt >= 1) {
            int readInt2 = gameInputStream.readInt();
            for (int i = 0; i < readInt2; i++) {
                String readString = gameInputStream.readString();
                boolean readBoolean = gameInputStream.readBoolean();
                int i2 = 0;
                int i3 = 0;
                boolean z = false;
                int i4 = 0;
                if (readInt >= 2) {
                    i2 = gameInputStream.readInt();
                    i3 = gameInputStream.readInt();
                }
                if (readInt >= 3) {
                    z = gameInputStream.readBoolean();
                }
                if (readInt >= 4) {
                    i4 = gameInputStream.readInt();
                }
                a e = e(readString);
                if (e == null) {
                    GameEngine.print("MissionEngine:readIn: Could not find saved trigger:" + readString + " for de/activation");
                } else {
                    e.j = readBoolean;
                    e.k = i2;
                    e.l = i3;
                    e.m = z;
                    e.n = i4;
                }
            }
        }
        if (readInt >= 5) {
            this.y = gameInputStream.readInt();
        }
        if (readInt >= 6) {
            this.l = gameInputStream.readBoolean();
        } else {
            this.l = true;
        }
    }

    public void b(String str) {
        GameEngine.b("MissionEngine:triggerLog", str);
    }

    public boolean a() {
        return this.n;
    }

    public boolean b() {
        return this.o;
    }

    public void a(boolean z) {
        String[] a2;
        String[] split;
        String[] split2;
        Integer c;
        Integer c2;
        GameEngine gameEngine = GameEngine.getGameEngine();
        this.q = false;
        this.b = gameEngine.by - 1000;
        this.c = gameEngine.by - 1000;
        this.E = new Paint();
        this.E.a(255, 255, 255, 255);
        this.E.a(true);
        this.E.a(Paint.Align.CENTER);
        this.E.a(Typeface.a(Typeface.c, 1));
        gameEngine.a(this.E, 24.0f);
        this.G = new Paint();
        this.G.a(255, 255, 255, 255);
        this.G.a(true);
        this.G.a(Paint.Align.CENTER);
        gameEngine.a(this.G, 18.0f);
        this.H = new Paint();
        this.H.a(255, 255, 255, 255);
        this.H.a(true);
        this.H.a(Paint.Align.CENTER);
        gameEngine.a(this.H, 14.0f);
        this.F = new Paint();
        this.F.a(this.H);
        gameEngine.a(this.F, 18.0f);
        this.j = true;
        boolean z2 = false;
        a aVar = null;
        if (gameEngine.bL.Q == null) {
            GameEngine.b("MissionEngine", "Error: 'triggers' object layer is missing from this map");
            z2 = true;
        } else {
            aVar = gameEngine.bL.Q.a("map_info");
        }
        if (aVar == null) {
            GameEngine.b("MissionEngine", "Error: map_info is missing from this map");
            z2 = true;
        }
        if (aVar != null && aVar.b("type") == null) {
            a("type is missing from map_info");
            z2 = true;
        }
        if (z2) {
            GameEngine.b("MissionEngine", "Defaulting to skirmish");
            this.n = true;
            this.e = l.noConstructionOrTech;
            return;
        }
        this.k = "survival".equalsIgnoreCase(aVar.b("type"));
        if (this.k) {
            this.l = "true".equalsIgnoreCase(aVar.b("survivalWavesClassic"));
            if (this.l) {
                GameEngine.m5e("Classic survial waves selected");
            }
            f();
            this.p = false;
            this.y = gameEngine.settingsEngine.aiDifficulty;
            if (!this.l) {
                this.z = 1200.0f;
                if (this.y < 0) {
                    this.z = 3000.0f;
                }
            } else {
                this.z = 3000.0f;
            }
        }
        String b = aVar.b("survivalWaves");
        if (b != null) {
            g(b);
        }
        String b2 = aVar.b("startWithMusic");
        if (b2 != null) {
            gameEngine.bN.a(b2);
        }
        this.n = "skirmish".equalsIgnoreCase(aVar.b("type"));
        if (this.n) {
            this.e = l.noConstructionOrTech;
        }
        this.o = "true".equalsIgnoreCase(aVar.b("shareFogWithAllies"));
        String b3 = aVar.b("winCondition");
        if (b3 == null && !this.n) {
            throw new com.corrodinggames.rts.game.maps.f("win condition not set");
        }
        if (b3 != null) {
            if (b3.equalsIgnoreCase("none")) {
                this.e = l.none;
            } else if (b3.equalsIgnoreCase("allUnitsAndBuildings")) {
                this.e = l.allUnitsAndBuildings;
            } else if (b3.equalsIgnoreCase("allBuildings")) {
                this.e = l.allBuildings;
            } else if (b3.equalsIgnoreCase("mainBuilings")) {
                this.e = l.mainBuildings;
            } else if (b3.equalsIgnoreCase("mainBuildings")) {
                this.e = l.mainBuildings;
            } else if (b3.equalsIgnoreCase("commandCenter")) {
                this.e = l.commandCenter;
            } else if (b3.equalsIgnoreCase("requiredObjectives")) {
                this.e = l.requiredObjectives;
            } else {
                throw new com.corrodinggames.rts.game.maps.f("unknown win condition:" + b3);
            }
        }
        if (this.n) {
            this.f = this.e;
        }
        this.h = aVar.a("introText", (bb) null);
        if (this.h != null) {
            this.h.a("\\\\n", "\n");
            if (this.h.a()) {
                this.h = null;
            }
        }
        if (!gameEngine.ay() && !this.n) {
            this.d = PlayerData.getPlayerData(3);
            if (this.d != null) {
                this.d.team = 0;
            }
        }
        if (gameEngine.ay()) {
        }
        Iterator it = gameEngine.bL.Q.c.iterator();
        while (it.hasNext()) {
            a aVar2 = (a) it.next();
            if ("team_info".equalsIgnoreCase(aVar2.d)) {
                int parseInt = Integer.parseInt(aVar2.a("team", "-2"));
                if (parseInt == -2) {
                    throw new RuntimeException("cannot find team for:" + aVar2.b);
                }
                PlayerData playerData = PlayerData.getPlayerData(parseInt);
                if (playerData == null) {
                    GameEngine.print("No team loaded for:" + parseInt + " skipping");
                } else {
                    if (aVar2.c("credits") != null) {
                        playerData.credits = c2.intValue();
                    }
                    if (aVar2.b("basicAI") != null && gameEngine.P() && (playerData instanceof com.corrodinggames.rts.game.a.a)) {
                        GameEngine.print("Using basic AI:" + parseInt + " by map request");
                        ((com.corrodinggames.rts.game.a.a) playerData).aY = true;
                    }
                    String b4 = aVar2.b("lockAiDifficulty");
                    if (b4 != null && (playerData instanceof com.corrodinggames.rts.game.a.a)) {
                        GameEngine.print("Locking lockAiDifficulty:" + parseInt + " by map request to: " + b4);
                        com.corrodinggames.rts.game.a.a aVar3 = (com.corrodinggames.rts.game.a.a) playerData;
                        aVar3.x = Integer.parseInt(b4);
                        aVar3.y = true;
                        gameEngine.netEngine.aq();
                    }
                    if (aVar2.b("disabledAI") != null && gameEngine.P() && (playerData instanceof com.corrodinggames.rts.game.a.a)) {
                        GameEngine.print("Disabling AI:" + parseInt + " by map request");
                        ((com.corrodinggames.rts.game.a.a) playerData).aX = true;
                    }
                    String b5 = aVar2.b("allyGroup");
                    if (b5 != null && gameEngine.P()) {
                        playerData.team = Integer.parseInt(b5);
                    }
                    String b6 = aVar2.b("ai");
                    if (b6 != null) {
                        playerData.U = b6.equalsIgnoreCase("survival");
                    }
                }
            }
            if ("camera_start".equalsIgnoreCase(aVar2.b) && !z) {
                gameEngine.b(aVar2.e, aVar2.f);
                this.q = true;
                if (aVar2.c("zoomTo") != null) {
                    gameEngine.cV = c.intValue();
                }
            }
            if ("attack_point".equalsIgnoreCase(aVar2.b)) {
                this.D.add(new PointF(aVar2.e, aVar2.f));
            }
            if ("rotate".equalsIgnoreCase(aVar2.d)) {
                float parseFloat = Float.parseFloat(aVar2.b("dir"));
                Iterator it2 = am.bE.iterator();
                while (it2.hasNext()) {
                    am amVar = (am) it2.next();
                    if ((amVar instanceof y) && !amVar.bI() && aVar2.a(amVar)) {
                        amVar.cg = parseFloat;
                    }
                }
            }
            if ("fall".equalsIgnoreCase(aVar2.d)) {
                Iterator it3 = am.bE.iterator();
                while (it3.hasNext()) {
                    am amVar2 = (am) it3.next();
                    if ((amVar2 instanceof y) && !amVar2.bI() && aVar2.a(amVar2)) {
                        amVar2.dc();
                    }
                }
            }
            if ("set_team".equalsIgnoreCase(aVar2.d)) {
                int parseInt2 = Integer.parseInt(aVar2.b("team"));
                Iterator it4 = am.bE.iterator();
                while (it4.hasNext()) {
                    am amVar3 = (am) it4.next();
                    if ((amVar3 instanceof y) && aVar2.a(amVar3)) {
                        amVar3.P(parseInt2);
                    }
                }
            }
            if ("ai_allow_full_use".equalsIgnoreCase(aVar2.d)) {
                Iterator it5 = am.bE.iterator();
                while (it5.hasNext()) {
                    am amVar4 = (am) it5.next();
                    if ((amVar4 instanceof y) && aVar2.a(amVar4)) {
                        ((y) amVar4).bM = false;
                    }
                }
            }
            if ("disable_unit_ai".equalsIgnoreCase(aVar2.d)) {
                Iterator it6 = am.bE.iterator();
                while (it6.hasNext()) {
                    am amVar5 = (am) it6.next();
                    if ((amVar5 instanceof y) && aVar2.a(amVar5)) {
                        amVar5.bN = true;
                    }
                }
            }
        }
        Iterator it7 = am.bE.iterator();
        while (it7.hasNext()) {
            am amVar6 = (am) it7.next();
            if (!amVar6.u() && !(amVar6 instanceof al) && !amVar6.bI() && amVar6.cN == null && amVar6.cO == null) {
                am amVar7 = null;
                float f = 4900.0f;
                Iterator it8 = am.bE.iterator();
                while (it8.hasNext()) {
                    am amVar8 = (am) it8.next();
                    if (amVar8.cr() && amVar6 != amVar8 && (amVar6.bX == PlayerData.i || amVar8.bX.d(amVar6.bX))) {
                        float a3 = com.corrodinggames.rts.gameFramework.f.a(amVar8.eo, amVar8.ep, amVar6.eo, amVar6.ep);
                        if (a3 < f && amVar8.d(amVar6, true)) {
                            amVar7 = amVar8;
                            f = a3;
                        }
                    }
                }
                if (amVar7 != null) {
                    amVar7.e(amVar6, true);
                }
            }
        }
        this.J.clear();
        Iterator it9 = gameEngine.bL.Q.c.iterator();
        while (it9.hasNext()) {
            a aVar4 = (a) it9.next();
            if (!"team_info".equalsIgnoreCase(aVar4.d) && !"point".equalsIgnoreCase(aVar4.d) && !"camera_pan".equalsIgnoreCase(aVar4.d) && !"camera_start".equalsIgnoreCase(aVar4.b) && !"map_info".equalsIgnoreCase(aVar4.b) && !"attack_point".equalsIgnoreCase(aVar4.b) && !"rotate".equalsIgnoreCase(aVar4.d) && !"fall".equalsIgnoreCase(aVar4.d) && !"set_team".equalsIgnoreCase(aVar4.d) && !"ai_allow_full_use".equalsIgnoreCase(aVar4.d) && !"disable_unit_ai".equalsIgnoreCase(aVar4.d) && !"info".equalsIgnoreCase(aVar4.d)) {
                if (aVar4.n == null) {
                    c("Error: Skipping trigger:" + aVar4.b + " - no properties found");
                } else {
                    a a4 = c.a(this, aVar4);
                    if (a4 != null) {
                        this.J.add(a4);
                    }
                }
            }
        }
        Iterator it10 = this.J.iterator();
        while (it10.hasNext()) {
            a aVar5 = (a) it10.next();
            String b7 = aVar5.b("activateIds");
            if (b7 == null) {
                b7 = aVar5.b("alsoActivate");
            }
            if (b7 != null) {
                for (String str : b7.split(",")) {
                    a d = d(str);
                    if (d == null) {
                        aVar5.g("linkedTo target not found: " + b7);
                        GameEngine.m5e("Possible IDs:");
                        Iterator it11 = this.J.iterator();
                        while (it11.hasNext()) {
                            a aVar6 = (a) it11.next();
                            if (aVar6.b != null) {
                                GameEngine.m5e(aVar6.b);
                            }
                        }
                        GameEngine.m5e("--------");
                    } else {
                        d.d.a(aVar5);
                    }
                }
            }
            String b8 = aVar5.b("whenActivatedIds");
            if (b8 == null) {
                b8 = aVar5.b("activatedBy");
            }
            if (b8 != null) {
                for (String str2 : b8.split(",")) {
                    a d2 = d(str2);
                    if (d2 == null) {
                        aVar5.g("linkedFrom target not found: " + str2);
                    } else {
                        aVar5.d.a(d2);
                    }
                }
            }
            String b9 = aVar5.b("deactivatedBy");
            if (b9 != null) {
                for (String str3 : b9.split(",")) {
                    a d3 = d(str3);
                    if (d3 == null) {
                        aVar5.g("deactivatedBy: target not found: " + str3);
                    } else {
                        aVar5.e.a(d3);
                    }
                }
            }
        }
        GameEngine.m5e("Found " + this.J.size() + " map triggers");
        Iterator it12 = this.J.iterator();
        while (it12.hasNext()) {
            a aVar7 = (a) it12.next();
            int length = aVar7.t.a().length;
            for (int i = 0; i < length; i++) {
                aVar7.g("Key was not used: " + a2[i]);
            }
        }
        c();
    }

    public void c() {
        Iterator it = this.J.iterator();
        while (it.hasNext()) {
            a aVar = (a) it.next();
            if (aVar.g == e.objective) {
                boolean z = false;
                Iterator it2 = this.g.iterator();
                while (it2.hasNext()) {
                    if (((m) it2.next()).a == aVar) {
                        z = true;
                    }
                }
                if (!z) {
                    m mVar = new m();
                    mVar.a = aVar;
                    this.g.add(mVar);
                    GameEngine.m5e("Found objective: " + mVar.a());
                }
            }
        }
    }

    public static void c(String str) {
        GameEngine.getGameEngine();
        GameEngine.b("MissionEngine", str);
        GameNetEngine.g(str);
    }

    public a d(String str) {
        String trim = str.trim();
        Iterator it = this.J.iterator();
        while (it.hasNext()) {
            a aVar = (a) it.next();
            if (aVar.b != null && aVar.b.equalsIgnoreCase(trim)) {
                return aVar;
            }
        }
        return null;
    }

    public a e(String str) {
        String trim = str.trim();
        Iterator it = this.J.iterator();
        while (it.hasNext()) {
            a aVar = (a) it.next();
            if (aVar.c.equalsIgnoreCase(trim)) {
                return aVar;
            }
        }
        return null;
    }

    public PointF f(String str) {
        ObjectGroup objectGroup = GameEngine.getGameEngine().bL.Q;
        if (objectGroup != null) {
            Iterator it = objectGroup.c.iterator();
            while (it.hasNext()) {
                a aVar = (a) it.next();
                if ("point".equalsIgnoreCase(aVar.d) && aVar.c != null && aVar.c.equalsIgnoreCase(str)) {
                    this.K.setSite(aVar.e, aVar.f);
                    return this.K;
                }
            }
            return null;
        }
        return null;
    }

    public void a(float f) {
        GameEngine.getGameEngine();
    }

    public void b(float f) {
        g d;
        i c;
        String b;
        g gVar;
        GameEngine gameEngine = GameEngine.getGameEngine();
        if (this.i) {
            Iterator it = this.J.iterator();
            while (it.hasNext()) {
                a aVar = (a) it.next();
                if (aVar.g == e.mapText && aVar.j) {
                    float b2 = aVar.b() - gameEngine.cw;
                    float c2 = aVar.c() - gameEngine.cx;
                    float f2 = b2 * gameEngine.cX;
                    float f3 = c2 * gameEngine.cX;
                    float f4 = f2 + aVar.w;
                    float f5 = f3 + aVar.x;
                    if (aVar.C) {
                        c.s[9].a(2, f4, f5, aVar.B);
                        f5 -= gVar.c - 2;
                    }
                    if (aVar.z != null && (b = aVar.z.b()) != null && !b.equals(VariableScope.nullOrMissingString)) {
                        gameEngine.bO.a(b, f4, f5, aVar.B);
                    }
                }
            }
        }
        if (this.k && !this.N) {
            boolean z = false;
            this.B = com.corrodinggames.rts.gameFramework.f.a(this.B, f);
            if (this.B == 0.0f && this.A != 0.0f) {
                this.A = com.corrodinggames.rts.gameFramework.f.a(this.A, f);
                z = true;
            }
            if (1 != 0) {
                if (z) {
                    int k = (int) (23.0f + (this.E.k() / 2.0f));
                    gameEngine.bO.a("- Wave " + this.r + " -", gameEngine.cF / 2.0f, k, this.E);
                    if (this.s != null) {
                        gameEngine.bO.a(this.s, gameEngine.cF / 2.0f, k + this.E.k() + 2.0f, this.F);
                    }
                } else {
                    int k2 = (int) (23.0f + (this.G.k() / 2.0f));
                    String str = "Wave " + (this.r + 1) + " in " + com.corrodinggames.rts.gameFramework.f.f(String.valueOf((int) (this.z / 60.0d)), 3);
                    if (this.m) {
                        str = "Defeat - Wave " + this.r;
                    }
                    gameEngine.bO.a(str, gameEngine.cF / 2.0f, k2, this.G);
                    if (this.t == null) {
                        if (!this.l) {
                            c = b(false);
                        } else {
                            c = c(false);
                        }
                        this.t = c.toString();
                    }
                    gameEngine.bO.a(this.t, gameEngine.cF / 2.0f, k2 + this.G.k() + 2.0f, this.H);
                }
            }
        }
        if (this.k && this.N && (d = d()) != null) {
            int i = d.e - (gameEngine.by / 1000);
            int k3 = (int) (23.0f + (this.G.k() / 2.0f));
            String str2 = "Wave " + (this.r + 1) + " in " + com.corrodinggames.rts.gameFramework.f.f(String.valueOf(i), 3);
            if (this.m) {
                str2 = "Defeat - Wave " + this.r;
            }
            gameEngine.bO.a(str2, gameEngine.cF / 2.0f, k3, this.G);
            String str3 = d.f;
            if (str3 != null) {
                gameEngine.bO.a(str3, gameEngine.cF / 2.0f, k3 + this.G.k() + 2.0f, this.H);
            }
        }
    }

    public void g(String str) {
        String[] split;
        GameEngine.m5e("Loading survival waves");
        this.N = true;
        int i = 0;
        int i2 = 0;
        for (String str2 : str.split("\n")) {
            i2++;
            g gVar = new g(this);
            if (gVar.a(str2)) {
                gVar.e = i + ((int) gVar.d);
                i = gVar.e;
                GameEngine.m5e("Adding wave " + i2 + " at " + gVar.e);
                this.O.add(gVar);
            }
        }
    }

    public g d() {
        if (this.r < this.O.size()) {
            return (g) this.O.get(this.r);
        }
        return null;
    }

    public void e() {
        this.R = true;
        this.P.setSite((PointF) this.D.get(com.corrodinggames.rts.gameFramework.f.a(0, this.D.size() - 1, this.r)));
    }

    public void f() {
        this.S.clear();
        a(this.S, "scout", 0.7f);
        a(this.S, ar.tank, 2.1f);
        a(this.S, "mechGun", 1.0f);
        a(this.S, "lightGunship", 2.8f);
        a(this.S, ar.hoverTank, 1.9f);
        a(this.S, ar.helicopter, 0.8f);
        a(this.S, ar.heavyTank, 1.0f);
        a(this.S, ar.heavyHoverTank, 0.8f);
        a(this.S, ar.gunShip, 0.7f);
        a(this.S, "plasmaTank", 0.6f);
        a(this.S, "missileAirship", 0.4f);
        this.T.clear();
        a(this.T, ar.experimentalTank, 1.0f);
        a(this.T, ar.experimentalHoverTank, 0.5f);
    }

    public void a(ArrayList arrayList, String str, float f) {
        a(arrayList, l.s(str), f);
    }

    public void a(ArrayList arrayList, as asVar, float f) {
        if (asVar == null) {
            asVar = ar.tank;
        }
        as c = l.c(asVar);
        if (c != null) {
            asVar = c;
        }
        k kVar = new k(this);
        kVar.a = asVar;
        kVar.b = f;
        arrayList.add(kVar);
    }

    public void a(i iVar, int i, float f) {
        if (i < 0) {
            i = 0;
        }
        int size = this.S.size();
        if (size == 0) {
            GameEngine.print("error maxTypeNum: " + size);
            return;
        }
        k kVar = (k) this.S.get(i % size);
        int e = (int) com.corrodinggames.rts.gameFramework.f.e((int) ((i + 3) * 0.5d * kVar.b * f), 0.8f);
        if (e < 1) {
            e = 1;
        }
        iVar.b(kVar.a, e);
    }

    public i b(boolean z) {
        i iVar = new i(this);
        boolean z2 = false;
        if (this.u > 50 && (this.u + 1) % 100 == 0) {
            int size = this.T.size();
            int i = this.u / 100;
            if (size == 0) {
                GameEngine.print("error maxTypeNum: " + size);
            } else {
                k kVar = (k) this.T.get(i % size);
                int i2 = (int) (i * kVar.b);
                if (i2 < 1) {
                    i2 = 1;
                }
                iVar.b(kVar.a, i2);
            }
            z2 = true;
        }
        int i3 = 0;
        if (this.y > 0) {
            i3 = this.y;
        }
        a(iVar, this.u + i3, 1.0f);
        if (this.u > 15 && !z2) {
            a(iVar, ((int) ((this.u + i3) * 1.1f)) - 11, 0.5f);
        }
        if (z) {
            this.u++;
            this.v++;
        }
        return iVar;
    }

    public i c(boolean z) {
        i iVar = new i(this);
        iVar.a = false;
        int i = this.v;
        ar arVar = null;
        if (this.p) {
            arVar = ar.ladybug;
        } else {
            if (this.u == 0) {
                i++;
                arVar = ar.tank;
            }
            if (this.u == 1) {
                arVar = ar.hoverTank;
            }
            if (this.u == 2) {
                arVar = ar.helicopter;
            }
            if (this.u == 3) {
                i = this.w;
                arVar = ar.heavyTank;
            }
            if (this.u == 4) {
                i = this.w;
                arVar = ar.heavyHoverTank;
                if (this.w % 2 == 0) {
                    arVar = ar.gunShip;
                }
            }
            if (this.u == 5) {
                iVar.a = true;
                i = 1;
                arVar = ar.experimentalTank;
            }
            if (z) {
                this.u++;
                boolean z2 = false;
                if (this.w == 1) {
                    if (this.u > 2) {
                        z2 = true;
                    }
                } else if (this.w < 5) {
                    if (this.u > 4) {
                        z2 = true;
                    }
                } else {
                    if (this.u > 5) {
                        z2 = true;
                    }
                    if (this.u > 4 && this.w % 2 == 0) {
                        z2 = true;
                    }
                }
                if (z2) {
                    this.u = 0;
                    this.v += 2;
                    this.w++;
                }
            }
        }
        iVar.a(arVar, i);
        return iVar;
    }

    public void c(float f) {
        i c;
        GameEngine gameEngine = GameEngine.getGameEngine();
        int i = gameEngine.by;
        this.M = com.corrodinggames.rts.gameFramework.f.a(this.M, f);
        if (gameEngine.aq && gameEngine.bH) {
            a aVar = null;
            if (gameEngine.bL.Q != null) {
                Iterator it = gameEngine.bL.Q.c.iterator();
                while (it.hasNext()) {
                    a aVar2 = (a) it.next();
                    if ("camera_pan".equalsIgnoreCase(aVar2.d) && this.L == Integer.parseInt(aVar2.a("index", "-1"))) {
                        aVar = aVar2;
                    }
                }
            }
            if (aVar == null) {
                this.L = 0;
            } else {
                float f2 = aVar.e;
                float f3 = aVar.f;
                if (f2 < gameEngine.cI + 2.0f) {
                    f2 = gameEngine.cI + 2.0f;
                }
                if (f3 < gameEngine.cJ + 2.0f) {
                    f3 = gameEngine.cJ + 2.0f;
                }
                if (f2 > (gameEngine.bL.i() - gameEngine.cI) - 2.0f) {
                    f2 = (gameEngine.bL.i() - gameEngine.cI) - 2.0f;
                }
                if (f3 > (gameEngine.bL.j() - gameEngine.cJ) - 2.0f) {
                    f3 = (gameEngine.bL.j() - gameEngine.cJ) - 2.0f;
                }
                float d = com.corrodinggames.rts.gameFramework.f.d(gameEngine.cy + gameEngine.cI, gameEngine.cz + gameEngine.cJ, f2, f3);
                float a2 = com.corrodinggames.rts.gameFramework.f.a(gameEngine.cy + gameEngine.cI, gameEngine.cz + gameEngine.cJ, f2, f3);
                if (this.M == 0.0f && (a2 < 225.0f || gameEngine.ct)) {
                    this.L++;
                    this.M = 50.0f;
                }
                float f4 = 0.45f * f;
                gameEngine.cy += com.corrodinggames.rts.gameFramework.f.k(d) * f4;
                gameEngine.cz += com.corrodinggames.rts.gameFramework.f.j(d) * f4;
                gameEngine.a(gameEngine.cy, gameEngine.cz);
                gameEngine.Q();
            }
        }
        if (this.k) {
            if (!this.N) {
                if (!this.m) {
                    this.z = com.corrodinggames.rts.gameFramework.f.a(this.z, f);
                }
                if (this.z == 0.0f && !this.m) {
                    this.r++;
                    this.A = 180.0f;
                    PointF pointF = (PointF) this.D.get(com.corrodinggames.rts.gameFramework.f.a(0, this.D.size() - 1, this.r));
                    if (!this.l) {
                        this.s = b(false).toString();
                        c = b(true);
                    } else {
                        this.s = c(false).toString();
                        c = c(true);
                    }
                    this.z = 1800.0f;
                    if (!this.l) {
                        if (this.y > 0) {
                            this.z -= (this.y * 3) * 60;
                        } else {
                            this.z -= (this.y * 9) * 60;
                        }
                    }
                    c.a(pointF.x, pointF.y);
                    this.t = null;
                }
            } else if (!this.m) {
                g d2 = d();
                if (d2 != null) {
                    if (d2.e * 1000 < gameEngine.by) {
                        d2.a();
                        this.r++;
                    }
                } else if (!gameEngine.dq && !gameEngine.replayEngine.j()) {
                    gameEngine.bS.G();
                }
            }
        }
        if (this.j) {
            this.j = false;
            if (this.h != null) {
                gameEngine.a("Briefing", this.h);
            }
        }
        if (i > this.b + 250) {
            this.b = i;
            a(i);
        }
        if (i > this.c + 1000) {
            this.c = i;
            if (h()) {
                h();
                h();
            }
            boolean z = false;
            if (gameEngine.playerTeam != null) {
                if (gameEngine.playerTeam.j()) {
                }
                if (gameEngine.playerTeam.b()) {
                    z = true;
                }
            }
            if (!gameEngine.dq && !gameEngine.dt && !gameEngine.replayEngine.j() && !z) {
                boolean z2 = true;
                boolean z3 = true;
                if (this.e == l.none) {
                    z2 = false;
                } else if (this.e == l.requiredObjectives) {
                    Iterator it2 = this.g.iterator();
                    while (it2.hasNext()) {
                        if (!((m) it2.next()).b()) {
                            z2 = false;
                        }
                    }
                } else if (gameEngine.playerTeam != null) {
                    Iterator it3 = am.bE.iterator();
                    while (true) {
                        if (!it3.hasNext()) {
                            break;
                        }
                        am amVar = (am) it3.next();
                        if (gameEngine.playerTeam.c(amVar.bX) && a(this.e, amVar)) {
                            z2 = false;
                            break;
                        }
                    }
                }
                if (this.f == l.none) {
                    z3 = false;
                } else if (this.f == l.requiredObjectives) {
                    z3 = false;
                } else if (gameEngine.playerTeam != null) {
                    Iterator it4 = am.bE.iterator();
                    while (true) {
                        if (!it4.hasNext()) {
                            break;
                        }
                        am amVar2 = (am) it4.next();
                        if (gameEngine.playerTeam.d(amVar2.bX) && a(this.f, amVar2)) {
                            z3 = false;
                            break;
                        }
                    }
                }
                if (z3 && !z2) {
                    gameEngine.bS.H();
                }
                if (z2) {
                    gameEngine.bS.G();
                    if (gameEngine.by > 1500) {
                        gameEngine.settingsEngine.numberOfWins++;
                        gameEngine.settingsEngine.save();
                    }
                }
            }
            if (this.k && !this.m) {
                boolean z4 = true;
                Iterator it5 = am.bE.iterator();
                while (it5.hasNext()) {
                    am amVar3 = (am) it5.next();
                    if ((amVar3 instanceof e) || amVar3.bP) {
                        if (!amVar3.bV && !amVar3.u() && amVar3.bX == gameEngine.playerTeam) {
                            z4 = false;
                        }
                    }
                }
                if (z4) {
                    this.m = true;
                    gameEngine.bS.H();
                }
            }
        }
    }

    public boolean a(l lVar, am amVar) {
        if (!(amVar instanceof y) || amVar.bV || amVar.cT() || lVar == l.none) {
            return false;
        }
        if (lVar == l.allUnitsAndBuildings) {
            return true;
        }
        if (lVar == l.allBuildings) {
            return amVar.bI();
        }
        if (lVar == l.commandCenter) {
            return (amVar instanceof e) || amVar.bP;
        } else if (lVar == l.mainBuildings) {
            return amVar.bI() && amVar.bJ() && !(amVar instanceof b) && !(amVar instanceof com.corrodinggames.rts.game.units.d.g);
        } else if (lVar == l.noConstructionOrTech) {
            if (amVar.bJ() || amVar.ak()) {
                return true;
            }
            return false;
        } else if (lVar == l.requiredObjectives) {
            return false;
        } else {
            return false;
        }
    }

    public void h(String str) {
        GameEngine.m5e("Map Script: " + str);
    }

    public void a(a aVar) {
        if (g()) {
            h("Activiated trigger:" + aVar.a + " (id:" + aVar.b + ")");
        }
    }

    public boolean g() {
        return a && GameEngine.getGameEngine().bl;
    }

    public static void i(String str) {
        GameNetEngine.g("Map ScriptError: " + str);
    }

    public void a(int i) {
        Iterator it = this.J.iterator();
        while (it.hasNext()) {
            a aVar = (a) it.next();
            if (aVar.j && aVar.q != -1 && i >= aVar.k + aVar.q) {
                aVar.j = false;
                aVar.u = false;
            }
            if (!aVar.j && !aVar.u && aVar.d()) {
                aVar.u = true;
            }
            if ((aVar.j || aVar.u) && aVar.e.b()) {
                aVar.j = false;
                aVar.u = false;
                aVar.m = true;
            }
            if (aVar.j && aVar.p > 0 && i >= aVar.k + aVar.p) {
                aVar.u = true;
            }
            if (aVar.u) {
                aVar.u = false;
                try {
                    d.a(this, aVar);
                } catch (com.corrodinggames.rts.game.maps.f e) {
                    e.printStackTrace();
                    aVar.g("Error activating trigger: " + e.getMessage());
                }
            }
        }
    }

    public boolean h() {
        boolean z;
        boolean z2 = false;
        GameEngine gameEngine = GameEngine.getGameEngine();
        am[] a2 = am.bE.a();
        int size = am.bE.size();
        for (int i = 0; i < size; i++) {
            am amVar = a2[i];
            if (amVar.bX == PlayerData.i && (amVar instanceof y) && amVar.bT() && !amVar.o()) {
                int i2 = 0;
                int size2 = am.bE.size();
                while (true) {
                    if (i2 < size2) {
                        am amVar2 = a2[i2];
                        if (!gameEngine.ay()) {
                            z = amVar2.bX == gameEngine.playerTeam;
                        } else {
                            z = !amVar2.bX.w;
                            if (amVar.cO()) {
                                z = true;
                            }
                        }
                        if (amVar2.bX != null && amVar2.bX.site < 0) {
                            z = false;
                        }
                        if (!z || amVar2.bX == amVar.bX || !(amVar2 instanceof y) || amVar2.i() || !amVar2.bT() || com.corrodinggames.rts.gameFramework.f.a(amVar2.eo, amVar2.ep, amVar.eo, amVar.ep) >= 28900.0f) {
                            i2++;
                        } else {
                            amVar.e(amVar2.bX);
                            amVar.cJ = 60.0f;
                            z2 = true;
                            break;
                        }
                    }
                }
            }
        }
        return z2;
    }
}