package com.corrodinggames.rts.gameFramework.player;

import com.corrodinggames.rts.game.PlayerData;
import com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope;

/* renamed from: com.corrodinggames.rts.gameFramework.g.e */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/g/e.class */
public class e extends d {
    private final PlayerData a;

    public e(PlayerData playerData) {
        this.a = playerData;
    }

    @Override // com.corrodinggames.rts.gameFramework.player.d
    public boolean a() {
        return false;
    }

    @Override // com.corrodinggames.rts.gameFramework.player.d
    public String b() {
        if (this.a.name == null) {
            return VariableScope.nullOrMissingString;
        }
        return this.a.name;
    }

    @Override // com.corrodinggames.rts.gameFramework.player.d
    public int c() {
        return this.a.K();
    }

    @Override // com.corrodinggames.rts.gameFramework.player.d
    public int d() {
        return -1;
    }

    @Override // com.corrodinggames.rts.gameFramework.player.d
    public int a(f fVar) {
        return fVar.a(this.a);
    }
}