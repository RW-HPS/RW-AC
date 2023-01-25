package com.corrodinggames.rts.game.units;

import com.corrodinggames.rts.gameFramework.net.GameInputStream;
import com.corrodinggames.rts.gameFramework.net.GameOutputStream;

/* renamed from: com.corrodinggames.rts.game.units.af */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/af.class */
public class C0237af {

    /* renamed from: a */
    public float f1532a;

    /* renamed from: b */
    public float f1533b;

    /* renamed from: a */
    public void m4273a(GameOutputStream gameOutputStream) {
        gameOutputStream.writeFloat(this.f1532a);
        gameOutputStream.writeFloat(this.f1533b);
    }

    /* renamed from: a */
    public void m4272a(GameInputStream gameInputStream) {
        this.f1532a = gameInputStream.readFloat();
        this.f1533b = gameInputStream.readFloat();
    }
}