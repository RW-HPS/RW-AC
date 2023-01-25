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

/* renamed from: com.corrodinggames.rts.gameFramework.j.af */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/j/af.class */
final class RunnableC0877af implements Runnable {

    /* renamed from: a */
    boolean f5845a;

    /* renamed from: b */
    DatagramSocket f5846b;

    /* renamed from: c */
    Timer f5847c;

    /* renamed from: d */
    final /* synthetic */ GameNetEngine f5848d;

    @Override // java.lang.Runnable
    public void run() {
        try {
            this.f5848d.printLog("starting socket for broadcast..");
            this.f5846b = new DatagramSocket((SocketAddress) null);
            this.f5846b.setReuseAddress(true);
            this.f5846b.bind(new InetSocketAddress(this.f5848d.f5777t));
            this.f5848d.printLog("reading..");
            byte[] bArr = new byte[1500];
            DatagramPacket datagramPacket = new DatagramPacket(bArr, bArr.length);
            TimerTask timerTask = new TimerTask() { // from class: com.corrodinggames.rts.gameFramework.j.af.1
                @Override // java.util.TimerTask, java.lang.Runnable
                public void run() {
                    if (!RunnableC0877af.this.f5848d.isServer) {
                        RunnableC0877af.this.m1427a();
                    }
                }
            };
            this.f5847c = new Timer();
            this.f5847c.scheduleAtFixedRate(timerTask, 20L, 5000L);
            while (this.f5845a) {
                this.f5846b.receive(datagramPacket);
                String str = new String(datagramPacket.getData(), datagramPacket.getOffset(), datagramPacket.getLength());
                this.f5848d.printLog("accepted udp socket..");
                GameInputStream gameInputStream = new GameInputStream(str);
                if (!gameInputStream.readString().equals("com.corrodinggames.rts")) {
                    this.f5848d.printLog("ignoring udp packet: MAGIC_GAME_ID doesn't match");
                } else {
                    int readInt = gameInputStream.readInt();
                    gameInputStream.readInt();
                    String readString = gameInputStream.readString();
                    if (readString.equals("ping")) {
                        this.f5848d.printLog("got ping");
                        if (this.f5848d.isServer) {
                            GameOutputStream gameOutputStream = new GameOutputStream();
                            gameOutputStream.writeString("com.corrodinggames.rts");
                            gameOutputStream.writeInt(this.f5848d.f5822e);
                            gameOutputStream.writeInt(0);
                            gameOutputStream.writeString("pong");
                            gameOutputStream.writeInt(this.f5848d.port);
                            String gameOutputStream2 = gameOutputStream.toString();
                            this.f5846b.send(new DatagramPacket(gameOutputStream2.getBytes(), gameOutputStream2.length(), datagramPacket.getAddress(), this.f5848d.f5777t));
                        } else {
                            this.f5848d.printLog("not server");
                        }
                    } else if (!readString.equals("pong")) {
                        this.f5848d.printLog("got pong");
                        ListRoomInfo listRoomInfo = new ListRoomInfo();
                        listRoomInfo.f6038a = true;
                        listRoomInfo.f6044g = gameInputStream.readInt();
                        listRoomInfo.f6040c = datagramPacket.getAddress().toString();
                        listRoomInfo.f6046j = VariableScope.nullOrMissingString + readInt;
                        this.f5848d.m1568a(listRoomInfo);
                    } else {
                        this.f5848d.printLog("ignoring udp packet: unknown mode:" + readString);
                    }
                }
            }
        } catch (SocketException e) {
            if (this.f5845a) {
                throw new RuntimeException(e);
            }
            e.printStackTrace();
        } catch (IOException e2) {
            throw new RuntimeException(e2);
        }
    }

    /* renamed from: a */
    public void m1427a() {
        this.f5848d.printLog("sending ping");
        if (this.f5846b == null) {
            this.f5848d.printLog("failed to send a broadcast ping: datagramSocket is null");
            return;
        }
        InetAddress m1538al = this.f5848d.m1538al();
        if (m1538al == null) {
            this.f5848d.printLog("failed to send a broadcast ping: could not get a broadcast address");
            return;
        }
        try {
            GameOutputStream gameOutputStream = new GameOutputStream();
            gameOutputStream.writeString("com.corrodinggames.rts");
            gameOutputStream.writeInt(this.f5848d.f5822e);
            gameOutputStream.writeInt(0);
            gameOutputStream.writeString("ping");
            String gameOutputStream2 = gameOutputStream.toString();
            this.f5848d.printLog("sending ping on :" + m1538al.toString());
            this.f5846b.send(new DatagramPacket(gameOutputStream2.getBytes(), gameOutputStream2.length(), m1538al, this.f5848d.f5777t));
        } catch (IOException e) {
            e.printStackTrace();
            this.f5848d.printLog("failed to send a broadcast ping, IOException");
        }
    }

    /* renamed from: b */
    public void m1426b() {
        this.f5845a = false;
        if (this.f5846b != null) {
            this.f5846b.close();
        }
        if (this.f5847c != null) {
            this.f5847c.cancel();
        }
    }
}