package com.corrodinggames.rts.game;

import com.corrodinggames.rts.game.units.AbstractC0244am;
import com.corrodinggames.rts.game.units.InterfaceC0303as;
import com.corrodinggames.rts.game.units.custom.C0453g;
import com.corrodinggames.rts.game.units.custom.C0454h;
import com.corrodinggames.rts.game.units.custom.p020d.C0429b;
import com.corrodinggames.rts.game.units.custom.p021e.C0444f;
import com.corrodinggames.rts.game.units.p024d.C0504j;
import com.corrodinggames.rts.game.units.p024d.InterfaceC0506l;
import com.corrodinggames.rts.gameFramework.utility.C1136m;
import java.util.Iterator;

/* renamed from: com.corrodinggames.rts.game.s */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/s.class */
public final class C0202s {

    /* renamed from: b */
    public int f1403b;

    /* renamed from: c */
    public int f1404c;

    /* renamed from: d */
    public int f1405d;

    /* renamed from: e */
    public int f1406e;

    /* renamed from: f */
    public int f1407f;

    /* renamed from: g */
    public int f1408g;

    /* renamed from: m */
    public boolean f1414m;

    /* renamed from: n */
    public int f1415n;

    /* renamed from: o */
    public int f1416o;

    /* renamed from: a */
    public int f1402a = 5;

    /* renamed from: h */
    public C0444f f1409h = new C0444f();

    /* renamed from: i */
    public C0444f f1410i = new C0444f();

    /* renamed from: j */
    public C0444f f1411j = new C0444f();

    /* renamed from: k */
    public C0444f f1412k = new C0444f();

    /* renamed from: l */
    public C0444f f1413l = new C0444f();

    /* renamed from: p */
    public C0203t f1417p = new C0203t();

    /* renamed from: q */
    public C0203t f1418q = new C0203t();

    /* renamed from: a */
    public void m4347a(AbstractC0244am abstractC0244am) {
        this.f1405d++;
        if (abstractC0244am.f1629cm < 1.0f) {
            this.f1407f++;
        } else {
            this.f1404c++;
        }
        InterfaceC0303as mo1747r = abstractC0244am.mo1747r();
        if (!mo1747r.mo3509k()) {
            this.f1403b++;
        }
        if (!this.f1414m && !abstractC0244am.mo1745u() && abstractC0244am.mo1747r().mo3486y()) {
            this.f1414m = true;
        }
        C0429b m4200dq = abstractC0244am.m4200dq();
        if (m4200dq != null) {
            this.f1412k.m3747a(m4200dq, 0.0d, Double.MAX_VALUE);
            this.f1413l.m3747a(m4200dq, -1.7976931348623157E308d, 0.0d);
        }
        if (abstractC0244am instanceof InterfaceC0506l) {
            InterfaceC0506l interfaceC0506l = (InterfaceC0506l) abstractC0244am;
            int mo3330f = interfaceC0506l.mo3330f(false);
            this.f1403b += mo3330f;
            this.f1406e += mo3330f;
            if (mo3330f != 0) {
                m4345a(interfaceC0506l);
            }
        }
        m4342c(abstractC0244am);
        float mo3376cy = abstractC0244am.mo3376cy();
        if (mo3376cy != 0.0f && abstractC0244am.f1629cm >= 1.0f) {
            this.f1408g = (int) (this.f1408g + mo3376cy);
        }
        C0444f mo3632cA = abstractC0244am.mo3632cA();
        if (!mo3632cA.m3723c() && abstractC0244am.f1629cm >= 1.0f) {
            this.f1409h.m3729b(mo3632cA);
            this.f1410i.m3742a(mo3632cA, 0.0d, Double.MAX_VALUE);
            this.f1411j.m3742a(mo3632cA, -1.7976931348623157E308d, 0.0d);
        }
        if (abstractC0244am.m4213cU()) {
            int m3832b = abstractC0244am.m4214cM().m3832b();
            C0429b mo3569B = mo1747r.mo3569B();
            if (mo3569B != null) {
                m3832b += mo3569B.m3832b();
            }
            if (mo1747r.mo3511j()) {
                this.f1416o += m3832b;
            } else {
                this.f1415n += m3832b;
            }
        }
    }

    /* renamed from: b */
    public void m4344b(AbstractC0244am abstractC0244am) {
        this.f1405d--;
        if (abstractC0244am.f1629cm < 1.0f) {
            this.f1407f--;
        } else {
            this.f1404c--;
        }
        InterfaceC0303as mo1747r = abstractC0244am.mo1747r();
        if (!mo1747r.mo3509k()) {
            this.f1403b--;
        }
        C0429b m4200dq = abstractC0244am.m4200dq();
        if (m4200dq != null) {
            this.f1412k.m3732b(m4200dq, 0.0d, Double.MAX_VALUE);
            this.f1413l.m3732b(m4200dq, -1.7976931348623157E308d, 0.0d);
        }
        if (abstractC0244am instanceof InterfaceC0506l) {
            InterfaceC0506l interfaceC0506l = (InterfaceC0506l) abstractC0244am;
            int mo3330f = interfaceC0506l.mo3330f(false);
            this.f1403b -= mo3330f;
            this.f1406e -= mo3330f;
            if (mo3330f != 0) {
                m4343b(interfaceC0506l);
            }
        }
        m4341d(abstractC0244am);
        float mo3376cy = abstractC0244am.mo3376cy();
        if (mo3376cy != 0.0f && abstractC0244am.f1629cm >= 1.0f) {
            this.f1408g = (int) (this.f1408g - mo3376cy);
        }
        C0444f mo3632cA = abstractC0244am.mo3632cA();
        if (!mo3632cA.m3723c() && abstractC0244am.f1629cm >= 1.0f) {
            this.f1409h.m3720c(mo3632cA);
            this.f1410i.m3727b(mo3632cA, 0.0d, Double.MAX_VALUE);
            this.f1411j.m3727b(mo3632cA, -1.7976931348623157E308d, 0.0d);
        }
        if (abstractC0244am.m4213cU()) {
            int m3832b = abstractC0244am.m4214cM().m3832b();
            C0429b mo3569B = mo1747r.mo3569B();
            if (mo3569B != null) {
                m3832b += mo3569B.m3832b();
            }
            if (mo1747r.mo3511j()) {
                this.f1416o -= m3832b;
            } else {
                this.f1415n -= m3832b;
            }
        }
    }

    /* renamed from: c */
    private final void m4342c(AbstractC0244am abstractC0244am) {
        C0454h mo3599de = abstractC0244am.mo3599de();
        if (mo3599de != null) {
            for (C0453g c0453g : mo3599de.f2866a) {
                C0199p m4346a = m4346a(c0453g);
                if (abstractC0244am.f1629cm < 1.0f) {
                    m4346a.f1389c++;
                } else {
                    m4346a.f1388b++;
                }
            }
        }
    }

    /* renamed from: d */
    private final void m4341d(AbstractC0244am abstractC0244am) {
        C0454h mo3599de = abstractC0244am.mo3599de();
        if (mo3599de != null) {
            for (C0453g c0453g : mo3599de.f2866a) {
                C0199p m4346a = m4346a(c0453g);
                if (abstractC0244am.f1629cm < 1.0f) {
                    m4346a.f1389c--;
                } else {
                    m4346a.f1388b--;
                }
            }
        }
    }

    /* renamed from: a */
    private final void m4345a(InterfaceC0506l interfaceC0506l) {
        InterfaceC0303as interfaceC0303as;
        C0454h mo3487x;
        C1136m mo3333dx = interfaceC0506l.mo3333dx();
        if (mo3333dx.f7109a != 0) {
            Iterator it = mo3333dx.iterator();
            while (it.hasNext()) {
                C0504j c0504j = (C0504j) it.next();
                if (c0504j.f3521f && (interfaceC0303as = c0504j.f3522g) != null && (mo3487x = interfaceC0303as.mo3487x()) != null) {
                    for (C0453g c0453g : mo3487x.f2866a) {
                        m4346a(c0453g).f1390d += c0504j.f3516a;
                    }
                }
            }
        }
    }

    /* renamed from: b */
    private final void m4343b(InterfaceC0506l interfaceC0506l) {
        InterfaceC0303as interfaceC0303as;
        C0454h mo3487x;
        C1136m mo3333dx = interfaceC0506l.mo3333dx();
        if (mo3333dx.f7109a != 0) {
            Iterator it = mo3333dx.iterator();
            while (it.hasNext()) {
                C0504j c0504j = (C0504j) it.next();
                if (c0504j.f3521f && (interfaceC0303as = c0504j.f3522g) != null && (mo3487x = interfaceC0303as.mo3487x()) != null) {
                    for (C0453g c0453g : mo3487x.f2866a) {
                        m4346a(c0453g).f1390d -= c0504j.f3516a;
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public final C0199p m4346a(C0453g c0453g) {
        C0199p[] c0199pArr = this.f1418q.f1420b;
        int i = this.f1418q.f1421c;
        for (int i2 = 0; i2 < i; i2++) {
            C0199p c0199p = c0199pArr[i2];
            if (c0199p.f1387a == c0453g) {
                return c0199p;
            }
            if (c0199p.f1387a == null) {
                c0199p.f1387a = c0453g;
                return c0199p;
            }
        }
        C0199p c0199p2 = new C0199p();
        c0199p2.f1387a = c0453g;
        this.f1418q.m4340a(c0199p2);
        return c0199p2;
    }
}