package com.corrodinggames.rts.gameFramework.unitAction;

import android.graphics.Paint;
import android.graphics.PorterDuff;
import com.corrodinggames.rts.gameFramework.GameEngine;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* renamed from: com.corrodinggames.rts.gameFramework.m.f */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/m/f.class */
public class f {
    public e a;
    public y b;
    public Paint c;
    boolean e;
    int f;
    int d = 0;
    boolean g = false;
    int h = 0;
    int i = 0;
    int j = 0;
    int k = 1;
    HashMap l = new HashMap();
    ArrayList m = new ArrayList();

    public f(int i, int i2) {
        a(i, i2);
    }

    public void a(int i, int i2) {
        GameEngine gameEngine = GameEngine.getGameEngine();
        GameEngine.m328e("Creating BitmapOrTextureAlias: " + i + "x" + i2);
        this.a = gameEngine.bO.a(i, i2, true);
        this.b = gameEngine.bO.b(this.a);
        this.c = new ag();
        this.c.a(new v(w.copy));
    }

    public void a(e eVar, int i, int i2) {
        this.b.b(eVar, i, i2, this.c);
        this.b.p();
    }

    public void a() {
        this.b.a(0, PorterDuff.Mode.CLEAR);
    }

    public void b() {
        this.d = 0;
        this.e = false;
        this.f = 0;
        this.h = 0;
        this.i = 0;
        this.j = 0;
        this.l.clear();
        a();
    }

    public void c() {
        this.f++;
        if (this.e && this.f > 600) {
            this.g = true;
            this.m.clear();
        }
    }

    public void d() {
        if (this.g) {
            this.g = false;
            b();
            Iterator it = this.m.iterator();
            while (it.hasNext()) {
                a((e) it.next());
            }
            this.m.clear();
        }
    }

    public g a(e eVar) {
        g gVar = (g) this.l.get(eVar);
        if (gVar != null) {
            if (this.g) {
                this.m.add(eVar);
            }
            if (gVar.f != eVar.e) {
                GameEngine.m328e("BitmapOrTextureAlias: Image was updated: " + eVar.a());
                this.l.remove(eVar);
            } else {
                return gVar;
            }
        }
        g b = b(eVar);
        if (b != null) {
            return b;
        }
        return null;
    }

    public g b(e eVar) {
        int m = eVar.m();
        int l = eVar.l();
        int m2 = this.a.m();
        int l2 = this.a.l();
        if (this.h + m > m2) {
            this.h = 0;
            this.i += this.j + this.k;
            this.j = 0;
        }
        if (this.i + l > l2) {
            if (!this.e) {
                this.e = true;
                return null;
            }
            return null;
        }
        g gVar = new g();
        gVar.a = this.a;
        int i = this.h;
        int i2 = this.i;
        this.h += m + this.k;
        if (this.j < l) {
            this.j = l;
        }
        a(eVar, i, i2);
        gVar.b = i;
        gVar.c = i2;
        gVar.d = m;
        gVar.e = l;
        gVar.f = eVar.e;
        this.d++;
        this.l.put(eVar, gVar);
        return gVar;
    }
}