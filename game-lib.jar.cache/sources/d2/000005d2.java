package com.corrodinggames.rts.gameFramework.n.a;

import com.corrodinggames.rts.game.PlayerData;
import com.corrodinggames.rts.game.b.f;
import com.corrodinggames.rts.game.units.custom.bo;
import com.corrodinggames.rts.game.units.custom.g;
import com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope;

/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/n/a/b.class */
public class b extends a {

    /* renamed from: a  reason: collision with root package name */
    PlayerData f646a;
    g b;

    public static b d(com.corrodinggames.rts.gameFramework.n.a aVar) {
        b bVar = new b();
        bVar.f646a = aVar.a();
        if (bVar.f646a == null) {
            throw new f("teamTagDetect requires a team set");
        }
        String b = aVar.b("teamTag");
        if (b != null && !b.equals(VariableScope.nullOrMissingString)) {
            try {
                bVar.b = g.b(b);
                return bVar;
            } catch (bo e) {
                throw new f(e.getMessage());
            }
        }
        throw new f("teamTagDetect requires a teamTag set");
    }

    @Override // com.corrodinggames.rts.gameFramework.n.a.a
    public boolean b(com.corrodinggames.rts.gameFramework.n.a aVar) {
        if (g.a(this.b, this.f646a.U())) {
            return true;
        }
        return false;
    }
}