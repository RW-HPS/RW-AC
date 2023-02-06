package com.corrodinggames.rts.java.steam;

import com.codedisaster.steamworks.SteamPublishedFileID;
import com.codedisaster.steamworks.SteamResult;
import com.corrodinggames.rts.gameFramework.GameEngine;

/* renamed from: com.corrodinggames.rts.java.c.i */
/* loaded from: game-lib.jar:com/corrodinggames/rts/java/c/i.class */
public class SteamPublicData_1 {
    SteamPublishedFileID a;
    Runnable b;

    public void a(SteamResult steamResult) {
        GameEngine.print("PendingDownload onFinish for: " + this.a);
        if (this.b != null) {
            this.b.run();
        }
    }
}