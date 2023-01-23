package com.corrodinggames.rts.game.units.custom;

import com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope;
import com.corrodinggames.rts.gameFramework.net.GameInputStream;
import com.corrodinggames.rts.gameFramework.net.GameOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Locale;

/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/as.class */
public class as implements Cloneable {

    /* renamed from: a  reason: collision with root package name */
    public boolean f248a;
    public float b;
    public int c;
    public float d;
    public float e = 1.0f;
    public float f = 1.0f;
    public int g;
    public float h;
    public float i;
    public float j;
    public float k;
    public float l;
    public boolean m;
    public int n;
    public int o;
    public float p;
    public float q;
    public float r;
    static LinkedHashMap s = new LinkedHashMap();
    static LinkedHashMap t;

    public as(boolean z) {
        this.f248a = z;
    }

    public static VariableScope.CachedWriter a(String str, l lVar, String str2, String str3) {
        try {
            return VariableScope.CachedWriter.create(str, new au(lVar));
        } catch (bo e) {
            throw new RuntimeException("[" + str2 + "]" + str3 + ": " + e.getMessage(), e);
        }
    }

    /* renamed from: a */
    public as clone() {
        try {
            as asVar = (as) super.clone();
            asVar.f248a = false;
            return asVar;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    static void a(LinkedHashMap linkedHashMap, at atVar) {
        linkedHashMap.put(atVar.b, atVar);
    }

    static {
        a(s, new aw(s.size(), "mass") { // from class: com.corrodinggames.rts.game.units.custom.as.1
            @Override // com.corrodinggames.rts.game.units.custom.aw
            public double a(as asVar) {
                return asVar.b;
            }

            @Override // com.corrodinggames.rts.game.units.custom.aw
            public void a(as asVar, double d) {
                asVar.b = (float) d;
            }
        });
        a(s, new aw(s.size(), "maxenergy") { // from class: com.corrodinggames.rts.game.units.custom.as.12
            @Override // com.corrodinggames.rts.game.units.custom.aw
            public double a(as asVar) {
                return asVar.d;
            }

            @Override // com.corrodinggames.rts.game.units.custom.aw
            public void a(as asVar, double d) {
                asVar.d = (float) d;
            }
        });
        a(s, new ax(s.size(), "energy") { // from class: com.corrodinggames.rts.game.units.custom.as.13
            @Override // com.corrodinggames.rts.game.units.custom.ax
            public double a(j jVar) {
                return jVar.cB;
            }

            @Override // com.corrodinggames.rts.game.units.custom.ax
            public void b(j jVar, double d) {
                jVar.cB = (float) d;
            }

            @Override // com.corrodinggames.rts.game.units.custom.ax, com.corrodinggames.rts.game.units.custom.at
            public void a(j jVar, double d) {
                super.a(jVar, d);
                jVar.cB = (float) d;
            }
        });
        a(s, new aw(s.size(), "maxhp") { // from class: com.corrodinggames.rts.game.units.custom.as.14
            @Override // com.corrodinggames.rts.game.units.custom.aw
            public double a(as asVar) {
                return asVar.c;
            }

            @Override // com.corrodinggames.rts.game.units.custom.aw
            public void a(as asVar, double d) {
                asVar.c = (int) d;
            }

            @Override // com.corrodinggames.rts.game.units.custom.aw, com.corrodinggames.rts.game.units.custom.at
            public void a(j jVar, double d) {
                super.a(jVar, d);
                jVar.cv = (float) d;
            }
        });
        a(s, new ax(s.size(), "hp") { // from class: com.corrodinggames.rts.game.units.custom.as.15
            @Override // com.corrodinggames.rts.game.units.custom.ax
            public double a(j jVar) {
                return jVar.cu;
            }

            @Override // com.corrodinggames.rts.game.units.custom.ax
            public void b(j jVar, double d) {
                jVar.cu = (float) d;
            }

            @Override // com.corrodinggames.rts.game.units.custom.ax, com.corrodinggames.rts.game.units.custom.at
            public void a(j jVar, double d) {
                super.a(jVar, d);
                jVar.o((float) d);
            }
        });
        a(s, new aw(s.size(), "maxshield") { // from class: com.corrodinggames.rts.game.units.custom.as.16
            @Override // com.corrodinggames.rts.game.units.custom.aw
            public double a(as asVar) {
                return asVar.g;
            }

            @Override // com.corrodinggames.rts.game.units.custom.aw
            public void a(as asVar, double d) {
                asVar.g = (int) d;
            }

            @Override // com.corrodinggames.rts.game.units.custom.aw, com.corrodinggames.rts.game.units.custom.at
            public void a(j jVar, double d) {
                super.a(jVar, d);
                jVar.cA = (float) d;
            }
        });
        a(s, new ax(s.size(), "shield") { // from class: com.corrodinggames.rts.game.units.custom.as.17
            @Override // com.corrodinggames.rts.game.units.custom.ax
            public double a(j jVar) {
                return jVar.cx;
            }

            @Override // com.corrodinggames.rts.game.units.custom.ax
            public void b(j jVar, double d) {
                jVar.cx = (float) d;
            }

            @Override // com.corrodinggames.rts.game.units.custom.ax, com.corrodinggames.rts.game.units.custom.at
            public void a(j jVar, double d) {
                super.a(jVar, d);
                jVar.cx = (float) d;
            }
        });
        a(s, new aw(s.size(), "shieldregen") { // from class: com.corrodinggames.rts.game.units.custom.as.18
            @Override // com.corrodinggames.rts.game.units.custom.aw
            public double a(as asVar) {
                return asVar.h;
            }

            @Override // com.corrodinggames.rts.game.units.custom.aw
            public void a(as asVar, double d) {
                asVar.h = (float) d;
            }

            @Override // com.corrodinggames.rts.game.units.custom.aw, com.corrodinggames.rts.game.units.custom.at
            public void a(j jVar, double d) {
                super.a(jVar, d);
            }
        });
        a(s, new aw(s.size(), "armour") { // from class: com.corrodinggames.rts.game.units.custom.as.19
            @Override // com.corrodinggames.rts.game.units.custom.aw
            public double a(as asVar) {
                return asVar.l;
            }

            @Override // com.corrodinggames.rts.game.units.custom.aw
            public void a(as asVar, double d) {
                asVar.l = (float) d;
            }
        });
        a(s, new aw(s.size(), "maxattackrange") { // from class: com.corrodinggames.rts.game.units.custom.as.2
            @Override // com.corrodinggames.rts.game.units.custom.aw
            public double a(as asVar) {
                return asVar.i;
            }

            @Override // com.corrodinggames.rts.game.units.custom.aw
            public void a(as asVar, double d) {
                asVar.i = (float) d;
            }
        });
        a(s, new aw(s.size(), "shootdelaymultiplier") { // from class: com.corrodinggames.rts.game.units.custom.as.3
            @Override // com.corrodinggames.rts.game.units.custom.aw
            public double a(as asVar) {
                return asVar.e;
            }

            @Override // com.corrodinggames.rts.game.units.custom.aw
            public void a(as asVar, double d) {
                asVar.e = (float) d;
            }

            @Override // com.corrodinggames.rts.game.units.custom.aw, com.corrodinggames.rts.game.units.custom.at
            public void a(j jVar, double d) {
                super.a(jVar, d);
                jVar.aW();
            }
        });
        a(s, new aw(s.size(), "shootdamagemultiplier") { // from class: com.corrodinggames.rts.game.units.custom.as.4
            @Override // com.corrodinggames.rts.game.units.custom.aw
            public double a(as asVar) {
                return asVar.f;
            }

            @Override // com.corrodinggames.rts.game.units.custom.aw
            public void a(as asVar, double d) {
                asVar.f = (float) d;
            }
        });
        a(s, new aw(s.size(), "movespeed") { // from class: com.corrodinggames.rts.game.units.custom.as.5
            @Override // com.corrodinggames.rts.game.units.custom.aw
            public double a(as asVar) {
                return asVar.j;
            }

            @Override // com.corrodinggames.rts.game.units.custom.aw
            public void a(as asVar, double d) {
                asVar.j = (float) d;
            }
        });
        a(s, new aw(s.size(), "maxturnspeed") { // from class: com.corrodinggames.rts.game.units.custom.as.6
            @Override // com.corrodinggames.rts.game.units.custom.aw
            public double a(as asVar) {
                return asVar.k;
            }

            @Override // com.corrodinggames.rts.game.units.custom.aw
            public void a(as asVar, double d) {
                asVar.k = (float) d;
            }
        });
        a(s, new aw(s.size(), "fogofwarsightrange") { // from class: com.corrodinggames.rts.game.units.custom.as.7
            @Override // com.corrodinggames.rts.game.units.custom.aw
            public double a(as asVar) {
                return asVar.n;
            }

            @Override // com.corrodinggames.rts.game.units.custom.aw
            public void a(as asVar, double d) {
                asVar.n = (int) d;
            }

            @Override // com.corrodinggames.rts.game.units.custom.aw, com.corrodinggames.rts.game.units.custom.at
            public void a(j jVar, double d) {
                int s2 = jVar.s();
                super.a(jVar, d);
                if (jVar.s() > s2 && !jVar.ax) {
                    jVar.c(false);
                }
            }
        });
        a(s, new aw(s.size(), "nanorange") { // from class: com.corrodinggames.rts.game.units.custom.as.8
            @Override // com.corrodinggames.rts.game.units.custom.aw
            public double a(as asVar) {
                return asVar.o;
            }

            @Override // com.corrodinggames.rts.game.units.custom.aw
            public void a(as asVar, double d) {
                asVar.o = (int) d;
            }
        });
        a(s, new aw(s.size(), "selfregenrate") { // from class: com.corrodinggames.rts.game.units.custom.as.9
            @Override // com.corrodinggames.rts.game.units.custom.aw
            public double a(as asVar) {
                return asVar.p;
            }

            @Override // com.corrodinggames.rts.game.units.custom.aw
            public void a(as asVar, double d) {
                asVar.p = (float) d;
            }
        });
        a(s, new aw(s.size(), "targetHeight") { // from class: com.corrodinggames.rts.game.units.custom.as.10
            @Override // com.corrodinggames.rts.game.units.custom.aw
            public double a(as asVar) {
                return asVar.q;
            }

            @Override // com.corrodinggames.rts.game.units.custom.aw
            public void a(as asVar, double d) {
                asVar.q = (float) d;
            }
        });
        a(s, new aw(s.size(), "nanoFactorySpeed") { // from class: com.corrodinggames.rts.game.units.custom.as.11
            @Override // com.corrodinggames.rts.game.units.custom.aw
            public double a(as asVar) {
                return asVar.r;
            }

            @Override // com.corrodinggames.rts.game.units.custom.aw
            public void a(as asVar, double d) {
                asVar.r = (float) d;
            }
        });
        t = new LinkedHashMap();
        for (String str : s.keySet()) {
            if (!str.equals(str.toLowerCase(Locale.ROOT))) {
                throw new RuntimeException(str);
            }
            at atVar = (at) s.get(str);
            if (!atVar.b()) {
                t.put(str, atVar);
            }
        }
    }

    public as b() {
        as clone = clone();
        clone.f248a = false;
        return clone;
    }

    public static at a(int i) {
        for (at atVar : s.values()) {
            if (i == atVar.f249a) {
                return atVar;
            }
        }
        return null;
    }

    public static void a(j jVar, as asVar, at[] atVarArr) {
        for (at atVar : atVarArr) {
            double a2 = atVar.a(jVar, jVar.y);
            double a3 = atVar.a(jVar, asVar);
            if (a2 != a3) {
                jVar.dJ();
                atVar.a(jVar, a3);
            }
        }
    }

    public static void a(j jVar, as asVar, l lVar) {
        if (!(asVar != lVar.cL)) {
            return;
        }
        for (String str : t.keySet()) {
            at atVar = (at) t.get(str);
            double a2 = atVar.a(jVar, lVar.cL);
            double a3 = atVar.a(jVar, asVar);
            if (a2 != a3) {
                jVar.dJ();
                atVar.a(jVar, a3);
            }
        }
    }

    public static void a(as asVar, j jVar, GameOutputStream gameOutputStream) {
        l lVar = jVar.x;
        if (!(asVar != lVar.cL)) {
            gameOutputStream.writeBoolean(true);
            return;
        }
        gameOutputStream.writeBoolean(false);
        short s2 = 0;
        for (String str : t.keySet()) {
            at atVar = (at) t.get(str);
            if (atVar.a(jVar, lVar.cL) != atVar.a(jVar, asVar)) {
                s2 = (short) (s2 + 1);
            }
        }
        gameOutputStream.a(s2);
        int i = 0;
        for (String str2 : t.keySet()) {
            at atVar2 = (at) t.get(str2);
            double a2 = atVar2.a(jVar, lVar.cL);
            double a3 = atVar2.a(jVar, asVar);
            if (a2 != a3) {
                i++;
                if (s2 < i) {
                    throw new IOException("numberOfChangedFields>fieldsWritten: " + ((int) s2) + ">" + i);
                }
                gameOutputStream.a((short) atVar2.f249a);
                gameOutputStream.writeDouble(a3);
                gameOutputStream.writeDouble(a2);
            }
        }
    }

    public static void a(j jVar, GameInputStream gameInputStream, int i) {
        l lVar = jVar.x;
        if (gameInputStream.readBoolean()) {
            return;
        }
        int readShort = gameInputStream.readShort();
        for (int i2 = 0; i2 < readShort; i2++) {
            short readShort2 = gameInputStream.readShort();
            double readDouble = gameInputStream.readDouble();
            gameInputStream.readDouble();
            at a2 = a(readShort2);
            if (a2 == null) {
                throw new IOException("Field " + ((int) readShort2) + " doesn't exist");
            }
            jVar.dJ();
            a2.a(jVar, readDouble);
        }
    }

    public static at[] a(com.corrodinggames.rts.gameFramework.utility.ab abVar, String str, String str2, at[] atVarArr) {
        try {
            return a(abVar.b(str, str2, (String) null), atVarArr);
        } catch (RuntimeException e) {
            throw new RuntimeException("[" + str + "]" + str2 + ": " + e.getMessage(), e);
        }
    }

    public static at[] a(String str, at[] atVarArr) {
        if (str == null) {
            return atVarArr;
        }
        ArrayList arrayList = new ArrayList();
        for (String str2 : com.corrodinggames.rts.gameFramework.f.c(str, ',')) {
            String lowerCase = str2.trim().toLowerCase(Locale.ROOT);
            at atVar = (at) t.get(lowerCase);
            if (arrayList.contains(atVar)) {
                throw new RuntimeException("Value: " + lowerCase + " is repeated");
            }
            if (atVar == null) {
                String str3 = VariableScope.nullOrMissingString;
                for (String str4 : t.keySet()) {
                    if (!str3.equals(VariableScope.nullOrMissingString)) {
                        str3 = str3 + ", ";
                    }
                    str3 = str3 + str4;
                }
                throw new RuntimeException("Unknown value: " + lowerCase + " (Expected: " + com.corrodinggames.rts.gameFramework.f.b(str3, 100) + ")");
            }
            arrayList.add(atVar);
        }
        return (at[]) arrayList.toArray(new at[0]);
    }
}