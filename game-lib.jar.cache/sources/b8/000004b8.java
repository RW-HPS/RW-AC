package com.corrodinggames.rts.gameFramework.p037f.p038a;

import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.p037f.C0820d;
import com.corrodinggames.rts.gameFramework.unitAction.C0966ag;
import com.corrodinggames.rts.gameFramework.unitAction.InterfaceC1063y;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: com.corrodinggames.rts.gameFramework.f.a.j */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/f/a/j.class */
public class C0786j extends AbstractC0788l {

    /* renamed from: a */
    String f5111a;

    /* renamed from: b */
    Paint f5112b = new C0966ag();

    /* renamed from: c */
    C0784h f5113c = C0784h.f5098l;

    /* renamed from: d */
    ArrayList f5114d;

    public C0786j() {
        this.f5112b.m5224a(Paint.Align.CENTER);
        this.f5112b.m5206b(-16777216);
        m2025a(18.0f);
    }

    /* renamed from: a */
    public void m2025a(float f) {
        GameEngine.getGameEngine().m1017b(this.f5112b, f);
        m2003e();
    }

    /* renamed from: a */
    public void m2024a(int i) {
        this.f5112b.m5206b(i);
    }

    @Override // com.corrodinggames.rts.gameFramework.p037f.p038a.AbstractC0788l
    /* renamed from: a */
    public String mo2021a() {
        return super.mo2021a() + " (text:" + this.f5111a + ")";
    }

    @Override // com.corrodinggames.rts.gameFramework.p037f.p038a.AbstractC0788l
    /* renamed from: a */
    public void mo1996a(float f, float f2) {
        int m1927a;
        super.mo1996a(f, f2);
        InterfaceC1063y d = m2005d();
        RectF a = m2017a(new RectF(), f, f2);
        this.f5113c.m2028a(d, a);
        if (this.f5111a == null) {
            return;
        }
        if (this.f5114d == null) {
            d.mo182a(this.f5111a, a.m5147d(), a.f237d - this.f5118l, this.f5112b);
            return;
        }
        int i = 0;
        Iterator it = this.f5114d.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            Paint paint = this.f5112b;
            d.mo182a(str, a.m5147d(), a.f235b + this.f5117k + C0820d.m1927a(paint) + (i * m1927a), paint);
            i++;
        }
    }

    /* renamed from: a */
    public void m2023a(String str) {
        this.f5111a = str;
        m2003e();
    }

    /* renamed from: c */
    public Rect m2022c() {
        RectF a = m2017a(new RectF(), 0.0f, 0.0f);
        Rect rect = new Rect();
        rect.f233d = (int) a.f237d;
        rect.f231b = (int) a.f235b;
        rect.f230a = (int) a.f234a;
        rect.f232c = (int) a.f236c;
        rect.f232c = 10000;
        return rect;
    }

    @Override // com.corrodinggames.rts.gameFramework.p037f.p038a.AbstractC0788l
    /* renamed from: b */
    public void mo2012b() {
        Rect m2022c;
        super.mo2012b();
        m2005d();
        this.f5114d = new ArrayList(C0820d.m1923a(this.f5111a, m2022c(), this.f5112b, this.f5112b, true));
        this.f5133i = m2022c.m5170b();
        this.f5134j = m2022c.m5166c();
        this.f5133i += this.f5119m + this.f5120n;
        this.f5134j += this.f5117k + this.f5118l;
    }
}