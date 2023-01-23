package com.corrodinggames.rts.gameFramework.f;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/f/as.class */
public class as extends au {

    /* renamed from: a  reason: collision with root package name */
    private boolean f506a;

    public as(float f, float f2, boolean z) {
        super(f, f2);
        this.f506a = z;
    }

    @Override // com.corrodinggames.rts.gameFramework.f.au
    public boolean a(au auVar) {
        return super.a(auVar) && (auVar instanceof as) && ((as) auVar).f506a == this.f506a;
    }

    @Override // com.corrodinggames.rts.gameFramework.f.au
    public void b(au auVar) {
    }

    @Override // com.corrodinggames.rts.gameFramework.f.au
    protected long b() {
        return 20000L;
    }

    @Override // com.corrodinggames.rts.gameFramework.f.au
    public String a() {
        if (this.g == null) {
            if (this.f506a) {
                this.g = com.corrodinggames.rts.gameFramework.h.a.a("gui.log.baseDamaged", new Object[0]);
            } else {
                this.g = com.corrodinggames.rts.gameFramework.h.a.a("gui.log.unitDamaged", new Object[0]);
            }
        }
        return this.g;
    }
}