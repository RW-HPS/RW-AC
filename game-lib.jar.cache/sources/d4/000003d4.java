package com.corrodinggames.rts.game.units.p028g;

import com.corrodinggames.rts.game.units.AbstractC0244am;
import com.corrodinggames.rts.game.units.AbstractC0629y;
import com.corrodinggames.rts.game.units.p013a.C0208c;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.net.GameInputStream;
import com.corrodinggames.rts.gameFramework.net.GameOutputStream;
import com.corrodinggames.rts.gameFramework.utility.C1136m;

/* renamed from: com.corrodinggames.rts.game.units.g.e */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/g/e.class */
public class C0559e extends AbstractC0552a {

    /* renamed from: b */
    int f3791b;

    /* renamed from: c */
    C0208c f3792c;

    public C0559e() {
        this.f3792c = C0208c.f1432a;
    }

    public C0559e(int i, C0208c c0208c) {
        super(i);
        this.f3792c = C0208c.f1432a;
        this.f3792c = c0208c;
        this.f3791b = GameEngine.getGameEngine().f6315by;
    }

    @Override // com.corrodinggames.rts.game.units.p028g.AbstractC0552a
    /* renamed from: b */
    public EnumC0554b mo3178b() {
        return EnumC0554b.specialActionBlock;
    }

    /* renamed from: a */
    public boolean m3183a(C0208c c0208c) {
        return this.f3792c == C0208c.f1432a || this.f3792c == c0208c;
    }

    /* renamed from: c */
    public float m3176c() {
        int i = this.f3786a - this.f3791b;
        if (i <= 0) {
            return 1.0f;
        }
        return (this.f3786a - GameEngine.getGameEngine().f6315by) / i;
    }

    /* renamed from: a */
    public static void m3181a(AbstractC0629y abstractC0629y, C0208c c0208c, int i) {
        C0557c.m3186a(abstractC0629y, new C0559e(GameEngine.getGameEngine().f6315by + i, c0208c));
    }

    /* renamed from: a */
    public static int m3182a(AbstractC0244am abstractC0244am, C0208c c0208c) {
        C0559e m3177b;
        if (!(abstractC0244am instanceof AbstractC0629y) || ((AbstractC0629y) abstractC0244am).f4026bp == null || (m3177b = m3177b(abstractC0244am, c0208c)) == null) {
            return 0;
        }
        return m3177b.m3174d();
    }

    /* renamed from: d */
    public int m3174d() {
        return this.f3786a - GameEngine.getGameEngine().f6315by;
    }

    /* renamed from: b */
    public static C0559e m3177b(AbstractC0244am abstractC0244am, C0208c c0208c) {
        C1136m c1136m;
        if (!(abstractC0244am instanceof AbstractC0629y) || (c1136m = ((AbstractC0629y) abstractC0244am).f4026bp) == null) {
            return null;
        }
        int i = GameEngine.getGameEngine().f6315by;
        C0559e c0559e = null;
        Object[] m535a = c1136m.m535a();
        for (int i2 = c1136m.f7109a - 1; i2 >= 0; i2--) {
            AbstractC0552a abstractC0552a = (AbstractC0552a) m535a[i2];
            if (abstractC0552a instanceof C0559e) {
                C0559e c0559e2 = (C0559e) abstractC0552a;
                if (c0559e2.m3183a(c0208c) && c0559e2.f3786a > i) {
                    i = c0559e2.f3786a;
                    c0559e = c0559e2;
                }
            }
        }
        if (c0559e == null) {
            return null;
        }
        return c0559e;
    }

    @Override // com.corrodinggames.rts.game.units.p028g.AbstractC0552a
    /* renamed from: a */
    public void mo3180a(AbstractC0629y abstractC0629y, GameOutputStream gameOutputStream) {
        C0208c.m4338a(gameOutputStream, this.f3792c);
        gameOutputStream.writeInt(this.f3791b);
        super.mo3180a(abstractC0629y, gameOutputStream);
    }

    @Override // com.corrodinggames.rts.game.units.p028g.AbstractC0552a
    /* renamed from: a */
    public void mo3179a(AbstractC0629y abstractC0629y, GameInputStream gameInputStream) {
        this.f3792c = C0208c.m4337a(gameInputStream);
        if (this.f3792c == null) {
            this.f3792c = C0208c.f1432a;
        }
        this.f3791b = gameInputStream.readInt();
        super.mo3179a(abstractC0629y, gameInputStream);
    }

    /* renamed from: c */
    public static void m3175c(AbstractC0244am abstractC0244am, C0208c c0208c) {
        C1136m c1136m;
        if (!(abstractC0244am instanceof AbstractC0629y) || (c1136m = ((AbstractC0629y) abstractC0244am).f4026bp) == null) {
            return;
        }
        int i = GameEngine.getGameEngine().f6315by;
        Object[] m535a = c1136m.m535a();
        for (int i2 = c1136m.f7109a - 1; i2 >= 0; i2--) {
            AbstractC0552a abstractC0552a = (AbstractC0552a) m535a[i2];
            if (abstractC0552a instanceof C0559e) {
                C0559e c0559e = (C0559e) abstractC0552a;
                if (c0208c == C0208c.f1432a || c0559e.m3183a(c0208c)) {
                    c0559e.f3786a = i - 1;
                }
            }
        }
    }
}