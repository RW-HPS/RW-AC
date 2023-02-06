package com.corrodinggames.rts.gameFramework.net;

import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.utility.w;
import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import net.rudp.ReliableSocket;

/* renamed from: com.corrodinggames.rts.gameFramework.j.e */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/j/e.class */
final class SendSocketOutStream implements Runnable {
    OutputStream b;
    BufferedOutputStream c;
    DataOutputStream d;
    final /* synthetic */ PlayerConnect f;
    Boolean a = true;
    w e = new w();

    public synchronized void a(Packet packet) {
        if (this.f.a) {
            return;
        }
        this.f.f.add(packet);
        notifyAll();
    }

    public synchronized void a() {
        notifyAll();
    }

    public synchronized void b() {
        try {
            if (this.f.f.isEmpty() && !this.f.a && !this.f.b) {
                wait(10000L);
            }
        } catch (InterruptedException e) {
        }
    }

    SendSocketOutStream(PlayerConnect playerConnect) {
        this.f = playerConnect;
        this.b = playerConnect.socket.getOutputStream();
        this.c = new BufferedOutputStream(this.b);
        this.d = new DataOutputStream(this.c);
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x01e7, code lost:
        r6.f.a = true;
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void run() {
        w wVar;
        GameEngine.aq();
        Thread.currentThread().setName("SendWorker-" + this.f.g());
        while (true) {
            try {
                if (!this.a.booleanValue() || this.f.a) {
                    break;
                }
                while (!this.f.f.isEmpty() && !this.f.a) {
                    Packet packet = (Packet) this.f.f.remove();
                    if (packet instanceof Unk_Packet) {
                        Unk_Packet unk_Packet = (Unk_Packet) packet;
                        if (this.f.l == unk_Packet.f && this.f.r) {
                            GameOutputStream gameOutputStream = new GameOutputStream();
                            gameOutputStream.writeInt(unk_Packet.g);
                            packet = gameOutputStream.getPacket(176);
                        } else {
                            GameOutputStream gameOutputStream2 = new GameOutputStream();
                            gameOutputStream2.writeInt(unk_Packet.g);
                            gameOutputStream2.writeInt(unk_Packet.f.type);
                            gameOutputStream2.a(unk_Packet.f.bytes);
                            packet = gameOutputStream2.getPacket(175);
                        }
                        this.f.l = unk_Packet.f;
                    } else if (this.f.q) {
                        this.f.l = packet;
                    }
                    if (this.f.socket instanceof RelayForwardedSocket) {
                        ((RelayForwardedSocket) this.f.socket).a(packet);
                    } else if (this.f.socket instanceof ReliableSocket) {
                        boolean z = false;
                        if (packet.bytes.length > 500) {
                            wVar = new w(8 + packet.bytes.length);
                            z = true;
                        } else {
                            wVar = this.e;
                            wVar.a();
                        }
                        boolean z2 = packet.e;
                        DataOutputStream dataOutputStream = new DataOutputStream(wVar);
                        dataOutputStream.writeInt(packet.bytes.length);
                        dataOutputStream.writeInt(packet.type);
                        dataOutputStream.write(packet.bytes);
                        dataOutputStream.flush();
                        dataOutputStream.close();
                        ((ReliableSocket) this.f.socket).a(wVar.a, 0, wVar.b(), z2);
                        if (z) {
                            wVar.close();
                        }
                    } else {
                        this.d.writeInt(packet.bytes.length);
                        this.d.writeInt(packet.type);
                        this.d.write(packet.bytes);
                        this.d.flush();
                    }
                    if (packet.f0d != -1) {
                        try {
                            Thread.sleep(packet.f0d);
                        } catch (InterruptedException e) {
                        }
                    }
                }
                if (this.f.b) {
                    break;
                }
                b();
            } catch (IOException e2) {
                e2.printStackTrace();
                GameEngine.b("network:SendWorker", e2.getMessage());
            }
        }
        this.f.a(false, true);
    }
}