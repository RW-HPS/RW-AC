package com.corrodinggames.rts.game;

import android.graphics.Bitmap;
import java.io.File;
import java.io.FileOutputStream;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/k.class */
public class k implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public Bitmap f163a;
    public int b;
    final /* synthetic */ i c;

    @Override // java.lang.Runnable
    public void run() {
        synchronized (this) {
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(new File(this.c.h + "image_" + String.format("%07d", Integer.valueOf(this.b)) + ".jpg"));
                this.f163a.a(Bitmap.CompressFormat.JPEG, 85, fileOutputStream);
                fileOutputStream.close();
            } catch (Exception e) {
                e.printStackTrace();
                this.c.bo = false;
                this.c.a("Error saving jpg, recording has stopped. Is there free space remaining on the SD card?", 1);
            }
        }
    }
}