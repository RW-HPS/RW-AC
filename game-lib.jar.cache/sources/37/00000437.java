package com.corrodinggames.rts.gameFramework;

import android.media.MediaPlayer;
import java.util.ArrayList;

/* renamed from: com.corrodinggames.rts.gameFramework.an */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/an.class */
public class C0657an extends AbstractC0662aq {

    /* renamed from: a */
    ArrayList f4238a = new ArrayList();

    /* renamed from: b */
    ArrayList f4239b = new ArrayList();

    /* renamed from: c */
    ArrayList f4240c = new ArrayList();

    /* renamed from: d */
    boolean f4241d = false;

    @Override // com.corrodinggames.rts.gameFramework.AbstractC0662aq
    /* renamed from: a */
    public AbstractC0663ar mo97a(String str) {
        return new C0658ao(str, this);
    }

    @Override // com.corrodinggames.rts.gameFramework.AbstractC0662aq
    /* renamed from: a */
    public AbstractC0664as mo101a() {
        return new C0659ap(this);
    }

    @Override // com.corrodinggames.rts.gameFramework.AbstractC0662aq
    /* renamed from: a */
    public void mo98a(C0654am c0654am) {
        this.f4248e = c0654am;
        if (this.f4241d) {
            GameEngine.m5460e("AndroidMusicFactory already loaded");
        }
        GameEngine.m5460e("AndroidMusicFactory - load");
        this.f4241d = true;
        this.f4238a.add(new MediaPlayer());
        this.f4238a.add(new MediaPlayer());
        this.f4239b.addAll(this.f4238a);
    }

    @Override // com.corrodinggames.rts.gameFramework.AbstractC0662aq
    /* renamed from: b */
    public void mo96b() {
    }
}