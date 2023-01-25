package com.corrodinggames.rts.game.units;

import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.Rect;
import com.corrodinggames.rts.C0067R;
import com.corrodinggames.rts.game.C0188f;
import com.corrodinggames.rts.game.PlayerData;
import com.corrodinggames.rts.game.p012b.C0173b;
import com.corrodinggames.rts.game.p012b.C0180g;
import com.corrodinggames.rts.gameFramework.AbstractC1155w;
import com.corrodinggames.rts.gameFramework.C0773f;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.net.GameInputStream;
import com.corrodinggames.rts.gameFramework.net.GameOutputStream;
import com.corrodinggames.rts.gameFramework.unitAction.C0970e;

/* renamed from: com.corrodinggames.rts.game.units.ai */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/ai.class */
public class C0240ai extends AbstractC0626v {

    /* renamed from: b */
    C0970e f1545b;

    /* renamed from: c */
    int f1546c;

    /* renamed from: d */
    int f1547d;

    /* renamed from: e */
    float f1548e;

    /* renamed from: f */
    float f1549f;

    /* renamed from: g */
    int f1550g;

    /* renamed from: h */
    int f1551h;

    /* renamed from: i */
    float f1552i;

    /* renamed from: j */
    float f1553j;

    /* renamed from: k */
    boolean f1554k;

    /* renamed from: l */
    float f1555l;

    /* renamed from: m */
    float f1556m;

    /* renamed from: n */
    float f1557n;

    /* renamed from: o */
    float f1558o;

    /* renamed from: p */
    float f1559p;

    /* renamed from: q */
    float f1560q;

    /* renamed from: r */
    boolean f1561r;

    /* renamed from: u */
    Rect f1564u;

    /* renamed from: a */
    static C0970e[] f1544a = new C0970e[2];

    /* renamed from: s */
    static Point f1562s = new Point();

    /* renamed from: t */
    public static C0241aj f1563t = new C0241aj();

    /* renamed from: b */
    public static void m4268b() {
        f1544a[0] = GameEngine.getGameEngine().f6326bO.mo222a(C0067R.drawable.fire);
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0244am, com.corrodinggames.rts.gameFramework.AbstractC0674az, com.corrodinggames.rts.gameFramework.AbstractC1155w, com.corrodinggames.rts.gameFramework.AbstractC0741bq
    /* renamed from: a */
    public void mo442a(GameOutputStream gameOutputStream) {
        gameOutputStream.writeInt(this.f1546c);
        gameOutputStream.writeInt(this.f1547d);
        gameOutputStream.writeFloat(this.f1548e);
        gameOutputStream.writeByte(0);
        super.mo442a(gameOutputStream);
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0244am, com.corrodinggames.rts.gameFramework.AbstractC0674az, com.corrodinggames.rts.gameFramework.AbstractC1155w
    /* renamed from: a */
    public void mo441a(GameInputStream gameInputStream) {
        this.f1546c = gameInputStream.readInt();
        this.f1547d = gameInputStream.readInt();
        this.f1548e = gameInputStream.readFloat();
        gameInputStream.readByte();
        super.mo441a(gameInputStream);
    }

    /* renamed from: d */
    public C0970e m4266d() {
        return this.f1545b;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: e */
    public boolean mo3071e() {
        return false;
    }

    public C0240ai(boolean z) {
        super(z);
        this.f1547d = 0;
        this.f1550g = 0;
        this.f1551h = 0;
        this.f1554k = false;
        this.f1564u = new Rect();
        m4269a(0);
        this.f1626cj = 20.0f;
        this.f1627ck = this.f1626cj + 1.0f;
        this.f1638cv = 100.0f;
        this.f1637cu = this.f1638cv;
        this.f1623cg = -90.0f;
        this.f1610bT = false;
        this.f1558o = 0.05f;
        this.f1559p = 120.0f;
        m448S(3);
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: f_ */
    public void mo3070f_() {
        this.f1610bT = false;
    }

    /* renamed from: a */
    public void m4269a(int i) {
        this.f1546c = i;
        if (this.f1546c == 0) {
            m2729T(20);
            m2728U(20);
            this.f1550g = 0;
            this.f1551h = 0;
            this.f1545b = f1544a[0];
            return;
        }
        throw new RuntimeException("Fire type:" + this.f1546c + " is not supported");
    }

    /* renamed from: f */
    public void m4265f() {
        this.f1554k = true;
        this.f1552i = C0773f.m2195a((AbstractC1155w) this, -5, 5, 1);
        this.f1553j = C0773f.m2195a((AbstractC1155w) this, -5, 5, 2);
        this.f1548e = C0773f.m2195a((AbstractC1155w) this, 1, 10, 3);
        this.f1547d = C0773f.m2195a((AbstractC1155w) this, 0, 2, 4);
        this.f1549f = C0773f.m2195a((AbstractC1155w) this, 7, 13, 5);
        GameEngine gameEngine = GameEngine.getGameEngine();
        C0173b c0173b = gameEngine.f6323bL;
        gameEngine.f6323bL.m4664a(this.f7172eo, this.f7173ep);
        int i = gameEngine.f6323bL.f802T;
        int i2 = gameEngine.f6323bL.f803U;
        if (!c0173b.m4620c(i, i2)) {
            this.f1555l = 0.0f;
            this.f1556m = 0.0f;
            this.f1557n = 2.0f;
            return;
        }
        C0180g m4572a = gameEngine.f6323bL.f834u.m4572a(i, i2);
        boolean z = false;
        if (m4572a.f919e || m4572a.f922h || m4572a.f925k || m4572a.f920f) {
            z = true;
        }
        if (z) {
            this.f1555l = 0.0f;
            this.f1556m = 0.0f;
            this.f1557n = 2.0f;
            return;
        }
        this.f1555l = 5.0E-4f;
        this.f1556m = 1.0f;
        this.f1557n = 0.3f;
        this.f1558o += C0773f.m2195a((AbstractC1155w) this, 0, 10, 10) / 1000.0f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0244am, com.corrodinggames.rts.gameFramework.AbstractC1155w
    /* renamed from: a */
    public void mo446a(float f) {
        super.mo446a(f);
        if (!this.f1554k) {
            m4265f();
        }
        if (this.f1558o < this.f1556m) {
            this.f1558o += this.f1555l * f;
            if (this.f1558o > this.f1556m) {
                this.f1558o = this.f1556m;
            }
        }
        if (this.f1558o > this.f1557n) {
            this.f1560q = (float) (this.f1560q + (0.01d * f));
            if ((!this.f1561r && this.f1560q > 1.0f) || this.f1560q > 8.0f) {
                this.f1560q = C0773f.m2195a((AbstractC1155w) this, 0, 10, 10) / 1000.0f;
                m4264k();
            }
        }
        this.f1548e += f;
        if (this.f1548e > 10.0f) {
            this.f1548e = 0.0f;
            this.f1547d++;
            if (this.f1547d > 3) {
                this.f1547d = 0;
            }
        }
        if (this.f1558o < 0.0f) {
            mo2890bv();
        }
    }

    /* renamed from: k */
    public void m4264k() {
        this.f1561r = true;
        m4267b(-1, -1);
        m4267b(0, -1);
        m4267b(1, -1);
        m4267b(-1, 0);
        m4267b(1, 0);
        m4267b(-1, 1);
        m4267b(0, 1);
        m4267b(1, 1);
    }

    /* renamed from: b */
    public void m4267b(int i, int i2) {
        GameEngine gameEngine = GameEngine.getGameEngine();
        float f = (int) (this.f7172eo + (i * gameEngine.f6323bL.f786n));
        float f2 = (int) (this.f7173ep + (i2 * gameEngine.f6323bL.f787o));
        if (m4270a(f, f2) == null) {
            C0240ai c0240ai = new C0240ai(false);
            c0240ai.f7172eo = f;
            c0240ai.f7173ep = f2;
            c0240ai.mo2928b(this.f1614bX);
            gameEngine.f6340cc.m3203a(c0240ai);
            PlayerData.m4401c(c0240ai);
            this.f1561r = false;
        }
    }

    /* renamed from: a */
    public static C0240ai m4270a(float f, float f2) {
        GameEngine gameEngine = GameEngine.getGameEngine();
        f1563t.m4262a(f, f2);
        gameEngine.f6340cc.m3208a(f, f2, 30.0f, null, 1.0f, f1563t);
        return f1563t.f1567c;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: a_ */
    public Rect mo3227a_(boolean z) {
        int i = this.f1550g;
        int i2 = this.f1551h;
        int i3 = i + (this.f1547d * this.f4260es);
        f1697dC.m5172a(i3, i2, i3 + this.f4260es, i2 + this.f4261et);
        return f1697dC;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0244am, com.corrodinggames.rts.gameFramework.AbstractC1155w
    /* renamed from: c */
    public boolean mo438c(float f) {
        C0970e m4266d = m4266d();
        GameEngine gameEngine = GameEngine.getGameEngine();
        f1689du.m5156a(mo3389cF());
        f1689du.m5159a(0.0f, (int) (-this.f7174eq));
        f1689du.m5159a(this.f1552i, this.f1553j);
        f1690dv.m5171a(mo3227a_(false));
        gameEngine.f6326bO.mo136k();
        float m5147d = f1689du.m5147d();
        float m5146e = f1689du.m5146e();
        gameEngine.f6326bO.mo228a(mo3259d(false), m5147d, m5146e);
        gameEngine.f6326bO.mo227a(this.f1558o * 2.7f, this.f1558o * 2.7f, m5147d, m5146e);
        gameEngine.f6326bO.mo193a(m4266d, f1690dv, f1689du, (Paint) null);
        gameEngine.f6326bO.mo135l();
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: h */
    public EnumC0246ao mo3069h() {
        return EnumC0246ao.f1708a;
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
    /* renamed from: ak */
    public boolean mo2950ak() {
        return false;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: aj */
    public boolean mo2951aj() {
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
    /* renamed from: s */
    public EnumC0249ar mo5458r() {
        return EnumC0249ar.f1784S;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: n */
    public void mo3283n() {
        super.mo3283n();
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
    /* renamed from: P */
    public boolean mo3075P() {
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: a */
    public float mo3073a(AbstractC0244am abstractC0244am, float f, C0188f c0188f) {
        this.f1558o -= f / 100.0f;
        return super.mo3073a(abstractC0244am, 0.0f, c0188f);
    }
}