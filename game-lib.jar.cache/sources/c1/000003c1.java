package com.corrodinggames.rts.game.units;

import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.PointF;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.net.GameInputStream;
import com.corrodinggames.rts.gameFramework.net.GameOutputStream;
import com.corrodinggames.rts.gameFramework.utility.SlickToAndroidKeycodes;
import java.util.Iterator;

/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/f.class */
public class f extends x {

    /* renamed from: a  reason: collision with root package name */
    public float f357a;
    public float b;
    public float c;
    public float d;
    public float e;
    public float f;
    public boolean g;
    public float h;
    public boolean i;
    public float j;
    static Paint k = new Paint();
    static Paint l;
    static Paint m;
    static Paint n;
    static Paint o;
    static Paint p;
    boolean q;
    static final PointF r;

    static {
        k.a(10.0f);
        k.b(Color.a(100, 160, 0, 0));
        k.a(Paint.Style.STROKE);
        m = new Paint();
        m.a(k);
        m.b(Color.a(SlickToAndroidKeycodes.AndroidCodes.KEYCODE_STB_INPUT, 160, 0, 0));
        l = new Paint();
        l.a(2.0f);
        l.b(Color.a(100, 160, 0, 0));
        l.a(Paint.Style.STROKE);
        n = new Paint();
        n.a(l);
        n.b(Color.a(SlickToAndroidKeycodes.AndroidCodes.KEYCODE_STB_INPUT, 160, 0, 0));
        o = new Paint();
        o.a(2.0f);
        o.b(Color.a(50, 255, 255, 255));
        o.a(Paint.Style.STROKE);
        p = new Paint(o);
        r = new PointF();
    }

    @Override // com.corrodinggames.rts.game.units.y, com.corrodinggames.rts.game.units.am, com.corrodinggames.rts.gameFramework.az, com.corrodinggames.rts.gameFramework.w, com.corrodinggames.rts.gameFramework.bq
    public void a(GameOutputStream gameOutputStream) {
        gameOutputStream.writeByte(0);
        gameOutputStream.writeFloat(this.f357a);
        gameOutputStream.writeFloat(this.b);
        gameOutputStream.writeFloat(this.c);
        gameOutputStream.writeFloat(this.d);
        gameOutputStream.writeFloat(this.e);
        gameOutputStream.writeFloat(this.f);
        gameOutputStream.writeBoolean(this.g);
        gameOutputStream.writeFloat(this.h);
        super.a(gameOutputStream);
    }

    @Override // com.corrodinggames.rts.game.units.y, com.corrodinggames.rts.game.units.am, com.corrodinggames.rts.gameFramework.az, com.corrodinggames.rts.gameFramework.w
    public void a(GameInputStream gameInputStream) {
        gameInputStream.readByte();
        this.f357a = gameInputStream.readFloat();
        this.b = gameInputStream.readFloat();
        this.c = gameInputStream.readFloat();
        this.d = gameInputStream.readFloat();
        this.e = gameInputStream.readFloat();
        this.f = gameInputStream.readFloat();
        this.g = gameInputStream.readBoolean();
        this.h = gameInputStream.readFloat();
        super.a(gameInputStream);
        if (!this.bV) {
            GameEngine.getGameEngine().bW.a(this);
        }
    }

    @Override // com.corrodinggames.rts.game.units.am
    /* renamed from: b */
    public ar r() {
        if (this.q) {
            return ar.zoneMarker;
        }
        return ar.damagingBorder;
    }

    public static void d_() {
        GameEngine.getGameEngine();
    }

    public f(boolean z) {
        super(z);
        this.f357a = 2000.0f;
        this.b = 0.0f;
        this.c = 0.0f;
        this.d = 2000.0f;
        this.g = true;
        this.h = 1.0f;
    }

    public f f() {
        Iterator it = am.bF().iterator();
        while (it.hasNext()) {
            am amVar = (am) it.next();
            if ((amVar instanceof f) && !amVar.bV && amVar != this) {
                f fVar = (f) amVar;
                if (fVar.q == this.q) {
                    return fVar;
                }
            }
        }
        return null;
    }

    @Override // com.corrodinggames.rts.game.units.x, com.corrodinggames.rts.game.units.y, com.corrodinggames.rts.game.units.am, com.corrodinggames.rts.gameFramework.w
    public void a(float f) {
        super.a(f);
        if (this.bV) {
            return;
        }
        if (this.g) {
            this.g = false;
            f f2 = f();
            if (f2 != null) {
                f2.e = this.eo;
                f2.f = this.ep;
                f2.d = this.d;
                ci();
            } else {
                this.e = this.eo;
                this.f = this.ep;
                if (!this.q) {
                    GameEngine.m328e("DamagingBorder created " + this.e + "," + this.f + " size:" + this.d);
                }
                GameEngine.getGameEngine().bW.a(this);
            }
        }
        if (this.q) {
            this.f357a = this.d;
            this.eo = this.e;
            this.ep = this.f;
        } else if (this.f357a > this.d) {
            this.b += 2.5E-4f * f;
            this.f357a -= this.b;
            this.i = true;
            float b = com.corrodinggames.rts.gameFramework.f.b(this.eo, this.ep, this.e, this.f);
            float d = com.corrodinggames.rts.gameFramework.f.d(this.eo, this.ep, this.e, this.f);
            if (b > 1.0f) {
                float f3 = this.b;
                if (f3 > b * f) {
                    f3 = b * f;
                }
                this.eo += f3 * com.corrodinggames.rts.gameFramework.f.k(d) * f;
                this.ep += f3 * com.corrodinggames.rts.gameFramework.f.j(d) * f;
            }
        } else {
            this.i = false;
            this.eo = (float) (this.eo + ((this.e - this.eo) * 0.003d * f));
            this.ep = (float) (this.ep + ((this.f - this.ep) * 0.003d * f));
        }
        if (this.f357a < this.d) {
            this.f357a = this.d;
            this.b = 0.0f;
        }
        if (this.d < 0.0f) {
            ci();
            return;
        }
        this.c -= f;
        if (!this.bV && this.c <= 0.0f && !this.q) {
            this.c = 2.0f;
            float k2 = this.f357a * com.corrodinggames.rts.gameFramework.f.k(45.0f);
            float f4 = this.eo - k2;
            float f5 = this.eo + k2;
            float f6 = this.ep - k2;
            float f7 = this.ep + k2;
            float f8 = this.f357a * this.f357a;
            Iterator it = am.bF().iterator();
            while (it.hasNext()) {
                am amVar = (am) it.next();
                if (amVar.eo <= f4 || amVar.eo >= f5 || amVar.ep <= f6 || amVar.ep >= f7) {
                    if (com.corrodinggames.rts.gameFramework.f.a(this.eo, this.ep, amVar.eo, amVar.ep) >= f8 && !amVar.bV && !(amVar instanceof al) && !amVar.u() && amVar.cN == null) {
                        amVar.a(this, (0.5f + (amVar.cu * 0.002f) + (amVar.cv * 0.001f)) * this.h, (com.corrodinggames.rts.game.f) null);
                    }
                }
            }
        }
        if (!this.q) {
            GameEngine gameEngine = GameEngine.getGameEngine();
            this.j += f;
            if (this.j > 3.0f) {
                this.j = 0.0f;
                int a2 = gameEngine.cu + com.corrodinggames.rts.gameFramework.f.a(0, (int) gameEngine.cA);
                int a3 = gameEngine.cv + com.corrodinggames.rts.gameFramework.f.a(0, (int) gameEngine.cB);
                if (com.corrodinggames.rts.gameFramework.f.a(this.eo, this.ep, a2, a3) > (this.f357a + 30.0f) * (this.f357a + 30.0f)) {
                    gameEngine.bL.a(a2, a3);
                    gameEngine.bL.a(gameEngine.bL.T, gameEngine.bL.U);
                    com.corrodinggames.rts.gameFramework.d.e b2 = gameEngine.bR.b(gameEngine.bL.T + 10, (gameEngine.bL.U - 10) + 10, 0.0f, com.corrodinggames.rts.gameFramework.d.d.custom, true, com.corrodinggames.rts.gameFramework.d.h.verylow);
                    if (b2 != null) {
                        b2.aq = 19;
                        b2.Y = com.corrodinggames.rts.gameFramework.f.c(-180.0f, 180.0f);
                        b2.r = true;
                        b2.ar = (short) 1;
                        b2.E = 0.7f;
                        b2.V = 30.0f;
                        b2.W = b2.V;
                        b2.G = 0.2f;
                        b2.F = 1.2f;
                        b2.x = Color.a(255, 173, 12, 12);
                    }
                }
            }
        }
    }

    @Override // com.corrodinggames.rts.game.units.y
    public int s() {
        return 0;
    }

    @Override // com.corrodinggames.rts.game.units.am
    public boolean t() {
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.x, com.corrodinggames.rts.game.units.am
    public boolean u() {
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.am, com.corrodinggames.rts.gameFramework.w
    public boolean a(GameEngine gameEngine) {
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.x, com.corrodinggames.rts.game.units.am, com.corrodinggames.rts.gameFramework.w
    public void a(float f, boolean z) {
        f f2;
        GameEngine gameEngine = GameEngine.getGameEngine();
        float f3 = this.eo - gameEngine.cw;
        float f4 = this.ep - gameEngine.cx;
        Paint paint = this.i ? m : k;
        if (this.q) {
            paint = o;
        }
        float f5 = this.f357a;
        if (this.g && (f2 = f()) != null) {
            f5 = f2.d - 300.0f;
        }
        gameEngine.bO.a(f3, f4, f5, paint);
    }

    @Override // com.corrodinggames.rts.game.units.am
    public boolean a(int i, int i2) {
        GameEngine gameEngine = GameEngine.getGameEngine();
        gameEngine.bO.i();
        gameEngine.bO.a(gameEngine.bW.w);
        float b = gameEngine.bW.b(this.f357a);
        Paint paint = this.i ? n : l;
        if (this.q) {
            paint = p;
        }
        com.corrodinggames.rts.gameFramework.m.aa.a(gameEngine.bO, i, i2, b, paint);
        gameEngine.bO.j();
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.y
    public void a(int i) {
        this.f357a = i * 100;
        this.d = i * 100;
    }

    public boolean a(float f, float f2) {
        return com.corrodinggames.rts.gameFramework.f.a(this.e, this.f, f, f2) >= this.d * this.d;
    }

    public PointF a(float f, float f2, float f3) {
        if (f3 > this.d) {
            f3 = this.d;
        }
        float d = com.corrodinggames.rts.gameFramework.f.d(this.eo, this.ep, f, f2);
        float f4 = this.d - f3;
        float k2 = this.eo + (com.corrodinggames.rts.gameFramework.f.k(d) * f4);
        float j = this.ep + (com.corrodinggames.rts.gameFramework.f.j(d) * f4);
        r.x = k2;
        r.y = j;
        return r;
    }
}