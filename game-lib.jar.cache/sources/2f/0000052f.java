package com.corrodinggames.rts.gameFramework.net;

import com.corrodinggames.rts.gameFramework.GameEngine;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.IOException;
import java.net.SocketException;

/* renamed from: com.corrodinggames.rts.gameFramework.j.d */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/j/d.class */
final class ReciveSocketInStream implements Runnable {
    Boolean a;
    final /* synthetic */ PlayerConnect b;

    private ReciveSocketInStream(PlayerConnect playerConnect) {
        this.b = playerConnect;
        this.a = true;
    }

    @Override // java.lang.Runnable
    public void run() {
        String message;
        GameEngine.aq();
        Thread.currentThread().setName("ReceiveWorker-" + this.b.g());
        try {
            a();
        } catch (EOFException e) {
            this.b.a("network:ReceiveWorker: EOF reading packet", e);
        } catch (IOException e2) {
            if (!this.b.a) {
                e2.printStackTrace();
            }
            if (GameEngine.aZ && (e2 instanceof SocketException) && !this.b.a) {
                GameEngine gameEngine = GameEngine.getGameEngine();
                if (!gameEngine.netEngine.isServer && gameEngine.netEngine.aW && (message = e2.getMessage()) != null && message.contains("EBADF")) {
                    gameEngine.i("Warning: This disconnect likely due to iOS removing sockets of background apps. Avoid minimising the game in multiplayer. Note: Games can be rejoined.");
                }
            }
            this.b.c("network:ReceiveWorker: " + e2.getMessage());
        } catch (OutOfMemoryError e3) {
            GameEngine.c(e3);
            this.b.c("network:ReceiveWorker OutOfMemoryError: " + e3.getMessage());
        }
        this.b.a(true, false);
    }

    void a() {
        GameNetEngine gameNetEngine;
        GameNetEngine gameNetEngine2;
        GameNetEngine gameNetEngine3;
        DataInputStream dataInputStream = new DataInputStream(this.b.socket.getInputStream());
        while (this.a.booleanValue() && !this.b.a && !this.b.socket.isClosed()) {
            int readInt = dataInputStream.readInt();
            int readInt2 = dataInputStream.readInt();
            if (readInt > 20000000) {
                this.b.b("readData(): new packet of type:" + readInt2 + " has size of:" + readInt);
            }
            if (readInt > 10000) {
                int i = 50000000;
                gameNetEngine3 = this.b.gameNetEngine;
                if (gameNetEngine3.isServer) {
                    i = 1000000;
                }
                if (!this.b.p) {
                    i = 10000;
                }
                if (readInt > i) {
                    this.b.b("Requested packet too large rejecting (max:" + i + ")");
                    return;
                }
            }
            if (readInt < 0) {
                this.b.b("Requested packet negative size:" + readInt + " rejecting");
                return;
            }
            Packet packet = new Packet(readInt2);
            packet.bytes = new byte[readInt];
            this.b.V = 0;
            this.b.U = readInt;
            int i2 = 0;
            packet.playerConnect = this.b;
            while (i2 < readInt && !this.b.a) {
                int read = dataInputStream.read(packet.bytes, i2, readInt - i2);
                if (read == -1) {
                    this.b.b("we got to the end of the stream?!?");
                    return;
                }
                i2 += read;
                this.b.P++;
                this.b.V = i2;
            }
            this.b.U = 0;
            this.b.V = 0;
            if (!this.b.a) {
                if (packet.type > 100) {
                    gameNetEngine = this.b.gameNetEngine;
                    gameNetEngine.resolveCommandPacket(packet);
                } else {
                    gameNetEngine2 = this.b.gameNetEngine;
                    gameNetEngine2.aN.add(packet);
                }
            }
        }
    }
}