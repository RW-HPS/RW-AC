package com.corrodinggames.rts.game.units.custom.p016a;

import com.corrodinggames.rts.game.units.AbstractC0244am;
import com.corrodinggames.rts.game.units.custom.p020d.C0429b;
import com.corrodinggames.rts.game.units.p013a.C0206a;

/* renamed from: com.corrodinggames.rts.game.units.custom.a.b */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/a/b.class */
public class C0337b extends C0206a {

    /* renamed from: b */
    public C0206a f2043b;

    /* renamed from: c */
    public C0429b f2044c;

    /* renamed from: d */
    public C0429b f2045d;

    public C0337b(C0206a c0206a) {
        this.f2043b = c0206a;
    }

    @Override // com.corrodinggames.rts.game.units.p013a.C0206a
    /* renamed from: b */
    public boolean mo4083b(AbstractC0244am abstractC0244am) {
        return this.f2043b.mo4083b(abstractC0244am);
    }

    @Override // com.corrodinggames.rts.game.units.p013a.C0206a
    /* renamed from: c */
    public String mo4082c(AbstractC0244am abstractC0244am) {
        return this.f2043b.mo4082c(abstractC0244am);
    }

    @Override // com.corrodinggames.rts.game.units.p013a.C0206a
    /* renamed from: a */
    public boolean mo4087a(AbstractC0244am abstractC0244am, boolean z) {
        return this.f2043b.mo4087a(abstractC0244am, z);
    }

    @Override // com.corrodinggames.rts.game.units.p013a.C0206a
    /* renamed from: d */
    public boolean mo4081d(AbstractC0244am abstractC0244am) {
        return this.f2043b.mo4081d(abstractC0244am);
    }

    @Override // com.corrodinggames.rts.game.units.p013a.C0206a
    /* renamed from: a */
    public C0429b mo4091a() {
        if (this.f2044c != null) {
            return this.f2044c;
        }
        return this.f2043b.mo4091a();
    }

    @Override // com.corrodinggames.rts.game.units.p013a.C0206a
    /* renamed from: b */
    public C0429b mo4084b() {
        if (this.f2045d != null) {
            return this.f2045d;
        }
        return this.f2043b.mo4084b();
    }

    @Override // com.corrodinggames.rts.game.units.p013a.C0206a
    /* renamed from: a */
    public void mo4088a(AbstractC0244am abstractC0244am, AbstractC0244am abstractC0244am2) {
        this.f2043b.mo4088a(abstractC0244am, abstractC0244am2);
    }
}