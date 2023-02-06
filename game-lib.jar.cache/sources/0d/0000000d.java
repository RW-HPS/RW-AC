package net.rudp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketAddress;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import net.rudp.a.ACKSegment;
import net.rudp.a.SYNSegment;
import net.rudp.a.Segment;

/* renamed from: a.a.d */
/* loaded from: game-lib.jar:a/a/d.class */
class d extends Thread {
    final /* synthetic */ ReliableServerSocket a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(ReliableServerSocket reliableServerSocket) {
        super("ReliableServerSocket");
        this.a = reliableServerSocket;
        setDaemon(true);
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        DatagramSocket datagramSocket;
        DatagramSocket datagramSocket2;
        DatagramSocket datagramSocket3;
        HashMap hashMap;
        HashMap hashMap2;
        HashMap hashMap3;
        HashMap hashMap4;
        e eVar;
        HashMap hashMap5;
        HashMap hashMap6;
        HashMap hashMap7;
        HashMap hashMap8;
        DatagramSocket datagramSocket4;
        HashMap hashMap9;
        HashMap hashMap10;
        HashMap hashMap11;
        HashMap hashMap12;
        c cVar;
        byte[] bArr = new byte[65535];
        while (true) {
            DatagramPacket datagramPacket = new DatagramPacket(bArr, bArr.length);
            try {
                try {
                    datagramSocket3 = this.a.d;
                    datagramSocket3.receive(datagramPacket);
                    SocketAddress socketAddress = datagramPacket.getSocketAddress();
                    hashMap = this.a.i;
                    synchronized (hashMap) {
                        hashMap2 = this.a.k;
                        a aVar = (a) hashMap2.get(socketAddress);
                        if (aVar == null) {
                            hashMap3 = this.a.i;
                            synchronized (hashMap3) {
                                hashMap4 = this.a.i;
                                eVar = (e) hashMap4.get(socketAddress);
                            }
                            if (eVar != null || (cVar = this.a.a) == null || cVar.a(socketAddress)) {
                                Segment parse = Segment.parse(datagramPacket.getData(), 0, datagramPacket.getLength());
                                if (!this.a.isClosed() && eVar == null) {
                                    if (parse instanceof SYNSegment) {
                                        long currentTimeMillis = System.currentTimeMillis();
                                        hashMap7 = this.a.j;
                                        if (hashMap7.size() > 0) {
                                            int i = 10000;
                                            hashMap10 = this.a.j;
                                            if (hashMap10.size() > 20) {
                                                i = 5000;
                                            }
                                            hashMap11 = this.a.j;
                                            if (hashMap11.size() > 200) {
                                                i = 3000;
                                            }
                                            hashMap12 = this.a.j;
                                            Iterator it = hashMap12.entrySet().iterator();
                                            while (it.hasNext()) {
                                                if (((g) ((Map.Entry) it.next()).getValue()).a + i < currentTimeMillis) {
                                                    it.remove();
                                                }
                                            }
                                        }
                                        hashMap8 = this.a.j;
                                        g gVar = (g) hashMap8.get(socketAddress);
                                        if (gVar != null) {
                                            gVar.b.a((SYNSegment) parse);
                                        } else {
                                            g gVar2 = new g();
                                            gVar2.a = currentTimeMillis;
                                            ReliableServerSocket reliableServerSocket = this.a;
                                            datagramSocket4 = this.a.d;
                                            gVar2.b = new e(reliableServerSocket, datagramSocket4, socketAddress);
                                            gVar2.b.a((SYNSegment) parse);
                                            hashMap9 = this.a.j;
                                            hashMap9.put(socketAddress, gVar2);
                                        }
                                    }
                                    if (parse instanceof ACKSegment) {
                                        hashMap5 = this.a.j;
                                        g gVar3 = (g) hashMap5.get(socketAddress);
                                        if (gVar3 != null) {
                                            e eVar2 = gVar3.b;
                                            if (!eVar2.b(parse)) {
                                                this.a.a("lightweight ack failed ack:" + parse.getAck());
                                            } else {
                                                this.a.a(socketAddress, eVar2);
                                                eVar = eVar2;
                                                hashMap6 = this.a.j;
                                                hashMap6.remove(socketAddress);
                                            }
                                        }
                                    }
                                }
                                if (eVar != null) {
                                    eVar.a(parse);
                                }
                            }
                        } else {
                            aVar.a(datagramPacket.getData(), datagramPacket.getLength());
                        }
                    }
                } catch (IOException e) {
                    ReliableServerSocket reliableServerSocket2 = this.a;
                    StringBuilder append = new StringBuilder().append("IOException receiving packet:").append(e.getMessage()).append(" isConnected:");
                    datagramSocket = this.a.d;
                    reliableServerSocket2.a(append.append(datagramSocket.isConnected()).toString());
                    datagramSocket2 = this.a.d;
                    if (!datagramSocket2.isConnected()) {
                        this.a.close();
                    }
                    throw new IOException(e);
                    break;
                }
            } catch (IOException e2) {
                if (!this.a.isClosed()) {
                    this.a.a("IOException client " + ((Object) null) + " - " + e2.getMessage());
                } else {
                    return;
                }
            } catch (IllegalArgumentException e3) {
                if (!this.a.isClosed()) {
                    this.a.a("IllegalArgumentException " + ((Object) null) + " - " + e3.getMessage());
                } else {
                    return;
                }
            }
        }
    }
}