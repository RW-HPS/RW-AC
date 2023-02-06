package com.corrodinggames.rts.gameFramework.net;

import java.io.IOException;
import java.util.TimerTask;

/* renamed from: com.corrodinggames.rts.gameFramework.j.av */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/j/av.class */
class PingTask extends TimerTask {

    /* renamed from: c */
    private final GameNetEngine gameNetEngine;
    public boolean a = true;
    public long b = 0;

    PingTask(GameNetEngine gameNetEngine) {
        this.gameNetEngine = gameNetEngine;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public void run() {
        try {
            long currentTimeMillis = System.currentTimeMillis();
            if (this.gameNetEngine.au != 0 && (currentTimeMillis > this.gameNetEngine.au + 5 || currentTimeMillis < this.gameNetEngine.au)) {
                this.gameNetEngine.au = 0L;
                this.gameNetEngine.Q();
            }
            if (currentTimeMillis > this.b + 1000 || currentTimeMillis < this.b) {
                this.b = currentTimeMillis;
                if (this.a) {
                    GameOutputStream gameOutputStream = new GameOutputStream();
                    gameOutputStream.writeLong(System.currentTimeMillis());
                    gameOutputStream.writeByte(0);
                    this.gameNetEngine.sendPacket(gameOutputStream.getPacket(108));
                } else {
                    this.gameNetEngine.P();
                }
                this.a = !this.a;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}