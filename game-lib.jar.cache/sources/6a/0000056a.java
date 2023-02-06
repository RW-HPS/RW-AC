package com.corrodinggames.rts.gameFramework.unitAction;

import android.graphics.Paint;
import com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope;
import com.corrodinggames.rts.gameFramework.FileChangeEngine;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.f;
import com.corrodinggames.rts.gameFramework.file.a;
import com.corrodinggames.rts.gameFramework.utility.j;
import java.io.IOException;
import java.util.Arrays;

/* renamed from: com.corrodinggames.rts.gameFramework.m.ae */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/m/ae.class */
public class ae {
    public String c;
    public String d;
    public String e;
    public String f;
    public int g;
    public int h;
    String i;
    String j;
    long k;
    long l;
    public boolean m;
    public int n;
    public int o;
    public af[] p;
    public Object q;
    public int r;
    int s;

    public void a(String str, float f) {
        a(str).a(f);
    }

    public void a(String str, float f, float f2) {
        a(str).a(f, f2);
    }

    public void a(String str, int i) {
        a(str).a(((i >> 16) & 255) * 0.003921569f, ((i >> 8) & 255) * 0.003921569f, (i & 255) * 0.003921569f, (i >>> 24) * 0.003921569f);
    }

    public void a(String str, e eVar) {
        a(str).a(eVar);
    }

    public void b(String str, e eVar) {
        a(str).b(eVar);
    }

    public af a(String str) {
        af[] afVarArr;
        for (af afVar : this.p) {
            if (afVar.a.equals(str)) {
                return afVar;
            }
        }
        af afVar2 = new af();
        afVar2.a = str;
        af[] afVarArr2 = (af[]) Arrays.copyOf(this.p, this.p.length + 1);
        afVarArr2[afVarArr2.length - 1] = afVar2;
        this.p = afVarArr2;
        return afVar2;
    }

    public ae(String str) {
        this.d = VariableScope.nullOrMissingString;
        this.p = new af[0];
        a(GameEngine.aY ? "assets/shaders/plainGDX.vert" : "assets/shaders/plain.vert", str);
    }

    public void a(String str, String str2) {
        this.c = f.g(str2);
        this.i = str;
        this.j = str2;
        d();
        e();
    }

    public ae() {
        this.d = VariableScope.nullOrMissingString;
        this.p = new af[0];
        this.c = "Invalid";
        this.o = 1;
    }

    public void d() {
        j k = a.k(this.i);
        if (k == null) {
            throw new IOException("Cannot find: " + this.i);
        }
        this.e = f.a(k);
        j k2 = a.k(this.j);
        if (k2 == null) {
            throw new IOException("Cannot find: " + this.j);
        }
        this.f = f.a(k2);
    }

    public void b(String str) {
        GameEngine.m5e("shader(" + this.c + "): " + str);
    }

    public void c(String str) {
        if (this.r < 3) {
            this.r++;
            GameEngine.p("shader(" + this.c + "): " + str);
        }
        GameEngine.a("shader(" + this.c + "): " + str);
        this.o = 1;
    }

    public boolean a() {
        return false;
    }

    public boolean b() {
        return false;
    }

    public boolean a(Paint paint, e eVar) {
        return false;
    }

    public boolean e() {
        long a = FileChangeEngine.a(this.i, false);
        long a2 = FileChangeEngine.a(this.j, false);
        boolean z = (a == this.k && a2 == this.l) ? false : true;
        this.k = a;
        this.l = a2;
        return z;
    }

    public void f() {
        af[] afVarArr;
        this.s++;
        if (this.s < 100) {
            return;
        }
        this.s = 0;
        if (e()) {
            b("Reloading shader");
            try {
                d();
                this.m = true;
                this.o = 0;
                for (af afVar : this.p) {
                    afVar.c = true;
                    afVar.b = -1;
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public void c() {
        GameEngine.getGameEngine().bO.a(this);
    }
}