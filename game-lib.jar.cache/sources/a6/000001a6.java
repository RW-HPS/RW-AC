package com.corrodinggames.rts.game.units.a;

/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/a/k.class */
public enum k {
    normal,
    attack,
    defend,
    nuke,
    build,
    upgrade,
    ok,
    no,
    happy,
    sad,
    retreat;

    public String a() {
        return " - " + b();
    }

    public String b() {
        return com.corrodinggames.rts.gameFramework.translations.a.a(c(), new Object[0]);
    }

    public String c() {
        return "menus.ingame.ping.type." + name();
    }
}