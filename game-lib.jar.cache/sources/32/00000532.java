package com.corrodinggames.rts.gameFramework.net;

import com.corrodinggames.rts.appFramework.i;
import com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope;
import com.corrodinggames.rts.gameFramework.GameEngine;

/* renamed from: com.corrodinggames.rts.gameFramework.j.g */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/j/g.class */
public class ListRoomInfo {

    /* renamed from: a */
    public boolean f581a;
    public String b;
    public String c;
    public String d;
    public String e;
    public String f;
    public int g;
    public boolean h;
    public String j;
    public String k;
    public int l;
    public boolean m;
    public String n;
    public long o;
    public int p;
    public String q;
    public String r;
    public String s;
    public String t;
    public String u;
    public boolean x;
    public boolean y;
    public String z;
    public int A;
    public long i = -1;
    public int v = -1;
    public int w = 8;

    public boolean a() {
        String str = GameEngine.getGameEngine().bX.bw;
        if (str != null && str.equals(this.b)) {
            return true;
        }
        return false;
    }

    public String b() {
        String str;
        String c = c();
        if (c != null) {
            String str2 = this.f;
            if (str2 != null) {
                str2 = str2.replace("\\n", "\n");
            }
            return (VariableScope.nullOrMissingString + str2 + "\n") + "Url: " + c + "\n";
        }
        String str3 = VariableScope.nullOrMissingString;
        if (this.f581a) {
            str3 = str3 + "Lan: " + this.d + ":" + this.g + "\n";
        }
        String str4 = (str3 + "User: " + this.n + "\n") + "Map: " + i.e(this.q) + "\n";
        if (this.m) {
            str4 = str4 + "Password Required\n";
        }
        if (!this.h && !this.f581a) {
            str4 = str4 + "Port: not open (Connecting over the internet may fail)\n";
        }
        if ("ANY".equalsIgnoreCase(this.k)) {
            str = str4 + "Version: " + this.k + "\n";
        } else {
            str = str4 + "Version: v" + this.k + (g() ? VariableScope.nullOrMissingString : " (different game version!)") + "\n";
        }
        if (this.z != null && !this.z.equals(VariableScope.nullOrMissingString)) {
            str = str + "Mods Needed: " + this.z + "\n";
        }
        return str;
    }

    public String c() {
        return this.e;
    }

    public boolean d() {
        return this.e != null;
    }

    public String e() {
        if (this.A == 0) {
            return this.c + ":" + this.g;
        }
        return "get|" + this.b.replace("|", ".") + "|" + this.A + "|" + this.m + "|" + this.g;
    }

    public String f() {
        return this.d + ":" + this.g;
    }

    public boolean g() {
        GameEngine gameEngine = GameEngine.getGameEngine();
        if (this.x && "ANY".equals(this.k)) {
            return true;
        }
        return (this.x && this.k != null && this.k.contains("+") && gameEngine.c(true) >= this.l) || gameEngine.c(true) == this.l;
    }
}