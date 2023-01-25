package com.corrodinggames.rts.gameFramework;

import android.content.Context;
import com.corrodinggames.rts.game.PlayerData;
import com.corrodinggames.rts.game.p010a.C0136a;
import com.corrodinggames.rts.game.units.AbstractC0629y;
import com.corrodinggames.rts.game.units.C0560h;
import com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope;
import com.corrodinggames.rts.game.units.custom.p020d.C0429b;
import com.corrodinggames.rts.game.units.p013a.AbstractC0224s;
import com.corrodinggames.rts.gameFramework.file.C0765a;
import com.corrodinggames.rts.gameFramework.net.C0887al;
import com.corrodinggames.rts.gameFramework.net.CheckSumData;
import com.corrodinggames.rts.gameFramework.net.GameInputStream;
import com.corrodinggames.rts.gameFramework.net.GameNetEngine;
import com.corrodinggames.rts.gameFramework.net.GameOutputStream;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Iterator;

/* renamed from: com.corrodinggames.rts.gameFramework.ba */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/ba.class */
public class C0725ba {

    /* renamed from: b */
    public static boolean f4535b = true;

    /* renamed from: c */
    public static boolean f4536c = true;

    /* renamed from: d */
    public static boolean f4537d = false;

    /* renamed from: e */
    public static boolean f4538e = true;

    /* renamed from: f */
    public static boolean f4539f = false;

    /* renamed from: h */
    public boolean f4540h;

    /* renamed from: i */
    int f4541i;

    /* renamed from: j */
    int f4542j;

    /* renamed from: k */
    boolean f4543k;

    /* renamed from: l */
    int f4544l;

    /* renamed from: m */
    boolean f4545m;

    /* renamed from: o */
    public int f4546o;

    /* renamed from: p */
    public int f4547p;

    /* renamed from: q */
    public int f4548q;

    /* renamed from: r */
    public String f4549r;

    /* renamed from: s */
    boolean f4550s;

    /* renamed from: P */
    private volatile boolean f4551P;

    /* renamed from: t */
    String f4552t;

    /* renamed from: u */
    boolean f4553u;

    /* renamed from: w */
    C0728bd f4554w;

    /* renamed from: x */
    C0728bd f4555x;

    /* renamed from: y */
    int f4556y;

    /* renamed from: z */
    int f4557z;

    /* renamed from: A */
    int f4558A;

    /* renamed from: B */
    int f4559B;

    /* renamed from: C */
    InputStream f4560C;

    /* renamed from: D */
    BufferedInputStream f4561D;

    /* renamed from: E */
    DataInputStream f4562E;

    /* renamed from: F */
    GameInputStream f4563F;

    /* renamed from: G */
    OutputStream f4564G;

    /* renamed from: H */
    BufferedOutputStream f4565H;

    /* renamed from: I */
    DataOutputStream f4566I;

    /* renamed from: J */
    GameOutputStream f4567J;

    /* renamed from: K */
    RunnableC0726bb f4568K;

    /* renamed from: L */
    Thread f4569L;

    /* renamed from: O */
    public boolean f4570O;

    /* renamed from: a */
    String f4571a = "replays/";

    /* renamed from: g */
    public CheckSumData f4572g = new CheckSumData();

    /* renamed from: n */
    public boolean f4573n = false;

    /* renamed from: v */
    public int f4574v = 1;

    /* renamed from: M */
    Object f4575M = new Object();

    /* renamed from: N */
    public boolean f4576N = false;

    /* renamed from: a */
    public static void m2497a(String str) {
        GameEngine.m5453e("Replay: " + str);
    }

    /* renamed from: b */
    public static void m2490b(String str) {
        GameEngine.print("Replay: " + str);
    }

    /* renamed from: a */
    public static void m2495a(String str, Exception exc) {
        GameEngine.m1060a("Replay: " + str, (Throwable) exc);
    }

    /* renamed from: a */
    public File m2494a(String str, boolean z) {
        return C0765a.m2296a(str, this.f4571a, z);
    }

    /* renamed from: a */
    public void m2503a(Context context) {
    }

    /* renamed from: a */
    public void m2506a() {
        GameEngine gameEngine = GameEngine.getGameEngine();
        if (gameEngine.f6450bt != 0.0f) {
            gameEngine.f6450bt = 0.0f;
        } else {
            gameEngine.f6450bt = 1.0f;
        }
    }

    /* renamed from: b */
    public void m2491b() {
        GameEngine gameEngine = GameEngine.getGameEngine();
        if (gameEngine.f6450bt == 1.0f) {
            gameEngine.f6450bt = 2.0f;
        } else if (gameEngine.f6450bt == 2.0f) {
            gameEngine.f6450bt = 4.0f;
        } else if (gameEngine.f6450bt == 4.0f) {
            gameEngine.f6450bt = 8.0f;
        } else if (gameEngine.f6450bt == 8.0f) {
            gameEngine.f6450bt = 16.0f;
        } else if (gameEngine.f6450bt == 16.0f) {
            gameEngine.f6450bt = 32.0f;
        } else if (gameEngine.f6450bt == 32.0f) {
            gameEngine.f6450bt = 64.0f;
        } else if (gameEngine.f6450bt == 64.0f) {
            gameEngine.f6450bt = 1.0f;
        } else {
            gameEngine.f6450bt = 1.0f;
        }
    }

    /* renamed from: a */
    public void m2504a(int i, String str, String str2, int i2) {
        RunnableC0726bb runnableC0726bb = this.f4568K;
        if (this.f4551P && !this.f4553u) {
            if (str2.startsWith("-t ")) {
            }
            C0728bd c0728bd = new C0728bd();
            c0728bd.f4591a = i2;
            c0728bd.f4597g = new C0727bc();
            c0728bd.f4597g.f4588a = i;
            c0728bd.f4597g.f4589b = str;
            c0728bd.f4597g.f4590c = str2;
            if (runnableC0726bb == null) {
                GameEngine.m989g("Failed to record chat message, replay might have already stopped");
            } else {
                runnableC0726bb.m2475a(c0728bd);
            }
        }
    }

    /* renamed from: a */
    public void m2492a(byte[] bArr, int i, int i2, int i3, float f, float f2) {
        RunnableC0726bb runnableC0726bb = this.f4568K;
        if (this.f4551P && !this.f4553u) {
            C0728bd c0728bd = new C0728bd();
            c0728bd.f4591a = i;
            c0728bd.f4596f = bArr;
            c0728bd.f4598h = i2;
            c0728bd.f4599i = i3;
            c0728bd.f4600j = f;
            c0728bd.f4601k = f2;
            if (runnableC0726bb == null) {
                GameEngine.m989g("Failed to save resync, replay might have already stopped");
            } else {
                runnableC0726bb.m2475a(c0728bd);
            }
        }
    }

    /* renamed from: c */
    public void m2489c() {
        if (f4539f) {
            m2487d();
        }
    }

    /* renamed from: a */
    public void m2500a(SyncPacket syncPacket, int i) {
        RunnableC0726bb runnableC0726bb = this.f4568K;
        if (this.f4551P && !this.f4553u) {
            if (runnableC0726bb == null) {
                GameEngine.m989g("Failed to record command, replay might have already stopped");
                return;
            }
            C0728bd c0728bd = new C0728bd();
            c0728bd.f4595e = syncPacket.clone();
            c0728bd.f4591a = i;
            runnableC0726bb.m2475a(c0728bd);
            this.f4542j++;
            if (this.f4542j > 5) {
                this.f4542j = 0;
                GameEngine gameEngine = GameEngine.getGameEngine();
                C0728bd c0728bd2 = new C0728bd();
                c0728bd2.f4593c = Long.valueOf(m2483f());
                c0728bd2.f4591a = gameEngine.tick;
                runnableC0726bb.m2475a(c0728bd2);
            }
        }
    }

    /* renamed from: d */
    public void m2487d() {
        if (this.f4551P && !this.f4553u) {
            this.f4572g.m1415b();
            m2498a(this.f4572g, true);
        }
    }

    /* renamed from: a */
    public void m2499a(CheckSumData checkSumData) {
        m2498a(checkSumData, false);
    }

    /* renamed from: a */
    public void m2498a(CheckSumData checkSumData, boolean z) {
        if (this.f4551P && !this.f4553u) {
            GameEngine gameEngine = GameEngine.getGameEngine();
            C0728bd c0728bd = new C0728bd();
            GameOutputStream gameOutputStream = new GameOutputStream();
            int i = 0;
            if (z) {
                try {
                    i = 0 + 1;
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            gameOutputStream.writeByte(i);
            gameOutputStream.writeInt(checkSumData.f5875b.size());
            Iterator it = checkSumData.f5875b.iterator();
            while (it.hasNext()) {
                gameOutputStream.writeLong(((C0887al) it.next()).f5892b);
            }
            c0728bd.f4594d = gameOutputStream.toByteArray();
            c0728bd.f4591a = gameEngine.tick;
            this.f4568K.m2475a(c0728bd);
        }
    }

    /* renamed from: e */
    public void m2485e() {
        synchronized (this.f4575M) {
            try {
                if (this.f4568K != null) {
                    this.f4568K.m2476a();
                    try {
                        this.f4569L.join();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    this.f4551P = false;
                    this.f4568K = null;
                    this.f4569L = null;
                }
                if (this.f4564G != null) {
                    this.f4566I.flush();
                    this.f4566I.close();
                    this.f4565H.flush();
                    this.f4565H.close();
                    this.f4564G.flush();
                    this.f4564G.close();
                }
                this.f4564G = null;
                this.f4565H = null;
                this.f4566I = null;
                this.f4567J = null;
            } catch (IOException e2) {
                e2.printStackTrace();
                this.f4564G = null;
                this.f4565H = null;
                this.f4566I = null;
                this.f4567J = null;
            }
            this.f4550s = false;
            this.f4551P = false;
            this.f4553u = false;
            this.f4552t = null;
            this.f4541i = 0;
            this.f4542j = 0;
            this.f4543k = false;
            this.f4544l = 0;
            this.f4545m = false;
            this.f4556y = 0;
            this.f4574v = 1;
            this.f4557z = 0;
            this.f4558A = 0;
            this.f4559B = 0;
            this.f4546o = -1;
            this.f4547p = 0;
            this.f4548q = -1;
            this.f4549r = null;
            try {
                if (this.f4560C != null) {
                    this.f4562E.close();
                    this.f4561D.close();
                    this.f4560C.close();
                }
                this.f4560C = null;
                this.f4561D = null;
                this.f4562E = null;
                this.f4563F = null;
            } catch (IOException e3) {
                e3.printStackTrace();
                this.f4560C = null;
                this.f4561D = null;
                this.f4562E = null;
                this.f4563F = null;
            }
        }
    }

    /* renamed from: f */
    public long m2483f() {
        AbstractC0629y abstractC0629y;
        long j = 0;
        Iterator it = AbstractC1155w.f7177er.iterator();
        while (it.hasNext()) {
            AbstractC1155w abstractC1155w = (AbstractC1155w) it.next();
            if (abstractC1155w instanceof AbstractC0629y) {
                j = ((float) j) + (abstractC0629y.f7172eo * 1000.0f) + (abstractC0629y.f7173ep * 1000.0f) + (abstractC0629y.f1637cu * 1.0f) + ((AbstractC0629y) abstractC1155w).f7166eh;
            }
        }
        return j;
    }

    /* renamed from: g */
    public void m2482g() {
        if (!this.f4576N) {
            m2485e();
        }
    }

    /* renamed from: c */
    public boolean m2488c(String str) {
        return m2496a(str, m2494a(str, false));
    }

    /* renamed from: l */
    private void m2477l() {
        for (int i = 0; i < PlayerData.f1367c; i++) {
            PlayerData playerData = PlayerData.getPlayerData(i);
            if (playerData != null && (playerData instanceof C0136a)) {
                ((C0136a) playerData).f585aX = true;
            }
        }
    }

    /* renamed from: a */
    public boolean m2496a(String str, File file) {
        if (this.f4551P) {
            if (this.f4553u) {
                GameEngine.print("startReplayingFile: A replay is already playing");
            } else {
                GameEngine.print("startReplayingFile: A replay is already saving");
            }
        }
        m2485e();
        GameEngine gameEngine = GameEngine.getGameEngine();
        gameEngine.mo999e();
        gameEngine.netEngine.m1440q();
        this.f4554w = null;
        this.f4550s = false;
        this.f4551P = true;
        this.f4553u = true;
        this.f4552t = str;
        try {
            if (file.isDirectory()) {
                GameEngine.m5453e("File is a directory: " + file.getAbsolutePath());
                GameEngine.m5453e("Cannot load replay: Target is a folder, instead of a file");
                gameEngine.m1064a("Cannot load replay: Target is a folder, instead of a file", 1);
                return false;
            }
            this.f4560C = C0765a.m2301a(file);
            if (this.f4560C == null) {
                GameEngine.m5453e("Cannot load replay: Failed to read replay file");
                gameEngine.m1064a("Cannot load replay: Failed to read replay file", 1);
                return false;
            }
            this.f4561D = new BufferedInputStream(this.f4560C);
            this.f4562E = new DataInputStream(this.f4561D);
            this.f4563F = new GameInputStream(this.f4562E);
            String readString = this.f4563F.readString();
            if (!readString.equals("rustedWarfareReplay")) {
                GameEngine.m5453e("Header is not correct:" + readString);
                GameEngine.m5453e("Cannot load replay: File is missing header (check if this file is a replay)");
                gameEngine.m1064a("Cannot load replay: File is missing header (check if this file is a replay)", 1);
                return false;
            }
            int readInt = this.f4563F.readInt();
            int readInt2 = this.f4563F.readInt();
            m2497a("Loading save from version: " + readInt2);
            this.f4563F.m1318a(readInt2);
            String readString2 = this.f4563F.readString();
            if ((readInt2 != 96 || readInt != gameEngine.mo1005c(true)) && !this.f4573n) {
                String str2 = "Cannot load replay: This replay was recording with a different version: " + readString2;
                if (GameEngine.m1027av()) {
                    str2 = str2 + " (You can use the beta tab in steam to switch to old versions)";
                }
                gameEngine.m1064a(str2, 1);
                m2497a("Replay version: " + readInt2 + " (" + readInt + ")");
                m2497a("GameSaver.thisSaveVersion: 96 (" + gameEngine.mo1005c(true) + ")");
                if (!GameEngine.f6304aG) {
                    this.f4551P = false;
                    return false;
                }
            }
            this.f4548q = readInt2;
            this.f4549r = readString2;
            this.f4563F.readBoolean();
            this.f4563F.startBlock("gamesave");
            this.f4570O = false;
            this.f4576N = true;
            m2497a("Loading replay initial save");
            gameEngine.f6338ca.m427a(this.f4563F, false, false, false);
            this.f4576N = false;
            this.f4563F.endBlock("gamesave");
            if (!this.f4570O) {
                m2497a("ReplayEngine: --- No game setup read ----");
                gameEngine.netEngine.gameMapData.nukes = true;
                gameEngine.f6319bC = gameEngine.settingsEngine.teamUnitCapHostedGame;
                gameEngine.f6318bB = gameEngine.f6319bC;
            }
            if (!this.f4540h) {
                m2477l();
            }
            m2497a("--- Reply settings ---");
            m2497a("Unit cap: " + gameEngine.f6319bC);
            m2497a(gameEngine.netEngine.gameMapData.m1421b());
            m2497a("Starting frame:" + gameEngine.tick);
            if (!this.f4540h) {
                for (int i = 0; i < PlayerData.f1367c; i++) {
                    PlayerData playerData = PlayerData.getPlayerData(i);
                    if (playerData != null && playerData.name != null) {
                        gameEngine.f6330bS.f5264h.m1781a(VariableScope.nullOrMissingString, "Player '" + playerData.name + "' playing as " + playerData.m4456N().toLowerCase() + " (team:" + playerData.getPlayerTeamName() + ")");
                    }
                }
            }
            if (GameEngine.f6406aw) {
                GameNetEngine.m1467g("Warning: editor will desync checksums.");
                gameEngine.f6313bv = true;
                gameEngine.f6444bl = true;
                gameEngine.f6446bn = true;
            }
            return true;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: a */
    public void m2493a(boolean z) {
        if (GameEngine.f6420aW) {
            if (!GameEngine.f6427bd) {
                return;
            }
        } else if (!GameEngine.f6426bc) {
            return;
        }
        GameEngine gameEngine = GameEngine.getGameEngine();
        if (gameEngine.netEngine.f5782B && !z && !this.f4576N && gameEngine.settingsEngine.saveMultiplayerReplays) {
            m2486d(gameEngine.m1037al() + " [v" + gameEngine.mo967v() + "] (" + C0773f.m2185a("d MMM yyyy HH.mm.ss") + ").replay");
        }
    }

    /* renamed from: d */
    public void m2486d(String str) {
        m2497a("Recording replay to: " + str);
        if (this.f4551P) {
            if (this.f4553u) {
                m2490b("startSaving: A replay is already playing");
            } else {
                m2490b("startSaving: A replay is already saving");
            }
        }
        m2485e();
        GameEngine gameEngine = GameEngine.getGameEngine();
        f4539f = gameEngine.settingsEngine.replayTracing;
        if (f4539f) {
            gameEngine.netEngine.m1453j("Warning traceChecksumsWriting is on. Large replay file size will be created.");
        }
        this.f4550s = false;
        this.f4551P = true;
        this.f4553u = false;
        this.f4552t = str;
        try {
            File m2494a = m2494a(str, true);
            this.f4564G = C0765a.m2299a(m2494a, false);
            if (this.f4564G == null) {
                m2490b("Failed to create replay file at:" + m2494a.getAbsolutePath());
                GameEngine.getGameEngine().m985i("Failed to create replay file (Replay recording will be disabled)");
                m2485e();
                return;
            }
            this.f4565H = new BufferedOutputStream(this.f4564G);
            this.f4566I = new DataOutputStream(this.f4565H);
            this.f4567J = new GameOutputStream(this.f4566I);
            this.f4567J.writeString("rustedWarfareReplay");
            this.f4567J.writeInt(gameEngine.mo1005c(true));
            this.f4567J.writeInt(96);
            this.f4567J.writeString(gameEngine.mo967v());
            this.f4567J.writeBoolean(gameEngine.f6441ar);
            this.f4567J.mo1365e("gamesave");
            gameEngine.f6338ca.m428a(this.f4567J);
            this.f4567J.endBlock("gamesave");
            this.f4566I.flush();
            this.f4568K = new RunnableC0726bb(this);
            this.f4569L = new Thread(this.f4568K);
            this.f4569L.start();
        } catch (IOException e) {
            m2495a("Failed to start recording replay", e);
            GameEngine.getGameEngine().m985i("Failed to start recording replay: " + e.getMessage());
            m2485e();
        } catch (Exception e2) {
            m2495a("Failed to start recording replay (Non IOException)", e2);
            GameEngine.getGameEngine().m985i("Failed to start recording replay (Non IOException): " + e2.getMessage());
            m2485e();
        }
    }

    /* renamed from: h */
    public boolean m2481h() {
        GameEngine gameEngine = GameEngine.getGameEngine();
        String m1283x = this.f4563F.m1283x();
        if ("rc".equals(m1283x)) {
            this.f4556y++;
            C0728bd c0728bd = new C0728bd();
            c0728bd.f4591a = this.f4563F.readInt();
            SyncPacket m2419b = gameEngine.f6343cf.m2419b();
            m2419b.read(this.f4563F);
            m2419b.f4919a = true;
            c0728bd.f4595e = m2419b;
            this.f4563F.endBlock("rc");
            this.f4554w = c0728bd;
            this.f4547p++;
            this.f4546o = c0728bd.f4591a;
            if (f4536c) {
                m2497a("updateGameFrame: Command: " + m2419b.f4923i.name + " (" + m2419b.f4923i.site + ") count:" + m2419b.m2316d() + " id:" + this.f4556y);
                if (m2419b.f4924j != null) {
                    m2497a("updateGameFrame: Waypoint: " + m2419b.f4924j.m4144d().name());
                    if (m2419b.f4924j.m4159a() != null) {
                        m2497a("updateGameFrame: Build Type: " + m2419b.f4924j.m4159a().mo3512i());
                    }
                }
                if (AbstractC0224s.m4299c(m2419b.f4940k)) {
                    m2497a("updateGameFrame: SpecialAction: " + m2419b.f4940k.m4338a());
                }
                if (m2419b.f4927n != null) {
                    m2497a("updateGameFrame: SetAttackMode: " + m2419b.f4927n);
                }
                if (m2419b.f4938g) {
                    m2497a("updateGameFrame: stopOrUndo is set");
                }
                if (m2419b.f4931r) {
                    if (m2419b.f4932s != 0.0f) {
                        m2497a("updateGameFrame: changeStepRate:" + m2419b.f4932s);
                    }
                    if (m2419b.f4934u != 0) {
                        m2497a("updateGameFrame: systemAction_action:" + m2419b.f4934u);
                    }
                }
                m2497a("updateGameFrame: ------");
                return true;
            }
            return true;
        } else if ("wait".equals(m1283x)) {
            C0728bd c0728bd2 = new C0728bd();
            c0728bd2.f4591a = this.f4563F.readInt();
            c0728bd2.f4592b = true;
            this.f4554w = c0728bd2;
            this.f4563F.endBlock("wait");
            return true;
        } else if ("cs".equals(m1283x)) {
            int readInt = this.f4563F.readInt();
            long readLong = this.f4563F.readLong();
            if (!this.f4573n) {
                if (gameEngine.tick != readInt) {
                    GameEngine.m1014b("replay:updateGameFrame", "expected:" + readInt + " got:" + gameEngine.tick);
                }
                if (m2483f() != readLong) {
                    m2490b("checksum: checksums don't match!!");
                    m2490b("checksum: game frameNumber:" + gameEngine.tick);
                    m2490b("checksum: Replay checksum:" + readLong);
                    m2490b("checksum: Game checksum  :" + m2483f());
                    this.f4544l++;
                    if (!this.f4543k) {
                        this.f4543k = true;
                        gameEngine.f6330bS.f5264h.m1781a(VariableScope.nullOrMissingString, "Error: This replay might be out of sync");
                    }
                } else {
                    m2497a("checksum: checksums are matching frameNumber:" + gameEngine.tick);
                }
            }
            this.f4563F.endBlock("cs");
            return true;
        } else if ("es".equals(m1283x)) {
            int readInt2 = this.f4563F.readInt();
            if (!this.f4573n) {
                if (gameEngine.tick != readInt2) {
                    GameEngine.print("replay.updateGameFrame: expected:" + readInt2 + " got:" + gameEngine.tick);
                }
                GameInputStream gameInputStream = new GameInputStream(this.f4563F.readBytes());
                boolean z = false;
                if (C0429b.m3849a(gameInputStream.readByte(), 1)) {
                    z = true;
                }
                if (z) {
                    GameEngine.m5453e("replay: -trace checksum-");
                } else {
                    GameEngine.m5453e("replay: -long checksum-");
                }
                gameEngine.netEngine.m1495d();
                gameInputStream.readInt();
                Iterator it = gameEngine.netEngine.checkSumData.f5875b.iterator();
                while (it.hasNext()) {
                    C0887al c0887al = (C0887al) it.next();
                    long readLong2 = gameInputStream.readLong();
                    if (!this.f4545m && readLong2 == c0887al.f5892b) {
                        m2497a("extraChecksum: " + c0887al.f5891a + " Checksum [" + readInt2 + "]. " + readLong2 + " == " + c0887al.f5892b + " (ok)");
                    }
                    if (readLong2 != c0887al.f5892b) {
                        if (this.f4544l < 150) {
                            m2490b("extraChecksum: " + c0887al.f5891a + " Checksum [" + readInt2 + "]. " + readLong2 + " != " + c0887al.f5892b + " (failed)");
                        }
                        this.f4544l++;
                    }
                }
            }
            this.f4545m = true;
            this.f4563F.endBlock("es");
            return true;
        } else if ("resync".equals(m1283x)) {
            int readInt3 = this.f4563F.readInt();
            GameEngine.m5453e("Loading resync from replay");
            if (gameEngine.tick != readInt3) {
                GameEngine.m1014b("replay:resync", "expected:" + readInt3 + " got:" + gameEngine.tick);
            }
            int readInt4 = this.f4563F.readInt();
            int readInt5 = this.f4563F.readInt();
            float readFloat = this.f4563F.readFloat();
            float readFloat2 = this.f4563F.readFloat();
            gameEngine.f6338ca.m427a(new GameInputStream(this.f4563F.readBytes()), true, true, true);
            m2477l();
            gameEngine.tick = readInt4;
            gameEngine.f6315by = readInt5;
            gameEngine.netEngine.checkSumData.allSum = 0L;
            if (readFloat < 0.1d) {
                GameNetEngine.m1562a("replay setCurrentStepRate:" + readFloat + " is too small", true);
            }
            gameEngine.netEngine.setCurrentStepRate(readFloat, "replay");
            gameEngine.netEngine.f5786J = readFloat2;
            this.f4563F.endBlock("resync");
            return true;
        } else if ("chat".equals(m1283x)) {
            C0728bd c0728bd3 = new C0728bd();
            c0728bd3.f4591a = this.f4563F.readInt();
            c0728bd3.f4597g = new C0727bc();
            c0728bd3.f4597g.f4588a = this.f4563F.readInt();
            c0728bd3.f4597g.f4589b = this.f4563F.isReadString();
            c0728bd3.f4597g.f4590c = this.f4563F.isReadString();
            this.f4554w = c0728bd3;
            this.f4563F.endBlock("chat");
            return true;
        } else if ("end".equals(m1283x)) {
            GameEngine.m1014b("replay:updateGameFrame", "end of replay block found");
            gameEngine.f6330bS.f5264h.m1781a(VariableScope.nullOrMissingString, "Replay has ended");
            if (!gameEngine.f6313bv) {
                this.f4550s = true;
                gameEngine.f6450bt = 0.25f;
                GameEngine.getGameEngine().f6330bS.m1906G();
            } else {
                this.f4550s = false;
                this.f4551P = false;
                this.f4553u = false;
                C0560h m1814i = gameEngine.f6330bS.m1814i();
                if (m1814i != null) {
                    gameEngine.f6312bs = m1814i.f1614bX;
                }
            }
            this.f4563F.endBlock("end");
            GameEngine.m5453e("number of replay commands issued:" + this.f4557z);
            return false;
        } else if ("endReplayMetaData".equals(m1283x)) {
            this.f4563F.endBlock("endReplayMetaData");
            return true;
        } else {
            GameEngine.m1014b("updateGameFrame", "Unknown command block:" + m1283x);
            this.f4563F.endBlock(m1283x);
            return true;
        }
    }

    /* renamed from: a */
    public void m2505a(float f) {
        GameEngine gameEngine = GameEngine.getGameEngine();
        if (this.f4550s || !this.f4551P || !this.f4553u) {
            return;
        }
        while (true) {
            if (this.f4554w == null) {
                try {
                    if (!m2481h()) {
                        return;
                    }
                } catch (IOException e) {
                    GameEngine.m1014b("updateGameFrame", "IOException, read of replay?");
                    e.printStackTrace();
                    gameEngine.f6450bt = 0.25f;
                    if (!this.f4550s && this.f4551P) {
                        gameEngine.f6330bS.f5264h.m1781a(VariableScope.nullOrMissingString, "Replay ended (unexpected)");
                    }
                    this.f4550s = true;
                    return;
                }
            }
            if (this.f4554w != null) {
                if (this.f4573n) {
                    this.f4554w = null;
                } else {
                    if (f4535b && this.f4554w != null && this.f4555x != this.f4554w) {
                        this.f4555x = this.f4554w;
                        GameEngine.m5453e("replay: upcoming in " + (this.f4554w.f4591a - gameEngine.tick) + " command:" + (this.f4554w.f4595e != null));
                    }
                    if (this.f4554w.f4592b && this.f4557z == 0) {
                        GameEngine.m5453e("updateGameFrame: replay: Skipping wait on first resync without commands to avoid delay");
                        this.f4554w = null;
                    } else if (gameEngine.tick >= this.f4554w.f4591a) {
                        if (this.f4554w.f4595e != null) {
                            if (gameEngine.tick > this.f4554w.f4591a) {
                                GameEngine.print("updateGameFrame: replay incorrect frameNumber, skipping command:" + gameEngine.tick + " vs " + this.f4554w.f4591a);
                            } else {
                                if (f4537d) {
                                    if (this.f4554w.f4595e.f4929p == null) {
                                        GameEngine.m5453e("Precommand Team: commandingPlayer==null");
                                        if (this.f4554w.f4595e.f4923i != null) {
                                            GameEngine.m5453e("Precommand Team id:" + this.f4554w.f4595e.f4923i.site + " credits:" + this.f4554w.f4595e.f4923i.credits);
                                        }
                                    } else {
                                        GameEngine.m5453e("Precommand Team id:" + this.f4554w.f4595e.f4929p.site + " credits:" + this.f4554w.f4595e.f4929p.credits + " count:" + this.f4554w.f4595e.f4929p.m4351w() + " max:" + this.f4554w.f4595e.f4929p.m4350x());
                                    }
                                }
                                if (this.f4554w.f4595e.f4931r && this.f4554w.f4595e.f4934u != 0) {
                                    GameEngine.m1014b("replay:issueCommand", "systemAction_action:" + this.f4554w.f4595e.f4934u);
                                }
                                this.f4554w.f4595e.m2306k();
                                if (f4537d) {
                                    if (this.f4554w.f4595e.f4929p != null) {
                                        GameEngine.m5453e("Postcommand credits:" + this.f4554w.f4595e.f4929p.credits + " count:" + this.f4554w.f4595e.f4929p.m4351w() + " max:" + this.f4554w.f4595e.f4929p.m4350x());
                                    } else if (this.f4554w.f4595e.f4923i != null) {
                                        GameEngine.m5453e("Postcommand Team id:" + this.f4554w.f4595e.f4923i.site + " credits:" + this.f4554w.f4595e.f4923i.credits);
                                    }
                                }
                                this.f4557z++;
                            }
                        } else if (this.f4554w.f4597g != null) {
                            C0727bc c0727bc = this.f4554w.f4597g;
                            boolean z = false;
                            if (c0727bc.f4590c == null) {
                                z = true;
                            } else {
                                if (c0727bc.f4590c.startsWith("-i ")) {
                                    z = true;
                                }
                                if (c0727bc.f4590c.equals("<All players ready>")) {
                                    z = true;
                                }
                                if (c0727bc.f4590c.equals("--too many desync errors, suppressing output--")) {
                                    z = true;
                                }
                                if (c0727bc.f4590c.startsWith("desync:")) {
                                    z = true;
                                }
                            }
                            if (!gameEngine.settingsEngine.replaysShowRecordedChat) {
                                z = true;
                            }
                            if (z) {
                                GameEngine.m1014b("replay:updateGameFrame", "Skipping message: " + c0727bc.f4589b + ":" + c0727bc.f4590c);
                            } else {
                                GameEngine.m1014b("replay:updateGameFrame", "message: " + c0727bc.f4589b + ":" + c0727bc.f4590c);
                                gameEngine.f6330bS.f5264h.m1781a(c0727bc.f4589b, c0727bc.f4590c);
                            }
                        } else if (this.f4554w.f4592b) {
                            if (f4536c) {
                            }
                        } else {
                            GameEngine.m1014b("updateGameFrame", "error: lastReadCommand null action");
                        }
                        this.f4554w = null;
                    }
                }
            }
            if (this.f4554w != null) {
                return;
            }
        }
    }

    /* renamed from: e */
    public void m2484e(String str) {
        GameEngine.m5453e("ReplayEngine deleteGame: " + str);
        String m2271o = C0765a.m2271o(str);
        if (m2271o.contains("\\") || m2271o.contains("/")) {
            GameEngine.m5453e("Cannot get replay with path: " + str);
            return;
        }
        File m2494a = m2494a(str, true);
        GameEngine.m5453e("ReplayEngine path: " + m2494a.getAbsolutePath());
        if (!m2494a.exists()) {
            GameEngine.m5453e("ReplayEngine deleteGame: file doesn't exist");
        }
        if (!C0765a.m2292b(m2494a)) {
            GameEngine.m5453e("ReplayEngine deleteGame: failed to delete: " + m2494a.getAbsolutePath());
        }
        File m2494a2 = m2494a(str + ".map", true);
        if (m2494a2.exists()) {
            C0765a.m2292b(m2494a2);
        }
    }

    /* renamed from: i */
    public boolean m2480i() {
        return this.f4551P;
    }

    /* renamed from: j */
    public boolean m2479j() {
        return this.f4551P && this.f4553u;
    }

    /* renamed from: k */
    public boolean m2478k() {
        return this.f4551P && !this.f4553u;
    }
}