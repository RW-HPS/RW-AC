package com.corrodinggames.rts.gameFramework.net;

/* renamed from: com.corrodinggames.rts.gameFramework.j.al */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/j/al.class */
public class C0887al {

    /* renamed from: a */
    public String f5891a;

    /* renamed from: b */
    public long f5892b;

    /* renamed from: c */
    boolean f5893c;

    /* renamed from: d */
    final /* synthetic */ CheckSumData f5894d;

    public C0887al(CheckSumData checkSumData, String str) {
        this(checkSumData, str, true);
    }

    public C0887al(CheckSumData checkSumData, String str, boolean z) {
        this.f5894d = checkSumData;
        this.f5891a = str;
        this.f5893c = z;
        checkSumData.f5875b.add(this);
    }
}