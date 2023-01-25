package com.corrodinggames.rts.gameFramework.p037f;

import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.Menu;
import android.view.MenuItem;
import com.corrodinggames.rts.C0067R;
import com.corrodinggames.rts.appFramework.ActivityC0097g;
import com.corrodinggames.rts.appFramework.InterfaceC0096f;
import com.corrodinggames.rts.game.PlayerData;
import com.corrodinggames.rts.game.units.AbstractC0244am;
import com.corrodinggames.rts.game.units.AbstractC0318c;
import com.corrodinggames.rts.game.units.AbstractC0629y;
import com.corrodinggames.rts.game.units.C0232aa;
import com.corrodinggames.rts.game.units.C0560h;
import com.corrodinggames.rts.game.units.EnumC0249ar;
import com.corrodinggames.rts.game.units.InterfaceC0303as;
import com.corrodinggames.rts.game.units.custom.C0453g;
import com.corrodinggames.rts.game.units.custom.C0456j;
import com.corrodinggames.rts.game.units.custom.C0458l;
import com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope;
import com.corrodinggames.rts.game.units.custom.p020d.C0429b;
import com.corrodinggames.rts.game.units.custom.p021e.C0443e;
import com.corrodinggames.rts.game.units.custom.p021e.C0444f;
import com.corrodinggames.rts.game.units.p013a.AbstractC0224s;
import com.corrodinggames.rts.game.units.p013a.AbstractC0228w;
import com.corrodinggames.rts.game.units.p013a.C0208c;
import com.corrodinggames.rts.game.units.p013a.C0209d;
import com.corrodinggames.rts.game.units.p013a.C0212g;
import com.corrodinggames.rts.game.units.p013a.C0213h;
import com.corrodinggames.rts.game.units.p013a.C0219n;
import com.corrodinggames.rts.game.units.p013a.C0230y;
import com.corrodinggames.rts.game.units.p013a.C0231z;
import com.corrodinggames.rts.game.units.p013a.EnumC0225t;
import com.corrodinggames.rts.game.units.p013a.EnumC0226u;
import com.corrodinggames.rts.game.units.p028g.C0559e;
import com.corrodinggames.rts.gameFramework.AbstractC0741bq;
import com.corrodinggames.rts.gameFramework.AbstractC1155w;
import com.corrodinggames.rts.gameFramework.C0645ad;
import com.corrodinggames.rts.gameFramework.C0773f;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.SyncPacket;
import com.corrodinggames.rts.gameFramework.mod.C0859b;
import com.corrodinggames.rts.gameFramework.net.GameInputStream;
import com.corrodinggames.rts.gameFramework.net.GameOutputStream;
import com.corrodinggames.rts.gameFramework.p030a.C0637e;
import com.corrodinggames.rts.gameFramework.p037f.p038a.C0784h;
import com.corrodinggames.rts.gameFramework.p037f.p038a.EnumC0785i;
import com.corrodinggames.rts.gameFramework.p044l.C0955a;
import com.corrodinggames.rts.gameFramework.player.C0847a;
import com.corrodinggames.rts.gameFramework.translations.C0855a;
import com.corrodinggames.rts.gameFramework.unitAction.C0960aa;
import com.corrodinggames.rts.gameFramework.unitAction.C0966ag;
import com.corrodinggames.rts.gameFramework.unitAction.C0970e;
import com.corrodinggames.rts.gameFramework.utility.C1136m;
import com.corrodinggames.rts.gameFramework.utility.C1152y;
import com.corrodinggames.rts.gameFramework.utility.SlickToAndroidKeycodes;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;

/* renamed from: com.corrodinggames.rts.gameFramework.f.a */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/f/a.class */
public class C0775a extends AbstractC0741bq {

    /* renamed from: a */
    C0825g f4990a;

    /* renamed from: b */
    GameEngine f4991b;

    /* renamed from: e */
    public boolean f4992e;

    /* renamed from: f */
    public float f4993f;

    /* renamed from: n */
    C0966ag f4994n;

    /* renamed from: o */
    C0966ag f4995o;

    /* renamed from: q */
    Paint f4996q;

    /* renamed from: r */
    Paint f4997r;

    /* renamed from: D */
    boolean f4998D;

    /* renamed from: E */
    float f4999E;

    /* renamed from: F */
    float f5000F;

    /* renamed from: G */
    float f5001G;

    /* renamed from: H */
    int f5002H;

    /* renamed from: I */
    boolean f5003I;

    /* renamed from: J */
    float f5004J;

    /* renamed from: K */
    float f5005K;

    /* renamed from: L */
    float f5006L;

    /* renamed from: M */
    float f5007M;

    /* renamed from: N */
    float f5008N;

    /* renamed from: O */
    float f5009O;

    /* renamed from: P */
    int f5010P;

    /* renamed from: Q */
    float f5011Q;

    /* renamed from: R */
    float f5012R;

    /* renamed from: Y */
    static Paint f5013Y = new Paint();

    /* renamed from: Z */
    static PorterDuffColorFilter f5014Z = new PorterDuffColorFilter(Color.m5245a(200, 255, 200), PorterDuff.Mode.MULTIPLY);

    /* renamed from: aa */
    AbstractC0244am f5015aa;

    /* renamed from: ab */
    AbstractC0224s f5016ab;

    /* renamed from: ac */
    float f5017ac;

    /* renamed from: ad */
    long f5018ad;

    /* renamed from: ae */
    float f5019ae;

    /* renamed from: af */
    float f5020af;

    /* renamed from: ag */
    String f5021ag;

    /* renamed from: ah */
    String f5022ah;

    /* renamed from: ai */
    String f5023ai;

    /* renamed from: aj */
    String f5024aj;

    /* renamed from: ak */
    String f5025ak;

    /* renamed from: al */
    public String f5026al;

    /* renamed from: ao */
    public float f5027ao;

    /* renamed from: ap */
    public boolean f5028ap;

    /* renamed from: aC */
    float f5029aC;

    /* renamed from: c */
    public boolean f5030c = false;

    /* renamed from: d */
    public boolean f5031d = false;

    /* renamed from: g */
    Paint f5032g = new Paint();

    /* renamed from: h */
    Paint f5033h = new Paint();

    /* renamed from: i */
    Paint f5034i = new Paint();

    /* renamed from: j */
    Paint f5035j = new Paint();

    /* renamed from: k */
    Paint f5036k = new Paint();

    /* renamed from: l */
    Paint f5037l = new Paint();

    /* renamed from: m */
    Paint f5038m = new Paint();

    /* renamed from: p */
    Paint f5039p = new Paint();

    /* renamed from: s */
    Rect f5040s = new Rect();

    /* renamed from: t */
    RectF f5041t = new RectF();

    /* renamed from: u */
    Rect f5042u = new Rect();

    /* renamed from: v */
    Rect f5043v = new Rect();

    /* renamed from: w */
    Rect f5044w = new Rect();

    /* renamed from: x */
    RectF f5045x = new RectF();

    /* renamed from: y */
    RectF f5046y = new RectF();

    /* renamed from: z */
    Rect f5047z = new Rect();

    /* renamed from: A */
    RectF f5048A = new RectF();

    /* renamed from: B */
    Rect f5049B = new Rect();

    /* renamed from: C */
    RectF f5050C = new RectF();

    /* renamed from: S */
    C0970e f5051S = null;

    /* renamed from: T */
    C0970e f5052T = null;

    /* renamed from: U */
    C0970e f5053U = null;

    /* renamed from: V */
    C0970e f5054V = null;

    /* renamed from: W */
    C0970e f5055W = null;

    /* renamed from: X */
    C0970e f5056X = null;

    /* renamed from: am */
    String f5057am = null;

    /* renamed from: an */
    float f5058an = 0.0f;

    /* renamed from: aq */
    ArrayList f5059aq = new ArrayList();

    /* renamed from: ar */
    C0230y f5060ar = new C0230y(false);

    /* renamed from: as */
    C0230y f5061as = new C0230y(true);

    /* renamed from: at */
    C0209d f5062at = new C0209d();

    /* renamed from: au */
    ArrayList f5063au = new ArrayList();

    /* renamed from: av */
    ArrayList f5064av = new ArrayList();

    /* renamed from: aw */
    C1136m f5065aw = new C1136m();

    /* renamed from: ax */
    ArrayList f5066ax = new ArrayList();

    /* renamed from: ay */
    RectF f5067ay = new RectF();

    /* renamed from: az */
    HashMap f5068az = new HashMap();

    /* renamed from: aA */
    ArrayList f5069aA = new ArrayList();

    /* renamed from: aB */
    Rect f5070aB = new Rect();

    /* renamed from: aD */
    MenuC0841v f5071aD = new MenuC0841v();

    C0775a(GameEngine gameEngine, C0825g c0825g) {
        this.f4990a = c0825g;
        this.f4991b = gameEngine;
        m2077b();
    }

    /* renamed from: a */
    public void m2096a() {
        this.f5021ag = C0855a.m1714a("gui.unselectall", new Object[0]);
        this.f5022ah = C0855a.m1714a("gui.common.allyUnit", new Object[0]);
        this.f5023ai = C0855a.m1714a("gui.common.enemyUnit", new Object[0]);
        this.f5024aj = C0855a.m1714a("gui.common.neutralUnit", new Object[0]);
        this.f5025ak = C0855a.m1714a("gui.infoText.ownedBy", new Object[0]);
        this.f5026al = C0855a.m1714a("gui.infoText.unitCapReached", new Object[0]);
    }

    /* renamed from: b */
    public void m2077b() {
        m2096a();
        this.f5051S = this.f4991b.f6326bO.mo222a(C0067R.drawable.zoom_button);
        this.f5052T = this.f4991b.f6326bO.mo222a(C0067R.drawable.lock_icon_menu);
        this.f5053U = this.f4991b.f6326bO.mo222a(C0067R.drawable.pause);
        this.f5054V = this.f4991b.f6326bO.mo222a(C0067R.drawable.replay_pause);
        this.f5055W = this.f4991b.f6326bO.mo222a(C0067R.drawable.fast);
        this.f5056X = this.f4991b.f6326bO.mo222a(C0067R.drawable.replay_leaderboard);
        f5013Y.m5229a(255, 30, 30, 30);
        f5013Y.m5226a(f5014Z);
        f5013Y.m5196d(true);
        this.f4996q = new Paint();
        this.f4996q.m5229a(255, 255, 255, 255);
        this.f4996q.m5225a(Paint.Align.f195a);
        this.f4996q.m5200c(true);
        this.f4996q.mo914a(true);
        this.f4997r = new Paint();
        this.f4997r.m5229a(255, 255, 255, 255);
        this.f4997r.m5225a(Paint.Align.f195a);
        this.f4997r.m5200c(true);
        this.f4997r.mo914a(true);
        this.f4994n = new C0966ag();
        this.f4994n.m5207b(Color.m5244a(SlickToAndroidKeycodes.AndroidCodes.KEYCODE_BUTTON_3, 255, 255, 255));
        this.f4994n.m910o();
        this.f4995o = new C0966ag();
        this.f4995o.m5207b(Color.m5244a(133, 255, 255, 255));
        this.f4995o.m910o();
        this.f5069aA.clear();
        int i = 0;
        while (i < 10) {
            this.f5069aA.add(new C0809am(this, i < 3));
            i++;
        }
    }

    /* renamed from: p */
    private float m2051p() {
        float f = 4.6f / this.f4991b.f6471cY;
        if (f > 4.6f) {
            f = 4.6f;
        }
        return f;
    }

    /* renamed from: q */
    private float m2050q() {
        return m2049r() / this.f4991b.f6471cY;
    }

    /* renamed from: r */
    private float m2049r() {
        if (this.f4991b.f6366cF / this.f4991b.f6323bL.m4602i() < this.f4991b.f6368cH / this.f4991b.f6323bL.m4601j()) {
            return this.f4991b.f6366cF / this.f4991b.f6323bL.m4602i();
        }
        return this.f4991b.f6368cH / this.f4991b.f6323bL.m4601j();
    }

    /* renamed from: a */
    void m2095a(float f) {
        float f2;
        float f3;
        float f4;
        float f5;
        if (this.f4991b.settingsEngine.showZoomButton) {
            float f6 = this.f4991b.f6345cj * 0.7f;
            int i = (int) (50.0f * f6);
            int i2 = (int) this.f4991b.f6350cp;
            float m961c = C0955a.m961c();
            if (m961c > 20.0f) {
                i = (int) (i + (m961c - 20.0f));
            }
            if (this.f4998D) {
                this.f5040s.m5173a(i - 4, (int) (i2 - (50.0f * this.f4991b.f6345cj)), i + 4, (int) (i2 + (50.0f * this.f4991b.f6345cj)));
                this.f5034i.m5233a();
                this.f5034i.m5207b(Color.m5244a(255, 0, 0, 0));
                this.f4991b.f6326bO.mo163b(this.f5040s, this.f5034i);
            }
            float f7 = i2;
            if (this.f4991b.f6468cV > 1.0f) {
                f5 = f7 - (((this.f4991b.f6468cV - 1.0f) * 3.0f) * this.f4991b.f6345cj);
            } else {
                f5 = f7 + (((this.f4991b.f6468cV * (-20.0f)) + 20.0f + 1.0f) * this.f4991b.f6345cj);
            }
            float f8 = 48.0f * f6;
            float f9 = 54.0f * f6;
            float f10 = f8 / 2.0f;
            float f11 = f9 / 2.0f;
            if (f5 < f11) {
                f5 = f11;
            }
            if (f5 > this.f4991b.f6348cm - f11) {
                f5 = (int) (this.f4991b.f6348cm - f11);
            }
            this.f5040s.m5173a((int) (i - f10), (int) (f5 - f11), (int) (i + f10), (int) (f5 + f11));
            if (!this.f4998D) {
                f5013Y.m5229a(140, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_KATAKANA_HIRAGANA, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_KATAKANA_HIRAGANA, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_KATAKANA_HIRAGANA);
            } else {
                f5013Y.m5229a(255, 255, 255, 255);
            }
            this.f4991b.f6326bO.mo198a(this.f5051S, this.f5040s.f230a, this.f5040s.f231b, f5013Y, 0.0f, f6);
            boolean z = this.f4998D;
            if (!this.f4998D && this.f4990a.m1846b(this.f5040s.f230a, this.f5040s.f231b, this.f5040s.m5171b(), this.f5040s.m5167c(), EnumC0827i.f5435b)) {
                this.f4998D = true;
                this.f4999E = this.f4990a.f5375y;
            }
            if (!this.f4990a.f5380I) {
                this.f4998D = false;
            }
            if (this.f4998D) {
                this.f5000F += f;
                this.f4990a.m1830d();
                float f12 = this.f4990a.f5375y - this.f4999E;
                if (f12 > 180.0f) {
                    f12 = 180.0f;
                }
                if (f12 < -180.0f) {
                    f12 = -180.0f;
                }
                float f13 = f12 * this.f4991b.f6468cV;
                if (f13 > 2.0f) {
                    this.f4991b.f6468cV -= (5.0E-4f * C0773f.m2152c(f13)) * f;
                    this.f4991b.f6469cW = false;
                    if (this.f4991b.f6468cV < m2050q()) {
                        this.f4991b.f6468cV = m2050q();
                        this.f4991b.f6469cW = true;
                    }
                } else if (f13 < -2.0f) {
                    this.f4991b.f6468cV += 5.0E-4f * C0773f.m2152c(f13) * f;
                    this.f4991b.f6469cW = false;
                    if (this.f4991b.f6468cV > m2051p()) {
                        this.f4991b.f6468cV = m2051p();
                        this.f4991b.f6469cW = true;
                    }
                }
            } else {
                if (!z || this.f5000F < 12.0f) {
                }
                this.f5000F = 0.0f;
            }
        }
        if (this.f4991b.settingsEngine.mouseSupport) {
            if (this.f4990a.m1900a(this.f4991b.m1044af(), this.f4991b.m1043ag()) && !this.f4990a.f5383L) {
                int m1041ai = this.f4991b.m1041ai();
                if (m1041ai != 0) {
                    this.f5001G += (m1041ai / 120.0f) * 0.18f;
                }
                if (this.f5001G > 1.0f) {
                    this.f5001G = 1.0f;
                }
                if (this.f5001G < -1.0f) {
                    this.f5001G = -1.0f;
                }
            }
            if (this.f5001G != 0.0f) {
                float f14 = 0.0032f * f;
                if (this.f5001G < 0.0f) {
                    f14 = -f14;
                }
                float f15 = f14 + (this.f5001G * 0.18f * f);
                float f16 = this.f5001G;
                this.f5001G = C0773f.m2218a(this.f5001G, C0773f.m2152c(f15));
                if (this.f5001G == 0.0f) {
                    f15 = f16;
                }
                float f17 = f15 * this.f4991b.f6468cV;
                this.f4991b.f6468cV += f17;
                this.f4991b.f6375cZ = true;
                this.f4991b.f6376da = this.f4991b.m1044af();
                this.f4991b.f6377db = this.f4991b.m1043ag();
                if (f17 != 0.0f) {
                    this.f4991b.f6469cW = false;
                }
            }
        }
        if (this.f4991b.settingsEngine.gestureZoom && this.f4991b.m1047ac() && this.f4991b.m1045ae() >= 3) {
            this.f5012R = 20.0f;
        }
        if (this.f5012R < 10.0f) {
            this.f5003I = false;
        }
        if (this.f5012R > 0.0f) {
            this.f5012R = C0773f.m2218a(this.f5012R, f);
            boolean z2 = this.f4991b.m1047ac() && this.f4991b.m1045ae() >= 3;
            this.f4990a.f5396aU = 3.0f;
            float f18 = 0.0f;
            float f19 = 0.0f;
            if (z2) {
                for (int i3 = 0; i3 < this.f4991b.m1045ae(); i3++) {
                    f18 += this.f4991b.m1021b(i3);
                    f19 += this.f4991b.m1012c(i3);
                }
                f2 = f18 / this.f4991b.m1045ae();
                f3 = f19 / this.f4991b.m1045ae();
                f4 = 0.0f;
                for (int i4 = 0; i4 < this.f4991b.m1045ae(); i4++) {
                    f4 += C0773f.m2170b(f2, f3, this.f4991b.m1021b(i4), this.f4991b.m1012c(i4));
                }
            } else {
                f2 = this.f5007M;
                f3 = this.f5008N;
                f4 = this.f5009O;
            }
            if (this.f5003I && this.f5010P != this.f4991b.m1045ae()) {
                this.f5003I = false;
            }
            if (!this.f5003I && z2) {
                this.f5003I = true;
                this.f5004J = f2;
                this.f5005K = f3;
                this.f5006L = f4;
                this.f5011Q = this.f4991b.f6468cV;
                this.f5007M = f2;
                this.f5008N = f3;
                this.f5009O = f4;
                this.f5010P = this.f4991b.m1045ae();
            }
            if (z2) {
                float f20 = (this.f5008N - f3) * 2.0f * this.f4991b.f6468cV;
                this.f4991b.f6468cV += (f20 / 250.0f) / this.f4991b.f6345cj;
                this.f4991b.f6469cW = false;
                float f21 = this.f5009O - f4;
                if (0 != 0) {
                    this.f4991b.f6468cV -= (f21 / 350.0f) / this.f4991b.f6345cj;
                    this.f4991b.f6469cW = false;
                }
                this.f5007M = f2;
                this.f5008N = f3;
                this.f5009O = f4;
                this.f5010P = this.f4991b.m1045ae();
                for (int i5 = 0; i5 < this.f4991b.m1045ae(); i5++) {
                    this.f4991b.f6326bO.mo226a(f2, f3, this.f4991b.m1021b(i5), this.f4991b.m1012c(i5), this.f4990a.f5315aN);
                }
                this.f4991b.f6326bO.mo226a(f2, f3, f2, this.f5005K, this.f4990a.f5316aO);
                this.f4991b.f6326bO.mo224a(f2, f3, 6.0f, this.f4990a.f5315aN);
            }
        }
        if (this.f4991b.f6468cV > m2051p()) {
            this.f4991b.f6468cV = m2051p();
            this.f4991b.f6469cW = true;
        }
        if (this.f4991b.f6468cV < m2050q()) {
            this.f4991b.f6468cV = m2050q();
            this.f4991b.f6469cW = true;
        }
    }

    /* renamed from: b */
    void m2076b(float f) {
        this.f4992e = false;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        int i = 7;
        if (GameEngine.m1027aw()) {
            i = 14;
        }
        if (this.f4991b.m1047ac() && this.f4990a.f5279ac == null) {
            boolean m1832c = this.f4990a.m1832c(this.f4991b);
            int i2 = 1;
            if (this.f4991b.settingsEngine.mouseOrders == 2) {
                i2 = 2;
            }
            int m995f = this.f4991b.m995f(i2);
            if (m1832c || (this.f4991b.settingsEngine.mouseSupport && m995f != -1 && !this.f4990a.f5381J && !this.f4990a.f5382K)) {
                float m1021b = this.f4991b.m1021b(0);
                float m1012c = this.f4991b.m1012c(0);
                if (m995f != -1) {
                    m1021b = this.f4991b.m1021b(m995f);
                    m1012c = this.f4991b.m1012c(m995f);
                }
                if (!this.f5030c) {
                    z2 = true;
                    this.f5046y.f234a = (int) m1021b;
                    this.f5046y.f235b = (int) m1012c;
                }
                this.f5046y.f236c = (int) m1021b;
                this.f5046y.f237d = (int) m1012c;
                if (Math.abs(this.f5046y.f234a - this.f5046y.f236c) > i || Math.abs(this.f5046y.f235b - this.f5046y.f237d) > i) {
                    this.f5031d = true;
                }
                z = true;
            } else if (this.f4991b.m1045ae() == 2 && this.f5012R == 0.0f) {
                this.f5046y.f234a = (int) this.f4991b.m1021b(0);
                this.f5046y.f235b = (int) this.f4991b.m1012c(0);
                this.f5046y.f236c = (int) this.f4991b.m1021b(1);
                this.f5046y.f237d = (int) this.f4991b.m1012c(1);
                this.f5031d = false;
                z = true;
            }
            if (z) {
                this.f4993f += f;
                if (this.f4993f < 18.0f) {
                    z3 = true;
                }
            } else {
                this.f4993f = 0.0f;
            }
            if (z) {
                this.f5030c = true;
                if (Math.abs(this.f5046y.f234a - this.f5046y.f236c) > i || Math.abs(this.f5046y.f235b - this.f5046y.f237d) > i) {
                    this.f5047z.f233d = (int) this.f5046y.f237d;
                    this.f5047z.f231b = (int) this.f5046y.f235b;
                    this.f5047z.f230a = (int) this.f5046y.f234a;
                    this.f5047z.f232c = (int) this.f5046y.f236c;
                    C0773f.m2203a(this.f5047z);
                    this.f5032g.m5207b(Color.m5244a(255, 0, 255, 0));
                    this.f5032g.m5222a(Paint.Style.f220b);
                    this.f5032g.m5232a(1.0f);
                    this.f4991b.f6326bO.mo163b(this.f5047z, this.f5032g);
                    this.f4992e = true;
                }
            }
        }
        boolean z4 = false;
        boolean z5 = false;
        if (this.f5030c && !z) {
            if (z3 && this.f4991b.m1045ae() == 3) {
                z5 = true;
            } else {
                z4 = true;
            }
        }
        if (z5) {
            this.f5031d = false;
            this.f5030c = false;
        }
        if ((z && !z3) || z4) {
            if (z2) {
                Iterator it = AbstractC1155w.f7177er.iterator();
                while (it.hasNext()) {
                    AbstractC1155w abstractC1155w = (AbstractC1155w) it.next();
                    if (abstractC1155w instanceof AbstractC0318c) {
                        AbstractC0318c abstractC0318c = (AbstractC0318c) abstractC1155w;
                        abstractC0318c.f1651cI = abstractC0318c.f1649cG;
                    }
                }
            }
            if (z4) {
                this.f5031d = false;
                this.f5030c = false;
            }
            this.f5048A.m5157a(this.f5046y);
            C0773f.m2200a(this.f5048A);
            if (Math.abs(this.f5048A.f234a - this.f5048A.f236c) > i || Math.abs(this.f5048A.f235b - this.f5048A.f237d) > i) {
                this.f5048A.f237d /= this.f4991b.f6470cX;
                this.f5048A.f235b /= this.f4991b.f6470cX;
                this.f5048A.f234a /= this.f4991b.f6470cX;
                this.f5048A.f236c /= this.f4991b.f6470cX;
                this.f5048A.m5160a(this.f4991b.f6355cu, this.f4991b.f6356cv);
                this.f4990a.f5396aU = 4.0f;
                this.f4990a.f5397aV = 40.0f;
                this.f4990a.f5392U = false;
                boolean m1859a = this.f4990a.m1859a(this.f4991b);
                boolean m1841b = this.f4990a.m1841b(this.f4991b);
                boolean z6 = true;
                boolean z7 = true;
                boolean z8 = false;
                if (this.f4991b.settingsEngine.smartSelection_v2) {
                    Iterator it2 = AbstractC1155w.f7177er.iterator();
                    while (it2.hasNext()) {
                        AbstractC1155w abstractC1155w2 = (AbstractC1155w) it2.next();
                        if (abstractC1155w2 instanceof AbstractC0629y) {
                            AbstractC0629y abstractC0629y = (AbstractC0629y) abstractC1155w2;
                            if (m2081a(abstractC0629y) && (!m1859a || !abstractC0629y.f1651cI)) {
                                if (!abstractC0629y.mo3398bI()) {
                                    z6 = false;
                                }
                                if (abstractC0629y.mo2969aS() && abstractC0629y.mo3067l()) {
                                    z7 = false;
                                }
                            }
                        }
                    }
                }
                if (m1841b) {
                    z6 = true;
                }
                Iterator it3 = AbstractC1155w.f7177er.iterator();
                while (it3.hasNext()) {
                    AbstractC1155w abstractC1155w3 = (AbstractC1155w) it3.next();
                    if (abstractC1155w3 instanceof AbstractC0318c) {
                        AbstractC0318c abstractC0318c2 = (AbstractC0318c) abstractC1155w3;
                        boolean z9 = false;
                        if (m2081a(abstractC0318c2)) {
                            z9 = true;
                            if (!z6 && abstractC0318c2.mo3398bI()) {
                                z9 = false;
                            }
                            if (!z7 && abstractC0318c2.mo2950ak() && !abstractC0318c2.mo3067l()) {
                                z9 = false;
                            }
                        }
                        if (m1841b) {
                            if (z9) {
                                z9 = !abstractC0318c2.f1651cI;
                            } else if (abstractC0318c2.f1651cI) {
                                z9 = true;
                            }
                        } else if (m1859a && abstractC0318c2.f1651cI) {
                            z9 = true;
                        }
                        if (z9) {
                            this.f4990a.m1812j(abstractC0318c2);
                            if (z4 && abstractC0318c2.f1650cH + 900 < this.f4991b.f6317bA && ((!m1859a && !m1841b) || !abstractC0318c2.f1651cI)) {
                                z8 = true;
                            }
                        } else {
                            this.f4990a.m1808l(abstractC0318c2);
                        }
                    }
                }
                if (z8) {
                    Iterator it4 = AbstractC1155w.f7177er.iterator();
                    while (it4.hasNext()) {
                        AbstractC1155w abstractC1155w4 = (AbstractC1155w) it4.next();
                        if (abstractC1155w4 instanceof AbstractC0318c) {
                            ((AbstractC0318c) abstractC1155w4).f1650cH = this.f4991b.f6317bA;
                        }
                    }
                }
                this.f4990a.m1909E();
            }
        }
    }

    /* renamed from: a */
    private boolean m2081a(AbstractC0318c abstractC0318c) {
        if (!abstractC0318c.f1612bV && abstractC0318c.f1656cN == null) {
            float f = abstractC0318c.f7172eo;
            float f2 = abstractC0318c.f7173ep - abstractC0318c.f7174eq;
            if (f2 <= 0.0f) {
                f2 += abstractC0318c.f7174eq;
            }
            if (this.f5048A.m5153b(f, f2)) {
                if ((this.f4990a.m1806m(abstractC0318c) || this.f4991b.f6312bs.m4423b()) && !abstractC0318c.mo1746t()) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    /* renamed from: a */
    public void m2078a(String str, int i) {
        this.f5057am = str;
        this.f5058an = i;
    }

    /* renamed from: b */
    public void m2073b(String str, int i) {
        if (this.f5058an <= 0.0f || str.equals(this.f5057am)) {
            this.f5057am = str;
            this.f5058an = i;
        }
    }

    /* renamed from: a */
    public void m2079a(String str) {
        if (this.f5058an > 0.0f && str.equals(this.f5057am)) {
            this.f5058an = 0.0f;
        }
    }

    /* renamed from: c */
    public void m2071c(float f) {
        if (this.f5058an > 0.0f && this.f5057am != null) {
            this.f5058an = C0773f.m2218a(this.f5058an, f);
            this.f4991b.f6326bO.mo181a(this.f5057am, this.f4991b.f6349co, this.f4991b.f6350cp, this.f4990a.f5305aD, this.f4990a.f5310aI, 8.0f);
        }
    }

    /* renamed from: a */
    public static boolean m2089a(AbstractC0224s abstractC0224s) {
        return GameEngine.getGameEngine().f6441ar && abstractC0224s.mo4290n_();
    }

    /* renamed from: c */
    public void m2072c() {
        this.f5002H = 0;
    }

    /* renamed from: a */
    public C0645ad m2088a(AbstractC0224s abstractC0224s, int i, ArrayList arrayList) {
        GameEngine gameEngine = GameEngine.getGameEngine();
        if (!GameEngine.m1028av()) {
            return null;
        }
        if (abstractC0224s.mo4311M() != null) {
            return abstractC0224s.mo4311M();
        }
        if ((abstractC0224s instanceof C0219n) || (abstractC0224s instanceof C0209d)) {
            return null;
        }
        if (abstractC0224s.mo3091f() == EnumC0225t.f1470b) {
            return gameEngine.f6331bT.f4159T;
        }
        if (abstractC0224s.mo3092e() == EnumC0226u.f1491m) {
            return gameEngine.f6331bT.f4156Q;
        }
        if (abstractC0224s.mo3092e() == EnumC0226u.f1490l) {
            return gameEngine.f6331bT.f4155P;
        }
        if (abstractC0224s.mo3092e() == EnumC0226u.f1483e) {
            return gameEngine.f6331bT.f4157R;
        }
        if (abstractC0224s.mo3091f() == EnumC0225t.f1471c) {
            int i2 = 0;
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                AbstractC0224s abstractC0224s2 = (AbstractC0224s) it.next();
                if (abstractC0224s2 != abstractC0224s && abstractC0224s2.mo3091f() == EnumC0225t.f1471c && this.f4990a.m1844b(abstractC0224s2)) {
                    i2++;
                }
            }
            if (i2 == 0) {
                return gameEngine.f6331bT.f4158S;
            }
        }
        EnumC0225t mo3091f = abstractC0224s.mo3091f();
        if (mo3091f == EnumC0225t.f1475g || mo3091f == EnumC0225t.f1476h || mo3091f == EnumC0225t.f1477i) {
            return null;
        }
        C0645ad c0645ad = null;
        C0645ad[] c0645adArr = gameEngine.f6331bT.f4172ag;
        if (this.f5002H < c0645adArr.length) {
            c0645ad = c0645adArr[this.f5002H];
            this.f5002H++;
        }
        return c0645ad;
    }

    /* renamed from: d */
    public ArrayList m2068d() {
        this.f5063au.clear();
        AbstractC0244am[] m499a = this.f4990a.f5427bZ.m499a();
        int size = this.f4990a.f5427bZ.size();
        for (int i = 0; i < size; i++) {
            InterfaceC0303as mo5459r = m499a[i].mo5459r();
            if (!this.f5063au.contains(mo5459r)) {
                this.f5063au.add(mo5459r);
            }
        }
        return this.f5063au;
    }

    /* renamed from: a */
    public ArrayList m2084a(AbstractC0244am abstractC0244am, ArrayList arrayList) {
        C1136m mo3586e;
        ArrayList mo3132N;
        int i = 0;
        this.f5059aq.clear();
        int m1799q = this.f4990a.m1799q();
        if (m1799q == 0) {
            if (this.f4991b.settingsEngine.showChatAndPingShortcuts && this.f4991b.m1096M()) {
                this.f5059aq.add(0, this.f4990a.f5368q);
                this.f5059aq.add(0, this.f4990a.f5369r);
            }
            return this.f5059aq;
        }
        if (C0825g.f5355bO && abstractC0244am != null && !(abstractC0244am instanceof C0560h)) {
            this.f5059aq.add(this.f5060ar);
            this.f5059aq.add(this.f5061as);
        }
        if (abstractC0244am == null) {
        }
        if (abstractC0244am != null) {
            i = this.f5059aq.size();
            if (abstractC0244am.f1649cG) {
                if (this.f4990a.m1806m(abstractC0244am)) {
                    ArrayList mo3132N2 = abstractC0244am.mo3132N();
                    if (mo3132N2 != null) {
                        this.f5059aq.addAll(mo3132N2);
                    }
                } else {
                    ArrayList mo3132N3 = abstractC0244am.mo3132N();
                    if (mo3132N3 != null) {
                        this.f5059aq.addAll(mo3132N3);
                    }
                }
            }
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                AbstractC0244am abstractC0244am2 = (AbstractC0244am) arrayList.get(i2);
                if (this.f4990a.m1806m(abstractC0244am2) && ((abstractC0244am2.mo5459r() != abstractC0244am.mo5459r() || abstractC0244am2.mo3038V() != abstractC0244am.mo3038V()) && (mo3132N = abstractC0244am2.mo3132N()) != null)) {
                    Iterator it = mo3132N.iterator();
                    while (it.hasNext()) {
                        AbstractC0224s abstractC0224s = (AbstractC0224s) it.next();
                        boolean z = false;
                        Iterator it2 = this.f5059aq.iterator();
                        while (it2.hasNext()) {
                            if (((AbstractC0224s) it2.next()).m4310N().equals(abstractC0224s.m4310N())) {
                                z = true;
                            }
                        }
                        if (!z) {
                            this.f5059aq.add(abstractC0224s);
                        }
                    }
                }
            }
        }
        boolean z2 = false;
        int size2 = arrayList.size();
        for (int i3 = 0; i3 < size2; i3++) {
            AbstractC0244am abstractC0244am3 = (AbstractC0244am) arrayList.get(i3);
            if (this.f4990a.m1806m(abstractC0244am3) && (abstractC0244am3 instanceof AbstractC0629y) && !((AbstractC0629y) abstractC0244am3).mo2969aS()) {
                z2 = true;
            }
        }
        AbstractC0244am m2064e = m2064e();
        if (!z2 && m2064e != null && this.f4990a.m1806m(m2064e)) {
            this.f5059aq.add(i, this.f4990a.f5364m);
            this.f5059aq.add(i, this.f4990a.f5365n);
        }
        boolean z3 = false;
        if (C0825g.f5355bO && (this.f4991b.settingsEngine.showSelectedUnitsList || m1799q == 1)) {
            z3 = true;
        }
        if (GameEngine.m1030at() && m1799q > 0) {
            z3 = true;
        }
        if (z3 && !(abstractC0244am instanceof C0560h)) {
            if (m1799q == 1 && m2064e != null && (mo3586e = m2064e.mo3586e(true)) != null && mo3586e.size() > 0) {
                for (int i4 = 0; i4 < mo3586e.f7109a; i4++) {
                    AbstractC0224s abstractC0224s2 = (AbstractC0224s) mo3586e.get(i4);
                    if (abstractC0224s2 instanceof C0212g) {
                        C0212g c0212g = (C0212g) abstractC0224s2;
                        Iterator it3 = this.f5065aw.iterator();
                        while (it3.hasNext()) {
                            C0212g c0212g2 = (C0212g) it3.next();
                            if (c0212g2.m4328a(c0212g)) {
                                mo3586e.set(i4, c0212g2);
                            }
                        }
                    }
                }
                this.f5065aw.clear();
                Iterator it4 = mo3586e.iterator();
                while (it4.hasNext()) {
                    AbstractC0224s abstractC0224s3 = (AbstractC0224s) it4.next();
                    if (abstractC0224s3 instanceof C0212g) {
                        this.f5065aw.add((C0212g) abstractC0224s3);
                    }
                    this.f5059aq.add(abstractC0224s3);
                }
            }
            ArrayList m2068d = m2068d();
            this.f5064av.clear();
            Iterator it5 = m2068d.iterator();
            while (it5.hasNext()) {
                C0231z mo3525d = ((InterfaceC0303as) it5.next()).mo3525d();
                mo3525d.m4282K();
                this.f5064av.add(mo3525d);
            }
            Collections.sort(this.f5064av);
            if (C0825g.f5355bO) {
                Collections.reverse(this.f5064av);
            }
            Iterator it6 = this.f5064av.iterator();
            while (it6.hasNext()) {
                C0231z c0231z = (C0231z) it6.next();
                if (C0825g.f5355bO) {
                    this.f5059aq.add(0, c0231z);
                } else {
                    this.f5059aq.add(c0231z);
                }
            }
        }
        return this.f5059aq;
    }

    /* renamed from: e */
    AbstractC0244am m2064e() {
        if (this.f4990a.f5427bZ.size() > 0) {
            return this.f4990a.f5427bZ.mo498a(0);
        }
        return null;
    }

    /* renamed from: f */
    AbstractC0244am m2061f() {
        AbstractC0244am abstractC0244am = null;
        if (this.f4990a.f5322aX > 0) {
            AbstractC0244am[] m499a = this.f4990a.f5427bZ.m499a();
            int i = 0;
            int size = this.f4990a.f5427bZ.size();
            while (true) {
                if (i >= size) {
                    break;
                }
                AbstractC0244am abstractC0244am2 = m499a[i];
                if (abstractC0244am2.f1649cG) {
                    if (abstractC0244am == null) {
                        abstractC0244am = abstractC0244am2;
                    } else if (!m2085a(abstractC0244am, abstractC0244am2)) {
                        abstractC0244am = null;
                        break;
                    } else if (abstractC0244am.mo3038V() > abstractC0244am2.mo3038V()) {
                        abstractC0244am = abstractC0244am2;
                    }
                }
                i++;
            }
        }
        return abstractC0244am;
    }

    /* renamed from: a */
    public static boolean m2085a(AbstractC0244am abstractC0244am, AbstractC0244am abstractC0244am2) {
        InterfaceC0303as mo5459r = abstractC0244am.mo5459r();
        InterfaceC0303as mo5459r2 = abstractC0244am2.mo5459r();
        if (mo5459r == mo5459r2) {
            return true;
        }
        if ((mo5459r instanceof C0458l) && (mo5459r2 instanceof C0458l)) {
            C0458l c0458l = (C0458l) mo5459r;
            C0458l c0458l2 = (C0458l) mo5459r2;
            if (c0458l.f3300fL.contains(mo5459r2)) {
                return true;
            }
            if (c0458l.f3203fO != null && C0453g.m3685a(c0458l.f3203fO, c0458l2.mo3488x())) {
                return true;
            }
            if (c0458l2.f3203fO != null && C0453g.m3685a(c0458l2.f3203fO, c0458l.mo3488x())) {
                return true;
            }
            return false;
        }
        return false;
    }

    /* renamed from: g */
    ArrayList m2060g() {
        this.f5066ax.clear();
        AbstractC0244am[] m499a = this.f4990a.f5427bZ.m499a();
        int size = this.f4990a.f5427bZ.size();
        for (int i = 0; i < size; i++) {
            AbstractC0244am abstractC0244am = m499a[i];
            if (abstractC0244am instanceof AbstractC0629y) {
                this.f5066ax.add((AbstractC0629y) abstractC0244am);
            }
        }
        return this.f5066ax;
    }

    /* renamed from: h */
    float m2059h() {
        return C0773f.m2171b((this.f4991b.f6348cm / 14.0f) / this.f4991b.f6345cj, 25.0f * this.f4991b.f6345cj, 40.0f * this.f4991b.f6345cj);
    }

    /* renamed from: c */
    private boolean m2070c(AbstractC0224s abstractC0224s) {
        if (abstractC0224s.mo4279s()) {
            return true;
        }
        if (abstractC0224s instanceof C0212g) {
            return this.f4990a.m1806m(((C0212g) abstractC0224s).f1437b);
        }
        ArrayList m2060g = m2060g();
        C0208c m4310N = abstractC0224s.m4310N();
        Iterator it = m2060g.iterator();
        while (it.hasNext()) {
            AbstractC0629y abstractC0629y = (AbstractC0629y) it.next();
            if (abstractC0629y.mo3656a(m4310N) != null && this.f4990a.m1806m(abstractC0629y)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    private boolean m2087a(AbstractC0224s abstractC0224s, ArrayList arrayList) {
        C0213h c0213h = null;
        if (abstractC0224s instanceof C0213h) {
            c0213h = (C0213h) abstractC0224s;
        }
        if (c0213h != null && c0213h.f1444d == C0825g.f5358cd) {
            return c0213h.f1445e;
        }
        boolean m2074b = m2074b(abstractC0224s, arrayList);
        if (c0213h != null) {
            c0213h.f1444d = C0825g.f5358cd;
            c0213h.f1445e = m2074b;
        }
        return m2074b;
    }

    /* renamed from: b */
    private boolean m2074b(AbstractC0224s abstractC0224s, ArrayList arrayList) {
        if (abstractC0224s.mo4279s()) {
            return true;
        }
        if (abstractC0224s instanceof C0212g) {
            C0212g c0212g = (C0212g) abstractC0224s;
            if (!c0212g.mo4056r(c0212g.f1437b)) {
                return false;
            }
            if (this.f4990a.m1806m(c0212g.f1437b) || c0212g.mo4069a(c0212g.f1437b, this.f4991b.f6312bs)) {
                return true;
            }
            return false;
        }
        C0208c m4310N = abstractC0224s.m4310N();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            AbstractC0244am abstractC0244am = (AbstractC0629y) it.next();
            AbstractC0224s a = abstractC0244am.mo3656a(m4310N);
            if (a != null && a.mo4056r(abstractC0244am) && (this.f4990a.m1806m(abstractC0244am) || a.mo4069a(abstractC0244am, this.f4991b.f6312bs))) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: c */
    private boolean m2069c(AbstractC0224s abstractC0224s, ArrayList arrayList) {
        if (abstractC0224s.mo4279s()) {
            return true;
        }
        if (abstractC0224s instanceof C0212g) {
            C0212g c0212g = (C0212g) abstractC0224s;
            if (c0212g.mo3097a((AbstractC0244am) c0212g.f1437b, true)) {
                return true;
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            AbstractC0244am abstractC0244am = (AbstractC0629y) it.next();
            AbstractC0224s a = abstractC0244am.mo3656a(abstractC0224s.m4310N());
            if (a != null && a.mo3097a(abstractC0244am, true)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: d */
    private float m2065d(AbstractC0224s abstractC0224s, ArrayList arrayList) {
        int i = 0;
        float f = -1.0f;
        if (abstractC0224s.mo4280o_()) {
            return -1.0f;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            AbstractC0244am abstractC0244am = (AbstractC0629y) it.next();
            AbstractC0224s a = abstractC0244am.mo3656a(abstractC0224s.m4310N());
            if (a != null) {
                float mo4288p = a.mo4288p(abstractC0244am);
                if (mo4288p > f) {
                    f = mo4288p;
                    i++;
                }
            }
        }
        return f;
    }

    /* renamed from: d */
    private C0559e m2066d(AbstractC0224s abstractC0224s) {
        float f = -1.0f;
        C0559e c0559e = null;
        if (abstractC0224s.mo4280o_()) {
            return null;
        }
        if (abstractC0224s instanceof C0212g) {
            C0559e m3178b = C0559e.m3178b(((C0212g) abstractC0224s).f1437b, abstractC0224s.m4310N());
            if (m3178b != null) {
                if (-1.0f < m3178b.m3191a()) {
                    f = m3178b.m3191a();
                    c0559e = m3178b;
                }
            } else {
                return null;
            }
        }
        Iterator it = this.f4990a.f5427bZ.iterator();
        while (it.hasNext()) {
            AbstractC0244am abstractC0244am = (AbstractC0244am) it.next();
            if (abstractC0244am instanceof AbstractC0629y) {
                AbstractC0629y abstractC0629y = (AbstractC0629y) abstractC0244am;
                if (abstractC0629y.mo3656a(abstractC0224s.m4310N()) == null) {
                    continue;
                } else {
                    C0559e m3178b2 = C0559e.m3178b(abstractC0629y, abstractC0224s.m4310N());
                    if (m3178b2 != null) {
                        if (f < m3178b2.m3191a()) {
                            f = m3178b2.m3191a();
                            c0559e = m3178b2;
                        }
                    } else {
                        return null;
                    }
                }
            }
        }
        if (c0559e == null) {
            return null;
        }
        return c0559e;
    }

    /* renamed from: e */
    private float m2062e(AbstractC0224s abstractC0224s) {
        C0559e m2066d = m2066d(abstractC0224s);
        if (m2066d == null) {
            return 0.0f;
        }
        return m2066d.m3177c();
    }

    /* renamed from: b */
    float m2075b(AbstractC0224s abstractC0224s) {
        C0559e m2066d = m2066d(abstractC0224s);
        if (m2066d == null) {
            return 0.0f;
        }
        return m2066d.m3175d();
    }

    /* renamed from: d */
    int m2067d(float f) {
        ArrayList m2084a;
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        float f7;
        C0966ag c0966ag;
        Rect rect;
        Rect rect2;
        int m5244a;
        int m1041ai;
        this.f5028ap = false;
        int i = 1;
        if (C0825g.f5356bP) {
            i = 2;
        }
        int i2 = 0;
        boolean z = false;
        C0819c.m1931a(f);
        ArrayList m2060g = m2060g();
        AbstractC0244am m2061f = m2061f();
        ArrayList arrayList = null;
        if (this.f4990a.f5279ac != null) {
            arrayList = this.f4990a.f5279ac.mo4296q(m2061f);
        }
        if (arrayList != null) {
            m2084a = arrayList;
        } else {
            m2084a = m2084a(m2061f, m2060g);
        }
        if (m2061f == null && m2084a.size() > 0) {
            m2061f = m2064e();
            if (m2061f == null && C0458l.f2933b != null) {
                m2061f = AbstractC0244am.m4224c(C0458l.f2933b);
            }
        }
        this.f4990a.f5371t = false;
        if (m2084a.contains(this.f4990a.f5364m)) {
            this.f4990a.f5371t = true;
        }
        if (m2061f == null) {
            m2061f = m2064e();
        }
        boolean z2 = true;
        if (m2061f == null) {
            this.f5018ad = -1L;
        }
        if (m2061f != null && m2084a.size() > 0) {
            ArrayList arrayList2 = m2084a;
            float f8 = 2.0f;
            float m2059h = m2059h();
            float f9 = 2.0f;
            float f10 = m2059h + 2.0f;
            boolean z3 = false;
            if (!C0825g.f5349bR) {
                f2 = this.f4991b.f6334bW.m1765b() + 2;
                f3 = this.f4991b.f6347cl - this.f4991b.f6334bW.f5489c;
                f4 = this.f4991b.f6334bW.f5489c;
            } else {
                f2 = this.f4991b.f6334bW.f5465b;
                f3 = this.f4991b.f6334bW.f5489c;
                f4 = this.f4991b.f6334bW.f5489c;
                z3 = true;
            }
            if (C0825g.f5355bO) {
                m2059h += 15.0f * this.f4991b.f6345cj;
                float f11 = f10 + (15.0f * this.f4991b.f6345cj);
                f8 = 2.0f * this.f4991b.f6345cj;
                if (GameEngine.m1029au()) {
                    f8 = 2.0f * this.f4991b.f6345cj;
                }
                f10 = f11 + 2.0f;
                f9 = 2.0f + 2.0f;
                f2 += 3.0f;
            }
            if (!C0825g.f5354a) {
                boolean z4 = true;
                if (this.f4990a.f5262f != null && this.f4990a.f5322aX == 1 && this.f4990a.f5262f.f1649cG) {
                    z4 = false;
                }
                if (z4) {
                    f2 = f2 + m2058i() + 2.0f;
                }
            }
            int i3 = 0;
            float f12 = 0.0f;
            float f13 = 0.0f;
            float f14 = 0.0f;
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                AbstractC0224s abstractC0224s = (AbstractC0224s) it.next();
                if (m2087a(abstractC0224s, m2060g)) {
                    i3++;
                    float mo3123l = f10 * abstractC0224s.mo3123l();
                    int i4 = i;
                    if (abstractC0224s.mo3122m() > 0) {
                        i4 = abstractC0224s.mo3122m();
                    }
                    float f15 = f4 / i4;
                    boolean z5 = false;
                    if ((f13 + f15) - 0.1f >= f4) {
                        z5 = true;
                    }
                    if (!z5 && f12 > 0.0f && mo3123l + 0.1f < f12) {
                        z5 = true;
                    }
                    if (z5) {
                        f14 += f12;
                        f12 = 0.0f;
                        f13 = 0.0f;
                    }
                    if (f12 < mo3123l) {
                        f12 = mo3123l;
                    }
                    f13 += f15;
                }
            }
            if (f13 > 0.0f) {
                f14 += f12;
            }
            float f16 = f2 + f14;
            float f17 = f2;
            float f18 = f2 + 1.0f;
            if (this.f4991b.settingsEngine.showUnitGroups) {
                f5 = this.f4991b.f6368cH - (34.0f * this.f4991b.f6345cj);
            } else {
                f5 = this.f4991b.f6368cH;
            }
            this.f5018ad = m2061f.f7166eh;
            float f19 = f18 - ((int) m2061f.f1581br);
            float f20 = 0.0f;
            float f21 = 1.0f + (m2059h * 0.25f);
            boolean z6 = f16 - m2061f.f1581br > f5 + f21;
            boolean z7 = m2061f.f1581br > f21;
            this.f5028ap = z6 || z7;
            if (this.f4991b.settingsEngine.mouseSupport && !this.f4990a.m1900a(this.f4991b.m1044af(), this.f4991b.m1043ag()) && (m1041ai = this.f4991b.m1041ai()) != 0) {
                f20 = -(m1041ai / 120.0f);
            }
            float f22 = 0.0f;
            if (f20 > 0.0f) {
                this.f5027ao = (float) (this.f5027ao + (0.5d * f10));
            }
            if (f20 < 0.0f) {
                this.f5027ao = (float) (this.f5027ao - (0.5d * f10));
            }
            if (z6) {
                this.f5040s.f230a = (int) (f3 + 2.0f);
                this.f5040s.f232c = (int) ((f3 + f4) - 2.0f);
                this.f5040s.f231b = (int) (f5 - (m2059h * 0.4f));
                this.f5040s.f233d = (int) (this.f5040s.f231b + (m2059h * 0.4f));
                if (this.f4990a.m1886a(this.f5040s.f230a, this.f5040s.f231b, this.f5040s.m5171b(), this.f5040s.m5167c(), "\\/", EnumC0827i.f5434a, false, Color.m5244a(80, 100, 150, 100), this.f4990a.f5304aC, (C0784h) null) && this.f4990a.m1904J()) {
                    f22 = 0.0f + (3.0f * f10);
                    this.f4990a.f5392U = false;
                }
                f5 -= (f10 * 0.4f) + 2.0f;
            }
            if (z7) {
                this.f5040s.f230a = (int) (f3 + 2.0f);
                this.f5040s.f232c = (int) ((f3 + f4) - 2.0f);
                this.f5040s.f231b = (int) f17;
                this.f5040s.f233d = (int) (this.f5040s.f231b + (m2059h * 0.4f));
                if (this.f4990a.m1886a(this.f5040s.f230a, this.f5040s.f231b, this.f5040s.m5171b(), this.f5040s.m5167c(), "/\\", EnumC0827i.f5434a, false, Color.m5244a(80, 100, 150, 100), this.f4990a.f5304aC, (C0784h) null) && this.f4990a.m1904J()) {
                    f22 -= 3.0f * f10;
                    this.f4990a.f5392U = false;
                }
                f17 += (f10 * 0.4f) + 2.0f;
            }
            this.f4991b.f6326bO.mo138i();
            this.f5067ay.m5159a(0.0f, f17 - 1.0f, this.f4991b.f6347cl, f5 + 1.0f);
            this.f4991b.f6326bO.mo207a(this.f5067ay);
            if (GameEngine.m1029au()) {
                if (this.f5018ad != m2061f.f7166eh) {
                    this.f5019ae = 0.0f;
                    this.f5020af = m2061f.f1581br;
                } else if (this.f5027ao != 0.0f) {
                    this.f5019ae = this.f5027ao;
                } else {
                    if (!this.f4990a.f5380I) {
                        this.f5027ao += this.f5019ae * f;
                    }
                    this.f5019ae = C0773f.m2218a(this.f5019ae, f);
                }
            }
            m2061f.f1581br += this.f5027ao + f22;
            this.f5027ao = 0.0f;
            int i5 = (int) (f16 - f5);
            if (i5 > 0) {
                if (m2061f.f1581br > i5 + 0.0f) {
                    m2061f.f1581br = i5 + 0.0f;
                }
                if (m2061f.f1581br < 0.0f - 0.0f) {
                    m2061f.f1581br = 0.0f - 0.0f;
                }
            } else {
                m2061f.f1581br = 0.0f;
            }
            int i6 = -1;
            float f23 = 0.0f;
            float f24 = 0.0f;
            float f25 = 0.0f;
            m2072c();
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                AbstractC0224s abstractC0224s2 = (AbstractC0224s) it2.next();
                if (m2087a(abstractC0224s2, m2060g)) {
                    i2++;
                    boolean m2069c = m2069c(abstractC0224s2, m2060g);
                    i6++;
                    float mo3123l2 = m2059h * abstractC0224s2.mo3123l();
                    int i7 = i;
                    if (abstractC0224s2.mo3122m() > 0) {
                        i7 = abstractC0224s2.mo3122m();
                    }
                    float f26 = f4 / i7;
                    if (!z3) {
                        f6 = mo3123l2;
                        f7 = f26;
                    } else {
                        f6 = f26;
                        f7 = mo3123l2;
                    }
                    boolean z8 = false;
                    if ((f25 + f7) - 0.1f > f4) {
                        z8 = true;
                    }
                    if (!z8 && f24 > 0.0f && f6 + 0.1f < f24) {
                        z8 = true;
                    }
                    if (z8) {
                        f23 += f24 + f9;
                        f24 = 0.0f;
                        f25 = 0.0f;
                    }
                    if (f24 < f6) {
                        f24 = f6;
                    }
                    if (!z3) {
                        this.f5040s.f230a = (int) (f3 + f8);
                        this.f5040s.f232c = (int) ((this.f5040s.f230a + f26) - (f8 * 2.0f));
                        this.f5040s.f231b = (int) (f23 + f19);
                        this.f5040s.f233d = (int) (this.f5040s.f231b + mo3123l2);
                        this.f5040s.m5174a((int) f25, 0);
                    } else {
                        this.f5040s.f230a = (int) (f3 + f8 + f23);
                        this.f5040s.f232c = (int) ((this.f5040s.f230a + f26) - (f8 * 2.0f));
                        this.f5040s.f231b = (int) f19;
                        this.f5040s.f233d = (int) (this.f5040s.f231b + mo3123l2);
                        this.f5040s.m5174a(0, (int) f25);
                    }
                    boolean z9 = true;
                    this.f5041t.m5158a(this.f5040s);
                    if (!this.f5041t.m5151b(this.f5067ay)) {
                        z9 = false;
                    }
                    f25 += f7;
                    EnumC0225t mo3091f = abstractC0224s2.mo3091f();
                    boolean z10 = false;
                    z10 = (mo3091f == EnumC0225t.f1475g || mo3091f == EnumC0225t.f1476h || mo3091f == EnumC0225t.f1477i) ? true : true;
                    boolean m2089a = m2089a(abstractC0224s2);
                    boolean mo4283G = abstractC0224s2.mo4283G();
                    Paint paint = this.f5035j;
                    boolean z11 = m2069c;
                    if (mo3091f == EnumC0225t.f1477i) {
                        z11 = true;
                    }
                    if (z11) {
                        paint.m5207b(Color.m5244a(70, 100, 100, 100));
                    } else {
                        paint.m5207b(Color.m5244a(50, 170, 100, 100));
                    }
                    if (m2089a) {
                        paint.m5207b(Color.m5244a(100, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_STB_INPUT, 100, 100));
                    }
                    boolean z12 = false;
                    boolean z13 = false;
                    if (this.f5015aa == m2061f && this.f5016ab == abstractC0224s2) {
                        z12 = true;
                    }
                    if (this.f4990a.f5279ac == abstractC0224s2) {
                        z12 = true;
                        z13 = true;
                    }
                    if (z12) {
                        paint.m5207b(Color.m5244a(80, 100, 100, 200));
                    }
                    if (z13) {
                        paint.m5207b(Color.m5244a(80, 100, 200, 100));
                    }
                    if (mo4283G) {
                        paint.m5202c((int) (paint.m5193f() * 0.7f));
                        c0966ag = this.f4995o;
                    } else {
                        c0966ag = this.f4994n;
                    }
                    float f27 = 0.0f;
                    if (z9) {
                        f27 = C0819c.m1928b(m2061f, abstractC0224s2, false);
                        if (abstractC0224s2.mo3091f() != EnumC0225t.f1476h) {
                            boolean m1880a = this.f4990a.m1880a(abstractC0224s2);
                            float f28 = 0.0f;
                            if (m1880a) {
                                f28 = C0773f.m2152c(C0773f.m2107k((((float) (GameEngine.m1087V() % 1000)) / 1000.0f) * 180.0f));
                            }
                            if (f27 != 0.0f) {
                                float m2171b = C0773f.m2171b((C0773f.m2152c(f27) * 0.7f) - 0.3f, 0.0f, 1.0f);
                                if (f27 > 0.0f) {
                                    m5244a = Color.m5244a(110, 210, 210, 210);
                                } else {
                                    m5244a = Color.m5244a(110, 210, 110, 110);
                                }
                                int m2209a = C0773f.m2209a(m5244a, paint.m5195e(), m2171b);
                                paint = this.f5034i;
                                paint.m5207b(m2209a);
                            }
                            this.f4990a.m1881a(this.f5040s, paint, c0966ag);
                            float m2065d = m2065d(abstractC0224s2, m2060g);
                            if (m2065d >= 0.0f) {
                                this.f5037l.m5229a(80, 0, 0, 100);
                                this.f5049B.m5172a(this.f5040s);
                                this.f5049B.f232c = (int) (rect2.f232c - ((1.0f - m2065d) * this.f5049B.m5171b()));
                                this.f4991b.f6326bO.mo163b(this.f5049B, this.f5037l);
                                this.f5038m.m5229a(SlickToAndroidKeycodes.AndroidCodes.KEYCODE_BUTTON_3, 148, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_BUTTON_2, 255);
                                this.f4991b.f6326bO.mo226a(this.f5049B.f232c, this.f5049B.f231b, this.f5049B.f232c, this.f5049B.f233d, this.f5037l);
                            } else {
                                float m2062e = m2062e(abstractC0224s2);
                                if (m2062e > 0.0f) {
                                    this.f5037l.m5229a(80, 100, 0, 0);
                                    this.f5049B.m5172a(this.f5040s);
                                    this.f5049B.f232c = (int) (rect.f232c - ((1.0f - m2062e) * this.f5049B.m5171b()));
                                    this.f4991b.f6326bO.mo163b(this.f5049B, this.f5037l);
                                    this.f5038m.m5229a(SlickToAndroidKeycodes.AndroidCodes.KEYCODE_BUTTON_3, 148, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_BUTTON_2, 255);
                                    this.f4991b.f6326bO.mo226a(this.f5049B.f232c, this.f5049B.f231b, this.f5049B.f232c, this.f5049B.f233d, this.f5037l);
                                }
                            }
                            int m5244a2 = Color.m5244a(255, 0, 0, 0);
                            if (C0825g.f5355bO) {
                                m5244a2 = Color.m5244a(100, 0, 0, 0);
                                if (mo4283G) {
                                    m5244a2 = Color.m5244a(50, 155, 155, 155);
                                }
                            }
                            boolean z14 = false;
                            if (m1880a) {
                                z14 = true;
                                m5244a2 = Color.m5244a((int) (100.0f + (150.0f * f28)), 255, 255, 255);
                            }
                            this.f4990a.m1882a(this.f5040s, m5244a2, z14);
                        }
                    }
                    C0645ad m2088a = m2088a(abstractC0224s2, i6, arrayList2);
                    if (m2088a != null && z9) {
                        this.f4991b.f6326bO.mo182a(m2088a.m2765c(), this.f5040s.f230a + 3, this.f5040s.f231b + this.f4991b.f6326bO.mo180a("A", this.f4990a.f5301az) + 1.0f, this.f4990a.f5301az);
                    }
                    boolean z15 = false;
                    InterfaceC0303as mo5458i = abstractC0224s2.mo5458i();
                    C0970e mo3151j = abstractC0224s2.mo3151j();
                    AbstractC0244am mo4062i = abstractC0224s2.mo4062i(m2061f);
                    if (mo4062i != null) {
                        mo5458i = mo4062i.mo5459r();
                    }
                    if (mo3151j == null && mo5458i != null) {
                        mo3151j = mo5458i.mo3486z();
                    }
                    if (mo3151j != null) {
                        Rect mo4294v = abstractC0224s2.mo4294v();
                        if (mo4294v == null) {
                            mo4294v = this.f5049B;
                            mo4294v.m5173a(0, 0, mo3151j.mo387m(), mo3151j.mo388l());
                        }
                        float m5167c = (this.f5040s.m5167c() * 0.7f) / mo4294v.m5167c();
                        int m5166d = (int) (this.f5040s.m5166d() - ((mo4294v.m5171b() * 0.5f) * m5167c));
                        int m5165e = (int) (this.f5040s.m5165e() - ((mo4294v.m5167c() * 0.5f) * m5167c));
                        this.f5039p.m5229a(100, 255, 255, 255);
                        RectF rectF = this.f5050C;
                        rectF.m5159a(m5166d, m5165e, m5166d + (mo4294v.m5171b() * m5167c), m5165e + (mo4294v.m5167c() * m5167c));
                        this.f4991b.f6326bO.mo193a(mo3151j, mo4294v, rectF, this.f5039p);
                        z15 = true;
                    } else if (mo5458i != null) {
                        float m5166d2 = this.f5040s.m5166d();
                        float m5165e2 = this.f5040s.m5165e();
                        if (f27 > 0.5d) {
                            m5165e2 += 1.0f;
                        }
                        if (f27 < -0.5d) {
                            m5165e2 -= 1.0f;
                        }
                        float m5167c2 = this.f5040s.m5167c() * 0.7f;
                        float m5167c3 = this.f5040s.m5167c() * 0.95f;
                        if (C0825g.f5355bO) {
                            m5167c2 = this.f5040s.m5167c() * 0.4f;
                            m5167c3 = this.f5040s.m5167c() * 0.85f;
                        }
                        this.f5045x.m5158a(this.f5040s);
                        if (this.f5045x.m5151b(this.f5067ay)) {
                            this.f4991b.f6326bO.mo138i();
                            this.f4991b.f6326bO.mo207a(this.f5045x);
                            EnumC0249ar.m4178a(mo5458i, m5166d2, m5165e2, 0.0f, 0.0f, m2061f.f1614bX, m5167c2, m5167c3, false, false, abstractC0224s2.mo4289t(), mo4062i);
                            if (mo4062i != null) {
                                float mo3575x = mo4062i.mo3575x();
                                float mo3311bV = mo4062i.mo3311bV();
                                if (mo3311bV != -1.0f && abstractC0224s2.mo4053t(m2061f)) {
                                    int m2165b = C0773f.m2165b(200, 0, 0, 150);
                                    int m2165b2 = C0773f.m2165b(120, 0, 0, (int) SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_DATA_SERVICE);
                                    Paint m474a = C1152y.m474a(m2165b, Paint.Style.f219a);
                                    Paint m474a2 = C1152y.m474a(m2165b2, Paint.Style.f220b);
                                    int m5154b = ((int) (this.f5045x.m5154b() / 3.0f)) - 3;
                                    int i8 = m5154b * 2;
                                    this.f5050C.m5159a(m5166d2 - m5154b, m5165e2 + 0, (m5166d2 - m5154b) + (i8 * mo3311bV), m5165e2 + 0 + 3);
                                    this.f4991b.f6326bO.mo206a(this.f5050C, m474a);
                                    this.f5050C.m5159a(m5166d2 - m5154b, m5165e2 + 0, (m5166d2 - m5154b) + i8, m5165e2 + 0 + 3);
                                    this.f4991b.f6326bO.mo206a(this.f5050C, m474a2);
                                } else if (mo3575x != -1.0f && abstractC0224s2.mo4054s(m2061f)) {
                                    int m2165b3 = C0773f.m2165b(200, 0, 150, 0);
                                    int m2165b4 = C0773f.m2165b(120, 0, (int) SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_DATA_SERVICE, 0);
                                    Paint m474a3 = C1152y.m474a(m2165b3, Paint.Style.f219a);
                                    Paint m474a4 = C1152y.m474a(m2165b4, Paint.Style.f220b);
                                    int m5154b2 = ((int) (this.f5045x.m5154b() / 3.0f)) - 3;
                                    int i9 = m5154b2 * 2;
                                    this.f5050C.m5159a(m5166d2 - m5154b2, m5165e2 + 0, (m5166d2 - m5154b2) + (i9 * mo3575x), m5165e2 + 0 + 3);
                                    this.f4991b.f6326bO.mo206a(this.f5050C, m474a3);
                                    this.f5050C.m5159a(m5166d2 - m5154b2, m5165e2 + 0, (m5166d2 - m5154b2) + i9, m5165e2 + 0 + 3);
                                    this.f4991b.f6326bO.mo206a(this.f5050C, m474a4);
                                }
                            }
                            this.f4991b.f6326bO.mo137j();
                        }
                        z15 = true;
                    }
                    C0970e mo4063h = abstractC0224s2.mo4063h(m2061f);
                    if (mo4063h != null) {
                        Rect mo4294v2 = abstractC0224s2.mo4294v();
                        if (mo4294v2 == null) {
                            mo4294v2 = this.f5049B;
                            mo4294v2.m5173a(0, 0, mo4063h.mo387m(), mo4063h.mo388l());
                        }
                        float m5167c4 = (this.f5040s.m5167c() * 0.7f) / mo4294v2.m5167c();
                        int m5166d3 = (int) (this.f5040s.m5166d() - ((mo4294v2.m5171b() * 0.5f) * m5167c4));
                        int m5165e3 = (int) (this.f5040s.m5165e() - ((mo4294v2.m5167c() * 0.5f) * m5167c4));
                        this.f5039p.m5207b(abstractC0224s2.mo4074J());
                        RectF rectF2 = this.f5050C;
                        rectF2.m5159a(m5166d3, m5165e3, m5166d3 + (mo4294v2.m5171b() * m5167c4), m5165e3 + (mo4294v2.m5167c() * m5167c4));
                        this.f4991b.f6326bO.mo193a(mo4063h, mo4294v2, rectF2, this.f5039p);
                        z15 = true;
                    }
                    if (z9) {
                        String mo3124d = abstractC0224s2.mo3124d();
                        if (m2089a) {
                            this.f4991b.f6326bO.mo199a(this.f5052T, this.f5040s.f230a + 25, this.f5040s.m5163g(), (Paint) null);
                        }
                        if (this.f4991b.f6326bO.mo158b(mo3124d, this.f4990a.f5304aC) > this.f5040s.m5171b() - 2) {
                            if (this.f4991b.f6326bO.mo158b(mo3124d, this.f4990a.f5303aB) > this.f5040s.m5171b() - 2) {
                                this.f5034i.m5221a(this.f4990a.f5302aA);
                            } else {
                                this.f5034i.m5221a(this.f4990a.f5303aB);
                            }
                        } else {
                            this.f5034i.m5221a(this.f4990a.f5304aC);
                        }
                        if (!z11) {
                            this.f5034i.m5207b(Color.m5244a(255, 0, 100, 0));
                        }
                        if (mo3091f == EnumC0225t.f1470b) {
                            this.f5034i.m5229a(255, 255, 255, 255);
                        } else if (mo3091f == EnumC0225t.f1471c || mo3091f == EnumC0225t.f1474f) {
                            if (!z11) {
                                this.f5034i.m5229a(255, 19, 101, 94);
                            } else {
                                this.f5034i.m5229a(255, 39, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_BUTTON_15, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_BUTTON_2);
                            }
                        } else if (mo3091f == EnumC0225t.f1472d) {
                            InterfaceC0303as mo5458i2 = abstractC0224s2.mo5458i();
                            if (mo5458i2 != null && mo5458i2.mo3518g() > 1) {
                                if (!z11) {
                                    this.f5034i.m5229a(255, 117, 120, 15);
                                } else {
                                    this.f5034i.m5229a(255, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_TERRESTRIAL_ANALOG, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_SATELLITE_SERVICE, 30);
                                }
                            }
                        } else if (z10) {
                            this.f5034i.m5229a(155, 255, 255, 255);
                        }
                        int mo180a = this.f4991b.f6326bO.mo180a(mo3124d, this.f5034i);
                        float m5163g = this.f5040s.m5163g() + (mo180a / 2);
                        if (z10) {
                            m5163g = this.f5040s.m5163g();
                        }
                        if (z15 && !mo3124d.contains("\n")) {
                            if (z10) {
                                m5163g = (this.f5040s.f233d - (mo180a / 2)) - 1;
                            } else {
                                m5163g = this.f5040s.f233d - 6;
                            }
                        }
                        if (z10) {
                            C0960aa.m943a(mo3124d, this.f5040s.m5164f(), m5163g, this.f5034i);
                        } else {
                            this.f4991b.f6326bO.mo182a(mo3124d, this.f5040s.m5164f(), m5163g, this.f5034i);
                        }
                    }
                    boolean z16 = false;
                    boolean z17 = false;
                    boolean z18 = false;
                    if (m2088a != null && m2088a.m2774a()) {
                        z16 = true;
                        z18 = true;
                    }
                    this.f5042u.m5172a(this.f5040s);
                    if (GameEngine.m1029au()) {
                        C0773f.m2163b(this.f5042u, 2.0f);
                    }
                    this.f4990a.m1898a(this.f5042u.f230a, this.f5042u.f231b, this.f5042u.m5171b(), this.f5042u.m5167c());
                    if (!this.f5031d && this.f5042u.m5170b((int) this.f4990a.f5376z, (int) this.f4990a.f5377A) && this.f5067ay.m5153b((int) this.f4990a.f5376z, (int) this.f4990a.f5377A)) {
                        z = true;
                        if (GameEngine.m1028av()) {
                            z17 = true;
                        }
                        if ((this.f4990a.f5392U || this.f4990a.f5380I) && this.f4990a.f5392U && this.f4990a.m1904J()) {
                            this.f4990a.f5392U = false;
                            z16 = true;
                        }
                    }
                    if (GameEngine.m1028av() && this.f4990a.f5279ac == null) {
                        if (z17) {
                            this.f5015aa = m2061f;
                            this.f5016ab = abstractC0224s2;
                            this.f5017ac = f23 + f19;
                        } else if (AbstractC0224s.m4307a(this.f5016ab, abstractC0224s2)) {
                            this.f5015aa = null;
                            this.f5016ab = null;
                        }
                    }
                    boolean z19 = false;
                    if (z16 && !z18 && this.f4991b.settingsEngine.mouseSupport && this.f4991b.m998e(2)) {
                        z19 = true;
                    }
                    if (z16) {
                        C0825g.m1903K();
                        if (abstractC0224s2.mo3152c(m2061f, z19)) {
                            z16 = false;
                        }
                        if (this.f4991b.f6339cb.m2480j()) {
                            z16 = false;
                        }
                        if (!m2070c(abstractC0224s2)) {
                            z16 = false;
                        }
                    }
                    if (z16) {
                        if (abstractC0224s2.mo3092e() == EnumC0226u.f1479a || abstractC0224s2.mo3092e() == EnumC0226u.f1481c) {
                            this.f4990a.f5279ac = null;
                            boolean z20 = false;
                            if (z18) {
                                z20 = true;
                            } else if (!abstractC0224s2.mo4052u()) {
                                z20 = true;
                            } else {
                                if (abstractC0224s2.mo4060k(m2061f)) {
                                    z20 = true;
                                } else if (this.f5015aa == m2061f && AbstractC0224s.m4307a(this.f5016ab, abstractC0224s2)) {
                                    z20 = true;
                                }
                                this.f5015aa = m2061f;
                                this.f5016ab = abstractC0224s2;
                                this.f5017ac = f23 + f19;
                            }
                            if (z20) {
                                int i10 = 1;
                                if (abstractC0224s2.mo3090g()) {
                                    if (this.f4990a.m1859a(this.f4991b)) {
                                        i10 = 5;
                                    }
                                    if (this.f4990a.m1841b(this.f4991b)) {
                                        i10 = 10;
                                    }
                                }
                                boolean z21 = false;
                                if (!z18) {
                                    boolean z22 = false;
                                    if (m2061f != null && abstractC0224s2.mo3094b(m2061f, false) != -1) {
                                        z22 = true;
                                    }
                                    if (z19 && z22) {
                                        z21 = true;
                                    }
                                }
                                if (m2089a(abstractC0224s2)) {
                                    this.f4991b.f6324bM.m2806b(C0637e.f4078l, 0.8f);
                                } else if (!m2069c && !z21) {
                                    this.f4991b.f6324bM.m2806b(C0637e.f4078l, 0.8f);
                                } else {
                                    boolean mo3090g = abstractC0224s2.mo3090g();
                                    if (mo3090g && !z21 && this.f4991b.f6312bs.m4353x() <= this.f4991b.f6312bs.m4354w()) {
                                        this.f4990a.m1840b(this.f5026al);
                                    }
                                    if (mo3090g) {
                                        if (!z21) {
                                            this.f4991b.f6324bM.m2806b(C0637e.f4074h, 0.5f);
                                        } else {
                                            this.f4991b.f6324bM.m2806b(C0637e.f4075i, 0.5f);
                                        }
                                    } else {
                                        this.f4991b.f6324bM.m2806b(C0637e.f4073g, 0.8f);
                                    }
                                    C0819c.m1929a(m2061f, abstractC0224s2, z21, false);
                                    for (int i11 = 0; i11 < i10; i11++) {
                                        SyncPacket m1790x = this.f4990a.m1790x();
                                        if (!abstractC0224s2.mo4075I()) {
                                            this.f4990a.m1865a(m1790x, abstractC0224s2);
                                        } else {
                                            this.f4990a.m1864a(m1790x, abstractC0224s2, z21);
                                        }
                                        if (z21) {
                                            m1790x.f4938g = true;
                                        }
                                        m1790x.m2332a(abstractC0224s2.mo4292z());
                                        if (!z21) {
                                            this.f4990a.m1878a(abstractC0224s2, (PointF) null, (AbstractC0244am) null, m1790x);
                                        }
                                    }
                                }
                            }
                        } else if (abstractC0224s2.mo3092e() == EnumC0226u.f1491m || abstractC0224s2.mo3092e() == EnumC0226u.f1490l || abstractC0224s2.mo3092e() == EnumC0226u.f1488j) {
                            if (z19) {
                                if (abstractC0224s2 != null && abstractC0224s2.equals(this.f4990a.f5279ac)) {
                                    this.f4990a.m1809l();
                                }
                            } else if (!m2069c) {
                                this.f4991b.f6324bM.m2806b(C0637e.f4078l, 0.8f);
                            } else {
                                C0819c.m1929a(m2061f, abstractC0224s2, false, false);
                                this.f5015aa = null;
                                this.f5016ab = null;
                                this.f4990a.f5279ac = abstractC0224s2;
                            }
                        } else if (abstractC0224s2.mo3092e() == EnumC0226u.f1482d || abstractC0224s2.mo3092e() == EnumC0226u.f1483e || abstractC0224s2.mo3092e() == EnumC0226u.f1484f || abstractC0224s2.mo3092e() == EnumC0226u.f1485g) {
                            boolean z23 = false;
                            boolean z24 = false;
                            if (abstractC0224s2.mo3092e() == EnumC0226u.f1485g) {
                                z24 = true;
                            }
                            if (z19 && z24) {
                                z23 = true;
                            }
                            if (!z23) {
                                GameEngine.m5461e("Clicked button: actionActive: " + m2069c);
                                if (!m2069c) {
                                    this.f4991b.f6324bM.m2806b(C0637e.f4078l, 0.8f);
                                } else {
                                    C0819c.m1929a(m2061f, abstractC0224s2, false, false);
                                    this.f5015aa = null;
                                    this.f5016ab = null;
                                    this.f4990a.f5279ac = abstractC0224s2;
                                }
                            } else {
                                SyncPacket m1790x2 = this.f4990a.m1790x();
                                if (!abstractC0224s2.mo4075I()) {
                                    this.f4990a.m1865a(m1790x2, abstractC0224s2);
                                } else {
                                    this.f4990a.m1864a(m1790x2, abstractC0224s2, z23);
                                }
                                m1790x2.f4938g = true;
                                m1790x2.m2332a(abstractC0224s2.mo4292z());
                            }
                        } else if (abstractC0224s2.mo3092e() == EnumC0226u.f1480b) {
                            if (m2089a(abstractC0224s2)) {
                                this.f4991b.f6324bM.m2806b(C0637e.f4078l, 0.8f);
                            } else if (!m2069c) {
                                this.f4991b.f6324bM.m2806b(C0637e.f4078l, 0.8f);
                            } else {
                                this.f4991b.f6324bM.m2806b(C0637e.f4073g, 0.8f);
                            }
                            C0819c.m1929a(m2061f, abstractC0224s2, false, false);
                            this.f5015aa = null;
                            this.f5016ab = null;
                            if (this.f4990a.f5279ac == null) {
                                this.f4990a.f5285ai = false;
                            }
                            this.f4990a.f5278aa = m2061f;
                            this.f4990a.f5279ac = abstractC0224s2;
                            this.f4990a.f5282af = 0.0f;
                            this.f4990a.f5293aq = -99.0f;
                            this.f4990a.f5294ar = -99.0f;
                            if (!this.f4990a.f5281ae) {
                                this.f4990a.f5283ag = this.f4991b.f6369cI * this.f4991b.f6470cX;
                                this.f4990a.f5284ah = this.f4991b.f6370cJ * this.f4991b.f6470cX;
                            }
                            this.f4990a.f5281ae = true;
                            this.f4991b.f6323bL.m4613e();
                        } else if (abstractC0224s2.mo3092e() == EnumC0226u.f1489k) {
                            C0819c.m1929a(m2061f, abstractC0224s2, false, false);
                            abstractC0224s2.mo4300c(m2061f);
                        } else if (abstractC0224s2.mo3092e() == EnumC0226u.f1487i) {
                            if (abstractC0224s2.mo4284C()) {
                                this.f5015aa = m2061f;
                                this.f5016ab = abstractC0224s2;
                                this.f5017ac = f23 + f19;
                                this.f4990a.f5279ac = null;
                            }
                        } else {
                            throw new RuntimeException("unknown gui action:" + abstractC0224s2.mo3092e());
                        }
                    }
                    if (this.f5016ab == abstractC0224s2) {
                        z2 = m2069c;
                    }
                }
            }
            this.f4991b.f6326bO.mo137j();
            this.f5067ay.m5146f();
        }
        if (m2061f != null && m2061f == this.f5015aa) {
            if (this.f5016ab != null) {
                boolean z25 = true;
                if (GameEngine.m1028av()) {
                    z25 = false;
                }
                boolean z26 = false;
                if (this.f5016ab.mo4052u()) {
                    z26 = true;
                }
                if (GameEngine.m1028av() && this.f5016ab.mo3089h()) {
                    z26 = true;
                }
                if (z26) {
                    boolean z27 = true;
                    if (!z2) {
                        z27 = false;
                    }
                    if (this.f4990a.m1875a(this.f5016ab, z25, this.f5015aa, !z27, true, this.f5017ac, false)) {
                        this.f5015aa = null;
                    }
                }
            }
        } else {
            this.f5015aa = null;
        }
        if (GameEngine.m1028av() && !z) {
            this.f5015aa = null;
            this.f5016ab = null;
        }
        return i2;
    }

    /* renamed from: i */
    float m2058i() {
        return (float) (C0773f.m2171b((this.f4991b.f6348cm / 14.0f) / this.f4991b.f6345cj, 25.0f * this.f4991b.f6345cj, 40.0f * this.f4991b.f6345cj) * 0.9d);
    }

    /* renamed from: a */
    void m2094a(float f, int i) {
        boolean z = true;
        if (i == 0) {
            z = true;
        }
        if (C0825g.f5354a) {
            z = false;
        }
        if (this.f4990a.f5322aX > 0) {
            if (this.f4990a.f5262f != null && this.f4990a.f5322aX == 1 && this.f4990a.f5262f.f1649cG) {
                z = false;
            }
            if (z) {
                if (this.f4990a.m1845b((int) ((this.f4991b.f6347cl - this.f4991b.f6334bW.f5489c) + 2.0f), this.f4991b.f6334bW.m1765b() + 2, (int) (this.f4991b.f6334bW.f5489c - 4.0f), (int) m2058i(), this.f5021ag, EnumC0827i.f5436c, false, Color.m5244a(140, 100, 100, 100)) && !this.f4990a.f5391T) {
                    this.f4990a.m1830d();
                    this.f4990a.m1809l();
                    this.f4990a.m1789y();
                }
            }
            PlayerData playerData = null;
            boolean z2 = false;
            this.f5068az.clear();
            AbstractC0244am abstractC0244am = null;
            AbstractC0244am[] m499a = this.f4990a.f5427bZ.m499a();
            int size = this.f4990a.f5427bZ.size();
            for (int i2 = 0; i2 < size; i2++) {
                AbstractC0244am abstractC0244am2 = m499a[i2];
                if (abstractC0244am2.f1649cG) {
                    abstractC0244am = abstractC0244am2;
                    if (this.f4990a.m1806m(abstractC0244am2)) {
                        InterfaceC0303as mo5459r = abstractC0244am2.mo5459r();
                        Integer num = (Integer) this.f5068az.get(mo5459r);
                        if (num == null) {
                            this.f5068az.put(mo5459r, 1);
                        } else {
                            this.f5068az.put(mo5459r, Integer.valueOf(num.intValue() + 1));
                        }
                        z2 = true;
                    } else {
                        playerData = abstractC0244am2.f1614bX;
                    }
                }
            }
            boolean z3 = this.f4991b.f6313bv;
            if (playerData != null && this.f4991b.f6312bs != null && playerData.m4419b(this.f4991b.f6312bs)) {
                z3 = true;
            }
            int m2059h = (int) m2059h();
            int i3 = m2059h + 2;
            int i4 = (int) (10.0f * this.f4991b.f6345cj);
            float m1765b = this.f4991b.f6334bW.m1765b() + m2059h + 30;
            float f2 = (this.f4991b.f6347cl - this.f4991b.f6351cq) + i4;
            float f3 = m1765b + 5.0f;
            if (abstractC0244am != null) {
                f3 = f3 + i3 + (i3 * i);
                if (this.f4990a.f5371t) {
                    f3 -= (2 * i3) * 0.4f;
                }
            }
            this.f5040s.m5173a((int) f2, (int) f3, (int) ((f2 + this.f4991b.f6351cq) - (i4 * 2)), (int) (f3 + m2059h));
            boolean z4 = false;
            if (!C0825g.f5357bQ) {
                if (i < 3 && !z2 && playerData != null) {
                    Paint paint = this.f4990a.f5307aF;
                    if (this.f4991b.f6312bs.m4391d(playerData)) {
                        paint = this.f4990a.f5308aG;
                    }
                    this.f4990a.m1853a(m2090a(playerData), this.f5040s, paint, paint);
                    z4 = true;
                }
                if (this.f4990a.m1799q() == 1 && abstractC0244am != null) {
                    if (abstractC0244am.m4208cq() <= 3 || (playerData != null && !z3)) {
                        String m2083a = m2083a(abstractC0244am, false);
                        if (z4) {
                            m2083a = "\n" + ("\n" + ("\n" + m2083a));
                        }
                        Paint paint2 = this.f5034i;
                        paint2.m5233a();
                        paint2.m5207b(Color.m5244a(50, 100, 100, 100));
                        this.f4990a.m1853a(m2083a, this.f5040s, this.f4990a.f5309aH, this.f4990a.f5309aH);
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public String m2090a(PlayerData playerData) {
        String str = VariableScope.nullOrMissingString;
        boolean z = false;
        if (this.f4991b.f6312bs.m4423b()) {
            z = true;
        } else if (this.f4991b.f6312bs.m4391d(playerData)) {
            str = str + this.f5022ah;
        } else if (this.f4991b.f6312bs.m4403c(playerData)) {
            str = str + this.f5023ai;
        } else {
            z = true;
        }
        if (z) {
            if (playerData == PlayerData.f1373i) {
                str = str + this.f5024aj;
            } else {
                str = str + "Team - " + playerData.getPlayerTeamName();
            }
        }
        String str2 = str + "\n";
        if (playerData.name != null) {
            str2 = str2 + playerData.name;
        }
        if (!playerData.f1319w && this.f4991b.m1095N() && playerData.isTimeOut()) {
            str2 = (str2 + "\n") + "(disconnected)";
        }
        return str2;
    }

    /* renamed from: a */
    public String m2083a(AbstractC0244am abstractC0244am, boolean z) {
        String str;
        String str2 = VariableScope.nullOrMissingString;
        if (z) {
            str2 = str2 + abstractC0244am.mo5459r().mo3522e() + "\n";
        }
        if (abstractC0244am.mo3285g() > 0.0f) {
            str = str2 + C0429b.m3844a(abstractC0244am.m4215cM(), abstractC0244am.f1637cu / abstractC0244am.f1638cv).m3834a(true, true, 3, false);
        } else {
            str = str2 + ((int) Math.ceil(abstractC0244am.f1637cu)) + "/" + ((int) abstractC0244am.f1638cv) + "\n";
        }
        if (abstractC0244am.f1643cA != 0.0f) {
            str = str + "(" + ((int) abstractC0244am.f1640cx) + "/" + ((int) abstractC0244am.f1643cA) + ")\n";
        }
        C0429b m4201dq = abstractC0244am.m4201dq();
        C0444f mo3611cz = abstractC0244am.mo3611cz();
        if (m4201dq != null) {
            mo3611cz = C0444f.m3716d(mo3611cz);
            mo3611cz.m3749a(m4201dq);
        }
        if (!mo3611cz.m3724c()) {
            Iterator it = mo3611cz.f2830b.iterator();
            while (it.hasNext()) {
                C0443e c0443e = (C0443e) it.next();
                if (c0443e.f2828b != 0.0d && !c0443e.f2827a.m3786a()) {
                    str = str + c0443e.f2827a.m3783a(c0443e.f2828b, true, false) + "\n";
                }
            }
        }
        return C0773f.m2108j(str);
    }

    /* renamed from: a */
    public static String m2086a(AbstractC0224s abstractC0224s, boolean z) {
        String str;
        AbstractC0228w abstractC0228w;
        if (z) {
            str = "\n";
        } else {
            str = " | ";
        }
        String str2 = VariableScope.nullOrMissingString;
        if (abstractC0224s instanceof AbstractC0228w) {
            if (((AbstractC0228w) abstractC0224s).mo3292K() < 1.0f) {
                GameEngine gameEngine = GameEngine.getGameEngine();
                float f = -1.0f;
                AbstractC0244am[] m499a = gameEngine.f6330bS.f5427bZ.m499a();
                int size = gameEngine.f6330bS.f5427bZ.size();
                for (int i = 0; i < size; i++) {
                    float mo3612cx = m499a[i].mo3612cx();
                    if (f == -1.0f || mo3612cx < f) {
                        f = mo3612cx;
                    }
                }
                if (f == -1.0f) {
                    f = 1.0f;
                }
                str2 = str2 + C0773f.m2117h((1.0f / ((abstractC0228w.mo3292K() * f) * 60.0f)) + 1.0E-4f) + str;
            }
        }
        return C0773f.m2182a(str2, str);
    }

    /* renamed from: a */
    public static String m2082a(AbstractC0244am abstractC0244am, boolean z, boolean z2, boolean z3) {
        String str;
        C0859b c0859b;
        float f;
        if (z2) {
            str = "\n";
        } else {
            str = " | ";
        }
        String str2 = VariableScope.nullOrMissingString;
        C0456j c0456j = null;
        C0458l c0458l = null;
        if (abstractC0244am instanceof C0456j) {
            c0456j = (C0456j) abstractC0244am;
            c0458l = c0456j.f2891x;
        }
        if (z) {
            str2 = str2 + abstractC0244am.mo5459r().mo3522e() + str;
        }
        if (c0458l == null || !c0458l.f2986aO) {
            if (!z3) {
                str2 = str2 + "HP: " + ((int) Math.ceil(abstractC0244am.f1637cu)) + "/" + ((int) abstractC0244am.f1638cv) + str;
            } else {
                str2 = str2 + "HP: " + ((int) abstractC0244am.f1638cv) + str;
            }
        }
        if (abstractC0244am.f1643cA != 0.0f) {
            if (!z3) {
                str2 = str2 + "Shield: " + ((int) abstractC0244am.f1640cx) + "/" + ((int) abstractC0244am.f1643cA) + str;
            } else {
                str2 = str2 + "Shield: " + ((int) abstractC0244am.f1643cA) + str;
            }
        }
        if (c0456j != null) {
            if (c0456j.f2892y.f2265l >= 1.0f) {
                str2 = str2 + "Armour: " + ((int) f) + str;
            }
        }
        C0429b m4201dq = abstractC0244am.m4201dq();
        float mo3376cy = abstractC0244am.mo3376cy();
        if (m4201dq != null) {
            mo3376cy += m4201dq.m3853a();
        }
        if (mo3376cy != 0.0f) {
            if (mo3376cy < 0.0f) {
                str2 = str2 + "Income: -$" + C0773f.m2213a(-mo3376cy, 1) + str;
            } else {
                str2 = str2 + "Income: +$" + C0773f.m2213a(mo3376cy, 1) + str;
            }
        }
        if (abstractC0244am instanceof AbstractC0629y) {
            AbstractC0629y abstractC0629y = (AbstractC0629y) abstractC0244am;
            if (abstractC0629y.mo2908bd() != 0.0f && !z3) {
                str2 = str2 + "Energy: " + C0773f.m2121g(abstractC0244am.f1644cB) + "/" + C0773f.m2121g(abstractC0629y.mo2908bd()) + str;
            }
            float mo2822z = abstractC0629y.mo2822z();
            if (!abstractC0629y.mo2970aR()) {
                mo2822z = 0.0f;
            }
            if (mo2822z != 0.0f) {
                str2 = str2 + "Speed: " + C0773f.m2121g(mo2822z) + str;
            }
            if (abstractC0629y.mo3067l()) {
                ArrayList m2964aX = abstractC0629y.m2964aX();
                if (m2964aX.size() > 0) {
                    String str3 = str2 + "Attack: ";
                    boolean z4 = true;
                    Iterator it = m2964aX.iterator();
                    while (it.hasNext()) {
                        C0232aa c0232aa = (C0232aa) it.next();
                        if (!z4) {
                            str3 = str3 + ", ";
                        }
                        z4 = false;
                        String str4 = str3 + C0773f.m2121g(c0232aa.f1502a);
                        if (c0232aa.f1505d > 1) {
                            str4 = str4 + "x" + c0232aa.f1505d;
                        }
                        str3 = str4 + "/" + C0773f.m2121g(c0232aa.m4277a()) + "s";
                    }
                    str2 = str3 + str;
                }
            }
            float mo2846m = abstractC0629y.mo2846m();
            if (!abstractC0629y.mo3067l()) {
                mo2846m = 0.0f;
            }
            if (mo2846m != 0.0f) {
                str2 = str2 + "Range: " + C0773f.m2121g(mo2846m) + str;
            }
            if (z3 && abstractC0629y.mo3406ck()) {
                str2 = str2 + "Upgradable" + str;
            }
        }
        if (!z3 && abstractC0244am.f1663cU > 0) {
            str2 = str2 + "Kills: " + abstractC0244am.f1663cU + str;
        }
        boolean z5 = false;
        if (GameEngine.getGameEngine().f6444bl) {
            InterfaceC0303as mo5459r = abstractC0244am.mo5459r();
            str2 = ((str2 + "\n") + "--Debug--" + str) + "name: " + mo5459r.mo3514i() + str;
            if ((mo5459r instanceof C0458l) && (c0859b = ((C0458l) mo5459r).f2949J) != null) {
                str2 = str2 + "(mod: " + C0773f.m2184a(c0859b.m1673a(), 30) + ")" + str;
            }
            if (abstractC0244am.f7166eh != 0) {
                str2 = str2 + "id: " + abstractC0244am.f7166eh + str;
            }
            if (abstractC0244am.f1648cF != 0) {
                String str5 = VariableScope.nullOrMissingString;
                for (int i = 0; i < 32; i++) {
                    if (C0429b.m3851a(abstractC0244am.f1648cF, i)) {
                        if (str5.length() > 0) {
                            str5 = str5 + ",";
                        }
                        str5 = str5 + i;
                    }
                }
                str2 = str2 + "flags: " + str5 + str;
            }
            if (abstractC0244am.f1647cE != 0) {
                str2 = str2 + "ammo: " + abstractC0244am.f1647cE + str;
            }
            if (!abstractC0244am.f1632cp) {
                str2 = (str2 + "x: " + C0773f.m2121g(abstractC0244am.f7172eo) + str) + "y: " + C0773f.m2121g(abstractC0244am.f7173ep) + str;
            }
            if (abstractC0244am.f1619cc != 0.0f || abstractC0244am.f1620cd != 0.0f) {
                str2 = str2 + "x/y speed: " + C0773f.m2121g(abstractC0244am.f1619cc) + ", " + C0773f.m2121g(abstractC0244am.f1620cd) + str;
            }
            if (!abstractC0244am.f1632cp) {
                str2 = (str2 + "height: " + C0773f.m2121g(abstractC0244am.f7174eq) + str) + "dir: " + C0773f.m2121g(abstractC0244am.f1623cg) + str;
            }
            if (abstractC0244am.f1629cm < 1.0f) {
                str2 = str2 + "built: " + C0773f.m2121g(abstractC0244am.f1629cm) + str;
            }
            if (abstractC0244am instanceof C0456j) {
                C0456j c0456j2 = (C0456j) abstractC0244am;
                str2 = (str2 + "frame: " + c0456j2.f2868a + str) + "drawLayer: " + c0456j2.f7170em + str;
                if (c0456j2.mo3600de() != null) {
                    str2 = str2 + "tags: " + c0456j2.mo3600de() + str;
                }
                if (c0456j2.f1657cO != null) {
                    str2 = str2 + "attachedTo: " + c0456j2.f1657cO.m4222cB() + str;
                }
                if (c0456j2.f1584bu != null && !c0456j2.f1584bu.f1612bV) {
                    str2 = str2 + "customTarget1: " + c0456j2.f1584bu.m4222cB() + str;
                }
                if (c0456j2.f1585bv != null && !c0456j2.f1585bv.f1612bV) {
                    str2 = str2 + "customTarget2: " + c0456j2.f1585bv.m4222cB() + str;
                }
                if (c0456j2.f1590bA != -9999) {
                    str2 = str2 + "customTimer: " + C0773f.m2117h(c0456j2.f1590bA / 1000.0f) + str;
                }
                if (c0456j2.f1586bw != null && !c0456j2.f1586bw.isEmpty()) {
                    str2 = str2 + "-- memory --: " + str + c0456j2.f1586bw.debugMemory(true, true) + str;
                }
            }
            z5 = true;
        }
        C0444f mo1748df = abstractC0244am.mo1748df();
        if (mo1748df != null && !mo1748df.m3724c()) {
            String m3735a = mo1748df.m3735a(z2, true, 10, z5, false);
            if (!m3735a.equals(VariableScope.nullOrMissingString)) {
                str2 = str2 + m3735a + str;
            }
        }
        return C0773f.m2182a(str2, str);
    }

    /* renamed from: j */
    void m2057j() {
        Iterator it = this.f5069aA.iterator();
        while (it.hasNext()) {
            ((C0809am) it.next()).f5204h = true;
        }
    }

    /* renamed from: k */
    void m2056k() {
        Iterator it = this.f5069aA.iterator();
        while (it.hasNext()) {
            ((C0809am) it.next()).m1960b();
        }
        this.f5057am = null;
        this.f5058an = 0.0f;
    }

    /* renamed from: a */
    void m2091a(int i, int i2, int i3, String str, String str2, Paint paint, float f) {
        int i4 = (int) (i3 * 2.5d);
        int i5 = (int) (40.0f * this.f4991b.f6345cj);
        int i6 = i + (i3 / 2);
        int i7 = (int) ((i2 - i5) - (35.0f * this.f4991b.f6345cj));
        this.f5070aB.m5173a(i6 - (i4 / 2), i7, i4, i5);
        this.f4990a.m1888a(this.f5070aB.f230a, this.f5070aB.f231b, this.f5070aB.f232c, this.f5070aB.f233d, VariableScope.nullOrMissingString, Color.m5244a(SlickToAndroidKeycodes.AndroidCodes.KEYCODE_STB_INPUT, 100, 100, 100), this.f4990a.f5304aC, false, (C0784h) null, (EnumC0785i) null);
        this.f5040s.m5173a(this.f5070aB.f230a, this.f5070aB.f231b, this.f5070aB.f232c, this.f5070aB.f233d);
        Rect rect = this.f5040s;
        rect.f232c = (int) (rect.f232c * f);
        this.f4991b.f6326bO.mo152c(this.f5040s, paint);
        this.f4991b.f6326bO.mo182a(str, i6, i7 + ((this.f4990a.f5304aC.m5187k() + 5.0f) * 1.0f), this.f4990a.f5304aC);
        this.f4991b.f6326bO.mo182a(str2, i6, i7 + ((this.f4990a.f5304aC.m5187k() + 5.0f) * 2.0f), this.f4990a.f5304aC);
    }

    /* renamed from: a */
    void m2093a(float f, boolean z) {
        int i;
        int i2;
        C0847a c0847a;
        float f2 = this.f4991b.f6345cj * 0.7f;
        if (GameEngine.m1029au() && f2 < 0.7d) {
            f2 = 0.7f;
        }
        int mo387m = (int) (this.f5053U.mo387m() * f2);
        int i3 = 4 + (mo387m / 2);
        int i4 = 4 + (mo387m / 2);
        if (this.f4991b.m991g(111)) {
            boolean z2 = false;
            if (!this.f4990a.f5372u) {
                z2 = this.f4990a.m1809l();
            }
            if (!z2) {
                this.f4990a.f5372u = !this.f4990a.f5372u;
            }
        }
        if (this.f4990a.f5372u) {
            this.f5029aC += 0.008f * f;
            if (this.f5029aC > 1.0f) {
                this.f5029aC = 0.0f;
            }
            this.f5033h.m5202c(150 + ((int) (100.0f * C0773f.m2110j(this.f5029aC * 180.0f))));
        } else {
            this.f5029aC = 0.0f;
            this.f5033h.m5202c(80);
        }
        this.f5043v.m5173a(i3, i4, i3 + mo387m, i4 + mo387m);
        this.f5043v.m5174a(-(mo387m / 2), -(mo387m / 2));
        if (z) {
            this.f4991b.f6326bO.mo198a(this.f5053U, this.f5043v.f230a, this.f5043v.f231b, this.f5033h, 0.0f, f2);
            if (this.f4991b.settingsEngine.newRender) {
                this.f5049B.m5173a(this.f5043v.m5166d() - 4, this.f5043v.m5165e() - 4, this.f5043v.m5166d() + 4, this.f5043v.m5165e() + 4);
                this.f5039p.m5229a(100, 0, 155, 0);
                this.f4991b.f6326bO.mo163b(this.f5049B, this.f5039p);
            }
        }
        if (GameEngine.m1029au()) {
            C0773f.m2202a(this.f5043v, 4.0f);
        }
        if (this.f4990a.f5392U && !this.f4990a.f5391T && this.f5043v.m5170b((int) this.f4990a.f5374x, (int) this.f4990a.f5375y)) {
            this.f4990a.f5392U = false;
            this.f4990a.f5372u = !this.f4990a.f5372u;
        }
        this.f4990a.m1883a(this.f5043v);
        if (this.f4991b.f6339cb.m2480j()) {
            this.f5033h.m5202c(80);
            if (this.f4991b.f6339cb.f4574v != 1) {
                this.f5033h.m5202c(200);
            }
            int i5 = (int) (this.f5055W.f6621q * this.f4991b.f6345cj * 1.6f);
            int i6 = (int) (this.f4991b.f6366cF / 2.0f);
            int m5187k = 7 + ((int) this.f4990a.f5306aE.m5187k());
            this.f4991b.f6326bO.mo182a(C0773f.m2206a(this.f4991b.f6315by / 1000), i6, m5187k, this.f4990a.f5306aE);
            int i7 = m5187k + (i5 / 2) + 10;
            int i8 = i6 + (i5 / 2) + 5;
            this.f5043v.m5173a(i8, i7, i8 + i5, i7 + i5);
            this.f5043v.m5174a((-this.f5043v.m5171b()) / 2, (-this.f5043v.m5167c()) / 2);
            if (z) {
                this.f4991b.f6326bO.mo198a(this.f5055W, this.f5043v.f230a, this.f5043v.f231b, this.f5033h, 0.0f, i5 / i);
            }
            if (this.f4990a.f5392U && !this.f4990a.f5391T && this.f5043v.m5170b((int) this.f4990a.f5374x, (int) this.f4990a.f5375y)) {
                this.f4990a.f5392U = false;
                this.f4991b.f6339cb.m2492b();
            }
            if (this.f4991b.f6450bt != 1.0f && z) {
                this.f4991b.f6326bO.mo182a("x" + this.f4991b.f6450bt, this.f5043v.m5166d() + (i5 / 2), this.f5043v.m5165e(), this.f4990a.f5304aC);
            }
            C0970e c0970e = this.f5054V;
            int i9 = (int) (c0970e.f6621q * this.f4991b.f6345cj * 1.6f);
            int i10 = i8 - (i9 + 5);
            this.f5043v.m5173a(i10, i7, i10 + i9, i7 + i9);
            this.f5043v.m5174a((-this.f5043v.m5171b()) / 2, (-this.f5043v.m5167c()) / 2);
            if (z) {
                this.f4991b.f6326bO.mo198a(c0970e, this.f5043v.f230a, this.f5043v.f231b, this.f5033h, 0.0f, i9 / i2);
            }
            if (this.f4990a.f5392U && !this.f4990a.f5391T && this.f5043v.m5170b((int) this.f4990a.f5374x, (int) this.f4990a.f5375y)) {
                this.f4990a.f5392U = false;
                this.f4991b.f6339cb.m2507a();
            }
            C0970e c0970e2 = this.f5056X;
            int i11 = (int) ((this.f4991b.f6347cl - this.f4991b.f6351cq) - (i9 + 5));
            this.f5043v.m5173a(i11, i7, i11 + i9, i7 + i9);
            this.f5043v.m5174a((-this.f5043v.m5171b()) / 2, (-this.f5043v.m5167c()) / 2);
            if (z) {
                this.f4991b.f6326bO.mo198a(c0970e2, this.f5043v.f230a, this.f5043v.f231b, this.f5033h, 0.0f, i9 / i2);
            }
            if (this.f4990a.f5392U && !this.f4990a.f5391T && this.f5043v.m5170b((int) this.f4990a.f5374x, (int) this.f4990a.f5375y) && (c0847a = this.f4991b.f6458cg) != null) {
                c0847a.m1732c();
            }
        }
        if (this.f4990a.f5372u) {
            this.f4991b.f6374cU = false;
            int m1078a = this.f4991b.m1078a(SlickToAndroidKeycodes.AndroidCodes.KEYCODE_BUTTON_3);
            this.f5040s.f230a = (int) ((this.f4991b.f6366cF / 2.0f) - (m1078a / 2));
            this.f5040s.f232c = (int) ((this.f4991b.f6366cF / 2.0f) + (m1078a / 2));
            int m1078a2 = this.f4991b.m1078a(34);
            int m1078a3 = m1078a2 + this.f4991b.m1078a(15);
            Menu m2052o = m2052o();
            int m1078a4 = this.f4991b.m1078a(50) + (m1078a3 * (1 + m2052o.size()));
            this.f5040s.f231b = (int) (this.f4991b.f6350cp - (m1078a4 / 2));
            this.f5040s.f233d = (int) (this.f4991b.f6350cp + (m1078a4 / 2));
            if (z) {
                this.f4990a.f5334bt.m2026c(this.f4991b.f6326bO, this.f5040s);
            }
            int m1078a5 = this.f5040s.f231b + this.f4991b.m1078a(40);
            int m1078a6 = this.f4991b.m1078a(152);
            int i12 = (int) ((this.f4991b.f6366cF / 2.0f) - (m1078a6 / 2));
            int m5244a = Color.m5244a(140, 100, 100, 100);
            if (this.f4990a.m1886a(i12, m1078a5, m1078a6, m1078a2, C0855a.m1714a("menus.ingame.resume", new Object[0]), EnumC0827i.f5434a, false, m5244a, this.f4990a.f5305aD, (C0784h) this.f4990a.f5332br)) {
                this.f4990a.f5392U = false;
                this.f4990a.f5397aV = 40.0f;
                this.f4990a.f5372u = false;
            }
            int i13 = m1078a5 + m1078a3;
            for (int i14 = 0; i14 < m2052o.size(); i14++) {
                MenuItem item = m2052o.getItem(i14);
                if (this.f4990a.m1886a(i12, i13, m1078a6, m1078a2, item.getTitle().toString(), EnumC0827i.f5434a, false, m5244a, this.f4990a.f5305aD, (C0784h) this.f4990a.f5332br)) {
                    m2092a(item.getItemId());
                    this.f4990a.f5392U = false;
                    this.f4990a.f5397aV = 40.0f;
                }
                i13 += m1078a3;
            }
            this.f4990a.m1883a(this.f5040s);
        }
    }

    /* renamed from: l */
    public void m2055l() {
        m2092a(20);
    }

    /* renamed from: m */
    public void m2054m() {
        m2092a(21);
    }

    /* renamed from: n */
    public void m2053n() {
        m2092a(16);
    }

    /* renamed from: a */
    void m2092a(int i) {
        InterfaceC0096f interfaceC0096f = this.f4991b.f6292ao;
        if (interfaceC0096f == null) {
            GameEngine.print("selectMenuOption: gameView==null");
            return;
        }
        ActivityC0097g mo243i = interfaceC0096f.mo243i();
        if (mo243i == null) {
            GameEngine.print("selectMenuOption: inGameActivity==null");
        } else {
            mo243i.mo116c(i);
        }
    }

    /* renamed from: o */
    Menu m2052o() {
        this.f5071aD.clear();
        InterfaceC0096f interfaceC0096f = this.f4991b.f6292ao;
        if (interfaceC0096f == null) {
            GameEngine.print("selectMenuOption: gameView==null");
            return this.f5071aD;
        }
        ActivityC0097g mo243i = interfaceC0096f.mo243i();
        if (mo243i == null) {
            GameEngine.print("selectMenuOption: inGameActivity==null");
            return this.f5071aD;
        }
        mo243i.mo4931a(this.f5071aD);
        return this.f5071aD;
    }

    /* renamed from: e */
    void m2063e(float f) {
        String str;
        int i = (int) (this.f4991b.f6368cH - (30.0f * this.f4991b.f6345cj));
        int i2 = (int) ((this.f4991b.f6347cl - this.f4991b.f6351cq) + 10.0f);
        int i3 = ((int) (this.f4991b.f6351cq - 20.0f)) / 3;
        int i4 = i3 - 5;
        for (int i5 = 0; i5 < this.f5069aA.size(); i5++) {
            C0809am c0809am = (C0809am) this.f5069aA.get(i5);
            if (c0809am.f5204h) {
                c0809am.m1957e();
                c0809am.f5204h = false;
            }
            c0809am.m1958d();
            if (this.f4991b.settingsEngine.keyboardSupport && i5 < this.f4991b.f6331bT.f4174ai.length) {
                if (this.f4991b.f6331bT.f4176ak[i5].m2774a()) {
                    c0809am.m1960b();
                    c0809am.m1959c();
                }
                if (this.f4991b.f6331bT.f4175aj[i5].m2774a()) {
                    this.f4990a.m1809l();
                    c0809am.m1962a();
                }
                if (this.f4991b.f6331bT.f4174ai[i5].m2774a()) {
                    this.f4990a.m1809l();
                    this.f4990a.m1789y();
                    c0809am.m1962a();
                }
            }
            if (this.f4991b.settingsEngine.showUnitGroups && i5 < 3) {
                if (c0809am.f5197a.size() == 0) {
                    if (this.f4990a.f5421bN) {
                        str = "Empty";
                    } else {
                        str = "(" + (i5 + 1) + ")";
                    }
                } else {
                    str = VariableScope.nullOrMissingString + c0809am.f5197a.size();
                }
                boolean z = false;
                c0809am.f5200d = C0773f.m2218a(c0809am.f5200d, 0.01f * f);
                c0809am.f5201e = C0773f.m2218a(c0809am.f5201e, 0.01f * f);
                c0809am.f5202f = C0773f.m2218a(c0809am.f5202f, 0.01f * f);
                if (this.f4990a.m1887a(i2, i, i4, (int) (31.0f * this.f4991b.f6345cj), str, EnumC0827i.f5434a, true, Color.m5244a(50, (int) (100.0f + (c0809am.f5202f * 100.0f)), (int) (100.0f + (c0809am.f5201e * 100.0f)), (int) (100.0f + (c0809am.f5200d * 100.0f)))) && this.f4990a.f5279ac == null && !this.f4990a.f5391T) {
                    z = true;
                    c0809am.f5198b += f;
                    this.f4990a.m1830d();
                    float f2 = 1.0f;
                    this.f5034i.m5233a();
                    this.f5034i.m5207b(Color.m5244a(120, 200, 0, 0));
                    if (c0809am.f5198b < 50.0f) {
                        f2 = c0809am.f5198b / 50.0f;
                        this.f5034i.m5207b(Color.m5244a((int) (150.0f + (f2 * 40.0f)), 0, 200, 0));
                        m2091a(i2, i, i4, "Select Group", "(Hold for more..)", this.f5034i, f2);
                    } else if (c0809am.f5198b < 100.0f) {
                        f2 = (c0809am.f5198b - 50.0f) / 50.0f;
                        this.f5034i.m5207b(Color.m5244a((int) (150.0f + (f2 * 40.0f)), 200, 0, 0));
                        m2091a(i2, i, i4, "Add to Group", "(Hold for more..)", this.f5034i, f2);
                    } else {
                        m2091a(i2, i, i4, "Replace Group", VariableScope.nullOrMissingString, this.f5034i, 0.0f);
                    }
                    int i6 = (int) (31.0f * this.f4991b.f6345cj);
                    this.f5040s.m5173a(i2, (int) ((i + i6) - (i6 * f2)), i2 + i4, i + i6);
                    this.f4991b.f6326bO.mo163b(this.f5040s, this.f5034i);
                }
                if (!z) {
                    if (c0809am.f5198b != 0.0f && !this.f4990a.f5380I) {
                        if (c0809am.f5198b > 100.0f) {
                            c0809am.m1960b();
                            c0809am.m1959c();
                            c0809am.f5202f = 1.0f;
                        } else if (c0809am.f5198b > 50.0f) {
                            c0809am.m1959c();
                            this.f4990a.m1809l();
                            this.f4990a.m1789y();
                            c0809am.m1962a();
                            c0809am.f5201e = 1.0f;
                        } else if (c0809am.f5197a.size() != 0) {
                            this.f4990a.m1809l();
                            this.f4990a.m1789y();
                            c0809am.m1962a();
                            c0809am.f5200d = 1.0f;
                        } else {
                            c0809am.m1960b();
                            c0809am.m1959c();
                            c0809am.f5201e = 1.0f;
                        }
                    }
                    if (!z) {
                        c0809am.f5198b = 0.0f;
                    }
                }
                i2 += i3;
            }
        }
    }

    @Override // com.corrodinggames.rts.gameFramework.AbstractC0741bq
    /* renamed from: a */
    public void mo442a(GameOutputStream gameOutputStream) {
        gameOutputStream.writeInt(this.f5069aA.size());
        Iterator it = this.f5069aA.iterator();
        while (it.hasNext()) {
            ((C0809am) it.next()).mo442a(gameOutputStream);
        }
        gameOutputStream.writeByte(0);
    }

    /* renamed from: a */
    public void m2080a(GameInputStream gameInputStream, boolean z) {
        if (!z) {
            this.f5069aA.clear();
        }
        int readInt = gameInputStream.readInt();
        int i = 0;
        while (i < readInt) {
            C0809am c0809am = new C0809am(this, i < 3);
            c0809am.m1961a(gameInputStream);
            if (!z) {
                this.f5069aA.add(c0809am);
            }
            i++;
        }
        gameInputStream.readByte();
    }
}