package com.corrodinggames.rts.gameFramework.player;

import com.corrodinggames.rts.game.PlayerData;
import com.corrodinggames.rts.game.units.custom.e.a;
import java.util.Iterator;

/* renamed from: com.corrodinggames.rts.gameFramework.g.f */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/g/f.class */
public enum f {
    none,
    income,
    armyValue,
    buildingValue,
    totalValue,
    credits;

    public int a(PlayerData playerData) {
        switch (this) {
            case none:
            default:
                return 0;
            case income:
                int v = playerData.v();
                Iterator it = a.f().iterator();
                while (it.hasNext()) {
                    a aVar = (a) it.next();
                    if (aVar.d()) {
                        float b = aVar.b();
                        if (b != 0.0f) {
                            v = (int) (v + (b * playerData.b(aVar)));
                        }
                    }
                }
                return v;
            case armyValue:
                return playerData.T.n;
            case buildingValue:
                return playerData.T.o;
            case totalValue:
                return playerData.T.n + playerData.T.o;
            case credits:
                return (int) playerData.credits;
        }
    }
}