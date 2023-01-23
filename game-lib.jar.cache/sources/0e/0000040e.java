package com.corrodinggames.rts.game.units;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/q.class */
public class q extends com.corrodinggames.rts.game.units.a.s {

    /* renamed from: a  reason: collision with root package name */
    r f386a;

    public q(r rVar) {
        super("SetTerrainType" + rVar.ordinal());
        this.f386a = rVar;
    }

    @Override // com.corrodinggames.rts.game.units.a.s
    public boolean b(am amVar) {
        h L = h.L();
        return L == null || L.G == n.terrain;
    }

    @Override // com.corrodinggames.rts.game.units.a.s
    public String a() {
        return "Set terrain type to: " + this.f386a.name();
    }

    @Override // com.corrodinggames.rts.game.units.a.s
    public String b() {
        return "Set " + this.f386a.name();
    }

    @Override // com.corrodinggames.rts.game.units.a.s
    public boolean h_() {
        return false;
    }

    @Override // com.corrodinggames.rts.game.units.a.s
    public int c() {
        return 0;
    }

    @Override // com.corrodinggames.rts.game.units.a.s
    public int b(am amVar, boolean z) {
        return -1;
    }

    @Override // com.corrodinggames.rts.game.units.a.s
    /* renamed from: n */
    public ar i() {
        return null;
    }

    @Override // com.corrodinggames.rts.game.units.a.s
    public com.corrodinggames.rts.game.units.a.u e() {
        return com.corrodinggames.rts.game.units.a.u.targetGround;
    }

    @Override // com.corrodinggames.rts.game.units.a.s
    public com.corrodinggames.rts.game.units.a.t f() {
        return com.corrodinggames.rts.game.units.a.t.action;
    }

    @Override // com.corrodinggames.rts.game.units.a.s
    public boolean g() {
        return false;
    }

    @Override // com.corrodinggames.rts.game.units.a.s
    public boolean a(am amVar, boolean z) {
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.a.s
    public boolean h() {
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.a.s
    public boolean o() {
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.a.s
    public boolean a(float f, float f2) {
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.a.s
    public boolean p() {
        return true;
    }
}