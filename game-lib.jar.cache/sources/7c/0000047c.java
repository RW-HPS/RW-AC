package com.corrodinggames.rts.gameFramework;

import com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope;
import java.io.IOException;
import java.util.concurrent.ConcurrentLinkedQueue;

/* renamed from: com.corrodinggames.rts.gameFramework.bb */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/bb.class */
class RelaySaveRunnable implements Runnable {
    volatile int b;
    int c;
    int d;
    int e;
    int f;
    int g;
    final /* synthetic */ ReplayEngine k;
    volatile boolean a = true;
    boolean h = false;
    public ConcurrentLinkedQueue i = new ConcurrentLinkedQueue();
    public long j = 0;

    RelaySaveRunnable(ReplayEngine replayEngine) {
        this.k = replayEngine;
    }

    public synchronized void a(bd bdVar) {
        if (this.h) {
            GameEngine.m5e("Replay:addCommand skipped due to stopped recording");
        }
        this.i.add(bdVar);
        this.f = bdVar.a;
        if (bdVar.e != null) {
            this.k.A++;
        }
        if (bdVar.f != null) {
            this.k.B++;
        }
        notifyAll();
    }

    public synchronized void a() {
        boolean z;
        this.a = false;
        GameEngine gameEngine = GameEngine.getGameEngine();
        ReplayEngine.a("stop requested at:" + gameEngine.tick);
        z = this.k.P;
        if (!z) {
            ReplayEngine.a("Replay stop: warning: active==false");
        }
        if (this.k.u) {
            ReplayEngine.a("Replay stop: warning: replaying==true");
        }
        this.b = gameEngine.tick;
        this.c = gameEngine.by;
        this.d = this.k.A;
        this.e = this.k.B;
        if (this.b < this.f) {
            GameEngine.m5e("Replay: stoppedFrame<lastCommandFrame: " + this.b + "<" + this.f);
            this.b = this.f;
        }
        this.j = 0L;
        notifyAll();
    }

    private synchronized void b() {
        try {
            if (this.a) {
                wait();
            }
        } catch (InterruptedException e) {
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        GameEngine.aq();
        while (this.a) {
            if (this.i.size() > 0) {
                bd bdVar = (bd) this.i.remove();
                try {
                    if (bdVar.e != null) {
                        this.k.J.e("rc");
                        this.k.J.writeInt(bdVar.a);
                        bdVar.e.write(this.k.J);
                        this.k.J.endBlock("rc");
                        this.g = bdVar.a;
                    } else if (bdVar.c != null) {
                        this.k.J.e("cs");
                        this.k.J.writeInt(bdVar.a);
                        this.k.J.writeLong(bdVar.c.longValue());
                        this.k.J.endBlock("cs");
                    } else if (bdVar.d != null) {
                        this.k.J.e("wait");
                        this.k.J.writeInt(bdVar.a);
                        this.k.J.endBlock("wait");
                        this.k.J.e("es");
                        this.k.J.writeInt(bdVar.a);
                        this.k.J.a(bdVar.d);
                        this.k.J.endBlock("es");
                    } else if (bdVar.f != null) {
                        this.k.J.e("wait");
                        this.k.J.writeInt(bdVar.a);
                        this.k.J.endBlock("wait");
                        this.k.J.e("resync");
                        this.k.J.writeInt(bdVar.a);
                        this.k.J.writeInt(bdVar.h);
                        this.k.J.writeInt(bdVar.i);
                        this.k.J.writeFloat(bdVar.j);
                        this.k.J.writeFloat(bdVar.k);
                        this.k.J.a(bdVar.f);
                        this.k.J.endBlock("resync");
                    } else if (bdVar.g != null) {
                        this.k.J.e("chat");
                        this.k.J.writeInt(bdVar.a);
                        this.k.J.writeInt(bdVar.g.a);
                        this.k.J.writeIsString(bdVar.g.b);
                        this.k.J.writeIsString(bdVar.g.c);
                        this.k.J.endBlock("chat");
                    } else {
                        throw new RuntimeException("Unknown saved command");
                    }
                    if (this.j == 0 || this.j + 3000 < System.currentTimeMillis()) {
                        this.j = System.currentTimeMillis();
                        this.k.J.flashAll();
                    }
                } catch (IOException e) {
                    GameEngine gameEngine = GameEngine.getGameEngine();
                    GameEngine.a("Replay error", (Throwable) e);
                    gameEngine.bS.h.a(VariableScope.nullOrMissingString, "IO error recording replay, disabling record");
                    this.k.P = false;
                    this.h = true;
                    return;
                }
            }
            if (this.i.size() == 0) {
                b();
            }
        }
        try {
            this.k.J.e("wait");
            this.k.J.writeInt(this.b);
            this.k.J.endBlock("wait");
            this.k.J.e("end");
            this.k.J.endBlock("end");
            this.k.J.e("endReplayMetaData");
            this.k.J.writeByte(0);
            this.k.J.writeInt(this.b);
            this.k.J.writeInt(this.c);
            this.k.J.writeInt(this.d);
            this.k.J.writeInt(this.e);
            this.k.J.writeString("{frames:" + this.b + ",time:" + this.c + ",commandCount:" + this.d + ",resyncCount:" + this.e + "}");
            this.k.J.endBlock("endReplayMetaData");
            this.k.J.flashAll();
            ReplayEngine.a("Background writer stopping");
            ReplayEngine.a("Remainding commands: " + this.i.size());
            ReplayEngine.a("last command: " + this.f);
            ReplayEngine.a("last command write: " + this.g);
            ReplayEngine.a("Commands issued: " + this.d);
            this.h = true;
        } catch (IOException e2) {
            throw new RuntimeException(e2);
        }
    }
}