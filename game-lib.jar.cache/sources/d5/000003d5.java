package com.corrodinggames.rts.game.units;

import android.graphics.Paint;
import android.graphics.PointF;
import com.corrodinggames.rts.R;
import com.corrodinggames.rts.game.PlayerData;
import com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.net.EnterPasswordCallback;
import com.corrodinggames.rts.gameFramework.net.GameInputStream;
import com.corrodinggames.rts.gameFramework.net.GameNetEngine;
import com.corrodinggames.rts.gameFramework.net.GameOutputStream;
import com.corrodinggames.rts.gameFramework.utility.SlickToAndroidKeycodes;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/h.class */
public class h extends com.corrodinggames.rts.game.units.e.j implements d {

    /* renamed from: a */
    PointF[] f368a;
    PointF[] b;
    boolean c;
    static Paint d;
    static Paint e;
    static Paint f;
    static com.corrodinggames.rts.gameFramework.unitAction.e g;
    String r;
    static ArrayList D;
    com.corrodinggames.rts.gameFramework.mod.b E;
    o F;
    n G;
    String H;
    boolean I;
    String J;
    static com.corrodinggames.rts.game.units.a.s h = new AnonymousClass1("reloadUnits");
    static com.corrodinggames.rts.game.units.a.s i = new AnonymousClass12("reloadOnlyActiveUnits");
    static com.corrodinggames.rts.game.units.a.s j = new AnonymousClass17("unitClone");
    static com.corrodinggames.rts.game.units.a.s k = new AnonymousClass18("removeUnits");
    static com.corrodinggames.rts.game.units.a.s l = new AnonymousClass19("killUnits");
    static com.corrodinggames.rts.game.units.a.s m = new AnonymousClass20("finishQueue");
    static com.corrodinggames.rts.game.units.a.s n = new AnonymousClass21("nukeAt");
    static com.corrodinggames.rts.game.units.a.s o = new AnonymousClass22("freezeAI");
    static com.corrodinggames.rts.game.units.a.s p = new AnonymousClass23("changeAlliance");
    static com.corrodinggames.rts.game.units.a.s q = new AnonymousClass2("startRecording");
    static com.corrodinggames.rts.game.units.a.s s = new AnonymousClass3("startReplayPlayback");
    static com.corrodinggames.rts.game.units.a.s t = new AnonymousClass4("hideInterface");
    static com.corrodinggames.rts.game.units.a.s u = new AnonymousClass5("freezeAllAI");
    static com.corrodinggames.rts.game.units.a.s v = new AnonymousClass6("pauseGame");
    static com.corrodinggames.rts.game.units.a.s w = new AnonymousClass7("slowGame");
    static com.corrodinggames.rts.game.units.a.s x = new AnonymousClass8("fastForward");
    static com.corrodinggames.rts.game.units.a.s y = new AnonymousClass9("search");
    static com.corrodinggames.rts.game.units.a.s z = new AnonymousClass10("enableDebug");
    static com.corrodinggames.rts.game.units.a.s A = new AnonymousClass11("enableAIDebug");
    static com.corrodinggames.rts.game.units.a.s B = new AnonymousClass13("enableTriggerDebug");
    static com.corrodinggames.rts.game.units.a.s C = new AnonymousClass14("clearSaveHistory");
    static com.corrodinggames.rts.game.units.a.b K = new AnonymousClass16();

    /* renamed from: f */
    public ar m1r() {
        return ar.editorOrBuilder;
    }

    public static boolean w() {
        if (GameEngine.getGameEngine().cb.i()) {
            return true;
        }
        return false;
    }

    public PointF[] b() {
        return this.f368a;
    }

    public PointF[] e_() {
        return this.b;
    }

    public com.corrodinggames.rts.gameFramework.unitAction.e v() {
        if (this.bX.k == -1) {
            return null;
        }
        return dN[this.bX.R()];
    }

    public static void K() {
        g = GameEngine.getGameEngine().bO.a(R.drawable.icon_search);
    }

    public boolean a(am amVar) {
        return true;
    }

    public com.corrodinggames.rts.gameFramework.unitAction.e d() {
        if (this.bV) {
            return com.corrodinggames.rts.game.units.e.b.b;
        }
        return com.corrodinggames.rts.game.units.e.b.d[this.bX.R()];
    }

    public com.corrodinggames.rts.gameFramework.unitAction.e k() {
        return null;
    }

    public com.corrodinggames.rts.gameFramework.unitAction.e d(int i2) {
        return null;
    }

    public boolean e() {
        GameEngine gameEngine = GameEngine.getGameEngine();
        gameEngine.bR.b(this.eo, this.ep, this.eq);
        this.M = com.corrodinggames.rts.game.units.e.b.b;
        S(0);
        this.bT = false;
        gameEngine.bM.a(com.corrodinggames.rts.gameFramework.a.e.o, 0.8f, this.eo, this.ep);
        bq();
        return true;
    }

    public h(boolean z2) {
        super(z2);
        this.f368a = new PointF[6];
        this.b = new PointF[this.f368a.length];
        d = new Paint();
        d.a(40, 0, 255, 0);
        d.a(true);
        d.a(2.0f);
        d.a(Paint.Cap.ROUND);
        e = new Paint();
        e.a(d);
        e.a(55, 255, 60, 60);
        f = new Paint();
        f.a(60, 255, 255, 255);
        this.E = null;
        this.F = o.land;
        this.G = n.all;
        this.I = true;
        T(20);
        U(20);
        this.cj = 10.0f;
        this.eo = -1000.0f;
        this.ep = -1000.0f;
        this.ck = this.cj;
        this.cv = 170000.0f;
        this.cu = this.cv;
        this.M = com.corrodinggames.rts.game.units.e.b.b;
        for (int i2 = 0; i2 < this.f368a.length; i2++) {
            this.f368a[i2] = new PointF();
            this.b[i2] = new PointF();
        }
    }

    public static void a(float f2, d dVar) {
        y yVar = (y) dVar;
        PointF[] b = dVar.b();
        PointF[] e_ = dVar.e_();
        am X = yVar.X();
        yVar.aN = X != null;
        if (X != null) {
            for (int i2 = 0; i2 < b.length; i2++) {
                PointF pointF = b[i2];
                PointF pointF2 = e_[i2];
                pointF.x = com.corrodinggames.rts.gameFramework.f.a(pointF.x, pointF2.x, 0.1f * f2);
                pointF.y = com.corrodinggames.rts.gameFramework.f.a(pointF.y, pointF2.y, 0.1f * f2);
                pointF.x += (pointF2.x - pointF.x) * 0.04f * f2;
                pointF.y += (pointF2.y - pointF.y) * 0.04f * f2;
                float f3 = X.cj * 0.75f;
                if (com.corrodinggames.rts.gameFramework.f.c(pointF.x - pointF2.x) < 1.0f) {
                    pointF2.x = com.corrodinggames.rts.gameFramework.f.d(-f3, f3);
                }
                if (com.corrodinggames.rts.gameFramework.f.c(pointF.y - pointF2.y) < 1.0f) {
                    pointF2.y = com.corrodinggames.rts.gameFramework.f.d(-f3, f3);
                }
            }
        } else if (b[0].x != 0.0f || b[0].y != 0.0f) {
            for (int i3 = 0; i3 < b.length; i3++) {
                PointF pointF3 = b[i3];
                PointF pointF4 = e_[i3];
                pointF3.x = 0.0f;
                pointF3.y = 0.0f;
                pointF4.x = 0.0f;
                pointF4.y = 0.0f;
            }
        }
    }

    public void a(float f2) {
        if (f2 < 0.3f) {
            f2 = 0.3f;
        }
        if (this.ax && this.bX.b()) {
            int i2 = 0;
            while (true) {
                if (i2 < PlayerData.c) {
                    PlayerData k2 = PlayerData.k(i2);
                    if (k2 == null || k2.b()) {
                        i2++;
                    } else {
                        e(k2);
                        break;
                    }
                } else {
                    break;
                }
            }
        }
        super.a(f2);
        if (!this.bV) {
            a(f2, this);
        }
        this.cu = this.cv;
    }

    public void a(float f2, boolean z2) {
        if (!this.bV) {
        }
    }

    public float e(int i2) {
        return 0.0f;
    }

    public float f(int i2) {
        return 0.0f;
    }

    public boolean c(float f2) {
        if (!super.c(f2)) {
            return false;
        }
        GameEngine.getGameEngine();
        return true;
    }

    public void a(am amVar, int i2) {
    }

    public boolean b_() {
        return false;
    }

    public int y() {
        return 850000;
    }

    public float b(am amVar) {
        return 1.0E7f;
    }

    public float c(am amVar) {
        return 1.0E7f;
    }

    public float m() {
        return 30.0f;
    }

    public float b(int i2) {
        return 100.0f;
    }

    public float z() {
        return 0.0f;
    }

    public float A() {
        return 9.8f;
    }

    public float B() {
        return 9.35f;
    }

    public float c(int i2) {
        return 99.0f;
    }

    public boolean l() {
        return false;
    }

    public float C() {
        return 0.04f;
    }

    public float D() {
        return 0.1f;
    }

    public void a(com.corrodinggames.rts.game.units.a.s sVar, boolean z2) {
        GameEngine gameEngine = GameEngine.getGameEngine();
        if (sVar instanceof k) {
            k kVar = (k) sVar;
            boolean z3 = true;
            if (z2) {
                z3 = 1 == 0;
            }
            if (kVar.f380a) {
                z3 = !z3;
            }
            if (z3) {
                com.corrodinggames.rts.game.a.a aVar = null;
                int i2 = this.bX.k + 1;
                while (true) {
                    if (i2 < PlayerData.c) {
                        PlayerData k2 = PlayerData.k(i2);
                        if (k2 == null || k2.b()) {
                            i2++;
                        } else {
                            aVar = k2;
                            break;
                        }
                    } else {
                        break;
                    }
                }
                if (aVar == null && this.bX.k < 4) {
                    aVar = PlayerData.k(this.bX.k + 1);
                    if (aVar == null) {
                        GameEngine.m4e("Sandbox adding new team:" + this.bX.k);
                        com.corrodinggames.rts.game.a.a aVar2 = new com.corrodinggames.rts.game.a.a(this.bX.k + 1);
                        aVar = aVar2;
                        aVar.r = 1;
                        aVar.F = true;
                        aVar.G = true;
                        if (!this.c) {
                            aVar2.bG = 0.0f;
                        } else {
                            aVar2.bG = Float.MAX_VALUE;
                        }
                    }
                }
                if (aVar == null) {
                    int i3 = 0;
                    while (true) {
                        if (i3 < PlayerData.c) {
                            PlayerData k3 = PlayerData.k(i3);
                            if (k3 == null || k3.b()) {
                                i3++;
                            } else {
                                aVar = k3;
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                }
                if (aVar != null) {
                    e(aVar);
                    if (!gameEngine.cb.j()) {
                        gameEngine.bs = aVar;
                    }
                }
            } else {
                PlayerData playerData = null;
                int i4 = this.bX.k - 1;
                while (true) {
                    if (i4 >= 0) {
                        PlayerData k4 = PlayerData.k(i4);
                        if (k4 == null || k4.b()) {
                            i4--;
                        } else {
                            playerData = k4;
                            break;
                        }
                    } else {
                        break;
                    }
                }
                if (playerData == null) {
                    int i5 = PlayerData.c - 1;
                    while (true) {
                        if (i5 >= 0) {
                            PlayerData k5 = PlayerData.k(i5);
                            if (k5 == null || k5.b()) {
                                i5--;
                            } else {
                                playerData = k5;
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                }
                if (playerData != null) {
                    e(playerData);
                    if (!gameEngine.cb.j()) {
                        gameEngine.bs = playerData;
                    }
                }
            }
        }
        if (sVar instanceof j) {
            j jVar = (j) sVar;
            boolean z4 = true;
            if (z2) {
                z4 = 1 == 0;
            }
            if (jVar.f379a) {
                z4 = !z4;
            }
            ArrayList j2 = gameEngine.bZ.j();
            if (j2.size() == 0) {
                this.E = null;
            } else if (z4) {
                if (this.E == null) {
                    this.E = (com.corrodinggames.rts.gameFramework.mod.b) j2.get(0);
                } else {
                    com.corrodinggames.rts.gameFramework.mod.b bVar = null;
                    boolean z5 = false;
                    Iterator it = j2.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        com.corrodinggames.rts.gameFramework.mod.b bVar2 = (com.corrodinggames.rts.gameFramework.mod.b) it.next();
                        if (z5) {
                            bVar = bVar2;
                            break;
                        } else if (bVar2 == this.E) {
                            z5 = true;
                        }
                    }
                    this.E = bVar;
                }
            } else if (this.E == null) {
                this.E = (com.corrodinggames.rts.gameFramework.mod.b) j2.get(j2.size() - 1);
            } else {
                com.corrodinggames.rts.gameFramework.mod.b bVar3 = null;
                boolean z6 = false;
                ArrayList arrayList = new ArrayList();
                arrayList.addAll(j2);
                Collections.reverse(arrayList);
                Iterator it2 = arrayList.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    com.corrodinggames.rts.gameFramework.mod.b bVar4 = (com.corrodinggames.rts.gameFramework.mod.b) it2.next();
                    if (z6) {
                        bVar3 = bVar4;
                        break;
                    } else if (bVar4 == this.E) {
                        z6 = true;
                    }
                }
                this.E = bVar3;
            }
        }
        if (sVar instanceof l) {
            l lVar = (l) sVar;
            boolean z7 = true;
            if (z2) {
                z7 = 1 == 0;
            }
            if (lVar.f381a) {
                z7 = !z7;
            }
            this.F = this.F.a(!z7);
        }
        if (sVar instanceof i) {
            this.bX.d(10000.0f);
        }
        if (sVar instanceof m) {
            ((m) sVar).n();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static h L() {
        return GameEngine.getGameEngine().bS.i();
    }

    public void a(com.corrodinggames.rts.game.units.a.s sVar, boolean z2, PointF pointF, am amVar) {
        GameEngine gameEngine = GameEngine.getGameEngine();
        if (sVar instanceof com.corrodinggames.rts.game.units.a.h) {
            sVar = ((com.corrodinggames.rts.game.units.a.h) sVar).q_();
        }
        if (sVar == h) {
            if (w()) {
                GameEngine.print("Not reloading units: Need to keep network sync");
                gameEngine.bS.b("Not reloading units: Need to keep network sync");
                return;
            } else if (z2) {
                return;
            } else {
                if (gameEngine.bZ.h() == 0) {
                    gameEngine.bS.b("No custom units to reload");
                    return;
                }
                GameEngine.m4e("Reload units requested");
                gameEngine.bZ.a(true, false);
                Iterator it = PlayerData.c().iterator();
                while (it.hasNext()) {
                    PlayerData playerData = (PlayerData) it.next();
                    if (playerData instanceof com.corrodinggames.rts.game.a.a) {
                        ((com.corrodinggames.rts.game.a.a) playerData).al();
                    }
                }
                gameEngine.bS.b("All custom unit files reloaded");
            }
        }
        if (sVar == i) {
            if (w()) {
                GameEngine.print("Not reloading units: Need to keep network sync");
                return;
            } else if (z2) {
                return;
            } else {
                if (gameEngine.bZ.h() == 0) {
                    gameEngine.bS.b("No custom units to reload");
                    return;
                }
                GameEngine.m4e("Reload active only requested");
                gameEngine.bZ.a(true, true);
                Iterator it2 = PlayerData.c().iterator();
                while (it2.hasNext()) {
                    PlayerData playerData2 = (PlayerData) it2.next();
                    if (playerData2 instanceof com.corrodinggames.rts.game.a.a) {
                        ((com.corrodinggames.rts.game.a.a) playerData2).al();
                    }
                }
                int i2 = com.corrodinggames.rts.game.units.custom.ag.d;
                int i3 = 100;
                String str = "Quick reloaded changed data for " + i2 + " units active on map.";
                if (gameEngine.settingsEngine.liveReloading && i2 == 0) {
                    str = str + " (Note: Live reloading is currently enabled, so changed units may have already be reloaded)";
                    i3 = 170;
                }
                gameEngine.bS.a(str, i3);
            }
        }
        if (sVar == k || sVar == l || sVar == j) {
            int i4 = 0;
            if (z2) {
                return;
            }
            Iterator it3 = am.bF().iterator();
            while (it3.hasNext()) {
                am amVar2 = (am) it3.next();
                if ((amVar2 instanceof am) && com.corrodinggames.rts.gameFramework.f.a(amVar2.eo, amVar2.ep, pointF.x, pointF.y) < 2500.0f) {
                    if (sVar == k) {
                        if (amVar2.cN == null && amVar2.cO == null) {
                            amVar2.ci();
                            if ((amVar2 instanceof y) && amVar2.bI()) {
                                gameEngine.bU.a((y) amVar2);
                            }
                        }
                    } else if (sVar == l) {
                        if (amVar2.cN == null && amVar2.cO == null) {
                            amVar2.cu = -1.0f;
                        }
                    } else if (sVar != j) {
                        continue;
                    } else if (i4 <= 4) {
                        if (!amVar2.bI() && !(amVar2 instanceof al) && !amVar2.bV && amVar2.cN == null && amVar2.cO == null) {
                            i4++;
                            as mo5r = amVar2.mo5r();
                            for (int i5 = -25; i5 < 25; i5++) {
                                am a2 = mo5r.a();
                                a2.eo = amVar2.eo + (i5 * 0.5f) + 1.0f;
                                a2.ep = amVar2.ep + (i5 * 0.5f) + 1.0f;
                                a2.b(amVar2.bX);
                                PlayerData.c(a2);
                                a2.cg = com.corrodinggames.rts.gameFramework.f.a((com.corrodinggames.rts.gameFramework.w) amVar2, -180, (int) SlickToAndroidKeycodes.AndroidCodes.KEYCODE_STB_INPUT, 25 + i5);
                                if (a2 instanceof y) {
                                    ((y) a2).ay = true;
                                }
                            }
                        }
                    } else {
                        return;
                    }
                }
            }
            return;
        }
        if (sVar == n) {
            if (z2) {
                return;
            }
            com.corrodinggames.rts.game.f a3 = com.corrodinggames.rts.game.units.d.q.a(this, pointF.x, pointF.y, pointF.x, pointF.y);
            if (a3 != null) {
                a3.eq = 100.0f;
                a3.j = null;
            }
        }
        if (sVar == m) {
            if (z2) {
                return;
            }
            Iterator it4 = am.bF().iterator();
            while (it4.hasNext()) {
                com.corrodinggames.rts.gameFramework.w wVar = (com.corrodinggames.rts.gameFramework.w) it4.next();
                if ((wVar instanceof y) && (wVar instanceof com.corrodinggames.rts.game.units.d.l) && com.corrodinggames.rts.gameFramework.f.a(wVar.eo, wVar.ep, pointF.x, pointF.y) < 2500.0f) {
                    ((com.corrodinggames.rts.game.units.d.l) wVar).dz();
                }
            }
            return;
        }
        if (sVar == o) {
            PlayerData playerData3 = this.bX;
            if (playerData3 instanceof com.corrodinggames.rts.game.a.a) {
                com.corrodinggames.rts.game.a.a aVar = (com.corrodinggames.rts.game.a.a) playerData3;
                if (aVar.bG > 0.0f) {
                    aVar.bG = 0.0f;
                } else {
                    aVar.bG = 10800.0f;
                }
            }
        }
        if (sVar == p) {
            PlayerData playerData4 = this.bX;
            playerData4.r++;
            if (playerData4.r > 4) {
                playerData4.r = 0;
            }
        }
        if (sVar == u) {
            boolean z3 = false;
            boolean z4 = false;
            Iterator it5 = PlayerData.c().iterator();
            while (it5.hasNext()) {
                PlayerData playerData5 = (PlayerData) it5.next();
                if (playerData5 instanceof com.corrodinggames.rts.game.a.a) {
                    if (((com.corrodinggames.rts.game.a.a) playerData5).bG > 0.0f) {
                        z3 = true;
                    }
                    z4 = true;
                }
            }
            boolean z5 = !z3;
            if (!z4) {
                z5 = !this.c;
            }
            this.c = z5;
            M();
        }
        if (sVar == v) {
        }
        if (sVar == w) {
        }
        if (sVar == x) {
        }
        if (sVar == z) {
            gameEngine.bl = !gameEngine.bl;
        }
        if (sVar == A) {
            com.corrodinggames.rts.game.a.a.as = !com.corrodinggames.rts.game.a.a.as;
        }
        if (sVar == B) {
            gameEngine.bn = !gameEngine.bn;
        }
        if (sVar == C) {
            gameEngine.bY.a();
        }
        if (sVar instanceof q) {
            p.a(((q) sVar).f386a, pointF);
        }
        super.a(sVar, z2, pointF, amVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.corrodinggames.rts.game.units.h$1 */
    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/h$1.class */
    public final class AnonymousClass1 extends com.corrodinggames.rts.game.units.a.s {
        AnonymousClass1(String str) {
            super(str);
        }

        public boolean a(am amVar, boolean z) {
            if (h.w()) {
                return false;
            }
            return true;
        }

        public String a() {
            return "Reload all unit data from disk (for modding)";
        }

        public String b() {
            return "Reload units";
        }

        public int c() {
            return 0;
        }

        public int b(am amVar, boolean z) {
            return -1;
        }

        /* renamed from: g_ */
        public ar m2i() {
            return null;
        }

        public com.corrodinggames.rts.game.units.a.u e() {
            return com.corrodinggames.rts.game.units.a.u.none;
        }

        public com.corrodinggames.rts.game.units.a.t f() {
            return com.corrodinggames.rts.game.units.a.t.action;
        }

        public boolean g() {
            return false;
        }

        public boolean h() {
            return true;
        }
    }

    /* renamed from: com.corrodinggames.rts.game.units.h$12 */
    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/h$12.class */
    final class AnonymousClass12 extends com.corrodinggames.rts.game.units.a.s {
        AnonymousClass12(String str) {
            super(str);
        }

        public boolean a(am amVar, boolean z) {
            if (h.w()) {
                return false;
            }
            return true;
        }

        public String a() {
            return "Reload data only for active units on map (for modding). This is a faster than reload but will be incomplete.";
        }

        public String b() {
            return "Quick reload";
        }

        public int c() {
            return 0;
        }

        public int b(am amVar, boolean z) {
            return -1;
        }

        /* renamed from: k */
        public ar m3i() {
            return null;
        }

        public com.corrodinggames.rts.game.units.a.u e() {
            return com.corrodinggames.rts.game.units.a.u.none;
        }

        public com.corrodinggames.rts.game.units.a.t f() {
            return com.corrodinggames.rts.game.units.a.t.action;
        }

        public boolean g() {
            return false;
        }

        public boolean h() {
            return true;
        }
    }

    /* renamed from: com.corrodinggames.rts.game.units.h$17 */
    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/h$17.class */
    final class AnonymousClass17 extends com.corrodinggames.rts.game.units.a.s {
        AnonymousClass17(String str) {
            super(str);
        }

        public String a() {
            return "Clones units at point x50";
        }

        public String b() {
            return "Unit Clone";
        }

        public int c() {
            return 0;
        }

        public int b(am amVar, boolean z) {
            return -1;
        }

        /* renamed from: k */
        public ar m4i() {
            return null;
        }

        public com.corrodinggames.rts.game.units.a.u e() {
            return com.corrodinggames.rts.game.units.a.u.targetGround;
        }

        public com.corrodinggames.rts.game.units.a.t f() {
            return com.corrodinggames.rts.game.units.a.t.action;
        }

        public boolean g() {
            return false;
        }

        public boolean a(am amVar, boolean z) {
            return true;
        }

        public boolean h() {
            return true;
        }
    }

    /* renamed from: com.corrodinggames.rts.game.units.h$18 */
    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/h$18.class */
    final class AnonymousClass18 extends com.corrodinggames.rts.game.units.a.s {
        AnonymousClass18(String str) {
            super(str);
        }

        public String a() {
            return "Delete all units at a point";
        }

        public String b() {
            return "Delete units at";
        }

        public boolean h_() {
            return false;
        }

        public int c() {
            return 0;
        }

        public int b(am amVar, boolean z) {
            return -1;
        }

        /* renamed from: i_ */
        public ar m5i() {
            return null;
        }

        public com.corrodinggames.rts.game.units.a.u e() {
            return com.corrodinggames.rts.game.units.a.u.targetGround;
        }

        public com.corrodinggames.rts.game.units.a.t f() {
            return com.corrodinggames.rts.game.units.a.t.action;
        }

        public boolean g() {
            return false;
        }

        public boolean a(am amVar, boolean z) {
            return true;
        }

        public boolean h() {
            return true;
        }
    }

    /* renamed from: com.corrodinggames.rts.game.units.h$19 */
    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/h$19.class */
    final class AnonymousClass19 extends com.corrodinggames.rts.game.units.a.s {
        AnonymousClass19(String str) {
            super(str);
        }

        public String a() {
            return "Kill units at a point";
        }

        public String b() {
            return "Kill units at";
        }

        public boolean h_() {
            return false;
        }

        public int c() {
            return 0;
        }

        public int b(am amVar, boolean z) {
            return -1;
        }

        /* renamed from: j_ */
        public ar m6i() {
            return null;
        }

        public com.corrodinggames.rts.game.units.a.u e() {
            return com.corrodinggames.rts.game.units.a.u.targetGround;
        }

        public com.corrodinggames.rts.game.units.a.t f() {
            return com.corrodinggames.rts.game.units.a.t.action;
        }

        public boolean g() {
            return false;
        }

        public boolean a(am amVar, boolean z) {
            return true;
        }

        public boolean h() {
            return true;
        }
    }

    /* renamed from: com.corrodinggames.rts.game.units.h$20 */
    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/h$20.class */
    final class AnonymousClass20 extends com.corrodinggames.rts.game.units.a.s {
        AnonymousClass20(String str) {
            super(str);
        }

        public String a() {
            return "Finish all unit queues at";
        }

        public String b() {
            return "Finish queue at";
        }

        public boolean h_() {
            return false;
        }

        public int c() {
            return 0;
        }

        public int b(am amVar, boolean z) {
            return -1;
        }

        /* renamed from: k_ */
        public ar m7i() {
            return null;
        }

        public com.corrodinggames.rts.game.units.a.u e() {
            return com.corrodinggames.rts.game.units.a.u.targetGround;
        }

        public com.corrodinggames.rts.game.units.a.t f() {
            return com.corrodinggames.rts.game.units.a.t.action;
        }

        public boolean g() {
            return false;
        }

        public boolean a(am amVar, boolean z) {
            return true;
        }

        public boolean h() {
            return true;
        }
    }

    /* renamed from: com.corrodinggames.rts.game.units.h$21 */
    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/h$21.class */
    final class AnonymousClass21 extends com.corrodinggames.rts.game.units.a.s {
        AnonymousClass21(String str) {
            super(str);
        }

        public String a() {
            return "Create a nuke at a point";
        }

        public String b() {
            return "Nuke at";
        }

        public boolean h_() {
            return false;
        }

        public int c() {
            return 0;
        }

        public int b(am amVar, boolean z) {
            return -1;
        }

        /* renamed from: l_ */
        public ar m8i() {
            return null;
        }

        public com.corrodinggames.rts.game.units.a.u e() {
            return com.corrodinggames.rts.game.units.a.u.targetGround;
        }

        public com.corrodinggames.rts.game.units.a.t f() {
            return com.corrodinggames.rts.game.units.a.t.action;
        }

        public boolean g() {
            return false;
        }

        public boolean a(am amVar, boolean z) {
            return true;
        }

        public boolean h() {
            return true;
        }
    }

    /* renamed from: com.corrodinggames.rts.game.units.h$22 */
    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/h$22.class */
    final class AnonymousClass22 extends com.corrodinggames.rts.game.units.a.x {
        AnonymousClass22(String str) {
            super(str);
        }

        public String a() {
            return "Freeze high level AI logic (120secs)";
        }

        public String b() {
            return "Freeze AI";
        }

        public String d() {
            String str = "Freeze AI";
            GameEngine.getGameEngine();
            h L = h.L();
            if (L != null) {
                int i = -1;
                if (L.bX instanceof com.corrodinggames.rts.game.a.a) {
                    i = ((int) ((com.corrodinggames.rts.game.a.a) L.bX).bG) / 60;
                }
                if (i > 0) {
                    str = str + "(" + i + ")";
                }
            }
            return str;
        }

        public boolean a(am amVar, boolean z) {
            return amVar.bX instanceof com.corrodinggames.rts.game.a.a;
        }
    }

    /* renamed from: com.corrodinggames.rts.game.units.h$23 */
    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/h$23.class */
    final class AnonymousClass23 extends com.corrodinggames.rts.game.units.a.x {
        AnonymousClass23(String str) {
            super(str);
        }

        public String a() {
            return "Change selected player's alliance (players with the same letter are allied)";
        }

        public String b() {
            return "Ally:";
        }

        public String d() {
            h L;
            String str = "Ally";
            if (h.L() != null) {
                str = "Ally: " + L.bX.h();
            }
            return str;
        }

        public boolean a(am amVar, boolean z) {
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.corrodinggames.rts.game.units.h$2 */
    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/h$2.class */
    public final class AnonymousClass2 extends com.corrodinggames.rts.game.units.a.x {
        AnonymousClass2(String str) {
            super(str);
        }

        public String a() {
            return "Start recording a replay to file";
        }

        public String b() {
            return "Start Recording";
        }

        public String d() {
            String str;
            if (!GameEngine.getGameEngine().cb.k()) {
                str = "Start Recording";
            } else {
                str = "Stop Recording";
            }
            return str;
        }

        public boolean a(am amVar, boolean z) {
            if (GameEngine.getGameEngine().cb.j()) {
                return false;
            }
            return true;
        }

        public boolean a(am amVar) {
            return GameEngine.getGameEngine().cb.k();
        }

        public boolean c(am amVar, boolean z) {
            GameEngine gameEngine = GameEngine.getGameEngine();
            GameEngine.m4e("Start recording clicked");
            if (gameEngine.cb.j()) {
                GameEngine.m4e("Already in a replay");
                return false;
            }
            gameEngine.a(new AnonymousClass1());
            return false;
        }

        /* renamed from: com.corrodinggames.rts.game.units.h$2$1 */
        /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/h$2$1.class */
        class AnonymousClass1 implements Runnable {
            AnonymousClass1() {
            }

            public void run() {
                GameEngine gameEngine = GameEngine.getGameEngine();
                if (!gameEngine.cb.k()) {
                    h L = h.L();
                    gameEngine.bS.e = true;
                    if (!gameEngine.bX.B) {
                        long j = gameEngine.bX.w;
                        gameEngine.bX.useMods = true;
                        int i = gameEngine.bX.gameMapData.d;
                        gameEngine.bX.R();
                        gameEngine.bX.gameMapData.d = i;
                        gameEngine.bX.w = j;
                        gameEngine.bX.aW = true;
                        gameEngine.tick = 0;
                        gameEngine.bX.loaclTick = gameEngine.tick + 1;
                        gameEngine.bX.w();
                    }
                    String str = "[sandbox]" + gameEngine.al() + " [v" + gameEngine.v() + "] (" + com.corrodinggames.rts.gameFramework.f.a("d MMM yyyy HH.mm.ss") + ").replay";
                    gameEngine.cb.d(str);
                    gameEngine.bS.e = false;
                    GameEngine.f(null, "Replay started as: " + str);
                    h L2 = h.L();
                    if (L2 != null && L != null) {
                        L2.a(L);
                        L2.r = str;
                        return;
                    }
                    GameEngine.print("Failed copySettingsFromAnotherEditor");
                    return;
                }
                gameEngine.cb.e();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.corrodinggames.rts.game.units.h$3 */
    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/h$3.class */
    public final class AnonymousClass3 extends com.corrodinggames.rts.game.units.a.x {
        AnonymousClass3(String str) {
            super(str);
        }

        public String a() {
            return "Start playback of last a replay";
        }

        public String b() {
            return "Start Playback";
        }

        public String d() {
            String str;
            if (!GameEngine.getGameEngine().cb.j()) {
                str = "Start Playback";
            } else {
                str = "Stop Playback";
            }
            return str;
        }

        public boolean a(am amVar, boolean z) {
            boolean k = GameEngine.getGameEngine().cb.k();
            h L = h.L();
            return (L == null || L.r == null || k) ? false : true;
        }

        public boolean b(am amVar) {
            h L = h.L();
            return (L == null || L.r == null) ? false : true;
        }

        public boolean a(am amVar) {
            return GameEngine.getGameEngine().cb.j();
        }

        public boolean c(am amVar, boolean z) {
            GameEngine gameEngine = GameEngine.getGameEngine();
            String str = h.L().r;
            if (str == null) {
                gameEngine.i("No last replay found");
                return false;
            } else if (!gameEngine.cb.j()) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(str);
                com.corrodinggames.rts.gameFramework.f.a.f a2 = com.corrodinggames.rts.gameFramework.f.a.f.a("Start playback of last recording?", true);
                a2.a(com.corrodinggames.rts.gameFramework.h.a.a("menus.common.ok", new Object[0]), new AnonymousClass2(a2, gameEngine, anonymousClass1));
                gameEngine.bS.a(a2);
                return false;
            } else {
                gameEngine.a(new RunnableC00013());
                return false;
            }
        }

        /* renamed from: com.corrodinggames.rts.game.units.h$3$1 */
        /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/h$3$1.class */
        class AnonymousClass1 implements Runnable {

            /* renamed from: a */
            final /* synthetic */ String f370a;

            AnonymousClass1(String str) {
                this.f370a = str;
            }

            public void run() {
                GameEngine gameEngine = GameEngine.getGameEngine();
                if (!gameEngine.cb.j()) {
                    boolean z = gameEngine.bL.E;
                    h L = h.L();
                    boolean z2 = gameEngine.dq;
                    boolean z3 = gameEngine.dr;
                    gameEngine.cb.h = true;
                    gameEngine.cb.c(this.f370a);
                    gameEngine.cb.h = false;
                    gameEngine.dq = z2;
                    gameEngine.dr = z3;
                    h L2 = h.L();
                    if (L2 != null && L != null) {
                        L2.a(L);
                    } else {
                        GameEngine.print("Failed copySettingsFromAnotherEditor");
                    }
                    gameEngine.bv = true;
                    if (gameEngine.bL != null) {
                        gameEngine.bL.E = z;
                    }
                    gameEngine.cU = true;
                    if (L2 != null) {
                        L2.M();
                        return;
                    }
                    return;
                }
                GameEngine.m4e("stopPlaybackRunnable: Already started");
            }
        }

        /* renamed from: com.corrodinggames.rts.game.units.h$3$2 */
        /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/h$3$2.class */
        class AnonymousClass2 extends com.corrodinggames.rts.gameFramework.f.a.k {

            /* renamed from: a */
            final /* synthetic */ com.corrodinggames.rts.gameFramework.f.a.f f371a;
            final /* synthetic */ GameEngine b;
            final /* synthetic */ Runnable c;

            AnonymousClass2(com.corrodinggames.rts.gameFramework.f.a.f fVar, GameEngine gameEngine, Runnable runnable) {
                this.f371a = fVar;
                this.b = gameEngine;
                this.c = runnable;
            }

            public boolean a(com.corrodinggames.rts.gameFramework.f.a.c cVar) {
                this.f371a.i();
                this.b.a(this.c);
                return true;
            }
        }

        /* renamed from: com.corrodinggames.rts.game.units.h$3$3 */
        /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/h$3$3.class */
        class RunnableC00013 implements Runnable {
            RunnableC00013() {
            }

            public void run() {
                GameEngine gameEngine = GameEngine.getGameEngine();
                if (!gameEngine.cb.j()) {
                    GameEngine.m4e("stopPlaybackRunnable: Already stopped");
                    return;
                }
                gameEngine.cb.e();
                gameEngine.bt = 1.0f;
                gameEngine.bv = true;
                h L = h.L();
                if (L != null) {
                    gameEngine.bs = L.bX;
                }
            }
        }
    }

    /* renamed from: com.corrodinggames.rts.game.units.h$4 */
    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/h$4.class */
    final class AnonymousClass4 extends com.corrodinggames.rts.game.units.a.x {
        AnonymousClass4(String str) {
            super(str);
        }

        public String a() {
            String str = "Hide interface till the screen is clicked/pressed";
            if (GameEngine.av()) {
                str = str + "\n-Enable mouse capture to also hide the mouse";
            }
            return str;
        }

        public String b() {
            return "Hide interface";
        }

        public boolean c(am amVar, boolean z) {
            GameEngine.getGameEngine().cU = true;
            return false;
        }
    }

    /* renamed from: com.corrodinggames.rts.game.units.h$5 */
    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/h$5.class */
    final class AnonymousClass5 extends com.corrodinggames.rts.game.units.a.x {
        AnonymousClass5(String str) {
            super(str);
        }

        public String a() {
            return "Freeze full high level logic for all AI forever";
        }

        public String b() {
            return "Freeze AI";
        }

        public String d() {
            String str = "Freeze AI";
            h L = h.L();
            if (L != null && L.c) {
                str = "Unfreeze AIs";
            }
            return str;
        }

        public boolean a(am amVar, boolean z) {
            return true;
        }
    }

    public void M() {
        Iterator it = PlayerData.c().iterator();
        while (it.hasNext()) {
            PlayerData playerData = (PlayerData) it.next();
            if (playerData instanceof com.corrodinggames.rts.game.a.a) {
                com.corrodinggames.rts.game.a.a aVar = (com.corrodinggames.rts.game.a.a) playerData;
                if (!this.c) {
                    aVar.bG = 0.0f;
                } else {
                    aVar.bG = Float.MAX_VALUE;
                }
            }
        }
    }

    /* renamed from: com.corrodinggames.rts.game.units.h$6 */
    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/h$6.class */
    final class AnonymousClass6 extends com.corrodinggames.rts.game.units.a.x {
        AnonymousClass6(String str) {
            super(str);
        }

        public String a() {
            return "Pause Game";
        }

        public String b() {
            if (GameEngine.getGameEngine().bt != 0.0f) {
                return "Pause: Off";
            }
            return "Pause: On";
        }

        public boolean c(am amVar, boolean z) {
            GameEngine gameEngine = GameEngine.getGameEngine();
            if (gameEngine.cb.j()) {
            }
            if (gameEngine.bt != 0.0f) {
                gameEngine.bt = 0.0f;
                return false;
            }
            gameEngine.bt = 1.0f;
            return false;
        }
    }

    /* renamed from: com.corrodinggames.rts.game.units.h$7 */
    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/h$7.class */
    final class AnonymousClass7 extends com.corrodinggames.rts.game.units.a.x {
        AnonymousClass7(String str) {
            super(str);
        }

        public String a() {
            return "Slow motion";
        }

        public String b() {
            if (GameEngine.getGameEngine().bt != 0.1f) {
                return "Slow motion: Off";
            }
            return "Slow motion: On";
        }

        public boolean c(am amVar, boolean z) {
            GameEngine gameEngine = GameEngine.getGameEngine();
            if (gameEngine.cb.j()) {
            }
            if (gameEngine.bt == 1.0f) {
                gameEngine.bt = 0.1f;
                return false;
            }
            gameEngine.bt = 1.0f;
            return false;
        }
    }

    /* renamed from: com.corrodinggames.rts.game.units.h$8 */
    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/h$8.class */
    final class AnonymousClass8 extends com.corrodinggames.rts.game.units.a.x {
        AnonymousClass8(String str) {
            super(str);
        }

        public String a() {
            return "Fast Forward 1-5x";
        }

        public String b() {
            return "Fast Forward: " + GameEngine.getGameEngine().bt;
        }

        public boolean c(am amVar, boolean z) {
            GameEngine gameEngine = GameEngine.getGameEngine();
            if (gameEngine.cb.j()) {
            }
            if (gameEngine.bt == 1.0f) {
                gameEngine.bt = 2.0f;
                return false;
            } else if (gameEngine.bt == 2.0f) {
                gameEngine.bt = 3.0f;
                return false;
            } else if (gameEngine.bt == 3.0f) {
                gameEngine.bt = 4.0f;
                return false;
            } else if (gameEngine.bt == 4.0f) {
                gameEngine.bt = 5.0f;
                return false;
            } else if (gameEngine.bt == 5.0f) {
                gameEngine.bt = 10.0f;
                return false;
            } else {
                gameEngine.bt = 1.0f;
                return false;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.corrodinggames.rts.game.units.h$9 */
    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/h$9.class */
    public final class AnonymousClass9 extends com.corrodinggames.rts.game.units.a.x {
        AnonymousClass9(String str) {
            super(str);
        }

        public com.corrodinggames.rts.gameFramework.unitAction.e j() {
            return h.g;
        }

        public String a() {
            return "Search for units";
        }

        public String b() {
            GameEngine.getGameEngine();
            h L = h.L();
            if (L != null && L.G == n.search) {
                return "Search: " + com.corrodinggames.rts.gameFramework.f.b(L.H, 8);
            }
            return "Search units";
        }

        public boolean c(am amVar, boolean z) {
            GameEngine gameEngine = GameEngine.getGameEngine();
            if (gameEngine.cb.i()) {
                gameEngine.c("Reply active", "Changing search filter is currently not supported while recording a replay");
                return false;
            }
            AnonymousClass1 anonymousClass1 = new AnonymousClass1();
            anonymousClass1.b = "Search units by internal name or text title.";
            anonymousClass1.e = "Search units";
            anonymousClass1.f = "Search";
            anonymousClass1.g = "Cancel";
            GameNetEngine.a(anonymousClass1);
            return false;
        }

        /* renamed from: com.corrodinggames.rts.game.units.h$9$1 */
        /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/h$9$1.class */
        class AnonymousClass1 extends EnterPasswordCallback {
            AnonymousClass1() {
            }

            public void a(String str) {
                GameEngine.m4e("Searching for: " + str);
                GameEngine gameEngine = GameEngine.getGameEngine();
                if (gameEngine.cb.i()) {
                    gameEngine.c("Reply active", "Changing search filter is currently not supported while recording a replay");
                    return;
                }
                h L = h.L();
                if (L == null) {
                    GameEngine.m4e("search: No editor");
                } else if (str == null || str.trim().equals(VariableScope.nullOrMissingString)) {
                    GameEngine.m4e("search: No text entered");
                    if (L.G == n.search) {
                        L.G = n.all;
                    }
                    L.H = null;
                    L.I = true;
                    com.corrodinggames.rts.gameFramework.f.g.K();
                } else {
                    L.G = n.search;
                    L.H = str;
                    L.I = true;
                    com.corrodinggames.rts.gameFramework.f.g.K();
                }
            }

            public void a() {
            }
        }
    }

    /* renamed from: com.corrodinggames.rts.game.units.h$10 */
    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/h$10.class */
    final class AnonymousClass10 extends com.corrodinggames.rts.game.units.a.x {
        AnonymousClass10(String str) {
            super(str);
        }

        public String a() {
            return "Show hidden unit information in tooltips including flags, ammo, tags and resources";
        }

        public String b() {
            if (!GameEngine.getGameEngine().bl) {
                return "Debug: Off";
            }
            return "Debug: On";
        }
    }

    /* renamed from: com.corrodinggames.rts.game.units.h$11 */
    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/h$11.class */
    final class AnonymousClass11 extends com.corrodinggames.rts.game.units.a.x {
        AnonymousClass11(String str) {
            super(str);
        }

        public String a() {
            return "AI debug view";
        }

        public String b() {
            GameEngine.getGameEngine();
            if (!com.corrodinggames.rts.game.a.a.as) {
                return "AI Debug: Off";
            }
            return "AI Debug: On";
        }
    }

    /* renamed from: com.corrodinggames.rts.game.units.h$13 */
    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/h$13.class */
    final class AnonymousClass13 extends com.corrodinggames.rts.game.units.a.x {
        AnonymousClass13(String str) {
            super(str);
        }

        public String a() {
            return "For debugging autoTriggers. When enabled will log a message when any auto triggers fire on any selected units";
        }

        public String b() {
            if (!GameEngine.getGameEngine().bn) {
                return "Trigger Debug: Off";
            }
            return "Trigger Debug: On";
        }

        public boolean b(am amVar) {
            return GameEngine.getGameEngine().bl;
        }
    }

    /* renamed from: com.corrodinggames.rts.game.units.h$14 */
    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/h$14.class */
    final class AnonymousClass14 extends com.corrodinggames.rts.game.units.a.x {
        AnonymousClass14(String str) {
            super(str);
        }

        public String a() {
            return "Clear save history";
        }

        public String b() {
            GameEngine.getGameEngine();
            return "Clear history";
        }

        public boolean b(am amVar) {
            return GameEngine.getGameEngine().bl;
        }
    }

    public static boolean a(com.corrodinggames.rts.game.units.a.s sVar, am amVar) {
        if (sVar instanceof com.corrodinggames.rts.game.units.a.h) {
            sVar = ((com.corrodinggames.rts.game.units.a.h) sVar).q_();
        }
        if (sVar == o || sVar == w || sVar == x || sVar == m || sVar == k || sVar == j || sVar == z || sVar == p || sVar == q || sVar == s || sVar == t || sVar == B || sVar == C) {
            return true;
        }
        return false;
    }

    public static void a(ArrayList arrayList, int i2) {
        if (i2 != 1) {
            return;
        }
        D = new ArrayList();
        D.add(new k(true, false));
        D.add(new k(true, true));
        D.add(new k(false, false));
        D.add(new m(true, false));
        D.add(new m(true, true));
        D.add(new m(false, false));
        D.add(new j(true, false));
        D.add(new j(true, true));
        D.add(new j(false, false));
        D.add(new l(true, false));
        D.add(new l(true, true));
        D.add(new l(false, false));
        D.add(new q(r.grass));
        D.add(new q(r.sea));
        D.add(new q(r.sand));
        D.add(new q(r.dust));
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(new i());
        arrayList2.add(y);
        arrayList2.add(h);
        arrayList2.add(i);
        arrayList2.add(k);
        arrayList2.add(j);
        arrayList2.add(l);
        arrayList2.add(n);
        arrayList2.add(m);
        arrayList2.add(u);
        arrayList2.add(v);
        arrayList2.add(w);
        arrayList2.add(x);
        arrayList2.add(z);
        arrayList2.add(p);
        arrayList2.add(q);
        arrayList2.add(s);
        arrayList2.add(t);
        if (GameEngine.at) {
            arrayList2.add(A);
        }
        arrayList2.add(B);
        arrayList2.add(C);
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            D.add(new com.corrodinggames.rts.game.units.a.h((com.corrodinggames.rts.game.units.a.s) it.next(), K, true));
        }
        ArrayList arrayList3 = new ArrayList();
        arrayList3.addAll(ar.ae);
        Collections.sort(arrayList3, new AnonymousClass15());
        Iterator it2 = arrayList3.iterator();
        while (it2.hasNext()) {
            as asVar = (as) it2.next();
            if (asVar != ar.wall_v && !asVar.i().equals("test_tank") && !asVar.i().equals("missing") && asVar != ar.tankDestroyer && asVar != ar.megaTank && asVar != ar.fogRevealer && asVar != ar.crystalResource && asVar != ar.damagingBorder && asVar != ar.zoneMarker && asVar != ar.editorOrBuilder && asVar != ar.dummyNonUnitWithTeam && asVar != ar.supplyDepot && (am.c(asVar) instanceof y) && (!(asVar instanceof com.corrodinggames.rts.game.units.custom.l) || ((com.corrodinggames.rts.game.units.custom.l) asVar).aF)) {
                com.corrodinggames.rts.game.units.a.h hVar = new com.corrodinggames.rts.game.units.a.h(new com.corrodinggames.rts.game.units.a.v(asVar, 1, null), K);
                boolean z2 = false;
                Iterator it3 = D.iterator();
                while (it3.hasNext()) {
                    if (((com.corrodinggames.rts.game.units.a.s) it3.next()).equals(hVar)) {
                        z2 = true;
                    }
                }
                if (!z2) {
                    D.add(hVar);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.corrodinggames.rts.game.units.h$15 */
    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/h$15.class */
    public final class AnonymousClass15 implements Comparator {
        AnonymousClass15() {
        }

        /* renamed from: a */
        public int compare(as asVar, as asVar2) {
            am c = am.c(asVar);
            am c2 = am.c(asVar2);
            int compareTo = Boolean.valueOf(c.bP()).compareTo(Boolean.valueOf(c2.bP()));
            if (compareTo != 0) {
                return compareTo;
            }
            int compareTo2 = Boolean.valueOf(asVar.j()).compareTo(Boolean.valueOf(asVar2.j()));
            if (compareTo2 != 0) {
                return compareTo2;
            }
            int compareTo3 = Boolean.valueOf(c.bO()).compareTo(Boolean.valueOf(c2.bO()));
            if (compareTo3 != 0) {
                return compareTo3;
            }
            com.corrodinggames.rts.game.units.custom.d.b u = asVar.u();
            com.corrodinggames.rts.game.units.custom.d.b u2 = asVar2.u();
            com.corrodinggames.rts.game.units.custom.d.b B = asVar.B();
            com.corrodinggames.rts.game.units.custom.d.b B2 = asVar2.B();
            if (B != null) {
                u = com.corrodinggames.rts.game.units.custom.d.b.a(u, B);
            }
            if (B2 != null) {
                u2 = com.corrodinggames.rts.game.units.custom.d.b.a(u2, B2);
            }
            int compareTo4 = u.compareTo(u2);
            if (compareTo4 != 0) {
                return compareTo4;
            }
            return 0;
        }
    }

    public ArrayList N() {
        GameEngine.getGameEngine();
        return D;
    }

    public boolean E() {
        return true;
    }

    public float g(int i2) {
        return 10.0f;
    }

    public boolean F() {
        return GameEngine.getGameEngine().settingsEngine.renderExtraShadows && !this.bV;
    }

    public float G() {
        return 1.0f;
    }

    public float H() {
        return 1.0f;
    }

    public boolean u() {
        return true;
    }

    public boolean I() {
        return false;
    }

    public boolean d(am amVar) {
        return false;
    }

    public boolean J() {
        return true;
    }

    public float a(am amVar, float f2, com.corrodinggames.rts.game.f fVar) {
        return super.a(amVar, 0.0f, fVar);
    }

    /* renamed from: com.corrodinggames.rts.game.units.h$16 */
    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/h$16.class */
    final class AnonymousClass16 extends com.corrodinggames.rts.game.units.a.b {
        AnonymousClass16() {
        }

        public boolean isAvailable(com.corrodinggames.rts.game.units.a.s sVar, am amVar) {
            if (sVar instanceof com.corrodinggames.rts.game.units.a.h) {
                sVar = ((com.corrodinggames.rts.game.units.a.h) sVar).q_();
            }
            h L = h.L();
            if (L == null) {
                return true;
            }
            n nVar = L.G;
            if (nVar == null) {
                nVar = n.all;
            }
            if (nVar == n.all && h.a(sVar, amVar)) {
                return false;
            }
            if (nVar == n.modded && sVar == h.h) {
                return true;
            }
            if (nVar == n.modded && sVar == h.i) {
                return true;
            }
            if (nVar == n.search && sVar == h.y) {
                return true;
            }
            if (sVar == h.B && !h.B.b(amVar)) {
                return false;
            }
            if (sVar == h.C && !h.C.b(amVar)) {
                return false;
            }
            return nVar.a(sVar.mo4i());
        }
    }

    public void O() {
    }

    public boolean P() {
        return true;
    }

    public void a(h hVar) {
        this.r = hVar.r;
        this.c = hVar.c;
    }

    public void a(GameOutputStream gameOutputStream) {
        gameOutputStream.writeByte(1);
        gameOutputStream.writeEnum(this.G);
        gameOutputStream.writeIsString(this.H);
        super.a(gameOutputStream);
    }

    public void a(GameInputStream gameInputStream) {
        byte readByte = gameInputStream.readByte();
        this.G = (n) gameInputStream.b(n.class);
        if (this.G == null) {
            this.G = n.all;
        }
        if (readByte >= 1) {
            this.H = gameInputStream.isReadString();
        }
        super.a(gameInputStream);
    }
}