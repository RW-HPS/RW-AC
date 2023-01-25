package com.corrodinggames.rts.game.units.p024d;

import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import com.corrodinggames.rts.C0067R;
import com.corrodinggames.rts.game.PlayerData;
import com.corrodinggames.rts.game.p012b.C0173b;
import com.corrodinggames.rts.game.p012b.C0180g;
import com.corrodinggames.rts.game.units.AbstractC0244am;
import com.corrodinggames.rts.game.units.AbstractC0629y;
import com.corrodinggames.rts.game.units.EnumC0233ab;
import com.corrodinggames.rts.game.units.EnumC0246ao;
import com.corrodinggames.rts.game.units.EnumC0249ar;
import com.corrodinggames.rts.game.units.InterfaceC0303as;
import com.corrodinggames.rts.game.units.custom.C0407be;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.net.GameInputStream;
import com.corrodinggames.rts.gameFramework.net.GameOutputStream;
import com.corrodinggames.rts.gameFramework.p035d.C0756a;
import com.corrodinggames.rts.gameFramework.unitAction.C0970e;
import java.util.Iterator;

/* renamed from: com.corrodinggames.rts.game.units.d.d */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/d/d.class */
public abstract class AbstractC0493d extends AbstractC0629y {

    /* renamed from: m */
    C0970e f3456m;

    /* renamed from: n */
    public Rect f3457n;

    /* renamed from: o */
    public Rect f3458o;

    /* renamed from: p */
    public static C0970e f3459p = null;

    /* renamed from: q */
    public static C0970e[] f3460q = new C0970e[10];

    /* renamed from: r */
    int f3461r;

    /* renamed from: s */
    int f3462s;

    /* renamed from: ds */
    public boolean mo3381ds() {
        return false;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y, com.corrodinggames.rts.game.units.AbstractC0244am, com.corrodinggames.rts.gameFramework.AbstractC0674az, com.corrodinggames.rts.gameFramework.AbstractC1155w, com.corrodinggames.rts.gameFramework.AbstractC0741bq
    /* renamed from: a */
    public void mo442a(GameOutputStream gameOutputStream) {
        gameOutputStream.writeInt(this.f3461r);
        super.mo442a(gameOutputStream);
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y, com.corrodinggames.rts.game.units.AbstractC0244am, com.corrodinggames.rts.gameFramework.AbstractC0674az, com.corrodinggames.rts.gameFramework.AbstractC1155w
    /* renamed from: a */
    public void mo441a(GameInputStream gameInputStream) {
        if (gameInputStream.m1311b() >= 15) {
            mo3377R(gameInputStream.readInt());
        }
        super.mo441a(gameInputStream);
    }

    /* renamed from: a */
    public static boolean m3402a(InterfaceC0303as interfaceC0303as, float f, float f2, PlayerData playerData) {
        GameEngine gameEngine = GameEngine.getGameEngine();
        AbstractC0629y abstractC0629y = (AbstractC0629y) AbstractC0244am.m4245a(interfaceC0303as);
        gameEngine.f6323bL.m4629b(f, f2);
        abstractC0629y.f7172eo = gameEngine.f6323bL.f802T + abstractC0629y.mo3319cZ();
        abstractC0629y.f7173ep = gameEngine.f6323bL.f803U + abstractC0629y.mo3319cZ();
        abstractC0629y.mo2928b(playerData);
        return abstractC0629y.mo2882c((PlayerData) null);
    }

    /* renamed from: R */
    public void mo3377R(int i) {
        this.f3461r = i;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: d */
    public C0970e mo2876d(int i) {
        return null;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: v */
    public C0970e mo3066v() {
        if (this.f1614bX.site == -1) {
            return null;
        }
        return f3460q[this.f1614bX.m4454R()];
    }

    /* renamed from: dt */
    public static void m3394dt() {
        f3459p = GameEngine.getGameEngine().f6326bO.mo222a(C0067R.drawable.unit_icon_building);
        f3460q = PlayerData.m4432a(f3459p);
    }

    public AbstractC0493d(boolean z) {
        super(z);
        this.f3457n = new Rect();
        this.f3458o = new Rect();
        this.f3461r = 1;
        this.f3462s = 0;
        this.f1623cg = -90.0f;
        this.f1610bT = false;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: f_ */
    public void mo3070f_() {
        this.f1610bT = false;
    }

    /* renamed from: L */
    public boolean mo3296L() {
        m3014a(EnumC0233ab.large);
        return false;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: e */
    public boolean mo3071e() {
        GameEngine.getGameEngine().f6332bU.m1176a(this);
        if (this.f1629cm < 1.0f) {
            m3014a(EnumC0233ab.verysmall);
            return false;
        }
        this.f3462s = 0;
        return mo3296L();
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: cd */
    public Rect mo3395cd() {
        return this.f3458o;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: cc */
    public Rect mo3396cc() {
        return this.f3457n;
    }

    /* renamed from: a */
    public static boolean m3401a(AbstractC0629y abstractC0629y, InterfaceC0303as interfaceC0303as, EnumC0246ao enumC0246ao, int i, int i2, int i3) {
        GameEngine gameEngine = GameEngine.getGameEngine();
        C0173b c0173b = gameEngine.f6323bL;
        if (!c0173b.m4620c(i, i2)) {
            return false;
        }
        boolean z = false;
        if (c0173b.f842E && gameEngine.f6312bs.f1339N != null) {
            if (!c0173b.f844G && gameEngine.f6312bs.f1339N[i][i2] == 10) {
                return false;
            }
            z = gameEngine.f6312bs.f1339N[i][i2] >= 5;
        }
        if (m3400a(abstractC0629y, interfaceC0303as, enumC0246ao, i, i2, z)) {
            if (interfaceC0303as.mo3499p()) {
                C0180g m4610e = c0173b.m4610e(i, i2);
                if (m4610e != null && m4610e.f923i) {
                    return true;
                }
                return false;
            } else if (C0756a.m2406a(gameEngine.f6312bs, i, i2, i3)) {
                return false;
            } else {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public static boolean m3400a(AbstractC0629y abstractC0629y, InterfaceC0303as interfaceC0303as, EnumC0246ao enumC0246ao, int i, int i2, boolean z) {
        return m3399a(abstractC0629y, interfaceC0303as, enumC0246ao, i, i2, z, null) == null;
    }

    /* renamed from: a */
    public static String m3399a(AbstractC0629y abstractC0629y, InterfaceC0303as interfaceC0303as, EnumC0246ao enumC0246ao, int i, int i2, boolean z, PlayerData playerData) {
        String m3905a;
        GameEngine gameEngine = GameEngine.getGameEngine();
        if (!gameEngine.f6323bL.m4620c(i, i2)) {
            return "{0}";
        }
        C0407be mo3497q = interfaceC0303as.mo3497q();
        if (mo3497q != null && (m3905a = mo3497q.m3905a(abstractC0629y, i, i2)) != null) {
            return m3905a;
        }
        if (interfaceC0303as == EnumC0249ar.seaFactory || enumC0246ao == EnumC0246ao.f1712e) {
            if (!gameEngine.f6332bU.m1175a(gameEngine.f6332bU.f6234A, i, i2)) {
                return null;
            }
            return "{3}";
        }
        C0180g m4610e = gameEngine.f6323bL.m4610e(i, i2);
        if (m4610e != null && m4610e.f923i) {
            if (interfaceC0303as.mo3499p()) {
                return null;
            }
            return "{0}";
        } else if (enumC0246ao == EnumC0246ao.f1711d) {
            return null;
        } else {
            if (enumC0246ao == EnumC0246ao.f1713f) {
                if (!gameEngine.f6332bU.m1175a(gameEngine.f6332bU.f6236C, i, i2)) {
                    return null;
                }
                return "{0}";
            } else if (enumC0246ao == EnumC0246ao.f1714g) {
                if (!gameEngine.f6332bU.m1175a(gameEngine.f6332bU.f6237D, i, i2)) {
                    return null;
                }
                return "{0}";
            } else if (enumC0246ao == EnumC0246ao.f1715h) {
                if (!gameEngine.f6332bU.m1175a(gameEngine.f6332bU.f6238E, i, i2)) {
                    return null;
                }
                return "{0}";
            } else if (gameEngine.f6332bU.m1174a(gameEngine.f6332bU.f6233z, i, i2, z)) {
                boolean z2 = false;
                if (playerData != null && !gameEngine.f6323bL.m4659a(i, i2, playerData)) {
                    z2 = true;
                }
                if (!z2) {
                    return "{0}";
                }
                return null;
            } else {
                return null;
            }
        }
    }

    /* renamed from: b */
    public static AbstractC0244am m3398b(int i, int i2) {
        GameEngine gameEngine = GameEngine.getGameEngine();
        gameEngine.f6323bL.m4660a(i, i2);
        float f = gameEngine.f6323bL.f802T + gameEngine.f6323bL.f788p;
        float f2 = gameEngine.f6323bL.f803U + gameEngine.f6323bL.f789q;
        Iterator it = gameEngine.f6340cc.m3200b(f, f2, 0.0f).iterator();
        while (it.hasNext()) {
            AbstractC0244am abstractC0244am = (AbstractC0244am) it.next();
            if (abstractC0244am.mo3397bI() && !abstractC0244am.f1612bV && abstractC0244am.m4225c(f, f2, 0.0f)) {
                return abstractC0244am;
            }
        }
        return null;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: a */
    public void mo3021a(int i) {
    }

    /* renamed from: g */
    public static AbstractC0244am m3393g(InterfaceC0303as interfaceC0303as) {
        if (interfaceC0303as == null) {
            throw new RuntimeException("type is null");
        }
        return interfaceC0303as.mo3564a();
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: I */
    public boolean mo3049I() {
        return false;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: h */
    public EnumC0246ao mo3069h() {
        return EnumC0246ao.f1708a;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: i */
    public boolean mo3068i() {
        return false;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: Q */
    public boolean mo3074Q() {
        return false;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: z */
    public float mo2822z() {
        return 0.0f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: A */
    public float mo3065A() {
        return 0.0f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: b_ */
    public boolean mo2912b_() {
        return false;
    }

    /* renamed from: f */
    public Paint mo3285f() {
        int m5243a;
        GameEngine gameEngine = GameEngine.getGameEngine();
        PorterDuffColorFilter porterDuffColorFilter = null;
        if (this.f1629cm < 1.0f) {
            m5243a = Color.m5243a((int) (40.0f + (this.f1629cm * 200.0f)), 140, 255, 140);
            porterDuffColorFilter = f4008aX;
        } else {
            m5243a = Color.m5243a(255, 255, 255, 255);
        }
        if (this.f1632cp) {
            if (this.f1635cs) {
                m5243a = Color.m5243a(200, 20, 255, 20);
                porterDuffColorFilter = f4009aY;
            }
            if (this.f1636ct) {
                m5243a = Color.m5243a(200, 255, 20, 20);
                porterDuffColorFilter = f4010aZ;
            }
            if (this.f1633cq) {
                m5243a = Color.m5243a(70, 70, 70, 245);
                porterDuffColorFilter = f4011ba;
                if (this.f1636ct) {
                    m5243a = Color.m5243a(70, 255, 20, 20);
                    porterDuffColorFilter = f4010aZ;
                }
            }
            if (this.f1634cr) {
                m5243a = Color.m5243a(150, 100, 100, 100);
            }
        }
        boolean z = gameEngine.settingsEngine.renderAntiAlias;
        if (!mo3595dk()) {
            z = false;
            if (gameEngine.f6470cX < 1.0f) {
                z = true;
            }
        }
        if (this.f1631co) {
            z = EnumC0249ar.f1798ag;
        }
        return m3018a(m5243a, porterDuffColorFilter, z);
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y, com.corrodinggames.rts.game.units.AbstractC0244am, com.corrodinggames.rts.gameFramework.AbstractC1155w
    /* renamed from: c */
    public boolean mo438c(float f) {
        GameEngine gameEngine = GameEngine.getGameEngine();
        int i = this.f3462s * this.f4260es;
        RectF cF = mo3389cF();
        f1690dv.m5172a(i, 0, i + this.f4260es, 0 + this.f4261et);
        gameEngine.f6326bO.mo193a(this.f3917M, f1690dv, cF, mo3285f());
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y, com.corrodinggames.rts.game.units.AbstractC0244am, com.corrodinggames.rts.gameFramework.AbstractC1155w
    /* renamed from: d */
    public void mo437d(float f) {
        super.mo437d(f);
        if (this.f3456m == null) {
            return;
        }
        GameEngine gameEngine = GameEngine.getGameEngine();
        if (mo3381ds()) {
            gameEngine.f6326bO.mo160b(this.f3456m, (this.f7172eo - ((int) (this.f3456m.f6624t + 0.1f))) - gameEngine.f6357cw, (this.f7173ep - ((int) (this.f3456m.f6625u + 0.1f))) - gameEngine.f6358cx, mo3285f());
            return;
        }
        RectF cF = mo3389cF();
        f1690dv.m5172a(0, 0, 0 + this.f4260es, 0 + this.f4261et);
        gameEngine.f6326bO.mo193a(this.f3456m, f1690dv, cF, mo3285f());
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: bI */
    public boolean mo3397bI() {
        return true;
    }
}