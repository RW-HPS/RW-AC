package com.corrodinggames.rts.gameFramework;

import com.corrodinggames.rts.gameFramework.net.GameInputStream;
import com.corrodinggames.rts.gameFramework.net.GameOutputStream;

/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/az.class */
public abstract class az extends w {
    public int ex;

    /* JADX INFO: Access modifiers changed from: protected */
    public az(boolean z) {
        super(z);
        this.ex = 0;
    }

    @Override // com.corrodinggames.rts.gameFramework.w, com.corrodinggames.rts.gameFramework.bq
    public void a(GameOutputStream gameOutputStream) {
        gameOutputStream.d("xy is:");
        gameOutputStream.writeFloat(this.eo);
        gameOutputStream.writeFloat(this.ep);
        gameOutputStream.writeFloat(this.eq);
        gameOutputStream.writeInt(this.ex);
        super.a(gameOutputStream);
    }

    @Override // com.corrodinggames.rts.gameFramework.w
    public void a(GameInputStream gameInputStream) {
        this.eo = gameInputStream.readFloat();
        this.ep = gameInputStream.readFloat();
        this.eq = gameInputStream.readFloat();
        this.ex = gameInputStream.readInt();
        super.a(gameInputStream);
    }
}