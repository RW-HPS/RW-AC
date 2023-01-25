package com.corrodinggames.rts.game.units.custom.p016a;

import com.corrodinggames.rts.game.units.AbstractC0244am;
import com.corrodinggames.rts.game.units.AbstractC0629y;
import com.corrodinggames.rts.game.units.custom.C0352aj;
import com.corrodinggames.rts.game.units.custom.C0463p;
import com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean;
import com.corrodinggames.rts.game.units.custom.p020d.C0429b;
import com.corrodinggames.rts.game.units.p013a.C0206a;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.p037f.C0810an;

/* renamed from: com.corrodinggames.rts.game.units.custom.a.c */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/a/c.class */
public class C0338c extends C0206a {

    /* renamed from: b */
    public LogicBoolean f2046b;

    /* renamed from: c */
    public LogicBoolean f2047c;

    /* renamed from: d */
    public C0352aj f2048d;

    /* renamed from: e */
    public LogicBoolean f2049e;

    /* renamed from: f */
    public C0352aj f2050f;

    /* renamed from: g */
    public LogicBoolean f2051g;

    /* renamed from: h */
    public C0352aj f2052h;

    /* renamed from: i */
    public boolean f2053i;

    /* renamed from: j */
    public LogicBoolean f2054j;

    /* renamed from: k */
    public C0429b f2055k;

    /* renamed from: l */
    public C0429b f2056l;

    /* renamed from: m */
    public C0429b f2057m;

    /* renamed from: a */
    public static C0206a m4086a(C0339d c0339d) {
        boolean z = false;
        if (c0339d.f2083z != null && c0339d.f2083z != LogicBoolean.falseBoolean) {
            z = true;
        }
        if (c0339d.f2085B != null && c0339d.f2085B != LogicBoolean.falseBoolean) {
            z = true;
        }
        if (c0339d.f2087D != null && c0339d.f2087D != LogicBoolean.falseBoolean) {
            z = true;
        }
        if (c0339d.f2079v != null && c0339d.f2079v != LogicBoolean.trueBoolean) {
            z = true;
        }
        if (c0339d.f2141aF != null && c0339d.f2141aF != LogicBoolean.falseBoolean) {
            z = true;
        }
        if (c0339d.f2114ae != null) {
            z = true;
        }
        if (c0339d.f2074q != null) {
            z = true;
        }
        if (!z) {
            return C0206a.f1430a;
        }
        C0338c c0338c = new C0338c();
        c0338c.f2047c = c0339d.f2083z;
        c0338c.f2048d = c0339d.f2084A;
        c0338c.f2049e = c0339d.f2085B;
        c0338c.f2050f = c0339d.f2086C;
        c0338c.f2051g = c0339d.f2087D;
        c0338c.f2052h = c0339d.f2088E;
        c0338c.f2046b = c0339d.f2079v;
        c0338c.f2054j = c0339d.f2141aF;
        c0338c.f2056l = c0339d.f2114ae;
        c0338c.f2055k = c0339d.f2074q;
        c0338c.f2057m = c0339d.f2075r;
        c0338c.f2053i = c0339d.f2082y;
        return c0338c;
    }

    /* renamed from: a */
    public static C0206a m4085a(C0463p c0463p) {
        boolean z = false;
        if (c0463p.f3367f != null && c0463p.f3367f != LogicBoolean.falseBoolean) {
            z = true;
        }
        if (!z) {
            return C0206a.f1430a;
        }
        C0338c c0338c = new C0338c();
        c0338c.f2047c = c0463p.f3367f;
        c0338c.f2048d = C0352aj.m3987a(c0463p.f3368g);
        return c0338c;
    }

    @Override // com.corrodinggames.rts.game.units.p013a.C0206a
    /* renamed from: a */
    public boolean mo4090a(AbstractC0244am abstractC0244am) {
        return this.f2053i;
    }

    @Override // com.corrodinggames.rts.game.units.p013a.C0206a
    /* renamed from: b */
    public boolean mo4083b(AbstractC0244am abstractC0244am) {
        return m4089a(abstractC0244am, -1);
    }

    /* renamed from: a */
    public boolean m4089a(AbstractC0244am abstractC0244am, int i) {
        if (this.f2047c != null && (i == -1 || i == 1)) {
            if (!(abstractC0244am instanceof AbstractC0629y)) {
                GameEngine.m976n("CustomActionConfig lockedInGame:" + abstractC0244am.mo1747r().mo3513i() + " is not a OrderableUnit unit");
                return false;
            } else if (this.f2047c.read((AbstractC0629y) abstractC0244am)) {
                return true;
            }
        }
        if (this.f2049e != null && (i == -1 || i == 2)) {
            if (!(abstractC0244am instanceof AbstractC0629y)) {
                GameEngine.m976n("CustomActionConfig lockedInGame:" + abstractC0244am.mo1747r().mo3513i() + " is not a OrderableUnit unit");
                return false;
            } else if (this.f2049e.read((AbstractC0629y) abstractC0244am)) {
                return true;
            }
        }
        if (this.f2051g != null) {
            if (i == -1 || i == 3) {
                if (!(abstractC0244am instanceof AbstractC0629y)) {
                    GameEngine.m976n("CustomActionConfig lockedInGame:" + abstractC0244am.mo1747r().mo3513i() + " is not a OrderableUnit unit");
                    return false;
                } else if (this.f2051g.read((AbstractC0629y) abstractC0244am)) {
                    return true;
                } else {
                    return false;
                }
            }
            return false;
        }
        return false;
    }

    @Override // com.corrodinggames.rts.game.units.p013a.C0206a
    /* renamed from: c */
    public String mo4082c(AbstractC0244am abstractC0244am) {
        if (m4089a(abstractC0244am, 1) && this.f2048d != null) {
            return this.f2048d.m3982b(abstractC0244am);
        }
        if (m4089a(abstractC0244am, 2) && this.f2050f != null) {
            return this.f2050f.m3982b(abstractC0244am);
        }
        if (m4089a(abstractC0244am, 3) && this.f2052h != null) {
            return this.f2052h.m3982b(abstractC0244am);
        }
        return null;
    }

    @Override // com.corrodinggames.rts.game.units.p013a.C0206a
    /* renamed from: a */
    public boolean mo4087a(AbstractC0244am abstractC0244am, boolean z) {
        if (this.f2046b != null) {
            if (!(abstractC0244am instanceof AbstractC0629y)) {
                GameEngine.m976n("CustomActionConfig isAvailable:" + abstractC0244am.mo1747r().mo3513i() + " is not a OrderableUnit unit");
                return true;
            } else if (z) {
                return C0810an.m1952a(this.f2046b, (AbstractC0629y) abstractC0244am);
            } else {
                return this.f2046b.read((AbstractC0629y) abstractC0244am);
            }
        }
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.p013a.C0206a
    /* renamed from: d */
    public boolean mo4081d(AbstractC0244am abstractC0244am) {
        if (this.f2054j != null) {
            if (!(abstractC0244am instanceof AbstractC0629y)) {
                GameEngine.m976n("CustomActionConfig isGuiBlinking:" + abstractC0244am.mo1747r().mo3513i() + " is not a OrderableUnit unit");
                return true;
            }
            return this.f2054j.read((AbstractC0629y) abstractC0244am);
        }
        return false;
    }

    @Override // com.corrodinggames.rts.game.units.p013a.C0206a
    /* renamed from: a */
    public void mo4088a(AbstractC0244am abstractC0244am, AbstractC0244am abstractC0244am2) {
        if (this.f2056l != null) {
            this.f2056l.m3809h(abstractC0244am);
        }
    }

    @Override // com.corrodinggames.rts.game.units.p013a.C0206a
    /* renamed from: a */
    public C0429b mo4091a() {
        return this.f2055k;
    }

    @Override // com.corrodinggames.rts.game.units.p013a.C0206a
    /* renamed from: b */
    public C0429b mo4084b() {
        return this.f2057m;
    }
}