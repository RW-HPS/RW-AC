package com.corrodinggames.rts.game.units;

import com.corrodinggames.rts.game.PlayerData;
import com.corrodinggames.rts.game.units.p013a.C0208c;
import com.corrodinggames.rts.gameFramework.AbstractC1155w;
import com.corrodinggames.rts.gameFramework.C0643ab;
import com.corrodinggames.rts.gameFramework.C0773f;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.net.GameInputStream;
import com.corrodinggames.rts.gameFramework.net.GameOutputStream;

/* renamed from: com.corrodinggames.rts.game.units.au */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/au.class */
public final class C0305au {

    /* renamed from: a */
    EnumC0306av f1802a;

    /* renamed from: b */
    InterfaceC0303as f1803b;

    /* renamed from: c */
    C0208c f1804c;

    /* renamed from: d */
    int f1805d;

    /* renamed from: h */
    AbstractC0244am f1806h;

    /* renamed from: i */
    public C0643ab f1807i;

    /* renamed from: j */
    public boolean f1808j;

    /* renamed from: m */
    public boolean f1809m;

    /* renamed from: n */
    public boolean f1810n;

    /* renamed from: e */
    float f1811e = 1.0f;

    /* renamed from: f */
    float f1812f = 1.0f;

    /* renamed from: g */
    long f1813g = -1;

    /* renamed from: k */
    public float f1814k = -1.0f;

    /* renamed from: l */
    public float f1815l = -1.0f;

    /* renamed from: a */
    public boolean m4156a(C0305au c0305au) {
        if (C0773f.m2152c(this.f1811e - c0305au.f1811e) > 3.0f || C0773f.m2152c(this.f1812f - c0305au.f1812f) > 3.0f) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public boolean m4150b(C0305au c0305au) {
        if (c0305au == null || this.f1802a != c0305au.f1802a || this.f1803b != c0305au.f1803b || C0773f.m2152c(this.f1811e - c0305au.f1811e) > 1.0f || C0773f.m2152c(this.f1812f - c0305au.f1812f) > 1.0f || this.f1805d != c0305au.f1805d || this.f1806h != c0305au.f1806h) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public InterfaceC0303as m4160a() {
        return this.f1803b;
    }

    /* renamed from: b */
    public int m4153b() {
        return this.f1805d;
    }

    /* renamed from: a */
    public void m4155a(GameOutputStream gameOutputStream) {
        gameOutputStream.writeEnum(this.f1802a);
        gameOutputStream.mo1386a(this.f1803b);
        gameOutputStream.writeFloat(this.f1811e);
        gameOutputStream.writeFloat(this.f1812f);
        if (this.f1813g != -1) {
            gameOutputStream.writeLong(this.f1813g);
        } else {
            gameOutputStream.mo1334a(this.f1806h);
        }
        gameOutputStream.writeByte(this.f1805d);
        gameOutputStream.writeFloat(this.f1814k);
        gameOutputStream.writeFloat(this.f1815l);
        gameOutputStream.writeBoolean(this.f1809m);
        gameOutputStream.writeBoolean(this.f1808j);
        gameOutputStream.writeBoolean(this.f1810n);
        C0208c.m4338a(gameOutputStream, this.f1804c);
    }

    /* renamed from: a */
    public void m4154a(GameInputStream gameInputStream) {
        this.f1802a = (EnumC0306av) gameInputStream.m1309b(EnumC0306av.class);
        this.f1803b = gameInputStream.m1291q();
        this.f1811e = gameInputStream.readFloat();
        this.f1812f = gameInputStream.readFloat();
        this.f1813g = gameInputStream.m5459n();
        this.f1806h = null;
        if (gameInputStream.m1311b() >= 40) {
            this.f1805d = gameInputStream.readByte();
        }
        if (gameInputStream.m1311b() >= 46) {
            this.f1814k = gameInputStream.readFloat();
            this.f1815l = gameInputStream.readFloat();
        }
        if (gameInputStream.m1311b() >= 58) {
            this.f1809m = gameInputStream.readBoolean();
        }
        if (gameInputStream.m1311b() >= 65) {
            this.f1808j = gameInputStream.readBoolean();
        }
        if (gameInputStream.m1311b() >= 79) {
            this.f1810n = gameInputStream.readBoolean();
        }
        if (gameInputStream.m1311b() >= 82) {
            this.f1804c = C0208c.m4337a(gameInputStream);
        }
    }

    /* renamed from: c */
    public void m4149c() {
        if (this.f1813g != -1) {
            this.f1806h = AbstractC1155w.m443a(this.f1813g, true);
            if (this.f1806h == null) {
                GameEngine.print("convertUnitIds failed");
                if (this.f1802a != null) {
                    GameEngine.print("convertUnitIds: type:" + this.f1802a.toString());
                }
                if (this.f1803b != null) {
                    GameEngine.print("convertUnitIds: build:" + this.f1803b.toString());
                }
                GameEngine.print("convertUnitIds: x:" + this.f1811e + ", y:" + this.f1812f);
            }
            this.f1813g = -1L;
        }
    }

    /* renamed from: d */
    public EnumC0306av m4145d() {
        return this.f1802a;
    }

    /* renamed from: e */
    public void m4143e() {
        this.f1802a = EnumC0306av.f1816a;
        this.f1803b = null;
        this.f1805d = 1;
        this.f1811e = 2.0f;
        this.f1812f = 2.0f;
        this.f1813g = -1L;
        this.f1806h = null;
        this.f1807i = null;
        this.f1814k = -1.0f;
        this.f1815l = -1.0f;
        this.f1809m = false;
        this.f1808j = false;
        this.f1810n = false;
        this.f1804c = null;
    }

    /* renamed from: f */
    public boolean m4141f() {
        return this.f1802a == EnumC0306av.f1817b || this.f1802a == EnumC0306av.f1819d || this.f1802a == EnumC0306av.f1822g || this.f1802a == EnumC0306av.f1820e || this.f1802a == EnumC0306av.f1824i || this.f1802a == EnumC0306av.f1826k || this.f1802a == EnumC0306av.f1828m || this.f1802a == EnumC0306av.f1829n;
    }

    /* renamed from: g */
    public float m4139g() {
        if (m4141f() && this.f1806h != null) {
            return this.f1806h.f7172eo;
        }
        return this.f1811e;
    }

    /* renamed from: h */
    public float m4137h() {
        if (m4141f() && this.f1806h != null) {
            return this.f1806h.f7173ep;
        }
        return this.f1812f;
    }

    /* renamed from: i */
    public AbstractC0244am m4135i() {
        return this.f1806h;
    }

    /* renamed from: a */
    public void m4159a(float f, float f2) {
        m4143e();
        this.f1802a = EnumC0306av.f1816a;
        this.f1811e = f;
        this.f1812f = f2;
    }

    /* renamed from: b */
    public void m4152b(float f, float f2) {
        m4143e();
        this.f1802a = EnumC0306av.f1823h;
        this.f1811e = f;
        this.f1812f = f2;
    }

    /* renamed from: a */
    public void m4157a(AbstractC0244am abstractC0244am) {
        m4143e();
        this.f1802a = EnumC0306av.f1817b;
        this.f1806h = abstractC0244am;
    }

    /* renamed from: a */
    public void m4158a(float f, float f2, InterfaceC0303as interfaceC0303as, int i) {
        m4143e();
        this.f1802a = EnumC0306av.f1818c;
        this.f1811e = f;
        this.f1812f = f2;
        this.f1803b = interfaceC0303as;
        this.f1805d = (byte) i;
    }

    /* renamed from: b */
    public void m4151b(AbstractC0244am abstractC0244am) {
        m4143e();
        this.f1802a = EnumC0306av.f1819d;
        this.f1806h = abstractC0244am;
    }

    /* renamed from: c */
    public void m4147c(AbstractC0244am abstractC0244am) {
        m4143e();
        this.f1802a = EnumC0306av.f1826k;
        this.f1806h = abstractC0244am;
    }

    /* renamed from: d */
    public void m4144d(AbstractC0244am abstractC0244am) {
        m4143e();
        this.f1802a = EnumC0306av.f1828m;
        this.f1806h = abstractC0244am;
    }

    /* renamed from: e */
    public void m4142e(AbstractC0244am abstractC0244am) {
        m4143e();
        this.f1802a = EnumC0306av.f1829n;
        this.f1806h = abstractC0244am;
    }

    /* renamed from: c */
    public void m4148c(float f, float f2) {
        m4143e();
        this.f1802a = EnumC0306av.f1825j;
        this.f1811e = f;
        this.f1812f = f2;
    }

    /* renamed from: f */
    public void m4140f(AbstractC0244am abstractC0244am) {
        m4143e();
        this.f1802a = EnumC0306av.f1822g;
        this.f1806h = abstractC0244am;
    }

    /* renamed from: g */
    public void m4138g(AbstractC0244am abstractC0244am) {
        m4143e();
        this.f1802a = EnumC0306av.f1820e;
        this.f1806h = abstractC0244am;
    }

    /* renamed from: h */
    public void m4136h(AbstractC0244am abstractC0244am) {
        m4143e();
        this.f1802a = EnumC0306av.f1824i;
        this.f1806h = abstractC0244am;
    }

    /* renamed from: c */
    public void m4146c(C0305au c0305au) {
        m4143e();
        this.f1802a = c0305au.f1802a;
        this.f1803b = c0305au.f1803b;
        this.f1811e = c0305au.f1811e;
        this.f1812f = c0305au.f1812f;
        this.f1806h = c0305au.f1806h;
        this.f1807i = c0305au.f1807i;
        this.f1805d = c0305au.f1805d;
        this.f1808j = c0305au.f1808j;
        this.f1804c = c0305au.f1804c;
    }

    /* renamed from: j */
    public long m4134j() {
        long j = 0;
        if (this.f1802a != null) {
            j = 0 + this.f1802a.ordinal();
        }
        return j;
    }

    /* renamed from: k */
    public void m4133k() {
        if (this.f1806h != null) {
            this.f1813g = this.f1806h.f7166eh;
            this.f1806h = null;
        }
        this.f1807i = null;
    }

    /* renamed from: l */
    public AbstractC0244am m4132l() {
        if (m4141f()) {
            return m4135i();
        }
        AbstractC0629y abstractC0629y = PlayerData.f1373i.f1316t;
        abstractC0629y.f1623cg = 0.0f;
        abstractC0629y.f7172eo = this.f1811e;
        abstractC0629y.f7173ep = this.f1812f;
        abstractC0629y.f7174eq = 0.0f;
        return abstractC0629y;
    }
}