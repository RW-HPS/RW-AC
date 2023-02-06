package com.corrodinggames.rts.game;

import android.graphics.Color;
import android.graphics.Paint;
import com.corrodinggames.rts.game.units.am;
import com.corrodinggames.rts.game.units.as;
import com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope;
import com.corrodinggames.rts.game.units.y;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.SyncPacket;
import com.corrodinggames.rts.gameFramework.Unit;
import com.corrodinggames.rts.gameFramework.bq;
import com.corrodinggames.rts.gameFramework.bs;
import com.corrodinggames.rts.gameFramework.net.GameInputStream;
import com.corrodinggames.rts.gameFramework.net.GameNetEngine;
import com.corrodinggames.rts.gameFramework.net.GameOutputStream;
import com.corrodinggames.rts.gameFramework.unitAction.aa;
import com.corrodinggames.rts.gameFramework.unitAction.ag;
import com.corrodinggames.rts.gameFramework.utility.SlickToAndroidKeycodes;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/* renamed from: com.corrodinggames.rts.game.n */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/n.class */
public abstract class PlayerData extends bq implements Comparable {

    /* renamed from: k */
    public int site;
    public final String l = "Note to modifiers: Changing credits will not allow you to cheat in multiplayer games, but it will only break sync";
    public boolean m;
    public boolean n;

    /* renamed from: o */
    public double credits;
    public double p;
    public int q;

    /* renamed from: r */
    public int team;
    public y s;
    public y t;
    public boolean u;

    /* renamed from: v */
    public String name;
    public boolean w;
    public int x;
    public boolean y;

    /* renamed from: z */
    public Integer aiDifficulty;

    /* renamed from: A */
    public Integer startUnit;
    public Integer B;

    /* renamed from: C */
    public Integer color;

    /* renamed from: D */
    public int gameColor;
    private boolean at;

    /* renamed from: au */
    private int serverHostFlag;
    public boolean E;
    private int av;
    public boolean F;
    public boolean G;
    public boolean H;

    /* renamed from: I */
    public boolean sharedControl_1;

    /* renamed from: J */
    public boolean sharedControl_2;
    public final Object K;
    public int L;
    public int M;
    public byte[][] N;

    /* renamed from: O */
    public String connectHexID;
    public String P;
    public int Q;
    public int R;
    public boolean S;
    public s T;
    public boolean U;
    public byte V;

    /* renamed from: W */
    public int ping;

    /* renamed from: X */
    public long lastReciveTime;
    public long Y;
    public int Z;
    public boolean aa;
    public boolean ab;
    public int ac;
    int ad;
    public Paint ae;
    public Paint af;
    int ai;
    com.corrodinggames.rts.game.units.custom.h ak;
    com.corrodinggames.rts.game.units.custom.e.f al;
    public com.corrodinggames.rts.game.units.custom.e.c am;
    public float an;
    long aq;
    double ar;
    static com.corrodinggames.rts.gameFramework.utility.m a = new com.corrodinggames.rts.gameFramework.utility.m();
    static PlayerData[] b = new PlayerData[0];
    public static int c = 10;
    public static int d = 0;
    public static int e = 100;
    public static int f = c + d;
    public static final PlayerData g = new Player(-1, false, "<blank>");
    public static final PlayerData h = new d(-2);
    public static final PlayerData i = new d(-1);

    /* renamed from: as */
    private static PlayerData[] playerArray = new PlayerData[f];
    public static PlayerData j = new u(-99);
    static int[] ag = new int[10];
    static String[] ah = new String[10];
    static int aj = -99;
    public static float ao = 40.0f;
    public static float ap = 10.0f;

    @Override // java.lang.Comparable
    /* renamed from: a */
    public int compareTo(PlayerData playerData) {
        int i2 = this.ac - playerData.ac;
        if (i2 != 0) {
            return i2;
        }
        int i3 = this.site - playerData.site;
        if (i3 != 0) {
            return i3;
        }
        if (this.name != null && playerData.name != null) {
            return this.name.compareTo(playerData.name);
        }
        return 0;
    }

    public void b(GameOutputStream gameOutputStream) {
        gameOutputStream.writeByte(this.site);
        gameOutputStream.writeInt((int) this.credits);
        gameOutputStream.writeInt(this.team);
        gameOutputStream.writeIsString(this.name);
        gameOutputStream.writeBoolean(this.U);
        if (gameOutputStream.getPacketVersion() > 26) {
            gameOutputStream.writeInt(getPing());
            gameOutputStream.d("lastPingTimeReceivedAt");
            gameOutputStream.writeLong(this.lastReciveTime);
        }
        if (gameOutputStream.getPacketVersion() >= 55) {
            gameOutputStream.writeBoolean(this.w);
            gameOutputStream.writeInt(this.x);
        }
        if (gameOutputStream.getPacketVersion() >= 91) {
            gameOutputStream.writeInt(this.ac);
            gameOutputStream.writeByte(0);
        }
        if (gameOutputStream.getPacketVersion() >= 97) {
            gameOutputStream.writeBoolean(this.sharedControl_1);
            gameOutputStream.writeBoolean(this.sharedControl_2);
        }
        if (gameOutputStream.getPacketVersion() >= 125) {
            gameOutputStream.writeBoolean(this.E);
            gameOutputStream.writeBoolean(this.at);
            gameOutputStream.writeInt(this.serverHostFlag);
        }
        if (gameOutputStream.getPacketVersion() >= 149) {
            gameOutputStream.writeIsString(this.P);
            gameOutputStream.writeInt(this.Q);
        }
        if (gameOutputStream.getPacketVersion() >= 156) {
            gameOutputStream.writeIsInt(this.aiDifficulty);
            gameOutputStream.writeIsInt(this.startUnit);
            gameOutputStream.writeIsInt(this.B);
            gameOutputStream.writeIsInt(this.color);
            gameOutputStream.writeInt(this.gameColor);
        }
    }

    public void c(GameOutputStream gameOutputStream) {
        gameOutputStream.writeByte(0);
        gameOutputStream.writeInt(getPing());
        gameOutputStream.writeBoolean(this.sharedControl_1);
        gameOutputStream.writeBoolean(this.sharedControl_2);
    }

    public void a(GameInputStream gameInputStream) {
        gameInputStream.readByte();
        this.ping = gameInputStream.readInt();
        this.lastReciveTime = System.currentTimeMillis();
        this.sharedControl_1 = gameInputStream.readBoolean();
        this.sharedControl_2 = gameInputStream.readBoolean();
    }

    public void b(GameInputStream gameInputStream) {
        a(gameInputStream, false);
    }

    public void a(GameInputStream gameInputStream, boolean z) {
        if (!z) {
            f((int) gameInputStream.readByte());
            this.credits = gameInputStream.readInt();
            this.p = 0.0d;
            this.q = 0;
            this.team = gameInputStream.readInt();
            this.name = gameInputStream.isReadString();
            this.U = gameInputStream.readBoolean();
        } else {
            gameInputStream.readByte();
            gameInputStream.readInt();
            gameInputStream.readInt();
            gameInputStream.isReadString();
            gameInputStream.readBoolean();
        }
        if (gameInputStream.b() >= 14) {
            this.ping = gameInputStream.readInt();
            gameInputStream.readLong();
            this.lastReciveTime = System.currentTimeMillis();
        }
        if (gameInputStream.b() >= 34 && gameInputStream.getCacheInt() >= 55) {
            boolean readBoolean = gameInputStream.readBoolean();
            int readInt = gameInputStream.readInt();
            if (!z) {
                this.w = readBoolean;
                this.x = readInt;
            }
        } else if (GameEngine.getGameEngine().netEngine.B) {
            GameNetEngine.g("AI was skipping in networked game, steam version:" + gameInputStream.getCacheInt());
        }
        if (gameInputStream.b() >= 50 && gameInputStream.getCacheInt() >= 91) {
            this.ac = gameInputStream.readInt();
            gameInputStream.readByte();
        }
        if (gameInputStream.b() >= 52 && gameInputStream.getCacheInt() >= 97) {
            this.sharedControl_1 = gameInputStream.readBoolean();
            this.sharedControl_2 = gameInputStream.readBoolean();
        }
        if (gameInputStream.b() >= 70 && gameInputStream.getCacheInt() >= 125) {
            boolean readBoolean2 = gameInputStream.readBoolean();
            boolean readBoolean3 = gameInputStream.readBoolean();
            int readInt2 = gameInputStream.readInt();
            if (!z) {
                this.E = readBoolean2;
                this.at = readBoolean3;
                this.serverHostFlag = readInt2;
            }
        }
        if (gameInputStream.b() >= 90 && gameInputStream.getCacheInt() >= 149) {
            String isReadString = gameInputStream.isReadString();
            int readInt3 = gameInputStream.readInt();
            if (!z) {
                this.P = isReadString;
                this.Q = readInt3;
            }
        }
        if (gameInputStream.b() >= 93 && gameInputStream.getCacheInt() >= 156) {
            Integer isReadInt = gameInputStream.isReadInt();
            Integer isReadInt2 = gameInputStream.isReadInt();
            Integer isReadInt3 = gameInputStream.isReadInt();
            Integer isReadInt4 = gameInputStream.isReadInt();
            int readInt4 = gameInputStream.readInt();
            if (!z) {
                if (this.aiDifficulty != isReadInt) {
                    c("readIn aiDifficultyOverride was:" + this.aiDifficulty + " now:  " + isReadInt);
                }
                this.aiDifficulty = isReadInt;
                this.startUnit = isReadInt2;
                this.B = isReadInt3;
                this.color = isReadInt4;
                this.gameColor = readInt4;
            }
        }
    }

    @Override // com.corrodinggames.rts.gameFramework.bq
    public void a(GameOutputStream gameOutputStream) {
        gameOutputStream.d("Writing team: " + this.name);
        b(gameOutputStream);
        if (gameOutputStream.getPacketVersion() >= 44) {
            gameOutputStream.writeByte(4);
            gameOutputStream.writeBoolean(this.G);
            gameOutputStream.writeBoolean(this.F);
            gameOutputStream.writeBoolean(true);
            if (1 != 0) {
                d(gameOutputStream);
            }
            this.al.a(gameOutputStream);
            com.corrodinggames.rts.game.units.custom.g.a(this.ak, gameOutputStream);
            gameOutputStream.writeBoolean(this.y);
        }
    }

    public void c(GameInputStream gameInputStream) {
        b(gameInputStream);
        if (gameInputStream.b() >= 26) {
            byte readByte = gameInputStream.readByte();
            this.G = gameInputStream.readBoolean();
            if (readByte >= 1) {
                this.F = gameInputStream.readBoolean();
            }
            if (gameInputStream.readBoolean()) {
                d(gameInputStream);
            }
            if (readByte >= 2) {
                this.al.a(gameInputStream);
            }
            if (readByte >= 3) {
                a(com.corrodinggames.rts.game.units.custom.g.a(gameInputStream));
            }
            if (readByte >= 4) {
                this.y = gameInputStream.readBoolean();
            }
        }
    }

    public void d(GameOutputStream gameOutputStream) {
        GameEngine.getGameEngine();
        gameOutputStream.d("-- Saving fog --");
        gameOutputStream.writeBoolean(this.N != null);
        if (this.N != null) {
            gameOutputStream.writeInt(this.L);
            gameOutputStream.writeInt(this.M);
            for (int i2 = 0; i2 < this.L; i2++) {
                for (int i3 = 0; i3 < this.M; i3++) {
                    gameOutputStream.writeByte(this.N[i2][i3]);
                }
            }
        }
        gameOutputStream.d("--End fog--");
    }

    public void d(GameInputStream gameInputStream) {
        GameEngine gameEngine = GameEngine.getGameEngine();
        if (gameInputStream.readBoolean()) {
            this.L = gameInputStream.readInt();
            this.M = gameInputStream.readInt();
            int i2 = this.L;
            int i3 = this.M;
            if (gameEngine.bL != null) {
                i2 = gameEngine.bL.width;
                i3 = gameEngine.bL.height;
                if (this.L != i2 || this.M != i3) {
                    GameEngine.print("Map size does not match fog size: " + this.L + "!=" + i2 + "|" + this.M + "!=" + i3);
                }
            }
            if (1 != 0) {
                this.N = new byte[i2][i3];
            } else {
                this.N = null;
            }
            for (int i4 = 0; i4 < this.L; i4++) {
                for (int i5 = 0; i5 < this.M; i5++) {
                    if (1 != 0) {
                        this.N[i4][i5] = gameInputStream.readByte();
                    } else {
                        gameInputStream.readByte();
                    }
                }
            }
            return;
        }
        this.N = null;
    }

    public void a() {
        if (this.N != null) {
            for (int i2 = 0; i2 < this.L; i2++) {
                for (int i3 = 0; i3 < this.M; i3++) {
                    this.N[i2][i3] = 0;
                }
            }
        }
        GameEngine gameEngine = GameEngine.getGameEngine();
        if (gameEngine.playerTeam == this) {
            gameEngine.bW.O = true;
            if (gameEngine.bL != null) {
                gameEngine.bL.k();
                gameEngine.bL.g();
            }
        }
    }

    public boolean b() {
        return this.team == -3;
    }

    public static ArrayList a(boolean z) {
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < f; i2++) {
            PlayerData playerData = playerArray[i2];
            if (playerData != null && (z || playerData.b())) {
                arrayList.add(playerData);
            }
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    public static ArrayList c() {
        return b(false);
    }

    public static ArrayList b(boolean z) {
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < f; i2++) {
            PlayerData playerData = playerArray[i2];
            if (playerData != null && (z || !playerData.b())) {
                arrayList.add(playerData);
            }
        }
        return arrayList;
    }

    public static PlayerData[] d() {
        return b;
    }

    public static void e() {
        com.corrodinggames.rts.gameFramework.utility.m mVar = a;
        mVar.clear();
        mVar.add(i);
        mVar.add(h);
        for (int i2 = 0; i2 < c; i2++) {
            PlayerData playerData = playerArray[i2];
            if (playerData != null) {
                mVar.add(playerData);
            }
        }
        if (b.length != mVar.a) {
            b = new PlayerData[mVar.a];
        }
        int i3 = mVar.a;
        Object[] a2 = mVar.a();
        for (int i4 = 0; i4 < i3; i4++) {
            b[i4] = (PlayerData) a2[i4];
        }
    }

    public static ArrayList f() {
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < c; i2++) {
            PlayerData playerData = playerArray[i2];
            if (playerData != null && !playerData.b() && !arrayList.contains(Integer.valueOf(playerData.team))) {
                arrayList.add(Integer.valueOf(playerData.team));
            }
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    public static int a(int i2, boolean z) {
        int i3 = 0;
        for (int i4 = 0; i4 < c; i4++) {
            PlayerData playerData = playerArray[i4];
            if (playerData != null && playerData.team == i2 && !playerData.b() && (!z || !playerData.w)) {
                i3++;
            }
        }
        return i3;
    }

    public static int g() {
        int i2 = 0;
        for (int i3 = 0; i3 < c; i3++) {
            PlayerData playerData = playerArray[i3];
            if (playerData != null && !playerData.b() && !playerData.F && !playerData.G) {
                i2++;
            }
        }
        return i2;
    }

    public static void b(int i2, boolean z) {
        if (i2 < 10 || i2 == c) {
            return;
        }
        if (i2 > e) {
            throw new IOException("setMaxTeamId: " + i2 + " is over limit of:" + e);
        }
        if (!z && i2 <= c) {
            return;
        }
        int i3 = i2 + d;
        PlayerData[] playerDataArr = new PlayerData[i3];
        for (int i4 = 0; i4 < playerArray.length; i4++) {
            PlayerData playerData = playerArray[i4];
            if (i4 < playerDataArr.length) {
                playerDataArr[i4] = playerData;
            }
        }
        playerArray = playerDataArr;
        c = i2;
        f = i3;
    }

    /* renamed from: a */
    public static String getTeamName(int team) {
        return team == 0 ? "A" : team == 1 ? "B" : team == 2 ? "C" : team == 3 ? "D" : team == 4 ? "E" : team == 5 ? "F" : team == 6 ? "G" : team == 7 ? "H" : team == 8 ? "I" : team == 9 ? "J" : team == 10 ? "K" : team == -3 ? "S" : VariableScope.nullOrMissingString + team;
    }

    /* renamed from: h */
    public String getPlayerTeamName() {
        return getTeamName(this.team);
    }

    public void i() {
        this.E = false;
        this.at = false;
        this.serverHostFlag = -9999;
    }

    public boolean j() {
        return this.E;
    }

    public boolean k() {
        return this.serverHostFlag >= 0;
    }

    public void l() {
        this.serverHostFlag = GameEngine.getGameEngine().by;
    }

    public boolean m() {
        GameEngine gameEngine = GameEngine.getGameEngine();
        if (((this.F || this.G) && !gameEngine.netEngine.gameMapData.sharedControl) || this.w || isTimeOut()) {
            return false;
        }
        if (this.ab && !k()) {
            return false;
        }
        return true;
    }

    public static int b(int i2) {
        int i3 = 0;
        for (int i4 = 0; i4 < c; i4++) {
            PlayerData playerData = playerArray[i4];
            if (playerData != null && playerData.team == i2 && playerData.k() && playerData.m()) {
                i3++;
            }
        }
        return i3;
    }

    public static int c(int i2) {
        int i3 = 0;
        for (int i4 = 0; i4 < c; i4++) {
            PlayerData playerData = playerArray[i4];
            if (playerData != null && playerData.team == i2 && playerData.m()) {
                i3++;
            }
        }
        return i3;
    }

    public static void n() {
        for (int i2 = 0; i2 < c; i2++) {
            PlayerData playerData = playerArray[i2];
            if (playerData != null) {
                playerData.Z();
            }
        }
        Y();
    }

    public static void o() {
        for (int i2 = 0; i2 < c; i2++) {
            PlayerData playerData = playerArray[i2];
            if (playerData != null) {
                playerData.serverHostFlag = -9999;
            }
        }
    }

    public static void d(int i2) {
        GameEngine gameEngine = GameEngine.getGameEngine();
        if (!gameEngine.netEngine.isServer || gameEngine.replayEngine.j()) {
            return;
        }
        for (int i3 = 0; i3 < c; i3++) {
            PlayerData playerData = playerArray[i3];
            if (playerData != null && playerData.team == i2 && !playerData.at) {
                playerData.at = true;
                SyncPacket b2 = gameEngine.cf.b();
                b2.i = playerData;
                b2.r = true;
                b2.u = 100;
                gameEngine.netEngine.a(b2);
            }
        }
    }

    public static void e(int i2) {
        PlayerData[] playerDataArr;
        int i3 = -9999;
        for (int i4 = 0; i4 < c; i4++) {
            PlayerData playerData = playerArray[i4];
            if (playerData != null && playerData.team == i2 && playerData.k() && playerData.m() && playerData.serverHostFlag > i3) {
                i3 = playerData.serverHostFlag;
            }
        }
        if (i3 >= 0 && com.corrodinggames.rts.gameFramework.utility.y.a(i3, 120000)) {
            for (PlayerData playerData2 : playerArray) {
                if (playerData2 != null && playerData2.team == i2) {
                    playerData2.serverHostFlag = -9999;
                }
            }
        }
    }

    public boolean b(PlayerData playerData) {
        if (p() && playerData != null && d(playerData)) {
            return true;
        }
        return false;
    }

    public boolean p() {
        if (this.sharedControl_1 || this.sharedControl_2) {
            return true;
        }
        return false;
    }

    public boolean q() {
        if (GameEngine.getGameEngine().playerTeam == this) {
            return true;
        }
        return false;
    }

    public void c(boolean z) {
        if (z) {
            this.Q = 1;
        } else {
            this.Q = 0;
        }
    }

    public boolean r() {
        return this.Q == 1;
    }

    public final int a(boolean z, boolean z2) {
        s sVar = this.T;
        int i2 = sVar.c;
        if (z) {
            i2 += sVar.f;
        }
        if (z2) {
            i2 += sVar.e;
        }
        return i2;
    }

    public final int s() {
        return this.T.c + this.T.f + this.T.e;
    }

    public final int a(com.corrodinggames.rts.game.units.custom.g gVar, boolean z, boolean z2) {
        s sVar = this.T;
        if (sVar.d == 0) {
            return 0;
        }
        p pVar = null;
        t tVar = sVar.p;
        p[] pVarArr = tVar.b;
        int i2 = 0;
        int i3 = tVar.c;
        while (true) {
            if (i2 >= i3) {
                break;
            }
            p pVar2 = pVarArr[i2];
            if (pVar2.a != gVar) {
                i2++;
            } else {
                pVar = pVar2;
                break;
            }
        }
        if (pVar == null) {
            pVar = sVar.a(gVar);
            if (pVar.e > 50) {
                tVar.a(pVar);
            }
            pVar.e = (short) (pVar.e + 1);
        }
        int i4 = pVar.b;
        if (z) {
            i4 += pVar.c;
        }
        if (z2) {
            i4 += pVar.d;
        }
        return i4;
    }

    public boolean t() {
        boolean z = false;
        s e2 = e(false);
        if (this.T.b != e2.b) {
            GameEngine.print("unitCountExcludingBuildingsIncludingQueued: " + this.T.b + "!=" + e2.b + " (team:" + this.site + " fails: " + this.ad + ")");
            this.ad++;
            z = true;
        }
        if (this.T.a != e2.a) {
            GameEngine.print("unitsMax: " + this.T.a + "!=" + e2.a + " (team:" + this.site + " fails: " + this.ad + ")");
            this.ad++;
            z = true;
        }
        if (this.T.g != e2.g) {
            GameEngine.print("incomeRate: " + this.T.g + "!=" + e2.g + " (team:" + this.site + " fails: " + this.ad + ")");
            this.ad++;
            z = true;
        }
        if (this.T.f != e2.f) {
            GameEngine.print("incompleteUnitCountOfAllTypes: " + this.T.f + "!=" + e2.f + " (team:" + this.site + " fails: " + this.ad + ")");
            this.ad++;
            z = true;
        }
        if (this.T.e != e2.e) {
            GameEngine.print("queuedCountOfAllTypes: " + this.T.e + "!=" + e2.e + " (team:" + this.site + " fails: " + this.ad + ")");
            this.ad++;
            z = true;
        }
        if (this.T.c != e2.c) {
            GameEngine.print("unitCountOfAllTypesOnlyCompleted: " + this.T.c + "!=" + e2.c + " (team:" + this.site + " fails: " + this.ad + ")");
            this.ad++;
            z = true;
        }
        if (!this.T.h.e(e2.h)) {
            GameEngine.print("customIncomeRate: " + this.T.h + "!=" + e2.h + " (team:" + this.site + " fails: " + this.ad + ")");
            GameEngine.print("currentCaches:" + this.T.h.a(false, true, 30, true, true));
            GameEngine.print("targetUnitCache:" + e2.h.a(false, true, 30, true, true));
            this.ad++;
            z = true;
        }
        if (!this.T.l.e(e2.l)) {
            GameEngine.print("streamingRateNegative (team:" + this.site + " fails: " + this.ad + ")");
            GameEngine.print("currentCaches:" + this.T.l.a(false, true, 30, true, true));
            GameEngine.print("targetUnitCache:" + e2.l.a(false, true, 30, true, true));
            this.ad++;
            z = true;
        }
        if (!this.T.k.e(e2.k)) {
            GameEngine.print("streamingRatePositive (team:" + this.site + " fails: " + this.ad + ")");
            GameEngine.print("currentCaches:" + this.T.k.a(false, true, 30, true, true));
            GameEngine.print("targetUnitCache:" + e2.k.a(false, true, 30, true, true));
            this.ad++;
            z = true;
        }
        if (z) {
        }
        return z;
    }

    private s e(boolean z) {
        GameEngine gameEngine = GameEngine.getGameEngine();
        s sVar = new s();
        sVar.a = gameEngine.bB;
        am[] a2 = am.bE.a();
        int size = am.bE.size();
        for (int i2 = 0; i2 < size; i2++) {
            am amVar = a2[i2];
            if (amVar.bX == this) {
                sVar.a(amVar);
                if (z) {
                    amVar.bY = true;
                }
            }
        }
        if (sVar.a > gameEngine.bC) {
            sVar.a = gameEngine.bC;
        }
        return sVar;
    }

    public void d(boolean z) {
        if (!z && !this.S) {
            return;
        }
        this.T = e(true);
        this.S = false;
        if (this.R < this.T.b) {
            this.R = this.T.b;
        }
        if (!this.n && this.T.m) {
            this.n = true;
        }
        if (!this.m && s() > 0) {
            this.m = true;
        }
        T();
    }

    public int u() {
        return (int) (this.T.g * D());
    }

    public int v() {
        return (int) ((u() * E()) + 0.5f);
    }

    public int a(com.corrodinggames.rts.game.units.custom.e.a aVar) {
        return 0 - ((int) this.T.l.a(aVar));
    }

    public int b(com.corrodinggames.rts.game.units.custom.e.a aVar) {
        int a2;
        if (aVar == com.corrodinggames.rts.game.units.custom.e.a.D) {
            a2 = this.T.g;
        } else {
            a2 = (int) this.T.h.a(aVar);
        }
        int a3 = a2 + ((int) this.T.k.a(aVar));
        GameEngine.getGameEngine();
        boolean z = false;
        if (aVar == com.corrodinggames.rts.game.units.custom.e.a.D) {
            z = true;
        }
        if (z) {
            a3 = (int) (a3 * D());
        }
        return a3;
    }

    public int w() {
        return this.T.b;
    }

    public int x() {
        return this.T.a;
    }

    public String y() {
        int ping = getPing();
        if (ping == -99) {
            return VariableScope.nullOrMissingString;
        }
        if (this.w) {
            return VariableScope.nullOrMissingString;
        }
        if (ping == -2 || ping == -1) {
            return "(disconnected)";
        }
        return "(" + ping + ")";
    }

    /* renamed from: z */
    public String getStatus() {
        int ping = getPing();
        if (ping == -99) {
            return "HOST";
        }
        if (this.w) {
            return "-";
        }
        if (ping == -1) {
            return "N/A";
        }
        if (ping == -2) {
            return "-";
        }
        if (r()) {
            return ping + " (HOST)";
        }
        return VariableScope.nullOrMissingString + ping;
    }

    /* renamed from: A */
    public int getPing() {
        if (this.lastReciveTime == -1) {
            return -2;
        }
        if (this.lastReciveTime < System.currentTimeMillis() - 5000) {
            return -1;
        }
        return this.ping;
    }

    /* renamed from: B */
    public boolean isTimeOut() {
        if (this.lastReciveTime != -99 && this.lastReciveTime != -1 && this.lastReciveTime < System.currentTimeMillis() - 15000) {
            return true;
        }
        return false;
    }

    public void a(float f2) {
        this.an += f2;
        if (this.an > 90.0f) {
            this.an = 0.0f;
            this.am.a();
        }
        this.q++;
        if (this.q > 1000 && this.p != 0.0d) {
            GameEngine.m5e("Warning: anti-lag credits is still: " + this.p + " (force clearing)");
            this.p = 0.0d;
        }
    }

    public final int C() {
        if (this.y) {
            return this.x;
        }
        GameEngine gameEngine = GameEngine.getGameEngine();
        if ((gameEngine.netEngine.B || gameEngine.replayEngine.i()) && !gameEngine.netEngine.F) {
            if (this.aiDifficulty != null && this.aiDifficulty.intValue() != this.x) {
                c("aiDifficultyOverride:  " + this.aiDifficulty + "!=" + this.x);
            }
            return this.x;
        } else if (this.aiDifficulty != null) {
            return this.aiDifficulty.intValue();
        } else {
            return GameEngine.getGameEngine().settingsEngine.aiDifficulty;
        }
    }

    public final float D() {
        GameEngine gameEngine = GameEngine.getGameEngine();
        if (gameEngine.O()) {
            return gameEngine.netEngine.gameMapData.income;
        }
        return 1.0f;
    }

    public final float E() {
        float f2;
        if (!this.w) {
            return 1.0f;
        }
        int C = C();
        if (C > 0) {
            f2 = 1.0f + (C * 0.4f);
        } else {
            f2 = 1.0f + (C * 0.3f);
        }
        if (C == 3) {
            f2 += 1.5f;
        }
        if (f2 < 0.1f) {
            f2 = 0.1f;
        }
        return f2;
    }

    public final void b(float f2) {
        if (!this.w) {
            c(f2);
        } else {
            c(E() * f2);
        }
    }

    public final void c(float f2) {
        d(f2 * D());
    }

    public final void d(float f2) {
        this.credits += f2;
        if (this.credits > 9.99999999E8d) {
            this.credits = 9.99999999E8d;
        }
    }

    public static void F() {
        try {
            b(10, true);
            for (int i2 = 0; i2 < playerArray.length; i2++) {
                playerArray[i2] = null;
            }
        } catch (IOException e2) {
            throw new RuntimeException(e2);
        }
    }

    public static Player a(String str) {
        if (str == null || str.equals(VariableScope.nullOrMissingString)) {
            GameEngine.print("findExistingPlayer: No clientId id");
            return null;
        }
        for (int i2 = 0; i2 < playerArray.length; i2++) {
            PlayerData playerData = playerArray[i2];
            if (playerData != null && str.equals(playerData.connectHexID)) {
                if (playerData instanceof Player) {
                    return (Player) playerData;
                }
                GameEngine.print("Player:" + i2 + " with matching clientId is not an instanceof player");
            }
        }
        return null;
    }

    public static Player b(String str) {
        if (str == null || str.equals(VariableScope.nullOrMissingString)) {
            GameEngine.print("No id");
            return null;
        }
        for (int i2 = 0; i2 < playerArray.length; i2++) {
            PlayerData playerData = playerArray[i2];
            if (playerData != null && str.equals(playerData.P)) {
                if (playerData instanceof Player) {
                    return (Player) playerData;
                }
                GameEngine.print("Player:" + i2 + " with matching clientId is not an instanceof player");
            }
        }
        return null;
    }

    /* renamed from: G */
    public static int getNullSite() {
        for (int i2 = 0; i2 < c; i2++) {
            if (playerArray[i2] == null) {
                return i2;
            }
        }
        return -1;
    }

    /* renamed from: H  reason: collision with other method in class */
    public static int m0H() {
        for (int i2 = c; i2 < f; i2++) {
            if (playerArray[i2] == null) {
                return i2;
            }
        }
        for (int i3 = c - 1; i3 >= 0; i3--) {
            if (playerArray[i3] == null) {
                return i3;
            }
        }
        return -1;
    }

    public void I() {
        for (int i2 = 0; i2 < playerArray.length; i2++) {
            if (playerArray[i2] == this) {
                playerArray[i2] = null;
            }
        }
    }

    public PlayerData() {
        this.site = -1;
        this.l = "Note to modifiers: Changing credits will not allow you to cheat in multiplayer games, but it will only break sync";
        this.credits = 4000.0d;
        this.p = 0.0d;
        this.q = 0;
        this.s = com.corrodinggames.rts.game.units.t.a(this);
        this.t = com.corrodinggames.rts.game.units.t.a(this);
        this.u = false;
        this.gameColor = -1;
        this.serverHostFlag = -9999;
        this.av = -9999;
        this.K = new Object();
        this.S = true;
        this.T = new s();
        this.ping = -1;
        this.lastReciveTime = -1L;
        this.Y = -1L;
        this.Z = -1;
        this.ac = 0;
        this.ae = new ag();
        this.af = new ag();
        this.ai = -2;
        this.ak = com.corrodinggames.rts.game.units.custom.g.d;
        this.al = new com.corrodinggames.rts.game.units.custom.e.f();
        this.am = new com.corrodinggames.rts.game.units.custom.e.c();
        this.aq = -9999L;
        this.w = this instanceof com.corrodinggames.rts.game.a.a;
    }

    public PlayerData(int i2) {
        this(i2, true);
    }

    public PlayerData(int i2, boolean z) {
        this();
        c(i2, z);
    }

    public void f(int i2) {
        c(i2, true);
    }

    public void c(int i2, boolean z) {
        if (this.site != i2) {
            if (z) {
                I();
            }
            this.site = i2;
            this.team = i2;
            if (z && i2 != -3) {
                PlayerData playerData = playerArray[i2];
                if (playerData != null) {
                    playerData.c("Being replaced");
                }
                playerArray[i2] = this;
            }
            J();
        }
    }

    public void J() {
        int K = K();
        this.ae.b(K);
        this.af.b(Color.a(Color.a(K), (int) (Color.b(K) * 0.5f), (int) (Color.c(K) * 0.5f), (int) (Color.d(K) * 0.5f)));
    }

    public boolean a(double d2) {
        if (this.credits >= d2 || d2 == 0.0d) {
            return true;
        }
        return false;
    }

    public boolean g(int i2) {
        if (this.credits + this.p >= i2 || i2 == 0) {
            return true;
        }
        return false;
    }

    public final boolean c(PlayerData playerData) {
        return (playerData == i || this == i || this.team == playerData.team) ? false : true;
    }

    public final boolean d(PlayerData playerData) {
        if (playerData == i && this == i) {
            return true;
        }
        return (playerData == i || this == i || this.team != playerData.team) ? false : true;
    }

    public int K() {
        return i(R());
    }

    public static void L() {
        GameEngine gameEngine = GameEngine.getGameEngine();
        try {
            d(gameEngine.settingsEngine.teamColors);
        } catch (IllegalArgumentException e2) {
            GameEngine.a("initColors: Failed to read setting: '" + gameEngine.settingsEngine.teamColors + "': " + e2.getMessage(), (Throwable) e2);
            d("#00ff00,#d02013,#0463f3,#ffff40,#00ffff,#d0f8f7,#000000,#ff00ea,#ff7f18,#9368c4");
        }
        try {
            e(gameEngine.settingsEngine.teamColorsNames);
        } catch (IllegalArgumentException e3) {
            GameEngine.a("initColors: Failed to read setting: '" + gameEngine.settingsEngine.teamColorsNames + "': " + e3.getMessage(), (Throwable) e3);
            e("GREEN,RED,BLUE,YELLOW,CYAN,WHITE,BLACK,PINK,ORANGE,PURPLE");
        }
    }

    private static void d(String str) {
        String[] split = str.split(",");
        if (split.length != 10) {
            throw new IllegalArgumentException("Expected 10 hex colors");
        }
        for (int i2 = 0; i2 < 10; i2++) {
            ag[i2] = Color.a(split[i2]);
        }
    }

    private static void e(String str) {
        String[] split = str.split(",");
        if (split.length != 10) {
            throw new IllegalArgumentException("Expected 10 team color names");
        }
        for (int i2 = 0; i2 < 10; i2++) {
            ah[i2] = split[i2];
        }
    }

    public int M() {
        if (this.team == -3) {
            return i(-3);
        }
        return h(this.site);
    }

    public static int h(int i2) {
        if (i2 >= c) {
            return i(-3);
        }
        return i(i2 % 2);
    }

    public static int i(int i2) {
        if (i2 >= 0 && i2 < 10) {
            return ag[i2];
        }
        if (i2 == -3) {
            return Color.a(SlickToAndroidKeycodes.AndroidCodes.KEYCODE_PROG_YELLOW, 90, 90, 90);
        }
        return -7829368;
    }

    public String N() {
        if (this.site == -1 || this.site == -2) {
            return "GRAY";
        }
        return j(R());
    }

    public static String j(int i2) {
        if (i2 >= 0 && i2 < 10) {
            return ah[i2];
        }
        return "GRAY";
    }

    public static com.corrodinggames.rts.gameFramework.unitAction.e[] a(com.corrodinggames.rts.gameFramework.unitAction.e eVar) {
        return a(eVar, o.pureGreen, false);
    }

    public static com.corrodinggames.rts.gameFramework.unitAction.e[] a(com.corrodinggames.rts.gameFramework.unitAction.e eVar, o oVar, boolean z) {
        if (!z || eVar.A()) {
            return b(eVar, oVar);
        }
        return a(eVar, oVar);
    }

    public static com.corrodinggames.rts.gameFramework.unitAction.e[] a(com.corrodinggames.rts.gameFramework.unitAction.e eVar, o oVar) {
        com.corrodinggames.rts.gameFramework.unitAction.e[] eVarArr = new com.corrodinggames.rts.gameFramework.unitAction.e[10];
        if ((GameEngine.aU && !GameEngine.aW) || oVar == o.disabled) {
            for (int i2 = 0; i2 < eVarArr.length; i2++) {
                eVarArr[i2] = eVar;
            }
            return eVarArr;
        }
        com.corrodinggames.rts.gameFramework.unitAction.e[] a2 = eVar.a(oVar);
        if (a2 != null) {
            return a2;
        }
        Unit unit = GameEngine.getGameEngine().cd;
        unit.a(bs.init_unitcolour);
        for (int i3 = 0; i3 < eVarArr.length; i3++) {
            int i4 = i(i3);
            if (i3 == 0) {
                eVarArr[i3] = eVar;
            } else {
                eVarArr[i3] = new com.corrodinggames.rts.gameFramework.unitAction.h(eVar, i4, oVar, i3);
            }
        }
        unit.b(bs.init_unitcolour);
        eVar.a(oVar, eVarArr);
        return eVarArr;
    }

    public static com.corrodinggames.rts.gameFramework.unitAction.e[] b(com.corrodinggames.rts.gameFramework.unitAction.e eVar, o oVar) {
        com.corrodinggames.rts.gameFramework.unitAction.e[] eVarArr = new com.corrodinggames.rts.gameFramework.unitAction.e[10];
        if ((GameEngine.aU && !GameEngine.aW) || oVar == o.disabled || eVar.A()) {
            for (int i2 = 0; i2 < eVarArr.length; i2++) {
                eVarArr[i2] = eVar;
            }
            return eVarArr;
        }
        com.corrodinggames.rts.gameFramework.unitAction.e[] a2 = eVar.a(oVar);
        if (a2 != null) {
            return a2;
        }
        Unit unit = GameEngine.getGameEngine().cd;
        unit.a(bs.init_unitcolour);
        int[] iArr = new int[10];
        int[] iArr2 = new int[10];
        for (int i3 = 0; i3 < iArr.length; i3++) {
            iArr[i3] = i(i3);
            iArr2[i3] = i3;
        }
        for (int i4 = 0; i4 < eVarArr.length; i4++) {
            if (i4 != 0) {
                eVarArr[i4] = eVar.clone();
                eVarArr[i4].a("color(" + i4 + "):" + eVar.a());
                eVarArr[i4].j();
            }
        }
        eVar.j();
        if (oVar == o.hueAdd) {
            b(eVar, eVarArr, iArr);
        } else if (oVar == o.hueShift) {
            a(eVar, eVarArr, iArr, iArr2);
        } else {
            a(eVar, eVarArr, iArr);
        }
        for (int i5 = 0; i5 < eVarArr.length; i5++) {
            if (eVarArr[i5] != null) {
                eVarArr[i5].p();
                eVarArr[i5].s();
            }
        }
        eVar.r();
        eVarArr[0] = eVar;
        unit.b(bs.init_unitcolour);
        eVar.a(oVar, eVarArr);
        return eVarArr;
    }

    public static void a(com.corrodinggames.rts.gameFramework.unitAction.e eVar, com.corrodinggames.rts.gameFramework.unitAction.e[] eVarArr, int[] iArr) {
        int b2;
        int m = eVar.m();
        int l = eVar.l();
        int[] iArr2 = new int[iArr.length];
        int[] iArr3 = new int[iArr.length];
        int[] iArr4 = new int[iArr.length];
        for (int i2 = 0; i2 < iArr.length; i2++) {
            iArr2[i2] = Color.b(iArr[i2]);
            iArr3[i2] = Color.c(iArr[i2]);
            iArr4[i2] = Color.d(iArr[i2]);
        }
        for (int i3 = 0; i3 < l; i3++) {
            for (int i4 = 0; i4 < m; i4++) {
                int a2 = eVar.a(i4, i3);
                int a3 = aa.a(a2);
                if (a3 == 0) {
                    if (a2 != 0) {
                        for (int i5 = 0; i5 < eVarArr.length; i5++) {
                            if (eVarArr[i5] != null) {
                                eVarArr[i5].a(i4, i3, 0);
                            }
                        }
                    }
                } else {
                    int c2 = aa.c(a2);
                    if (c2 > 0 && (b2 = aa.b(a2)) == aa.d(a2)) {
                        if (b2 == 0) {
                            for (int i6 = 0; i6 < eVarArr.length; i6++) {
                                if (eVarArr[i6] != null) {
                                    eVarArr[i6].a(i4, i3, Color.a(a3, (iArr2[i6] * c2) >> 8, (iArr3[i6] * c2) >> 8, (iArr4[i6] * c2) >> 8));
                                }
                            }
                        } else if (c2 != b2) {
                            float f2 = (c2 * 0.003921569f) - (b2 * 0.003921569f);
                            for (int i7 = 0; i7 < eVarArr.length; i7++) {
                                if (eVarArr[i7] != null) {
                                    eVarArr[i7].a(i4, i3, Color.a(a3, com.corrodinggames.rts.gameFramework.f.b((int) (b2 + (iArr2[i7] * f2)), 0, 255), com.corrodinggames.rts.gameFramework.f.b((int) (b2 + (iArr3[i7] * f2)), 0, 255), com.corrodinggames.rts.gameFramework.f.b((int) (b2 + (iArr4[i7] * f2)), 0, 255)));
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    public static void a(com.corrodinggames.rts.gameFramework.unitAction.e eVar, com.corrodinggames.rts.gameFramework.unitAction.e[] eVarArr, int[] iArr, int[] iArr2) {
        int d2;
        int m = eVar.m();
        int l = eVar.l();
        int[] iArr3 = new int[iArr.length];
        int[] iArr4 = new int[iArr.length];
        int[] iArr5 = new int[iArr.length];
        for (int i2 = 0; i2 < iArr.length; i2++) {
            iArr3[i2] = Color.b(iArr[i2]);
            iArr4[i2] = Color.c(iArr[i2]);
            iArr5[i2] = Color.d(iArr[i2]);
        }
        for (int i3 = 0; i3 < l; i3++) {
            for (int i4 = 0; i4 < m; i4++) {
                int a2 = eVar.a(i4, i3);
                int a3 = Color.a(a2);
                if (a3 == 0) {
                    if (Color.b(a2) > 0 || Color.c(a2) > 0 || Color.d(a2) > 0) {
                        for (int i5 = 0; i5 < eVarArr.length; i5++) {
                            if (eVarArr[i5] != null) {
                                eVarArr[i5].a(i4, i3, Color.a(0, 0, 0, 0));
                            }
                        }
                    }
                } else {
                    int c2 = Color.c(a2);
                    int b2 = Color.b(a2);
                    float c3 = com.corrodinggames.rts.gameFramework.f.c(com.corrodinggames.rts.gameFramework.f.c(b2, c2), Color.d(a2));
                    float f2 = com.corrodinggames.rts.gameFramework.f.f(com.corrodinggames.rts.gameFramework.f.f(com.corrodinggames.rts.gameFramework.f.d(b2 - c2), com.corrodinggames.rts.gameFramework.f.d(c2 - d2)), com.corrodinggames.rts.gameFramework.f.d(d2 - b2));
                    if (f2 > 15.0f) {
                        for (int i6 = 0; i6 < eVarArr.length; i6++) {
                            if (eVarArr[i6] != null) {
                                float f3 = f2 / 255.0f;
                                eVarArr[i6].a(i4, i3, Color.a(a3, com.corrodinggames.rts.gameFramework.f.b((int) (c3 + (iArr3[i6] * f3)), 0, 255), com.corrodinggames.rts.gameFramework.f.b((int) (c3 + (iArr4[i6] * f3)), 0, 255), com.corrodinggames.rts.gameFramework.f.b((int) (c3 + (iArr5[i6] * f3)), 0, 255)));
                            }
                        }
                    }
                }
            }
        }
    }

    public static void b(com.corrodinggames.rts.gameFramework.unitAction.e eVar, com.corrodinggames.rts.gameFramework.unitAction.e[] eVarArr, int[] iArr) {
        int m = eVar.m();
        int l = eVar.l();
        int[] iArr2 = new int[iArr.length];
        int[] iArr3 = new int[iArr.length];
        int[] iArr4 = new int[iArr.length];
        for (int i2 = 0; i2 < iArr.length; i2++) {
            iArr2[i2] = Color.b(iArr[i2]);
            iArr3[i2] = Color.c(iArr[i2]);
            iArr4[i2] = Color.d(iArr[i2]);
        }
        for (int i3 = 0; i3 < m; i3++) {
            for (int i4 = 0; i4 < l; i4++) {
                int a2 = eVar.a(i3, i4);
                int a3 = Color.a(a2);
                if (a3 > 0) {
                    int b2 = Color.b(a2);
                    int c2 = Color.c(a2);
                    int d2 = Color.d(a2);
                    for (int i5 = 0; i5 < eVarArr.length; i5++) {
                        int i6 = (int) (b2 + (iArr2[i5] * 0.15f));
                        int i7 = (int) (c2 + (iArr3[i5] * 0.15f));
                        int i8 = (int) (d2 + (iArr4[i5] * 0.15f));
                        int b3 = com.corrodinggames.rts.gameFramework.f.b(i6, 0, 255);
                        int b4 = com.corrodinggames.rts.gameFramework.f.b(i7, 0, 255);
                        int b5 = com.corrodinggames.rts.gameFramework.f.b(i8, 0, 255);
                        if (eVarArr[i5] != null) {
                            eVarArr[i5].a(i3, i4, Color.a(a3, b3, b4, b5));
                        }
                    }
                }
            }
        }
    }

    /* renamed from: k */
    public static PlayerData getPlayerData(int i2) {
        if (i2 == -1) {
            return i;
        }
        if (i2 == -2) {
            return h;
        }
        if (i2 >= f) {
            GameEngine.g("team index too high: " + i2);
            return null;
        } else if (i2 < 0) {
            GameEngine.g("team index too low: " + i2);
            return null;
        } else {
            return playerArray[i2];
        }
    }

    public void e(float f2) {
        GameEngine gameEngine = GameEngine.getGameEngine();
        if (this.ai > 0) {
            this.ai--;
            return;
        }
        if (this.ai == -2) {
            this.ai = this.site;
        } else {
            this.ai = 10;
        }
        if (!this.G && !gameEngine.replayEngine.j()) {
            boolean z = false;
            boolean z2 = false;
            boolean z3 = false;
            boolean z4 = gameEngine.netEngine.gameMapData.sharedControl;
            boolean z5 = false;
            am[] a2 = am.bE.a();
            int size = am.bE.size();
            for (int i2 = 0; i2 < size; i2++) {
                am amVar = a2[i2];
                if (amVar.bX == this) {
                    if (!amVar.cT()) {
                        z = true;
                        if (!this.F && (amVar.bJ() || amVar.ak())) {
                            z2 = true;
                            break;
                        }
                    } else {
                        z5 = true;
                    }
                } else if (z4 && amVar.bX != null && amVar.bX.d(this) && !amVar.cT()) {
                    z3 = true;
                }
            }
            if (!z && !z3) {
                boolean z6 = false;
                if (z5 && gameEngine.tick < 100 && gameEngine.bv) {
                    z6 = true;
                }
                this.G = true;
                a();
                Iterator it = am.bE.iterator();
                while (it.hasNext()) {
                    am amVar2 = (am) it.next();
                    if (amVar2.bX == this && !amVar2.u()) {
                        if (z6 && !amVar2.bV && amVar2.cT()) {
                            as mo1r = amVar2.mo1r();
                            String str = amVar2.c() + " Warning: This unit got ignored in defeated check and now being removed";
                            if ((mo1r instanceof com.corrodinggames.rts.game.units.custom.l) && ((com.corrodinggames.rts.game.units.custom.l) mo1r).aO) {
                                str = str + " (Likely due to canNotBeDirectlyAttacked:true)";
                            }
                            GameNetEngine.a((String) null, str);
                        }
                        amVar2.cj();
                    }
                }
                gameEngine.netEngine.i(this);
            }
            if (!z2 && !this.F && !this.G) {
                this.F = true;
                gameEngine.netEngine.h(this);
            }
        }
    }

    public void a(y yVar) {
    }

    public static void b(y yVar) {
        for (int i2 = 0; i2 < c; i2++) {
            PlayerData playerData = playerArray[i2];
            if (playerData != null) {
                playerData.a(yVar);
            }
        }
    }

    public static void a(am amVar) {
        if (amVar.bX != null && amVar.bY && amVar.bL) {
            PlayerData playerData = amVar.bX;
            amVar.bY = false;
            playerData.T.b(amVar);
            amVar.dj();
        }
    }

    public static void b(am amVar) {
        a(amVar);
    }

    public static void c(am amVar) {
        if (amVar.bX != null && !amVar.bY && amVar.bL && !amVar.bV) {
            amVar.bY = true;
            PlayerData playerData = amVar.bX;
            playerData.T.a(amVar);
            amVar.di();
            if (!playerData.n && playerData.T.m) {
                playerData.n = true;
            }
            if (!playerData.m) {
                playerData.m = true;
            }
            playerData.T();
        }
    }

    public static void O() {
        i.S = true;
        h.S = true;
        Iterator it = c().iterator();
        while (it.hasNext()) {
            ((PlayerData) it.next()).S = true;
        }
    }

    public static void P() {
        if (GameEngine.getGameEngine().M()) {
            GameEngine.m5e("Skipping updateAllCachesFromChangedMetadata due to desync risk");
            return;
        }
        for (int i2 = 0; i2 < c; i2++) {
            PlayerData playerData = playerArray[i2];
            if (playerData != null) {
                playerData.S = true;
            }
        }
    }

    public static void f(float f2) {
        int b2;
        GameEngine gameEngine = GameEngine.getGameEngine();
        i.a(f2);
        h.a(f2);
        for (int i2 = 0; i2 < c; i2++) {
            PlayerData playerData = playerArray[i2];
            if (playerData != null) {
                playerData.a(f2);
                playerData.e(f2);
                if (!playerData.at && (b2 = b(playerData.team)) > 0) {
                    if (b2 >= c(playerData.team)) {
                        d(playerData.team);
                        o();
                    } else {
                        e(playerData.team);
                    }
                }
                if (playerData.E) {
                    if (playerData.av < 0) {
                        playerData.av = gameEngine.by;
                    }
                    if (!playerData.G) {
                        int i3 = 0;
                        Iterator it = am.bE.iterator();
                        while (it.hasNext()) {
                            am amVar = (am) it.next();
                            if (amVar.bX == playerData && !amVar.u()) {
                                boolean z = false;
                                int i4 = 1;
                                if (com.corrodinggames.rts.gameFramework.utility.y.a(playerData.av, 10000)) {
                                    z = true;
                                    i4 = 50;
                                } else if (com.corrodinggames.rts.gameFramework.utility.y.a(playerData.av, 6000)) {
                                    z = com.corrodinggames.rts.gameFramework.f.a(amVar, 0, 100) > 90;
                                    i4 = 20;
                                } else if (com.corrodinggames.rts.gameFramework.utility.y.a(playerData.av, 2000)) {
                                    z = com.corrodinggames.rts.gameFramework.f.a(amVar, 0, 100) > 98;
                                    i4 = 2;
                                }
                                if (amVar instanceof com.corrodinggames.rts.game.units.d.e) {
                                    z = true;
                                }
                                if (z) {
                                    amVar.cu = -1.0f;
                                    i3++;
                                    if (i3 > i4) {
                                        break;
                                    }
                                } else {
                                    continue;
                                }
                            }
                        }
                    }
                }
            }
        }
        if (gameEngine.P() && gameEngine.settingsEngine.aiDifficulty != aj) {
            gameEngine.netEngine.aq();
            aj = gameEngine.settingsEngine.aiDifficulty;
        }
    }

    public static void g(float f2) {
        e();
        for (PlayerData playerData : d()) {
            playerData.d(false);
        }
    }

    public static void Q() {
        i.d(false);
        for (int i2 = 0; i2 < c; i2++) {
            PlayerData playerData = playerArray[i2];
            if (playerData != null && !playerData.b() && !playerData.G && !playerData.F && !playerData.E) {
                GameEngine.getGameEngine().netEngine.g(playerData);
            }
        }
    }

    public static void h(float f2) {
        for (int i2 = 0; i2 < c; i2++) {
            PlayerData playerData = playerArray[i2];
            if (playerData != null && (playerData instanceof com.corrodinggames.rts.game.a.a)) {
                ((com.corrodinggames.rts.game.a.a) playerData).i(f2);
            }
        }
    }

    public int R() {
        if (this.gameColor == -1) {
            return S();
        }
        return this.gameColor;
    }

    public int S() {
        PlayerData playerData;
        if (this.site == -1 || this.site == -2) {
            return 5;
        }
        int i2 = this.site;
        if (i2 >= 10) {
            i2 %= 10;
        }
        if (c > 10 && (playerData = GameEngine.getGameEngine().netEngine.z) != null && playerData != this && playerData.R() == i2) {
            if (i2 != 5) {
                i2 = 5;
            } else {
                i2 = 4;
            }
        }
        return i2;
    }

    public void T() {
    }

    public void a(com.corrodinggames.rts.game.units.custom.h hVar) {
        this.ak = hVar;
    }

    public com.corrodinggames.rts.game.units.custom.h U() {
        return this.ak;
    }

    public void b(com.corrodinggames.rts.game.units.custom.h hVar) {
        com.corrodinggames.rts.game.units.custom.h U = U();
        if (U == null || U.b() == 0) {
            a(hVar);
        } else if (com.corrodinggames.rts.game.units.custom.g.b(U, hVar)) {
        } else {
            com.corrodinggames.rts.game.units.custom.i iVar = new com.corrodinggames.rts.game.units.custom.i(U);
            if (iVar.a(hVar)) {
                a(iVar.a());
            }
        }
    }

    public void c(com.corrodinggames.rts.game.units.custom.h hVar) {
        com.corrodinggames.rts.game.units.custom.h U = U();
        if (U == null || U.b() == 0 || !com.corrodinggames.rts.game.units.custom.g.a(hVar, U)) {
            return;
        }
        com.corrodinggames.rts.game.units.custom.i iVar = new com.corrodinggames.rts.game.units.custom.i(U);
        if (iVar.b(hVar)) {
            a(iVar.a());
        }
    }

    public com.corrodinggames.rts.game.units.custom.e.f V() {
        return this.al;
    }

    public double c(com.corrodinggames.rts.game.units.custom.e.a aVar) {
        return this.al.a(aVar);
    }

    public boolean a(q qVar, PlayerData playerData) {
        if (qVar == q.own) {
            return playerData == this;
        } else if (qVar == q.any) {
            return true;
        } else {
            if (qVar == q.ally) {
                return d(playerData);
            }
            if (qVar == q.allyNotOwn) {
                return playerData != this && d(playerData);
            } else if (qVar == q.enemy) {
                return c(playerData);
            } else {
                if (qVar == q.neutral) {
                    return playerData == i;
                } else if (qVar == q.notOwn) {
                    return playerData != this;
                } else {
                    throw new RuntimeException("Unsupported type: " + qVar);
                }
            }
        }
    }

    public void d(am amVar) {
    }

    public void W() {
        GameEngine.m5e("debugUnitCountByType for team:" + this.site);
        com.corrodinggames.rts.gameFramework.utility.m mVar = new com.corrodinggames.rts.gameFramework.utility.m();
        am[] a2 = am.bE.a();
        int size = am.bE.size();
        for (int i2 = 0; i2 < size; i2++) {
            am amVar = a2[i2];
            if (amVar.bX == this && !amVar.bV) {
                as asVar = amVar.dz;
                boolean z = false;
                Iterator it = mVar.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    r rVar = (r) it.next();
                    if (rVar.a == asVar) {
                        rVar.b++;
                        z = true;
                        break;
                    }
                }
                if (!z) {
                    r rVar2 = new r();
                    rVar2.a = asVar;
                    rVar2.b = 1;
                    mVar.add(rVar2);
                }
            }
        }
        GameEngine.m5e("--- Units ---");
        int i3 = 0;
        Iterator it2 = mVar.iterator();
        while (it2.hasNext()) {
            r rVar3 = (r) it2.next();
            if (!rVar3.a.k()) {
                GameEngine.m5e(rVar3.a.i() + " - count:" + rVar3.b);
                i3 += rVar3.b;
            }
        }
        GameEngine.m5e("total:" + i3);
        GameEngine.m5e("--- Buildings/Ignored in count ---");
        int i4 = 0;
        Iterator it3 = mVar.iterator();
        while (it3.hasNext()) {
            r rVar4 = (r) it3.next();
            if (rVar4.a.k()) {
                GameEngine.m5e(rVar4.a.i() + " - count:" + rVar4.b);
                i4 += rVar4.b;
            }
        }
        GameEngine.m5e("total:" + i4);
    }

    public void c(String str) {
        GameEngine.m5e("Team(id: " + this.site + ", name:" + this.name + "):" + str);
    }

    public int b(com.corrodinggames.rts.game.units.custom.g gVar, boolean z, boolean z2) {
        int i2 = 0;
        if (this == i) {
            return 0;
        }
        PlayerData[] playerDataArr = playerArray;
        int i3 = c;
        for (int i4 = 0; i4 < i3; i4++) {
            PlayerData playerData = playerDataArr[i4];
            if (playerData != null && this != playerData && this.team != playerData.team) {
                if (gVar == null) {
                    i2 += playerData.a(z, z2);
                } else {
                    i2 += playerData.a(gVar, z, z2);
                }
            }
        }
        return i2;
    }

    public int c(com.corrodinggames.rts.game.units.custom.g gVar, boolean z, boolean z2) {
        int i2 = 0;
        PlayerData[] playerDataArr = playerArray;
        int i3 = c;
        for (int i4 = 0; i4 < i3; i4++) {
            PlayerData playerData = playerDataArr[i4];
            if (playerData != null && this != playerData && d(playerData)) {
                if (gVar == null) {
                    i2 += playerData.a(z, z2);
                } else {
                    i2 += playerData.a(gVar, z, z2);
                }
            }
        }
        return i2;
    }

    public static void X() {
        GameEngine gameEngine = GameEngine.getGameEngine();
        i.T.a = gameEngine.bB;
        h.T.a = gameEngine.bB;
        for (int i2 = 0; i2 < c; i2++) {
            PlayerData playerData = playerArray[i2];
            if (playerData != null) {
                playerData.T.a = gameEngine.bB;
            }
        }
    }

    public static void Y() {
        i.Z();
        h.Z();
    }

    public void Z() {
        this.m = false;
        this.n = false;
        this.credits = 4000.0d;
        this.p = 0.0d;
        this.q = 0;
        this.ai = -2;
        this.at = false;
        this.serverHostFlag = -9999;
        this.E = false;
        this.av = -9999;
        this.F = false;
        this.G = false;
        this.H = false;
        this.sharedControl_1 = false;
        this.sharedControl_2 = false;
        this.am.a();
        this.an = 0.0f;
        this.ad = 0;
        this.R = 0;
        this.S = true;
        this.T = new s();
        this.T.a = GameEngine.getGameEngine().bB;
        this.ak = com.corrodinggames.rts.game.units.custom.g.d;
        this.al = new com.corrodinggames.rts.game.units.custom.e.f();
    }

    public double aa() {
        long currentTimeMillis = System.currentTimeMillis();
        if (com.corrodinggames.rts.gameFramework.f.c((float) (this.aq - currentTimeMillis)) > 166.66666f) {
            this.aq = currentTimeMillis;
            this.ar = this.credits + this.p;
        }
        return this.ar;
    }

    public com.corrodinggames.rts.game.units.custom.e.f ab() {
        return V();
    }
}