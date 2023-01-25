package com.corrodinggames.rts.game.p012b;

import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import com.corrodinggames.rts.game.C0195l;
import com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope;
import com.corrodinggames.rts.gameFramework.AbstractC1155w;
import com.corrodinggames.rts.gameFramework.C0742br;
import com.corrodinggames.rts.gameFramework.C0773f;
import com.corrodinggames.rts.gameFramework.EnumC1100u;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.p037f.C0825g;
import com.corrodinggames.rts.gameFramework.unitAction.C0966ag;
import com.corrodinggames.rts.gameFramework.unitAction.C0970e;
import com.corrodinggames.rts.gameFramework.unitAction.C1064z;
import com.corrodinggames.rts.gameFramework.unitAction.InterfaceC1063y;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: com.corrodinggames.rts.game.b.c */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/b/c.class */
public final class C0176c {

    /* renamed from: f */
    int f861f;

    /* renamed from: g */
    int f862g;

    /* renamed from: h */
    int f863h;

    /* renamed from: i */
    int f864i;

    /* renamed from: j */
    int f865j;

    /* renamed from: k */
    int f866k;

    /* renamed from: l */
    float f867l;

    /* renamed from: n */
    boolean f869n;

    /* renamed from: a */
    int f856a = 7;

    /* renamed from: b */
    public C0970e f857b = null;

    /* renamed from: c */
    public InterfaceC1063y f858c = null;

    /* renamed from: d */
    C0177d[][] f859d = null;

    /* renamed from: e */
    public C0966ag f860e = new C0966ag();

    /* renamed from: m */
    float f868m = 1.0f;

    /* renamed from: o */
    Rect f870o = new Rect();

    /* renamed from: p */
    int f871p = 0;

    /* renamed from: a */
    public void m4595a() {
        GameEngine gameEngine = GameEngine.getGameEngine();
        this.f868m = m4576g();
        if (this.f868m > 1.0f) {
        }
        this.f864i = (int) (this.f863h / this.f868m);
        this.f866k = (int) (this.f865j / this.f868m);
        this.f867l = 1.0f / this.f866k;
        this.f861f = gameEngine.f6406cu - (this.f864i / 2);
        this.f862g = gameEngine.f6407cv - (this.f864i / 2);
        float f = 1.0f / 20;
        this.f861f = ((int) (this.f861f * f)) * 20;
        this.f862g = ((int) (this.f862g * f)) * 20;
        for (int i = 0; i < this.f856a; i++) {
            for (int i2 = 0; i2 < this.f856a; i2++) {
                C0177d c0177d = this.f859d[i][i2];
                c0177d.f882k = true;
                c0177d.f885n = false;
            }
        }
    }

    /* renamed from: b */
    public void m4587b() {
        for (int i = 0; i < this.f856a; i++) {
            for (int i2 = 0; i2 < this.f856a; i2++) {
                C0177d c0177d = this.f859d[i][i2];
                c0177d.f880i = i;
                c0177d.f881j = i2;
            }
        }
    }

    /* renamed from: a */
    public void m4593a(int i) {
        C0177d[] c0177dArr = new C0177d[this.f856a];
        if (i > 0) {
            for (int i2 = 0; i2 < this.f856a; i2++) {
                c0177dArr[i2] = this.f859d[i2][0];
            }
            for (int i3 = 1; i3 < this.f856a; i3++) {
                for (int i4 = 0; i4 < this.f856a; i4++) {
                    this.f859d[i4][i3 - 1] = this.f859d[i4][i3];
                }
            }
            for (int i5 = 0; i5 < this.f856a; i5++) {
                this.f859d[i5][this.f856a - 1] = c0177dArr[i5];
            }
            for (int i6 = 0; i6 < this.f856a; i6++) {
                this.f859d[i6][this.f856a - 1].f882k = true;
            }
        } else {
            for (int i7 = 0; i7 < this.f856a; i7++) {
                c0177dArr[i7] = this.f859d[i7][this.f856a - 1];
            }
            for (int i8 = this.f856a - 2; i8 >= 0; i8--) {
                for (int i9 = 0; i9 < this.f856a; i9++) {
                    this.f859d[i9][i8 + 1] = this.f859d[i9][i8];
                }
            }
            for (int i10 = 0; i10 < this.f856a; i10++) {
                this.f859d[i10][0] = c0177dArr[i10];
            }
            for (int i11 = 0; i11 < this.f856a; i11++) {
                this.f859d[i11][0].f882k = true;
            }
        }
        m4587b();
    }

    /* renamed from: b */
    public void m4586b(int i) {
        C0177d[] c0177dArr = new C0177d[this.f856a];
        if (i > 0) {
            for (int i2 = 0; i2 < this.f856a; i2++) {
                c0177dArr[i2] = this.f859d[0][i2];
            }
            for (int i3 = 1; i3 < this.f856a; i3++) {
                for (int i4 = 0; i4 < this.f856a; i4++) {
                    this.f859d[i3 - 1][i4] = this.f859d[i3][i4];
                }
            }
            for (int i5 = 0; i5 < this.f856a; i5++) {
                this.f859d[this.f856a - 1][i5] = c0177dArr[i5];
            }
            for (int i6 = 0; i6 < this.f856a; i6++) {
                this.f859d[this.f856a - 1][i6].f882k = true;
            }
        } else {
            for (int i7 = 0; i7 < this.f856a; i7++) {
                c0177dArr[i7] = this.f859d[this.f856a - 1][i7];
            }
            for (int i8 = this.f856a - 2; i8 >= 0; i8--) {
                for (int i9 = 0; i9 < this.f856a; i9++) {
                    this.f859d[i8 + 1][i9] = this.f859d[i8][i9];
                }
            }
            for (int i10 = 0; i10 < this.f856a; i10++) {
                this.f859d[0][i10] = c0177dArr[i10];
            }
            for (int i11 = 0; i11 < this.f856a; i11++) {
                this.f859d[0][i11].f882k = true;
            }
        }
        m4587b();
    }

    /* renamed from: a */
    public C0177d m4592a(int i, int i2) {
        if (i < 0 || i >= this.f856a || i2 < 0 || i2 >= this.f856a || this.f859d == null) {
            return null;
        }
        return this.f859d[i][i2];
    }

    /* renamed from: a */
    public void m4589a(int i, int i2, boolean z) {
        C0173b c0173b = GameEngine.getGameEngine().f6371bL;
        int i3 = c0173b.f796n;
        int i4 = c0173b.f797o;
        int i5 = i * i3;
        int i6 = i2 * i4;
        m4591a((i5 - this.f861f) - i3, (i6 - this.f862g) - i4, 3 * i3, 3 * i4, z);
    }

    /* renamed from: c */
    public void m4583c() {
        if (this.f859d != null) {
            for (int i = 0; i < this.f856a; i++) {
                for (int i2 = 0; i2 < this.f856a; i2++) {
                    this.f859d[i][i2].f882k = true;
                }
            }
        }
    }

    /* renamed from: a */
    public void m4591a(int i, int i2, int i3, int i4, boolean z) {
        C0177d m4592a;
        C0177d m4592a2;
        C0177d m4592a3;
        int i5 = (int) (i * this.f867l);
        int i6 = (int) (i2 * this.f867l);
        C0177d m4592a4 = m4592a(i5, i6);
        if (m4592a4 != null) {
            if (z) {
                m4592a4.f883l = true;
            } else {
                m4592a4.f882k = true;
            }
            boolean z2 = false;
            boolean z3 = false;
            if (i + i3 >= (m4592a4.f880i * this.f866k) + this.f864i) {
                z2 = true;
            }
            if (i2 + i4 >= (m4592a4.f881j * this.f866k) + this.f864i) {
                z3 = true;
            }
            if (z2 && (m4592a3 = m4592a(i5 + 1, i6)) != null) {
                if (z) {
                    m4592a3.f883l = true;
                } else {
                    m4592a3.f882k = true;
                }
            }
            if (z3 && (m4592a2 = m4592a(i5, i6 + 1)) != null) {
                if (z) {
                    m4592a2.f883l = true;
                } else {
                    m4592a2.f882k = true;
                }
            }
            if (z2 && z3 && (m4592a = m4592a(i5 + 1, i6 + 1)) != null) {
                if (z) {
                    m4592a.f883l = true;
                } else {
                    m4592a.f882k = true;
                }
            }
        }
    }

    /* renamed from: a */
    public void m4588a(C0195l c0195l) {
        RectF m4471c = c0195l.m4471c();
        for (int i = 0; i < this.f856a; i++) {
            for (int i2 = 0; i2 < this.f856a; i2++) {
                if (this.f859d != null) {
                    C0177d c0177d = this.f859d[i][i2];
                    if (C0773f.m2201a(c0177d.m4574b(), m4471c)) {
                        boolean z = this.f868m != 1.0f;
                        if (z) {
                        }
                        c0195l.m4474a(c0177d.f872a, c0177d.m4573c(), c0177d.m4572d(), this.f868m);
                        c0177d.f875d.mo49p();
                        if (z) {
                        }
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public void m4590a(int i, int i2, InterfaceC1063y interfaceC1063y) {
        C0177d c0177d = this.f859d[i][i2];
        boolean z = this.f868m != 1.0f;
        if (z) {
        }
        Rect m4574b = c0177d.m4574b();
        C0773f.m2202a(m4574b, 95.0f);
        AbstractC1155w[] m515a = AbstractC1155w.f7177er.m515a();
        int size = AbstractC1155w.f7177er.size();
        for (int i3 = 0; i3 < size; i3++) {
            AbstractC1155w abstractC1155w = m515a[i3];
            if (abstractC1155w instanceof C0195l) {
                C0195l c0195l = (C0195l) abstractC1155w;
                if (m4574b.m5163b((int) c0195l.f7173eo, (int) c0195l.f7174ep)) {
                    c0195l.m4474a(interfaceC1063y, c0177d.m4573c(), c0177d.m4572d(), this.f868m);
                }
            }
        }
        if (z) {
        }
    }

    /* renamed from: b */
    public void m4584b(int i, int i2, InterfaceC1063y interfaceC1063y) {
        GameEngine gameEngine = GameEngine.getGameEngine();
        C0173b c0173b = gameEngine.f6371bL;
        if (gameEngine.f6378bS.m1908F()) {
            int i3 = this.f861f + (i * this.f866k);
            int i4 = this.f862g + (i2 * this.f866k);
            int i5 = this.f864i;
            int i6 = this.f864i;
            int i7 = c0173b.f803u.f905n;
            int i8 = c0173b.f803u.f906o;
            if (((int) (i3 * c0173b.f800r)) < 0) {
            }
            if (((int) (i4 * c0173b.f801s)) < 0) {
            }
            if (((int) ((i3 + i5) * c0173b.f800r)) > i7 - 1) {
                int i9 = i7 - 1;
            }
            if (((int) ((i4 + i6) * c0173b.f801s)) > i8 - 1) {
                int i10 = i8 - 1;
            }
            if (this.f868m < 0.4d) {
                return;
            }
            boolean z = this.f868m != 1.0f;
            if (z) {
                interfaceC1063y.mo138i();
                interfaceC1063y.mo229a(this.f868m, this.f868m);
            }
            if (z) {
                interfaceC1063y.mo137j();
            }
        }
    }

    /* renamed from: b */
    public void m4585b(int i, int i2) {
        C0177d c0177d = C0173b.f847al.f859d[i][i2];
        GameEngine gameEngine = GameEngine.getGameEngine();
        C0173b c0173b = gameEngine.f6371bL;
        c0177d.f885n = true;
        this.f858c.mo167b(-16777216);
        C0970e c0970e = gameEngine.f6382bW.f5499J;
        if (c0970e != null) {
            Rect rect = new Rect();
            RectF rectF = new RectF();
            rect.m5166a((int) (((this.f861f + (i * this.f866k)) / (c0173b.f796n * c0173b.f812C)) * c0970e.f6622p), (int) (((this.f862g + (i2 * this.f866k)) / (c0173b.f797o * c0173b.f813D)) * c0970e.f6623q), (int) (((this.f861f + ((i + 1) * this.f866k)) / (c0173b.f796n * c0173b.f812C)) * c0970e.f6622p), (int) (((this.f862g + ((i2 + 1) * this.f866k)) / (c0173b.f797o * c0173b.f813D)) * c0970e.f6623q));
            rectF.m5152a(0.0f, 0.0f, this.f863h, this.f863h);
            this.f858c.mo193a(c0970e, rect, rectF, this.f860e);
        }
        this.f858c.mo131p();
        if (GameEngine.f6330aW) {
            c0177d.f872a.mo218a(0, PorterDuff.Mode.CLEAR);
        }
        c0177d.f872a.mo160b(this.f857b, 0.0f, 0.0f, (Paint) null);
        c0177d.f875d.mo49p();
    }

    /* renamed from: c */
    public void m4581c(int i, int i2) {
        m4580c(i, i2, this.f858c);
    }

    /* renamed from: c */
    public void m4580c(int i, int i2, InterfaceC1063y interfaceC1063y) {
        C0177d c0177d = C0173b.f847al.f859d[i][i2];
        GameEngine gameEngine = GameEngine.getGameEngine();
        C0173b c0173b = gameEngine.f6371bL;
        boolean z = false;
        if (gameEngine.settingsEngine.renderFancyWater) {
            z = true;
        }
        if (GameEngine.m1106C() || GameEngine.m1105D()) {
            z = true;
        }
        if (z) {
            interfaceC1063y.mo218a(0, PorterDuff.Mode.CLEAR);
        } else {
            boolean z2 = false;
            if (GameEngine.m1106C()) {
                z2 = true;
            }
            if (GameEngine.f6331aX) {
                z2 = true;
            }
            if (C0825g.f5413bO) {
            }
            if (c0173b.f814E) {
            }
            if (z2) {
                interfaceC1063y.mo167b(-16777216);
            }
        }
        if (GameEngine.f6331aX) {
            interfaceC1063y.mo218a(0, PorterDuff.Mode.CLEAR);
        }
        int i3 = this.f861f + (i * this.f866k);
        int i4 = this.f862g + (i2 * this.f866k);
        boolean z3 = false;
        boolean z4 = false;
        if (!c0173b.f803u.f914w) {
            z3 = true;
        }
        if (c0173b.f814E) {
            z4 = true;
        }
        if (C0173b.f786d) {
            z3 = false;
            z4 = false;
        }
        if (z3) {
            interfaceC1063y.mo173a(true);
        }
        c0173b.f803u.m4568a(interfaceC1063y, i3, i4, i3, i4, this.f864i, this.f864i, this.f868m, this.f868m, c0173b.f814E, false, false);
        if (c0173b.f804v != null) {
            if (z3 && c0173b.f804v.f914w) {
                interfaceC1063y.mo142f();
                GameEngine.m5777e("Ending blit early");
            }
            c0173b.f804v.m4568a(interfaceC1063y, i3, i4, i3, i4, this.f864i, this.f864i, this.f868m, this.f868m, c0173b.f814E, false, false);
        }
        if (c0173b.f805w != null) {
            if (z3 && c0173b.f805w.f914w) {
                interfaceC1063y.mo142f();
                GameEngine.m5777e("Ending blit early");
            }
            c0173b.f805w.m4568a(interfaceC1063y, i3, i4, i3, i4, this.f864i, this.f864i, this.f868m, this.f868m, c0173b.f814E, false, false);
        }
        Iterator it = c0173b.f808z.iterator();
        while (it.hasNext()) {
            C0178e c0178e = (C0178e) it.next();
            if (c0178e.f904m) {
                if (z3 && c0178e.f914w) {
                    interfaceC1063y.mo142f();
                    GameEngine.m5777e("Ending blit early");
                }
                c0178e.m4568a(interfaceC1063y, i3, i4, i3, i4, this.f864i, this.f864i, this.f868m, this.f868m, c0173b.f814E, false, false);
            }
        }
        m4590a(i, i2, interfaceC1063y);
        if (c0173b.f814E) {
            if (z4) {
                interfaceC1063y.mo173a(false);
            }
            c0173b.f803u.m4568a(interfaceC1063y, i3, i4, i3, i4, this.f864i, this.f864i, this.f868m, this.f868m, c0173b.f814E, true, true);
        }
        if (z3 || z4) {
            interfaceC1063y.mo142f();
        }
        if (gameEngine.f6378bS.m1908F()) {
            m4584b(i, i2, interfaceC1063y);
        }
        c0177d.f882k = false;
        c0177d.f883l = false;
        c0177d.f884m = 0;
        c0177d.f885n = false;
        interfaceC1063y.mo131p();
        if (z || GameEngine.f6330aW) {
            c0177d.f872a.mo218a(0, PorterDuff.Mode.CLEAR);
        }
        c0177d.f872a.mo160b(this.f857b, 0.0f, 0.0f, (Paint) null);
        c0177d.f875d.mo49p();
        if (C0173b.f785c) {
            c0177d.f872a.mo182a(VariableScope.nullOrMissingString + c0177d.f874c, 40.0f, 40.0f, C0173b.f790h);
        }
        c0177d.f874c++;
    }

    /* renamed from: d */
    public void m4579d() {
        if (GameEngine.f6328aU && !GameEngine.f6331aX && !GameEngine.f6332aY) {
            return;
        }
        GameEngine gameEngine = GameEngine.getGameEngine();
        int max = Math.max((int) gameEngine.f6417cF, (int) gameEngine.f6419cH) + 3;
        if (this.f859d != null && this.f863h * this.f856a < max + this.f863h + 1) {
            GameEngine.m1015b("map", "screen must have changed size, layerBufferSize too small at " + this.f856a + ", adding to LayerBitmapBuffer");
            GameEngine.m1015b("map", "new viewpoint:" + gameEngine.f6417cF + ", " + gameEngine.f6419cH);
            m4582c(this.f856a + 1);
        }
        if (this.f859d == null) {
            GameEngine.m1015b("map", "setupLayerBuffers for size:" + max);
            long nanoTime = System.nanoTime();
            if (GameEngine.f6331aX || GameEngine.f6332aY) {
                this.f863h = 1024;
                this.f856a = (int) ((max / this.f863h) + 1.5f);
            } else {
                max = Math.max(600, max);
                this.f863h = (max / (this.f856a - 2)) + 7 + 4;
                this.f863h = ((int) ((this.f863h * (1.0f / 20)) + 0.5f)) * 20;
            }
            if (this.f863h * this.f856a < max + this.f863h + 1) {
                GameEngine.print("layerBufferSize is too small");
                GameEngine.print("layerBufferCount:" + this.f856a);
                GameEngine.print("(layerBufferSize*(layerBufferCount):" + (this.f863h * this.f856a));
                GameEngine.print("longest+layerBufferSize+1:" + (max + this.f863h + 1));
                GameEngine.print("longest:" + max);
                if (GameEngine.f6331aX || GameEngine.f6332aY) {
                    this.f856a++;
                } else {
                    this.f863h += 100;
                }
            }
            GameEngine.m5777e("layerBufferSize:" + this.f863h);
            this.f865j = this.f863h - 4;
            GameEngine.print("layerBuffer:" + this.f856a + "x" + this.f856a + " = " + (this.f856a * this.f856a) + (C0173b.f818I ? " x2 for soft fade " : VariableScope.nullOrMissingString));
            this.f859d = new C0177d[this.f856a][this.f856a];
            boolean z = false;
            if (gameEngine.settingsEngine.renderFancyWater) {
                z = true;
            }
            if (GameEngine.m1106C() || GameEngine.m1105D()) {
                z = true;
            }
            if (this.f863h <= 0) {
                GameEngine.print("layerBuffer buffer size was too small at: " + this.f863h);
                this.f863h = 512;
            }
            if (z) {
                this.f857b = gameEngine.f6374bO.mo219a(this.f863h, this.f863h, true);
            } else {
                this.f857b = gameEngine.f6374bO.mo219a(this.f863h, this.f863h, false);
            }
            this.f857b.m901b(true);
            this.f858c = gameEngine.f6374bO.mo161b(this.f857b);
            m4577f();
            GameEngine.m5777e("----- layerBuffers create in:" + ((System.nanoTime() - nanoTime) / 1000000.0d) + " ms");
        }
    }

    /* renamed from: c */
    public void m4582c(int i) {
        if (i < this.f856a) {
            GameEngine.m990g("newLayerBufferCount:" + i);
            return;
        }
        C0177d[][] c0177dArr = new C0177d[i][i];
        for (int i2 = 0; i2 < this.f856a; i2++) {
            for (int i3 = 0; i3 < this.f856a; i3++) {
                c0177dArr[i2][i3] = this.f859d[i2][i3];
            }
        }
        this.f859d = c0177dArr;
        this.f856a = i;
        m4577f();
    }

    /* renamed from: e */
    public void m4578e() {
        C0173b.f818I = false;
        C0173b.f819J = true;
        for (int i = 0; i < this.f856a; i++) {
            for (int i2 = 0; i2 < this.f856a; i2++) {
                C0177d c0177d = this.f859d[i][i2];
                if (c0177d != null) {
                    if (c0177d.f877f != null) {
                        c0177d.f877f.mo130q();
                        c0177d.f877f = null;
                    }
                    if (c0177d.f876e != null) {
                        c0177d.f876e.mo50o();
                        c0177d.f876e = null;
                    }
                }
            }
        }
    }

    /* renamed from: f */
    public void m4577f() {
        GameEngine gameEngine = GameEngine.getGameEngine();
        ArrayList arrayList = null;
        boolean z = false;
        for (int i = 0; i < this.f856a; i++) {
            for (int i2 = 0; i2 < this.f856a; i2++) {
                if (this.f859d[i][i2] == null) {
                    C0177d c0177d = new C0177d(this, i, i2);
                    c0177d.f873b = this.f871p;
                    this.f871p++;
                    this.f859d[i][i2] = c0177d;
                    if (this.f863h <= 0) {
                        GameEngine.print("initMissingLayerBufferImages: layerBuffer buffer size was too small at: " + this.f863h);
                        this.f863h = 512;
                    }
                    if (z) {
                        c0177d.f875d = gameEngine.f6374bO.mo129r();
                    } else if (gameEngine.settingsEngine.renderFancyWater) {
                        c0177d.f875d = gameEngine.f6374bO.mo219a(this.f863h, this.f863h, true);
                    } else {
                        c0177d.f875d = gameEngine.f6374bO.mo219a(this.f863h, this.f863h, false);
                    }
                    c0177d.f875d.m901b(true);
                    if (c0177d.f875d.mo395A()) {
                        if (!z) {
                            GameEngine.print("initMissingLayerBufferImages: Failed to create map buffer at :" + this.f863h + "px");
                        }
                        c0177d.f872a = new C1064z();
                    } else {
                        try {
                            c0177d.f872a = gameEngine.f6374bO.mo161b(c0177d.f875d);
                        } catch (OutOfMemoryError e) {
                            if (!z) {
                                GameEngine.m1068a(EnumC1100u.gameImageCreate, e);
                            }
                            z = true;
                            c0177d.f872a = new C1064z();
                        }
                    }
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(c0177d);
                }
            }
        }
        if (z && C0173b.f818I) {
            m4578e();
        }
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                C0177d c0177d2 = (C0177d) it.next();
                if (C0173b.f818I) {
                    try {
                        c0177d2.m4575a();
                    } catch (OutOfMemoryError e2) {
                        m4578e();
                        GameEngine.print("Not enough free memory to enable smooth fog fading");
                        System.gc();
                    }
                }
            }
        }
        m4595a();
    }

    /* renamed from: g */
    public float m4576g() {
        GameEngine gameEngine = GameEngine.getGameEngine();
        if (gameEngine.f6435cX > 1.0f) {
            return 1.0f;
        }
        return gameEngine.f6435cX;
    }

    /* renamed from: a */
    public void m4594a(float f) {
        GameEngine gameEngine = GameEngine.getGameEngine();
        C0173b c0173b = gameEngine.f6371bL;
        Long l = null;
        boolean z = false;
        float m4576g = m4576g();
        boolean z2 = false;
        float f2 = m4576g / this.f868m;
        if (C0773f.m2152c(f2 - 1.0f) < 0.01f) {
            f2 = 1.0f;
        }
        if (m4576g > 0.6d) {
            float f3 = 0.3f;
            if (GameEngine.m1028av()) {
                f3 = 0.1f;
            }
            if (m4576g - this.f868m > f3) {
                z2 = true;
            }
            if (m4576g == 1.0f && this.f868m != 1.0f) {
                z2 = true;
            }
        }
        if (f2 != 1.0f) {
            int i = 10;
            float f4 = 0.03f;
            if (m4576g < 0.3f) {
                i = 20;
                f4 = 0.09f;
            } else if (m4576g < 0.5f) {
                i = 20;
                f4 = 0.07f;
            }
            if (m4576g > 1.3f) {
                i = 7;
            }
            if (!GameEngine.m1028av()) {
                i += 10;
            }
            if (C0773f.m2152c(c0173b.f845aj - m4576g) > 0.03f) {
                c0173b.f845aj = gameEngine.f6435cX;
                c0173b.f846ak = 0;
            } else {
                c0173b.f846ak++;
            }
            if (c0173b.f846ak < 3) {
                c0173b.f844ai = 0.0f;
            } else if (C0773f.m2152c(m4576g - this.f868m) > f4) {
                c0173b.f844ai += 1.0f;
            }
            if (c0173b.f844ai > i) {
                c0173b.f844ai = 0.0f;
                z2 = true;
            }
        }
        if (gameEngine.f6406cu + gameEngine.f6412cA + 4.0f > this.f861f + (this.f856a * this.f866k)) {
            this.f861f += this.f866k;
            m4586b(1);
        }
        if (gameEngine.f6406cu - 1 < this.f861f) {
            this.f861f -= this.f866k;
            m4586b(-1);
        }
        if (gameEngine.f6407cv + gameEngine.f6413cB + 4.0f > this.f862g + (this.f856a * this.f866k)) {
            this.f862g += this.f866k;
            m4593a(1);
        }
        if (gameEngine.f6407cv - 1 < this.f862g) {
            this.f862g -= this.f866k;
            m4593a(-1);
        }
        if (gameEngine.f6406cu + gameEngine.f6412cA + 4.0f > this.f861f + (this.f856a * this.f866k)) {
            z2 = true;
        }
        if (gameEngine.f6406cu - 1 < this.f861f) {
            z2 = true;
        }
        if (gameEngine.f6407cv + gameEngine.f6413cB + 4.0f > this.f862g + (this.f856a * this.f866k)) {
            z2 = true;
        }
        if (gameEngine.f6407cv - 1 < this.f862g) {
            z2 = true;
        }
        if (z2) {
            m4595a();
        }
        float f5 = gameEngine.f6435cX / this.f868m;
        if (C0773f.m2152c(f5 - 1.0f) < 1.0E-4f) {
            f5 = 1.0f;
        }
        float f6 = (gameEngine.f6417cF / f5) + 2.0f;
        float f7 = (gameEngine.f6419cH / f5) + 2.0f;
        if (f5 != 1.0f) {
            gameEngine.f6374bO.mo136k();
            gameEngine.f6374bO.mo229a(f5, f5);
            c0173b.f850ao.m5165a(gameEngine.f6422cK);
            c0173b.f850ao.f232c = ((int) (c0173b.f850ao.f230a + (c0173b.f850ao.m5164b() / f5))) + 2;
            c0173b.f850ao.f233d = ((int) (c0173b.f850ao.f231b + (c0173b.f850ao.m5160c() / f5))) + 2;
            gameEngine.f6374bO.mo209a(c0173b.f850ao);
        }
        float f8 = (this.f861f - gameEngine.f6408cw) * this.f868m;
        float f9 = (this.f862g - gameEngine.f6409cx) * this.f868m;
        float f10 = (int) f8;
        float f11 = (int) f9;
        int i2 = 0;
        boolean z3 = false;
        if (GameEngine.m1028av() && gameEngine.f6435cX < 0.3d) {
            z3 = true;
        }
        this.f860e.mo914a(z3);
        this.f860e.m5189d(z3);
        this.f860e.m5197b(z3);
        boolean z4 = false;
        for (int i3 = 0; i3 < this.f856a; i3++) {
            try {
                for (int i4 = 0; i4 < this.f856a; i4++) {
                    C0177d c0177d = this.f859d[i3][i4];
                    int i5 = (int) (f10 + (i3 * this.f866k * this.f868m));
                    int i6 = (int) (f11 + (i4 * this.f866k * this.f868m));
                    if (c0177d.f883l && !this.f869n) {
                        c0177d.f884m++;
                    }
                    c0177d.f887p.m5166a(i5 + 1, i6 + 1, (i5 + this.f863h) - 2, (i6 + this.f863h) - 2);
                    if (c0177d.f887p.f230a <= f6 && c0177d.f887p.f231b <= f7) {
                        if (c0177d.f887p.f232c > f6) {
                            c0177d.f887p.f232c = (int) f6;
                        }
                        if (c0177d.f887p.f233d > f7) {
                            c0177d.f887p.f233d = (int) f7;
                        }
                        int i7 = (int) ((0.0f - gameEngine.f6408cw) * this.f868m);
                        int i8 = (int) ((0.0f - gameEngine.f6409cx) * this.f868m);
                        int m4599i = (int) ((c0173b.m4599i() - gameEngine.f6408cw) * this.f868m);
                        int m4598j = (int) ((c0173b.m4598j() - gameEngine.f6409cx) * this.f868m);
                        if (c0177d.f887p.f230a < i7) {
                            c0177d.f887p.f230a = i7;
                        }
                        if (c0177d.f887p.f231b < i8) {
                            c0177d.f887p.f231b = i8;
                        }
                        if (c0177d.f887p.f232c > m4599i) {
                            c0177d.f887p.f232c = m4599i;
                        }
                        if (c0177d.f887p.f233d > m4598j) {
                            c0177d.f887p.f233d = m4598j;
                        }
                        if (!c0177d.f887p.m5168a()) {
                            boolean z5 = false;
                            boolean z6 = true;
                            if (c0177d.f882k) {
                                z5 = true;
                                z6 = false;
                            }
                            if (c0177d.f883l) {
                                int i9 = 10;
                                if (i2 > 3) {
                                    i9 = 10 + 2;
                                }
                                if (i2 > 6) {
                                    i9 += 2;
                                }
                                if (c0177d.f884m > i9) {
                                    c0177d.f884m = 0;
                                    z5 = true;
                                    i2++;
                                }
                            }
                            if (z5) {
                                z = true;
                                boolean z7 = false;
                                long m2440a = C0742br.m2440a();
                                if (l == null) {
                                    l = Long.valueOf(m2440a);
                                } else {
                                    int i10 = 200;
                                    if (this.f869n) {
                                        i10 = 30;
                                    }
                                    if (C0742br.m2437a(l.longValue(), m2440a) > i10) {
                                        z7 = true;
                                        this.f869n = true;
                                    }
                                }
                                if (z7 && c0177d.f882k && !c0177d.f885n) {
                                    m4585b(i3, i4);
                                }
                                if (!z7) {
                                    if (C0173b.f818I) {
                                        if (c0177d.f876e != null && c0177d.f876e.f6622p != c0177d.f875d.f6622p) {
                                            GameEngine.m5777e("wrong sized fadeOutBitmap width:" + c0177d.f876e.f6622p + " vs " + c0177d.f875d.f6622p);
                                            c0177d.f876e.mo50o();
                                            c0177d.f876e = null;
                                        }
                                        if (c0177d.f876e == null) {
                                            try {
                                                c0177d.m4575a();
                                            } catch (OutOfMemoryError e) {
                                                e.printStackTrace();
                                                GameEngine.m1068a(EnumC1100u.gameImageCreate, e);
                                                m4578e();
                                                GameEngine.print("Not enough free memory to keep smooth fog fading");
                                                System.gc();
                                            }
                                            if (C0173b.f818I && c0177d.f876e == null) {
                                                gameEngine.m986i("Disabling smooth fog fading due to error");
                                                m4578e();
                                                GameEngine.print("fadeOutBitmap == null");
                                                System.gc();
                                            }
                                        }
                                    }
                                    if (C0173b.f818I) {
                                        if (c0177d.f878g > 0.0f) {
                                        }
                                        C0970e c0970e = c0177d.f875d;
                                        c0177d.f875d = c0177d.f876e;
                                        c0177d.f876e = c0970e;
                                        InterfaceC1063y interfaceC1063y = c0177d.f872a;
                                        c0177d.f872a = c0177d.f877f;
                                        c0177d.f877f = interfaceC1063y;
                                        if (z6) {
                                            c0177d.f878g = 1.0f;
                                        } else {
                                            c0177d.f878g = 0.0f;
                                        }
                                    } else {
                                        c0177d.f878g = 0.0f;
                                    }
                                    if (GameEngine.m1030at() && !z4) {
                                        C0173b.m4664a();
                                        z4 = true;
                                    }
                                    gameEngine.f6374bO.mo138i();
                                    m4581c(i3, i4);
                                    gameEngine.f6374bO.mo137j();
                                    if (C0173b.f783a) {
                                        C0742br.m2435a("re-drawTile", m2440a);
                                    }
                                }
                            }
                            c0177d.f886o.m5165a(c0177d.f887p);
                            c0177d.f886o.m5167a(-i5, -i6);
                            c0177d.f888q.m5151a(c0177d.f887p);
                            c0177d.f888q.m5153a(-f10, -f11);
                            c0177d.f888q.m5153a(f8, f9);
                            if (c0177d.f878g > 0.0f) {
                                c0177d.f879h.mo914a(z3);
                                c0177d.f879h.m5195c((int) ((1.0f - c0177d.f878g) * 255.0f));
                                gameEngine.f6374bO.mo193a(c0177d.f876e, c0177d.f886o, c0177d.f888q, this.f860e);
                                if (c0177d.f878g < 0.98d) {
                                    gameEngine.f6374bO.mo193a(c0177d.f875d, c0177d.f886o, c0177d.f888q, c0177d.f879h);
                                }
                                c0177d.f878g -= 0.1f * f;
                            } else if (c0177d.f875d.mo395A()) {
                                gameEngine.f6374bO.mo192a(c0177d.f875d, c0177d.f888q, this.f860e, 0.0f, 0.0f, 0, 0);
                            } else {
                                gameEngine.f6374bO.mo193a(c0177d.f875d, c0177d.f886o, c0177d.f888q, this.f860e);
                            }
                        }
                    }
                }
            } finally {
                if (z4) {
                    C0173b.m4629b();
                }
            }
        }
        if (f5 != 1.0f) {
            gameEngine.f6374bO.mo135l();
        }
        if (!z) {
            this.f869n = false;
        }
    }
}