package com.corrodinggames.rts.gameFramework.f.a;

import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.m.ag;
import com.corrodinggames.rts.gameFramework.m.y;
import com.corrodinggames.rts.gameFramework.utility.SlickToAndroidKeycodes;

/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/f/a/h.class */
public class h {
    com.corrodinggames.rts.gameFramework.m.e p;
    public h r;
    public int u;
    public h v;
    public static final h j = new h();
    public static final h k = new h();
    public static final h l = new h();
    public static final h m = new h();
    public static final h n = new h();
    static Rect w = new Rect();
    static Rect x = new Rect();
    static Rect y = new Rect();
    Paint o = new ag();
    Paint q = new ag();
    public int s = 3;
    public int t = 3;

    public void a(com.corrodinggames.rts.gameFramework.m.e eVar) {
        this.p = eVar;
    }

    public void a(h hVar) {
        this.p = hVar.p;
        if (hVar.o != null) {
            this.o = new Paint(hVar.o);
        } else {
            this.o = null;
        }
        if (hVar.q != null) {
            this.q = new Paint(hVar.q);
        } else {
            this.q = null;
        }
    }

    public static void b() {
        h hVar = j;
        hVar.o.b(Color.a(140, 100, 100, 100));
        hVar.q.b(-16777216);
        hVar.q.a(Paint.Style.STROKE);
        h hVar2 = k;
        hVar2.o.b(Color.a(SlickToAndroidKeycodes.AndroidCodes.KEYCODE_STB_INPUT, 100, 100, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_BUTTON_3));
        hVar2.q.b(-16777216);
        hVar2.q.a(Paint.Style.STROKE);
        h hVar3 = l;
        hVar3.o = null;
        hVar3.q = null;
        h hVar4 = m;
        hVar4.o = null;
        hVar4.q.b(-65536);
        hVar4.q.c(127);
        hVar4.q.a(Paint.Style.STROKE);
        h hVar5 = n;
        hVar5.o.c(255);
        hVar5.p = GameEngine.getGameEngine().bS.bl;
        hVar5.q.b(-7829368);
        hVar5.q.c(255);
        hVar5.q.a(Paint.Style.STROKE);
    }

    public void a(y yVar, RectF rectF) {
        x.f47a = (int) rectF.f48a;
        x.b = (int) rectF.b;
        x.c = (int) rectF.c;
        x.d = (int) rectF.d;
        a(yVar, x, i.normal);
    }

    public void c(y yVar, Rect rect) {
        a(yVar, rect, i.normal);
    }

    public void a(y yVar, Rect rect, i iVar) {
        if (this.u > 0) {
            y.a(rect);
            rect = y;
            com.corrodinggames.rts.gameFramework.f.a(rect, this.u);
        }
        if (this.r != null) {
            w.a(rect);
            w.a(this.s, this.t);
            this.r.a(yVar, w);
        }
        if (iVar == i.hovered && this.v != null) {
            this.v.a(yVar, rect);
        } else {
            a(yVar, rect);
        }
    }

    public void a(y yVar, Rect rect) {
        GameEngine gameEngine = GameEngine.getGameEngine();
        if (this.p != null) {
            gameEngine.bO.a(this.p, rect, this.o, 0, 0, 0, 0);
        } else if (this.o != null) {
            yVar.b(rect, this.o);
        }
        if (this.q != null) {
            yVar.b(rect, this.q);
        }
    }
}