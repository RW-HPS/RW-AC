package com.corrodinggames.rts.game.units.custom.p016a;

import com.corrodinggames.rts.game.PlayerData;
import com.corrodinggames.rts.game.units.AbstractC0244am;
import com.corrodinggames.rts.game.units.AbstractC0629y;
import com.corrodinggames.rts.game.units.InterfaceC0303as;
import com.corrodinggames.rts.game.units.custom.C0454h;
import com.corrodinggames.rts.game.units.custom.C0456j;
import com.corrodinggames.rts.game.units.custom.C0469v;
import com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope;
import com.corrodinggames.rts.game.units.custom.p020d.C0429b;
import com.corrodinggames.rts.game.units.p013a.AbstractC0228w;
import com.corrodinggames.rts.game.units.p013a.EnumC0225t;
import com.corrodinggames.rts.game.units.p013a.EnumC0226u;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.p037f.C0775a;
import com.corrodinggames.rts.gameFramework.p037f.C0810an;
import com.corrodinggames.rts.gameFramework.unitAction.C0970e;

/* renamed from: com.corrodinggames.rts.game.units.custom.a.g */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/a/g.class */
public class C0342g extends AbstractC0228w {

    /* renamed from: a */
    public C0339d f2162a;

    /* renamed from: b */
    public C0469v f2163b;

    /* renamed from: c */
    public EnumC0340e f2164c;

    public C0342g(C0339d c0339d, C0469v c0469v) {
        super((String) null);
        this.f2164c = EnumC0340e.disabled;
        String str = VariableScope.nullOrMissingString;
        m4302a(c0339d.f2059b != null ? c0339d.f2059b : (c0339d.f2068k != null ? str + c0339d.f2068k : str) + "_" + c0339d.f2058a);
        this.f2162a = c0339d;
        this.f2163b = c0469v;
        if (c0339d.f2093J != null) {
            this.f2163b = c0339d.f2093J;
        }
        this.f2164c = c0339d.f2149aN;
        if (this.f2164c == EnumC0340e.auto) {
            boolean z = false;
            boolean z2 = false;
            if (c0339d.f2116ag != null && c0339d.f2117ah == null) {
                z2 = true;
            }
            if (c0339d.f2074q.m3817d()) {
                z = true;
                this.f2164c = EnumC0340e.upgrade;
            }
            if (z && !z2) {
                this.f2164c = EnumC0340e.upgrade;
            } else {
                this.f2164c = EnumC0340e.movementChange;
            }
            if (c0339d.f2092I != null) {
                this.f2164c = EnumC0340e.sameAsBuilding;
            }
        }
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
    /* renamed from: P */
    public C0454h mo4071P() {
        return this.f2162a.f2076s;
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
    /* renamed from: F */
    public boolean mo4076F() {
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
    /* renamed from: d */
    public boolean mo4065d(AbstractC0244am abstractC0244am, boolean z) {
        return this.f2162a.f2096M;
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
    /* renamed from: k */
    public boolean mo4059k(AbstractC0244am abstractC0244am) {
        return this.f2162a.f2098O;
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
    /* renamed from: l */
    public boolean mo4058l(AbstractC0244am abstractC0244am) {
        return this.f2162a.f2099P;
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0228w, com.corrodinggames.rts.game.units.p013a.AbstractC0224s
    /* renamed from: u */
    public boolean mo4051u() {
        return super.mo4051u();
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
    /* renamed from: a */
    public boolean mo3096a(AbstractC0244am abstractC0244am, boolean z) {
        C0456j c0456j = (C0456j) abstractC0244am;
        if (!this.f2162a.f2097N && c0456j.mo3337a(m4309N(), z) > 0) {
            return false;
        }
        if (this.f2162a.f2078u != null) {
            if (z && mo4070Q()) {
                if (!C0810an.m1952a(this.f2162a.f2078u, c0456j)) {
                    return false;
                }
            } else if (!this.f2162a.f2078u.read(c0456j)) {
                return false;
            }
        }
        return super.mo3096a(abstractC0244am, z);
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
    /* renamed from: g */
    public boolean mo4063g(AbstractC0244am abstractC0244am) {
        if (m4069a(abstractC0244am, -1)) {
            return true;
        }
        return super.mo4063g(abstractC0244am);
    }

    /* renamed from: a */
    public boolean m4069a(AbstractC0244am abstractC0244am, int i) {
        if (this.f2162a.f2083z != null && (i == -1 || i == 1)) {
            if (!(abstractC0244am instanceof C0456j)) {
                GameEngine.m976n("CustomActionConfig lockedInGame:" + abstractC0244am.mo5458r().mo3513i() + " is not a custom unit");
                return false;
            } else if (this.f2162a.f2083z.read((C0456j) abstractC0244am)) {
                return true;
            }
        }
        if (this.f2162a.f2085B != null && (i == -1 || i == 2)) {
            if (!(abstractC0244am instanceof C0456j)) {
                GameEngine.m976n("CustomActionConfig lockedInGame:" + abstractC0244am.mo5458r().mo3513i() + " is not a custom unit");
                return false;
            } else if (this.f2162a.f2085B.read((C0456j) abstractC0244am)) {
                return true;
            }
        }
        if (this.f2162a.f2087D != null) {
            if (i == -1 || i == 3) {
                if (!(abstractC0244am instanceof C0456j)) {
                    GameEngine.m976n("CustomActionConfig lockedInGame:" + abstractC0244am.mo5458r().mo3513i() + " is not a custom unit");
                    return false;
                } else if (this.f2162a.f2087D.read((C0456j) abstractC0244am)) {
                    return true;
                } else {
                    return false;
                }
            }
            return false;
        }
        return false;
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
    /* renamed from: j */
    public String mo4060j(AbstractC0244am abstractC0244am) {
        if (m4069a(abstractC0244am, 1) && this.f2162a.f2084A != null) {
            return this.f2162a.f2084A.m3982b(abstractC0244am);
        }
        if (m4069a(abstractC0244am, 2) && this.f2162a.f2086C != null) {
            return this.f2162a.f2086C.m3982b(abstractC0244am);
        }
        if (m4069a(abstractC0244am, 3) && this.f2162a.f2088E != null) {
            return this.f2162a.f2088E.m3982b(abstractC0244am);
        }
        return super.mo4060j(abstractC0244am);
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
    /* renamed from: r */
    public boolean mo4055r(AbstractC0244am abstractC0244am) {
        C0456j c0456j = (C0456j) abstractC0244am;
        if (this.f2162a.f2079v != null) {
            if (mo4070Q()) {
                return C0810an.m1952a(this.f2162a.f2079v, c0456j);
            }
            return this.f2162a.f2079v.read(c0456j);
        }
        return super.mo3094b(abstractC0244am);
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
    /* renamed from: b */
    public boolean mo3094b(AbstractC0244am abstractC0244am) {
        C0456j c0456j = (C0456j) abstractC0244am;
        if (this.f2162a.f2079v != null) {
            return this.f2162a.f2079v.read(c0456j);
        }
        return super.mo3094b(abstractC0244am);
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
    /* renamed from: a */
    public boolean mo4068a(AbstractC0244am abstractC0244am, PlayerData playerData) {
        if (!this.f2162a.f2080w && !this.f2162a.f2081x) {
            return false;
        }
        if (abstractC0244am.f1614bX.m4390d(playerData)) {
            return this.f2162a.f2080w;
        }
        return this.f2162a.f2081x;
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
    /* renamed from: r_ */
    public C0429b mo4054r_() {
        C0429b mo4084b = this.f1465h.mo4084b();
        if (mo4084b != null) {
            return mo4084b;
        }
        return this.f2162a.f2075r;
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0228w, com.corrodinggames.rts.game.units.p013a.AbstractC0224s
    /* renamed from: b */
    public int mo3093b(AbstractC0244am abstractC0244am, boolean z) {
        if (this.f2162a.f2144aI) {
            return this.f2162a.f2074q.m3845a(abstractC0244am, true);
        }
        return super.mo3093b(abstractC0244am, z);
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
    /* renamed from: d */
    public String mo3123d() {
        return super.mo3123d();
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
    /* renamed from: b */
    public String mo3095b() {
        String str = null;
        if (this.f2162a.f2061d != null) {
            str = this.f2162a.f2061d.m3983b();
        }
        return str;
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
    /* renamed from: d */
    public String mo4066d(AbstractC0244am abstractC0244am) {
        InterfaceC0303as typeOrNull;
        String str = null;
        if (this.f2162a.f2061d != null) {
            str = this.f2162a.f2061d.m3982b(abstractC0244am);
        }
        if (this.f2162a.f2062e != null && (typeOrNull = this.f2162a.f2062e.getTypeOrNull(abstractC0244am)) != null) {
            if (str == null) {
                str = VariableScope.nullOrMissingString;
            } else if (!str.equals(VariableScope.nullOrMissingString)) {
                str = str + " ";
            }
            str = str + typeOrNull.mo3521e();
        }
        if (this.f2162a.f2065h != null) {
            if (str == null) {
                str = VariableScope.nullOrMissingString;
            } else if (!str.equals(VariableScope.nullOrMissingString)) {
                str = str + " ";
            }
            str = str + this.f2162a.f2065h.m3910b();
        }
        return str;
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
    /* renamed from: a */
    public String mo3098a() {
        String str = null;
        if (this.f2162a.f2066i != null) {
            str = this.f2162a.f2066i.m3983b();
        }
        return str;
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
    /* renamed from: e */
    public String mo4064e(AbstractC0244am abstractC0244am) {
        AbstractC0244am unitReferenceOrNull;
        AbstractC0244am unitOrSharedUnit;
        InterfaceC0303as typeOrNull;
        String str = null;
        if (this.f2162a.f2066i != null) {
            str = this.f2162a.f2066i.m3982b(abstractC0244am);
        }
        if (this.f2162a.f2063f != null && (typeOrNull = this.f2162a.f2063f.getTypeOrNull(abstractC0244am)) != null) {
            if (str == null) {
                str = VariableScope.nullOrMissingString;
            } else if (!str.equals(VariableScope.nullOrMissingString)) {
                str = str + " ";
            }
            str = str + typeOrNull.mo3519f();
        }
        if (this.f2162a.f2064g != null) {
            if (this.f2162a.f2064g.getUnitReferenceOrNull(abstractC0244am) != null) {
                if (str == null) {
                    str = VariableScope.nullOrMissingString;
                } else if (!str.equals(VariableScope.nullOrMissingString)) {
                    str = str + "\n\n";
                }
                str = str + C0775a.m2082a(unitReferenceOrNull, false, false, false);
            } else {
                if (this.f2162a.f2064g.getUnitOrSharedUnit(abstractC0244am) != null) {
                    if (str == null) {
                        str = VariableScope.nullOrMissingString;
                    } else if (!str.equals(VariableScope.nullOrMissingString)) {
                        str = str + "\n\n";
                    }
                    str = str + C0775a.m2082a(unitOrSharedUnit, false, false, true);
                }
            }
        }
        return str;
    }

    /* renamed from: L */
    public boolean m4072L() {
        return this.f2162a.f2104U;
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0228w
    /* renamed from: K */
    public float mo3291K() {
        if (this.f2162a.f2102S >= 1.0f) {
            return 1000.0f;
        }
        return this.f2162a.f2102S;
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0228w, com.corrodinggames.rts.game.units.p013a.AbstractC0224s
    /* renamed from: e */
    public EnumC0226u mo3091e() {
        return this.f2162a.f2067j;
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
    /* renamed from: B */
    public C0429b mo4078B() {
        C0429b mo4091a = this.f1465h.mo4091a();
        if (mo4091a != null) {
            return mo4091a;
        }
        return this.f2162a.f2074q;
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
    /* renamed from: c */
    public int mo3092c() {
        return mo4078B().m3852a();
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
    /* renamed from: i */
    public InterfaceC0303as mo5457i() {
        if (this.f2163b == null) {
            return null;
        }
        return this.f2163b.mo3471c();
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
    /* renamed from: y */
    public InterfaceC0303as mo4049y() {
        if (this.f2162a.f2093J != null) {
            return this.f2162a.f2093J.mo3471c();
        }
        return null;
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
    /* renamed from: E */
    public InterfaceC0303as mo4077E() {
        if (this.f2162a.f2092I != null) {
            return this.f2162a.f2092I.mo3471c();
        }
        return null;
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
    /* renamed from: A */
    public boolean mo4079A() {
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
    /* renamed from: g */
    public boolean mo3089g() {
        if (this.f2162a.f2093J != null) {
            return true;
        }
        return false;
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
    /* renamed from: f */
    public EnumC0225t mo3090f() {
        return this.f2162a.f2142aG;
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
    /* renamed from: m */
    public boolean mo4057m(AbstractC0244am abstractC0244am) {
        return this.f2162a.f2090G.read((C0456j) abstractC0244am);
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
    /* renamed from: n */
    public boolean mo4056n(AbstractC0244am abstractC0244am) {
        if (this.f2162a.f2089F == null) {
            return false;
        }
        if (!(abstractC0244am instanceof C0456j)) {
            GameEngine.print("ai_isHighPriority non customUnit:" + abstractC0244am.mo5458r().mo3513i());
            return false;
        }
        return this.f2162a.f2089F.read((C0456j) abstractC0244am);
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
    /* renamed from: v */
    public EnumC0340e mo4050v(AbstractC0244am abstractC0244am) {
        return this.f2164c;
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
    /* renamed from: H */
    public boolean mo4075H() {
        return this.f2162a.f2094K;
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
    /* renamed from: I */
    public boolean mo4074I() {
        return this.f2162a.f2095L;
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
    /* renamed from: j */
    public C0970e mo3150j() {
        return this.f2162a.f2134ay;
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
    /* renamed from: h */
    public C0970e mo4062h(AbstractC0244am abstractC0244am) {
        if (this.f2162a.f2137aB != null && (abstractC0244am instanceof C0456j) && !C0810an.m1952a(this.f2162a.f2137aB, (C0456j) abstractC0244am)) {
            return null;
        }
        return this.f2162a.f2135az;
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
    /* renamed from: J */
    public int mo4073J() {
        return this.f2162a.f2136aA;
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
    /* renamed from: i */
    public AbstractC0244am mo4061i(AbstractC0244am abstractC0244am) {
        if (this.f2162a.f2138aC != null) {
            return this.f2162a.f2138aC.getUnitOrSharedUnit(abstractC0244am);
        }
        return null;
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
    /* renamed from: s */
    public boolean mo4053s(AbstractC0244am abstractC0244am) {
        return this.f2162a.f2139aD;
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
    /* renamed from: t */
    public boolean mo4052t(AbstractC0244am abstractC0244am) {
        return this.f2162a.f2140aE;
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
    /* renamed from: a */
    public boolean mo3152a(AbstractC0244am abstractC0244am) {
        if (this.f2162a.f2141aF != null) {
            return C0810an.m1952a(this.f2162a.f2141aF, (C0456j) abstractC0244am);
        }
        return false;
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
    /* renamed from: Q */
    public boolean mo4070Q() {
        return this.f2162a.f2072o;
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
    /* renamed from: a */
    public void mo4067a(AbstractC0629y abstractC0629y) {
        if (this.f2162a.f2114ae != null) {
            C0810an.m1950b(abstractC0629y, this.f2162a.f2114ae);
        }
    }
}