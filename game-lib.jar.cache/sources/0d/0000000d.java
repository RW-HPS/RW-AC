package a.a;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketAddress;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: game-lib.jar:a/a/d.class */
public class d extends Thread {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ RUDPServerSocket f10a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(RUDPServerSocket rUDPServerSocket) {
        super("ReliableServerSocket");
        this.f10a = rUDPServerSocket;
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
                    datagramSocket3 = this.f10a.d;
                    datagramSocket3.receive(datagramPacket);
                    SocketAddress socketAddress = datagramPacket.getSocketAddress();
                    hashMap = this.f10a.i;
                    synchronized (hashMap) {
                        hashMap2 = this.f10a.k;
                        a aVar = (a) hashMap2.get(socketAddress);
                        if (aVar == null) {
                            hashMap3 = this.f10a.i;
                            synchronized (hashMap3) {
                                hashMap4 = this.f10a.i;
                                eVar = (e) hashMap4.get(socketAddress);
                            }
                            if (eVar != null || (cVar = this.f10a.f9a) == null || cVar.a(socketAddress)) {
                                a.a.a.h b = a.a.a.h.b(datagramPacket.getData(), 0, datagramPacket.getLength());
                                if (!this.f10a.isClosed() && eVar == null) {
                                    if (b instanceof a.a.a.g) {
                                        long currentTimeMillis = System.currentTimeMillis();
                                        hashMap7 = this.f10a.j;
                                        if (hashMap7.size() > 0) {
                                            int i = 10000;
                                            hashMap10 = this.f10a.j;
                                            if (hashMap10.size() > 20) {
                                                i = 5000;
                                            }
                                            hashMap11 = this.f10a.j;
                                            if (hashMap11.size() > 200) {
                                                i = 3000;
                                            }
                                            hashMap12 = this.f10a.j;
                                            Iterator it = hashMap12.entrySet().iterator();
                                            while (it.hasNext()) {
                                                if (((g) ((Map.Entry) it.next()).getValue()).f13a + i < currentTimeMillis) {
                                                    it.remove();
                                                }
                                            }
                                        }
                                        hashMap8 = this.f10a.j;
                                        g gVar = (g) hashMap8.get(socketAddress);
                                        if (gVar != null) {
                                            gVar.b.a((a.a.a.g) b);
                                        } else {
                                            g gVar2 = new g();
                                            gVar2.f13a = currentTimeMillis;
                                            RUDPServerSocket rUDPServerSocket = this.f10a;
                                            datagramSocket4 = this.f10a.d;
                                            gVar2.b = new e(rUDPServerSocket, datagramSocket4, socketAddress);
                                            gVar2.b.a((a.a.a.g) b);
                                            hashMap9 = this.f10a.j;
                                            hashMap9.put(socketAddress, gVar2);
                                        }
                                    }
                                    if (b instanceof a.a.a.a) {
                                        hashMap5 = this.f10a.j;
                                        g gVar3 = (g) hashMap5.get(socketAddress);
                                        if (gVar3 != null) {
                                            e eVar2 = gVar3.b;
                                            if (!eVar2.b(b)) {
                                                this.f10a.a("lightweight ack failed ack:" + b.n());
                                            } else {
                                                this.f10a.a(socketAddress, eVar2);
                                                eVar = eVar2;
                                                hashMap6 = this.f10a.j;
                                                hashMap6.remove(socketAddress);
                                            }
                                        }
                                    }
                                }
                                if (eVar != null) {
                                    eVar.a(b);
                                }
                            }
                        } else {
                            aVar.a(datagramPacket.getData(), datagramPacket.getLength());
                        }
                    }
                } catch (IOException e) {
                    RUDPServerSocket rUDPServerSocket2 = this.f10a;
                    StringBuilder append = new StringBuilder().append("IOException receiving packet:").append(e.getMessage()).append(" isConnected:");
                    datagramSocket = this.f10a.d;
                    rUDPServerSocket2.a(append.append(datagramSocket.isConnected()).toString());
                    datagramSocket2 = this.f10a.d;
                    if (!datagramSocket2.isConnected()) {
                        this.f10a.close();
                    }
                    throw new IOException(e);
                    break;
                }
            } catch (IOException e2) {
                if (!this.f10a.isClosed()) {
                    this.f10a.a("IOException client " + ((Object) null) + " - " + e2.getMessage());
                } else {
                    return;
                }
            } catch (IllegalArgumentException e3) {
                if (!this.f10a.isClosed()) {
                    this.f10a.a("IllegalArgumentException " + ((Object) null) + " - " + e3.getMessage());
                } else {
                    return;
                }
            }
        }
    }
}