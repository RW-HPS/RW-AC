package com.corrodinggames.rts.gameFramework.utility;

import android.content.Context;
import android.content.res.AssetManager;
import com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope;
import com.corrodinggames.rts.gameFramework.GameEngine;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/utility/i.class */
public final class i {
    private ArrayList c;
    public Context a;
    boolean b = true;

    public i(Context context) {
        this.a = context;
        a();
    }

    public void a() {
        new Thread() { // from class: com.corrodinggames.rts.gameFramework.utility.i.1
            @Override // java.lang.Thread, java.lang.Runnable
            public void run() {
                i.this.b();
            }
        }.start();
    }

    public void b() {
        synchronized (this) {
            if (this.c != null) {
                return;
            }
            AssetManager d = this.a.d();
            ArrayList arrayList = new ArrayList();
            try {
                GameEngine.m5e("------- createIndex -------");
                arrayList.addAll(a(d, VariableScope.nullOrMissingString, 1));
                this.c = arrayList;
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public ArrayList a(AssetManager assetManager, String str, int i) {
        ArrayList arrayList = new ArrayList();
        String[] c = assetManager.c(str);
        if (str.length() > 0) {
            str = str + "/";
        }
        if (i > 140) {
            throw new RuntimeException("dirLevel>140 for: " + str);
        }
        GameEngine.m5e("c:" + str);
        for (String str2 : c) {
            String str3 = str + str2;
            boolean z = false;
            if (!str2.contains(".")) {
                z = true;
            }
            if (!str2.equals(".") && !str2.equals("..") && !str2.equals(VariableScope.nullOrMissingString)) {
                arrayList.add(str3);
                if (z) {
                    arrayList.addAll(a(assetManager, str3, i + 1));
                }
            }
        }
        return arrayList;
    }

    public ArrayList c() {
        if (this.c != null) {
            if (this.b) {
                GameEngine.m5e("assetIndex: getFile was not blocked on load");
                this.b = false;
            }
            return this.c;
        }
        GameEngine.V();
        b();
        if (this.b) {
            GameEngine.m5e("assetIndex: getFile is BLOCKED on load");
            this.b = false;
        }
        return this.c;
    }

    public boolean a(String str) {
        if (str.endsWith(File.separator)) {
            str = str.substring(0, str.length() - 1);
        }
        String replace = str.replace("//", "/");
        Iterator it = c().iterator();
        while (it.hasNext()) {
            if (((String) it.next()).equals(replace)) {
                return true;
            }
        }
        return false;
    }

    public String[] b(String str) {
        ArrayList arrayList = new ArrayList();
        String str2 = str;
        if (str2.endsWith(File.separator)) {
            str2 = str2.substring(0, str2.length() - 1);
        }
        int i = 0;
        Iterator it = c().iterator();
        while (it.hasNext()) {
            String str3 = (String) it.next();
            if (str3.startsWith(str2)) {
                String substring = str3.substring(str2.length());
                if (substring.length() != 0 && substring.charAt(0) == File.separatorChar && substring.indexOf(File.separator, 1) == -1) {
                    i++;
                    arrayList.add(str3.substring((str2 + "/").length()));
                }
            }
        }
        return (String[]) arrayList.toArray(new String[0]);
    }
}