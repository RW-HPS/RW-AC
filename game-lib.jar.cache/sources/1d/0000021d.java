package com.corrodinggames.rts.game.units.custom.p016a.p017a;

import com.corrodinggames.rts.game.EnumC0200q;
import com.corrodinggames.rts.game.PlayerData;
import com.corrodinggames.rts.game.units.AbstractC0244am;
import com.corrodinggames.rts.game.units.AbstractC0629y;
import com.corrodinggames.rts.game.units.custom.C0453g;
import com.corrodinggames.rts.game.units.custom.C0454h;
import com.corrodinggames.rts.game.units.p027f.AbstractC0549i;
import com.corrodinggames.rts.gameFramework.C0773f;
import com.corrodinggames.rts.gameFramework.utility.C1136m;

/* renamed from: com.corrodinggames.rts.game.units.custom.a.a.n */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/a/a/n.class */
public class C0335n extends AbstractC0549i {

    /* renamed from: a */
    public C0454h f2031a;

    /* renamed from: b */
    public float f2032b;

    /* renamed from: c */
    public boolean f2033c;

    /* renamed from: d */
    public EnumC0200q f2034d;

    /* renamed from: e */
    public C1136m f2035e;

    @Override // com.corrodinggames.rts.game.units.p027f.AbstractC0549i
    public void setup(AbstractC0629y abstractC0629y, float f) {
    }

    @Override // com.corrodinggames.rts.game.units.p027f.AbstractC0549i
    public int excludeTeam(AbstractC0629y abstractC0629y) {
        return -2;
    }

    @Override // com.corrodinggames.rts.game.units.p027f.AbstractC0549i
    public PlayerData onlyEnemiesOfTeam(AbstractC0629y abstractC0629y) {
        return null;
    }

    @Override // com.corrodinggames.rts.game.units.p027f.AbstractC0549i
    public PlayerData onlyTeam(AbstractC0629y abstractC0629y) {
        return null;
    }

    @Override // com.corrodinggames.rts.game.units.p027f.AbstractC0550j
    public void callback(AbstractC0629y abstractC0629y, float f, AbstractC0244am abstractC0244am) {
        C0454h mo3599de = abstractC0244am.mo3599de();
        if ((this.f2031a == null || (mo3599de != null && C0453g.m3684a(this.f2031a, mo3599de))) && C0773f.m2216a(abstractC0629y.f7172eo, abstractC0629y.f7173ep, abstractC0244am.f7172eo, abstractC0244am.f7173ep) < this.f2032b) {
            if (abstractC0244am.f1629cm < 1.0f && !this.f2033c) {
                return;
            }
            if (this.f2034d != null && !abstractC0629y.f1614bX.m4440a(this.f2034d, abstractC0244am.f1614bX)) {
                return;
            }
            this.f2035e.add(abstractC0244am);
        }
    }
}