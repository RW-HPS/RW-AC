package com.corrodinggames.rts.gameFramework.status.p047a;

import com.corrodinggames.rts.game.PlayerData;
import com.corrodinggames.rts.game.p012b.C0179f;
import com.corrodinggames.rts.game.units.custom.C0417bo;
import com.corrodinggames.rts.game.units.custom.C0453g;
import com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope;
import com.corrodinggames.rts.gameFramework.status.C1066a;

/* renamed from: com.corrodinggames.rts.gameFramework.n.a.b */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/n/a/b.class */
public class C1068b extends AbstractC1067a {

    /* renamed from: a */
    PlayerData f6841a;

    /* renamed from: b */
    C0453g f6842b;

    /* renamed from: d */
    public static C1068b m804d(C1066a c1066a) {
        C1068b c1068b = new C1068b();
        c1068b.f6841a = c1066a.m830a();
        if (c1068b.f6841a == null) {
            throw new C0179f("teamTagDetect requires a team set");
        }
        String m817b = c1066a.m817b("teamTag");
        if (m817b != null && !m817b.equals(VariableScope.nullOrMissingString)) {
            try {
                c1068b.f6842b = C0453g.m3678b(m817b);
                return c1068b;
            } catch (C0417bo e) {
                throw new C0179f(e.getMessage());
            }
        }
        throw new C0179f("teamTagDetect requires a teamTag set");
    }

    @Override // com.corrodinggames.rts.gameFramework.status.p047a.AbstractC1067a
    /* renamed from: b */
    public boolean mo803b(C1066a c1066a) {
        if (C0453g.m3685a(this.f6842b, this.f6841a.m4451U())) {
            return true;
        }
        return false;
    }
}