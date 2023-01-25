package com.corrodinggames.rts.gameFramework.p037f.p038a;

import android.graphics.Color;
import com.corrodinggames.rts.gameFramework.translations.C0855a;
import com.corrodinggames.rts.gameFramework.utility.SlickToAndroidKeycodes;

/* renamed from: com.corrodinggames.rts.gameFramework.f.a.f */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/f/a/f.class */
public class C0781f extends C0790n {

    /* renamed from: a */
    C0783g f5090a;

    /* renamed from: a */
    public static C0781f m2035a(String str, boolean z) {
        C0781f c0781f = new C0781f();
        c0781f.f5143b = C0784h.f5100n;
        c0781f.f5133i = 200.0f;
        c0781f.f5134j = 200.0f;
        C0786j c0786j = new C0786j();
        c0786j.m2023a(str);
        c0786j.m2002e(5.0f);
        c0786j.m2000f(5.0f);
        c0786j.m2024a(-1);
        c0781f.m2014a(c0786j);
        c0781f.f5090a = new C0783g(EnumC0789m.horizontal);
        c0781f.m2014a(c0781f.f5090a);
        if (z) {
            c0781f.m2034b(C0855a.m1714a("menus.common.cancel", new Object[0])).m2015a(new AbstractC0787k() { // from class: com.corrodinggames.rts.gameFramework.f.a.f.1
                @Override // com.corrodinggames.rts.gameFramework.p037f.p038a.AbstractC0787k
                /* renamed from: a */
                public boolean mo1430a(C0778c c0778c) {
                    C0781f.this.m1997i();
                    return true;
                }
            });
        }
        return c0781f;
    }

    /* renamed from: a */
    public C0777b m2037a(String str) {
        C0777b c0777b = new C0777b();
        c0777b.m2023a(str);
        c0777b.m2002e(5.0f);
        c0777b.m2000f(5.0f);
        c0777b.m2024a(Color.m5243a(255, 30, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_SATELLITE_SERVICE, 30));
        return c0777b;
    }

    /* renamed from: b */
    public C0777b m2034b(String str) {
        return m2036a(str, (AbstractC0787k) null);
    }

    /* renamed from: a */
    public C0777b m2036a(String str, AbstractC0787k abstractC0787k) {
        C0777b m2037a = m2037a(str);
        m2037a.m2015a(abstractC0787k);
        this.f5090a.m2014a(m2037a);
        return m2037a;
    }

    /* renamed from: u_ */
    public void m2033u_() {
        if (!this.f5135s) {
            return;
        }
        mo2012b();
    }

    @Override // com.corrodinggames.rts.gameFramework.p037f.p038a.AbstractC0788l
    /* renamed from: b */
    public void mo2012b() {
        super.mo2012b();
        m2005d();
        this.f5133i = this.f5128z;
        this.f5134j = this.f5127y;
        this.f5133i += this.f5119m + this.f5120n;
        this.f5134j += this.f5117k + this.f5118l;
    }
}