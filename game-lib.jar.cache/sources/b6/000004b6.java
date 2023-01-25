package com.corrodinggames.rts.gameFramework.p037f.p038a;

import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import com.corrodinggames.rts.gameFramework.C0773f;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.unitAction.C0966ag;
import com.corrodinggames.rts.gameFramework.unitAction.C0970e;
import com.corrodinggames.rts.gameFramework.unitAction.InterfaceC1063y;
import com.corrodinggames.rts.gameFramework.utility.SlickToAndroidKeycodes;

/* renamed from: com.corrodinggames.rts.gameFramework.f.a.h */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/f/a/h.class */
public class C0784h {

    /* renamed from: p */
    C0970e f5092p;

    /* renamed from: r */
    public C0784h f5093r;

    /* renamed from: u */
    public int f5094u;

    /* renamed from: v */
    public C0784h f5095v;

    /* renamed from: j */
    public static final C0784h f5096j = new C0784h();

    /* renamed from: k */
    public static final C0784h f5097k = new C0784h();

    /* renamed from: l */
    public static final C0784h f5098l = new C0784h();

    /* renamed from: m */
    public static final C0784h f5099m = new C0784h();

    /* renamed from: n */
    public static final C0784h f5100n = new C0784h();

    /* renamed from: w */
    static Rect f5101w = new Rect();

    /* renamed from: x */
    static Rect f5102x = new Rect();

    /* renamed from: y */
    static Rect f5103y = new Rect();

    /* renamed from: o */
    Paint f5104o = new C0966ag();

    /* renamed from: q */
    Paint f5105q = new C0966ag();

    /* renamed from: s */
    public int f5106s = 3;

    /* renamed from: t */
    public int f5107t = 3;

    /* renamed from: a */
    public void mo2031a(C0970e c0970e) {
        this.f5092p = c0970e;
    }

    /* renamed from: a */
    public void mo2032a(C0784h c0784h) {
        this.f5092p = c0784h.f5092p;
        if (c0784h.f5104o != null) {
            this.f5104o = new Paint(c0784h.f5104o);
        } else {
            this.f5104o = null;
        }
        if (c0784h.f5105q != null) {
            this.f5105q = new Paint(c0784h.f5105q);
        } else {
            this.f5105q = null;
        }
    }

    /* renamed from: b */
    public static void m2027b() {
        C0784h c0784h = f5096j;
        c0784h.f5104o.m5206b(Color.m5243a(140, 100, 100, 100));
        c0784h.f5105q.m5206b(-16777216);
        c0784h.f5105q.m5221a(Paint.Style.STROKE);
        C0784h c0784h2 = f5097k;
        c0784h2.f5104o.m5206b(Color.m5243a(SlickToAndroidKeycodes.AndroidCodes.KEYCODE_STB_INPUT, 100, 100, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_BUTTON_3));
        c0784h2.f5105q.m5206b(-16777216);
        c0784h2.f5105q.m5221a(Paint.Style.STROKE);
        C0784h c0784h3 = f5098l;
        c0784h3.f5104o = null;
        c0784h3.f5105q = null;
        C0784h c0784h4 = f5099m;
        c0784h4.f5104o = null;
        c0784h4.f5105q.m5206b(-65536);
        c0784h4.f5105q.m5201c(127);
        c0784h4.f5105q.m5221a(Paint.Style.STROKE);
        C0784h c0784h5 = f5100n;
        c0784h5.f5104o.m5201c(255);
        c0784h5.f5092p = GameEngine.getGameEngine().f6330bS.f5407bl;
        c0784h5.f5105q.m5206b(-7829368);
        c0784h5.f5105q.m5201c(255);
        c0784h5.f5105q.m5221a(Paint.Style.STROKE);
    }

    /* renamed from: a */
    public void m2028a(InterfaceC1063y interfaceC1063y, RectF rectF) {
        f5102x.f230a = (int) rectF.f234a;
        f5102x.f231b = (int) rectF.f235b;
        f5102x.f232c = (int) rectF.f236c;
        f5102x.f233d = (int) rectF.f237d;
        m2029a(interfaceC1063y, f5102x, EnumC0785i.normal);
    }

    /* renamed from: c */
    public void m2026c(InterfaceC1063y interfaceC1063y, Rect rect) {
        m2029a(interfaceC1063y, rect, EnumC0785i.normal);
    }

    /* renamed from: a */
    public void m2029a(InterfaceC1063y interfaceC1063y, Rect rect, EnumC0785i enumC0785i) {
        if (this.f5094u > 0) {
            f5103y.m5171a(rect);
            rect = f5103y;
            C0773f.m2202a(rect, this.f5094u);
        }
        if (this.f5093r != null) {
            f5101w.m5171a(rect);
            f5101w.m5173a(this.f5106s, this.f5107t);
            this.f5093r.mo2030a(interfaceC1063y, f5101w);
        }
        if (enumC0785i == EnumC0785i.hovered && this.f5095v != null) {
            this.f5095v.mo2030a(interfaceC1063y, rect);
        } else {
            mo2030a(interfaceC1063y, rect);
        }
    }

    /* renamed from: a */
    public void mo2030a(InterfaceC1063y interfaceC1063y, Rect rect) {
        GameEngine gameEngine = GameEngine.getGameEngine();
        if (this.f5092p != null) {
            gameEngine.f6326bO.mo195a(this.f5092p, rect, this.f5104o, 0, 0, 0, 0);
        } else if (this.f5104o != null) {
            interfaceC1063y.mo163b(rect, this.f5104o);
        }
        if (this.f5105q != null) {
            interfaceC1063y.mo163b(rect, this.f5105q);
        }
    }
}