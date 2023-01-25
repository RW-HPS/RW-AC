package com.corrodinggames.rts.gameFramework.p035d;

import android.graphics.Paint;
import android.graphics.RectF;
import com.corrodinggames.rts.C0067R;
import com.corrodinggames.rts.gameFramework.C0773f;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.unitAction.C0966ag;
import com.corrodinggames.rts.gameFramework.unitAction.C0970e;

/* renamed from: com.corrodinggames.rts.gameFramework.d.b */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/d/b.class */
public class C0757b {

    /* renamed from: a */
    boolean f4758a = false;

    /* renamed from: b */
    C0970e f4759b = null;

    /* renamed from: c */
    Paint f4760c = new C0966ag();

    /* renamed from: d */
    RectF f4761d = new RectF();

    /* renamed from: e */
    float f4762e = 0.0f;

    /* renamed from: f */
    float f4763f = 0.0f;

    /* renamed from: a */
    public boolean m2398a() {
        return GameEngine.getGameEngine().settingsEngine.renderClouds;
    }

    /* renamed from: b */
    public void m2396b() {
        this.f4759b = GameEngine.getGameEngine().f6374bO.mo216a(C0067R.drawable.noise, false);
        this.f4758a = true;
    }

    /* renamed from: a */
    public void m2397a(float f) {
        if (!m2398a()) {
            return;
        }
        if (!this.f4758a) {
            m2396b();
        }
        this.f4762e += 0.2f * f;
        this.f4763f += 0.07f * f;
        this.f4762e %= this.f4759b.mo387m();
        this.f4763f %= this.f4759b.mo388l();
    }

    /* renamed from: b */
    public void m2395b(float f) {
        if (!m2398a()) {
            return;
        }
        if (!this.f4758a) {
            m2396b();
        }
        GameEngine gameEngine = GameEngine.getGameEngine();
        gameEngine.f6374bO.mo138i();
        gameEngine.f6374bO.mo229a(3.0f, 3.0f);
        float m2126f = (int) C0773f.m2126f((-gameEngine.f6408cw) / 3.0f, 0.0f);
        float m2126f2 = (int) C0773f.m2126f((-gameEngine.f6409cx) / 3.0f, 0.0f);
        this.f4761d.m5152a(m2126f, m2126f2, ((int) (gameEngine.f6412cA / 3.0f)) + 1, ((int) (gameEngine.f6413cB / 3.0f)) + 1);
        this.f4760c.m5200b(-16777216);
        this.f4760c.m5195c(40);
        gameEngine.f6374bO.mo192a(this.f4759b, this.f4761d, this.f4760c, (gameEngine.f6408cw / 3.0f) + m2126f + this.f4762e, (gameEngine.f6409cx / 3.0f) + m2126f2 + this.f4763f, 0, 0);
        gameEngine.f6374bO.mo137j();
    }
}