package com.corrodinggames.rts.gameFramework;

import android.graphics.PointF;
import com.corrodinggames.rts.game.PlayerData;
import com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope;
import com.corrodinggames.rts.gameFramework.net.GameInputStream;
import com.corrodinggames.rts.gameFramework.net.GameNetEngine;
import com.corrodinggames.rts.gameFramework.net.GameOutputStream;
import java.io.IOException;
import java.util.AbstractList;
import java.util.Iterator;

/* renamed from: com.corrodinggames.rts.gameFramework.e */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/e.class */
public class SyncPacket {

    /* renamed from: a  reason: collision with root package name */
    public boolean f475a;
    public String b;

    /* renamed from: c */
    public int localTick;
    public int d;
    public PlayerData i;
    public com.corrodinggames.rts.game.units.au j;
    public PointF l;
    public com.corrodinggames.rts.game.units.am m;
    public com.corrodinggames.rts.game.units.a n;
    private PointF z;
    public PlayerData p;
    public short q;
    public boolean r;
    public float s;
    public float t;
    public int u;
    final /* synthetic */ c y;
    public boolean e = false;
    public boolean f = false;
    public boolean g = false;
    public boolean h = false;
    public com.corrodinggames.rts.game.units.a.c k = com.corrodinggames.rts.game.units.a.s.i;
    public boolean o = false;
    private com.corrodinggames.rts.gameFramework.utility.m A = new com.corrodinggames.rts.gameFramework.utility.m();
    com.corrodinggames.rts.gameFramework.utility.m v = new com.corrodinggames.rts.gameFramework.utility.m();
    com.corrodinggames.rts.gameFramework.utility.m w = new com.corrodinggames.rts.gameFramework.utility.m();
    public boolean x = false;

    public SyncPacket(c cVar) {
        this.y = cVar;
    }

    public boolean a() {
        Iterator it = this.w.iterator();
        while (it.hasNext()) {
            if (((d) it.next()).f466a.a() == null) {
                return false;
            }
        }
        return true;
    }

    public void b() {
        GameEngine gameEngine = GameEngine.getGameEngine();
        this.x = true;
        ab c = gameEngine.bV.c();
        Iterator it = this.v.iterator();
        while (it.hasNext()) {
            c.f399a.add((com.corrodinggames.rts.game.units.y) it.next());
        }
        if (this.j != null) {
            float g = this.j.g();
            float h = this.j.h();
            if (this.j.d() != com.corrodinggames.rts.game.units.av.move && this.j.d() != com.corrodinggames.rts.game.units.av.attackMove && this.j.d() != com.corrodinggames.rts.game.units.av.attack) {
                return;
            }
            Iterator it2 = c.a(g, h, this.j.j).iterator();
            while (it2.hasNext()) {
                com.corrodinggames.rts.game.units.y yVar = (com.corrodinggames.rts.game.units.y) it2.next();
                if (!yVar.aK() && yVar.I() && (!this.e || yVar.ar() == null)) {
                    int i = 0;
                    if (this.j.d() == com.corrodinggames.rts.game.units.av.attack) {
                        i = yVar.q(this.j.i());
                    }
                    d dVar = new d();
                    dVar.b = yVar.eh;
                    dVar.c = yVar.eo;
                    dVar.d = yVar.ep;
                    dVar.e = g;
                    dVar.f = h;
                    dVar.g = gameEngine.tick;
                    dVar.h = yVar.h();
                    dVar.f466a = yVar.a(g, h, i, true, false, false);
                    dVar.f466a.t = 120.0f;
                    dVar.f466a.s = dVar.f466a.t;
                    dVar.f466a.u = true;
                    this.w.add(dVar);
                }
            }
        }
    }

    public PlayerData c() {
        return this.i;
    }

    public int d() {
        return this.A.size() + this.v.size();
    }

    public boolean e() {
        if (!com.corrodinggames.rts.game.units.a.s.c(this.k) && d() == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public synchronized SyncPacket clone() {
        try {
            GameOutputStream gameOutputStream = new GameOutputStream();
            write(gameOutputStream);
            GameInputStream gameInputStream = new GameInputStream(gameOutputStream.toByteArray());
            SyncPacket syncPacket = new SyncPacket(this.y);
            syncPacket.localTick = this.localTick;
            syncPacket.read(gameInputStream);
            return syncPacket;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void g() {
        if (this.j != null) {
            Iterator it = this.v.iterator();
            while (it.hasNext()) {
                this.A.add(Long.valueOf(((com.corrodinggames.rts.game.units.y) it.next()).eh));
            }
            this.v.clear();
            this.j.k();
        }
    }

    /* renamed from: a */
    public synchronized void write(GameOutputStream gameOutputStream) {
        gameOutputStream.e("c");
        gameOutputStream.writeByte(this.i.k);
        gameOutputStream.writeBoolean(this.j != null);
        if (this.j != null) {
            this.j.a(gameOutputStream);
        }
        gameOutputStream.writeBoolean(this.e);
        gameOutputStream.writeBoolean(this.g);
        gameOutputStream.writeInt(-1);
        gameOutputStream.writeEnum(this.n);
        gameOutputStream.writeBoolean(this.z != null);
        if (this.z != null) {
            gameOutputStream.writeFloat(this.z.x);
            gameOutputStream.writeFloat(this.z.y);
        }
        gameOutputStream.writeBoolean(this.o);
        gameOutputStream.writeInt(this.v.size() + this.A.size());
        Iterator it = this.v.iterator();
        while (it.hasNext()) {
            gameOutputStream.writeLong(((com.corrodinggames.rts.game.units.y) it.next()).eh);
        }
        Iterator it2 = this.A.iterator();
        while (it2.hasNext()) {
            gameOutputStream.writeLong(((Long) it2.next()).longValue());
        }
        gameOutputStream.writeBoolean(this.p != null);
        if (this.p != null) {
            gameOutputStream.a(this.p);
        }
        gameOutputStream.writeBoolean(this.l != null);
        if (this.l != null) {
            gameOutputStream.writeFloat(this.l.x);
            gameOutputStream.writeFloat(this.l.y);
        }
        gameOutputStream.a(this.m);
        gameOutputStream.writeString(this.k.a());
        gameOutputStream.writeBoolean(this.f);
        gameOutputStream.a(this.q);
        gameOutputStream.writeBoolean(this.r);
        if (this.r) {
            gameOutputStream.writeByte(0);
            gameOutputStream.writeFloat(this.s);
            gameOutputStream.writeFloat(this.t);
            gameOutputStream.writeInt(this.u);
        }
        gameOutputStream.writeInt(this.w.size());
        for (int i = 0; i < this.w.size(); i++) {
            ((d) this.w.get(i)).a(gameOutputStream);
        }
        gameOutputStream.writeBoolean(this.h);
        gameOutputStream.endBlock("c");
    }

    /* renamed from: a */
    public void read(GameInputStream gameInputStream) {
        gameInputStream.startBlock("c");
        this.i = PlayerData.k(gameInputStream.readByte());
        if (this.i == null) {
            throw new IOException("team==null");
        }
        if (gameInputStream.readBoolean()) {
            this.j = new com.corrodinggames.rts.game.units.au();
            this.j.a(gameInputStream);
        }
        this.e = gameInputStream.readBoolean();
        this.g = gameInputStream.readBoolean();
        this.k = com.corrodinggames.rts.game.units.a.c.a(String.valueOf(gameInputStream.readInt()));
        this.n = (com.corrodinggames.rts.game.units.a) gameInputStream.b(com.corrodinggames.rts.game.units.a.class);
        if (gameInputStream.readBoolean()) {
            this.z = new PointF();
            this.z.x = gameInputStream.readFloat();
            this.z.y = gameInputStream.readFloat();
        }
        this.o = gameInputStream.readBoolean();
        int readInt = gameInputStream.readInt();
        for (int i = 0; i < readInt; i++) {
            this.A.add(Long.valueOf(gameInputStream.m318n()));
        }
        if (gameInputStream.b() >= 16) {
            this.p = null;
            if (gameInputStream.readBoolean()) {
                this.p = gameInputStream.s();
            }
        }
        if (gameInputStream.b() >= 29) {
            if (gameInputStream.readBoolean()) {
                this.l = new PointF();
                this.l.x = gameInputStream.readFloat();
                this.l.y = gameInputStream.readFloat();
            }
            this.m = gameInputStream.o();
        }
        if (gameInputStream.b() >= 33) {
            this.k = com.corrodinggames.rts.game.units.a.c.a(gameInputStream.readString());
        }
        if (gameInputStream.b() >= 37) {
            this.f = gameInputStream.readBoolean();
        }
        if (gameInputStream.b() >= 52) {
            this.q = gameInputStream.readShort();
        }
        if (gameInputStream.b() >= 53) {
            this.r = gameInputStream.readBoolean();
            if (this.r) {
                gameInputStream.readByte();
                this.s = gameInputStream.readFloat();
                this.t = gameInputStream.readFloat();
                this.u = gameInputStream.readInt();
            }
            int readInt2 = gameInputStream.readInt();
            this.w.clear();
            for (int i2 = 0; i2 < readInt2; i2++) {
                d dVar = new d();
                dVar.a(gameInputStream);
                this.w.add(dVar);
            }
        }
        if (gameInputStream.b() >= 80) {
            this.h = gameInputStream.readBoolean();
        }
        gameInputStream.endBlock("c");
    }

    public void a(AbstractList abstractList) {
        Iterator it = abstractList.iterator();
        while (it.hasNext()) {
            a((com.corrodinggames.rts.game.units.y) it.next());
        }
    }

    public void a(com.corrodinggames.rts.game.units.y yVar) {
        if (yVar == null) {
            throw new RuntimeException("unit cannot be null");
        }
        if (yVar.bX != this.i) {
        }
        if (this.i.w) {
            if (yVar.bX != this.i && GameEngine.getGameEngine().bs != this.i) {
                GameEngine.b("CommandController", "Warning AI: " + this.i.k + " gave an order to unit with team:" + yVar.bX.k + " type:" + yVar.r().i());
                GameEngine.g(VariableScope.nullOrMissingString);
            }
            if (yVar.cW()) {
                GameEngine.b("CommandController", "Warning AI: " + this.i.k + " gave an order to unit with canNotBeGivenOrdersByPlayer: " + yVar.r().i());
            }
        }
        this.v.add(yVar);
    }

    public void h() {
        this.o = true;
    }

    public void a(float f, float f2) {
        this.j = new com.corrodinggames.rts.game.units.au();
        this.j.a(f, f2);
    }

    public void b(float f, float f2) {
        this.j = new com.corrodinggames.rts.game.units.au();
        this.j.b(f, f2);
    }

    public void a(com.corrodinggames.rts.game.units.am amVar) {
        this.j = new com.corrodinggames.rts.game.units.au();
        this.j.a(amVar);
    }

    public void a(float f, float f2, boolean z) {
        this.j = new com.corrodinggames.rts.game.units.au();
        this.j.b(f, f2);
        this.j.j = z;
    }

    public void a(com.corrodinggames.rts.game.units.am amVar, boolean z) {
        this.j = new com.corrodinggames.rts.game.units.au();
        this.j.a(amVar);
        this.j.j = z;
    }

    public void a(float f, float f2, com.corrodinggames.rts.game.units.as asVar, int i) {
        this.j = new com.corrodinggames.rts.game.units.au();
        this.j.a(f, f2, asVar, i);
    }

    public void b(com.corrodinggames.rts.game.units.am amVar) {
        this.j = new com.corrodinggames.rts.game.units.au();
        this.j.b(amVar);
    }

    public void c(com.corrodinggames.rts.game.units.am amVar) {
        this.j = new com.corrodinggames.rts.game.units.au();
        this.j.c(amVar);
    }

    public void c(float f, float f2) {
        this.j = new com.corrodinggames.rts.game.units.au();
        this.j.c(f, f2);
    }

    public void d(com.corrodinggames.rts.game.units.am amVar) {
        this.j = new com.corrodinggames.rts.game.units.au();
        this.j.f(amVar);
    }

    public void e(com.corrodinggames.rts.game.units.am amVar) {
        this.j = new com.corrodinggames.rts.game.units.au();
        this.j.g(amVar);
    }

    public void f(com.corrodinggames.rts.game.units.am amVar) {
        this.j = new com.corrodinggames.rts.game.units.au();
        this.j.h(amVar);
    }

    public void a(com.corrodinggames.rts.game.units.a.c cVar) {
        this.k = cVar;
    }

    public void a(com.corrodinggames.rts.game.units.a.c cVar, PointF pointF, com.corrodinggames.rts.game.units.am amVar) {
        this.k = cVar;
        this.l = pointF;
        this.m = amVar;
    }

    public void a(com.corrodinggames.rts.game.units.a aVar) {
        this.n = aVar;
    }

    public void a(PointF pointF) {
        this.z = pointF;
    }

    public synchronized void i() {
        Iterator it = this.A.iterator();
        while (it.hasNext()) {
            com.corrodinggames.rts.game.units.y b = w.b(((Long) it.next()).longValue(), true);
            if (b != null) {
                this.v.add(b);
            }
        }
        this.A.clear();
        Iterator it2 = this.v.iterator();
        while (it2.hasNext()) {
            if (((com.corrodinggames.rts.game.units.y) it2.next()).bV) {
                it2.remove();
            }
        }
    }

    public void j() {
        if (com.corrodinggames.rts.game.units.a.s.c(this.k)) {
            Iterator it = this.v.iterator();
            while (it.hasNext()) {
                com.corrodinggames.rts.game.units.y yVar = (com.corrodinggames.rts.game.units.y) it.next();
                yVar.b(yVar.a(this.k), this.g);
            }
        }
    }

    public void k() {
        com.corrodinggames.rts.game.units.au at;
        String str;
        GameEngine gameEngine = GameEngine.getGameEngine();
        if (gameEngine.cb.j() && !this.f475a) {
            return;
        }
        i();
        if (this.r) {
            if (this.s != 0.0f) {
                GameEngine.m328e("issueCommand: changeStepRate:" + this.s);
                gameEngine.bX.setCurrentStepRate(this.s, "command");
                return;
            } else if (this.u != 0) {
                GameEngine.m328e("system action:" + this.u);
                if (this.u == 1) {
                    GameEngine.m328e("new DebugDesyncDetector");
                    new com.corrodinggames.rts.game.units.g(false).b(PlayerData.i);
                    return;
                } else if (this.u == 2) {
                    GameEngine.m328e("new DebugDesyncDetector (stress test)");
                    com.corrodinggames.rts.game.units.g gVar = new com.corrodinggames.rts.game.units.g(false);
                    gVar.b(PlayerData.i);
                    gVar.f365a = true;
                    return;
                } else if (this.u == 100) {
                    GameEngine.m328e("team surrender");
                    if (this.i == null) {
                        GameEngine.m328e("team not found");
                        return;
                    }
                    if (gameEngine.bX.isServer) {
                        gameEngine.bX.j("'" + this.i.name + "' has surrendered");
                    }
                    this.i.E = true;
                    Iterator it = com.corrodinggames.rts.game.units.am.bE.iterator();
                    while (it.hasNext()) {
                        com.corrodinggames.rts.game.units.am amVar = (com.corrodinggames.rts.game.units.am) it.next();
                        if (amVar.bX == this.i && (amVar instanceof com.corrodinggames.rts.game.units.y)) {
                            ((com.corrodinggames.rts.game.units.y) amVar).c(false);
                        }
                    }
                    return;
                } else if (this.u == 200) {
                    GameEngine.m328e("queue quick resync");
                    gameEngine.bX.N = true;
                    return;
                } else if (this.u == 5) {
                    GameEngine.m328e("system command spawn");
                    if (this.j == null || this.j.d() != com.corrodinggames.rts.game.units.av.build || this.j.a() == null) {
                        GameEngine.m328e("system command spawn - failed");
                        return;
                    }
                    int b = this.j.b();
                    com.corrodinggames.rts.game.units.as a2 = this.j.a();
                    boolean z = false;
                    if (this.i != null && this.i == gameEngine.bs && gameEngine.bs.a(false, false) == 0) {
                        z = true;
                    }
                    com.corrodinggames.rts.game.units.am a3 = a2.a();
                    a3.eo = this.j.g();
                    a3.ep = this.j.h();
                    if (this.i != null) {
                        a3.f(this.i);
                    } else {
                        a3.f(PlayerData.i);
                    }
                    a3.B(null);
                    if (b != 1 && (a3 instanceof com.corrodinggames.rts.game.units.y)) {
                        ((com.corrodinggames.rts.game.units.y) a3).a(b);
                    }
                    a3.cP();
                    if (a3 instanceof com.corrodinggames.rts.game.units.y) {
                        com.corrodinggames.rts.game.units.y yVar = (com.corrodinggames.rts.game.units.y) a3;
                        yVar.br();
                        if (a3.bI()) {
                            gameEngine.bU.a(yVar);
                        }
                    }
                    PlayerData.c(a3);
                    if (gameEngine.bs == a3.bX && a3.bX != PlayerData.i && !a3.u() && z) {
                        gameEngine.b(a3.eo, a3.ep);
                        gameEngine.bS.j(a3);
                        return;
                    }
                    return;
                } else {
                    GameEngine.m328e("issueCommand: unknown system action:" + this.u);
                    return;
                }
            } else {
                GameEngine.m328e("issueCommand: Null System action");
                return;
            }
        }
        if (this.p != null) {
            this.p.Y = System.currentTimeMillis();
            this.p.Z = gameEngine.by;
        }
        if (this.p != null) {
            String str2 = null;
            com.corrodinggames.rts.game.units.y yVar2 = null;
            Iterator it2 = this.v.iterator();
            while (it2.hasNext()) {
                com.corrodinggames.rts.game.units.y yVar3 = (com.corrodinggames.rts.game.units.y) it2.next();
                if (yVar3.bX != this.p && !a(this.p, yVar3.bX)) {
                    if (str2 == null) {
                        str = VariableScope.nullOrMissingString;
                    } else {
                        str = str2 + ", ";
                    }
                    if (yVar2 == null) {
                        yVar2 = yVar3;
                    }
                    str2 = str + yVar3.eh;
                    it2.remove();
                } else if (yVar3.cW()) {
                    c.a("Warning unit: " + yVar3.eh + " has canNotBeGivenOrdersByPlayer set");
                    it2.remove();
                }
            }
            if (str2 != null) {
                GameNetEngine.a("Player(" + this.p.k + ") " + this.p.name + " cannot control units: " + str2, true);
                if (yVar2 != null) {
                    String str3 = VariableScope.nullOrMissingString;
                    if (yVar2.bX != null) {
                        str3 = str3 + " targetUnitTeamId: " + yVar2.bX.k + " targetUnitTeamName: " + yVar2.bX.name;
                    }
                    c.a(str3);
                }
            }
        }
        if (this.o) {
            Iterator it3 = this.v.iterator();
            while (it3.hasNext()) {
                com.corrodinggames.rts.game.units.y yVar4 = (com.corrodinggames.rts.game.units.y) it3.next();
                yVar4.az();
                yVar4.R = null;
            }
        }
        if (this.j != null) {
            this.j.c();
            ab b2 = gameEngine.bV.b();
            b2.g = this.w;
            int i = 0;
            while (i <= 1) {
                boolean z2 = i == 1;
                Iterator it4 = this.v.iterator();
                while (it4.hasNext()) {
                    com.corrodinggames.rts.game.units.y yVar5 = (com.corrodinggames.rts.game.units.y) it4.next();
                    if (yVar5.ae == z2) {
                        if (this.f) {
                            yVar5.aA();
                        } else if (!this.e) {
                            yVar5.az();
                        } else if (this.h && this.j != null && (at = yVar5.at()) != null && this.j.a(at) && (at.d() == com.corrodinggames.rts.game.units.av.attackMove || at.d() == com.corrodinggames.rts.game.units.av.move)) {
                            if (this.j.d() == com.corrodinggames.rts.game.units.av.attackMove || this.j.d() == com.corrodinggames.rts.game.units.av.move) {
                                yVar5.au();
                            }
                        }
                    }
                }
                i++;
            }
            Iterator it5 = this.v.iterator();
            while (it5.hasNext()) {
                com.corrodinggames.rts.game.units.y yVar6 = (com.corrodinggames.rts.game.units.y) it5.next();
                if (!yVar6.a(this.j, c.e < 5)) {
                    String str4 = VariableScope.nullOrMissingString;
                    if (this.p != null) {
                        str4 = "Player(" + this.p.k + ") " + this.p.name + ": ";
                    }
                    c.a(str4 + "isValidNewWaypoint==false on: " + yVar6.c());
                } else {
                    com.corrodinggames.rts.game.units.au d = yVar6.d(this.j);
                    b2.a(yVar6, d);
                    yVar6.a(d);
                }
            }
            b2.b();
            return;
        }
        if (com.corrodinggames.rts.game.units.a.s.c(this.k)) {
            Iterator it6 = this.v.iterator();
            while (it6.hasNext()) {
                com.corrodinggames.rts.game.units.y yVar7 = (com.corrodinggames.rts.game.units.y) it6.next();
                com.corrodinggames.rts.game.units.a.s a4 = yVar7.a(this.k);
                if (a4 == null) {
                    c.a("Could not find specialAction:" + this.k.a() + " on " + yVar7.r().i());
                } else if (!a4.b(yVar7)) {
                    c.a("!isAvailable specialAction:" + this.k.a() + " on " + yVar7.r().i() + " (action being skipped)");
                    if (c.f462a) {
                        c.a("Command source:" + this.b);
                    }
                } else {
                    yVar7.a(a4);
                    com.corrodinggames.rts.gameFramework.f.an.a(yVar7, a4);
                    yVar7.a(a4, this.g, this.l, this.m);
                }
            }
            com.corrodinggames.rts.game.units.a.j a5 = com.corrodinggames.rts.game.units.a.j.a(this.k);
            if (a5 != null) {
                if (gameEngine.bs != null && this.i != null) {
                    if (this.i.d(gameEngine.bs)) {
                        gameEngine.bS.a(this.l.x, this.l.y, this.i, a5);
                    }
                } else {
                    c.a("PingMapAction failed: game.playerTeam==null or this.team==null");
                }
            }
        }
        if (this.n != null) {
            Iterator it7 = this.v.iterator();
            while (it7.hasNext()) {
                ((com.corrodinggames.rts.game.units.y) it7.next()).P = this.n;
            }
        }
        if (this.z != null) {
            Iterator it8 = this.v.iterator();
            while (it8.hasNext()) {
                com.corrodinggames.rts.game.units.y yVar8 = (com.corrodinggames.rts.game.units.y) it8.next();
                if (yVar8 instanceof com.corrodinggames.rts.game.units.d.l) {
                    ((com.corrodinggames.rts.game.units.d.l) yVar8).a(this.z);
                }
            }
        }
    }

    public boolean a(PlayerData playerData, PlayerData playerData2) {
        if (playerData != null && playerData2 != null && playerData2.d(playerData) && (this.q & (1 << playerData2.k)) != 0) {
            return true;
        }
        return false;
    }

    public boolean l() {
        com.corrodinggames.rts.game.units.as a2;
        com.corrodinggames.rts.game.units.am a3;
        this.q = (short) 0;
        for (int i = 0; i < PlayerData.c; i++) {
            PlayerData k = PlayerData.k(i);
            if (k != null && k.p()) {
                this.q = (short) (this.q | (1 << i));
            }
        }
        if (GameEngine.getGameEngine().c(true) < 127 && this.j != null && this.j.d() == com.corrodinggames.rts.game.units.av.build && (a2 = this.j.a()) != null && (a3 = com.corrodinggames.rts.game.units.am.a(a2)) != null && !(a3 instanceof com.corrodinggames.rts.game.units.y)) {
            GameEngine.m328e("Rejecting non OrderableUnit build order: " + a2.i());
            return false;
        } else if (this.j != null && this.j.n) {
            GameEngine.m328e("Rejecting waypoint with addedByAction true");
            return false;
        } else {
            return true;
        }
    }
}