package com.corrodinggames.rts.gameFramework.net;

import com.corrodinggames.rts.game.PlayerData;
import com.corrodinggames.rts.game.units.AbstractC0629y;
import com.corrodinggames.rts.game.units.C0305au;
import com.corrodinggames.rts.game.units.p024d.C0494e;
import com.corrodinggames.rts.gameFramework.AbstractC1155w;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: com.corrodinggames.rts.gameFramework.j.ak */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/j/ak.class */
public class CheckSumData {

    /* renamed from: a */
    public long allSum;

    /* renamed from: b */
    public ArrayList f5875b = new ArrayList();

    /* renamed from: c */
    public C0887al f5876c = new C0887al(this, "Unit Pos");

    /* renamed from: d */
    public C0887al f5877d = new C0887al(this, "Unit Dir", false);

    /* renamed from: e */
    public C0887al f5878e = new C0887al(this, "Unit Hp");

    /* renamed from: f */
    public C0887al f5879f = new C0887al(this, "Unit Id");

    /* renamed from: g */
    public C0887al f5880g = new C0887al(this, "Waypoints");

    /* renamed from: h */
    public C0887al f5881h = new C0887al(this, "Waypoints Pos");

    /* renamed from: i */
    public C0887al f5882i = new C0887al(this, "Team Credits");

    /* renamed from: j */
    public C0887al f5883j = new C0887al(this, "UnitPaths");

    /* renamed from: k */
    public C0887al f5884k = new C0887al(this, "Unit Count");

    /* renamed from: l */
    public C0887al f5885l = new C0887al(this, "Team Info", false);

    /* renamed from: m */
    public C0887al f5886m = new C0887al(this, "Team 1 Credits", false);

    /* renamed from: n */
    public C0887al f5887n = new C0887al(this, "Team 2 Credits", false);

    /* renamed from: o */
    public C0887al f5888o = new C0887al(this, "Team 3 Credits", false);

    /* renamed from: p */
    public C0887al f5889p = new C0887al(this, "Command center2", false);

    /* renamed from: q */
    public C0887al f5890q = new C0887al(this, "Command center3", false);

    /* renamed from: a */
    public void m1417a() {
        Iterator it = this.f5875b.iterator();
        while (it.hasNext()) {
            ((C0887al) it.next()).f5892b = 0L;
        }
    }

    /* renamed from: b */
    public void m1416b() {
        C0887al c0887al;
        C0887al c0887al2;
        C0887al c0887al3;
        this.allSum = 0L;
        m1417a();
        Iterator it = AbstractC1155w.f7177er.iterator();
        while (it.hasNext()) {
            AbstractC1155w abstractC1155w = (AbstractC1155w) it.next();
            if (abstractC1155w instanceof AbstractC0629y) {
                AbstractC0629y abstractC0629y = (AbstractC0629y) abstractC1155w;
                this.allSum = ((float) this.allSum) + (abstractC0629y.f7172eo * 1000.0f);
                this.allSum = ((float) this.allSum) + (abstractC0629y.f7173ep * 1000.0f);
                this.allSum = ((float) this.allSum) + (abstractC0629y.f1637cu * 1.0f);
                this.allSum += abstractC0629y.f7166eh;
                this.f5876c.f5892b += Float.floatToRawIntBits(abstractC0629y.f7172eo);
                this.f5876c.f5892b += Float.floatToRawIntBits(abstractC0629y.f7173ep);
                this.f5877d.f5892b += Float.floatToRawIntBits(abstractC0629y.f1623cg);
                this.f5878e.f5892b = ((float) c0887al.f5892b) + abstractC0629y.f1637cu;
                this.f5879f.f5892b += abstractC0629y.f7166eh;
                if (abstractC1155w instanceof C0494e) {
                    C0494e c0494e = (C0494e) abstractC0629y;
                    this.f5889p.f5892b = ((float) c0887al3.f5892b) + (c0494e.f3468f * 2.0f);
                    this.f5890q.f5892b += c0494e.f3470h;
                }
                C0305au m2943ar = abstractC0629y.m2943ar();
                if (m2943ar != null) {
                    this.f5880g.f5892b += m2943ar.m4135j();
                    this.f5881h.f5892b = ((float) c0887al2.f5892b) + (m2943ar.m4140g() * 1000.0f);
                }
                this.f5883j.f5892b += abstractC0629y.m2976aL();
            }
        }
        for (int i = 0; i < PlayerData.f1367c; i++) {
            PlayerData playerData = PlayerData.getPlayerData(i);
            if (playerData != null) {
                this.f5882i.f5892b += (int) playerData.credits;
                if (i == 0) {
                    this.f5886m.f5892b += (int) playerData.credits;
                }
                if (i == 1) {
                    this.f5887n.f5892b += (int) playerData.credits;
                }
                if (i == 2) {
                    this.f5888o.f5892b += (int) playerData.credits;
                }
                this.f5884k.f5892b += playerData.m4353w();
                this.f5885l.f5892b += i + (playerData.f1320x * 100) + (playerData.team * 1000) + ((playerData.f1319w ? i : 0) * 10000);
            }
        }
    }
}