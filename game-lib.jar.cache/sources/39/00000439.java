package com.corrodinggames.rts.gameFramework;

import android.content.res.AssetFileDescriptor;
import android.media.MediaPlayer;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/ap.class */
public class ap extends as {
    MediaPlayer a;
    ao b;
    an c;

    public ap(an anVar) {
        this.c = anVar;
        if (anVar.b.size() == 0) {
            throw new RuntimeException("Music player pool empty");
        }
        MediaPlayer mediaPlayer = (MediaPlayer) anVar.b.remove(0);
        anVar.c.add(this);
        this.a = mediaPlayer;
    }

    @Override // com.corrodinggames.rts.gameFramework.as
    public void a(ar arVar) {
        this.b = (ao) arVar;
    }

    @Override // com.corrodinggames.rts.gameFramework.as
    public void a(boolean z) {
        try {
            MediaPlayer mediaPlayer = this.a;
            mediaPlayer.reset();
            AssetFileDescriptor assetFileDescriptor = null;
            if (this.b.b.startsWith("music")) {
                try {
                    assetFileDescriptor = this.c.e.w.d().b(com.corrodinggames.rts.gameFramework.file.a.e(this.b.b));
                    mediaPlayer.setDataSource(assetFileDescriptor.getFileDescriptor(), assetFileDescriptor.getStartOffset(), assetFileDescriptor.getLength());
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            } else {
                String e2 = com.corrodinggames.rts.gameFramework.file.a.e(this.b.b);
                if (com.corrodinggames.rts.gameFramework.utility.ae.a(e2) == null) {
                    mediaPlayer.setDataSource(e2);
                } else {
                    com.corrodinggames.rts.gameFramework.utility.j k = com.corrodinggames.rts.gameFramework.file.a.k(e2);
                    if (k == null) {
                        throw new RuntimeException("openAssetSteam() null for '" + e2 + "'");
                    }
                    File a = com.corrodinggames.rts.gameFramework.file.a.a(this.c.e.w, "music", "ogg");
                    GameEngine.m5e("Temp file needed for this music from zipped/abstract mod file");
                    FileOutputStream fileOutputStream = new FileOutputStream(a);
                    f.a(k, fileOutputStream);
                    fileOutputStream.close();
                    k.close();
                    FileInputStream fileInputStream = new FileInputStream(a);
                    try {
                        mediaPlayer.setDataSource(fileInputStream.getFD(), 0L, fileInputStream.available());
                        fileInputStream.close();
                        a.delete();
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
        this.a.pause();
    }

    @Override // com.corrodinggames.rts.gameFramework.as
    public void b() {
        this.a.start();
    }

    @Override // com.corrodinggames.rts.gameFramework.as
    public boolean c() {
        return this.a.isPlaying();
    }

    @Override // com.corrodinggames.rts.gameFramework.as
    public void d() {
        if (this.a != null) {
            this.a.stop();
        }
    }

    @Override // com.corrodinggames.rts.gameFramework.as
    public void e() {
        if (this.a != null) {
            this.a.stop();
        }
        this.a = null;
        this.c.c.remove(this);
        this.c.b.add(this.a);
    }

    @Override // com.corrodinggames.rts.gameFramework.as
    public void a(float f) {
        this.a.setVolume(f, f);
    }
}