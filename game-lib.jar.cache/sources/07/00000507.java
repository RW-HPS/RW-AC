package com.corrodinggames.rts.gameFramework.net;

import com.corrodinggames.rts.game.Player;
import com.corrodinggames.rts.game.PlayerData;
import com.corrodinggames.rts.gameFramework.GameEngine;

/* renamed from: com.corrodinggames.rts.gameFramework.j.ac */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/j/ac.class */
public class ac {
    public boolean a(PlayerConnect playerConnect, String str, String str2) {
        return true;
    }

    public boolean a(PlayerConnect playerConnect, PlayerData playerData, String str, boolean z) {
        return true;
    }

    public void b(PlayerConnect playerConnect, String str, String str2) {
    }

    public void a(int i, String str, String str2, PlayerConnect playerConnect) {
    }

    public String a(PlayerConnect playerConnect, String str) {
        return null;
    }

    public void c(PlayerConnect playerConnect, String str, String str2) {
    }

    public void b(PlayerConnect playerConnect, String str) {
    }

    public void a(PlayerData playerData) {
    }

    public String a(PlayerConnect playerConnect, String str, int i, int i2, String str2, Player player) {
        GameEngine.m2e("new player Joining packageName:" + str2 + ", appVersion:" + i2 + ", playerName:" + str + " ip:" + playerConnect.g() + " id:" + playerConnect.c);
        return null;
    }

    public void a() {
    }

    public boolean a(PlayerConnect playerConnect) {
        return false;
    }

    public boolean b(PlayerConnect playerConnect) {
        return false;
    }

    /* renamed from: b */
    public void startGame() {
        GameEngine.m2e("NetworkCallbacks:startGameEvent()");
    }

    public void c() {
    }

    public void a(EnterPasswordCallback enterPasswordCallback) {
    }

    public void d() {
    }

    public boolean e() {
        return false;
    }
}