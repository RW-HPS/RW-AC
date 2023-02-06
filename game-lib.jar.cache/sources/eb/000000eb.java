package com.corrodinggames.librocket.scripts;

import com.corrodinggames.rts.debug.ScriptServerSocket;
import com.corrodinggames.rts.debug.test.TestNewSocket;
import com.corrodinggames.rts.debug.test.n;
import com.corrodinggames.rts.game.PlayerData;
import com.corrodinggames.rts.game.maps.b;
import com.corrodinggames.rts.game.maps.f;
import com.corrodinggames.rts.game.units.a.s;
import com.corrodinggames.rts.game.units.al;
import com.corrodinggames.rts.game.units.am;
import com.corrodinggames.rts.game.units.ao;
import com.corrodinggames.rts.game.units.ar;
import com.corrodinggames.rts.game.units.as;
import com.corrodinggames.rts.game.units.custom.l;
import com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope;
import com.corrodinggames.rts.game.units.y;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.GameSaver;
import com.corrodinggames.rts.gameFramework.SyncPacket;
import com.corrodinggames.rts.gameFramework.Unit;
import com.corrodinggames.rts.gameFramework.net.GameInputStream;
import com.corrodinggames.rts.gameFramework.net.GameMapData;
import com.corrodinggames.rts.gameFramework.net.GameNetEngine;
import com.corrodinggames.rts.gameFramework.net.MapType;
import com.corrodinggames.rts.gameFramework.net.PlayerConnect;
import com.corrodinggames.rts.gameFramework.net.ServerAcceptRunnable;
import com.corrodinggames.rts.gameFramework.path.d;
import com.corrodinggames.rts.gameFramework.path.k;
import com.corrodinggames.rts.gameFramework.path.m;
import com.corrodinggames.rts.gameFramework.path.p;
import com.corrodinggames.rts.gameFramework.w;
import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.management.ManagementFactory;
import java.lang.management.RuntimeMXBean;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.concurrent.ConcurrentLinkedQueue;
import net.rudp.ReliableSocket;
import sun.management.VMManagement;

/* loaded from: game-lib.jar:com/corrodinggames/librocket/scripts/Debug.class */
public class Debug extends ScriptContext {
    Root root;
    boolean allFeatures;
    ConcurrentLinkedQueue backgroundClientConnections;
    Thread backgroundConnectionThread;
    Runnable backgroundConnectionRunnable = new Runnable() { // from class: com.corrodinggames.librocket.scripts.Debug.1
        @Override // java.lang.Runnable
        public void run() {
            Iterator it = Debug.this.backgroundClientConnections.iterator();
            while (it.hasNext()) {
                PlayerConnect playerConnect = (PlayerConnect) it.next();
            }
        }
    };
    boolean forceNonThreaded = true;

    Debug(Root root) {
        this.root = root;
    }

    public int currentPid() {
        try {
            RuntimeMXBean runtimeMXBean = ManagementFactory.getRuntimeMXBean();
            Field declaredField = runtimeMXBean.getClass().getDeclaredField("jvm");
            declaredField.setAccessible(true);
            VMManagement vMManagement = (VMManagement) declaredField.get(runtimeMXBean);
            Method declaredMethod = vMManagement.getClass().getDeclaredMethod("getProcessId", new Class[0]);
            declaredMethod.setAccessible(true);
            return ((Integer) declaredMethod.invoke(vMManagement, new Object[0])).intValue();
        } catch (Exception e) {
            e.printStackTrace();
            return -1;
        }
    }

    public void setLocalPlayerName(String str) {
        GameEngine.getGameEngine().netEngine.a(str);
    }

    public void setDdosProtection(boolean z) {
        ServerAcceptRunnable.b = z;
    }

    public void lookAt(float f, float f2) {
        GameEngine.getGameEngine().b(f, f2);
    }

    public void createManyUnits(String str, float f, float f2, int i, boolean z, int i2) {
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        while (i5 < i2) {
            i3 += 9;
            if (i3 > 400) {
                i3 = 0;
                i4 += 9;
            }
            createUnit(str, f + i3, f2 + i4, i, i5 == 0 ? z : false);
            i5++;
        }
    }

    public Long createUnit(String str, float f, float f2, int i, boolean z) {
        GameEngine gameEngine = GameEngine.getGameEngine();
        as a = ar.a(str);
        if (a == null) {
            this.root.logWarn("Could not find type:" + str);
            return null;
        }
        am a2 = a.a();
        a2.eo = f;
        a2.ep = f2;
        try {
            a2.Q(i);
            PlayerData.c(a2);
            a2.cK = true;
            if (z) {
                gameEngine.b(f, f2);
            }
            return Long.valueOf(a2.eh);
        } catch (f e) {
            throw new RuntimeException(e);
        }
    }

    public int getMaxCustomUnitTypeId() {
        return l.d.size();
    }

    public Long createCustomUnitFromTypeId(int i, float f, float f2, int i2, boolean z) {
        GameEngine gameEngine = GameEngine.getGameEngine();
        am a = ((l) l.d.get(i)).a();
        a.eo = f;
        a.ep = f2;
        try {
            a.Q(i2);
            PlayerData.c(a);
            a.cK = true;
            if (z) {
                gameEngine.b(f, f2);
            }
            return Long.valueOf(a.eh);
        } catch (f e) {
            throw new RuntimeException(e);
        }
    }

    public void enableFeatures(String str) {
        if (com.corrodinggames.rts.gameFramework.f.e(str).startsWith("221FC410BD29D786")) {
            this.allFeatures = true;
            ScriptServerSocket.d = true;
            return;
        }
        throw new RuntimeException("unknown");
    }

    public void selectNextUnit() {
        GameEngine gameEngine = GameEngine.getGameEngine();
        am amVar = null;
        boolean z = false;
        Iterator it = am.bF().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            am amVar2 = (am) it.next();
            if ((amVar2 instanceof am) && !(amVar2 instanceof al) && !amVar2.t()) {
                if (amVar == null) {
                    amVar = amVar2;
                }
                if (z) {
                    amVar = amVar2;
                    break;
                }
                z = amVar2.cG;
            }
        }
        gameEngine.bS.y();
        if (amVar != null) {
            gameEngine.bS.j(amVar);
        }
    }

    public void removeAllUnits() {
        Iterator it = w.dK().iterator();
        while (it.hasNext()) {
            ((w) it.next()).a();
        }
    }

    public void killAllUnits() {
        Iterator it = am.bF().iterator();
        while (it.hasNext()) {
            am amVar = (am) it.next();
            if (amVar instanceof am) {
                amVar.cu = -1.0f;
            }
        }
    }

    public boolean backgroundCurrentClientConnection() {
        if (this.allFeatures) {
            GameEngine gameEngine = GameEngine.getGameEngine();
            if (!gameEngine.netEngine.B) {
                GameEngine.m328e("Not networked");
                return false;
            } else if (gameEngine.netEngine.isServer) {
                throw new RuntimeException("server=true");
            } else {
                if (this.backgroundConnectionThread == null) {
                    this.backgroundConnectionThread = new Thread(this.backgroundConnectionRunnable);
                    this.backgroundConnectionThread.start();
                }
                if (this.backgroundClientConnections == null) {
                    this.backgroundClientConnections = new ConcurrentLinkedQueue();
                }
                Iterator it = gameEngine.netEngine.socketList.iterator();
                while (it.hasNext()) {
                    PlayerConnect playerConnect = (PlayerConnect) it.next();
                    playerConnect.t = true;
                    this.backgroundClientConnections.add(playerConnect);
                    gameEngine.netEngine.socketList.remove(playerConnect);
                }
                gameEngine.netEngine.closeServer("backgrounded");
                gameEngine.netEngine.B = true;
                return true;
            }
        }
        return false;
    }

    public boolean isTeamWipedOut(int i) {
        PlayerData playerData = PlayerData.getPlayerData(i);
        if (playerData == null) {
            this.root.logWarn("Could not find team:" + i);
            return true;
        }
        return playerData.G;
    }

    public boolean isTeamDefeated(int i) {
        PlayerData playerData = PlayerData.getPlayerData(i);
        if (playerData == null) {
            this.root.logWarn("Could not find team:" + i);
            return true;
        }
        return playerData.G;
    }

    public boolean isTeamInVictory(int i) {
        PlayerData playerData = PlayerData.getPlayerData(i);
        if (playerData == null) {
            this.root.logWarn("Could not find team:" + i);
            return false;
        }
        return playerData.H;
    }

    public String getPlayerName(int i) {
        PlayerData playerData = PlayerData.getPlayerData(i);
        if (playerData == null) {
            this.root.logWarn("Could not find team:" + i);
            return null;
        }
        return playerData.name;
    }

    public String getQueryStringOfPlayer(int i) {
        GameEngine gameEngine = GameEngine.getGameEngine();
        PlayerData playerData = PlayerData.getPlayerData(i);
        if (playerData == null) {
            this.root.logWarn("Could not find team:" + i);
            return null;
        }
        PlayerConnect c = gameEngine.netEngine.c(playerData);
        if (c == null) {
            this.root.logWarn("Found team but could not find connection for team:" + i);
            return null;
        }
        return c.o;
    }

    public boolean setTeamCredits(int i, int i2) {
        PlayerData playerData = PlayerData.getPlayerData(i);
        if (playerData == null) {
            this.root.logWarn("Could not find team:" + i);
            return false;
        }
        playerData.credits = i2;
        return true;
    }

    public boolean setTeamAllyGroup(int i, int i2) {
        PlayerData playerData = PlayerData.getPlayerData(i);
        if (playerData == null) {
            this.root.logWarn("Could not find team:" + i);
            return false;
        }
        playerData.team = i2;
        return true;
    }

    public void giveUpgradeToAllUnits() {
        Iterator it = am.bF().iterator();
        while (it.hasNext()) {
            am amVar = (am) it.next();
            if (amVar instanceof y) {
                y yVar = (y) amVar;
                s a = yVar.a(yVar.cm());
                if (a != null) {
                    yVar.a(a, false);
                }
            }
        }
    }

    public void giveAllActionsToAllUnits() {
        Iterator it = am.bF().iterator();
        while (it.hasNext()) {
            am amVar = (am) it.next();
            if (amVar instanceof y) {
                y yVar = (y) amVar;
                Iterator it2 = yVar.N().iterator();
                while (it2.hasNext()) {
                    yVar.a((s) it2.next(), false);
                }
            }
        }
    }

    public void completeAllUnitsQueues() {
        Iterator it = am.bF().iterator();
        while (it.hasNext()) {
            am amVar = (am) it.next();
            if (amVar instanceof com.corrodinggames.rts.game.units.d.l) {
                ((com.corrodinggames.rts.game.units.d.l) amVar).dz();
            }
        }
    }

    public boolean moveAllUnitsOnTeam(int i, float f, float f2) {
        PlayerData playerData = PlayerData.getPlayerData(i);
        if (playerData == null) {
            this.root.logWarn("Could not find team:" + i);
            return false;
        }
        SyncPacket b = GameEngine.getGameEngine().cf.b(playerData);
        Iterator it = am.bF().iterator();
        while (it.hasNext()) {
            am amVar = (am) it.next();
            if (amVar instanceof y) {
                y yVar = (y) amVar;
                if (yVar.bX == playerData) {
                    b.a(yVar);
                }
            }
        }
        b.a(f, f2);
        return true;
    }

    public void showMessage(String str) {
        GameEngine gameEngine = GameEngine.getGameEngine();
        if (str == null || str.trim().equals(VariableScope.nullOrMissingString)) {
            return;
        }
        gameEngine.netEngine.m(str.replace("\\n", "\n"));
    }

    public String unicodeTest1() {
        return "start \u00a5123 \u061c end";
    }

    public void setZoom(float f) {
        GameEngine.getGameEngine().cV = f;
    }

    public boolean isNetworkGameActive() {
        return GameEngine.getGameEngine().N();
    }

    public int getLocalPlayerId() {
        return GameEngine.getGameEngine().netEngine.z.site;
    }

    public int numberOfHumanPlayers() {
        return GameEngine.getGameEngine().netEngine.an();
    }

    public int numberOfPlayersPlusAI() {
        return GameEngine.getGameEngine().netEngine.ao();
    }

    public int numberOfPlayerConnections() {
        return GameEngine.getGameEngine().netEngine.B();
    }

    public boolean enableFastSync() {
        GameEngine.getGameEngine().netEngine.ai = 30;
        return true;
    }

    public boolean enableExtraNetworkDebug() {
        GameEngine.getGameEngine().netEngine.debug = true;
        return true;
    }

    public boolean throwIfAnyPlayerNotInSync() {
        GameEngine.getGameEngine().netEngine.x();
        return true;
    }

    public boolean enableFastResyncTimer() {
        GameNetEngine.c = true;
        return true;
    }

    public boolean enablePauseOnDesync() {
        GameEngine.getGameEngine().netEngine.aj = true;
        return true;
    }

    public boolean networkSetIncomeMultiplier(float f) {
        GameEngine gameEngine = GameEngine.getGameEngine();
        GameMapData e = gameEngine.netEngine.e();
        e.income = f;
        gameEngine.netEngine.a(e);
        return true;
    }

    public boolean networkSetPortNumber(int i) {
        GameEngine.getGameEngine().settingsEngine.networkPort = i;
        return true;
    }

    public boolean networkSetUdp(boolean z) {
        GameEngine.getGameEngine().settingsEngine.udpInMultiplayer = z;
        return true;
    }

    public boolean networkDisconnect() {
        GameEngine.getGameEngine().netEngine.closeServer("debug");
        return true;
    }

    public boolean networkAbort() {
        GameEngine gameEngine = GameEngine.getGameEngine();
        Iterator it = gameEngine.netEngine.socketList.iterator();
        while (it.hasNext()) {
            PlayerConnect playerConnect = (PlayerConnect) it.next();
            if (playerConnect.socket instanceof ReliableSocket) {
                GameEngine.m328e("Closing: " + playerConnect.g());
                ((ReliableSocket) playerConnect.socket).d();
            }
        }
        gameEngine.netEngine.closeServer("debug");
        return true;
    }

    public boolean disableNetworkOwnInfo() {
        GameNetEngine.r = false;
        return true;
    }

    public boolean networkPause() {
        GameEngine gameEngine = GameEngine.getGameEngine();
        gameEngine.netEngine.aj = true;
        gameEngine.netEngine.ak = true;
        return true;
    }

    public boolean plainTextDebugSave(boolean z) {
        GameEngine.getGameEngine();
        GameSaver.a = z;
        return true;
    }

    public boolean checkDesync(int i) {
        GameEngine gameEngine = GameEngine.getGameEngine();
        if (gameEngine.netEngine.ap != 0) {
            throw new RuntimeException("numberOfDesyncErrors==" + gameEngine.netEngine.ap);
        }
        if (gameEngine.netEngine.aq < i) {
            throw new RuntimeException("game.network.numberOfDesyncPasses:" + gameEngine.netEngine.aq + "<" + i);
        }
        this.root.logDebug("numberOfDesyncPasses:" + gameEngine.netEngine.aq);
        return true;
    }

    public int getNumberOfDesyncErrors() {
        return GameEngine.getGameEngine().netEngine.ap;
    }

    public int getNumberOfDesyncPasses() {
        return GameEngine.getGameEngine().netEngine.aq;
    }

    public int getNumberOfResyncSendsOrRecv() {
        return GameEngine.getGameEngine().netEngine.ar;
    }

    public boolean setMultiplayerMap(int i, String str) {
        GameMapData gameMapData = GameEngine.getGameEngine().netEngine.gameMapData;
        gameMapData.mapType = MapType.values()[i];
        gameMapData.mapName = str;
        return true;
    }

    public boolean setMultiplayerSave(String str) {
        GameMapData gameMapData = GameEngine.getGameEngine().netEngine.gameMapData;
        gameMapData.mapType = MapType.savedGame;
        gameMapData.mapName = str;
        return true;
    }

    public void generateNewClientId() {
        GameEngine.getGameEngine().netEngine.Y();
    }

    public void disableFog() {
        GameEngine.getGameEngine();
    }

    public void overrideDeltaSpeed(float f) {
        GameEngine.getGameEngine().bu = f;
    }

    public void setGameSetting(String str, String str2) {
        GameEngine.getGameEngine().settingsEngine.setValueDynamic(str, str2);
    }

    public void setNetworkaiDifficulty(int i) {
        GameEngine gameEngine = GameEngine.getGameEngine();
        GameMapData e = gameEngine.netEngine.e();
        e.aidiff = i;
        gameEngine.netEngine.a(e);
    }

    public void setNetworkStartingUnits(int i) {
        GameEngine gameEngine = GameEngine.getGameEngine();
        GameMapData e = gameEngine.netEngine.e();
        e.initUnit = i;
        gameEngine.netEngine.a(e);
    }

    public void startRandomUnitDesyncTest() {
        GameEngine gameEngine = GameEngine.getGameEngine();
        SyncPacket b = gameEngine.cf.b();
        b.i = PlayerData.i;
        b.r = true;
        b.u = 1;
        gameEngine.netEngine.a(b);
    }

    public void startRandomUnitStressTest() {
        GameEngine gameEngine = GameEngine.getGameEngine();
        SyncPacket b = gameEngine.cf.b();
        b.i = PlayerData.i;
        b.r = true;
        b.u = 2;
        gameEngine.netEngine.a(b);
    }

    public void runAllUnitTests() {
        this.root.logWarn("Running unit tests..");
        new n().a();
    }

    public void runAllLeakTests() {
        this.root.logWarn("Running leak tests..");
        new TestNewSocket().start();
    }

    public boolean loadSaveFromSystemPath(String str) {
        GameEngine gameEngine = GameEngine.getGameEngine();
        try {
            FileInputStream fileInputStream = new FileInputStream(new File(str));
            BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream);
            DataInputStream dataInputStream = new DataInputStream(bufferedInputStream);
            boolean a = gameEngine.ca.a(new GameInputStream(dataInputStream), false, false, false);
            dataInputStream.close();
            bufferedInputStream.close();
            fileInputStream.close();
            return a;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void checkTeamCaches() {
        Iterator it = PlayerData.c().iterator();
        while (it.hasNext()) {
            PlayerData playerData = (PlayerData) it.next();
            if (playerData.t()) {
                throw new RuntimeException("Team cache difference on team:" + playerData.site);
            }
        }
    }

    public void setPathSpeedConf(boolean z) {
        this.forceNonThreaded = z;
    }

    public float getPathSpeed(int i, float f, float f2, float f3, float f4) {
        GameEngine gameEngine = GameEngine.getGameEngine();
        b bVar = gameEngine.bL;
        ArrayList arrayList = new ArrayList();
        bVar.a(f3, f4);
        int i2 = bVar.T;
        int i3 = bVar.U;
        long loadAllUnitsTook = Unit.loadAllUnitsTook();
        d.a = 0;
        d.b = 0;
        d.c = 0;
        d.d = 0;
        d.e = 0;
        d.f = 0;
        d.g = 0;
        d.h = 0.0d;
        d.i = 0.0d;
        m.c = 0;
        d.u = 0;
        for (int i4 = 0; i4 < i; i4++) {
            k a = gameEngine.bU.a(false);
            bVar.a(f, f2);
            a.a(ao.LAND, (short) bVar.T, (short) bVar.U, null, false);
            bVar.a(f3, f4);
            a.a((short) bVar.T, (short) bVar.U, (short) 0);
            a.p = true;
            a.q = 0;
            a.r = false;
            gameEngine.bU.a(a, false, this.forceNonThreaded);
            arrayList.add(a);
        }
        if (!this.forceNonThreaded) {
            return -1.0f;
        }
        float a2 = Unit.a(loadAllUnitsTook);
        int i5 = -1;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            LinkedList a3 = ((k) it.next()).a();
            int i6 = 0;
            Iterator it2 = a3.iterator();
            while (it2.hasNext()) {
                p pVar = (p) it2.next();
                i6++;
            }
            if (i5 != -1 && i5 != i6) {
                GameEngine.print("pathDistance inconsistency detected:" + i5 + "!=" + i6);
            }
            p pVar2 = (p) a3.getLast();
            if (pVar2.a != i2 || pVar2.b != i3) {
                GameEngine.print("path did not react goal, got to:" + ((int) pVar2.a) + "," + ((int) pVar2.b) + " (vs " + i2 + ", " + i3 + ")");
            }
            i5 = i6;
        }
        GameEngine.print("hotBufferWatermark:" + d.a + ", nodesAdded:" + d.d + ", mainQueueWatermark:" + d.b + ", backlogWatermark:" + d.c + ", scannedA:" + d.e + ", scannedB:" + d.f + ", scannedC:" + d.g + ", time:" + Unit.a(d.i) + "/" + Unit.a(d.h) + ", dirtyPeak:" + d.u + ", dis:" + i5);
        if (m.c != 0) {
            GameEngine.print("newNodesCreated:" + m.c);
        }
        return a2;
    }

    public void muteSounds() {
        GameEngine gameEngine = GameEngine.getGameEngine();
        gameEngine.bM.b = true;
        gameEngine.bN.f();
    }

    public void pong() {
    }
}