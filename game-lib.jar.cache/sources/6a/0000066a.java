package com.corrodinggames.rts.java.steam;

import com.codedisaster.steamworks.SteamAPI;
import com.codedisaster.steamworks.SteamException;
import com.codedisaster.steamworks.SteamFriends;
import com.codedisaster.steamworks.SteamID;
import com.codedisaster.steamworks.SteamMatchmaking;
import com.codedisaster.steamworks.SteamNetworking;
import com.codedisaster.steamworks.SteamUGC;
import com.codedisaster.steamworks.SteamUtils;
import com.corrodinggames.librocket.scripts.Root;
import com.corrodinggames.librocket.scripts.ScriptEngine;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.f;
import com.corrodinggames.rts.gameFramework.mod.b;
import com.corrodinggames.rts.gameFramework.net.PlayerConnect;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.Iterator;

/* renamed from: com.corrodinggames.rts.java.c.b */
/* loaded from: game-lib.jar:com/corrodinggames/rts/java/c/b.class */
public class SteamEngine extends com.corrodinggames.rts.gameFramework.steam.SteamEngine {
    SteamFriendsCallback b;
    SteamFriends c;
    SteamMatchmaking d;
    SteamMatchmakingCallback e;
    SteamNetworkingCallback f;
    g g;
    SteamNetworking h;
    SteamUtilsCallback i;
    SteamUtils j;
    boolean k = false;
    HashMap l = new HashMap();
    ByteBuffer m;
    SteamID n;
    boolean o;
    SteamID p;

    public g n() {
        return this.g;
    }

    @Override // com.corrodinggames.rts.gameFramework.steam.SteamEngine
    public void b() {
        if (this.k) {
            GameEngine.m2e("SteamEngine - init already called");
            return;
        }
        this.k = true;
        GameEngine.m2e("SteamEngine - java steamEngine init()");
        try {
            if (!SteamAPI.init()) {
                GameEngine.print("steamAPI init failed");
                d();
                return;
            }
            this.m = ByteBuffer.allocateDirect(100000);
            this.b = new SteamFriendsCallback(this);
            this.c = new SteamFriends(this.b);
            this.e = new SteamMatchmakingCallback(this);
            this.d = new SteamMatchmaking(this.e);
            this.f = new SteamNetworkingCallback(this);
            this.h = new SteamNetworking(this.f, SteamNetworking.API.Client);
            this.g = new g(this);
            try {
                this.g.a(new SteamUGC(this.g.a()));
                this.i = new SteamUtilsCallback(this);
                this.j = new SteamUtils(this.i);
            } catch (RuntimeException e) {
                e.printStackTrace();
                throw new SteamException("Failed to create workshop");
            }
        } catch (SteamException e2) {
            e2.printStackTrace();
            d();
        }
    }

    @Override // com.corrodinggames.rts.gameFramework.steam.SteamEngine
    public void a(float f) {
        SteamAPI.runCallbacks();
        if (this.h != null) {
            if (GameEngine.aK != null) {
                GameEngine.m2e("Joining game from commandline invite:" + GameEngine.aK);
                long parseLong = Long.parseLong(GameEngine.aK);
                GameEngine.aK = null;
                this.d.joinLobby(SteamID.createFromNativeHandle(parseLong));
            }
            while (true) {
                int isP2PPacketAvailable = this.h.isP2PPacketAvailable(0);
                if (isP2PPacketAvailable != 0) {
                    if (isP2PPacketAvailable > this.m.capacity()) {
                        GameEngine.print("nextPacketSize:" + isP2PPacketAvailable + " larger then byteBuffer:" + this.m.capacity() + " resizing");
                        this.m = ByteBuffer.allocateDirect(isP2PPacketAvailable);
                    }
                    SteamID steamID = new SteamID();
                    try {
                        this.m.clear();
                        int readP2PPacket = this.h.readP2PPacket(steamID, this.m, 0);
                        if (readP2PPacket == 0) {
                            GameEngine.print("readP2PPacket with rtn==" + readP2PPacket);
                        }
                        SteamSocket steamSocket = (SteamSocket) this.l.get(steamID);
                        if (steamSocket != null && steamSocket.isClosed()) {
                            GameEngine.print("Removing stale steam socket");
                            this.l.remove(steamID);
                            steamSocket = null;
                        }
                        if (steamSocket == null) {
                            b(steamID);
                            steamSocket = (SteamSocket) this.l.get(steamID);
                        }
                        if (steamSocket == null) {
                            GameEngine.m2e("Could not find remote ID steamSocket: " + steamID);
                        } else {
                            byte[] bArr = new byte[this.m.limit()];
                            this.m.get(bArr);
                            steamSocket.c.a(bArr);
                        }
                    } catch (SteamException e) {
                        e.printStackTrace();
                    }
                } else {
                    return;
                }
            }
        }
    }

    @Override // com.corrodinggames.rts.gameFramework.steam.SteamEngine
    public void d() {
        GameEngine.print("JavaSteamEngine: disableSteam");
        GameEngine gameEngine = GameEngine.getGameEngine();
        if (gameEngine != null) {
            gameEngine.i("Steam connection failed.");
        } else {
            GameEngine.m2e("cannot show alert game has not been created");
        }
        com.corrodinggames.rts.gameFramework.steam.SteamEngine.steamEngine = new com.corrodinggames.rts.gameFramework.steam.SteamEngine();
    }

    @Override // com.corrodinggames.rts.gameFramework.steam.SteamEngine
    public String c() {
        return this.c.getPersonaName();
    }

    @Override // com.corrodinggames.rts.gameFramework.steam.SteamEngine
    public boolean f() {
        return false;
    }

    public void a(String str) {
        GameEngine.m2e("Steam: " + str);
    }

    public void b(String str) {
        GameEngine.print("Steam: " + str);
    }

    @Override // com.corrodinggames.rts.gameFramework.steam.SteamEngine
    public void i() {
        a("createLobby");
        if (this.n != null) {
            b("createLobby: activeLobby!=null");
        }
        this.d.createLobby(SteamMatchmaking.LobbyType.FriendsOnly, 10);
    }

    public synchronized void a(SteamID steamID) {
        GameEngine.getGameEngine();
        this.n = steamID;
    }

    public PlayerConnect b(SteamID steamID) {
        GameEngine.m2e("addPeer: " + steamID);
        GameEngine gameEngine = GameEngine.getGameEngine();
        SteamSocket steamSocket = (SteamSocket) this.l.get(steamID);
        if (steamSocket != null) {
            if (steamSocket.isClosed()) {
                this.l.remove(steamID);
            } else {
                b("addPeer, user already exists");
                try {
                    steamSocket.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        SteamSocket steamSocket2 = new SteamSocket(this, steamID);
        PlayerConnect playerConnect = new PlayerConnect(gameEngine.bX, steamSocket2);
        try {
            playerConnect.i = true;
            playerConnect.d();
            gameEngine.bX.socketList.add(playerConnect);
            this.l.put(steamID, steamSocket2);
            gameEngine.bX.Q();
            return playerConnect;
        } catch (IOException e2) {
            e2.printStackTrace();
            playerConnect.a("crash");
            return null;
        }
    }

    public void c(final SteamID steamID) {
        GameEngine.m2e("connectTo: " + steamID);
        SteamSocket steamSocket = (SteamSocket) this.l.get(steamID);
        if (steamSocket != null) {
            if (steamSocket.isClosed()) {
                this.l.remove(steamID);
            } else {
                b("connectTo, user already exists");
                try {
                    steamSocket.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        GameEngine.getGameEngine();
        if (!this.o) {
            ScriptEngine.getInstance().addRunnableToQueue(new Runnable() { // from class: com.corrodinggames.rts.java.c.b.1
                @Override // java.lang.Runnable
                public void run() {
                    GameEngine gameEngine = GameEngine.getGameEngine();
                    try {
                        SteamEngine.this.a("connectTo runnable start");
                        Root root = ScriptEngine.getInstance().getRoot();
                        gameEngine.bX.b("starting new");
                        SteamEngine.this.n = steamID;
                        SteamEngine.this.p = SteamEngine.this.d.getLobbyOwner(SteamEngine.this.n);
                        String str = gameEngine.settingsEngine.lastNetworkPlayerName;
                        String c = com.corrodinggames.rts.gameFramework.steam.SteamEngine.getSteamEngine().c();
                        if (c != null && str == null) {
                            str = f.a(c.replace(" ", "_"), 20);
                        }
                        gameEngine.bX.y = str;
                        SteamSocket steamSocket2 = new SteamSocket(SteamEngine.this, SteamEngine.this.p);
                        SteamEngine.this.l.put(SteamEngine.this.p, steamSocket2);
                        gameEngine.bX.bindSocket(steamSocket2);
                        Iterator it = gameEngine.bX.socketList.iterator();
                        while (it.hasNext()) {
                            ((PlayerConnect) it.next()).i = true;
                        }
                        SteamEngine.this.a("connected");
                        root.showBattleroom();
                        SteamEngine.this.a("connectTo runnable end");
                    } catch (IOException e2) {
                        gameEngine.c(e2.getMessage(), "Connection failed");
                        e2.printStackTrace();
                    }
                }
            });
            return;
        }
        a("connectTo as server?");
        b(steamID);
    }

    @Override // com.corrodinggames.rts.gameFramework.steam.SteamEngine
    public void j() {
        a("stopLobby");
        if (this.n == null) {
            b("stopLobby: activeLobby==null");
        } else {
            this.d.leaveLobby(this.n);
        }
        a("stopLobby: activeSteamSockets:" + this.l.size());
        for (SteamSocket steamSocket : this.l.values()) {
            try {
                steamSocket.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        this.l.clear();
        this.n = null;
        this.p = null;
    }

    @Override // com.corrodinggames.rts.gameFramework.steam.SteamEngine
    public void g() {
        if (this.n == null) {
        }
        if (this.n == null) {
            GameEngine.getGameEngine().i("Error: No steam lobby has been started");
        } else {
            this.c.activateGameOverlayInviteDialog(this.n);
        }
    }

    @Override // com.corrodinggames.rts.gameFramework.steam.SteamEngine
    public void k() {
        this.g.c();
    }

    @Override // com.corrodinggames.rts.gameFramework.steam.SteamEngine
    public void l() {
        this.g.d();
    }

    @Override // com.corrodinggames.rts.gameFramework.steam.SteamEngine
    public void m() {
        n().b();
    }

    @Override // com.corrodinggames.rts.gameFramework.steam.SteamEngine
    public void a(b bVar) {
        n().c(bVar);
    }

    @Override // com.corrodinggames.rts.gameFramework.steam.SteamEngine
    public void b(b bVar) {
        n().b(bVar);
    }

    @Override // com.corrodinggames.rts.gameFramework.steam.SteamEngine
    public void a(b bVar, boolean z, String str) {
        n().a(bVar, z, str);
    }
}