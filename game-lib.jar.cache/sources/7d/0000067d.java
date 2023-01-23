package com.corrodinggames.rts.java;

import com.corrodinggames.librocket.scripts.ScriptEngine;
import com.corrodinggames.rts.gameFramework.GameEngine;

/* loaded from: game-lib.jar:com/corrodinggames/rts/java/h.class */
public class h extends com.corrodinggames.rts.appFramework.g {
    @Override // com.corrodinggames.rts.appFramework.g
    public void c(int i) {
        GameEngine.m328e("InGameActivityJava selectMenuOption: " + i);
        d(i);
    }

    private void e(String str) {
        ScriptEngine.getInstance().getRoot().makeSaveGamePopup(str);
    }

    private void f(String str) {
        ScriptEngine.getInstance().getRoot().makeExportMapGamePopup(str);
    }

    @Override // com.corrodinggames.rts.appFramework.g
    public void d(int i) {
        switch (i) {
            case 2:
                com.corrodinggames.librocket.a.a().d();
                return;
            case 3:
                GameEngine.m328e("TODO");
                return;
            case 4:
                GameEngine.getGameEngine().ch = !GameEngine.getGameEngine().ch;
                return;
            case 5:
                GameEngine.m328e("TODO");
                return;
            case 6:
                GameEngine gameEngine = GameEngine.getGameEngine();
                gameEngine.bl = !gameEngine.bl;
                return;
            case 7:
            case 8:
            default:
                return;
            case 9:
                GameEngine gameEngine2 = GameEngine.getGameEngine();
                if (!gameEngine2.bo) {
                    gameEngine2.bo = true;
                    return;
                } else {
                    gameEngine2.bo = false;
                    return;
                }
            case 10:
                ScriptEngine.getInstance().addScriptToQueue("mp.multiplayerExitPrompt();");
                return;
            case 11:
                GameEngine gameEngine3 = GameEngine.getGameEngine();
                if (gameEngine3.ce != null && gameEngine3.ce.h != null) {
                    gameEngine3.a("Briefing", gameEngine3.ce.h);
                    return;
                }
                return;
            case 12:
                e(null);
                return;
            case 13:
                ScriptEngine.getInstance().addScriptToQueue("makeSendMessagePopup();");
                return;
            case 14:
                GameEngine gameEngine4 = GameEngine.getGameEngine();
                if (gameEngine4.bX != null) {
                    gameEngine4.bX.H();
                    return;
                }
                return;
            case 15:
                ScriptEngine.getInstance().addScriptToQueue("showMainMenu();");
                return;
            case 16:
                ScriptEngine.getInstance().addScriptToQueue("makeSendTeamMessagePopup();");
                return;
            case 17:
                ScriptEngine.getInstance().addScriptToQueue("mp.reinviteAsk();");
                return;
            case 18:
                f(null);
                return;
            case 19:
                ScriptEngine.getInstance().addScriptToQueue("mp.surrenderPrompt();");
                return;
            case 20:
                ScriptEngine.getInstance().addScriptToQueue("showMainMenu();");
                return;
            case 21:
                ScriptEngine.getInstance().addScriptToQueue("showBattleroom();");
                return;
            case 22:
                GameEngine gameEngine5 = GameEngine.getGameEngine();
                gameEngine5.cU = true;
                gameEngine5.bS.u = false;
                return;
            case 23:
                com.corrodinggames.librocket.a.a().e();
                return;
        }
    }

    @Override // com.corrodinggames.rts.appFramework.g
    public void m() {
        ScriptEngine.getInstance().addScriptToQueue("showMainMenu();");
    }
}