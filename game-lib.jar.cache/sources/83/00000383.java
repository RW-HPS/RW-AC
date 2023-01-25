package com.corrodinggames.rts.game.units.p024d.p025a;

import android.graphics.PointF;
import android.graphics.Rect;
import com.corrodinggames.rts.C0067R;
import com.corrodinggames.rts.game.PlayerData;
import com.corrodinggames.rts.game.units.AbstractC0244am;
import com.corrodinggames.rts.game.units.EnumC0233ab;
import com.corrodinggames.rts.game.units.EnumC0249ar;
import com.corrodinggames.rts.game.units.p013a.AbstractC0224s;
import com.corrodinggames.rts.game.units.p013a.AbstractC0228w;
import com.corrodinggames.rts.game.units.p013a.C0208c;
import com.corrodinggames.rts.game.units.p013a.EnumC0225t;
import com.corrodinggames.rts.game.units.p024d.AbstractC0503i;
import com.corrodinggames.rts.game.units.p024d.C0504j;
import com.corrodinggames.rts.gameFramework.C0773f;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.net.GameInputStream;
import com.corrodinggames.rts.gameFramework.net.GameNetEngine;
import com.corrodinggames.rts.gameFramework.net.GameOutputStream;
import com.corrodinggames.rts.gameFramework.translations.C0855a;
import com.corrodinggames.rts.gameFramework.unitAction.C0970e;
import com.corrodinggames.rts.gameFramework.utility.C1152y;
import com.corrodinggames.rts.gameFramework.utility.SlickToAndroidKeycodes;
import java.util.ArrayList;

/* renamed from: com.corrodinggames.rts.game.units.d.a.b */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/d/a/b.class */
public class C0478b extends AbstractC0503i {

    /* renamed from: j */
    boolean f3407j;

    /* renamed from: k */
    int f3408k;

    /* renamed from: l */
    AbstractC0483c f3409l;

    /* renamed from: H */
    boolean f3410H;

    /* renamed from: I */
    float f3411I;

    /* renamed from: J */
    float f3412J;

    /* renamed from: K */
    boolean f3413K;

    /* renamed from: dK */
    Rect f3414dK;

    /* renamed from: g */
    static C0970e f3415g = null;

    /* renamed from: a */
    private static C0970e f3416a = null;

    /* renamed from: b */
    private static C0970e f3417b = null;

    /* renamed from: c */
    private static C0970e f3418c = null;

    /* renamed from: d */
    private static C0970e f3419d = null;

    /* renamed from: e */
    private static C0970e f3420e = null;

    /* renamed from: h */
    static C0970e[] f3421h = new C0970e[10];

    /* renamed from: i */
    static C0970e f3422i = null;

    /* renamed from: t */
    static String f3423t = "gun";

    /* renamed from: u */
    static String f3424u = "gunT2";

    /* renamed from: v */
    static String f3425v = "gunT3";

    /* renamed from: w */
    static String f3426w = "artillery";

    /* renamed from: x */
    static String f3427x = "flamethrower";

    /* renamed from: C */
    static String f3428C = "aa_t1";

    /* renamed from: D */
    static String f3429D = "aa_t2";

    /* renamed from: E */
    static String f3430E = "aa_flak";

    /* renamed from: F */
    static C0970e f3431F = null;

    /* renamed from: G */
    static C0970e[] f3432G = new C0970e[10];

    /* renamed from: dL */
    public static AbstractC0224s f3433dL = new AbstractC0228w(101) { // from class: com.corrodinggames.rts.game.units.d.a.b.1
        @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
        /* renamed from: g */
        public boolean mo3089g() {
            return false;
        }

        @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
        /* renamed from: a */
        public String mo3098a() {
            return "-Increases HP, attack damage, and range";
        }

        @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
        /* renamed from: b */
        public String mo3095b() {
            return C0855a.m1714a("gui.actions.upgradeToGunT2", new Object[0]);
        }

        @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
        /* renamed from: c */
        public int mo3092c() {
            return 1000;
        }

        @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0228w
        /* renamed from: K */
        public float mo3291K() {
            return 0.001f;
        }

        @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
        /* renamed from: a */
        public boolean mo3096a(AbstractC0244am abstractC0244am, boolean z) {
            C0478b c0478b = (C0478b) abstractC0244am;
            if (c0478b.m3454M() != 1 || c0478b.mo3337a(AbstractC0224s.f1466i, z) > 0) {
                return false;
            }
            return super.mo3096a(abstractC0244am, z);
        }

        @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
        /* renamed from: b */
        public boolean mo3094b(AbstractC0244am abstractC0244am) {
            if (((C0478b) abstractC0244am).m3454M() != 1) {
                return false;
            }
            return true;
        }

        @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
        /* renamed from: L */
        public EnumC0249ar mo5457i() {
            return null;
        }

        @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
        /* renamed from: f */
        public EnumC0225t mo3090f() {
            return EnumC0225t.f1471c;
        }

        @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
        /* renamed from: f */
        public void mo3429f(AbstractC0244am abstractC0244am) {
            C0478b c0478b = (C0478b) abstractC0244am;
            c0478b.m3447b(C0478b.f3424u);
            c0478b.m3037W();
        }
    };

    /* renamed from: dM */
    public static AbstractC0224s f3434dM = new AbstractC0228w(104) { // from class: com.corrodinggames.rts.game.units.d.a.b.2
        @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
        /* renamed from: g */
        public boolean mo3089g() {
            return false;
        }

        @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
        /* renamed from: a */
        public String mo3098a() {
            return "-Extra attack damage, and range.\n-Large amount of HP\n-Self repair";
        }

        @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
        /* renamed from: b */
        public String mo3095b() {
            return C0855a.m1714a("gui.actions.upgradeToGunT3", new Object[0]);
        }

        @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
        /* renamed from: c */
        public int mo3092c() {
            return 11000;
        }

        @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0228w
        /* renamed from: K */
        public float mo3291K() {
            return 3.0E-4f;
        }

        @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
        /* renamed from: a */
        public boolean mo3096a(AbstractC0244am abstractC0244am, boolean z) {
            if (((C0478b) abstractC0244am).mo3337a(AbstractC0224s.f1466i, z) > 0) {
                return false;
            }
            return super.mo3096a(abstractC0244am, z);
        }

        @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
        /* renamed from: b */
        public boolean mo3094b(AbstractC0244am abstractC0244am) {
            if (!(((C0478b) abstractC0244am).f3409l instanceof C0486f)) {
                return false;
            }
            return true;
        }

        @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
        /* renamed from: L */
        public EnumC0249ar mo5457i() {
            return null;
        }

        @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
        /* renamed from: f */
        public EnumC0225t mo3090f() {
            return EnumC0225t.f1471c;
        }

        @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
        /* renamed from: f */
        public void mo3429f(AbstractC0244am abstractC0244am) {
            C0478b c0478b = (C0478b) abstractC0244am;
            c0478b.m3447b(C0478b.f3425v);
            c0478b.m3037W();
        }
    };

    /* renamed from: dN */
    public static AbstractC0224s f3435dN = new AbstractC0228w(102) { // from class: com.corrodinggames.rts.game.units.d.a.b.3
        @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
        /* renamed from: g */
        public boolean mo3089g() {
            return false;
        }

        @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
        /* renamed from: a */
        public String mo3098a() {
            return "-Large increase in range";
        }

        @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
        /* renamed from: b */
        public String mo3095b() {
            return C0855a.m1714a("gui.actions.upgradeToArtillery", new Object[0]);
        }

        @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
        /* renamed from: c */
        public int mo3092c() {
            return 1600;
        }

        @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0228w
        /* renamed from: K */
        public float mo3291K() {
            return 4.0E-4f;
        }

        @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
        /* renamed from: a */
        public boolean mo3096a(AbstractC0244am abstractC0244am, boolean z) {
            C0478b c0478b = (C0478b) abstractC0244am;
            if (c0478b.m3454M() != 1 || c0478b.mo3337a(AbstractC0224s.f1466i, z) > 0) {
                return false;
            }
            return super.mo3096a(abstractC0244am, z);
        }

        @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
        /* renamed from: b */
        public boolean mo3094b(AbstractC0244am abstractC0244am) {
            if (((C0478b) abstractC0244am).m3454M() != 1) {
                return false;
            }
            return true;
        }

        @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
        /* renamed from: L */
        public EnumC0249ar mo5457i() {
            return null;
        }

        @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
        /* renamed from: f */
        public EnumC0225t mo3090f() {
            return EnumC0225t.f1471c;
        }

        @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
        /* renamed from: f */
        public void mo3429f(AbstractC0244am abstractC0244am) {
            C0478b c0478b = (C0478b) abstractC0244am;
            c0478b.m3447b(C0478b.f3426w);
            c0478b.m3037W();
        }
    };

    /* renamed from: dO */
    public static AbstractC0224s f3436dO = new AbstractC0228w(103) { // from class: com.corrodinggames.rts.game.units.d.a.b.4
        @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
        /* renamed from: g */
        public boolean mo3089g() {
            return false;
        }

        @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
        /* renamed from: a */
        public String mo3098a() {
            return "-Short range area affect\n-Adds self-repair";
        }

        @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
        /* renamed from: b */
        public String mo3095b() {
            return C0855a.m1714a("gui.actions.upgradeToFlamethrower", new Object[0]);
        }

        @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
        /* renamed from: c */
        public int mo3092c() {
            return 700;
        }

        @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0228w
        /* renamed from: K */
        public float mo3291K() {
            return 0.002f;
        }

        @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
        /* renamed from: a */
        public boolean mo3096a(AbstractC0244am abstractC0244am, boolean z) {
            C0478b c0478b = (C0478b) abstractC0244am;
            if (c0478b.m3454M() != 1 || c0478b.mo3337a(AbstractC0224s.f1466i, z) > 0) {
                return false;
            }
            return super.mo3096a(abstractC0244am, z);
        }

        @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
        /* renamed from: b */
        public boolean mo3094b(AbstractC0244am abstractC0244am) {
            if (((C0478b) abstractC0244am).m3454M() != 1) {
                return false;
            }
            return true;
        }

        @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
        /* renamed from: L */
        public EnumC0249ar mo5457i() {
            return null;
        }

        @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
        /* renamed from: f */
        public EnumC0225t mo3090f() {
            return EnumC0225t.f1471c;
        }

        @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
        /* renamed from: f */
        public void mo3429f(AbstractC0244am abstractC0244am) {
            C0478b c0478b = (C0478b) abstractC0244am;
            c0478b.m3447b(C0478b.f3427x);
            c0478b.m3037W();
        }
    };

    /* renamed from: dP */
    static ArrayList f3437dP = new ArrayList();

    static {
        f3437dP.add(f3433dL);
        f3437dP.add(f3434dM);
        f3437dP.add(f3435dN);
        f3437dP.add(f3436dO);
    }

    /* renamed from: M */
    public int m3454M() {
        return this.f3409l.mo3418b();
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: H */
    public float mo3050H(int i) {
        return this.f3409l.mo3425h(i);
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: a_ */
    public void mo3450a_(String str) {
        m3447b(str);
    }

    /* renamed from: b */
    public void m3447b(String str) {
        if (!this.f3409l.m3428a(str)) {
            AbstractC0483c abstractC0483c = this.f3409l;
            this.f3409l = m3444c(str);
            this.f3409l.mo3419a(abstractC0483c);
        }
    }

    /* renamed from: c */
    public AbstractC0483c m3444c(String str) {
        if (str.equals(f3423t)) {
            return new C0488h(this);
        }
        if (str.equals(f3424u)) {
            return new C0486f(this);
        }
        if (str.equals(f3425v)) {
            return new C0487g(this);
        }
        if (str.equals(f3426w)) {
            return new C0484d(this);
        }
        if (str.equals(f3427x)) {
            return new C0485e(this);
        }
        return null;
    }

    @Override // com.corrodinggames.rts.game.units.p024d.AbstractC0503i, com.corrodinggames.rts.game.units.p024d.AbstractC0493d, com.corrodinggames.rts.game.units.AbstractC0629y, com.corrodinggames.rts.game.units.AbstractC0244am, com.corrodinggames.rts.gameFramework.AbstractC0674az, com.corrodinggames.rts.gameFramework.AbstractC1155w, com.corrodinggames.rts.gameFramework.AbstractC0741bq
    /* renamed from: a */
    public void mo442a(GameOutputStream gameOutputStream) {
        gameOutputStream.writeBoolean(this.f3407j);
        gameOutputStream.writeBoolean(this.f3408k == 1);
        gameOutputStream.writeString(this.f3409l.mo3416c());
        gameOutputStream.writeInt(this.f3408k);
        super.mo442a(gameOutputStream);
    }

    @Override // com.corrodinggames.rts.game.units.p024d.AbstractC0503i, com.corrodinggames.rts.game.units.p024d.AbstractC0493d, com.corrodinggames.rts.game.units.AbstractC0629y, com.corrodinggames.rts.game.units.AbstractC0244am, com.corrodinggames.rts.gameFramework.AbstractC0674az, com.corrodinggames.rts.gameFramework.AbstractC1155w
    /* renamed from: a */
    public void mo441a(GameInputStream gameInputStream) {
        boolean readBoolean = gameInputStream.readBoolean();
        if (readBoolean) {
            mo3021a(2);
        }
        if (gameInputStream.m1311b() >= 27) {
            this.f3408k = gameInputStream.readBoolean() ? 1 : 0;
        }
        if (gameInputStream.m1311b() >= 35) {
            String readString = gameInputStream.readString();
            if (!this.f3409l.m3428a(readString)) {
                m3447b(readString);
            }
            this.f3408k = gameInputStream.readInt();
        } else if (readBoolean && !(this instanceof C0476a)) {
            m3447b(f3424u);
        }
        super.mo441a(gameInputStream);
    }

    @Override // com.corrodinggames.rts.game.units.p024d.AbstractC0493d, com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: v */
    public C0970e mo3066v() {
        if (this.f1614bX.site == -1) {
            return null;
        }
        return f3432G[this.f1614bX.m4454R()];
    }

    /* renamed from: dB */
    public static void m3441dB() {
        GameEngine gameEngine = GameEngine.getGameEngine();
        f3415g = gameEngine.f6326bO.mo222a(C0067R.drawable.turret_base);
        f3422i = gameEngine.f6326bO.mo222a(C0067R.drawable.turret_base_dead);
        f3416a = gameEngine.f6326bO.mo222a(C0067R.drawable.turret_top);
        f3417b = gameEngine.f6326bO.mo222a(C0067R.drawable.turret_top_l2);
        f3418c = gameEngine.f6326bO.mo222a(C0067R.drawable.turret_top_l3);
        f3419d = gameEngine.f6326bO.mo222a(C0067R.drawable.turret_top_artillery);
        f3420e = gameEngine.f6326bO.mo222a(C0067R.drawable.turret_top_flame);
        f3421h = PlayerData.m4432a(f3415g);
        f3431F = gameEngine.f6326bO.mo222a(C0067R.drawable.unit_icon_building_turrent);
        f3432G = PlayerData.m4432a(f3431F);
    }

    @Override // com.corrodinggames.rts.game.units.p024d.AbstractC0493d
    /* renamed from: L */
    public boolean mo3296L() {
        this.f3917M = f3422i;
        m448S(0);
        this.f1610bT = false;
        m3014a(EnumC0233ab.large);
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: d */
    public C0970e mo2879d() {
        if (this.f1612bV) {
            return f3422i;
        }
        if (this.f1614bX == null) {
            return f3421h[f3421h.length - 1];
        }
        return f3421h[this.f1614bX.m4454R()];
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: k */
    public C0970e mo2853k() {
        return null;
    }

    @Override // com.corrodinggames.rts.game.units.p024d.AbstractC0493d, com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: d */
    public C0970e mo2876d(int i) {
        return this.f3409l.mo3414d(i);
    }

    public C0478b(boolean z) {
        super(z);
        this.f3409l = new C0488h(this);
        this.f3410H = true;
        this.f3414dK = new Rect();
        m2729T(35);
        m2728U(42);
        this.f1626cj = 16.0f;
        this.f1627ck = this.f1626cj;
        this.f1638cv = 700.0f;
        this.f1637cu = this.f1638cv;
        this.f3917M = f3415g;
        this.f1654cL[0].f1717a = C0773f.m2196a(this, -180, (int) SlickToAndroidKeycodes.AndroidCodes.KEYCODE_STB_INPUT);
        this.f3457n.m5172a(0, 0, 1, 1);
        this.f3458o.m5172a(0, 0, 1, 1);
    }

    /* renamed from: s */
    public void mo3434s(float f) {
        if (this.f1654cL[0].m4189a()) {
            if (this.f3410H) {
                this.f3411I = this.f1654cL[0].f1717a;
                this.f3410H = false;
                this.f3412J = C0773f.m2196a(this, 0, 120);
            }
            this.f3412J += f;
            if (this.f3412J > 450.0f) {
                this.f3412J = C0773f.m2196a(this, 0, 30);
                this.f3413K = !this.f3413K;
            }
            if (this.f3412J < 120.0f) {
                if (this.f3413K) {
                    m3032a(f * 0.3f, this.f3411I - 20.0f, 0);
                    return;
                } else {
                    m3032a(f * 0.3f, this.f3411I + 20.0f, 0);
                    return;
                }
            }
            return;
        }
        this.f3410H = true;
    }

    @Override // com.corrodinggames.rts.game.units.p024d.AbstractC0503i, com.corrodinggames.rts.game.units.AbstractC0629y, com.corrodinggames.rts.game.units.AbstractC0244am, com.corrodinggames.rts.gameFramework.AbstractC1155w
    /* renamed from: a */
    public void mo446a(float f) {
        super.mo446a(f);
        if (m4226bT()) {
            this.f3409l.mo3422a(f);
        }
    }

    @Override // com.corrodinggames.rts.game.units.p024d.AbstractC0503i, com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: a */
    public void mo3008a(AbstractC0244am abstractC0244am, int i) {
        this.f3409l.mo3420a(abstractC0244am, i);
    }

    @Override // com.corrodinggames.rts.game.units.p024d.AbstractC0503i, com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: m */
    public float mo2846m() {
        return this.f3409l.mo3423a();
    }

    @Override // com.corrodinggames.rts.game.units.p024d.AbstractC0503i, com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: b */
    public float mo2930b(int i) {
        return this.f3409l.mo3421a(i);
    }

    @Override // com.corrodinggames.rts.game.units.p024d.AbstractC0503i, com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: c */
    public float mo2883c(int i) {
        return this.f3409l.mo3427e(i);
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: w */
    public float mo2825w(int i) {
        return this.f3409l.mo3426f(i);
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: b */
    public boolean mo2929b(int i, float f) {
        return false;
    }

    @Override // com.corrodinggames.rts.game.units.p024d.AbstractC0503i, com.corrodinggames.rts.game.units.p024d.AbstractC0493d, com.corrodinggames.rts.game.units.AbstractC0629y, com.corrodinggames.rts.game.units.AbstractC0244am, com.corrodinggames.rts.gameFramework.AbstractC1155w
    /* renamed from: c */
    public boolean mo438c(float f) {
        if (!super.mo438c(f)) {
            return false;
        }
        if (!this.f1612bV) {
            m3440dC();
            return true;
        }
        return true;
    }

    /* renamed from: dC */
    void m3440dC() {
        GameEngine gameEngine = GameEngine.getGameEngine();
        C0970e mo2876d = mo2876d(0);
        PointF mo3052G = mo3052G(0);
        gameEngine.f6326bO.mo200a(mo2876d, mo3052G.x - GameEngine.getGameEngine().f6357cw, mo3052G.y - GameEngine.getGameEngine().f6358cx, this.f1654cL[0].f1717a, mo3285f());
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: K */
    public EnumC0249ar mo5458r() {
        return EnumC0249ar.turret;
    }

    @Override // com.corrodinggames.rts.game.units.p024d.AbstractC0503i, com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: l */
    public boolean mo3067l() {
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: af */
    public boolean mo2955af() {
        return false;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: g */
    public float mo2866g(int i) {
        return this.f3409l.mo3413g(i);
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: M */
    public void mo3044M(int i) {
        if (mo2930b(i) < 10.0f) {
            return;
        }
        super.mo3044M(i);
    }

    @Override // com.corrodinggames.rts.game.units.p024d.AbstractC0503i, com.corrodinggames.rts.game.units.p024d.InterfaceC0506l
    /* renamed from: a */
    public void mo3294a(C0504j c0504j) {
        AbstractC0224s a = mo3655a(c0504j.f3525j);
        if (a != null) {
            a.mo3429f(this);
        } else {
            GameNetEngine.m1563a("specialAction=null on completeQueueItem(turret) for item.uIndex:" + c0504j.f3525j + " id:" + this.f7166eh, true);
        }
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: cm */
    public C0208c mo3292cm() {
        if (m3454M() == 1) {
            return f3433dL.m4309N();
        }
        if (this.f3409l instanceof C0486f) {
            return f3434dM.m4309N();
        }
        return AbstractC0224s.f1466i;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: a */
    public void mo3451a(ArrayList arrayList) {
        arrayList.clear();
        if (m3454M() == 1) {
            arrayList.add(f3435dN.m4309N());
            arrayList.add(f3436dO.m4309N());
        }
    }

    @Override // com.corrodinggames.rts.game.units.p024d.AbstractC0493d, com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: a */
    public void mo3021a(int i) {
        if (i == 1) {
            this.f3407j = false;
        } else if (i == 2 && !this.f3407j) {
            this.f3407j = true;
        }
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: E */
    public PointF mo3056E(int i) {
        return this.f3409l.mo3424c(i);
    }

    @Override // com.corrodinggames.rts.game.units.p024d.AbstractC0503i, com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: bV */
    public float mo3310bV() {
        if (this.f1654cL[0].f1721e > 0.0f && this.f3409l.m3428a(f3426w)) {
            return 1.0f - (this.f1654cL[0].f1721e / mo2930b(0));
        }
        return super.mo3310bV();
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: G */
    public PointF mo3052G(int i) {
        f4018bh.setSite(super.mo3052G(i));
        f4018bh.moveAdd(0.0f, -5.0f);
        return f4018bh;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: N */
    public ArrayList mo3131N() {
        return f3437dP;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0244am, com.corrodinggames.rts.gameFramework.AbstractC1155w
    /* renamed from: e */
    public void mo434e(float f) {
        super.mo434e(f);
        C1152y.m471a(this, mo2846m());
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: cZ */
    public float mo3319cZ() {
        return GameEngine.getGameEngine().f6323bL.f786n;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: da */
    public float mo3318da() {
        return GameEngine.getGameEngine().f6323bL.f787o;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: db */
    public float mo3317db() {
        return super.mo3317db() - 8.0f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: cL */
    public int mo3443cL() {
        return this.f3409l.mo3415d();
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: q */
    public float mo2835q(int i) {
        return this.f3409l.mo3417b(i);
    }
}