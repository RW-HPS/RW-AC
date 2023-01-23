package com.corrodinggames.rts.gameFramework.net;

import android.text.Html;
import android.text.Spanned;
import com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope;
import com.corrodinggames.rts.gameFramework.f;
import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;

/* renamed from: com.corrodinggames.rts.gameFramework.j.a */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/j/a.class */
public class a {

    /* renamed from: a  reason: collision with root package name */
    private ConcurrentLinkedQueue f549a = new ConcurrentLinkedQueue();

    public String a(String str) {
        return f.i(str);
    }

    public void a(int i, String str, String str2, PlayerConnect playerConnect) {
        this.f549a.add(new b(this, i, str, str2.trim(), playerConnect));
        if (this.f549a.size() > 45) {
            this.f549a.poll();
        }
    }

    public int a(PlayerConnect playerConnect, int i) {
        if (playerConnect == null) {
            return 0;
        }
        int i2 = playerConnect.c;
        int i3 = 0;
        Iterator it = this.f549a.iterator();
        while (it.hasNext()) {
            b bVar = (b) it.next();
            if (bVar.d == i2 && f.a(bVar.e, System.nanoTime()) < i && !bVar.c.startsWith("-i ") && !bVar.c.startsWith("-qc ")) {
                i3++;
                if (bVar.c != null) {
                    if (f.a(bVar.c, '\n') >= 3) {
                        i3 += 2;
                    }
                    if (f.a(bVar.c, '\n') >= 6) {
                        i3 += 2;
                    }
                    if (f.a(bVar.c, '\n') >= 9) {
                        i3 += 2;
                    }
                }
            }
        }
        return i3;
    }

    public String a() {
        Iterator it;
        String str = VariableScope.nullOrMissingString;
        while (this.f549a.iterator().hasNext()) {
            str = str + ((b) it.next()).a() + "\n";
        }
        return str;
    }

    public ConcurrentLinkedQueue b() {
        return this.f549a;
    }

    public String a(boolean z) {
        Iterator it;
        Iterator it2;
        String str = VariableScope.nullOrMissingString;
        if (!z) {
            while (this.f549a.iterator().hasNext()) {
                str = str + ((b) it2.next()).b() + "<br/>\n";
            }
        } else {
            while (this.f549a.iterator().hasNext()) {
                str = ((b) it.next()).b() + "<br/>\n" + str;
            }
        }
        return "<pre>" + str + "</pre>";
    }

    public Spanned b(boolean z) {
        return Html.fromHtml(a(z));
    }

    public void c() {
        this.f549a.clear();
    }
}