package com.corrodinggames.rts.game.units.p014b;

import com.corrodinggames.rts.C0067R;
import com.corrodinggames.rts.game.PlayerData;
import com.corrodinggames.rts.game.units.AbstractC0627w;
import com.corrodinggames.rts.game.units.EnumC0233ab;
import com.corrodinggames.rts.game.units.EnumC0246ao;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.net.GameInputStream;
import com.corrodinggames.rts.gameFramework.net.GameOutputStream;
import com.corrodinggames.rts.gameFramework.p035d.C0760e;
import com.corrodinggames.rts.gameFramework.unitAction.C0970e;

/* renamed from: com.corrodinggames.rts.game.units.b.b */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/b/b.class */
public abstract class AbstractC0309b extends AbstractC0627w {

    /* renamed from: h */
    float f1846h;

    /* renamed from: i */
    boolean f1847i;

    /* renamed from: j */
    float f1848j;

    /* renamed from: k */
    Boolean f1849k;

    /* renamed from: l */
    Boolean f1850l;

    /* renamed from: m */
    public static C0970e f1851m = null;

    /* renamed from: n */
    public static C0970e[] f1852n = new C0970e[10];

    public AbstractC0309b(boolean z) {
        super(z);
        this.f1847i = false;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y, com.corrodinggames.rts.game.units.AbstractC0244am, com.corrodinggames.rts.gameFramework.AbstractC0674az, com.corrodinggames.rts.gameFramework.AbstractC1155w, com.corrodinggames.rts.gameFramework.AbstractC0741bq
    /* renamed from: a */
    public void mo442a(GameOutputStream gameOutputStream) {
        gameOutputStream.writeFloat(this.f1846h);
        gameOutputStream.writeBoolean(this.f1847i);
        super.mo442a(gameOutputStream);
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y, com.corrodinggames.rts.game.units.AbstractC0244am, com.corrodinggames.rts.gameFramework.AbstractC0674az, com.corrodinggames.rts.gameFramework.AbstractC1155w
    /* renamed from: a */
    public void mo441a(GameInputStream gameInputStream) {
        this.f1846h = gameInputStream.readFloat();
        this.f1847i = gameInputStream.readBoolean();
        super.mo441a(gameInputStream);
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: v */
    public C0970e mo3066v() {
        if (this.f1614bX.site == -1) {
            return null;
        }
        return f1852n[this.f1614bX.m4454R()];
    }

    /* renamed from: K */
    public static void m4129K() {
        f1851m = GameEngine.getGameEngine().f6326bO.mo222a(C0067R.drawable.unit_icon_air);
        f1852n = PlayerData.m4432a(f1851m);
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: h */
    public EnumC0246ao mo3069h() {
        return EnumC0246ao.f1711d;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y, com.corrodinggames.rts.game.units.AbstractC0244am, com.corrodinggames.rts.gameFramework.AbstractC1155w
    /* renamed from: a */
    public void mo446a(float f) {
        C0760e m2369b;
        super.mo446a(f);
        if (this.f1612bV) {
            if (this.f7174eq > 0.0f) {
                this.f1846h += 0.06f * f;
                this.f7174eq -= this.f1846h * f;
                return;
            }
            if (this.f1849k == null) {
                this.f1849k = Boolean.valueOf(m4215cK());
            }
            if (this.f1850l == null) {
                this.f1850l = Boolean.valueOf(m4216cJ());
            }
            if (!this.f1847i) {
                this.f1847i = true;
                if (this.f1849k.booleanValue()) {
                    m3014a(EnumC0233ab.verysmall);
                    if (this.f1850l.booleanValue()) {
                        GameEngine.getGameEngine().f6329bR.m2383a(this.f7172eo, this.f7173ep, 0.0f, 0, 0.0f, 0.0f, this.f1623cg);
                    }
                } else {
                    m3014a(EnumC0233ab.small);
                }
                this.f1846h = 0.0f;
            } else if (this.f1849k.booleanValue()) {
                if (this.f7174eq > -10.0f) {
                    this.f1846h += 8.0E-4f * f;
                    this.f7174eq -= this.f1846h * f;
                    if (this.f1850l.booleanValue()) {
                        this.f1848j += f;
                        if (this.f1848j > 30.0f) {
                            this.f1848j = 0.0f;
                            if (mo2829s_() && (m2369b = GameEngine.getGameEngine().f6329bR.m2369b(this.f7172eo, this.f7173ep, this.f7174eq, this.f1623cg)) != null) {
                                m2369b.f4825P = 0.0f;
                                m2369b.f4826Q = -0.1f;
                            }
                        }
                    }
                }
            } else {
                this.f7174eq = 0.0f;
            }
        }
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: e */
    public boolean mo3071e() {
        GameEngine gameEngine = GameEngine.getGameEngine();
        if (this.f7174eq > -1.0f) {
            for (int i = 0; i < 3; i++) {
                gameEngine.f6329bR.m2358e(this.f7172eo, this.f7173ep, this.f7174eq);
            }
        }
        return super.mo3071e();
    }
}