package com.corrodinggames.rts.game.units.p024d;

import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.RectF;
import com.corrodinggames.rts.C0067R;
import com.corrodinggames.rts.game.C0188f;
import com.corrodinggames.rts.game.PlayerData;
import com.corrodinggames.rts.game.units.AbstractC0244am;
import com.corrodinggames.rts.game.units.EnumC0233ab;
import com.corrodinggames.rts.game.units.EnumC0249ar;
import com.corrodinggames.rts.game.units.p013a.C0217l;
import com.corrodinggames.rts.game.units.p013a.C0220o;
import com.corrodinggames.rts.gameFramework.C0773f;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.net.GameInputStream;
import com.corrodinggames.rts.gameFramework.net.GameOutputStream;
import com.corrodinggames.rts.gameFramework.p030a.C0637e;
import com.corrodinggames.rts.gameFramework.p035d.C0760e;
import com.corrodinggames.rts.gameFramework.p035d.C0761f;
import com.corrodinggames.rts.gameFramework.p035d.EnumC0763h;
import com.corrodinggames.rts.gameFramework.unitAction.C0970e;
import com.corrodinggames.rts.gameFramework.utility.C1152y;
import com.corrodinggames.rts.gameFramework.utility.SlickToAndroidKeycodes;
import java.util.ArrayList;

/* renamed from: com.corrodinggames.rts.game.units.d.e */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/d/e.class */
public class C0494e extends AbstractC0503i {

    /* renamed from: a */
    static C0970e f3463a = null;

    /* renamed from: b */
    static C0970e[] f3464b = new C0970e[10];

    /* renamed from: c */
    static C0970e f3465c = null;

    /* renamed from: d */
    static C0970e f3466d = null;

    /* renamed from: e */
    float f3467e;

    /* renamed from: f */
    public float f3468f;

    /* renamed from: g */
    public float f3469g;

    /* renamed from: h */
    public int f3470h;

    /* renamed from: i */
    public float f3471i;

    /* renamed from: j */
    public float f3472j;

    /* renamed from: k */
    float f3473k;

    /* renamed from: l */
    int f3474l;

    @Override // com.corrodinggames.rts.game.units.p024d.AbstractC0503i, com.corrodinggames.rts.game.units.p024d.AbstractC0493d, com.corrodinggames.rts.game.units.AbstractC0629y, com.corrodinggames.rts.game.units.AbstractC0244am, com.corrodinggames.rts.gameFramework.AbstractC0674az, com.corrodinggames.rts.gameFramework.AbstractC1155w, com.corrodinggames.rts.gameFramework.AbstractC0741bq
    /* renamed from: a */
    public void mo442a(GameOutputStream gameOutputStream) {
        gameOutputStream.writeFloat(this.f3467e);
        super.mo442a(gameOutputStream);
    }

    @Override // com.corrodinggames.rts.game.units.p024d.AbstractC0503i, com.corrodinggames.rts.game.units.p024d.AbstractC0493d, com.corrodinggames.rts.game.units.AbstractC0629y, com.corrodinggames.rts.game.units.AbstractC0244am, com.corrodinggames.rts.gameFramework.AbstractC0674az, com.corrodinggames.rts.gameFramework.AbstractC1155w
    /* renamed from: a */
    public void mo441a(GameInputStream gameInputStream) {
        this.f3467e = gameInputStream.readFloat();
        super.mo441a(gameInputStream);
    }

    /* renamed from: b */
    public static void m3390b() {
        GameEngine gameEngine = GameEngine.getGameEngine();
        f3463a = gameEngine.f6326bO.mo222a(C0067R.drawable.base);
        f3465c = gameEngine.f6326bO.mo222a(C0067R.drawable.base_dead);
        f3466d = gameEngine.f6326bO.mo222a(C0067R.drawable.base_back);
        f3464b = PlayerData.m4432a(f3463a);
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: K */
    public EnumC0249ar mo5458r() {
        return EnumC0249ar.commandCenter;
    }

    @Override // com.corrodinggames.rts.game.units.p024d.AbstractC0493d
    /* renamed from: L */
    public boolean mo3296L() {
        GameEngine gameEngine = GameEngine.getGameEngine();
        this.f3917M = f3465c;
        this.f3456m = null;
        m448S(0);
        this.f1610bT = false;
        m3014a(EnumC0233ab.large);
        float f = this.f7172eo;
        float f2 = this.f7173ep;
        gameEngine.f6329bR.m2364b(EnumC0763h.critical);
        C0760e m2385a = gameEngine.f6329bR.m2385a(f, f2, this.f7174eq, Color.m5243a(255, 255, 255, 255));
        if (m2385a != null) {
            m2385a.f4816G = 8.0f;
            m2385a.f4815F = 5.0f;
            m2385a.f4814E = 0.9f;
            m2385a.f4831V = 20.0f;
            m2385a.f4832W = m2385a.f4831V;
            m2385a.f4806r = true;
        }
        gameEngine.f6329bR.m2364b(EnumC0763h.critical);
        C0760e m2361c = gameEngine.f6329bR.m2361c(f, f2, 0.0f, -1127220);
        if (m2361c != null) {
            m2361c.f4816G = 0.2f;
            m2361c.f4815F = 2.0f;
            m2361c.f4873ar = (short) 2;
            m2361c.f4831V = 45.0f;
            m2361c.f4832W = m2361c.f4831V;
            m2361c.f4830U = 0.0f;
        }
        gameEngine.f6329bR.m2389a(this.f7172eo, this.f7173ep, this.f7174eq, 40.0f, 70.0f);
        C0761f.m2348a(this.f7172eo, this.f7173ep);
        C0761f.m2344b(this.f7172eo, this.f7173ep).f4876a = 800.0f;
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.p024d.AbstractC0493d, com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: a */
    public void mo3021a(int i) {
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: S */
    public void mo3041S() {
        super.mo3041S();
        if (this.f1612bV) {
            this.f3456m = null;
        } else {
            this.f3456m = f3466d;
        }
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: d */
    public C0970e mo2879d() {
        if (this.f1612bV) {
            return f3465c;
        }
        return f3464b[this.f1614bX.m4454R()];
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: k */
    public C0970e mo2853k() {
        return null;
    }

    public C0494e(boolean z) {
        super(z);
        this.f3473k = 20.0f;
        this.f3474l = 0;
        this.f3917M = f3463a;
        this.f3456m = f3466d;
        m2729T(53);
        m2728U(68);
        this.f1626cj = 30.0f;
        this.f1627ck = this.f1626cj;
        this.f1638cv = 4000.0f;
        this.f1637cu = this.f1638cv;
        m448S(3);
        this.f3457n.m5172a(-1, -1, 1, 1);
        this.f3458o.m5172a(-1, -1, 1, 2);
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: cF */
    public RectF mo3389cF() {
        RectF cF = super.mo3389cF();
        cF.m5159a(6.0f, 0.0f);
        return cF;
    }

    @Override // com.corrodinggames.rts.game.units.p024d.AbstractC0503i, com.corrodinggames.rts.game.units.AbstractC0629y, com.corrodinggames.rts.game.units.AbstractC0244am, com.corrodinggames.rts.gameFramework.AbstractC1155w
    /* renamed from: a */
    public void mo446a(float f) {
        GameEngine.getGameEngine();
        super.mo446a(f);
        if (!m4226bT() || this.f1612bV) {
            return;
        }
        this.f3473k = C0773f.m2218a(this.f3473k, f);
        if (this.f3473k == 0.0f) {
            this.f3473k = 5.0f;
            this.f3474l++;
            if (this.f3474l > 6) {
                this.f3474l = 0;
                this.f3473k = 70.0f;
            }
            if (this.f3474l <= 3) {
                this.f3462s = this.f3474l;
            } else {
                this.f3462s = 6 - this.f3474l;
            }
        }
        this.f3468f += f;
        this.f3470h++;
        this.f3471i += 10.0f;
        if (this.f3472j > f) {
            this.f3472j = f;
        }
        this.f3469g += f;
        this.f3467e += f;
        if (this.f3467e > PlayerData.f1380ap - 0.1f) {
            this.f3467e -= PlayerData.f1380ap;
            this.f1614bX.m4421b(mo3375cy() * (PlayerData.f1380ap / PlayerData.f1379ao));
        }
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: cy */
    public float mo3375cy() {
        return 18.0f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: q */
    public float mo2835q(int i) {
        return 70.0f;
    }

    @Override // com.corrodinggames.rts.game.units.p024d.AbstractC0503i, com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: a */
    public void mo3008a(AbstractC0244am abstractC0244am, int i) {
        C0188f m4525a = C0188f.m4525a(this, this.f7172eo, this.f7173ep);
        PointF K = mo3046K(i);
        m4525a.f1012K = K.x;
        m4525a.f1013L = K.y;
        m4525a.f1044ar = Color.m5243a(255, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_DATA_SERVICE, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_DATA_SERVICE, 50);
        m4525a.f1022U = mo2835q(i);
        m4525a.f987l = abstractC0244am;
        m4525a.f983h = 180.0f;
        m4525a.f995t = 2.0f;
        m4525a.f993r = 5.0f;
        m4525a.f1060aH = true;
        m4525a.f1065aM = true;
        m4525a.f1069aQ = true;
        m4525a.f1059aG = true;
        GameEngine gameEngine = GameEngine.getGameEngine();
        gameEngine.f6329bR.m2377a(m4525a, -1118720);
        gameEngine.f6324bM.m2812a(C0637e.f4079m, 0.8f, this.f7172eo, this.f7173ep);
    }

    @Override // com.corrodinggames.rts.game.units.p024d.AbstractC0503i, com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: m */
    public float mo2846m() {
        return 280.0f;
    }

    @Override // com.corrodinggames.rts.game.units.p024d.AbstractC0503i, com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: b */
    public float mo2930b(int i) {
        return 70.0f;
    }

    @Override // com.corrodinggames.rts.game.units.p024d.AbstractC0503i, com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: c */
    public float mo2883c(int i) {
        return 999.0f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: b */
    public boolean mo2929b(int i, float f) {
        return false;
    }

    @Override // com.corrodinggames.rts.game.units.p024d.AbstractC0503i, com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: l */
    public boolean mo3067l() {
        return true;
    }

    /* renamed from: a */
    public static void m3391a(ArrayList arrayList, int i) {
        arrayList.add(new C0220o());
        arrayList.add(new C0217l(EnumC0249ar.builder, 1.0f));
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: N */
    public ArrayList mo3131N() {
        return mo3392K().mo3563a(mo3038V());
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: a */
    public float mo3073a(AbstractC0244am abstractC0244am, float f, C0188f c0188f) {
        if (f > 2500.0f) {
            f = 2500.0f;
        }
        return super.mo3073a(abstractC0244am, f, c0188f);
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: bJ */
    public boolean mo3300bJ() {
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0244am, com.corrodinggames.rts.gameFramework.AbstractC1155w
    /* renamed from: e */
    public void mo434e(float f) {
        super.mo434e(f);
        C1152y.m471a(this, mo2846m());
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: s */
    public int mo2831s() {
        return 20;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: bp */
    public int mo2896bp() {
        return 35;
    }
}