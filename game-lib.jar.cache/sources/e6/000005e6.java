package com.corrodinggames.rts.gameFramework.status;

import com.corrodinggames.rts.game.PlayerData;
import com.corrodinggames.rts.game.a.a;
import com.corrodinggames.rts.game.units.am;
import com.corrodinggames.rts.game.units.as;
import com.corrodinggames.rts.game.units.custom.l;
import com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.f;
import com.corrodinggames.rts.gameFramework.utility.SlickToAndroidKeycodes;
import com.corrodinggames.rts.gameFramework.utility.m;
import java.util.Iterator;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.corrodinggames.rts.gameFramework.n.i */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/n/i.class */
public class i {

    /* renamed from: a */
    boolean f653a;
    m b = new m();
    final /* synthetic */ f c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public i(f fVar) {
        this.c = fVar;
    }

    public void a(as asVar, int i) {
        as c = l.c(asVar);
        if (c != null) {
            asVar = c;
        }
        b(asVar, i);
    }

    public void b(as asVar, int i) {
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            j jVar = (j) it.next();
            if (jVar.f654a == asVar) {
                jVar.b += i;
                return;
            }
        }
        j jVar2 = new j(this);
        jVar2.f654a = asVar;
        jVar2.b = i;
        this.b.add(jVar2);
    }

    public void a(float f, float f2) {
        GameEngine gameEngine = GameEngine.getGameEngine();
        int i = 0;
        a k = PlayerData.k(1);
        if (k == null) {
            GameEngine.m2e("Warning: Creating missing wave team AI");
            k = new a(1);
            k.r = 100;
            k.U = true;
        }
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            j jVar = (j) it.next();
            for (int i2 = 0; i2 < jVar.b; i2++) {
                am a2 = jVar.f654a.a();
                a2.eo = f + f.a(-85, 85, i + 0);
                a2.ep = f2 + f.a(-85, 85, i + 1);
                a2.cg = f.a(-180, (int) SlickToAndroidKeycodes.AndroidCodes.KEYCODE_STB_INPUT, i + 2);
                i += 3;
                a2.b(k);
                if (a2.eo < 0.0f) {
                    a2.eo = 0.0f;
                }
                if (a2.ep < 0.0f) {
                    a2.ep = 0.0f;
                }
                if (a2.eo > gameEngine.bL.i()) {
                    a2.eo = gameEngine.bL.i();
                }
                if (a2.ep > gameEngine.bL.j()) {
                    a2.ep = gameEngine.bL.j();
                }
                if (i2 == 0) {
                    gameEngine.bW.a(a2);
                }
            }
        }
    }

    public String toString() {
        if (this.b.size() == 0) {
            return "No units";
        }
        String str = VariableScope.nullOrMissingString;
        boolean z = true;
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            j jVar = (j) it.next();
            if (!z) {
                str = str + ", ";
            }
            z = false;
            str = (str + jVar.b + "x ") + jVar.f654a.e();
        }
        return str;
    }
}