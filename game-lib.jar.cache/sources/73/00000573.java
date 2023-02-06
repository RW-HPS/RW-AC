package com.corrodinggames.rts.gameFramework.unitAction;

import android.graphics.Bitmap;
import com.corrodinggames.rts.game.PlayerData;
import com.corrodinggames.rts.game.o;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.Unit;
import com.corrodinggames.rts.gameFramework.u;
import java.io.IOException;

/* renamed from: com.corrodinggames.rts.gameFramework.m.h */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/m/h.class */
public class h extends e {
    public static ae x;
    public static ae y;
    public static ae z;
    public static boolean A;
    boolean B = false;
    boolean C = false;
    private e H;
    private e I;
    int D;
    int E;
    o F;
    public static float G;

    public static synchronized void C() {
        if (A) {
            return;
        }
        try {
            GameEngine.m5e("Loading team shaders...");
            x = new i("assets/shaders/pureGreenTeamColor.frag", true);
            x.a("teamColor", -1);
            x.c();
            y = new i("assets/shaders/hueAddTeamColor.frag", false);
            y.a("teamColorAmount", 0.15f);
            y.a("teamColor", -1);
            y.c();
            z = new i("assets/shaders/hueShiftTeamColor.frag", false);
            z.a("teamColor", -1);
            z.c();
            A = true;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void D() {
        if (!A) {
            C();
        }
    }

    @Override // com.corrodinggames.rts.gameFramework.unitAction.e
    public String a() {
        if (this.H == null) {
            return "LazyColoring (error sourceBitmap==null)";
        }
        return "LazyColoring(" + this.E + "):" + this.H.a();
    }

    public h(e eVar, int i, o oVar, int i2) {
        if (eVar == null) {
            throw new RuntimeException("baseImage==null");
        }
        this.H = eVar;
        this.D = i;
        this.F = oVar;
        this.E = i2;
        this.H.a(this);
        this.k = null;
    }

    public void c(boolean z2) {
        if (GameEngine.az()) {
            if (z2) {
            }
            D();
            if (this.F == o.hueAdd) {
                a(y);
            } else if (this.F == o.hueShift) {
                a(z);
            } else {
                a(x);
            }
            this.I = this.H;
            this.C = true;
        } else if (this.H.A()) {
            GameEngine.m5e("Lazy loaded bitmap using errored image: " + this.H.a());
            this.I = this.H;
        } else {
            if (z2) {
                try {
                    GameEngine.m5e("Loading in lazy loaded bitmap:" + this.H.a() + " team:" + this.E);
                } catch (OutOfMemoryError e) {
                    GameEngine.m5e("Colouring failed with OOM");
                    GameEngine.a(u.gameImageColor, e);
                    this.I = GameEngine.getGameEngine().bO.r();
                    return;
                }
            }
            long loadAllUnitsTook = Unit.loadAllUnitsTook();
            this.H.i();
            this.I = this.H.clone();
            this.I.j();
            e[] eVarArr = {this.I};
            int[] iArr = {this.D};
            int[] iArr2 = {this.E};
            long loadAllUnitsTook2 = Unit.loadAllUnitsTook();
            if (this.F == o.hueAdd) {
                PlayerData.b(this.H, eVarArr, iArr);
            } else if (this.F == o.hueShift) {
                PlayerData.a(this.H, eVarArr, iArr, iArr2);
            } else {
                PlayerData.a(this.H, eVarArr, iArr);
            }
            double a = Unit.a(loadAllUnitsTook2);
            this.I.p();
            this.I.s();
            this.H.q();
            this.H = null;
            double a2 = Unit.a(loadAllUnitsTook);
            if (a2 > 1.0d) {
                GameEngine.m5e((this.F == o.pureGreen ? "Standard " : "Hue ") + "Colouring took:" + Unit.a(a2) + " (" + Unit.a(a) + ")");
            }
            G = (float) (G + a2);
        }
    }

    @Override // com.corrodinggames.rts.gameFramework.unitAction.e
    public Bitmap b() {
        if (this.C && !GameEngine.az()) {
            GameEngine.m5e("Team shader coloring now disabled. Recoloring image: " + this.H.a());
            this.B = false;
            this.C = false;
            a((ae) null);
        }
        if (!this.B) {
            c(true);
            this.B = true;
        }
        return this.I.k;
    }

    @Override // com.corrodinggames.rts.gameFramework.unitAction.e
    public e c() {
        if (this.C && !GameEngine.az()) {
            GameEngine.m5e("Team shader coloring now disabled. Recoloring image: " + this.H.a());
            this.B = false;
            this.C = false;
            a((ae) null);
        }
        if (!this.B) {
            if (G > 60.0f) {
            }
            c(true);
            this.B = true;
        }
        if (this.I == null) {
            throw new RuntimeException("coloredBitmap==null");
        }
        return this.I;
    }

    @Override // com.corrodinggames.rts.gameFramework.unitAction.e
    public void w() {
        if (!this.B) {
            c(false);
            this.B = true;
        }
    }

    @Override // com.corrodinggames.rts.gameFramework.unitAction.e
    public int u() {
        if ((!this.B) & (this.H != null)) {
            return this.H.u();
        }
        return super.u();
    }
}