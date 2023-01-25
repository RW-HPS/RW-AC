package com.corrodinggames.rts.gameFramework.file;

import java.io.IOException;
import java.io.InputStream;

/* renamed from: com.corrodinggames.rts.gameFramework.e.h */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/e/h.class */
class C0772h {

    /* renamed from: a */
    public InputStream f4968a;

    public C0772h(InputStream inputStream) {
        this.f4968a = inputStream;
    }

    /* renamed from: a */
    public void m2224a() {
        try {
            if (this.f4968a != null) {
                this.f4968a.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}