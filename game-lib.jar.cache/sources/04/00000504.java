package com.corrodinggames.rts.gameFramework.net;

import android.text.Html;
import android.text.Spanned;
import com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope;
import com.corrodinggames.rts.gameFramework.C0773f;
import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;

/* renamed from: com.corrodinggames.rts.gameFramework.j.a */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/j/a.class */
public class C0862a {

    /* renamed from: a */
    private ConcurrentLinkedQueue f5681a = new ConcurrentLinkedQueue();

    /* renamed from: a */
    public String m1636a(String str) {
        return C0773f.m2111i(str);
    }

    /* renamed from: a */
    public void m1638a(int i, String str, String str2, PlayerConnect playerConnect) {
        this.f5681a.add(new C0902b(this, i, str, str2.trim(), playerConnect));
        if (this.f5681a.size() > 45) {
            this.f5681a.poll();
        }
    }

    /* renamed from: a */
    public int m1637a(PlayerConnect playerConnect, int i) {
        if (playerConnect == null) {
            return 0;
        }
        int i2 = playerConnect.connectIndex;
        int i3 = 0;
        Iterator it = this.f5681a.iterator();
        while (it.hasNext()) {
            C0902b c0902b = (C0902b) it.next();
            if (c0902b.f5977d == i2 && C0773f.m2205a(c0902b.f5978e, System.nanoTime()) < i && !c0902b.f5976c.startsWith("-i ") && !c0902b.f5976c.startsWith("-qc ")) {
                i3++;
                if (c0902b.f5976c != null) {
                    if (C0773f.m2185a(c0902b.f5976c, '\n') >= 3) {
                        i3 += 2;
                    }
                    if (C0773f.m2185a(c0902b.f5976c, '\n') >= 6) {
                        i3 += 2;
                    }
                    if (C0773f.m2185a(c0902b.f5976c, '\n') >= 9) {
                        i3 += 2;
                    }
                }
            }
        }
        return i3;
    }

    /* renamed from: a */
    public String m1639a() {
        Iterator it;
        String str = VariableScope.nullOrMissingString;
        while (this.f5681a.iterator().hasNext()) {
            str = str + ((C0902b) it.next()).m1362a() + "\n";
        }
        return str;
    }

    /* renamed from: b */
    public ConcurrentLinkedQueue m1634b() {
        return this.f5681a;
    }

    /* renamed from: a */
    public String m1635a(boolean z) {
        Iterator it;
        Iterator it2;
        String str = VariableScope.nullOrMissingString;
        if (!z) {
            while (this.f5681a.iterator().hasNext()) {
                str = str + ((C0902b) it2.next()).m1361b() + "<br/>\n";
            }
        } else {
            while (this.f5681a.iterator().hasNext()) {
                str = ((C0902b) it.next()).m1361b() + "<br/>\n" + str;
            }
        }
        return "<pre>" + str + "</pre>";
    }

    /* renamed from: b */
    public Spanned m1633b(boolean z) {
        return Html.fromHtml(m1635a(z));
    }

    /* renamed from: c */
    public void m1632c() {
        this.f5681a.clear();
    }
}