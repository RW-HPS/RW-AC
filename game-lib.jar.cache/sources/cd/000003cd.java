package com.corrodinggames.rts.game.units.p028g;

import com.corrodinggames.rts.game.units.AbstractC0629y;
import com.corrodinggames.rts.gameFramework.net.GameInputStream;
import com.corrodinggames.rts.gameFramework.net.GameOutputStream;

/* renamed from: com.corrodinggames.rts.game.units.g.a */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/g/a.class */
public abstract class AbstractC0552a {

    /* renamed from: a */
    int f3786a;

    /* renamed from: b */
    public abstract EnumC0554b mo3178b();

    public AbstractC0552a() {
    }

    public AbstractC0552a(int i) {
        this.f3786a = i;
    }

    /* renamed from: a */
    public int m3190a() {
        return this.f3786a;
    }

    /* renamed from: a */
    public void m3189a(AbstractC0629y abstractC0629y, float f) {
    }

    /* renamed from: a */
    public void mo3180a(AbstractC0629y abstractC0629y, GameOutputStream gameOutputStream) {
        gameOutputStream.writeInt(this.f3786a);
    }

    /* renamed from: a */
    public void mo3179a(AbstractC0629y abstractC0629y, GameInputStream gameInputStream) {
        this.f3786a = gameInputStream.readInt();
    }
}