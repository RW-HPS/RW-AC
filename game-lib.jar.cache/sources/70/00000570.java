package com.corrodinggames.rts.gameFramework.unitAction;

import android.graphics.Bitmap;
import com.corrodinggames.rts.game.EnumC0198o;
import com.corrodinggames.rts.gameFramework.GameEngine;

/* renamed from: com.corrodinggames.rts.gameFramework.m.e */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/m/e.class */
public class C0970e {

    /* renamed from: a */
    public C0970e[] f6606a;

    /* renamed from: b */
    public C0970e[] f6607b;

    /* renamed from: c */
    public C0970e[] f6608c;

    /* renamed from: x */
    private static int f6609x;

    /* renamed from: d */
    public int f6610d;

    /* renamed from: e */
    public int f6611e;

    /* renamed from: f */
    public int f6612f;

    /* renamed from: g */
    public String f6613g;

    /* renamed from: h */
    public Integer f6614h;

    /* renamed from: i */
    C0964ae f6615i;

    /* renamed from: j */
    public int[] f6616j;

    /* renamed from: k */
    protected Bitmap f6617k;

    /* renamed from: m */
    public boolean f6618m;

    /* renamed from: n */
    public boolean f6619n;

    /* renamed from: p */
    public int f6620p;

    /* renamed from: q */
    public int f6621q;

    /* renamed from: r */
    public int f6622r;

    /* renamed from: s */
    public int f6623s;

    /* renamed from: t */
    public float f6624t;

    /* renamed from: u */
    public float f6625u;

    /* renamed from: v */
    public boolean f6626v;

    /* renamed from: l */
    public boolean f6627l = true;

    /* renamed from: o */
    public boolean f6628o = false;

    /* renamed from: w */
    boolean f6629w = false;

    public C0970e() {
        int i = f6609x;
        f6609x = i + 1;
        this.f6610d = i;
        this.f6611e = 1;
    }

    /* renamed from: a */
    public C0970e[] m905a(EnumC0198o enumC0198o) {
        if (enumC0198o == EnumC0198o.pureGreen) {
            return this.f6606a;
        }
        if (enumC0198o == EnumC0198o.hueAdd) {
            return this.f6607b;
        }
        if (enumC0198o == EnumC0198o.hueShift) {
            return this.f6608c;
        }
        GameEngine.print("getTeamImageCache coloringMode:" + enumC0198o);
        return this.f6606a;
    }

    /* renamed from: a */
    public void m904a(EnumC0198o enumC0198o, C0970e[] c0970eArr) {
        if (enumC0198o == EnumC0198o.pureGreen) {
            this.f6606a = c0970eArr;
        } else if (enumC0198o == EnumC0198o.hueAdd) {
            this.f6607b = c0970eArr;
        } else if (enumC0198o == EnumC0198o.hueShift) {
            this.f6608c = c0970eArr;
        } else {
            GameEngine.print("setTeamImageCache coloringMode:" + enumC0198o);
            this.f6606a = c0970eArr;
        }
    }

    /* renamed from: a */
    public void m902a(String str) {
        this.f6613g = str;
    }

    /* renamed from: a */
    public String mo65a() {
        return this.f6613g;
    }

    /* renamed from: b */
    public Bitmap mo391b() {
        return this.f6617k;
    }

    /* renamed from: c */
    public C0970e mo390c() {
        return this;
    }

    /* renamed from: a */
    public void mo392a(boolean z) {
        this.f6628o = z;
        mo56e();
    }

    /* renamed from: b */
    public void m901b(boolean z) {
        this.f6629w = z;
    }

    /* renamed from: d */
    public boolean m900d() {
        return this.f6629w;
    }

    /* renamed from: e */
    protected void mo56e() {
    }

    /* renamed from: f */
    public boolean m899f() {
        return this.f6618m;
    }

    /* renamed from: a */
    public void mo394a(Bitmap bitmap) {
        this.f6617k = bitmap;
        this.f6620p = this.f6617k.m5275b();
        this.f6621q = this.f6617k.m5272c();
        mo389g();
    }

    /* renamed from: g */
    public void mo389g() {
        this.f6622r = this.f6620p / 2;
        this.f6623s = this.f6621q / 2;
        this.f6624t = this.f6620p / 2.0f;
        this.f6625u = this.f6621q / 2.0f;
    }

    /* renamed from: a */
    public void mo393a(C0970e c0970e) {
        c0970e.f6628o = this.f6628o;
        c0970e.f6620p = this.f6620p;
        c0970e.f6621q = this.f6621q;
        c0970e.f6622r = this.f6622r;
        c0970e.f6623s = this.f6623s;
        c0970e.f6624t = this.f6624t;
        c0970e.f6625u = this.f6625u;
    }

    @Override // 
    /* renamed from: h */
    public C0970e clone() {
        C0970e c0970e = new C0970e();
        c0970e.f6628o = this.f6628o;
        if (this.f6617k != null) {
            Bitmap m5281a = this.f6617k.m5281a(this.f6617k.m5270d(), true);
            if (m5281a == null) {
                throw new OutOfMemoryError("Failed to copy bitmap: " + this.f6617k.m5270d());
            }
            c0970e.mo394a(m5281a);
        }
        return c0970e;
    }

    /* renamed from: a */
    public C0970e mo62a(int i, int i2, boolean z) {
        C0970e c0970e = new C0970e();
        c0970e.f6628o = this.f6628o;
        if (this.f6617k != null) {
            Bitmap m5284a = Bitmap.m5284a(i, i2, this.f6617k.m5270d());
            c0970e.mo394a(m5284a);
            if (z) {
                for (int i3 = 0; i3 < m5284a.m5275b(); i3++) {
                    for (int i4 = 0; i4 < m5284a.m5272c(); i4++) {
                        m5284a.m5286a(i3, i4, this.f6617k.m5287a(i3, i4));
                    }
                }
            }
        }
        return c0970e;
    }

    /* renamed from: i */
    public void mo54i() {
        if (this.f6616j == null) {
            mo53j();
        }
    }

    /* renamed from: j */
    public void mo53j() {
        if (this.f6617k == null && GameEngine.f6418aU && !GameEngine.f6421aX) {
            return;
        }
        if (this.f6616j == null) {
            this.f6616j = new int[this.f6620p * this.f6621q];
        }
        this.f6617k.m5276a(this.f6616j, 0, this.f6620p, 0, 0, this.f6620p, this.f6621q);
    }

    /* renamed from: k */
    public boolean mo52k() {
        return true;
    }

    /* renamed from: a */
    public int mo64a(int i, int i2) {
        if (this.f6616j != null) {
            return this.f6616j[i + (i2 * this.f6620p)];
        }
        return this.f6617k.m5287a(i, i2);
    }

    /* renamed from: a */
    public void mo63a(int i, int i2, int i3) {
        if (this.f6616j != null) {
            this.f6616j[i + (i2 * this.f6620p)] = i3;
        } else {
            this.f6617k.m5286a(i, i2, i3);
        }
    }

    /* renamed from: l */
    public int mo388l() {
        return this.f6621q;
    }

    /* renamed from: m */
    public int mo387m() {
        return this.f6620p;
    }

    /* renamed from: n */
    public void mo51n() {
    }

    /* renamed from: o */
    public void mo50o() {
        if (this.f6617k != null) {
            this.f6617k = null;
        }
        if (this.f6629w) {
            GameEngine.print("remove with keepInGPUMemory=true");
        }
    }

    /* renamed from: p */
    public void mo49p() {
        if (this.f6617k == null && GameEngine.f6418aU && !GameEngine.f6420aW) {
            return;
        }
        if (this.f6616j != null) {
            this.f6617k.m5273b(this.f6616j, 0, this.f6620p, 0, 0, this.f6620p, this.f6621q);
            this.f6616j = null;
        }
        this.f6611e++;
    }

    /* renamed from: q */
    public void mo48q() {
    }

    /* renamed from: r */
    public void mo47r() {
        this.f6616j = null;
    }

    /* renamed from: s */
    public void mo46s() {
        mo47r();
    }

    /* renamed from: t */
    public void mo45t() {
    }

    /* renamed from: u */
    public int mo386u() {
        return this.f6620p * this.f6621q * 8;
    }

    /* renamed from: v */
    public void mo385v() {
        this.f6606a = null;
        this.f6607b = null;
        this.f6608c = null;
        this.f6611e++;
    }

    /* renamed from: w */
    public void mo384w() {
    }

    /* renamed from: x */
    public void mo44x() {
    }

    /* renamed from: y */
    public void mo43y() {
    }

    /* renamed from: z */
    public void m898z() {
    }

    /* renamed from: A */
    public boolean mo395A() {
        return false;
    }

    /* renamed from: B */
    public C0964ae mo906B() {
        return this.f6615i;
    }

    /* renamed from: a */
    public void mo903a(C0964ae c0964ae) {
        this.f6615i = c0964ae;
    }
}