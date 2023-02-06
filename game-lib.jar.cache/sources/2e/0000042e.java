package com.corrodinggames.rts.gameFramework;

import com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope;

/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/ag.class */
public class ag extends af {
    int e;

    @Override // com.corrodinggames.rts.gameFramework.af
    public boolean a(af afVar) {
        if (!(afVar instanceof ag) || this.e != ((ag) afVar).e) {
            return false;
        }
        return super.a(afVar);
    }

    @Override // com.corrodinggames.rts.gameFramework.af
    public boolean a() {
        if (ac.b.a(this.e, this.b, false)) {
            if (!this.c) {
                this.c = true;
                return true;
            }
            return false;
        } else if (ac.b.a(this.e, this.b, true)) {
            this.c = true;
            return false;
        } else if (this.c) {
            this.c = false;
            return false;
        } else {
            return false;
        }
    }

    @Override // com.corrodinggames.rts.gameFramework.af
    public boolean b() {
        return ac.b.a(this.e, this.b, false);
    }

    @Override // com.corrodinggames.rts.gameFramework.af
    public String c() {
        if (this.e == 0) {
            return VariableScope.nullOrMissingString;
        }
        return ac.b.c(this.e, this.b);
    }

    @Override // com.corrodinggames.rts.gameFramework.af
    public boolean d() {
        if (this.e == 0) {
            return true;
        }
        return false;
    }
}