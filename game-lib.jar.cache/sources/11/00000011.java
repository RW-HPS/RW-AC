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
import net.rudp.p002a.ACKSegment;
import net.rudp.p002a.DATSegment;
import net.rudp.p002a.EAKSegment;
import net.rudp.p002a.FINSegment;
import net.rudp.p002a.NULSegment;
import net.rudp.p002a.RSTSegment;
import net.rudp.p002a.SYNSegment;
import net.rudp.p002a.Segment;
import net.rudp.p002a.Timer;

/* renamed from: a.a.h */
/* loaded from: game-lib.jar:a/a/h.class */
public class ReliableSocket extends Socket {

    /* renamed from: c */
    protected DatagramSocket f47c;

    /* renamed from: d */
    protected SocketAddress f48d;

    /* renamed from: e */
    protected ReliableSocketInputStream f49e;

    /* renamed from: f */
    protected ReliableSocketOutputStream f50f;

    /* renamed from: a */
    private byte[] f51a;

    /* renamed from: b */
    private boolean f52b;

    /* renamed from: i */
    private boolean f53i;

    /* renamed from: j */
    private boolean f54j;

    /* renamed from: k */
    private boolean f55k;

    /* renamed from: l */
    private int f56l;

    /* renamed from: m */
    private int f57m;

    /* renamed from: n */
    private boolean f58n;

    /* renamed from: o */
    private boolean f59o;

    /* renamed from: p */
    private int f60p;

    /* renamed from: q */
    private Object f61q;

    /* renamed from: r */
    private Object f62r;

    /* renamed from: s */
    private ArrayList f63s;

    /* renamed from: t */
    private ArrayList f64t;

    /* renamed from: g */
    protected ReliableSocketProfile f65g;

    /* renamed from: u */
    private ArrayList f66u;

    /* renamed from: v */
    private ArrayList f67v;

    /* renamed from: w */
    private ArrayList f68w;

    /* renamed from: x */
    private Object f69x;

    /* renamed from: y */
    private C0019i f70y;

    /* renamed from: z */
    private Thread f71z;

    /* renamed from: A */
    private int f72A;

    /* renamed from: B */
    private int f73B;

    /* renamed from: C */
    private int f74C;

    /* renamed from: D */
    private int f75D;

    /* renamed from: h */
    public boolean f76h;

    /* renamed from: E */
    private Timer f77E;

    /* renamed from: F */
    private Timer f78F;

    /* renamed from: G */
    private Timer f79G;

    /* renamed from: H */
    private Timer f80H;

    /* renamed from: I */
    private static final boolean f81I = Boolean.getBoolean("net.rudp.debug");

    public ReliableSocket() {
        this(new ReliableSocketProfile());
    }

    public ReliableSocket(ReliableSocketProfile reliableSocketProfile) {
        this(new DatagramSocket(), reliableSocketProfile);
    }

    protected ReliableSocket(DatagramSocket datagramSocket) {
        this(datagramSocket, new ReliableSocketProfile());
    }

    protected ReliableSocket(DatagramSocket datagramSocket, ReliableSocketProfile reliableSocketProfile) {
        this.f52b = false;
        this.f53i = false;
        this.f54j = false;
        this.f55k = true;
        this.f56l = 0;
        this.f57m = 0;
        this.f58n = false;
        this.f59o = false;
        this.f60p = -1;
        this.f61q = new Object();
        this.f62r = new Object();
        this.f63s = new ArrayList();
        this.f64t = new ArrayList();
        this.f65g = ReliableSocketProfile.f100a;
        this.f66u = new ArrayList();
        this.f67v = new ArrayList();
        this.f68w = new ArrayList();
        this.f69x = new Object();
        this.f70y = new C0019i();
        this.f72A = 32;
        this.f73B = 32;
        this.f76h = false;
        this.f77E = new Timer("rudp-NullSegmentTimer", new RunnableC0022l(this));
        this.f78F = new Timer("rudp-RetransmissionTimer", new RunnableC0024n(this));
        this.f79G = new Timer("rudp-CumulativeAckTimer", new RunnableC0020j(this));
        this.f80H = new Timer("rudp-KeepAliveTimer", new RunnableC0021k(this));
        if (datagramSocket == null) {
            throw new NullPointerException("sock");
        }
        mo5399a(datagramSocket, reliableSocketProfile);
    }

    /* renamed from: a */
    protected void mo5399a(DatagramSocket datagramSocket, ReliableSocketProfile reliableSocketProfile) {
        this.f47c = datagramSocket;
        this.f65g = reliableSocketProfile;
        this.f74C = (this.f65g.m5340a() - 6) * 32;
        this.f75D = (this.f65g.m5340a() - 6) * 32;
        if (this.f71z == null) {
            this.f71z = new C0023m(this);
            this.f71z.start();
        }
    }

    @Override // java.net.Socket
    public void bind(SocketAddress socketAddress) {
        this.f47c.bind(socketAddress);
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
        this.f48d = (InetSocketAddress) socketAddress;
        m5380f();
        this.f56l = 2;
        m5382e(new SYNSegment(this.f70y.m5358a(new Random(System.currentTimeMillis()).nextInt(255)), this.f65g.m5337b(), this.f65g.m5340a(), this.f65g.m5331h(), this.f65g.m5330i(), this.f65g.m5332g(), this.f65g.m5336c(), this.f65g.m5335d(), this.f65g.m5334e(), this.f65g.m5333f()));
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
        if (this.f56l == 3) {
            return;
        }
        synchronized (this.f66u) {
            this.f66u.clear();
            this.f66u.notifyAll();
        }
        this.f70y.m5346l();
        this.f78F.m5426e();
        switch (this.f56l) {
            case 0:
            case 4:
                this.f56l = 0;
                throw new SocketException("Socket closed");
            case 1:
            case 3:
            default:
                return;
            case 2:
                m5367k();
                this.f56l = 0;
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
        return ((InetSocketAddress) this.f48d).getAddress();
    }

    @Override // java.net.Socket
    public int getPort() {
        if (!isConnected()) {
            return 0;
        }
        return ((InetSocketAddress) this.f48d).getPort();
    }

    @Override // java.net.Socket
    public SocketAddress getRemoteSocketAddress() {
        if (!isConnected()) {
            return null;
        }
        return new InetSocketAddress(getInetAddress(), getPort());
    }

    /* renamed from: c */
    public SocketAddress m5390c() {
        return this.f48d;
    }

    @Override // java.net.Socket
    public InetAddress getLocalAddress() {
        return this.f47c.getLocalAddress();
    }

    @Override // java.net.Socket
    public int getLocalPort() {
        return this.f47c.getLocalPort();
    }

    @Override // java.net.Socket
    public SocketAddress getLocalSocketAddress() {
        return this.f47c.getLocalSocketAddress();
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
        if (this.f49e == null) {
            this.f49e = new ReliableSocketInputStream(this);
        }
        return this.f49e;
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
        if (this.f50f == null) {
            this.f50f = new ReliableSocketOutputStream(this);
        }
        return this.f50f;
    }

    /* renamed from: d */
    public void m5386d() {
        this.f52b = true;
        this.f56l = 0;
        this.f47c.close();
    }

    @Override // java.net.Socket, java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        synchronized (this.f61q) {
            if (isClosed()) {
                return;
            }
            m5377g();
            switch (this.f56l) {
                case 0:
                    this.f47c.close();
                    break;
                case 1:
                case 3:
                case 4:
                    m5405a(new FINSegment(this.f70y.m5359a()));
                    m5383e();
                    break;
                case 2:
                    synchronized (this) {
                        notify();
                    }
                    break;
            }
            if (this.f56l != 0) {
                this.f60p = this.f56l;
            }
            this.f52b = true;
            this.f56l = 0;
            m5366l();
            synchronized (this.f66u) {
                this.f66u.notify();
            }
            synchronized (this.f68w) {
                this.f68w.notify();
            }
        }
    }

    @Override // java.net.Socket
    public boolean isBound() {
        return this.f47c.isBound();
    }

    @Override // java.net.Socket
    public boolean isConnected() {
        return this.f53i;
    }

    @Override // java.net.Socket
    public boolean isClosed() {
        boolean z;
        synchronized (this.f61q) {
            z = this.f52b;
        }
        return z;
    }

    @Override // java.net.Socket
    public void setSoTimeout(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("timeout < 0");
        }
        this.f57m = i;
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
        this.f74C = i;
    }

    @Override // java.net.Socket
    public synchronized int getSendBufferSize() {
        if (isClosed()) {
            throw new SocketException("Socket is closed");
        }
        return this.f74C;
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
        this.f75D = i;
    }

    @Override // java.net.Socket
    public synchronized int getReceiveBufferSize() {
        if (isClosed()) {
            throw new SocketException("Socket is closed");
        }
        return this.f75D;
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
        if (!(this.f55k ^ z)) {
            return;
        }
        this.f55k = z;
        if (isConnected()) {
            if (this.f55k) {
                this.f80H.m5430a(this.f65g.m5332g() * 6, this.f65g.m5332g() * 6);
            } else {
                this.f80H.m5426e();
            }
        }
    }

    @Override // java.net.Socket
    public synchronized boolean getKeepAlive() {
        if (isClosed()) {
            throw new SocketException("Socket is closed");
        }
        return this.f55k;
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
        this.f58n = true;
        synchronized (this.f69x) {
            this.f69x.notify();
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
        this.f59o = true;
        synchronized (this.f66u) {
            this.f66u.notifyAll();
        }
    }

    @Override // java.net.Socket
    public boolean isInputShutdown() {
        return this.f58n;
    }

    @Override // java.net.Socket
    public boolean isOutputShutdown() {
        return this.f59o;
    }

    /* renamed from: a */
    protected void m5398a(byte[] bArr, int i, int i2) {
        m5397a(bArr, i, i2, false);
    }

    /* renamed from: a */
    public void m5397a(byte[] bArr, int i, int i2, boolean z) {
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
            synchronized (this.f62r) {
                while (this.f54j) {
                    try {
                        this.f62r.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                int min = Math.min(this.f65g.m5340a() - 6, i2 - i3);
                DATSegment dATSegment = new DATSegment(this.f70y.m5359a(), this.f70y.m5357b(), bArr, i + i3, min);
                m5382e(dATSegment);
                if (z) {
                    m5405a(dATSegment);
                }
                i3 += min;
            }
        }
    }

    /* renamed from: b */
    protected int m5391b(byte[] bArr, int i, int i2) {
        int i3 = 0;
        synchronized (this.f69x) {
            while (true) {
                if (this.f68w.isEmpty()) {
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
                        if (this.f57m == 0) {
                            this.f69x.wait();
                        } else {
                            long currentTimeMillis = System.currentTimeMillis();
                            this.f69x.wait(this.f57m);
                            if (System.currentTimeMillis() - currentTimeMillis >= this.f57m) {
                                throw new SocketTimeoutException();
                                break;
                            }
                        }
                    } catch (InterruptedException e) {
                        if (f81I) {
                            e.printStackTrace();
                        }
                    }
                } else {
                    Iterator it = this.f68w.iterator();
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
                            byte[] m5454c = ((DATSegment) segment).m5454c();
                            if (m5454c.length + i3 > i2) {
                                if (i3 <= 0) {
                                    throw new IOException("insufficient buffer space");
                                }
                            } else {
                                System.arraycopy(m5454c, 0, bArr, i + i3, m5454c.length);
                                i3 += m5454c.length;
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

    /* renamed from: a */
    public void m5401a(ReliableSocketStateListener reliableSocketStateListener) {
        if (reliableSocketStateListener == null) {
            throw new NullPointerException("stateListener");
        }
        synchronized (this.f64t) {
            if (!this.f64t.contains(reliableSocketStateListener)) {
                this.f64t.add(reliableSocketStateListener);
            }
        }
    }

    /* renamed from: a */
    private void m5405a(Segment segment) {
        if ((segment instanceof DATSegment) || (segment instanceof RSTSegment) || (segment instanceof FINSegment) || (segment instanceof NULSegment)) {
            m5373h(segment);
        }
        if ((segment instanceof DATSegment) || (segment instanceof RSTSegment) || (segment instanceof FINSegment)) {
            this.f77E.m5427d();
        }
        if (f81I) {
            mo5400a("sent " + segment);
        }
        m5385d(segment);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: i */
    public Segment m5371i() {
        Segment mo5410a = mo5410a();
        if (mo5410a != null) {
            if (f81I) {
                mo5400a("recv " + mo5410a);
            }
            if ((mo5410a instanceof DATSegment) || (mo5410a instanceof NULSegment) || (mo5410a instanceof RSTSegment) || (mo5410a instanceof FINSegment) || (mo5410a instanceof SYNSegment)) {
                this.f70y.m5355c();
            }
            if (this.f55k) {
                this.f80H.m5427d();
            }
        }
        return mo5410a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e */
    public void m5382e(Segment segment) {
        synchronized (this.f66u) {
            while (true) {
                if (this.f66u.size() >= this.f72A || this.f70y.m5348j() > this.f65g.m5337b()) {
                    if (this.f52b) {
                        throw new SocketException("Socket is closed");
                    }
                    try {
                        this.f66u.wait(10000L);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                } else {
                    this.f70y.m5349i();
                    this.f66u.add(segment);
                }
            }
        }
        if (this.f52b) {
            throw new SocketException("Socket is closed");
        }
        if (!(segment instanceof EAKSegment) && !(segment instanceof ACKSegment)) {
            synchronized (this.f78F) {
                if (this.f78F.m5428c()) {
                    this.f78F.m5430a(this.f65g.m5331h(), this.f65g.m5331h());
                }
            }
        }
        m5405a(segment);
        if (segment instanceof DATSegment) {
            synchronized (this.f63s) {
                Iterator it = this.f63s.iterator();
                while (it.hasNext()) {
                    ((InterfaceC0026p) it.next()).m5344a();
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: f */
    public void m5379f(Segment segment) {
        if (this.f65g.m5336c() > 0) {
            segment.m5438b(segment.getRetxCounter() + 1);
        }
        if (this.f65g.m5336c() != 0 && segment.getRetxCounter() > this.f65g.m5336c()) {
            m5365m();
            return;
        }
        m5405a(segment);
        if (segment instanceof DATSegment) {
            synchronized (this.f63s) {
                Iterator it = this.f63s.iterator();
                while (it.hasNext()) {
                    ((InterfaceC0026p) it.next()).m5343b();
                }
            }
        }
    }

    /* renamed from: j */
    private void m5369j() {
        if (isConnected()) {
            this.f77E.m5426e();
            if (this.f55k) {
                this.f80H.m5426e();
            }
            synchronized (this.f62r) {
                this.f54j = false;
                this.f62r.notify();
            }
        } else {
            synchronized (this) {
                m5380f();
                this.f53i = true;
                this.f56l = 3;
                notify();
            }
            synchronized (this.f64t) {
                Iterator it = this.f64t.iterator();
                while (it.hasNext()) {
                    ((ReliableSocketStateListener) it.next()).mo5329a(this);
                }
            }
        }
        this.f77E.m5430a(0L, this.f65g.m5332g());
        if (this.f55k) {
            this.f80H.m5430a(this.f65g.m5332g() * 6, this.f65g.m5332g() * 6);
        }
    }

    /* renamed from: k */
    private void m5367k() {
        synchronized (this.f64t) {
            Iterator it = this.f64t.iterator();
            while (it.hasNext()) {
                ((ReliableSocketStateListener) it.next()).mo5328b(this);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: l */
    public void m5366l() {
        synchronized (this.f64t) {
            Iterator it = this.f64t.iterator();
            while (it.hasNext()) {
                ((ReliableSocketStateListener) it.next()).mo5327c(this);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: m */
    public void m5365m() {
        synchronized (this.f61q) {
            if (isClosed()) {
                return;
            }
            switch (this.f56l) {
                case 1:
                case 3:
                case 4:
                    this.f53i = false;
                    synchronized (this.f66u) {
                        this.f66u.notifyAll();
                    }
                    synchronized (this.f69x) {
                        this.f69x.notify();
                    }
                    m5383e();
                    break;
                case 2:
                    synchronized (this) {
                        notify();
                    }
                    break;
            }
            this.f56l = 0;
            this.f52b = true;
            synchronized (this.f64t) {
                Iterator it = this.f64t.iterator();
                while (it.hasNext()) {
                    ((ReliableSocketStateListener) it.next()).mo5326d(this);
                }
            }
        }
    }

    /* renamed from: n */
    private void m5364n() {
        synchronized (this.f64t) {
            Iterator it = this.f64t.iterator();
            while (it.hasNext()) {
                ((ReliableSocketStateListener) it.next()).mo5325e(this);
            }
        }
    }

    /* renamed from: a */
    protected void m5406a(SYNSegment sYNSegment) {
        switch (this.f56l) {
            case 0:
                this.f56l = 1;
                this.f65g = new ReliableSocketProfile(this.f72A, this.f73B, sYNSegment.m5451e(), sYNSegment.m5452c(), sYNSegment.m5447i(), sYNSegment.m5446j(), sYNSegment.m5445k(), sYNSegment.m5444l(), sYNSegment.m5448h(), sYNSegment.m5450f(), sYNSegment.m5449g());
                this.f70y.m5356b(sYNSegment.m5435m());
                SYNSegment sYNSegment2 = new SYNSegment(this.f70y.m5358a(new Random(System.currentTimeMillis()).nextInt(255)), this.f65g.m5337b(), this.f65g.m5340a(), this.f65g.m5331h(), this.f65g.m5330i(), this.f65g.m5332g(), this.f65g.m5336c(), this.f65g.m5335d(), this.f65g.m5334e(), this.f65g.m5333f());
                sYNSegment2.setAck(sYNSegment.m5435m());
                m5382e(sYNSegment2);
                return;
            case 1:
                synchronized (this.f66u) {
                    Iterator it = this.f66u.iterator();
                    while (it.hasNext()) {
                        try {
                            m5379f((Segment) it.next());
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                }
                return;
            case 2:
                this.f70y.m5356b(sYNSegment.m5435m());
                this.f56l = 3;
                m5363o();
                m5369j();
                return;
            default:
                return;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public void m5407a(EAKSegment eAKSegment) {
        int[] m5453c = eAKSegment.m5453c();
        int n = eAKSegment.getAck();
        int i = m5453c[m5453c.length - 1];
        synchronized (this.f66u) {
            Iterator it = this.f66u.iterator();
            while (it.hasNext()) {
                Segment segment = (Segment) it.next();
                if (m5408a(segment.m5435m(), n) <= 0) {
                    it.remove();
                } else {
                    int i2 = 0;
                    while (true) {
                        if (i2 >= m5453c.length) {
                            break;
                        } else if (m5408a(segment.m5435m(), m5453c[i2]) != 0) {
                            i2++;
                        } else {
                            it.remove();
                            break;
                        }
                    }
                }
            }
            Iterator it2 = this.f66u.iterator();
            while (it2.hasNext()) {
                Segment segment2 = (Segment) it2.next();
                if (m5408a(n, segment2.m5435m()) < 0 && m5408a(i, segment2.m5435m()) > 0) {
                    try {
                        m5379f(segment2);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }
            this.f66u.notifyAll();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: g */
    public void m5376g(Segment segment) {
        if (segment instanceof RSTSegment) {
            synchronized (this.f62r) {
                this.f54j = true;
            }
            m5364n();
        }
        if (segment instanceof FINSegment) {
            switch (this.f56l) {
                case 0:
                    break;
                case 2:
                    synchronized (this) {
                        notify();
                    }
                    break;
                default:
                    this.f56l = 4;
                    break;
            }
        }
        boolean z = false;
        synchronized (this.f69x) {
            if (m5408a(segment.m5435m(), this.f70y.m5357b()) > 0) {
                if (m5408a(segment.m5435m(), m5395b(this.f70y.m5357b())) == 0) {
                    z = true;
                    if (this.f68w.size() == 0 || this.f68w.size() + this.f67v.size() < this.f73B) {
                        this.f70y.m5356b(segment.m5435m());
                        if ((segment instanceof DATSegment) || (segment instanceof RSTSegment) || (segment instanceof FINSegment)) {
                            this.f68w.add(segment);
                        }
                        if (segment instanceof DATSegment) {
                            synchronized (this.f63s) {
                                Iterator it = this.f63s.iterator();
                                while (it.hasNext()) {
                                    ((InterfaceC0026p) it.next()).m5342c();
                                }
                            }
                        }
                        m5360r();
                    }
                } else if (this.f68w.size() + this.f67v.size() < this.f73B) {
                    boolean z2 = false;
                    for (int i = 0; i < this.f67v.size() && !z2; i++) {
                        int m5408a = m5408a(segment.m5435m(), ((Segment) this.f67v.get(i)).m5435m());
                        if (m5408a == 0) {
                            z2 = true;
                        } else if (m5408a < 0) {
                            this.f67v.add(i, segment);
                            z2 = true;
                        }
                    }
                    if (!z2) {
                        this.f67v.add(segment);
                    }
                    this.f70y.m5352f();
                    if (segment instanceof DATSegment) {
                        synchronized (this.f63s) {
                            Iterator it2 = this.f63s.iterator();
                            while (it2.hasNext()) {
                                ((InterfaceC0026p) it2.next()).m5341d();
                            }
                        }
                    }
                }
            }
            if (z && ((segment instanceof RSTSegment) || (segment instanceof NULSegment) || (segment instanceof FINSegment))) {
                m5363o();
            } else if (this.f70y.m5351g() > 0 && (this.f65g.m5334e() == 0 || this.f70y.m5351g() > this.f65g.m5334e())) {
                m5362p();
            } else if (this.f70y.m5354d() > 0 && (this.f65g.m5335d() == 0 || this.f70y.m5354d() > this.f65g.m5335d())) {
                m5361q();
            } else {
                synchronized (this.f79G) {
                    if (this.f79G.m5428c()) {
                        this.f79G.m5431a(this.f65g.m5330i());
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: o */
    public void m5363o() {
        synchronized (this.f69x) {
            if (!this.f67v.isEmpty()) {
                m5362p();
            } else {
                m5361q();
            }
        }
    }

    /* renamed from: p */
    private void m5362p() {
        synchronized (this.f69x) {
            if (this.f67v.isEmpty()) {
                return;
            }
            this.f70y.m5353e();
            this.f70y.m5350h();
            int[] iArr = new int[this.f67v.size()];
            for (int i = 0; i < iArr.length; i++) {
                iArr[i] = ((Segment) this.f67v.get(i)).m5435m();
            }
            try {
                int m5357b = this.f70y.m5357b();
                m5405a((Segment) new EAKSegment(m5395b(m5357b), m5357b, iArr));
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: q */
    private void m5361q() {
        if (this.f70y.m5353e() == 0) {
            return;
        }
        try {
            int m5357b = this.f70y.m5357b();
            m5405a(new ACKSegment(m5395b(m5357b), m5357b));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /* renamed from: h */
    private void m5373h(Segment segment) {
        if (this.f70y.m5353e() == 0) {
            return;
        }
        segment.setAck(this.f70y.m5357b());
    }

    /* renamed from: b */
    protected boolean m5394b(Segment segment) {
        int ack = segment.getAck();
        if (ack < 0) {
            return false;
        }
        Iterator it = this.f66u.iterator();
        while (it.hasNext()) {
            if (m5408a(((Segment) it.next()).m5435m(), ack) <= 0) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: c */
    protected void m5389c(Segment segment) {
        int ack = segment.getAck();
        if (ack < 0) {
            return;
        }
        this.f70y.m5347k();
        synchronized (this.f66u) {
            Iterator it = this.f66u.iterator();
            while (it.hasNext()) {
                if (m5408a(((Segment) it.next()).m5435m(), ack) <= 0) {
                    it.remove();
                }
            }
            if (this.f56l == 1) {
                boolean z = false;
                if (!this.f66u.isEmpty()) {
                    Iterator it2 = this.f66u.iterator();
                    while (it2.hasNext()) {
                        if (((Segment) it2.next()) instanceof SYNSegment) {
                            z = true;
                        }
                    }
                }
                if (z) {
                    mo5400a("Bad first ack: " + ack);
                    return;
                } else {
                    this.f56l = 3;
                    m5369j();
                }
            }
            if (this.f66u.isEmpty()) {
                this.f78F.m5426e();
            }
            this.f66u.notifyAll();
        }
    }

    /* renamed from: r */
    private void m5360r() {
        synchronized (this.f69x) {
            Iterator it = this.f67v.iterator();
            while (it.hasNext()) {
                Segment segment = (Segment) it.next();
                if (m5408a(segment.m5435m(), m5395b(this.f70y.m5357b())) == 0) {
                    this.f70y.m5356b(segment.m5435m());
                    if ((segment instanceof DATSegment) || (segment instanceof RSTSegment) || (segment instanceof FINSegment)) {
                        this.f68w.add(segment);
                    }
                    it.remove();
                }
            }
            this.f69x.notify();
        }
    }

    /* renamed from: d */
    protected void m5385d(Segment segment) {
        try {
            this.f47c.send(new DatagramPacket(segment.getBytes(), segment.mo5439b(), this.f48d));
        } catch (IOException e) {
            if (!isClosed()) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: a */
    protected Segment mo5410a() {
        try {
            if (this.f51a == null) {
                this.f51a = new byte[65535];
            }
            DatagramPacket datagramPacket = new DatagramPacket(this.f51a, this.f51a.length);
            this.f47c.receive(datagramPacket);
            return Segment.parse(datagramPacket.getData(), 0, datagramPacket.getLength());
        } catch (IOException e) {
            if (!isClosed()) {
                e.printStackTrace();
                return null;
            }
            return null;
        }
    }

    /* renamed from: b */
    protected void mo5396b() {
        this.f47c.close();
    }

    /* renamed from: e */
    protected void m5383e() {
        this.f77E.m5426e();
        this.f80H.m5426e();
        this.f56l = 4;
        Thread thread = new Thread() { // from class: a.a.h.1
            @Override // java.lang.Thread, java.lang.Runnable
            public void run() {
                ReliableSocket.this.f80H.m5425f();
                ReliableSocket.this.f77E.m5425f();
                try {
                    Thread.sleep(ReliableSocket.this.f65g.m5332g() * 2);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                ReliableSocket.this.f78F.m5425f();
                ReliableSocket.this.f79G.m5425f();
                ReliableSocket.this.mo5396b();
                ReliableSocket.this.m5366l();
            }
        };
        thread.setName("ReliableSocket-Closing");
        thread.setDaemon(true);
        thread.start();
    }

    /* renamed from: a */
    protected synchronized void mo5400a(String str) {
        System.out.println(getLocalPort() + ": " + str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public static int m5395b(int i) {
        return (i + 1) % 255;
    }

    /* renamed from: a */
    private int m5408a(int i, int i2) {
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

    /* renamed from: f */
    public synchronized void m5380f() {
        if (!this.f76h) {
            this.f76h = true;
            this.f77E.m5432a();
            this.f78F.m5432a();
            this.f79G.m5432a();
            this.f80H.m5432a();
        }
    }

    /* renamed from: g */
    public synchronized void m5377g() {
        if (this.f76h) {
            this.f76h = false;
            this.f78F.m5425f();
            this.f79G.m5425f();
            this.f80H.m5425f();
            this.f77E.m5425f();
        }
    }
}