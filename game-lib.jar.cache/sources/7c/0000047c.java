package com.corrodinggames.rts.gameFramework;

import com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope;
import java.io.IOException;
import java.util.concurrent.ConcurrentLinkedQueue;

/* renamed from: com.corrodinggames.rts.gameFramework.bb */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/bb.class */
class RunnableC0726bb implements Runnable {

    /* renamed from: b */
    volatile int f4578b;

    /* renamed from: c */
    int f4579c;

    /* renamed from: d */
    int f4580d;

    /* renamed from: e */
    int f4581e;

    /* renamed from: f */
    int f4582f;

    /* renamed from: g */
    int f4583g;

    /* renamed from: k */
    final /* synthetic */ C0725ba f4587k;

    /* renamed from: a */
    volatile boolean f4577a = true;

    /* renamed from: h */
    boolean f4584h = false;

    /* renamed from: i */
    public ConcurrentLinkedQueue f4585i = new ConcurrentLinkedQueue();

    /* renamed from: j */
    public long f4586j = 0;

    RunnableC0726bb(C0725ba c0725ba) {
        this.f4587k = c0725ba;
    }

    /* renamed from: a */
    public synchronized void m2475a(C0728bd c0728bd) {
        if (this.f4584h) {
            GameEngine.m5453e("Replay:addCommand skipped due to stopped recording");
        }
        this.f4585i.add(c0728bd);
        this.f4582f = c0728bd.f4591a;
        if (c0728bd.f4595e != null) {
            this.f4587k.f4558A++;
        }
        if (c0728bd.f4596f != null) {
            this.f4587k.f4559B++;
        }
        notifyAll();
    }

    /* renamed from: a */
    public synchronized void m2476a() {
        boolean z;
        this.f4577a = false;
        GameEngine gameEngine = GameEngine.getGameEngine();
        C0725ba.m2497a("stop requested at:" + gameEngine.tick);
        z = this.f4587k.f4551P;
        if (!z) {
            C0725ba.m2497a("Replay stop: warning: active==false");
        }
        if (this.f4587k.f4553u) {
            C0725ba.m2497a("Replay stop: warning: replaying==true");
        }
        this.f4578b = gameEngine.tick;
        this.f4579c = gameEngine.f6315by;
        this.f4580d = this.f4587k.f4558A;
        this.f4581e = this.f4587k.f4559B;
        if (this.f4578b < this.f4582f) {
            GameEngine.m5453e("Replay: stoppedFrame<lastCommandFrame: " + this.f4578b + "<" + this.f4582f);
            this.f4578b = this.f4582f;
        }
        this.f4586j = 0L;
        notifyAll();
    }

    /* renamed from: b */
    private synchronized void m2474b() {
        try {
            if (this.f4577a) {
                wait();
            }
        } catch (InterruptedException e) {
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        GameEngine.m1032aq();
        while (this.f4577a) {
            if (this.f4585i.size() > 0) {
                C0728bd c0728bd = (C0728bd) this.f4585i.remove();
                try {
                    if (c0728bd.f4595e != null) {
                        this.f4587k.f4567J.mo1365e("rc");
                        this.f4587k.f4567J.writeInt(c0728bd.f4591a);
                        c0728bd.f4595e.write(this.f4587k.f4567J);
                        this.f4587k.f4567J.endBlock("rc");
                        this.f4583g = c0728bd.f4591a;
                    } else if (c0728bd.f4593c != null) {
                        this.f4587k.f4567J.mo1365e("cs");
                        this.f4587k.f4567J.writeInt(c0728bd.f4591a);
                        this.f4587k.f4567J.writeLong(c0728bd.f4593c.longValue());
                        this.f4587k.f4567J.endBlock("cs");
                    } else if (c0728bd.f4594d != null) {
                        this.f4587k.f4567J.mo1365e("wait");
                        this.f4587k.f4567J.writeInt(c0728bd.f4591a);
                        this.f4587k.f4567J.endBlock("wait");
                        this.f4587k.f4567J.mo1365e("es");
                        this.f4587k.f4567J.writeInt(c0728bd.f4591a);
                        this.f4587k.f4567J.mo1377a(c0728bd.f4594d);
                        this.f4587k.f4567J.endBlock("es");
                    } else if (c0728bd.f4596f != null) {
                        this.f4587k.f4567J.mo1365e("wait");
                        this.f4587k.f4567J.writeInt(c0728bd.f4591a);
                        this.f4587k.f4567J.endBlock("wait");
                        this.f4587k.f4567J.mo1365e("resync");
                        this.f4587k.f4567J.writeInt(c0728bd.f4591a);
                        this.f4587k.f4567J.writeInt(c0728bd.f4598h);
                        this.f4587k.f4567J.writeInt(c0728bd.f4599i);
                        this.f4587k.f4567J.writeFloat(c0728bd.f4600j);
                        this.f4587k.f4567J.writeFloat(c0728bd.f4601k);
                        this.f4587k.f4567J.mo1377a(c0728bd.f4596f);
                        this.f4587k.f4567J.endBlock("resync");
                    } else if (c0728bd.f4597g != null) {
                        this.f4587k.f4567J.mo1365e("chat");
                        this.f4587k.f4567J.writeInt(c0728bd.f4591a);
                        this.f4587k.f4567J.writeInt(c0728bd.f4597g.f4588a);
                        this.f4587k.f4567J.writeIsString(c0728bd.f4597g.f4589b);
                        this.f4587k.f4567J.writeIsString(c0728bd.f4597g.f4590c);
                        this.f4587k.f4567J.endBlock("chat");
                    } else {
                        throw new RuntimeException("Unknown saved command");
                    }
                    if (this.f4586j == 0 || this.f4586j + 3000 < System.currentTimeMillis()) {
                        this.f4586j = System.currentTimeMillis();
                        this.f4587k.f4567J.flashAll();
                    }
                } catch (IOException e) {
                    GameEngine gameEngine = GameEngine.getGameEngine();
                    GameEngine.m1060a("Replay error", (Throwable) e);
                    gameEngine.f6330bS.f5264h.m1781a(VariableScope.nullOrMissingString, "IO error recording replay, disabling record");
                    this.f4587k.f4551P = false;
                    this.f4584h = true;
                    return;
                }
            }
            if (this.f4585i.size() == 0) {
                m2474b();
            }
        }
        try {
            this.f4587k.f4567J.mo1365e("wait");
            this.f4587k.f4567J.writeInt(this.f4578b);
            this.f4587k.f4567J.endBlock("wait");
            this.f4587k.f4567J.mo1365e("end");
            this.f4587k.f4567J.endBlock("end");
            this.f4587k.f4567J.mo1365e("endReplayMetaData");
            this.f4587k.f4567J.writeByte(0);
            this.f4587k.f4567J.writeInt(this.f4578b);
            this.f4587k.f4567J.writeInt(this.f4579c);
            this.f4587k.f4567J.writeInt(this.f4580d);
            this.f4587k.f4567J.writeInt(this.f4581e);
            this.f4587k.f4567J.writeString("{frames:" + this.f4578b + ",time:" + this.f4579c + ",commandCount:" + this.f4580d + ",resyncCount:" + this.f4581e + "}");
            this.f4587k.f4567J.endBlock("endReplayMetaData");
            this.f4587k.f4567J.flashAll();
            C0725ba.m2497a("Background writer stopping");
            C0725ba.m2497a("Remainding commands: " + this.f4585i.size());
            C0725ba.m2497a("last command: " + this.f4582f);
            C0725ba.m2497a("last command write: " + this.f4583g);
            C0725ba.m2497a("Commands issued: " + this.f4580d);
            this.f4584h = true;
        } catch (IOException e2) {
            throw new RuntimeException(e2);
        }
    }
}