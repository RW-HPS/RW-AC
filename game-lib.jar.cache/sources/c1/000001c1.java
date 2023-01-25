package com.corrodinggames.rts.game.units;

import android.graphics.Paint;
import android.graphics.Rect;
import com.corrodinggames.rts.C0067R;
import com.corrodinggames.rts.game.C0188f;
import com.corrodinggames.rts.gameFramework.C0773f;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.net.GameInputStream;
import com.corrodinggames.rts.gameFramework.net.GameOutputStream;
import com.corrodinggames.rts.gameFramework.p035d.C0760e;
import com.corrodinggames.rts.gameFramework.p035d.EnumC0759d;
import com.corrodinggames.rts.gameFramework.p035d.EnumC0763h;
import com.corrodinggames.rts.gameFramework.unitAction.C0970e;
import com.corrodinggames.rts.gameFramework.unitAction.InterfaceC1063y;

/* renamed from: com.corrodinggames.rts.game.units.al */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/al.class */
public class C0243al extends AbstractC0626v {

    /* renamed from: a */
    static C0970e[] f1568a = new C0970e[3];

    /* renamed from: b */
    static C0970e f1569b = null;

    /* renamed from: c */
    C0970e f1570c;

    /* renamed from: d */
    int f1571d;

    /* renamed from: e */
    int f1572e;

    /* renamed from: f */
    int f1573f;

    /* renamed from: g */
    float f1574g;

    /* renamed from: h */
    boolean f1575h;

    /* renamed from: i */
    float f1576i;

    /* renamed from: j */
    int f1577j;

    /* renamed from: k */
    int f1578k;

    /* renamed from: l */
    float f1579l;

    /* renamed from: m */
    boolean f1580m;

    /* renamed from: b */
    public static void m4261b() {
        GameEngine gameEngine = GameEngine.getGameEngine();
        f1568a[0] = gameEngine.f6374bO.mo222a(C0067R.drawable.palm_tree);
        f1568a[1] = gameEngine.f6374bO.mo222a(C0067R.drawable.trees);
        f1568a[2] = gameEngine.f6374bO.mo222a(C0067R.drawable.trees_snow);
        f1569b = gameEngine.f6374bO.mo222a(C0067R.drawable.palm_leaves);
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0244am, com.corrodinggames.rts.gameFramework.AbstractC0674az, com.corrodinggames.rts.gameFramework.AbstractC1155w, com.corrodinggames.rts.gameFramework.AbstractC0741bq
    /* renamed from: a */
    public void mo442a(GameOutputStream gameOutputStream) {
        gameOutputStream.writeInt(this.f1571d);
        gameOutputStream.writeInt(this.f1573f);
        gameOutputStream.writeFloat(this.f1574g);
        gameOutputStream.writeBoolean(this.f1575h);
        gameOutputStream.writeFloat(this.f1576i);
        gameOutputStream.writeByte(2);
        gameOutputStream.writeFloat(this.f1579l);
        gameOutputStream.writeInt(this.f1572e);
        super.mo442a(gameOutputStream);
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0244am, com.corrodinggames.rts.gameFramework.AbstractC0674az, com.corrodinggames.rts.gameFramework.AbstractC1155w
    /* renamed from: a */
    public void mo441a(GameInputStream gameInputStream) {
        this.f1571d = gameInputStream.readInt();
        this.f1573f = gameInputStream.readInt();
        this.f1574g = gameInputStream.readFloat();
        this.f1575h = gameInputStream.readBoolean();
        this.f1576i = gameInputStream.readFloat();
        byte readByte = gameInputStream.readByte();
        if (readByte >= 1) {
            this.f1579l = gameInputStream.readFloat();
        } else {
            this.f1579l = 1.0f;
        }
        if (readByte >= 2) {
            this.f1572e = gameInputStream.readInt();
        } else {
            this.f1572e = 0;
        }
        m4260b(this.f1571d, this.f1572e);
        super.mo441a(gameInputStream);
        if (this.f1612bV) {
            this.f1580m = false;
        }
    }

    /* renamed from: d */
    public C0970e m4259d() {
        return this.f1570c;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: e */
    public boolean mo3071e() {
        m4257k();
        return true;
    }

    public C0243al(boolean z) {
        super(z);
        this.f1573f = 0;
        this.f1577j = 0;
        this.f1578k = 0;
        this.f1579l = 1.0f;
        this.f1580m = false;
        m4260b(1, -1);
        this.f1626cj = 3.0f;
        this.f1627ck = this.f1626cj + 1.0f;
        this.f1638cv = 100.0f;
        this.f1637cu = this.f1638cv;
        this.f1623cg = -90.0f;
        m448S(3);
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: a_ */
    public void mo3451a_(String str) {
        int i = -1;
        String[] split = str.split("\\.");
        if (split.length != 0 && split.length != 1) {
            if (split.length == 2) {
                str = split[0];
                try {
                    i = Integer.parseInt(split[1]);
                } catch (NumberFormatException e) {
                    throw new RuntimeException("Tree sub type format error:" + split[1]);
                }
            } else {
                throw new RuntimeException("Tree sub unknown format with parts:" + split.length);
            }
        }
        try {
            m4260b(Integer.parseInt(str), i);
        } catch (NumberFormatException e2) {
            throw new RuntimeException("Tree type format error:" + str);
        }
    }

    /* renamed from: b */
    public void m4260b(int i, int i2) {
        this.f1571d = i;
        this.f1572e = i2;
        if (this.f1571d == 0) {
            m2729T(27);
            m2728U(41);
            this.f1577j = 1;
            this.f1578k = 1;
            this.f1570c = f1568a[0];
        } else if (this.f1571d == 1 || this.f1571d == 2) {
            if (i2 == -1) {
                i2 = C0773f.m2208a(0, 4, (int) this.f7166eh);
            }
            if (i2 < 0 || i2 > 4) {
                throw new RuntimeException("Tree subType out of range:" + i2);
            }
            m2729T(25);
            m2728U(30);
            if (this.f1571d == 1) {
                this.f1570c = f1568a[1];
            } else {
                this.f1570c = f1568a[2];
            }
            this.f1577j = 0;
            this.f1578k = 30 * i2;
            if (i2 == 0) {
                this.f1579l = C0773f.m2214a(1.0f, 1.2f, ((int) this.f7166eh) + 1);
            } else {
                this.f1579l = C0773f.m2214a(1.0f, 2.0f, ((int) this.f7166eh) + 1);
            }
            this.f1580m = true;
        } else {
            throw new RuntimeException("Tree type:" + this.f1571d + " is not supported");
        }
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0244am, com.corrodinggames.rts.gameFramework.AbstractC1155w
    /* renamed from: a */
    public void mo446a(float f) {
        if (this.f1571d == 0) {
            if (this.f1575h) {
                if (this.f1573f < 4) {
                    this.f1574g += f;
                    if (this.f1574g > 5.0f) {
                        this.f1574g = 0.0f;
                        this.f1573f++;
                    }
                }
            } else if (this.f1576i != 0.0f) {
                this.f1576i = C0773f.m2218a(this.f1576i, 0.1f * f);
                this.f1573f = 2;
            } else if (this.f1573f > 1) {
                this.f1573f = 1;
            }
        }
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: a_ */
    public Rect mo3228a_(boolean z) {
        int i = this.f1577j;
        int i2 = this.f1578k;
        int i3 = i + (this.f1573f * (this.f4260es + 1));
        f1697dC.m5166a(i3, i2, i3 + this.f4260es, i2 + this.f4261et);
        return f1697dC;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0244am, com.corrodinggames.rts.gameFramework.AbstractC1155w
    /* renamed from: c */
    public boolean mo438c(float f) {
        C0970e m4259d = m4259d();
        GameEngine gameEngine = GameEngine.getGameEngine();
        if (gameEngine.f6435cX < 0.15d) {
            return false;
        }
        f1689du.m5150a(mo3390cF());
        f1689du.m5153a(0.0f, (int) (-this.f7175eq));
        float m5141d = f1689du.m5141d();
        float m5140e = f1689du.m5140e();
        f1690dv.m5165a(mo3228a_(false));
        InterfaceC1063y interfaceC1063y = gameEngine.f6374bO;
        interfaceC1063y.mo136k();
        if (this.f1579l != 1.0f) {
            interfaceC1063y.mo227a(this.f1579l, this.f1579l, m5141d, m5140e);
        }
        if (this.f1580m) {
            f1690dv.m5167a(this.f4260es, 0);
            gameEngine.f6374bO.mo193a(m4259d, f1690dv, f1689du, (Paint) null);
            f1690dv.m5167a(-this.f4260es, 0);
        }
        interfaceC1063y.mo228a(mo3260d(false), m5141d, m5140e);
        interfaceC1063y.mo193a(m4259d, f1690dv, f1689du, (Paint) null);
        interfaceC1063y.mo135l();
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: h */
    public EnumC0246ao mo3069h() {
        return EnumC0246ao.NONE;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: i */
    public boolean mo3068i() {
        return false;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: Q */
    public boolean mo3074Q() {
        return false;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: aj */
    public boolean mo2951aj() {
        return false;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: ak */
    public boolean mo2950ak() {
        return false;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: s_ */
    public boolean mo2829s_() {
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: c_ */
    public boolean mo3619c_() {
        return false;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: f */
    public EnumC0249ar mo1747r() {
        return EnumC0249ar.tree;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: a */
    public boolean mo4246a(AbstractC0244am abstractC0244am, float f) {
        if (!this.f1575h) {
            if (this.f1576i == 0.0f) {
            }
            this.f1637cu -= (((abstractC0244am.mo3137bN() / 3000.0f) * this.f1638cv) * 0.06f) * f;
            this.f1576i = 1.0f;
            this.f1684dp = 1000.0f;
            if (this.f1637cu <= 0.0f) {
                this.f1623cg = C0773f.m2138d(this.f7173eo, this.f7174ep, abstractC0244am.f7173eo, abstractC0244am.f7174ep) + 180.0f;
                m4257k();
            }
            if (!this.f1575h) {
                return false;
            }
            return true;
        }
        return true;
    }

    /* renamed from: k */
    public void m4257k() {
        if (!this.f1575h) {
            GameEngine gameEngine = GameEngine.getGameEngine();
            this.f1573f = 2;
            this.f1574g = 0.0f;
            m448S(0);
            this.f1610bT = false;
            this.f1612bV = true;
            this.f1613bW = gameEngine.f6358by;
            this.f1575h = true;
            this.f1580m = false;
            for (int i = 0; i < 1; i++) {
                gameEngine.f6377bR.m2394a();
                C0760e m2365b = gameEngine.f6377bR.m2365b(this.f7173eo + C0773f.m2151c(-12.0f, 12.0f), this.f7174ep + C0773f.m2151c(-12.0f, 12.0f), this.f7175eq, EnumC0759d.custom, false, EnumC0763h.high);
                if (m2365b != null) {
                    m2365b.f4868aq = 9;
                    m2365b.f4867ap = C0773f.rand(4, 5);
                    m2365b.f4850Y = C0773f.m2151c(-180.0f, 180.0f);
                    m2365b.f4865an = true;
                    m2365b.f4836K = 5.0f + C0773f.m2151c(0.0f, 3.0f);
                    m2365b.f4841P = C0773f.m2151c(-0.05f, 0.05f) + (C0773f.m2107k(this.f1623cg) * 0.4f);
                    m2365b.f4842Q = C0773f.m2151c(-0.05f, 0.05f) + (C0773f.m2110j(this.f1623cg) * 0.4f);
                    m2365b.f4821v = true;
                    m2365b.f4822w = 0.2f;
                    m2365b.f4832G = 0.4f * this.f1579l;
                    m2365b.f4831F = 0.4f * this.f1579l;
                    m2365b.f4847V = 90 + C0773f.rand(0, 40);
                    m2365b.f4848W = m2365b.f4847V;
                    m2365b.f4817r = true;
                    m2365b.f4869ar = (short) 2;
                }
            }
            float m2107k = this.f7173eo + (C0773f.m2107k(this.f1623cg) * (this.f4261et - 5));
            float m2110j = this.f7174ep + (C0773f.m2110j(this.f1623cg) * (this.f4261et - 5));
            boolean z = true;
            for (int i2 = 0; i2 < 1; i2++) {
                gameEngine.f6377bR.m2394a();
                C0760e m2365b2 = gameEngine.f6377bR.m2365b(m2107k + C0773f.m2151c(-17, 17), m2110j + C0773f.m2151c(-17, 17), this.f7175eq, EnumC0759d.custom, false, EnumC0763h.high);
                if (m2365b2 != null) {
                    m2365b2.f4868aq = 9;
                    m2365b2.f4867ap = C0773f.rand(4, 5);
                    if (z) {
                        z = false;
                        m2365b2.f4867ap = 3;
                    }
                    m2365b2.f4850Y = C0773f.m2151c(-180.0f, 180.0f);
                    m2365b2.f4865an = true;
                    if (m2365b2.f4867ap == 3) {
                        m2365b2.f4841P = C0773f.m2151c(-0.05f, 0.05f);
                        m2365b2.f4842Q = C0773f.m2151c(-0.05f, 0.05f);
                        m2365b2.f4832G = 1.5f * this.f1579l;
                        m2365b2.f4831F = 2.2f * this.f1579l;
                        m2365b2.f4847V = 90 + C0773f.rand(0, 40);
                        m2365b2.f4869ar = (short) 2;
                    } else {
                        m2365b2.f4841P = C0773f.m2151c(-0.05f, 0.05f);
                        m2365b2.f4842Q = C0773f.m2151c(-0.05f, 0.0f);
                        m2365b2.f4832G = 1.3f;
                        m2365b2.f4831F = 1.3f;
                        m2365b2.f4847V = 60 + C0773f.rand(0, 40);
                        m2365b2.f4869ar = (short) 1;
                    }
                    m2365b2.f4848W = m2365b2.f4847V;
                    m2365b2.f4817r = true;
                }
            }
            if (this.f1571d == 1 || this.f1571d == 2) {
                this.f7173eo += C0773f.m2107k(this.f1623cg) * ((this.f4261et / 2) - 3);
                this.f7174ep += C0773f.m2110j(this.f1623cg) * ((this.f4261et / 2) - 3);
            }
        }
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: n */
    public void mo3284n() {
        super.mo3284n();
        this.f1623cg = C0773f.m2212a((this.f7174ep * 5.0f) + (this.f7173eo * 3.0f), false);
        if (this.f1571d == 0) {
            this.f1573f = ((int) ((this.f7174ep * 5.0f) + (this.f7173eo * 3.0f))) % 1;
        }
        if (this.f1571d == 1) {
        }
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: x */
    public float mo3574x() {
        return -1.0f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: l */
    public boolean mo3067l() {
        return false;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: a */
    public float mo3073a(AbstractC0244am abstractC0244am, float f, C0188f c0188f) {
        boolean z = this.f1612bV;
        float a = super.mo3073a(abstractC0244am, f, c0188f);
        if (!z && this.f1612bV && c0188f != null) {
            this.f1623cg = C0773f.m2138d(this.f7173eo, this.f7174ep, c0188f.f7173eo, c0188f.f7174ep) + 180.0f;
        }
        return a;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: q */
    public boolean mo3281q() {
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: t */
    public boolean mo1746t() {
        return true;
    }
}