package com.corrodinggames.rts.gameFramework.p035d;

import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.RectF;
import com.corrodinggames.rts.game.PlayerData;
import com.corrodinggames.rts.game.p012b.C0173b;
import com.corrodinggames.rts.game.units.AbstractC0244am;
import com.corrodinggames.rts.game.units.AbstractC0629y;
import com.corrodinggames.rts.game.units.EnumC0249ar;
import com.corrodinggames.rts.game.units.InterfaceC0303as;
import com.corrodinggames.rts.gameFramework.C0773f;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.unitAction.C0966ag;
import com.corrodinggames.rts.gameFramework.utility.C1139o;
import java.util.Iterator;

/* renamed from: com.corrodinggames.rts.gameFramework.d.a */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/d/a.class */
public class C0756a {

    /* renamed from: a */
    float f4727a;

    /* renamed from: b */
    float f4728b;

    /* renamed from: c */
    public boolean f4729c;

    /* renamed from: d */
    public InterfaceC0303as f4730d;

    /* renamed from: e */
    public PlayerData f4731e;

    /* renamed from: g */
    public float f4732g;

    /* renamed from: h */
    public float f4733h;

    /* renamed from: i */
    public boolean f4734i;

    /* renamed from: j */
    public PlayerData f4735j;

    /* renamed from: k */
    public boolean f4736k;

    /* renamed from: l */
    public int f4737l;

    /* renamed from: m */
    public int f4738m;

    /* renamed from: n */
    public boolean f4739n;

    /* renamed from: o */
    public AbstractC0629y f4740o;

    /* renamed from: r */
    public int f4741r;

    /* renamed from: s */
    public float f4742s;

    /* renamed from: u */
    public boolean f4743u;

    /* renamed from: v */
    public AbstractC0244am f4744v;

    /* renamed from: D */
    static Paint f4745D;

    /* renamed from: w */
    public static C1139o f4746w = new C1139o();

    /* renamed from: x */
    static Point f4747x = new Point();

    /* renamed from: y */
    static RectF f4748y = new RectF();

    /* renamed from: z */
    static RectF f4749z = new RectF();

    /* renamed from: A */
    static RectF f4750A = new RectF();

    /* renamed from: E */
    static RectF f4751E = new RectF();

    /* renamed from: C */
    static Paint f4752C = new C0966ag();

    /* renamed from: f */
    public int f4753f = 1;

    /* renamed from: p */
    boolean f4754p = false;

    /* renamed from: q */
    public boolean f4755q = false;

    /* renamed from: t */
    public float f4756t = 0.04f;

    /* renamed from: B */
    Paint f4757B = new Paint();

    public C0756a() {
        f4746w.add(this);
        f4746w.m525a();
    }

    static {
        f4752C.m5228a(90, 0, 0, 255);
        f4752C.m5221a(Paint.Style.f220b);
        f4752C.m5231a(2.0f);
        f4745D = new C0966ag();
        f4745D.m5228a(40, 0, 0, 255);
        f4745D.m5221a(Paint.Style.f220b);
        f4745D.m5231a(2.0f);
    }

    /* renamed from: a */
    public static void m2409a() {
        f4746w.clear();
    }

    /* renamed from: a */
    public static void m2408a(float f) {
        Iterator it = f4746w.iterator();
        while (it.hasNext()) {
            ((C0756a) it.next()).m2400c(f);
        }
        f4746w.m525a();
    }

    /* renamed from: b */
    public static void m2401b(float f) {
        Object[] m520b = f4746w.m520b();
        int size = f4746w.size();
        for (int i = 0; i < size; i++) {
            ((C0756a) m520b[i]).m2399d(f);
        }
    }

    /* renamed from: a */
    public static boolean m2406a(PlayerData playerData, int i, int i2, int i3) {
        GameEngine gameEngine = GameEngine.getGameEngine();
        gameEngine.f6323bL.m4660a(i, i2);
        float f = gameEngine.f6323bL.f802T + gameEngine.f6323bL.f788p;
        float f2 = gameEngine.f6323bL.f803U + gameEngine.f6323bL.f789q;
        f4748y.m5158a(f, f2, f + 1.0f, f2 + 1.0f);
        return m2405a(playerData, f4748y, i3);
    }

    /* renamed from: a */
    public static boolean m2404a(PlayerData playerData, AbstractC0629y abstractC0629y, int i) {
        f4748y = abstractC0629y.m4247a(GameEngine.getGameEngine().f6323bL, f4748y);
        return m2405a(playerData, f4748y, i);
    }

    /* renamed from: a */
    public static boolean m2403a(AbstractC0629y abstractC0629y, AbstractC0629y abstractC0629y2) {
        C0173b c0173b = GameEngine.getGameEngine().f6323bL;
        f4748y = abstractC0629y.m4247a(c0173b, f4748y);
        f4749z = abstractC0629y2.m4247a(c0173b, f4749z);
        if (C0773f.m2198a(f4748y, f4749z)) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static boolean m2405a(PlayerData playerData, RectF rectF, int i) {
        C0173b c0173b = GameEngine.getGameEngine().f6323bL;
        RectF rectF2 = f4750A;
        Iterator it = f4746w.iterator();
        while (it.hasNext()) {
            C0756a c0756a = (C0756a) it.next();
            if (c0756a.f4735j == playerData && c0756a.f4739n && (i == -1 || i == c0756a.f4741r)) {
                AbstractC0244am m4245a = AbstractC0244am.m4245a(c0756a.f4730d);
                if (m4245a == null) {
                    GameEngine.m5460e("isTileRectOverBlueprint: Failed to get shared unit for: " + c0756a.f4730d);
                } else {
                    m4245a.f7172eo = c0756a.f4732g;
                    m4245a.f7173ep = c0756a.f4733h;
                    rectF2 = m4245a.m4247a(c0173b, rectF2);
                    if (C0773f.m2198a(rectF2, rectF)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* renamed from: a */
    public static C0756a m2407a(PlayerData playerData, float f, float f2) {
        Iterator it = f4746w.iterator();
        while (it.hasNext()) {
            C0756a c0756a = (C0756a) it.next();
            if (c0756a.f4735j == playerData && c0756a.f4739n) {
                float m2216a = C0773f.m2216a(c0756a.f4732g, c0756a.f4733h, f, f2);
                float f3 = AbstractC0244am.m4245a(c0756a.f4730d).f1626cj + 1.0f;
                if (f3 < 20.0f) {
                    f3 = 20.0f;
                }
                if (m2216a < f3 * f3) {
                    return c0756a;
                }
            }
        }
        return null;
    }

    /* renamed from: b */
    public boolean m2402b() {
        if (this.f4739n) {
            if (this.f4740o == null || this.f4740o.f1612bV || !EnumC0249ar.m4178a(this.f4730d, this.f4732g, this.f4733h, 0.0f, 0.0f, this.f4731e)) {
                return false;
            }
            return true;
        } else if (this.f4744v == null || this.f4744v.m4211cf()) {
            return false;
        } else {
            return true;
        }
    }

    /* renamed from: c */
    public void m2400c(float f) {
        this.f4727a += 1.0f;
        this.f4728b += f;
        boolean z = false;
        this.f4742s = C0773f.m2218a(this.f4742s, this.f4756t * f);
        if (this.f4739n) {
            if (this.f4727a > 6.0f) {
                this.f4727a = 0.0f;
                boolean m3005a = this.f4740o.m3005a(this.f4730d, this.f4732g, this.f4733h);
                if (!this.f4754p && m3005a) {
                    this.f4754p = true;
                }
                if (!m3005a) {
                    if (this.f4754p) {
                        z = true;
                    } else if (this.f4728b > 180.0f) {
                        z = true;
                    }
                }
                if (!m2402b()) {
                    z = true;
                }
            }
        } else if (this.f4727a > 2.0f && !m2402b()) {
            z = true;
        }
        if (z) {
            this.f4729c = true;
            f4746w.m518b(this);
        }
    }

    /* renamed from: d */
    public void m2399d(float f) {
        AbstractC0244am m4223c;
        Rect mo3395cd;
        GameEngine gameEngine = GameEngine.getGameEngine();
        if (gameEngine.f6312bs != this.f4735j || !gameEngine.f6465cO.m5152b(this.f4732g, this.f4733h)) {
            return;
        }
        if (this.f4755q && !this.f4754p) {
            return;
        }
        float f2 = 0.0f;
        float f3 = this.f4732g;
        float f4 = this.f4733h;
        boolean z = false;
        boolean z2 = false;
        if (this.f4739n) {
            z2 = true;
        } else {
            z = true;
        }
        boolean z3 = true;
        if (this.f4734i) {
            z3 = false;
        }
        if (z2) {
            float f5 = this.f4742s;
            if (f5 <= 0.0f) {
                f2 = 0.0f;
            } else if (this.f4742s < 1.0f) {
                f2 = 1.0f - C0773f.m2107k(f5 * 90.0f);
            } else {
                f2 = 1.0f;
            }
        }
        if (z2 && this.f4742s < 1.0f && (m4223c = AbstractC0244am.m4223c(this.f4730d)) != null && m4223c.mo3397bI() && (mo3395cd = m4223c.mo3395cd()) != null) {
            f4751E.m5157a(mo3395cd);
            f4751E.f235b *= gameEngine.f6323bL.f787o;
            f4751E.f237d *= gameEngine.f6323bL.f787o;
            f4751E.f234a *= gameEngine.f6323bL.f786n;
            f4751E.f236c *= gameEngine.f6323bL.f786n;
            f4751E.m5159a(-(m4223c.mo3319cZ() - gameEngine.f6323bL.f788p), -(m4223c.mo3318da() - gameEngine.f6323bL.f789q));
            C0773f.m2199a(f4751E, (gameEngine.f6323bL.f788p - 3) + (f2 * 5.0f));
            f4751E.m5159a(this.f4732g - gameEngine.f6357cw, (this.f4733h - gameEngine.f6358cx) - 0.0f);
            float f6 = 3.0f + (f2 * 7.0f);
            Paint paint = f4752C;
            if (this.f4742s <= 0.0f) {
                paint = f4745D;
            }
            gameEngine.f6326bO.mo226a(f4751E.f234a - f6, f4751E.f235b, f4751E.f236c + f6, f4751E.f235b, paint);
            gameEngine.f6326bO.mo226a(f4751E.f234a - f6, f4751E.f237d, f4751E.f236c + f6, f4751E.f237d, paint);
            gameEngine.f6326bO.mo226a(f4751E.f234a, f4751E.f235b - f6, f4751E.f234a, f4751E.f237d + f6, paint);
            gameEngine.f6326bO.mo226a(f4751E.f236c, f4751E.f235b - f6, f4751E.f236c, f4751E.f237d + f6, paint);
        }
        float f7 = 0.0f;
        if (z2) {
            f7 = 0.0f - (10.0f * f2);
        }
        EnumC0249ar.m4176a(this.f4730d, f3, f4 + f7, 0.0f, 0.0f, this.f4731e, 1.0f, 500.0f, z, z2, this.f4753f, z3, null);
    }
}