package com.corrodinggames.rts.gameFramework.net;

/* renamed from: com.corrodinggames.rts.gameFramework.j.al */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/j/al.class */
public class al {

    /* renamed from: a  reason: collision with root package name */
    public String f565a;
    public long b;
    boolean c;
    final /* synthetic */ CheckSumData d;

    public al(CheckSumData checkSumData, String str) {
        this(checkSumData, str, true);
    }

    public al(CheckSumData checkSumData, String str, boolean z) {
        this.d = checkSumData;
        this.f565a = str;
        this.c = z;
        checkSumData.b.add(this);
    }
}