package com.corrodinggames.rts.gameFramework;

import com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope;
import com.corrodinggames.rts.gameFramework.utility.SlickToAndroidKeycodes;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import java.util.Properties;

/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/ac.class */
public class ac {

    /* renamed from: a  reason: collision with root package name */
    public static aj f400a = new al();
    public static ai b = new ai();
    public ad c;
    public ad d;
    public ad e;
    public ad f;
    public ad g;
    public ad h;
    public ad i;
    public ad j;
    public ad k;
    public ad l = a("Debug Left");
    public ad m = a("Debug Right");
    public ad n = b("Camera Up");
    public ad o = b("Camera Down");
    public ad p = b("Camera Left");
    public ad q = b("Camera Right");
    public ad r = b("Zoom In");
    public ad s = b("Zoom Out");
    public ad t = b("Send Chat");
    public ad u = b("Send Team Chat");
    public ad v = b("Ping Map");
    public ad w = b("Show Menu");
    public ad x = b("Save Game");
    public ad y = b("Deselect units");
    public ad z = b("Go to notification");
    public ad A = b("Select Whole Army");
    public ad B = b("Select Command Center");
    public ad C = b("Cycle Builders");
    public ad D = b("Cycle Extractors");
    public ad E = b("Cycle Upgradable Fabricators");
    public ad F = b("Cycle Land Factories");
    public ad G = b("Cycle Air Factories");
    public ad H = b("Next Music Track");
    public ae I = c("Game Speed (Single player)");
    public ad J = b("Slower");
    public ad K = b("Faster");
    public ad L = b("Pause Game");
    public ae M = c("Unit Actions");
    public ad N = b("Attack Move");
    public ad O = b("Stop");
    public ad P = b("Guard Unit");
    public ad Q = b("Patrol");
    public ad R = b("Reclaim");
    public ad S = b("Action - Upgrade");
    public ad T = b("Action - Set Rally");
    public ad U = a("Debug Editor");
    public ad V = a("Debug Pause");
    public ad W = a("Debug Slow");
    public ad X = a("Debug HideInterface");
    public ad Y = a("Debug HideInterface Temp");
    public ad Z = a("Debug InvincibleUnits");
    public ad aa = a("debugPrintSelectedUnit");
    public ad ab = a("debugDevModeSwitch");
    public ad ac = a("debugAIViewSwitch");
    public ad ad = a("debugMapSwitch");
    public ad ae = a("Debug Take Screenshot");
    public ad af = a("Debug Take Screenshot High");
    public ad[] ag;
    public ae ah;
    public ad[] ai;
    public ad[] aj;
    public ad[] ak;
    public ArrayList al;
    Properties am;
    int an;
    int ao;

    public ac() {
        this.n.a("UP").a("NUMPAD8");
        this.o.a("DOWN").a("NUMPAD2");
        this.p.a("LEFT").a("NUMPAD4");
        this.q.a("RIGHT").a("NUMPAD6");
        this.l.a("F5");
        this.m.a("F6");
        this.x.a("CTRL+S");
        this.t.a("ENTER").a("T");
        this.u.a("SHIFT+ENTER").a("Y");
        this.v.a("CTRL+M").a("CTRL+P");
        this.w.a("ESCAPE").a("F10");
        this.y.a("SPACE");
        this.z.a("CTRL+SPACE");
        this.A.a("CTRL+A");
        this.C.a("CTRL+B");
        this.D.a("CTRL+E");
        this.E.a("CTRL+F");
        this.F.a("CTRL+L");
        this.G.a("CTRL+K");
        this.B.a("CTRL+C");
        this.H.a("CTRL+N");
        this.N.a("A");
        this.L.a("BREAK");
        this.O.a("S");
        this.P.a("G");
        this.Q.a("P");
        this.S.a("U");
        this.T.a("R");
        this.U.a("CTRL+SHIFT+E");
        this.V.a("CTRL+SHIFT+P");
        this.W.a("CTRL+SHIFT+S");
        this.X.a("CTRL+SHIFT+H");
        this.Y.a("CTRL+H");
        this.Z.a("CTRL+SHIFT+I");
        this.aa.a("CTRL+SHIFT+L");
        this.ab.a("CTRL+SHIFT+D");
        this.ac.a("SHIFT+F3");
        this.ad.a("SHIFT+F4");
        this.ae.a("CTRL+SHIFT+ALT+S");
        this.af.a("CTRL+SHIFT+ALT+D");
        this.J.a("minus").a("NUMPADSUBTRACT");
        this.K.a("equals").a("NUMPADADD");
        int[] iArr = {54, 52, 31, 50, 30, 42, 41, 38, 39, 40, 37, 43};
        this.ag = new ad[10];
        for (int i = 0; i < this.ag.length; i++) {
            this.ag[i] = b("unit action " + (i + 1));
            this.ag[i].c(iArr[i]);
        }
        this.ah = c("Unit Groups");
        this.ak = new ad[10];
        int i2 = 0;
        while (i2 < this.ak.length) {
            this.ak[i2] = b("create group " + (i2 + 1));
            this.ak[i2].a(a(i2 == 9 ? 0 : i2 + 1), 0, 1, false);
            i2++;
        }
        this.ai = new ad[10];
        int i3 = 0;
        while (i3 < this.ai.length) {
            this.ai[i3] = b("select group " + (i3 + 1));
            this.ai[i3].c(a(i3 == 9 ? 0 : i3 + 1));
            i3++;
        }
        this.aj = new ad[10];
        int i4 = 0;
        while (i4 < this.aj.length) {
            this.aj[i4] = b("Add group to selection " + (i4 + 1));
            this.aj[i4].a(a(i4 == 9 ? 0 : i4 + 1), 0, 2, false);
            i4++;
        }
        this.am = new Properties();
        this.an = 0;
        this.ao = 0;
    }

    public int a(int i) {
        if (i >= 10) {
            throw new RuntimeException("number:" + i + " too high");
        }
        if (i == 0) {
            return 7;
        }
        return 8 + (i - 1);
    }

    public ad a(String str) {
        if (this.al == null) {
            this.al = new ArrayList();
        }
        ad adVar = new ad();
        adVar.f401a = str;
        adVar.b = false;
        this.al.add(adVar);
        return adVar;
    }

    public ad b(String str) {
        if (this.al == null) {
            this.al = new ArrayList();
        }
        ad adVar = new ad();
        adVar.f401a = str;
        adVar.b = true;
        this.al.add(adVar);
        return adVar;
    }

    public ae c(String str) {
        if (this.al == null) {
            this.al = new ArrayList();
        }
        ae aeVar = new ae();
        aeVar.f401a = str;
        aeVar.b = true;
        this.al.add(aeVar);
        return aeVar;
    }

    public void a(String str, String str2) {
        String trim = str.toLowerCase(Locale.ENGLISH).trim();
        ad adVar = null;
        Iterator it = this.al.iterator();
        while (it.hasNext()) {
            ad adVar2 = (ad) it.next();
            if (adVar2.f401a != null && adVar2.e().equals(trim)) {
                adVar = adVar2;
            }
        }
        if (adVar == null) {
            GameEngine.print("loadKey: could not find:" + trim);
            return;
        }
        String[] split = str2.split(",");
        for (int i = 0; i <= 1 && i < split.length; i++) {
            String str3 = split[i];
            if (!str3.equalsIgnoreCase("DEFAULT")) {
                adVar.a(str3, i);
                if (adVar.c.size() > i && adVar.c.get(i) != null) {
                    ((af) adVar.c.get(i)).d = true;
                } else {
                    GameEngine.g("out of range");
                }
            }
        }
    }

    public String a(ad adVar) {
        String str = VariableScope.nullOrMissingString;
        boolean z = true;
        Iterator it = adVar.c.iterator();
        while (it.hasNext()) {
            af afVar = (af) it.next();
            if (z) {
                z = false;
            } else {
                str = str + ",";
            }
            if (afVar.d) {
                if (afVar.d()) {
                    str = str + "CLEARED";
                } else {
                    str = str + afVar.c();
                }
            } else {
                str = str + "DEFAULT";
            }
        }
        return str;
    }

    public boolean a(ad adVar, int i) {
        GameEngine gameEngine = GameEngine.getGameEngine();
        af a2 = adVar.a(i);
        if (a2 == null) {
            return false;
        }
        ArrayList arrayList = gameEngine.bT.al;
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            ad adVar2 = (ad) arrayList.get(i2);
            if (adVar2 != adVar) {
                Iterator it = adVar2.c.iterator();
                while (it.hasNext()) {
                    if (a2.a((af) it.next())) {
                        return true;
                    }
                }
                continue;
            }
        }
        return false;
    }

    public void a() {
        this.c = a("shoot");
        this.d = a("move up");
        this.e = a("move down");
        this.f = a("move left");
        this.g = a("move right");
        this.h = a("aim up");
        this.i = a("aim down");
        this.j = a("aim left");
        this.k = a("aim right");
        this.c.a(0, "enter", -1);
        this.c.a(0, "space", -1);
        this.d.a(0, "w", -1);
        this.e.a(0, "s", -1);
        this.f.a(0, "a", -1);
        this.g.a(0, "d", -1);
        this.h.a(0, "UP", -1);
        this.i.a(0, "DOWN", -1);
        this.j.a(0, "LEFT", -1);
        this.k.a(0, "RIGHT", -1);
        GameEngine.m328e("getControllerCount:" + b.a());
        this.d.b(0, 1, 0, true);
        this.e.b(0, 1, 0, false);
        this.f.b(0, 1, 1, true);
        this.g.b(0, 1, 1, false);
        this.h.b(0, 1, 2, true);
        this.i.b(0, 1, 2, false);
        this.j.b(0, 1, 3, true);
        this.k.b(0, 1, 3, false);
        this.c.b(0, 1, 4, true);
    }

    public void b() {
        if (b.a() != this.ao) {
            this.ao = b.a();
            GameEngine.m328e("Number of controllers changed, now:" + this.ao);
        }
    }

    public static int d(String str) {
        if (str.equalsIgnoreCase("CLEARED")) {
            return 0;
        }
        return SlickToAndroidKeycodes.a(str);
    }
}