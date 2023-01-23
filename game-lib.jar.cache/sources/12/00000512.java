package com.corrodinggames.rts.gameFramework.net;

import com.corrodinggames.rts.gameFramework.GameEngine;
import java.io.IOException;

/* renamed from: com.corrodinggames.rts.gameFramework.j.ae */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/j/ae.class */
public class EnterPasswordCallback {
    public String b;
    public int c;
    public boolean d;
    public String e;
    public String f;
    public String g;

    public void a(String str) {
        GameEngine gameEngine = GameEngine.getGameEngine();
        if (this.d) {
            try {
                GameOutputStream gameOutputStream = new GameOutputStream();
                gameOutputStream.writeByte(1);
                gameOutputStream.writeInt(this.c);
                gameOutputStream.writeString(str);
                gameEngine.bX.d(gameOutputStream.getPacket(118));
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } else if (gameEngine.bX.isServer) {
            GameEngine.a("Cannot enter a password when we are a server");
        } else {
            gameEngine.bX.passwd = str;
            gameEngine.bX.X();
        }
    }

    public void a() {
        GameEngine gameEngine = GameEngine.getGameEngine();
        gameEngine.bX.b("exited password");
        gameEngine.bX.K();
    }
}