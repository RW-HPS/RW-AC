package com.corrodinggames.rts.gameFramework.status.a;

import com.corrodinggames.rts.game.PlayerData;
import com.corrodinggames.rts.game.maps.f;
import com.corrodinggames.rts.game.units.custom.bo;
import com.corrodinggames.rts.game.units.custom.g;
import com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope;
import com.corrodinggames.rts.gameFramework.status.a;

/* renamed from: com.corrodinggames.rts.gameFramework.n.a.b */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/n/a/b.class */
public class b extends a {
    PlayerData a;
    g b;

    public static b d(a aVar) {
        b bVar = new b();
        bVar.a = aVar.a();
        if (bVar.a == null) {
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

    @Override // com.corrodinggames.rts.gameFramework.status.a.a
    public boolean b(a aVar) {
        if (g.a(this.b, this.a.U())) {
            return true;
        }
        return false;
    }
}