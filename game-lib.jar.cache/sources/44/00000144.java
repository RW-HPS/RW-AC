package com.corrodinggames.rts.appFramework;

import android.app.Activity;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import java.util.ArrayList;
import java.util.Collections;

/* loaded from: game-lib.jar:com/corrodinggames/rts/appFramework/j.class */
public class j extends b {
    String[] c;

    @Override // android.app.Activity
    public void b() {
        super.b();
        c.a((Activity) this, true);
    }

    public static String[] l() {
        String[] a = com.corrodinggames.rts.gameFramework.file.a.a("/SD/rustedWarfare/saves/", false);
        if (a == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (String str : a) {
            if (!str.endsWith(".map") && !str.endsWith(".tmp")) {
                arrayList.add(str);
            }
        }
        Collections.sort(arrayList, new k());
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