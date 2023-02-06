package com.corrodinggames.rts.appFramework;

import android.app.Activity;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import com.corrodinggames.rts.game.Player;
import com.corrodinggames.rts.game.PlayerData;
import com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope;
import com.corrodinggames.rts.gameFramework.GameEngine;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: game-lib.jar:com/corrodinggames/rts/appFramework/i.class */
public class i extends b {
    boolean c;
    String d;

    @Override // android.app.Activity
    public void b() {
        super.b();
        c.a((Activity) this, true);
    }

    public static String d(String str) {
        if (str == null) {
            return null;
        }
        if (str.contains("/MOD|")) {
            return str.substring(str.indexOf("/MOD|"));
        }
        if (str.contains("/NEW_PATH|")) {
            return str.substring(str.indexOf("/NEW_PATH|"));
        }
        String[] split = str.split("/");
        return split[split.length - 1];
    }

    public static boolean a(String str, String str2) {
        Matcher matcher = Pattern.compile(".*\\[(.*)\\].*").matcher(str);
        if (matcher.matches()) {
            if ((matcher.group(1).toLowerCase(Locale.ENGLISH) + "|").contains("demo|")) {
                return true;
            }
        }
        if (com.corrodinggames.rts.gameFramework.file.a.i(str2.replace(".tmx", VariableScope.nullOrMissingString) + "_demo")) {
            return true;
        }
        return false;
    }

    public static String e(String str) {
        return c.b(str);
    }

    public static boolean f(String str) {
        if (str.contains("skirmish/")) {
            return true;
        }
        return false;
    }

    public static boolean g(String str) {
        if (str.contains("SD/")) {
            return true;
        }
        return false;
    }

    public static void a(String str, boolean z, int i, int i2, boolean z2, boolean z3) {
        GameEngine gameEngine = GameEngine.getGameEngine();
        gameEngine.bS.g();
        if (z || z3) {
            int i3 = 0;
            gameEngine.L();
            synchronized (gameEngine) {
                gameEngine.dm = null;
                gameEngine.dl = str;
                int i4 = PlayerData.c - 1;
                int a = c.a(str);
                GameEngine.m5e("Max teams on map: " + str + " = " + a);
                if (a > 0 && a - 1 < i4) {
                    i4 = a - 1;
                }
                PlayerData.F();
                gameEngine.playerTeam = new Player(0);
                gameEngine.playerTeam.name = "Player";
                int i5 = 0;
                while (i5 <= 1) {
                    for (int i6 = 1; i6 <= i4; i6++) {
                        boolean z4 = i6 % 2 == 0 || i5 == 1;
                        if (i3 < i2 && z4 && PlayerData.getPlayerData(i6) == null) {
                            com.corrodinggames.rts.game.a.a aVar = new com.corrodinggames.rts.game.a.a(i6);
                            aVar.name = "AI";
                            aVar.team = 0;
                            i3++;
                        }
                    }
                    i5++;
                }
                GameEngine.m5e("Allies: " + i3 + "/" + i2);
                int i7 = 0;
                int i8 = i - i2;
                int i9 = 0;
                while (i9 <= 1) {
                    for (int i10 = 1; i10 <= i4; i10++) {
                        boolean z5 = i10 % 2 == 1 || i9 == 1;
                        if (!z2) {
                            z5 = true;
                        }
                        if (i7 < i8 && z5 && PlayerData.getPlayerData(i10) == null) {
                            com.corrodinggames.rts.game.a.a aVar2 = new com.corrodinggames.rts.game.a.a(i10);
                            aVar2.name = "AI";
                            i7++;
                            if (z2) {
                                aVar2.team = 1;
                            }
                        }
                    }
                    i9++;
                }
                gameEngine.netEngine.aq();
                if (!z3) {
                    gameEngine.a(false, com.corrodinggames.rts.gameFramework.s.normal);
                }
            }
            return;
        }
        gameEngine.L();
        synchronized (gameEngine) {
            gameEngine.dm = null;
            gameEngine.dl = str;
        }
        if (!z3) {
            gameEngine.a(true, com.corrodinggames.rts.gameFramework.s.normal);
        }
    }

    @Override // android.app.Activity, android.view.View.OnCreateContextMenuListener
    public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        com.corrodinggames.rts.gameFramework.mod.b bVar;
        super.onCreateContextMenu(contextMenu, view, contextMenuInfo);
        View view2 = ((AdapterView.AdapterContextMenuInfo) contextMenuInfo).targetView;
        String str = (String) view2.getTag();
        GameEngine gameEngine = GameEngine.getGameEngine();
        String e = e(str);
        if (str != null) {
            bVar = gameEngine.bZ.h(str);
        } else {
            bVar = null;
        }
        this.d = str;
        contextMenu.setHeaderTitle(e);
        MenuItem add = contextMenu.add(0, view2.getId(), 0, "Export");
        if (bVar != null) {
            add.setTitle("Export (Standalone maps only)");
            add.setEnabled(false);
        }
        MenuItem add2 = contextMenu.add(2, view2.getId(), 0, "Delete");
        if (bVar != null) {
            add2.setTitle("Delete (Standalone maps only)");
            add2.setEnabled(false);
        }
        if (bVar != null) {
            contextMenu.add(4, view2.getId(), 0, "From Mod: " + bVar.b()).setEnabled(false);
        }
        if (bVar == null && this.c) {
            MenuItem add3 = contextMenu.add(3, view.getId(), 0, "Storage: " + com.corrodinggames.rts.gameFramework.file.a.n(str));
            if (add3 != null) {
                add3.setEnabled(false);
            }
        }
    }
}