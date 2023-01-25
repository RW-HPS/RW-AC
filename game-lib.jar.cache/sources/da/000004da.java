package com.corrodinggames.rts.gameFramework.p037f;

import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.unitAction.C0970e;
import com.corrodinggames.rts.gameFramework.unitAction.InterfaceC1063y;
import java.util.ArrayList;

/* renamed from: com.corrodinggames.rts.gameFramework.f.d */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/f/d.class */
public class C0820d {

    /* renamed from: a */
    static Rect f5232a = new Rect();

    /* renamed from: b */
    static ArrayList f5233b = new ArrayList();

    /* renamed from: c */
    static final RectF f5234c = new RectF();

    /* renamed from: d */
    static final RectF f5235d = new RectF();

    /* renamed from: a */
    public static int m1927a(Paint paint) {
        return GameEngine.getGameEngine().f6326bO.mo180a("abcABC123!|", paint) + 4;
    }

    /* renamed from: b */
    public static int m1922b(Paint paint) {
        int mo180a = GameEngine.getGameEngine().f6326bO.mo180a("abcABC123!|", paint);
        if (GameEngine.f6422aY) {
            return mo180a + 2;
        }
        return mo180a;
    }

    /* renamed from: a */
    public static ArrayList m1923a(String str, Rect rect, Paint paint, Paint paint2, boolean z) {
        int lastIndexOf;
        f5233b.clear();
        String str2 = VariableScope.nullOrMissingString;
        int i = 0;
        int i2 = 0;
        while (true) {
            int i3 = i2;
            if (i3 >= str.length()) {
                break;
            }
            int m5218a = paint2.m5218a((CharSequence) str, i3, str.length(), true, rect.m5170b() - 5, (float[]) null);
            if (m5218a == 0) {
                break;
            }
            int indexOf = str.indexOf("\n", i3 + 1);
            if (indexOf != -1 && indexOf < i3 + m5218a) {
                m5218a = indexOf - i3;
            } else if (i3 + m5218a < str.length() && (lastIndexOf = str.substring(i3, i3 + m5218a).lastIndexOf(" ")) != -1 && lastIndexOf != 0) {
                m5218a = lastIndexOf;
            }
            String replaceAll = str.substring(i3, i3 + m5218a).replaceAll("(\\n)", VariableScope.nullOrMissingString);
            if (replaceAll.length() > str2.length()) {
                str2 = replaceAll;
                i = f5233b.size();
            }
            f5233b.add(replaceAll);
            i2 = i3 + m5218a;
        }
        rect.f233d = rect.f231b + (f5233b.size() * m1927a(paint2));
        if (z) {
            float m5165d = rect.m5165d();
            Paint paint3 = paint2;
            if (i == 0) {
                paint3 = paint;
            }
            float mo158b = GameEngine.getGameEngine().f6326bO.mo158b(str2, paint3);
            if (mo158b < rect.m5170b()) {
                rect.f230a = (int) (m5165d - (mo158b / 2.0f));
                rect.f232c = (int) (m5165d + (mo158b / 2.0f));
            }
        }
        return f5233b;
    }

    /* renamed from: a */
    public static void m1924a(String str, float f, float f2, Paint paint, Paint paint2, float f3, float f4, float f5, float f6) {
        InterfaceC1063y interfaceC1063y = GameEngine.getGameEngine().f6326bO;
        float mo158b = interfaceC1063y.mo158b(str, paint);
        f5235d.m5158a(f, f2, f + mo158b, f2 + interfaceC1063y.mo180a(str, paint));
        f5234c.m5156a(f5235d);
        if (paint.m5187j() == Paint.Align.CENTER) {
            f5234c.m5159a(-(mo158b / 2.0f), 0.0f);
        }
        f5234c.f234a -= f3;
        f5234c.f235b -= f4;
        f5234c.f236c += f5;
        f5234c.f237d += f6;
        interfaceC1063y.mo206a(f5234c, paint2);
        interfaceC1063y.mo182a(str, f5235d.f234a, f5235d.f237d, paint);
    }

    /* renamed from: a */
    public static float m1926a(C0970e c0970e, float f, float f2) {
        return m1925a(c0970e, f, f2, f, f2);
    }

    /* renamed from: a */
    public static float m1925a(C0970e c0970e, float f, float f2, float f3, float f4) {
        float f5 = c0970e.f6620p;
        float f6 = c0970e.f6621q;
        float f7 = 1.0f;
        if (f5 * 1.0f < f) {
            float f8 = f / f5;
            if (f8 > 1.0f) {
                f7 = f8;
            }
        }
        if (f6 * f7 < f2) {
            float f9 = f2 / f6;
            if (f9 > f7) {
                f7 = f9;
            }
        }
        if (f5 * f7 > f3) {
            float f10 = f3 / f5;
            if (f10 < f7) {
                f7 = f10;
            }
        }
        if (f6 * f7 > f4) {
            float f11 = f4 / f6;
            if (f11 < f7) {
                f7 = f11;
            }
        }
        return f7;
    }
}