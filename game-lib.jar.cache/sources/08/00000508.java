package com.corrodinggames.rts.gameFramework.net;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.net.DhcpInfo;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.util.Log;
import com.corrodinggames.rts.AssetsID;
import com.corrodinggames.rts.appFramework.i;
import com.corrodinggames.rts.appFramework.n;
import com.corrodinggames.rts.appFramework.p;
import com.corrodinggames.rts.game.Player;
import com.corrodinggames.rts.game.PlayerData;
import com.corrodinggames.rts.game.maps.b;
import com.corrodinggames.rts.game.units.custom.ag;
import com.corrodinggames.rts.game.units.custom.bd;
import com.corrodinggames.rts.game.units.custom.l;
import com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.Interface.a.c;
import com.corrodinggames.rts.gameFramework.Interface.a.k;
import com.corrodinggames.rts.gameFramework.SyncPacket;
import com.corrodinggames.rts.gameFramework.Unit;
import com.corrodinggames.rts.gameFramework.f;
import com.corrodinggames.rts.gameFramework.file.a;
import com.corrodinggames.rts.gameFramework.steam.SteamEngine;
import com.corrodinggames.rts.gameFramework.utility.SlickToAndroidKeycodes;
import com.corrodinggames.rts.gameFramework.utility.m;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.NetworkInterface;
import java.net.Socket;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Locale;
import java.util.Timer;
import java.util.TimerTask;
import java.util.UUID;
import java.util.concurrent.ConcurrentLinkedQueue;
import net.rudp.ReliableSocket;

/* renamed from: com.corrodinggames.rts.gameFramework.j.ad */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/j/ad.class */
public final class GameNetEngine {
    ArrayList f;

    /* renamed from: g */
    public boolean debug;
    public boolean i;
    public float j;
    public float k;

    /* renamed from: m */
    public int port;

    /* renamed from: n */
    public String passwd;

    /* renamed from: o */
    public boolean useMods;
    public boolean p;

    /* renamed from: q */
    public boolean publicRoom;
    public boolean s;
    public String u;
    public String y;
    private boolean bG;
    public PlayerData z;
    public boolean A;

    /* renamed from: C */
    public boolean isServer;
    public boolean D;
    public String E;
    public boolean G;
    public boolean H;
    public Float K;
    public String L;
    public boolean N;
    public int O;
    public int P;
    public int Q;
    public int R;
    public String S;
    public boolean Y;
    public float Z;
    boolean aa;
    public float ab;
    public float ac;
    public boolean ad;
    public float ae;
    public boolean af;
    public boolean ag;
    public boolean aj;
    public boolean ak;
    public boolean al;
    public boolean an;
    public int ap;
    public int aq;
    public int ar;
    public static boolean as;
    long au;
    public boolean av;
    public GameInputStream aA;
    public GameInputStream aB;

    /* renamed from: aD */
    Thread tcpThread;

    /* renamed from: aE */
    ServerAcceptRunnable tcpAccept;

    /* renamed from: aF */
    Thread udpThread;

    /* renamed from: aG */
    ServerAcceptRunnable udpAccept;

    /* renamed from: aH */
    Timer PingTaskTimer;

    /* renamed from: aI */
    PingTask pingTask;
    Thread aJ;
    af aK;
    boolean aO;
    String aS;
    public String aT;
    public Boolean aU;
    public Boolean aV;
    public boolean aW;
    public float ba;
    public boolean bb;
    public boolean bc;
    public boolean bd;
    public boolean be;
    public boolean bf;
    public String bg;
    public Player bj;
    public Player bk;

    /* renamed from: bn */
    float playerTick;
    float bo;
    int bp;

    /* renamed from: bq */
    int lastSyncTick;
    public long bs;
    public long bt;
    public boolean bx;
    static ArrayList bA;
    Timer bD;
    an bF;
    public static final boolean a = false;
    public static boolean b = true;
    public static boolean c = false;
    public static boolean r = true;
    public static EnterPasswordCallback bE = new EnterPasswordCallback();
    public ac d = new ac();
    public int h = 25;
    public boolean l = false;
    public int t = 5005;
    public boolean v = false;
    public long w = 1;
    public boolean x = false;
    private boolean bH = false;
    public volatile boolean B = false;
    public boolean F = false;
    public int I = 0;

    /* renamed from: bI */
    private volatile float currentStepRate = 1.0f;
    public volatile float J = 1.0f;
    public ArrayList M = new ArrayList();
    public int T = -1;
    public int U = -1;
    public int V = -1;
    public int W = f.rand(1, 9000000);

    /* renamed from: X */
    public int loaclTick = 0;
    public int ah = -1;
    public int ai = 300;

    /* renamed from: am */
    public CheckSumData checkSumData = new CheckSumData();
    public boolean ao = true;
    float at = 0.0f;
    public int aw = 5;
    public int ax = 5;

    /* renamed from: ay */
    public GameMapData gameMapData = new GameMapData();
    public String az = null;
    public a aC = new a();

    /* renamed from: aM */
    public ConcurrentLinkedQueue socketList = new ConcurrentLinkedQueue();
    ConcurrentLinkedQueue aN = new ConcurrentLinkedQueue();

    /* renamed from: aP */
    volatile int connectIndex = 1;

    /* renamed from: aQ */
    Object indexSync = new Object();
    public boolean aX = false;
    boolean aY = false;
    boolean aZ = false;
    public String bh = null;
    public ConcurrentLinkedQueue bi = new ConcurrentLinkedQueue();
    public final Object bl = new Object();
    public boolean bm = false;
    boolean br = false;
    boolean bu = false;
    public Socket bv = null;
    public String bw = null;
    boolean by = false;
    boolean bz = false;
    boolean bB = false;
    final Object bC = new Object();
    public int e = GameEngine.getGameEngine().c(true);
    String aR = f.e(40);
    PlayerConnect aL = new PlayerConnect(this, null);

    public aj a(PlayerConnect playerConnect) {
        String f = playerConnect.f();
        long currentTimeMillis = System.currentTimeMillis();
        if (f == null) {
            playerConnect.b("Is banned: No target");
            return null;
        }
        synchronized (this.M) {
            Iterator it = this.M.iterator();
            while (it.hasNext()) {
                aj ajVar = (aj) it.next();
                if (f.equals(ajVar.a) && ajVar.b > currentTimeMillis) {
                    return ajVar;
                }
            }
            return null;
        }
    }

    public boolean a(PlayerConnect playerConnect, String str, int i) {
        if (playerConnect == null) {
            GameEngine.print("Ban failed: No connection");
            return false;
        }
        String f = playerConnect.f();
        if (f == null) {
            playerConnect.b("Ban failed: No target");
            return false;
        }
        aj ajVar = new aj();
        ajVar.a = playerConnect.f();
        ajVar.b = System.currentTimeMillis() + (i * 1000);
        ajVar.c = str;
        synchronized (this.M) {
            b();
            this.M.add(ajVar);
        }
        playerConnect.c("Banned " + f + " for " + i + "s");
        return true;
    }

    public void a() {
        synchronized (this.M) {
            this.M.clear();
        }
    }

    public void b() {
        synchronized (this.M) {
            int i = 0;
            long currentTimeMillis = System.currentTimeMillis();
            Iterator it = this.M.iterator();
            while (it.hasNext()) {
                i++;
                boolean z = false;
                if (((aj) it.next()).b < currentTimeMillis) {
                    z = true;
                }
                if (i > 1000) {
                    z = true;
                }
                if (z) {
                    it.remove();
                }
            }
        }
    }

    public String a(String str) {
        String replace = str.trim().replace(" ", "_");
        this.y = replace;
        GameEngine gameEngine = GameEngine.getGameEngine();
        if (this.y != null && !this.y.equals(gameEngine.settingsEngine.lastNetworkPlayerName)) {
            gameEngine.settingsEngine.lastNetworkPlayerName = this.y;
            gameEngine.settingsEngine.save();
        }
        return replace;
    }

    /* renamed from: a */
    public void setCurrentStepRate(float f, String str) {
        if (f < 0.1d) {
            a("setCurrentStepRate:" + f + " is too small, source:" + str, true);
        } else {
            this.currentStepRate = f;
        }
    }

    /* renamed from: c */
    public float getCurrentStepRate() {
        return this.currentStepRate;
    }

    public void d() {
        this.ah = GameEngine.getGameEngine().tick;
        this.checkSumData.b();
        this.an = false;
    }

    public void a(GameOutputStream gameOutputStream) {
        GameEngine gameEngine = GameEngine.getGameEngine();
        gameOutputStream.writeByte(0);
        this.gameMapData.a(gameOutputStream);
        gameOutputStream.writeInt(gameEngine.bB);
        gameOutputStream.writeInt(gameEngine.bC);
    }

    public void a(GameInputStream gameInputStream) {
        GameEngine gameEngine = GameEngine.getGameEngine();
        gameInputStream.readByte();
        this.gameMapData.a(gameInputStream);
        gameEngine.bB = gameInputStream.readInt();
        gameEngine.bC = gameInputStream.readInt();
    }

    public GameMapData e() {
        GameMapData gameMapData;
        if (this.isServer) {
            gameMapData = this.gameMapData;
        } else if (this.H) {
            gameMapData = this.gameMapData.clone();
        } else {
            gameMapData = null;
            GameEngine.b("getChangeableSetup", "Clicked but not server or proxy controller");
        }
        return gameMapData;
    }

    public void f() {
        if (this.F) {
            GameEngine.getGameEngine().settingsEngine.aiDifficulty = this.gameMapData.aidiff;
        }
        if (!this.isServer && !this.F) {
            return;
        }
        if (this.aW) {
            GameEngine.g("updateAIDifficulty with gameHasBeenStarted=true");
        } else {
            for (int i = 0; i < PlayerData.c; i++) {
                PlayerData playerData = PlayerData.getPlayerData(i);
                if (playerData != null) {
                    a(playerData);
                }
            }
        }
        aq();
    }

    public void a(PlayerData playerData) {
        if (playerData.w) {
            playerData.c("aiDifficultyOverride=" + playerData.aiDifficulty);
            if (playerData.aiDifficulty != null) {
                playerData.x = playerData.aiDifficulty.intValue();
            } else {
                playerData.x = this.gameMapData.aidiff;
            }
        }
    }

    public boolean b(PlayerData playerData) {
        boolean z = false;
        if (playerData.w) {
            String str = "AI - " + b(playerData.C());
            if (!str.equals(playerData.name)) {
                playerData.name = str;
                z = true;
            }
        }
        return z;
    }

    public void a(GameMapData gameMapData) {
        if (this.isServer) {
            f();
            P();
            L();
            n.o();
        } else if (this.H) {
            b(gameMapData);
        } else {
            GameEngine.m328e("applyChangedSetup but not server or proxy controller");
        }
    }

    private void b(GameMapData gameMapData) {
        GameEngine gameEngine = GameEngine.getGameEngine();
        GameEngine.m328e("applyProxyControl");
        GameMapData gameMapData2 = this.gameMapData;
        if (!gameMapData2.mapName.equals(gameMapData.mapName)) {
            gameEngine.netEngine.k("-map '" + a.o(i.e(gameMapData.mapName)) + "'");
        }
        if (gameMapData2.e != gameMapData.e) {
            gameEngine.netEngine.k("-revealedmap " + (!gameMapData.e ? "true" : "false"));
        }
        if (gameMapData2.fog != gameMapData.fog) {
            gameEngine.netEngine.k("-fog " + gameEngine.netEngine.a(gameMapData.fog));
        }
        if (gameMapData2.credits != gameMapData.credits) {
            gameEngine.netEngine.k("-credits " + gameEngine.netEngine.e(gameMapData.credits));
        }
        if (!f.k(gameMapData2.income, gameMapData.income)) {
            gameEngine.netEngine.k("-income " + f.a(gameMapData.income, 1));
        }
        if (gameMapData2.nukes != gameMapData.nukes) {
            gameEngine.netEngine.k("-nukes " + (!gameMapData.nukes ? "true" : "false"));
        }
        if (gameMapData2.aidiff != gameMapData.aidiff) {
            gameEngine.netEngine.k("-ai " + gameMapData.aidiff);
        }
        if (gameMapData2.initUnit != gameMapData.initUnit) {
            gameEngine.netEngine.k("-startingunits " + gameMapData.initUnit);
        }
        if (gameMapData2.sharedControl != gameMapData.sharedControl) {
            gameEngine.netEngine.k("-sharedControl " + (gameMapData.sharedControl ? "true" : "false"));
        }
    }

    public String g() {
        if (this.gameMapData.fog == 0) {
            return "No fog";
        }
        if (this.gameMapData.fog == 1) {
            return "Basic fog";
        }
        if (this.gameMapData.fog == 2) {
            return "Line of Sight";
        }
        return "Unknown";
    }

    public String a(int i) {
        if (i == 0) {
            return "off";
        }
        if (i == 1) {
            return "basic";
        }
        if (i == 2) {
            return "los";
        }
        return "Unknown";
    }

    public String b(int i) {
        return c(i);
    }

    public String c(int i) {
        if (i == -2) {
            return "Very Easy";
        }
        if (i == -1) {
            return "Easy";
        }
        if (i == 0) {
            return "Medium";
        }
        if (i == 1) {
            return "Hard";
        }
        if (i == 2) {
            return "Very Hard";
        }
        if (i == 3) {
            return "Impossible";
        }
        return "Unknown";
    }

    public String h() {
        return d(this.gameMapData.initUnit);
    }

    public ArrayList i() {
        ArrayList arrayList = new ArrayList();
        for (int i = 1; i <= 4; i++) {
            arrayList.add(Integer.valueOf(i));
        }
        arrayList.addAll(l.s());
        return arrayList;
    }

    public String d(int i) {
        if (i == 1) {
            return "Normal (1 builder)";
        }
        if (i == 2) {
            return "Small Army";
        }
        if (i == 3) {
            return "3 Engineers";
        }
        if (i == 4) {
            return "3 Engineers (No Command Center)";
        }
        if (i == 5) {
            return "Experimental Spider";
        }
        if (i == 9) {
            return "Custom";
        }
        l c2 = l.c(i);
        if (c2 != null) {
            return c2.e();
        }
        return "Unknown";
    }

    public String j() {
        if (this.gameMapData.credits == 0) {
            return "Default ($" + k() + ")";
        }
        return "$" + k();
    }

    public final int k() {
        return e(this.gameMapData.credits);
    }

    public int e(int i) {
        if (i == 0) {
            return 4000;
        }
        if (i == 1) {
            return 0;
        }
        if (i == 2) {
            return 1000;
        }
        if (i == 3) {
            return 2000;
        }
        if (i == 4) {
            return 5000;
        }
        if (i == 5) {
            return 10000;
        }
        if (i == 6) {
            return 50000;
        }
        if (i == 7) {
            return 100000;
        }
        if (i == 8) {
            return 200000;
        }
        return 999;
    }

    public String l() {
        return a.o(this.az);
    }

    public void m() {
        new m();
        f.b((int) SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_CONTENTS_MENU);
        APIEncryption.a(5.0f, 6.0f, 7.0f);
        ar.a(5);
        this.bg = ar.a();
        this.bf = true;
    }

    public boolean n() {
        return this.aW;
    }

    public boolean o() {
        return this.d.e();
    }

    public synchronized void a(boolean z, String str, Boolean bool) {
        this.aV = Boolean.valueOf(z);
        this.aT = str;
        this.aU = bool;
        n.o();
    }

    void a(ListRoomInfo listRoomInfo) {
        Iterator it = this.bi.iterator();
        while (it.hasNext()) {
            ListRoomInfo listRoomInfo2 = (ListRoomInfo) it.next();
            if (listRoomInfo2.a && listRoomInfo2.c.equals(listRoomInfo.c) && listRoomInfo2.g == listRoomInfo.g) {
                listRoomInfo2.o = p();
            }
        }
        listRoomInfo.o = p();
        this.bi.add(listRoomInfo);
        p.l();
    }

    public long p() {
        return System.currentTimeMillis();
    }

    public GameNetEngine() {
        this.aL.p = true;
        this.bj = new Player(-3, false);
        this.bj.name = "SPECTATOR";
        this.bk = new Player(-1, false);
        this.bk.name = "ADMIN";
    }

    public void q() {
        a(false);
    }

    public void r() {
        a(true);
    }

    public void s() {
        this.bH = false;
        this.bG = false;
        this.z = null;
        this.p = false;
        this.bs = System.currentTimeMillis();
        this.loaclTick = 0;
        this.I = 0;
        this.w = 1L;
        setCurrentStepRate(1.0f, "new");
        this.Z = 10.0f;
        this.N = false;
        this.Q = 10;
        this.R = 0;
        this.Y = false;
        this.aa = false;
        this.al = false;
        this.ak = false;
        this.ab = 0.0f;
        this.ac = 0.0f;
        this.ad = false;
        this.af = false;
        this.aW = false;
        this.aY = false;
        this.aZ = false;
        this.ba = 0.0f;
        this.aX = false;
        this.bb = false;
        this.bc = false;
        this.bd = false;
        this.be = false;
        this.ag = false;
        this.ah = -1;
        this.checkSumData.allSum = 0L;
        this.br = false;
        this.checkSumData.a();
        this.an = false;
        this.ao = true;
        this.ap = 0;
        this.aq = 0;
        this.ar = 0;
        this.at = 0.0f;
        this.playerTick = 0.0f;
        this.bo = 0.0f;
        this.bp = 0;
        this.lastSyncTick = -1000;
        APIEncryption.i = 55;
        APIEncryption.j = 66;
    }

    public void a(boolean z) {
        this.B = false;
        this.isServer = false;
        this.f = null;
        this.F = false;
        this.D = false;
        this.E = null;
        this.x = false;
        this.H = false;
        this.G = false;
        this.av = false;
        this.A = false;
        s();
        this.S = null;
        this.port = 0;
        this.i = false;
        this.j = 0.0f;
        this.k = 0.0f;
        this.bz = false;
        this.aB = null;
        this.ax = GameEngine.getGameEngine().settingsEngine.teamUnitCapHostedGame;
        if (this.ax < 1) {
            this.ax = 1;
        }
        this.aw = this.ax;
        this.gameMapData.initUnit = 1;
        this.gameMapData.income = 1.0f;
        this.gameMapData.nukes = false;
        this.gameMapData.j = false;
        this.gameMapData.sharedControl = false;
        this.gameMapData.credits = 0;
        this.gameMapData.m = false;
        this.gameMapData.n = false;
        this.gameMapData.spectators = true;
        this.gameMapData.p = false;
        this.gameMapData.q = 0;
        a();
        this.aC.c();
        GameEngine.getGameEngine().bS.g();
        if ("<CHAT ONLY>".equals(this.gameMapData.mapName)) {
            GameEngine.m328e("Chat only map selection - restarting");
            this.gameMapData.a();
        }
        if (!z) {
            PlayerData.F();
        }
        ag.b(this.useMods);
    }

    public void t() {
    }

    /* renamed from: b */
    public synchronized void closeServer(String str) {
        GameEngine gameEngine = GameEngine.getGameEngine();
        GameEngine.m328e("Disconnect: " + str);
        if (this.isServer) {
            ar();
            GameNetAPIOperate.d();
            if (this.tcpAccept != null) {
                this.tcpAccept.b();
                try {
                    if (this.tcpThread != null) {
                        this.tcpThread.join();
                    }
                } catch (InterruptedException e) {
                }
                this.tcpAccept = null;
                this.tcpThread = null;
            }
            if (this.udpAccept != null) {
                this.udpAccept.b();
                try {
                    if (this.udpThread != null) {
                        this.udpThread.join();
                    }
                } catch (InterruptedException e2) {
                }
                this.udpAccept = null;
                this.udpThread = null;
            }
            if (this.PingTaskTimer != null) {
                this.PingTaskTimer.cancel();
                this.PingTaskTimer = null;
                this.pingTask = null;
            }
            if (this.aK != null) {
                this.aK.b();
                this.aK = null;
                this.aJ = null;
            }
        }
        q(str);
        SteamEngine.getSteamEngine().j();
        synchronized (this.bl) {
            this.B = false;
            this.isServer = false;
            this.F = false;
            this.f = null;
            try {
                wait(50L);
            } catch (InterruptedException e3) {
                e3.printStackTrace();
            }
            this.aW = false;
            gameEngine.replayEngine.close();
            gameEngine.e();
            am();
            this.bm = false;
            this.bl.notifyAll();
        }
    }

    public void u() {
        synchronized (this.bl) {
            if (this.B) {
                this.bm = true;
                try {
                    this.bl.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public void b(PlayerConnect playerConnect) {
        this.socketList.remove(playerConnect);
    }

    private synchronized void ay() {
        Iterator it = this.socketList.iterator();
        while (it.hasNext()) {
            if (((PlayerConnect) it.next()).a) {
                it.remove();
            }
        }
    }

    /* renamed from: a */
    void updateDeSync(byte[] bArr, PlayerConnect playerConnect) {
        if (!GameEngine.ax()) {
            Log.d("RustedWarfare", "Ignoring incoming resync tagged as debug only");
        } else if (playerConnect.u) {
            Log.d("RustedWarfare", "Ignoring desync client save, as past desync was already saved");
        } else {
            playerConnect.u = true;
            Log.d("RustedWarfare", "Saving client save for debugging");
            File file = new File("desyncs/" + ("desync_" + f.a("d MMM yyyy HH.mm.ss") + "_" + playerConnect.connectIndex));
            file.getParentFile().mkdirs();
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(file);
                fileOutputStream.write(bArr);
                fileOutputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: v */
    public void fasySync() {
        if (this.br) {
            return;
        }
        GameEngine.m328e("Adding quick resync command");
        GameEngine gameEngine = GameEngine.getGameEngine();
        SyncPacket b2 = gameEngine.cf.b();
        b2.i = PlayerData.i;
        b2.r = true;
        b2.u = 200;
        gameEngine.netEngine.a(b2);
        this.br = true;
    }

    public void w() {
        GameEngine gameEngine = GameEngine.getGameEngine();
        GameOutputStream gameOutputStream = new GameOutputStream();
        try {
            gameEngine.ca.a(gameOutputStream);
            try {
                gameOutputStream.flashAll();
            } catch (IOException e) {
                e.printStackTrace();
            }
            byte[] byteArray = gameOutputStream.toByteArray();
            gameOutputStream.h();
            if (this.isServer) {
                Iterator it = this.socketList.iterator();
                while (it.hasNext()) {
                    PlayerConnect playerConnect = (PlayerConnect) it.next();
                    if (playerConnect.fastSyncFlag) {
                        playerConnect.fastSyncFlag = false;
                        playerConnect.desyncCountFlag = false;
                        a(playerConnect, byteArray, this.l, false);
                    }
                }
            }
            GameEngine.m328e("Loading quick resync save data (bytes:" + byteArray.length + ")");
            GameInputStream gameInputStream = new GameInputStream(byteArray);
            gameEngine.a("Game resync (quick)...", true);
            int i = gameEngine.tick;
            int i2 = gameEngine.by;
            gameEngine.ca.a(gameInputStream, true, true, true);
            gameEngine.tick = i;
            gameEngine.by = i2;
            this.loaclTick = gameEngine.tick + 1;
            this.ag = false;
            this.ah = this.loaclTick + 1;
            this.checkSumData.allSum = 0L;
            Iterator it2 = this.socketList.iterator();
            while (it2.hasNext()) {
                ((PlayerConnect) it2.next()).desyncCountFlag = false;
            }
            this.br = false;
            this.ar++;
            this.playerTick = 0.0f;
            this.bo = 0.0f;
            if (this.bp < 1) {
                this.bp++;
            }
            this.lastSyncTick = gameEngine.tick;
        } catch (IOException e2) {
            throw new RuntimeException(e2);
        }
    }

    public synchronized void x() {
        Iterator it = this.socketList.iterator();
        while (it.hasNext()) {
            PlayerConnect playerConnect = (PlayerConnect) it.next();
            if (playerConnect.fastSyncFlag) {
                throw new RuntimeException("Player: " + playerConnect.getName() + " has complete desync");
            }
            if (playerConnect.desyncCountFlag) {
                throw new RuntimeException("Player: " + playerConnect.getName() + " has minor desync");
            }
            if (playerConnect.x == 0) {
                throw new RuntimeException("Player: " + playerConnect.getName() + " has no sync matches");
            }
        }
    }

    private synchronized void e(float tick) {
        GameEngine.getGameEngine();
        boolean z = false;
        boolean syncFlag = false;
        boolean z2 = false;
        this.playerTick += tick;
        Iterator it = this.socketList.iterator();
        while (it.hasNext()) {
            PlayerConnect playerConnect = (PlayerConnect) it.next();
            if (playerConnect.fastSyncFlag) {
                z = true;
            }
            if (playerConnect.desyncCountFlag) {
                if (this.debug) {
                    GameEngine.m328e("desync_count:" + playerConnect.desyncCount + " lastResyncTimer:" + this.playerTick);
                }
                if (playerConnect.desyncCount < 4 || this.playerTick > 3600.0f) {
                    z2 = true;
                }
            }
        }
        if (z2) {
            this.bo += tick;
            if (c && this.bo > 5.0f) {
                syncFlag = true;
            }
            if (this.bp == 0) {
                if (this.bo > 60.0f) {
                    syncFlag = true;
                }
            } else if (this.bp == 1) {
                if (this.bo > 420.0f) {
                    syncFlag = true;
                }
            } else if (this.bp == 2) {
                if (this.bo > 3600.0f) {
                    syncFlag = true;
                }
            } else if (this.bp == 3 && this.bo > 14400.0f) {
                syncFlag = true;
            }
        }
        if (as && syncFlag) {
            GameEngine.m328e("disableDesyncFixing==true, running quick resync instead");
            syncFlag = false;
            z = true;
        }
        if (!syncFlag && z) {
            if (b) {
                fasySync();
            } else {
                syncFlag = true;
            }
        }
        if (syncFlag) {
            String str = VariableScope.nullOrMissingString;
            Iterator it2 = this.socketList.iterator();
            while (it2.hasNext()) {
                PlayerConnect playerConnect2 = (PlayerConnect) it2.next();
                if (playerConnect2.fastSyncFlag || playerConnect2.desyncCountFlag) {
                    if (!str.equals(VariableScope.nullOrMissingString)) {
                        str = str + ", ";
                    }
                    str = str + playerConnect2.getName();
                }
            }
            j("Resyncing game for " + str + "...");
            az();
            resync(this.l, false, true);
        }
    }

    private void az() {
        GameEngine gameEngine = GameEngine.getGameEngine();
        this.playerTick = 0.0f;
        this.bo = 0.0f;
        this.bp++;
        this.lastSyncTick = gameEngine.tick;
        Iterator it = this.socketList.iterator();
        while (it.hasNext()) {
            PlayerConnect playerConnect = (PlayerConnect) it.next();
            playerConnect.fastSyncFlag = false;
            playerConnect.desyncCountFlag = false;
            playerConnect.x = 0;
        }
    }

    public void c(String str) {
        q(str);
    }

    private void q(String str) {
        Iterator it = this.socketList.iterator();
        while (it.hasNext()) {
            ((PlayerConnect) it.next()).a(str);
        }
        this.socketList.clear();
        this.aN.clear();
        this.connectIndex = 1;
        this.aO = false;
    }

    public long y() {
        if (0 != 0) {
            GameEngine.m328e("New id set:" + this.w + 1);
            GameEngine.T();
        }
        long j = this.w;
        this.w = j + 1;
        if (j == 0) {
            GameEngine.m328e("getNextUnitId: id==0");
            GameEngine.T();
        }
        return j;
    }

    public long z() {
        return this.w;
    }

    public void a(long j) {
        this.w = j;
    }

    public boolean a(boolean z, int i) {
        Iterator it = this.socketList.iterator();
        while (it.hasNext()) {
            PlayerConnect playerConnect = (PlayerConnect) it.next();
            if (playerConnect.p && playerConnect.h() && !playerConnect.s && !playerConnect.D) {
                if (z) {
                    j("Still waiting on: " + playerConnect.getName());
                    return false;
                }
                return false;
            }
        }
        return true;
    }

    public void A() {
        Iterator it = this.socketList.iterator();
        while (it.hasNext()) {
            PlayerConnect playerConnect = (PlayerConnect) it.next();
            playerConnect.C = false;
            playerConnect.D = false;
        }
    }

    public int B() {
        int i = 0;
        Iterator it = this.socketList.iterator();
        while (it.hasNext()) {
            PlayerConnect playerConnect = (PlayerConnect) it.next();
            if (playerConnect.p && playerConnect.h() && !playerConnect.s) {
                i++;
            }
        }
        return i;
    }

    public int C() {
        ArrayList arrayList = new ArrayList();
        int i = 0;
        Iterator it = this.socketList.iterator();
        while (it.hasNext()) {
            PlayerConnect playerConnect = (PlayerConnect) it.next();
            if (playerConnect.p && playerConnect.h() && !playerConnect.s) {
                Player player = playerConnect.player;
                if (player != null) {
                    if (!arrayList.contains(player)) {
                        arrayList.add(player);
                    }
                }
                i++;
            }
        }
        return i;
    }

    public int D() {
        int i = 0;
        Iterator it = this.socketList.iterator();
        while (it.hasNext()) {
            PlayerConnect playerConnect = (PlayerConnect) it.next();
            if (playerConnect.p && !playerConnect.s) {
                i++;
            }
        }
        return i;
    }

    public int E() {
        int C = 0 + C();
        if (!GameEngine.ax()) {
            C++;
        }
        return C;
    }

    /* renamed from: d */
    public void printLog(String str) {
        Log.b("RustedWarfare", "network:" + str);
    }

    public static void e(String str) {
        GameEngine.m328e("network debug: " + str);
    }

    public void f(String str) {
        Log.d("RustedWarfare", "reportProblem:" + str);
        if (this.aW) {
            b((PlayerConnect) null, -1, (String) null, str);
        } else {
            b((PlayerConnect) null, -1, (String) null, str);
        }
    }

    public static void g(String str) {
        a(str, false);
    }

    public static void h(String str) {
        a(str, true);
    }

    public static void a(String str, boolean z) {
        String str2;
        GameNetEngine gameNetEngine = GameEngine.getGameEngine().netEngine;
        String str3 = "desync:" + str;
        GameEngine.print(str3);
        GameEngine.T();
        gameNetEngine.ap++;
        if (gameNetEngine.ao) {
            if (gameNetEngine.ap > 2 || as) {
                z = true;
            }
            if (gameNetEngine.ap > 10) {
                str2 = "<suppressing desync errors>";
                gameNetEngine.ao = false;
                z = true;
            } else {
                str2 = str3;
            }
            if (z) {
                str2 = "-i " + str2;
            }
            gameNetEngine.m(str2);
        }
    }

    public static void a(String str, String str2) {
        GameEngine gameEngine = GameEngine.getGameEngine();
        gameEngine.replayEngine.a(-1, str, str2, gameEngine.tick);
        if (gameEngine.bS != null && gameEngine.bS.h != null) {
            gameEngine.bS.h.a(str, str2);
        } else {
            GameEngine.g("interfaceEngine/messageInterface==null");
        }
    }

    public void F() {
    }

    public void a(SyncPacket syncPacket) {
        GameEngine gameEngine = GameEngine.getGameEngine();
        syncPacket.localTick = this.loaclTick;
        syncPacket.g();
        gameEngine.cf.commandList.add(syncPacket);
    }

    public void G() {
        Iterator it = this.socketList.iterator();
        while (it.hasNext()) {
            PlayerConnect playerConnect = (PlayerConnect) it.next();
            if (!playerConnect.p || playerConnect.b() == -2 || playerConnect.b() > 500 || playerConnect.b() < 0) {
            }
        }
    }

    public void H() {
        GameEngine gameEngine = GameEngine.getGameEngine();
        String str = VariableScope.nullOrMissingString;
        for (PlayerData playerData : PlayerData.a(true)) {
            if (playerData != null) {
                String str2 = "unnamed";
                if (playerData.name != null) {
                    str2 = playerData.name;
                }
                str = str + "\u2022" + playerData.N().toLowerCase() + " [Team " + playerData.getPlayerTeamName() + "] - " + str2 + (" " + playerData.y()) + "\n";
            }
        }
        GameEngine.m328e("showPlayerListPopup(): Showing playlist messagebox.");
        gameEngine.c("Players", str);
    }

    public void a(float f) {
        GameEngine gameEngine = GameEngine.getGameEngine();
        this.at += f;
        if (this.aZ) {
            if (this.ba > 0.0f) {
                this.ba -= f / 60.0f;
                GameEngine.getGameEngine().bS.a("Returning to battleroom in " + ((int) this.ba) + "...", 3500);
            } else {
                GameEngine.m328e("Sending returnToBattleroomEvent...");
                this.aZ = false;
                i((PlayerConnect) null);
            }
        }
        if (this.aY) {
            aD();
        }
        if (this.at > 60.0f) {
            G();
            this.at = 0.0f;
        }
        if (this.aW && !this.aX) {
            this.aX = true;
            int i = 0;
            int i2 = 0;
            Iterator it = PlayerData.f().iterator();
            while (it.hasNext()) {
                int a2 = PlayerData.a(((Integer) it.next()).intValue(), false);
                if (a2 > i2) {
                    i2 = a2;
                }
                i++;
            }
            if (i > 2 && i2 <= 1) {
                this.bb = true;
            }
        }
        if (!this.isServer && !this.bH) {
            ad();
            this.bH = true;
        }
        if (this.isServer) {
            if (!this.aa && this.aW) {
                if (a(false, 0)) {
                    this.Z = f.a(this.Z, f);
                    if (this.Z == 0.0f) {
                        this.aa = true;
                        a(VariableScope.nullOrMissingString, "<All players ready>");
                        this.d.a();
                    }
                } else {
                    this.ab += f;
                    this.ac += f;
                    if (this.ab > 900.0f) {
                        this.aa = true;
                        a(VariableScope.nullOrMissingString, "Starting game without all players ready!");
                    } else if (this.ac > 180.0f) {
                        this.ac = 0.0f;
                        a(true, (int) ((900.0f - this.ab) / 60.0f));
                    }
                }
            }
            if (this.aa) {
                boolean z = false;
                if (this.ak) {
                    z = true;
                }
                if (this.al) {
                    z = true;
                }
                if (gameEngine.tick >= this.loaclTick - this.R && !z) {
                    int i3 = this.loaclTick + this.Q;
                    this.O++;
                    boolean z2 = false;
                    for (int i4 = 0; i4 < PlayerData.c; i4++) {
                        PlayerData playerData = PlayerData.getPlayerData(i4);
                        if (playerData != null && playerData.V != 0 && !playerData.isTimeOut() && playerData.V < 40) {
                            z2 = true;
                        }
                    }
                    if (gameEngine.b() != 0 && gameEngine.b() < 40 && !GameEngine.ax()) {
                        z2 = true;
                    }
                    if (z2) {
                        this.P++;
                    }
                    if (this.O > 8) {
                        float f2 = 1.0f;
                        if (this.P > 4) {
                            f2 = 2.0f;
                        }
                        if (this.K != null) {
                            f2 = this.K.floatValue();
                        }
                        if (f2 != getCurrentStepRate()) {
                            GameEngine.m328e("Changing step rate to " + f2);
                            SyncPacket b2 = gameEngine.cf.b();
                            b2.i = PlayerData.i;
                            b2.r = true;
                            b2.s = f2;
                            a(b2);
                        }
                        this.O = 0;
                        this.P = 0;
                    }
                    GameOutputStream gameOutputStream = new GameOutputStream();
                    try {
                        gameOutputStream.writeInt(i3);
                        int i5 = 0;
                        Iterator it2 = gameEngine.cf.commandList.iterator();
                        while (it2.hasNext()) {
                            if (((SyncPacket) it2.next()).localTick == this.loaclTick) {
                                i5++;
                            }
                        }
                        gameOutputStream.writeInt(i5);
                        Iterator it3 = gameEngine.cf.commandList.iterator();
                        while (it3.hasNext()) {
                            SyncPacket syncPacket = (SyncPacket) it3.next();
                            if (syncPacket.localTick == this.loaclTick) {
                                syncPacket.write(gameOutputStream);
                            }
                        }
                        Packet packet = gameOutputStream.getPacket(10);
                        packet.e = true;
                        d(packet);
                        this.loaclTick = i3;
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        }
        if (!gameEngine.cf.d.isEmpty()) {
            Iterator it4 = gameEngine.cf.d.iterator();
            while (it4.hasNext()) {
                SyncPacket syncPacket2 = (SyncPacket) it4.next();
                if (0 != 0) {
                    gameEngine.cf.c.add(syncPacket2);
                    it4.remove();
                } else {
                    if (!syncPacket2.x) {
                        syncPacket2.b();
                    }
                    if (syncPacket2.a()) {
                        gameEngine.cf.c.add(syncPacket2);
                        it4.remove();
                    }
                }
            }
        }
        if (!this.isServer) {
            if (!gameEngine.cf.c.isEmpty()) {
                Iterator it5 = gameEngine.cf.c.iterator();
                while (it5.hasNext()) {
                    SyncPacket syncPacket3 = (SyncPacket) it5.next();
                    if (!syncPacket3.e()) {
                        syncPacket3.j();
                        GameOutputStream gameOutputStream2 = new GameOutputStream();
                        try {
                            syncPacket3.write(gameOutputStream2);
                            d(gameOutputStream2.getPacket(20));
                        } catch (IOException e2) {
                            throw new RuntimeException(e2);
                        }
                    }
                }
                gameEngine.cf.c.clear();
            }
        } else if (!gameEngine.cf.c.isEmpty()) {
            Iterator it6 = gameEngine.cf.c.iterator();
            while (it6.hasNext()) {
                SyncPacket syncPacket4 = (SyncPacket) it6.next();
                if (!syncPacket4.e()) {
                    if (!syncPacket4.l()) {
                        g("Skipped command issued from server");
                    } else {
                        syncPacket4.j();
                        a(syncPacket4);
                    }
                }
            }
            gameEngine.cf.c.clear();
        }
        while (!this.aN.isEmpty()) {
            Packet packet2 = (Packet) this.aN.remove();
            try {
                resolveSystemCommandPacket(packet2);
            } catch (IOException e3) {
                String str = "None";
                PlayerConnect playerConnect = packet2.playerConnect;
                if (playerConnect != null) {
                    str = playerConnect.g();
                    String message = e3.getMessage();
                    if (message == null) {
                        message = "IO error";
                    }
                    playerConnect.a(message);
                    g("IO error on processGamePacket for " + playerConnect.getName());
                }
                GameEngine.a("Error on processGamePacket ip:" + str, (Throwable) e3);
            }
        }
        if (this.isServer) {
            if (!this.B) {
                GameEngine.m328e("Skipping server updates, not networked");
            } else {
                ay();
                if (!this.aj) {
                    e(f);
                }
            }
        }
        if (this.B) {
            if (this.al) {
                gameEngine.bS.b("Game paused.", 100);
            } else {
                gameEngine.bS.a("Game paused.");
            }
        }
        if (gameEngine.tick < this.loaclTick) {
            this.Y = false;
        }
        if (this.bm) {
            closeServer("queDisconnect");
        }
    }

    public void b(float f) {
        PlayerConnect W;
        GameEngine gameEngine = GameEngine.getGameEngine();
        if (gameEngine != null && !this.isServer && this.B) {
            boolean z = false;
            Iterator it = this.socketList.iterator();
            while (it.hasNext()) {
                PlayerConnect playerConnect = (PlayerConnect) it.next();
                if (playerConnect.p && !playerConnect.a) {
                    z = true;
                }
            }
            if (this.be && n()) {
                gameEngine.bS.b("Game ended by server.");
                n.o();
            } else if (!z && n()) {
                gameEngine.bS.b("Server Disconnected.");
                n.o();
            }
            if (z) {
                if ((this.Y || this.bs + 1000 < System.currentTimeMillis()) && !this.isServer && (W = W()) != null && W.U > 20000) {
                    String str = "Receiving network data: " + W.V + "/" + W.U;
                    GameEngine.m328e(str);
                    gameEngine.bS.d(str);
                    if (!this.aW && this.bt + 4000 < System.currentTimeMillis()) {
                        this.bt = System.currentTimeMillis();
                        o(str);
                    }
                    a(W, W.V, W.U);
                }
            }
        }
    }

    public void c(float f) {
        GameEngine gameEngine = GameEngine.getGameEngine();
        this.bs = System.currentTimeMillis();
        if (this.B && (this.ah + this.ai < gameEngine.tick || this.ah == -1)) {
            d();
            gameEngine.replayEngine.a(this.checkSumData);
        }
        if ((this.B || gameEngine.replayEngine.j()) && this.N) {
            this.N = false;
            w();
        }
        if (this.B && this.isServer && !this.an && this.ah + (this.ai / 2) < gameEngine.tick && this.ah != -1) {
            try {
                GameOutputStream gameOutputStream = new GameOutputStream();
                gameOutputStream.writeInt(this.ah);
                gameOutputStream.writeLong(this.checkSumData.allSum);
                gameOutputStream.writeInt(this.checkSumData.b.size());
                Iterator it = this.checkSumData.b.iterator();
                while (it.hasNext()) {
                    gameOutputStream.writeLong(((al) it.next()).b);
                }
                h(gameOutputStream.getPacket(30));
                if (this.debug) {
                    GameEngine.m328e("Sent checksum to client [" + this.ah + "]");
                }
                this.an = true;
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public boolean I() {
        GameEngine gameEngine = GameEngine.getGameEngine();
        if (gameEngine.bU.e()) {
            if (!this.bu) {
                GameEngine.m328e("shouldGameBePaused: isGoingToBlockThisFrame()==true: " + gameEngine.bU.f());
            }
            this.bu = true;
            return true;
        }
        if (this.bu) {
            GameEngine.m328e("shouldGameBePaused: isGoingToBlockThisFrame()==false");
        }
        this.bu = false;
        return false;
    }

    public void a(float f, boolean z) {
        GameEngine gameEngine = GameEngine.getGameEngine();
        if (gameEngine.tick >= this.loaclTick) {
            if (gameEngine.tick > this.loaclTick) {
                throw new RuntimeException("game frame:" + gameEngine.tick + " is greater then nest step:" + this.loaclTick);
            }
            this.Y = true;
        }
        if (z && I()) {
            this.Y = true;
        }
    }

    /* renamed from: a */
    public void resolveSystemCommandPacket(Packet packet) {
        GameEngine gameEngine = GameEngine.getGameEngine();
        if (b(packet)) {
            printLog("filtered packet (type:" + packet.type + ")");
            return;
        }
        switch (packet.type) {
            case 10:
                if (this.isServer) {
                    printLog("we are a server! we don't follow orders");
                    return;
                } else if (packet.playerConnect.t) {
                    printLog("ignoring command");
                    return;
                } else {
                    GameInputStream gameInputStream = new GameInputStream(packet);
                    int readInt = gameInputStream.readInt();
                    int readInt2 = gameInputStream.readInt();
                    for (int i = 0; i < readInt2; i++) {
                        SyncPacket b2 = gameEngine.cf.b();
                        b2.localTick = this.loaclTick;
                        b2.read(gameInputStream);
                        a(b2);
                    }
                    if (readInt < this.loaclTick) {
                        g("New nextBlockingFrame:" + readInt + " is smaller than current step:" + this.loaclTick);
                    }
                    this.loaclTick = readInt;
                    return;
                }
            case 20:
                if (!this.isServer) {
                    printLog("we are not a server! skipping");
                    return;
                }
                GameInputStream gameInputStream2 = new GameInputStream(packet);
                PlayerConnect playerConnect = packet.playerConnect;
                if (!playerConnect.a()) {
                    Player player = playerConnect.player;
                    if (player == null) {
                        printLog("Player is null for message ADDCLIENTCOMMAND, skipping");
                        return;
                    }
                    SyncPacket b3 = gameEngine.cf.b();
                    b3.read(gameInputStream2);
                    b3.p = player;
                    if (b3.r) {
                        printLog("Got system action from client, ignoring (" + playerConnect.connectIndex + ")");
                        b3.r = false;
                    }
                    if (b3.c() == null) {
                        g("Invalid command from '" + player.name + "', no team found");
                        return;
                    } else if (!b3.l()) {
                        g("Ignored command from '" + player.name + "', check failed");
                        return;
                    } else {
                        a(b3);
                        return;
                    }
                }
                return;
            case 30:
                PlayerConnect playerConnect2 = packet.playerConnect;
                GameInputStream gameInputStream3 = new GameInputStream(packet);
                int syncTick = gameInputStream3.readInt();
                long readLong = gameInputStream3.readLong();
                if (this.ag) {
                    printLog("PACKET_SYNCCHECKSUM: skipping frame:" + syncTick + ", we were told to wait for resync");
                    return;
                }
                GameOutputStream gameOutputStream = new GameOutputStream();
                gameOutputStream.writeByte(0);
                gameOutputStream.writeInt(syncTick);
                gameOutputStream.writeInt(this.ah);
                if (this.ah != syncTick || this.checkSumData.allSum == 0) {
                    gameOutputStream.writeBoolean(false);
                    Log.d("RustedWarfare", "got remoteSyncFrame for:" + syncTick + " needed:" + this.ah + " lastSyncCheckSum:" + this.checkSumData.allSum);
                } else {
                    gameOutputStream.writeBoolean(true);
                    Log.d("RustedWarfare", "Running checksum");
                    gameOutputStream.writeLong(readLong);
                    gameOutputStream.writeLong(this.checkSumData.allSum);
                    boolean z = false;
                    if (readLong != this.checkSumData.allSum) {
                        g("Checksum doesn't match. Got:" + readLong + " expected:" + this.checkSumData.allSum);
                        z = true;
                        GameEngine.m328e("--- Desync for frame: " + syncTick + " ---");
                        Iterator it = PlayerData.c().iterator();
                        while (it.hasNext()) {
                            ((PlayerData) it.next()).t();
                        }
                    } else {
                        this.aq++;
                    }
                    int readInt3 = gameInputStream3.readInt();
                    if (readInt3 != this.checkSumData.b.size()) {
                        Log.d("RustedWarfare", "checkSumSize!=syncCheckList.size()");
                    }
                    gameOutputStream.e("checkList");
                    gameOutputStream.writeInt(readInt3);
                    gameOutputStream.writeInt(this.checkSumData.b.size());
                    Iterator it2 = this.checkSumData.b.iterator();
                    while (it2.hasNext()) {
                        al alVar = (al) it2.next();
                        long readLong2 = gameInputStream3.readLong();
                        gameOutputStream.writeLong(readLong2);
                        gameOutputStream.writeLong(alVar.b);
                        if (readLong2 != alVar.b && alVar.c) {
                            g("[" + syncTick + "] check(" + alVar.a + "): " + readLong2 + "!=" + alVar.b);
                            z = true;
                        }
                    }
                    gameOutputStream.endBlock("checkList");
                    gameOutputStream.writeBoolean(z);
                }
                if (!this.isServer) {
                    a(playerConnect2, gameOutputStream.getPacket(31));
                    return;
                }
                return;
            case 31:
                if (!this.isServer) {
                    printLog("we are not a server, but got PACKET_SYNCCHECKSUM_STATUS");
                    return;
                }
                PlayerConnect playerConnect3 = packet.playerConnect;
                GameInputStream gameInputStream4 = new GameInputStream(packet);
                gameInputStream4.readByte();
                int reciveTick = gameInputStream4.readInt();
                int readInt4 = gameInputStream4.readInt();
                if (gameInputStream4.readBoolean()) {
                    gameInputStream4.readLong();
                    gameInputStream4.readLong();
                    gameInputStream4.startBlock("checkList");
                    gameInputStream4.readInt();
                    if (gameInputStream4.readInt() != this.checkSumData.b.size()) {
                        Log.d("RustedWarfare", "checkSumSize!=syncCheckList.size()");
                    }
                    Iterator it3 = this.checkSumData.b.iterator();
                    while (it3.hasNext()) {
                        al alVar2 = (al) it3.next();
                        long server = gameInputStream4.readLong();
                        long client = gameInputStream4.readLong();
                        if (server != client) {
                            GameEngine.print(alVar2.a + " Checksum [" + reciveTick + "]. server:" + server + " client:" + client);
                        }
                    }
                    gameInputStream4.endBlock("checkList");
                    boolean desyncCountFlag = gameInputStream4.readBoolean();
                    if (this.lastSyncTick >= reciveTick) {
                        printLog("Not marking desync, already resynced before frame: " + this.lastSyncTick + "<=" + reciveTick);
                        return;
                    }
                    if (!playerConnect3.desyncCountFlag && desyncCountFlag) {
                        playerConnect3.desyncCount++;
                    }
                    playerConnect3.desyncCountFlag = desyncCountFlag;
                    if (!desyncCountFlag) {
                        if (this.debug) {
                            GameEngine.m328e("checksum: client checksum match [" + reciveTick + "]");
                        }
                        playerConnect3.x++;
                        return;
                    }
                    GameEngine.m328e("client:" + playerConnect3.getName() + " desync [" + reciveTick + "]");
                    if (this.aj && !this.ak) {
                        g("pauseOnDesync is active, pausing");
                        this.ak = true;
                        return;
                    }
                    return;
                } else if (this.debug) {
                    GameEngine.m328e("checksum for:" + playerConnect3.getName() + " frameMatch==false client:" + readInt4 + " server:[" + reciveTick + "]");
                    return;
                } else {
                    return;
                }
            case 35:
                GameInputStream gameInputStream5 = new GameInputStream(packet);
                gameInputStream5.readByte();
                int readInt5 = gameInputStream5.readInt();
                int readInt6 = gameInputStream5.readInt();
                float readFloat = gameInputStream5.readFloat();
                float readFloat2 = gameInputStream5.readFloat();
                if (!this.isServer && readFloat < 0.1d) {
                    a("resync packet with setCurrentStepRate:" + readFloat + " is too small", true);
                }
                PlayerConnect playerConnect4 = packet.playerConnect;
                if (playerConnect4.t) {
                    printLog("ignoring resync command");
                    return;
                }
                boolean readBoolean = gameInputStream5.readBoolean();
                if (gameInputStream5.readBoolean()) {
                    if (!this.isServer) {
                        printLog("we are not a server, but got a debug game save! skipping");
                        return;
                    } else {
                        updateDeSync(gameInputStream5.getBytesAndCheckMark("gameSave"), playerConnect4);
                        return;
                    }
                }
                GameEngine.m328e("Reloading from network save");
                if (readBoolean && !this.isServer) {
                    resync(false, true, false);
                }
                byte[] bytesAndCheckMark = gameInputStream5.getBytesAndCheckMark("gameSave");
                GameEngine.m328e("Save size: " + bytesAndCheckMark.length);
                if (this.l) {
                    updateDeSync(bytesAndCheckMark, playerConnect4);
                }
                gameEngine.replayEngine.a(bytesAndCheckMark, gameEngine.tick, readInt5, readInt6, readFloat, readFloat2);
                GameInputStream gameInputStream6 = new GameInputStream(bytesAndCheckMark);
                gameEngine.a("Resyncing game from server...", true);
                gameEngine.ca.a(gameInputStream6, true, true, true);
                gameEngine.Z();
                this.ar++;
                gameEngine.tick = readInt5;
                gameEngine.by = readInt6;
                this.loaclTick = readInt5 + 1;
                this.ag = false;
                this.ah = this.loaclTick + 1;
                this.checkSumData.allSum = 0L;
                if (readFloat < 0.1d) {
                    a("resync setCurrentStepRate:" + readFloat + " is too small", true);
                }
                setCurrentStepRate(readFloat, "rsync");
                this.J = readFloat2;
                return;
            default:
                printLog("we did not handle packet:" + packet.type);
                return;
        }
    }

    public synchronized boolean b(Packet packet) {
        PlayerConnect playerConnect;
        if (this.isServer && (playerConnect = packet.playerConnect) != null && !playerConnect.p && packet.type != 105 && packet.type != 110 && packet.type != 111 && packet.type != 108 && packet.type != 160) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public synchronized void resolveCommandPacket(Packet packet) {
        int i;
        String isReadString;
        GameEngine gameEngine = GameEngine.getGameEngine();
        if (b(packet)) {
            printLog("filtered packet (type:" + packet.type + ")");
            return;
        }
        switch (packet.type) {
            case 4:
                PlayerConnect playerConnect = packet.playerConnect;
                GameInputStream gameInputStream = new GameInputStream(packet);
                gameInputStream.readByte();
                gameInputStream.readInt();
                gameInputStream.readInt();
                return;
            case 105:
                printLog("got PACKET_GET_SERVER_INFO");
                if (!this.isServer) {
                    printLog("we are not a server! skipping");
                    return;
                }
                return;
            case 106:
                if (this.isServer) {
                    printLog("we are a server! we don't follow orders");
                    return;
                }
                GameInputStream gameInputStream2 = new GameInputStream(packet);
                PlayerConnect playerConnect2 = packet.playerConnect;
                gameInputStream2.readString();
                gameInputStream2.readInt();
                this.gameMapData.mapType = (MapType) gameInputStream2.b(MapType.class);
                this.gameMapData.mapName = gameInputStream2.readString();
                this.gameMapData.credits = gameInputStream2.readInt();
                this.gameMapData.fog = gameInputStream2.readInt();
                this.gameMapData.e = gameInputStream2.readBoolean();
                this.gameMapData.aidiff = gameInputStream2.readInt();
                byte readByte = gameInputStream2.readByte();
                this.G = gameInputStream2.readBoolean();
                this.H = gameInputStream2.readBoolean();
                this.av = true;
                if (readByte >= 1) {
                    this.aw = gameInputStream2.readInt();
                    this.ax = gameInputStream2.readInt();
                }
                if (readByte >= 2) {
                    this.gameMapData.initUnit = gameInputStream2.readInt();
                    this.gameMapData.income = gameInputStream2.readFloat();
                    this.gameMapData.nukes = gameInputStream2.readBoolean();
                    this.gameMapData.j = gameInputStream2.readBoolean();
                }
                if (readByte >= 3 && gameInputStream2.readBoolean()) {
                    try {
                        l.a(gameInputStream2);
                        this.x = true;
                    } catch (bd e) {
                        closeServer("Missing unit:" + e.getMessage() + " d:" + e.b);
                        b("Server sync mismatch", e.getMessage());
                        if (!GameEngine.av()) {
                            gameEngine.i(e.getMessage());
                        }
                        String str = "Server sync mismatch";
                        if (e.a != null) {
                            str = e.a;
                        }
                        gameEngine.d(str, e.getMessage());
                        return;
                    }
                }
                if (readByte >= 4) {
                    this.gameMapData.sharedControl = gameInputStream2.readBoolean();
                }
                if (readByte >= 5) {
                    this.gameMapData.m = gameInputStream2.readBoolean();
                }
                if (readByte >= 6) {
                    this.gameMapData.n = gameInputStream2.readBoolean();
                }
                if (readByte >= 7) {
                    this.gameMapData.spectators = gameInputStream2.readBoolean();
                    this.gameMapData.p = gameInputStream2.readBoolean();
                }
                if (readByte >= 8) {
                    this.gameMapData.q = gameInputStream2.readInt();
                }
                n.o();
                return;
            case 108:
                PlayerConnect playerConnect3 = packet.playerConnect;
                GameInputStream gameInputStream3 = new GameInputStream(packet);
                long readLong = gameInputStream3.readLong();
                gameInputStream3.readByte();
                GameOutputStream gameOutputStream = new GameOutputStream();
                gameOutputStream.writeLong(readLong);
                gameOutputStream.writeByte(1);
                int b2 = gameEngine.b();
                if (b2 > 130) {
                    b2 = 130;
                }
                gameOutputStream.writeByte(b2);
                a(playerConnect3, gameOutputStream.getPacket(109));
                return;
            case 109:
                if (!this.isServer) {
                    printLog("we are not a server! skipping");
                    return;
                }
                long currentTimeMillis = System.currentTimeMillis();
                PlayerConnect playerConnect4 = packet.playerConnect;
                GameInputStream gameInputStream4 = new GameInputStream(packet);
                long readLong2 = gameInputStream4.readLong();
                byte b3 = 0;
                if (gameInputStream4.readByte() >= 1) {
                    b3 = gameInputStream4.readByte();
                }
                int i2 = (int) (currentTimeMillis - readLong2);
                playerConnect4.A = i2;
                playerConnect4.B = currentTimeMillis;
                if (playerConnect4.player != null) {
                    playerConnect4.player.ping = i2;
                    playerConnect4.player.lastReciveTime = currentTimeMillis;
                    playerConnect4.player.V = b3;
                }
                if (playerConnect4.q && this.isServer && this.D && this.z != null) {
                    this.z.ping = i2;
                    this.z.lastReciveTime = currentTimeMillis;
                }
                if (!this.aW) {
                    n.o();
                    return;
                }
                return;
            case 110:
                printLog("got REGISTER_CONNECTION");
                if (!this.isServer) {
                    printLog("we are not a server! skipping");
                    return;
                }
                GameInputStream gameInputStream5 = new GameInputStream(packet);
                PlayerConnect playerConnect5 = packet.playerConnect;
                gameInputStream5.readString();
                int readInt = gameInputStream5.readInt();
                int clientVersion = gameInputStream5.readInt();
                int clientPacketVersion = gameInputStream5.readInt();
                String readString = gameInputStream5.readString();
                String isReadString2 = gameInputStream5.isReadString();
                String str2 = null;
                playerConnect5.clientVersion = clientVersion;
                if (readInt >= 1) {
                    playerConnect5.L = gameInputStream5.readString();
                }
                if (readInt >= 2) {
                    str2 = gameInputStream5.readString();
                }
                int i3 = -1;
                if (readInt >= 3) {
                    i3 = gameInputStream5.readInt();
                }
                String str3 = "MISSING";
                if (readInt >= 4) {
                    str3 = gameInputStream5.readString();
                }
                String str4 = VariableScope.nullOrMissingString;
                if (readInt >= 5) {
                    str4 = gameInputStream5.readString();
                }
                if (readString.length() > 20) {
                    a(playerConnect5, "Your username is too long");
                    playerConnect5.a("kicked");
                    return;
                }
                String p = p(readString);
                if (p.length() < 2) {
                    a(playerConnect5, "Your username is too short");
                    playerConnect5.a("kicked");
                    return;
                }
                Player player = null;
                if (str2 != null) {
                    player = PlayerData.a(str2);
                    if (player != null) {
                        printLog("Existing player: " + player.site + " - " + player.name);
                    }
                }
                aj a2 = a(playerConnect5);
                if (a2 != null) {
                    GameEngine.m328e("Connection banned for " + a2.b() + " more seconds");
                    a(playerConnect5, a2.a());
                    playerConnect5.a("kicked");
                    return;
                }
                String a3 = this.d.a(playerConnect5, p, clientVersion, clientPacketVersion, playerConnect5.L, player);
                if (a3 != null) {
                    a(playerConnect5, a3);
                    playerConnect5.a("kicked");
                    return;
                } else if (clientVersion < this.e && !this.v) {
                    a(playerConnect5, "Game is out of date, please update to v" + gameEngine.u());
                    playerConnect5.a("kicked");
                    return;
                } else if (clientVersion > this.e && !this.v) {
                    a(playerConnect5, "Your client is newer then the server. Server is on: v" + gameEngine.u());
                    playerConnect5.a("kicked");
                    return;
                } else if (!this.v && i3 != gameEngine.z()) {
                    GameEngine.m328e("New Player kicked: Unit checksum mismatch: clientUnitsChecksum=" + i3 + " game.getAllUnitsChecksum():" + gameEngine.z());
                    a(playerConnect5, "Your core units are different to the server's core units. Game can not be synchronized");
                    playerConnect5.a("kicked");
                    return;
                } else {
                    if (!this.v) {
                        String g = g(playerConnect5.connectKey);
                        if (!g.equals(str3)) {
                            GameEngine.m328e("New Player kicked: Integrity Check Failed: expectedResponse=" + g + " clientResponse=" + str3);
                            a(playerConnect5, "Your 'Rusted Warfare' client is different to the server. Game can not be synchronized.");
                            playerConnect5.a("kicked");
                            return;
                        }
                    }
                    if (!this.aW && this.gameMapData.p) {
                        a(playerConnect5, "Room is locked. New players cannot join this server.");
                        playerConnect5.a("kicked");
                        return;
                    } else if (this.aW && player == null && !this.s) {
                        a(playerConnect5, "A game has already been started on this server");
                        playerConnect5.a("kicked");
                        return;
                    } else if (this.passwd != null && player == null && !f.e(this.passwd).equals(isReadString2)) {
                        if (isReadString2 == null) {
                            GameEngine.b("processSystemPacket", "Player tried to join but needs a password");
                        } else {
                            GameEngine.b("processSystemPacket", "Player tried to join but had an incorrect password");
                        }
                        d(playerConnect5);
                        return;
                    } else {
                        if (!h(this.W).equals(str4)) {
                            playerConnect5.c("no extra");
                            playerConnect5.N = true;
                        }
                        if (playerConnect5.player == null) {
                            synchronized (this.bC) {
                                if (player == null) {
                                    i = PlayerData.getNullSite();
                                } else {
                                    i = player.site;
                                }
                                if (i == -1 && !this.v) {
                                    a(playerConnect5, "No free slots on server");
                                    playerConnect5.a("no free slots");
                                    return;
                                }
                                String a4 = this.d.a(playerConnect5, p);
                                if (a4 != null) {
                                    a(playerConnect5, a4);
                                    playerConnect5.a("kicked");
                                } else {
                                    APIEncryption.a(playerConnect5);
                                    if (!this.v && playerConnect5.O) {
                                        a(playerConnect5, VariableScope.nullOrMissingString);
                                        playerConnect5.a("kicked");
                                        return;
                                    }
                                    String str5 = null;
                                    if (player != null) {
                                        playerConnect5.player = player;
                                        String str6 = VariableScope.nullOrMissingString;
                                        if (this.aW) {
                                            if (player.b()) {
                                                str6 = " (Spectator)";
                                            } else {
                                                str6 = " (Team " + player.getPlayerTeamName() + ")";
                                            }
                                        }
                                        j("'" + playerConnect5.player.name + "' reconnected. " + str6);
                                        playerConnect5.fastSyncFlag = true;
                                        str5 = player.name;
                                        player.P = playerConnect5.m;
                                    } else {
                                        if (this.v && i == -1) {
                                            playerConnect5.player = new Player(-3);
                                        } else {
                                            playerConnect5.player = new Player(i);
                                            playerConnect5.player.team = i % 2;
                                        }
                                        if (this.aW && this.s) {
                                            playerConnect5.fastSyncFlag = true;
                                        }
                                    }
                                    if (player == null && p != null) {
                                        ArrayList ax = ax();
                                        int i4 = 0;
                                        while (true) {
                                            if (i4 < 10) {
                                                boolean z = false;
                                                String str7 = p;
                                                if (i4 > 0) {
                                                    str7 = str7 + "(" + i4 + ")";
                                                }
                                                Iterator it = ax.iterator();
                                                while (it.hasNext()) {
                                                    if (str7.equalsIgnoreCase(((PlayerData) it.next()).name)) {
                                                        z = true;
                                                    }
                                                }
                                                if (z) {
                                                    i4++;
                                                } else {
                                                    p = str7;
                                                }
                                            }
                                        }
                                    }
                                    playerConnect5.player.name = p;
                                    playerConnect5.player.connectHexID = str2;
                                    playerConnect5.player.P = playerConnect5.m;
                                    playerConnect5.clientVersion = clientVersion;
                                    GameEngine.b("processSystemPacket", "New player: " + p + ", networkVersion:" + playerConnect5.clientVersion + " existing:" + (player != null));
                                    playerConnect5.p = true;
                                    if (player == null) {
                                        this.d.a(playerConnect5.player);
                                    }
                                    n.o();
                                    sendTeamData(playerConnect5);
                                    sendServerInfo(playerConnect5);
                                    this.d.c(playerConnect5, p, str5);
                                    if ((player != null || this.s) && this.aW) {
                                        sendStartGamePacket(playerConnect5, true);
                                    }
                                }
                                return;
                            }
                        }
                        GameEngine.b("processSystemPacket", "This connection already has a player");
                        return;
                    }
                }
            case 111:
                GameInputStream gameInputStream6 = new GameInputStream(packet);
                PlayerConnect playerConnect6 = packet.playerConnect;
                String str8 = null;
                try {
                    str8 = gameInputStream6.readString();
                } catch (IOException e2) {
                    GameEngine.a("Error reading disconnect reason", (Throwable) e2);
                }
                printLog("Got a disconnect packet:" + str8);
                if (playerConnect6 != null) {
                    playerConnect6.a(false, false, str8);
                }
                if (!this.isServer) {
                }
                return;
            case 112:
                if (!this.isServer) {
                    printLog("we are not a server! skipping");
                    return;
                }
                PlayerConnect playerConnect7 = packet.playerConnect;
                GameInputStream gameInputStream7 = new GameInputStream(packet);
                playerConnect7.C = gameInputStream7.readBoolean();
                playerConnect7.D = gameInputStream7.readBoolean();
                return;
            case 113:
                if (this.isServer) {
                    printLog("we are a server! skipping: " + packet.type);
                    return;
                } else {
                    a(bE);
                    return;
                }
            case 115:
                if (this.isServer) {
                    printLog("we are a server! we don't follow orders");
                    return;
                }
                GameInputStream gameInputStream8 = new GameInputStream(packet);
                gameInputStream8.setCacheInt(packet.playerConnect.clientVersion);
                PlayerConnect playerConnect8 = packet.playerConnect;
                int readInt2 = gameInputStream8.readInt();
                PlayerData playerData = null;
                int i5 = 8;
                boolean z2 = false;
                if (gameInputStream8.getCacheInt() >= 90) {
                    boolean z3 = false;
                    if (gameInputStream8.getCacheInt() >= 141) {
                        z3 = true;
                        z2 = gameInputStream8.readBoolean();
                    }
                    i5 = gameInputStream8.readInt();
                    PlayerData.b(i5, false);
                    gameInputStream8.a("teams", z3);
                    if (i5 > PlayerData.c) {
                        throw new IOException("Cannot load:" + i5 + " teams");
                    }
                } else if (this.aW) {
                    g("Warning old team system used in started game, stream version:" + gameInputStream8.getCacheInt());
                }
                for (int i6 = 0; i6 < i5; i6++) {
                    Player playerData2 = PlayerData.getPlayerData(i6);
                    if (!gameInputStream8.readBoolean()) {
                        if (playerData2 != null) {
                            if (this.aW) {
                                g("Warning team:" + i6 + " removed while game is running");
                            }
                            playerData2.I();
                        }
                    } else {
                        gameInputStream8.readInt();
                        if (playerData2 == null) {
                            if (this.aW) {
                                g("Warning team:" + i6 + " added while game is running");
                            }
                            if (!this.isServer && (playerData2 instanceof com.corrodinggames.rts.game.a.a)) {
                                g("Warning we are a client with an AI team");
                            }
                            playerData2 = new Player(i6);
                        }
                        if (z2) {
                            playerData2.a(gameInputStream8);
                        } else {
                            playerData2.a(gameInputStream8, this.aW);
                        }
                    }
                    if (playerData2 != null && playerData2.site == readInt2) {
                        playerData = playerData2;
                    }
                }
                if (gameInputStream8.getCacheInt() >= 90) {
                    gameInputStream8.endBlock("teams");
                }
                this.z = playerData;
                this.gameMapData.fog = gameInputStream8.readInt();
                this.gameMapData.credits = gameInputStream8.readInt();
                this.gameMapData.e = gameInputStream8.readBoolean();
                this.gameMapData.aidiff = gameInputStream8.readInt();
                byte readByte2 = gameInputStream8.readByte();
                this.aw = gameInputStream8.readInt();
                this.ax = gameInputStream8.readInt();
                if (readByte2 >= 2) {
                    this.gameMapData.initUnit = gameInputStream8.readInt();
                    this.gameMapData.income = gameInputStream8.readFloat();
                    this.gameMapData.nukes = gameInputStream8.readBoolean();
                    this.gameMapData.j = gameInputStream8.readBoolean();
                }
                if (readByte2 >= 3 && gameInputStream8.readBoolean()) {
                    try {
                        l.a(gameInputStream8);
                        this.x = true;
                    } catch (bd e3) {
                        closeServer("Missing unit:" + e3.getMessage() + " d:" + e3.b);
                        b("Connection Failed", e3.getMessage());
                        if (!GameEngine.av()) {
                            gameEngine.i(e3.getMessage());
                        }
                        gameEngine.d("Connection Failed", e3.getMessage());
                        return;
                    }
                }
                if (readByte2 >= 4) {
                    this.gameMapData.sharedControl = gameInputStream8.readBoolean();
                }
                if (readByte2 >= 5) {
                    this.al = gameInputStream8.readBoolean();
                }
                n.o();
                return;
            case 116:
                if (this.isServer) {
                    printLog("we are a server! we don't follow orders");
                    return;
                }
                GameInputStream gameInputStream9 = new GameInputStream(packet);
                PlayerConnect playerConnect9 = packet.playerConnect;
                gameInputStream9.readInt();
                boolean readBoolean = gameInputStream9.readBoolean();
                if (readBoolean && !this.be) {
                    this.be = readBoolean;
                    return;
                }
                return;
            case 117:
                PlayerConnect playerConnect10 = packet.playerConnect;
                if (this.isServer && !playerConnect10.q) {
                    printLog("we are a server! skipping: " + packet.type);
                    return;
                }
                GameInputStream gameInputStream10 = new GameInputStream(packet);
                gameInputStream10.readByte();
                int readInt3 = gameInputStream10.readInt();
                String readString2 = gameInputStream10.readString();
                EnterPasswordCallback enterPasswordCallback = new EnterPasswordCallback();
                enterPasswordCallback.d = true;
                enterPasswordCallback.c = readInt3;
                enterPasswordCallback.b = readString2;
                a(enterPasswordCallback);
                return;
            case 118:
                return;
            case 120:
                if (this.isServer) {
                    printLog("error, we are a server but got: PACKET_START_GAME");
                    return;
                }
                GameInputStream gameInputStream11 = new GameInputStream(packet);
                gameInputStream11.readByte();
                this.gameMapData.mapType = (MapType) gameInputStream11.b(MapType.class);
                if (this.gameMapData.mapType == MapType.savedGame) {
                    this.aA = gameInputStream11.u();
                } else if (this.gameMapData.mapType == MapType.customMap) {
                    this.aB = gameInputStream11.u();
                }
                this.az = gameInputStream11.readString();
                aB();
                return;
            case 122:
                if (this.isServer) {
                    printLog("error, we are a server but got: PACKET_RETURN_TO_BATTLEROOM");
                    return;
                } else {
                    aC();
                    return;
                }
            case 140:
                if (!this.isServer) {
                    printLog("we are not a server! skipping");
                    return;
                }
                PlayerConnect playerConnect11 = packet.playerConnect;
                GameInputStream gameInputStream12 = new GameInputStream(packet);
                Player player2 = playerConnect11.player;
                if (player2 == null) {
                    if (playerConnect11.q) {
                        printLog("Allowing message from non player on forwarding connection");
                        player2 = this.bk;
                    } else {
                        printLog("player is null for message, skipping");
                        return;
                    }
                }
                String readString3 = gameInputStream12.readString();
                gameInputStream12.readByte();
                String i7 = i(readString3);
                if (this.d.a(playerConnect11, player2.name, i7)) {
                    if (this.aC.a(playerConnect11, 60000) > this.h) {
                        if (f.a(playerConnect11.g, System.nanoTime()) > 60000) {
                            playerConnect11.g = System.nanoTime();
                            j("Anti-spam: Too many messages from '" + playerConnect11.getName() + "'");
                        }
                        if (this.debug) {
                            GameEngine.m328e("extraDebug:" + i7);
                            return;
                        }
                        return;
                    }
                    a(playerConnect11, player2, player2.name, i7);
                    this.d.b(playerConnect11, player2.name, i7);
                    b(playerConnect11, player2, player2.name, i7);
                    return;
                }
                return;
            case 141:
                if (this.isServer && !packet.playerConnect.q) {
                    printLog("error, we are a server but got: PACKET_RECEIVE_CHAT_FROM_SERVER");
                    return;
                }
                GameInputStream gameInputStream13 = new GameInputStream(packet);
                String readString4 = gameInputStream13.readString();
                byte readByte3 = gameInputStream13.readByte();
                String isReadString3 = gameInputStream13.isReadString();
                gameInputStream13.readInt();
                int i8 = -1;
                if (readByte3 >= 3) {
                    i8 = gameInputStream13.readInt();
                }
                b((PlayerConnect) null, i8, isReadString3, readString4);
                return;
            case 150:
                if (this.isServer) {
                    printLog("error, we are a server but got: PACKET_SEND_KICK");
                    return;
                }
                String c2 = com.corrodinggames.rts.gameFramework.translations.a.c(new GameInputStream(packet).readString());
                printLog("we got kicked, reason:" + c2);
                closeServer("I was kicked");
                b("Kicked", "Kicked: " + c2);
                gameEngine.d("Kicked", "Kicked: " + c2);
                gameEngine.i("Kicked: " + c2);
                return;
            case 151:
                PlayerConnect playerConnect12 = packet.playerConnect;
                if (this.isServer && !playerConnect12.q) {
                    printLog("error, we are a server but got: 151");
                    return;
                }
                long loadAllUnitsTook = Unit.loadAllUnitsTook();
                GameInputStream gameInputStream14 = new GameInputStream(packet);
                int readInt4 = gameInputStream14.readInt();
                int readInt5 = gameInputStream14.readInt();
                if (gameInputStream14.readBoolean()) {
                    APIEncryption.i = gameInputStream14.readInt();
                }
                if (gameInputStream14.readBoolean()) {
                    APIEncryption.j = gameInputStream14.readInt();
                }
                String str9 = VariableScope.nullOrMissingString;
                if (readInt5 == 0) {
                    str9 = VariableScope.nullOrMissingString + APIEncryption.i;
                }
                if (readInt5 == 1) {
                    str9 = VariableScope.nullOrMissingString + APIEncryption.j;
                }
                if (readInt5 == 2) {
                    str9 = g(APIEncryption.i);
                }
                if (readInt5 == 3) {
                    str9 = f.c(APIEncryption.i + "|" + APIEncryption.j);
                }
                if (readInt5 == 4) {
                    str9 = f.c(APIEncryption.i + "|" + APIEncryption.j);
                }
                if (readInt5 == 5 || readInt5 == 6) {
                    String readString5 = gameInputStream14.readString();
                    String readString6 = gameInputStream14.readString();
                    int readInt6 = gameInputStream14.readInt();
                    if (readInt5 == 6) {
                        readString6 = readString6 + APIEncryption.i;
                    }
                    if (readInt6 > 10000000) {
                        str9 = "max";
                    } else {
                        str9 = "-1";
                        int i9 = 0;
                        while (true) {
                            if (i9 <= readInt6) {
                                if (!f.c(readString6 + i9).equals(readString5)) {
                                    i9++;
                                } else {
                                    str9 = VariableScope.nullOrMissingString + i9;
                                }
                            }
                        }
                    }
                }
                if (readInt5 == 7) {
                    String readString7 = gameInputStream14.readString();
                    int readInt7 = gameInputStream14.readInt();
                    if (readInt7 > 10000) {
                        str9 = "max";
                    } else {
                        str9 = VariableScope.nullOrMissingString;
                        for (int i10 = 0; i10 < readInt7; i10++) {
                            str9 = str9 + readString7;
                        }
                    }
                }
                float a5 = Unit.a(loadAllUnitsTook);
                GameOutputStream gameOutputStream2 = new GameOutputStream();
                gameOutputStream2.writeInt(readInt4);
                gameOutputStream2.writeInt(readInt5);
                gameOutputStream2.writeString(str9);
                gameOutputStream2.writeFloat(a5);
                a(playerConnect12, gameOutputStream2.getPacket(152));
                return;
            case 160:
                GameInputStream gameInputStream15 = new GameInputStream(packet);
                PlayerConnect playerConnect13 = packet.playerConnect;
                gameInputStream15.readString();
                int readInt8 = gameInputStream15.readInt();
                gameInputStream15.readInt();
                if (readInt8 >= 1) {
                    gameInputStream15.readInt();
                }
                if (playerConnect13.i) {
                    GameEngine.m328e("steam: request info packet");
                }
                if (readInt8 >= 2 && (isReadString = gameInputStream15.isReadString()) != null) {
                    playerConnect13.c("Using query string: " + isReadString);
                    playerConnect13.o = isReadString;
                }
                if (readInt8 >= 3) {
                    gameInputStream15.readString();
                }
                if (readInt8 >= 4) {
                    gameInputStream15.readString();
                    String readString8 = gameInputStream15.readString();
                    if (GameEngine.ax()) {
                        playerConnect13.c("Misc: " + readString8);
                    }
                }
                g(playerConnect13);
                return;
            case 161:
                if (this.isServer) {
                    printLog("we are a server! we don't PREREGISTER_INFO");
                    return;
                }
                GameInputStream gameInputStream16 = new GameInputStream(packet);
                PlayerConnect playerConnect14 = packet.playerConnect;
                if (playerConnect14.i) {
                    GameEngine.m328e("steam: got info packet");
                }
                gameInputStream16.readString();
                int readInt9 = gameInputStream16.readInt();
                int readInt10 = gameInputStream16.readInt();
                gameInputStream16.readInt();
                gameInputStream16.readString();
                this.S = gameInputStream16.readString();
                playerConnect14.clientVersion = readInt10;
                if (readInt9 >= 1) {
                    this.T = gameInputStream16.readInt();
                }
                if (readInt9 >= 2) {
                    this.U = gameInputStream16.readInt();
                    this.V = gameInputStream16.readInt();
                }
                if (this.bz) {
                    printLog("PACKET_SEND_PREREGISTER_INFO: Register connection has already been sent (resending)");
                }
                h(playerConnect14);
                return;
            case 163:
                if (this.isServer) {
                    printLog("we are already a server");
                    return;
                }
                GameInputStream gameInputStream17 = new GameInputStream(packet);
                gameInputStream17.readByte();
                int readInt11 = gameInputStream17.readInt();
                gameInputStream17.readInt();
                gameInputStream17.isReadString();
                printLog("Relay version: " + readInt11);
                return;
            case 170:
                printLog("Got 'become server' packet");
                if (this.isServer) {
                    printLog("we are already a server");
                    return;
                }
                PlayerConnect playerConnect15 = packet.playerConnect;
                GameInputStream gameInputStream18 = new GameInputStream(packet);
                byte readByte4 = gameInputStream18.readByte();
                boolean readBoolean2 = gameInputStream18.readBoolean();
                boolean readBoolean3 = gameInputStream18.readBoolean();
                String isReadString4 = gameInputStream18.isReadString();
                boolean readBoolean4 = gameInputStream18.readBoolean();
                boolean readBoolean5 = gameInputStream18.readBoolean();
                String isReadString5 = gameInputStream18.isReadString();
                boolean z4 = false;
                if (readByte4 >= 1) {
                    z4 = gameInputStream18.readBoolean();
                }
                String str10 = null;
                if (readByte4 >= 2) {
                    str10 = gameInputStream18.isReadString();
                }
                printLog("Multicast:" + z4);
                playerConnect15.r = z4;
                if (readBoolean2) {
                    playerConnect15.q = true;
                }
                if (readBoolean3) {
                    playerConnect15.s = true;
                }
                this.D = true;
                this.E = isReadString5;
                gameEngine.netEngine.passwd = null;
                gameEngine.netEngine.useMods = readBoolean4;
                gameEngine.netEngine.publicRoom = readBoolean5;
                c(false);
                if (str10 != null) {
                    if (this.z != null) {
                        this.z.P = str10;
                    } else {
                        GameEngine.m328e("Become server: No local team");
                    }
                }
                if (gameEngine.netEngine.publicRoom) {
                }
                if (isReadString4 != null) {
                    gameEngine.settingsEngine.networkServerId = isReadString4;
                }
                if (gameEngine.tick > 60) {
                    this.aa = true;
                }
                if (!this.x && !this.aW) {
                    GameEngine.m328e("enableAllCustomUnitsPossible mods:" + this.useMods);
                    ag.b(this.useMods);
                    this.x = true;
                    return;
                }
                return;
            case 172:
                PlayerConnect playerConnect16 = packet.playerConnect;
                if (!playerConnect16.q) {
                    printLog("forwarding not allowed on this connection");
                    return;
                }
                printLog("got FORWARD_CLIENT_ADD");
                GameInputStream gameInputStream19 = new GameInputStream(packet);
                byte readByte5 = gameInputStream19.readByte();
                int readInt12 = gameInputStream19.readInt();
                String readString9 = gameInputStream19.readString();
                String isReadString6 = gameInputStream19.isReadString();
                String str11 = null;
                if (readByte5 >= 1) {
                    str11 = gameInputStream19.isReadString();
                }
                if (a(playerConnect16, readInt12) != null) {
                    printLog("Not adding client:" + readInt12 + " already exists");
                    return;
                } else if (a(playerConnect16, readInt12, readString9, str11) != null && isReadString6 != null) {
                    Player b4 = PlayerData.b(readString9);
                    if (b4 == null) {
                        printLog("PACKET_FORWARD_CLIENT_ADD: Failed to find existing player with id:" + readString9);
                        Iterator it2 = PlayerData.c().iterator();
                        while (it2.hasNext()) {
                            PlayerData playerData3 = (PlayerData) it2.next();
                            if (playerData3 != null) {
                                printLog("option: " + playerData3.name + " - " + playerData3.P + " - localPlayer:" + (this.z == playerData3));
                            }
                        }
                        return;
                    }
                    b4.connectHexID = isReadString6;
                    return;
                } else {
                    return;
                }
            case 173:
                PlayerConnect playerConnect17 = packet.playerConnect;
                if (!playerConnect17.q) {
                    printLog("forwarding not allowed on this connection");
                    return;
                }
                printLog("got FORWARD_CLIENT_REMOVE");
                GameInputStream gameInputStream20 = new GameInputStream(packet);
                gameInputStream20.readByte();
                PlayerConnect a6 = a(playerConnect17, gameInputStream20.readInt());
                if (a6 != null) {
                    b(a6, (String) null);
                    return;
                }
                return;
            case 174:
                PlayerConnect playerConnect18 = packet.playerConnect;
                if (!playerConnect18.q) {
                    printLog("forwarding not allowed on this connection");
                    return;
                }
                GameInputStream gameInputStream21 = new GameInputStream(packet);
                int readInt13 = gameInputStream21.readInt();
                byte[] readBytes = gameInputStream21.readBytes();
                PlayerConnect a7 = a(playerConnect18, readInt13);
                if (a7 == null) {
                    printLog("PACKET_FORWARD_CLIENT_FROM failed, cannot find client");
                    return;
                } else if (!(a7.socket instanceof RelayForwardedSocket)) {
                    printLog("PACKET_FORWARD_CLIENT_FROM failed, socket is wrong type");
                    return;
                } else {
                    ((RelayForwardedSocket) a7.socket).d.a(readBytes);
                    return;
                }
            case 175:
                printLog("got PACKET_FORWARD_CLIENT_TO");
                return;
            case 176:
                printLog("got PACKET_FORWARD_CLIENT_TO_REPEATED");
                return;
            case SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_INPUT /* 178 */:
                printLog("got PACKET_RECONNECT_TO");
                PlayerConnect playerConnect19 = packet.playerConnect;
                if (this.isServer && !playerConnect19.q) {
                    printLog("we are a server, ");
                    return;
                }
                GameInputStream gameInputStream22 = new GameInputStream(packet);
                gameInputStream22.readByte();
                gameInputStream22.readInt();
                boolean readBoolean6 = gameInputStream22.readBoolean();
                int readInt14 = gameInputStream22.readInt();
                ArrayList arrayList = new ArrayList();
                for (int i11 = 0; i11 < readInt14; i11++) {
                    arrayList.add(gameInputStream22.readString());
                }
                a(arrayList, readBoolean6);
                return;
            default:
                printLog("we did not handle packet:" + packet.type);
                return;
        }
    }

    public static String i(String str) {
        char[] charArray;
        if (str == null) {
            return null;
        }
        if (str.length() > 250) {
            str = str.substring(0, 250);
        }
        if (str.contains("\n")) {
            str = str.replace("\n", "?");
        }
        String replace = str.replace("\ufffd\ufffd", ".");
        boolean z = false;
        char[] charArray2 = replace.toCharArray();
        int length = charArray2.length;
        int i = 0;
        while (true) {
            if (i < length) {
                if (!Character.isISOControl(charArray2[i])) {
                    i++;
                } else {
                    z = true;
                    break;
                }
            } else {
                break;
            }
        }
        if (z) {
            StringBuilder sb = new StringBuilder();
            for (char c2 : replace.toCharArray()) {
                if (!Character.isISOControl(c2)) {
                    sb.append(c2);
                }
            }
            replace = sb.toString();
        }
        return replace;
    }

    public void J() {
        GameEngine.getGameEngine().bS.g.m();
    }

    public void K() {
        b((String) null, (String) null);
    }

    public void b(String str, String str2) {
        GameEngine.m328e("closeBattleroom..");
        n.a(str, str2);
        this.d.d();
    }

    public synchronized void L() {
        Iterator it = this.socketList.iterator();
        while (it.hasNext()) {
            PlayerConnect playerConnect = (PlayerConnect) it.next();
            if (playerConnect.p) {
                sendServerInfo(playerConnect);
            }
        }
    }

    /* renamed from: c */
    public synchronized void sendServerInfo(PlayerConnect playerConnect) {
        if (!this.isServer) {
            printLog("sendServerInfo: we are not a server!");
            return;
        }
        GameOutputStream gameOutputStream = new GameOutputStream();
        try {
            gameOutputStream.writeString("com.corrodinggames.rts");
            gameOutputStream.writeInt(this.e);
            gameOutputStream.writeEnum(this.gameMapData.mapType);
            if (this.v) {
                gameOutputStream.writeString("<CHAT ONLY>");
            } else {
                gameOutputStream.writeString(this.gameMapData.mapName == null ? "<NULL>" : a.o(this.gameMapData.mapName));
            }
            gameOutputStream.writeInt(this.gameMapData.credits);
            gameOutputStream.writeInt(this.gameMapData.fog);
            gameOutputStream.writeBoolean(this.gameMapData.e);
            gameOutputStream.writeInt(this.gameMapData.aidiff);
            gameOutputStream.writeByte(8);
            gameOutputStream.writeBoolean(this.d.a(playerConnect));
            gameOutputStream.writeBoolean(this.d.b(playerConnect));
            gameOutputStream.writeInt(this.aw);
            gameOutputStream.writeInt(this.ax);
            gameOutputStream.writeInt(this.gameMapData.initUnit);
            gameOutputStream.writeFloat(this.gameMapData.income);
            gameOutputStream.writeBoolean(this.gameMapData.nukes);
            gameOutputStream.writeBoolean(this.gameMapData.j);
            if (this.v) {
                gameOutputStream.writeBoolean(false);
            } else {
                gameOutputStream.writeBoolean(true);
                l.a(gameOutputStream);
            }
            gameOutputStream.writeBoolean(this.gameMapData.sharedControl);
            gameOutputStream.writeBoolean(this.gameMapData.m);
            gameOutputStream.writeBoolean(this.gameMapData.n);
            gameOutputStream.writeBoolean(this.gameMapData.spectators);
            gameOutputStream.writeBoolean(this.gameMapData.p);
            gameOutputStream.writeInt(this.gameMapData.q);
            a(playerConnect, gameOutputStream.getPacket(106));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public synchronized void a(PlayerConnect playerConnect, String str) {
        if (!this.isServer) {
            printLog("sendKick: we are not a server!");
            return;
        }
        printLog("kicking client reason:" + str);
        GameOutputStream gameOutputStream = new GameOutputStream();
        try {
            gameOutputStream.writeString(str);
            a(playerConnect, gameOutputStream.getPacket(150));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public synchronized void d(PlayerConnect playerConnect) {
        if (!this.isServer) {
            printLog("sendIncorrectPassword: we are not a server!");
            return;
        }
        printLog("sendIncorrectPassword");
        GameOutputStream gameOutputStream = new GameOutputStream();
        try {
            gameOutputStream.writeInt(0);
            a(playerConnect, gameOutputStream.getPacket(113));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void M() {
        if (this.isServer) {
            for (int i = 0; i < PlayerData.f; i++) {
                PlayerData playerData = PlayerData.getPlayerData(i);
                if (playerData != null) {
                    if (this.v) {
                        playerData.ac = 0;
                    } else if (playerData.b()) {
                        playerData.ac = 100;
                    } else {
                        playerData.ac = playerData.team;
                    }
                    if (playerData.b()) {
                        playerData.gameColor = -1;
                    } else {
                        int S = playerData.S();
                        if (playerData.color != null) {
                            S = playerData.color.intValue();
                        } else if (a(S, (PlayerData) null)) {
                            S = -1;
                        }
                        playerData.gameColor = S;
                    }
                }
            }
            for (int i2 = 0; i2 < PlayerData.f; i2++) {
                PlayerData playerData2 = PlayerData.getPlayerData(i2);
                if (playerData2 != null && playerData2.gameColor == -1 && !playerData2.b()) {
                    playerData2.gameColor = N();
                }
            }
        }
    }

    public int N() {
        for (int i = 0; i < 10; i++) {
            if (!f(i)) {
                return i;
            }
        }
        return -1;
    }

    public boolean f(int i) {
        for (int i2 = 0; i2 < PlayerData.f; i2++) {
            PlayerData playerData = PlayerData.getPlayerData(i2);
            if (playerData != null && playerData.gameColor == i && !playerData.b()) {
                return true;
            }
        }
        return false;
    }

    public boolean a(int i, PlayerData playerData) {
        for (int i2 = 0; i2 < PlayerData.f; i2++) {
            PlayerData playerData2 = PlayerData.getPlayerData(i2);
            if (playerData2 != null && playerData2 != playerData && playerData2.color != null && playerData2.color.intValue() == i && !playerData2.b()) {
                return true;
            }
        }
        return false;
    }

    public void O() {
        if (this.isServer) {
            long currentTimeMillis = System.currentTimeMillis();
            int i = GameEngine.getGameEngine().by;
            if (this.z != null && !this.D) {
                this.z.ping = -99;
                this.z.lastReciveTime = currentTimeMillis;
            }
            M();
            for (int i2 = 0; i2 < PlayerData.c; i2++) {
                PlayerData playerData = PlayerData.getPlayerData(i2);
                if (playerData != null) {
                    playerData.c(this.z == playerData);
                    if (!this.aW) {
                    }
                    if (this.aW && !this.F && !playerData.w) {
                        boolean z = false;
                        if (playerData.isTimeOut()) {
                            z = true;
                        }
                        long j = 60000;
                        if (playerData.Z > 180000) {
                            j = 160000;
                        }
                        boolean z2 = false;
                        if (this.aa) {
                            if (playerData.Y == -1) {
                                playerData.Y = currentTimeMillis;
                                playerData.Z = i;
                            }
                            if ((this.ak || this.al) && !playerData.ab) {
                                playerData.Y = currentTimeMillis;
                                playerData.Z = i;
                            }
                            if (playerData.Y + j < currentTimeMillis) {
                                z2 = true;
                            }
                        }
                        if (playerData.ab != z2) {
                            playerData.ab = z2;
                        }
                        if (z2) {
                            z = true;
                            if (!playerData.aa) {
                                if (!(playerData.G || playerData.F || playerData.sharedControl_2 || playerData.b())) {
                                    playerData.aa = true;
                                }
                            }
                        }
                        if (playerData.sharedControl_2 != z) {
                            if (z && !playerData.G && !playerData.F && !playerData.sharedControl_1 && !playerData.b()) {
                                String str = "-t [Sharing control due to disconnect]";
                                if (z2) {
                                    str = "-t [Sharing control due to afk]";
                                }
                                GameEngine.m328e(playerData.name + " - " + str);
                                if (PlayerData.a(playerData.team, true) > 1) {
                                    a((PlayerConnect) null, playerData, playerData.name, str);
                                }
                            }
                            playerData.sharedControl_2 = z;
                        }
                    }
                }
            }
        }
    }

    public void P() {
        if (this.au == 0) {
            this.au = System.currentTimeMillis();
        }
    }

    public void Q() {
        this.au = 0L;
        sendTeamData((PlayerConnect) null);
    }

    /* renamed from: e */
    public void sendTeamData(PlayerConnect playerConnect) {
        if (!this.isServer) {
            printLog("sendUpdatePlayer: we are not a server!");
            return;
        }
        O();
        Iterator it = this.socketList.iterator();
        while (it.hasNext()) {
            PlayerConnect playerConnect2 = (PlayerConnect) it.next();
            if (playerConnect2.p) {
                GameOutputStream gameOutputStream = new GameOutputStream(playerConnect2.clientVersion);
                try {
                    gameOutputStream.writeInt(playerConnect2.c());
                    int i = PlayerData.c;
                    boolean z = false;
                    if (gameOutputStream.getPacketVersion() >= 90) {
                        boolean z2 = false;
                        if (gameOutputStream.getPacketVersion() >= 141) {
                            z2 = true;
                            if (this.aW && playerConnect2.Q) {
                                z = true;
                            }
                            gameOutputStream.writeBoolean(z);
                        }
                        gameOutputStream.writeInt(i);
                        gameOutputStream.startBlock("teams", z2);
                    } else {
                        i = 8;
                        if (!this.v) {
                            printLog("sendUpdatePlayer: warning saving with lower team count");
                        }
                    }
                    for (int i2 = 0; i2 < i; i2++) {
                        PlayerData playerData = PlayerData.getPlayerData(i2);
                        gameOutputStream.writeBoolean(playerData != null);
                        if (playerData != null) {
                            int i3 = 0;
                            if (playerData instanceof com.corrodinggames.rts.game.a.a) {
                                i3 = 1;
                            }
                            gameOutputStream.writeInt(i3);
                            if (z) {
                                playerData.c(gameOutputStream);
                            } else {
                                playerData.b(gameOutputStream);
                            }
                        }
                    }
                    if (gameOutputStream.getPacketVersion() >= 90) {
                        gameOutputStream.endBlock("teams");
                    }
                    gameOutputStream.writeInt(this.gameMapData.fog);
                    gameOutputStream.writeInt(this.gameMapData.credits);
                    gameOutputStream.writeBoolean(this.gameMapData.e);
                    gameOutputStream.writeInt(this.gameMapData.aidiff);
                    gameOutputStream.writeByte(5);
                    gameOutputStream.writeInt(this.aw);
                    gameOutputStream.writeInt(this.ax);
                    gameOutputStream.writeInt(this.gameMapData.initUnit);
                    gameOutputStream.writeFloat(this.gameMapData.income);
                    gameOutputStream.writeBoolean(this.gameMapData.nukes);
                    gameOutputStream.writeBoolean(this.gameMapData.j);
                    gameOutputStream.writeBoolean(false);
                    gameOutputStream.writeBoolean(this.gameMapData.sharedControl);
                    gameOutputStream.writeBoolean(this.al);
                    int i4 = -1;
                    if (playerConnect == playerConnect2 && playerConnect2.clientVersion <= 26) {
                        i4 = 1000;
                    }
                    playerConnect2.Q = true;
                    a(playerConnect2, gameOutputStream.a(115, i4));
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }

    public void a(PlayerConnect playerConnect, int i, int i2) {
        GameOutputStream gameOutputStream = new GameOutputStream();
        try {
            gameOutputStream.writeByte(0);
            gameOutputStream.writeInt(i);
            gameOutputStream.writeInt(i2);
            a(playerConnect, gameOutputStream.getPacket(4));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public synchronized boolean R() {
        if (S()) {
            this.p = true;
            this.gameMapData.fog = 0;
            return true;
        }
        return false;
    }

    public synchronized boolean S() {
        if (this.B) {
            closeServer("Started singleplayer");
        }
        GameEngine gameEngine = GameEngine.getGameEngine();
        r();
        this.B = true;
        this.isServer = true;
        this.F = true;
        this.gameMapData.mapType = gameEngine.an();
        this.gameMapData.mapName = gameEngine.am();
        aa();
        this.z = gameEngine.playerTeam;
        n.o();
        this.port = gameEngine.settingsEngine.networkPort;
        printLog("singleplayer server started");
        return true;
    }

    private void aA() {
        this.gameMapData.q = f.rand(1, 1000000000);
    }

    /* renamed from: b */
    public synchronized boolean startNet(boolean z) {
        if (this.B) {
            throw new RuntimeException("networking already started");
        }
        q();
        this.B = true;
        this.isServer = true;
        aa();
        aA();
        GameEngine gameEngine = GameEngine.getGameEngine();
        c(z);
        n.o();
        this.port = gameEngine.settingsEngine.networkPort;
        SteamEngine.getSteamEngine().i();
        this.tcpAccept = new ServerAcceptRunnable(this);
        try {
            this.tcpAccept.startServerSocket(false);
            this.tcpThread = new Thread(this.tcpAccept);
            this.tcpThread.setDaemon(true);
            this.tcpThread.start();
            if (1 != 0) {
                this.udpAccept = new ServerAcceptRunnable(this);
                try {
                    this.udpAccept.startServerSocket(true);
                    this.udpThread = new Thread(this.udpAccept);
                    this.udpThread.start();
                } catch (IOException e) {
                    e.printStackTrace();
                    gameEngine.a("Could not open udp port:" + this.port + ", check this port is not in use or change the port in the game settings", 1);
                    closeServer("Could not open udp port");
                    return false;
                }
            }
            am();
            if (this.publicRoom) {
                GameNetAPIOperate.b();
            }
            this.aV = null;
            if (r) {
                GameNetAPIOperate.a();
            }
            printLog("server started");
            return true;
        } catch (IOException e2) {
            e2.printStackTrace();
            gameEngine.a("Could not open tcp port:" + this.port + ", check this port is not in use or change the port in the game settings", 1);
            closeServer("Could not open tcp port");
            return false;
        }
    }

    public void c(boolean z) {
        int i;
        this.isServer = true;
        GameEngine gameEngine = GameEngine.getGameEngine();
        if (this.z == null) {
            Player player = null;
            if (!z) {
                i = PlayerData.getNullSite();
                if (i == -1) {
                    throw new RuntimeException("playerId is -1 for server player");
                }
            } else {
                player = this.bk;
                i = this.bk.site;
            }
            if (player == null) {
                player = new Player(i);
                player.name = this.y;
                gameEngine.playerTeam = player;
            }
            this.z = player;
        }
        if (this.pingTask == null) {
            GameEngine.m328e("pingerTask starting");
            this.pingTask = new PingTask(this);
            this.PingTaskTimer = new Timer();
            this.PingTaskTimer.schedule(this.pingTask, 100L, 100L);
        } else {
            GameEngine.m328e("pingerTask already active");
        }
        n.o();
    }

    public boolean T() {
        return GameEngine.getGameEngine().settingsEngine.udpInMultiplayer;
    }

    public an a(String str, boolean z, Runnable runnable) {
        an anVar = new an(str, z, runnable);
        anVar.b();
        return anVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v104, types: [java.net.Socket] */
    /* renamed from: b */
    public static Socket getSocketAndResolveIp(String ip, boolean forceTcp) {
        ReliableSocket socket;
        String str;
        GameEngine gameEngine = GameEngine.getGameEngine();
        GameEngine.m328e("Connect to server: " + ip + " (force tcp:" + forceTcp + ")");
        boolean z = false;
        String trim = ip.trim();
        if (trim.startsWith("get|")) {
            String[] split = trim.split("\\|");
            try {
                String str2 = split[0];
                String str3 = split[1];
                int parseInt = Integer.parseInt(split[2]);
                boolean parseBoolean = Boolean.parseBoolean(split[3]);
                Integer.parseInt(split[4]);
                if (parseBoolean) {
                    gameEngine.netEngine.passwd = null;
                    final Object obj = new Object();
                    EnterPasswordCallback enterPasswordCallback = new EnterPasswordCallback() { // from class: com.corrodinggames.rts.gameFramework.j.ad.1
                        @Override // com.corrodinggames.rts.gameFramework.net.EnterPasswordCallback
                        public void a(String str4) {
                            GameEngine gameEngine2 = GameEngine.getGameEngine();
                            GameEngine.m328e("Entered password");
                            if (gameEngine2.netEngine.isServer) {
                                GameEngine.a("Cannot enter a password when we are a server");
                            } else {
                                gameEngine2.netEngine.passwd = str4;
                            }
                            synchronized (obj) {
                                obj.notify();
                            }
                        }

                        @Override // com.corrodinggames.rts.gameFramework.net.EnterPasswordCallback
                        public void a() {
                            synchronized (obj) {
                                obj.notify();
                            }
                        }
                    };
                    GameEngine.m328e("Asking for password..");
                    synchronized (obj) {
                        a(enterPasswordCallback);
                        try {
                            obj.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    if (gameEngine.netEngine.passwd == null) {
                        GameEngine.print("No password entered");
                        throw new ag();
                    }
                    GameEngine.m328e("Password has been entered");
                }
                String str4 = null;
                if (parseBoolean) {
                    str4 = gameEngine.netEngine.passwd;
                    if (str4 == null) {
                        throw new IOException("This server requires a password but no password was provided");
                    }
                }
                final Object obj2 = new Object();
                w wVar = new w() { // from class: com.corrodinggames.rts.gameFramework.j.ad.2
                    @Override // com.corrodinggames.rts.gameFramework.net.w
                    public void a(String str5) {
                        super.a(str5);
                        synchronized (obj2) {
                            obj2.notify();
                        }
                    }

                    @Override // com.corrodinggames.rts.gameFramework.net.w
                    public void a(String str5, GameConnectStatusType gameConnectStatusType, Exception exc) {
                        super.a(str5, gameConnectStatusType, exc);
                        synchronized (obj2) {
                            obj2.notify();
                        }
                    }
                };
                synchronized (obj2) {
                    GameNetAPIOperate.a(wVar, str3, parseInt, str4);
                    try {
                        obj2.wait(15000L);
                    } catch (InterruptedException e2) {
                    }
                }
                if (wVar.b != null) {
                    throw new IOException(wVar.b);
                }
                if (wVar.a == null) {
                    throw new IOException("Failed to get game server info.");
                }
                return getSocketAndResolveIp(wVar.a, forceTcp);
            } catch (NumberFormatException e3) {
                e3.printStackTrace();
                throw new IOException("Bad server connect string");
            }
        }
        if (trim.toLowerCase(Locale.ENGLISH).endsWith(".relay")) {
            trim = trim + ".corrodinggames.com";
        }
        if (trim.startsWith("[TCP]")) {
            trim = trim.substring("[TCP]".length());
            forceTcp = true;
        }
        if (trim.length() > 4 && !trim.contains(":") && !trim.contains(".") && !trim.equals("localhost") && !trim.contains("/") && !trim.contains("\\")) {
            String str5 = (VariableScope.nullOrMissingString + trim.charAt(0)) + ".relay.corrodinggames.com/" + trim;
            GameEngine.m328e("Converting connect string to: " + str5);
            trim = str5;
        }
        gameEngine.netEngine.L = null;
        if (trim.contains("/") || trim.contains("\\")) {
            int indexOf = trim.indexOf("/");
            int indexOf2 = trim.indexOf("\\");
            if (indexOf == -1) {
                indexOf = trim.length();
            }
            if (indexOf2 == -1) {
                indexOf2 = trim.length();
            }
            int c2 = f.c(indexOf, indexOf2);
            String trim2 = trim.substring(c2 + 1).trim();
            if (!trim2.equals(VariableScope.nullOrMissingString)) {
                gameEngine.netEngine.L = trim2;
            }
            trim = trim.substring(0, c2);
        }
        String ip2 = trim;
        int port = 5123;
        String[] split2 = trim.split(":");
        if (split2.length > 1) {
            ip2 = null;
            for (int i = 0; i < split2.length - 1; i++) {
                if (ip2 == null) {
                    str = VariableScope.nullOrMissingString;
                } else {
                    str = ip2 + ":";
                }
                ip2 = str + split2[i];
            }
            String str6 = split2[split2.length - 1];
            try {
                port = Integer.parseInt(str6);
            } catch (NumberFormatException e4) {
                String str7 = "Bad port number:" + str6;
                e4.printStackTrace();
                throw new IOException(str7);
            }
        }
        if (!forceTcp && gameEngine.netEngine.T()) {
            z = true;
        }
        int timeOut = 7000;
        GameEngine.m328e(VariableScope.nullOrMissingString);
        GameEngine.m328e("===============================");
        GameEngine.m328e("Connect to: " + trim);
        if (!z) {
            socket = new Socket();
            GameEngine.m328e("connecting to Server.. (tcp)");
        } else {
            socket = new ReliableSocket();
            GameEngine.m328e("connecting to Server.. (udp)");
            timeOut = 5000;
        }
        socket.setTcpNoDelay(true);
        try {
            try {
                socket.connect(new InetSocketAddress(InetAddress.getByName(ip2), port), timeOut);
                return socket;
            } catch (UnknownHostException e5) {
                String str8 = "Failed to connect to host";
                if (z) {
                    str8 = str8 + " (udp)";
                }
                GameEngine.m328e("UnknownHostException.." + str8);
                e5.printStackTrace();
                throw new IOException(str8, e5);
            } catch (IOException e6) {
                String str9 = "Failed to connect to host";
                if (z) {
                    str9 = str9 + " (udp)";
                }
                String str10 = str9 + " - " + e6.getMessage();
                GameEngine.m328e("IOException.." + str10);
                e6.printStackTrace();
                throw new IOException(str10, e6);
            }
        } catch (IllegalArgumentException e7) {
            GameEngine.print("IllegalArgumentException..Incorrect server format");
            e7.printStackTrace();
            throw new IOException("Incorrect server format", e7);
        }
    }

    public void U() {
        final GameEngine gameEngine = GameEngine.getGameEngine();
        final com.corrodinggames.rts.gameFramework.Interface.a.f a2 = com.corrodinggames.rts.gameFramework.Interface.a.f.a(com.corrodinggames.rts.gameFramework.translations.a.a("menus.ingame.multiplayerReconnect.message", new Object[0]), false);
        a2.a(com.corrodinggames.rts.gameFramework.translations.a.a("menus.ingame.resume", new Object[0]), new k() { // from class: com.corrodinggames.rts.gameFramework.j.ad.3
            @Override // com.corrodinggames.rts.gameFramework.Interface.a.k
            public boolean a(c cVar) {
                a2.i();
                return true;
            }
        });
        a2.a(com.corrodinggames.rts.gameFramework.translations.a.a("menus.ingame.reconnect", new Object[0]), new k() { // from class: com.corrodinggames.rts.gameFramework.j.ad.4
            @Override // com.corrodinggames.rts.gameFramework.Interface.a.k
            public boolean a(c cVar) {
                a2.i();
                GameNetEngine.this.V();
                return true;
            }
        });
        a2.a(com.corrodinggames.rts.gameFramework.translations.a.a("menus.ingame.disconnect", new Object[0]), new k() { // from class: com.corrodinggames.rts.gameFramework.j.ad.5
            @Override // com.corrodinggames.rts.gameFramework.Interface.a.k
            public boolean a(c cVar) {
                a2.i();
                gameEngine.a(new Runnable() { // from class: com.corrodinggames.rts.gameFramework.j.ad.5.1
                    @Override // java.lang.Runnable
                    public void run() {
                        GameNetEngine.this.closeServer("already disconnected");
                        gameEngine.bS.g.l();
                    }
                });
                return true;
            }
        });
        gameEngine.bS.a(a2);
        this.bx = true;
    }

    public synchronized boolean V() {
        Socket socket = this.bv;
        if (socket == null) {
            GameEngine.m328e("reconnectToServer: lastConnectedTo==null");
            return false;
        }
        GameEngine.m328e("reconnectToServer attempted");
        if (this.B) {
            GameEngine.m328e("reconnectToServer: disconnecting");
            closeServer("reconnecting");
        }
        if (socket.getInetAddress() == null) {
            GameEngine.m328e("reconnectToServer: lastConnectedTo.getInetAddress()==null");
            return false;
        }
        String str = socket.getInetAddress().getHostAddress() + ":" + socket.getPort();
        GameEngine.m328e("reconnectToServer: connecting to: " + str);
        try {
            return bindSocket(getSocketAndResolveIp(str, false));
        } catch (ag e) {
            e.printStackTrace();
            return false;
        } catch (IOException e2) {
            e2.printStackTrace();
            return false;
        }
    }

    /* renamed from: a */
    public synchronized boolean bindSocket(Socket socket) {
        if (this.B) {
            closeServer("starting new");
        }
        if (socket == null) {
            throw new RuntimeException("connectedSocket==null");
        }
        q();
        GameEngine.getGameEngine();
        this.port = socket.getPort();
        this.B = true;
        this.isServer = false;
        printLog("connected to Server..");
        PlayerConnect playerConnect = new PlayerConnect(this, socket);
        playerConnect.p = true;
        playerConnect.d();
        this.socketList.add(playerConnect);
        f(playerConnect);
        am();
        this.bv = socket;
        return true;
    }

    public PlayerConnect c(PlayerData playerData) {
        Iterator it = this.socketList.iterator();
        while (it.hasNext()) {
            PlayerConnect playerConnect = (PlayerConnect) it.next();
            if (playerConnect.player == playerData) {
                return playerConnect;
            }
        }
        return null;
    }

    public PlayerConnect d(PlayerData playerData) {
        Iterator it = this.socketList.iterator();
        while (it.hasNext()) {
            PlayerConnect playerConnect = (PlayerConnect) it.next();
            if (!playerConnect.a && playerConnect.player == playerData) {
                return playerConnect;
            }
        }
        return null;
    }

    public PlayerConnect W() {
        if (this.isServer) {
            return null;
        }
        Iterator it = this.socketList.iterator();
        while (it.hasNext()) {
            PlayerConnect playerConnect = (PlayerConnect) it.next();
            if (!playerConnect.a) {
                return playerConnect;
            }
        }
        return null;
    }

    public void d(Packet packet) {
        if (!this.B) {
            GameEngine.m328e("Skipping sendPacketToAll, not networked");
        } else {
            i(packet);
        }
    }

    private void i(Packet packet) {
        Iterator it = this.socketList.iterator();
        while (it.hasNext()) {
            PlayerConnect playerConnect = (PlayerConnect) it.next();
            if (playerConnect.p && !playerConnect.a && !playerConnect.s) {
                playerConnect.a(packet);
            }
        }
    }

    public void e(Packet packet) {
        if (!this.B) {
            GameEngine.m328e("Skipping sendPacketToAllIncludingRelay, not networked");
            return;
        }
        Iterator it = this.socketList.iterator();
        while (it.hasNext()) {
            PlayerConnect playerConnect = (PlayerConnect) it.next();
            if (playerConnect.p && !playerConnect.a) {
                playerConnect.a(packet);
            }
        }
    }

    public void f(Packet packet) {
        if (!this.B) {
            GameEngine.m328e("Skipping sendPacketToServer, not networked");
        } else if (this.isServer) {
            throw new RuntimeException("We are a server");
        } else {
            d(packet);
        }
    }

    /* renamed from: g */
    public void sendPacket(Packet packet) {
        if (!this.B) {
            GameEngine.m328e("Skipping sendPacketToClients, not networked");
        } else if (!this.isServer) {
            throw new RuntimeException("We are not a server");
        } else {
            e(packet);
        }
    }

    public void h(Packet packet) {
        if (!this.B) {
            GameEngine.m328e("Skipping sendPacketToClients, not networked");
        } else if (!this.isServer) {
            throw new RuntimeException("We are not a server");
        } else {
            d(packet);
        }
    }

    public void a(PlayerConnect playerConnect, Packet packet) {
        if (!this.B) {
            GameEngine.m328e("Skipping sendPacketOnConnection, not networked");
        } else {
            playerConnect.a(packet);
        }
    }

    public void X() {
        if (this.isServer) {
            printLog("registerConnection: We are a server");
        }
        Iterator it = this.socketList.iterator();
        while (it.hasNext()) {
            h((PlayerConnect) it.next());
        }
    }

    public void Y() {
        GameEngine gameEngine = GameEngine.getGameEngine();
        gameEngine.settingsEngine.networkClientId = null;
        if (this.S == null) {
            GameEngine.m328e("generateNewClientId: serverUUID==null");
            this.S = "x";
        }
        Z();
        gameEngine.settingsEngine.save();
    }

    public String Z() {
        GameEngine gameEngine = GameEngine.getGameEngine();
        boolean z = false;
        if (gameEngine.settingsEngine.networkClientId == null) {
            z = true;
        }
        if (!this.by) {
            this.by = true;
            if (GameEngine.av()) {
                String ak = ak();
                if (!ak.equals(gameEngine.settingsEngine.networkClientIdMachineKey)) {
                    if (gameEngine.settingsEngine.networkClientIdMachineKey != null) {
                        GameEngine.m328e("Machine appears to have changed: " + gameEngine.settingsEngine.networkClientIdMachineKey + " vs " + ak);
                    }
                    gameEngine.settingsEngine.networkClientIdMachineKey = ak;
                    z = true;
                }
            }
        }
        if (z) {
            GameEngine.m328e("new networkClientId needed");
            gameEngine.settingsEngine.networkClientId = UUID.randomUUID().toString();
            gameEngine.settingsEngine.save();
        }
        String str = gameEngine.settingsEngine.networkClientId;
        if (this.S == null) {
            throw new RuntimeException("getOwnClientIdHashed: serverUUID==null");
        }
        return f.e(str + this.S);
    }

    public void aa() {
        GameEngine gameEngine = GameEngine.getGameEngine();
        gameEngine.settingsEngine.networkServerId = UUID.randomUUID().toString();
        gameEngine.settingsEngine.save();
    }

    public String ab() {
        GameEngine gameEngine = GameEngine.getGameEngine();
        if (gameEngine.settingsEngine.networkServerId == null) {
            aa();
        }
        return gameEngine.settingsEngine.networkServerId;
    }

    public String ac() {
        GameEngine gameEngine = GameEngine.getGameEngine();
        if (this.isServer) {
            return gameEngine.settingsEngine.networkServerId;
        }
        return this.S;
    }

    public void f(PlayerConnect playerConnect) {
        GameOutputStream gameOutputStream = new GameOutputStream();
        try {
            int i = 1;
            if (GameEngine.av()) {
                i = 2;
            }
            if (GameEngine.aZ) {
                i = 3;
            }
            gameOutputStream.writeString("com.corrodinggames.rts");
            gameOutputStream.writeInt(4);
            gameOutputStream.writeInt(this.e);
            gameOutputStream.writeInt(i);
            gameOutputStream.writeIsString(this.L);
            gameOutputStream.writeString(this.y);
            gameOutputStream.writeString(com.corrodinggames.rts.gameFramework.translations.a.c());
            String str = VariableScope.nullOrMissingString;
            if (GameEngine.aT) {
                str = str + "d";
            }
            gameOutputStream.writeString(str);
            a(playerConnect, gameOutputStream.getPacket(160));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void g(PlayerConnect playerConnect) {
        GameOutputStream gameOutputStream = new GameOutputStream();
        try {
            GameEngine gameEngine = GameEngine.getGameEngine();
            gameOutputStream.writeString("com.corrodinggames.rts");
            gameOutputStream.writeInt(2);
            gameOutputStream.writeInt(this.e);
            gameOutputStream.writeInt(gameEngine.c(true));
            gameOutputStream.writeString(gameEngine.l());
            gameOutputStream.writeString(ab());
            gameOutputStream.writeInt(playerConnect.connectKey);
            gameOutputStream.writeInt(this.W);
            gameOutputStream.writeInt(0);
            a(playerConnect, gameOutputStream.getPacket(161));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void h(PlayerConnect playerConnect) {
        GameEngine.m328e("sendRegisterConnection...");
        GameOutputStream gameOutputStream = new GameOutputStream();
        try {
            gameOutputStream.writeString("com.corrodinggames.rts");
            gameOutputStream.writeInt(5);
            gameOutputStream.writeInt(this.e);
            GameEngine gameEngine = GameEngine.getGameEngine();
            gameOutputStream.writeInt(gameEngine.c(true));
            gameOutputStream.writeString(this.y);
            String str = null;
            if (this.passwd != null) {
                str = f.e(this.passwd);
            }
            gameOutputStream.writeIsString(str);
            gameOutputStream.writeString(gameEngine.l());
            gameOutputStream.writeString(Z());
            gameOutputStream.writeInt(gameEngine.z());
            gameOutputStream.writeString(g(this.T));
            gameOutputStream.writeString(h(this.U));
            a(playerConnect, gameOutputStream.getPacket(110));
            this.bz = true;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public String g(int i) {
        String str = (((((((((((VariableScope.nullOrMissingString + "c:" + i) + "m:" + ((i * 87) + 24)) + "0:" + (e(0) * 11 * i)) + "1:" + ((e(1) * 12) + i)) + "2:" + (e(2) * 13 * i)) + "3:" + ((e(3) * 14) + i)) + "4:" + (e(4) * 15 * i)) + "5:" + ((e(5) * 16) + i)) + "6:" + (e(6) * 17 * i)) + "7:" + (e(7) * 18 * i)) + "8:" + (e(8) * 19 * i)) + "t1:" + (PlayerData.j.credits * 11.0d * i);
        int i2 = 5 * i;
        if (k() != e(this.gameMapData.credits)) {
            i2 = 7 * i;
        }
        return str + "d:" + i2;
    }

    public String h(int i) {
        return f.h(i);
    }

    public void ad() {
        if (this.isServer) {
            throw new RuntimeException("We are a server");
        }
        GameEngine gameEngine = GameEngine.getGameEngine();
        GameOutputStream gameOutputStream = new GameOutputStream();
        try {
            gameOutputStream.writeBoolean(this.bG);
            gameOutputStream.writeBoolean(gameEngine.bq);
            f(gameOutputStream.getPacket(112));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void j(String str) {
        if (!this.isServer) {
            printLog("cannot send sendSystemMessage:" + str + ", we are not a server");
        } else if (!this.B || this.F) {
            printLog("cannot send sendSystemMessage:" + str + ", not networked");
        } else {
            GameEngine.m328e("sendSystemMessage:" + str);
            a((PlayerConnect) null, (PlayerData) null, (String) null, str);
        }
    }

    public void k(String str) {
        m("-qc " + str);
    }

    public void l(String str) {
        boolean z = true;
        String str2 = null;
        if (str != null) {
            String trim = str.trim();
            if ((trim.startsWith("-") || trim.startsWith(".") || trim.startsWith("_")) && trim.length() >= 2) {
                String trim2 = trim.substring(1).trim();
                int indexOf = trim2.indexOf(" ");
                if (indexOf == -1) {
                    indexOf = trim2.length();
                }
                str2 = trim2.substring(0, indexOf).toLowerCase(Locale.ENGLISH);
            }
        }
        if ("share".equals(str2)) {
            z = false;
        }
        if ("t".equals(str2)) {
            z = false;
        }
        if (z) {
            str = "-t " + str;
        }
        m(str);
    }

    public void m(String str) {
        if (!this.B) {
            GameEngine.m328e("sendChatMessage: not networked:" + str);
            b((PlayerConnect) null, -1, (String) null, str);
        } else if (this.isServer) {
            a((PlayerConnect) null, this.z, this.y, str);
            b((PlayerConnect) null, this.z, this.y, str);
        } else {
            try {
                GameOutputStream gameOutputStream = new GameOutputStream();
                gameOutputStream.writeString(str);
                gameOutputStream.writeByte(0);
                f(gameOutputStream.getPacket(140));
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public void a(PlayerConnect playerConnect, PlayerData playerData, String str, String str2) {
        a(playerConnect, playerData, str, str2, null);
    }

    public void a(PlayerConnect playerConnect, PlayerData playerData, String str, String str2, PlayerConnect playerConnect2) {
        Player player;
        try {
            boolean z = false;
            boolean z2 = false;
            String n = n(str2);
            if ("t".equalsIgnoreCase(n)) {
                if (playerData != null) {
                    z = true;
                    str2 = "[TEAM] " + str2.substring("-t".length());
                } else {
                    GameEngine.print("toOnlyTeams failed team==null");
                }
            }
            if (playerData != null && "surrender".equalsIgnoreCase(n)) {
                z = true;
                str2 = "[TEAM] " + str2;
            }
            if (playerData != null && "i".equalsIgnoreCase(n)) {
                z2 = true;
                str2 = "[INFO] " + str2.substring("-i".length());
            }
            if (playerData != null && "qc".equalsIgnoreCase(n)) {
                z2 = true;
                str2 = "[COMMAND] " + str2.substring("-qc".length());
            }
            if (!z2 && playerData != null && playerData != this.bj && playerData != this.bk && !this.d.a(playerConnect, playerData, str2, z)) {
                z2 = true;
            }
            GameOutputStream gameOutputStream = new GameOutputStream();
            gameOutputStream.writeString(str2);
            gameOutputStream.writeByte(3);
            gameOutputStream.writeIsString(str);
            gameOutputStream.a(playerConnect);
            int i = -1;
            if (playerData != null) {
                i = playerData.site;
            }
            gameOutputStream.writeInt(i);
            Packet packet = gameOutputStream.getPacket(141);
            if (z) {
                Iterator it = this.socketList.iterator();
                while (it.hasNext()) {
                    PlayerConnect playerConnect3 = (PlayerConnect) it.next();
                    if (playerConnect3.p && !playerConnect3.a && (player = playerConnect3.player) != null && player.d(playerData)) {
                        playerConnect3.a(packet);
                    }
                }
                PlayerData playerData2 = this.z;
                if (playerData2 != null && playerData2.d(playerData)) {
                    b(playerConnect, i, str, str2);
                }
            } else if (z2) {
                GameEngine.print("info message:" + c(str, str2));
            } else {
                if (playerConnect2 != null) {
                    a(playerConnect2, packet);
                } else {
                    sendPacket(packet);
                }
                b(playerConnect, i, str, str2);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static String n(String str) {
        if (str == null) {
            return null;
        }
        String trim = str.trim();
        if ((trim.startsWith("-") || trim.startsWith(".") || trim.startsWith("_")) && trim.length() >= 2) {
            String trim2 = trim.substring(1).trim();
            int indexOf = trim2.indexOf(" ");
            if (indexOf == -1) {
                indexOf = trim2.length();
            }
            return trim2.substring(0, indexOf).toLowerCase(Locale.ENGLISH);
        }
        return null;
    }

    public static String c(String str, String str2) {
        if (str != null) {
            return str + ": " + str2;
        }
        return str2;
    }

    public void o(String str) {
        String c2 = com.corrodinggames.rts.gameFramework.translations.a.c(str);
        this.aC.a(-1, null, c2, null);
        this.d.a(-1, (String) null, c2, (PlayerConnect) null);
        boolean z = false;
        if (this.aW) {
            z = true;
        }
        if (!this.B) {
            z = true;
        }
        if (z) {
            a((String) null, c2);
            return;
        }
        String c3 = c((String) null, c2);
        if (!GameEngine.aU) {
            n.d(c3);
        }
    }

    private void b(PlayerConnect playerConnect, int i, String str, String str2) {
        if (!this.B && str2.startsWith("-i ")) {
            return;
        }
        if (!this.B && str2.startsWith("-qc ")) {
            return;
        }
        String c2 = com.corrodinggames.rts.gameFramework.translations.a.c(str2);
        if (str != null) {
            if (c2 != null) {
                if (c2.equals("-surrender")) {
                }
                if (this.z == null || i < 0 || this.z.site == i) {
                }
            }
            if (1 != 0) {
                d("New Message", str + ": " + c2);
            }
        }
        PlayerConnect playerConnect2 = null;
        if (this.isServer) {
            playerConnect2 = playerConnect;
        }
        this.aC.a(i, str, c2, playerConnect2);
        this.d.a(i, str, c2, playerConnect);
        boolean z = false;
        if (this.aW) {
            z = true;
        }
        if (!this.B) {
            z = true;
        }
        if (z) {
            a(str, c2);
            return;
        }
        String c3 = c(str, c2);
        if (!GameEngine.aU) {
            n.d(c3);
        }
    }

    public void a(PlayerConnect playerConnect, byte[] bArr, boolean z, boolean z2) {
        GameEngine gameEngine = GameEngine.getGameEngine();
        try {
            GameOutputStream gameOutputStream = new GameOutputStream();
            gameOutputStream.writeByte(0);
            gameOutputStream.writeInt(gameEngine.tick);
            gameOutputStream.writeInt(gameEngine.by);
            gameOutputStream.writeFloat(getCurrentStepRate());
            gameOutputStream.writeFloat(1.0f);
            gameOutputStream.writeBoolean(z);
            gameOutputStream.writeBoolean(z2);
            gameOutputStream.e("gameSave");
            gameOutputStream.b(bArr);
            gameOutputStream.endBlock("gameSave");
            a(playerConnect, gameOutputStream.getPacket(35));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: a */
    public void resync(boolean z, boolean z2, boolean z3) {
        GameEngine gameEngine = GameEngine.getGameEngine();
        try {
            GameOutputStream gameOutputStream = new GameOutputStream();
            gameOutputStream.writeByte(0);
            gameOutputStream.writeInt(gameEngine.tick);
            gameOutputStream.writeInt(gameEngine.by);
            gameOutputStream.writeFloat(getCurrentStepRate());
            gameOutputStream.writeFloat(1.0f);
            gameOutputStream.writeBoolean(z);
            gameOutputStream.writeBoolean(z2);
            gameOutputStream.e("gameSave");
            gameEngine.ca.a(gameOutputStream);
            gameOutputStream.endBlock("gameSave");
            if (z) {
            }
            Packet packet = gameOutputStream.getPacket(35);
            d(packet);
            if (z3) {
                if (!this.isServer) {
                    throw new RuntimeException("sendResyncSave: reloadCreatedSave: We are not a server");
                }
                packet.playerConnect = this.aL;
                resolveSystemCommandPacket(packet);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public boolean ae() {
        Q();
        L();
        return sendStartGamePacket((PlayerConnect) null, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:41:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean sendStartGamePacket(PlayerConnect playerConnect, boolean z) {
        GameEngine.m328e("Sending start game....");
        if (!this.isServer) {
            throw new RuntimeException("We are not a server");
        }
        GameEngine gameEngine = GameEngine.getGameEngine();
        GameOutputStream gameOutputStream = new GameOutputStream();
        try {
            gameOutputStream.writeByte(0);
            gameOutputStream.writeEnum(this.gameMapData.mapType);
            if (this.gameMapData.mapType == MapType.savedGame) {
                try {
                    gameEngine.ca.a(this.gameMapData.mapName, gameOutputStream);
                    gameOutputStream.writeString("SAVE:" + this.gameMapData.mapName);
                    gameOutputStream.writeBoolean(z);
                    Packet packet = gameOutputStream.getPacket(120);
                    if (playerConnect != null) {
                        sendPacket(packet);
                    } else {
                        a(playerConnect, packet);
                    }
                    if (this.aW) {
                        aB();
                        return true;
                    }
                    return true;
                } catch (IOException e) {
                    e.printStackTrace();
                    gameEngine.c("Map error starting game", "Map error: " + e.getMessage());
                    return false;
                }
            }
            if (this.gameMapData.mapType == MapType.customMap) {
                GameEngine.m328e("Starting with custom map: " + l());
                try {
                    b.a(this.az, gameOutputStream);
                    gameOutputStream.writeString("STEAM:" + l());
                } catch (IOException e2) {
                    e2.printStackTrace();
                    gameEngine.c("Map error starting game", "Map error: " + e2.getMessage());
                    return false;
                }
            } else {
                gameOutputStream.writeString(l());
            }
            gameOutputStream.writeBoolean(z);
            Packet packet2 = gameOutputStream.getPacket(120);
            if (playerConnect != null) {
            }
            if (this.aW) {
            }
        } catch (IOException e3) {
            throw new RuntimeException(e3);
        }
    }

    public void af() {
        this.bc = true;
        GameEngine.m328e("onStartGameFailed");
        if (this.isServer) {
            this.aW = false;
            j("Map load failed.");
            return;
        }
        closeServer("Map load failed");
    }

    private void aB() {
        this.aY = false;
        this.aW = true;
        this.bc = false;
        this.bd = false;
        GameEngine.m328e("Starting new network game (" + ac() + ")");
        if (this.publicRoom && this.isServer) {
            GameNetAPIOperate.c();
        }
        if (!GameEngine.aU) {
            n.p();
        }
        this.d.startGame();
    }

    public void ag() {
        d(5.0f);
    }

    public void d(float f) {
        if (!this.isServer) {
            throw new RuntimeException("We are not a server");
        }
        if (this.aZ) {
            return;
        }
        GameEngine.m328e("Setting up return to battleroom timer...");
        this.ba = f;
        this.aZ = true;
        j("Game ended by host. Returning to battleroom in " + ((int) f) + " seconds...");
    }

    public void i(PlayerConnect playerConnect) {
        if (!this.isServer) {
            throw new RuntimeException("We are not a server");
        }
        try {
            GameOutputStream gameOutputStream = new GameOutputStream();
            gameOutputStream.writeByte(0);
            Packet packet = gameOutputStream.getPacket(122);
            if (playerConnect == null) {
                h(packet);
            } else {
                a(playerConnect, packet);
            }
            aC();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private void aC() {
        this.aY = true;
    }

    private void aD() {
        GameEngine.m328e("----- returnToBattleroom -----");
        this.aY = false;
        GameEngine gameEngine = GameEngine.getGameEngine();
        gameEngine.replayEngine.close();
        PlayerData playerData = this.z;
        gameEngine.g();
        s();
        this.z = playerData;
        gameEngine.tick = 0;
        gameEngine.by = 0;
        A();
        PlayerData.n();
        if (this.isServer) {
            aA();
        }
        J();
        if (this.publicRoom && this.isServer) {
            GameNetAPIOperate.c();
        }
        if (!GameEngine.aU) {
        }
    }

    public String ah() {
        ArrayList aj = aj();
        if (aj == null || aj.size() == 0) {
            return null;
        }
        return (String) aj.get(0);
    }

    public String ai() {
        ArrayList aj = aj();
        if (aj == null || aj.size() == 0) {
            return null;
        }
        String str = VariableScope.nullOrMissingString;
        boolean z = true;
        Iterator it = aj.iterator();
        while (it.hasNext()) {
            String str2 = (String) it.next();
            if (z) {
                z = false;
            } else {
                str = str + ", ";
            }
            str = str + str2;
        }
        return str;
    }

    public ArrayList aj() {
        ArrayList d;
        if (bA != null) {
            return new ArrayList(bA);
        }
        long loadAllUnitsTook = Unit.loadAllUnitsTook();
        ArrayList d2 = d(true);
        if (d2 != null && d2.size() > 0) {
            d = d2;
        } else {
            d = d(false);
        }
        double a2 = Unit.a(loadAllUnitsTook);
        if (a2 > 2.0d) {
            GameEngine.print("getLocalIpAddressList was slow, taking:" + Unit.a(a2));
        }
        if (a2 > 10.0d && d != null && d.size() > 0) {
            GameEngine.m328e("getLocalIpAddressList: creating cache");
            bA = new ArrayList(d);
        }
        return d;
    }

    public String ak() {
        String str = null;
        try {
            Enumeration<NetworkInterface> networkInterfaces = NetworkInterface.getNetworkInterfaces();
            while (true) {
                if (!networkInterfaces.hasMoreElements()) {
                    break;
                }
                byte[] hardwareAddress = networkInterfaces.nextElement().getHardwareAddress();
                if (hardwareAddress != null) {
                    String trim = new String(hardwareAddress).trim();
                    if (trim.length() > 2) {
                        str = trim;
                        break;
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (str != null) {
            return f.c(str);
        }
        return "[blank]";
    }

    public ArrayList d(boolean z) {
        ArrayList arrayList = new ArrayList();
        try {
            Enumeration<NetworkInterface> networkInterfaces = NetworkInterface.getNetworkInterfaces();
            while (networkInterfaces.hasMoreElements()) {
                Enumeration<InetAddress> inetAddresses = networkInterfaces.nextElement().getInetAddresses();
                while (inetAddresses.hasMoreElements()) {
                    InetAddress nextElement = inetAddresses.nextElement();
                    if (!nextElement.isLoopbackAddress()) {
                        String str = nextElement.getHostAddress().toString();
                        if (!str.contains("%")) {
                            if (!z) {
                                arrayList.add(str);
                            } else if (str.contains(".")) {
                                arrayList.add(str);
                            }
                        }
                    }
                }
            }
        } catch (SocketException e) {
            Log.d("RustedWarfare", e.toString());
        }
        return arrayList;
    }

    InetAddress al() {
        try {
            DhcpInfo dhcpInfo = ((WifiManager) GameEngine.getGameEngine().am.c("wifi")).getDhcpInfo();
            int i = (dhcpInfo.ipAddress & dhcpInfo.netmask) | (dhcpInfo.netmask ^ (-1));
            byte[] bArr = new byte[4];
            for (int i2 = 0; i2 < 4; i2++) {
                bArr[i2] = (byte) ((i >> (i2 * 8)) & 255);
            }
            return InetAddress.getByAddress(bArr);
        } catch (UnknownHostException e) {
            e.printStackTrace();
            return null;
        }
    }

    public void d(String str, String str2) {
        if (GameEngine.aU) {
            return;
        }
        GameEngine gameEngine = GameEngine.getGameEngine();
        if (this.F || gameEngine.replayEngine.j()) {
            return;
        }
        boolean l = n.l();
        com.corrodinggames.rts.appFramework.f fVar = gameEngine.ao;
        if (fVar != null && !fVar.e()) {
            l = true;
        }
        if (l) {
            if (this.bB) {
                i(2);
                return;
            }
            return;
        }
        NotificationManager notificationManager = (NotificationManager) gameEngine.am.c("notification");
        PendingIntent activity = PendingIntent.getActivity(gameEngine.am, 0, new Intent(gameEngine.am, com.corrodinggames.rts.appFramework.a.class), 2);
        if (Build.VERSION.SDK_INT >= 11) {
            Notification.Builder builder = new Notification.Builder(gameEngine.am);
            builder.setContentTitle("Rusted Warfare Multiplayer");
            builder.setContentText(str + ": " + str2);
            builder.setSmallIcon(AssetsID.drawable.icon);
            builder.setContentIntent(activity);
            builder.setOngoing(false);
            builder.setAutoCancel(true);
            a(notificationManager);
            a(builder, "multiplayerChatId");
            notificationManager.notify(2, builder.getNotification());
            this.bB = true;
        }
    }

    public void am() {
        GameEngine gameEngine = GameEngine.getGameEngine();
        if (this.B && gameEngine != null && gameEngine.M()) {
            aE();
            return;
        }
        i(1);
        i(2);
    }

    private void a(Notification.Builder builder, String str) {
        if (Build.VERSION.SDK_INT >= 26) {
            try {
                builder.getClass().getDeclaredMethod("setChannelId", String.class).invoke(builder, str);
            } catch (Exception e) {
                GameEngine.a("setChannelId failed", (Throwable) e);
            }
        }
    }

    private void a(NotificationManager notificationManager) {
        a(notificationManager, "multiplayerChatId", "Multiplayer Chat");
        a(notificationManager, "multiplayerStatusId", "Multiplayer Status");
    }

    private void a(NotificationManager notificationManager, String str, String str2) {
        if (Build.VERSION.SDK_INT >= 26) {
            try {
                Class<?> cls = Class.forName("android.app.NotificationChannel");
                notificationManager.getClass().getDeclaredMethod("createNotificationChannel", cls).invoke(notificationManager, cls.getDeclaredConstructor(String.class, CharSequence.class, Integer.TYPE).newInstance(str, str2, 3));
            } catch (Exception e) {
                GameEngine.a("Creating notification channel failed", (Throwable) e);
            }
        }
    }

    private void aE() {
        if (GameEngine.aU) {
            return;
        }
        GameEngine gameEngine = GameEngine.getGameEngine();
        PendingIntent activity = PendingIntent.getActivity(gameEngine.am, 0, new Intent(gameEngine.am, com.corrodinggames.rts.appFramework.a.class), 2);
        NotificationManager notificationManager = (NotificationManager) gameEngine.am.c("notification");
        if (Build.VERSION.SDK_INT >= 11) {
            if (Build.VERSION.SDK_INT >= 26) {
            }
            Notification.Builder builder = new Notification.Builder(gameEngine.am);
            builder.setContentTitle("Rusted Warfare Multiplayer");
            builder.setContentText("A multiplayer game is in progress");
            builder.setSmallIcon(AssetsID.drawable.icon);
            builder.setContentIntent(activity);
            builder.setOngoing(true);
            a(notificationManager);
            a(builder, "multiplayerStatusId");
            if (Build.VERSION.SDK_INT >= 16) {
                builder.build();
            }
            notificationManager.notify(1, builder.getNotification());
        }
    }

    private void i(int i) {
        if (GameEngine.aU) {
            return;
        }
        ((NotificationManager) GameEngine.getGameEngine().am.c("notification")).cancel(i);
    }

    public int an() {
        int i = 0;
        for (int i2 = 0; i2 < PlayerData.c; i2++) {
            PlayerData playerData = PlayerData.getPlayerData(i2);
            if (playerData != null && !playerData.w) {
                i++;
            }
        }
        return i;
    }

    public int ao() {
        int i = 0;
        for (int i2 = 0; i2 < PlayerData.c; i2++) {
            if (PlayerData.getPlayerData(i2) != null) {
                i++;
            }
        }
        return i;
    }

    public void e(PlayerData playerData) {
        if (this.isServer) {
            f(playerData);
        } else if (this.H) {
            k("-kick " + (playerData.site + 1));
        } else {
            GameEngine.print("kickTeamAndAttachedPlayer: but not server or proxy controller");
        }
    }

    public void f(PlayerData playerData) {
        if (playerData instanceof com.corrodinggames.rts.game.a.a) {
            playerData.I();
        } else if (this.z == playerData) {
            GameEngine.b("kickTeamAndAttachedPlayer", "Cannot kick self");
            return;
        } else {
            PlayerConnect c2 = c(playerData);
            if (c2 == null) {
                g("Kick player: cannot find connection for team");
            } else {
                int i = GameEngine.getGameEngine().settingsEngine.banTimeInSecondsAfterKick;
                if (i > 0) {
                    a(c2, "Temporarily banned due to recent kick", i);
                }
                a(c2, "Kicked by host");
                c2.a("Kicked by host");
            }
            playerData.I();
        }
        P();
        n.o();
    }

    public void ap() {
        GameEngine gameEngine = GameEngine.getGameEngine();
        if (!this.isServer) {
            GameEngine.b("addAIToGame", "We are not a server");
            return;
        }
        int nullSite = PlayerData.getNullSite();
        if (nullSite == -1) {
            gameEngine.a("No free slots for AI", 1);
        }
        com.corrodinggames.rts.game.a.a aVar = new com.corrodinggames.rts.game.a.a(nullSite);
        aVar.name = "AI";
        aVar.team = nullSite % 2;
        aVar.x = this.gameMapData.aidiff;
        aq();
        gameEngine.netEngine.d.a(aVar);
        gameEngine.netEngine.sendTeamData((PlayerConnect) null);
        n.o();
    }

    public boolean aq() {
        if (!this.isServer && this.B) {
            GameEngine.b("updateNamesOfAI", "We are not a server");
            return false;
        }
        boolean z = false;
        for (int i = 0; i < PlayerData.c; i++) {
            PlayerData playerData = PlayerData.getPlayerData(i);
            if (playerData != null && b(playerData)) {
                z = true;
            }
        }
        return z;
    }

    /* renamed from: a */
    public void setPlayerTeamSynchronized(PlayerData playerData, int i) {
        synchronized (this.bC) {
            setPlayerTeam(playerData, i);
        }
    }

    /* renamed from: c */
    private void setPlayerTeam(PlayerData playerData, int i) {
        if (playerData.site != i) {
            int i2 = playerData.site;
            int i3 = playerData.team;
            boolean z = false;
            if (i == -3) {
                z = true;
                i = PlayerData.m128H();
                if (i == -1) {
                    e("No free spectator slots");
                    return;
                }
            }
            PlayerData playerData2 = PlayerData.getPlayerData(i);
            playerData.f(i);
            playerData.team = i3;
            if (z) {
                playerData.team = -3;
            }
            if (playerData2 != null) {
                int i4 = playerData2.team;
                playerData2.f(i2);
                if (i4 == -3) {
                    playerData2.team = -3;
                } else {
                    playerData2.team = i3;
                }
            }
            M();
            P();
        }
    }

    public void a(Server_type server_type) {
        synchronized (this.bC) {
            b(server_type);
        }
    }

    private synchronized void b(Server_type server_type) {
        if (!GameEngine.getGameEngine().netEngine.isServer) {
            GameEngine.m328e("Not server");
            return;
        }
        if (server_type == Server_type.layout_2sides) {
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < PlayerData.c; i++) {
                PlayerData playerData = PlayerData.getPlayerData(i);
                if (playerData != null) {
                    arrayList.add(playerData);
                }
            }
            Collections.shuffle(arrayList);
            int size = arrayList.size() / 2;
            if (arrayList.size() % 2 != 0) {
                size += f.rand(0, 1);
            }
            if (size >= arrayList.size()) {
                size = arrayList.size();
            }
            int i2 = 0;
            for (int i3 = 0; i3 < size; i3++) {
                ((PlayerData) arrayList.get(i3)).f(i2);
                i2 += 2;
                ((PlayerData) arrayList.get(i3)).team = 0;
            }
            int i4 = 1;
            for (int i5 = 0 + size; i5 < arrayList.size(); i5++) {
                ((PlayerData) arrayList.get(i5)).f(i4);
                i4 += 2;
                ((PlayerData) arrayList.get(i5)).team = 1;
            }
        } else if (server_type == Server_type.layout_3sides) {
            ArrayList arrayList2 = new ArrayList();
            for (int i6 = 0; i6 < PlayerData.c; i6++) {
                PlayerData playerData2 = PlayerData.getPlayerData(i6);
                if (playerData2 != null) {
                    arrayList2.add(playerData2);
                }
            }
            Collections.shuffle(arrayList2);
            int size2 = arrayList2.size() / 3;
            if (size2 >= arrayList2.size()) {
                size2 = arrayList2.size();
            }
            int i7 = 0;
            for (int i8 = 0; i8 < size2; i8++) {
                PlayerData playerData3 = (PlayerData) arrayList2.get(i8);
                playerData3.f(i7);
                playerData3.team = 0;
                i7 += 3;
                arrayList2.set(i8, null);
            }
            int i9 = 0 + size2;
            int size3 = i9 + (arrayList2.size() / 3);
            if (size3 >= arrayList2.size()) {
                size3 = arrayList2.size();
            }
            if (i9 >= arrayList2.size()) {
                i9 = arrayList2.size();
            }
            int i10 = 1;
            for (int i11 = i9; i11 < size3; i11++) {
                PlayerData playerData4 = (PlayerData) arrayList2.get(i11);
                playerData4.f(i10);
                playerData4.team = 1;
                i10 += 3;
                arrayList2.set(i11, null);
            }
            int i12 = i9 + size2;
            if (i12 >= arrayList2.size()) {
                i12 = arrayList2.size();
            }
            int i13 = 2;
            for (int i14 = i12; i14 < arrayList2.size(); i14++) {
                PlayerData playerData5 = (PlayerData) arrayList2.get(i14);
                if (i13 >= PlayerData.c) {
                    playerData5.f(i13);
                    playerData5.team = 2;
                    i13 += 3;
                    arrayList2.set(i14, null);
                }
            }
            for (int i15 = 0; i15 < arrayList2.size(); i15++) {
                PlayerData playerData6 = (PlayerData) arrayList2.get(i15);
                if (playerData6 != null) {
                    for (int i16 = 0; i16 < PlayerData.c; i16++) {
                        if (PlayerData.getPlayerData(i16) == null) {
                            playerData6.f(i16);
                            playerData6.team = 2;
                            arrayList2.set(i15, null);
                        }
                    }
                }
            }
        } else if (server_type == Server_type.layout_ffa) {
            ArrayList arrayList3 = new ArrayList();
            for (int i17 = 0; i17 < PlayerData.c; i17++) {
                PlayerData playerData7 = PlayerData.getPlayerData(i17);
                if (playerData7 != null) {
                    arrayList3.add(playerData7);
                }
            }
            Collections.shuffle(arrayList3);
            int i18 = 0;
            for (int i19 = 0; i19 < arrayList3.size(); i19++) {
                ((PlayerData) arrayList3.get(i19)).f(i18);
                ((PlayerData) arrayList3.get(i19)).team = i18;
                i18++;
            }
        } else if (server_type == Server_type.layout_spectators) {
            ArrayList arrayList4 = new ArrayList();
            for (int i20 = 0; i20 < PlayerData.c; i20++) {
                PlayerData playerData8 = PlayerData.getPlayerData(i20);
                if (playerData8 != null) {
                    arrayList4.add(playerData8);
                }
            }
            Collections.shuffle(arrayList4);
            int i21 = 0;
            for (int i22 = 0; i22 < arrayList4.size(); i22++) {
                int m128H = PlayerData.m128H();
                if (m128H != -1) {
                    ((PlayerData) arrayList4.get(i22)).f(m128H);
                }
                ((PlayerData) arrayList4.get(i22)).team = -3;
                i21++;
            }
        } else {
            throw new RuntimeException("overrideTeamLayout: unhandled layout: " + server_type);
        }
        M();
    }

    public void a(PlayerData playerData, int i, Integer num) {
        String str = VariableScope.nullOrMissingString;
        if (num != null) {
            str = " " + num;
        }
        if (!this.H && this.z == playerData) {
            k("-self_move " + (i + 1) + str);
        } else {
            k("-move " + (playerData.site + 1) + " " + (i + 1) + str);
        }
    }

    public void b(PlayerData playerData, int i) {
        if (i != -1) {
            i++;
        }
        if (!this.H && this.z == playerData) {
            k("-self_team " + i);
        } else {
            k("-team " + (playerData.site + 1) + " " + i);
        }
    }

    public void g(PlayerData playerData) {
        if (!playerData.H) {
            playerData.H = true;
            String str = playerData.name;
            if (str == null) {
                str = "Player - " + (playerData.site + 1) + VariableScope.nullOrMissingString;
            }
            j(str + " is victorious!");
        }
    }

    public void h(PlayerData playerData) {
        String str;
        GameEngine gameEngine = GameEngine.getGameEngine();
        boolean z = false;
        String str2 = playerData.name;
        if (str2 == null) {
            str2 = "Player - " + (playerData.site + 1) + VariableScope.nullOrMissingString;
        }
        String str3 = str2 + " was defeated";
        if (!this.bb) {
            str = str3 + " (Team: " + playerData.getPlayerTeamName() + ")";
        } else {
            int g = PlayerData.g();
            str = str3 + " (" + g + " players remaining)";
            if (g == 1) {
                z = true;
            }
        }
        if (!gameEngine.N() && gameEngine.tick < 60) {
            GameEngine.m328e("Not showing defeated message: " + str);
            str = null;
        }
        if (playerData.E) {
            str = null;
        }
        if (str != null) {
            j(str);
        }
        if (z) {
            PlayerData.Q();
        }
    }

    public void i(PlayerData playerData) {
        String str;
        String str2;
        GameEngine gameEngine = GameEngine.getGameEngine();
        String str3 = playerData.name;
        if (str3 == null) {
            str3 = "Player - " + (playerData.site + 1) + VariableScope.nullOrMissingString;
        }
        boolean z = false;
        if (gameEngine.tick < 10) {
            str = str3 + " had no starting units";
        } else {
            str = str3 + " has been wiped out";
        }
        if (!this.bb) {
            str2 = str + " (Team: " + playerData.getPlayerTeamName() + ")";
        } else {
            int g = PlayerData.g();
            str2 = str + " (" + g + " players remaining)";
            if (g == 1) {
                z = true;
            }
        }
        if (!gameEngine.N() && gameEngine.tick < 60) {
            GameEngine.m328e("Not showing defeated message: " + str2);
            str2 = null;
        }
        if (playerData.E) {
            str2 = null;
        }
        if (playerData.b()) {
            str2 = null;
        }
        if (str2 != null) {
            j(str2);
        }
        if (z) {
            PlayerData.Q();
        }
    }

    public synchronized void ar() {
        if (this.bD != null) {
            this.bD.cancel();
            this.bD = null;
        }
    }

    public synchronized void as() {
        if (this.publicRoom && this.isServer && this.bD == null) {
            this.bD = new Timer();
            this.bD.schedule(new TimerTask() { // from class: com.corrodinggames.rts.gameFramework.j.ad.6
                @Override // java.util.TimerTask, java.lang.Runnable
                public void run() {
                    GameNetAPIOperate.c();
                }
            }, 60000L, 60000L);
        }
    }

    public String at() {
        GameEngine gameEngine = GameEngine.getGameEngine();
        String str = VariableScope.nullOrMissingString;
        if (gameEngine.netEngine.isServer && !gameEngine.netEngine.F) {
            String ai = gameEngine.netEngine.ai();
            if (this.D) {
                if (this.E != null) {
                    str = str + this.E;
                }
            } else if (ai != null) {
                String str2 = "Local IP address: " + ai + " port: " + gameEngine.netEngine.port;
                if (gameEngine.netEngine.aV != null) {
                    if (!gameEngine.netEngine.aV.booleanValue()) {
                        str2 = str2 + "\nUnable to get a public IP address, check your internet connection";
                    } else if (gameEngine.netEngine.aT != null && gameEngine.netEngine.aU != null) {
                        str2 = str2 + "\nYour public address is " + (gameEngine.netEngine.aU.booleanValue() ? "<Open>" : "<CLOSED>") + " to the internet";
                    }
                } else {
                    str2 = str2 + "\nRetrieving your public IP...";
                }
                str = str + str2;
            } else {
                str = str + "You do not have a network connection";
            }
        }
        if (gameEngine.P()) {
            if (this.p) {
                str = str + "SandBox Mode!\nPlace any unit, Control all teams, Special powers";
            } else {
                str = str + "Local skirmish";
            }
        }
        boolean z = true;
        if (GameEngine.at() && gameEngine.netEngine.isServer) {
            z = false;
        }
        if (str.length() != 0) {
            str = str + "\n";
            if (GameEngine.av()) {
                str = str + "\n";
            }
        }
        if (gameEngine.netEngine.av || gameEngine.netEngine.isServer) {
            if (z) {
                if (gameEngine.netEngine.gameMapData.mapType != null) {
                    str = str + "Game Mode: " + gameEngine.netEngine.gameMapData.mapType.type();
                }
                if (gameEngine.netEngine.gameMapData.mapName != null) {
                    str = str + "\nMap: " + i.e(gameEngine.netEngine.gameMapData.mapName);
                }
            }
            str = (str + "\nStarting Credits: " + gameEngine.netEngine.j()) + "\nFog: " + gameEngine.netEngine.g();
            if (gameEngine.netEngine.gameMapData.initUnit != 1) {
                str = str + "\nStarting Units: " + gameEngine.netEngine.h();
            }
            if (gameEngine.netEngine.gameMapData.income != 1.0f) {
                str = str + "\n" + f.a(gameEngine.netEngine.gameMapData.income, 1) + "X income";
            }
            if (gameEngine.netEngine.gameMapData.nukes) {
                str = str + "\nNo nukes";
            }
            if (gameEngine.netEngine.gameMapData.sharedControl) {
                str = str + "\nShared control: On";
            }
            if (this.isServer) {
                if (gameEngine.netEngine.passwd != null) {
                    str = str + "\nPassword Protection: On";
                }
                if (!gameEngine.netEngine.publicRoom && !gameEngine.netEngine.F) {
                    str = str + "\nServer Visibility: Hidden";
                }
                if (gameEngine.netEngine.useMods && !gameEngine.netEngine.F) {
                    ArrayList j = gameEngine.bZ.j();
                    str = str + "\n-- Required Mods: --\n";
                    int i = 0;
                    Iterator it = j.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        com.corrodinggames.rts.gameFramework.mod.b bVar = (com.corrodinggames.rts.gameFramework.mod.b) it.next();
                        if (i > 2 && i < j.size() - 1) {
                            str = str + VariableScope.nullOrMissingString + (j.size() - i) + " more mods...";
                            break;
                        }
                        i++;
                        String b2 = bVar.b();
                        b2.replace("\"", "'");
                        b2.replace(";", ".");
                        str = str + " mod: \"" + b2 + "\"\n";
                    }
                }
            }
        }
        return str;
    }

    public String au() {
        if (!this.useMods) {
            return null;
        }
        ArrayList j = GameEngine.getGameEngine().bZ.j();
        String str = VariableScope.nullOrMissingString;
        int i = 0;
        Iterator it = j.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            com.corrodinggames.rts.gameFramework.mod.b bVar = (com.corrodinggames.rts.gameFramework.mod.b) it.next();
            if (i != 0) {
                str = str + "; ";
            }
            if (i > 1 && i < j.size() - 1) {
                str = str + VariableScope.nullOrMissingString + (j.size() - i) + " more...";
                break;
            }
            i++;
            String b2 = bVar.b();
            b2.replace(";", ".");
            str = str + b2;
        }
        return str;
    }

    public String av() {
        GameEngine gameEngine = GameEngine.getGameEngine();
        if (gameEngine.netEngine.gameMapData.mapName == null || gameEngine.netEngine.gameMapData.mapType == null) {
            return null;
        }
        if (gameEngine.netEngine.gameMapData.mapType == MapType.skirmishMap) {
            return "maps/skirmish/" + gameEngine.netEngine.gameMapData.mapName;
        }
        if (gameEngine.netEngine.gameMapData.mapType == MapType.customMap) {
            return "/SD/rusted_warfare_maps/" + gameEngine.netEngine.gameMapData.mapName;
        }
        GameEngine.m328e("getNetworkMapPath: unhandled type:" + gameEngine.netEngine.gameMapData.mapType);
        return null;
    }

    public boolean aw() {
        return this.isServer || this.H;
    }

    public void a(String str, PlayerConnect playerConnect) {
        GameEngine.m328e("sendCommandError: " + str);
        if (playerConnect == null) {
            b((PlayerConnect) null, -1, (String) null, str);
        } else {
            a(null, null, null, str, playerConnect);
        }
    }

    public boolean b(PlayerConnect playerConnect, PlayerData playerData, String str, String str2) {
        String str3;
        int i;
        PlayerData playerData2;
        String str4 = null;
        String str5 = VariableScope.nullOrMissingString;
        String[] strArr = new String[0];
        String trim = str2.trim();
        boolean z = false;
        if (trim.startsWith("-qc ")) {
            trim = trim.substring("-qc ".length()).trim();
            z = true;
        }
        if ((trim.startsWith("-") || trim.startsWith(".") || trim.startsWith("_")) && trim.length() >= 2) {
            String trim2 = trim.substring(1).trim();
            int indexOf = trim2.indexOf(" ");
            if (indexOf == -1) {
                indexOf = trim2.length();
            }
            str4 = trim2.substring(0, indexOf).toLowerCase(Locale.ENGLISH);
            if (indexOf != -1 && trim2.length() >= indexOf + 1) {
                str5 = trim2.substring(indexOf + 1).trim();
                strArr = str5.split(" ");
            }
        }
        if (str4 == null) {
            return false;
        }
        if (z && !"self_move".equals(str4) && !"self_team".equals(str4)) {
            return false;
        }
        if ("pause".equals(str4) || "unpause".equals(str4)) {
            if (playerData == null) {
                a("[Could not find player]", playerConnect);
                return true;
            } else if ((!this.isServer || playerData != this.z) && !this.d.b(playerConnect)) {
                a("[Only the host can change pause state]", playerConnect);
                return true;
            } else if (!this.aW) {
                a("[Game not yet started]", playerConnect);
                return true;
            } else {
                boolean z2 = !this.al;
                if ("unpause".equals(str4)) {
                    z2 = false;
                }
                e(z2);
                return true;
            }
        } else if ("endgame".equals(str4)) {
            if (playerData == null) {
                a("[Could not find player]", playerConnect);
                return true;
            } else if (!this.isServer || playerData != this.z) {
                a("[Only the host can end game]", playerConnect);
                return true;
            } else if (!this.aW) {
                a("[Game not yet started]", playerConnect);
                return true;
            } else {
                ag();
                return true;
            }
        } else if ("teamlock".equals(str4)) {
            if (playerData == null) {
                a("[Could not find player]", playerConnect);
                return true;
            } else if ((!this.isServer || playerData != this.z) && !this.d.b(playerConnect)) {
                a("[Only the host can change teamlock]", playerConnect);
                return true;
            } else if ("true".equalsIgnoreCase(str5) || "on".equalsIgnoreCase(str5)) {
                this.gameMapData.m = true;
                a("[teams are locked]", playerConnect);
                return true;
            } else if ("false".equalsIgnoreCase(str5) || "off".equalsIgnoreCase(str5)) {
                this.gameMapData.m = false;
                a("[teams are unlocked]", playerConnect);
                return true;
            } else {
                a("[Expected true or false]", playerConnect);
                return true;
            }
        } else if ("roomlock".equals(str4)) {
            if (playerData == null) {
                a("[Could not find player]", playerConnect);
                return true;
            } else if (!this.isServer || playerData != this.z) {
                a("[Only the host can change roomlock]", playerConnect);
                return true;
            } else if ("true".equalsIgnoreCase(str5) || "on".equalsIgnoreCase(str5)) {
                this.gameMapData.p = true;
                a("[room is locked]", playerConnect);
                return true;
            } else if ("false".equalsIgnoreCase(str5) || "off".equalsIgnoreCase(str5)) {
                this.gameMapData.p = false;
                a("[room is unlocked]", playerConnect);
                return true;
            } else {
                a("[Expected true or false]", playerConnect);
                return true;
            }
        } else if ("share".equals(str4)) {
            if (playerData == null) {
                a("[Could not find player]", playerConnect);
                return true;
            } else if (!this.gameMapData.sharedControl) {
                a("[Shared control is not enabled in this game]", playerConnect);
                return true;
            } else if ("true".equalsIgnoreCase(str5) || "on".equalsIgnoreCase(str5)) {
                if (!playerData.sharedControl_1) {
                    playerData.sharedControl_1 = true;
                    j("[shared control now on for " + str + "]");
                    return true;
                }
                j("[shared control already on for " + str + "]");
                return true;
            } else if ("false".equalsIgnoreCase(str5) || "off".equalsIgnoreCase(str5)) {
                if (playerData.sharedControl_1) {
                    playerData.sharedControl_1 = false;
                    j("[shared control now off for " + str + "]");
                    return true;
                }
                j("[shared control already off for " + str + "]");
                return true;
            } else {
                a("[Expected true or false]", playerConnect);
                return true;
            }
        } else if ("self_move".equals(str4)) {
            if (playerData == null) {
                a("[Cannot Move - Player not found]", playerConnect);
                return true;
            } else if (this.aW) {
                a("[Cannot Move '" + playerData.name + "' - Game has been started]", playerConnect);
                return true;
            } else if (o()) {
                a("[Cannot Move '" + playerData.name + "' - Game is starting]", playerConnect);
                return true;
            } else if (this.gameMapData.m) {
                a("[Cannot Move '" + playerData.name + "' - Teams locked]", playerConnect);
                return true;
            } else if (strArr.length > 0) {
                try {
                    int intValue = Integer.valueOf(strArr[0]).intValue();
                    Integer num = null;
                    if (strArr.length > 1) {
                        try {
                            num = Integer.valueOf(strArr[1]);
                            if (num.intValue() != -1 && (num.intValue() < 1 || num.intValue() > 99)) {
                                a("[Cannot Move Team - Ally group - Out of range]", playerConnect);
                                return true;
                            }
                        } catch (NumberFormatException e) {
                            a("[Cannot Move '" + playerData.name + "' - ally group '" + strArr[1] + "' is not a number]", playerConnect);
                            return true;
                        }
                    }
                    boolean z3 = false;
                    if (intValue - 1 == -3) {
                        if (!this.gameMapData.spectators) {
                            a("[Spectators are disabled on this server]", playerConnect);
                            return true;
                        }
                        synchronized (this.bC) {
                            intValue = PlayerData.m128H();
                            if (intValue != -1) {
                                setPlayerTeamSynchronized(playerData, -3);
                            }
                        }
                        z3 = true;
                    }
                    int i2 = playerData.team;
                    boolean z4 = i2 == -3;
                    if (!z3) {
                        if (intValue < 1 || intValue > PlayerData.c) {
                            a("[Cannot Move '" + playerData.name + "' - target slotId must between 1-" + PlayerData.c + "]", playerConnect);
                            return true;
                        }
                        synchronized (this.bC) {
                            if (this.z != playerData && (playerData2 = PlayerData.getPlayerData(intValue - 1)) != null && !playerData2.w && !playerData2.b()) {
                                a("[Cannot move '" + playerData.name + "' to slot: " + intValue + " - Player: " + playerData2.name + " is in that slot.]", playerConnect);
                                return true;
                            }
                            setPlayerTeamSynchronized(playerData, intValue - 1);
                        }
                    }
                    playerData.team = i2;
                    if (num != null) {
                        if (num.intValue() == -1) {
                            playerData.team = playerData.site % 2;
                        } else {
                            playerData.team = num.intValue();
                        }
                    }
                    if (this.gameMapData.n) {
                        playerData.team = playerData.site % 2;
                    }
                    if (z3) {
                        playerData.team = -3;
                    }
                    if (z3) {
                        if (!z4) {
                            j("Player '" + playerData.name + "' is now a spectator");
                        }
                    } else {
                        j("Player '" + playerData.name + "' moved themselves to: " + intValue);
                    }
                    P();
                    n.o();
                    return true;
                } catch (NumberFormatException e2) {
                    a("[Cannot Move '" + playerData.name + "' - team '" + strArr[0] + "' is not a number]", playerConnect);
                    return true;
                }
            } else {
                a("[Cannot Move '" + playerData.name + "' - No target]", playerConnect);
                return true;
            }
        } else if ("self_team".equals(str4)) {
            if (playerData == null) {
                a("[Cannot Set Team - Player not found]", playerConnect);
                return true;
            } else if (this.aW) {
                a("[" + playerData.name + ": Cannot Set Team - Game has been started]", playerConnect);
                return true;
            } else if (o()) {
                a("[" + playerData.name + ": Cannot Set Team - Game is starting]", playerConnect);
                return true;
            } else if (this.gameMapData.m) {
                a("[" + playerData.name + ": Cannot Set Team - Teams locked]", playerConnect);
                return true;
            } else if (this.gameMapData.n) {
                return true;
            } else {
                try {
                    int intValue2 = Integer.valueOf(str5).intValue();
                    if (intValue2 == -1) {
                        i = playerData.site % 2;
                    } else if (intValue2 < 1 || intValue2 > 99) {
                        a("[Cannot Set Team - Out of range]", playerConnect);
                        return true;
                    } else {
                        i = intValue2 - 1;
                    }
                    if (playerData.team != i) {
                        playerData.team = i;
                        a("Player '" + playerData.name + "' team changed to: " + intValue2, playerConnect);
                    }
                    P();
                    n.o();
                    return true;
                } catch (NumberFormatException e3) {
                    m("'" + str5 + "' is not a number");
                    return true;
                }
            }
        } else if ("surrender".equals(str4)) {
            if (!this.aW) {
                a("[Cannot Surrender - Game has not started]", playerConnect);
                return true;
            } else if (playerData == null) {
                a("[Could not find player]", playerConnect);
                return true;
            } else {
                if (!playerData.k()) {
                    playerData.l();
                    boolean m = playerData.m();
                    GameEngine.m328e(str + ": Is voting to surrender (can surrender:" + m + ", afk:" + playerData.ab + ", defeated:" + playerData.G + ", disconnected:" + playerData.isTimeOut() + ")");
                    if (m) {
                        str3 = VariableScope.nullOrMissingString;
                    } else {
                        str3 = "(Cannot vote) ";
                    }
                } else {
                    GameEngine.m328e(str + ": Is already voting to surrender but updating timestamp");
                    playerData.l();
                    str3 = "(Already voted) ";
                }
                a(playerConnect, playerData, str, "-t " + str3 + "[Votes to surrender " + (PlayerData.b(playerData.team) + "/" + PlayerData.c(playerData.team)) + "]");
                return true;
            }
        } else {
            return false;
        }
    }

    public static void a(final EnterPasswordCallback enterPasswordCallback) {
        GameEngine gameEngine = GameEngine.getGameEngine();
        if (gameEngine.netEngine != null) {
            gameEngine.netEngine.d.a(enterPasswordCallback);
        }
        if (GameEngine.aU) {
            return;
        }
        com.corrodinggames.rts.appFramework.c.a(new Runnable() { // from class: com.corrodinggames.rts.gameFramework.j.ad.7
            @Override // java.lang.Runnable
            public void run() {
                n.a(EnterPasswordCallback.this);
            }
        });
    }

    public ArrayList ax() {
        ArrayList c2;
        synchronized (this.bC) {
            c2 = PlayerData.c();
        }
        return c2;
    }

    public void e(boolean z) {
        this.al = z;
        if (this.al) {
            j("Game Paused");
        } else {
            j("Game unpaused");
        }
    }

    public void b(PlayerConnect playerConnect, String str) {
        playerConnect.a(false, false, str);
    }

    public void c(PlayerConnect playerConnect, String str) {
        Iterator it = this.socketList.iterator();
        while (it.hasNext()) {
            PlayerConnect playerConnect2 = (PlayerConnect) it.next();
            if (playerConnect2.j == playerConnect) {
                b(playerConnect2, str);
            }
        }
    }

    public PlayerConnect a(PlayerConnect playerConnect, int i, String str, String str2) {
        GameEngine gameEngine = GameEngine.getGameEngine();
        PlayerConnect playerConnect2 = new PlayerConnect(this, new RelayForwardedSocket(playerConnect, i));
        playerConnect2.k = i;
        playerConnect2.j = playerConnect;
        playerConnect2.m = str;
        playerConnect2.n = str2;
        try {
            playerConnect2.d();
            gameEngine.netEngine.socketList.add(playerConnect2);
            gameEngine.netEngine.Q();
            return playerConnect2;
        } catch (IOException e) {
            e.printStackTrace();
            playerConnect2.a("crash");
            return null;
        }
    }

    public PlayerConnect a(PlayerConnect playerConnect, int i) {
        Iterator it = this.socketList.iterator();
        while (it.hasNext()) {
            PlayerConnect playerConnect2 = (PlayerConnect) it.next();
            if (playerConnect2.k == i && playerConnect2.j == playerConnect) {
                return playerConnect2;
            }
        }
        return null;
    }

    public static String p(String str) {
        String str2;
        char[] charArray;
        String replace = str.trim().replace("\n", ".").replace("\r", ".").replace("\t", ".").replace("\ufffd\ufffd", ".").replace(" ", "_");
        while (true) {
            str2 = replace;
            if (!str2.startsWith(".") && !str2.startsWith("-") && !str2.startsWith(" ")) {
                break;
            }
            replace = str2.substring(1);
        }
        StringBuilder sb = new StringBuilder();
        for (char c2 : str2.toCharArray()) {
            if (!Character.isISOControl(c2)) {
                sb.append(c2);
            }
        }
        return sb.toString();
    }

    public void a(ArrayList arrayList, final boolean z) {
        if (this.bF != null) {
            GameEngine.m328e("startJoinServerInternalThread: Already joining");
        } else if (arrayList.size() == 0) {
            GameEngine.m328e("startJoinServerInternalThread: no servers");
        } else {
            this.bF = a((String) arrayList.get(0), false, new Runnable() { // from class: com.corrodinggames.rts.gameFramework.j.ad.8
                @Override // java.lang.Runnable
                public void run() {
                    GameEngine gameEngine = GameEngine.getGameEngine();
                    GameEngine.m328e("startJoinServerInternalThread callback");
                    an anVar = GameNetEngine.this.bF;
                    GameNetEngine.this.bF = null;
                    if (anVar == null) {
                        GameEngine.m328e("startJoinServerInternalThread callback gameConnector==null");
                    } else if (anVar.e != null) {
                        GameEngine.m328e("startJoinServerInternalThread failed to connect: " + anVar.e);
                        if (z) {
                            gameEngine.netEngine.closeServer("Reconnect failed: " + anVar.e);
                            GameNetEngine.this.b("Reconnect failed", "reconnect failed");
                            gameEngine.d("Reconnect failed", "Reconnect failed: " + anVar.e);
                            gameEngine.i("Reconnect failed: " + anVar.e);
                        }
                    } else {
                        try {
                            gameEngine.netEngine.closeServer("starting new");
                            gameEngine.netEngine.bindSocket(anVar.g);
                        } catch (IOException e) {
                            gameEngine.c(e.getMessage(), "Connection failed");
                            e.printStackTrace();
                        }
                    }
                }
            });
        }
    }
}