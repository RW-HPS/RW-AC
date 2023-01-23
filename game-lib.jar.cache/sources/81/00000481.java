package com.corrodinggames.rts.gameFramework;

import com.corrodinggames.rts.game.PlayerData;
import com.corrodinggames.rts.gameFramework.net.GameInputStream;
import com.corrodinggames.rts.gameFramework.net.GameOutputStream;
import java.util.ArrayList;

/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/bg.class */
public class bg {
    bo b = new bo();
    bo[] c = new bo[PlayerData.e];
    int d;
    boolean e;

    /* renamed from: a  reason: collision with root package name */
    public static boolean f451a = true;
    public static bl f = new bl();

    public void a(GameOutputStream gameOutputStream) {
        gameOutputStream.e("stats");
        gameOutputStream.writeByte(0);
        int i = PlayerData.c;
        gameOutputStream.writeInt(i);
        for (int i2 = 0; i2 < i; i2++) {
            this.c[i2].a(gameOutputStream);
        }
        gameOutputStream.endBlock("stats");
    }

    public void a(GameInputStream gameInputStream, boolean z) {
        gameInputStream.startBlock("stats");
        gameInputStream.readByte();
        int readInt = gameInputStream.readInt();
        this.c = new bo[PlayerData.e];
        for (int i = 0; i < readInt; i++) {
            this.c[i] = new bo();
            this.c[i].a(gameInputStream);
        }
        gameInputStream.endBlock("stats");
    }

    public void a() {
        this.b = new bo();
        this.c = new bo[PlayerData.e];
        for (int i = 0; i < this.c.length; i++) {
            this.c[i] = new bo();
        }
        this.d = 0;
        this.e = f451a;
    }

    public void b() {
        int i = GameEngine.getGameEngine().by;
        if (this.e && this.d <= i) {
            int i2 = 5000;
            if (i < 60000) {
                i2 = 1000;
            }
            if (i > 1800000) {
                i2 = 15000;
            }
            if (i > 3600000) {
                i2 = 30000;
            }
            int i3 = i2 + i2;
            a(i, false, false);
        }
    }

    private void a(int i, boolean z, boolean z2) {
        for (int i2 = 0; i2 < PlayerData.c; i2++) {
            PlayerData k = PlayerData.k(i2);
            if (k != null) {
                bn bnVar = this.c[i2].l;
                if (!z || bnVar.c()) {
                    bnVar.a(k, i, z2);
                    bnVar.a(i2);
                }
            }
        }
    }

    public void c() {
        this.e = false;
        a(GameEngine.getGameEngine().by, true, true);
    }

    public ArrayList d() {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < PlayerData.c; i++) {
            if (this.c[i].l.c()) {
                arrayList.add(this.c[i]);
            }
        }
        return arrayList;
    }

    public bo a(com.corrodinggames.rts.game.units.am amVar) {
        return a(amVar.bX);
    }

    public bo a(PlayerData playerData) {
        int i = playerData.k;
        if (i < 0 || i >= this.c.length) {
            return this.b;
        }
        bo boVar = this.c[i];
        if (boVar == null) {
            return this.b;
        }
        return boVar;
    }

    public void a(com.corrodinggames.rts.game.units.am amVar, com.corrodinggames.rts.game.units.am amVar2, float f2) {
        if (amVar != null) {
            boolean z = amVar2.bV;
            bo a2 = a(amVar);
            bo a3 = a(amVar2);
            if (z) {
                f.a(amVar, amVar2);
                if (amVar2.bI()) {
                    a2.d++;
                    a3.g++;
                } else if (amVar2.dd()) {
                    a2.e++;
                    a3.h++;
                } else {
                    a2.c++;
                    a3.f++;
                }
            }
        }
        GameEngine gameEngine = GameEngine.getGameEngine();
        if (amVar2.bX == gameEngine.bs) {
            gameEngine.a(amVar2, f2);
        }
    }
}