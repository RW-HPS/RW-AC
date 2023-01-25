package com.corrodinggames.rts.gameFramework.unitAction;

import android.graphics.Bitmap;
import com.corrodinggames.rts.game.EnumC0198o;
import com.corrodinggames.rts.game.PlayerData;
import com.corrodinggames.rts.gameFramework.C0742br;
import com.corrodinggames.rts.gameFramework.EnumC1100u;
import com.corrodinggames.rts.gameFramework.GameEngine;
import java.io.IOException;

/* renamed from: com.corrodinggames.rts.gameFramework.m.h */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/m/h.class */
public class C0973h extends C0970e {

    /* renamed from: x */
    public static C0964ae f6649x;

    /* renamed from: y */
    public static C0964ae f6650y;

    /* renamed from: z */
    public static C0964ae f6651z;

    /* renamed from: A */
    public static boolean f6652A;

    /* renamed from: B */
    boolean f6653B = false;

    /* renamed from: C */
    boolean f6654C = false;

    /* renamed from: H */
    private C0970e f6655H;

    /* renamed from: I */
    private C0970e f6656I;

    /* renamed from: D */
    int f6657D;

    /* renamed from: E */
    int f6658E;

    /* renamed from: F */
    EnumC0198o f6659F;

    /* renamed from: G */
    public static float f6660G;

    /* renamed from: C */
    public static synchronized void m889C() {
        if (f6652A) {
            return;
        }
        try {
            GameEngine.m5460e("Loading team shaders...");
            f6649x = new C0974i("assets/shaders/pureGreenTeamColor.frag", true);
            f6649x.m930a("teamColor", -1);
            f6649x.mo883c();
            f6650y = new C0974i("assets/shaders/hueAddTeamColor.frag", false);
            f6650y.m932a("teamColorAmount", 0.15f);
            f6650y.m930a("teamColor", -1);
            f6650y.mo883c();
            f6651z = new C0974i("assets/shaders/hueShiftTeamColor.frag", false);
            f6651z.m930a("teamColor", -1);
            f6651z.mo883c();
            f6652A = true;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: D */
    public void m888D() {
        if (!f6652A) {
            m889C();
        }
    }

    @Override // com.corrodinggames.rts.gameFramework.unitAction.C0970e
    /* renamed from: a */
    public String mo65a() {
        if (this.f6655H == null) {
            return "LazyColoring (error sourceBitmap==null)";
        }
        return "LazyColoring(" + this.f6658E + "):" + this.f6655H.mo65a();
    }

    public C0973h(C0970e c0970e, int i, EnumC0198o enumC0198o, int i2) {
        if (c0970e == null) {
            throw new RuntimeException("baseImage==null");
        }
        this.f6655H = c0970e;
        this.f6657D = i;
        this.f6659F = enumC0198o;
        this.f6658E = i2;
        this.f6655H.mo393a(this);
        this.f6617k = null;
    }

    /* renamed from: c */
    public void m887c(boolean z) {
        if (GameEngine.m1024az()) {
            if (z) {
            }
            m888D();
            if (this.f6659F == EnumC0198o.f1382b) {
                mo903a(f6650y);
            } else if (this.f6659F == EnumC0198o.f1384d) {
                mo903a(f6651z);
            } else {
                mo903a(f6649x);
            }
            this.f6656I = this.f6655H;
            this.f6654C = true;
        } else if (this.f6655H.mo395A()) {
            GameEngine.m5460e("Lazy loaded bitmap using errored image: " + this.f6655H.mo65a());
            this.f6656I = this.f6655H;
        } else {
            if (z) {
                try {
                    GameEngine.m5460e("Loading in lazy loaded bitmap:" + this.f6655H.mo65a() + " team:" + this.f6658E);
                } catch (OutOfMemoryError e) {
                    GameEngine.m5460e("Colouring failed with OOM");
                    GameEngine.m1068a(EnumC1100u.gameImageColor, e);
                    this.f6656I = GameEngine.getGameEngine().f6326bO.mo129r();
                    return;
                }
            }
            long m2440a = C0742br.m2440a();
            this.f6655H.mo54i();
            this.f6656I = this.f6655H.mo55h();
            this.f6656I.mo53j();
            C0970e[] c0970eArr = {this.f6656I};
            int[] iArr = {this.f6657D};
            int[] iArr2 = {this.f6658E};
            long m2440a2 = C0742br.m2440a();
            if (this.f6659F == EnumC0198o.f1382b) {
                PlayerData.m4409b(this.f6655H, c0970eArr, iArr);
            } else if (this.f6659F == EnumC0198o.f1384d) {
                PlayerData.m4428a(this.f6655H, c0970eArr, iArr, iArr2);
            } else {
                PlayerData.m4429a(this.f6655H, c0970eArr, iArr);
            }
            double m2438a = C0742br.m2438a(m2440a2);
            this.f6656I.mo49p();
            this.f6656I.mo46s();
            this.f6655H.mo48q();
            this.f6655H = null;
            double m2438a2 = C0742br.m2438a(m2440a);
            if (m2438a2 > 1.0d) {
                GameEngine.m5460e((this.f6659F == EnumC0198o.f1381a ? "Standard " : "Hue ") + "Colouring took:" + C0742br.m2439a(m2438a2) + " (" + C0742br.m2439a(m2438a) + ")");
            }
            f6660G = (float) (f6660G + m2438a2);
        }
    }

    @Override // com.corrodinggames.rts.gameFramework.unitAction.C0970e
    /* renamed from: b */
    public Bitmap mo391b() {
        if (this.f6654C && !GameEngine.m1024az()) {
            GameEngine.m5460e("Team shader coloring now disabled. Recoloring image: " + this.f6655H.mo65a());
            this.f6653B = false;
            this.f6654C = false;
            mo903a((C0964ae) null);
        }
        if (!this.f6653B) {
            m887c(true);
            this.f6653B = true;
        }
        return this.f6656I.f6617k;
    }

    @Override // com.corrodinggames.rts.gameFramework.unitAction.C0970e
    /* renamed from: c */
    public C0970e mo390c() {
        if (this.f6654C && !GameEngine.m1024az()) {
            GameEngine.m5460e("Team shader coloring now disabled. Recoloring image: " + this.f6655H.mo65a());
            this.f6653B = false;
            this.f6654C = false;
            mo903a((C0964ae) null);
        }
        if (!this.f6653B) {
            if (f6660G > 60.0f) {
            }
            m887c(true);
            this.f6653B = true;
        }
        if (this.f6656I == null) {
            throw new RuntimeException("coloredBitmap==null");
        }
        return this.f6656I;
    }

    @Override // com.corrodinggames.rts.gameFramework.unitAction.C0970e
    /* renamed from: w */
    public void mo384w() {
        if (!this.f6653B) {
            m887c(false);
            this.f6653B = true;
        }
    }

    @Override // com.corrodinggames.rts.gameFramework.unitAction.C0970e
    /* renamed from: u */
    public int mo386u() {
        if ((!this.f6653B) & (this.f6655H != null)) {
            return this.f6655H.mo386u();
        }
        return super.mo386u();
    }
}