package com.corrodinggames.rts.gameFramework;

import android.content.res.AssetFileDescriptor;
import android.media.MediaPlayer;
import com.corrodinggames.rts.gameFramework.file.C0765a;
import com.corrodinggames.rts.gameFramework.utility.C1110ae;
import com.corrodinggames.rts.gameFramework.utility.C1133j;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/* renamed from: com.corrodinggames.rts.gameFramework.ap */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/ap.class */
public class C0659ap extends AbstractC0664as {

    /* renamed from: a */
    MediaPlayer f4243a;

    /* renamed from: b */
    C0658ao f4244b;

    /* renamed from: c */
    C0657an f4245c;

    public C0659ap(C0657an c0657an) {
        this.f4245c = c0657an;
        if (c0657an.f4239b.size() == 0) {
            throw new RuntimeException("Music player pool empty");
        }
        MediaPlayer mediaPlayer = (MediaPlayer) c0657an.f4239b.remove(0);
        c0657an.f4240c.add(this);
        this.f4243a = mediaPlayer;
    }

    @Override // com.corrodinggames.rts.gameFramework.AbstractC0664as
    /* renamed from: a */
    public void mo89a(AbstractC0663ar abstractC0663ar) {
        this.f4244b = (C0658ao) abstractC0663ar;
    }

    @Override // com.corrodinggames.rts.gameFramework.AbstractC0664as
    /* renamed from: a */
    public void mo88a(boolean z) {
        try {
            MediaPlayer mediaPlayer = this.f4243a;
            mediaPlayer.reset();
            AssetFileDescriptor assetFileDescriptor = null;
            if (this.f4244b.f4249b.startsWith("music")) {
                try {
                    assetFileDescriptor = this.f4245c.f4248e.f4218w.mo5302d().m5287b(C0765a.m2283e(this.f4244b.f4249b));
                    mediaPlayer.setDataSource(assetFileDescriptor.getFileDescriptor(), assetFileDescriptor.getStartOffset(), assetFileDescriptor.getLength());
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            } else {
                String m2283e = C0765a.m2283e(this.f4244b.f4249b);
                if (C1110ae.m630a(m2283e) == null) {
                    mediaPlayer.setDataSource(m2283e);
                } else {
                    C1133j m2276k = C0765a.m2276k(m2283e);
                    if (m2276k == null) {
                        throw new RuntimeException("openAssetSteam() null for '" + m2283e + "'");
                    }
                    File m2303a = C0765a.m2303a(this.f4245c.f4248e.f4218w, "music", "ogg");
                    GameEngine.m5777e("Temp file needed for this music from zipped/abstract mod file");
                    FileOutputStream fileOutputStream = new FileOutputStream(m2303a);
                    C0773f.m2192a(m2276k, fileOutputStream);
                    fileOutputStream.close();
                    m2276k.close();
                    FileInputStream fileInputStream = new FileInputStream(m2303a);
                    try {
                        mediaPlayer.setDataSource(fileInputStream.getFD(), 0L, fileInputStream.available());
                        fileInputStream.close();
                        m2303a.delete();
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
        } catch (Exception e2) {
            throw new RuntimeException(e2);
        }
    }

    @Override // com.corrodinggames.rts.gameFramework.AbstractC0664as
    /* renamed from: a */
    public void mo91a() {
        this.f4243a.pause();
    }

    @Override // com.corrodinggames.rts.gameFramework.AbstractC0664as
    /* renamed from: b */
    public void mo87b() {
        this.f4243a.start();
    }

    @Override // com.corrodinggames.rts.gameFramework.AbstractC0664as
    /* renamed from: c */
    public boolean mo86c() {
        return this.f4243a.isPlaying();
    }

    @Override // com.corrodinggames.rts.gameFramework.AbstractC0664as
    /* renamed from: d */
    public void mo85d() {
        if (this.f4243a != null) {
            this.f4243a.stop();
        }
    }

    @Override // com.corrodinggames.rts.gameFramework.AbstractC0664as
    /* renamed from: e */
    public void mo84e() {
        if (this.f4243a != null) {
            this.f4243a.stop();
        }
        this.f4243a = null;
        this.f4245c.f4240c.remove(this);
        this.f4245c.f4239b.add(this.f4243a);
    }

    @Override // com.corrodinggames.rts.gameFramework.AbstractC0664as
    /* renamed from: a */
    public void mo90a(float f) {
        this.f4243a.setVolume(f, f);
    }
}