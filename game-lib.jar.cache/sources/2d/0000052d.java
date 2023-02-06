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

    /* renamed from: W */
    private final GameNetEngine gameNetEngine;

    /* renamed from: c */
    public int connectIndex;

    /* renamed from: d */
    public Socket socket;
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

    /* renamed from: F */
    ReciveSocketInStream inStream;

    /* renamed from: G */
    SendSocketOutStream outStream;

    /* renamed from: H */
    Thread inStreamThread;

    /* renamed from: I */
    Thread outStreamThread;
    public String L;

    /* renamed from: M */
    public int connectKey;
    public boolean N;
    public boolean O;
    public int P;
    public boolean Q;
    public int R;
    public long S;
    public boolean T;
    volatile int U;
    volatile int V;
    volatile boolean a = false;
    volatile boolean b = false;
    ConcurrentLinkedQueue f = new ConcurrentLinkedQueue();
    public int k = -1;
    int A = -1;
    long B = -1;
    boolean C = false;
    boolean D = false;

    /* renamed from: E */
    public int clientVersion = 999999;
    boolean J = false;
    boolean K = false;

    public PlayerConnect(GameNetEngine gameNetEngine, Socket socket) {
        this.gameNetEngine = gameNetEngine;
        this.socket = socket;
        synchronized (this.gameNetEngine.indexSync) {
            this.connectIndex = this.gameNetEngine.connectIndex;
            this.gameNetEngine.connectIndex++;
        }
        this.connectKey = f.rand(1, 1000000);
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

    int c() {
        Player player = this.player;
        if (player != null) {
            return player.site;
        }
        return -1;
    }

    public synchronized void d() {
        this.outStream = new SendSocketOutStream(this);
        this.outStreamThread = new Thread(this.outStream);
        this.outStreamThread.setDaemon(true);
        this.outStreamThread.start();
        this.inStream = new ReciveSocketInStream(this);
        this.inStreamThread = new Thread(this.inStream);
        this.inStreamThread.setDaemon(true);
        this.inStreamThread.start();
    }

    private void i() {
        Player player;
        this.a = true;
        if (this.gameNetEngine.isServer && !this.gameNetEngine.n() && (player = this.player) != null) {
            this.player = null;
            if (this.gameNetEngine.d(player) == null) {
                player.I();
                this.gameNetEngine.P();
                n.o();
            }
        }
        if (this.inStreamThread != null) {
            this.inStreamThread.interrupt();
        }
        this.gameNetEngine.b(this);
        this.p = false;
        if (this.q) {
            this.gameNetEngine.c(this, "Closing");
        }
    }

    private synchronized void j() {
        if (this.a) {
            return;
        }
        this.b = true;
        if (this.outStream != null) {
            this.outStream.a();
        }
        if (this.inStreamThread != null) {
            this.inStreamThread.interrupt();
        }
        this.gameNetEngine.b(this);
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
            Socket socket = this.socket;
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
            Socket socket = this.socket;
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
        if (!this.a) {
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
                } else if (this.gameNetEngine.aW) {
                    str5 = this.player.a(false, false) == 0 ? " (Had no units)" : " (Team " + this.player.getPlayerTeamName() + ")";
                }
                str3 = str4 + " '" + this.player.name + "' disconnected" + str5;
            } else if (this.p) {
                if (this.s && this.q) {
                    str3 = "relay server disconnected";
                } else {
                    str3 = "a player disconnected";
                }
            }
            if (!this.gameNetEngine.isServer) {
                str3 = "The server disconnected";
            }
            if (str3 != null && str != null) {
                str3 = str3 + "  (" + GameNetEngine.i(str) + ")";
            }
            i();
            if (str3 != null) {
                boolean z3 = false;
                if (this.player != null && this.gameNetEngine.isServer && this.gameNetEngine.d(this.player) != null) {
                    z3 = true;
                }
                if (!z3) {
                    if (!this.gameNetEngine.isServer) {
                        this.gameNetEngine.f(str3);
                    } else {
                        this.gameNetEngine.j(str3);
                    }
                } else {
                    c("Not sending: '" + str3 + "' still another active connection");
                }
            }
            this.gameNetEngine.d.b(this, str2);
        } else {
            c("handleRemoteDisconnect: connection is already disconnecting");
        }
        if (!z2 && this.outStream != null) {
            this.outStream.a();
        }
        if (z2) {
            this.J = true;
        }
        if (z) {
            this.K = true;
        }
        if (this.J && this.K) {
            try {
                this.socket.close();
            } catch (IOException e) {
                GameEngine.a("Error while closing network socket", (Throwable) e);
            }
            this.outStreamThread = null;
            this.inStreamThread = null;
            this.outStream = null;
            this.inStream = null;
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
        GameEngine.m5e(d(str));
    }

    public String d(String str) {
        Player player;
        String str2 = "id:" + this.connectIndex + ": " + str;
        if (this.player != null) {
            str2 = str2 + " (Player:" + player.name + ")";
        }
        return str2;
    }

    public void a(Packet packet) {
        if (this.outStream == null && this.a) {
            return;
        }
        this.outStream.a(packet);
    }

    public boolean h() {
        return !this.a;
    }

    public void finalize() {
        try {
            if (this.socket == null || this.socket.isClosed()) {
                return;
            }
            GameEngine.m5e("Connection::finalize called on unclosed socket (index:" + this.connectIndex + ")");
            if (this.socket.getInetAddress() == null) {
                GameEngine.m5e("Skipping possible steam socket");
            }
            try {
                this.socket.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (RuntimeException e2) {
            e2.printStackTrace();
        }
    }
}