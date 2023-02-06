package com.corrodinggames.rts.game.units.custom;

import com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope;
import java.util.ArrayList;

/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/z.class */
public class z {
    public String a;
    public ay[] b;
    final /* synthetic */ l c;

    public boolean a() {
        return (this.b == null || this.b.length == 0) ? false : true;
    }

    public boolean b() {
        return this.b != null && (this.b.length != 0 || this.b == l.gf);
    }

    private z(l lVar, String str) {
        this.c = lVar;
        this.a = str;
        lVar.gc.add(this);
    }

    public void c() {
        if (this.a == null || this.a.equals(VariableScope.nullOrMissingString)) {
            this.b = l.ge;
        } else if (this.a.equalsIgnoreCase("NONE")) {
            this.b = l.gf;
        } else {
            ArrayList arrayList = new ArrayList();
            for (String str : this.a.split(",")) {
                String[] split = str.trim().split("\\*");
                String str2 = split[0];
                int i = 1;
                if (split.length >= 2) {
                    i = Integer.parseInt(split[1]);
                }
                ay d = this.c.d(str2);
                for (int i2 = 0; i2 < i; i2++) {
                    arrayList.add(d);
                }
            }
            this.b = (ay[]) arrayList.toArray(l.ge);
        }
    }

    public com.corrodinggames.rts.gameFramework.emitter.e a(float f, float f2, float f3, float f4, com.corrodinggames.rts.gameFramework.w wVar) {
        return a(f, f2, f3, f4, wVar, 0, (short) 0);
    }

    public com.corrodinggames.rts.gameFramework.emitter.e a(float f, float f2, float f3, float f4, com.corrodinggames.rts.gameFramework.w wVar, int i, short s) {
        com.corrodinggames.rts.gameFramework.emitter.e eVar = null;
        for (ay ayVar : this.b) {
            com.corrodinggames.rts.gameFramework.emitter.e a = ayVar.a(f, f2, f3, f4, wVar, i, s);
            if (a != null && eVar == null) {
                eVar = a;
            }
        }
        return eVar;
    }
}