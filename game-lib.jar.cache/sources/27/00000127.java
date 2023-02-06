package com.corrodinggames.rts.appFramework;

import android.app.Activity;
import java.util.ArrayList;

/* loaded from: game-lib.jar:com/corrodinggames/rts/appFramework/b.class */
public class b extends Activity {
    ArrayList b = new ArrayList();

    public void a(Runnable runnable) {
        synchronized (this.b) {
            this.b.add(runnable);
        }
    }
}