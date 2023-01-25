package com.corrodinggames.rts.gameFramework;

import com.corrodinggames.rts.game.PlayerData;
import com.corrodinggames.rts.game.units.AbstractC0244am;
import com.corrodinggames.rts.gameFramework.net.GameInputStream;
import com.corrodinggames.rts.gameFramework.net.GameOutputStream;
import java.util.ArrayList;

/* renamed from: com.corrodinggames.rts.gameFramework.bg */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/bg.class */
public class C0731bg {

    /* renamed from: b */
    C0739bo f4617b = new C0739bo();

    /* renamed from: c */
    C0739bo[] f4618c = new C0739bo[PlayerData.f1369e];

    /* renamed from: d */
    int f4619d;

    /* renamed from: e */
    boolean f4620e;

    /* renamed from: a */
    public static boolean f4621a = true;

    /* renamed from: f */
    public static C0736bl f4622f = new C0736bl();

    /* renamed from: a */
    public void m2462a(GameOutputStream gameOutputStream) {
        gameOutputStream.mo1366e("stats");
        gameOutputStream.writeByte(0);
        int i = PlayerData.f1367c;
        gameOutputStream.writeInt(i);
        for (int i2 = 0; i2 < i; i2++) {
            this.f4618c[i2].m2442a(gameOutputStream);
        }
        gameOutputStream.endBlock("stats");
    }

    /* renamed from: a */
    public void m2461a(GameInputStream gameInputStream, boolean z) {
        gameInputStream.startBlock("stats");
        gameInputStream.readByte();
        int readInt = gameInputStream.readInt();
        this.f4618c = new C0739bo[PlayerData.f1369e];
        for (int i = 0; i < readInt; i++) {
            this.f4618c[i] = new C0739bo();
            this.f4618c[i].m2441a(gameInputStream);
        }
        gameInputStream.endBlock("stats");
    }

    /* renamed from: a */
    public void m2467a() {
        this.f4617b = new C0739bo();
        this.f4618c = new C0739bo[PlayerData.f1369e];
        for (int i = 0; i < this.f4618c.length; i++) {
            this.f4618c[i] = new C0739bo();
        }
        this.f4619d = 0;
        this.f4620e = f4621a;
    }

    /* renamed from: b */
    public void m2460b() {
        int i = GameEngine.getGameEngine().f6315by;
        if (this.f4620e && this.f4619d <= i) {
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
            m2466a(i, false, false);
        }
    }

    /* renamed from: a */
    private void m2466a(int i, boolean z, boolean z2) {
        for (int i2 = 0; i2 < PlayerData.f1367c; i2++) {
            PlayerData m4365k = PlayerData.m4365k(i2);
            if (m4365k != null) {
                C0738bn c0738bn = this.f4618c[i2].f4645l;
                if (!z || c0738bn.m2443c()) {
                    c0738bn.m2451a(m4365k, i, z2);
                    c0738bn.m2452a(i2);
                }
            }
        }
    }

    /* renamed from: c */
    public void m2459c() {
        this.f4620e = false;
        m2466a(GameEngine.getGameEngine().f6315by, true, true);
    }

    /* renamed from: d */
    public ArrayList m2458d() {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < PlayerData.f1367c; i++) {
            if (this.f4618c[i].f4645l.m2443c()) {
                arrayList.add(this.f4618c[i]);
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public C0739bo m2464a(AbstractC0244am abstractC0244am) {
        return m2465a(abstractC0244am.f1614bX);
    }

    /* renamed from: a */
    public C0739bo m2465a(PlayerData playerData) {
        int i = playerData.site;
        if (i < 0 || i >= this.f4618c.length) {
            return this.f4617b;
        }
        C0739bo c0739bo = this.f4618c[i];
        if (c0739bo == null) {
            return this.f4617b;
        }
        return c0739bo;
    }

    /* renamed from: a */
    public void m2463a(AbstractC0244am abstractC0244am, AbstractC0244am abstractC0244am2, float f) {
        if (abstractC0244am != null) {
            boolean z = abstractC0244am2.f1612bV;
            C0739bo m2464a = m2464a(abstractC0244am);
            C0739bo m2464a2 = m2464a(abstractC0244am2);
            if (z) {
                f4622f.m2454a(abstractC0244am, abstractC0244am2);
                if (abstractC0244am2.mo3397bI()) {
                    m2464a.f4637d++;
                    m2464a2.f4640g++;
                } else if (abstractC0244am2.mo3267dd()) {
                    m2464a.f4638e++;
                    m2464a2.f4641h++;
                } else {
                    m2464a.f4636c++;
                    m2464a2.f4639f++;
                }
            }
        }
        GameEngine gameEngine = GameEngine.getGameEngine();
        if (abstractC0244am2.f1614bX == gameEngine.f6312bs) {
            gameEngine.m1070a(abstractC0244am2, f);
        }
    }
}