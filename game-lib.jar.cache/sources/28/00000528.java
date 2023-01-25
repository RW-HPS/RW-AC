package com.corrodinggames.rts.gameFramework.net;

import java.io.IOException;
import java.util.TimerTask;

/* renamed from: com.corrodinggames.rts.gameFramework.j.av */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/j/av.class */
class PingTask extends TimerTask {

    /* renamed from: c */
    private final GameNetEngine gameNetEngine;

    /* renamed from: a */
    public boolean f5961a = true;

    /* renamed from: b */
    public long f5962b = 0;

    PingTask(GameNetEngine gameNetEngine) {
        this.gameNetEngine = gameNetEngine;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public void run() {
        try {
            long currentTimeMillis = System.currentTimeMillis();
            if (this.gameNetEngine.f5732au != 0 && (currentTimeMillis > this.gameNetEngine.f5732au + 5 || currentTimeMillis < this.gameNetEngine.f5732au)) {
                this.gameNetEngine.f5732au = 0L;
                this.gameNetEngine.m1608Q();
            }
            if (currentTimeMillis > this.f5962b + 1000 || currentTimeMillis < this.f5962b) {
                this.f5962b = currentTimeMillis;
                if (this.f5961a) {
                    GameOutputStream gameOutputStream = new GameOutputStream();
                    gameOutputStream.writeLong(System.currentTimeMillis());
                    gameOutputStream.writeByte(0);
                    this.gameNetEngine.sendPacket(gameOutputStream.getPacket(108));
                } else {
                    this.gameNetEngine.m1609P();
                }
                this.f5961a = !this.f5961a;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}