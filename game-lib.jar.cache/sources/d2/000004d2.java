package com.corrodinggames.rts.gameFramework.Interface;

import android.graphics.Paint;
import android.graphics.Typeface;
import com.corrodinggames.rts.game.units.am;
import com.corrodinggames.rts.gameFramework.GameEngine;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/* renamed from: com.corrodinggames.rts.gameFramework.f.ap */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/f/ap.class */
public class ap {
    private GameEngine a;
    private Paint b;
    private ArrayList c = new ArrayList();

    public ap(GameEngine gameEngine) {
        this.a = gameEngine;
        a();
    }

    public void a() {
        this.b = new Paint();
        this.b.a(255, 255, 255, 255);
        this.b.a(true);
        this.b.c(true);
        this.b.a(Typeface.a(Typeface.c, 1));
        this.a.a(this.b, 14.0f);
    }

    public synchronized void b() {
        this.c.clear();
    }

    public synchronized void a(am amVar) {
        ar arVar = new ar(amVar.eo, amVar.ep, amVar.mo1r());
        arVar.c = GameEngine.V();
        a(arVar);
    }

    public synchronized void b(am amVar) {
        at atVar = new at(amVar.eo, amVar.ep, amVar.mo1r());
        atVar.c = GameEngine.V();
        a(atVar);
    }

    public synchronized void c(am amVar) {
        as asVar = new as(amVar.eo, amVar.ep, amVar.bI());
        asVar.c = GameEngine.V();
        a(asVar);
    }

    public synchronized void a(String str) {
        aq aqVar = new aq(str);
        aqVar.c = GameEngine.V();
        a(aqVar);
    }

    public synchronized void a(String str, int i) {
        aq aqVar = new aq(str);
        aqVar.c = GameEngine.V();
        aqVar.d = i;
        aqVar.i = true;
        a(aqVar);
    }

    private void a(au auVar) {
        boolean z = false;
        Iterator it = this.c.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            au auVar2 = (au) it.next();
            if (auVar2.a(auVar)) {
                auVar2.b(auVar);
                z = true;
                break;
            }
        }
        if (z) {
            Collections.sort(this.c);
        } else {
            this.c.add(0, auVar);
        }
    }

    public synchronized void a(float f) {
        c();
        GameEngine gameEngine = GameEngine.getGameEngine();
        int i = (int) (gameEngine.cm - (130.0f * gameEngine.cj));
        int i2 = (int) (20.0f * gameEngine.cj);
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            au auVar = (au) it.next();
            String a = auVar.a();
            if (gameEngine.settingsEngine.showWarLogOnScreen || auVar.i) {
                if (auVar.c + auVar.d >= System.currentTimeMillis()) {
                    if (auVar.h) {
                        this.b.a(255, 160, 160, 160);
                    } else {
                        this.b.a(255, 255, 255, 255);
                    }
                    gameEngine.bO.a(a, 20, i, this.b);
                    i -= i2;
                } else {
                    return;
                }
            }
        }
    }

    public synchronized void c() {
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            if (((au) it.next()).c + 20000 < System.currentTimeMillis()) {
                it.remove();
            }
        }
    }

    public synchronized void d() {
        if (this.c.isEmpty()) {
            return;
        }
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            au auVar = (au) it.next();
            if (!auVar.h) {
                auVar.h = true;
                this.a.b(auVar.e, auVar.f);
                return;
            }
        }
    }
}