package com.corrodinggames.rts.game.units.custom;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/n.class */
public enum n {
    move,
    attack,
    idle,
    created,
    underConstruction,
    underConstructionWithLinkedBuiltTime,
    queuedUnits,
    repair,
    reclaim;

    public static n a(String str) {
        try {
            return valueOf(str);
        } catch (IllegalArgumentException e) {
            return null;
        }
    }
}