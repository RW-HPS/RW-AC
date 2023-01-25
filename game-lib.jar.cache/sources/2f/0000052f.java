package com.corrodinggames.rts.gameFramework.net;

import com.corrodinggames.rts.gameFramework.GameEngine;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.IOException;
import java.net.SocketException;

/* renamed from: com.corrodinggames.rts.gameFramework.j.d */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/j/d.class */
final class ReciveSocketInStream implements Runnable {

    /* renamed from: a */
    Boolean f6029a;

    /* renamed from: b */
    final /* synthetic */ PlayerConnect f6030b;

    private ReciveSocketInStream(PlayerConnect playerConnect) {
        this.f6030b = playerConnect;
        this.f6029a = true;
    }

    @Override // java.lang.Runnable
    public void run() {
        String message;
        GameEngine.m1033aq();
        Thread.currentThread().setName("ReceiveWorker-" + this.f6030b.m1344g());
        try {
            m1340a();
        } catch (EOFException e) {
            this.f6030b.m1355a("network:ReceiveWorker: EOF reading packet", e);
        } catch (IOException e2) {
            if (!this.f6030b.f5981a) {
                e2.printStackTrace();
            }
            if (GameEngine.f6333aZ && (e2 instanceof SocketException) && !this.f6030b.f5981a) {
                GameEngine gameEngine = GameEngine.getGameEngine();
                if (!gameEngine.netEngine.isServer && gameEngine.netEngine.f5789aW && (message = e2.getMessage()) != null && message.contains("EBADF")) {
                    gameEngine.m986i("Warning: This disconnect likely due to iOS removing sockets of background apps. Avoid minimising the game in multiplayer. Note: Games can be rejoined.");
                }
            }
            this.f6030b.m1349c("network:ReceiveWorker: " + e2.getMessage());
        } catch (OutOfMemoryError e3) {
            GameEngine.m1007c(e3);
            this.f6030b.m1349c("network:ReceiveWorker OutOfMemoryError: " + e3.getMessage());
        }
        PlayerConnect.m1357a(this.f6030b, true, false);
    }

    /* renamed from: a */
    void m1340a() {
        DataInputStream dataInputStream = new DataInputStream(this.f6030b.socket.getInputStream());
        while (this.f6029a.booleanValue() && !this.f6030b.f5981a && !this.f6030b.socket.isClosed()) {
            int readInt = dataInputStream.readInt();
            int readInt2 = dataInputStream.readInt();
            if (readInt > 20000000) {
                this.f6030b.m1351b("readData(): new packet of type:" + readInt2 + " has size of:" + readInt);
            }
            if (readInt > 10000) {
                int i = 50000000;
                if (PlayerConnect.m1358a(this.f6030b).isServer) {
                    i = 1000000;
                }
                if (!this.f6030b.f5996p) {
                    i = 10000;
                }
                if (readInt > i) {
                    this.f6030b.m1351b("Requested packet too large rejecting (max:" + i + ")");
                    return;
                }
            }
            if (readInt < 0) {
                this.f6030b.m1351b("Requested packet negative size:" + readInt + " rejecting");
                return;
            }
            Packet packet = new Packet(readInt2);
            packet.bytes = new byte[readInt];
            this.f6030b.f6028V = 0;
            this.f6030b.f6027U = readInt;
            int i2 = 0;
            packet.playerConnect = this.f6030b;
            while (i2 < readInt && !this.f6030b.f5981a) {
                int read = dataInputStream.read(packet.bytes, i2, readInt - i2);
                if (read == -1) {
                    this.f6030b.m1351b("we got to the end of the stream?!?");
                    return;
                }
                i2 += read;
                this.f6030b.f6022P++;
                this.f6030b.f6028V = i2;
            }
            this.f6030b.f6027U = 0;
            this.f6030b.f6028V = 0;
            if (!this.f6030b.f5981a) {
                if (packet.type > 100) {
                    PlayerConnect.m1358a(this.f6030b).resolveCommandPacket(packet);
                } else {
                    PlayerConnect.m1358a(this.f6030b).f5780aN.add(packet);
                }
            }
        }
    }
}