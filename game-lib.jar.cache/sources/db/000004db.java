package com.corrodinggames.rts.gameFramework.Interface;

import com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.TeamStats;
import com.corrodinggames.rts.gameFramework.f;
import java.util.ArrayList;

/* renamed from: com.corrodinggames.rts.gameFramework.f.e */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/f/e.class */
public class DisplayedStat {
    public String a;
    public String b;
    public float c;
    public float d;

    public DisplayedStat(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public DisplayedStat(String str, float f) {
        this.a = str;
        this.c = f;
        this.b = null;
    }

    public static ArrayList a() {
        GameEngine gameEngine = GameEngine.getGameEngine();
        ArrayList displayedEndStats = new ArrayList();
        TeamStats teamStats = null;
        if (gameEngine.playerTeam != null) {
            teamStats = gameEngine.stats.getTeamStatsFromTeam(gameEngine.playerTeam);
        }
        if (teamStats != null) {
            if (gameEngine.ce != null && gameEngine.ce.k) {
                displayedEndStats.add(new DisplayedStat("Lasted till wave: " + gameEngine.ce.r, VariableScope.nullOrMissingString));
                if (!gameEngine.ce.l) {
                    displayedEndStats.add(new DisplayedStat("Wave difficulty: " + gameEngine.netEngine.c(gameEngine.ce.y), VariableScope.nullOrMissingString));
                }
            }
            displayedEndStats.add(new DisplayedStat("Game Time", f.a(gameEngine.by / 1000)));
            displayedEndStats.add(new DisplayedStat("=============================", VariableScope.nullOrMissingString));
            displayedEndStats.add(new DisplayedStat("Units Killed", teamStats.unitsKilled));
            displayedEndStats.add(new DisplayedStat("Buildings Killed", teamStats.buildingsKilled));
            displayedEndStats.add(new DisplayedStat("Experimentals Killed", teamStats.experimentalsKilled));
            displayedEndStats.add(new DisplayedStat("=============================", VariableScope.nullOrMissingString));
            displayedEndStats.add(new DisplayedStat("Units Lost", teamStats.unitsLost));
            displayedEndStats.add(new DisplayedStat("Buildings Lost", teamStats.buildingsLost));
            displayedEndStats.add(new DisplayedStat("Experimentals Lost", teamStats.experimentalsLost));
            displayedEndStats.add(new DisplayedStat("=============================", VariableScope.nullOrMissingString));
        }
        return displayedEndStats;
    }
}