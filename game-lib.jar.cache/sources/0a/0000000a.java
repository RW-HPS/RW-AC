package net.rudp;

import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketAddress;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.util.ArrayList;
import java.util.HashMap;

/* renamed from: a.a.b */
/* loaded from: game-lib.jar:a/a/b.class */
public class RUDPServerSocket extends ServerSocket {

    /* renamed from: a */
    c f9a;
    private DatagramSocket d;
    private int e;
    private int f;
    private boolean g;
    private ArrayList h;
    private HashMap i;
    private HashMap j;
    private HashMap k;
    long b;
    int c;
    private s l;

    static /* synthetic */ DatagramSocket a(RUDPServerSocket rUDPServerSocket) {
        return rUDPServerSocket.d;
    }

    static /* synthetic */ void a(RUDPServerSocket rUDPServerSocket, String str) {
        rUDPServerSocket.a(str);
    }

    static /* synthetic */ HashMap b(RUDPServerSocket rUDPServerSocket) {
        return rUDPServerSocket.i;
    }

    static /* synthetic */ HashMap c(RUDPServerSocket rUDPServerSocket) {
        return rUDPServerSocket.k;
    }

    static /* synthetic */ HashMap d(RUDPServerSocket rUDPServerSocket) {
        return rUDPServerSocket.j;
    }

    static /* synthetic */ void a(RUDPServerSocket rUDPServerSocket, SocketAddress socketAddress, e eVar) {
        rUDPServerSocket.a(socketAddress, eVar);
    }

    static /* synthetic */ ArrayList e(RUDPServerSocket rUDPServerSocket) {
        return rUDPServerSocket.h;
    }

    static /* synthetic */ e a(RUDPServerSocket rUDPServerSocket, SocketAddress socketAddress) {
        return rUDPServerSocket.a(socketAddress);
    }

    public RUDPServerSocket() {
        this(new DatagramSocket((SocketAddress) null), 0);
    }

    public RUDPServerSocket(int i, int i2, InetAddress inetAddress, boolean z) {
        DatagramSocket datagramSocket = new DatagramSocket((SocketAddress) null);
        datagramSocket.setReuseAddress(z);
        datagramSocket.bind(new InetSocketAddress(inetAddress, i));
        a(datagramSocket, i2);
    }

    public RUDPServerSocket(DatagramSocket datagramSocket, int i) {
        a(datagramSocket, i);
    }

    public void a(DatagramSocket datagramSocket, int i) {
        if (datagramSocket == null) {
            throw new NullPointerException("sock");
        }
        this.d = datagramSocket;
        this.f = i <= 0 ? 50 : i;
        this.h = new ArrayList(this.f);
        this.i = new HashMap();
        this.j = new HashMap();
        this.k = new HashMap();
        this.l = new f(this);
        this.e = 0;
        this.g = false;
        new d(this).start();
    }

    public void a(c cVar) {
        this.f9a = cVar;
    }

    public Socket accept() {
        Socket socket;
        if (isClosed()) {
            throw new SocketException("Socket is closed");
        }
        synchronized (this.h) {
            do {
                if (this.h.isEmpty()) {
                    try {
                        if (this.e == 0) {
                            this.h.wait();
                        } else {
                            long currentTimeMillis = System.currentTimeMillis();
                            this.h.wait(this.e);
                            if (System.currentTimeMillis() - currentTimeMillis >= this.e) {
                                throw new SocketTimeoutException();
                                break;
                            }
                        }
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                } else {
                    socket = (Socket) this.h.remove(0);
                }
            } while (!isClosed());
            throw new SocketException("Socket is closed");
        }
        return socket;
    }

    public synchronized void bind(SocketAddress socketAddress) {
        bind(socketAddress, 0);
    }

    public synchronized void bind(SocketAddress socketAddress, int i) {
        if (isClosed()) {
            throw new SocketException("Socket is closed");
        }
        this.d.setReuseAddress(true);
        this.d.bind(socketAddress);
    }

    public synchronized void close() {
        if (isClosed()) {
            return;
        }
        this.g = true;
        synchronized (this.h) {
            this.h.clear();
            this.h.notify();
        }
        synchronized (this.i) {
            if (this.i.isEmpty()) {
                this.d.close();
            }
        }
    }

    public InetAddress getInetAddress() {
        return this.d.getInetAddress();
    }

    public int getLocalPort() {
        return this.d.getLocalPort();
    }

    public SocketAddress getLocalSocketAddress() {
        return this.d.getLocalSocketAddress();
    }

    public boolean isBound() {
        return this.d.isBound();
    }

    public boolean isClosed() {
        return this.g;
    }

    public void setSoTimeout(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("timeout < 0");
        }
        this.e = i;
    }

    public int getSoTimeout() {
        return this.e;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(SocketAddress socketAddress, e eVar) {
        synchronized (this.i) {
            eVar.a(this.l);
            this.i.put(socketAddress, eVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public e a(SocketAddress socketAddress) {
        e eVar;
        synchronized (this.i) {
            eVar = (e) this.i.remove(socketAddress);
            if (this.i.isEmpty() && isClosed()) {
                this.d.close();
            }
        }
        return eVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str) {
        if (this.b + 5000 < System.currentTimeMillis()) {
            this.b = System.currentTimeMillis();
            this.c = 0;
        }
        if (this.c > 20) {
            return;
        }
        this.c++;
        System.out.println(str);
    }
}