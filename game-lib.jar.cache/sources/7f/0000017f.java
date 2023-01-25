package com.corrodinggames.rts.game.p012b;

import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.unitAction.C0966ag;
import com.corrodinggames.rts.gameFramework.unitAction.C0970e;
import com.corrodinggames.rts.gameFramework.unitAction.InterfaceC1063y;

/* renamed from: com.corrodinggames.rts.game.b.d */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/b/d.class */
public class C0177d {

    /* renamed from: a */
    public InterfaceC1063y f872a;

    /* renamed from: b */
    int f873b;

    /* renamed from: c */
    int f874c;

    /* renamed from: d */
    public C0970e f875d;

    /* renamed from: e */
    public C0970e f876e;

    /* renamed from: f */
    public InterfaceC1063y f877f;

    /* renamed from: g */
    public float f878g;

    /* renamed from: i */
    public int f880i;

    /* renamed from: j */
    public int f881j;

    /* renamed from: s */
    final /* synthetic */ C0176c f890s;

    /* renamed from: h */
    public Paint f879h = new C0966ag();

    /* renamed from: k */
    public boolean f882k = true;

    /* renamed from: l */
    public boolean f883l = true;

    /* renamed from: m */
    public int f884m = 0;

    /* renamed from: n */
    public boolean f885n = false;

    /* renamed from: o */
    public final Rect f886o = new Rect();

    /* renamed from: p */
    public final Rect f887p = new Rect();

    /* renamed from: q */
    public final RectF f888q = new RectF();

    /* renamed from: r */
    public final Rect f889r = new Rect();

    /* renamed from: a */
    public void m4575a() {
        GameEngine gameEngine = GameEngine.getGameEngine();
        this.f876e = gameEngine.f6374bO.mo219a(this.f875d.f6622p, this.f875d.f6623q, true);
        if (this.f876e != null && !this.f876e.mo395A()) {
            this.f876e.m902a("fadeOutBitmap");
        }
        if (this.f876e == null || this.f876e.mo395A()) {
            throw new OutOfMemoryError("Failed to create fade out bitmap");
        }
        this.f876e.m901b(true);
        this.f877f = gameEngine.f6374bO.mo161b(this.f876e);
    }

    /* renamed from: b */
    public Rect m4574b() {
        this.f889r.m5166a(m4573c(), m4572d(), m4573c() + this.f890s.f864i, m4572d() + this.f890s.f864i);
        return this.f889r;
    }

    public C0177d(C0176c c0176c, int i, int i2) {
        this.f890s = c0176c;
        this.f880i = i;
        this.f881j = i2;
    }

    /* renamed from: c */
    public int m4573c() {
        return this.f890s.f861f + (this.f880i * this.f890s.f866k);
    }

    /* renamed from: d */
    public int m4572d() {
        return this.f890s.f862g + (this.f881j * this.f890s.f866k);
    }
}