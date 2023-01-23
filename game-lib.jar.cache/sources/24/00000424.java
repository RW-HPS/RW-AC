package com.corrodinggames.rts.gameFramework.a;

import android.content.Context;
import com.corrodinggames.rts.R;
import com.corrodinggames.rts.gameFramework.utility.j;

/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/a/f.class */
public class f extends h {
    @Override // com.corrodinggames.rts.gameFramework.a.h
    public void a(Context context) {
    }

    @Override // com.corrodinggames.rts.gameFramework.a.h
    public i a(int i) {
        return new g(com.corrodinggames.rts.gameFramework.f.a(R.raw.class, i), this);
    }

    @Override // com.corrodinggames.rts.gameFramework.a.h
    public i a(String str, j jVar, boolean z) {
        return new g(str, this);
    }

    public static i b() {
        return new g("Null (from out of memory)", null);
    }

    public static i a(String str) {
        return new g("Null sound - " + str, null);
    }
}