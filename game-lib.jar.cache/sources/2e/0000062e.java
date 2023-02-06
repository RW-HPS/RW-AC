package com.corrodinggames.rts.gameFramework;

import android.content.Context;
import com.corrodinggames.rts.game.EngineLoad;

/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/v.class */
public class v extends o {
    @Override // com.corrodinggames.rts.gameFramework.o
    public GameEngine a(Context context) {
        return new EngineLoad(context);
    }
}