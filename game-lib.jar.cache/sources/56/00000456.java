package com.corrodinggames.rts.gameFramework.p031b;

import android.graphics.Bitmap;
import java.util.ArrayList;
import java.util.HashMap;

/* renamed from: com.corrodinggames.rts.gameFramework.b.ac */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/b/ac.class */
public class C0688ac {

    /* renamed from: a */
    public InterfaceC0709k f4351a;

    /* renamed from: b */
    public C0689ad f4352b;

    /* renamed from: c */
    public static Bitmap f4353c = Bitmap.m5284a(64, 64, Bitmap.Config.ARGB_8888);

    /* renamed from: g */
    boolean f4357g;

    /* renamed from: d */
    HashMap f4354d = new HashMap();

    /* renamed from: e */
    ArrayList f4355e = new ArrayList();

    /* renamed from: f */
    int f4356f = 0;

    /* renamed from: h */
    boolean f4358h = false;

    /* renamed from: i */
    int f4359i = 0;

    /* renamed from: j */
    int f4360j = 0;

    /* renamed from: k */
    int f4361k = 0;

    /* renamed from: l */
    int f4362l = 1;

    public C0688ac(InterfaceC0709k interfaceC0709k, int i, int i2) {
        this.f4351a = interfaceC0709k;
        this.f4352b = new C0689ad(interfaceC0709k, i, i2);
    }

    /* renamed from: a */
    public AbstractC0699b m2674a(Bitmap bitmap) {
        C0690ae c0690ae = (C0690ae) this.f4354d.get(bitmap);
        if (c0690ae != null) {
            if (this.f4358h) {
                this.f4355e.add(bitmap);
            }
            return c0690ae;
        }
        int m5275b = bitmap.m5275b();
        int m5272c = bitmap.m5272c();
        int b = this.f4352b.mo2638b();
        int c = this.f4352b.mo2637c();
        if (this.f4359i + m5275b > b) {
            this.f4359i = 0;
            this.f4360j += this.f4361k + this.f4362l;
            this.f4361k = 0;
        }
        if (this.f4360j + m5272c > c) {
            if (!this.f4357g) {
                this.f4357g = true;
                return null;
            }
            return null;
        }
        C0690ae c0690ae2 = new C0690ae();
        c0690ae2.f4412a = this.f4352b.f4412a;
        c0690ae2.f4364l = this.f4352b;
        int i = this.f4359i;
        int i2 = this.f4360j;
        this.f4359i += m5275b + this.f4362l;
        if (this.f4361k < m5272c) {
            this.f4361k = m5272c;
        }
        this.f4352b.m2672a(this.f4351a, bitmap, i, i2);
        c0690ae2.f4367o = i;
        c0690ae2.f4368p = i2;
        c0690ae2.f4365m = i / this.f4352b.f4416e;
        c0690ae2.f4366n = i2 / this.f4352b.f4417f;
        c0690ae2.f4416e = this.f4352b.f4416e;
        c0690ae2.f4417f = this.f4352b.f4417f;
        c0690ae2.f4418g = this.f4352b.f4418g;
        c0690ae2.f4419h = this.f4352b.f4419h;
        c0690ae2.f4414c = m5275b;
        c0690ae2.f4415d = m5272c;
        this.f4356f++;
        this.f4354d.put(bitmap, c0690ae2);
        return c0690ae2;
    }

    /* renamed from: b */
    public void m2673b(Bitmap bitmap) {
        if (((C0690ae) this.f4354d.get(bitmap)) != null) {
            this.f4354d.remove(bitmap);
        }
    }
}