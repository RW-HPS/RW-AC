package com.corrodinggames.rts.game.units.d;

import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import com.corrodinggames.rts.AssetsID;
import com.corrodinggames.rts.game.PlayerData;
import com.corrodinggames.rts.game.units.ab;
import com.corrodinggames.rts.game.units.am;
import com.corrodinggames.rts.game.units.ao;
import com.corrodinggames.rts.game.units.ar;
import com.corrodinggames.rts.game.units.as;
import com.corrodinggames.rts.game.units.custom.be;
import com.corrodinggames.rts.game.units.y;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.net.GameInputStream;
import com.corrodinggames.rts.gameFramework.net.GameOutputStream;
import java.util.Iterator;

/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/d/d.class */
public abstract class d extends y {
    com.corrodinggames.rts.gameFramework.unitAction.e m;
    public Rect n;
    public Rect o;
    public static com.corrodinggames.rts.gameFramework.unitAction.e p = null;
    public static com.corrodinggames.rts.gameFramework.unitAction.e[] q = new com.corrodinggames.rts.gameFramework.unitAction.e[10];
    int r;
    int s;

    public boolean ds() {
        return false;
    }

    @Override // com.corrodinggames.rts.game.units.y, com.corrodinggames.rts.game.units.am, com.corrodinggames.rts.gameFramework.az, com.corrodinggames.rts.gameFramework.w, com.corrodinggames.rts.gameFramework.bq
    public void a(GameOutputStream gameOutputStream) {
        gameOutputStream.writeInt(this.r);
        super.a(gameOutputStream);
    }

    @Override // com.corrodinggames.rts.game.units.y, com.corrodinggames.rts.game.units.am, com.corrodinggames.rts.gameFramework.az, com.corrodinggames.rts.gameFramework.w
    public void a(GameInputStream gameInputStream) {
        if (gameInputStream.b() >= 15) {
            R(gameInputStream.readInt());
        }
        super.a(gameInputStream);
    }

    public static boolean a(as asVar, float f, float f2, PlayerData playerData) {
        GameEngine gameEngine = GameEngine.getGameEngine();
        y yVar = (y) am.a(asVar);
        gameEngine.bL.b(f, f2);
        yVar.eo = gameEngine.bL.T + yVar.cZ();
        yVar.ep = gameEngine.bL.U + yVar.cZ();
        yVar.b(playerData);
        return yVar.c((PlayerData) null);
    }

    public void R(int i) {
        this.r = i;
    }

    @Override // com.corrodinggames.rts.game.units.y
    public com.corrodinggames.rts.gameFramework.unitAction.e d(int i) {
        return null;
    }

    @Override // com.corrodinggames.rts.game.units.am
    public com.corrodinggames.rts.gameFramework.unitAction.e v() {
        if (this.bX.site == -1) {
            return null;
        }
        return q[this.bX.R()];
    }

    public static void dt() {
        p = GameEngine.getGameEngine().bO.a(AssetsID.drawable.unit_icon_building);
        q = PlayerData.a(p);
    }

    public d(boolean z) {
        super(z);
        this.n = new Rect();
        this.o = new Rect();
        this.r = 1;
        this.s = 0;
        this.cg = -90.0f;
        this.bT = false;
    }

    @Override // com.corrodinggames.rts.game.units.am
    public void f_() {
        this.bT = false;
    }

    public boolean L() {
        a(ab.large);
        return false;
    }

    @Override // com.corrodinggames.rts.game.units.am
    public boolean e() {
        GameEngine.getGameEngine().bU.a(this);
        if (this.cm < 1.0f) {
            a(ab.verysmall);
            return false;
        }
        this.s = 0;
        return L();
    }

    @Override // com.corrodinggames.rts.game.units.am
    public Rect cd() {
        return this.o;
    }

    @Override // com.corrodinggames.rts.game.units.am
    public Rect cc() {
        return this.n;
    }

    public static boolean a(y yVar, as asVar, ao aoVar, int i, int i2, int i3) {
        GameEngine gameEngine = GameEngine.getGameEngine();
        com.corrodinggames.rts.game.maps.b bVar = gameEngine.bL;
        if (!bVar.c(i, i2)) {
            return false;
        }
        boolean z = false;
        if (bVar.E && gameEngine.playerTeam.N != null) {
            if (!bVar.G && gameEngine.playerTeam.N[i][i2] == 10) {
                return false;
            }
            z = gameEngine.playerTeam.N[i][i2] >= 5;
        }
        if (a(yVar, asVar, aoVar, i, i2, z)) {
            if (asVar.p()) {
                com.corrodinggames.rts.game.maps.g e = bVar.e(i, i2);
                if (e != null && e.i) {
                    return true;
                }
                return false;
            } else if (com.corrodinggames.rts.gameFramework.emitter.a.a(gameEngine.playerTeam, i, i2, i3)) {
                return false;
            } else {
                return true;
            }
        }
        return false;
    }

    public static boolean a(y yVar, as asVar, ao aoVar, int i, int i2, boolean z) {
        return a(yVar, asVar, aoVar, i, i2, z, null) == null;
    }

    public static String a(y yVar, as asVar, ao aoVar, int i, int i2, boolean z, PlayerData playerData) {
        String a;
        GameEngine gameEngine = GameEngine.getGameEngine();
        if (!gameEngine.bL.c(i, i2)) {
            return "{0}";
        }
        be q2 = asVar.q();
        if (q2 != null && (a = q2.a(yVar, i, i2)) != null) {
            return a;
        }
        if (asVar == ar.seaFactory || aoVar == ao.WATER) {
            if (!gameEngine.bU.a(gameEngine.bU.A, i, i2)) {
                return null;
            }
            return "{3}";
        }
        com.corrodinggames.rts.game.maps.g e = gameEngine.bL.e(i, i2);
        if (e != null && e.i) {
            if (asVar.p()) {
                return null;
            }
            return "{0}";
        } else if (aoVar == ao.AIR) {
            return null;
        } else {
            if (aoVar == ao.HOVER) {
                if (!gameEngine.bU.a(gameEngine.bU.C, i, i2)) {
                    return null;
                }
                return "{0}";
            } else if (aoVar == ao.OVER_CLIFF) {
                if (!gameEngine.bU.a(gameEngine.bU.D, i, i2)) {
                    return null;
                }
                return "{0}";
            } else if (aoVar == ao.OVER_CLIFF_WATER) {
                if (!gameEngine.bU.a(gameEngine.bU.E, i, i2)) {
                    return null;
                }
                return "{0}";
            } else if (gameEngine.bU.a(gameEngine.bU.z, i, i2, z)) {
                boolean z2 = false;
                if (playerData != null && !gameEngine.bL.a(i, i2, playerData)) {
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

    public static am b(int i, int i2) {
        GameEngine gameEngine = GameEngine.getGameEngine();
        gameEngine.bL.a(i, i2);
        float f = gameEngine.bL.T + gameEngine.bL.p;
        float f2 = gameEngine.bL.U + gameEngine.bL.q;
        Iterator it = gameEngine.cc.b(f, f2, 0.0f).iterator();
        while (it.hasNext()) {
            am amVar = (am) it.next();
            if (amVar.bI() && !amVar.bV && amVar.c(f, f2, 0.0f)) {
                return amVar;
            }
        }
        return null;
    }

    @Override // com.corrodinggames.rts.game.units.y
    public void a(int i) {
    }

    public static am g(as asVar) {
        if (asVar == null) {
            throw new RuntimeException("type is null");
        }
        return asVar.a();
    }

    @Override // com.corrodinggames.rts.game.units.y
    public boolean I() {
        return false;
    }

    @Override // com.corrodinggames.rts.game.units.am
    public ao h() {
        return ao.NONE;
    }

    @Override // com.corrodinggames.rts.game.units.am
    public boolean i() {
        return false;
    }

    @Override // com.corrodinggames.rts.game.units.am
    public boolean Q() {
        return false;
    }

    @Override // com.corrodinggames.rts.game.units.y
    public float z() {
        return 0.0f;
    }

    @Override // com.corrodinggames.rts.game.units.y
    public float A() {
        return 0.0f;
    }

    @Override // com.corrodinggames.rts.game.units.y
    public boolean b_() {
        return false;
    }

    public Paint f() {
        int a;
        GameEngine gameEngine = GameEngine.getGameEngine();
        PorterDuffColorFilter porterDuffColorFilter = null;
        if (this.cm < 1.0f) {
            a = Color.a((int) (40.0f + (this.cm * 200.0f)), 140, 255, 140);
            porterDuffColorFilter = aX;
        } else {
            a = Color.a(255, 255, 255, 255);
        }
        if (this.cp) {
            if (this.cs) {
                a = Color.a(200, 20, 255, 20);
                porterDuffColorFilter = aY;
            }
            if (this.ct) {
                a = Color.a(200, 255, 20, 20);
                porterDuffColorFilter = aZ;
            }
            if (this.cq) {
                a = Color.a(70, 70, 70, 245);
                porterDuffColorFilter = ba;
                if (this.ct) {
                    a = Color.a(70, 255, 20, 20);
                    porterDuffColorFilter = aZ;
                }
            }
            if (this.cr) {
                a = Color.a(150, 100, 100, 100);
            }
        }
        boolean z = gameEngine.settingsEngine.renderAntiAlias;
        if (!dk()) {
            z = false;
            if (gameEngine.cX < 1.0f) {
                z = true;
            }
        }
        if (this.co) {
            z = ar.ag;
        }
        return a(a, porterDuffColorFilter, z);
    }

    @Override // com.corrodinggames.rts.game.units.y, com.corrodinggames.rts.game.units.am, com.corrodinggames.rts.gameFramework.w
    public boolean c(float f) {
        GameEngine gameEngine = GameEngine.getGameEngine();
        int i = this.s * this.es;
        RectF cF = cF();
        dv.a(i, 0, i + this.es, 0 + this.et);
        gameEngine.bO.a(this.M, dv, cF, f());
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.y, com.corrodinggames.rts.game.units.am, com.corrodinggames.rts.gameFramework.w
    public void d(float f) {
        super.d(f);
        if (this.m == null) {
            return;
        }
        GameEngine gameEngine = GameEngine.getGameEngine();
        if (ds()) {
            gameEngine.bO.b(this.m, (this.eo - ((int) (this.m.t + 0.1f))) - gameEngine.cw, (this.ep - ((int) (this.m.u + 0.1f))) - gameEngine.cx, f());
            return;
        }
        RectF cF = cF();
        dv.a(0, 0, 0 + this.es, 0 + this.et);
        gameEngine.bO.a(this.m, dv, cF, f());
    }

    @Override // com.corrodinggames.rts.game.units.am
    public boolean bI() {
        return true;
    }
}