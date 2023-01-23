package com.corrodinggames.rts.gameFramework.net;

import com.corrodinggames.rts.game.PlayerData;
import com.corrodinggames.rts.game.units.au;
import com.corrodinggames.rts.game.units.d.e;
import com.corrodinggames.rts.game.units.y;
import com.corrodinggames.rts.gameFramework.w;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: com.corrodinggames.rts.gameFramework.j.ak */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/j/ak.class */
public class CheckSumData {

    /* renamed from: a */
    public long allSum;
    public ArrayList b = new ArrayList();
    public al c = new al(this, "Unit Pos");
    public al d = new al(this, "Unit Dir", false);
    public al e = new al(this, "Unit Hp");
    public al f = new al(this, "Unit Id");
    public al g = new al(this, "Waypoints");
    public al h = new al(this, "Waypoints Pos");
    public al i = new al(this, "Team Credits");
    public al j = new al(this, "UnitPaths");
    public al k = new al(this, "Unit Count");
    public al l = new al(this, "Team Info", false);
    public al m = new al(this, "Team 1 Credits", false);
    public al n = new al(this, "Team 2 Credits", false);
    public al o = new al(this, "Team 3 Credits", false);
    public al p = new al(this, "Command center2", false);
    public al q = new al(this, "Command center3", false);

    public void a() {
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            ((al) it.next()).b = 0L;
        }
    }

    public void b() {
        al alVar;
        al alVar2;
        al alVar3;
        this.allSum = 0L;
        a();
        Iterator it = w.er.iterator();
        while (it.hasNext()) {
            w wVar = (w) it.next();
            if (wVar instanceof y) {
                y yVar = (y) wVar;
                this.allSum = ((float) this.allSum) + (yVar.eo * 1000.0f);
                this.allSum = ((float) this.allSum) + (yVar.ep * 1000.0f);
                this.allSum = ((float) this.allSum) + (yVar.cu * 1.0f);
                this.allSum += yVar.eh;
                this.c.b += Float.floatToRawIntBits(yVar.eo);
                this.c.b += Float.floatToRawIntBits(yVar.ep);
                this.d.b += Float.floatToRawIntBits(yVar.cg);
                this.e.b = ((float) alVar.b) + yVar.cu;
                this.f.b += yVar.eh;
                if (wVar instanceof e) {
                    e eVar = (e) yVar;
                    this.p.b = ((float) alVar3.b) + (eVar.f * 2.0f);
                    this.q.b += eVar.h;
                }
                au ar = yVar.ar();
                if (ar != null) {
                    this.g.b += ar.j();
                    this.h.b = ((float) alVar2.b) + (ar.g() * 1000.0f);
                }
                this.j.b += yVar.aL();
            }
        }
        for (int i = 0; i < PlayerData.c; i++) {
            PlayerData k = PlayerData.k(i);
            if (k != null) {
                this.i.b += (int) k.o;
                if (i == 0) {
                    this.m.b += (int) k.o;
                }
                if (i == 1) {
                    this.n.b += (int) k.o;
                }
                if (i == 2) {
                    this.o.b += (int) k.o;
                }
                this.k.b += k.w();
                this.l.b += i + (k.x * 100) + (k.r * 1000) + ((k.w ? i : 0) * 10000);
            }
        }
    }
}