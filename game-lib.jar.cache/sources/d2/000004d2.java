package com.corrodinggames.rts.gameFramework.p037f;

import android.graphics.Paint;
import android.graphics.Typeface;
import com.corrodinggames.rts.game.units.AbstractC0244am;
import com.corrodinggames.rts.gameFramework.GameEngine;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/* renamed from: com.corrodinggames.rts.gameFramework.f.ap */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/f/ap.class */
public class C0812ap {

    /* renamed from: a */
    private GameEngine f5212a;

    /* renamed from: b */
    private Paint f5213b;

    /* renamed from: c */
    private ArrayList f5214c = new ArrayList();

    public C0812ap(GameEngine gameEngine) {
        this.f5212a = gameEngine;
        m1948a();
    }

    /* renamed from: a */
    public void m1948a() {
        this.f5213b = new Paint();
        this.f5213b.m5222a(255, 255, 255, 255);
        this.f5213b.mo914a(true);
        this.f5213b.m5193c(true);
        this.f5213b.mo916a(Typeface.m5131a(Typeface.f242c, 1));
        this.f5212a.m1071a(this.f5213b, 14.0f);
    }

    /* renamed from: b */
    public synchronized void m1942b() {
        this.f5214c.clear();
    }

    /* renamed from: a */
    public synchronized void m1946a(AbstractC0244am abstractC0244am) {
        C0814ar c0814ar = new C0814ar(abstractC0244am.f7173eo, abstractC0244am.f7174ep, abstractC0244am.mo1747r());
        c0814ar.f5218c = GameEngine.m1087V();
        m1945a(c0814ar);
    }

    /* renamed from: b */
    public synchronized void m1941b(AbstractC0244am abstractC0244am) {
        C0816at c0816at = new C0816at(abstractC0244am.f7173eo, abstractC0244am.f7174ep, abstractC0244am.mo1747r());
        c0816at.f5218c = GameEngine.m1087V();
        m1945a(c0816at);
    }

    /* renamed from: c */
    public synchronized void m1939c(AbstractC0244am abstractC0244am) {
        C0815as c0815as = new C0815as(abstractC0244am.f7173eo, abstractC0244am.f7174ep, abstractC0244am.mo3398bI());
        c0815as.f5218c = GameEngine.m1087V();
        m1945a(c0815as);
    }

    /* renamed from: a */
    public synchronized void m1944a(String str) {
        C0813aq c0813aq = new C0813aq(str);
        c0813aq.f5218c = GameEngine.m1087V();
        m1945a(c0813aq);
    }

    /* renamed from: a */
    public synchronized void m1943a(String str, int i) {
        C0813aq c0813aq = new C0813aq(str);
        c0813aq.f5218c = GameEngine.m1087V();
        c0813aq.f5219d = i;
        c0813aq.f5224i = true;
        m1945a(c0813aq);
    }

    /* renamed from: a */
    private void m1945a(AbstractC0817au abstractC0817au) {
        boolean z = false;
        Iterator it = this.f5214c.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            AbstractC0817au abstractC0817au2 = (AbstractC0817au) it.next();
            if (abstractC0817au2.mo1936a(abstractC0817au)) {
                abstractC0817au2.mo1934b(abstractC0817au);
                z = true;
                break;
            }
        }
        if (z) {
            Collections.sort(this.f5214c);
        } else {
            this.f5214c.add(0, abstractC0817au);
        }
    }

    /* renamed from: a */
    public synchronized void m1947a(float f) {
        m1940c();
        GameEngine gameEngine = GameEngine.getGameEngine();
        int i = (int) (gameEngine.f6398cm - (130.0f * gameEngine.f6395cj));
        int i2 = (int) (20.0f * gameEngine.f6395cj);
        Iterator it = this.f5214c.iterator();
        while (it.hasNext()) {
            AbstractC0817au abstractC0817au = (AbstractC0817au) it.next();
            String mo1937a = abstractC0817au.mo1937a();
            if (gameEngine.settingsEngine.showWarLogOnScreen || abstractC0817au.f5224i) {
                if (abstractC0817au.f5218c + abstractC0817au.f5219d >= System.currentTimeMillis()) {
                    if (abstractC0817au.f5223h) {
                        this.f5213b.m5222a(255, 160, 160, 160);
                    } else {
                        this.f5213b.m5222a(255, 255, 255, 255);
                    }
                    gameEngine.f6374bO.mo182a(mo1937a, 20, i, this.f5213b);
                    i -= i2;
                } else {
                    return;
                }
            }
        }
    }

    /* renamed from: c */
    public synchronized void m1940c() {
        Iterator it = this.f5214c.iterator();
        while (it.hasNext()) {
            if (((AbstractC0817au) it.next()).f5218c + 20000 < System.currentTimeMillis()) {
                it.remove();
            }
        }
    }

    /* renamed from: d */
    public synchronized void m1938d() {
        if (this.f5214c.isEmpty()) {
            return;
        }
        Iterator it = this.f5214c.iterator();
        while (it.hasNext()) {
            AbstractC0817au abstractC0817au = (AbstractC0817au) it.next();
            if (!abstractC0817au.f5223h) {
                abstractC0817au.f5223h = true;
                this.f5212a.m1022b(abstractC0817au.f5220e, abstractC0817au.f5221f);
                return;
            }
        }
    }
}