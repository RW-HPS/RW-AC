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

/* renamed from: com.corrodinggames.rts.gameFramework.n.i */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/n/i.class */
class i {
    boolean a;
    m b = new m();
    final /* synthetic */ f c;

    i(f fVar) {
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
            if (jVar.a == asVar) {
                jVar.b += i;
                return;
            }
        }
        j jVar2 = new j(this);
        jVar2.a = asVar;
        jVar2.b = i;
        this.b.add(jVar2);
    }

    public void a(float f, float f2) {
        GameEngine gameEngine = GameEngine.getGameEngine();
        int i = 0;
        a playerData = PlayerData.getPlayerData(1);
        if (playerData == null) {
            GameEngine.m5e("Warning: Creating missing wave team AI");
            playerData = new a(1);
            playerData.team = 100;
            playerData.U = true;
        }
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            j jVar = (j) it.next();
            for (int i2 = 0; i2 < jVar.b; i2++) {
                am a = jVar.a.a();
                a.eo = f + f.a(-85, 85, i + 0);
                a.ep = f2 + f.a(-85, 85, i + 1);
                a.cg = f.a(-180, (int) SlickToAndroidKeycodes.AndroidCodes.KEYCODE_STB_INPUT, i + 2);
                i += 3;
                a.b(playerData);
                if (a.eo < 0.0f) {
                    a.eo = 0.0f;
                }
                if (a.ep < 0.0f) {
                    a.ep = 0.0f;
                }
                if (a.eo > gameEngine.bL.i()) {
                    a.eo = gameEngine.bL.i();
                }
                if (a.ep > gameEngine.bL.j()) {
                    a.ep = gameEngine.bL.j();
                }
                if (i2 == 0) {
                    gameEngine.bW.a(a);
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
            str = (str + jVar.b + "x ") + jVar.a.e();
        }
        return str;
    }
}