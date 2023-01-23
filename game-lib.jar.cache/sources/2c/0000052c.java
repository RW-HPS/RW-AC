package com.corrodinggames.rts.gameFramework.net;

import com.corrodinggames.rts.game.PlayerData;
import com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope;
import com.corrodinggames.rts.gameFramework.f;

/* renamed from: com.corrodinggames.rts.gameFramework.j.b */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/j/b.class */
public class b {

    /* renamed from: a  reason: collision with root package name */
    int f576a;
    String b;
    String c;
    int d;
    long e;
    final /* synthetic */ a f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public b(a aVar, int i, String str, String str2, PlayerConnect playerConnect) {
        this.f = aVar;
        this.f576a = i;
        this.b = str;
        this.c = str2;
        if (playerConnect != null) {
            this.d = playerConnect.c;
        }
        this.e = System.nanoTime();
    }

    public String a() {
        String str;
        if (this.b != null) {
            str = this.b + ": " + this.c;
        } else {
            str = this.c;
        }
        return str;
    }

    public String b() {
        String str = VariableScope.nullOrMissingString;
        if (this.b != null) {
            int i = -1;
            if (this.f576a != -1) {
                i = PlayerData.i(this.f576a);
            }
            str = "<strong> <font color='" + f.h(i) + "'>" + this.f.a(this.b) + ": </font></strong>";
        }
        boolean z = true;
        for (String str2 : this.c.split("\n")) {
            if (!str2.trim().equals(VariableScope.nullOrMissingString)) {
                if (z) {
                    z = false;
                } else {
                    str = str + "<br/>";
                }
                str = str + this.f.a(str2);
            }
        }
        return str;
    }
}