package com.corrodinggames.rts.game.units;

import com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope;
import com.corrodinggames.rts.game.units.p013a.AbstractC0229x;
import com.corrodinggames.rts.game.units.p013a.EnumC0225t;
import com.corrodinggames.rts.game.units.p013a.EnumC0226u;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.p037f.C0825g;

/* renamed from: com.corrodinggames.rts.game.units.m */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/m.class */
class C0601m extends AbstractC0229x {

    /* renamed from: a */
    boolean f3888a;

    /* renamed from: b */
    boolean f3889b;

    public C0601m(boolean z, boolean z2) {
        super("changeUnitTab" + z + "d:" + z2);
        this.f3888a = z;
        this.f3889b = z2;
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
    /* renamed from: b */
    public String mo3096b() {
        return mo3124d();
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
    /* renamed from: d */
    public String mo3124d() {
        C0560h m3173L = C0560h.m3173L();
        if (m3173L == null) {
            return "<NULL>";
        }
        if (this.f3889b) {
            return m3173L.f3825G.m3120a();
        }
        String str = VariableScope.nullOrMissingString;
        if (this.f3888a) {
            str = str + "<- ";
        }
        if (!this.f3888a) {
            str = str + " ->";
        }
        return str;
    }

    /* renamed from: n */
    public void m3121n() {
        C0560h m3173L = C0560h.m3173L();
        if (m3173L == null) {
            GameEngine.print("Editor not active");
        } else if (this.f3889b) {
        } else {
            m3173L.f3825G = m3173L.f3825G.m3118a(this.f3888a);
        }
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
    /* renamed from: a */
    public String mo3099a() {
        return "Change unit tab in editor";
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
    /* renamed from: l */
    public float mo3123l() {
        if (!C0825g.f5414bP) {
            return 0.8f;
        }
        return 0.5f;
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
    /* renamed from: m */
    public int mo3122m() {
        if (this.f3889b) {
            return 2;
        }
        return 4;
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0229x, com.corrodinggames.rts.game.units.p013a.AbstractC0224s
    /* renamed from: f */
    public EnumC0225t mo3091f() {
        if (this.f3889b) {
            return EnumC0225t.infoOnly;
        }
        return super.mo3091f();
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0229x, com.corrodinggames.rts.game.units.p013a.AbstractC0224s
    /* renamed from: e */
    public EnumC0226u mo3092e() {
        if (this.f3889b) {
            return EnumC0226u.infoOnly;
        }
        return super.mo3092e();
    }
}