package com.corrodinggames.rts.game.units;

import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import com.corrodinggames.rts.C0067R;
import com.corrodinggames.rts.game.units.p024d.AbstractC0493d;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.unitAction.C0970e;

/* renamed from: com.corrodinggames.rts.game.units.e */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/e.class */
public class C0522e extends AbstractC0493d {

    /* renamed from: b */
    float f3606b;

    /* renamed from: a */
    static C0970e f3605a = null;

    /* renamed from: c */
    static PorterDuffColorFilter f3607c = new PorterDuffColorFilter(Color.m5238a(200, 200, 200), PorterDuff.Mode.MULTIPLY);

    @Override // com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: b */
    public EnumC0249ar mo1747r() {
        return EnumC0249ar.crystalResource;
    }

    /* renamed from: a_ */
    public static void m3288a_() {
        f3605a = GameEngine.getGameEngine().f6374bO.mo222a(C0067R.drawable.crystal);
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: d */
    public C0970e mo2879d() {
        return f3605a;
    }

    @Override // com.corrodinggames.rts.game.units.p024d.AbstractC0493d, com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: e */
    public boolean mo3071e() {
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.p024d.AbstractC0493d, com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: a */
    public void mo3021a(int i) {
    }

    public C0522e(boolean z) {
        super(z);
        this.f3918M = f3605a;
        m2724b(f3605a);
        this.f1626cj = 11.0f;
        this.f1627ck = this.f1626cj + 1.0f;
        this.f1638cv = 600.0f;
        this.f1637cu = this.f1638cv;
        m448S(1);
        this.f3457n.m5166a(0, -1, 0, 0);
        this.f3458o.m5165a(this.f3457n);
    }

    @Override // com.corrodinggames.rts.game.units.p024d.AbstractC0493d
    /* renamed from: f */
    public Paint mo3286f() {
        return super.mo3286f();
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y, com.corrodinggames.rts.game.units.AbstractC0244am, com.corrodinggames.rts.gameFramework.AbstractC1155w
    /* renamed from: a */
    public void mo446a(float f) {
        super.mo446a(f);
        this.f3606b += 0.01f * f;
        if (this.f3606b > 1.0f) {
            this.f3606b -= 1.0f;
            if (this.f3606b > 1.0f) {
                this.f3606b = 0.0f;
            }
        }
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: g */
    public float mo3285g() {
        return 0.02f;
    }

    @Override // com.corrodinggames.rts.game.units.p024d.AbstractC0493d, com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: h */
    public EnumC0246ao mo3069h() {
        return EnumC0246ao.NONE;
    }

    @Override // com.corrodinggames.rts.game.units.p024d.AbstractC0493d, com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: i */
    public boolean mo3068i() {
        return false;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y, com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: s_ */
    public boolean mo2829s_() {
        GameEngine gameEngine = GameEngine.getGameEngine();
        f1689du.m5150a(m4219cE());
        return RectF.m5149a(gameEngine.f6424cM, f1689du);
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: k */
    public C0970e mo2853k() {
        return null;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: l */
    public boolean mo3067l() {
        return false;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: m */
    public float mo2846m() {
        return 0.0f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: b */
    public float mo2930b(int i) {
        return 0.0f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: c */
    public float mo2883c(int i) {
        return 0.0f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: a */
    public void mo3008a(AbstractC0244am abstractC0244am, int i) {
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: n */
    public void mo3284n() {
        super.mo3284n();
        this.f3606b = ((this.f7174ep * 5.0f) + (this.f7173eo * 3.0f)) % 1.0f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: o */
    public boolean mo3283o() {
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: p */
    public boolean mo3282p() {
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: q */
    public boolean mo3281q() {
        return true;
    }
}