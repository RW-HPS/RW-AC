package com.corrodinggames.rts.gameFramework.net;

import com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.SocketAddress;
import java.net.SocketException;
import java.util.Timer;
import java.util.TimerTask;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.corrodinggames.rts.gameFramework.j.af */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/j/af.class */
public final class af implements Runnable {

    /* renamed from: a */
    boolean f560a;
    DatagramSocket b;
    Timer c;
    final /* synthetic */ GameNetEngine d;

    @Override // java.lang.Runnable
    public void run() {
        try {
            this.d.printLog("starting socket for broadcast..");
            this.b = new DatagramSocket((SocketAddress) null);
            this.b.setReuseAddress(true);
            this.b.bind(new InetSocketAddress(this.d.t));
            this.d.printLog("reading..");
            byte[] bArr = new byte[1500];
            DatagramPacket datagramPacket = new DatagramPacket(bArr, bArr.length);
            TimerTask timerTask = new TimerTask() { // from class: com.corrodinggames.rts.gameFramework.j.af.1
                @Override // java.util.TimerTask, java.lang.Runnable
                public void run() {
                    if (!af.this.d.isServer) {
                        af.this.a();
                    }
                }
            };
            this.c = new Timer();
            this.c.scheduleAtFixedRate(timerTask, 20L, 5000L);
            while (this.f560a) {
                this.b.receive(datagramPacket);
                String str = new String(datagramPacket.getData(), datagramPacket.getOffset(), datagramPacket.getLength());
                this.d.printLog("accepted udp socket..");
                GameInputStream gameInputStream = new GameInputStream(str);
                if (!gameInputStream.readString().equals("com.corrodinggames.rts")) {
                    this.d.printLog("ignoring udp packet: MAGIC_GAME_ID doesn't match");
                } else {
                    int readInt = gameInputStream.readInt();
                    gameInputStream.readInt();
                    String readString = gameInputStream.readString();
                    if (readString.equals("ping")) {
                        this.d.printLog("got ping");
                        if (this.d.isServer) {
                            GameOutputStream gameOutputStream = new GameOutputStream();
                            gameOutputStream.writeString("com.corrodinggames.rts");
                            gameOutputStream.writeInt(this.d.e);
                            gameOutputStream.writeInt(0);
                            gameOutputStream.writeString("pong");
                            gameOutputStream.writeInt(this.d.port);
                            String gameOutputStream2 = gameOutputStream.toString();
                            this.b.send(new DatagramPacket(gameOutputStream2.getBytes(), gameOutputStream2.length(), datagramPacket.getAddress(), this.d.t));
                        } else {
                            this.d.printLog("not server");
                        }
                    } else if (!readString.equals("pong")) {
                        this.d.printLog("got pong");
                        ListRoomInfo listRoomInfo = new ListRoomInfo();
                        listRoomInfo.f581a = true;
                        listRoomInfo.g = gameInputStream.readInt();
                        listRoomInfo.c = datagramPacket.getAddress().toString();
                        listRoomInfo.j = VariableScope.nullOrMissingString + readInt;
                        this.d.a(listRoomInfo);
                    } else {
                        this.d.printLog("ignoring udp packet: unknown mode:" + readString);
                    }
                }
            }
        } catch (SocketException e) {
            if (this.f560a) {
                throw new RuntimeException(e);
            }
            e.printStackTrace();
        } catch (IOException e2) {
            throw new RuntimeException(e2);
        }
    }

    public void a() {
        this.d.printLog("sending ping");
        if (this.b == null) {
            this.d.printLog("failed to send a broadcast ping: datagramSocket is null");
            return;
        }
        InetAddress al = this.d.al();
        if (al == null) {
            this.d.printLog("failed to send a broadcast ping: could not get a broadcast address");
            return;
        }
        try {
            GameOutputStream gameOutputStream = new GameOutputStream();
            gameOutputStream.writeString("com.corrodinggames.rts");
            gameOutputStream.writeInt(this.d.e);
            gameOutputStream.writeInt(0);
            gameOutputStream.writeString("ping");
            String gameOutputStream2 = gameOutputStream.toString();
            this.d.printLog("sending ping on :" + al.toString());
            this.b.send(new DatagramPacket(gameOutputStream2.getBytes(), gameOutputStream2.length(), al, this.d.t));
        } catch (IOException e) {
            e.printStackTrace();
            this.d.printLog("failed to send a broadcast ping, IOException");
        }
    }

    public void b() {
        this.f560a = false;
        if (this.b != null) {
            this.b.close();
        }
        if (this.c != null) {
            this.c.cancel();
        }
    }
}