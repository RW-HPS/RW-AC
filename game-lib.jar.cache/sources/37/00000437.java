package com.corrodinggames.rts.gameFramework;

import android.media.MediaPlayer;
import java.util.ArrayList;

/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/an.class */
public class an extends aq {

    /* renamed from: a  reason: collision with root package name */
    ArrayList f406a = new ArrayList();
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
            GameEngine.m328e("AndroidMusicFactory already loaded");
        }
        GameEngine.m328e("AndroidMusicFactory - load");
        this.d = true;
        this.f406a.add(new MediaPlayer());
        this.f406a.add(new MediaPlayer());
        this.b.addAll(this.f406a);
    }

    @Override // com.corrodinggames.rts.gameFramework.aq
    public void b() {
    }
}