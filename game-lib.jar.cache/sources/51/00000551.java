package com.corrodinggames.rts.gameFramework.p043k;

import android.graphics.Point;
import com.corrodinggames.rts.game.p012b.C0173b;
import com.corrodinggames.rts.game.units.AbstractC0244am;
import com.corrodinggames.rts.game.units.C0237af;
import com.corrodinggames.rts.gameFramework.GameEngine;

/* renamed from: com.corrodinggames.rts.gameFramework.k.h */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/k/h.class */
public class C0939h extends AbstractC0934c {

    /* renamed from: a */
    C0937f f6168a;

    /* renamed from: b */
    C0237af f6169b = new C0237af();

    /* renamed from: c */
    static Point f6170c = new Point();

    public C0939h(C0937f c0937f) {
        this.f6168a = c0937f;
    }

    @Override // com.corrodinggames.rts.gameFramework.p043k.AbstractC0934c
    /* renamed from: a */
    public C0237af mo1217a(AbstractC0244am abstractC0244am) {
        C0237af m1218a = m1218a(abstractC0244am.f7173eo, abstractC0244am.f7174ep);
        if (m1218a == null) {
            return null;
        }
        C0237af m1218a2 = m1218a(m1218a.f1532a, m1218a.f1533b);
        if (m1218a2 == null) {
            return m1218a;
        }
        C0237af m1218a3 = m1218a(m1218a2.f1532a, m1218a2.f1533b);
        if (m1218a3 == null) {
            return m1218a2;
        }
        return m1218a3;
    }

    @Override // com.corrodinggames.rts.gameFramework.p043k.AbstractC0934c
    /* renamed from: d */
    public void mo1214d(AbstractC0244am abstractC0244am) {
        if (this.f6168a != null) {
            this.f6168a.m1225d();
        }
        GameEngine gameEngine = GameEngine.getGameEngine();
        float f = gameEngine.f6408cw;
        float f2 = gameEngine.f6409cx;
        C0237af m1213e = m1213e(abstractC0244am);
        if (m1213e != null) {
            float f3 = m1213e.f1532a;
            float f4 = m1213e.f1533b;
            C0937f.f6160c.m5200b(-16776961);
            gameEngine.f6374bO.mo226a(abstractC0244am.f7173eo - f, abstractC0244am.f7174ep - f2, f3 - f, f4 - f2, C0937f.f6160c);
            C0237af mo1216b = mo1216b(abstractC0244am);
            if (mo1216b != null) {
                C0937f.f6160c.m5200b(-7829368);
                gameEngine.f6374bO.mo226a(f3 - f, f4 - f2, mo1216b.f1532a - f, mo1216b.f1533b - f2, C0937f.f6160c);
            }
        }
        C0237af mo1217a = mo1217a(abstractC0244am);
        if (mo1217a != null) {
            float f5 = mo1217a.f1532a;
            float f6 = mo1217a.f1533b;
            C0937f.f6160c.m5200b(-256);
            gameEngine.f6374bO.mo226a(abstractC0244am.f7173eo - f, abstractC0244am.f7174ep - f2, f5 - f, f6 - f2, C0937f.f6160c);
        }
    }

    /* renamed from: e */
    public C0237af m1213e(AbstractC0244am abstractC0244am) {
        return m1218a(abstractC0244am.f7173eo, abstractC0244am.f7174ep);
    }

    @Override // com.corrodinggames.rts.gameFramework.p043k.AbstractC0934c
    /* renamed from: b */
    public C0237af mo1216b(AbstractC0244am abstractC0244am) {
        C0237af m1218a = m1218a(abstractC0244am.f7173eo, abstractC0244am.f7174ep);
        if (m1218a == null) {
            return null;
        }
        return m1218a(m1218a.f1532a, m1218a.f1533b);
    }

    @Override // com.corrodinggames.rts.gameFramework.p043k.AbstractC0934c
    /* renamed from: c */
    public void mo1215c(AbstractC0244am abstractC0244am) {
    }

    /* renamed from: a */
    public C0237af m1218a(float f, float f2) {
        byte m1226a;
        if (this.f6168a.f6159b == null) {
            return null;
        }
        C0173b c0173b = GameEngine.getGameEngine().f6371bL;
        int i = (int) (f * c0173b.f800r);
        int i2 = (int) (f2 * c0173b.f801s);
        if (!c0173b.m4618c(i, i2) || (m1226a = this.f6168a.m1226a(i, i2)) == 0) {
            return null;
        }
        C0937f.m1227a(m1226a, f6170c);
        int i3 = i - f6170c.f224a;
        int i4 = i2 - f6170c.f225b;
        this.f6169b.f1532a = (i3 * c0173b.f796n) + c0173b.f798p;
        this.f6169b.f1533b = (i4 * c0173b.f797o) + c0173b.f799q;
        return this.f6169b;
    }
}