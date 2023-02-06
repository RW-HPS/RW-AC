package com.corrodinggames.rts.appFramework;

import com.corrodinggames.rts.game.PlayerData;
import com.corrodinggames.rts.gameFramework.GameEngine;

/* loaded from: game-lib.jar:com/corrodinggames/rts/appFramework/o.class */
public class o {
    String a;
    int b = 0;
    int c = 0;
    PlayerData d = null;
    PlayerData e = null;
    int f;
    int g;

    o(String str) {
        this.a = str;
    }

    public void a(PlayerData playerData, int i) {
        if (i < this.b || this.d == null) {
            this.b = i;
            this.d = playerData;
            this.f = 1;
        } else if (i == this.b) {
            this.f++;
        }
        if (i > this.c || this.e == null) {
            this.c = i;
            this.e = playerData;
            this.g = 1;
        } else if (i == this.c) {
            this.g++;
        }
    }

    public boolean a() {
        GameEngine gameEngine = GameEngine.getGameEngine();
        if (this.b == this.c) {
            return false;
        }
        if (this.d == null && this.e == null) {
            return false;
        }
        if (this.g == 1) {
            gameEngine.bS.h.a((String) null, "Warning: Uneven map - Player " + (this.e.site + 1) + " on team " + this.e.getPlayerTeamName() + ": " + this.a + " is " + this.c + " vs " + this.b);
            return true;
        }
        gameEngine.bS.h.a((String) null, "Warning: Uneven map - " + this.g + " players including player " + (this.e.site + 1) + " on team " + (this.e.team + 1) + ": " + this.a + " is " + this.c + " vs " + this.b);
        return true;
    }
}