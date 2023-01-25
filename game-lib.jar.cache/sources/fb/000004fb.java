package com.corrodinggames.rts.gameFramework.player;

import com.corrodinggames.rts.game.PlayerData;
import com.corrodinggames.rts.game.units.custom.p021e.C0433a;
import java.util.Iterator;

/* renamed from: com.corrodinggames.rts.gameFramework.g.f */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/g/f.class */
public enum EnumC0853f {
    f5600a,
    f5601b,
    f5602c,
    f5603d,
    f5604e,
    f5605f;

    /* renamed from: a */
    public int m1720a(PlayerData playerData) {
        switch (this) {
            case f5600a:
            default:
                return 0;
            case f5601b:
                int m4354v = playerData.m4354v();
                Iterator it = C0433a.m3770f().iterator();
                while (it.hasNext()) {
                    C0433a c0433a = (C0433a) it.next();
                    if (c0433a.m3772d()) {
                        float m3776b = c0433a.m3776b();
                        if (m3776b != 0.0f) {
                            m4354v = (int) (m4354v + (m3776b * playerData.m4416b(c0433a)));
                        }
                    }
                }
                return m4354v;
            case f5602c:
                return playerData.f1345T.f1409n;
            case f5603d:
                return playerData.f1345T.f1410o;
            case f5604e:
                return playerData.f1345T.f1409n + playerData.f1345T.f1410o;
            case f5605f:
                return (int) playerData.credits;
        }
    }
}