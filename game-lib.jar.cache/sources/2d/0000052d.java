package com.corrodinggames.rts.gameFramework.net;

import com.corrodinggames.rts.appFramework.n;
import com.corrodinggames.rts.game.Player;
import com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.f;
import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.util.concurrent.ConcurrentLinkedQueue;

/* renamed from: com.corrodinggames.rts.gameFramework.j.c */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/j/c.class */
public class PlayerConnect {
    private final GameNetEngine W;
    public int c;
    public Socket d;
    InetAddress e;
    public long g;
    public boolean h;
    public boolean i;
    public PlayerConnect j;
    Packet l;
    public String m;
    public String n;
    public String o;
    public boolean p;
    public boolean q;
    public boolean r;
    public boolean s;
    public boolean t;
    public boolean u;

    /* renamed from: v */
    public boolean desyncCountFlag;

    /* renamed from: w */
    public boolean fastSyncFlag;
    public int x;

    /* renamed from: y */
    public int desyncCount;

    /* renamed from: z */
    public Player player;
    ReciveSocketInStream F;
    SendSocketOutStream G;
    Thread H;
    Thread I;
    public String L;
    public int M;
    public boolean N;
    public boolean O;
    public int P;
    public boolean Q;
    public int R;
    public long S;
    public boolean T;
    volatile int U;
    volatile int V;

    /* renamed from: a */
    volatile boolean f577a = false;
    volatile boolean b = false;
    ConcurrentLinkedQueue f = new ConcurrentLinkedQueue();
    public int k = -1;
    int A = -1;
    long B = -1;
    boolean C = false;
    boolean D = false;
    public int E = 999999;
    boolean J = false;
    boolean K = false;

    public PlayerConnect(GameNetEngine gameNetEngine, Socket socket) {
        this.W = gameNetEngine;
        this.d = socket;
        synchronized (this.W.aQ) {
            this.c = this.W.aP;
            this.W.aP++;
        }
        this.M = f.a(1, 1000000);
    }

    public boolean a() {
        if (this.S < System.currentTimeMillis() - 10000) {
            this.S = System.currentTimeMillis();
            this.R = 0;
        }
        if (this.R > 100) {
            if (!this.T) {
                this.T = true;
                c("Command limit was reached");
                return true;
            }
            return true;
        }
        this.R++;
        return false;
    }

    public int b() {
        if (this.B == -1) {
            return -2;
        }
        if (this.B < System.currentTimeMillis() - 5000) {
            return -1;
        }
        return this.A;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int c() {
        Player player = this.player;
        if (player != null) {
            return player.k;
        }
        return -1;
    }

    public synchronized void d() {
        this.G = new SendSocketOutStream(this);
        this.I = new Thread(this.G);
        this.I.setDaemon(true);
        this.I.start();
        this.F = new ReciveSocketInStream(this);
        this.H = new Thread(this.F);
        this.H.setDaemon(true);
        this.H.start();
    }

    private void i() {
        Player player;
        this.f577a = true;
        if (this.W.isServer && !this.W.n() && (player = this.player) != null) {
            this.player = null;
            if (this.W.d(player) == null) {
                player.I();
                this.W.P();
                n.o();
            }
        }
        if (this.H != null) {
            this.H.interrupt();
        }
        this.W.b(this);
        this.p = false;
        if (this.q) {
            this.W.c(this, "Closing");
        }
    }

    private synchronized void j() {
        if (this.f577a) {
            return;
        }
        this.b = true;
        if (this.G != null) {
            this.G.a();
        }
        if (this.H != null) {
            this.H.interrupt();
        }
        this.W.b(this);
    }

    public void a(String str) {
        GameOutputStream gameOutputStream = new GameOutputStream();
        if (str == null) {
            str = "NULL";
        }
        try {
            gameOutputStream.writeString(str);
            a(gameOutputStream.getPacket(111));
            j();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void a(boolean z, boolean z2) {
        a(z, z2, "Time out");
    }

    /* renamed from: e */
    public String getName() {
        String str = "<null>";
        if (this.player != null) {
            str = this.player.name;
        }
        return str;
    }

    public String f() {
        InetAddress inetAddress;
        if (this.j != null) {
            return this.n;
        }
        try {
            Socket socket = this.d;
            if (socket != null && (inetAddress = socket.getInetAddress()) != null) {
                return inetAddress.getHostAddress();
            }
            return null;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public String g() {
        if (this.j != null) {
            return this.n == null ? "<forwarded unknown>" : this.n;
        }
        String str = "<no socket>";
        try {
            Socket socket = this.d;
            if (socket != null) {
                str = "<no bond socket>";
                InetAddress inetAddress = socket.getInetAddress();
                if (inetAddress != null) {
                    str = inetAddress.getHostAddress();
                }
            }
            return str;
        } catch (Exception e) {
            e.printStackTrace();
            return "<socket error>";
        }
    }

    public synchronized void a(boolean z, boolean z2, String str) {
        if (!this.f577a) {
            c("handleRemoteDisconnect");
            String str2 = null;
            if (this.player != null) {
                str2 = this.player.name;
            }
            String str3 = null;
            if (this.player != null) {
                String str4 = "player";
                String str5 = VariableScope.nullOrMissingString;
                if (this.player.b()) {
                    str4 = "spectator";
                } else if (this.W.aW) {
                    str5 = this.player.a(false, false) == 0 ? " (Had no units)" : " (Team " + this.player.h() + ")";
                }
                str3 = str4 + " '" + this.player.name + "' disconnected" + str5;
            } else if (this.p) {
                if (this.s && this.q) {
                    str3 = "relay server disconnected";
                } else {
                    str3 = "a player disconnected";
                }
            }
            if (!this.W.isServer) {
                str3 = "The server disconnected";
            }
            if (str3 != null && str != null) {
                str3 = str3 + "  (" + GameNetEngine.i(str) + ")";
            }
            i();
            if (str3 != null) {
                boolean z3 = false;
                if (this.player != null && this.W.isServer && this.W.d(this.player) != null) {
                    z3 = true;
                }
                if (!z3) {
                    if (!this.W.isServer) {
                        this.W.f(str3);
                    } else {
                        this.W.j(str3);
                    }
                } else {
                    c("Not sending: '" + str3 + "' still another active connection");
                }
            }
            this.W.d.b(this, str2);
        } else {
            c("handleRemoteDisconnect: connection is already disconnecting");
        }
        if (!z2 && this.G != null) {
            this.G.a();
        }
        if (z2) {
            this.J = true;
        }
        if (z) {
            this.K = true;
        }
        if (this.J && this.K) {
            try {
                this.d.close();
            } catch (IOException e) {
                GameEngine.a("Error while closing network socket", (Throwable) e);
            }
            this.I = null;
            this.H = null;
            this.G = null;
            this.F = null;
            if (this.f != null) {
                this.f.clear();
            }
        }
    }

    public void a(String str, Throwable th) {
        GameEngine.a(d(str), th);
    }

    public void b(String str) {
        GameEngine.print(d(str));
    }

    public void c(String str) {
        GameEngine.m2e(d(str));
    }

    public String d(String str) {
        Player player;
        String str2 = "id:" + this.c + ": " + str;
        if (this.player != null) {
            str2 = str2 + " (Player:" + player.name + ")";
        }
        return str2;
    }

    public void a(Packet packet) {
        if (this.G == null && this.f577a) {
            return;
        }
        this.G.a(packet);
    }

    public boolean h() {
        return !this.f577a;
    }

    public void finalize() {
        try {
            if (this.d == null || this.d.isClosed()) {
                return;
            }
            GameEngine.m2e("Connection::finalize called on unclosed socket (index:" + this.c + ")");
            if (this.d.getInetAddress() == null) {
                GameEngine.m2e("Skipping possible steam socket");
            }
            try {
                this.d.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (RuntimeException e2) {
            e2.printStackTrace();
        }
    }
}