package com.corrodinggames.rts.game.units;

import com.corrodinggames.rts.game.units.p013a.AbstractC0229x;
import com.corrodinggames.rts.game.units.p013a.EnumC0225t;
import com.corrodinggames.rts.game.units.p013a.EnumC0226u;
import com.corrodinggames.rts.gameFramework.p037f.C0825g;

/* renamed from: com.corrodinggames.rts.game.units.j */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/j.class */
class C0598j extends AbstractC0229x {

    /* renamed from: a */
    boolean f3882a;

    /* renamed from: b */
    boolean f3883b;

    public C0598j(boolean z, boolean z2) {
        super("changeModFilter" + z + "d:" + z2);
        this.f3882a = z;
        this.f3883b = z2;
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
    /* renamed from: b */
    public boolean mo3095b(AbstractC0244am abstractC0244am) {
        C0560h m3173L = C0560h.m3173L();
        return m3173L == null || m3173L.f3825G == EnumC0602n.modded;
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
    /* renamed from: b */
    public String mo3096b() {
        if (this.f3883b) {
            C0560h m3173L = C0560h.m3173L();
            if (m3173L != null) {
                if (m3173L.f3823E != null) {
                    return m3173L.f3823E.m1673a();
                }
                return "All mods";
            }
            return "Mod Filter";
        } else if (this.f3882a) {
            return "<- Set mod";
        } else {
            return "Set mod ->";
        }
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
    /* renamed from: d */
    public String mo3124d() {
        if (!this.f3883b) {
            if (this.f3882a) {
                return "<-";
            }
            return "->";
        }
        C0560h m3173L = C0560h.m3173L();
        if (m3173L == null) {
            return "NA";
        }
        if (m3173L.f3823E == null) {
            return "All mods";
        }
        return m3173L.f3823E.m1668b();
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
    /* renamed from: a */
    public String mo3099a() {
        return "Change filtered mod";
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
        if (this.f3883b) {
            return 2;
        }
        return 4;
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0229x, com.corrodinggames.rts.game.units.p013a.AbstractC0224s
    /* renamed from: f */
    public EnumC0225t mo3091f() {
        if (this.f3883b) {
            return EnumC0225t.infoOnly;
        }
        return super.mo3091f();
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0229x, com.corrodinggames.rts.game.units.p013a.AbstractC0224s
    /* renamed from: e */
    public EnumC0226u mo3092e() {
        if (this.f3883b) {
            return EnumC0226u.infoOnly;
        }
        return super.mo3092e();
    }
}