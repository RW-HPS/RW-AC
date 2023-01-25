package com.corrodinggames.rts.game.units;

import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.PointF;
import com.corrodinggames.rts.game.C0188f;
import com.corrodinggames.rts.gameFramework.C0773f;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.net.GameInputStream;
import com.corrodinggames.rts.gameFramework.net.GameOutputStream;
import com.corrodinggames.rts.gameFramework.p035d.C0760e;
import com.corrodinggames.rts.gameFramework.p035d.EnumC0759d;
import com.corrodinggames.rts.gameFramework.p035d.EnumC0763h;
import com.corrodinggames.rts.gameFramework.unitAction.C0960aa;
import com.corrodinggames.rts.gameFramework.utility.SlickToAndroidKeycodes;
import java.util.Iterator;

/* renamed from: com.corrodinggames.rts.game.units.f */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/f.class */
public class C0540f extends AbstractC0628x {

    /* renamed from: a */
    public float f3717a;

    /* renamed from: b */
    public float f3718b;

    /* renamed from: c */
    public float f3719c;

    /* renamed from: d */
    public float f3720d;

    /* renamed from: e */
    public float f3721e;

    /* renamed from: f */
    public float f3722f;

    /* renamed from: g */
    public boolean f3723g;

    /* renamed from: h */
    public float f3724h;

    /* renamed from: i */
    public boolean f3725i;

    /* renamed from: j */
    public float f3726j;

    /* renamed from: k */
    static Paint f3727k = new Paint();

    /* renamed from: l */
    static Paint f3728l;

    /* renamed from: m */
    static Paint f3729m;

    /* renamed from: n */
    static Paint f3730n;

    /* renamed from: o */
    static Paint f3731o;

    /* renamed from: p */
    static Paint f3732p;

    /* renamed from: q */
    boolean f3733q;

    /* renamed from: r */
    static final PointF f3734r;

    static {
        f3727k.m5225a(10.0f);
        f3727k.m5200b(Color.m5237a(100, 160, 0, 0));
        f3727k.m5215a(Paint.Style.STROKE);
        f3729m = new Paint();
        f3729m.m5214a(f3727k);
        f3729m.m5200b(Color.m5237a(SlickToAndroidKeycodes.AndroidCodes.KEYCODE_STB_INPUT, 160, 0, 0));
        f3728l = new Paint();
        f3728l.m5225a(2.0f);
        f3728l.m5200b(Color.m5237a(100, 160, 0, 0));
        f3728l.m5215a(Paint.Style.STROKE);
        f3730n = new Paint();
        f3730n.m5214a(f3728l);
        f3730n.m5200b(Color.m5237a(SlickToAndroidKeycodes.AndroidCodes.KEYCODE_STB_INPUT, 160, 0, 0));
        f3731o = new Paint();
        f3731o.m5225a(2.0f);
        f3731o.m5200b(Color.m5237a(50, 255, 255, 255));
        f3731o.m5215a(Paint.Style.STROKE);
        f3732p = new Paint(f3731o);
        f3734r = new PointF();
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y, com.corrodinggames.rts.game.units.AbstractC0244am, com.corrodinggames.rts.gameFramework.AbstractC0674az, com.corrodinggames.rts.gameFramework.AbstractC1155w, com.corrodinggames.rts.gameFramework.AbstractC0741bq
    /* renamed from: a */
    public void mo442a(GameOutputStream gameOutputStream) {
        gameOutputStream.writeByte(0);
        gameOutputStream.writeFloat(this.f3717a);
        gameOutputStream.writeFloat(this.f3718b);
        gameOutputStream.writeFloat(this.f3719c);
        gameOutputStream.writeFloat(this.f3720d);
        gameOutputStream.writeFloat(this.f3721e);
        gameOutputStream.writeFloat(this.f3722f);
        gameOutputStream.writeBoolean(this.f3723g);
        gameOutputStream.writeFloat(this.f3724h);
        super.mo442a(gameOutputStream);
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y, com.corrodinggames.rts.game.units.AbstractC0244am, com.corrodinggames.rts.gameFramework.AbstractC0674az, com.corrodinggames.rts.gameFramework.AbstractC1155w
    /* renamed from: a */
    public void mo441a(GameInputStream gameInputStream) {
        gameInputStream.readByte();
        this.f3717a = gameInputStream.readFloat();
        this.f3718b = gameInputStream.readFloat();
        this.f3719c = gameInputStream.readFloat();
        this.f3720d = gameInputStream.readFloat();
        this.f3721e = gameInputStream.readFloat();
        this.f3722f = gameInputStream.readFloat();
        this.f3723g = gameInputStream.readBoolean();
        this.f3724h = gameInputStream.readFloat();
        super.mo441a(gameInputStream);
        if (!this.f1612bV) {
            GameEngine.getGameEngine().f6382bW.m1768a(this);
        }
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: b */
    public EnumC0249ar mo1747r() {
        if (this.f3733q) {
            return EnumC0249ar.zoneMarker;
        }
        return EnumC0249ar.damagingBorder;
    }

    /* renamed from: d_ */
    public static void m3219d_() {
        GameEngine.getGameEngine();
    }

    public C0540f(boolean z) {
        super(z);
        this.f3717a = 2000.0f;
        this.f3718b = 0.0f;
        this.f3719c = 0.0f;
        this.f3720d = 2000.0f;
        this.f3723g = true;
        this.f3724h = 1.0f;
    }

    /* renamed from: f */
    public C0540f m3218f() {
        Iterator it = AbstractC0244am.m4235bF().iterator();
        while (it.hasNext()) {
            AbstractC0244am abstractC0244am = (AbstractC0244am) it.next();
            if ((abstractC0244am instanceof C0540f) && !abstractC0244am.f1612bV && abstractC0244am != this) {
                C0540f c0540f = (C0540f) abstractC0244am;
                if (c0540f.f3733q == this.f3733q) {
                    return c0540f;
                }
            }
        }
        return null;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0628x, com.corrodinggames.rts.game.units.AbstractC0629y, com.corrodinggames.rts.game.units.AbstractC0244am, com.corrodinggames.rts.gameFramework.AbstractC1155w
    /* renamed from: a */
    public void mo446a(float f) {
        super.mo446a(f);
        if (this.f1612bV) {
            return;
        }
        if (this.f3723g) {
            this.f3723g = false;
            C0540f m3218f = m3218f();
            if (m3218f != null) {
                m3218f.f3721e = this.f7173eo;
                m3218f.f3722f = this.f7174ep;
                m3218f.f3720d = this.f3720d;
                m4210ci();
            } else {
                this.f3721e = this.f7173eo;
                this.f3722f = this.f7174ep;
                if (!this.f3733q) {
                    GameEngine.m5777e("DamagingBorder created " + this.f3721e + "," + this.f3722f + " size:" + this.f3720d);
                }
                GameEngine.getGameEngine().f6382bW.m1768a(this);
            }
        }
        if (this.f3733q) {
            this.f3717a = this.f3720d;
            this.f7173eo = this.f3721e;
            this.f7174ep = this.f3722f;
        } else if (this.f3717a > this.f3720d) {
            this.f3718b += 2.5E-4f * f;
            this.f3717a -= this.f3718b;
            this.f3725i = true;
            float m2170b = C0773f.m2170b(this.f7173eo, this.f7174ep, this.f3721e, this.f3722f);
            float m2138d = C0773f.m2138d(this.f7173eo, this.f7174ep, this.f3721e, this.f3722f);
            if (m2170b > 1.0f) {
                float f2 = this.f3718b;
                if (f2 > m2170b * f) {
                    f2 = m2170b * f;
                }
                this.f7173eo += f2 * C0773f.m2107k(m2138d) * f;
                this.f7174ep += f2 * C0773f.m2110j(m2138d) * f;
            }
        } else {
            this.f3725i = false;
            this.f7173eo = (float) (this.f7173eo + ((this.f3721e - this.f7173eo) * 0.003d * f));
            this.f7174ep = (float) (this.f7174ep + ((this.f3722f - this.f7174ep) * 0.003d * f));
        }
        if (this.f3717a < this.f3720d) {
            this.f3717a = this.f3720d;
            this.f3718b = 0.0f;
        }
        if (this.f3720d < 0.0f) {
            m4210ci();
            return;
        }
        this.f3719c -= f;
        if (!this.f1612bV && this.f3719c <= 0.0f && !this.f3733q) {
            this.f3719c = 2.0f;
            float m2107k = this.f3717a * C0773f.m2107k(45.0f);
            float f3 = this.f7173eo - m2107k;
            float f4 = this.f7173eo + m2107k;
            float f5 = this.f7174ep - m2107k;
            float f6 = this.f7174ep + m2107k;
            float f7 = this.f3717a * this.f3717a;
            Iterator it = AbstractC0244am.m4235bF().iterator();
            while (it.hasNext()) {
                AbstractC0244am abstractC0244am = (AbstractC0244am) it.next();
                if (abstractC0244am.f7173eo <= f3 || abstractC0244am.f7173eo >= f4 || abstractC0244am.f7174ep <= f5 || abstractC0244am.f7174ep >= f6) {
                    if (C0773f.m2216a(this.f7173eo, this.f7174ep, abstractC0244am.f7173eo, abstractC0244am.f7174ep) >= f7 && !abstractC0244am.f1612bV && !(abstractC0244am instanceof C0243al) && !abstractC0244am.mo1745u() && abstractC0244am.f1656cN == null) {
                        abstractC0244am.mo3073a(this, (0.5f + (abstractC0244am.f1637cu * 0.002f) + (abstractC0244am.f1638cv * 0.001f)) * this.f3724h, (C0188f) null);
                    }
                }
            }
        }
        if (!this.f3733q) {
            GameEngine gameEngine = GameEngine.getGameEngine();
            this.f3726j += f;
            if (this.f3726j > 3.0f) {
                this.f3726j = 0.0f;
                int rand = gameEngine.f6406cu + C0773f.rand(0, (int) gameEngine.f6412cA);
                int rand2 = gameEngine.f6407cv + C0773f.rand(0, (int) gameEngine.f6413cB);
                if (C0773f.m2216a(this.f7173eo, this.f7174ep, rand, rand2) > (this.f3717a + 30.0f) * (this.f3717a + 30.0f)) {
                    gameEngine.f6371bL.m4662a(rand, rand2);
                    gameEngine.f6371bL.m4658a(gameEngine.f6371bL.f829T, gameEngine.f6371bL.f830U);
                    C0760e m2365b = gameEngine.f6377bR.m2365b(gameEngine.f6371bL.f829T + 10, (gameEngine.f6371bL.f830U - 10) + 10, 0.0f, EnumC0759d.custom, true, EnumC0763h.verylow);
                    if (m2365b != null) {
                        m2365b.f4868aq = 19;
                        m2365b.f4850Y = C0773f.m2151c(-180.0f, 180.0f);
                        m2365b.f4817r = true;
                        m2365b.f4869ar = (short) 1;
                        m2365b.f4830E = 0.7f;
                        m2365b.f4847V = 30.0f;
                        m2365b.f4848W = m2365b.f4847V;
                        m2365b.f4832G = 0.2f;
                        m2365b.f4831F = 1.2f;
                        m2365b.f4823x = Color.m5237a(255, 173, 12, 12);
                    }
                }
            }
        }
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: s */
    public int mo2831s() {
        return 0;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: t */
    public boolean mo1746t() {
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0628x, com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: u */
    public boolean mo1745u() {
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0244am, com.corrodinggames.rts.gameFramework.AbstractC1155w
    /* renamed from: a */
    public boolean mo440a(GameEngine gameEngine) {
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0628x, com.corrodinggames.rts.game.units.AbstractC0244am, com.corrodinggames.rts.gameFramework.AbstractC1155w
    /* renamed from: a */
    public void mo445a(float f, boolean z) {
        C0540f m3218f;
        GameEngine gameEngine = GameEngine.getGameEngine();
        float f2 = this.f7173eo - gameEngine.f6408cw;
        float f3 = this.f7174ep - gameEngine.f6409cx;
        Paint paint = this.f3725i ? f3729m : f3727k;
        if (this.f3733q) {
            paint = f3731o;
        }
        float f4 = this.f3717a;
        if (this.f3723g && (m3218f = m3218f()) != null) {
            f4 = m3218f.f3720d - 300.0f;
        }
        gameEngine.f6374bO.mo224a(f2, f3, f4, paint);
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: a */
    public boolean mo3221a(int i, int i2) {
        GameEngine gameEngine = GameEngine.getGameEngine();
        gameEngine.f6374bO.mo138i();
        gameEngine.f6374bO.mo209a(gameEngine.f6382bW.f5486w);
        float m1764b = gameEngine.f6382bW.m1764b(this.f3717a);
        Paint paint = this.f3725i ? f3730n : f3728l;
        if (this.f3733q) {
            paint = f3732p;
        }
        C0960aa.m948a(gameEngine.f6374bO, i, i2, m1764b, paint);
        gameEngine.f6374bO.mo137j();
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: a */
    public void mo3021a(int i) {
        this.f3717a = i * 100;
        this.f3720d = i * 100;
    }

    /* renamed from: a */
    public boolean m3223a(float f, float f2) {
        return C0773f.m2216a(this.f3721e, this.f3722f, f, f2) >= this.f3720d * this.f3720d;
    }

    /* renamed from: a */
    public PointF m3222a(float f, float f2, float f3) {
        if (f3 > this.f3720d) {
            f3 = this.f3720d;
        }
        float m2138d = C0773f.m2138d(this.f7173eo, this.f7174ep, f, f2);
        float f4 = this.f3720d - f3;
        float m2107k = this.f7173eo + (C0773f.m2107k(m2138d) * f4);
        float m2110j = this.f7174ep + (C0773f.m2110j(m2138d) * f4);
        f3734r.x = m2107k;
        f3734r.y = m2110j;
        return f3734r;
    }
}