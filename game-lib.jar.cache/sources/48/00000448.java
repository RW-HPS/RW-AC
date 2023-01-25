package com.corrodinggames.rts.gameFramework;

import com.corrodinggames.rts.gameFramework.net.GameInputStream;
import com.corrodinggames.rts.gameFramework.net.GameOutputStream;

/* renamed from: com.corrodinggames.rts.gameFramework.az */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/az.class */
public abstract class AbstractC0674az extends AbstractC1155w {

    /* renamed from: ex */
    public int f4265ex;

    protected AbstractC0674az(boolean z) {
        super(z);
        this.f4265ex = 0;
    }

    @Override // com.corrodinggames.rts.gameFramework.AbstractC1155w, com.corrodinggames.rts.gameFramework.AbstractC0741bq
    /* renamed from: a */
    public void mo442a(GameOutputStream gameOutputStream) {
        gameOutputStream.mo1368d("xy is:");
        gameOutputStream.writeFloat(this.f7172eo);
        gameOutputStream.writeFloat(this.f7173ep);
        gameOutputStream.writeFloat(this.f7174eq);
        gameOutputStream.writeInt(this.f4265ex);
        super.mo442a(gameOutputStream);
    }

    @Override // com.corrodinggames.rts.gameFramework.AbstractC1155w
    /* renamed from: a */
    public void mo441a(GameInputStream gameInputStream) {
        this.f7172eo = gameInputStream.readFloat();
        this.f7173ep = gameInputStream.readFloat();
        this.f7174eq = gameInputStream.readFloat();
        this.f4265ex = gameInputStream.readInt();
        super.mo441a(gameInputStream);
    }
}