package com.corrodinggames.rts.gameFramework.p037f;

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
public class C0831m {

    /* renamed from: a */
    public static int f5452a = 95;

    /* renamed from: b */
    C0825g f5453b;

    /* renamed from: c */
    GameEngine f5454c;

    /* renamed from: d */
    Paint f5455d;

    /* renamed from: e */
    boolean f5456e;

    /* renamed from: f */
    ArrayList f5457f = new ArrayList();

    C0831m(GameEngine gameEngine, C0825g c0825g) {
        this.f5453b = c0825g;
        this.f5454c = gameEngine;
        m1784a();
    }

    /* renamed from: a */
    public void m1784a() {
        this.f5455d = new Paint();
        this.f5455d.m5222a(255, 255, 255, 255);
        this.f5455d.mo914a(true);
        this.f5455d.m5193c(true);
        this.f5455d.mo916a(Typeface.m5131a(Typeface.f242c, 1));
        this.f5454c.m1071a(this.f5455d, 16.0f);
    }

    /* renamed from: b */
    public synchronized void m1781b() {
        this.f5456e = false;
        this.f5457f.clear();
    }

    /* renamed from: c */
    public synchronized void m1780c() {
        Iterator it = this.f5457f.iterator();
        while (it.hasNext()) {
            C0832n c0832n = (C0832n) it.next();
            if (this.f5457f.size() > 15) {
                it.remove();
            }
        }
    }

    /* renamed from: a */
    public synchronized C0832n m1782a(String str, String str2) {
        GameEngine gameEngine = GameEngine.getGameEngine();
        C0832n c0832n = new C0832n();
        c0832n.f5458a = str;
        c0832n.f5459b = str2;
        c0832n.f5460c = System.currentTimeMillis();
        c0832n.f5461d = new SimpleDateFormat("HH:mm:ss").format(new Date());
        if (str != null && !str.equals(VariableScope.nullOrMissingString) && !gameEngine.settingsEngine.showPlayerChatInGame) {
            if (!this.f5456e) {
                this.f5456e = true;
                m1782a((String) null, "[WARNING: A player send a chat message, but you have chat muted in your settings]");
            }
            return c0832n;
        }
        m1780c();
        this.f5457f.add(c0832n);
        return c0832n;
    }

    /* renamed from: a */
    public synchronized int m1783a(float f, int i) {
        String str;
        GameEngine gameEngine = GameEngine.getGameEngine();
        m1780c();
        int i2 = (int) (20.0f * gameEngine.f6395cj);
        boolean mo1082a = gameEngine.mo1082a();
        for (int size = this.f5457f.size() - 1; size >= 0; size--) {
            C0832n c0832n = (C0832n) this.f5457f.get(size);
            if (c0832n.m1778b()) {
                if (c0832n.f5458a == null || c0832n.f5458a.equals(VariableScope.nullOrMissingString)) {
                    str = c0832n.f5459b;
                } else {
                    str = c0832n.f5458a + ": " + c0832n.f5459b;
                }
                if (mo1082a) {
                    str = c0832n.f5461d + ": " + str;
                }
                if (c0832n.f5462e > 0) {
                    int m1779a = c0832n.m1779a() / c0832n.f5462e;
                    if (m1779a < 0) {
                        m1779a = 0;
                    }
                    if (m1779a < str.length()) {
                        str = str.substring(0, m1779a);
                    }
                }
                this.f5455d.m5200b(c0832n.f5463f);
                gameEngine.f6374bO.mo182a(str, 20, i, this.f5455d);
                i += i2;
            }
        }
        return i;
    }
}