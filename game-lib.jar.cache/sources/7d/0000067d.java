package com.corrodinggames.rts.java;

import com.corrodinggames.librocket.AbstractC0043a;
import com.corrodinggames.librocket.scripts.ScriptEngine;
import com.corrodinggames.rts.appFramework.ActivityC0097g;
import com.corrodinggames.rts.gameFramework.GameEngine;

/* renamed from: com.corrodinggames.rts.java.h */
/* loaded from: game-lib.jar:com/corrodinggames/rts/java/h.class */
public class ActivityC1211h extends ActivityC0097g {
    @Override // com.corrodinggames.rts.appFramework.ActivityC0097g
    /* renamed from: c */
    public void mo116c(int i) {
        GameEngine.m5777e("InGameActivityJava selectMenuOption: " + i);
        mo115d(i);
    }

    /* renamed from: e */
    private void m114e(String str) {
        ScriptEngine.getInstance().getRoot().makeSaveGamePopup(str);
    }

    /* renamed from: f */
    private void m113f(String str) {
        ScriptEngine.getInstance().getRoot().makeExportMapGamePopup(str);
    }

    @Override // com.corrodinggames.rts.appFramework.ActivityC0097g
    /* renamed from: d */
    public void mo115d(int i) {
        switch (i) {
            case 2:
                AbstractC0043a.m5040a().m5029d();
                return;
            case 3:
                GameEngine.m5777e("TODO");
                return;
            case 4:
                GameEngine.getGameEngine().f6393ch = !GameEngine.getGameEngine().f6393ch;
                return;
            case 5:
                GameEngine.m5777e("TODO");
                return;
            case 6:
                GameEngine gameEngine = GameEngine.getGameEngine();
                gameEngine.f6345bl = !gameEngine.f6345bl;
                return;
            case 7:
            case 8:
            default:
                return;
            case 9:
                GameEngine gameEngine2 = GameEngine.getGameEngine();
                if (!gameEngine2.f6348bo) {
                    gameEngine2.f6348bo = true;
                    return;
                } else {
                    gameEngine2.f6348bo = false;
                    return;
                }
            case 10:
                ScriptEngine.getInstance().addScriptToQueue("mp.multiplayerExitPrompt();");
                return;
            case 11:
                GameEngine gameEngine3 = GameEngine.getGameEngine();
                if (gameEngine3.f6390ce != null && gameEngine3.f6390ce.f6880h != null) {
                    gameEngine3.m1064a("Briefing", gameEngine3.f6390ce.f6880h);
                    return;
                }
                return;
            case 12:
                m114e(null);
                return;
            case 13:
                ScriptEngine.getInstance().addScriptToQueue("makeSendMessagePopup();");
                return;
            case 14:
                GameEngine gameEngine4 = GameEngine.getGameEngine();
                if (gameEngine4.netEngine != null) {
                    gameEngine4.netEngine.m1617H();
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
                m113f(null);
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
                gameEngine5.f6432cU = true;
                gameEngine5.f6378bS.f5282u = false;
                return;
            case 23:
                AbstractC0043a.m5040a().m5028e();
                return;
        }
    }

    @Override // com.corrodinggames.rts.appFramework.ActivityC0097g
    /* renamed from: m */
    public void mo112m() {
        ScriptEngine.getInstance().addScriptToQueue("showMainMenu();");
    }
}