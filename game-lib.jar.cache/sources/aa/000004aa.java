package com.corrodinggames.rts.gameFramework.file;

import java.io.IOException;
import java.io.InputStream;

/* renamed from: com.corrodinggames.rts.gameFramework.e.h */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/e/h.class */
class h {
    public InputStream a;

    public h(InputStream inputStream) {
        this.a = inputStream;
    }

    public void a() {
        try {
            if (this.a != null) {
                this.a.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}