package com.corrodinggames.rts.game;

import android.graphics.Color;
import com.corrodinggames.rts.game.units.am;
import com.corrodinggames.rts.game.units.custom.bh;
import com.corrodinggames.rts.game.units.custom.bi;
import com.corrodinggames.rts.game.units.custom.bp;
import com.corrodinggames.rts.game.units.custom.z;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.net.GameInputStream;
import com.corrodinggames.rts.gameFramework.net.GameOutputStream;
import java.io.IOException;
import java.util.Iterator;

/* loaded from: game-lib.jar:com/corrodinggames/rts/game/g.class */
public class g {

    /* renamed from: a  reason: collision with root package name */
    public static final g f158a = new g();
    public int b;
    public int c;
    public boolean d;
    public boolean e;
    public boolean f;
    public boolean g;
    public boolean h;
    public float u;
    public float v;
    public short y;
    public boolean A;
    public com.corrodinggames.rts.gameFramework.m.e B;
    public com.corrodinggames.rts.gameFramework.m.e C;
    public float D;
    public float E;
    public float F;
    public float G;
    public float H;
    public float Q;
    public float R;
    public float S;
    public boolean T;
    public com.corrodinggames.rts.gameFramework.m.e Y;
    public com.corrodinggames.rts.gameFramework.m.e Z;
    public boolean aa;
    public com.corrodinggames.rts.gameFramework.m.e ab;
    public boolean ac;
    public float ad;
    public z ah;
    public z ai;
    public bi aj;
    public bi ak;
    public bi al;
    public float am;
    public boolean aq;
    public boolean az;
    public com.corrodinggames.rts.game.units.custom.h aD;
    public boolean aI;
    public float aK;
    public float aL;
    public float aM;
    public boolean aN;
    public boolean aO;
    public float aP;
    public float aQ;
    public float aV;
    public z aX;
    public z aY;
    public bp aZ;
    public int ba;
    public boolean bb;
    public boolean bc;
    public com.corrodinggames.rts.game.units.custom.h bd;
    public int i = 35;
    public float j = -1.0f;
    public boolean k = false;
    public boolean l = false;
    public boolean m = false;
    public boolean n = false;
    public float o = 1.0f;
    public boolean p = false;
    public boolean q = false;
    public boolean r = false;
    public boolean s = false;
    public boolean t = false;
    public float w = 5.0f;
    public short x = -1;
    public short z = -1;
    public boolean I = false;
    public boolean J = false;
    public float K = -1.0f;
    public boolean L = false;
    public boolean M = false;
    public boolean N = false;
    public float O = -1.0f;
    public float P = -1.0f;
    public boolean U = false;
    public boolean V = false;
    public boolean W = false;
    public boolean X = false;
    public boolean ae = false;
    public boolean af = false;
    public float ag = 3.0f;
    public float an = 5.0f;
    public int ao = -1;
    public float ap = 0.5f;
    public boolean ar = false;
    public float as = -1.0f;
    public float at = -1.0f;
    public float au = -1.0f;
    public float av = 0.1f;
    public boolean aw = false;
    public float ax = 120.0f;
    public float ay = 15.0f;
    public float aA = 5.0f;
    public float aB = 120.0f;
    public float aC = 15.0f;
    public int aE = Color.a(255, 255, 255, 255);
    public float aF = 1.0f;
    public float aG = 0.0f;
    public float aH = 1.0f;
    public boolean aJ = true;
    public float aR = 1.0f;
    public float aS = 1.0f;
    public float aT = 1.0f;
    public float aU = 1.0f;
    public float aW = -1.0f;
    public com.corrodinggames.rts.gameFramework.utility.m be = null;
    public com.corrodinggames.rts.gameFramework.utility.m bf = null;
    public com.corrodinggames.rts.gameFramework.utility.m bg = null;

    public z a(am amVar) {
        com.corrodinggames.rts.gameFramework.utility.m mVar = this.bg;
        if (mVar != null && mVar.f689a > 0) {
            Iterator it = mVar.iterator();
            while (it.hasNext()) {
                h hVar = (h) it.next();
                if (hVar.a(amVar) && hVar.g != null) {
                    return hVar.g;
                }
            }
            return null;
        }
        return null;
    }

    public float a(am amVar, float f, boolean z) {
        com.corrodinggames.rts.gameFramework.utility.m mVar;
        float f2;
        if (!z) {
            mVar = this.be;
        } else {
            mVar = this.bf;
        }
        if (mVar != null && mVar.f689a > 0) {
            Iterator it = mVar.iterator();
            while (it.hasNext()) {
                h hVar = (h) it.next();
                if (hVar.a(amVar)) {
                    if (!z) {
                        if (hVar.e != null) {
                            hVar.e.h(amVar);
                        }
                        f2 = hVar.c;
                    } else {
                        if (hVar.f != null) {
                            hVar.f.h(amVar);
                        }
                        f2 = hVar.d;
                    }
                    f *= f2;
                }
            }
        }
        return f;
    }

    public static void a(g gVar, GameOutputStream gameOutputStream) {
        if (gVar == f158a) {
            gameOutputStream.writeByte(0);
        } else if (gVar instanceof bh) {
            gameOutputStream.writeByte(1);
            bh.a((bh) gVar, gameOutputStream);
        } else {
            GameEngine.g("writeOutLink: Unhandled projectile type");
            gameOutputStream.writeByte(0);
        }
    }

    public static g a(GameInputStream gameInputStream) {
        byte readByte = gameInputStream.readByte();
        if (readByte == 0) {
            return f158a;
        }
        if (readByte == 1) {
            g b = bh.b(gameInputStream);
            if (b == null) {
                return f158a;
            }
            return b;
        }
        throw new IOException("Unknown projectile type:" + ((int) readByte));
    }
}