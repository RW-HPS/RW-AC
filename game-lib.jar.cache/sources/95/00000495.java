package com.corrodinggames.rts.gameFramework;

import com.corrodinggames.rts.game.PlayerData;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: com.corrodinggames.rts.gameFramework.c */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/c.class */
public class CommandController {
    static final boolean a = false;

    /* renamed from: b */
    public ArrayList commandList = new ArrayList();
    public ArrayList c = new ArrayList();
    public ArrayList d = new ArrayList();
    static int e;

    public static void a(String str) {
        e++;
        if (e == 5) {
            GameEngine.m5e("(Rate Limiting...)");
        }
        if (e >= 5) {
            return;
        }
        GameEngine.m5e(str);
    }

    public void a() {
        this.commandList.clear();
        this.c.clear();
        this.d.clear();
    }

    public SyncPacket b() {
        SyncPacket syncPacket = new SyncPacket(this);
        if (a) {
            GameEngine.m5e("Tracing source");
            syncPacket.b = GameEngine.a(new Exception("Test"));
        }
        return syncPacket;
    }

    public SyncPacket a(PlayerData playerData) {
        return b(playerData);
    }

    public SyncPacket b(PlayerData playerData) {
        if (playerData == null) {
            throw new RuntimeException("team==null");
        }
        GameEngine gameEngine = GameEngine.getGameEngine();
        SyncPacket syncPacket = new SyncPacket(this);
        syncPacket.i = playerData;
        syncPacket.d = gameEngine.by;
        if (a) {
            GameEngine.m5e("Tracing source");
            syncPacket.b = GameEngine.a(new Exception("Test"));
        }
        if (!gameEngine.netEngine.B) {
            if (!syncPacket.l()) {
                GameEngine.print("Command failed prepareAndCheckOnServer()");
            }
            this.commandList.add(syncPacket);
        } else {
            this.d.add(syncPacket);
        }
        return syncPacket;
    }

    public void c() {
        GameEngine gameEngine = GameEngine.getGameEngine();
        e = 0;
        if (!gameEngine.netEngine.B) {
            d();
        } else {
            e();
        }
    }

    public void d() {
        GameEngine gameEngine = GameEngine.getGameEngine();
        int i = gameEngine.tick;
        int i2 = 0;
        Iterator it = this.commandList.iterator();
        while (it.hasNext()) {
            SyncPacket syncPacket = (SyncPacket) it.next();
            gameEngine.replayEngine.a(syncPacket, i);
            syncPacket.k();
            i2++;
        }
        this.commandList.clear();
        if (i2 > 0) {
            gameEngine.replayEngine.c();
        }
    }

    public void e() {
        GameEngine gameEngine = GameEngine.getGameEngine();
        int i = gameEngine.tick;
        int i2 = 0;
        Iterator it = this.commandList.iterator();
        while (it.hasNext()) {
            SyncPacket syncPacket = (SyncPacket) it.next();
            if (syncPacket.localTick == i) {
                gameEngine.replayEngine.a(syncPacket, i);
                syncPacket.k();
                it.remove();
                i2++;
            }
        }
        if (i2 > 0) {
            gameEngine.replayEngine.c();
        }
    }
}