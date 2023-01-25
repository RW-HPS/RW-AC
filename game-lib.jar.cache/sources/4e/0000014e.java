package com.corrodinggames.rts.appFramework;

import com.corrodinggames.rts.game.PlayerData;
import com.corrodinggames.rts.gameFramework.GameEngine;

/* renamed from: com.corrodinggames.rts.appFramework.o */
/* loaded from: game-lib.jar:com/corrodinggames/rts/appFramework/o.class */
public class C0128o {

    /* renamed from: a */
    String f533a;

    /* renamed from: b */
    int f534b = 0;

    /* renamed from: c */
    int f535c = 0;

    /* renamed from: d */
    PlayerData f536d = null;

    /* renamed from: e */
    PlayerData f537e = null;

    /* renamed from: f */
    int f538f;

    /* renamed from: g */
    int f539g;

    C0128o(String str) {
        this.f533a = str;
    }

    /* renamed from: a */
    public void m4892a(PlayerData playerData, int i) {
        if (i < this.f534b || this.f536d == null) {
            this.f534b = i;
            this.f536d = playerData;
            this.f538f = 1;
        } else if (i == this.f534b) {
            this.f538f++;
        }
        if (i > this.f535c || this.f537e == null) {
            this.f535c = i;
            this.f537e = playerData;
            this.f539g = 1;
        } else if (i == this.f535c) {
            this.f539g++;
        }
    }

    /* renamed from: a */
    public boolean m4893a() {
        GameEngine gameEngine = GameEngine.getGameEngine();
        if (this.f534b == this.f535c) {
            return false;
        }
        if (this.f536d == null && this.f537e == null) {
            return false;
        }
        if (this.f539g == 1) {
            gameEngine.f6330bS.f5264h.m1782a((String) null, "Warning: Uneven map - Player " + (this.f537e.site + 1) + " on team " + this.f537e.getPlayerTeamName() + ": " + this.f533a + " is " + this.f535c + " vs " + this.f534b);
            return true;
        }
        gameEngine.f6330bS.f5264h.m1782a((String) null, "Warning: Uneven map - " + this.f539g + " players including player " + (this.f537e.site + 1) + " on team " + (this.f537e.team + 1) + ": " + this.f533a + " is " + this.f535c + " vs " + this.f534b);
        return true;
    }
}