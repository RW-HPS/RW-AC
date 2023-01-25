package com.corrodinggames.rts.game.units.p013a;

import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import com.corrodinggames.rts.game.PlayerData;
import com.corrodinggames.rts.game.units.AbstractC0244am;
import com.corrodinggames.rts.game.units.AbstractC0629y;
import com.corrodinggames.rts.game.units.InterfaceC0303as;
import com.corrodinggames.rts.game.units.custom.C0454h;
import com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope;
import com.corrodinggames.rts.game.units.custom.p016a.EnumC0340e;
import com.corrodinggames.rts.game.units.custom.p020d.C0429b;
import com.corrodinggames.rts.game.units.p028g.C0559e;
import com.corrodinggames.rts.gameFramework.C0645ad;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.p037f.C0775a;
import com.corrodinggames.rts.gameFramework.p037f.C0795ae;
import com.corrodinggames.rts.gameFramework.unitAction.C0970e;
import java.util.ArrayList;

/* renamed from: com.corrodinggames.rts.game.units.a.s */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/a/s.class */
public abstract class AbstractC0224s implements Comparable {

    /* renamed from: g */
    public float f1464g = -999.0f;

    /* renamed from: h */
    public C0206a f1465h = C0206a.f1430a;

    /* renamed from: i */
    public static final C0208c f1466i = C0208c.f1432a;

    /* renamed from: a */
    private C0208c f1467a;

    /* renamed from: b */
    private C0429b f1468b;

    /* renamed from: b */
    public abstract String mo3095b();

    /* renamed from: a */
    public abstract String mo3098a();

    /* renamed from: c */
    public abstract int mo3092c();

    /* renamed from: b */
    public abstract int mo3093b(AbstractC0244am abstractC0244am, boolean z);

    /* renamed from: i */
    public abstract InterfaceC0303as mo5457i();

    /* renamed from: g */
    public abstract boolean mo3089g();

    /* renamed from: e */
    public abstract EnumC0226u mo3091e();

    /* renamed from: f */
    public abstract EnumC0225t mo3090f();

    /* renamed from: m_ */
    public float mo4280m_() {
        if (this instanceof C0220o) {
            return -100.0f;
        }
        if (this.f1464g != -999.0f) {
            return this.f1464g;
        }
        InterfaceC0303as mo5457i = mo5457i();
        if (mo5457i != null && mo3089g()) {
            return mo5457i.mo3517g();
        }
        return 1.0f;
    }

    @Override // java.lang.Comparable
    /* renamed from: a */
    public int mo4326a(AbstractC0224s abstractC0224s) {
        if (abstractC0224s == null) {
            return 0;
        }
        float mo4280m_ = mo4280m_() - abstractC0224s.mo4280m_();
        if (mo4280m_ < 0.0f) {
            return -1;
        }
        return mo4280m_ > 0.0f ? 1 : 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || obj.getClass() != getClass() || !this.f1467a.equals(((AbstractC0224s) obj).f1467a)) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public static final boolean m4301b(C0208c c0208c) {
        if (c0208c == null || c0208c == f1466i) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public static final boolean m4300c(C0208c c0208c) {
        return !m4301b(c0208c);
    }

    /* renamed from: a */
    public static boolean m4306a(AbstractC0224s abstractC0224s, AbstractC0224s abstractC0224s2) {
        return abstractC0224s == abstractC0224s2;
    }

    /* renamed from: d */
    public final boolean m4298d(C0208c c0208c) {
        return this.f1467a == c0208c;
    }

    public AbstractC0224s(int i) {
        m4302a(String.valueOf(i));
    }

    public AbstractC0224s(String str) {
        m4302a(str);
    }

    public AbstractC0224s(C0208c c0208c) {
        m4297e(c0208c);
    }

    /* renamed from: a */
    public final void m4302a(String str) {
        this.f1467a = C0208c.m4336a(str);
    }

    /* renamed from: e */
    public final void m4297e(C0208c c0208c) {
        this.f1467a = c0208c;
    }

    /* renamed from: N */
    public final C0208c m4309N() {
        return this.f1467a;
    }

    /* renamed from: z */
    public C0208c mo4291z() {
        return m4309N();
    }

    /* renamed from: O */
    public final String m4308O() {
        if (this.f1467a == null) {
            return "<null index>";
        }
        return this.f1467a.m4340a();
    }

    /* renamed from: P */
    public C0454h mo4071P() {
        return null;
    }

    /* renamed from: d */
    public String mo4066d(AbstractC0244am abstractC0244am) {
        return mo3095b();
    }

    /* renamed from: e */
    public String mo4064e(AbstractC0244am abstractC0244am) {
        return mo3098a();
    }

    /* renamed from: B */
    public C0429b mo4078B() {
        C0429b mo4091a = this.f1465h.mo4091a();
        if (mo4091a != null) {
            return mo4091a;
        }
        int mo3092c = mo3092c();
        if (mo3092c == 0) {
            return C0429b.f2734a;
        }
        if (this.f1468b == null || this.f1468b.m3852a() != mo3092c) {
            this.f1468b = C0429b.m3851a(mo3092c);
        }
        return this.f1468b;
    }

    /* renamed from: r_ */
    public C0429b mo4054r_() {
        if (this.f1465h.mo4084b() != null) {
            return this.f1465h.mo4084b();
        }
        return null;
    }

    /* renamed from: n_ */
    public boolean mo4289n_() {
        return false;
    }

    /* renamed from: g */
    public boolean mo4063g(AbstractC0244am abstractC0244am) {
        return this.f1465h.mo4083b(abstractC0244am);
    }

    /* renamed from: j */
    public String mo4060j(AbstractC0244am abstractC0244am) {
        return this.f1465h.mo4082c(abstractC0244am);
    }

    /* renamed from: a */
    public void mo4305a(AbstractC0244am abstractC0244am, AbstractC0244am abstractC0244am2) {
        this.f1465h.mo4088a(abstractC0244am, abstractC0244am2);
    }

    /* renamed from: d */
    public boolean mo4065d(AbstractC0244am abstractC0244am, boolean z) {
        return true;
    }

    /* renamed from: k */
    public boolean mo4059k(AbstractC0244am abstractC0244am) {
        return false;
    }

    /* renamed from: l */
    public boolean mo4058l(AbstractC0244am abstractC0244am) {
        return false;
    }

    /* renamed from: a */
    public boolean mo3096a(AbstractC0244am abstractC0244am, boolean z) {
        if (mo4063g(abstractC0244am) || C0559e.m3182a(abstractC0244am, m4309N()) > 0) {
            return false;
        }
        if (z) {
            return mo4078B().m3819c(abstractC0244am, mo4070Q());
        }
        return mo4078B().mo3800b(abstractC0244am);
    }

    /* renamed from: r */
    public boolean mo4055r(AbstractC0244am abstractC0244am) {
        return mo3094b(abstractC0244am);
    }

    /* renamed from: u */
    public boolean m4294u(AbstractC0244am abstractC0244am) {
        return this.f1465h.mo4090a(abstractC0244am);
    }

    /* renamed from: b */
    public boolean mo3094b(AbstractC0244am abstractC0244am) {
        return this.f1465h.mo4087a(abstractC0244am, false);
    }

    /* renamed from: a */
    public boolean mo4068a(AbstractC0244am abstractC0244am, PlayerData playerData) {
        return false;
    }

    /* renamed from: u */
    public boolean mo4051u() {
        return false;
    }

    /* renamed from: h */
    public boolean mo3088h() {
        return false;
    }

    /* renamed from: C */
    public boolean mo4283C() {
        return false;
    }

    /* renamed from: D */
    public boolean mo4290D() {
        return true;
    }

    /* renamed from: A */
    public boolean mo4079A() {
        return false;
    }

    /* renamed from: y */
    public InterfaceC0303as mo4049y() {
        return null;
    }

    /* renamed from: E */
    public InterfaceC0303as mo4077E() {
        return null;
    }

    /* renamed from: F */
    public boolean mo4076F() {
        return false;
    }

    /* renamed from: t */
    public int mo4288t() {
        return 1;
    }

    /* renamed from: o */
    public boolean mo3085o() {
        return false;
    }

    /* renamed from: m */
    public boolean mo4057m(AbstractC0244am abstractC0244am) {
        return false;
    }

    /* renamed from: n */
    public boolean mo4056n(AbstractC0244am abstractC0244am) {
        return false;
    }

    /* renamed from: v */
    public EnumC0340e mo4050v(AbstractC0244am abstractC0244am) {
        return null;
    }

    /* renamed from: d */
    public String mo3123d() {
        String str = null;
        GameEngine gameEngine = GameEngine.getGameEngine();
        int i = 0;
        AbstractC0244am[] m499a = gameEngine.f6330bS.f5427bZ.m499a();
        int size = gameEngine.f6330bS.f5427bZ.size();
        for (int i2 = 0; i2 < size; i2++) {
            AbstractC0244am abstractC0244am = m499a[i2];
            if (abstractC0244am instanceof AbstractC0629y) {
                AbstractC0629y abstractC0629y = (AbstractC0629y) abstractC0244am;
                if (str == null) {
                    str = mo4066d(abstractC0629y);
                }
                int mo3093b = mo3093b(abstractC0629y, true);
                if (mo3093b != -1 && mo3093b != 0) {
                    i += mo3093b;
                }
            }
        }
        if (str == null) {
            str = mo3095b();
        }
        if (i != -1 && i != 0) {
            str = str + " (" + i + ")";
        }
        return str;
    }

    /* renamed from: h_ */
    public boolean mo3087h_() {
        return true;
    }

    /* renamed from: w */
    public String mo4277w(AbstractC0244am abstractC0244am) {
        return mo4066d(abstractC0244am);
    }

    /* renamed from: a */
    public void mo4303a(AbstractC0244am abstractC0244am, C0795ae c0795ae, Paint paint, Paint paint2) {
        String mo4277w;
        Paint paint3 = c0795ae.f5171g;
        if (paint != null) {
            c0795ae.m1982a(paint);
        }
        if (mo3087h_() && (mo4277w = mo4277w(abstractC0244am)) != null && !mo4277w.equals(VariableScope.nullOrMissingString)) {
            c0795ae.m1973b(mo4277w);
        }
        if (paint != null) {
            c0795ae.m1982a(paint3);
        }
        EnumC0225t mo3090f = mo3090f();
        C0429b mo4078B = mo4078B();
        if (!mo4078B.m3822c() && mo3090f != EnumC0225t.f1477i) {
            c0795ae.m1973b(" (");
            AbstractC0244am abstractC0244am2 = null;
            int i = 0;
            if (paint2 != null) {
                abstractC0244am2 = abstractC0244am;
                i = paint2.m5194e();
            }
            mo4078B.m3837a(c0795ae, false, true, 5, true, abstractC0244am2, i);
            c0795ae.m1973b(")");
        }
        C0429b mo4054r_ = mo4054r_();
        if (mo4054r_ != null && !mo4054r_.m3822c() && mo3090f != EnumC0225t.f1477i) {
            c0795ae.m1973b(" (");
            mo4054r_.m3837a(c0795ae, false, true, 5, true, null, 0);
            c0795ae.m1973b(")");
        }
    }

    /* renamed from: a */
    public void mo4304a(AbstractC0244am abstractC0244am, C0795ae c0795ae) {
        String m2086a = C0775a.m2086a(this, false);
        if (m2086a != null && !VariableScope.nullOrMissingString.equals(m2086a)) {
            c0795ae.m1973b("\n" + m2086a.trim());
        }
        String mo4064e = mo4064e(abstractC0244am);
        if (mo4064e != null && !VariableScope.nullOrMissingString.equals(mo4064e)) {
            c0795ae.m1973b("\n" + mo4064e.trim());
        }
    }

    /* renamed from: c */
    public boolean mo3151c(AbstractC0244am abstractC0244am, boolean z) {
        return false;
    }

    /* renamed from: f */
    public void mo3429f(AbstractC0244am abstractC0244am) {
    }

    /* renamed from: j */
    public C0970e mo3150j() {
        if (mo3090f() == EnumC0225t.f1471c) {
            return GameEngine.getGameEngine().f6330bS.f5406bk;
        }
        return null;
    }

    /* renamed from: h */
    public C0970e mo4062h(AbstractC0244am abstractC0244am) {
        return null;
    }

    /* renamed from: J */
    public int mo4073J() {
        return Color.m5243a(100, 255, 255, 255);
    }

    /* renamed from: v */
    public Rect mo4293v() {
        return null;
    }

    /* renamed from: i */
    public AbstractC0244am mo4061i(AbstractC0244am abstractC0244am) {
        return null;
    }

    /* renamed from: s */
    public boolean mo4053s(AbstractC0244am abstractC0244am) {
        return true;
    }

    /* renamed from: t */
    public boolean mo4052t(AbstractC0244am abstractC0244am) {
        return true;
    }

    /* renamed from: a */
    public boolean mo3152a(AbstractC0244am abstractC0244am) {
        return this.f1465h.mo4081d(abstractC0244am);
    }

    /* renamed from: s */
    public boolean mo4278s() {
        return false;
    }

    /* renamed from: o */
    public boolean mo4296o(AbstractC0244am abstractC0244am) {
        return true;
    }

    /* renamed from: G */
    public boolean mo4282G() {
        return false;
    }

    /* renamed from: c */
    public void mo4299c(AbstractC0244am abstractC0244am) {
    }

    /* renamed from: l */
    public float mo3122l() {
        return 1.0f;
    }

    /* renamed from: m */
    public int mo3121m() {
        return -1;
    }

    /* renamed from: H */
    public boolean mo4075H() {
        return false;
    }

    /* renamed from: I */
    public boolean mo4074I() {
        return false;
    }

    /* renamed from: x */
    public boolean mo4292x() {
        return false;
    }

    /* renamed from: p */
    public float mo4287p(AbstractC0244am abstractC0244am) {
        return -1.0f;
    }

    /* renamed from: q */
    public ArrayList mo4295q(AbstractC0244am abstractC0244am) {
        return null;
    }

    /* renamed from: M */
    public C0645ad mo4310M() {
        return null;
    }

    /* renamed from: o_ */
    public boolean mo4279o_() {
        return false;
    }

    /* renamed from: Q */
    public boolean mo4070Q() {
        return false;
    }

    /* renamed from: a */
    public void mo4067a(AbstractC0629y abstractC0629y) {
    }

    /* renamed from: a */
    public boolean mo3097a(float f, float f2) {
        return false;
    }

    /* renamed from: p */
    public boolean mo3084p() {
        return false;
    }
}