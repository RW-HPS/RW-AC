package com.corrodinggames.rts.game.units.custom.e;

import com.corrodinggames.rts.game.units.custom.ag;
import com.corrodinggames.rts.game.units.custom.bb;
import com.corrodinggames.rts.game.units.custom.bo;
import com.corrodinggames.rts.game.units.custom.l;
import com.corrodinggames.rts.gameFramework.utility.ab;

/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/e/d.class */
public class d {

    /* renamed from: a  reason: collision with root package name */
    public String f295a;
    public a b;
    public float c;
    public Integer d;
    public boolean e;
    public boolean f;
    bb g;
    bb h;
    boolean i;
    boolean j;
    public boolean k;
    public boolean l;
    public float m;
    public boolean n;
    public boolean o;
    public boolean p;
    public boolean q;
    public b r = b.none;
    public int s;
    public bb t;
    public bb u;
    public String v;
    public a w;
    public boolean x;
    public boolean y;
    public String z;
    public a A;
    public com.corrodinggames.rts.gameFramework.m.e B;
    public boolean C;

    public d(boolean z) {
        this.f = z;
    }

    public void a(l lVar, ab abVar, String str, String str2) {
        this.f295a = str2;
        this.g = ag.a(abVar, str, "displayName", (String) null);
        this.h = ag.a(abVar, str, "displayNameShort", (String) null);
        if (this.h == null) {
            this.h = this.g;
        }
        this.i = abVar.a(str, "displayNameHideWhenIconShownInHUD", (Boolean) false).booleanValue();
        this.j = abVar.a(str, "displayNameHideWhenIconShownInText", (Boolean) false).booleanValue();
        this.l = abVar.a(str, "hidden", (Boolean) false).booleanValue();
        float f = 1.0f;
        boolean booleanValue = abVar.a(str, "includeInStats", (Boolean) true).booleanValue();
        if (!booleanValue) {
            f = 0.0f;
        }
        if (this.l || !this.f) {
            f = 0.0f;
        }
        this.m = abVar.a(str, "valueInStats", Float.valueOf(f)).floatValue();
        if (!booleanValue && this.m != 0.0f) {
            throw new bo("[" + str + "]includeInStats==false expects valueInStats==0");
        }
        if (this.m < 0.0f) {
            throw new bo("[" + str + "]valueInStats cannot be < 0 (is:" + this.m + ")");
        }
        this.k = abVar.a(str, "stackHorizontal", (Boolean) false).booleanValue();
        this.c = abVar.a(str, "priority", Float.valueOf(0.0f)).floatValue();
        this.d = abVar.a(str, "displayColor", (Integer) null);
        this.e = abVar.a(str, "displayColorUseInText", (Boolean) true).booleanValue();
        this.n = abVar.a(str, "displayWithRounding", (Boolean) true).booleanValue();
        this.o = abVar.a(str, "displayRoundedDown", (Boolean) false).booleanValue();
        this.p = abVar.a(str, "displayWhenZero", (Boolean) false).booleanValue();
        this.q = abVar.a(str, "displayInHud", Boolean.valueOf(!this.l && this.f)).booleanValue();
        if (this.q && !this.f) {
            throw new bo("[" + str + "]displayInHud:true currently only supported on global resources");
        }
        if (this.q && this.l) {
            throw new bo("[" + str + "]displayInHud:true only supported non-hidden resources");
        }
        this.s = abVar.b(str, "displayPos", (Integer) 0).intValue();
        this.r = (b) abVar.a(str, "displayDigitGrouping", b.none, b.class);
        this.t = ag.a(abVar, str, "displayTextPrefix", (String) null);
        this.u = ag.a(abVar, str, "displayTextPostfix", (String) null);
        bb a2 = ag.a(abVar, str, "displayPrefixInHUD", (String) null);
        if (a2 != null) {
            if (this.t != null) {
                throw new bo("[" + str + "]displayPrefixInHUD and displayTextPrefix are aliases, don't use both");
            }
            this.t = a2;
        }
        bb a3 = ag.a(abVar, str, "displayPostfixInHUD", (String) null);
        if (a3 != null) {
            if (this.u != null) {
                throw new bo("[" + str + "]displayPostfixInHUD and displayTextPostfix are aliases, don't use both");
            }
            this.u = a3;
        }
        this.v = abVar.b(str, "displayTextAppendResource", (String) null);
        String b = abVar.b(str, "appendResourceInHUD", (String) null);
        if (b != null) {
            if (this.v != null) {
                throw new bo("[" + str + "]displayTextAppendResource and appendResourceInHUD are aliases, don't use both");
            }
            this.v = b;
        }
        this.x = abVar.a(str, "displayTextAppendResourceWithGap", (Boolean) false).booleanValue();
        this.y = abVar.a(str, "appendResourceInHUD_whenThisZero", (Boolean) true).booleanValue();
        this.B = lVar.a(abVar, str, "iconImage", true);
        if (this.B != null && (this.B.m() > 100 || this.B.l() > 100)) {
            throw new bo("[" + str + "]iconImage: Image is too big, keep under 100x100");
        }
        this.C = abVar.a(str, "iconImageUseInText", (Boolean) true).booleanValue();
        if (this.i && this.B == null) {
            throw new bo("[" + str + "]displayNameHideWhenIconShownInHUD: Cannot use without iconImage");
        }
        if (this.j && this.B == null) {
            throw new bo("[" + str + "]displayNameHideWhenIconShownInText: Cannot use without iconImage");
        }
        String str3 = (this.f ? "g_" : "l_") + this.f295a;
        this.b = a.a(str3, false, this.f);
        if (this.b.u) {
            throw new RuntimeException("Cannot define resource with a built-in name: " + str3);
        }
        if (!this.f) {
            this.z = abVar.b(str, "equivalentGlobalResourceForAI", (String) null);
        }
    }

    public void a(l lVar) {
        if (this.z != null) {
            this.A = lVar.k(this.z);
            if (this.A == null) {
                throw new bo("[resource]equivalentGlobalResourceForAI: Failed to find resource: " + this.z);
            }
            if (!this.A.t) {
                throw new bo("[resource]equivalentGlobalResourceForAI: Expected global resource for: " + this.z);
            }
        }
        if (this.v != null) {
            this.w = lVar.k(this.v);
            if (this.w == null) {
                throw new bo("[resource]displayTextAppendResource: Failed to find resource: " + this.v);
            }
        }
    }
}