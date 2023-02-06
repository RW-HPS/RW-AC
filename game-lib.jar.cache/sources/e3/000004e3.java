package com.corrodinggames.rts.gameFramework.Interface;

import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Typeface;
import com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.player.a;
import com.corrodinggames.rts.gameFramework.player.d;
import com.corrodinggames.rts.gameFramework.player.f;
import com.corrodinggames.rts.gameFramework.unitAction.ag;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: com.corrodinggames.rts.gameFramework.f.k */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/f/k.class */
public class k {
    InterfaceEngine a;
    GameEngine b;
    Paint c;
    Paint d;
    RectF e = new RectF();

    k(GameEngine gameEngine, InterfaceEngine interfaceEngine) {
        this.a = interfaceEngine;
        this.b = gameEngine;
        a();
    }

    public void a() {
        this.d = new Paint();
        this.d.a(255, 255, 255, 255);
        this.d.a(true);
        this.d.c(true);
        this.d.a(Typeface.a(Typeface.c, 1));
        this.b.a(this.d, 16.0f);
        this.c = new Paint();
        this.c.a(255, 255, 255, 255);
        this.c.a(true);
        this.c.c(true);
        this.c.a(Typeface.a(Typeface.c, 0));
        this.b.a(this.c, 16.0f);
    }

    public int a(float f, int i) {
        GameEngine gameEngine = GameEngine.getGameEngine();
        a aVar = gameEngine.cg;
        if (aVar.e() == f.none) {
            return i;
        }
        ArrayList d = aVar.d();
        ArrayList arrayList = new ArrayList();
        String a = com.corrodinggames.rts.gameFramework.translations.a.a("gui.leaderboard.type." + aVar.e().name(), new Object[0]);
        arrayList.add(new l(VariableScope.nullOrMissingString, this.c, a, this.d));
        int i2 = i;
        int i3 = ((int) (gameEngine.cl - gameEngine.cq)) - 6;
        int i4 = (int) (20.0f * gameEngine.cj);
        Iterator it = d.iterator();
        while (it.hasNext()) {
            d dVar = (d) it.next();
            l lVar = new l(aVar.a(dVar), this.d, " " + dVar.b(), dVar.a() ? this.d : this.c);
            lVar.g = dVar.c();
            lVar.c = dVar.d();
            arrayList.add(lVar);
        }
        float b = gameEngine.bO.b(a, this.c);
        float f2 = 0.0f;
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            l lVar2 = (l) it2.next();
            if (lVar2.d > f2) {
                f2 = lVar2.d;
            }
        }
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            l lVar3 = (l) it3.next();
            if (com.corrodinggames.rts.gameFramework.f.c(lVar3.d - f2) < 40.0f) {
                lVar3.d = f2;
            }
            float f3 = lVar3.d + lVar3.h;
            if (f3 > b) {
                b = f3;
            }
        }
        float e = com.corrodinggames.rts.gameFramework.f.e(b / 20.0f) * 20.0f;
        int i5 = i3 - ((int) (e + 0.5f));
        this.e.a = i5 - 6;
        this.e.c = i5 + 6 + e;
        this.e.b = (i2 - 6) - i4;
        this.e.d = i2 + 6 + ((arrayList.size() - 1) * i4);
        ag agVar = new ag();
        agVar.b(Color.a(100, 0, 0, 0));
        agVar.a(Paint.Style.FILL_AND_STROKE);
        gameEngine.bO.a(this.e, agVar);
        for (int i6 = 0; i6 < arrayList.size(); i6++) {
            l lVar4 = (l) arrayList.get(i6);
            lVar4.a.b(lVar4.c);
            gameEngine.bO.a(lVar4.b, i5, i2, lVar4.a);
            lVar4.e.b(lVar4.g);
            gameEngine.bO.a(lVar4.f, i5 + lVar4.d, i2, lVar4.e);
            i2 += i4;
        }
        return i2 + i4;
    }
}