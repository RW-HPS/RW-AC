package com.corrodinggames.rts.gameFramework.player;

import com.corrodinggames.rts.game.PlayerData;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: com.corrodinggames.rts.gameFramework.g.b */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/g/b.class */
public class C0849b extends AbstractC0851d {

    /* renamed from: a */
    private final String f5591a;

    /* renamed from: b */
    private final int f5592b;

    /* renamed from: c */
    private final ArrayList f5593c;

    public C0849b(int i, ArrayList arrayList) {
        this.f5592b = i;
        this.f5593c = arrayList;
        this.f5591a = "Team " + PlayerData.getTeamName(i);
    }

    @Override // com.corrodinggames.rts.gameFramework.player.AbstractC0851d
    /* renamed from: a */
    public boolean mo1725a() {
        return true;
    }

    @Override // com.corrodinggames.rts.gameFramework.player.AbstractC0851d
    /* renamed from: b */
    public String mo1723b() {
        return this.f5591a;
    }

    @Override // com.corrodinggames.rts.gameFramework.player.AbstractC0851d
    /* renamed from: c */
    public int mo1722c() {
        return PlayerData.m4370i(this.f5592b);
    }

    @Override // com.corrodinggames.rts.gameFramework.player.AbstractC0851d
    /* renamed from: d */
    public int mo1721d() {
        return PlayerData.m4370i(this.f5592b);
    }

    @Override // com.corrodinggames.rts.gameFramework.player.AbstractC0851d
    /* renamed from: a */
    public int mo1724a(EnumC0853f enumC0853f) {
        int i = 0;
        Iterator it = this.f5593c.iterator();
        while (it.hasNext()) {
            i += enumC0853f.m1720a((PlayerData) it.next());
        }
        return i;
    }
}