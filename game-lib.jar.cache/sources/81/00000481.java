package com.corrodinggames.rts.gameFramework;

import com.corrodinggames.rts.game.PlayerData;
import com.corrodinggames.rts.gameFramework.net.GameInputStream;
import com.corrodinggames.rts.gameFramework.net.GameOutputStream;
import java.util.ArrayList;

/* renamed from: com.corrodinggames.rts.gameFramework.bg */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/bg.class */
public class StatsHandler {
    TeamStats b = new TeamStats();
    TeamStats[] c = new TeamStats[PlayerData.e];
    int d;
    boolean e;
    public static boolean a = true;
    public static bl f = new bl();

    public void a(GameOutputStream gameOutputStream) {
        gameOutputStream.e("stats");
        gameOutputStream.writeByte(0);
        int i = PlayerData.c;
        gameOutputStream.writeInt(i);
        for (int i2 = 0; i2 < i; i2++) {
            this.c[i2].a(gameOutputStream);
        }
        gameOutputStream.endBlock("stats");
    }

    public void a(GameInputStream gameInputStream, boolean z) {
        gameInputStream.startBlock("stats");
        gameInputStream.readByte();
        int readInt = gameInputStream.readInt();
        this.c = new TeamStats[PlayerData.e];
        for (int i = 0; i < readInt; i++) {
            this.c[i] = new TeamStats();
            this.c[i].a(gameInputStream);
        }
        gameInputStream.endBlock("stats");
    }

    public void a() {
        this.b = new TeamStats();
        this.c = new TeamStats[PlayerData.e];
        for (int i = 0; i < this.c.length; i++) {
            this.c[i] = new TeamStats();
        }
        this.d = 0;
        this.e = a;
    }

    public void b() {
        int i = GameEngine.getGameEngine().by;
        if (this.e && this.d <= i) {
            int i2 = 5000;
            if (i < 60000) {
                i2 = 1000;
            }
            if (i > 1800000) {
                i2 = 15000;
            }
            if (i > 3600000) {
                i2 = 30000;
            }
            int i3 = i2 + i2;
            a(i, false, false);
        }
    }

    private void a(int i, boolean z, boolean z2) {
        for (int i2 = 0; i2 < PlayerData.c; i2++) {
            PlayerData playerData = PlayerData.getPlayerData(i2);
            if (playerData != null) {
                bn bnVar = this.c[i2].l;
                if (!z || bnVar.c()) {
                    bnVar.a(playerData, i, z2);
                    bnVar.a(i2);
                }
            }
        }
    }

    public void c() {
        this.e = false;
        a(GameEngine.getGameEngine().by, true, true);
    }

    public ArrayList d() {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < PlayerData.c; i++) {
            if (this.c[i].l.c()) {
                arrayList.add(this.c[i]);
            }
        }
        return arrayList;
    }

    public TeamStats a(com.corrodinggames.rts.game.units.am amVar) {
        return getTeamStatsFromTeam(amVar.bX);
    }

    /* renamed from: a */
    public TeamStats getTeamStatsFromTeam(PlayerData playerData) {
        int i = playerData.site;
        if (i < 0 || i >= this.c.length) {
            return this.b;
        }
        TeamStats teamStats = this.c[i];
        if (teamStats == null) {
            return this.b;
        }
        return teamStats;
    }

    public void a(com.corrodinggames.rts.game.units.am amVar, com.corrodinggames.rts.game.units.am amVar2, float f2) {
        if (amVar != null) {
            boolean z = amVar2.bV;
            TeamStats a2 = a(amVar);
            TeamStats a3 = a(amVar2);
            if (z) {
                f.a(amVar, amVar2);
                if (amVar2.bI()) {
                    a2.buildingsKilled++;
                    a3.buildingsLost++;
                } else if (amVar2.dd()) {
                    a2.experimentalsKilled++;
                    a3.experimentalsLost++;
                } else {
                    a2.unitsKilled++;
                    a3.unitsLost++;
                }
            }
        }
        GameEngine gameEngine = GameEngine.getGameEngine();
        if (amVar2.bX == gameEngine.playerTeam) {
            gameEngine.a(amVar2, f2);
        }
    }
}