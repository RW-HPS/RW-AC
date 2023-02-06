package com.corrodinggames.rts.gameFramework;

import android.media.MediaPlayer;
import java.util.ArrayList;

/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/an.class */
public class an extends aq {
    ArrayList a = new ArrayList();
    ArrayList b = new ArrayList();
    ArrayList c = new ArrayList();
    boolean d = false;

    @Override // com.corrodinggames.rts.gameFramework.aq
    public ar a(String str) {
        return new ao(str, this);
    }

    @Override // com.corrodinggames.rts.gameFramework.aq
    public as a() {
        return new ap(this);
    }

    @Override // com.corrodinggames.rts.gameFramework.aq
    public void a(am amVar) {
        this.e = amVar;
        if (this.d) {
            GameEngine.m5e("AndroidMusicFactory already loaded");
        }
        GameEngine.m5e("AndroidMusicFactory - load");
        this.d = true;
        this.a.add(new MediaPlayer());
        this.a.add(new MediaPlayer());
        this.b.addAll(this.a);
    }

    @Override // com.corrodinggames.rts.gameFramework.aq
    public void b() {
    }
}