package com.corrodinggames.rts.gameFramework.status;

import android.graphics.Color;
import android.graphics.Paint;
import com.corrodinggames.rts.game.PlayerData;
import com.corrodinggames.rts.game.b.f;
import com.corrodinggames.rts.game.units.ak;
import com.corrodinggames.rts.game.units.am;
import com.corrodinggames.rts.game.units.custom.bb;
import com.corrodinggames.rts.game.units.custom.bp;
import com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.net.GameNetEngine;
import com.corrodinggames.rts.gameFramework.utility.m;
import java.util.Iterator;

/* renamed from: com.corrodinggames.rts.gameFramework.n.a */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/n/a.class */
public class a {

    /* renamed from: a */
    public String f645a;
    public String b;
    public String c;
    public e g;
    public boolean h;
    public boolean i;
    public boolean j;
    public int k;
    public int l;
    public boolean m;
    public int p;
    public com.corrodinggames.rts.game.b.a t;
    public bp v;
    public float w;
    public float x;
    public PlayerData y;
    public bb z;
    public bb A;
    public Paint B;
    public boolean C;
    public b d = new b();
    public b e = new b();
    public m f = new m();
    public int n = -1;
    public int o = Integer.MAX_VALUE;
    public int q = -1;
    public int r = -1;
    public int s = -1;
    public boolean u = false;

    public void a(com.corrodinggames.rts.gameFramework.status.a.a aVar) {
        this.f.add(aVar);
    }

    public void a(String str) {
        this.t.b(str);
    }

    public String b(String str) {
        return this.t.b(str);
    }

    public String a(String str, String str2) {
        return this.t.a(str, str2);
    }

    public boolean c(String str) {
        return this.t.b(str) != null;
    }

    public int a(String str, int i) {
        String a2 = a(str, (String) null);
        if (a2 == null) {
            return i;
        }
        try {
            return Integer.parseInt(a2);
        } catch (NumberFormatException e) {
            throw f(str + ": Unexpected integer value:'" + a2 + "'");
        }
    }

    public int b(String str, int i) {
        double d;
        String b = b(str);
        if (b == null) {
            return i;
        }
        if (b.endsWith("ms")) {
            b = b.substring(0, b.length() - 2);
            d = 1.0d;
        } else if (b.endsWith("s")) {
            b = b.substring(0, b.length() - 1);
            d = 1000.0d;
        } else {
            d = 1.0d;
        }
        try {
            return (int) (Double.parseDouble(b) * d);
        } catch (NumberFormatException e) {
            e.printStackTrace();
            throw f(str + ": Unexpected time:'" + b + "'");
        }
    }

    public float a(String str, float f) {
        String a2 = a(str, (String) null);
        if (a2 == null) {
            return f;
        }
        try {
            return Float.parseFloat(a2);
        } catch (NumberFormatException e) {
            throw f(str + ": Unexpected float value:'" + a2 + "'");
        }
    }

    public Integer d(String str) {
        String a2 = a(str, (String) null);
        if (a2 == null) {
            return null;
        }
        try {
            return Integer.valueOf(Integer.parseInt(a2));
        } catch (NumberFormatException e) {
            throw f(str + ": Unexpected integer value:'" + a2 + "'");
        }
    }

    public Boolean e(String str) {
        String a2 = a(str, (String) null);
        if (a2 == null) {
            return null;
        }
        if (a2.equalsIgnoreCase("true")) {
            return true;
        }
        if (a2.equalsIgnoreCase("false")) {
            return false;
        }
        throw f(str + ": Unexpected boolean value:'" + a2 + "'");
    }

    public boolean a(String str, String str2, boolean z) {
        Boolean e = e(str);
        if (e != null) {
            return e.booleanValue();
        }
        Boolean e2 = e(str2);
        if (e2 != null) {
            return e2.booleanValue();
        }
        return z;
    }

    public boolean a(String str, boolean z) {
        String a2 = a(str, (String) null);
        if (a2 == null) {
            return z;
        }
        if (a2.equalsIgnoreCase("true")) {
            return true;
        }
        if (a2.equalsIgnoreCase("false")) {
            return false;
        }
        throw f(str + ": Unexpected boolean value:'" + a2 + "'");
    }

    public int c(String str, int i) {
        String b = b(str);
        if (b == null) {
            return i;
        }
        if (b.equals(VariableScope.nullOrMissingString)) {
            throw f(str + ": Unknown color:" + b);
        }
        try {
            return Color.a(b);
        } catch (IllegalArgumentException e) {
            throw f(str + ": Unknown color:" + b);
        }
    }

    public bb a(String str, bb bbVar) {
        return this.t.a(str, bbVar);
    }

    public boolean a(am amVar) {
        return this.t.a(amVar);
    }

    public f f(String str) {
        return a(str, (Exception) null);
    }

    public f a(String str, Exception exc) {
        String str2 = "MapTrigger-Error (" + this.f645a + " id:" + this.b + "): " + str;
        GameNetEngine.g(str2);
        if (exc == null) {
            return new f(str2);
        }
        return new f(str2, exc);
    }

    public void g(String str) {
        GameNetEngine.g("MapTrigger-Error (" + this.f645a + " id:" + this.b + " type:" + this.g + "): " + str);
    }

    public void h(String str) {
        GameEngine.m2e("MapTrigger-Debug (" + this.b + " type:" + this.g + "): " + str);
    }

    public PlayerData a() {
        return this.y;
    }

    public int b() {
        return (int) this.t.j.d();
    }

    public int c() {
        return (int) this.t.j.e();
    }

    public boolean b(am amVar) {
        PlayerData a2 = a();
        if (a2 != null && amVar.bX != a2) {
            return false;
        }
        if (c("onlyIfEmpty") && amVar.cr() && (amVar instanceof ak) && ((ak) amVar).bB() > 0) {
            return false;
        }
        return true;
    }

    public boolean d() {
        boolean z;
        int i = GameEngine.getGameEngine().by;
        boolean z2 = true;
        boolean z3 = false;
        if (!this.m && this.r != -1) {
            if (this.r <= i) {
                z3 = true;
                this.m = true;
            } else {
                z2 = false;
            }
        }
        if (this.d.a()) {
            if (this.d.b()) {
                z3 = true;
            } else {
                z2 = false;
            }
        }
        if (this.f.f689a > 0) {
            Iterator it = this.f.iterator();
            while (it.hasNext()) {
                com.corrodinggames.rts.gameFramework.status.a.a aVar = (com.corrodinggames.rts.gameFramework.status.a.a) it.next();
                if (aVar.a(this)) {
                    if (aVar.b(this)) {
                        z3 = true;
                    } else {
                        z2 = false;
                    }
                }
            }
        }
        if (this.h) {
            z = z3 && z2;
        } else {
            z = z3;
            if (z2) {
                z = true;
            }
        }
        if (z) {
            if (this.n == -1) {
                this.n = i;
            }
            if (this.s <= 0 || i >= this.n + this.s) {
                return true;
            }
            return false;
        }
        this.n = -1;
        return false;
    }
}