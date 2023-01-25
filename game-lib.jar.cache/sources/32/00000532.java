package com.corrodinggames.rts.gameFramework.net;

import com.corrodinggames.rts.appFramework.ActivityC0117i;
import com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope;
import com.corrodinggames.rts.gameFramework.GameEngine;

/* renamed from: com.corrodinggames.rts.gameFramework.j.g */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/j/g.class */
public class ListRoomInfo {

    /* renamed from: a */
    public boolean f6038a;

    /* renamed from: b */
    public String f6039b;

    /* renamed from: c */
    public String f6040c;

    /* renamed from: d */
    public String f6041d;

    /* renamed from: e */
    public String f6042e;

    /* renamed from: f */
    public String f6043f;

    /* renamed from: g */
    public int f6044g;

    /* renamed from: h */
    public boolean f6045h;

    /* renamed from: j */
    public String f6047j;

    /* renamed from: k */
    public String f6048k;

    /* renamed from: l */
    public int f6049l;

    /* renamed from: m */
    public boolean f6050m;

    /* renamed from: n */
    public String f6051n;

    /* renamed from: o */
    public long f6052o;

    /* renamed from: p */
    public int f6053p;

    /* renamed from: q */
    public String f6054q;

    /* renamed from: r */
    public String f6055r;

    /* renamed from: s */
    public String f6056s;

    /* renamed from: t */
    public String f6057t;

    /* renamed from: u */
    public String f6058u;

    /* renamed from: x */
    public boolean f6061x;

    /* renamed from: y */
    public boolean f6062y;

    /* renamed from: z */
    public String f6063z;

    /* renamed from: A */
    public int f6064A;

    /* renamed from: i */
    public long f6046i = -1;

    /* renamed from: v */
    public int f6059v = -1;

    /* renamed from: w */
    public int f6060w = 8;

    /* renamed from: a */
    public boolean m1329a() {
        String str = GameEngine.getGameEngine().netEngine.f5815bw;
        if (str != null && str.equals(this.f6039b)) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public String m1328b() {
        String str;
        String m1327c = m1327c();
        if (m1327c != null) {
            String str2 = this.f6043f;
            if (str2 != null) {
                str2 = str2.replace("\\n", "\n");
            }
            return (VariableScope.nullOrMissingString + str2 + "\n") + "Url: " + m1327c + "\n";
        }
        String str3 = VariableScope.nullOrMissingString;
        if (this.f6038a) {
            str3 = str3 + "Lan: " + this.f6041d + ":" + this.f6044g + "\n";
        }
        String str4 = (str3 + "User: " + this.f6051n + "\n") + "Map: " + ActivityC0117i.m4911e(this.f6054q) + "\n";
        if (this.f6050m) {
            str4 = str4 + "Password Required\n";
        }
        if (!this.f6045h && !this.f6038a) {
            str4 = str4 + "Port: not open (Connecting over the internet may fail)\n";
        }
        if ("ANY".equalsIgnoreCase(this.f6048k)) {
            str = str4 + "Version: " + this.f6048k + "\n";
        } else {
            str = str4 + "Version: v" + this.f6048k + (m1323g() ? VariableScope.nullOrMissingString : " (different game version!)") + "\n";
        }
        if (this.f6063z != null && !this.f6063z.equals(VariableScope.nullOrMissingString)) {
            str = str + "Mods Needed: " + this.f6063z + "\n";
        }
        return str;
    }

    /* renamed from: c */
    public String m1327c() {
        return this.f6042e;
    }

    /* renamed from: d */
    public boolean m1326d() {
        return this.f6042e != null;
    }

    /* renamed from: e */
    public String m1325e() {
        if (this.f6064A == 0) {
            return this.f6040c + ":" + this.f6044g;
        }
        return "get|" + this.f6039b.replace("|", ".") + "|" + this.f6064A + "|" + this.f6050m + "|" + this.f6044g;
    }

    /* renamed from: f */
    public String m1324f() {
        return this.f6041d + ":" + this.f6044g;
    }

    /* renamed from: g */
    public boolean m1323g() {
        GameEngine gameEngine = GameEngine.getGameEngine();
        if (this.f6061x && "ANY".equals(this.f6048k)) {
            return true;
        }
        return (this.f6061x && this.f6048k != null && this.f6048k.contains("+") && gameEngine.mo1006c(true) >= this.f6049l) || gameEngine.mo1006c(true) == this.f6049l;
    }
}