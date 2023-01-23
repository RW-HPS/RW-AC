package com.corrodinggames.rts.gameFramework.f;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/f/ar.class */
public class ar extends au {

    /* renamed from: a  reason: collision with root package name */
    com.corrodinggames.rts.game.units.as f505a;
    int b;

    public ar(float f, float f2, com.corrodinggames.rts.game.units.as asVar) {
        super(f, f2);
        this.f505a = asVar;
        this.b = 1;
    }

    @Override // com.corrodinggames.rts.gameFramework.f.au
    public boolean a(au auVar) {
        return super.a(auVar) && (auVar instanceof ar) && ((ar) auVar).f505a == this.f505a;
    }

    @Override // com.corrodinggames.rts.gameFramework.f.au
    public void b(au auVar) {
        this.c = auVar.c;
        this.b++;
        this.g = null;
        this.h = false;
    }

    @Override // com.corrodinggames.rts.gameFramework.f.au
    public String a() {
        if (this.g == null) {
            String str = "gui.log.unitCreated";
            if (this.f505a.j()) {
                str = "gui.log.buildingConstructed";
            }
            this.g = String.format(com.corrodinggames.rts.gameFramework.h.a.a(str, new Object[0]), this.f505a.e(), Integer.valueOf(this.b));
        }
        return this.g;
    }
}