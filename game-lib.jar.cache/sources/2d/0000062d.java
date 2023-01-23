package com.corrodinggames.rts.gameFramework.utility;

import android.graphics.Paint;

/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/utility/z.class */
public final class z {

    /* renamed from: a  reason: collision with root package name */
    public int f702a;
    public Paint.Style b;
    public com.corrodinggames.rts.gameFramework.m.ag c;

    public z(int i, Paint.Style style) {
        com.corrodinggames.rts.gameFramework.m.ag agVar = new com.corrodinggames.rts.gameFramework.m.ag();
        agVar.b(i);
        agVar.a(style);
        this.c = agVar;
        this.b = style;
        this.f702a = i;
    }
}