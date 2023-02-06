package com.corrodinggames.rts.gameFramework.player;

import com.corrodinggames.rts.game.PlayerData;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: com.corrodinggames.rts.gameFramework.g.b */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/g/b.class */
public class b extends d {
    private final String a;
    private final int b;
    private final ArrayList c;

    public b(int i, ArrayList arrayList) {
        this.b = i;
        this.c = arrayList;
        this.a = "Team " + PlayerData.getTeamName(i);
    }

    @Override // com.corrodinggames.rts.gameFramework.player.d
    public boolean a() {
        return true;
    }

    @Override // com.corrodinggames.rts.gameFramework.player.d
    public String b() {
        return this.a;
    }

    @Override // com.corrodinggames.rts.gameFramework.player.d
    public int c() {
        return PlayerData.i(this.b);
    }

    @Override // com.corrodinggames.rts.gameFramework.player.d
    public int d() {
        return PlayerData.i(this.b);
    }

    @Override // com.corrodinggames.rts.gameFramework.player.d
    public int a(f fVar) {
        int i = 0;
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            i += fVar.a((PlayerData) it.next());
        }
        return i;
    }
}