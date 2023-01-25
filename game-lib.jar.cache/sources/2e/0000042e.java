package com.corrodinggames.rts.gameFramework;

import com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope;

/* renamed from: com.corrodinggames.rts.gameFramework.ag */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/ag.class */
public class C0648ag extends AbstractC0647af {

    /* renamed from: e */
    int f4189e;

    @Override // com.corrodinggames.rts.gameFramework.AbstractC0647af
    /* renamed from: a */
    public boolean mo2758a(AbstractC0647af abstractC0647af) {
        if (!(abstractC0647af instanceof C0648ag) || this.f4189e != ((C0648ag) abstractC0647af).f4189e) {
            return false;
        }
        return super.mo2758a(abstractC0647af);
    }

    @Override // com.corrodinggames.rts.gameFramework.AbstractC0647af
    /* renamed from: a */
    public boolean mo2759a() {
        if (C0644ac.f4115b.mo17a(this.f4189e, this.f4186b, false)) {
            if (!this.f4187c) {
                this.f4187c = true;
                return true;
            }
            return false;
        } else if (C0644ac.f4115b.mo17a(this.f4189e, this.f4186b, true)) {
            this.f4187c = true;
            return false;
        } else if (this.f4187c) {
            this.f4187c = false;
            return false;
        } else {
            return false;
        }
    }

    @Override // com.corrodinggames.rts.gameFramework.AbstractC0647af
    /* renamed from: b */
    public boolean mo2757b() {
        return C0644ac.f4115b.mo17a(this.f4189e, this.f4186b, false);
    }

    @Override // com.corrodinggames.rts.gameFramework.AbstractC0647af
    /* renamed from: c */
    public String mo2756c() {
        if (this.f4189e == 0) {
            return VariableScope.nullOrMissingString;
        }
        return C0644ac.f4115b.mo15c(this.f4189e, this.f4186b);
    }

    @Override // com.corrodinggames.rts.gameFramework.AbstractC0647af
    /* renamed from: d */
    public boolean mo2755d() {
        if (this.f4189e == 0) {
            return true;
        }
        return false;
    }
}