package com.corrodinggames.rts.game.units.p024d;

import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.Rect;
import com.corrodinggames.rts.game.PlayerData;
import com.corrodinggames.rts.game.units.AbstractC0244am;
import com.corrodinggames.rts.game.units.InterfaceC0303as;
import com.corrodinggames.rts.game.units.custom.C0453g;
import com.corrodinggames.rts.game.units.custom.p020d.C0429b;
import com.corrodinggames.rts.game.units.p013a.AbstractC0224s;
import com.corrodinggames.rts.game.units.p013a.C0208c;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.net.GameInputStream;
import com.corrodinggames.rts.gameFramework.net.GameOutputStream;
import com.corrodinggames.rts.gameFramework.utility.C1136m;

/* renamed from: com.corrodinggames.rts.game.units.d.i */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/d/i.class */
public abstract class AbstractC0503i extends AbstractC0493d implements InterfaceC0506l {

    /* renamed from: y */
    public static final Paint f3512y = new Paint();

    /* renamed from: z */
    C0505k f3513z;

    /* renamed from: A */
    Rect f3514A;

    /* renamed from: B */
    Rect f3515B;

    static {
        f3512y.m5228a(255, 0, 255, 0);
        f3512y.m5231a(1.5f);
        f3512y.mo914a(true);
    }

    public AbstractC0503i(boolean z) {
        super(z);
        this.f3513z = mo3324du();
        this.f3514A = new Rect();
        this.f3515B = new Rect();
    }

    @Override // com.corrodinggames.rts.game.units.p024d.AbstractC0493d, com.corrodinggames.rts.game.units.AbstractC0629y, com.corrodinggames.rts.game.units.AbstractC0244am, com.corrodinggames.rts.gameFramework.AbstractC0674az, com.corrodinggames.rts.gameFramework.AbstractC1155w, com.corrodinggames.rts.gameFramework.AbstractC0741bq
    /* renamed from: a */
    public void mo442a(GameOutputStream gameOutputStream) {
        gameOutputStream.writeInt(this.f3461r);
        this.f3513z.m3351a(gameOutputStream);
        super.mo442a(gameOutputStream);
    }

    @Override // com.corrodinggames.rts.game.units.p024d.AbstractC0493d, com.corrodinggames.rts.game.units.AbstractC0629y, com.corrodinggames.rts.game.units.AbstractC0244am, com.corrodinggames.rts.gameFramework.AbstractC0674az, com.corrodinggames.rts.gameFramework.AbstractC1155w
    /* renamed from: a */
    public void mo441a(GameInputStream gameInputStream) {
        if (gameInputStream.m1311b() >= 69) {
            mo3377R(gameInputStream.readInt());
        }
        this.f3513z.m3350a(gameInputStream);
        super.mo441a(gameInputStream);
    }

    /* renamed from: du */
    public C0505k mo3324du() {
        return new C0505k(this);
    }

    @Override // com.corrodinggames.rts.game.units.p024d.InterfaceC0506l
    /* renamed from: b */
    public void mo3336b(C0504j c0504j) {
    }

    @Override // com.corrodinggames.rts.game.units.p024d.InterfaceC0506l
    /* renamed from: c */
    public boolean mo3335c(C0504j c0504j) {
        return true;
    }

    /* renamed from: a */
    public void mo3294a(C0504j c0504j) {
        float f;
        if (this.f3513z.f3531b != null) {
            f = this.f1626cj * 2.0f;
        } else {
            f = this.f1626cj * 3.0f;
        }
        AbstractC0244am m3352a = this.f3513z.m3352a(c0504j, f, false, 0.0f);
        if (m3352a != null) {
            if (m3352a.f7173ep - m3352a.f1626cj < this.f7173ep + mo3299dv()) {
                m3352a.f7173ep = this.f7173ep + mo3299dv() + m3352a.f1626cj;
            }
            PlayerData.m4401c(m3352a);
        }
    }

    /* renamed from: dv */
    public int mo3299dv() {
        return -100;
    }

    @Override // com.corrodinggames.rts.game.units.p024d.InterfaceC0506l
    /* renamed from: f */
    public int mo3329f(boolean z) {
        return this.f3513z.m3363a(AbstractC0224s.f1466i, z, true);
    }

    @Override // com.corrodinggames.rts.game.units.p024d.InterfaceC0506l
    /* renamed from: a */
    public final int mo3337a(C0208c c0208c, boolean z) {
        return this.f3513z.m3364a(c0208c, z);
    }

    @Override // com.corrodinggames.rts.game.units.p024d.InterfaceC0506l
    /* renamed from: dw */
    public C0504j mo3333dw() {
        return this.f3513z.m3348b();
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: bD */
    public C0429b mo2914bD() {
        return this.f3513z.m3344c();
    }

    @Override // com.corrodinggames.rts.game.units.p024d.InterfaceC0506l
    /* renamed from: dx */
    public C1136m mo3332dx() {
        return this.f3513z.f3532c;
    }

    @Override // com.corrodinggames.rts.game.units.p024d.InterfaceC0506l
    /* renamed from: h */
    public int mo3328h(InterfaceC0303as interfaceC0303as) {
        return this.f3513z.m3356a(interfaceC0303as);
    }

    @Override // com.corrodinggames.rts.game.units.p024d.InterfaceC0506l
    /* renamed from: dy */
    public boolean mo3331dy() {
        return this.f3513z.m3366a();
    }

    @Override // com.corrodinggames.rts.game.units.p024d.InterfaceC0506l
    /* renamed from: dz */
    public void mo3330dz() {
        this.f3513z.f3534e = 1.0f;
    }

    @Override // com.corrodinggames.rts.game.units.p024d.InterfaceC0506l
    /* renamed from: a */
    public void mo3338a(PointF pointF) {
        this.f3513z.f3531b = pointF;
    }

    @Override // com.corrodinggames.rts.game.units.p024d.InterfaceC0506l
    /* renamed from: dA */
    public boolean mo3334dA() {
        return false;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: bV */
    public float mo3310bV() {
        if (m4226bT() && !this.f3513z.m3366a()) {
            return this.f3513z.f3534e;
        }
        return super.mo3310bV();
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: e */
    public AbstractC0224s mo3368e(InterfaceC0303as interfaceC0303as) {
        return this.f3513z.m3346b(interfaceC0303as);
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: a */
    public void mo3130a(AbstractC0224s abstractC0224s, boolean z) {
        this.f3513z.m3360a(abstractC0224s, z, (PointF) null, (AbstractC0244am) null);
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: b */
    public void mo3370b(AbstractC0224s abstractC0224s, boolean z) {
        this.f3513z.m3361a(abstractC0224s, z);
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: a */
    public void mo3372a(AbstractC0224s abstractC0224s) {
        this.f3513z.m3362a(abstractC0224s);
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y, com.corrodinggames.rts.game.units.AbstractC0244am, com.corrodinggames.rts.gameFramework.AbstractC1155w
    /* renamed from: a */
    public void mo446a(float f) {
        super.mo446a(f);
        if (!m4226bT() || this.f1612bV) {
            return;
        }
        this.f3513z.m3365a(f);
    }

    @Override // com.corrodinggames.rts.game.units.p024d.AbstractC0493d, com.corrodinggames.rts.game.units.AbstractC0629y, com.corrodinggames.rts.game.units.AbstractC0244am, com.corrodinggames.rts.gameFramework.AbstractC1155w
    /* renamed from: c */
    public boolean mo438c(float f) {
        return super.mo438c(f);
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y, com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: bv */
    public void mo2890bv() {
        PlayerData.m4439a((AbstractC0244am) this);
        this.f3513z.m3349a(true);
        super.mo2890bv();
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y, com.corrodinggames.rts.game.units.AbstractC0244am, com.corrodinggames.rts.gameFramework.AbstractC0673ay, com.corrodinggames.rts.gameFramework.AbstractC1155w
    /* renamed from: a */
    public void mo447a() {
        PlayerData.m4439a((AbstractC0244am) this);
        this.f3513z.m3349a(true);
        super.mo447a();
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: l */
    public boolean mo3067l() {
        return false;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: a */
    public void mo3008a(AbstractC0244am abstractC0244am, int i) {
        throw new RuntimeException("Unit cannot shoot");
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

    @Override // com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: ca */
    public void mo3369ca() {
        if (this.f3513z.f3531b != null) {
            GameEngine gameEngine = GameEngine.getGameEngine();
            gameEngine.f6326bO.mo226a((int) (this.f7172eo - gameEngine.f6357cw), (int) (this.f7173ep - gameEngine.f6358cx), (int) (this.f3513z.f3531b.x - gameEngine.f6357cw), (int) (this.f3513z.f3531b.y - gameEngine.f6358cx), f3512y);
        }
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: a */
    public int mo3371a(C0453g c0453g) {
        return this.f3513z.m3354a(c0453g);
    }
}