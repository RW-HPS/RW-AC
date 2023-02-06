package com.corrodinggames.rts.game;

import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.os.Debug;
import android.util.DisplayMetrics;
import android.util.Log;
import com.corrodinggames.rts.AssetsID;
import com.corrodinggames.rts.game.units.al;
import com.corrodinggames.rts.game.units.am;
import com.corrodinggames.rts.game.units.ar;
import com.corrodinggames.rts.game.units.as;
import com.corrodinggames.rts.game.units.custom.ag;
import com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope;
import com.corrodinggames.rts.game.units.f.UnitGeoIndex;
import com.corrodinggames.rts.gameFramework.CollisionEngine;
import com.corrodinggames.rts.gameFramework.CommandController;
import com.corrodinggames.rts.gameFramework.FileChangeEngine;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.GameSaver;
import com.corrodinggames.rts.gameFramework.GroupController;
import com.corrodinggames.rts.gameFramework.Interface.InterfaceEngine;
import com.corrodinggames.rts.gameFramework.ReplayEngine;
import com.corrodinggames.rts.gameFramework.SettingsEngine;
import com.corrodinggames.rts.gameFramework.StatsHandler;
import com.corrodinggames.rts.gameFramework.Unit;
import com.corrodinggames.rts.gameFramework.ac;
import com.corrodinggames.rts.gameFramework.be;
import com.corrodinggames.rts.gameFramework.bf;
import com.corrodinggames.rts.gameFramework.bs;
import com.corrodinggames.rts.gameFramework.emitter.Emitter;
import com.corrodinggames.rts.gameFramework.mod.ModEngine;
import com.corrodinggames.rts.gameFramework.net.GameNetEngine;
import com.corrodinggames.rts.gameFramework.path.PathEngine;
import com.corrodinggames.rts.gameFramework.steam.SteamEngine;
import com.corrodinggames.rts.gameFramework.unitAction.x;
import com.corrodinggames.rts.gameFramework.unitAction.y;
import com.corrodinggames.rts.gameFramework.unitAction.z;
import com.corrodinggames.rts.gameFramework.utility.SlickToAndroidKeycodes;
import com.corrodinggames.rts.gameFramework.w;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Timer;
import java.util.concurrent.ConcurrentLinkedQueue;

/* renamed from: com.corrodinggames.rts.game.i */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/i.class */
public class EngineLoad extends GameEngine {
    public static String a;
    public static boolean b;
    public static boolean c;
    int d;
    public float e;
    public static String f = null;
    k[] g;
    String h;
    public boolean i;
    public int j;
    public ConcurrentLinkedQueue k;
    Paint l;
    Paint m;
    Paint n;
    Paint o;
    Paint p;
    int q;
    int r;
    int s;
    float t;
    public String u;
    Rect v;
    public ArrayList w;
    Paint x;
    Paint y;
    Paint z;
    public Paint A;
    public bf B;
    public be C;
    public com.corrodinggames.rts.gameFramework.emitter.b D;
    com.corrodinggames.rts.game.a E;
    boolean F;
    float G;
    public float H;
    public float I;
    public float J;
    j K;
    j L;
    boolean M;
    y N;
    com.corrodinggames.rts.gameFramework.unitAction.e O;
    com.corrodinggames.rts.gameFramework.unitAction.e P;
    com.corrodinggames.rts.gameFramework.unitAction.e Q;
    float R;
    Rect S;
    RectF T;
    public com.corrodinggames.rts.gameFramework.unitAction.e U;
    public com.corrodinggames.rts.gameFramework.unitAction.e V;
    com.corrodinggames.rts.gameFramework.utility.s W;
    com.corrodinggames.rts.gameFramework.utility.s X;
    Matrix Y;
    public ArrayList Z;
    public ArrayList aa;
    Timer ab;
    boolean ac;
    Object ad;
    int ae;
    am af;
    am ag;
    float ah;
    boolean ai;

    public EngineLoad(Context context) {
        super(context);
        this.e = 1.0f;
        this.g = new k[6];
        this.i = false;
        this.j = 0;
        this.k = new ConcurrentLinkedQueue();
        this.q = 0;
        this.r = 0;
        this.s = 0;
        this.t = 16.0f;
        this.u = "0fps";
        this.v = new Rect();
        this.w = new ArrayList();
        this.A = new Paint();
        this.D = new com.corrodinggames.rts.gameFramework.emitter.b();
        this.G = 0.0f;
        this.H = 1.0f;
        this.R = 0.0f;
        this.S = new Rect();
        this.T = new RectF();
        this.U = null;
        this.V = null;
        this.W = new com.corrodinggames.rts.gameFramework.utility.s("allOnScreenObjects");
        this.X = new com.corrodinggames.rts.gameFramework.utility.s("allOnScreenObjectsDirty");
        this.Y = new Matrix();
        this.Z = new ArrayList();
        this.aa = new ArrayList();
        this.ad = new Object();
        this.ae = 0;
    }

    @Override // com.corrodinggames.rts.gameFramework.GameEngine
    public boolean a() {
        if (this.bS.u) {
            return true;
        }
        if (this.dH != null && this.dH.b()) {
            return true;
        }
        return false;
    }

    @Override // com.corrodinggames.rts.gameFramework.GameEngine
    public boolean a(boolean z) {
        if (!z || this.replayEngine.j()) {
            if (this.bS.u || this.bp) {
                return true;
            }
            if (this.aq && !this.bH) {
                return true;
            }
            if (this.bF && this.dH != null && this.dH.b()) {
                return true;
            }
        }
        if ((z && !this.netEngine.aW) || this.netEngine.I()) {
            return true;
        }
        return false;
    }

    @Override // com.corrodinggames.rts.gameFramework.GameEngine
    public int b() {
        return this.s;
    }

    @Override // com.corrodinggames.rts.gameFramework.GameEngine
    public boolean c() {
        return this.eh;
    }

    @Override // com.corrodinggames.rts.gameFramework.GameEngine
    public boolean d() {
        return this.ei;
    }

    @Override // com.corrodinggames.rts.gameFramework.GameEngine
    public synchronized void a(Context context) {
        Log.d("RustedWarfare", "--- ----------------- ----");
        Log.d("RustedWarfare", "--- GameEngine:init() ----");
        Log.d("RustedWarfare", "--- ----------------- ----");
        if (this.bi) {
            Log.d("RustedWarfare", "GameEngine init has already been called");
            return;
        }
        GameEngine.m5e("Version:" + r());
        if (C() && getClass().equals(EngineLoad.class)) {
            throw new RuntimeException("inSpace but class is:" + getClass());
        }
        System.gc();
        h("Asset Index");
        this.bK = new com.corrodinggames.rts.gameFramework.utility.i(context);
        long loadAllUnitsTook = Unit.loadAllUnitsTook();
        this.cd = new Unit(this);
        this.cd.a(bs.init_total);
        if (aU) {
            this.ci = 1.0f;
        } else {
            DisplayMetrics displayMetrics = context.e().getDisplayMetrics();
            this.ci = context.e().getDisplayMetrics().density;
            GameEngine.m5e("densityScaleRaw: " + this.ci);
            a(displayMetrics.widthPixels, displayMetrics.heightPixels);
        }
        this.ci *= this.e;
        GameEngine.m5e("densityScaleRaw*densityScaleMultiplier: " + this.ci);
        if (GameEngine.b(context)) {
            this.ar = true;
        }
        this.E = new b();
        this.bo = false;
        h("InputController");
        this.bT = new ac();
        this.bT.a();
        h("SettingsEngine");
        this.settingsEngine = SettingsEngine.getInstance(context);
        this.settingsEngine.loadMainExternalFolder(true);
        com.corrodinggames.rts.gameFramework.file.a.b();
        int i = 3;
        if (aZ) {
            i = 1;
        }
        if (this.settingsEngine.numIncompleteLoadAttempts > 1 || this.settingsEngine.numLoadsSinceRunningGameOrNormalExit > i) {
            this.ee = true;
            if (this.settingsEngine.numIncompleteLoadAttempts > 2 || this.settingsEngine.numLoadsSinceRunningGameOrNormalExit > 4) {
                this.settingsEngine.forceEnglish = true;
                this.ef = true;
            }
            if (this.settingsEngine.numIncompleteLoadAttempts > 3) {
                this.settingsEngine.newRender = false;
            }
            if (this.settingsEngine.numIncompleteLoadAttempts > 4 || this.settingsEngine.numLoadsSinceRunningGameOrNormalExit > 5) {
                GameEngine.m5e("Extra safe mode");
                this.eh = true;
            }
            if (this.settingsEngine.numIncompleteLoadAttempts > 5) {
                GameEngine.m5e("Extra safe mode x2");
                this.ei = true;
            }
            if (this.settingsEngine.numIncompleteLoadAttempts > 6) {
                GameEngine.m5e("Extra safe mode x3");
                this.settingsEngine.newRender = false;
                this.settingsEngine.shaderEffects = false;
                this.settingsEngine.teamShaders = false;
            }
            if (this.settingsEngine.newRender && this.settingsEngine.numLoadsSinceRunningGameOrNormalExit > 15) {
                GameEngine.m5e("Disabling opengl mode");
                this.settingsEngine.newRender = false;
            }
            GameEngine.m5e("starting game in safe mode, numIncompleteLoadAttempts:" + this.settingsEngine.numIncompleteLoadAttempts + " numLoadsSinceRunningGameOrNormalExit:" + this.settingsEngine.numLoadsSinceRunningGameOrNormalExit);
        }
        if (aO) {
            this.ee = true;
            this.eg = "<forced by command line>";
        }
        if (aP) {
            this.ee = true;
            this.eh = true;
            this.ei = true;
            this.eg = "<forced by command line>";
        }
        this.settingsEngine.numLoadsSinceRunningGameOrNormalExit++;
        this.settingsEngine.numIncompleteLoadAttempts++;
        if (!this.settingsEngine.save() && aZ) {
            GameEngine.m5e("starting game in safe mode, failed to save settings");
            this.eg = "failing to write preferences data";
            this.ee = true;
        }
        com.corrodinggames.rts.gameFramework.writeErrorFile.a.a();
        this.cj = W();
        GameEngine.m5e("densityScale(): " + this.cj);
        long loadAllUnitsTook2 = Unit.loadAllUnitsTook();
        com.corrodinggames.rts.gameFramework.translations.a.a();
        Unit.a("Locale.init took:", loadAllUnitsTook2);
        PlayerData.L();
        this.l = new Paint();
        this.m = new Paint();
        this.m.a(255, 255, 255, 255);
        this.m.a(true);
        a(this.m, 16.0f);
        this.n = new Paint();
        this.n.a(255, 255, 255, 255);
        this.n.a(true);
        a(this.n, 16.0f);
        this.o = new Paint();
        this.o.a(100, 255, 0, 0);
        a(this.o, 16.0f);
        this.p = new Paint();
        this.p.a(100, 0, 255, 0);
        a(this.p, 16.0f);
        this.dn = new Paint();
        this.f3do = new Paint();
        this.f3do.a(Paint.Align.CENTER);
        this.f3do.a(true);
        this.f3do.a(Typeface.a(Typeface.c, 0));
        a(this.f3do, 16.0f);
        this.dp = new Paint();
        this.dp.a(255, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_DATA_SERVICE, 255, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_DATA_SERVICE);
        this.dp.a(true);
        this.dp.a(Paint.Align.CENTER);
        a(this.dp, 18.0f);
        this.x = new Paint();
        this.x.b(-1);
        this.x.c(100);
        this.y = new Paint();
        this.y.b(-7829368);
        this.y.c(SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_SATELLITE_SERVICE);
        this.y.a(Paint.Style.STROKE);
        this.y.a(1.0f);
        long loadAllUnitsTook3 = Unit.loadAllUnitsTook();
        h("AudioEngine");
        com.corrodinggames.rts.gameFramework.a.e.b();
        this.bM = new com.corrodinggames.rts.gameFramework.a.e();
        this.bM.a(context);
        Unit.a("AudioEngine took:", loadAllUnitsTook3);
        h("MusicController");
        this.bN = new com.corrodinggames.rts.gameFramework.am();
        this.bN.a(context);
        if (bh != null) {
            m5e("init(): using Graphics instance");
            this.bO = bh;
        } else if (bg != null) {
            m5e("init(): using GraphicsSlick2d");
            try {
                this.bO = (y) bg.newInstance();
            } catch (IllegalAccessException e) {
                throw new RuntimeException(e);
            } catch (InstantiationException e2) {
                throw new RuntimeException(e2);
            }
        } else if (aU) {
            this.bO = new z();
        } else {
            this.bO = new x();
        }
        h("graphics.init");
        this.bO.a(context);
        this.bO.b();
        FileChangeEngine.a();
        h("Fonts");
        Y();
        h("effects.init");
        this.bR = new com.corrodinggames.rts.gameFramework.emitter.c();
        this.bR.a(context);
        h("minimapHandler");
        this.bW = new com.corrodinggames.rts.gameFramework.Interface.o();
        this.bW.a(context);
        if (ck != null) {
            GameEngine.m5e("We have an initial screen size, can do early setup of image buffers");
            h("Map Buffers");
            b(ck.a, ck.b);
            k();
            com.corrodinggames.rts.game.maps.b.d();
            com.corrodinggames.rts.game.maps.b.f();
            this.bW.e();
            if (GameEngine.aA()) {
                h("Setting up postprocessing");
                if (!i()) {
                    GameEngine.m5e("Failed to setup postprocessing");
                }
            }
        }
        h("PathEngine");
        this.bU = new PathEngine();
        h("GroupController");
        this.bV = new GroupController();
        h("CollisionEngine");
        this.bP = new CollisionEngine();
        h("InterfaceEngine");
        this.bS = new InterfaceEngine();
        this.bS.a(context);
        this.C = be.c(context);
        h("NetworkEngine");
        this.netEngine = new GameNetEngine();
        this.netEngine.F();
        h("StatsHandler");
        this.stats = new StatsHandler();
        h("ModEngine");
        this.bZ = new ModEngine();
        this.bZ.a();
        if (this.ee) {
            this.bZ.g();
        }
        h("CommandController");
        this.cf = new CommandController();
        h("GameSaver");
        this.ca = new GameSaver();
        h("ReplayEngine");
        this.replayEngine = new ReplayEngine();
        this.replayEngine.a(context);
        h("UnitGeoIndex");
        this.cc = new UnitGeoIndex();
        h("Precalculating map fog");
        com.corrodinggames.rts.game.maps.b.c();
        h("ScorchMark.load");
        ScorchMark.load();
        h("Projectile.load");
        Projectile.load();
        h("Emitter.load");
        Emitter.load();
        h("Unit.loadAllUnits");
        long loadAllUnitsTook4 = Unit.loadAllUnitsTook();
        am.bH();
        Unit.a("loadAllUnits took:", loadAllUnitsTook4);
        h("Loading custom unit data");
        long loadAllUnitsTook5 = Unit.loadAllUnitsTook();
        ag.h();
        h("getAllUnitsChecksum");
        Unit.a("CustomUnits took:", loadAllUnitsTook5);
        long loadAllUnitsTook6 = Unit.loadAllUnitsTook();
        this.d = am.bM();
        Unit.a("allUnitsChecksum took:", loadAllUnitsTook6);
        this.z = new Paint();
        this.z.a(50, 255, 255, 255);
        F();
        System.gc();
        this.bi = true;
        GameEngine.m5e("Init completed");
        Unit.a("Loading took:", loadAllUnitsTook);
        this.cd.b(bs.init_total);
        this.cd.a(true, true);
        long loadAllUnitsTook7 = Unit.loadAllUnitsTook();
        h("Loading map data");
        if (!GameEngine.ay) {
            x();
        }
        Unit.a("loadAMenuMap took:", loadAllUnitsTook7);
        h("Last setup");
        ap();
        this.netEngine.m();
        h("init complete");
        if (aE) {
            ar.s();
            System.exit(0);
        }
        if (aF) {
            ar.r();
            System.exit(0);
        }
        this.bj = true;
    }

    public void a(int i, int i2) {
        float b2 = com.corrodinggames.rts.gameFramework.f.b(0.0f, 0.0f, i, i2) / 1131.0f;
        GameEngine.m5e("defaultViewpointZoomDensity: " + b2);
        if (b2 < 0.5f) {
            b2 = 0.5f;
        }
        if (b2 > 3.0f) {
            b2 = 3.0f;
        }
        GameEngine.m5e("defaultViewpointZoomDensity after limit: " + b2);
        this.cY = 1.0f;
        if (com.corrodinggames.rts.gameFramework.f.c(b2 - 1.0f) > 0.1d) {
            this.cY = b2;
            if (this.cY > 2.0f) {
                this.cY = 2.0f;
            }
            if (this.cY < 0.5f) {
                this.cY = 0.5f;
            }
            this.cX = this.cV * this.cY;
        }
    }

    @Override // com.corrodinggames.rts.gameFramework.GameEngine
    public void e() {
        K();
        f();
    }

    public void f() {
        b(false);
        this.bG = false;
        this.bH = false;
        this.bF = false;
        this.bp = false;
        this.bS.u = false;
    }

    @Override // com.corrodinggames.rts.gameFramework.GameEngine
    public synchronized void a(boolean z, com.corrodinggames.rts.gameFramework.s sVar) {
        K();
        a(z, false, sVar);
    }

    @Override // com.corrodinggames.rts.gameFramework.GameEngine
    public void a(boolean z, boolean z2, com.corrodinggames.rts.gameFramework.s sVar) {
        com.corrodinggames.rts.appFramework.g i;
        this.bC = this.settingsEngine.teamUnitCapSinglePlayer;
        if (this.bC < 1) {
            this.bC = 1;
        }
        this.bB = this.bC;
        b(z2);
        PlayerData.X();
        this.bo = false;
        System.gc();
        this.bI = true;
        this.bG = false;
        this.bp = false;
        this.bF = false;
        this.by = 0;
        this.ch = false;
        this.netEngine.a(1L);
        this.tick = 0;
        this.bJ = 0;
        com.corrodinggames.rts.gameFramework.f.a();
        this.netEngine.t();
        if (!z2) {
            this.dq = false;
            this.dr = false;
            this.ds = 0.0f;
            this.du = false;
            this.dt = false;
        }
        this.j = 0;
        if (!z2) {
            this.cV = 1.0f;
        }
        this.dx = 0.0f;
        if (!this.replayEngine.j()) {
            if (!this.netEngine.B) {
                ag.b(true);
            } else {
                ag.d();
            }
        }
        if (!this.netEngine.B) {
            if (!this.replayEngine.j() && z) {
                this.playerTeam = new Player(0);
                this.playerTeam.name = "Player";
                for (int i2 = 1; i2 < 8; i2++) {
                    new com.corrodinggames.rts.game.a.a(i2);
                }
                this.netEngine.aq();
            }
        } else {
            this.playerTeam = this.netEngine.z;
            if (this.playerTeam == null) {
                throw new RuntimeException("cannot find player's team");
            }
            if (this.playerTeam != PlayerData.getPlayerData(this.playerTeam.site)) {
                GameEngine.g("Stale playerTeam");
            }
        }
        this.ce = null;
        this.bL = new com.corrodinggames.rts.game.maps.b();
        try {
            if (this.dm != null) {
                InputStream useStream = this.dm.getUseStream();
                try {
                    useStream.reset();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                this.bL.a(useStream, z2);
            } else {
                this.bL.a(ak(), z2);
            }
            if (!this.bL.W) {
                m5e("map did not load, returning");
                this.bI = false;
                return;
            }
            this.bL.G = false;
            PlayerData.e();
            for (int i3 = 0; i3 < PlayerData.c; i3++) {
                PlayerData playerData = PlayerData.getPlayerData(i3);
                if (playerData != null) {
                    playerData.J();
                }
            }
            if (!z2) {
                com.corrodinggames.rts.game.units.custom.l.F();
            }
            if (!this.netEngine.B && !this.replayEngine.j()) {
                this.netEngine.gameMapData.income = 1.0f;
                this.netEngine.gameMapData.q = com.corrodinggames.rts.gameFramework.f.rand(1, 1000000000);
            }
            this.bJ = this.netEngine.gameMapData.q;
            m5e("global Seed: " + this.bJ);
            if (this.netEngine.B || this.replayEngine.j()) {
                if (!this.netEngine.F) {
                    this.bB = this.netEngine.aw;
                    this.bC = this.netEngine.ax;
                }
                GameEngine.m5e("Unit cap is now: " + this.bC);
                if (this.netEngine.gameMapData.fog == 0) {
                    this.bL.E = false;
                    this.bL.F = false;
                } else if (this.netEngine.gameMapData.fog == 1) {
                    this.bL.E = true;
                    this.bL.F = false;
                } else if (this.netEngine.gameMapData.fog == 2) {
                    this.bL.E = true;
                    this.bL.F = true;
                }
                this.bL.G = this.netEngine.gameMapData.e;
                byte b2 = 10;
                if (this.netEngine.gameMapData.e) {
                    b2 = 10;
                }
                for (int i4 = 0; i4 < PlayerData.c; i4++) {
                    PlayerData playerData2 = PlayerData.getPlayerData(i4);
                    if (playerData2 != null) {
                        if (playerData2.N == null) {
                            GameEngine.m5e("Fog null for team: " + playerData2.site);
                        } else {
                            for (int i5 = 0; i5 < this.bL.width; i5++) {
                                for (int i6 = 0; i6 < this.bL.height; i6++) {
                                    playerData2.N[i5][i6] = b2;
                                }
                            }
                        }
                    }
                }
                int k = this.netEngine.k();
                for (int i7 = 0; i7 < PlayerData.c; i7++) {
                    PlayerData playerData3 = PlayerData.getPlayerData(i7);
                    if (playerData3 != null) {
                        playerData3.credits = k;
                        if (playerData3.w) {
                            if (!playerData3.y) {
                                if (playerData3.aiDifficulty != null) {
                                    playerData3.x = playerData3.aiDifficulty.intValue();
                                } else {
                                    playerData3.x = this.netEngine.gameMapData.aidiff;
                                }
                            } else {
                                playerData3.c("aiDifficulty is locked");
                            }
                        }
                        playerData3.sharedControl_1 = this.netEngine.gameMapData.sharedControl;
                        boolean z3 = false;
                        boolean z4 = false;
                        int i8 = this.netEngine.gameMapData.initUnit;
                        if (playerData3.startUnit != null) {
                            i8 = playerData3.startUnit.intValue();
                        }
                        if (i8 != 1) {
                            boolean z5 = true;
                            boolean z6 = true;
                            Float f2 = null;
                            Float f3 = null;
                            Float f4 = null;
                            Float f5 = null;
                            z6 = (i8 == 5 || i8 == 4 || i8 > 10) ? false : false;
                            z5 = (i8 == 5 || i8 == 4 || i8 == 3 || i8 > 10) ? false : false;
                            if (i8 == 9) {
                                z6 = false;
                                z5 = false;
                            }
                            Iterator it = am.bF().iterator();
                            while (it.hasNext()) {
                                am amVar = (am) it.next();
                                if ((amVar instanceof am) && !amVar.bV && amVar.bX == playerData3) {
                                    if (amVar.bO && !z3) {
                                        z3 = true;
                                        f2 = Float.valueOf(amVar.eo);
                                        f3 = Float.valueOf(amVar.ep);
                                        if (!z5) {
                                            amVar.ci();
                                        }
                                    }
                                    if (amVar.bP && !z4) {
                                        z4 = true;
                                        f4 = Float.valueOf(amVar.eo);
                                        f5 = Float.valueOf(amVar.ep);
                                        if (!z6) {
                                            amVar.ci();
                                        }
                                    }
                                }
                            }
                            if (f2 == null) {
                                f2 = f4;
                                f3 = f5;
                            }
                            if (f2 == null) {
                                GameEngine.m5e("placementLocation==null for team:" + playerData3.site);
                            } else {
                                float floatValue = f2.floatValue();
                                float floatValue2 = f3.floatValue();
                                if (i8 == 2) {
                                    for (int i9 = 0; i9 <= 2; i9++) {
                                        if (i9 != 1) {
                                            am a2 = ar.builder.a();
                                            a2.b(playerData3);
                                            a2.eo = (floatValue - 50.0f) + (i9 * 50);
                                            a2.ep = floatValue2;
                                            PlayerData.c(a2);
                                        }
                                    }
                                    for (int i10 = 0; i10 <= 2; i10++) {
                                        am a3 = ar.heavyTank.a();
                                        a3.b(playerData3);
                                        a3.eo = (floatValue - 50.0f) + (i10 * 50);
                                        a3.ep = floatValue2 + 50.0f;
                                        PlayerData.c(a3);
                                    }
                                } else if (i8 == 3 || i8 == 4) {
                                    for (int i11 = 0; i11 <= 2; i11++) {
                                        as a4 = ar.a("combatEngineer");
                                        if (a4 == null) {
                                            GameNetEngine.g("Could not find: combatEngineer on network.setup.startingUnits==3");
                                        } else {
                                            am a5 = a4.a();
                                            a5.b(playerData3);
                                            a5.eo = (floatValue - 50.0f) + (i11 * 50);
                                            a5.ep = floatValue2 + 50.0f;
                                            PlayerData.c(a5);
                                        }
                                    }
                                } else if (i8 == 5) {
                                    as a6 = ar.a("experimentalSpider");
                                    if (a6 == null) {
                                        GameNetEngine.g("Could not find: experimentalSpider on network.setup.startingUnits==5");
                                    } else {
                                        am a7 = a6.a();
                                        a7.b(playerData3);
                                        a7.eo = floatValue;
                                        a7.ep = floatValue2;
                                        a7.cg = 90.0f;
                                        a7.eq = 2.0f;
                                        a7.dc();
                                        PlayerData.c(a7);
                                    }
                                } else if (i8 != 9 && i8 > 10) {
                                    com.corrodinggames.rts.game.units.custom.l c2 = com.corrodinggames.rts.game.units.custom.l.c(i8);
                                    if (c2 == null) {
                                        GameNetEngine.g("Could not find starting unit on startingUnits==" + i8);
                                    } else {
                                        am a8 = c2.a();
                                        a8.b(playerData3);
                                        a8.eo = floatValue;
                                        a8.ep = floatValue2;
                                        if (!a8.bI()) {
                                            a8.cg = 90.0f;
                                        }
                                        if (c2.eI) {
                                            a8.dc();
                                            if (a8 instanceof com.corrodinggames.rts.game.units.custom.j) {
                                                ((com.corrodinggames.rts.game.units.custom.j) a8).dB();
                                            }
                                        }
                                        PlayerData.c(a8);
                                    }
                                }
                            }
                        }
                    }
                }
            }
            if (!z2 && (this.ce == null || !this.ce.q)) {
                a(0.0f, 0.0f);
                int i12 = 0;
                int i13 = 0;
                boolean z7 = false;
                Iterator it2 = am.bE.iterator();
                while (it2.hasNext()) {
                    am amVar2 = (am) it2.next();
                    if (amVar2 instanceof al) {
                        i13++;
                    } else {
                        i12++;
                    }
                    if (amVar2.bX == this.playerTeam && amVar2.bP) {
                        b(amVar2.eo, amVar2.ep);
                        z7 = true;
                    }
                }
                if (!z7) {
                    Iterator it3 = am.bE.iterator();
                    while (it3.hasNext()) {
                        am amVar3 = (am) it3.next();
                        if (amVar3.bX == this.playerTeam && !amVar3.t() && !amVar3.u()) {
                            b(amVar3.eo, amVar3.ep);
                        }
                    }
                }
                m5e("there are " + i12 + " units on this map and " + i13 + " trees");
            }
            this.B = be.c(this.am).b(ak());
            this.bU.a(this.bL, z2);
            this.bW.a(this.bL, z2);
            this.cf.a();
            this.bV.a();
            if (!z2) {
                com.corrodinggames.rts.gameFramework.emitter.a.a();
            }
            this.ca.a(z2);
            this.bS.a(z2);
            if (!z2) {
                this.bS.y();
                aG();
                if (this.bv) {
                    this.bS.y();
                }
            } else {
                this.bS.y();
            }
            this.cc.a(this.bL);
            if (!z2) {
                this.bN.c();
            }
            this.stats.a();
            Iterator it4 = am.bE.iterator();
            while (it4.hasNext()) {
                am amVar4 = (am) it4.next();
                if (amVar4 instanceof com.corrodinggames.rts.game.units.y) {
                    ((com.corrodinggames.rts.game.units.y) amVar4).c(false);
                }
            }
            this.B.e = true;
            this.C.a(this.am);
            this.bG = true;
            this.bH = false;
            this.bI = false;
            if (sVar != com.corrodinggames.rts.gameFramework.s.menu && !this.settingsEngine.hasPlayedGameOrSeenHelp) {
                this.settingsEngine.hasPlayedGameOrSeenHelp = true;
                this.settingsEngine.save();
            }
            for (int i14 = 0; i14 < 5; i14++) {
                System.gc();
            }
            if (!GameEngine.aU) {
                Log.a("RustedWarfare", "getNativeHeapSize" + String.valueOf(Debug.getNativeHeapSize()));
                Log.a("RustedWarfare", "getNativeHeapAllocatedSize" + String.valueOf(Debug.getNativeHeapAllocatedSize()));
                Log.a("RustedWarfare", "getNativeHeapFreeSize" + String.valueOf(Debug.getNativeHeapFreeSize()));
                Log.a("RustedWarfare", "Runtime.getRuntime().maxMemory()" + String.valueOf(Runtime.getRuntime().maxMemory()));
            }
            if (this.dk != null) {
                this.dk.a();
            }
            this.G = 0.0f;
            if (this.netEngine.F && this.netEngine.B) {
                GameEngine.m5e("Disabling network for singleplayer");
                this.netEngine.B = false;
            }
            if (!ax()) {
                if (sVar == com.corrodinggames.rts.gameFramework.s.normalSave) {
                    GameEngine.m5e("Not starting replay recording as we are loading a save");
                } else {
                    this.replayEngine.a(z2);
                }
            }
            if (PathEngine.m) {
            }
        } catch (com.corrodinggames.rts.game.maps.f e2) {
            e2.printStackTrace();
            a("Error loading map: " + e2.getMessage(), 1);
            if (aT) {
                GameEngine.m5e("Crashing on allowed map error because automated testing is active");
                throw new RuntimeException(e2);
            }
            if (!this.netEngine.B && this.ao != null && (i = this.ao.i()) != null) {
                i.m();
            }
            e("Map Load Warning", a(e2));
            this.bI = false;
        }
    }

    private void aG() {
        this.bS.y();
        Iterator it = am.bE.iterator();
        while (it.hasNext()) {
            am amVar = (am) it.next();
            if (amVar.bX == this.playerTeam && (amVar instanceof com.corrodinggames.rts.game.units.y) && amVar.ak() && amVar.s_() && amVar.bT() && !amVar.u() && !amVar.t()) {
                GameEngine.m5e("selectAnyOnScreenBuilder: found builder");
                this.bS.j(amVar);
                return;
            }
        }
        GameEngine.m5e("selectAnyOnScreenBuilder: no builder found");
    }

    @Override // com.corrodinggames.rts.gameFramework.GameEngine
    public void g() {
        com.corrodinggames.rts.gameFramework.utility.o dK = w.dK();
        Iterator it = dK.iterator();
        while (it.hasNext()) {
            ((w) it.next()).a();
        }
        am.bF();
        w.dK();
        int size = dK.size();
        if (size != 0) {
            GameEngine.a("SHOULD_NOT_HAPPEN: we still had " + size + " objects in gameObjectListForLogic after removeAll");
            Iterator it2 = dK.iterator();
            while (it2.hasNext()) {
                w wVar = (w) it2.next();
                String str = "Object: " + wVar.eh;
                if (wVar instanceof am) {
                    str = ((am) wVar).c();
                }
                GameEngine.a("Remaining object: " + str);
            }
            if (GameEngine.getGameEngine().aa()) {
                throw new RuntimeException("We still had " + size + " objects in gameObjectListForLogic after removeAll");
            }
        }
        am.bF().clear();
        w.dK().clear();
        com.corrodinggames.rts.game.units.custom.j.dD();
        this.W.clear();
    }

    public void b(boolean z) {
        synchronized (this.aj) {
            if (this.ao != null) {
                this.ao.l();
            }
            this.bq = false;
            if (!z) {
                this.replayEngine.g();
            }
            this.bU.c();
            g();
            if (!av()) {
                this.bN.f();
            }
            this.bR.a(z);
            if (this.bL != null) {
                this.bL.h();
                this.bL = null;
            }
            if (this.ce != null) {
                this.ce = null;
            }
            if (this.cc != null) {
                this.cc.b();
            }
            this.af = null;
            this.ag = null;
            this.j = 0;
            PlayerData.Y();
            a(com.corrodinggames.rts.gameFramework.player.f.none, com.corrodinggames.rts.gameFramework.player.c.player);
        }
    }

    @Override // com.corrodinggames.rts.gameFramework.GameEngine
    public void a(float f2, int i) {
        synchronized (this.aj) {
            b(f2, i);
        }
    }

    public void b(float f2, int i) {
        if (this.tick == 2) {
            aF();
        } else if (this.tick % 10000 == 0 && this.tick != 0) {
            aF();
        }
        if (aL && !this.aS && at() && Debug.getNativeHeapAllocatedSize() > 209715200) {
            GameEngine.m5e("getNativeHeapAllocatedSize: " + com.corrodinggames.rts.gameFramework.f.g((int) Debug.getNativeHeapAllocatedSize()));
            this.aS = true;
        }
        aE();
        this.eb.a();
        this.ec.b();
        this.cd.a(bs.total);
        this.netEngine.b(f2);
        this.ao = this.ap;
        if (this.ao.b()) {
            this.cd.a(bs.update);
            while (this.k.peek() != null) {
                ((Runnable) this.k.poll()).run();
            }
            if (!this.bG) {
                if (this.aq) {
                    return;
                }
                Log.d("RustedWarfare", "game running without a loaded level!!!");
                h();
                try {
                    Thread.sleep(10L);
                    return;
                } catch (InterruptedException e) {
                    e.printStackTrace();
                    return;
                }
            }
            this.bq = true;
            if (!this.F && this.tick > 5) {
                this.F = true;
                boolean z = this.settingsEngine.numIncompleteLoadAttempts > 1;
                this.settingsEngine.numIncompleteLoadAttempts = 0;
                if (this.ee) {
                    this.settingsEngine.numLoadsSinceRunningGameOrNormalExit = 0;
                }
                this.settingsEngine.save();
                if (this.ee && (this.ef || this.bZ.c() > 0)) {
                    if (this.eg != null) {
                        c("Safe mode", "Started game in safe mode due to " + this.eg + ". Mods have been disabled.");
                    } else if (z) {
                        c("Safe mode", "Started game in safe mode due to failed loading attempts. Mods have been disabled.");
                    } else {
                        c("Safe mode", "Started game in safe mode due to multiple loads without starting a game or exiting. Mods have been disabled.");
                    }
                }
            }
            if (!this.bH && this.bG && this.settingsEngine.numLoadsSinceRunningGameOrNormalExit != 0) {
                this.settingsEngine.numLoadsSinceRunningGameOrNormalExit = 0;
                this.settingsEngine.save();
            }
            this.ca.b();
            float f3 = this.cV * this.cY;
            if (f3 != this.cX) {
                float f4 = (this.da / this.cX) + this.cy;
                float f5 = (this.db / this.cX) + this.cz;
                this.cX = f3;
                k();
                if (this.cZ) {
                    a(this.cy - (((this.da / this.cX) + this.cy) - f4), this.cz - (((this.db / this.cX) + this.cz) - f5));
                    this.cZ = false;
                }
            }
            if (this.cr != 0.0f || this.cs != 0.0f) {
                float f6 = 3.0f * f2;
                float g = this.cr > 0.0f ? com.corrodinggames.rts.gameFramework.f.g(this.cr, f6) : 0.0f;
                if (this.cr < 0.0f) {
                    g = com.corrodinggames.rts.gameFramework.f.f(this.cr, -f6);
                }
                float f7 = g + (0.15f * this.cr);
                float g2 = this.cs > 0.0f ? com.corrodinggames.rts.gameFramework.f.g(this.cs, f6) : 0.0f;
                if (this.cs < 0.0f) {
                    g2 = com.corrodinggames.rts.gameFramework.f.f(this.cs, -f6);
                }
                float f8 = g2 + (0.15f * this.cs);
                if (com.corrodinggames.rts.gameFramework.f.c(this.cr) <= f6) {
                    f7 = this.cr;
                    this.cr = 0.0f;
                } else {
                    this.cr -= f7;
                }
                if (com.corrodinggames.rts.gameFramework.f.c(this.cs) <= f6) {
                    f8 = this.cs;
                    this.cs = 0.0f;
                } else {
                    this.cs -= f8;
                }
                this.cy += f7;
                this.cz += f8;
                a(this.cy, this.cz);
                Q();
            }
            if (this.cR != this.cS) {
                k();
            }
            if (f2 > 3.0f) {
                f2 = 3.0f;
            }
            if (f2 < 0.0f) {
                f2 = 0.0f;
            }
            if (this.bu >= 0.0f) {
                f2 = this.bu;
            }
            this.bA = (int) (this.bA + (f2 * 16.666666f));
            d(f2);
            this.q += i;
            this.r++;
            if (this.r >= 40) {
                if (this.q == 0) {
                    this.q = 1;
                }
                this.s = (int) (((this.r * 1000) / this.q) + 0.5f);
                this.t = this.q / this.r;
                this.q = 0;
                this.r = 0;
                if (this.settingsEngine.showFps) {
                    this.u = this.s + "fps";
                }
            }
            aj();
            for (int i2 = 0; i2 < this.dM.length; i2++) {
                this.dM[i2] = true;
            }
            this.dh = com.corrodinggames.rts.gameFramework.f.a(this.dh, 0.1f * f2);
            this.di = com.corrodinggames.rts.gameFramework.f.a(this.di, 0.1f * f2);
            this.dh = com.corrodinggames.rts.gameFramework.f.b(this.dh, 5.0f);
            this.di = com.corrodinggames.rts.gameFramework.f.b(this.di, 5.0f);
            this.bS.a(f2);
            Q();
            com.corrodinggames.rts.game.maps.b.f();
            if (this.netEngine.B) {
                float f9 = f2;
                if (this.replayEngine.v != 1) {
                    f9 *= this.replayEngine.v;
                }
                this.netEngine.a(f9);
                if (!a(true) && !this.netEngine.Y) {
                    this.G += f9;
                    while (true) {
                        if (this.G <= this.netEngine.getCurrentStepRate()) {
                            break;
                        } else if (this.netEngine.I()) {
                            this.netEngine.Y = true;
                            break;
                        } else {
                            this.G -= this.netEngine.getCurrentStepRate();
                            this.netEngine.a(this.netEngine.getCurrentStepRate(), false);
                            if (this.netEngine.Y) {
                                break;
                            }
                            a(this.netEngine.getCurrentStepRate());
                        }
                    }
                    if (!this.netEngine.isServer) {
                        if (this.netEngine.af || this.netEngine.ad) {
                            if (this.netEngine.af && this.netEngine.ad && this.tick < (this.netEngine.loaclTick - this.netEngine.Q) - 5) {
                                this.netEngine.printLog("nearly within frame range");
                                this.netEngine.af = false;
                            }
                            if (this.tick > this.netEngine.loaclTick - 6) {
                                this.netEngine.printLog("we have back within frame range");
                                this.netEngine.af = false;
                                this.netEngine.ad = false;
                            }
                        }
                        if (!this.netEngine.ad && this.tick < (this.netEngine.loaclTick - this.netEngine.Q) - 10) {
                            this.netEngine.printLog("we are slightly out of frame range, speeding up");
                            this.netEngine.ad = true;
                        }
                        if (!this.netEngine.af && this.tick < (this.netEngine.loaclTick - this.netEngine.Q) - 30) {
                            this.netEngine.printLog("we are out of frame range, fast forwarding (" + this.tick + "->" + this.netEngine.loaclTick + ")");
                            this.netEngine.af = true;
                        }
                        if (!this.netEngine.af && this.netEngine.ad) {
                            this.netEngine.ae += f2;
                            if (this.netEngine.ae > this.netEngine.getCurrentStepRate() * 3.0f) {
                                this.netEngine.ae = 0.0f;
                                this.netEngine.a(this.netEngine.getCurrentStepRate(), true);
                                if (!this.netEngine.Y) {
                                    a(this.netEngine.getCurrentStepRate());
                                }
                            }
                        }
                        if (this.netEngine.af) {
                            this.netEngine.a(this.netEngine.getCurrentStepRate(), true);
                            if (!this.netEngine.Y) {
                                a(this.netEngine.getCurrentStepRate());
                            }
                        }
                        if (this.tick < this.netEngine.loaclTick - 90) {
                            this.netEngine.a(this.netEngine.getCurrentStepRate(), true);
                            if (!this.netEngine.Y) {
                                a(this.netEngine.getCurrentStepRate());
                            }
                        }
                        if (this.tick < this.netEngine.loaclTick - 120) {
                            this.netEngine.a(this.netEngine.getCurrentStepRate(), true);
                            if (!this.netEngine.Y) {
                                a(this.netEngine.getCurrentStepRate());
                            }
                        }
                        if (this.tick < this.netEngine.loaclTick - 600) {
                            this.netEngine.a(this.netEngine.getCurrentStepRate(), true);
                            if (!this.netEngine.Y) {
                                a(this.netEngine.getCurrentStepRate());
                            }
                        }
                    }
                }
            } else if (this.replayEngine.i()) {
                float f10 = f2;
                if (this.replayEngine.v != 1) {
                    f10 *= this.replayEngine.v;
                }
                if (this.bt != 1.0f) {
                    f10 *= this.bt;
                }
                if (!a(false)) {
                    this.G += f10;
                    while (this.G > this.netEngine.getCurrentStepRate()) {
                        this.G -= this.netEngine.getCurrentStepRate();
                        if (this.netEngine.I()) {
                            break;
                        }
                        a(this.netEngine.getCurrentStepRate());
                    }
                }
                if (this.G > 100.0f) {
                    this.G = 100.0f;
                }
                if (this.G < 0.0f) {
                    this.G = 0.0f;
                }
            } else if (!a(false)) {
                a(f2);
            }
            if (a(false)) {
                try {
                    Thread.sleep(2L);
                } catch (Exception e2) {
                }
            }
            this.bU.a(f2);
            this.bM.b(f2);
            this.bN.a(f2);
            this.bT.b();
            SteamEngine.getSteamEngine().a(f2);
            this.cd.b(bs.update);
            this.cd.a(bs.draw);
            if (!this.dv) {
                if (this.bO.a()) {
                    a((com.corrodinggames.rts.gameFramework.unitAction.l) null, f2);
                } else if (this.ao.n()) {
                    a(this.ao.b(true), f2);
                } else {
                    com.corrodinggames.rts.appFramework.f fVar = this.ao;
                    this.ao.a(f2, i);
                    if (fVar.c() && !fVar.e()) {
                        synchronized (fVar.g()) {
                            if (fVar.c() && !fVar.e()) {
                                this.cd.a(bs.update_waiting_on_draw);
                                com.corrodinggames.rts.gameFramework.unitAction.l b2 = fVar.b(true);
                                this.cd.b(bs.update_waiting_on_draw);
                                if (!fVar.e()) {
                                    if (b2 != null) {
                                        if (b2.c()) {
                                            GameEngine.m5e("gameengine draw: bufferedCanvas drawn on");
                                        }
                                        b2.a(true);
                                    }
                                    if (b2 == null) {
                                        GameEngine.f("GameEngine gameViewCanvas is null after lockCanvas - " + fVar.hashCode());
                                    }
                                    a(b2, f2);
                                    this.bO.a((com.corrodinggames.rts.gameFramework.unitAction.l) null);
                                }
                                if (b2 != null) {
                                    try {
                                        fVar.a(b2, true);
                                    } catch (IllegalArgumentException e3) {
                                        e3.printStackTrace();
                                        GameEngine.f("GameEngine catch currentGameView - " + fVar.hashCode());
                                        GameEngine.f("GameEngine catch currentGameView.gameThreadSync - " + fVar.g().hashCode());
                                        fVar.h();
                                    } catch (IllegalStateException e4) {
                                        e4.printStackTrace();
                                        GameEngine.f("GameEngine catch currentGameView - " + fVar.hashCode());
                                        GameEngine.f("GameEngine catch currentGameView.gameThreadSync - " + fVar.g().hashCode());
                                    }
                                }
                            }
                        }
                    }
                    this.ao.b(f2, i);
                }
            }
            this.dv = false;
            Z();
            this.cd.b(bs.draw);
            if (this.du) {
                this.du = false;
                String m = l(this.dl) != null ? m(this.dl) : null;
                if (this.netEngine.B) {
                    m = null;
                    new a().start();
                }
                if (m != null) {
                    GameEngine.m5e("gotoNextLevel: Loading next level: " + m);
                    this.dl = m;
                    this.bS.h.b();
                    a(true, false, com.corrodinggames.rts.gameFramework.s.normal);
                } else {
                    GameEngine.m5e("gotoNextLevel: No next level, finishing");
                    this.bG = false;
                    com.corrodinggames.rts.appFramework.g i3 = this.ao.i();
                    if (i3 != null) {
                        i3.b();
                        i3.m();
                    } else {
                        GameEngine.m5e("gotoNextLevel: Error getInGameActivity==null");
                    }
                }
            }
            if (!this.aq && this.bE && !this.i) {
                m5e("starting method trace");
                Debug.startMethodTracing("lukeTrace", 110000000);
                this.i = true;
            }
            this.bF = true;
            this.ed.a();
            this.cd.b(bs.total);
            this.cd.b();
        }
    }

    /* renamed from: com.corrodinggames.rts.game.i$a */
    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/i$a.class */
    class a extends Thread {
        a() {
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            EngineLoad.this.netEngine.closeServer("gotoNextLevel");
        }
    }

    public void h() {
        com.corrodinggames.rts.appFramework.g i = this.ao.i();
        if (i != null) {
            if (!i.c()) {
                i.b();
                return;
            } else {
                GameEngine.print("stopAndClose: inGameActivity is isFinishing");
                return;
            }
        }
        GameEngine.print("stopAndClose: Error getInGameActivity==null");
    }

    public void a(float f2) {
        if (ay() && f2 < 0.1f) {
            GameNetEngine.g("updateAllGame1: deltaSpeed:" + f2 + " frame:" + this.tick + " network.currentStepRate:" + this.netEngine.getCurrentStepRate());
        }
        if (this.bt != 1.0f && !this.netEngine.B && !this.replayEngine.i()) {
            f2 *= this.bt;
        }
        float f3 = f2 * this.H;
        this.I = f3 + 2.0f;
        this.J = f3;
        this.netEngine.c(f3);
        this.by = (int) (this.by + (f3 * 16.666666f));
        this.cf.c();
        this.replayEngine.a(f3);
        this.tick++;
        PlayerData.g(f3);
        if (this.bL != null) {
            this.bL.e(f3);
        }
        if (ay() && f3 < 0.1f) {
            GameNetEngine.g("updateAllGame2: deltaSpeed:" + f3 + " frame:" + this.tick);
        }
        am.bF();
        com.corrodinggames.rts.gameFramework.utility.o dK = w.dK();
        Object[] b2 = dK.b();
        int size = dK.size();
        boolean ay = ay();
        for (int i = 0; i < size; i++) {
            w wVar = (w) b2[i];
            if (ay && f3 != this.J) {
                GameNetEngine.h("JIT bug detected, attempting to correct. before object:" + wVar.eh + " frame:" + this.tick + " deltaSpeed:" + f3);
                f3 = this.J;
            }
            wVar.a(f3);
        }
        if (ay() && f3 < 0.1f) {
            GameNetEngine.g("updateAllGame3: deltaSpeed:" + f3 + " frame:" + this.tick);
        }
        int size2 = dK.a.size();
        for (int i2 = 0; i2 < size2; i2++) {
            com.corrodinggames.rts.gameFramework.utility.r rVar = (com.corrodinggames.rts.gameFramework.utility.r) dK.a.get(i2);
            if (rVar.a == com.corrodinggames.rts.gameFramework.utility.q.add) {
                w wVar2 = (w) rVar.b;
                if (!wVar2.ej) {
                    wVar2.a(f3);
                }
            }
        }
        this.cd.a(bs.update_geo_indexes);
        this.cc.a();
        this.cd.b(bs.update_geo_indexes);
        com.corrodinggames.rts.game.units.y.g(f3);
        com.corrodinggames.rts.game.units.custom.j.s(f3);
        com.corrodinggames.rts.game.units.custom.j.a(f3, 0);
        this.j++;
        if (this.j >= 1000) {
            this.j = 0;
            int i3 = 0;
            Iterator it = am.bF().iterator();
            while (it.hasNext()) {
                am amVar = (am) it.next();
                if (amVar.bV && !(amVar instanceof al)) {
                    i3++;
                }
            }
            if (i3 > 70) {
                Iterator it2 = am.bF().iterator();
                while (it2.hasNext()) {
                    am amVar2 = (am) it2.next();
                    if ((amVar2 instanceof am) && amVar2.bV && !(amVar2 instanceof al) && amVar2.bW < this.by - 30000 && i3 > 70) {
                        amVar2.a();
                        i3--;
                    }
                }
            }
        }
        this.cd.a(bs.update_all_team_and_ai);
        PlayerData.f(f3);
        this.cd.b(bs.update_all_team_and_ai);
        com.corrodinggames.rts.gameFramework.emitter.a.a(f3);
        this.bR.a(f3);
        this.D.a(f3);
        com.corrodinggames.rts.gameFramework.utility.y.a(f3);
        if (this.ce != null) {
            this.ce.c(f3);
        }
        this.cd.a(bs.update_groupcontroller);
        this.bV.a(f3);
        this.cd.b(bs.update_groupcontroller);
        this.cd.a(bs.update_minimap);
        this.bW.a(f3);
        this.cd.b(bs.update_minimap);
        this.bU.b(f3);
        if (this.cg != null) {
            this.cg.b();
        }
        this.stats.b();
    }

    public void a(com.corrodinggames.rts.gameFramework.unitAction.l lVar, float f2) {
        synchronized (this.ak) {
            b(lVar, f2);
        }
    }

    public boolean i() {
        if (this.K == null) {
            this.K = new j("assets/shaders/post_base.frag");
        }
        if (this.L == null) {
            this.L = new j("assets/shaders/post_displacement.frag");
        }
        this.K.a(this.bO);
        this.L.a(this.bO);
        if (this.K.g || this.L.g) {
            if (!this.M) {
                this.M = true;
                GameEngine.m5e("setupPostprocessing: failed");
                return false;
            }
            return false;
        }
        return true;
    }

    public void a(j jVar) {
        if (this.N != null) {
            throw new RuntimeException("Layer already enabled");
        }
        this.N = this.bO;
        this.bO = jVar.b;
        this.bO.i();
        this.bO.a(new Rect(0, 0, this.bO.m(), this.bO.n()));
        this.bO.b(jVar.f, jVar.e);
    }

    public void b(j jVar) {
        if (this.N == null) {
            throw new RuntimeException("Layer not enabled");
        }
        this.bO.j();
        this.bO.p();
        this.bO = this.N;
        this.N = null;
        this.bO.b(jVar.f, jVar.e);
    }

    public void b(com.corrodinggames.rts.gameFramework.unitAction.l lVar, float f2) {
        if (lVar == null) {
            b("drawAll", "canvas is null, not may not be available yet");
        } else if (aB) {
        } else {
            this.bO.a(lVar);
            this.bO.a(this.ao.d());
            this.bO.g();
            this.bz++;
            com.corrodinggames.rts.gameFramework.unitAction.h.G = 0.0f;
            if (this.du) {
                this.bO.b(Color.a(0, 0, 0));
                this.bO.a("Loading..", this.co, this.cp, this.dp);
                return;
            }
            float f3 = this.cn;
            if (f3 != 1.0f) {
                this.bO.i();
                this.bO.a(f3, f3);
            }
            boolean aA = GameEngine.aA();
            if (aA && h(113) && h(44)) {
                aA = false;
            }
            if (aA && !i()) {
                aA = false;
            }
            if (aA) {
                a(this.K);
                try {
                    this.bO.b(Color.a(0, 0, 0));
                    this.cd.a(bs.draw_game);
                    c((com.corrodinggames.rts.gameFramework.unitAction.l) null, f2);
                    this.cd.b(bs.draw_game);
                    b(this.K);
                    this.K.b();
                    if (!this.L.a()) {
                        a(this.L);
                        try {
                            this.bO.b(Color.a(128, 128, 255));
                            R();
                            int a2 = this.bR.a(f2, 3);
                            this.bR.l = null;
                            b(this.L);
                            if (a2 > 0) {
                                float s = this.bO.s();
                                this.L.d.a("screenBase", this.K.a);
                                this.L.d.b("screenBaseSize", this.K.a);
                                this.L.d.a("u_resolution", this.cl, this.cm);
                                this.L.d.a("u_offsetBy", 0.2f * this.cX);
                                this.L.d.a("u_uiScaling", s);
                                this.L.b();
                            }
                        } catch (Throwable th) {
                            b(this.L);
                            throw th;
                        }
                    }
                } catch (Throwable th2) {
                    b(this.K);
                    throw th2;
                }
            } else {
                this.cd.a(bs.draw_game);
                c(lVar, f2);
                this.cd.b(bs.draw_game);
            }
            if (!A()) {
                this.cd.a(bs.draw_gui);
                d(lVar, f2);
                this.cd.b(bs.draw_gui);
            }
            if (this.settingsEngine.showFps && this.cT == 0.0f && !this.cU && !this.cS) {
                this.bO.a(this.u, 100.0f, 35.0f, this.m);
            }
            if (f != null) {
                this.bO.a(f, 100.0f, 85.0f, this.m);
            }
            if (!this.aq && (this.bO.d() != null || GameEngine.aW)) {
                this.bS.c(f2);
            }
            if (!A()) {
                this.bR.a(f2, 4);
            }
            com.corrodinggames.rts.game.units.custom.j.dE();
            this.bO.h();
            if (f3 != 1.0f) {
                lVar.a();
            }
        }
    }

    public boolean j() {
        if (!this.settingsEngine.showUnitIcons) {
            return false;
        }
        if (this.cX >= 0.7d || this.cE < this.bL.i() - 5.0f || this.cB < this.bL.j() - 5.0f) {
            return C() ? ((double) this.cX) < 0.1d : av() ? ((double) this.cX) < 0.27d : ((double) this.cX) < 0.4d;
        }
        return true;
    }

    public void b(float f2) {
        boolean z = false;
        if (this.cQ.a < 0 || this.cQ.b < 0 || this.cQ.c > this.bL.i() || this.cQ.d > this.bL.j()) {
            z = true;
        }
        if (z) {
            this.bO.b(Color.a(0, 0, 0));
        }
    }

    public void c(float f2) {
    }

    public void c(com.corrodinggames.rts.gameFramework.unitAction.l lVar, float f2) {
        if (!this.bG) {
            return;
        }
        this.cd.a(bs.update_game_shouldDraw);
        this.X.b();
        this.dw = 0;
        boolean z = false;
        w[] a2 = am.er.a();
        int size = w.er.size();
        for (int i = 0; i < size; i++) {
            w wVar = a2[i];
            boolean z2 = wVar.el;
            boolean a3 = wVar.a(this);
            wVar.el = a3;
            if (z2 != a3) {
                z = true;
            }
            if (a3) {
                this.X.add(wVar);
            }
        }
        if (this.W.size() != this.X.size()) {
            z = true;
        }
        this.cd.b(bs.update_game_shouldDraw);
        this.cd.a(bs.update_game_sortRender);
        if (z) {
            com.corrodinggames.rts.gameFramework.utility.s sVar = this.W;
            this.W = this.X;
            this.X = sVar;
        }
        if (!j()) {
            Collections.sort(this.W, w.ei);
        }
        this.cd.b(bs.update_game_sortRender);
        this.cd.a(bs.draw_setup);
        this.cd.a(bs.draw_setup_clip);
        this.bO.i();
        this.bO.a(this.cK);
        this.cd.b(bs.draw_setup_clip);
        this.cd.a(bs.draw_setup_fill);
        b(f2);
        this.cd.b(bs.draw_setup_fill);
        if (this.settingsEngine.renderFancyWater) {
            if (this.O == null) {
                this.O = this.bO.a(AssetsID.drawable.water_cloud);
            }
            if (this.P == null) {
                this.P = this.bO.a(AssetsID.drawable.water_layer1);
            }
            if (this.Q == null) {
                this.Q = this.bO.a(AssetsID.drawable.water_layer2);
            }
            this.S.a(this.cK);
            this.R += 0.05f * f2;
            if (this.R > 100.0f) {
                this.R -= 100.0f;
            }
            this.bO.a(this.O, this.S, (Paint) null, this.cu / 6, this.cv / 6, 1, 1);
            this.S.a(this.cL);
            this.T.a(this.cL);
            this.bO.i();
            R();
            this.bO.a(this.Q, this.T, (Paint) null, this.cu + this.R, this.cv + this.R, 0, 0);
            this.bO.a(this.P, this.T, (Paint) null, this.cu, this.cv, 0, 0);
            this.bO.j();
        }
        this.cd.a(bs.draw_setup_drawMap);
        if (this.bL != null && ar()) {
            this.bL.d(f2);
        }
        this.cd.b(bs.draw_setup_drawMap);
        R();
        this.bO.a(this.cL);
        boolean j = j();
        this.bU.c(f2);
        this.cd.b(bs.draw_setup);
        w[] a4 = this.W.a();
        int size2 = this.W.size();
        this.dc = true;
        this.dd = true;
        this.de = true;
        this.df = true;
        this.dg = true;
        if (this.cX < 0.45d) {
            this.de = false;
            this.dc = false;
            this.dg = false;
        }
        if (this.cX < 0.3d) {
            this.df = false;
            this.dd = false;
        }
        if (!j) {
            for (int i2 = 0; i2 < size2; i2++) {
                w wVar2 = a4[i2];
                if (wVar2.em == 0) {
                    wVar2.c(f2);
                }
            }
        }
        com.corrodinggames.rts.gameFramework.emitter.a.b(f2);
        this.cd.a(bs.draw_game_effects);
        this.bR.b(f2);
        this.bR.a(f2, 1);
        this.cd.b(bs.draw_game_effects);
        this.cd.a(bs.draw_game_unit);
        if (j) {
            if (this.bS.q() == 0) {
                am.bI.a(255, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_BUTTON_8, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_BUTTON_8, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_BUTTON_8);
                am.bJ.a(255, 255, 255, 255);
            } else {
                am.bI.a(175, 175, 175, 175);
                am.bJ.a(255, 255, 255, 255);
            }
            for (int i3 = 0; i3 < size2; i3++) {
                w wVar3 = a4[i3];
                if (!wVar3.f(f2)) {
                    wVar3.c(f2);
                }
            }
            for (int i4 = 0; i4 < size2; i4++) {
                w wVar4 = a4[i4];
                wVar4.a(f2, true);
                wVar4.p(f2);
            }
        } else {
            for (int i5 = 0; i5 < size2; i5++) {
                a4[i5].d(f2);
            }
            for (int i6 = 0; i6 < size; i6++) {
                w wVar5 = a2[i6];
                if (!wVar5.el) {
                    if (wVar5 instanceof am) {
                        am amVar = (am) wVar5;
                        if (amVar.cG) {
                            if (amVar.bX != this.playerTeam && !amVar.cf()) {
                            }
                        }
                    }
                }
                wVar5.e(f2);
                if (!wVar5.el) {
                    wVar5.p(f2);
                }
            }
            for (int i7 = 0; i7 < size2; i7++) {
                w wVar6 = a4[i7];
                if (wVar6.em != 0 && wVar6.em != 10) {
                    wVar6.c(f2);
                }
            }
            for (int i8 = 0; i8 < size2; i8++) {
                w wVar7 = a4[i8];
                wVar7.a(f2, false);
                wVar7.p(f2);
            }
            PlayerData.h(f2);
        }
        this.de = true;
        this.df = true;
        this.cd.b(bs.draw_game_unit);
        this.cd.a(bs.draw_game_effects);
        this.bR.a(f2, 2);
        this.cd.b(bs.draw_game_effects);
        for (int i9 = 0; i9 < size2; i9++) {
            w wVar8 = a4[i9];
            if (wVar8.em == 10) {
                wVar8.c(f2);
            }
        }
        this.D.b(f2);
        if (this.ce != null) {
            this.ce.a(f2);
        }
        c(f2);
        com.corrodinggames.rts.gameFramework.utility.y.b(f2);
        this.cc.c(f2);
        this.cd.a(bs.draw_end);
        this.bO.j();
        this.cd.b(bs.draw_end);
    }

    public void d(com.corrodinggames.rts.gameFramework.unitAction.l lVar, float f2) {
        this.bS.b(f2);
        if (this.ce != null) {
            this.ce.b(f2);
        }
        this.bW.e(f2);
        if (this.settingsEngine.showFps && this.cT == 0.0f) {
            this.cd.c();
        }
        if (this.ch) {
            this.bO.a("Look Mode", this.co, this.cp, this.dp);
        }
        if (this.bm) {
            int i = 20;
            for (int i2 = 0; i2 < PlayerData.c; i2++) {
                PlayerData playerData = PlayerData.getPlayerData(i2);
                if (playerData != null && (playerData instanceof com.corrodinggames.rts.game.a.a)) {
                    com.corrodinggames.rts.game.a.a aVar = (com.corrodinggames.rts.game.a.a) playerData;
                    this.bO.a(aVar.site + "| c:" + aVar.credits, 20.0f, i, this.dn);
                    i += 20;
                }
            }
        }
    }

    public void k() {
        this.cj = W();
        X();
        this.co = this.cl / 2.0f;
        this.cp = this.cm / 2.0f;
        this.cq = (int) (this.cm / 3.0f);
        if (av()) {
            this.cq = (int) (this.cm / 2.5f);
        }
        float f2 = (int) (this.cl / 3.0f);
        if (this.cq > f2) {
            this.cq = f2;
        }
        this.cq = com.corrodinggames.rts.gameFramework.f.b(this.cq, 60.0f, (int) (250.0f * this.cj));
        float f3 = this.cy + this.cI;
        float f4 = this.cz + this.cJ;
        if (this.cS) {
            this.cF = this.cl;
            this.cG = this.cl;
        } else {
            this.cG = (this.cl - this.cq) + 1.0f;
            if (InterfaceEngine.bO) {
                this.cF = this.cl;
            } else {
                this.cF = this.cG;
            }
        }
        if (this.cF < 1.0f) {
            this.cF = 1.0f;
        }
        if (this.cG < 1.0f) {
            this.cG = 1.0f;
        }
        if (this.cR != this.cS) {
            if (!this.cS) {
                f3 -= (this.cq / 2.0f) / this.cX;
            } else {
                f3 += (this.cq / 2.0f) / this.cX;
            }
        }
        this.cR = this.cS;
        this.cH = this.cm;
        this.cA = this.cF / this.cX;
        this.cB = this.cH / this.cX;
        this.cE = this.cG / this.cX;
        this.cI = this.cA / 2.0f;
        this.cJ = this.cB / 2.0f;
        this.cK.a(0, 0, (int) this.cF, (int) this.cH);
        this.cL.a(0, 0, ((int) this.cA) + 1, ((int) this.cB) + 1);
        this.cM.a(0.0f, 0.0f, this.cA + 1.0f, this.cB + 1.0f);
        a(f3 - this.cI, f4 - this.cJ);
    }

    @Override // com.corrodinggames.rts.gameFramework.GameEngine
    public void b(int i, int i2) {
        a(i, i2, 1.0f);
    }

    public void a(int i, int i2, float f2) {
        this.cl = i;
        this.cm = i2;
        this.cn = f2;
        k();
    }

    @Override // com.corrodinggames.rts.gameFramework.GameEngine
    public String l() {
        if (GameEngine.aX) {
            return "com.corrodinggames.rts.java";
        }
        if (GameEngine.aY) {
            return "com.corrodinggames.rts.gdx";
        }
        if (aU) {
            return "com.corrodinggames.rts.server";
        }
        if (this.am == null) {
            return "<null context>";
        }
        return this.am.h();
    }

    @Override // com.corrodinggames.rts.gameFramework.GameEngine
    public String m() {
        if (GameEngine.aX) {
            return "java";
        }
        if (GameEngine.aY) {
            return "java-gdx";
        }
        if (aU) {
            return "dedicatedServer";
        }
        if (this.am == null) {
            return "<null context>";
        }
        try {
            return this.am.f().getInstallerPackageName(l());
        } catch (IllegalArgumentException e) {
            return "IllegalArgumentException: " + e.getMessage();
        }
    }

    @Override // com.corrodinggames.rts.gameFramework.GameEngine
    public boolean n() {
        if (v().contains("p")) {
            return true;
        }
        return false;
    }

    @Override // com.corrodinggames.rts.gameFramework.GameEngine
    public int c(boolean z) {
        if (aU || z) {
            return 176;
        }
        try {
            return this.am.f().getPackageInfo(this.am.h(), 0).versionCode;
        } catch (PackageManager.NameNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public String o() {
        if (!at()) {
            return null;
        }
        try {
            Signature[] signatureArr = this.am.f().getPackageInfo(this.am.h(), 64).signatures;
            if (0 < signatureArr.length) {
                return com.corrodinggames.rts.gameFramework.f.b(signatureArr[0].toByteArray());
            }
            return null;
        } catch (PackageManager.NameNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    @Override // com.corrodinggames.rts.gameFramework.GameEngine
    public boolean p() {
        if (!GameEngine.aZ) {
            if (q() || aV) {
                return true;
            }
            return false;
        }
        return false;
    }

    public boolean q() {
        if (com.corrodinggames.rts.game.units.y.class.getSimpleName().equals("OrderableUnit")) {
            return true;
        }
        return false;
    }

    @Override // com.corrodinggames.rts.gameFramework.GameEngine
    public String r() {
        String t = t();
        if (VariableScope.nullOrMissingString != 0 && !VariableScope.nullOrMissingString.equals(VariableScope.nullOrMissingString)) {
            t = t + "-";
        }
        return t;
    }

    @Override // com.corrodinggames.rts.gameFramework.GameEngine
    public void s() {
        a = null;
        t();
    }

    @Override // com.corrodinggames.rts.gameFramework.GameEngine
    public String t() {
        if (a != null) {
            return a;
        }
        String str = "v" + u();
        if (!GameEngine.as || aV) {
            str = "DEBUG BUILD - " + str;
        } else if (GameEngine.at) {
            str = "TESTING BUILD - " + str;
        } else if (str.contains("p")) {
            str = "BETA VERSION - " + str;
        }
        if (!GameEngine.aZ && q()) {
            str = "RAW - " + str;
        }
        a = str;
        return a;
    }

    @Override // com.corrodinggames.rts.gameFramework.GameEngine
    public String u() {
        return "1.15";
    }

    @Override // com.corrodinggames.rts.gameFramework.GameEngine
    public String v() {
        return "1.15";
    }

    public synchronized void w() {
        this.ac = false;
        if (this.ab != null) {
            this.ab.cancel();
            this.ab = null;
        }
    }

    @Override // com.corrodinggames.rts.gameFramework.GameEngine
    public synchronized void a(Activity activity, com.corrodinggames.rts.appFramework.f fVar, boolean z) {
        synchronized (this.ad) {
            if (!aU) {
                fVar.a();
            }
            this.an = activity;
            this.aq = z;
            this.cS = this.aq;
            if (z && !this.bG && !this.bI && !GameEngine.ay && !this.netEngine.B) {
                x();
            }
            com.corrodinggames.rts.appFramework.f fVar2 = this.ap;
            if (this.ao == null) {
                this.ao = fVar;
            }
            this.ap = fVar;
            if (fVar2 != null && fVar2 != fVar) {
                fVar2.j();
            }
            if (fVar != null) {
                fVar.m();
            }
            if (this.bS != null) {
                this.bS.e();
            }
            w();
            J();
        }
    }

    @Override // com.corrodinggames.rts.gameFramework.GameEngine
    public synchronized void x() {
        if (this.ae > 20) {
            return;
        }
        int i = this.settingsEngine.nextBackgroundMap;
        this.settingsEngine.nextBackgroundMap++;
        if (this.settingsEngine.nextBackgroundMap > 3) {
            this.settingsEngine.nextBackgroundMap = 1;
        }
        this.settingsEngine.save();
        int b2 = com.corrodinggames.rts.gameFramework.f.b(i, 1, 3);
        this.dm = null;
        this.dl = "maps/menu_background/menu" + b2 + ".tmx";
        try {
            PlayerData.b(10, true);
            for (int i2 = 0; i2 < PlayerData.c; i2++) {
                com.corrodinggames.rts.game.a.a aVar = new com.corrodinggames.rts.game.a.a(i2);
                if (i2 == 0) {
                    this.playerTeam = aVar;
                }
            }
            a(false, com.corrodinggames.rts.gameFramework.s.menu);
            this.bH = true;
            this.bS.y();
            if (!this.bG) {
                GameEngine.g("Menu load failed");
                this.ae++;
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    void d(float f2) {
        if (this.aq && !this.bH) {
            if (this.ag == null) {
                this.ag = y();
                if (this.af == this.ag) {
                    this.ag = null;
                }
            }
            if (this.af == null) {
                this.af = this.ag;
                this.ag = null;
            }
            if (this.ah != 0.0f && this.ag != null) {
                a(f2, this.ag.eo, this.ag.ep, this.ah * 0.5f);
            }
            if (this.af != null) {
                boolean a2 = a(f2, this.af.eo, this.af.ep, (1.0f - this.ah) * 0.5f);
                if (com.corrodinggames.rts.gameFramework.f.a(this.cy + this.cI, this.cz + this.cJ, this.af.eo, this.af.ep) < 6400.0f) {
                    a2 = true;
                }
                if (a2) {
                    this.ai = true;
                }
            }
            if (this.ai) {
                this.ah += 0.01f * f2;
                if (this.ah >= 1.0f) {
                    this.ah = 0.0f;
                    this.af = null;
                    this.ai = false;
                }
            }
        }
    }

    am a(PlayerData playerData) {
        int i = 0;
        Iterator it = am.bE.iterator();
        while (it.hasNext()) {
            am amVar = (am) it.next();
            if (!amVar.u() && (amVar.bX == playerData || playerData == null)) {
                i++;
            }
        }
        if (i > 0) {
            int rand = com.corrodinggames.rts.gameFramework.f.rand(0, i - 1);
            int i2 = 0;
            Iterator it2 = am.bE.iterator();
            while (it2.hasNext()) {
                am amVar2 = (am) it2.next();
                if (!amVar2.u() && (amVar2.bX == playerData || playerData == null)) {
                    if (i2 == rand) {
                        return amVar2;
                    }
                    i2++;
                }
            }
            return null;
        }
        return null;
    }

    am y() {
        am a2 = a(this.playerTeam);
        if (a2 != null) {
            return a2;
        }
        return a((PlayerData) null);
    }

    public boolean a(float f2, float f3, float f4, float f5) {
        float d = com.corrodinggames.rts.gameFramework.f.d(this.cy + this.cI, this.cz + this.cJ, f3, f4);
        float a2 = com.corrodinggames.rts.gameFramework.f.a(this.cy + this.cI, this.cz + this.cJ, f3, f4);
        float f6 = f5 * f2;
        float f7 = 15.0f;
        if (15.0f < f6 + 1.0f) {
            f7 = f6 + 1.0f;
        }
        if (a2 < f7 * f7 || this.ct) {
            return true;
        }
        this.cC += com.corrodinggames.rts.gameFramework.f.k(d) * f6;
        this.cD += com.corrodinggames.rts.gameFramework.f.j(d) * f6;
        if (com.corrodinggames.rts.gameFramework.f.c(this.cC) >= 1.0f || com.corrodinggames.rts.gameFramework.f.c(this.cD) >= 1.0f) {
            this.cy += this.cC;
            this.cz += this.cD;
            this.cC = 0.0f;
            this.cD = 0.0f;
            a(this.cy, this.cz);
            return false;
        }
        return false;
    }

    @Override // com.corrodinggames.rts.gameFramework.GameEngine
    public int z() {
        return this.d;
    }
}