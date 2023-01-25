package com.corrodinggames.rts.game;

import android.graphics.Bitmap;
import java.io.File;
import java.io.FileOutputStream;

/* renamed from: com.corrodinggames.rts.game.k */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/k.class */
class RunnableC0194k implements Runnable {

    /* renamed from: a */
    public Bitmap f1287a;

    /* renamed from: b */
    public int f1288b;

    /* renamed from: c */
    final /* synthetic */ C0191i f1289c;

    @Override // java.lang.Runnable
    public void run() {
        synchronized (this) {
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(new File(this.f1289c.f1225h + "image_" + String.format("%07d", Integer.valueOf(this.f1288b)) + ".jpg"));
                this.f1287a.m5276a(Bitmap.CompressFormat.JPEG, 85, fileOutputStream);
                fileOutputStream.close();
            } catch (Exception e) {
                e.printStackTrace();
                this.f1289c.f6348bo = false;
                this.f1289c.m1065a("Error saving jpg, recording has stopped. Is there free space remaining on the SD card?", 1);
            }
        }
    }
}