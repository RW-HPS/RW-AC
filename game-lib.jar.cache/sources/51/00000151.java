package com.corrodinggames.rts.appFramework;

import android.app.Activity;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import com.corrodinggames.rts.gameFramework.GameEngine;
import java.util.ArrayList;
import java.util.Collections;

/* loaded from: game-lib.jar:com/corrodinggames/rts/appFramework/q.class */
public class q extends b {
    String[] c;

    @Override // android.app.Activity
    public void b() {
        super.b();
        c.a((Activity) this, true);
    }

    public static String[] l() {
        String[] h = com.corrodinggames.rts.gameFramework.file.a.h("/SD/rustedWarfare/replays/");
        if (h == null) {
            GameEngine.m5e("failed to find replay folder");
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (String str : h) {
            if (!str.endsWith(".map")) {
                arrayList.add(str);
            }
        }
        Collections.sort(arrayList, new r());
        return (String[]) arrayList.toArray(new String[0]);
    }

    @Override // android.app.Activity, android.view.View.OnCreateContextMenuListener
    public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        super.onCreateContextMenu(contextMenu, view, contextMenuInfo);
        contextMenu.setHeaderTitle(((Button) view).getText());
        contextMenu.add(0, view.getId(), 0, "Share");
        contextMenu.add(1, view.getId(), 0, "Rename");
        contextMenu.add(2, view.getId(), 0, "Delete");
        if (this.c != null && this.c.length > 0) {
            MenuItem add = contextMenu.add(3, view.getId(), 0, "Storage: " + com.corrodinggames.rts.gameFramework.file.a.n(this.c[view.getId()]));
            if (add != null) {
                add.setEnabled(false);
            }
        }
    }
}