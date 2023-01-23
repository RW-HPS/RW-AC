package com.corrodinggames.rts.gameFramework.player;

import com.corrodinggames.rts.game.PlayerData;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: com.corrodinggames.rts.gameFramework.g.b */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/g/b.class */
public class b extends d {

    /* renamed from: a */
    private final String f536a;
    private final int b;
    private final ArrayList c;

    public b(int i, ArrayList arrayList) {
        this.b = i;
        this.c = arrayList;
        this.f536a = "Team " + PlayerData.a(i);
    }

    @Override // com.corrodinggames.rts.gameFramework.player.d
    public boolean a() {
        return true;
    }

    @Override // com.corrodinggames.rts.gameFramework.player.d
    public String b() {
        return this.f536a;
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