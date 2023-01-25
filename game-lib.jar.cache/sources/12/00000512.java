package com.corrodinggames.rts.gameFramework.net;

import com.corrodinggames.rts.gameFramework.GameEngine;
import java.io.IOException;

/* renamed from: com.corrodinggames.rts.gameFramework.j.ae */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/j/ae.class */
public class EnterPasswordCallback {

    /* renamed from: b */
    public String f5839b;

    /* renamed from: c */
    public int f5840c;

    /* renamed from: d */
    public boolean f5841d;

    /* renamed from: e */
    public String f5842e;

    /* renamed from: f */
    public String f5843f;

    /* renamed from: g */
    public String f5844g;

    /* renamed from: a */
    public void mo1444a(String str) {
        GameEngine gameEngine = GameEngine.getGameEngine();
        if (this.f5841d) {
            try {
                GameOutputStream gameOutputStream = new GameOutputStream();
                gameOutputStream.writeByte(1);
                gameOutputStream.writeInt(this.f5840c);
                gameOutputStream.writeString(str);
                gameEngine.netEngine.m1507d(gameOutputStream.getPacket(118));
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } else if (gameEngine.netEngine.isServer) {
            GameEngine.m1074a("Cannot enter a password when we are a server");
        } else {
            gameEngine.netEngine.passwd = str;
            gameEngine.netEngine.m1616X();
        }
    }

    /* renamed from: a */
    public void mo1445a() {
        GameEngine gameEngine = GameEngine.getGameEngine();
        gameEngine.netEngine.closeServer("exited password");
        gameEngine.netEngine.m1629K();
    }
}