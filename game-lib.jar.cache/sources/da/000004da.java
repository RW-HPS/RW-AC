package com.corrodinggames.rts.gameFramework.Interface;

import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.unitAction.e;
import com.corrodinggames.rts.gameFramework.unitAction.y;
import java.util.ArrayList;

/* renamed from: com.corrodinggames.rts.gameFramework.f.d */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/f/d.class */
public class d {
    static Rect a = new Rect();
    static ArrayList b = new ArrayList();
    static final RectF c = new RectF();
    static final RectF d = new RectF();

    public static int a(Paint paint) {
        return GameEngine.getGameEngine().bO.a("abcABC123!|", paint) + 4;
    }

    public static int b(Paint paint) {
        int a2 = GameEngine.getGameEngine().bO.a("abcABC123!|", paint);
        if (GameEngine.aY) {
            return a2 + 2;
        }
        return a2;
    }

    public static ArrayList a(String str, Rect rect, Paint paint, Paint paint2, boolean z) {
        int lastIndexOf;
        b.clear();
        String str2 = VariableScope.nullOrMissingString;
        int i = 0;
        int i2 = 0;
        while (true) {
            int i3 = i2;
            if (i3 >= str.length()) {
                break;
            }
            int a2 = paint2.a((CharSequence) str, i3, str.length(), true, rect.b() - 5, (float[]) null);
            if (a2 == 0) {
                break;
            }
            int indexOf = str.indexOf("\n", i3 + 1);
            if (indexOf != -1 && indexOf < i3 + a2) {
                a2 = indexOf - i3;
            } else if (i3 + a2 < str.length() && (lastIndexOf = str.substring(i3, i3 + a2).lastIndexOf(" ")) != -1 && lastIndexOf != 0) {
                a2 = lastIndexOf;
            }
            String replaceAll = str.substring(i3, i3 + a2).replaceAll("(\\n)", VariableScope.nullOrMissingString);
            if (replaceAll.length() > str2.length()) {
                str2 = replaceAll;
                i = b.size();
            }
            b.add(replaceAll);
            i2 = i3 + a2;
        }
        rect.d = rect.b + (b.size() * a(paint2));
        if (z) {
            float d2 = rect.d();
            Paint paint3 = paint2;
            if (i == 0) {
                paint3 = paint;
            }
            float b2 = GameEngine.getGameEngine().bO.b(str2, paint3);
            if (b2 < rect.b()) {
                rect.a = (int) (d2 - (b2 / 2.0f));
                rect.c = (int) (d2 + (b2 / 2.0f));
            }
        }
        return b;
    }

    public static void a(String str, float f, float f2, Paint paint, Paint paint2, float f3, float f4, float f5, float f6) {
        y yVar = GameEngine.getGameEngine().bO;
        float b2 = yVar.b(str, paint);
        d.a(f, f2, f + b2, f2 + yVar.a(str, paint));
        c.a(d);
        if (paint.j() == Paint.Align.CENTER) {
            c.a(-(b2 / 2.0f), 0.0f);
        }
        c.a -= f3;
        c.b -= f4;
        c.c += f5;
        c.d += f6;
        yVar.a(c, paint2);
        yVar.a(str, d.a, d.d, paint);
    }

    public static float a(e eVar, float f, float f2) {
        return a(eVar, f, f2, f, f2);
    }

    public static float a(e eVar, float f, float f2, float f3, float f4) {
        float f5 = eVar.p;
        float f6 = eVar.q;
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