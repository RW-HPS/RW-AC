package com.corrodinggames.rts.gameFramework.Interface;

import android.graphics.Paint;
import android.graphics.Typeface;
import com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope;
import com.corrodinggames.rts.gameFramework.GameEngine;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;

/* renamed from: com.corrodinggames.rts.gameFramework.f.m */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/f/m.class */
public class m {
    public static int a = 95;
    InterfaceEngine b;
    GameEngine c;
    Paint d;
    boolean e;
    ArrayList f = new ArrayList();

    m(GameEngine gameEngine, InterfaceEngine interfaceEngine) {
        this.b = interfaceEngine;
        this.c = gameEngine;
        a();
    }

    public void a() {
        this.d = new Paint();
        this.d.a(255, 255, 255, 255);
        this.d.a(true);
        this.d.c(true);
        this.d.a(Typeface.a(Typeface.c, 1));
        this.c.a(this.d, 16.0f);
    }

    public synchronized void b() {
        this.e = false;
        this.f.clear();
    }

    public synchronized void c() {
        Iterator it = this.f.iterator();
        while (it.hasNext()) {
            n nVar = (n) it.next();
            if (this.f.size() > 15) {
                it.remove();
            }
        }
    }

    public synchronized n a(String str, String str2) {
        GameEngine gameEngine = GameEngine.getGameEngine();
        n nVar = new n();
        nVar.a = str;
        nVar.b = str2;
        nVar.c = System.currentTimeMillis();
        nVar.d = new SimpleDateFormat("HH:mm:ss").format(new Date());
        if (str != null && !str.equals(VariableScope.nullOrMissingString) && !gameEngine.settingsEngine.showPlayerChatInGame) {
            if (!this.e) {
                this.e = true;
                a((String) null, "[WARNING: A player send a chat message, but you have chat muted in your settings]");
            }
            return nVar;
        }
        c();
        this.f.add(nVar);
        return nVar;
    }

    public synchronized int a(float f, int i) {
        String str;
        GameEngine gameEngine = GameEngine.getGameEngine();
        c();
        int i2 = (int) (20.0f * gameEngine.cj);
        boolean a2 = gameEngine.a();
        for (int size = this.f.size() - 1; size >= 0; size--) {
            n nVar = (n) this.f.get(size);
            if (nVar.b()) {
                if (nVar.a == null || nVar.a.equals(VariableScope.nullOrMissingString)) {
                    str = nVar.b;
                } else {
                    str = nVar.a + ": " + nVar.b;
                }
                if (a2) {
                    str = nVar.d + ": " + str;
                }
                if (nVar.e > 0) {
                    int a3 = nVar.a() / nVar.e;
                    if (a3 < 0) {
                        a3 = 0;
                    }
                    if (a3 < str.length()) {
                        str = str.substring(0, a3);
                    }
                }
                this.d.b(nVar.f);
                gameEngine.bO.a(str, 20, i, this.d);
                i += i2;
            }
        }
        return i;
    }
}