package com.corrodinggames.rts.gameFramework.utility;

import android.graphics.Paint;

/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/utility/z.class */
public final class z {
    public int a;
    public Paint.Style b;
    public com.corrodinggames.rts.gameFramework.unitAction.ag c;

    public z(int i, Paint.Style style) {
        com.corrodinggames.rts.gameFramework.unitAction.ag agVar = new com.corrodinggames.rts.gameFramework.unitAction.ag();
        agVar.b(i);
        agVar.a(style);
        this.c = agVar;
        this.b = style;
        this.a = i;
    }
}