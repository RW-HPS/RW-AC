package com.corrodinggames.rts.game.units.custom;

import com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope;
import com.corrodinggames.rts.gameFramework.GameEngine;
import java.util.ArrayList;

/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/bb.class */
public class bb {
    public static final bb a = a(VariableScope.nullOrMissingString);
    public bc[] b;
    public String c;
    public int d = -1;
    public String e;

    public static bb a(String str) {
        bb bbVar = new bb();
        ArrayList arrayList = new ArrayList();
        bc bcVar = new bc();
        bcVar.a = null;
        bcVar.b = str;
        arrayList.add(bcVar);
        bbVar.b = (bc[]) arrayList.toArray(new bc[0]);
        bbVar.b();
        return bbVar;
    }

    public static bb b(String str) {
        bb bbVar = new bb();
        bbVar.e = str;
        bbVar.b();
        return bbVar;
    }

    public bb() {
    }

    public bb(bc[] bcVarArr) {
        this.b = bcVarArr;
    }

    public boolean a() {
        bc[] bcVarArr;
        if (this.b != null) {
            for (bc bcVar : this.b) {
                if (bcVar.b != null && !VariableScope.nullOrMissingString.equals(bcVar.b)) {
                    return false;
                }
            }
            return true;
        }
        return true;
    }

    public void a(String str, String str2) {
        if (this.b != null) {
            for (bc bcVar : this.b) {
                bcVar.a(str, str2);
            }
        } else {
            GameEngine.print("LocaleString: replaceAll with null strings");
        }
        this.d = -1;
    }

    public String b() {
        bc[] bcVarArr;
        bc[] bcVarArr2;
        if (this.d == com.corrodinggames.rts.gameFramework.translations.a.c) {
            return this.c;
        }
        if (this.e != null) {
            this.d = com.corrodinggames.rts.gameFramework.translations.a.c;
            this.c = com.corrodinggames.rts.gameFramework.translations.a.a(this.e, new Object[0]);
            return this.c;
        }
        String c = com.corrodinggames.rts.gameFramework.translations.a.c();
        for (bc bcVar : this.b) {
            if (c.equals(bcVar.a)) {
                this.d = com.corrodinggames.rts.gameFramework.translations.a.c;
                this.c = bcVar.b;
                return this.c;
            }
        }
        for (bc bcVar2 : this.b) {
            if (bcVar2.a == null) {
                this.d = com.corrodinggames.rts.gameFramework.translations.a.c;
                this.c = bcVar2.b;
                return this.c;
            }
        }
        this.d = com.corrodinggames.rts.gameFramework.translations.a.c;
        this.c = "<NO DEFAULT TEXT FOUND>";
        return this.c;
    }
}