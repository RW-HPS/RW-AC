package com.corrodinggames.rts.gameFramework.unitAction;

import android.graphics.Paint;
import com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope;
import com.corrodinggames.rts.gameFramework.C0773f;
import com.corrodinggames.rts.gameFramework.FileChangeEngine;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.file.C0765a;
import com.corrodinggames.rts.gameFramework.utility.C1133j;
import java.io.IOException;
import java.util.Arrays;

/* renamed from: com.corrodinggames.rts.gameFramework.m.ae */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/m/ae.class */
public class C0964ae {

    /* renamed from: c */
    public String f6566c;

    /* renamed from: d */
    public String f6567d;

    /* renamed from: e */
    public String f6568e;

    /* renamed from: f */
    public String f6569f;

    /* renamed from: g */
    public int f6570g;

    /* renamed from: h */
    public int f6571h;

    /* renamed from: i */
    String f6572i;

    /* renamed from: j */
    String f6573j;

    /* renamed from: k */
    long f6574k;

    /* renamed from: l */
    long f6575l;

    /* renamed from: m */
    public boolean f6576m;

    /* renamed from: n */
    public int f6577n;

    /* renamed from: o */
    public int f6578o;

    /* renamed from: p */
    public C0965af[] f6579p;

    /* renamed from: q */
    public Object f6580q;

    /* renamed from: r */
    public int f6581r;

    /* renamed from: s */
    int f6582s;

    /* renamed from: a */
    public void m932a(String str, float f) {
        m933a(str).m921a(f);
    }

    /* renamed from: a */
    public void m931a(String str, float f, float f2) {
        m933a(str).m920a(f, f2);
    }

    /* renamed from: a */
    public void m930a(String str, int i) {
        m933a(str).m919a(((i >> 16) & 255) * 0.003921569f, ((i >> 8) & 255) * 0.003921569f, (i & 255) * 0.003921569f, (i >>> 24) * 0.003921569f);
    }

    /* renamed from: a */
    public void m929a(String str, C0970e c0970e) {
        m933a(str).m918a(c0970e);
    }

    /* renamed from: b */
    public void m926b(String str, C0970e c0970e) {
        m933a(str).m917b(c0970e);
    }

    /* renamed from: a */
    public C0965af m933a(String str) {
        C0965af[] c0965afArr;
        for (C0965af c0965af : this.f6579p) {
            if (c0965af.f6583a.equals(str)) {
                return c0965af;
            }
        }
        C0965af c0965af2 = new C0965af();
        c0965af2.f6583a = str;
        C0965af[] c0965afArr2 = (C0965af[]) Arrays.copyOf(this.f6579p, this.f6579p.length + 1);
        c0965afArr2[c0965afArr2.length - 1] = c0965af2;
        this.f6579p = c0965afArr2;
        return c0965af2;
    }

    public C0964ae(String str) {
        this.f6567d = VariableScope.nullOrMissingString;
        this.f6579p = new C0965af[0];
        m928a(GameEngine.f6422aY ? "assets/shaders/plainGDX.vert" : "assets/shaders/plain.vert", str);
    }

    /* renamed from: a */
    public void m928a(String str, String str2) {
        this.f6566c = C0773f.m2118g(str2);
        this.f6572i = str;
        this.f6573j = str2;
        m924d();
        m923e();
    }

    public C0964ae() {
        this.f6567d = VariableScope.nullOrMissingString;
        this.f6579p = new C0965af[0];
        this.f6566c = "Invalid";
        this.f6578o = 1;
    }

    /* renamed from: d */
    public void m924d() {
        C1133j m2276k = C0765a.m2276k(this.f6572i);
        if (m2276k == null) {
            throw new IOException("Cannot find: " + this.f6572i);
        }
        this.f6568e = C0773f.m2193a(m2276k);
        C1133j m2276k2 = C0765a.m2276k(this.f6573j);
        if (m2276k2 == null) {
            throw new IOException("Cannot find: " + this.f6573j);
        }
        this.f6569f = C0773f.m2193a(m2276k2);
    }

    /* renamed from: b */
    public void m927b(String str) {
        GameEngine.m5460e("shader(" + this.f6566c + "): " + str);
    }

    /* renamed from: c */
    public void m925c(String str) {
        if (this.f6581r < 3) {
            this.f6581r++;
            GameEngine.m973p("shader(" + this.f6566c + "): " + str);
        }
        GameEngine.m1066a("shader(" + this.f6566c + "): " + str);
        this.f6578o = 1;
    }

    /* renamed from: a */
    public boolean mo886a() {
        return false;
    }

    /* renamed from: b */
    public boolean mo884b() {
        return false;
    }

    /* renamed from: a */
    public boolean mo885a(Paint paint, C0970e c0970e) {
        return false;
    }

    /* renamed from: e */
    public boolean m923e() {
        long m1642a = FileChangeEngine.m1642a(this.f6572i, false);
        long m1642a2 = FileChangeEngine.m1642a(this.f6573j, false);
        boolean z = (m1642a == this.f6574k && m1642a2 == this.f6575l) ? false : true;
        this.f6574k = m1642a;
        this.f6575l = m1642a2;
        return z;
    }

    /* renamed from: f */
    public void m922f() {
        C0965af[] c0965afArr;
        this.f6582s++;
        if (this.f6582s < 100) {
            return;
        }
        this.f6582s = 0;
        if (m923e()) {
            m927b("Reloading shader");
            try {
                m924d();
                this.f6576m = true;
                this.f6578o = 0;
                for (C0965af c0965af : this.f6579p) {
                    c0965af.f6585c = true;
                    c0965af.f6584b = -1;
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: c */
    public void mo883c() {
        GameEngine.getGameEngine().f6326bO.mo204a(this);
    }
}