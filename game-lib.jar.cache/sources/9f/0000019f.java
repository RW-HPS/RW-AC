package com.corrodinggames.rts.game.units.p013a;

import com.corrodinggames.rts.game.units.AbstractC0244am;
import com.corrodinggames.rts.game.units.AbstractC0629y;
import com.corrodinggames.rts.game.units.EnumC0205a;
import com.corrodinggames.rts.game.units.EnumC0249ar;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.SyncPacket;
import java.util.Iterator;

/* renamed from: com.corrodinggames.rts.game.units.a.d */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/a/d.class */
public class C0209d extends AbstractC0224s {

    /* renamed from: a */
    int f1434a;

    /* renamed from: b */
    EnumC0205a f1435b;

    public C0209d() {
        super("c_7");
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
    /* renamed from: b */
    public int mo3093b(AbstractC0244am abstractC0244am, boolean z) {
        return -1;
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
    /* renamed from: c */
    public int mo3092c() {
        return 0;
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
    /* renamed from: n */
    public EnumC0249ar mo5457i() {
        return null;
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
    /* renamed from: e */
    public EnumC0226u mo3091e() {
        return EnumC0226u.f1489k;
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
    /* renamed from: f */
    public EnumC0225t mo3090f() {
        return EnumC0225t.f1469a;
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
    /* renamed from: g */
    public boolean mo3089g() {
        return false;
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
    /* renamed from: a */
    public String mo3098a() {
        return "Attack Mode";
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
    /* renamed from: b */
    public String mo3095b() {
        EnumC0205a m4333q = m4333q();
        if (m4333q != null) {
            return m4333q.name();
        }
        return "NA";
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
    /* renamed from: h_ */
    public boolean mo3087h_() {
        return false;
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
    /* renamed from: c */
    public void mo4299c(AbstractC0244am abstractC0244am) {
        GameEngine gameEngine = GameEngine.getGameEngine();
        EnumC0205a m4335a = m4335a(m4332r());
        SyncPacket m2419b = gameEngine.f6343cf.m2419b(abstractC0244am.f1614bX);
        Iterator it = AbstractC0244am.f1594bE.iterator();
        while (it.hasNext()) {
            AbstractC0244am abstractC0244am2 = (AbstractC0244am) it.next();
            if (abstractC0244am2 instanceof AbstractC0629y) {
                AbstractC0629y abstractC0629y = (AbstractC0629y) abstractC0244am2;
                if (abstractC0629y.f1649cG) {
                    m2419b.m2327a(abstractC0629y);
                }
            }
        }
        m2419b.m2330a(m4335a);
        this.f1434a = gameEngine.f6330bS.f5276Y;
        this.f1435b = m4335a;
    }

    /* renamed from: a */
    public EnumC0205a m4335a(EnumC0205a enumC0205a) {
        if (enumC0205a == EnumC0205a.f1423b) {
            return EnumC0205a.f1426e;
        }
        if (enumC0205a == EnumC0205a.f1423b) {
            return EnumC0205a.f1427f;
        }
        return EnumC0205a.f1423b;
    }

    /* renamed from: q */
    public EnumC0205a m4333q() {
        GameEngine gameEngine = GameEngine.getGameEngine();
        EnumC0205a m4332r = m4332r();
        this.f1434a = gameEngine.f6330bS.f5276Y;
        this.f1435b = m4332r;
        return m4332r;
    }

    /* renamed from: r */
    public EnumC0205a m4332r() {
        if (this.f1434a == GameEngine.getGameEngine().f6330bS.f5276Y && this.f1435b != null) {
            return this.f1435b;
        }
        EnumC0205a enumC0205a = null;
        Iterator it = AbstractC0244am.f1594bE.iterator();
        while (it.hasNext()) {
            AbstractC0244am abstractC0244am = (AbstractC0244am) it.next();
            if (abstractC0244am instanceof AbstractC0629y) {
                AbstractC0629y abstractC0629y = (AbstractC0629y) abstractC0244am;
                if (abstractC0629y.f1649cG) {
                    if (enumC0205a == null || enumC0205a == abstractC0629y.f3926P) {
                        enumC0205a = abstractC0629y.f3926P;
                    } else {
                        enumC0205a = EnumC0205a.f1428g;
                    }
                }
            }
        }
        return enumC0205a;
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
    /* renamed from: b */
    public boolean mo3094b(AbstractC0244am abstractC0244am) {
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
    /* renamed from: d */
    public String mo3123d() {
        return mo3095b();
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
    /* renamed from: s */
    public boolean mo4278s() {
        return true;
    }
}