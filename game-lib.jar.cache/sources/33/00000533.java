package com.corrodinggames.rts.gameFramework.net;

import com.corrodinggames.rts.gameFramework.GameEngine;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.SocketAddress;
import java.nio.channels.SocketChannel;

// RelayForwardedSocket = RFS (Abbreviation)
/* renamed from: com.corrodinggames.rts.gameFramework.j.h */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/j/h.class */
public class RelayForwardedSocket extends Socket {

    /* renamed from: a */
    PlayerConnect f6065a;

    /* renamed from: b */
    int f6066b;

    /* renamed from: c */
    boolean f6067c = false;

    /* renamed from: d */
    RFSInStream f6068d = new RFSInStream(this);

    /* renamed from: e */
    RFSOutStream f6069e = new RFSOutStream(this);

    /* renamed from: a */
    public void m1322a(Packet packet) {
        this.f6065a.m1359a(new C0901ay(this.f6066b, packet));
    }

    public RelayForwardedSocket(PlayerConnect playerConnect, int i) {
        this.f6065a = playerConnect;
        this.f6066b = i;
    }

    @Override // java.net.Socket
    public void bind(SocketAddress socketAddress) {
        throw new RuntimeException("Not supported");
    }

    @Override // java.net.Socket, java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        if (!this.f6067c) {
            this.f6067c = true;
            GameEngine.m5460e("Closing steam socket");
        }
        if (this.f6068d != null) {
            this.f6068d.m1321a(new byte[0]);
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
        return this.f6068d;
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
        return this.f6069e;
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
        return this.f6067c;
    }

    @Override // java.net.Socket
    public boolean isConnected() {
        return true;
    }

    @Override // java.net.Socket
    public boolean isInputShutdown() {
        return this.f6068d != null;
    }

    @Override // java.net.Socket
    public boolean isOutputShutdown() {
        return this.f6069e != null;
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
        return "<ForwardedSocket>";
    }
}