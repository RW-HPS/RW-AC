package com.corrodinggames.rts.gameFramework.p043k;

import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.Rect;
import com.corrodinggames.rts.game.p012b.C0173b;
import com.corrodinggames.rts.game.p012b.C0178e;
import com.corrodinggames.rts.game.units.AbstractC0244am;
import com.corrodinggames.rts.gameFramework.GameEngine;
import java.util.LinkedList;

/* renamed from: com.corrodinggames.rts.gameFramework.k.f */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/k/f.class */
public class C0937f extends C0942k {

    /* renamed from: a */
    AbstractC0934c f6158a;

    /* renamed from: b */
    C0938g f6159b;

    /* renamed from: c */
    static Paint f6160c = new Paint();

    /* renamed from: d */
    static Point f6161d = new Point();

    public C0937f(C0943l c0943l, boolean z) {
        super(c0943l, z);
        this.f6158a = new C0939h(this);
    }

    @Override // com.corrodinggames.rts.gameFramework.p043k.C0942k
    /* renamed from: a */
    public AbstractC0934c mo1195a(AbstractC0244am abstractC0244am) {
        if (mo1196a() != null) {
            return this.f6158a;
        }
        return null;
    }

    @Override // com.corrodinggames.rts.gameFramework.p043k.C0942k
    /* renamed from: a */
    public LinkedList mo1196a() {
        return super.mo1196a();
    }

    @Override // com.corrodinggames.rts.gameFramework.p043k.C0942k
    /* renamed from: b */
    public boolean mo1188b() {
        return true;
    }

    @Override // com.corrodinggames.rts.gameFramework.p043k.C0942k
    /* renamed from: a */
    public boolean mo1191a(C0942k c0942k) {
        if (this == c0942k) {
            return true;
        }
        if (!(c0942k instanceof C0937f)) {
            return false;
        }
        C0937f c0937f = (C0937f) c0942k;
        if (this.f6196l != c0937f.f6196l || this.f6197m != c0937f.f6197m || this.f6199o != c0937f.f6199o) {
            return false;
        }
        return true;
    }

    @Override // com.corrodinggames.rts.gameFramework.p043k.C0942k
    /* renamed from: c */
    protected boolean mo1187c() {
        return this.f6208x != null;
    }

    /* renamed from: a */
    public final byte m1226a(int i, int i2) {
        if (this.f6159b == null) {
            return (byte) -1;
        }
        return this.f6159b.m1224a(i, i2);
    }

    /* renamed from: a */
    public static final void m1227a(byte b, Point point) {
        int i = 0;
        int i2 = 0;
        byte b2 = (byte) (b - 1);
        if (b2 == 0) {
            i = 0 + 1;
        }
        if (b2 == 1) {
            i++;
            i2 = 0 + 1;
        }
        if (b2 == 2) {
            i2++;
        }
        if (b2 == 3) {
            i2++;
            i--;
        }
        if (b2 == 4) {
            i--;
        }
        if (b2 == 5) {
            i--;
            i2--;
        }
        if (b2 == 6) {
            i2--;
        }
        if (b2 == 7) {
            i2--;
            i++;
        }
        point.f224a = i;
        point.f225b = i2;
    }

    /* renamed from: d */
    public void m1225d() {
        int i;
        int i2;
        int i3;
        GameEngine gameEngine = GameEngine.getGameEngine();
        C0173b c0173b = gameEngine.f6371bL;
        Rect rect = new Rect();
        float f = gameEngine.f6408cw;
        float f2 = gameEngine.f6409cx;
        float f3 = gameEngine.f6412cA;
        float f4 = gameEngine.f6413cB;
        C0178e c0178e = gameEngine.f6371bL.f803u;
        int i4 = (int) ((f * c0173b.f800r) - 1.0f);
        if (i4 < 0) {
            i4 = 0;
        }
        int i5 = (int) ((f2 * c0173b.f801s) - 1.0f);
        if (i5 < 0) {
            i5 = 0;
        }
        int i6 = (int) (((f + f3) * c0173b.f800r) + 1.0f);
        if (i6 > c0173b.f812C - 1) {
            i6 = c0173b.f812C - 1;
        }
        int i7 = (int) (((f2 + f4) * c0173b.f801s) + 1.0f);
        if (i7 > c0173b.f813D - 1) {
            i7 = c0173b.f813D - 1;
        }
        for (int i8 = i4; i8 < i6 + 1; i8++) {
            for (int i9 = i5; i9 < i7 + 1; i9++) {
                if (c0178e.m4570a(i8, i9) != null) {
                    int i10 = i8 * c0173b.f796n;
                    int i11 = i9 * c0173b.f797o;
                    rect.m5166a(i10, i11, i10 + c0173b.f796n, i11 + c0173b.f797o);
                    rect.m5167a((int) (-f), (int) (-f2));
                    boolean m5163b = rect.m5163b((int) (gameEngine.f6378bS.f5285x / gameEngine.f6435cX), (int) (gameEngine.f6378bS.f5286y / gameEngine.f6435cX));
                    int i12 = 0;
                    if (50 == -1) {
                        i = 255;
                    } else {
                        i = 50 * 2;
                    }
                    if (0 == -1) {
                        i2 = 255;
                    } else {
                        i2 = 0 * 2;
                    }
                    if (0 == -1) {
                        i3 = 255;
                    } else {
                        if (0 != 0) {
                            i12 = 0 + 30;
                        }
                        i3 = i12 * 2;
                    }
                    f6160c.m5222a(128, i, i2, i3);
                    m1227a(m1226a(i8, i9), f6161d);
                    float f5 = (i10 + c0173b.f798p) - f;
                    float f6 = (i11 + c0173b.f799q) - f2;
                    gameEngine.f6374bO.mo226a(f5, f6, f5 + (f6161d.f224a * (c0173b.f796n - 3)) + 1.0f, f6 + (f6161d.f225b * (c0173b.f797o - 3)) + 1.0f, f6160c);
                    if (m5163b) {
                    }
                }
            }
        }
    }
}