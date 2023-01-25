package com.corrodinggames.rts.game.units;

import com.corrodinggames.rts.game.units.p013a.AbstractC0229x;
import com.corrodinggames.rts.game.units.p013a.EnumC0225t;
import com.corrodinggames.rts.game.units.p013a.EnumC0226u;
import com.corrodinggames.rts.gameFramework.p037f.C0825g;

/* renamed from: com.corrodinggames.rts.game.units.l */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/l.class */
class C0600l extends AbstractC0229x {

    /* renamed from: a */
    boolean f3886a;

    /* renamed from: b */
    boolean f3887b;

    public C0600l(boolean z, boolean z2) {
        super("changeTypeFilter" + z + "d:" + z2);
        this.f3886a = z;
        this.f3887b = z2;
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
    /* renamed from: b */
    public boolean mo3095b(AbstractC0244am abstractC0244am) {
        C0560h m3173L = C0560h.m3173L();
        return m3173L == null || m3173L.f3825G == EnumC0602n.types;
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
    /* renamed from: b */
    public String mo3096b() {
        if (this.f3887b) {
            C0560h m3173L = C0560h.m3173L();
            if (m3173L != null) {
                if (m3173L.f3824F != null) {
                    return m3173L.f3824F.m3115a();
                }
                return "All types";
            }
            return "Type Filter";
        } else if (this.f3886a) {
            return "<- Set type";
        } else {
            return "Set type ->";
        }
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
    /* renamed from: d */
    public String mo3124d() {
        if (!this.f3887b) {
            if (this.f3886a) {
                return "<-";
            }
            return "->";
        }
        C0560h m3173L = C0560h.m3173L();
        if (m3173L == null) {
            return "NA";
        }
        if (m3173L.f3824F == null) {
            return "All mods";
        }
        return m3173L.f3824F.m3115a();
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
    /* renamed from: a */
    public String mo3099a() {
        return "Change filtered type";
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
        if (this.f3887b) {
            return 2;
        }
        return 4;
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0229x, com.corrodinggames.rts.game.units.p013a.AbstractC0224s
    /* renamed from: f */
    public EnumC0225t mo3091f() {
        if (this.f3887b) {
            return EnumC0225t.infoOnly;
        }
        return super.mo3091f();
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0229x, com.corrodinggames.rts.game.units.p013a.AbstractC0224s
    /* renamed from: e */
    public EnumC0226u mo3092e() {
        if (this.f3887b) {
            return EnumC0226u.infoOnly;
        }
        return super.mo3092e();
    }
}