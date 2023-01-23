package com.corrodinggames.rts.game.units.d;

import android.graphics.PointF;
import android.graphics.Rect;
import com.corrodinggames.rts.R;
import com.corrodinggames.rts.game.PlayerData;
import com.corrodinggames.rts.game.units.ab;
import com.corrodinggames.rts.game.units.am;
import com.corrodinggames.rts.game.units.ar;
import com.corrodinggames.rts.game.units.au;
import com.corrodinggames.rts.game.units.y;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.net.GameInputStream;
import com.corrodinggames.rts.gameFramework.net.GameOutputStream;
import com.corrodinggames.rts.gameFramework.utility.SlickToAndroidKeycodes;
import java.util.ArrayList;

/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/d/r.class */
public class r extends d implements com.corrodinggames.rts.game.units.d {
    float d;
    Rect f;
    Rect g;
    PointF[] i;
    PointF[] j;

    /* renamed from: a  reason: collision with root package name */
    static com.corrodinggames.rts.gameFramework.m.e f338a = null;
    static com.corrodinggames.rts.gameFramework.m.e[] b = new com.corrodinggames.rts.gameFramework.m.e[10];
    static com.corrodinggames.rts.gameFramework.m.e c = null;
    public static s e = new s(true);
    static ArrayList h = new ArrayList();

    @Override // com.corrodinggames.rts.game.units.d.d, com.corrodinggames.rts.game.units.y, com.corrodinggames.rts.game.units.am, com.corrodinggames.rts.gameFramework.az, com.corrodinggames.rts.gameFramework.w, com.corrodinggames.rts.gameFramework.bq
    public void a(GameOutputStream gameOutputStream) {
        super.a(gameOutputStream);
    }

    @Override // com.corrodinggames.rts.game.units.d.d, com.corrodinggames.rts.game.units.y, com.corrodinggames.rts.game.units.am, com.corrodinggames.rts.gameFramework.az, com.corrodinggames.rts.gameFramework.w
    public void a(GameInputStream gameInputStream) {
        super.a(gameInputStream);
    }

    @Override // com.corrodinggames.rts.game.units.am
    /* renamed from: K */
    public ar r() {
        return ar.repairbay;
    }

    static {
        h.add(new com.corrodinggames.rts.game.units.a.m(true));
        h.add(new com.corrodinggames.rts.game.units.a.n());
    }

    public static void M() {
        GameEngine gameEngine = GameEngine.getGameEngine();
        f338a = gameEngine.bO.a(R.drawable.repair_bay);
        c = gameEngine.bO.a(R.drawable.repair_bay_dead);
        b = PlayerData.a(f338a);
    }

    @Override // com.corrodinggames.rts.game.units.d.d
    public boolean L() {
        this.M = c;
        S(0);
        this.bT = false;
        a(ab.normal);
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.y
    public com.corrodinggames.rts.gameFramework.m.e d() {
        if (this.bV) {
            return c;
        }
        if (this.bX == null) {
            return b[b.length - 1];
        }
        return b[this.bX.R()];
    }

    @Override // com.corrodinggames.rts.game.units.y
    public com.corrodinggames.rts.gameFramework.m.e k() {
        return null;
    }

    @Override // com.corrodinggames.rts.game.units.d.d, com.corrodinggames.rts.game.units.y
    public void a(int i) {
    }

    public r(boolean z) {
        super(z);
        this.f = new Rect();
        this.g = new Rect();
        this.i = new PointF[6];
        this.j = new PointF[this.i.length];
        this.M = f338a;
        b(f338a);
        this.cj = 30.0f;
        this.ck = this.cj;
        this.cv = 1000.0f;
        this.cu = this.cv;
        this.n.a(-1, -1, 1, 1);
        this.o.a(-1, -1, 1, 1);
        for (int i = 0; i < this.i.length; i++) {
            this.i[i] = new PointF();
            this.j[i] = new PointF();
        }
    }

    @Override // com.corrodinggames.rts.game.units.am
    public int y() {
        return SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_DATA_SERVICE;
    }

    @Override // com.corrodinggames.rts.game.units.am
    public float c(am amVar) {
        return 0.2f;
    }

    @Override // com.corrodinggames.rts.game.units.y
    public boolean a(am amVar) {
        if (amVar.q()) {
            return false;
        }
        return true;
    }

    public static au a(y yVar, float f, float f2, boolean z) {
        GameEngine gameEngine = GameEngine.getGameEngine();
        e.a(yVar.y() + f2, z);
        gameEngine.cc.a(yVar.eo, yVar.ep, yVar.y() + f2, yVar, f, e);
        am amVar = e.e;
        if (amVar != null) {
            au ao = yVar.ao();
            ao.b(amVar);
            if (ao != null) {
                ao.k = f2;
                ao.m = true;
                return ao;
            }
            return null;
        }
        return null;
    }

    @Override // com.corrodinggames.rts.game.units.y, com.corrodinggames.rts.game.units.am, com.corrodinggames.rts.gameFramework.w
    public void a(float f) {
        super.a(f);
        if (!bT() || this.bV) {
            return;
        }
        this.d += f;
        if (aq() && this.d > 40.0f) {
            this.d = 0.0f;
            a((y) this, f, 0.0f, false);
        }
        if (!this.bV) {
            com.corrodinggames.rts.game.units.e.b.a(f, this);
        }
    }

    @Override // com.corrodinggames.rts.game.units.d.d, com.corrodinggames.rts.game.units.y, com.corrodinggames.rts.game.units.am, com.corrodinggames.rts.gameFramework.w
    public boolean c(float f) {
        return super.c(f);
    }

    @Override // com.corrodinggames.rts.game.units.am, com.corrodinggames.rts.gameFramework.w
    public void a(float f, boolean z) {
        super.a(f, z);
        if (!this.bV) {
            com.corrodinggames.rts.game.units.e.b.b(f, this);
        }
    }

    @Override // com.corrodinggames.rts.game.units.am
    public boolean l() {
        return false;
    }

    @Override // com.corrodinggames.rts.game.units.y
    public void a(am amVar, int i) {
        throw new RuntimeException("Unit cannot shoot");
    }

    @Override // com.corrodinggames.rts.game.units.y
    public float b(int i) {
        return 0.0f;
    }

    @Override // com.corrodinggames.rts.game.units.y
    public float c(int i) {
        return 0.0f;
    }

    @Override // com.corrodinggames.rts.game.units.y
    public PointF E(int i) {
        PointF G = G(i);
        bg.setSite(G.x + 0.0f, G.y - 33.0f);
        return bg;
    }

    @Override // com.corrodinggames.rts.game.units.am
    public ArrayList N() {
        return h;
    }

    @Override // com.corrodinggames.rts.game.units.d
    public PointF[] b() {
        return this.i;
    }

    @Override // com.corrodinggames.rts.game.units.d
    public PointF[] e_() {
        return this.j;
    }

    @Override // com.corrodinggames.rts.game.units.y
    public float m() {
        return y();
    }

    @Override // com.corrodinggames.rts.game.units.am, com.corrodinggames.rts.gameFramework.w
    public void e(float f) {
        super.e(f);
        com.corrodinggames.rts.gameFramework.utility.y.a(this, y());
    }

    @Override // com.corrodinggames.rts.game.units.am
    public boolean g(am amVar, boolean z) {
        return true;
    }
}