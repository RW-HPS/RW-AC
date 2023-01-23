package com.corrodinggames.rts.gameFramework;

import android.content.res.AssetFileDescriptor;
import android.media.MediaPlayer;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/ap.class */
public class ap extends as {

    /* renamed from: a  reason: collision with root package name */
    MediaPlayer f408a;
    ao b;
    an c;

    public ap(an anVar) {
        this.c = anVar;
        if (anVar.b.size() == 0) {
            throw new RuntimeException("Music player pool empty");
        }
        MediaPlayer mediaPlayer = (MediaPlayer) anVar.b.remove(0);
        anVar.c.add(this);
        this.f408a = mediaPlayer;
    }

    @Override // com.corrodinggames.rts.gameFramework.as
    public void a(ar arVar) {
        this.b = (ao) arVar;
    }

    @Override // com.corrodinggames.rts.gameFramework.as
    public void a(boolean z) {
        try {
            MediaPlayer mediaPlayer = this.f408a;
            mediaPlayer.reset();
            AssetFileDescriptor assetFileDescriptor = null;
            if (this.b.b.startsWith("music")) {
                try {
                    assetFileDescriptor = this.c.e.w.d().b(com.corrodinggames.rts.gameFramework.e.a.e(this.b.b));
                    mediaPlayer.setDataSource(assetFileDescriptor.getFileDescriptor(), assetFileDescriptor.getStartOffset(), assetFileDescriptor.getLength());
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            } else {
                String e2 = com.corrodinggames.rts.gameFramework.e.a.e(this.b.b);
                if (com.corrodinggames.rts.gameFramework.utility.ae.a(e2) == null) {
                    mediaPlayer.setDataSource(e2);
                } else {
                    com.corrodinggames.rts.gameFramework.utility.j k = com.corrodinggames.rts.gameFramework.e.a.k(e2);
                    if (k == null) {
                        throw new RuntimeException("openAssetSteam() null for '" + e2 + "'");
                    }
                    File a2 = com.corrodinggames.rts.gameFramework.e.a.a(this.c.e.w, "music", "ogg");
                    GameEngine.m328e("Temp file needed for this music from zipped/abstract mod file");
                    FileOutputStream fileOutputStream = new FileOutputStream(a2);
                    f.a(k, fileOutputStream);
                    fileOutputStream.close();
                    k.close();
                    FileInputStream fileInputStream = new FileInputStream(a2);
                    try {
                        mediaPlayer.setDataSource(fileInputStream.getFD(), 0L, fileInputStream.available());
                        fileInputStream.close();
                        a2.delete();
                    } catch (Throwable th) {
                        fileInputStream.close();
                        throw th;
                    }
                }
            }
            if (z) {
                mediaPlayer.setLooping(true);
            }
            mediaPlayer.setVolume(0.0f, 0.0f);
            mediaPlayer.setOnInfoListener(new MediaPlayer.OnInfoListener() { // from class: com.corrodinggames.rts.gameFramework.ap.1
                @Override // android.media.MediaPlayer.OnInfoListener
                public boolean onInfo(MediaPlayer mediaPlayer2, int i, int i2) {
                    return true;
                }
            });
            mediaPlayer.setOnPreparedListener(new MediaPlayer.OnPreparedListener() { // from class: com.corrodinggames.rts.gameFramework.ap.2
                @Override // android.media.MediaPlayer.OnPreparedListener
                public void onPrepared(MediaPlayer mediaPlayer2) {
                    mediaPlayer2.start();
                }
            });
            mediaPlayer.prepareAsync();
            if (assetFileDescriptor != null) {
                assetFileDescriptor.close();
            }
        } catch (Exception e3) {
            throw new RuntimeException(e3);
        }
    }

    @Override // com.corrodinggames.rts.gameFramework.as
    public void a() {
        this.f408a.pause();
    }

    @Override // com.corrodinggames.rts.gameFramework.as
    public void b() {
        this.f408a.start();
    }

    @Override // com.corrodinggames.rts.gameFramework.as
    public boolean c() {
        return this.f408a.isPlaying();
    }

    @Override // com.corrodinggames.rts.gameFramework.as
    public void d() {
        if (this.f408a != null) {
            this.f408a.stop();
        }
    }

    @Override // com.corrodinggames.rts.gameFramework.as
    public void e() {
        if (this.f408a != null) {
            this.f408a.stop();
        }
        this.f408a = null;
        this.c.c.remove(this);
        this.c.b.add(this.f408a);
    }

    @Override // com.corrodinggames.rts.gameFramework.as
    public void a(float f) {
        this.f408a.setVolume(f, f);
    }
}