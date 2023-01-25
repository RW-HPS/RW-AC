package com.corrodinggames.rts.game.units.p028g;

import com.corrodinggames.rts.game.units.AbstractC0629y;
import com.corrodinggames.rts.gameFramework.net.GameInputStream;
import com.corrodinggames.rts.gameFramework.net.GameOutputStream;

/* renamed from: com.corrodinggames.rts.game.units.g.d */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/g/d.class */
public class C0558d extends AbstractC0552a {

    /* renamed from: b */
    float f3790b;

    @Override // com.corrodinggames.rts.game.units.p028g.AbstractC0552a
    /* renamed from: b */
    public EnumC0554b mo3178b() {
        return EnumC0554b.movementSpeed;
    }

    @Override // com.corrodinggames.rts.game.units.p028g.AbstractC0552a
    /* renamed from: a */
    public void mo3180a(AbstractC0629y abstractC0629y, GameOutputStream gameOutputStream) {
        gameOutputStream.writeFloat(this.f3790b);
        super.mo3180a(abstractC0629y, gameOutputStream);
    }

    @Override // com.corrodinggames.rts.game.units.p028g.AbstractC0552a
    /* renamed from: a */
    public void mo3179a(AbstractC0629y abstractC0629y, GameInputStream gameInputStream) {
        this.f3790b = gameInputStream.readFloat();
        super.mo3179a(abstractC0629y, gameInputStream);
    }
}