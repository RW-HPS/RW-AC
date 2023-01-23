package net.rudp;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.SocketAddress;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.nio.channels.SocketChannel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;
import net.rudp.a.ACKSegment;
import net.rudp.a.DATSegment;
import net.rudp.a.EAKSegment;
import net.rudp.a.FINSegment;
import net.rudp.a.NULSegment;
import net.rudp.a.RSTSegment;
import net.rudp.a.SYNSegment;
import net.rudp.a.Segment;
import net.rudp.a.Timer;

/* renamed from: a.a.h */
/* loaded from: game-lib.jar:a/a/h.class */
public class ReliableSocket extends Socket {
    protected DatagramSocket c;
    protected SocketAddress d;
    protected ReliableSocketInputStream e;
    protected ReliableSocketOutputStream f;
    private byte[] a;
    private boolean b;
    private boolean i;
    private boolean j;
    private boolean k;
    private int l;
    private int m;
    private boolean n;
    private boolean o;
    private int p;
    private Object q;
    private Object r;
    private ArrayList s;
    private ArrayList t;
    protected ReliableSocketProfile g;
    private ArrayList u;
    private ArrayList v;
    private ArrayList w;
    private Object x;
    private i y;
    private Thread z;
    private int A;
    private int B;
    private int C;
    private int D;
    public boolean h;
    private Timer E;
    private Timer F;
    private Timer G;
    private Timer H;
    private static final boolean I = Boolean.getBoolean("net.rudp.debug");

    public ReliableSocket() {
        this(new ReliableSocketProfile());
    }

    public ReliableSocket(ReliableSocketProfile reliableSocketProfile) {
        this(new DatagramSocket(), reliableSocketProfile);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public ReliableSocket(DatagramSocket datagramSocket) {
        this(datagramSocket, new ReliableSocketProfile());
    }

    protected ReliableSocket(DatagramSocket datagramSocket, ReliableSocketProfile reliableSocketProfile) {
        this.b = false;
        this.i = false;
        this.j = false;
        this.k = true;
        this.l = 0;
        this.m = 0;
        this.n = false;
        this.o = false;
        this.p = -1;
        this.q = new Object();
        this.r = new Object();
        this.s = new ArrayList();
        this.t = new ArrayList();
        this.g = ReliableSocketProfile.a;
        this.u = new ArrayList();
        this.v = new ArrayList();
        this.w = new ArrayList();
        this.x = new Object();
        this.y = new i();
        this.A = 32;
        this.B = 32;
        this.h = false;
        this.E = new Timer("rudp-NullSegmentTimer", new l(this));
        this.F = new Timer("rudp-RetransmissionTimer", new n(this));
        this.G = new Timer("rudp-CumulativeAckTimer", new j(this));
        this.H = new Timer("rudp-KeepAliveTimer", new k(this));
        if (datagramSocket == null) {
            throw new NullPointerException("sock");
        }
        a(datagramSocket, reliableSocketProfile);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void a(DatagramSocket datagramSocket, ReliableSocketProfile reliableSocketProfile) {
        this.c = datagramSocket;
        this.g = reliableSocketProfile;
        this.C = (this.g.a() - 6) * 32;
        this.D = (this.g.a() - 6) * 32;
        if (this.z == null) {
            this.z = new m(this);
            this.z.start();
        }
    }

    @Override // java.net.Socket
    public void bind(SocketAddress socketAddress) {
        this.c.bind(socketAddress);
    }

    @Override // java.net.Socket
    public void connect(SocketAddress socketAddress) {
        connect(socketAddress, 0);
    }

    @Override // java.net.Socket
    public void connect(SocketAddress socketAddress, int i) {
        if (socketAddress == null) {
            throw new IllegalArgumentException("connect: The address can't be null");
        }
        if (i < 0) {
            throw new IllegalArgumentException("connect: timeout can't be negative");
        }
        if (isClosed()) {
            throw new SocketException("Socket is closed");
        }
        if (isConnected()) {
            throw new SocketException("already connected");
        }
        if (!(socketAddress instanceof InetSocketAddress)) {
            throw new IllegalArgumentException("Unsupported address type");
        }
        this.d = (InetSocketAddress) socketAddress;
        f();
        this.l = 2;
        e(new SYNSegment(this.y.a(new Random(System.currentTimeMillis()).nextInt(255)), this.g.b(), this.g.a(), this.g.h(), this.g.i(), this.g.g(), this.g.c(), this.g.d(), this.g.e(), this.g.f()));
        boolean z = false;
        synchronized (this) {
            if (!isConnected()) {
                try {
                    if (i == 0) {
                        wait();
                    } else {
                        long currentTimeMillis = System.currentTimeMillis();
                        wait(i);
                        if (System.currentTimeMillis() - currentTimeMillis >= i) {
                            z = true;
                        }
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
        if (this.l == 3) {
            return;
        }
        synchronized (this.u) {
            this.u.clear();
            this.u.notifyAll();
        }
        this.y.l();
        this.F.e();
        switch (this.l) {
            case 0:
            case 4:
                this.l = 0;
                throw new SocketException("Socket closed");
            case 1:
            case 3:
            default:
                return;
            case 2:
                k();
                this.l = 0;
                if (z) {
                    throw new SocketTimeoutException();
                }
                throw new SocketException("Connection refused");
        }
    }

    @Override // java.net.Socket
    public SocketChannel getChannel() {
        return null;
    }

    @Override // java.net.Socket
    public InetAddress getInetAddress() {
        if (!isConnected()) {
            return null;
        }
        return ((InetSocketAddress) this.d).getAddress();
    }

    @Override // java.net.Socket
    public int getPort() {
        if (!isConnected()) {
            return 0;
        }
        return ((InetSocketAddress) this.d).getPort();
    }

    @Override // java.net.Socket
    public SocketAddress getRemoteSocketAddress() {
        if (!isConnected()) {
            return null;
        }
        return new InetSocketAddress(getInetAddress(), getPort());
    }

    public SocketAddress c() {
        return this.d;
    }

    @Override // java.net.Socket
    public InetAddress getLocalAddress() {
        return this.c.getLocalAddress();
    }

    @Override // java.net.Socket
    public int getLocalPort() {
        return this.c.getLocalPort();
    }

    @Override // java.net.Socket
    public SocketAddress getLocalSocketAddress() {
        return this.c.getLocalSocketAddress();
    }

    @Override // java.net.Socket
    public synchronized InputStream getInputStream() {
        if (isClosed()) {
            throw new SocketException("Socket is closed");
        }
        if (!isConnected()) {
            throw new SocketException("Socket is not connected");
        }
        if (isInputShutdown()) {
            throw new SocketException("Socket input is shutdown");
        }
        if (this.e == null) {
            this.e = new ReliableSocketInputStream(this);
        }
        return this.e;
    }

    @Override // java.net.Socket
    public synchronized OutputStream getOutputStream() {
        if (isClosed()) {
            throw new SocketException("Socket is closed");
        }
        if (!isConnected()) {
            throw new SocketException("Socket is not connected");
        }
        if (isOutputShutdown()) {
            throw new SocketException("Socket output is shutdown");
        }
        if (this.f == null) {
            this.f = new ReliableSocketOutputStream(this);
        }
        return this.f;
    }

    public void d() {
        this.b = true;
        this.l = 0;
        this.c.close();
    }

    @Override // java.net.Socket, java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        synchronized (this.q) {
            if (isClosed()) {
                return;
            }
            g();
            switch (this.l) {
                case 0:
                    this.c.close();
                    break;
                case 1:
                case 3:
                case 4:
                    a(new FINSegment(this.y.a()));
                    e();
                    break;
                case 2:
                    synchronized (this) {
                        notify();
                    }
                    break;
            }
            if (this.l != 0) {
                this.p = this.l;
            }
            this.b = true;
            this.l = 0;
            l();
            synchronized (this.u) {
                this.u.notify();
            }
            synchronized (this.w) {
                this.w.notify();
            }
        }
    }

    @Override // java.net.Socket
    public boolean isBound() {
        return this.c.isBound();
    }

    @Override // java.net.Socket
    public boolean isConnected() {
        return this.i;
    }

    @Override // java.net.Socket
    public boolean isClosed() {
        boolean z;
        synchronized (this.q) {
            z = this.b;
        }
        return z;
    }

    @Override // java.net.Socket
    public void setSoTimeout(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("timeout < 0");
        }
        this.m = i;
    }

    @Override // java.net.Socket
    public synchronized void setSendBufferSize(int i) {
        if (i <= 0) {
            throw new IllegalArgumentException("negative receive size");
        }
        if (isClosed()) {
            throw new SocketException("Socket is closed");
        }
        if (isConnected()) {
            return;
        }
        this.C = i;
    }

    @Override // java.net.Socket
    public synchronized int getSendBufferSize() {
        if (isClosed()) {
            throw new SocketException("Socket is closed");
        }
        return this.C;
    }

    @Override // java.net.Socket
    public synchronized void setReceiveBufferSize(int i) {
        if (i <= 0) {
            throw new IllegalArgumentException("negative send size");
        }
        if (isClosed()) {
            throw new SocketException("Socket is closed");
        }
        if (isConnected()) {
            return;
        }
        this.D = i;
    }

    @Override // java.net.Socket
    public synchronized int getReceiveBufferSize() {
        if (isClosed()) {
            throw new SocketException("Socket is closed");
        }
        return this.D;
    }

    @Override // java.net.Socket
    public void setTcpNoDelay(boolean z) {
    }

    @Override // java.net.Socket
    public boolean getTcpNoDelay() {
        return false;
    }

    @Override // java.net.Socket
    public synchronized void setKeepAlive(boolean z) {
        if (isClosed()) {
            throw new SocketException("Socket is closed");
        }
        if (!(this.k ^ z)) {
            return;
        }
        this.k = z;
        if (isConnected()) {
            if (this.k) {
                this.H.a(this.g.g() * 6, this.g.g() * 6);
            } else {
                this.H.e();
            }
        }
    }

    @Override // java.net.Socket
    public synchronized boolean getKeepAlive() {
        if (isClosed()) {
            throw new SocketException("Socket is closed");
        }
        return this.k;
    }

    @Override // java.net.Socket
    public void shutdownInput() {
        if (isClosed()) {
            throw new SocketException("Socket is closed");
        }
        if (!isConnected()) {
            throw new SocketException("Socket is not connected");
        }
        if (isInputShutdown()) {
            throw new SocketException("Socket input is already shutdown");
        }
        this.n = true;
        synchronized (this.x) {
            this.x.notify();
        }
    }

    @Override // java.net.Socket
    public void shutdownOutput() {
        if (isClosed()) {
            throw new SocketException("Socket is closed");
        }
        if (!isConnected()) {
            throw new SocketException("Socket is not connected");
        }
        if (isOutputShutdown()) {
            throw new SocketException("Socket output is already shutdown");
        }
        this.o = true;
        synchronized (this.u) {
            this.u.notifyAll();
        }
    }

    @Override // java.net.Socket
    public boolean isInputShutdown() {
        return this.n;
    }

    @Override // java.net.Socket
    public boolean isOutputShutdown() {
        return this.o;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void a(byte[] bArr, int i, int i2) {
        a(bArr, i, i2, false);
    }

    public void a(byte[] bArr, int i, int i2, boolean z) {
        if (isClosed()) {
            throw new SocketException("Socket is closed");
        }
        if (isOutputShutdown()) {
            throw new IOException("Socket output is shutdown");
        }
        if (!isConnected()) {
            throw new SocketException("Connection reset");
        }
        int i3 = 0;
        while (i3 < i2) {
            synchronized (this.r) {
                while (this.j) {
                    try {
                        this.r.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                int min = Math.min(this.g.a() - 6, i2 - i3);
                DATSegment dATSegment = new DATSegment(this.y.a(), this.y.b(), bArr, i + i3, min);
                e(dATSegment);
                if (z) {
                    a(dATSegment);
                }
                i3 += min;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public int b(byte[] bArr, int i, int i2) {
        int i3 = 0;
        synchronized (this.x) {
            while (true) {
                if (this.w.isEmpty()) {
                    if (isClosed()) {
                        throw new SocketException("Socket is closed");
                    }
                    if (isInputShutdown()) {
                        throw new EOFException();
                    }
                    if (!isConnected()) {
                        throw new SocketException("Connection reset");
                    }
                    try {
                        if (this.m == 0) {
                            this.x.wait();
                        } else {
                            long currentTimeMillis = System.currentTimeMillis();
                            this.x.wait(this.m);
                            if (System.currentTimeMillis() - currentTimeMillis >= this.m) {
                                throw new SocketTimeoutException();
                                break;
                            }
                        }
                    } catch (InterruptedException e) {
                        if (I) {
                            e.printStackTrace();
                        }
                    }
                } else {
                    Iterator it = this.w.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        Segment segment = (Segment) it.next();
                        if (segment instanceof RSTSegment) {
                            it.remove();
                            break;
                        } else if (segment instanceof FINSegment) {
                            if (i3 <= 0) {
                                it.remove();
                                return -1;
                            }
                        } else if (segment instanceof DATSegment) {
                            byte[] c = ((DATSegment) segment).c();
                            if (c.length + i3 > i2) {
                                if (i3 <= 0) {
                                    throw new IOException("insufficient buffer space");
                                }
                            } else {
                                System.arraycopy(c, 0, bArr, i + i3, c.length);
                                i3 += c.length;
                                it.remove();
                            }
                        }
                    }
                    if (i3 > 0) {
                        return i3;
                    }
                }
            }
        }
    }

    public void a(ReliableSocketStateListener reliableSocketStateListener) {
        if (reliableSocketStateListener == null) {
            throw new NullPointerException("stateListener");
        }
        synchronized (this.t) {
            if (!this.t.contains(reliableSocketStateListener)) {
                this.t.add(reliableSocketStateListener);
            }
        }
    }

    private void a(Segment segment) {
        if ((segment instanceof DATSegment) || (segment instanceof RSTSegment) || (segment instanceof FINSegment) || (segment instanceof NULSegment)) {
            h(segment);
        }
        if ((segment instanceof DATSegment) || (segment instanceof RSTSegment) || (segment instanceof FINSegment)) {
            this.E.d();
        }
        if (I) {
            a("sent " + segment);
        }
        d(segment);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Segment i() {
        Segment a = a();
        if (a != null) {
            if (I) {
                a("recv " + a);
            }
            if ((a instanceof DATSegment) || (a instanceof NULSegment) || (a instanceof RSTSegment) || (a instanceof FINSegment) || (a instanceof SYNSegment)) {
                this.y.c();
            }
            if (this.k) {
                this.H.d();
            }
        }
        return a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(Segment segment) {
        synchronized (this.u) {
            while (true) {
                if (this.u.size() >= this.A || this.y.j() > this.g.b()) {
                    if (this.b) {
                        throw new SocketException("Socket is closed");
                    }
                    try {
                        this.u.wait(10000L);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                } else {
                    this.y.i();
                    this.u.add(segment);
                }
            }
        }
        if (this.b) {
            throw new SocketException("Socket is closed");
        }
        if (!(segment instanceof EAKSegment) && !(segment instanceof ACKSegment)) {
            synchronized (this.F) {
                if (this.F.c()) {
                    this.F.a(this.g.h(), this.g.h());
                }
            }
        }
        a(segment);
        if (segment instanceof DATSegment) {
            synchronized (this.s) {
                Iterator it = this.s.iterator();
                while (it.hasNext()) {
                    ((p) it.next()).a();
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f(Segment segment) {
        if (this.g.c() > 0) {
            segment.b(segment.getRetxCounter() + 1);
        }
        if (this.g.c() != 0 && segment.getRetxCounter() > this.g.c()) {
            m();
            return;
        }
        a(segment);
        if (segment instanceof DATSegment) {
            synchronized (this.s) {
                Iterator it = this.s.iterator();
                while (it.hasNext()) {
                    ((p) it.next()).b();
                }
            }
        }
    }

    private void j() {
        if (isConnected()) {
            this.E.e();
            if (this.k) {
                this.H.e();
            }
            synchronized (this.r) {
                this.j = false;
                this.r.notify();
            }
        } else {
            synchronized (this) {
                f();
                this.i = true;
                this.l = 3;
                notify();
            }
            synchronized (this.t) {
                Iterator it = this.t.iterator();
                while (it.hasNext()) {
                    ((ReliableSocketStateListener) it.next()).a(this);
                }
            }
        }
        this.E.a(0L, this.g.g());
        if (this.k) {
            this.H.a(this.g.g() * 6, this.g.g() * 6);
        }
    }

    private void k() {
        synchronized (this.t) {
            Iterator it = this.t.iterator();
            while (it.hasNext()) {
                ((ReliableSocketStateListener) it.next()).b(this);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void l() {
        synchronized (this.t) {
            Iterator it = this.t.iterator();
            while (it.hasNext()) {
                ((ReliableSocketStateListener) it.next()).c(this);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void m() {
        synchronized (this.q) {
            if (isClosed()) {
                return;
            }
            switch (this.l) {
                case 1:
                case 3:
                case 4:
                    this.i = false;
                    synchronized (this.u) {
                        this.u.notifyAll();
                    }
                    synchronized (this.x) {
                        this.x.notify();
                    }
                    e();
                    break;
                case 2:
                    synchronized (this) {
                        notify();
                    }
                    break;
            }
            this.l = 0;
            this.b = true;
            synchronized (this.t) {
                Iterator it = this.t.iterator();
                while (it.hasNext()) {
                    ((ReliableSocketStateListener) it.next()).d(this);
                }
            }
        }
    }

    private void n() {
        synchronized (this.t) {
            Iterator it = this.t.iterator();
            while (it.hasNext()) {
                ((ReliableSocketStateListener) it.next()).e(this);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void a(SYNSegment sYNSegment) {
        switch (this.l) {
            case 0:
                this.l = 1;
                this.g = new ReliableSocketProfile(this.A, this.B, sYNSegment.e(), sYNSegment.c(), sYNSegment.i(), sYNSegment.j(), sYNSegment.k(), sYNSegment.l(), sYNSegment.h(), sYNSegment.f(), sYNSegment.g());
                this.y.b(sYNSegment.m());
                SYNSegment sYNSegment2 = new SYNSegment(this.y.a(new Random(System.currentTimeMillis()).nextInt(255)), this.g.b(), this.g.a(), this.g.h(), this.g.i(), this.g.g(), this.g.c(), this.g.d(), this.g.e(), this.g.f());
                sYNSegment2.setAck(sYNSegment.m());
                e(sYNSegment2);
                return;
            case 1:
                synchronized (this.u) {
                    Iterator it = this.u.iterator();
                    while (it.hasNext()) {
                        try {
                            f((Segment) it.next());
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                }
                return;
            case 2:
                this.y.b(sYNSegment.m());
                this.l = 3;
                o();
                j();
                return;
            default:
                return;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(EAKSegment eAKSegment) {
        int[] c = eAKSegment.c();
        int n = eAKSegment.getAck();
        int i = c[c.length - 1];
        synchronized (this.u) {
            Iterator it = this.u.iterator();
            while (it.hasNext()) {
                Segment segment = (Segment) it.next();
                if (a(segment.m(), n) <= 0) {
                    it.remove();
                } else {
                    int i2 = 0;
                    while (true) {
                        if (i2 >= c.length) {
                            break;
                        } else if (a(segment.m(), c[i2]) != 0) {
                            i2++;
                        } else {
                            it.remove();
                            break;
                        }
                    }
                }
            }
            Iterator it2 = this.u.iterator();
            while (it2.hasNext()) {
                Segment segment2 = (Segment) it2.next();
                if (a(n, segment2.m()) < 0 && a(i, segment2.m()) > 0) {
                    try {
                        f(segment2);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }
            this.u.notifyAll();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g(Segment segment) {
        if (segment instanceof RSTSegment) {
            synchronized (this.r) {
                this.j = true;
            }
            n();
        }
        if (segment instanceof FINSegment) {
            switch (this.l) {
                case 0:
                    break;
                case 2:
                    synchronized (this) {
                        notify();
                    }
                    break;
                default:
                    this.l = 4;
                    break;
            }
        }
        boolean z = false;
        synchronized (this.x) {
            if (a(segment.m(), this.y.b()) > 0) {
                if (a(segment.m(), b(this.y.b())) == 0) {
                    z = true;
                    if (this.w.size() == 0 || this.w.size() + this.v.size() < this.B) {
                        this.y.b(segment.m());
                        if ((segment instanceof DATSegment) || (segment instanceof RSTSegment) || (segment instanceof FINSegment)) {
                            this.w.add(segment);
                        }
                        if (segment instanceof DATSegment) {
                            synchronized (this.s) {
                                Iterator it = this.s.iterator();
                                while (it.hasNext()) {
                                    ((p) it.next()).c();
                                }
                            }
                        }
                        r();
                    }
                } else if (this.w.size() + this.v.size() < this.B) {
                    boolean z2 = false;
                    for (int i = 0; i < this.v.size() && !z2; i++) {
                        int a = a(segment.m(), ((Segment) this.v.get(i)).m());
                        if (a == 0) {
                            z2 = true;
                        } else if (a < 0) {
                            this.v.add(i, segment);
                            z2 = true;
                        }
                    }
                    if (!z2) {
                        this.v.add(segment);
                    }
                    this.y.f();
                    if (segment instanceof DATSegment) {
                        synchronized (this.s) {
                            Iterator it2 = this.s.iterator();
                            while (it2.hasNext()) {
                                ((p) it2.next()).d();
                            }
                        }
                    }
                }
            }
            if (z && ((segment instanceof RSTSegment) || (segment instanceof NULSegment) || (segment instanceof FINSegment))) {
                o();
            } else if (this.y.g() > 0 && (this.g.e() == 0 || this.y.g() > this.g.e())) {
                p();
            } else if (this.y.d() > 0 && (this.g.d() == 0 || this.y.d() > this.g.d())) {
                q();
            } else {
                synchronized (this.G) {
                    if (this.G.c()) {
                        this.G.a(this.g.i());
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void o() {
        synchronized (this.x) {
            if (!this.v.isEmpty()) {
                p();
            } else {
                q();
            }
        }
    }

    private void p() {
        synchronized (this.x) {
            if (this.v.isEmpty()) {
                return;
            }
            this.y.e();
            this.y.h();
            int[] iArr = new int[this.v.size()];
            for (int i = 0; i < iArr.length; i++) {
                iArr[i] = ((Segment) this.v.get(i)).m();
            }
            try {
                int b = this.y.b();
                a((Segment) new EAKSegment(b(b), b, iArr));
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    private void q() {
        if (this.y.e() == 0) {
            return;
        }
        try {
            int b = this.y.b();
            a(new ACKSegment(b(b), b));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void h(Segment segment) {
        if (this.y.e() == 0) {
            return;
        }
        segment.setAck(this.y.b());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean b(Segment segment) {
        int ack = segment.getAck();
        if (ack < 0) {
            return false;
        }
        Iterator it = this.u.iterator();
        while (it.hasNext()) {
            if (a(((Segment) it.next()).m(), ack) <= 0) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void c(Segment segment) {
        int ack = segment.getAck();
        if (ack < 0) {
            return;
        }
        this.y.k();
        synchronized (this.u) {
            Iterator it = this.u.iterator();
            while (it.hasNext()) {
                if (a(((Segment) it.next()).m(), ack) <= 0) {
                    it.remove();
                }
            }
            if (this.l == 1) {
                boolean z = false;
                if (!this.u.isEmpty()) {
                    Iterator it2 = this.u.iterator();
                    while (it2.hasNext()) {
                        if (((Segment) it2.next()) instanceof SYNSegment) {
                            z = true;
                        }
                    }
                }
                if (z) {
                    a("Bad first ack: " + ack);
                    return;
                } else {
                    this.l = 3;
                    j();
                }
            }
            if (this.u.isEmpty()) {
                this.F.e();
            }
            this.u.notifyAll();
        }
    }

    private void r() {
        synchronized (this.x) {
            Iterator it = this.v.iterator();
            while (it.hasNext()) {
                Segment segment = (Segment) it.next();
                if (a(segment.m(), b(this.y.b())) == 0) {
                    this.y.b(segment.m());
                    if ((segment instanceof DATSegment) || (segment instanceof RSTSegment) || (segment instanceof FINSegment)) {
                        this.w.add(segment);
                    }
                    it.remove();
                }
            }
            this.x.notify();
        }
    }

    protected void d(Segment segment) {
        try {
            this.c.send(new DatagramPacket(segment.getBytes(), segment.b(), this.d));
        } catch (IOException e) {
            if (!isClosed()) {
                e.printStackTrace();
            }
        }
    }

    protected Segment a() {
        try {
            if (this.a == null) {
                this.a = new byte[65535];
            }
            DatagramPacket datagramPacket = new DatagramPacket(this.a, this.a.length);
            this.c.receive(datagramPacket);
            return Segment.parse(datagramPacket.getData(), 0, datagramPacket.getLength());
        } catch (IOException e) {
            if (!isClosed()) {
                e.printStackTrace();
                return null;
            }
            return null;
        }
    }

    protected void b() {
        this.c.close();
    }

    protected void e() {
        this.E.e();
        this.H.e();
        this.l = 4;
        Thread thread = new Thread() { // from class: a.a.h.1
            @Override // java.lang.Thread, java.lang.Runnable
            public void run() {
                ReliableSocket.this.H.f();
                ReliableSocket.this.E.f();
                try {
                    Thread.sleep(ReliableSocket.this.g.g() * 2);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                ReliableSocket.this.F.f();
                ReliableSocket.this.G.f();
                ReliableSocket.this.b();
                ReliableSocket.this.l();
            }
        };
        thread.setName("ReliableSocket-Closing");
        thread.setDaemon(true);
        thread.start();
    }

    protected synchronized void a(String str) {
        System.out.println(getLocalPort() + ": " + str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int b(int i) {
        return (i + 1) % 255;
    }

    private int a(int i, int i2) {
        if (i == i2) {
            return 0;
        }
        if (i >= i2 || i2 - i <= 127) {
            if (i > i2 && i - i2 < 127) {
                return 1;
            }
            return -1;
        }
        return 1;
    }

    public synchronized void f() {
        if (!this.h) {
            this.h = true;
            this.E.a();
            this.F.a();
            this.G.a();
            this.H.a();
        }
    }

    public synchronized void g() {
        if (this.h) {
            this.h = false;
            this.F.f();
            this.G.f();
            this.H.f();
            this.E.f();
        }
    }
}