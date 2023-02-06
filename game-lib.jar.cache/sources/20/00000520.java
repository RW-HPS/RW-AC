package com.corrodinggames.rts.gameFramework.net;

import com.corrodinggames.rts.gameFramework.GameEngine;
import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketAddress;
import java.util.ArrayList;
import java.util.Iterator;
import net.rudp.ReliableServerSocket;
import net.rudp.c;

/* renamed from: com.corrodinggames.rts.gameFramework.j.ao */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/j/ao.class */
public class ServerAcceptRunnable implements Runnable {
    public static boolean b = true;

    /* renamed from: r */
    private final GameNetEngine netEngine;

    /* renamed from: d */
    ServerSocket serverSocket;

    /* renamed from: e */
    int port;
    boolean f;
    boolean o;
    boolean p;
    boolean q;
    public final boolean a = false;
    volatile boolean c = true;
    long g = -1;
    final boolean h = false;
    final boolean i = true;
    final Object j = new Object();
    ArrayList k = new ArrayList();
    final Object l = new Object();
    int m = 0;
    int n = 0;

    ServerAcceptRunnable(GameNetEngine gameNetEngine) {
        this.netEngine = gameNetEngine;
    }

    public boolean a(InetAddress inetAddress, boolean z) {
        if (inetAddress == null) {
            GameEngine.m5e("isIpAllowed: inetAddress==null");
            return true;
        } else if (!b) {
            return true;
        } else {
            long currentTimeMillis = System.currentTimeMillis();
            if (currentTimeMillis > this.g + 60000) {
                this.g = currentTimeMillis;
                synchronized (this.l) {
                    this.k.clear();
                }
                this.m = 0;
                this.n = 0;
                this.o = false;
                this.p = false;
                this.q = false;
            }
            synchronized (this.l) {
                boolean z2 = false;
                Iterator it = this.k.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    ServerAcceptData serverAcceptData = (ServerAcceptData) it.next();
                    if (inetAddress.equals(serverAcceptData.a)) {
                        serverAcceptData.b++;
                        int i = 30;
                        if (this.n > 100) {
                            i = 10;
                        }
                        if (this.n > 250) {
                            i = 5;
                        }
                        if (serverAcceptData.b > i) {
                            if (!serverAcceptData.c) {
                                serverAcceptData.c = true;
                                GameEngine.m5e("DOS: Too many attempts:" + serverAcceptData.b + " ip:" + inetAddress.toString());
                            }
                            if (serverAcceptData.b > 300 && !serverAcceptData.d) {
                                serverAcceptData.d = true;
                                GameEngine.m5e("DOS: Excessive attempts:" + serverAcceptData.b + " ip:" + inetAddress.toString());
                            }
                            return false;
                        }
                        z2 = true;
                    }
                }
                if (!z2) {
                    if (z) {
                        this.m++;
                    }
                    if (this.k.size() > 200) {
                        ServerAcceptData serverAcceptData2 = null;
                        Iterator it2 = this.k.iterator();
                        while (it2.hasNext()) {
                            ServerAcceptData serverAcceptData3 = (ServerAcceptData) it2.next();
                            if (serverAcceptData2 == null || serverAcceptData2.b > serverAcceptData3.b) {
                                serverAcceptData2 = serverAcceptData3;
                            }
                        }
                        if (serverAcceptData2 != null) {
                            this.k.remove(serverAcceptData2);
                        }
                    }
                    ServerAcceptData serverAcceptData4 = new ServerAcceptData(this);
                    serverAcceptData4.a = inetAddress;
                    this.k.add(serverAcceptData4);
                }
                if (this.m > 500) {
                    if (!this.p) {
                        this.p = true;
                        GameEngine.m5e("DOS: Too many unique attempts: " + this.m + ". udp:" + this.f);
                        return false;
                    }
                    return false;
                }
                int i2 = 0;
                int i3 = 0;
                Iterator it3 = this.netEngine.socketList.iterator();
                while (it3.hasNext()) {
                    PlayerConnect playerConnect = (PlayerConnect) it3.next();
                    i3++;
                    if (playerConnect.e != null && inetAddress.equals(playerConnect.e)) {
                        i2++;
                    }
                }
                int i4 = 20;
                if (i3 > 150) {
                    i4 = 10;
                }
                if (i3 > 200) {
                    i4 = 5;
                }
                if (i2 > i4) {
                    if (!this.q) {
                        this.q = true;
                        GameEngine.m5e("DOS: Too open connections from same ip:" + inetAddress.toString() + " (count:" + i2 + ") max:" + i4);
                        return false;
                    }
                    return false;
                } else if (i3 > 300) {
                    if (!this.o) {
                        this.o = true;
                        GameEngine.m5e("DOS: Too open connections locking down:" + inetAddress.toString() + " (count:" + i3 + ")");
                        return false;
                    }
                    return false;
                } else {
                    this.n++;
                    return true;
                }
            }
        }
    }

    public void a() {
        this.netEngine.printLog("Recreating server socket " + (this.f ? "udp" : "tcp"));
        synchronized (this.j) {
            if (this.serverSocket != null) {
                try {
                    this.serverSocket.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                this.serverSocket = null;
            }
            if (!this.c) {
                throw new IOException("recreate on non-active socket");
            }
            startServerSocket(this.f);
        }
    }

    /* renamed from: a */
    public void startServerSocket(boolean udp) {
        this.port = this.netEngine.port;
        this.netEngine.printLog("starting socket.. " + (udp ? "udp" : "tcp") + " port: " + this.port);
        this.f = udp;
        if (!udp) {
            this.serverSocket = new ServerSocket(this.port);
            return;
        }
        ReliableServerSocket reliableServerSocket = new ReliableServerSocket(this.netEngine.port, 0, null, true);
        reliableServerSocket.a(new c() { // from class: com.corrodinggames.rts.gameFramework.j.ao.1
            @Override // net.rudp.c
            public boolean a(SocketAddress socketAddress) {
                if (socketAddress instanceof InetSocketAddress) {
                    return ServerAcceptRunnable.this.a(((InetSocketAddress) socketAddress).getAddress(), false);
                }
                GameEngine.m5e("AcceptFilter: Unhandled SocketAddress type:" + socketAddress.getClass().getName());
                return true;
            }
        });
        this.serverSocket = reliableServerSocket;
    }

    @Override // java.lang.Runnable
    public void run() {
        GameEngine.aq();
        Thread.currentThread().setName("NewConnectionWorker-" + (this.f ? "udp" : "tcp") + " - " + this.port);
        int i = 0;
        int i2 = 0;
        this.netEngine.printLog("reading..");
        while (this.c) {
            try {
                Socket accept = this.serverSocket.accept();
                try {
                    accept.setTcpNoDelay(true);
                    accept.setSoTimeout(15000);
                    String ip = "<unknown>";
                    InetAddress inetAddress = accept.getInetAddress();
                    if (inetAddress != null) {
                        ip = inetAddress.getHostAddress();
                    }
                    if (!a(inetAddress, true)) {
                        accept.close();
                    } else {
                        PlayerConnect playerConnect = new PlayerConnect(this.netEngine, accept);
                        String str = "Accepted new connection id:" + playerConnect.connectIndex + ".. (ip:" + ip + ")";
                        if (this.f) {
                            str = str + " (udp)";
                        }
                        this.netEngine.printLog(str);
                        playerConnect.h = this.f;
                        playerConnect.e = inetAddress;
                        playerConnect.d();
                        this.netEngine.socketList.add(playerConnect);
                    }
                } catch (IOException e) {
                    GameEngine.m5e("Got IOException on new player connection");
                    e.printStackTrace();
                }
            } catch (IOException e2) {
                if (this.c) {
                    GameEngine gameEngine = GameEngine.getGameEngine();
                    i++;
                    GameEngine.m5e("ServerSocket-accept(" + (this.f ? "udp" : "tcp") + ") failed: " + e2.getMessage() + " (closed:" + this.serverSocket.isClosed() + ")");
                    if (i > 100) {
                        GameEngine.m5e("Too many server socket fails");
                        b();
                        return;
                    }
                    try {
                        a();
                        if (i2 < 3 && gameEngine.netEngine.D() > 0) {
                            String str2 = "Warning: server socket got closed and needed to be recreated, players were likely disconnected (but can rejoin).";
                            if (GameEngine.aZ) {
                                str2 = str2 + "\n This likely due to iOS removing sockets of background apps. Avoid minimising the game when hosting.";
                            }
                            GameEngine.getGameEngine().i(str2);
                            i2++;
                        }
                    } catch (IOException e3) {
                        e3.printStackTrace();
                        GameEngine.getGameEngine().i("Warning server socket got closed and could not be recreated");
                        b();
                        return;
                    }
                } else {
                    GameEngine.m5e("ServerSocket-accept(" + (this.f ? "udp" : "tcp") + "): Got expected IOException after closed socket");
                    return;
                }
            }
        }
    }

    public void b() {
        synchronized (this.j) {
            this.c = false;
            if (this.serverSocket != null) {
                try {
                    this.serverSocket.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                this.serverSocket = null;
            }
        }
    }
}