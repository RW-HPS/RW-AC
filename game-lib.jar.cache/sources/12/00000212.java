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
import com.corrodinggames.rts.gameFramework.utility.C1152y;

/* renamed from: com.corrodinggames.rts.game.units.custom.a.a.c */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/a/a/c.class */
public class C0324c extends AbstractC0549i {

    /* renamed from: a */
    public boolean f1945a;

    /* renamed from: b */
    public C0454h f1946b;

    /* renamed from: c */
    public float f1947c;

    /* renamed from: d */
    public boolean f1948d;

    /* renamed from: e */
    public EnumC0200q f1949e;

    /* renamed from: f */
    public boolean f1950f;

    /* renamed from: g */
    public C1136m f1951g = new C1136m();

    /* renamed from: h */
    public AbstractC0244am f1952h;

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
        if (this.f1946b == null || (mo3599de != null && C0453g.m3684a(this.f1946b, mo3599de))) {
            float m2216a = C0773f.m2216a(abstractC0629y.f7172eo, abstractC0629y.f7173ep, abstractC0244am.f7172eo, abstractC0244am.f7173ep);
            if (m2216a < this.f1947c) {
                if (abstractC0244am.f1629cm < 1.0f && !this.f1948d) {
                    return;
                }
                if (this.f1949e != null && !abstractC0629y.f1614bX.m4440a(this.f1949e, abstractC0244am.f1614bX)) {
                    return;
                }
                if (this.f1945a && !C1152y.m454b(abstractC0629y, abstractC0244am.f7172eo, abstractC0244am.f7173ep)) {
                    return;
                }
                if (!this.f1950f) {
                    this.f1952h = abstractC0244am;
                    this.f1947c = m2216a;
                    return;
                }
                this.f1951g.add(abstractC0244am);
            }
        }
    }
}