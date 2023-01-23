package com.corrodinggames.rts.gameFramework.f;

import android.graphics.Paint;
import android.graphics.Rect;
import com.corrodinggames.rts.gameFramework.GameEngine;
import java.util.Iterator;

/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/f/aj.class */
public class aj {

    /* renamed from: a  reason: collision with root package name */
    com.corrodinggames.rts.gameFramework.utility.m f498a;
    Rect b;
    Paint c;
    Paint d;

    public void a(float f, float f2) {
        com.corrodinggames.rts.gameFramework.m.e eVar;
        GameEngine gameEngine = GameEngine.getGameEngine();
        int i = 0;
        int a2 = d.a(this.c);
        Iterator it = this.f498a.iterator();
        while (it.hasNext()) {
            ak akVar = (ak) it.next();
            int i2 = 0;
            af afVar = null;
            Iterator it2 = akVar.f499a.iterator();
            while (it2.hasNext()) {
                af afVar2 = (af) it2.next();
                if (afVar != null) {
                    i2 += afVar.a(this.c);
                }
                int d = ((int) ((f + i2) + this.b.d())) - (akVar.b / 2);
                int i3 = (int) (f2 + this.b.b + (a2 / 2) + (i * a2));
                if (!(afVar2 instanceof ai)) {
                    if (afVar2 instanceof ah) {
                        ah ahVar = (ah) afVar2;
                        gameEngine.bO.a(ahVar.f497a, d, i3 - (eVar.q * ahVar.b), ae.c, 0.0f, ahVar.b);
                    }
                    afVar = afVar2;
                } else {
                    ai aiVar = (ai) afVar2;
                    gameEngine.bO.a(aiVar.d, d, i3, aiVar.b(this.c));
                    afVar = afVar2;
                }
            }
            i++;
        }
    }
}