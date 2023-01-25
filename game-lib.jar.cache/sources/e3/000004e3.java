package com.corrodinggames.rts.gameFramework.p037f;

import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Typeface;
import com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope;
import com.corrodinggames.rts.gameFramework.C0773f;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.player.AbstractC0851d;
import com.corrodinggames.rts.gameFramework.player.C0847a;
import com.corrodinggames.rts.gameFramework.player.EnumC0853f;
import com.corrodinggames.rts.gameFramework.translations.C0855a;
import com.corrodinggames.rts.gameFramework.unitAction.C0966ag;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: com.corrodinggames.rts.gameFramework.f.k */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/f/k.class */
public class C0829k {

    /* renamed from: a */
    C0825g f5439a;

    /* renamed from: b */
    GameEngine f5440b;

    /* renamed from: c */
    Paint f5441c;

    /* renamed from: d */
    Paint f5442d;

    /* renamed from: e */
    RectF f5443e = new RectF();

    C0829k(GameEngine gameEngine, C0825g c0825g) {
        this.f5439a = c0825g;
        this.f5440b = gameEngine;
        m1786a();
    }

    /* renamed from: a */
    public void m1786a() {
        this.f5442d = new Paint();
        this.f5442d.m5222a(255, 255, 255, 255);
        this.f5442d.mo914a(true);
        this.f5442d.m5193c(true);
        this.f5442d.mo916a(Typeface.m5131a(Typeface.f242c, 1));
        this.f5440b.m1071a(this.f5442d, 16.0f);
        this.f5441c = new Paint();
        this.f5441c.m5222a(255, 255, 255, 255);
        this.f5441c.mo914a(true);
        this.f5441c.m5193c(true);
        this.f5441c.mo916a(Typeface.m5131a(Typeface.f242c, 0));
        this.f5440b.m1071a(this.f5441c, 16.0f);
    }

    /* renamed from: a */
    public int m1785a(float f, int i) {
        GameEngine gameEngine = GameEngine.getGameEngine();
        C0847a c0847a = gameEngine.f6392cg;
        if (c0847a.m1730e() == EnumC0853f.none) {
            return i;
        }
        ArrayList m1731d = c0847a.m1731d();
        ArrayList arrayList = new ArrayList();
        String m1714a = C0855a.m1714a("gui.leaderboard.type." + c0847a.m1730e().name(), new Object[0]);
        arrayList.add(new C0830l(VariableScope.nullOrMissingString, this.f5441c, m1714a, this.f5442d));
        int i2 = i;
        int i3 = ((int) (gameEngine.f6397cl - gameEngine.f6402cq)) - 6;
        int i4 = (int) (20.0f * gameEngine.f6395cj);
        Iterator it = m1731d.iterator();
        while (it.hasNext()) {
            AbstractC0851d abstractC0851d = (AbstractC0851d) it.next();
            C0830l c0830l = new C0830l(c0847a.m1735a(abstractC0851d), this.f5442d, " " + abstractC0851d.mo1723b(), abstractC0851d.mo1725a() ? this.f5442d : this.f5441c);
            c0830l.f5450g = abstractC0851d.mo1722c();
            c0830l.f5446c = abstractC0851d.mo1721d();
            arrayList.add(c0830l);
        }
        float mo158b = gameEngine.f6374bO.mo158b(m1714a, this.f5441c);
        float f2 = 0.0f;
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            C0830l c0830l2 = (C0830l) it2.next();
            if (c0830l2.f5447d > f2) {
                f2 = c0830l2.f5447d;
            }
        }
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            C0830l c0830l3 = (C0830l) it3.next();
            if (C0773f.m2152c(c0830l3.f5447d - f2) < 40.0f) {
                c0830l3.f5447d = f2;
            }
            float f3 = c0830l3.f5447d + c0830l3.f5451h;
            if (f3 > mo158b) {
                mo158b = f3;
            }
        }
        float m2133e = C0773f.m2133e(mo158b / 20.0f) * 20.0f;
        int i5 = i3 - ((int) (m2133e + 0.5f));
        this.f5443e.f234a = i5 - 6;
        this.f5443e.f236c = i5 + 6 + m2133e;
        this.f5443e.f235b = (i2 - 6) - i4;
        this.f5443e.f237d = i2 + 6 + ((arrayList.size() - 1) * i4);
        C0966ag c0966ag = new C0966ag();
        c0966ag.m5200b(Color.m5237a(100, 0, 0, 0));
        c0966ag.m5215a(Paint.Style.FILL_AND_STROKE);
        gameEngine.f6374bO.mo206a(this.f5443e, c0966ag);
        for (int i6 = 0; i6 < arrayList.size(); i6++) {
            C0830l c0830l4 = (C0830l) arrayList.get(i6);
            c0830l4.f5444a.m5200b(c0830l4.f5446c);
            gameEngine.f6374bO.mo182a(c0830l4.f5445b, i5, i2, c0830l4.f5444a);
            c0830l4.f5448e.m5200b(c0830l4.f5450g);
            gameEngine.f6374bO.mo182a(c0830l4.f5449f, i5 + c0830l4.f5447d, i2, c0830l4.f5448e);
            i2 += i4;
        }
        return i2 + i4;
    }
}