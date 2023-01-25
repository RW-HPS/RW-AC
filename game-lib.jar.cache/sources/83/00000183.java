package com.corrodinggames.rts.game.p012b;

import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.unitAction.C0970e;
import com.corrodinggames.rts.gameFramework.unitAction.InterfaceC1063y;

/* renamed from: com.corrodinggames.rts.game.b.h */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/b/h.class */
public class C0181h {

    /* renamed from: b */
    public C0970e f929b;

    /* renamed from: c */
    InterfaceC1063y f930c;

    /* renamed from: e */
    int f931e;

    /* renamed from: f */
    int f932f;

    /* renamed from: g */
    int f933g;

    /* renamed from: h */
    int f934h;

    /* renamed from: i */
    float f935i;

    /* renamed from: j */
    boolean f936j;

    /* renamed from: k */
    C0181h f937k;

    /* renamed from: l */
    static final Rect f938l = new Rect();

    /* renamed from: m */
    static final Rect f939m = new Rect();

    /* renamed from: n */
    static final Rect f940n = new Rect();

    /* renamed from: a */
    int f941a = 0;

    /* renamed from: d */
    Paint f942d = new Paint();

    /* renamed from: o */
    Rect f943o = new Rect();

    /* renamed from: p */
    int f944p = -1;

    public C0181h(float f, boolean z) {
        this.f935i = 1.0f;
        this.f935i = f;
        this.f936j = z;
        this.f931e = (int) (20.0f * f);
        this.f932f = (int) (20.0f * f);
        this.f933g = this.f931e + 2;
        this.f934h = this.f932f + 2;
        if (!z) {
            this.f937k = new C0181h(f, true);
        }
    }

    /* renamed from: a */
    public void m4559a() {
        GameEngine gameEngine = GameEngine.getGameEngine();
        this.f929b = gameEngine.f6326bO.mo166b(20 * this.f933g, 20 * this.f934h, this.f936j);
        this.f930c = gameEngine.f6326bO.mo161b(this.f929b);
        if (this.f936j) {
            this.f929b.f6618m = true;
        }
        if (this.f937k != null) {
            this.f937k.m4559a();
        }
    }

    /* renamed from: b */
    public void m4550b() {
        this.f941a = 0;
        this.f930c.mo167b(-16777216);
        this.f930c.mo132o();
        this.f929b.mo47r();
        if (this.f937k != null) {
            this.f937k.m4550b();
        }
    }

    /* renamed from: a */
    public int m4553a(C0183j c0183j, int i) {
        int m4553a;
        c0183j.m4543a(i, f938l);
        if (this.f941a >= 400) {
            return -1;
        }
        boolean z = true;
        if (!this.f936j) {
            z = !m4552a(c0183j.f952b, f938l);
        }
        if (z) {
            int i2 = this.f941a;
            this.f941a++;
            m4556a(i2, c0183j.f952b, f938l);
            return i2;
        } else if (this.f937k != null && (m4553a = this.f937k.m4553a(c0183j, i)) != -1) {
            return m4553a + 500;
        } else {
            return -1;
        }
    }

    /* renamed from: a */
    public static boolean m4552a(C0970e c0970e, Rect rect) {
        int i = rect.f230a;
        int i2 = rect.f232c;
        int i3 = rect.f231b;
        int i4 = rect.f233d;
        if (i < 0) {
            i = 0;
        }
        if (i2 < 0) {
            i2 = 0;
        }
        if (i3 < 0) {
            i3 = 0;
        }
        if (i4 < 0) {
            i4 = 0;
        }
        if (i > c0970e.mo387m()) {
            i = c0970e.mo387m();
        }
        if (i2 > c0970e.mo387m()) {
            i2 = c0970e.mo387m();
        }
        if (i3 > c0970e.mo388l()) {
            i3 = c0970e.mo388l();
        }
        if (i4 > c0970e.mo388l()) {
            i4 = c0970e.mo388l();
        }
        if (!c0970e.mo52k()) {
            GameEngine.m5460e("hasImageAlpha: Cannot get pixel data for: " + c0970e.mo65a());
            return true;
        }
        c0970e.mo44x();
        for (int i5 = i3; i5 < i4; i5++) {
            for (int i6 = i; i6 < i2; i6++) {
                if (Color.m5245a(c0970e.mo64a(i6, i5)) != 255) {
                    return true;
                }
            }
        }
        c0970e.mo43y();
        return false;
    }

    /* renamed from: c */
    public void m4548c() {
        this.f930c.mo131p();
        if (this.f937k != null) {
            this.f937k.m4548c();
        }
    }

    /* renamed from: a */
    public void m4556a(int i, C0970e c0970e, Rect rect) {
        Rect rect2 = new Rect();
        m4557a(i, rect2);
        boolean z = false;
        if (this.f935i < 1.0f) {
            z = true;
        }
        this.f942d.mo914a(z);
        this.f942d.m5195d(z);
        this.f942d.m5203b(z);
        m4551a(this.f930c, c0970e, rect, rect2, this.f942d);
    }

    /* renamed from: a */
    public static void m4551a(InterfaceC1063y interfaceC1063y, C0970e c0970e, Rect rect, Rect rect2, Paint paint) {
        for (int i = 0; i <= 3; i++) {
            m4555a(rect, f939m, i, 0);
            m4555a(rect2, f940n, i, 1);
            interfaceC1063y.mo194a(c0970e, f939m, f940n, paint);
        }
        for (int i2 = 0; i2 <= 3; i2++) {
            m4554a(rect, f939m, i2, 1, -1);
            m4554a(rect2, f940n, i2, 1, 0);
            interfaceC1063y.mo194a(c0970e, f939m, f940n, paint);
        }
        interfaceC1063y.mo194a(c0970e, rect, rect2, paint);
    }

    /* renamed from: a */
    public static Rect m4554a(Rect rect, Rect rect2, int i, int i2, int i3) {
        if (i == 0) {
            rect2.f230a = rect.f230a - 0;
            rect2.f232c = rect.f232c + 0;
            rect2.f231b = (rect.f231b - i2) - i3;
            rect2.f233d = rect.f231b - i3;
        } else if (i == 1) {
            rect2.f230a = rect.f232c + i3;
            rect2.f232c = rect.f232c + i2 + i3;
            rect2.f231b = rect.f231b - 0;
            rect2.f233d = rect.f233d + 0;
        } else if (i == 2) {
            rect2.f230a = rect.f230a - 0;
            rect2.f232c = rect.f232c + 0;
            rect2.f231b = rect.f233d + i3;
            rect2.f233d = rect.f233d + i2 + i3;
        } else {
            rect2.f230a = rect.f230a - i3;
            rect2.f232c = (rect.f230a - i2) - i3;
            rect2.f231b = rect.f231b - 0;
            rect2.f233d = rect.f233d + 0;
        }
        return rect2;
    }

    /* renamed from: a */
    public static Rect m4555a(Rect rect, Rect rect2, int i, int i2) {
        if (i == 0) {
            rect2.f230a = (rect.f232c - 1) + i2;
            rect2.f231b = rect.f231b - i2;
        } else if (i == 1) {
            rect2.f230a = (rect.f232c - 1) + i2;
            rect2.f231b = (rect.f233d - 1) + i2;
        } else if (i == 2) {
            rect2.f230a = rect.f230a - i2;
            rect2.f231b = (rect.f233d - 1) + i2;
        } else {
            rect2.f230a = rect.f230a - i2;
            rect2.f231b = rect.f231b - i2;
        }
        rect2.f232c = rect2.f230a + 1;
        rect2.f233d = rect2.f231b + 1;
        return rect2;
    }

    /* renamed from: a */
    public final C0970e m4558a(int i) {
        if (i >= 500) {
            return this.f937k.m4558a(i - 500);
        }
        return this.f929b;
    }

    /* renamed from: b */
    public final Rect m4549b(int i) {
        if (i >= 500) {
            return this.f937k.m4549b(i - 500);
        }
        if (this.f944p == i) {
            return this.f943o;
        }
        this.f944p = i;
        m4557a(i, this.f943o);
        return this.f943o;
    }

    /* renamed from: a */
    public void m4557a(int i, Rect rect) {
        int i2 = ((i % 20) * this.f933g) + 1;
        int i3 = (((int) (i * 0.05f)) * this.f934h) + 1;
        rect.f230a = i2;
        rect.f231b = i3;
        rect.f232c = i2 + this.f931e;
        rect.f233d = i3 + this.f932f;
    }
}