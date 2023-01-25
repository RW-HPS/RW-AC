package com.corrodinggames.rts.game.units.custom.p021e;

import com.corrodinggames.rts.game.units.custom.C0349ag;
import com.corrodinggames.rts.game.units.custom.C0404bb;
import com.corrodinggames.rts.game.units.custom.C0417bo;
import com.corrodinggames.rts.game.units.custom.C0458l;
import com.corrodinggames.rts.gameFramework.unitAction.C0970e;
import com.corrodinggames.rts.gameFramework.utility.C1107ab;

/* renamed from: com.corrodinggames.rts.game.units.custom.e.d */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/e/d.class */
public class C0442d {

    /* renamed from: a */
    public String f2798a;

    /* renamed from: b */
    public C0433a f2799b;

    /* renamed from: c */
    public float f2800c;

    /* renamed from: d */
    public Integer f2801d;

    /* renamed from: e */
    public boolean f2802e;

    /* renamed from: f */
    public boolean f2803f;

    /* renamed from: g */
    C0404bb f2804g;

    /* renamed from: h */
    C0404bb f2805h;

    /* renamed from: i */
    boolean f2806i;

    /* renamed from: j */
    boolean f2807j;

    /* renamed from: k */
    public boolean f2808k;

    /* renamed from: l */
    public boolean f2809l;

    /* renamed from: m */
    public float f2810m;

    /* renamed from: n */
    public boolean f2811n;

    /* renamed from: o */
    public boolean f2812o;

    /* renamed from: p */
    public boolean f2813p;

    /* renamed from: q */
    public boolean f2814q;

    /* renamed from: r */
    public EnumC0440b f2815r = EnumC0440b.none;

    /* renamed from: s */
    public int f2816s;

    /* renamed from: t */
    public C0404bb f2817t;

    /* renamed from: u */
    public C0404bb f2818u;

    /* renamed from: v */
    public String f2819v;

    /* renamed from: w */
    public C0433a f2820w;

    /* renamed from: x */
    public boolean f2821x;

    /* renamed from: y */
    public boolean f2822y;

    /* renamed from: z */
    public String f2823z;

    /* renamed from: A */
    public C0433a f2824A;

    /* renamed from: B */
    public C0970e f2825B;

    /* renamed from: C */
    public boolean f2826C;

    public C0442d(boolean z) {
        this.f2803f = z;
    }

    /* renamed from: a */
    public void m3753a(C0458l c0458l, C1107ab c1107ab, String str, String str2) {
        this.f2798a = str2;
        this.f2804g = C0349ag.m4031a(c1107ab, str, "displayName", (String) null);
        this.f2805h = C0349ag.m4031a(c1107ab, str, "displayNameShort", (String) null);
        if (this.f2805h == null) {
            this.f2805h = this.f2804g;
        }
        this.f2806i = c1107ab.m685a(str, "displayNameHideWhenIconShownInHUD", (Boolean) false).booleanValue();
        this.f2807j = c1107ab.m685a(str, "displayNameHideWhenIconShownInText", (Boolean) false).booleanValue();
        this.f2809l = c1107ab.m685a(str, "hidden", (Boolean) false).booleanValue();
        float f = 1.0f;
        boolean booleanValue = c1107ab.m685a(str, "includeInStats", (Boolean) true).booleanValue();
        if (!booleanValue) {
            f = 0.0f;
        }
        if (this.f2809l || !this.f2803f) {
            f = 0.0f;
        }
        this.f2810m = c1107ab.m683a(str, "valueInStats", Float.valueOf(f)).floatValue();
        if (!booleanValue && this.f2810m != 0.0f) {
            throw new C0417bo("[" + str + "]includeInStats==false expects valueInStats==0");
        }
        if (this.f2810m < 0.0f) {
            throw new C0417bo("[" + str + "]valueInStats cannot be < 0 (is:" + this.f2810m + ")");
        }
        this.f2808k = c1107ab.m685a(str, "stackHorizontal", (Boolean) false).booleanValue();
        this.f2800c = c1107ab.m683a(str, "priority", Float.valueOf(0.0f)).floatValue();
        this.f2801d = c1107ab.m681a(str, "displayColor", (Integer) null);
        this.f2802e = c1107ab.m685a(str, "displayColorUseInText", (Boolean) true).booleanValue();
        this.f2811n = c1107ab.m685a(str, "displayWithRounding", (Boolean) true).booleanValue();
        this.f2812o = c1107ab.m685a(str, "displayRoundedDown", (Boolean) false).booleanValue();
        this.f2813p = c1107ab.m685a(str, "displayWhenZero", (Boolean) false).booleanValue();
        this.f2814q = c1107ab.m685a(str, "displayInHud", Boolean.valueOf(!this.f2809l && this.f2803f)).booleanValue();
        if (this.f2814q && !this.f2803f) {
            throw new C0417bo("[" + str + "]displayInHud:true currently only supported on global resources");
        }
        if (this.f2814q && this.f2809l) {
            throw new C0417bo("[" + str + "]displayInHud:true only supported non-hidden resources");
        }
        this.f2816s = c1107ab.m667b(str, "displayPos", (Integer) 0).intValue();
        this.f2815r = (EnumC0440b) c1107ab.m684a(str, "displayDigitGrouping", EnumC0440b.none, EnumC0440b.class);
        this.f2817t = C0349ag.m4031a(c1107ab, str, "displayTextPrefix", (String) null);
        this.f2818u = C0349ag.m4031a(c1107ab, str, "displayTextPostfix", (String) null);
        C0404bb m4031a = C0349ag.m4031a(c1107ab, str, "displayPrefixInHUD", (String) null);
        if (m4031a != null) {
            if (this.f2817t != null) {
                throw new C0417bo("[" + str + "]displayPrefixInHUD and displayTextPrefix are aliases, don't use both");
            }
            this.f2817t = m4031a;
        }
        C0404bb m4031a2 = C0349ag.m4031a(c1107ab, str, "displayPostfixInHUD", (String) null);
        if (m4031a2 != null) {
            if (this.f2818u != null) {
                throw new C0417bo("[" + str + "]displayPostfixInHUD and displayTextPostfix are aliases, don't use both");
            }
            this.f2818u = m4031a2;
        }
        this.f2819v = c1107ab.m666b(str, "displayTextAppendResource", (String) null);
        String m666b = c1107ab.m666b(str, "appendResourceInHUD", (String) null);
        if (m666b != null) {
            if (this.f2819v != null) {
                throw new C0417bo("[" + str + "]displayTextAppendResource and appendResourceInHUD are aliases, don't use both");
            }
            this.f2819v = m666b;
        }
        this.f2821x = c1107ab.m685a(str, "displayTextAppendResourceWithGap", (Boolean) false).booleanValue();
        this.f2822y = c1107ab.m685a(str, "appendResourceInHUD_whenThisZero", (Boolean) true).booleanValue();
        this.f2825B = c0458l.m3546a(c1107ab, str, "iconImage", true);
        if (this.f2825B != null && (this.f2825B.mo387m() > 100 || this.f2825B.mo388l() > 100)) {
            throw new C0417bo("[" + str + "]iconImage: Image is too big, keep under 100x100");
        }
        this.f2826C = c1107ab.m685a(str, "iconImageUseInText", (Boolean) true).booleanValue();
        if (this.f2806i && this.f2825B == null) {
            throw new C0417bo("[" + str + "]displayNameHideWhenIconShownInHUD: Cannot use without iconImage");
        }
        if (this.f2807j && this.f2825B == null) {
            throw new C0417bo("[" + str + "]displayNameHideWhenIconShownInText: Cannot use without iconImage");
        }
        String str3 = (this.f2803f ? "g_" : "l_") + this.f2798a;
        this.f2799b = C0433a.m3777a(str3, false, this.f2803f);
        if (this.f2799b.f2779u) {
            throw new RuntimeException("Cannot define resource with a built-in name: " + str3);
        }
        if (!this.f2803f) {
            this.f2823z = c1107ab.m666b(str, "equivalentGlobalResourceForAI", (String) null);
        }
    }

    /* renamed from: a */
    public void m3754a(C0458l c0458l) {
        if (this.f2823z != null) {
            this.f2824A = c0458l.m3508k(this.f2823z);
            if (this.f2824A == null) {
                throw new C0417bo("[resource]equivalentGlobalResourceForAI: Failed to find resource: " + this.f2823z);
            }
            if (!this.f2824A.f2778t) {
                throw new C0417bo("[resource]equivalentGlobalResourceForAI: Expected global resource for: " + this.f2823z);
            }
        }
        if (this.f2819v != null) {
            this.f2820w = c0458l.m3508k(this.f2819v);
            if (this.f2820w == null) {
                throw new C0417bo("[resource]displayTextAppendResource: Failed to find resource: " + this.f2819v);
            }
        }
    }
}