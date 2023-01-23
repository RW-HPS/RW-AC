package com.corrodinggames.rts.gameFramework.player;

import com.corrodinggames.rts.game.PlayerData;
import com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope;

/* renamed from: com.corrodinggames.rts.gameFramework.g.e */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/g/e.class */
public class e extends d {

    /* renamed from: a */
    private final PlayerData f539a;

    public e(PlayerData playerData) {
        this.f539a = playerData;
    }

    @Override // com.corrodinggames.rts.gameFramework.player.d
    public boolean a() {
        return false;
    }

    @Override // com.corrodinggames.rts.gameFramework.player.d
    public String b() {
        if (this.f539a.name == null) {
            return VariableScope.nullOrMissingString;
        }
        return this.f539a.name;
    }

    @Override // com.corrodinggames.rts.gameFramework.player.d
    public int c() {
        return this.f539a.K();
    }

    @Override // com.corrodinggames.rts.gameFramework.player.d
    public int d() {
        return -1;
    }

    @Override // com.corrodinggames.rts.gameFramework.player.d
    public int a(f fVar) {
        return fVar.a(this.f539a);
    }
}