package com.corrodinggames.rts.game.units.custom;

import android.graphics.PointF;
import com.corrodinggames.rts.game.units.AbstractC0244am;
import com.corrodinggames.rts.game.units.p013a.AbstractC0224s;
import com.corrodinggames.rts.game.units.p013a.AbstractC0228w;
import com.corrodinggames.rts.gameFramework.net.GameNetEngine;
import com.corrodinggames.rts.gameFramework.utility.C1136m;
import java.util.Iterator;

/* renamed from: com.corrodinggames.rts.game.units.custom.u */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/u.class */
public class C0468u {

    /* renamed from: a */
    C1136m f3377a = new C1136m();

    /* renamed from: b */
    C1136m f3378b;

    /* renamed from: c */
    String f3379c;

    /* renamed from: d */
    String f3380d;

    /* renamed from: a */
    public void m3474a(C0458l c0458l) {
    }

    /* renamed from: b */
    public void m3473b(C0458l c0458l) {
        C1136m c1136m = new C1136m();
        Iterator it = this.f3377a.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            AbstractC0224s m3514h = c0458l.m3514h(str);
            if (m3514h == null) {
                throw new C0417bo("[" + this.f3380d + "]" + this.f3379c + " Could not find action:" + str + " on unit: " + c0458l.m3535b());
            }
            if (m3514h instanceof AbstractC0228w) {
                c1136m.add((AbstractC0228w) m3514h);
            } else {
                throw new C0417bo("[" + this.f3380d + "]" + this.f3379c + " Action:" + str + " on unit: " + c0458l.m3535b() + " doesn't have the right type");
            }
        }
        this.f3378b = c1136m;
    }

    /* renamed from: a */
    public void m3475a(C0456j c0456j, PointF pointF, AbstractC0244am abstractC0244am, int i, int i2) {
        if (this.f3378b == null) {
            GameNetEngine.m1468g("Action on " + c0456j.mo1747r().mo3513i() + " has not been linked");
            return;
        }
        Iterator it = this.f3378b.iterator();
        while (it.hasNext()) {
            c0456j.m3653a((AbstractC0224s) it.next(), pointF, abstractC0244am, i, i2);
        }
    }

    /* renamed from: a */
    public C1136m m3477a() {
        if (this.f3378b == null) {
            GameNetEngine.m1468g("Action on [" + this.f3380d + "]" + this.f3379c + " has not been linked");
            return new C1136m();
        }
        return this.f3378b;
    }

    /* renamed from: a */
    public void m3476a(C0456j c0456j, PointF pointF, AbstractC0244am abstractC0244am) {
        if (this.f3378b == null) {
            GameNetEngine.m1468g("Action on " + c0456j.mo1747r().mo3513i() + " has not been linked");
            return;
        }
        Iterator it = this.f3378b.iterator();
        while (it.hasNext()) {
            c0456j.f2906dL.m3359a((AbstractC0228w) ((AbstractC0224s) it.next()), false, pointF, abstractC0244am);
        }
    }
}