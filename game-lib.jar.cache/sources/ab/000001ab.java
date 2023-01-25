package com.corrodinggames.rts.game.units.p013a;

import com.corrodinggames.rts.game.units.AbstractC0244am;
import com.corrodinggames.rts.game.units.AbstractC0629y;
import com.corrodinggames.rts.game.units.C0560h;
import com.corrodinggames.rts.game.units.InterfaceC0303as;
import com.corrodinggames.rts.gameFramework.AbstractC1155w;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.p037f.C0825g;
import java.util.Iterator;

/* renamed from: com.corrodinggames.rts.game.units.a.p */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/a/p.class */
public abstract class AbstractC0221p extends AbstractC0224s {
    public AbstractC0221p(String str) {
        super("c__cut_" + str);
        this.f1464g = 0.0f;
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
    /* renamed from: b */
    public int mo3093b(AbstractC0244am abstractC0244am, boolean z) {
        return -1;
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
    /* renamed from: c */
    public int mo3092c() {
        return 0;
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
    /* renamed from: i */
    public InterfaceC0303as mo5457i() {
        return null;
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
    /* renamed from: e */
    public EnumC0226u mo3091e() {
        return EnumC0226u.f1487i;
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
    /* renamed from: f */
    public EnumC0225t mo3090f() {
        return EnumC0225t.f1475g;
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
    /* renamed from: g */
    public boolean mo3089g() {
        return false;
    }

    /* renamed from: K */
    public AbstractC0629y m4312K() {
        AbstractC0629y abstractC0629y = null;
        Iterator it = AbstractC1155w.f7177er.iterator();
        while (it.hasNext()) {
            AbstractC1155w abstractC1155w = (AbstractC1155w) it.next();
            if (abstractC1155w instanceof AbstractC0629y) {
                AbstractC0629y abstractC0629y2 = (AbstractC0629y) abstractC1155w;
                if (abstractC0629y2.f1649cG) {
                    abstractC0629y = abstractC0629y2;
                }
            }
        }
        return abstractC0629y;
    }

    /* renamed from: L */
    public boolean m4311L() {
        GameEngine gameEngine = GameEngine.getGameEngine();
        AbstractC0629y m4312K = m4312K();
        if (m4312K != null) {
            return (m4312K instanceof C0560h) || gameEngine.f6312bs == m4312K.f1614bX;
        }
        return false;
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
    /* renamed from: d */
    public String mo3123d() {
        return mo3095b();
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
    /* renamed from: h_ */
    public boolean mo3087h_() {
        return false;
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
    /* renamed from: s */
    public boolean mo4278s() {
        if (!m4311L()) {
            return true;
        }
        return false;
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
    /* renamed from: G */
    public boolean mo4282G() {
        return false;
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
    /* renamed from: l */
    public float mo3122l() {
        if (!C0825g.f5356bP) {
            return 1.0f;
        }
        return 1.0f;
    }
}