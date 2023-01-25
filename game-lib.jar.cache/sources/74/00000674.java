package com.corrodinggames.rts.java.steam;

import com.codedisaster.steamworks.SteamID;
import com.corrodinggames.rts.gameFramework.GameEngine;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.SocketAddress;
import java.nio.channels.SocketChannel;

/* renamed from: com.corrodinggames.rts.java.c.k */
/* loaded from: game-lib.jar:com/corrodinggames/rts/java/c/k.class */
public class SteamSocket extends Socket {

    /* renamed from: a */
    SteamEngine f7349a;

    /* renamed from: b */
    boolean f7350b = false;

    /* renamed from: c */
    SteamSocketInStream f7351c = new SteamSocketInStream(this);

    /* renamed from: d */
    SteamSocketOutStream f7352d = new SteamSocketOutStream(this);

    /* renamed from: e */
    SteamID f7353e;

    public SteamSocket(SteamEngine steamEngine, SteamID steamID) {
        this.f7349a = steamEngine;
        this.f7353e = steamID;
    }

    @Override // java.net.Socket
    public void bind(SocketAddress socketAddress) {
        throw new RuntimeException("Not supported");
    }

    @Override // java.net.Socket, java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        if (!this.f7350b) {
            this.f7350b = true;
            GameEngine.m5460e("Closing steam socket");
        }
        if (this.f7351c != null) {
            this.f7351c.m257a(new byte[0]);
        }
    }

    @Override // java.net.Socket
    public void connect(SocketAddress socketAddress, int i) {
        throw new RuntimeException("Not supported");
    }

    @Override // java.net.Socket
    public void connect(SocketAddress socketAddress) {
        throw new RuntimeException("Not supported");
    }

    @Override // java.net.Socket
    public SocketChannel getChannel() {
        throw new RuntimeException("Not supported");
    }

    @Override // java.net.Socket
    public InetAddress getInetAddress() {
        return null;
    }

    @Override // java.net.Socket
    public InetAddress getLocalAddress() {
        return null;
    }

    @Override // java.net.Socket
    public SocketAddress getLocalSocketAddress() {
        return null;
    }

    @Override // java.net.Socket
    public SocketAddress getRemoteSocketAddress() {
        return null;
    }

    @Override // java.net.Socket
    public InputStream getInputStream() {
        return this.f7351c;
    }

    @Override // java.net.Socket
    public boolean getKeepAlive() {
        return true;
    }

    @Override // java.net.Socket
    public int getLocalPort() {
        return 5555;
    }

    @Override // java.net.Socket
    public boolean getOOBInline() {
        return false;
    }

    @Override // java.net.Socket
    public OutputStream getOutputStream() {
        return this.f7352d;
    }

    @Override // java.net.Socket
    public int getPort() {
        return 5555;
    }

    @Override // java.net.Socket
    public synchronized int getReceiveBufferSize() {
        return 512;
    }

    @Override // java.net.Socket
    public boolean getReuseAddress() {
        return false;
    }

    @Override // java.net.Socket
    public synchronized int getSendBufferSize() {
        return 512;
    }

    @Override // java.net.Socket
    public int getSoLinger() {
        return 0;
    }

    @Override // java.net.Socket
    public synchronized int getSoTimeout() {
        return 0;
    }

    @Override // java.net.Socket
    public boolean getTcpNoDelay() {
        return true;
    }

    @Override // java.net.Socket
    public int getTrafficClass() {
        return 0;
    }

    @Override // java.net.Socket
    public boolean isBound() {
        return true;
    }

    @Override // java.net.Socket
    public boolean isClosed() {
        return this.f7350b;
    }

    @Override // java.net.Socket
    public boolean isConnected() {
        return true;
    }

    @Override // java.net.Socket
    public boolean isInputShutdown() {
        return this.f7351c != null;
    }

    @Override // java.net.Socket
    public boolean isOutputShutdown() {
        return this.f7352d != null;
    }

    @Override // java.net.Socket
    public void sendUrgentData(int i) {
    }

    @Override // java.net.Socket
    public void setKeepAlive(boolean z) {
    }

    @Override // java.net.Socket
    public void setOOBInline(boolean z) {
    }

    @Override // java.net.Socket
    public void setPerformancePreferences(int i, int i2, int i3) {
    }

    @Override // java.net.Socket
    public synchronized void setReceiveBufferSize(int i) {
    }

    @Override // java.net.Socket
    public void setReuseAddress(boolean z) {
    }

    @Override // java.net.Socket
    public synchronized void setSendBufferSize(int i) {
    }

    @Override // java.net.Socket
    public void setSoLinger(boolean z, int i) {
    }

    @Override // java.net.Socket
    public synchronized void setSoTimeout(int i) {
    }

    @Override // java.net.Socket
    public void setTcpNoDelay(boolean z) {
    }

    @Override // java.net.Socket
    public void setTrafficClass(int i) {
    }

    @Override // java.net.Socket
    public void shutdownInput() {
    }

    @Override // java.net.Socket
    public void shutdownOutput() {
    }

    @Override // java.net.Socket
    public String toString() {
        return "<SteamSocket>";
    }
}