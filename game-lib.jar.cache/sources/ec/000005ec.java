package com.corrodinggames.rts.gameFramework.steam;

import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.mod.b;

/* renamed from: com.corrodinggames.rts.gameFramework.o.a */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/o/a.class */
public class SteamEngine {

    /* renamed from: a */
    public static SteamEngine steamEngine = new SteamEngine();

    /* renamed from: a */
    public static SteamEngine getSteamEngine() {
        return steamEngine;
    }

    public void b() {
        GameEngine.m4e("SteamEngine - blank init");
    }

    public void a(float f) {
    }

    public String c() {
        return null;
    }

    public void d() {
        GameEngine.m4e("SteamEngine - disableSteam - already disabled");
    }

    public boolean e() {
        return !f();
    }

    public boolean f() {
        return true;
    }

    public void g() {
        GameEngine.m4e("disabledSteam - showInviteDialog");
        GameEngine.getGameEngine().i("steam API not connected");
    }

    public void h() {
        GameEngine.m4e("Steam: alertNotEnabled");
        GameEngine gameEngine = GameEngine.getGameEngine();
        if (gameEngine != null) {
            gameEngine.i("steam API not connected");
        }
    }

    public void i() {
    }

    public void j() {
    }

    public void k() {
    }

    public void l() {
        GameEngine.m4e("disabledSteam - loadWorkshopMods");
    }

    public void m() {
        GameEngine.m4e("disabledSteam - showWorkshop");
    }

    public void a(b bVar) {
        GameEngine.m4e("disabledSteam - showWorkshopMod");
    }

    public void b(b bVar) {
        GameEngine.m4e("disabledSteam - publishWorkshopMod");
    }

    public void a(b bVar, boolean z, String str) {
        GameEngine.m4e("disabledSteam - uploadWorkshopMod");
    }
}