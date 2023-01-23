package com.corrodinggames.rts.game.units.custom;

import com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope;
import java.util.ArrayList;

/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/aj.class */
public class aj {

    /* renamed from: a  reason: collision with root package name */
    public static final aj f245a = a(VariableScope.nullOrMissingString);
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
        bcVar.f268a = null;
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
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.corrodinggames.rts.game.units.custom.ak[] a(java.lang.String r7, boolean r8) {
        /*
            Method dump skipped, instructions count: 304
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.corrodinggames.rts.game.units.custom.aj.a(java.lang.String, boolean):com.corrodinggames.rts.game.units.custom.ak[]");
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
        if (this.e == com.corrodinggames.rts.gameFramework.h.a.c) {
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
        if (this.e == com.corrodinggames.rts.gameFramework.h.a.c) {
            return this.d;
        }
        a(false);
        return this.d;
    }

    public void c() {
        bc[] bcVarArr;
        bc[] bcVarArr2;
        if (this.f != null) {
            this.e = com.corrodinggames.rts.gameFramework.h.a.c;
            this.d = com.corrodinggames.rts.gameFramework.h.a.a(this.f, new Object[0]);
            return;
        }
        String c = com.corrodinggames.rts.gameFramework.h.a.c();
        for (bc bcVar : this.c) {
            if (c.equals(bcVar.f268a)) {
                this.e = com.corrodinggames.rts.gameFramework.h.a.c;
                this.d = bcVar.b;
                return;
            }
        }
        for (bc bcVar2 : this.c) {
            if (bcVar2.f268a == null) {
                this.e = com.corrodinggames.rts.gameFramework.h.a.c;
                this.d = bcVar2.b;
                return;
            }
        }
        this.e = com.corrodinggames.rts.gameFramework.h.a.c;
        this.d = "<NO DEFAULT TEXT FOUND>";
    }
}