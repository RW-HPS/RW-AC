package com.corrodinggames.rts.game;

import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import com.corrodinggames.rts.C0067R;
import com.corrodinggames.rts.game.units.AbstractC0629y;
import com.corrodinggames.rts.gameFramework.AbstractC1155w;
import com.corrodinggames.rts.gameFramework.C0773f;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.net.GameInputStream;
import com.corrodinggames.rts.gameFramework.net.GameOutputStream;
import com.corrodinggames.rts.gameFramework.unitAction.C0970e;
import com.corrodinggames.rts.gameFramework.unitAction.InterfaceC1063y;
import com.corrodinggames.rts.gameFramework.utility.C1152y;

/* renamed from: com.corrodinggames.rts.game.l */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/l.class */
public class C0195l extends AbstractC1155w {

    /* renamed from: a */
    int f1290a;

    /* renamed from: b */
    int f1291b;

    /* renamed from: e */
    EnumC0196m f1294e;

    /* renamed from: f */
    int f1295f;

    /* renamed from: h */
    static final Rect f1297h = new Rect();

    /* renamed from: i */
    static final Rect f1298i = new Rect();

    /* renamed from: j */
    static final Paint f1299j = C1152y.m459b();

    /* renamed from: k */
    static C0970e f1300k = null;

    /* renamed from: l */
    static C0970e f1301l = null;

    /* renamed from: m */
    static C0970e f1302m = null;

    /* renamed from: n */
    static final RectF f1303n = new RectF();

    /* renamed from: c */
    int f1292c = 50;

    /* renamed from: d */
    int f1293d = 40;

    /* renamed from: g */
    int f1296g = -1;

    /* renamed from: b */
    public static void m4473b() {
        GameEngine gameEngine = GameEngine.getGameEngine();
        f1300k = gameEngine.f6374bO.mo216a(C0067R.drawable.scorch_mark, true);
        f1300k.f6619m = true;
        f1301l = gameEngine.f6374bO.mo216a(C0067R.drawable.scorch_mark_nuke, true);
        f1301l.f6619m = true;
        f1302m = gameEngine.f6374bO.mo216a(C0067R.drawable.blood_mark, true);
        f1302m.f6619m = true;
    }

    public C0195l() {
        GameEngine gameEngine = GameEngine.getGameEngine();
        m448S(-1);
        this.f1295f = gameEngine.f6358by;
    }

    /* renamed from: a */
    public static void m4477a(float f, float f2) {
        m4476a(f, f2, EnumC0196m.normal);
    }

    /* renamed from: a */
    public static void m4476a(float f, float f2, EnumC0196m enumC0196m) {
        if (!m4472b(f, f2, enumC0196m)) {
            return;
        }
        C0195l c0195l = new C0195l();
        c0195l.f7173eo = f;
        c0195l.f7174ep = f2;
        if (enumC0196m == EnumC0196m.normal) {
            c0195l.f1290a = 0;
            c0195l.f1291b = C0773f.m2195a(c0195l, 0, 3, 0);
        } else {
            c0195l.f1290a = 2;
        }
        if (c0195l.f1290a == 2) {
            c0195l.f1292c = f1301l.mo387m();
            c0195l.f1293d = f1301l.mo388l();
        }
        c0195l.f1294e = enumC0196m;
        c0195l.m4470d();
    }

    /* renamed from: a */
    public static void m4475a(AbstractC0629y abstractC0629y, int i) {
        if (!abstractC0629y.m4216cJ()) {
            EnumC0196m enumC0196m = i == 2 ? EnumC0196m.nuke : EnumC0196m.normal;
            if (!m4472b(abstractC0629y.f7173eo, abstractC0629y.f7174ep, enumC0196m)) {
                return;
            }
            C0195l c0195l = new C0195l();
            c0195l.f1290a = i;
            if (c0195l.f1290a == 2) {
                c0195l.f1292c = f1301l.mo387m();
                c0195l.f1293d = f1301l.mo388l();
            }
            c0195l.f7173eo = abstractC0629y.f7173eo;
            c0195l.f7174ep = abstractC0629y.f7174ep;
            c0195l.f1294e = enumC0196m;
            c0195l.f1291b = C0773f.m2195a(c0195l, 0, 3, 0);
            c0195l.m4470d();
        }
    }

    /* renamed from: b */
    public static boolean m4472b(float f, float f2, EnumC0196m enumC0196m) {
        int i = 0;
        int i2 = 0;
        int i3 = 25;
        if (enumC0196m == EnumC0196m.nuke) {
            i3 = 45;
        }
        AbstractC1155w[] m515a = AbstractC1155w.f7177er.m515a();
        int size = AbstractC1155w.f7177er.size();
        for (int i4 = 0; i4 < size; i4++) {
            AbstractC1155w abstractC1155w = m515a[i4];
            if (abstractC1155w instanceof C0195l) {
                C0195l c0195l = (C0195l) abstractC1155w;
                if (C0773f.m2152c(c0195l.f7173eo - f) < i3 && C0773f.m2152c(c0195l.f7174ep - f2) < i3 && c0195l.f1294e == enumC0196m) {
                    i++;
                    if (C0773f.m2152c(c0195l.f7173eo - f) < 5 && C0773f.m2152c(c0195l.f7174ep - f2) < 5) {
                        i2++;
                    }
                }
            }
        }
        if (i >= 3 || i2 >= 1) {
            return false;
        }
        return true;
    }

    @Override // com.corrodinggames.rts.gameFramework.AbstractC1155w
    /* renamed from: a */
    public boolean mo440a(GameEngine gameEngine) {
        return false;
    }

    @Override // com.corrodinggames.rts.gameFramework.AbstractC1155w
    /* renamed from: f */
    public boolean mo433f(float f) {
        return false;
    }

    @Override // com.corrodinggames.rts.gameFramework.AbstractC1155w
    /* renamed from: c */
    public boolean mo438c(float f) {
        return true;
    }

    /* renamed from: c */
    public RectF m4471c() {
        f1303n.f234a = this.f7173eo - (this.f1292c * 0.5f);
        f1303n.f236c = this.f7173eo + (this.f1292c * 0.5f);
        f1303n.f235b = this.f7174ep - (this.f1293d * 0.5f);
        f1303n.f237d = this.f7174ep + (this.f1293d * 0.5f);
        return f1303n;
    }

    /* renamed from: a */
    public void m4474a(InterfaceC1063y interfaceC1063y, int i, int i2, float f) {
        int i3;
        int i4 = this.f1291b * this.f1292c;
        C0970e c0970e = null;
        int i5 = this.f1292c;
        int i6 = this.f1293d;
        if (this.f1290a == 0) {
            c0970e = f1300k;
        } else if (this.f1290a == 1) {
            c0970e = f1302m;
        } else if (this.f1290a == 2) {
            c0970e = f1301l;
        }
        Rect rect = f1297h;
        Rect rect2 = f1298i;
        rect2.f230a = i4;
        rect2.f231b = 0;
        rect2.f232c = i4 + i5;
        rect2.f233d = 0 + i6;
        int i7 = ((int) this.f7173eo) - i;
        int i8 = i5 >> 1;
        int i9 = i6 >> 1;
        float f2 = i7 - i8;
        rect.f230a = (int) (f2 * f);
        rect.f231b = (int) (((((int) this.f7174ep) - i2) - i9) * f);
        rect.f232c = (int) ((i7 + i8) * f);
        rect.f233d = (int) ((i3 + i9) * f);
        interfaceC1063y.mo159b(c0970e, rect2, rect, f1299j);
    }

    /* renamed from: d */
    private void m4470d() {
        GameEngine.getGameEngine().f6371bL.m4648a(this);
    }

    @Override // com.corrodinggames.rts.gameFramework.AbstractC1155w
    /* renamed from: e */
    public void mo434e(float f) {
    }

    @Override // com.corrodinggames.rts.gameFramework.AbstractC1155w
    /* renamed from: a */
    public void mo445a(float f, boolean z) {
    }

    @Override // com.corrodinggames.rts.gameFramework.AbstractC1155w
    /* renamed from: d */
    public void mo437d(float f) {
    }

    @Override // com.corrodinggames.rts.gameFramework.AbstractC1155w
    /* renamed from: a */
    public void mo446a(float f) {
    }

    @Override // com.corrodinggames.rts.gameFramework.AbstractC1155w, com.corrodinggames.rts.gameFramework.AbstractC0741bq
    /* renamed from: a */
    public void mo442a(GameOutputStream gameOutputStream) {
        gameOutputStream.writeFloat(this.f7173eo);
        gameOutputStream.writeFloat(this.f7174ep);
        gameOutputStream.writeInt(this.f1290a);
        gameOutputStream.writeInt(this.f1291b);
        gameOutputStream.writeInt(this.f1292c);
        gameOutputStream.writeInt(this.f1293d);
        gameOutputStream.writeEnum(this.f1294e);
        gameOutputStream.writeInt(this.f1295f);
        super.mo442a(gameOutputStream);
    }

    @Override // com.corrodinggames.rts.gameFramework.AbstractC1155w
    /* renamed from: a */
    public void mo441a(GameInputStream gameInputStream) {
        this.f7173eo = gameInputStream.readFloat();
        this.f7174ep = gameInputStream.readFloat();
        this.f1290a = gameInputStream.readInt();
        this.f1291b = gameInputStream.readInt();
        this.f1292c = gameInputStream.readInt();
        this.f1293d = gameInputStream.readInt();
        if (gameInputStream.m1311b() >= 87) {
            this.f1294e = (EnumC0196m) gameInputStream.m1309b(EnumC0196m.class);
            this.f1295f = gameInputStream.readInt();
        } else {
            this.f1294e = this.f1290a == 2 ? EnumC0196m.nuke : EnumC0196m.normal;
            if (this.f1290a == 2) {
                this.f1292c = f1301l.mo387m();
                this.f1293d = f1301l.mo388l();
            }
        }
        super.mo441a(gameInputStream);
    }
}