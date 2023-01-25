package com.corrodinggames.rts.game;

import android.graphics.Paint;
import android.graphics.Rect;
import com.corrodinggames.rts.gameFramework.EnumC1100u;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.unitAction.C0964ae;
import com.corrodinggames.rts.gameFramework.unitAction.C0966ag;
import com.corrodinggames.rts.gameFramework.unitAction.C0970e;
import com.corrodinggames.rts.gameFramework.unitAction.InterfaceC1063y;
import java.io.IOException;

/* renamed from: com.corrodinggames.rts.game.j */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/j.class */
public class C0193j {

    /* renamed from: a */
    public C0970e f1280a;

    /* renamed from: b */
    InterfaceC1063y f1281b;

    /* renamed from: c */
    C0966ag f1282c;

    /* renamed from: d */
    C0964ae f1283d;

    /* renamed from: e */
    Paint f1284e;

    /* renamed from: f */
    Rect f1285f;

    /* renamed from: g */
    boolean f1286g;

    public C0193j() {
        this.f1284e = new Paint();
        this.f1285f = new Rect(-101, 0, -1, 100);
        this.f1282c = new C0966ag();
    }

    public C0193j(String str) {
        this();
        try {
            this.f1283d = new C0964ae(str);
            this.f1282c.m915a(this.f1283d);
            if (this.f1283d.f6578o != 0) {
                this.f1286g = true;
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: a */
    public boolean m4483a() {
        if ((this.f1283d != null && this.f1283d.f6578o != 0) || this.f1286g) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public void m4482a(InterfaceC1063y interfaceC1063y) {
        m4481a(interfaceC1063y, interfaceC1063y.mo134m(), interfaceC1063y.mo133n(), 10);
    }

    /* renamed from: a */
    public void m4481a(InterfaceC1063y interfaceC1063y, int i, int i2, int i3) {
        if (this.f1286g) {
            return;
        }
        if (this.f1280a != null && (i > this.f1280a.mo387m() || i2 > this.f1280a.mo388l())) {
            this.f1280a.mo50o();
            this.f1280a = null;
            this.f1281b = null;
        }
        if (this.f1280a == null) {
            try {
                this.f1280a = interfaceC1063y.mo219a(i + i3, i2 + i3, true);
                this.f1281b = interfaceC1063y.mo202a(this.f1280a);
            } catch (OutOfMemoryError e) {
                this.f1286g = true;
                GameEngine.m1068a(EnumC1100u.gameImageCreate, e);
                return;
            }
        }
        this.f1281b.mo221a(i, i2);
    }

    /* renamed from: b */
    public void m4480b() {
        GameEngine gameEngine = GameEngine.getGameEngine();
        gameEngine.f6326bO.mo163b(this.f1285f, this.f1284e);
        gameEngine.f6326bO.mo160b(this.f1280a, 0.0f, 0.0f, this.f1282c);
    }
}