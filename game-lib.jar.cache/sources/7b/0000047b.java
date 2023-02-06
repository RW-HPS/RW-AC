package com.corrodinggames.rts.gameFramework;

import android.content.Context;
import com.corrodinggames.rts.game.PlayerData;
import com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope;
import com.corrodinggames.rts.gameFramework.net.CheckSumData;
import com.corrodinggames.rts.gameFramework.net.GameInputStream;
import com.corrodinggames.rts.gameFramework.net.GameNetEngine;
import com.corrodinggames.rts.gameFramework.net.GameOutputStream;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Iterator;

/* renamed from: com.corrodinggames.rts.gameFramework.ba */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/ba.class */
public class ReplayEngine {
    public static boolean b = true;
    public static boolean c = true;
    public static boolean d = false;
    public static boolean e = true;
    public static boolean f = false;
    public boolean h;
    int i;
    int j;
    boolean k;
    int l;
    boolean m;
    public int o;
    public int p;
    public int q;
    public String r;
    boolean s;
    private volatile boolean P;
    String t;
    boolean u;
    bd w;
    bd x;
    int y;
    int z;
    int A;
    int B;
    InputStream C;
    BufferedInputStream D;
    DataInputStream E;
    GameInputStream F;
    OutputStream G;
    BufferedOutputStream H;
    DataOutputStream I;
    GameOutputStream J;
    RelaySaveRunnable K;
    Thread L;
    public boolean O;
    String a = "replays/";
    public CheckSumData g = new CheckSumData();
    public boolean n = false;
    public int v = 1;
    Object M = new Object();
    public boolean N = false;

    public static void a(String str) {
        GameEngine.m5e("Replay: " + str);
    }

    public static void b(String str) {
        GameEngine.print("Replay: " + str);
    }

    public static void a(String str, Exception exc) {
        GameEngine.a("Replay: " + str, (Throwable) exc);
    }

    public File a(String str, boolean z) {
        return com.corrodinggames.rts.gameFramework.file.a.a(str, this.a, z);
    }

    public void a(Context context) {
    }

    public void a() {
        GameEngine gameEngine = GameEngine.getGameEngine();
        if (gameEngine.bt != 0.0f) {
            gameEngine.bt = 0.0f;
        } else {
            gameEngine.bt = 1.0f;
        }
    }

    public void b() {
        GameEngine gameEngine = GameEngine.getGameEngine();
        if (gameEngine.bt == 1.0f) {
            gameEngine.bt = 2.0f;
        } else if (gameEngine.bt == 2.0f) {
            gameEngine.bt = 4.0f;
        } else if (gameEngine.bt == 4.0f) {
            gameEngine.bt = 8.0f;
        } else if (gameEngine.bt == 8.0f) {
            gameEngine.bt = 16.0f;
        } else if (gameEngine.bt == 16.0f) {
            gameEngine.bt = 32.0f;
        } else if (gameEngine.bt == 32.0f) {
            gameEngine.bt = 64.0f;
        } else if (gameEngine.bt == 64.0f) {
            gameEngine.bt = 1.0f;
        } else {
            gameEngine.bt = 1.0f;
        }
    }

    public void a(int i, String str, String str2, int i2) {
        RelaySaveRunnable relaySaveRunnable = this.K;
        if (this.P && !this.u) {
            if (str2.startsWith("-t ")) {
            }
            bd bdVar = new bd();
            bdVar.a = i2;
            bdVar.g = new bc();
            bdVar.g.a = i;
            bdVar.g.b = str;
            bdVar.g.c = str2;
            if (relaySaveRunnable == null) {
                GameEngine.g("Failed to record chat message, replay might have already stopped");
            } else {
                relaySaveRunnable.a(bdVar);
            }
        }
    }

    public void a(byte[] bArr, int i, int i2, int i3, float f2, float f3) {
        RelaySaveRunnable relaySaveRunnable = this.K;
        if (this.P && !this.u) {
            bd bdVar = new bd();
            bdVar.a = i;
            bdVar.f = bArr;
            bdVar.h = i2;
            bdVar.i = i3;
            bdVar.j = f2;
            bdVar.k = f3;
            if (relaySaveRunnable == null) {
                GameEngine.g("Failed to save resync, replay might have already stopped");
            } else {
                relaySaveRunnable.a(bdVar);
            }
        }
    }

    public void c() {
        if (f) {
            d();
        }
    }

    public void a(SyncPacket syncPacket, int i) {
        RelaySaveRunnable relaySaveRunnable = this.K;
        if (this.P && !this.u) {
            if (relaySaveRunnable == null) {
                GameEngine.g("Failed to record command, replay might have already stopped");
                return;
            }
            bd bdVar = new bd();
            bdVar.e = syncPacket.clone();
            bdVar.a = i;
            relaySaveRunnable.a(bdVar);
            this.j++;
            if (this.j > 5) {
                this.j = 0;
                GameEngine gameEngine = GameEngine.getGameEngine();
                bd bdVar2 = new bd();
                bdVar2.c = Long.valueOf(f());
                bdVar2.a = gameEngine.tick;
                relaySaveRunnable.a(bdVar2);
            }
        }
    }

    public void d() {
        if (this.P && !this.u) {
            this.g.b();
            a(this.g, true);
        }
    }

    public void a(CheckSumData checkSumData) {
        a(checkSumData, false);
    }

    public void a(CheckSumData checkSumData, boolean z) {
        if (this.P && !this.u) {
            GameEngine gameEngine = GameEngine.getGameEngine();
            bd bdVar = new bd();
            GameOutputStream gameOutputStream = new GameOutputStream();
            int i = 0;
            if (z) {
                try {
                    i = 0 + 1;
                } catch (IOException e2) {
                    throw new RuntimeException(e2);
                }
            }
            gameOutputStream.writeByte(i);
            gameOutputStream.writeInt(checkSumData.b.size());
            Iterator it = checkSumData.b.iterator();
            while (it.hasNext()) {
                gameOutputStream.writeLong(((com.corrodinggames.rts.gameFramework.net.al) it.next()).b);
            }
            bdVar.d = gameOutputStream.toByteArray();
            bdVar.a = gameEngine.tick;
            this.K.a(bdVar);
        }
    }

    /* renamed from: e */
    public void close() {
        synchronized (this.M) {
            try {
                if (this.K != null) {
                    this.K.a();
                    try {
                        this.L.join();
                    } catch (InterruptedException e2) {
                        e2.printStackTrace();
                    }
                    this.P = false;
                    this.K = null;
                    this.L = null;
                }
                if (this.G != null) {
                    this.I.flush();
                    this.I.close();
                    this.H.flush();
                    this.H.close();
                    this.G.flush();
                    this.G.close();
                }
                this.G = null;
                this.H = null;
                this.I = null;
                this.J = null;
            } catch (IOException e3) {
                e3.printStackTrace();
                this.G = null;
                this.H = null;
                this.I = null;
                this.J = null;
            }
            this.s = false;
            this.P = false;
            this.u = false;
            this.t = null;
            this.i = 0;
            this.j = 0;
            this.k = false;
            this.l = 0;
            this.m = false;
            this.y = 0;
            this.v = 1;
            this.z = 0;
            this.A = 0;
            this.B = 0;
            this.o = -1;
            this.p = 0;
            this.q = -1;
            this.r = null;
            try {
                if (this.C != null) {
                    this.E.close();
                    this.D.close();
                    this.C.close();
                }
                this.C = null;
                this.D = null;
                this.E = null;
                this.F = null;
            } catch (IOException e4) {
                e4.printStackTrace();
                this.C = null;
                this.D = null;
                this.E = null;
                this.F = null;
            }
        }
    }

    public long f() {
        com.corrodinggames.rts.game.units.y yVar;
        long j = 0;
        Iterator it = w.er.iterator();
        while (it.hasNext()) {
            w wVar = (w) it.next();
            if (wVar instanceof com.corrodinggames.rts.game.units.y) {
                j = ((float) j) + (yVar.eo * 1000.0f) + (yVar.ep * 1000.0f) + (yVar.cu * 1.0f) + ((com.corrodinggames.rts.game.units.y) wVar).eh;
            }
        }
        return j;
    }

    public void g() {
        if (!this.N) {
            close();
        }
    }

    public boolean c(String str) {
        return a(str, a(str, false));
    }

    private void l() {
        for (int i = 0; i < PlayerData.c; i++) {
            PlayerData playerData = PlayerData.getPlayerData(i);
            if (playerData != null && (playerData instanceof com.corrodinggames.rts.game.a.a)) {
                ((com.corrodinggames.rts.game.a.a) playerData).aX = true;
            }
        }
    }

    public boolean a(String str, File file) {
        if (this.P) {
            if (this.u) {
                GameEngine.print("startReplayingFile: A replay is already playing");
            } else {
                GameEngine.print("startReplayingFile: A replay is already saving");
            }
        }
        close();
        GameEngine gameEngine = GameEngine.getGameEngine();
        gameEngine.e();
        gameEngine.netEngine.q();
        this.w = null;
        this.s = false;
        this.P = true;
        this.u = true;
        this.t = str;
        try {
            if (file.isDirectory()) {
                GameEngine.m5e("File is a directory: " + file.getAbsolutePath());
                GameEngine.m5e("Cannot load replay: Target is a folder, instead of a file");
                gameEngine.a("Cannot load replay: Target is a folder, instead of a file", 1);
                return false;
            }
            this.C = com.corrodinggames.rts.gameFramework.file.a.a(file);
            if (this.C == null) {
                GameEngine.m5e("Cannot load replay: Failed to read replay file");
                gameEngine.a("Cannot load replay: Failed to read replay file", 1);
                return false;
            }
            this.D = new BufferedInputStream(this.C);
            this.E = new DataInputStream(this.D);
            this.F = new GameInputStream(this.E);
            String readString = this.F.readString();
            if (!readString.equals("rustedWarfareReplay")) {
                GameEngine.m5e("Header is not correct:" + readString);
                GameEngine.m5e("Cannot load replay: File is missing header (check if this file is a replay)");
                gameEngine.a("Cannot load replay: File is missing header (check if this file is a replay)", 1);
                return false;
            }
            int readInt = this.F.readInt();
            int readInt2 = this.F.readInt();
            a("Loading save from version: " + readInt2);
            this.F.a(readInt2);
            String readString2 = this.F.readString();
            if ((readInt2 != 96 || readInt != gameEngine.c(true)) && !this.n) {
                String str2 = "Cannot load replay: This replay was recording with a different version: " + readString2;
                if (GameEngine.av()) {
                    str2 = str2 + " (You can use the beta tab in steam to switch to old versions)";
                }
                gameEngine.a(str2, 1);
                a("Replay version: " + readInt2 + " (" + readInt + ")");
                a("GameSaver.thisSaveVersion: 96 (" + gameEngine.c(true) + ")");
                if (!GameEngine.aG) {
                    this.P = false;
                    return false;
                }
            }
            this.q = readInt2;
            this.r = readString2;
            this.F.readBoolean();
            this.F.startBlock("gamesave");
            this.O = false;
            this.N = true;
            a("Loading replay initial save");
            gameEngine.ca.a(this.F, false, false, false);
            this.N = false;
            this.F.endBlock("gamesave");
            if (!this.O) {
                a("ReplayEngine: --- No game setup read ----");
                gameEngine.netEngine.gameMapData.nukes = true;
                gameEngine.bC = gameEngine.settingsEngine.teamUnitCapHostedGame;
                gameEngine.bB = gameEngine.bC;
            }
            if (!this.h) {
                l();
            }
            a("--- Reply settings ---");
            a("Unit cap: " + gameEngine.bC);
            a(gameEngine.netEngine.gameMapData.b());
            a("Starting frame:" + gameEngine.tick);
            if (!this.h) {
                for (int i = 0; i < PlayerData.c; i++) {
                    PlayerData playerData = PlayerData.getPlayerData(i);
                    if (playerData != null && playerData.name != null) {
                        gameEngine.bS.h.a(VariableScope.nullOrMissingString, "Player '" + playerData.name + "' playing as " + playerData.N().toLowerCase() + " (team:" + playerData.getPlayerTeamName() + ")");
                    }
                }
            }
            if (GameEngine.aw) {
                GameNetEngine.g("Warning: editor will desync checksums.");
                gameEngine.bv = true;
                gameEngine.bl = true;
                gameEngine.bn = true;
            }
            return true;
        } catch (IOException e2) {
            throw new RuntimeException(e2);
        }
    }

    public void a(boolean z) {
        if (GameEngine.aW) {
            if (!GameEngine.bd) {
                return;
            }
        } else if (!GameEngine.bc) {
            return;
        }
        GameEngine gameEngine = GameEngine.getGameEngine();
        if (gameEngine.netEngine.B && !z && !this.N && gameEngine.settingsEngine.saveMultiplayerReplays) {
            d(gameEngine.al() + " [v" + gameEngine.v() + "] (" + f.a("d MMM yyyy HH.mm.ss") + ").replay");
        }
    }

    public void d(String str) {
        a("Recording replay to: " + str);
        if (this.P) {
            if (this.u) {
                b("startSaving: A replay is already playing");
            } else {
                b("startSaving: A replay is already saving");
            }
        }
        close();
        GameEngine gameEngine = GameEngine.getGameEngine();
        f = gameEngine.settingsEngine.replayTracing;
        if (f) {
            gameEngine.netEngine.j("Warning traceChecksumsWriting is on. Large replay file size will be created.");
        }
        this.s = false;
        this.P = true;
        this.u = false;
        this.t = str;
        try {
            File a = a(str, true);
            this.G = com.corrodinggames.rts.gameFramework.file.a.a(a, false);
            if (this.G == null) {
                b("Failed to create replay file at:" + a.getAbsolutePath());
                GameEngine.getGameEngine().i("Failed to create replay file (Replay recording will be disabled)");
                close();
                return;
            }
            this.H = new BufferedOutputStream(this.G);
            this.I = new DataOutputStream(this.H);
            this.J = new GameOutputStream(this.I);
            this.J.writeString("rustedWarfareReplay");
            this.J.writeInt(gameEngine.c(true));
            this.J.writeInt(96);
            this.J.writeString(gameEngine.v());
            this.J.writeBoolean(gameEngine.ar);
            this.J.e("gamesave");
            gameEngine.ca.a(this.J);
            this.J.endBlock("gamesave");
            this.I.flush();
            this.K = new RelaySaveRunnable(this);
            this.L = new Thread(this.K);
            this.L.start();
        } catch (IOException e2) {
            a("Failed to start recording replay", e2);
            GameEngine.getGameEngine().i("Failed to start recording replay: " + e2.getMessage());
            close();
        } catch (Exception e3) {
            a("Failed to start recording replay (Non IOException)", e3);
            GameEngine.getGameEngine().i("Failed to start recording replay (Non IOException): " + e3.getMessage());
            close();
        }
    }

    public boolean h() {
        GameEngine gameEngine = GameEngine.getGameEngine();
        String x = this.F.x();
        if ("rc".equals(x)) {
            this.y++;
            bd bdVar = new bd();
            bdVar.a = this.F.readInt();
            SyncPacket b2 = gameEngine.cf.b();
            b2.read(this.F);
            b2.a = true;
            bdVar.e = b2;
            this.F.endBlock("rc");
            this.w = bdVar;
            this.p++;
            this.o = bdVar.a;
            if (c) {
                a("updateGameFrame: Command: " + b2.i.name + " (" + b2.i.site + ") count:" + b2.d() + " id:" + this.y);
                if (b2.j != null) {
                    a("updateGameFrame: Waypoint: " + b2.j.d().name());
                    if (b2.j.a() != null) {
                        a("updateGameFrame: Build Type: " + b2.j.a().i());
                    }
                }
                if (com.corrodinggames.rts.game.units.a.s.c(b2.k)) {
                    a("updateGameFrame: SpecialAction: " + b2.k.a());
                }
                if (b2.n != null) {
                    a("updateGameFrame: SetAttackMode: " + b2.n);
                }
                if (b2.g) {
                    a("updateGameFrame: stopOrUndo is set");
                }
                if (b2.r) {
                    if (b2.s != 0.0f) {
                        a("updateGameFrame: changeStepRate:" + b2.s);
                    }
                    if (b2.u != 0) {
                        a("updateGameFrame: systemAction_action:" + b2.u);
                    }
                }
                a("updateGameFrame: ------");
                return true;
            }
            return true;
        } else if ("wait".equals(x)) {
            bd bdVar2 = new bd();
            bdVar2.a = this.F.readInt();
            bdVar2.b = true;
            this.w = bdVar2;
            this.F.endBlock("wait");
            return true;
        } else if ("cs".equals(x)) {
            int readInt = this.F.readInt();
            long readLong = this.F.readLong();
            if (!this.n) {
                if (gameEngine.tick != readInt) {
                    GameEngine.b("replay:updateGameFrame", "expected:" + readInt + " got:" + gameEngine.tick);
                }
                if (f() != readLong) {
                    b("checksum: checksums don't match!!");
                    b("checksum: game frameNumber:" + gameEngine.tick);
                    b("checksum: Replay checksum:" + readLong);
                    b("checksum: Game checksum  :" + f());
                    this.l++;
                    if (!this.k) {
                        this.k = true;
                        gameEngine.bS.h.a(VariableScope.nullOrMissingString, "Error: This replay might be out of sync");
                    }
                } else {
                    a("checksum: checksums are matching frameNumber:" + gameEngine.tick);
                }
            }
            this.F.endBlock("cs");
            return true;
        } else if ("es".equals(x)) {
            int readInt2 = this.F.readInt();
            if (!this.n) {
                if (gameEngine.tick != readInt2) {
                    GameEngine.print("replay.updateGameFrame: expected:" + readInt2 + " got:" + gameEngine.tick);
                }
                GameInputStream gameInputStream = new GameInputStream(this.F.readBytes());
                boolean z = false;
                if (com.corrodinggames.rts.game.units.custom.d.b.a(gameInputStream.readByte(), 1)) {
                    z = true;
                }
                if (z) {
                    GameEngine.m5e("replay: -trace checksum-");
                } else {
                    GameEngine.m5e("replay: -long checksum-");
                }
                gameEngine.netEngine.d();
                gameInputStream.readInt();
                Iterator it = gameEngine.netEngine.checkSumData.b.iterator();
                while (it.hasNext()) {
                    com.corrodinggames.rts.gameFramework.net.al alVar = (com.corrodinggames.rts.gameFramework.net.al) it.next();
                    long readLong2 = gameInputStream.readLong();
                    if (!this.m && readLong2 == alVar.b) {
                        a("extraChecksum: " + alVar.a + " Checksum [" + readInt2 + "]. " + readLong2 + " == " + alVar.b + " (ok)");
                    }
                    if (readLong2 != alVar.b) {
                        if (this.l < 150) {
                            b("extraChecksum: " + alVar.a + " Checksum [" + readInt2 + "]. " + readLong2 + " != " + alVar.b + " (failed)");
                        }
                        this.l++;
                    }
                }
            }
            this.m = true;
            this.F.endBlock("es");
            return true;
        } else if ("resync".equals(x)) {
            int readInt3 = this.F.readInt();
            GameEngine.m5e("Loading resync from replay");
            if (gameEngine.tick != readInt3) {
                GameEngine.b("replay:resync", "expected:" + readInt3 + " got:" + gameEngine.tick);
            }
            int readInt4 = this.F.readInt();
            int readInt5 = this.F.readInt();
            float readFloat = this.F.readFloat();
            float readFloat2 = this.F.readFloat();
            gameEngine.ca.a(new GameInputStream(this.F.readBytes()), true, true, true);
            l();
            gameEngine.tick = readInt4;
            gameEngine.by = readInt5;
            gameEngine.netEngine.checkSumData.allSum = 0L;
            if (readFloat < 0.1d) {
                GameNetEngine.a("replay setCurrentStepRate:" + readFloat + " is too small", true);
            }
            gameEngine.netEngine.setCurrentStepRate(readFloat, "replay");
            gameEngine.netEngine.J = readFloat2;
            this.F.endBlock("resync");
            return true;
        } else if ("chat".equals(x)) {
            bd bdVar3 = new bd();
            bdVar3.a = this.F.readInt();
            bdVar3.g = new bc();
            bdVar3.g.a = this.F.readInt();
            bdVar3.g.b = this.F.isReadString();
            bdVar3.g.c = this.F.isReadString();
            this.w = bdVar3;
            this.F.endBlock("chat");
            return true;
        } else if ("end".equals(x)) {
            GameEngine.b("replay:updateGameFrame", "end of replay block found");
            gameEngine.bS.h.a(VariableScope.nullOrMissingString, "Replay has ended");
            if (!gameEngine.bv) {
                this.s = true;
                gameEngine.bt = 0.25f;
                GameEngine.getGameEngine().bS.G();
            } else {
                this.s = false;
                this.P = false;
                this.u = false;
                com.corrodinggames.rts.game.units.h i = gameEngine.bS.i();
                if (i != null) {
                    gameEngine.playerTeam = i.bX;
                }
            }
            this.F.endBlock("end");
            GameEngine.m5e("number of replay commands issued:" + this.z);
            return false;
        } else if ("endReplayMetaData".equals(x)) {
            this.F.endBlock("endReplayMetaData");
            return true;
        } else {
            GameEngine.b("updateGameFrame", "Unknown command block:" + x);
            this.F.endBlock(x);
            return true;
        }
    }

    public void a(float f2) {
        GameEngine gameEngine = GameEngine.getGameEngine();
        if (this.s || !this.P || !this.u) {
            return;
        }
        while (true) {
            if (this.w == null) {
                try {
                    if (!h()) {
                        return;
                    }
                } catch (IOException e2) {
                    GameEngine.b("updateGameFrame", "IOException, read of replay?");
                    e2.printStackTrace();
                    gameEngine.bt = 0.25f;
                    if (!this.s && this.P) {
                        gameEngine.bS.h.a(VariableScope.nullOrMissingString, "Replay ended (unexpected)");
                    }
                    this.s = true;
                    return;
                }
            }
            if (this.w != null) {
                if (this.n) {
                    this.w = null;
                } else {
                    if (b && this.w != null && this.x != this.w) {
                        this.x = this.w;
                        GameEngine.m5e("replay: upcoming in " + (this.w.a - gameEngine.tick) + " command:" + (this.w.e != null));
                    }
                    if (this.w.b && this.z == 0) {
                        GameEngine.m5e("updateGameFrame: replay: Skipping wait on first resync without commands to avoid delay");
                        this.w = null;
                    } else if (gameEngine.tick >= this.w.a) {
                        if (this.w.e != null) {
                            if (gameEngine.tick > this.w.a) {
                                GameEngine.print("updateGameFrame: replay incorrect frameNumber, skipping command:" + gameEngine.tick + " vs " + this.w.a);
                            } else {
                                if (d) {
                                    if (this.w.e.p == null) {
                                        GameEngine.m5e("Precommand Team: commandingPlayer==null");
                                        if (this.w.e.i != null) {
                                            GameEngine.m5e("Precommand Team id:" + this.w.e.i.site + " credits:" + this.w.e.i.credits);
                                        }
                                    } else {
                                        GameEngine.m5e("Precommand Team id:" + this.w.e.p.site + " credits:" + this.w.e.p.credits + " count:" + this.w.e.p.w() + " max:" + this.w.e.p.x());
                                    }
                                }
                                if (this.w.e.r && this.w.e.u != 0) {
                                    GameEngine.b("replay:issueCommand", "systemAction_action:" + this.w.e.u);
                                }
                                this.w.e.k();
                                if (d) {
                                    if (this.w.e.p != null) {
                                        GameEngine.m5e("Postcommand credits:" + this.w.e.p.credits + " count:" + this.w.e.p.w() + " max:" + this.w.e.p.x());
                                    } else if (this.w.e.i != null) {
                                        GameEngine.m5e("Postcommand Team id:" + this.w.e.i.site + " credits:" + this.w.e.i.credits);
                                    }
                                }
                                this.z++;
                            }
                        } else if (this.w.g != null) {
                            bc bcVar = this.w.g;
                            boolean z = false;
                            if (bcVar.c == null) {
                                z = true;
                            } else {
                                if (bcVar.c.startsWith("-i ")) {
                                    z = true;
                                }
                                if (bcVar.c.equals("<All players ready>")) {
                                    z = true;
                                }
                                if (bcVar.c.equals("--too many desync errors, suppressing output--")) {
                                    z = true;
                                }
                                if (bcVar.c.startsWith("desync:")) {
                                    z = true;
                                }
                            }
                            if (!gameEngine.settingsEngine.replaysShowRecordedChat) {
                                z = true;
                            }
                            if (z) {
                                GameEngine.b("replay:updateGameFrame", "Skipping message: " + bcVar.b + ":" + bcVar.c);
                            } else {
                                GameEngine.b("replay:updateGameFrame", "message: " + bcVar.b + ":" + bcVar.c);
                                gameEngine.bS.h.a(bcVar.b, bcVar.c);
                            }
                        } else if (this.w.b) {
                            if (c) {
                            }
                        } else {
                            GameEngine.b("updateGameFrame", "error: lastReadCommand null action");
                        }
                        this.w = null;
                    }
                }
            }
            if (this.w != null) {
                return;
            }
        }
    }

    public void e(String str) {
        GameEngine.m5e("ReplayEngine deleteGame: " + str);
        String o = com.corrodinggames.rts.gameFramework.file.a.o(str);
        if (o.contains("\\") || o.contains("/")) {
            GameEngine.m5e("Cannot get replay with path: " + str);
            return;
        }
        File a = a(str, true);
        GameEngine.m5e("ReplayEngine path: " + a.getAbsolutePath());
        if (!a.exists()) {
            GameEngine.m5e("ReplayEngine deleteGame: file doesn't exist");
        }
        if (!com.corrodinggames.rts.gameFramework.file.a.b(a)) {
            GameEngine.m5e("ReplayEngine deleteGame: failed to delete: " + a.getAbsolutePath());
        }
        File a2 = a(str + ".map", true);
        if (a2.exists()) {
            com.corrodinggames.rts.gameFramework.file.a.b(a2);
        }
    }

    public boolean i() {
        return this.P;
    }

    public boolean j() {
        return this.P && this.u;
    }

    public boolean k() {
        return this.P && !this.u;
    }
}