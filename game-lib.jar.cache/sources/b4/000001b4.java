package com.corrodinggames.rts.game.units.p013a;

import com.corrodinggames.rts.game.units.AbstractC0244am;
import com.corrodinggames.rts.game.units.AbstractC0629y;
import com.corrodinggames.rts.game.units.C0560h;
import com.corrodinggames.rts.game.units.InterfaceC0303as;
import com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.net.Unknown_GameOutBlockStream;
import com.corrodinggames.rts.gameFramework.p037f.C0775a;
import java.io.IOException;

/* renamed from: com.corrodinggames.rts.game.units.a.y */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/a/y.class */
public class C0230y extends AbstractC0224s {

    /* renamed from: a */
    public boolean f1495a;

    public C0230y(boolean z) {
        super("c_5");
        this.f1464g = -9990.0f;
        this.f1495a = z;
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
    public AbstractC0629y m4285K() {
        GameEngine gameEngine = GameEngine.getGameEngine();
        AbstractC0244am[] m499a = gameEngine.f6330bS.f5427bZ.m499a();
        int size = gameEngine.f6330bS.f5427bZ.size();
        for (int i = 0; i < size; i++) {
            AbstractC0244am abstractC0244am = m499a[i];
            if (abstractC0244am instanceof AbstractC0629y) {
                AbstractC0629y abstractC0629y = (AbstractC0629y) abstractC0244am;
                if (abstractC0629y.f1649cG) {
                    return abstractC0629y;
                }
            }
        }
        return null;
    }

    /* renamed from: L */
    public boolean m4284L() {
        GameEngine gameEngine = GameEngine.getGameEngine();
        AbstractC0629y m4285K = m4285K();
        if (m4285K != null) {
            return (m4285K instanceof C0560h) || gameEngine.f6312bs == m4285K.f1614bX;
        }
        return false;
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
    /* renamed from: d */
    public String mo3123d() {
        String str = "UnitInfo";
        GameEngine gameEngine = GameEngine.getGameEngine();
        AbstractC0629y m4285K = m4285K();
        if (m4285K != null) {
            if (m4285K instanceof C0560h) {
                return "Editor";
            }
            if (!this.f1495a) {
                str = gameEngine.f6330bS.f5263g.m2083a((AbstractC0244am) m4285K, false);
            } else {
                str = gameEngine.f6330bS.f5263g.m2090a(m4285K.f1614bX);
            }
        }
        return str;
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
    /* renamed from: h_ */
    public boolean mo3087h_() {
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
    /* renamed from: b */
    public String mo3095b() {
        return "UnitInfo";
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
    /* renamed from: d */
    public String mo4066d(AbstractC0244am abstractC0244am) {
        if (this.f1495a) {
            return VariableScope.nullOrMissingString;
        }
        if (abstractC0244am != null) {
            return abstractC0244am.mo5458r().mo3521e();
        }
        return "UnitInfo";
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
    /* renamed from: s */
    public boolean mo4278s() {
        if (!this.f1495a || !m4284L()) {
            return true;
        }
        return false;
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
    /* renamed from: u */
    public boolean mo4051u() {
        if (this.f1495a) {
            return false;
        }
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
    /* renamed from: C */
    public boolean mo4283C() {
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
    /* renamed from: a */
    public String mo3098a() {
        Unknown_GameOutBlockStream unknown_GameOutBlockStream;
        if (this.f1495a) {
            return VariableScope.nullOrMissingString;
        }
        AbstractC0629y m4285K = m4285K();
        if (m4285K != null) {
            String m2082a = C0775a.m2082a(m4285K, false, true, false);
            if (0 != 0) {
                try {
                    m4285K.mo442a(new Unknown_GameOutBlockStream());
                } catch (IOException e) {
                    e.printStackTrace();
                }
                m2082a = m2082a + "\n" + unknown_GameOutBlockStream.f6037a;
            }
            return m2082a;
        }
        return VariableScope.nullOrMissingString;
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
    /* renamed from: G */
    public boolean mo4282G() {
        return true;
    }
}