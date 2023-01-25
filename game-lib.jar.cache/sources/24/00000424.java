package com.corrodinggames.rts.gameFramework.p030a;

import android.content.Context;
import com.corrodinggames.rts.C0067R;
import com.corrodinggames.rts.gameFramework.C0773f;
import com.corrodinggames.rts.gameFramework.utility.C1133j;

/* renamed from: com.corrodinggames.rts.gameFramework.a.f */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/a/f.class */
public class C0638f extends AbstractC0640h {
    @Override // com.corrodinggames.rts.gameFramework.p030a.AbstractC0640h
    /* renamed from: a */
    public void mo80a(Context context) {
    }

    @Override // com.corrodinggames.rts.gameFramework.p030a.AbstractC0640h
    /* renamed from: a */
    public AbstractC0641i mo81a(int i) {
        return new C0639g(C0773f.m2190a(C0067R.raw.class, i), this);
    }

    @Override // com.corrodinggames.rts.gameFramework.p030a.AbstractC0640h
    /* renamed from: a */
    public AbstractC0641i mo79a(String str, C1133j c1133j, boolean z) {
        return new C0639g(str, this);
    }

    /* renamed from: b */
    public static AbstractC0641i m2802b() {
        return new C0639g("Null (from out of memory)", null);
    }

    /* renamed from: a */
    public static AbstractC0641i m2803a(String str) {
        return new C0639g("Null sound - " + str, null);
    }
}