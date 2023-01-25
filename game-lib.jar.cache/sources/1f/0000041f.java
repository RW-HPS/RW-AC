package com.corrodinggames.rts.gameFramework.p030a;

import android.content.Context;
import android.media.SoundPool;
import com.corrodinggames.rts.C0067R;
import com.corrodinggames.rts.gameFramework.C0773f;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.file.C0765a;
import com.corrodinggames.rts.gameFramework.utility.C1109ad;
import com.corrodinggames.rts.gameFramework.utility.C1133j;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.concurrent.LinkedBlockingQueue;

/* renamed from: com.corrodinggames.rts.gameFramework.a.a */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/a/a.class */
public class C0633a extends AbstractC0640h {

    /* renamed from: d */
    C0636d f4053d;

    /* renamed from: f */
    Context f4055f;

    /* renamed from: g */
    SoundPool f4056g;

    /* renamed from: a */
    LinkedBlockingQueue f4050a = new LinkedBlockingQueue();

    /* renamed from: b */
    final int f4051b = 15;

    /* renamed from: c */
    C1109ad f4052c = new C1109ad(15);

    /* renamed from: e */
    int f4054e = 1000;

    public C0633a() {
        for (int i = 0; i < 15; i++) {
            this.f4052c.m632a(new C0635c());
        }
    }

    @Override // com.corrodinggames.rts.gameFramework.p030a.AbstractC0640h
    /* renamed from: a */
    public void mo80a(Context context) {
        if (this.f4055f != null) {
            GameEngine.m5460e("AndroidSoundFactory:setContext context already set");
            return;
        }
        this.f4055f = context;
        this.f4056g = new SoundPool(16, 3, 0);
    }

    @Override // com.corrodinggames.rts.gameFramework.p030a.AbstractC0640h
    /* renamed from: a */
    public void mo82a() {
        if (this.f4053d != null) {
            throw new RuntimeException("soundThread!=null");
        }
        this.f4053d = new C0636d(this);
        this.f4053d.start();
    }

    @Override // com.corrodinggames.rts.gameFramework.p030a.AbstractC0640h
    /* renamed from: a */
    public AbstractC0641i mo81a(int i) {
        C0634b c0634b = new C0634b(this, C0773f.m2190a(C0067R.raw.class, i), this);
        c0634b.f4057a = this;
        c0634b.f4058b = this.f4056g.load(this.f4055f, i, 1);
        return c0634b;
    }

    @Override // com.corrodinggames.rts.gameFramework.p030a.AbstractC0640h
    /* renamed from: a */
    public AbstractC0641i mo79a(String str, C1133j c1133j, boolean z) {
        int load;
        C0633a c0633a = this;
        if (!z) {
            c0633a = null;
        }
        if (!c1133j.m544a()) {
            try {
                File m2303a = C0765a.m2303a(this.f4055f, "audio", "ogg");
                FileOutputStream fileOutputStream = new FileOutputStream(m2303a);
                C0773f.m2192a(c1133j, fileOutputStream);
                fileOutputStream.close();
                try {
                    c1133j.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
                FileInputStream fileInputStream = new FileInputStream(m2303a);
                try {
                    load = this.f4056g.load(fileInputStream.getFD(), 0L, fileInputStream.available(), 1);
                    fileInputStream.close();
                    m2303a.delete();
                } catch (Throwable th) {
                    fileInputStream.close();
                    throw th;
                }
            } catch (IOException e2) {
                e2.printStackTrace();
                return null;
            }
        } else {
            try {
                load = this.f4056g.load(c1133j.m543b(), 0L, c1133j.available(), 1);
                try {
                    c1133j.close();
                } catch (Exception e3) {
                    e3.printStackTrace();
                }
            } catch (IOException e4) {
                e4.printStackTrace();
                return null;
            }
        }
        C0634b c0634b = new C0634b(this, str, c0633a);
        c0634b.f4057a = this;
        c0634b.f4058b = load;
        return c0634b;
    }
}