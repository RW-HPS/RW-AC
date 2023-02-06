package com.corrodinggames.rts.gameFramework.l;

import com.corrodinggames.rts.gameFramework.GameEngine;
import java.io.File;

/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/l/c.class */
public class c {
    public String a() {
        return null;
    }

    public boolean b() {
        return true;
    }

    public void a(File file) {
        GameEngine.m5e("PlatformExtensionBackend:shareFile");
        GameEngine.m5e("abstract shareFile:" + file.getPath());
    }

    public void a(b bVar) {
    }

    public float c() {
        return 0.0f;
    }
}