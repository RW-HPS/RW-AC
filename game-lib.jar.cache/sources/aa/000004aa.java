package com.corrodinggames.rts.gameFramework.e;

import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/e/h.class */
public class h {

    /* renamed from: a  reason: collision with root package name */
    public InputStream f480a;

    public h(InputStream inputStream) {
        this.f480a = inputStream;
    }

    public void a() {
        try {
            if (this.f480a != null) {
                this.f480a.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}