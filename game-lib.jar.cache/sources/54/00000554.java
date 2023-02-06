package com.corrodinggames.rts.gameFramework.path;

import android.graphics.Paint;
import com.corrodinggames.rts.game.maps.b;
import com.corrodinggames.rts.game.units.am;
import com.corrodinggames.rts.game.units.ao;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.f;
import com.corrodinggames.rts.gameFramework.net.GameInputStream;
import com.corrodinggames.rts.gameFramework.net.GameOutputStream;
import com.corrodinggames.rts.gameFramework.utility.SlickToAndroidKeycodes;
import java.util.LinkedList;

/* renamed from: com.corrodinggames.rts.gameFramework.k.k */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/k/k.class */
public class k {
    private PathEngine a;
    protected int e;
    protected static int f;
    public int g;
    protected short h;
    protected short i;
    protected Float j;
    protected boolean k;
    protected short l;
    protected short m;
    protected short n;
    protected ao o;
    public boolean p;
    public int q;
    public boolean r;
    public float s;
    public float t;
    public boolean u;
    protected boolean v;
    protected boolean w;
    protected LinkedList x;
    public byte[] y;
    public byte[] z;
    public byte[] A;
    public short[] B;
    public byte[] C;

    public k(PathEngine pathEngine, boolean z) {
        this.a = pathEngine;
        if (z) {
            int i = f;
            f = i + 1;
            this.e = i;
        }
        this.g = GameEngine.getGameEngine().tick;
    }

    public void a(GameOutputStream gameOutputStream) {
        int i;
        if (this.x == null) {
            gameOutputStream.writeBoolean(false);
            return;
        }
        gameOutputStream.writeBoolean(true);
        gameOutputStream.startBlock("p", true);
        gameOutputStream.writeInt(this.x.size());
        if (this.x.size() != 0) {
            p pVar = (p) this.x.get(0);
            gameOutputStream.a(pVar.a);
            gameOutputStream.a(pVar.b);
            for (int i2 = 1; i2 < this.x.size(); i2++) {
                p pVar2 = (p) this.x.get(i2);
                int i3 = pVar2.a - pVar.a;
                int i4 = pVar2.b - pVar.b;
                boolean z = f.d(i3) > 1 || f.d(i4) > 1;
                if (z) {
                    GameEngine.m5e("writeOutCompressedPath: out of range:" + i3 + "," + i4);
                    i = 128;
                } else {
                    i = i3 + 1 + ((i4 + 1) << 2);
                }
                gameOutputStream.writeByte(i);
                if (z) {
                    gameOutputStream.a(pVar2.a);
                    gameOutputStream.a(pVar2.b);
                }
                pVar = pVar2;
            }
        }
        gameOutputStream.endBlock("p");
    }

    public void a(GameInputStream gameInputStream) {
        if (!gameInputStream.readBoolean()) {
            this.x = null;
            return;
        }
        gameInputStream.a("p", true);
        int readInt = gameInputStream.readInt();
        if (readInt > 160000 || readInt < 0) {
            GameEngine.m5e("readInCompressedPath: Path too big at:" + readInt);
            readInt = -1;
        }
        if (readInt != -1) {
            this.u = true;
            if (this.x == null) {
                this.x = new LinkedList();
            }
            this.x.clear();
        }
        if (readInt > 0) {
            short readShort = gameInputStream.readShort();
            short readShort2 = gameInputStream.readShort();
            this.x.add(new p(readShort, readShort2));
            for (int i = 1; i < readInt; i++) {
                byte readByte = gameInputStream.readByte();
                if (readByte < 128) {
                    int i2 = (readByte & 3) - 1;
                    int i3 = ((readByte & 12) >> 2) - 1;
                    if (f.d(i2) > 1 || f.d(i3) > 1) {
                        GameEngine.m5e("readInCompressedPath: out of range but shouldn't be:" + i2 + "," + i3 + " for: " + ((int) readByte));
                    }
                    readShort = (short) (readShort + i2);
                    readShort2 = (short) (readShort2 + i3);
                    this.x.add(new p(readShort, readShort2));
                } else {
                    GameEngine.m5e("readInCompressedPath: out of range unpack:" + ((int) readShort) + "," + ((int) readShort2));
                    readShort = gameInputStream.readShort();
                    readShort2 = gameInputStream.readShort();
                    this.x.add(new p(readShort, readShort2));
                }
            }
        }
        gameInputStream.endBlock("p");
    }

    public void e() {
        i a = this.a.a(this.o);
        if (a == null) {
            throw new RuntimeException("Could not get costs for:" + this.o.toString());
        }
        this.y = a.d;
        this.z = a.e;
        this.A = a.f;
        this.B = a.g;
        this.C = a.j;
    }

    public void f() {
        this.y = null;
        this.z = null;
        this.A = null;
        this.B = null;
        this.C = null;
    }

    public void a(ao aoVar, short s, short s2, Float f2, boolean z) {
        if (aoVar == null) {
            throw new RuntimeException("MovementType is null");
        }
        this.o = aoVar;
        this.h = s;
        this.i = s2;
        this.j = f2;
        this.k = z;
        if (this.h < 0) {
            this.h = (short) 0;
        }
        if (this.i < 0) {
            this.i = (short) 0;
        }
        if (this.h > this.a.s - 1) {
            this.h = (short) (this.a.s - 1);
        }
        if (this.i > this.a.t - 1) {
            this.i = (short) (this.a.t - 1);
        }
        if (this.a.a(aoVar) == null) {
            throw new RuntimeException("Could not get costs for:" + aoVar.toString());
        }
    }

    public void a(short s, short s2, short s3) {
        if (s < 0) {
            s = 0;
        }
        if (s2 < 0) {
            s2 = 0;
        }
        if (s > this.a.s - 1) {
            s = (short) (this.a.s - 1);
        }
        if (s2 > this.a.t - 1) {
            s2 = (short) (this.a.t - 1);
        }
        this.l = s;
        this.m = s2;
        this.n = s3;
    }

    public boolean b() {
        return false;
    }

    public boolean a(k kVar) {
        return this == kVar;
    }

    public c a(am amVar) {
        return null;
    }

    public LinkedList a() {
        GameEngine gameEngine = GameEngine.getGameEngine();
        if (gameEngine.netEngine.B || gameEngine.replayEngine.i()) {
            if (this.u) {
                return this.x;
            }
            return null;
        }
        return this.x;
    }

    protected boolean c() {
        return this.x != null;
    }

    protected void a(LinkedList linkedList) {
        this.x = linkedList;
    }

    public void g() {
        GameEngine gameEngine = GameEngine.getGameEngine();
        b bVar = gameEngine.bL;
        Paint paint = new Paint();
        paint.a(2.0f);
        paint.a(100, 0, 100, 0);
        gameEngine.bO.a(((this.l * bVar.n) + bVar.p) - GameEngine.getGameEngine().cu, ((this.m * bVar.o) + bVar.q) - GameEngine.getGameEngine().cv, this.n * bVar.n, paint);
        paint.a(SlickToAndroidKeycodes.AndroidCodes.KEYCODE_PAIRING, 0, 0, 255);
        gameEngine.bO.a(((this.h * bVar.n) + bVar.p) - GameEngine.getGameEngine().cu, ((this.i * bVar.o) + bVar.q) - GameEngine.getGameEngine().cv, ((this.l * bVar.n) + bVar.p) - GameEngine.getGameEngine().cu, ((this.m * bVar.o) + bVar.q) - GameEngine.getGameEngine().cv, paint);
    }

    public void h() {
        if (this.x != null) {
            GameEngine gameEngine = GameEngine.getGameEngine();
            b bVar = gameEngine.bL;
            if (this.x.size() >= 1) {
                for (int i = 1; i < this.x.size(); i++) {
                    p pVar = (p) this.x.get(i);
                    p pVar2 = (p) this.x.get(i - 1);
                    Paint paint = new Paint();
                    paint.a(255, 0, 255, 0);
                    paint.a(2.0f);
                    gameEngine.bO.a(((pVar.a * bVar.n) + bVar.p) - GameEngine.getGameEngine().cu, ((pVar.b * bVar.o) + bVar.q) - GameEngine.getGameEngine().cv, ((pVar2.a * bVar.n) + bVar.p) - GameEngine.getGameEngine().cu, ((pVar2.b * bVar.o) + bVar.q) - GameEngine.getGameEngine().cv, paint);
                }
            }
        }
    }
}