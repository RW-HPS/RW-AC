package com.corrodinggames.rts.game.units.p029h;

import android.graphics.Color;
import android.graphics.PointF;
import com.corrodinggames.rts.C0067R;
import com.corrodinggames.rts.game.C0188f;
import com.corrodinggames.rts.game.PlayerData;
import com.corrodinggames.rts.game.units.AbstractC0244am;
import com.corrodinggames.rts.game.units.EnumC0246ao;
import com.corrodinggames.rts.game.units.EnumC0249ar;
import com.corrodinggames.rts.game.units.p013a.AbstractC0224s;
import com.corrodinggames.rts.game.units.p013a.AbstractC0229x;
import com.corrodinggames.rts.gameFramework.C0773f;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.net.GameInputStream;
import com.corrodinggames.rts.gameFramework.net.GameOutputStream;
import com.corrodinggames.rts.gameFramework.p030a.C0637e;
import com.corrodinggames.rts.gameFramework.unitAction.C0970e;
import com.corrodinggames.rts.gameFramework.utility.C1152y;
import com.corrodinggames.rts.gameFramework.utility.SlickToAndroidKeycodes;
import java.util.ArrayList;

/* renamed from: com.corrodinggames.rts.game.units.h.e */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/h/e.class */
public class C0593e extends AbstractC0596f {

    /* renamed from: a */
    boolean f3865a;

    /* renamed from: b */
    boolean f3866b;

    /* renamed from: c */
    float f3867c;

    /* renamed from: d */
    static C0970e f3868d = null;

    /* renamed from: e */
    static C0970e f3869e = null;

    /* renamed from: f */
    static C0970e f3870f = null;

    /* renamed from: g */
    public static C0970e f3871g = null;

    /* renamed from: h */
    public static C0970e[] f3872h = new C0970e[10];

    /* renamed from: i */
    static C0970e[] f3873i = new C0970e[10];

    /* renamed from: j */
    public static final AbstractC0224s f3874j = new AbstractC0229x(151) { // from class: com.corrodinggames.rts.game.units.h.e.1
        @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
        /* renamed from: a */
        public String mo3098a() {
            return "-Surface unit. Allows it to fire missiles";
        }

        @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
        /* renamed from: b */
        public String mo3095b() {
            return "Surface";
        }

        @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
        /* renamed from: a */
        public boolean mo3096a(AbstractC0244am abstractC0244am, boolean z) {
            return !((C0593e) abstractC0244am).f3865a;
        }
    };

    /* renamed from: k */
    public static final AbstractC0224s f3875k = new AbstractC0229x(152) { // from class: com.corrodinggames.rts.game.units.h.e.2
        @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
        /* renamed from: a */
        public String mo3098a() {
            return "-Dive unit underwater. Evades most attacks";
        }

        @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
        /* renamed from: b */
        public String mo3095b() {
            return "Dive";
        }

        @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
        /* renamed from: a */
        public boolean mo3096a(AbstractC0244am abstractC0244am, boolean z) {
            return ((C0593e) abstractC0244am).f3865a;
        }
    };

    /* renamed from: l */
    static ArrayList f3876l = new ArrayList();

    @Override // com.corrodinggames.rts.game.units.p029h.AbstractC0596f, com.corrodinggames.rts.game.units.AbstractC0629y, com.corrodinggames.rts.game.units.AbstractC0244am, com.corrodinggames.rts.gameFramework.AbstractC0674az, com.corrodinggames.rts.gameFramework.AbstractC1155w, com.corrodinggames.rts.gameFramework.AbstractC0741bq
    /* renamed from: a */
    public void mo442a(GameOutputStream gameOutputStream) {
        gameOutputStream.writeBoolean(this.f3865a);
        gameOutputStream.writeFloat(this.f3867c);
        super.mo442a(gameOutputStream);
    }

    @Override // com.corrodinggames.rts.game.units.p029h.AbstractC0596f, com.corrodinggames.rts.game.units.AbstractC0629y, com.corrodinggames.rts.game.units.AbstractC0244am, com.corrodinggames.rts.gameFramework.AbstractC0674az, com.corrodinggames.rts.gameFramework.AbstractC1155w
    /* renamed from: a */
    public void mo441a(GameInputStream gameInputStream) {
        this.f3865a = gameInputStream.readBoolean();
        this.f3866b = !mo3074Q();
        if (gameInputStream.m1311b() >= 21) {
            this.f3867c = gameInputStream.readFloat();
        }
        m3132L();
        super.mo441a(gameInputStream);
    }

    static {
        f3876l.add(f3874j);
        f3876l.add(f3875k);
    }

    @Override // com.corrodinggames.rts.game.units.p029h.AbstractC0596f, com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: v */
    public C0970e mo3066v() {
        if (this.f1614bX.site == -1) {
            return null;
        }
        return f3872h[this.f1614bX.m4454R()];
    }

    /* renamed from: b */
    public static void m3129b() {
        GameEngine gameEngine = GameEngine.getGameEngine();
        f3869e = gameEngine.f6326bO.mo222a(C0067R.drawable.attack_submarine);
        f3870f = m4240a(f3869e, f3869e.mo387m(), f3869e.mo388l());
        f3868d = gameEngine.f6326bO.mo222a(C0067R.drawable.attack_submarine_dead);
        f3871g = gameEngine.f6326bO.mo222a(C0067R.drawable.unit_icon_water);
        f3872h = PlayerData.m4432a(f3871g);
        f3873i = PlayerData.m4432a(f3869e);
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: F */
    public boolean mo3055F() {
        return GameEngine.getGameEngine().settingsEngine.renderExtraShadows && this.f7174eq >= 0.0f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: G */
    public float mo3053G() {
        return 0.0f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: H */
    public float mo3051H() {
        return 0.0f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: d */
    public C0970e mo2879d() {
        if (this.f1612bV) {
            return f3868d;
        }
        return f3873i[this.f1614bX.m4454R()];
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: k */
    public C0970e mo2853k() {
        return f3870f;
    }

    @Override // com.corrodinggames.rts.game.units.p029h.AbstractC0596f, com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: h */
    public EnumC0246ao mo3069h() {
        return EnumC0246ao.f1712e;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: f */
    public EnumC0249ar mo5458r() {
        return EnumC0249ar.attackSubmarine;
    }

    @Override // com.corrodinggames.rts.game.units.p029h.AbstractC0596f
    /* renamed from: K */
    public boolean mo3127K() {
        if (!mo3074Q()) {
            return true;
        }
        return false;
    }

    public C0593e(boolean z) {
        super(z);
        this.f3865a = false;
        this.f3866b = true;
        this.f3867c = 0.0f;
        m2724b(f3869e);
        this.f1626cj = 15.0f;
        this.f1627ck = this.f1626cj - 2.0f;
        this.f1638cv = 260.0f;
        this.f1637cu = this.f1638cv;
        this.f3917M = f3869e;
    }

    /* renamed from: L */
    public void m3132L() {
        if (!this.f3866b) {
            m448S(1);
        } else {
            m448S(2);
        }
    }

    @Override // com.corrodinggames.rts.game.units.p029h.AbstractC0596f
    /* renamed from: s */
    public void mo3124s(float f) {
        float f2;
        GameEngine gameEngine = GameEngine.getGameEngine();
        if (this.f3865a) {
            f2 = 1.0f;
        } else {
            f2 = -8.0f;
        }
        if (C0773f.m2152c(this.f7174eq - f2) > 2.0f) {
            this.f3867c = C0773f.m2217a(this.f3867c, 0.08f, 0.003f * f);
        } else {
            this.f3867c = C0773f.m2217a(this.f3867c, 0.02f, 0.003f * f);
        }
        this.f7174eq = C0773f.m2217a(this.f7174eq, f2, this.f3867c * f);
        boolean z = false;
        if (this.f3866b && mo3074Q()) {
            this.f3866b = false;
            m3132L();
            z = true;
        }
        if (!this.f3866b && !mo3074Q()) {
            this.f3866b = true;
            m3132L();
            z = true;
        }
        if (z) {
            gameEngine.f6329bR.m2383a(this.f7172eo, this.f7173ep, 0.0f, 0, 0.0f, 0.0f, this.f1623cg);
        }
    }

    @Override // com.corrodinggames.rts.game.units.p029h.AbstractC0596f, com.corrodinggames.rts.game.units.AbstractC0629y, com.corrodinggames.rts.game.units.AbstractC0244am, com.corrodinggames.rts.gameFramework.AbstractC1155w
    /* renamed from: a */
    public void mo446a(float f) {
        super.mo446a(f);
        if (!m4226bT() || this.f1612bV) {
        }
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: m */
    public float mo2846m() {
        if (!mo3074Q()) {
            return 250.0f;
        }
        return 180.0f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: b */
    public float mo2930b(int i) {
        return 170.0f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: e */
    public float mo2872e(int i) {
        return 10.0f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: z */
    public float mo2822z() {
        if (!mo3074Q()) {
            return 0.8f;
        }
        return 0.45f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: A */
    public float mo3065A() {
        return 1.2f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: B */
    public float mo3063B() {
        return 0.06f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: c */
    public float mo2883c(int i) {
        return 2.5f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: w */
    public float mo2825w(int i) {
        return 0.08f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: C */
    public float mo3061C() {
        return 0.018f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: D */
    public float mo3059D() {
        return 0.1f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: d */
    public C0970e mo2876d(int i) {
        return null;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: l */
    public boolean mo3067l() {
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0627w, com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: Q */
    public boolean mo3074Q() {
        return this.f7174eq < -1.0f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: ah */
    public boolean mo2953ah() {
        if (!mo3074Q()) {
            return true;
        }
        return false;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: ae */
    public boolean mo2956ae() {
        if (!mo3074Q()) {
            return false;
        }
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: af */
    public boolean mo2955af() {
        if (!mo3074Q()) {
            return true;
        }
        return false;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: ag */
    public boolean mo2954ag() {
        if (!mo3074Q()) {
            return true;
        }
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: q */
    public float mo2835q(int i) {
        return 42.0f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: a */
    public void mo3008a(AbstractC0244am abstractC0244am, int i) {
        if (!mo3074Q()) {
            PointF E = mo3056E(i);
            C0188f m4523a = C0188f.m4523a(this, E.x, E.y, this.f7174eq, i);
            PointF K = mo3046K(i);
            m4523a.f1012K = K.x;
            m4523a.f1013L = K.y;
            m4523a.f1044ar = Color.m5243a(255, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_DATA_SERVICE, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_DATA_SERVICE, 50);
            m4523a.f1022U = 42.0f;
            m4523a.f987l = abstractC0244am;
            m4523a.f983h = 190.0f;
            m4523a.f995t = 2.0f;
            m4523a.f1060aH = true;
            m4523a.f1065aM = true;
            m4523a.f1069aQ = true;
            GameEngine gameEngine = GameEngine.getGameEngine();
            gameEngine.f6324bM.m2812a(C0637e.f4079m, 0.8f, this.f7172eo, this.f7173ep);
            gameEngine.f6329bR.m2385a(this.f7172eo, this.f7173ep, this.f7174eq, -1118720);
            return;
        }
        PointF E2 = mo3056E(i);
        C0188f m4523a2 = C0188f.m4523a(this, E2.x, E2.y, this.f7174eq, i);
        PointF K2 = mo3046K(i);
        m4523a2.f1012K = K2.x;
        m4523a2.f1013L = K2.y;
        m4523a2.f1044ar = Color.m5243a(255, 30, 30, 150);
        m4523a2.f999x = 1.0f;
        m4523a2.f1022U = 42.0f;
        m4523a2.f987l = abstractC0244am;
        m4523a2.f983h = 250.0f;
        m4523a2.f995t = 1.3f;
        m4523a2.f1060aH = false;
        m4523a2.f1065aM = true;
        m4523a2.f1069aQ = true;
        GameEngine.getGameEngine();
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: e */
    public boolean mo3071e() {
        GameEngine.getGameEngine().f6329bR.m2370b(this.f7172eo, this.f7173ep, this.f7174eq);
        this.f3917M = f3868d;
        m448S(0);
        this.f1610bT = false;
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: a */
    public void mo3130a(AbstractC0224s abstractC0224s, boolean z) {
        if (abstractC0224s == f3874j) {
            this.f3865a = true;
        }
        if (abstractC0224s == f3875k) {
            this.f3865a = false;
        }
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: N */
    public ArrayList mo3131N() {
        return f3876l;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0244am, com.corrodinggames.rts.gameFramework.AbstractC1155w
    /* renamed from: e */
    public void mo434e(float f) {
        super.mo434e(f);
        C1152y.m471a(this, mo2846m());
    }
}