package com.corrodinggames.rts.game.units.custom;

/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/b.class */
class b extends a {
    public z e;
    public float f;
    public float g;
    public boolean h;

    public b(float f, float f2) {
        super(f, f2);
    }

    public void a(l lVar, String str, String str2) {
        try {
            if (str.equalsIgnoreCase("x")) {
                this.f = Float.parseFloat(str2);
            } else if (str.equalsIgnoreCase("y")) {
                this.g = Float.parseFloat(str2);
            } else if (str.equalsIgnoreCase("name")) {
                this.e = lVar.a(str2, (z) null);
            } else {
                throw new bo("Unknown event key:" + str + " on animation");
            }
        } catch (NumberFormatException e) {
            throw new bo("Failed to parse float:" + str2);
        }
    }

    public void finalize() {
        this.h = true;
        if (this.e == null) {
            throw new bo("Animation effect missing key 'name'");
        }
    }

    public void a(j jVar) {
        if (this.e != null) {
            float f = jVar.eo;
            float f2 = jVar.ep;
            this.e.a(f + this.f, f2 + this.g, jVar.eq, jVar.cg, jVar);
        }
    }
}