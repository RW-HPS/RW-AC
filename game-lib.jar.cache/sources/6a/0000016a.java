package com.corrodinggames.rts.game.a.a;

import android.graphics.PointF;
import com.corrodinggames.rts.game.a.f;
import com.corrodinggames.rts.game.units.a.s;
import com.corrodinggames.rts.game.units.am;
import com.corrodinggames.rts.game.units.custom.a.e;
import com.corrodinggames.rts.game.units.custom.g;
import com.corrodinggames.rts.game.units.d.l;
import com.corrodinggames.rts.game.units.y;

/* loaded from: game-lib.jar:com/corrodinggames/rts/game/a/a/d.class */
public class d extends c {
    public final boolean b = true;
    static final g c = g.c("nukeLauncher");

    @Override // com.corrodinggames.rts.game.a.a.a
    public b a() {
        return b.nuking;
    }

    @Override // com.corrodinggames.rts.game.a.a.c
    public boolean c(com.corrodinggames.rts.game.a.a aVar, y yVar) {
        return a(yVar);
    }

    public PointF d(com.corrodinggames.rts.game.a.a aVar, y yVar) {
        return aVar.at();
    }

    public void e(com.corrodinggames.rts.game.a.a aVar, y yVar) {
        s a = f.a(aVar, yVar, e.launch);
        if (a != null) {
            if (a.b(yVar) && a.a((am) yVar, false)) {
                PointF d = d(aVar, yVar);
                if (d != null) {
                    aVar.c("nuke: launching at:" + d.x + ", " + d.y);
                    aVar.a(yVar, a, d, (am) null);
                    return;
                }
                aVar.c("nuke: no target");
                return;
            }
            aVar.c("nuke: not ready");
        }
    }

    public void f(com.corrodinggames.rts.game.a.a aVar, y yVar) {
        s a;
        if ((yVar instanceof l) && ((l) yVar).dy() && (a = f.a(aVar, yVar, e.launchAmmo)) != null && aVar.a(a.B(), yVar)) {
            aVar.c("ai nuke building");
            aVar.a(yVar, a);
        }
    }

    public boolean a(y yVar) {
        if (f.a(yVar, c)) {
            return true;
        }
        return false;
    }

    @Override // com.corrodinggames.rts.game.a.a.a
    public void b(float f, com.corrodinggames.rts.game.a.a aVar) {
        am[] a = this.a.a();
        int size = this.a.size();
        for (int i = 0; i < size; i++) {
            y yVar = (y) a[i];
            f(aVar, yVar);
            e(aVar, yVar);
        }
    }
}