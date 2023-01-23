package com.corrodinggames.rts.game.units;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/l.class */
public class l extends com.corrodinggames.rts.game.units.a.x {

    /* renamed from: a  reason: collision with root package name */
    boolean f381a;
    boolean b;

    public l(boolean z, boolean z2) {
        super("changeTypeFilter" + z + "d:" + z2);
        this.f381a = z;
        this.b = z2;
    }

    @Override // com.corrodinggames.rts.game.units.a.s
    public boolean b(am amVar) {
        h L = h.L();
        return L == null || L.G == n.types;
    }

    @Override // com.corrodinggames.rts.game.units.a.s
    public String b() {
        if (this.b) {
            h L = h.L();
            if (L != null) {
                if (L.F != null) {
                    return L.F.a();
                }
                return "All types";
            }
            return "Type Filter";
        } else if (this.f381a) {
            return "<- Set type";
        } else {
            return "Set type ->";
        }
    }

    @Override // com.corrodinggames.rts.game.units.a.s
    public String d() {
        if (!this.b) {
            if (this.f381a) {
                return "<-";
            }
            return "->";
        }
        h L = h.L();
        if (L == null) {
            return "NA";
        }
        if (L.F == null) {
            return "All mods";
        }
        return L.F.a();
    }

    @Override // com.corrodinggames.rts.game.units.a.s
    public String a() {
        return "Change filtered type";
    }

    @Override // com.corrodinggames.rts.game.units.a.s
    public float l() {
        if (!com.corrodinggames.rts.gameFramework.f.g.bP) {
            return 0.8f;
        }
        return 0.5f;
    }

    @Override // com.corrodinggames.rts.game.units.a.s
    public int m() {
        if (this.b) {
            return 2;
        }
        return 4;
    }

    @Override // com.corrodinggames.rts.game.units.a.x, com.corrodinggames.rts.game.units.a.s
    public com.corrodinggames.rts.game.units.a.t f() {
        if (this.b) {
            return com.corrodinggames.rts.game.units.a.t.infoOnly;
        }
        return super.f();
    }

    @Override // com.corrodinggames.rts.game.units.a.x, com.corrodinggames.rts.game.units.a.s
    public com.corrodinggames.rts.game.units.a.u e() {
        if (this.b) {
            return com.corrodinggames.rts.game.units.a.u.infoOnly;
        }
        return super.e();
    }
}