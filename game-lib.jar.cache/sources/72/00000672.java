package com.corrodinggames.rts.java.steam;

import com.codedisaster.steamworks.SteamPublishedFileID;
import com.codedisaster.steamworks.SteamResult;
import com.corrodinggames.rts.gameFramework.GameEngine;

/* renamed from: com.corrodinggames.rts.java.c.i */
/* loaded from: game-lib.jar:com/corrodinggames/rts/java/c/i.class */
public class SteamPublicData_1 {

    /* renamed from: a */
    SteamPublishedFileID f7346a;

    /* renamed from: b */
    Runnable f7347b;

    /* renamed from: a */
    public void m259a(SteamResult steamResult) {
        GameEngine.print("PendingDownload onFinish for: " + this.f7346a);
        if (this.f7347b != null) {
            this.f7347b.run();
        }
    }
}