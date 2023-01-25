package com.corrodinggames.rts.game.units.p013a;

import com.corrodinggames.rts.game.units.AbstractC0244am;
import com.corrodinggames.rts.game.units.AbstractC0629y;
import com.corrodinggames.rts.game.units.C0560h;
import com.corrodinggames.rts.game.units.InterfaceC0303as;
import com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.p037f.C0825g;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: com.corrodinggames.rts.game.units.a.z */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/a/z.class */
public class C0231z extends AbstractC0224s {

    /* renamed from: a */
    InterfaceC0303as f1496a;

    /* renamed from: b */
    ArrayList f1497b;

    /* renamed from: c */
    int f1498c;

    /* renamed from: d */
    boolean f1499d;

    /* renamed from: e */
    AbstractC0629y f1500e;

    /* renamed from: f */
    int f1501f;

    public C0231z(InterfaceC0303as interfaceC0303as) {
        super("s_" + interfaceC0303as.mo3489v());
        this.f1497b = new ArrayList();
        this.f1498c = 0;
        this.f1500e = null;
        this.f1464g = -9999.0f;
        this.f1496a = interfaceC0303as;
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
    /* renamed from: b */
    public int mo3094b(AbstractC0244am abstractC0244am, boolean z) {
        return -1;
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
    /* renamed from: c */
    public int mo3093c() {
        return 0;
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
    /* renamed from: i */
    public InterfaceC0303as mo3087i() {
        return this.f1496a;
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
    /* renamed from: e */
    public EnumC0226u mo3092e() {
        return EnumC0226u.infoOnly;
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
    /* renamed from: f */
    public EnumC0225t mo3091f() {
        if (GameEngine.m1030at() && !C0825g.f5413bO) {
            return EnumC0225t.infoOnlyNoBox;
        }
        return EnumC0225t.infoOnly;
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
    /* renamed from: g */
    public boolean mo3090g() {
        return false;
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
    /* renamed from: c */
    public boolean mo3152c(AbstractC0244am abstractC0244am, boolean z) {
        GameEngine gameEngine = GameEngine.getGameEngine();
        if (!z) {
            if (gameEngine.f6378bS.m1799q() == 1) {
                return false;
            }
            boolean z2 = false;
            Iterator it = AbstractC0244am.f1594bE.iterator();
            while (it.hasNext()) {
                AbstractC0244am abstractC0244am2 = (AbstractC0244am) it.next();
                if (abstractC0244am2.f1649cG && abstractC0244am2.mo1747r() != this.f1496a) {
                    gameEngine.f6378bS.m1808l(abstractC0244am2);
                    z2 = true;
                }
            }
            if (!z2) {
                return false;
            }
            return true;
        }
        Iterator it2 = AbstractC0244am.f1594bE.iterator();
        while (it2.hasNext()) {
            AbstractC0244am abstractC0244am3 = (AbstractC0244am) it2.next();
            if (abstractC0244am3.f1649cG && abstractC0244am3.mo1747r() == this.f1496a) {
                gameEngine.f6378bS.m1808l(abstractC0244am3);
            }
        }
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
    /* renamed from: d */
    public String mo3124d() {
        GameEngine.getGameEngine();
        if (this.f1500e instanceof C0560h) {
            return "Editor";
        }
        return VariableScope.nullOrMissingString + this.f1496a.mo3521e() + " x" + this.f1498c;
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
    /* renamed from: b */
    public String mo3096b() {
        return "UnitInfo";
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
    /* renamed from: w */
    public String mo4277w(AbstractC0244am abstractC0244am) {
        if (this.f1500e instanceof C0560h) {
            return "Editor";
        }
        return this.f1496a.mo3521e();
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
    /* renamed from: h_ */
    public boolean mo3088h_() {
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
    /* renamed from: s */
    public boolean mo4278s() {
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
    /* renamed from: u */
    public boolean mo4051u() {
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
    /* renamed from: C */
    public boolean mo4283C() {
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
    /* renamed from: a */
    public String mo3099a() {
        String str = VariableScope.nullOrMissingString;
        if (this.f1500e instanceof C0560h) {
            return VariableScope.nullOrMissingString;
        }
        if (this.f1499d) {
            str = "(Left click to exclusively select / Right click to unselect)\n";
        }
        return str + this.f1496a.mo3519f();
    }

    /* renamed from: K */
    public void m4281K() {
        GameEngine gameEngine = GameEngine.getGameEngine();
        if (this.f1501f == gameEngine.f6378bS.f5312Y) {
            return;
        }
        this.f1501f = gameEngine.f6378bS.f5312Y;
        this.f1498c = 0;
        this.f1499d = false;
        this.f1500e = null;
        AbstractC0244am[] m499a = gameEngine.f6378bS.f5424bZ.m499a();
        int size = gameEngine.f6378bS.f5424bZ.size();
        for (int i = 0; i < size; i++) {
            AbstractC0244am abstractC0244am = m499a[i];
            if (abstractC0244am instanceof AbstractC0629y) {
                AbstractC0629y abstractC0629y = (AbstractC0629y) abstractC0244am;
                if (abstractC0629y.f1649cG) {
                    if (abstractC0629y.mo1747r() == this.f1496a) {
                        this.f1498c++;
                        if (this.f1500e == null) {
                            this.f1500e = abstractC0629y;
                        }
                    } else {
                        this.f1499d = true;
                    }
                }
            }
        }
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
    /* renamed from: m_ */
    public float mo4280m_() {
        return this.f1464g - this.f1498c;
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
    /* renamed from: G */
    public boolean mo4282G() {
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
    /* renamed from: o_ */
    public boolean mo4279o_() {
        return true;
    }
}