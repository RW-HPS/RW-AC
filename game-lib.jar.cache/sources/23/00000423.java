package com.corrodinggames.rts.gameFramework.p030a;

import android.content.Context;
import com.corrodinggames.rts.C0067R;
import com.corrodinggames.rts.gameFramework.C0773f;
import com.corrodinggames.rts.gameFramework.EnumC1100u;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.utility.C1133j;
import java.util.ArrayList;

/* renamed from: com.corrodinggames.rts.gameFramework.a.e */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/a/e.class */
public class C0637e {

    /* renamed from: a */
    ArrayList f4067a = new ArrayList();

    /* renamed from: b */
    public boolean f4068b;

    /* renamed from: c */
    public static AbstractC0640h f4069c = new C0633a();

    /* renamed from: d */
    public static AbstractC0641i f4070d;

    /* renamed from: e */
    public static AbstractC0641i f4071e;

    /* renamed from: f */
    public static AbstractC0641i f4072f;

    /* renamed from: g */
    public static AbstractC0641i f4073g;

    /* renamed from: h */
    public static AbstractC0641i f4074h;

    /* renamed from: i */
    public static AbstractC0641i f4075i;

    /* renamed from: j */
    public static AbstractC0641i f4076j;

    /* renamed from: k */
    public static AbstractC0641i f4077k;

    /* renamed from: l */
    public static AbstractC0641i f4078l;

    /* renamed from: m */
    public static AbstractC0641i f4079m;

    /* renamed from: n */
    public static AbstractC0641i f4080n;

    /* renamed from: o */
    public static AbstractC0641i f4081o;

    /* renamed from: p */
    public static AbstractC0641i f4082p;

    /* renamed from: q */
    public static AbstractC0641i f4083q;

    /* renamed from: r */
    public static AbstractC0641i f4084r;

    /* renamed from: s */
    public static AbstractC0641i f4085s;

    /* renamed from: t */
    public static AbstractC0641i f4086t;

    /* renamed from: u */
    public static AbstractC0641i f4087u;

    /* renamed from: v */
    public static AbstractC0641i f4088v;

    /* renamed from: w */
    public static AbstractC0641i f4089w;

    /* renamed from: x */
    public static AbstractC0641i f4090x;

    /* renamed from: y */
    public static AbstractC0641i f4091y;

    /* renamed from: z */
    public static AbstractC0641i f4092z;

    /* renamed from: A */
    public static AbstractC0641i f4093A;

    /* renamed from: B */
    public static AbstractC0641i f4094B;

    /* renamed from: C */
    public static AbstractC0641i f4095C;

    /* renamed from: D */
    public static AbstractC0641i f4096D;

    /* renamed from: E */
    public static AbstractC0641i f4097E;

    /* renamed from: F */
    public static AbstractC0641i f4098F;

    /* renamed from: a */
    public boolean m2813a(AbstractC0641i abstractC0641i, float f) {
        if (this.f4067a.contains(abstractC0641i)) {
            return false;
        }
        this.f4067a.add(abstractC0641i);
        return true;
    }

    /* renamed from: a */
    public boolean m2816a() {
        GameEngine gameEngine = GameEngine.getGameEngine();
        return m2815a(gameEngine.settingsEngine.masterVolume * gameEngine.settingsEngine.gameVolume);
    }

    /* renamed from: a */
    public boolean m2815a(float f) {
        GameEngine gameEngine = GameEngine.getGameEngine();
        if (f < 0.01f || this.f4068b) {
            return false;
        }
        return gameEngine.settingsEngine.enableSounds;
    }

    /* renamed from: b */
    public static void m2808b() {
    }

    /* renamed from: a */
    public void m2814a(Context context) {
        f4069c.mo80a(context);
        f4071e = f4069c.mo81a(C0067R.raw.attack);
        f4071e.f4100d = 0.2f;
        f4070d = f4069c.mo81a(C0067R.raw.attack2);
        f4072f = f4069c.mo81a(C0067R.raw.move);
        f4073g = f4069c.mo81a(C0067R.raw.click);
        f4074h = f4069c.mo81a(C0067R.raw.click_add);
        f4075i = f4069c.mo81a(C0067R.raw.click_remove);
        f4076j = f4069c.mo81a(C0067R.raw.warning);
        f4077k = f4069c.mo81a(C0067R.raw.message);
        f4079m = f4069c.mo81a(C0067R.raw.missile_fire);
        f4080n = f4069c.mo81a(C0067R.raw.missile_hit);
        f4081o = f4069c.mo81a(C0067R.raw.unit_explode);
        f4082p = f4069c.mo81a(C0067R.raw.buiding_explode);
        f4083q = f4069c.mo81a(C0067R.raw.tank_firing);
        f4084r = f4069c.mo81a(C0067R.raw.cannon_firing);
        f4085s = f4069c.mo81a(C0067R.raw.gun_fire);
        f4090x = f4069c.mo81a(C0067R.raw.lighting_burst);
        f4091y = f4069c.mo81a(C0067R.raw.plasma_fire);
        f4092z = f4069c.mo81a(C0067R.raw.plasma_fire2);
        f4086t = f4069c.mo81a(C0067R.raw.firing3);
        f4087u = f4069c.mo81a(C0067R.raw.firing4);
        f4088v = f4069c.mo81a(C0067R.raw.large_gun_fire1);
        f4089w = f4069c.mo81a(C0067R.raw.large_gun_fire2);
        f4093A = f4069c.mo81a(C0067R.raw.bug_die);
        f4094B = f4069c.mo81a(C0067R.raw.bug_attack);
        f4078l = f4069c.mo81a(C0067R.raw.interface_error);
        f4095C = f4069c.mo81a(C0067R.raw.nuke_explode);
        f4096D = f4069c.mo81a(C0067R.raw.nuke_launch);
        f4097E = f4069c.mo81a(C0067R.raw.laser_deflect);
        f4098F = f4069c.mo81a(C0067R.raw.laser_deflect2);
        f4069c.mo82a();
    }

    /* renamed from: a */
    public AbstractC0641i m2810a(String str) {
        AbstractC0641i abstractC0641i = (AbstractC0641i) f4069c.f4099h.get(str);
        if (abstractC0641i == null) {
            throw new RuntimeException("Could not find sound:" + str);
        }
        return abstractC0641i;
    }

    /* renamed from: b */
    public void m2806b(AbstractC0641i abstractC0641i, float f) {
        GameEngine gameEngine = GameEngine.getGameEngine();
        float f2 = f * gameEngine.settingsEngine.masterVolume * gameEngine.settingsEngine.interfaceVolume * abstractC0641i.f4100d;
        if (!m2815a(f2) || f2 < 0.01d || !m2813a(abstractC0641i, f2)) {
            return;
        }
        if (gameEngine.f6298aq) {
            f2 /= 20.0f;
        }
        abstractC0641i.mo75a(f2, f2, 1, 0, 1.0f);
    }

    /* renamed from: c */
    public void m2804c(AbstractC0641i abstractC0641i, float f) {
        GameEngine gameEngine = GameEngine.getGameEngine();
        float f2 = f * gameEngine.settingsEngine.masterVolume * gameEngine.settingsEngine.gameVolume * abstractC0641i.f4100d;
        if (m2815a(f2)) {
            if (gameEngine.f6298aq) {
                f2 /= 20.0f;
            }
            if (!m2813a(abstractC0641i, f2)) {
                return;
            }
            abstractC0641i.mo75a(f2, f2, 1, 0, 1.0f);
        }
    }

    /* renamed from: a */
    public void m2812a(AbstractC0641i abstractC0641i, float f, float f2, float f3) {
        m2811a(abstractC0641i, f, 1.0f, f2, f3);
    }

    /* renamed from: a */
    public void m2811a(AbstractC0641i abstractC0641i, float f, float f2, float f3, float f4) {
        if (m2816a()) {
            GameEngine gameEngine = GameEngine.getGameEngine();
            if (gameEngine.f6298aq) {
                f /= 20.0f;
            }
            if (gameEngine.f6387cb.m2480j() && gameEngine.f6353bt > 1.5d) {
                f /= gameEngine.f6353bt;
            }
            float m2216a = C0773f.m2216a((int) (gameEngine.f6408cw + gameEngine.f6420cI), (int) (gameEngine.f6409cx + gameEngine.f6421cJ), f3, f4);
            float f5 = gameEngine.f6420cI * 1.72f;
            if (gameEngine.f6435cX < 0.5d) {
                f = f * 4.0f * gameEngine.f6435cX * gameEngine.f6435cX;
            }
            if (f <= 1.0f && !abstractC0641i.f4102f && m2216a > f5 * f5) {
                return;
            }
            float sqrt = (float) Math.sqrt(m2216a);
            float f6 = 1.0f;
            if (sqrt > gameEngine.f6420cI) {
                f6 = 1.0f - ((sqrt - gameEngine.f6420cI) / gameEngine.f6420cI);
            }
            float f7 = f6 * f;
            if (f7 <= 0.05d && !abstractC0641i.f4102f) {
                return;
            }
            if (f7 > 1.0f) {
                f7 = 1.0f;
            }
            float f8 = f7 * gameEngine.settingsEngine.masterVolume * gameEngine.settingsEngine.gameVolume * abstractC0641i.f4100d;
            if (!m2813a(abstractC0641i, f8)) {
                return;
            }
            abstractC0641i.mo75a(f8, f8, 1, 0, f2);
        }
    }

    /* renamed from: a */
    public AbstractC0641i m2809a(String str, C1133j c1133j, boolean z) {
        try {
            return f4069c.mo79a(str, c1133j, z);
        } catch (OutOfMemoryError e) {
            GameEngine.m1068a(EnumC1100u.gameSound, e);
            return C0638f.m2802b();
        }
    }

    /* renamed from: b */
    public AbstractC0641i m2805b(String str) {
        return C0638f.m2803a(str);
    }

    /* renamed from: b */
    public void m2807b(float f) {
        this.f4067a.clear();
    }
}