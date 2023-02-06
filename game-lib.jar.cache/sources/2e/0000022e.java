package com.corrodinggames.rts.game.units.custom;

import com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBooleanLoader;
import com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope;
import java.util.ArrayList;

/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/aj.class */
public class aj {
    public static final aj a = a(VariableScope.nullOrMissingString);
    public ak[] b;
    public bc[] c;
    public String d;
    public int e = -1;
    public String f;
    public String g;
    l h;

    public static aj a(String str) {
        aj ajVar = new aj();
        ArrayList arrayList = new ArrayList();
        bc bcVar = new bc();
        bcVar.a = null;
        bcVar.b = str;
        arrayList.add(bcVar);
        ajVar.c = (bc[]) arrayList.toArray(new bc[0]);
        ajVar.a();
        return ajVar;
    }

    public static aj a(bb bbVar) {
        if (bbVar == null) {
            return null;
        }
        aj ajVar = new aj();
        ajVar.h = l.b;
        ajVar.c = bbVar.b;
        ajVar.f = bbVar.e;
        if (ajVar.c != null) {
            bc[] bcVarArr = ajVar.c;
            int length = bcVarArr.length;
            int i = 0;
            while (i < length) {
                bc bcVar = bcVarArr[i];
                i = (bcVar.b == null || bcVar.b.contains("%{")) ? i + 1 : i + 1;
            }
        }
        ajVar.c();
        return ajVar;
    }

    public aj() {
    }

    public aj(l lVar, bb bbVar) {
        bc[] bcVarArr;
        this.h = lVar;
        this.c = bbVar.b;
        this.f = bbVar.e;
        if (this.c != null) {
            for (bc bcVar : this.c) {
                if (bcVar.b != null && bcVar.b.contains("%{")) {
                    a(bcVar.b, true);
                }
            }
        }
        a();
    }

    public void a() {
        a(true);
    }

    public void a(boolean z) {
        c();
        if (this.d != null && this.d.contains("%{")) {
            this.b = a(this.d, z);
        } else {
            this.b = null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x012f, code lost:
        return (com.corrodinggames.rts.game.units.custom.ak[]) r0.toArray(new com.corrodinggames.rts.game.units.custom.ak[0]);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ak[] a(String str, boolean z) {
        ArrayList arrayList = new ArrayList();
        int i = 0;
        boolean z2 = false;
        while (true) {
            if (!z2) {
                int indexOf = str.indexOf("%{", i);
                if (indexOf == -1) {
                    String substring = str.substring(i, str.length());
                    if (!substring.equals(VariableScope.nullOrMissingString)) {
                        arrayList.add(new ar(substring));
                    }
                } else {
                    String substring2 = str.substring(i, indexOf);
                    if (!substring2.equals(VariableScope.nullOrMissingString)) {
                        arrayList.add(new ar(substring2));
                    }
                    z2 = true;
                    i = indexOf + 2;
                }
            } else {
                int indexOf2 = str.indexOf("}", i);
                if (indexOf2 == -1) {
                    arrayList.add(new ar("< %{ NOT CLOSED >"));
                    break;
                }
                String substring3 = str.substring(i, indexOf2);
                try {
                    arrayList.add(aq.a(LogicBooleanLoader.parseBooleanBlock(this.h, substring3, false)));
                } catch (RuntimeException e) {
                    String str2 = "Error: " + e.getMessage() + ", [parsing: '" + substring3 + "']";
                    this.g = str2;
                    arrayList.add(new ar("Error:< " + str2 + " >"));
                    if (z) {
                        throw e;
                    }
                }
                i = indexOf2 + 1;
                z2 = false;
            }
        }
    }

    public String a(com.corrodinggames.rts.game.units.am amVar) {
        if (!(amVar instanceof com.corrodinggames.rts.game.units.y)) {
            return "<No unit>:" + this.d;
        }
        com.corrodinggames.rts.game.units.y yVar = (com.corrodinggames.rts.game.units.y) amVar;
        StringBuffer stringBuffer = new StringBuffer();
        for (ak akVar : this.b) {
            stringBuffer.append(akVar.a(yVar));
        }
        return stringBuffer.toString();
    }

    public String b(com.corrodinggames.rts.game.units.am amVar) {
        if (this.e == com.corrodinggames.rts.gameFramework.translations.a.c) {
            if (this.b != null) {
                return a(amVar);
            }
            return this.d;
        }
        a(false);
        if (this.b != null) {
            return a(amVar);
        }
        return this.d;
    }

    public String b() {
        if (this.e == com.corrodinggames.rts.gameFramework.translations.a.c) {
            return this.d;
        }
        a(false);
        return this.d;
    }

    public void c() {
        bc[] bcVarArr;
        bc[] bcVarArr2;
        if (this.f != null) {
            this.e = com.corrodinggames.rts.gameFramework.translations.a.c;
            this.d = com.corrodinggames.rts.gameFramework.translations.a.a(this.f, new Object[0]);
            return;
        }
        String c = com.corrodinggames.rts.gameFramework.translations.a.c();
        for (bc bcVar : this.c) {
            if (c.equals(bcVar.a)) {
                this.e = com.corrodinggames.rts.gameFramework.translations.a.c;
                this.d = bcVar.b;
                return;
            }
        }
        for (bc bcVar2 : this.c) {
            if (bcVar2.a == null) {
                this.e = com.corrodinggames.rts.gameFramework.translations.a.c;
                this.d = bcVar2.b;
                return;
            }
        }
        this.e = com.corrodinggames.rts.gameFramework.translations.a.c;
        this.d = "<NO DEFAULT TEXT FOUND>";
    }
}