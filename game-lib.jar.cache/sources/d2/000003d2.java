package com.corrodinggames.rts.game.units.p028g;

import com.corrodinggames.rts.game.units.AbstractC0629y;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.net.GameInputStream;
import com.corrodinggames.rts.gameFramework.net.GameOutputStream;
import com.corrodinggames.rts.gameFramework.utility.C1136m;
import java.io.IOException;

/* renamed from: com.corrodinggames.rts.game.units.g.c */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/g/c.class */
public final class C0557c {
    /* renamed from: a */
    public static void m3188a(AbstractC0629y abstractC0629y, float f) {
        C1136m c1136m = abstractC0629y.f4030bp;
        if (c1136m == null) {
            return;
        }
        int i = GameEngine.getGameEngine().f6358by;
        Object[] m535a = c1136m.m535a();
        for (int i2 = c1136m.f7109a - 1; i2 >= 0; i2--) {
            AbstractC0552a abstractC0552a = (AbstractC0552a) m535a[i2];
            if (abstractC0552a.f3786a <= i) {
                c1136m.remove(i2);
            } else {
                abstractC0552a.m3190a(abstractC0629y, f);
            }
        }
    }

    /* renamed from: a */
    public static void m3187a(AbstractC0629y abstractC0629y, AbstractC0552a abstractC0552a) {
        if (abstractC0629y.f4030bp == null) {
            abstractC0629y.f4030bp = new C1136m();
        }
        if (abstractC0629y.f4030bp.size() > 1000) {
            abstractC0629y.m2991a("status effect limit reached");
        } else {
            abstractC0629y.f4030bp.add(abstractC0552a);
        }
    }

    /* renamed from: a */
    public static void m3186a(AbstractC0629y abstractC0629y, GameOutputStream gameOutputStream) {
        int size;
        C1136m c1136m = abstractC0629y.f4030bp;
        if (c1136m == null) {
            size = 0;
        } else {
            size = c1136m.size();
        }
        gameOutputStream.mo1331a((short) size);
        if (size == 0) {
            return;
        }
        gameOutputStream.mo1366e("s");
        Object[] m535a = c1136m.m535a();
        for (int i = 0; i < c1136m.f7109a; i++) {
            AbstractC0552a abstractC0552a = (AbstractC0552a) m535a[i];
            gameOutputStream.writeEnum(abstractC0552a.mo3179b());
            abstractC0552a.mo3181a(abstractC0629y, gameOutputStream);
        }
        gameOutputStream.endBlock("s");
    }

    /* renamed from: a */
    public static void m3185a(AbstractC0629y abstractC0629y, GameInputStream gameInputStream) {
        int readShort = gameInputStream.readShort();
        if (readShort <= 0) {
            abstractC0629y.f4030bp = null;
            return;
        }
        if (abstractC0629y.f4030bp == null) {
            abstractC0629y.f4030bp = new C1136m();
        } else {
            abstractC0629y.f4030bp.clear();
        }
        C1136m c1136m = abstractC0629y.f4030bp;
        gameInputStream.startBlock("s");
        for (int i = 0; i < readShort; i++) {
            EnumC0554b enumC0554b = (EnumC0554b) gameInputStream.m1309b(EnumC0554b.class);
            if (enumC0554b == null) {
                throw new IOException("Unknown status effect type");
            }
            AbstractC0552a mo3189a = enumC0554b.mo3189a();
            mo3189a.mo3180a(abstractC0629y, gameInputStream);
            c1136m.add(mo3189a);
        }
        gameInputStream.endBlock("s");
    }
}