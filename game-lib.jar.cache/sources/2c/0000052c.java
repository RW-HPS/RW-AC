package com.corrodinggames.rts.gameFramework.net;

import com.corrodinggames.rts.game.PlayerData;
import com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope;
import com.corrodinggames.rts.gameFramework.C0773f;

/* renamed from: com.corrodinggames.rts.gameFramework.j.b */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/j/b.class */
public class C0902b {

    /* renamed from: a */
    int f5974a;

    /* renamed from: b */
    String f5975b;

    /* renamed from: c */
    String f5976c;

    /* renamed from: d */
    int f5977d;

    /* renamed from: e */
    long f5978e;

    /* renamed from: f */
    final /* synthetic */ C0862a f5979f;

    C0902b(C0862a c0862a, int i, String str, String str2, PlayerConnect playerConnect) {
        this.f5979f = c0862a;
        this.f5974a = i;
        this.f5975b = str;
        this.f5976c = str2;
        if (playerConnect != null) {
            this.f5977d = playerConnect.connectIndex;
        }
        this.f5978e = System.nanoTime();
    }

    /* renamed from: a */
    public String m1362a() {
        String str;
        if (this.f5975b != null) {
            str = this.f5975b + ": " + this.f5976c;
        } else {
            str = this.f5976c;
        }
        return str;
    }

    /* renamed from: b */
    public String m1361b() {
        String str = VariableScope.nullOrMissingString;
        if (this.f5975b != null) {
            int i = -1;
            if (this.f5974a != -1) {
                i = PlayerData.m4369i(this.f5974a);
            }
            str = "<strong> <font color='" + C0773f.m2115h(i) + "'>" + this.f5979f.m1636a(this.f5975b) + ": </font></strong>";
        }
        boolean z = true;
        for (String str2 : this.f5976c.split("\n")) {
            if (!str2.trim().equals(VariableScope.nullOrMissingString)) {
                if (z) {
                    z = false;
                } else {
                    str = str + "<br/>";
                }
                str = str + this.f5979f.m1636a(str2);
            }
        }
        return str;
    }
}