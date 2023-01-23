package com.corrodinggames.rts.appFramework;

import android.net.Uri;

/* loaded from: game-lib.jar:com/corrodinggames/rts/appFramework/s.class */
public class s extends b {
    static boolean d = false;
    boolean c = true;
    int[] e = {100, 250, 500, 1000, 2000, 5000, 10000};
    d f = new d() { // from class: com.corrodinggames.rts.appFramework.s.1
    };

    public void l() {
        c.a(this, 9, true, "Select a Rusted Warfare Folder to use", Uri.parse("content://com.android.externalstorage.documents/document/primary%3A" + "rustedWarfare".replace("//", "%2F")));
    }
}