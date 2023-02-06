package com.corrodinggames.rts.game.units;

import android.graphics.Paint;
import android.graphics.PointF;
import com.corrodinggames.rts.AssetsID;
import com.corrodinggames.rts.game.PlayerData;
import com.corrodinggames.rts.game.Projectile;
import com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.Interface.InterfaceEngine;
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
    PointF[] a;
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
    static com.corrodinggames.rts.game.units.a.s h = new com.corrodinggames.rts.game.units.a.s("reloadUnits") { // from class: com.corrodinggames.rts.game.units.h.1
        @Override // com.corrodinggames.rts.game.units.a.s
        public boolean a(am amVar, boolean z2) {
            if (h.w()) {
                return false;
            }
            return true;
        }

        @Override // com.corrodinggames.rts.game.units.a.s
        public String a() {
            return "Reload all unit data from disk (for modding)";
        }

        @Override // com.corrodinggames.rts.game.units.a.s
        public String b() {
            return "Reload units";
        }

        @Override // com.corrodinggames.rts.game.units.a.s
        public int c() {
            return 0;
        }

        @Override // com.corrodinggames.rts.game.units.a.s
        public int b(am amVar, boolean z2) {
            return -1;
        }

        @Override // com.corrodinggames.rts.game.units.a.s
        /* renamed from: g_ */
        public ar mo3i() {
            return null;
        }

        @Override // com.corrodinggames.rts.game.units.a.s
        public com.corrodinggames.rts.game.units.a.u e() {
            return com.corrodinggames.rts.game.units.a.u.none;
        }

        @Override // com.corrodinggames.rts.game.units.a.s
        public com.corrodinggames.rts.game.units.a.t f() {
            return com.corrodinggames.rts.game.units.a.t.action;
        }

        @Override // com.corrodinggames.rts.game.units.a.s
        public boolean g() {
            return false;
        }

        @Override // com.corrodinggames.rts.game.units.a.s
        public boolean h() {
            return true;
        }
    };
    static com.corrodinggames.rts.game.units.a.s i = new com.corrodinggames.rts.game.units.a.s("reloadOnlyActiveUnits") { // from class: com.corrodinggames.rts.game.units.h.12
        @Override // com.corrodinggames.rts.game.units.a.s
        public boolean a(am amVar, boolean z2) {
            if (h.w()) {
                return false;
            }
            return true;
        }

        @Override // com.corrodinggames.rts.game.units.a.s
        public String a() {
            return "Reload data only for active units on map (for modding). This is a faster than reload but will be incomplete.";
        }

        @Override // com.corrodinggames.rts.game.units.a.s
        public String b() {
            return "Quick reload";
        }

        @Override // com.corrodinggames.rts.game.units.a.s
        public int c() {
            return 0;
        }

        @Override // com.corrodinggames.rts.game.units.a.s
        public int b(am amVar, boolean z2) {
            return -1;
        }

        @Override // com.corrodinggames.rts.game.units.a.s
        /* renamed from: k */
        public ar mo3i() {
            return null;
        }

        @Override // com.corrodinggames.rts.game.units.a.s
        public com.corrodinggames.rts.game.units.a.u e() {
            return com.corrodinggames.rts.game.units.a.u.none;
        }

        @Override // com.corrodinggames.rts.game.units.a.s
        public com.corrodinggames.rts.game.units.a.t f() {
            return com.corrodinggames.rts.game.units.a.t.action;
        }

        @Override // com.corrodinggames.rts.game.units.a.s
        public boolean g() {
            return false;
        }

        @Override // com.corrodinggames.rts.game.units.a.s
        public boolean h() {
            return true;
        }
    };
    static com.corrodinggames.rts.game.units.a.s j = new com.corrodinggames.rts.game.units.a.s("unitClone") { // from class: com.corrodinggames.rts.game.units.h.17
        @Override // com.corrodinggames.rts.game.units.a.s
        public String a() {
            return "Clones units at point x50";
        }

        @Override // com.corrodinggames.rts.game.units.a.s
        public String b() {
            return "Unit Clone";
        }

        @Override // com.corrodinggames.rts.game.units.a.s
        public int c() {
            return 0;
        }

        @Override // com.corrodinggames.rts.game.units.a.s
        public int b(am amVar, boolean z2) {
            return -1;
        }

        @Override // com.corrodinggames.rts.game.units.a.s
        /* renamed from: k */
        public ar mo3i() {
            return null;
        }

        @Override // com.corrodinggames.rts.game.units.a.s
        public com.corrodinggames.rts.game.units.a.u e() {
            return com.corrodinggames.rts.game.units.a.u.targetGround;
        }

        @Override // com.corrodinggames.rts.game.units.a.s
        public com.corrodinggames.rts.game.units.a.t f() {
            return com.corrodinggames.rts.game.units.a.t.action;
        }

        @Override // com.corrodinggames.rts.game.units.a.s
        public boolean g() {
            return false;
        }

        @Override // com.corrodinggames.rts.game.units.a.s
        public boolean a(am amVar, boolean z2) {
            return true;
        }

        @Override // com.corrodinggames.rts.game.units.a.s
        public boolean h() {
            return true;
        }
    };
    static com.corrodinggames.rts.game.units.a.s k = new com.corrodinggames.rts.game.units.a.s("removeUnits") { // from class: com.corrodinggames.rts.game.units.h.18
        @Override // com.corrodinggames.rts.game.units.a.s
        public String a() {
            return "Delete all units at a point";
        }

        @Override // com.corrodinggames.rts.game.units.a.s
        public String b() {
            return "Delete units at";
        }

        @Override // com.corrodinggames.rts.game.units.a.s
        public boolean h_() {
            return false;
        }

        @Override // com.corrodinggames.rts.game.units.a.s
        public int c() {
            return 0;
        }

        @Override // com.corrodinggames.rts.game.units.a.s
        public int b(am amVar, boolean z2) {
            return -1;
        }

        @Override // com.corrodinggames.rts.game.units.a.s
        /* renamed from: i_ */
        public ar mo3i() {
            return null;
        }

        @Override // com.corrodinggames.rts.game.units.a.s
        public com.corrodinggames.rts.game.units.a.u e() {
            return com.corrodinggames.rts.game.units.a.u.targetGround;
        }

        @Override // com.corrodinggames.rts.game.units.a.s
        public com.corrodinggames.rts.game.units.a.t f() {
            return com.corrodinggames.rts.game.units.a.t.action;
        }

        @Override // com.corrodinggames.rts.game.units.a.s
        public boolean g() {
            return false;
        }

        @Override // com.corrodinggames.rts.game.units.a.s
        public boolean a(am amVar, boolean z2) {
            return true;
        }

        @Override // com.corrodinggames.rts.game.units.a.s
        public boolean h() {
            return true;
        }
    };
    static com.corrodinggames.rts.game.units.a.s l = new com.corrodinggames.rts.game.units.a.s("killUnits") { // from class: com.corrodinggames.rts.game.units.h.19
        @Override // com.corrodinggames.rts.game.units.a.s
        public String a() {
            return "Kill units at a point";
        }

        @Override // com.corrodinggames.rts.game.units.a.s
        public String b() {
            return "Kill units at";
        }

        @Override // com.corrodinggames.rts.game.units.a.s
        public boolean h_() {
            return false;
        }

        @Override // com.corrodinggames.rts.game.units.a.s
        public int c() {
            return 0;
        }

        @Override // com.corrodinggames.rts.game.units.a.s
        public int b(am amVar, boolean z2) {
            return -1;
        }

        @Override // com.corrodinggames.rts.game.units.a.s
        /* renamed from: j_ */
        public ar mo3i() {
            return null;
        }

        @Override // com.corrodinggames.rts.game.units.a.s
        public com.corrodinggames.rts.game.units.a.u e() {
            return com.corrodinggames.rts.game.units.a.u.targetGround;
        }

        @Override // com.corrodinggames.rts.game.units.a.s
        public com.corrodinggames.rts.game.units.a.t f() {
            return com.corrodinggames.rts.game.units.a.t.action;
        }

        @Override // com.corrodinggames.rts.game.units.a.s
        public boolean g() {
            return false;
        }

        @Override // com.corrodinggames.rts.game.units.a.s
        public boolean a(am amVar, boolean z2) {
            return true;
        }

        @Override // com.corrodinggames.rts.game.units.a.s
        public boolean h() {
            return true;
        }
    };
    static com.corrodinggames.rts.game.units.a.s m = new com.corrodinggames.rts.game.units.a.s("finishQueue") { // from class: com.corrodinggames.rts.game.units.h.20
        @Override // com.corrodinggames.rts.game.units.a.s
        public String a() {
            return "Finish all unit queues at";
        }

        @Override // com.corrodinggames.rts.game.units.a.s
        public String b() {
            return "Finish queue at";
        }

        @Override // com.corrodinggames.rts.game.units.a.s
        public boolean h_() {
            return false;
        }

        @Override // com.corrodinggames.rts.game.units.a.s
        public int c() {
            return 0;
        }

        @Override // com.corrodinggames.rts.game.units.a.s
        public int b(am amVar, boolean z2) {
            return -1;
        }

        @Override // com.corrodinggames.rts.game.units.a.s
        /* renamed from: k_ */
        public ar mo3i() {
            return null;
        }

        @Override // com.corrodinggames.rts.game.units.a.s
        public com.corrodinggames.rts.game.units.a.u e() {
            return com.corrodinggames.rts.game.units.a.u.targetGround;
        }

        @Override // com.corrodinggames.rts.game.units.a.s
        public com.corrodinggames.rts.game.units.a.t f() {
            return com.corrodinggames.rts.game.units.a.t.action;
        }

        @Override // com.corrodinggames.rts.game.units.a.s
        public boolean g() {
            return false;
        }

        @Override // com.corrodinggames.rts.game.units.a.s
        public boolean a(am amVar, boolean z2) {
            return true;
        }

        @Override // com.corrodinggames.rts.game.units.a.s
        public boolean h() {
            return true;
        }
    };
    static com.corrodinggames.rts.game.units.a.s n = new com.corrodinggames.rts.game.units.a.s("nukeAt") { // from class: com.corrodinggames.rts.game.units.h.21
        @Override // com.corrodinggames.rts.game.units.a.s
        public String a() {
            return "Create a nuke at a point";
        }

        @Override // com.corrodinggames.rts.game.units.a.s
        public String b() {
            return "Nuke at";
        }

        @Override // com.corrodinggames.rts.game.units.a.s
        public boolean h_() {
            return false;
        }

        @Override // com.corrodinggames.rts.game.units.a.s
        public int c() {
            return 0;
        }

        @Override // com.corrodinggames.rts.game.units.a.s
        public int b(am amVar, boolean z2) {
            return -1;
        }

        @Override // com.corrodinggames.rts.game.units.a.s
        /* renamed from: l_ */
        public ar mo3i() {
            return null;
        }

        @Override // com.corrodinggames.rts.game.units.a.s
        public com.corrodinggames.rts.game.units.a.u e() {
            return com.corrodinggames.rts.game.units.a.u.targetGround;
        }

        @Override // com.corrodinggames.rts.game.units.a.s
        public com.corrodinggames.rts.game.units.a.t f() {
            return com.corrodinggames.rts.game.units.a.t.action;
        }

        @Override // com.corrodinggames.rts.game.units.a.s
        public boolean g() {
            return false;
        }

        @Override // com.corrodinggames.rts.game.units.a.s
        public boolean a(am amVar, boolean z2) {
            return true;
        }

        @Override // com.corrodinggames.rts.game.units.a.s
        public boolean h() {
            return true;
        }
    };
    static com.corrodinggames.rts.game.units.a.s o = new com.corrodinggames.rts.game.units.a.x("freezeAI") { // from class: com.corrodinggames.rts.game.units.h.22
        @Override // com.corrodinggames.rts.game.units.a.s
        public String a() {
            return "Freeze high level AI logic (120secs)";
        }

        @Override // com.corrodinggames.rts.game.units.a.s
        public String b() {
            return "Freeze AI";
        }

        @Override // com.corrodinggames.rts.game.units.a.s
        public String d() {
            String str = "Freeze AI";
            GameEngine.getGameEngine();
            h L = h.L();
            if (L != null) {
                int i2 = -1;
                if (L.bX instanceof com.corrodinggames.rts.game.a.a) {
                    i2 = ((int) ((com.corrodinggames.rts.game.a.a) L.bX).bG) / 60;
                }
                if (i2 > 0) {
                    str = str + "(" + i2 + ")";
                }
            }
            return str;
        }

        @Override // com.corrodinggames.rts.game.units.a.s
        public boolean a(am amVar, boolean z2) {
            return amVar.bX instanceof com.corrodinggames.rts.game.a.a;
        }
    };
    static com.corrodinggames.rts.game.units.a.s p = new com.corrodinggames.rts.game.units.a.x("changeAlliance") { // from class: com.corrodinggames.rts.game.units.h.23
        @Override // com.corrodinggames.rts.game.units.a.s
        public String a() {
            return "Change selected player's alliance (players with the same letter are allied)";
        }

        @Override // com.corrodinggames.rts.game.units.a.s
        public String b() {
            return "Ally:";
        }

        @Override // com.corrodinggames.rts.game.units.a.s
        public String d() {
            h L;
            String str = "Ally";
            if (h.L() != null) {
                str = "Ally: " + L.bX.getPlayerTeamName();
            }
            return str;
        }

        @Override // com.corrodinggames.rts.game.units.a.s
        public boolean a(am amVar, boolean z2) {
            return true;
        }
    };
    static com.corrodinggames.rts.game.units.a.s q = new com.corrodinggames.rts.game.units.a.x("startRecording") { // from class: com.corrodinggames.rts.game.units.h.2
        @Override // com.corrodinggames.rts.game.units.a.s
        public String a() {
            return "Start recording a replay to file";
        }

        @Override // com.corrodinggames.rts.game.units.a.s
        public String b() {
            return "Start Recording";
        }

        @Override // com.corrodinggames.rts.game.units.a.s
        public String d() {
            String str;
            if (!GameEngine.getGameEngine().replayEngine.k()) {
                str = "Start Recording";
            } else {
                str = "Stop Recording";
            }
            return str;
        }

        @Override // com.corrodinggames.rts.game.units.a.s
        public boolean a(am amVar, boolean z2) {
            if (GameEngine.getGameEngine().replayEngine.j()) {
                return false;
            }
            return true;
        }

        @Override // com.corrodinggames.rts.game.units.a.s
        public boolean a(am amVar) {
            return GameEngine.getGameEngine().replayEngine.k();
        }

        @Override // com.corrodinggames.rts.game.units.a.s
        public boolean c(am amVar, boolean z2) {
            GameEngine gameEngine = GameEngine.getGameEngine();
            GameEngine.m5e("Start recording clicked");
            if (gameEngine.replayEngine.j()) {
                GameEngine.m5e("Already in a replay");
                return false;
            }
            gameEngine.a(new Runnable() { // from class: com.corrodinggames.rts.game.units.h.2.1
                @Override // java.lang.Runnable
                public void run() {
                    GameEngine gameEngine2 = GameEngine.getGameEngine();
                    if (!gameEngine2.replayEngine.k()) {
                        h L = h.L();
                        gameEngine2.bS.e = true;
                        if (!gameEngine2.netEngine.B) {
                            long j2 = gameEngine2.netEngine.w;
                            gameEngine2.netEngine.useMods = true;
                            int i2 = gameEngine2.netEngine.gameMapData.fog;
                            gameEngine2.netEngine.R();
                            gameEngine2.netEngine.gameMapData.fog = i2;
                            gameEngine2.netEngine.w = j2;
                            gameEngine2.netEngine.aW = true;
                            gameEngine2.tick = 0;
                            gameEngine2.netEngine.loaclTick = gameEngine2.tick + 1;
                            gameEngine2.netEngine.w();
                        }
                        String str = "[sandbox]" + gameEngine2.al() + " [v" + gameEngine2.v() + "] (" + com.corrodinggames.rts.gameFramework.f.a("d MMM yyyy HH.mm.ss") + ").replay";
                        gameEngine2.replayEngine.d(str);
                        gameEngine2.bS.e = false;
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
                    gameEngine2.replayEngine.close();
                }
            });
            return false;
        }
    };
    static com.corrodinggames.rts.game.units.a.s s = new com.corrodinggames.rts.game.units.a.x("startReplayPlayback") { // from class: com.corrodinggames.rts.game.units.h.3
        @Override // com.corrodinggames.rts.game.units.a.s
        public String a() {
            return "Start playback of last a replay";
        }

        @Override // com.corrodinggames.rts.game.units.a.s
        public String b() {
            return "Start Playback";
        }

        @Override // com.corrodinggames.rts.game.units.a.s
        public String d() {
            String str;
            if (!GameEngine.getGameEngine().replayEngine.j()) {
                str = "Start Playback";
            } else {
                str = "Stop Playback";
            }
            return str;
        }

        @Override // com.corrodinggames.rts.game.units.a.s
        public boolean a(am amVar, boolean z2) {
            boolean k2 = GameEngine.getGameEngine().replayEngine.k();
            h L = h.L();
            return (L == null || L.r == null || k2) ? false : true;
        }

        @Override // com.corrodinggames.rts.game.units.a.s
        public boolean b(am amVar) {
            h L = h.L();
            return (L == null || L.r == null) ? false : true;
        }

        @Override // com.corrodinggames.rts.game.units.a.s
        public boolean a(am amVar) {
            return GameEngine.getGameEngine().replayEngine.j();
        }

        @Override // com.corrodinggames.rts.game.units.a.s
        public boolean c(am amVar, boolean z2) {
            final GameEngine gameEngine = GameEngine.getGameEngine();
            final String str = h.L().r;
            if (str == null) {
                gameEngine.i("No last replay found");
                return false;
            } else if (!gameEngine.replayEngine.j()) {
                final Runnable runnable = new Runnable() { // from class: com.corrodinggames.rts.game.units.h.3.1
                    @Override // java.lang.Runnable
                    public void run() {
                        GameEngine gameEngine2 = GameEngine.getGameEngine();
                        if (!gameEngine2.replayEngine.j()) {
                            boolean z3 = gameEngine2.bL.E;
                            h L = h.L();
                            boolean z4 = gameEngine2.dq;
                            boolean z5 = gameEngine2.dr;
                            gameEngine2.replayEngine.h = true;
                            gameEngine2.replayEngine.c(str);
                            gameEngine2.replayEngine.h = false;
                            gameEngine2.dq = z4;
                            gameEngine2.dr = z5;
                            h L2 = h.L();
                            if (L2 != null && L != null) {
                                L2.a(L);
                            } else {
                                GameEngine.print("Failed copySettingsFromAnotherEditor");
                            }
                            gameEngine2.bv = true;
                            if (gameEngine2.bL != null) {
                                gameEngine2.bL.E = z3;
                            }
                            gameEngine2.cU = true;
                            if (L2 != null) {
                                L2.M();
                                return;
                            }
                            return;
                        }
                        GameEngine.m5e("stopPlaybackRunnable: Already started");
                    }
                };
                final com.corrodinggames.rts.gameFramework.Interface.a.f a = com.corrodinggames.rts.gameFramework.Interface.a.f.a("Start playback of last recording?", true);
                a.a(com.corrodinggames.rts.gameFramework.translations.a.a("menus.common.ok", new Object[0]), new com.corrodinggames.rts.gameFramework.Interface.a.k() { // from class: com.corrodinggames.rts.game.units.h.3.2
                    @Override // com.corrodinggames.rts.gameFramework.Interface.a.k
                    public boolean a(com.corrodinggames.rts.gameFramework.Interface.a.c cVar) {
                        a.i();
                        gameEngine.a(runnable);
                        return true;
                    }
                });
                gameEngine.bS.a(a);
                return false;
            } else {
                gameEngine.a(new Runnable() { // from class: com.corrodinggames.rts.game.units.h.3.3
                    @Override // java.lang.Runnable
                    public void run() {
                        GameEngine gameEngine2 = GameEngine.getGameEngine();
                        if (!gameEngine2.replayEngine.j()) {
                            GameEngine.m5e("stopPlaybackRunnable: Already stopped");
                            return;
                        }
                        gameEngine2.replayEngine.close();
                        gameEngine2.bt = 1.0f;
                        gameEngine2.bv = true;
                        h L = h.L();
                        if (L != null) {
                            gameEngine2.playerTeam = L.bX;
                        }
                    }
                });
                return false;
            }
        }
    };
    static com.corrodinggames.rts.game.units.a.s t = new com.corrodinggames.rts.game.units.a.x("hideInterface") { // from class: com.corrodinggames.rts.game.units.h.4
        @Override // com.corrodinggames.rts.game.units.a.s
        public String a() {
            String str = "Hide interface till the screen is clicked/pressed";
            if (GameEngine.av()) {
                str = str + "\n-Enable mouse capture to also hide the mouse";
            }
            return str;
        }

        @Override // com.corrodinggames.rts.game.units.a.s
        public String b() {
            return "Hide interface";
        }

        @Override // com.corrodinggames.rts.game.units.a.s
        public boolean c(am amVar, boolean z2) {
            GameEngine.getGameEngine().cU = true;
            return false;
        }
    };
    static com.corrodinggames.rts.game.units.a.s u = new com.corrodinggames.rts.game.units.a.x("freezeAllAI") { // from class: com.corrodinggames.rts.game.units.h.5
        @Override // com.corrodinggames.rts.game.units.a.s
        public String a() {
            return "Freeze full high level logic for all AI forever";
        }

        @Override // com.corrodinggames.rts.game.units.a.s
        public String b() {
            return "Freeze AI";
        }

        @Override // com.corrodinggames.rts.game.units.a.s
        public String d() {
            String str = "Freeze AI";
            h L = h.L();
            if (L != null && L.c) {
                str = "Unfreeze AIs";
            }
            return str;
        }

        @Override // com.corrodinggames.rts.game.units.a.s
        public boolean a(am amVar, boolean z2) {
            return true;
        }
    };
    static com.corrodinggames.rts.game.units.a.s v = new com.corrodinggames.rts.game.units.a.x("pauseGame") { // from class: com.corrodinggames.rts.game.units.h.6
        @Override // com.corrodinggames.rts.game.units.a.s
        public String a() {
            return "Pause Game";
        }

        @Override // com.corrodinggames.rts.game.units.a.s
        public String b() {
            if (GameEngine.getGameEngine().bt != 0.0f) {
                return "Pause: Off";
            }
            return "Pause: On";
        }

        @Override // com.corrodinggames.rts.game.units.a.s
        public boolean c(am amVar, boolean z2) {
            GameEngine gameEngine = GameEngine.getGameEngine();
            if (gameEngine.replayEngine.j()) {
            }
            if (gameEngine.bt != 0.0f) {
                gameEngine.bt = 0.0f;
                return false;
            }
            gameEngine.bt = 1.0f;
            return false;
        }
    };
    static com.corrodinggames.rts.game.units.a.s w = new com.corrodinggames.rts.game.units.a.x("slowGame") { // from class: com.corrodinggames.rts.game.units.h.7
        @Override // com.corrodinggames.rts.game.units.a.s
        public String a() {
            return "Slow motion";
        }

        @Override // com.corrodinggames.rts.game.units.a.s
        public String b() {
            if (GameEngine.getGameEngine().bt != 0.1f) {
                return "Slow motion: Off";
            }
            return "Slow motion: On";
        }

        @Override // com.corrodinggames.rts.game.units.a.s
        public boolean c(am amVar, boolean z2) {
            GameEngine gameEngine = GameEngine.getGameEngine();
            if (gameEngine.replayEngine.j()) {
            }
            if (gameEngine.bt == 1.0f) {
                gameEngine.bt = 0.1f;
                return false;
            }
            gameEngine.bt = 1.0f;
            return false;
        }
    };
    static com.corrodinggames.rts.game.units.a.s x = new com.corrodinggames.rts.game.units.a.x("fastForward") { // from class: com.corrodinggames.rts.game.units.h.8
        @Override // com.corrodinggames.rts.game.units.a.s
        public String a() {
            return "Fast Forward 1-5x";
        }

        @Override // com.corrodinggames.rts.game.units.a.s
        public String b() {
            return "Fast Forward: " + GameEngine.getGameEngine().bt;
        }

        @Override // com.corrodinggames.rts.game.units.a.s
        public boolean c(am amVar, boolean z2) {
            GameEngine gameEngine = GameEngine.getGameEngine();
            if (gameEngine.replayEngine.j()) {
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
    };
    static com.corrodinggames.rts.game.units.a.s y = new com.corrodinggames.rts.game.units.a.x("search") { // from class: com.corrodinggames.rts.game.units.h.9
        @Override // com.corrodinggames.rts.game.units.a.s
        public com.corrodinggames.rts.gameFramework.unitAction.e j() {
            return h.g;
        }

        @Override // com.corrodinggames.rts.game.units.a.s
        public String a() {
            return "Search for units";
        }

        @Override // com.corrodinggames.rts.game.units.a.s
        public String b() {
            GameEngine.getGameEngine();
            h L = h.L();
            if (L != null && L.G == n.search) {
                return "Search: " + com.corrodinggames.rts.gameFramework.f.b(L.H, 8);
            }
            return "Search units";
        }

        @Override // com.corrodinggames.rts.game.units.a.s
        public boolean c(am amVar, boolean z2) {
            GameEngine gameEngine = GameEngine.getGameEngine();
            if (gameEngine.replayEngine.i()) {
                gameEngine.c("Reply active", "Changing search filter is currently not supported while recording a replay");
                return false;
            }
            EnterPasswordCallback enterPasswordCallback = new EnterPasswordCallback() { // from class: com.corrodinggames.rts.game.units.h.9.1
                @Override // com.corrodinggames.rts.gameFramework.net.EnterPasswordCallback
                public void a(String str) {
                    GameEngine.m5e("Searching for: " + str);
                    GameEngine gameEngine2 = GameEngine.getGameEngine();
                    if (gameEngine2.replayEngine.i()) {
                        gameEngine2.c("Reply active", "Changing search filter is currently not supported while recording a replay");
                        return;
                    }
                    h L = h.L();
                    if (L == null) {
                        GameEngine.m5e("search: No editor");
                    } else if (str == null || str.trim().equals(VariableScope.nullOrMissingString)) {
                        GameEngine.m5e("search: No text entered");
                        if (L.G == n.search) {
                            L.G = n.all;
                        }
                        L.H = null;
                        L.I = true;
                        InterfaceEngine.K();
                    } else {
                        L.G = n.search;
                        L.H = str;
                        L.I = true;
                        InterfaceEngine.K();
                    }
                }

                @Override // com.corrodinggames.rts.gameFramework.net.EnterPasswordCallback
                public void a() {
                }
            };
            enterPasswordCallback.b = "Search units by internal name or text title.";
            enterPasswordCallback.e = "Search units";
            enterPasswordCallback.f = "Search";
            enterPasswordCallback.g = "Cancel";
            GameNetEngine.a(enterPasswordCallback);
            return false;
        }
    };
    static com.corrodinggames.rts.game.units.a.s z = new com.corrodinggames.rts.game.units.a.x("enableDebug") { // from class: com.corrodinggames.rts.game.units.h.10
        @Override // com.corrodinggames.rts.game.units.a.s
        public String a() {
            return "Show hidden unit information in tooltips including flags, ammo, tags and resources";
        }

        @Override // com.corrodinggames.rts.game.units.a.s
        public String b() {
            if (!GameEngine.getGameEngine().bl) {
                return "Debug: Off";
            }
            return "Debug: On";
        }
    };
    static com.corrodinggames.rts.game.units.a.s A = new com.corrodinggames.rts.game.units.a.x("enableAIDebug") { // from class: com.corrodinggames.rts.game.units.h.11
        @Override // com.corrodinggames.rts.game.units.a.s
        public String a() {
            return "AI debug view";
        }

        @Override // com.corrodinggames.rts.game.units.a.s
        public String b() {
            GameEngine.getGameEngine();
            if (!com.corrodinggames.rts.game.a.a.as) {
                return "AI Debug: Off";
            }
            return "AI Debug: On";
        }
    };
    static com.corrodinggames.rts.game.units.a.s B = new com.corrodinggames.rts.game.units.a.x("enableTriggerDebug") { // from class: com.corrodinggames.rts.game.units.h.13
        @Override // com.corrodinggames.rts.game.units.a.s
        public String a() {
            return "For debugging autoTriggers. When enabled will log a message when any auto triggers fire on any selected units";
        }

        @Override // com.corrodinggames.rts.game.units.a.s
        public String b() {
            if (!GameEngine.getGameEngine().bn) {
                return "Trigger Debug: Off";
            }
            return "Trigger Debug: On";
        }

        @Override // com.corrodinggames.rts.game.units.a.s
        public boolean b(am amVar) {
            return GameEngine.getGameEngine().bl;
        }
    };
    static com.corrodinggames.rts.game.units.a.s C = new com.corrodinggames.rts.game.units.a.x("clearSaveHistory") { // from class: com.corrodinggames.rts.game.units.h.14
        @Override // com.corrodinggames.rts.game.units.a.s
        public String a() {
            return "Clear save history";
        }

        @Override // com.corrodinggames.rts.game.units.a.s
        public String b() {
            GameEngine.getGameEngine();
            return "Clear history";
        }

        @Override // com.corrodinggames.rts.game.units.a.s
        public boolean b(am amVar) {
            return GameEngine.getGameEngine().bl;
        }
    };
    static com.corrodinggames.rts.game.units.a.b K = new com.corrodinggames.rts.game.units.a.b() { // from class: com.corrodinggames.rts.game.units.h.16
        @Override // com.corrodinggames.rts.game.units.a.b
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
            return nVar.a(sVar.mo3i());
        }
    };

    @Override // com.corrodinggames.rts.game.units.am
    /* renamed from: f */
    public ar mo1r() {
        return ar.editorOrBuilder;
    }

    public static boolean w() {
        if (GameEngine.getGameEngine().replayEngine.i()) {
            return true;
        }
        return false;
    }

    @Override // com.corrodinggames.rts.game.units.d
    public PointF[] b() {
        return this.a;
    }

    @Override // com.corrodinggames.rts.game.units.d
    public PointF[] e_() {
        return this.b;
    }

    @Override // com.corrodinggames.rts.game.units.e.j, com.corrodinggames.rts.game.units.am
    public com.corrodinggames.rts.gameFramework.unitAction.e v() {
        if (this.bX.site == -1) {
            return null;
        }
        return dN[this.bX.R()];
    }

    public static void K() {
        g = GameEngine.getGameEngine().bO.a(AssetsID.drawable.icon_search);
    }

    @Override // com.corrodinggames.rts.game.units.y
    public boolean a(am amVar) {
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.y
    public com.corrodinggames.rts.gameFramework.unitAction.e d() {
        if (this.bV) {
            return com.corrodinggames.rts.game.units.e.b.b;
        }
        return com.corrodinggames.rts.game.units.e.b.d[this.bX.R()];
    }

    @Override // com.corrodinggames.rts.game.units.y
    public com.corrodinggames.rts.gameFramework.unitAction.e k() {
        return null;
    }

    @Override // com.corrodinggames.rts.game.units.y
    public com.corrodinggames.rts.gameFramework.unitAction.e d(int i2) {
        return null;
    }

    @Override // com.corrodinggames.rts.game.units.am
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
        this.a = new PointF[6];
        this.b = new PointF[this.a.length];
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
        for (int i2 = 0; i2 < this.a.length; i2++) {
            this.a[i2] = new PointF();
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

    @Override // com.corrodinggames.rts.game.units.e.j, com.corrodinggames.rts.game.units.y, com.corrodinggames.rts.game.units.am, com.corrodinggames.rts.gameFramework.w
    public void a(float f2) {
        if (f2 < 0.3f) {
            f2 = 0.3f;
        }
        if (this.ax && this.bX.b()) {
            int i2 = 0;
            while (true) {
                if (i2 < PlayerData.c) {
                    PlayerData playerData = PlayerData.getPlayerData(i2);
                    if (playerData == null || playerData.b()) {
                        i2++;
                    } else {
                        e(playerData);
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

    @Override // com.corrodinggames.rts.game.units.am, com.corrodinggames.rts.gameFramework.w
    public void a(float f2, boolean z2) {
        if (!this.bV) {
        }
    }

    @Override // com.corrodinggames.rts.game.units.y
    public float e(int i2) {
        return 0.0f;
    }

    @Override // com.corrodinggames.rts.game.units.y
    public float f(int i2) {
        return 0.0f;
    }

    @Override // com.corrodinggames.rts.game.units.y, com.corrodinggames.rts.game.units.am, com.corrodinggames.rts.gameFramework.w
    public boolean c(float f2) {
        if (!super.c(f2)) {
            return false;
        }
        GameEngine.getGameEngine();
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.y
    public void a(am amVar, int i2) {
    }

    @Override // com.corrodinggames.rts.game.units.y
    public boolean b_() {
        return false;
    }

    @Override // com.corrodinggames.rts.game.units.am
    public int y() {
        return 850000;
    }

    @Override // com.corrodinggames.rts.game.units.am
    public float b(am amVar) {
        return 1.0E7f;
    }

    @Override // com.corrodinggames.rts.game.units.am
    public float c(am amVar) {
        return 1.0E7f;
    }

    @Override // com.corrodinggames.rts.game.units.y
    public float m() {
        return 30.0f;
    }

    @Override // com.corrodinggames.rts.game.units.y
    public float b(int i2) {
        return 100.0f;
    }

    @Override // com.corrodinggames.rts.game.units.y
    public float z() {
        return 0.0f;
    }

    @Override // com.corrodinggames.rts.game.units.y
    public float A() {
        return 9.8f;
    }

    @Override // com.corrodinggames.rts.game.units.y
    public float B() {
        return 9.35f;
    }

    @Override // com.corrodinggames.rts.game.units.y
    public float c(int i2) {
        return 99.0f;
    }

    @Override // com.corrodinggames.rts.game.units.am
    public boolean l() {
        return false;
    }

    @Override // com.corrodinggames.rts.game.units.y
    public float C() {
        return 0.04f;
    }

    @Override // com.corrodinggames.rts.game.units.y
    public float D() {
        return 0.1f;
    }

    @Override // com.corrodinggames.rts.game.units.am
    public void a(com.corrodinggames.rts.game.units.a.s sVar, boolean z2) {
        GameEngine gameEngine = GameEngine.getGameEngine();
        if (sVar instanceof k) {
            k kVar = (k) sVar;
            boolean z3 = true;
            if (z2) {
                z3 = 1 == 0;
            }
            if (kVar.a) {
                z3 = !z3;
            }
            if (z3) {
                com.corrodinggames.rts.game.a.a aVar = null;
                int i2 = this.bX.site + 1;
                while (true) {
                    if (i2 < PlayerData.c) {
                        PlayerData playerData = PlayerData.getPlayerData(i2);
                        if (playerData == null || playerData.b()) {
                            i2++;
                        } else {
                            aVar = playerData;
                            break;
                        }
                    } else {
                        break;
                    }
                }
                if (aVar == null && this.bX.site < 4) {
                    aVar = PlayerData.getPlayerData(this.bX.site + 1);
                    if (aVar == null) {
                        GameEngine.m5e("Sandbox adding new team:" + this.bX.site);
                        com.corrodinggames.rts.game.a.a aVar2 = new com.corrodinggames.rts.game.a.a(this.bX.site + 1);
                        aVar = aVar2;
                        aVar.team = 1;
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
                            PlayerData playerData2 = PlayerData.getPlayerData(i3);
                            if (playerData2 == null || playerData2.b()) {
                                i3++;
                            } else {
                                aVar = playerData2;
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                }
                if (aVar != null) {
                    e(aVar);
                    if (!gameEngine.replayEngine.j()) {
                        gameEngine.playerTeam = aVar;
                    }
                }
            } else {
                PlayerData playerData3 = null;
                int i4 = this.bX.site - 1;
                while (true) {
                    if (i4 >= 0) {
                        PlayerData playerData4 = PlayerData.getPlayerData(i4);
                        if (playerData4 == null || playerData4.b()) {
                            i4--;
                        } else {
                            playerData3 = playerData4;
                            break;
                        }
                    } else {
                        break;
                    }
                }
                if (playerData3 == null) {
                    int i5 = PlayerData.c - 1;
                    while (true) {
                        if (i5 >= 0) {
                            PlayerData playerData5 = PlayerData.getPlayerData(i5);
                            if (playerData5 == null || playerData5.b()) {
                                i5--;
                            } else {
                                playerData3 = playerData5;
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                }
                if (playerData3 != null) {
                    e(playerData3);
                    if (!gameEngine.replayEngine.j()) {
                        gameEngine.playerTeam = playerData3;
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
            if (jVar.a) {
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
            if (lVar.a) {
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

    static h L() {
        return GameEngine.getGameEngine().bS.i();
    }

    @Override // com.corrodinggames.rts.game.units.am
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
                GameEngine.m5e("Reload units requested");
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
                GameEngine.m5e("Reload active only requested");
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
                            as mo1r = amVar2.mo1r();
                            for (int i5 = -25; i5 < 25; i5++) {
                                am a = mo1r.a();
                                a.eo = amVar2.eo + (i5 * 0.5f) + 1.0f;
                                a.ep = amVar2.ep + (i5 * 0.5f) + 1.0f;
                                a.b(amVar2.bX);
                                PlayerData.c(a);
                                a.cg = com.corrodinggames.rts.gameFramework.f.a((com.corrodinggames.rts.gameFramework.w) amVar2, -180, (int) SlickToAndroidKeycodes.AndroidCodes.KEYCODE_STB_INPUT, 25 + i5);
                                if (a instanceof y) {
                                    ((y) a).ay = true;
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
            Projectile a2 = com.corrodinggames.rts.game.units.d.q.a(this, pointF.x, pointF.y, pointF.x, pointF.y);
            if (a2 != null) {
                a2.eq = 100.0f;
                a2.j = null;
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
            playerData4.team++;
            if (playerData4.team > 4) {
                playerData4.team = 0;
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
            gameEngine.stats.a();
        }
        if (sVar instanceof q) {
            p.a(((q) sVar).a, pointF);
        }
        super.a(sVar, z2, pointF, amVar);
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
        Collections.sort(arrayList3, new Comparator() { // from class: com.corrodinggames.rts.game.units.h.15
            @Override // java.util.Comparator
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
                com.corrodinggames.rts.game.units.custom.d.b u2 = asVar.u();
                com.corrodinggames.rts.game.units.custom.d.b u3 = asVar2.u();
                com.corrodinggames.rts.game.units.custom.d.b B2 = asVar.B();
                com.corrodinggames.rts.game.units.custom.d.b B3 = asVar2.B();
                if (B2 != null) {
                    u2 = com.corrodinggames.rts.game.units.custom.d.b.a(u2, B2);
                }
                if (B3 != null) {
                    u3 = com.corrodinggames.rts.game.units.custom.d.b.a(u3, B3);
                }
                int compareTo4 = u2.compareTo(u3);
                if (compareTo4 != 0) {
                    return compareTo4;
                }
                return 0;
            }
        });
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

    @Override // com.corrodinggames.rts.game.units.am
    public ArrayList N() {
        GameEngine.getGameEngine();
        return D;
    }

    @Override // com.corrodinggames.rts.game.units.y
    public boolean E() {
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.y
    public float g(int i2) {
        return 10.0f;
    }

    @Override // com.corrodinggames.rts.game.units.y
    public boolean F() {
        return GameEngine.getGameEngine().settingsEngine.renderExtraShadows && !this.bV;
    }

    @Override // com.corrodinggames.rts.game.units.y
    public float G() {
        return 1.0f;
    }

    @Override // com.corrodinggames.rts.game.units.y
    public float H() {
        return 1.0f;
    }

    @Override // com.corrodinggames.rts.game.units.am
    public boolean u() {
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.w, com.corrodinggames.rts.game.units.y
    public boolean I() {
        return false;
    }

    @Override // com.corrodinggames.rts.game.units.am
    public boolean d(am amVar) {
        return false;
    }

    @Override // com.corrodinggames.rts.game.units.am
    public boolean J() {
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.am
    public float a(am amVar, float f2, Projectile projectile) {
        return super.a(amVar, 0.0f, projectile);
    }

    @Override // com.corrodinggames.rts.game.units.am
    public void O() {
    }

    @Override // com.corrodinggames.rts.game.units.am
    public boolean P() {
        return true;
    }

    public void a(h hVar) {
        this.r = hVar.r;
        this.c = hVar.c;
    }

    @Override // com.corrodinggames.rts.game.units.y, com.corrodinggames.rts.game.units.am, com.corrodinggames.rts.gameFramework.az, com.corrodinggames.rts.gameFramework.w, com.corrodinggames.rts.gameFramework.bq
    public void a(GameOutputStream gameOutputStream) {
        gameOutputStream.writeByte(1);
        gameOutputStream.writeEnum(this.G);
        gameOutputStream.writeIsString(this.H);
        super.a(gameOutputStream);
    }

    @Override // com.corrodinggames.rts.game.units.y, com.corrodinggames.rts.game.units.am, com.corrodinggames.rts.gameFramework.az, com.corrodinggames.rts.gameFramework.w
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