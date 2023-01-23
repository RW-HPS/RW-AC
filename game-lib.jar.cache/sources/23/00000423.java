package com.corrodinggames.rts.gameFramework.a;

import android.content.Context;
import com.corrodinggames.rts.R;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.u;
import com.corrodinggames.rts.gameFramework.utility.j;
import java.util.ArrayList;

/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/a/e.class */
public class e {

    /* renamed from: a  reason: collision with root package name */
    ArrayList f397a = new ArrayList();
    public boolean b;
    public static h c = new a();
    public static i d;
    public static i e;
    public static i f;
    public static i g;
    public static i h;
    public static i i;
    public static i j;
    public static i k;
    public static i l;
    public static i m;
    public static i n;
    public static i o;
    public static i p;
    public static i q;
    public static i r;
    public static i s;
    public static i t;
    public static i u;
    public static i v;
    public static i w;
    public static i x;
    public static i y;
    public static i z;
    public static i A;
    public static i B;
    public static i C;
    public static i D;
    public static i E;
    public static i F;

    public boolean a(i iVar, float f2) {
        if (this.f397a.contains(iVar)) {
            return false;
        }
        this.f397a.add(iVar);
        return true;
    }

    public boolean a() {
        GameEngine gameEngine = GameEngine.getGameEngine();
        return a(gameEngine.settingsEngine.masterVolume * gameEngine.settingsEngine.gameVolume);
    }

    public boolean a(float f2) {
        GameEngine gameEngine = GameEngine.getGameEngine();
        if (f2 < 0.01f || this.b) {
            return false;
        }
        return gameEngine.settingsEngine.enableSounds;
    }

    public static void b() {
    }

    public void a(Context context) {
        c.a(context);
        e = c.a(R.raw.attack);
        e.d = 0.2f;
        d = c.a(R.raw.attack2);
        f = c.a(R.raw.move);
        g = c.a(R.raw.click);
        h = c.a(R.raw.click_add);
        i = c.a(R.raw.click_remove);
        j = c.a(R.raw.warning);
        k = c.a(R.raw.message);
        m = c.a(R.raw.missile_fire);
        n = c.a(R.raw.missile_hit);
        o = c.a(R.raw.unit_explode);
        p = c.a(R.raw.buiding_explode);
        q = c.a(R.raw.tank_firing);
        r = c.a(R.raw.cannon_firing);
        s = c.a(R.raw.gun_fire);
        x = c.a(R.raw.lighting_burst);
        y = c.a(R.raw.plasma_fire);
        z = c.a(R.raw.plasma_fire2);
        t = c.a(R.raw.firing3);
        u = c.a(R.raw.firing4);
        v = c.a(R.raw.large_gun_fire1);
        w = c.a(R.raw.large_gun_fire2);
        A = c.a(R.raw.bug_die);
        B = c.a(R.raw.bug_attack);
        l = c.a(R.raw.interface_error);
        C = c.a(R.raw.nuke_explode);
        D = c.a(R.raw.nuke_launch);
        E = c.a(R.raw.laser_deflect);
        F = c.a(R.raw.laser_deflect2);
        c.a();
    }

    public i a(String str) {
        i iVar = (i) c.h.get(str);
        if (iVar == null) {
            throw new RuntimeException("Could not find sound:" + str);
        }
        return iVar;
    }

    public void b(i iVar, float f2) {
        GameEngine gameEngine = GameEngine.getGameEngine();
        float f3 = f2 * gameEngine.settingsEngine.masterVolume * gameEngine.settingsEngine.interfaceVolume * iVar.d;
        if (!a(f3) || f3 < 0.01d || !a(iVar, f3)) {
            return;
        }
        if (gameEngine.aq) {
            f3 /= 20.0f;
        }
        iVar.a(f3, f3, 1, 0, 1.0f);
    }

    public void c(i iVar, float f2) {
        GameEngine gameEngine = GameEngine.getGameEngine();
        float f3 = f2 * gameEngine.settingsEngine.masterVolume * gameEngine.settingsEngine.gameVolume * iVar.d;
        if (a(f3)) {
            if (gameEngine.aq) {
                f3 /= 20.0f;
            }
            if (!a(iVar, f3)) {
                return;
            }
            iVar.a(f3, f3, 1, 0, 1.0f);
        }
    }

    public void a(i iVar, float f2, float f3, float f4) {
        a(iVar, f2, 1.0f, f3, f4);
    }

    public void a(i iVar, float f2, float f3, float f4, float f5) {
        if (a()) {
            GameEngine gameEngine = GameEngine.getGameEngine();
            if (gameEngine.aq) {
                f2 /= 20.0f;
            }
            if (gameEngine.cb.j() && gameEngine.bt > 1.5d) {
                f2 /= gameEngine.bt;
            }
            float a2 = com.corrodinggames.rts.gameFramework.f.a((int) (gameEngine.cw + gameEngine.cI), (int) (gameEngine.cx + gameEngine.cJ), f4, f5);
            float f6 = gameEngine.cI * 1.72f;
            if (gameEngine.cX < 0.5d) {
                f2 = f2 * 4.0f * gameEngine.cX * gameEngine.cX;
            }
            if (f2 <= 1.0f && !iVar.f && a2 > f6 * f6) {
                return;
            }
            float sqrt = (float) Math.sqrt(a2);
            float f7 = 1.0f;
            if (sqrt > gameEngine.cI) {
                f7 = 1.0f - ((sqrt - gameEngine.cI) / gameEngine.cI);
            }
            float f8 = f7 * f2;
            if (f8 <= 0.05d && !iVar.f) {
                return;
            }
            if (f8 > 1.0f) {
                f8 = 1.0f;
            }
            float f9 = f8 * gameEngine.settingsEngine.masterVolume * gameEngine.settingsEngine.gameVolume * iVar.d;
            if (!a(iVar, f9)) {
                return;
            }
            iVar.a(f9, f9, 1, 0, f3);
        }
    }

    public i a(String str, j jVar, boolean z2) {
        try {
            return c.a(str, jVar, z2);
        } catch (OutOfMemoryError e2) {
            GameEngine.a(u.gameSound, e2);
            return f.b();
        }
    }

    public i b(String str) {
        return f.a(str);
    }

    public void b(float f2) {
        this.f397a.clear();
    }
}