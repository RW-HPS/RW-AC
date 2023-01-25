package com.corrodinggames.rts.gameFramework.player;

import com.corrodinggames.rts.game.PlayerData;
import com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope;

/* renamed from: com.corrodinggames.rts.gameFramework.g.e */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/g/e.class */
public class C0852e extends AbstractC0851d {

    /* renamed from: a */
    private final PlayerData f5599a;

    public C0852e(PlayerData playerData) {
        this.f5599a = playerData;
    }

    @Override // com.corrodinggames.rts.gameFramework.player.AbstractC0851d
    /* renamed from: a */
    public boolean mo1725a() {
        return false;
    }

    @Override // com.corrodinggames.rts.gameFramework.player.AbstractC0851d
    /* renamed from: b */
    public String mo1723b() {
        if (this.f5599a.name == null) {
            return VariableScope.nullOrMissingString;
        }
        return this.f5599a.name;
    }

    @Override // com.corrodinggames.rts.gameFramework.player.AbstractC0851d
    /* renamed from: c */
    public int mo1722c() {
        return this.f5599a.m4461K();
    }

    @Override // com.corrodinggames.rts.gameFramework.player.AbstractC0851d
    /* renamed from: d */
    public int mo1721d() {
        return -1;
    }

    @Override // com.corrodinggames.rts.gameFramework.player.AbstractC0851d
    /* renamed from: a */
    public int mo1724a(EnumC0853f enumC0853f) {
        return enumC0853f.m1720a(this.f5599a);
    }
}