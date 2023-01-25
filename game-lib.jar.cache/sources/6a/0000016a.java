package com.corrodinggames.rts.game.p010a.p011a;

import android.graphics.PointF;
import com.corrodinggames.rts.game.p010a.C0136a;
import com.corrodinggames.rts.game.p010a.C0161f;
import com.corrodinggames.rts.game.units.AbstractC0244am;
import com.corrodinggames.rts.game.units.AbstractC0629y;
import com.corrodinggames.rts.game.units.custom.C0453g;
import com.corrodinggames.rts.game.units.custom.p016a.EnumC0340e;
import com.corrodinggames.rts.game.units.p013a.AbstractC0224s;
import com.corrodinggames.rts.game.units.p024d.InterfaceC0506l;

/* renamed from: com.corrodinggames.rts.game.a.a.d */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/a/a/d.class */
public class C0156d extends AbstractC0155c {

    /* renamed from: b */
    public final boolean f642b = true;

    /* renamed from: c */
    static final C0453g f643c = C0453g.m3677c("nukeLauncher");

    @Override // com.corrodinggames.rts.game.p010a.p011a.AbstractC0150a
    /* renamed from: a */
    public EnumC0152b mo4801a() {
        return EnumC0152b.nuking;
    }

    @Override // com.corrodinggames.rts.game.p010a.p011a.AbstractC0155c
    /* renamed from: c */
    public boolean mo4798c(C0136a c0136a, AbstractC0629y abstractC0629y) {
        return m4800a(abstractC0629y);
    }

    /* renamed from: d */
    public PointF m4797d(C0136a c0136a, AbstractC0629y abstractC0629y) {
        return c0136a.m4837at();
    }

    /* renamed from: e */
    public void m4796e(C0136a c0136a, AbstractC0629y abstractC0629y) {
        AbstractC0224s m4779a = C0161f.m4779a(c0136a, abstractC0629y, EnumC0340e.launch);
        if (m4779a != null) {
            if (m4779a.mo3094b(abstractC0629y) && m4779a.mo3096a((AbstractC0244am) abstractC0629y, false)) {
                PointF m4797d = m4797d(c0136a, abstractC0629y);
                if (m4797d != null) {
                    c0136a.m4395c("nuke: launching at:" + m4797d.x + ", " + m4797d.y);
                    c0136a.m4856a(abstractC0629y, m4779a, m4797d, (AbstractC0244am) null);
                    return;
                }
                c0136a.m4395c("nuke: no target");
                return;
            }
            c0136a.m4395c("nuke: not ready");
        }
    }

    /* renamed from: f */
    public void m4795f(C0136a c0136a, AbstractC0629y abstractC0629y) {
        AbstractC0224s m4779a;
        if ((abstractC0629y instanceof InterfaceC0506l) && ((InterfaceC0506l) abstractC0629y).mo3331dy() && (m4779a = C0161f.m4779a(c0136a, abstractC0629y, EnumC0340e.launchAmmo)) != null && c0136a.m4861a(m4779a.mo4078B(), abstractC0629y)) {
            c0136a.m4395c("ai nuke building");
            c0136a.m4857a(abstractC0629y, m4779a);
        }
    }

    /* renamed from: a */
    public boolean m4800a(AbstractC0629y abstractC0629y) {
        if (C0161f.m4777a(abstractC0629y, f643c)) {
            return true;
        }
        return false;
    }

    @Override // com.corrodinggames.rts.game.p010a.p011a.AbstractC0150a
    /* renamed from: b */
    public void mo4799b(float f, C0136a c0136a) {
        AbstractC0244am[] m499a = this.f641a.m499a();
        int size = this.f641a.size();
        for (int i = 0; i < size; i++) {
            AbstractC0629y abstractC0629y = (AbstractC0629y) m499a[i];
            m4795f(c0136a, abstractC0629y);
            m4796e(c0136a, abstractC0629y);
        }
    }
}