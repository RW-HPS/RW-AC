package com.corrodinggames.rts.gameFramework.emitter;

/* renamed from: com.corrodinggames.rts.gameFramework.d.h */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/d/h.class */
public enum h {
    verylow,
    low,
    high,
    veryhigh,
    critical;

    public boolean a(h hVar) {
        return hVar == null || ordinal() < hVar.ordinal();
    }
}