package com.corrodinggames.librocket.scripts;

import com.corrodinggames.rts.debug.ScriptServerSocket;
import com.corrodinggames.rts.debug.test.C0085n;
import com.corrodinggames.rts.debug.test.TestNewSocket;
import com.corrodinggames.rts.game.PlayerData;
import com.corrodinggames.rts.game.p012b.C0173b;
import com.corrodinggames.rts.game.p012b.C0179f;
import com.corrodinggames.rts.game.units.AbstractC0244am;
import com.corrodinggames.rts.game.units.AbstractC0249ar;
import com.corrodinggames.rts.game.units.AbstractC0629y;
import com.corrodinggames.rts.game.units.C0243al;
import com.corrodinggames.rts.game.units.EnumC0246ao;
import com.corrodinggames.rts.game.units.InterfaceC0303as;
import com.corrodinggames.rts.game.units.custom.C0458l;
import com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope;
import com.corrodinggames.rts.game.units.p013a.AbstractC0224s;
import com.corrodinggames.rts.game.units.p024d.InterfaceC0506l;
import com.corrodinggames.rts.gameFramework.AbstractC1155w;
import com.corrodinggames.rts.gameFramework.C0742br;
import com.corrodinggames.rts.gameFramework.C0773f;
import com.corrodinggames.rts.gameFramework.C1157y;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.SyncPacket;
import com.corrodinggames.rts.gameFramework.net.GameInputStream;
import com.corrodinggames.rts.gameFramework.net.GameMapData;
import com.corrodinggames.rts.gameFramework.net.GameNetEngine;
import com.corrodinggames.rts.gameFramework.net.MapType;
import com.corrodinggames.rts.gameFramework.net.PlayerConnect;
import com.corrodinggames.rts.gameFramework.net.ServerAcceptRunnable;
import com.corrodinggames.rts.gameFramework.p043k.C0935d;
import com.corrodinggames.rts.gameFramework.p043k.C0942k;
import com.corrodinggames.rts.gameFramework.p043k.C0944m;
import com.corrodinggames.rts.gameFramework.p043k.C0947p;
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
        GameEngine.getGameEngine().netEngine.m1689a(str);
    }

    public void setDdosProtection(boolean z) {
        ServerAcceptRunnable.f5908b = z;
    }

    public void lookAt(float f, float f2) {
        GameEngine.getGameEngine().m1136b(f, f2);
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
        InterfaceC0303as m4604a = AbstractC0249ar.m4604a(str);
        if (m4604a == null) {
            this.root.logWarn("Could not find type:" + str);
            return null;
        }
        AbstractC0244am mo4466a = m4604a.mo4466a();
        mo4466a.f7172eo = f;
        mo4466a.f7173ep = f2;
        try {
            mo4466a.m4690Q(i);
            PlayerData.m4839c(mo4466a);
            mo4466a.f1653cK = true;
            if (z) {
                gameEngine.m1136b(f, f2);
            }
            return Long.valueOf(mo4466a.f7166eh);
        } catch (C0179f e) {
            throw new RuntimeException(e);
        }
    }

    public int getMaxCustomUnitTypeId() {
        return C0458l.f3219d.size();
    }

    public Long createCustomUnitFromTypeId(int i, float f, float f2, int i2, boolean z) {
        GameEngine gameEngine = GameEngine.getGameEngine();
        AbstractC0244am mo4466a = ((C0458l) C0458l.f3219d.get(i)).mo4466a();
        mo4466a.f7172eo = f;
        mo4466a.f7173ep = f2;
        try {
            mo4466a.m4690Q(i2);
            PlayerData.m4839c(mo4466a);
            mo4466a.f1653cK = true;
            if (z) {
                gameEngine.m1136b(f, f2);
            }
            return Long.valueOf(mo4466a.f7166eh);
        } catch (C0179f e) {
            throw new RuntimeException(e);
        }
    }

    public void enableFeatures(String str) {
        if (C0773f.m2263e(str).startsWith("221FC410BD29D786")) {
            this.allFeatures = true;
            ScriptServerSocket.f390d = true;
            return;
        }
        throw new RuntimeException("unknown");
    }

    public void selectNextUnit() {
        GameEngine gameEngine = GameEngine.getGameEngine();
        AbstractC0244am abstractC0244am = null;
        boolean z = false;
        Iterator it = AbstractC0244am.m4670bF().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            AbstractC0244am abstractC0244am2 = (AbstractC0244am) it.next();
            if ((abstractC0244am2 instanceof AbstractC0244am) && !(abstractC0244am2 instanceof C0243al) && !abstractC0244am2.mo1879t()) {
                if (abstractC0244am == null) {
                    abstractC0244am = abstractC0244am2;
                }
                if (z) {
                    abstractC0244am = abstractC0244am2;
                    break;
                }
                z = abstractC0244am2.f1649cG;
            }
        }
        gameEngine.f6330bS.m1922y();
        if (abstractC0244am != null) {
            gameEngine.f6330bS.m1945j(abstractC0244am);
        }
    }

    public void removeAllUnits() {
        Iterator it = AbstractC1155w.m456dK().iterator();
        while (it.hasNext()) {
            ((AbstractC1155w) it.next()).mo467a();
        }
    }

    public void killAllUnits() {
        Iterator it = AbstractC0244am.m4670bF().iterator();
        while (it.hasNext()) {
            AbstractC0244am abstractC0244am = (AbstractC0244am) it.next();
            if (abstractC0244am instanceof AbstractC0244am) {
                abstractC0244am.f1637cu = -1.0f;
            }
        }
    }

    public boolean backgroundCurrentClientConnection() {
        if (this.allFeatures) {
            GameEngine gameEngine = GameEngine.getGameEngine();
            if (!gameEngine.netEngine.f5782B) {
                GameEngine.m5925e("Not networked");
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
                    playerConnect.f5996t = true;
                    this.backgroundClientConnections.add(playerConnect);
                    gameEngine.netEngine.socketList.remove(playerConnect);
                }
                gameEngine.netEngine.closeServer("backgrounded");
                gameEngine.netEngine.f5782B = true;
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
        return playerData.f1332G;
    }

    public boolean isTeamDefeated(int i) {
        PlayerData playerData = PlayerData.getPlayerData(i);
        if (playerData == null) {
            this.root.logWarn("Could not find team:" + i);
            return true;
        }
        return playerData.f1332G;
    }

    public boolean isTeamInVictory(int i) {
        PlayerData playerData = PlayerData.getPlayerData(i);
        if (playerData == null) {
            this.root.logWarn("Could not find team:" + i);
            return false;
        }
        return playerData.f1333H;
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
        PlayerConnect m1627c = gameEngine.netEngine.m1627c(playerData);
        if (m1627c == null) {
            this.root.logWarn("Found team but could not find connection for team:" + i);
            return null;
        }
        return m1627c.f5991o;
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
        Iterator it = AbstractC0244am.m4670bF().iterator();
        while (it.hasNext()) {
            AbstractC0244am abstractC0244am = (AbstractC0244am) it.next();
            if (abstractC0244am instanceof AbstractC0629y) {
                AbstractC0629y abstractC0629y = (AbstractC0629y) abstractC0244am;
                AbstractC0224s a = abstractC0629y.mo3926a(abstractC0629y.mo3504cm());
                if (a != null) {
                    abstractC0629y.mo3309a(a, false);
                }
            }
        }
    }

    public void giveAllActionsToAllUnits() {
        Iterator it = AbstractC0244am.m4670bF().iterator();
        while (it.hasNext()) {
            AbstractC0244am abstractC0244am = (AbstractC0244am) it.next();
            if (abstractC0244am instanceof AbstractC0629y) {
                AbstractC0629y abstractC0629y = (AbstractC0629y) abstractC0244am;
                Iterator it2 = abstractC0629y.mo3310N().iterator();
                while (it2.hasNext()) {
                    abstractC0629y.mo3309a((AbstractC0224s) it2.next(), false);
                }
            }
        }
    }

    public void completeAllUnitsQueues() {
        Iterator it = AbstractC0244am.m4670bF().iterator();
        while (it.hasNext()) {
            AbstractC0244am abstractC0244am = (AbstractC0244am) it.next();
            if (abstractC0244am instanceof InterfaceC0506l) {
                ((InterfaceC0506l) abstractC0244am).mo3548dz();
            }
        }
    }

    public boolean moveAllUnitsOnTeam(int i, float f, float f2) {
        PlayerData playerData = PlayerData.getPlayerData(i);
        if (playerData == null) {
            this.root.logWarn("Could not find team:" + i);
            return false;
        }
        SyncPacket m2553b = GameEngine.getGameEngine().f6343cf.m2553b(playerData);
        Iterator it = AbstractC0244am.m4670bF().iterator();
        while (it.hasNext()) {
            AbstractC0244am abstractC0244am = (AbstractC0244am) it.next();
            if (abstractC0244am instanceof AbstractC0629y) {
                AbstractC0629y abstractC0629y = (AbstractC0629y) abstractC0244am;
                if (abstractC0629y.f1614bX == playerData) {
                    m2553b.m2461a(abstractC0629y);
                }
            }
        }
        m2553b.m2471a(f, f2);
        return true;
    }

    public void showMessage(String str) {
        GameEngine gameEngine = GameEngine.getGameEngine();
        if (str == null || str.trim().equals(VariableScope.nullOrMissingString)) {
            return;
        }
        gameEngine.netEngine.m1571m(str.replace("\\n", "\n"));
    }

    public String unicodeTest1() {
        return "start \u00a5123 \u061c end";
    }

    public void setZoom(float f) {
        GameEngine.getGameEngine().f6468cV = f;
    }

    public boolean isNetworkGameActive() {
        return GameEngine.getGameEngine().m1209N();
    }

    public int getLocalPlayerId() {
        return GameEngine.getGameEngine().netEngine.f5700z.site;
    }

    public int numberOfHumanPlayers() {
        return GameEngine.getGameEngine().netEngine.m1659an();
    }

    public int numberOfPlayersPlusAI() {
        return GameEngine.getGameEngine().netEngine.m1658ao();
    }

    public int numberOfPlayerConnections() {
        return GameEngine.getGameEngine().netEngine.m1746B();
    }

    public boolean enableFastSync() {
        GameEngine.getGameEngine().netEngine.f5794ai = 30;
        return true;
    }

    public boolean enableExtraNetworkDebug() {
        GameEngine.getGameEngine().netEngine.debug = true;
        return true;
    }

    public boolean throwIfAnyPlayerNotInSync() {
        GameEngine.getGameEngine().netEngine.m1556x();
        return true;
    }

    public boolean enableFastResyncTimer() {
        GameNetEngine.f5771c = true;
        return true;
    }

    public boolean enablePauseOnDesync() {
        GameEngine.getGameEngine().netEngine.f5724aj = true;
        return true;
    }

    public boolean networkSetIncomeMultiplier(float f) {
        GameEngine gameEngine = GameEngine.getGameEngine();
        GameMapData m1610e = gameEngine.netEngine.m1610e();
        m1610e.income = f;
        gameEngine.netEngine.m1706a(m1610e);
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
                GameEngine.m5925e("Closing: " + playerConnect.m1465g());
                ((ReliableSocket) playerConnect.socket).m5850d();
            }
        }
        gameEngine.netEngine.closeServer("debug");
        return true;
    }

    public boolean disableNetworkOwnInfo() {
        GameNetEngine.f5772r = false;
        return true;
    }

    public boolean networkPause() {
        GameEngine gameEngine = GameEngine.getGameEngine();
        gameEngine.netEngine.f5724aj = true;
        gameEngine.netEngine.f5725ak = true;
        return true;
    }

    public boolean plainTextDebugSave(boolean z) {
        GameEngine.getGameEngine();
        C1157y.f7178a = z;
        return true;
    }

    public boolean checkDesync(int i) {
        GameEngine gameEngine = GameEngine.getGameEngine();
        if (gameEngine.netEngine.f5728ap != 0) {
            throw new RuntimeException("numberOfDesyncErrors==" + gameEngine.netEngine.f5728ap);
        }
        if (gameEngine.netEngine.f5729aq < i) {
            throw new RuntimeException("game.network.numberOfDesyncPasses:" + gameEngine.netEngine.f5729aq + "<" + i);
        }
        this.root.logDebug("numberOfDesyncPasses:" + gameEngine.netEngine.f5729aq);
        return true;
    }

    public int getNumberOfDesyncErrors() {
        return GameEngine.getGameEngine().netEngine.f5728ap;
    }

    public int getNumberOfDesyncPasses() {
        return GameEngine.getGameEngine().netEngine.f5729aq;
    }

    public int getNumberOfResyncSendsOrRecv() {
        return GameEngine.getGameEngine().netEngine.f5730ar;
    }

    public boolean setMultiplayerMap(int i, String str) {
        GameMapData gameMapData = GameEngine.getGameEngine().netEngine.gameMapData;
        gameMapData.f5852a = MapType.values()[i];
        gameMapData.f5853b = str;
        return true;
    }

    public boolean setMultiplayerSave(String str) {
        GameMapData gameMapData = GameEngine.getGameEngine().netEngine.gameMapData;
        gameMapData.f5852a = MapType.f5869c;
        gameMapData.f5853b = str;
        return true;
    }

    public void generateNewClientId() {
        GameEngine.getGameEngine().netEngine.m1723Y();
    }

    public void disableFog() {
        GameEngine.getGameEngine();
    }

    public void overrideDeltaSpeed(float f) {
        GameEngine.getGameEngine().f6451bu = f;
    }

    public void setGameSetting(String str, String str2) {
        GameEngine.getGameEngine().settingsEngine.setValueDynamic(str, str2);
    }

    public void setNetworkaiDifficulty(int i) {
        GameEngine gameEngine = GameEngine.getGameEngine();
        GameMapData m1610e = gameEngine.netEngine.m1610e();
        m1610e.aidiff = i;
        gameEngine.netEngine.m1706a(m1610e);
    }

    public void setNetworkStartingUnits(int i) {
        GameEngine gameEngine = GameEngine.getGameEngine();
        GameMapData m1610e = gameEngine.netEngine.m1610e();
        m1610e.initUnit = i;
        gameEngine.netEngine.m1706a(m1610e);
    }

    public void startRandomUnitDesyncTest() {
        GameEngine gameEngine = GameEngine.getGameEngine();
        SyncPacket m2554b = gameEngine.f6343cf.m2554b();
        m2554b.f4923i = PlayerData.f1373i;
        m2554b.f4931r = true;
        m2554b.f4934u = 1;
        gameEngine.netEngine.m1708a(m2554b);
    }

    public void startRandomUnitStressTest() {
        GameEngine gameEngine = GameEngine.getGameEngine();
        SyncPacket m2554b = gameEngine.f6343cf.m2554b();
        m2554b.f4923i = PlayerData.f1373i;
        m2554b.f4931r = true;
        m2554b.f4934u = 2;
        gameEngine.netEngine.m1708a(m2554b);
    }

    public void runAllUnitTests() {
        this.root.logWarn("Running unit tests..");
        new C0085n().m5421a();
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
            boolean m448a = gameEngine.f6338ca.m448a(new GameInputStream(dataInputStream), false, false, false);
            dataInputStream.close();
            bufferedInputStream.close();
            fileInputStream.close();
            return m448a;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void checkTeamCaches() {
        Iterator it = PlayerData.m4844c().iterator();
        while (it.hasNext()) {
            PlayerData playerData = (PlayerData) it.next();
            if (playerData.m4794t()) {
                throw new RuntimeException("Team cache difference on team:" + playerData.site);
            }
        }
    }

    public void setPathSpeedConf(boolean z) {
        this.forceNonThreaded = z;
    }

    public float getPathSpeed(int i, float f, float f2, float f3, float f4) {
        GameEngine gameEngine = GameEngine.getGameEngine();
        C0173b c0173b = gameEngine.f6323bL;
        ArrayList arrayList = new ArrayList();
        c0173b.m5127a(f3, f4);
        int i2 = c0173b.f802T;
        int i3 = c0173b.f803U;
        long m2574a = C0742br.m2574a();
        C0935d.f6133a = 0;
        C0935d.f6134b = 0;
        C0935d.f6135c = 0;
        C0935d.f6136d = 0;
        C0935d.f6137e = 0;
        C0935d.f6138f = 0;
        C0935d.f6139g = 0;
        C0935d.f6140h = 0.0d;
        C0935d.f6141i = 0.0d;
        C0944m.f6253c = 0;
        C0935d.f6153u = 0;
        for (int i4 = 0; i4 < i; i4++) {
            C0942k m1282a = gameEngine.f6332bU.m1282a(false);
            c0173b.m5127a(f, f2);
            m1282a.m1308a(EnumC0246ao.f1709b, (short) c0173b.f802T, (short) c0173b.f803U, null, false);
            c0173b.m5127a(f3, f4);
            m1282a.m1303a((short) c0173b.f802T, (short) c0173b.f803U, (short) 0);
            m1282a.f6200p = true;
            m1282a.f6201q = 0;
            m1282a.f6202r = false;
            gameEngine.f6332bU.m1284a(m1282a, false, this.forceNonThreaded);
            arrayList.add(m1282a);
        }
        if (!this.forceNonThreaded) {
            return -1.0f;
        }
        float m2572a = C0742br.m2572a(m2574a);
        int i5 = -1;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            LinkedList mo1346a = ((C0942k) it.next()).mo1346a();
            int i6 = 0;
            Iterator it2 = mo1346a.iterator();
            while (it2.hasNext()) {
                C0947p c0947p = (C0947p) it2.next();
                i6++;
            }
            if (i5 != -1 && i5 != i6) {
                GameEngine.print("pathDistance inconsistency detected:" + i5 + "!=" + i6);
            }
            C0947p c0947p2 = (C0947p) mo1346a.getLast();
            if (c0947p2.f6289a != i2 || c0947p2.f6290b != i3) {
                GameEngine.print("path did not react goal, got to:" + ((int) c0947p2.f6289a) + "," + ((int) c0947p2.f6290b) + " (vs " + i2 + ", " + i3 + ")");
            }
            i5 = i6;
        }
        GameEngine.print("hotBufferWatermark:" + C0935d.f6133a + ", nodesAdded:" + C0935d.f6136d + ", mainQueueWatermark:" + C0935d.f6134b + ", backlogWatermark:" + C0935d.f6135c + ", scannedA:" + C0935d.f6137e + ", scannedB:" + C0935d.f6138f + ", scannedC:" + C0935d.f6139g + ", time:" + C0742br.m2573a(C0935d.f6141i) + "/" + C0742br.m2573a(C0935d.f6140h) + ", dirtyPeak:" + C0935d.f6153u + ", dis:" + i5);
        if (C0944m.f6253c != 0) {
            GameEngine.print("newNodesCreated:" + C0944m.f6253c);
        }
        return m2572a;
    }

    public void muteSounds() {
        GameEngine gameEngine = GameEngine.getGameEngine();
        gameEngine.f6324bM.f4068b = true;
        gameEngine.f6325bN.m2887f();
    }

    public void pong() {
    }
}