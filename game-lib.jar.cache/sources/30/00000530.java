package com.corrodinggames.rts.gameFramework.net;

import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.utility.C1150w;
import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import net.rudp.ReliableSocket;

/* renamed from: com.corrodinggames.rts.gameFramework.j.e */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/j/e.class */
final class SendSocketOutStream implements Runnable {

    /* renamed from: b */
    OutputStream f6032b;

    /* renamed from: c */
    BufferedOutputStream f6033c;

    /* renamed from: d */
    DataOutputStream f6034d;

    /* renamed from: f */
    final /* synthetic */ PlayerConnect f6036f;

    /* renamed from: a */
    Boolean f6031a = true;

    /* renamed from: e */
    C1150w f6035e = new C1150w();

    /* renamed from: a */
    public synchronized void m1338a(Packet packet) {
        if (this.f6036f.f5981a) {
            return;
        }
        this.f6036f.f5986f.add(packet);
        notifyAll();
    }

    /* renamed from: a */
    public synchronized void m1339a() {
        notifyAll();
    }

    /* renamed from: b */
    public synchronized void m1337b() {
        try {
            if (this.f6036f.f5986f.isEmpty() && !this.f6036f.f5981a && !this.f6036f.f5982b) {
                wait(10000L);
            }
        } catch (InterruptedException e) {
        }
    }

    SendSocketOutStream(PlayerConnect playerConnect) {
        this.f6036f = playerConnect;
        this.f6032b = playerConnect.socket.getOutputStream();
        this.f6033c = new BufferedOutputStream(this.f6032b);
        this.f6034d = new DataOutputStream(this.f6033c);
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x01e7, code lost:
        r6.f6036f.f5981a = true;
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void run() {
        C1150w c1150w;
        GameEngine.m1033aq();
        Thread.currentThread().setName("SendWorker-" + this.f6036f.m1344g());
        while (true) {
            try {
                if (!this.f6031a.booleanValue() || this.f6036f.f5981a) {
                    break;
                }
                while (!this.f6036f.f5986f.isEmpty() && !this.f6036f.f5981a) {
                    Packet packet = (Packet) this.f6036f.f5986f.remove();
                    if (packet instanceof C0901ay) {
                        C0901ay c0901ay = (C0901ay) packet;
                        if (this.f6036f.f5992l == c0901ay.f5972f && this.f6036f.f5998r) {
                            GameOutputStream gameOutputStream = new GameOutputStream();
                            gameOutputStream.writeInt(c0901ay.f5973g);
                            packet = gameOutputStream.getPacket(176);
                        } else {
                            GameOutputStream gameOutputStream2 = new GameOutputStream();
                            gameOutputStream2.writeInt(c0901ay.f5973g);
                            gameOutputStream2.writeInt(c0901ay.f5972f.type);
                            gameOutputStream2.mo1378a(c0901ay.f5972f.bytes);
                            packet = gameOutputStream2.getPacket(175);
                        }
                        this.f6036f.f5992l = c0901ay.f5972f;
                    } else if (this.f6036f.f5997q) {
                        this.f6036f.f5992l = packet;
                    }
                    if (this.f6036f.socket instanceof RelayForwardedSocket) {
                        ((RelayForwardedSocket) this.f6036f.socket).m1322a(packet);
                    } else if (this.f6036f.socket instanceof ReliableSocket) {
                        boolean z = false;
                        if (packet.bytes.length > 500) {
                            c1150w = new C1150w(8 + packet.bytes.length);
                            z = true;
                        } else {
                            c1150w = this.f6035e;
                            c1150w.m485a();
                        }
                        boolean z2 = packet.f5959e;
                        DataOutputStream dataOutputStream = new DataOutputStream(c1150w);
                        dataOutputStream.writeInt(packet.bytes.length);
                        dataOutputStream.writeInt(packet.type);
                        dataOutputStream.write(packet.bytes);
                        dataOutputStream.flush();
                        dataOutputStream.close();
                        ((ReliableSocket) this.f6036f.socket).m5391a(c1150w.f7143a, 0, c1150w.m482b(), z2);
                        if (z) {
                            c1150w.close();
                        }
                    } else {
                        this.f6034d.writeInt(packet.bytes.length);
                        this.f6034d.writeInt(packet.type);
                        this.f6034d.write(packet.bytes);
                        this.f6034d.flush();
                    }
                    if (packet.f7548d != -1) {
                        try {
                            Thread.sleep(packet.f7548d);
                        } catch (InterruptedException e) {
                        }
                    }
                }
                if (this.f6036f.f5982b) {
                    break;
                }
                m1337b();
            } catch (IOException e2) {
                e2.printStackTrace();
                GameEngine.m1015b("network:SendWorker", e2.getMessage());
            }
        }
        this.f6036f.m1354a(false, true);
    }
}