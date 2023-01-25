package com.corrodinggames.rts.game.units;

import com.corrodinggames.rts.game.PlayerData;
import com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope;
import com.corrodinggames.rts.game.units.p013a.AbstractC0229x;
import com.corrodinggames.rts.game.units.p013a.EnumC0225t;
import com.corrodinggames.rts.game.units.p013a.EnumC0226u;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.p037f.C0825g;
import java.util.Iterator;

/* renamed from: com.corrodinggames.rts.game.units.k */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/k.class */
class C0599k extends AbstractC0229x {

    /* renamed from: a */
    boolean f3884a;

    /* renamed from: b */
    boolean f3885b;

    public C0599k(boolean z, boolean z2) {
        super("changeTeam" + z + "d:" + z2);
        this.f3884a = z;
        this.f3885b = z2;
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
    /* renamed from: b */
    public String mo3095b() {
        if (this.f3885b) {
            return "Selected player";
        }
        if (this.f3884a) {
            return "<- Set player";
        }
        return "Set player ->";
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
    /* renamed from: d */
    public String mo3123d() {
        if (!this.f3885b) {
            if (this.f3884a) {
                return "<-";
            }
            return "->";
        }
        GameEngine gameEngine = GameEngine.getGameEngine();
        PlayerData playerData = null;
        Iterator it = gameEngine.f6330bS.f5427bZ.iterator();
        while (it.hasNext()) {
            AbstractC0244am abstractC0244am = (AbstractC0244am) it.next();
            if (abstractC0244am instanceof AbstractC0629y) {
                AbstractC0629y abstractC0629y = (AbstractC0629y) abstractC0244am;
                if (abstractC0629y.f1649cG && gameEngine.f6330bS.m1806m(abstractC0629y)) {
                    playerData = abstractC0629y.f1614bX;
                }
            }
        }
        String str = VariableScope.nullOrMissingString;
        if (playerData != null) {
            str = str + "Team - " + (playerData.site + 1) + VariableScope.nullOrMissingString;
        }
        return str;
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
    /* renamed from: a */
    public String mo3098a() {
        return "Change targeted player for editor";
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
    /* renamed from: l */
    public float mo3122l() {
        if (!C0825g.f5356bP) {
            return 0.8f;
        }
        return 0.5f;
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
    /* renamed from: m */
    public int mo3121m() {
        if (this.f3885b) {
            return 2;
        }
        return 4;
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0229x, com.corrodinggames.rts.game.units.p013a.AbstractC0224s
    /* renamed from: f */
    public EnumC0225t mo3090f() {
        if (this.f3885b) {
            return EnumC0225t.f1475g;
        }
        return super.mo3090f();
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0229x, com.corrodinggames.rts.game.units.p013a.AbstractC0224s
    /* renamed from: e */
    public EnumC0226u mo3091e() {
        if (this.f3885b) {
            return EnumC0226u.f1487i;
        }
        return super.mo3091e();
    }
}