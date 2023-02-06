package com.corrodinggames.rts.appFramework;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.ProgressDialog;
import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import com.corrodinggames.rts.AssetsID;
import com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.steam.SteamEngine;

/* loaded from: game-lib.jar:com/corrodinggames/rts/appFramework/g.class */
public class g extends b {
    f c;
    ProgressDialog e;
    final Handler d = new Handler(Looper.b());
    boolean f = true;

    @Override // android.app.Activity
    public void b() {
        GameEngine.m5e("IngameActivity: finish");
        super.b();
        c.a((Activity) this, true);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        if (z) {
            c.a((Activity) this, false, true);
        }
        this.c.a(z);
    }

    @Override // android.app.Activity
    public boolean a(Menu menu) {
        super.a(menu);
        menu.clear();
        GameEngine gameEngine = GameEngine.getGameEngine();
        menu.add(0, 12, 0, com.corrodinggames.rts.gameFramework.translations.a.a("menus.ingame.save", new Object[0])).setIcon(17301582);
        if (gameEngine.bv && !GameEngine.aZ) {
            menu.add(0, 18, 0, com.corrodinggames.rts.gameFramework.translations.a.a("menus.ingame.exportMap", new Object[0])).setIcon(17301582);
        }
        menu.add(0, 2, 0, com.corrodinggames.rts.gameFramework.translations.a.a("menus.ingame.settings", new Object[0])).setIcon(17301577);
        if (!gameEngine.N()) {
        }
        if (gameEngine.replayEngine != null && gameEngine.replayEngine.j()) {
            menu.add(0, 22, 0, com.corrodinggames.rts.gameFramework.translations.a.a("menus.ingame.hideInterface", new Object[0])).setIcon(17301584);
        }
        if (gameEngine.N()) {
            menu.add(0, 13, 0, com.corrodinggames.rts.gameFramework.translations.a.a("menus.ingame.chat", new Object[0])).setIcon(17301584);
            menu.add(0, 14, 0, com.corrodinggames.rts.gameFramework.translations.a.a("menus.ingame.players", new Object[0])).setIcon(17301661);
            if (gameEngine.netEngine.isServer && SteamEngine.getSteamEngine().e()) {
                menu.add(0, 17, 0, com.corrodinggames.rts.gameFramework.translations.a.a("menus.ingame.steam_reinvite", new Object[0])).setIcon(17301584);
            }
            boolean z = false;
            if (gameEngine.playerTeam != null && gameEngine.playerTeam.G) {
                z = true;
            }
            if (!z && !gameEngine.dq) {
                menu.add(0, 19, 0, com.corrodinggames.rts.gameFramework.translations.a.a("menus.ingame.surrender", new Object[0])).setIcon(17301552);
            }
            if (!gameEngine.netEngine.isServer) {
                menu.add(0, 10, 0, com.corrodinggames.rts.gameFramework.translations.a.a("menus.ingame.disconnect", new Object[0])).setIcon(17301552);
            } else {
                menu.add(0, 10, 0, com.corrodinggames.rts.gameFramework.translations.a.a("menus.ingame.exitGame", new Object[0])).setIcon(17301552);
            }
        } else {
            if (gameEngine.ce != null && gameEngine.ce.h != null) {
                menu.add(0, 11, 0, com.corrodinggames.rts.gameFramework.translations.a.a("menus.ingame.briefing", new Object[0])).setIcon(17301659);
            }
            menu.add(0, 15, 0, com.corrodinggames.rts.gameFramework.translations.a.a("menus.ingame.exitGame", new Object[0])).setIcon(17301552);
        }
        if (gameEngine != null && gameEngine.settingsEngine.allowGameRecording) {
            if (!gameEngine.bo) {
                menu.add(0, 9, 0, "Start Recording");
                return true;
            }
            menu.add(0, 9, 0, "Stop Recording");
            return true;
        }
        return true;
    }

    public void c(final int i) {
        GameEngine.m5e("outer selectMenuOption: " + i);
        this.d.a(new Runnable() { // from class: com.corrodinggames.rts.appFramework.g.1
            @Override // java.lang.Runnable
            public void run() {
                GameEngine.m5e("inner selectMenuOption: " + i);
                g.this.d(i);
            }
        });
    }

    public void d(int i) {
        switch (i) {
            case 2:
                a(new Intent(k(), s.class), 0);
                return;
            case 3:
                new AlertDialog.Builder(this).setIcon(17301543).setTitle("Skip?").setMessage("Are you sure you want to skip this level?").setPositiveButton("Yes", new DialogInterface.OnClickListener() { // from class: com.corrodinggames.rts.appFramework.g.9
                    @Override // android.content.DialogInterface.OnClickListener
                    public void onClick(DialogInterface dialogInterface, int i2) {
                        GameEngine.getGameEngine().du = true;
                    }
                }).setNegativeButton("No", (DialogInterface.OnClickListener) null).show();
                return;
            case 4:
                GameEngine.getGameEngine().ch = !GameEngine.getGameEngine().ch;
                return;
            case 5:
                new AlertDialog.Builder(this).setIcon(17301543).setTitle("Restart?").setMessage("Are you sure you want to restart this level?").setPositiveButton("Yes", new DialogInterface.OnClickListener() { // from class: com.corrodinggames.rts.appFramework.g.10
                    @Override // android.content.DialogInterface.OnClickListener
                    public void onClick(DialogInterface dialogInterface, int i2) {
                        GameEngine gameEngine = GameEngine.getGameEngine();
                        gameEngine.L();
                        gameEngine.a(true, com.corrodinggames.rts.gameFramework.s.normal);
                        gameEngine.J();
                    }
                }).setNegativeButton("No", (DialogInterface.OnClickListener) null).show();
                return;
            case 6:
                GameEngine gameEngine = GameEngine.getGameEngine();
                gameEngine.bl = !gameEngine.bl;
                return;
            case 7:
            case 8:
            case 17:
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
                GameEngine gameEngine3 = GameEngine.getGameEngine();
                String a = com.corrodinggames.rts.gameFramework.translations.a.a("menus.ingame.multiplayerClose.titleDisconnect", new Object[0]);
                String a2 = com.corrodinggames.rts.gameFramework.translations.a.a("menus.ingame.multiplayerClose.messageDisconnect", new Object[0]);
                String a3 = com.corrodinggames.rts.gameFramework.translations.a.a("menus.ingame.multiplayerClose.disconnectButton", new Object[0]);
                if (gameEngine3.netEngine.isServer) {
                    a = com.corrodinggames.rts.gameFramework.translations.a.a("menus.ingame.multiplayerClose.title", new Object[0]);
                    a2 = com.corrodinggames.rts.gameFramework.translations.a.a("menus.ingame.multiplayerClose.messageEndGame", new Object[0]);
                    a3 = com.corrodinggames.rts.gameFramework.translations.a.a("menus.ingame.exitGame", new Object[0]);
                }
                AlertDialog.Builder negativeButton = new AlertDialog.Builder(this).setIcon(17301543).setTitle(a).setMessage(a2).setPositiveButton(a3, new DialogInterface.OnClickListener() { // from class: com.corrodinggames.rts.appFramework.g.13
                    @Override // android.content.DialogInterface.OnClickListener
                    public void onClick(DialogInterface dialogInterface, int i2) {
                        GameEngine.getGameEngine().netEngine.closeServer("exited");
                        g.this.b();
                    }
                }).setNegativeButton(com.corrodinggames.rts.gameFramework.translations.a.a("menus.common.back", new Object[0]), (DialogInterface.OnClickListener) null);
                if (gameEngine3.netEngine.isServer) {
                    negativeButton.setNeutralButton(com.corrodinggames.rts.gameFramework.translations.a.a("menus.ingame.multiplayerClose.returnToBattleroom", new Object[0]), new DialogInterface.OnClickListener() { // from class: com.corrodinggames.rts.appFramework.g.14
                        @Override // android.content.DialogInterface.OnClickListener
                        public void onClick(DialogInterface dialogInterface, int i2) {
                            GameEngine.m5e("Returning to battleroom clicked.");
                            GameEngine gameEngine4 = GameEngine.getGameEngine();
                            gameEngine4.netEngine.ag();
                            gameEngine4.bS.u = false;
                        }
                    });
                }
                negativeButton.show();
                return;
            case 11:
                GameEngine gameEngine4 = GameEngine.getGameEngine();
                if (gameEngine4.ce != null && gameEngine4.ce.h != null) {
                    gameEngine4.a("Briefing", gameEngine4.ce.h);
                    return;
                }
                return;
            case 12:
                Runnable runnable = new Runnable() { // from class: com.corrodinggames.rts.appFramework.g.11
                    @Override // java.lang.Runnable
                    public void run() {
                        if (c.b(this)) {
                            g.this.f(null);
                        }
                    }
                };
                if (!c.a(this, runnable)) {
                    runnable.run();
                    return;
                }
                return;
            case 13:
                a(false);
                return;
            case 14:
                GameEngine gameEngine5 = GameEngine.getGameEngine();
                if (gameEngine5.netEngine != null) {
                    gameEngine5.netEngine.H();
                    return;
                }
                return;
            case 15:
                new AlertDialog.Builder(this).setIcon(17301543).setTitle("Exit?").setMessage("Are you sure you want to exit this game?").setPositiveButton("Yes", new DialogInterface.OnClickListener() { // from class: com.corrodinggames.rts.appFramework.g.15
                    @Override // android.content.DialogInterface.OnClickListener
                    public void onClick(DialogInterface dialogInterface, int i2) {
                        g.this.b();
                    }
                }).setNegativeButton("No", (DialogInterface.OnClickListener) null).show();
                return;
            case 16:
                a(true);
                return;
            case 18:
                if (c.b((Activity) this)) {
                    e(null);
                    return;
                }
                return;
            case 19:
                new AlertDialog.Builder(this).setIcon(17301543).setTitle("Disconnect?").setMessage("Are you sure you want to surrender this game?").setPositiveButton("Surrender", new DialogInterface.OnClickListener() { // from class: com.corrodinggames.rts.appFramework.g.12
                    @Override // android.content.DialogInterface.OnClickListener
                    public void onClick(DialogInterface dialogInterface, int i2) {
                        GameEngine.getGameEngine().netEngine.m("-surrender");
                    }
                }).setNegativeButton("No", (DialogInterface.OnClickListener) null).show();
                return;
            case 20:
                b();
                return;
            case 21:
                b();
                n.o();
                n.m();
                return;
            case 22:
                GameEngine gameEngine6 = GameEngine.getGameEngine();
                gameEngine6.cU = true;
                gameEngine6.bS.u = false;
                return;
            case 23:
                GameEngine.m5e("TODO display leaderboard settings");
                return;
        }
    }

    private void a(final boolean z) {
        GameEngine gameEngine = GameEngine.getGameEngine();
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        if (!z) {
            builder.setTitle("Send Message");
        } else {
            builder.setTitle("Send Team Message");
        }
        View inflate = LayoutInflater.from(this).inflate(AssetsID.layout.alert_chat, (ViewGroup) null);
        builder.setView(inflate);
        TextView textView = (TextView) inflate.findViewById(AssetsID.id.chat_messages);
        final EditText editText = (EditText) inflate.findViewById(AssetsID.id.chat_text);
        textView.setText(gameEngine.netEngine.aC.a());
        editText.setText(VariableScope.nullOrMissingString);
        editText.requestFocus();
        builder.setPositiveButton(z ? "Send Team" : "Send", new DialogInterface.OnClickListener() { // from class: com.corrodinggames.rts.appFramework.g.16
            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i) {
                String obj = editText.getText().toString();
                GameEngine gameEngine2 = GameEngine.getGameEngine();
                if (!obj.trim().equals(VariableScope.nullOrMissingString)) {
                    if (z) {
                        gameEngine2.netEngine.l(obj);
                    } else {
                        gameEngine2.netEngine.m(obj);
                    }
                }
                gameEngine2.bS.u = false;
            }
        });
        builder.setNeutralButton("Send & Ping Map", new DialogInterface.OnClickListener() { // from class: com.corrodinggames.rts.appFramework.g.2
            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i) {
                String obj = editText.getText().toString();
                GameEngine gameEngine2 = GameEngine.getGameEngine();
                if (!obj.trim().equals(VariableScope.nullOrMissingString)) {
                    if (z) {
                        gameEngine2.netEngine.l(obj);
                    } else {
                        gameEngine2.netEngine.m(obj);
                    }
                }
                gameEngine2.bS.u = false;
                gameEngine2.bS.I();
            }
        });
        builder.setNegativeButton("Cancel", new DialogInterface.OnClickListener() { // from class: com.corrodinggames.rts.appFramework.g.3
            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i) {
            }
        });
        builder.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(String str) {
        final GameEngine gameEngine = GameEngine.getGameEngine();
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Export Map");
        builder.setMessage("Enter a name to export the map as");
        final EditText editText = new EditText(this);
        if (str == null) {
            editText.setText(("New " + gameEngine.al() + " (" + com.corrodinggames.rts.gameFramework.f.a("d MMM yyyy").replace(".", VariableScope.nullOrMissingString) + " " + com.corrodinggames.rts.gameFramework.f.a("HH.mm.ss") + ")").replace("  ", " "));
        } else {
            editText.setText(str);
        }
        builder.setView(editText);
        builder.setPositiveButton("Ok", new DialogInterface.OnClickListener() { // from class: com.corrodinggames.rts.appFramework.g.4
            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i) {
                final String obj = editText.getText().toString();
                if (obj.contains("/") || obj.contains("\\") || obj.contains(":") || obj.contains("*") || obj.contains("?") || obj.contains("\"") || obj.contains("<") || obj.contains(">")) {
                    AlertDialog.Builder builder2 = new AlertDialog.Builder(g.this);
                    builder2.setTitle("Bad Map Name");
                    builder2.setMessage("The characters /\\:*?\"<> are not allowed (fat32 formatting)");
                    builder2.setPositiveButton("Ok", new DialogInterface.OnClickListener() { // from class: com.corrodinggames.rts.appFramework.g.4.1
                        @Override // android.content.DialogInterface.OnClickListener
                        public void onClick(DialogInterface dialogInterface2, int i2) {
                            g.this.e(obj);
                        }
                    });
                    builder2.show();
                    return;
                }
                gameEngine.bL.a(gameEngine.dl, "/SD/rustedWarfare/maps/" + obj + ".tmx");
            }
        });
        builder.setNegativeButton("Cancel", new DialogInterface.OnClickListener() { // from class: com.corrodinggames.rts.appFramework.g.5
            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i) {
            }
        });
        builder.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f(String str) {
        GameEngine gameEngine = GameEngine.getGameEngine();
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Save Game");
        builder.setMessage("Enter a name to save the game under");
        final EditText editText = new EditText(this);
        if (str == null) {
            editText.setText(gameEngine.al() + " (" + com.corrodinggames.rts.gameFramework.f.a("d MMM yyyy").replace(".", VariableScope.nullOrMissingString) + " " + com.corrodinggames.rts.gameFramework.f.a("HH.mm.ss") + ")");
        } else {
            editText.setText(str);
        }
        builder.setView(editText);
        builder.setPositiveButton("Ok", new DialogInterface.OnClickListener() { // from class: com.corrodinggames.rts.appFramework.g.6
            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i) {
                final String obj = editText.getText().toString();
                if (obj.contains("/") || obj.contains("\\") || obj.contains(":") || obj.contains("*") || obj.contains("?") || obj.contains("\"") || obj.contains("<") || obj.contains(">")) {
                    AlertDialog.Builder builder2 = new AlertDialog.Builder(g.this);
                    builder2.setTitle("Bad Save Name");
                    builder2.setMessage("The characters /\\:*?\"<> are not allowed (fat32 formatting)");
                    builder2.setPositiveButton("Ok", new DialogInterface.OnClickListener() { // from class: com.corrodinggames.rts.appFramework.g.6.1
                        @Override // android.content.DialogInterface.OnClickListener
                        public void onClick(DialogInterface dialogInterface2, int i2) {
                            g.this.f(obj);
                        }
                    });
                    builder2.show();
                    return;
                }
                g.this.d(obj);
            }
        });
        builder.setNegativeButton("Cancel", new DialogInterface.OnClickListener() { // from class: com.corrodinggames.rts.appFramework.g.7
            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i) {
            }
        });
        builder.show();
    }

    public void d(String str) {
        a(0);
        h hVar = new h(this);
        hVar.a = str;
        new Thread(hVar).start();
    }

    public void l() {
        this.d.a(new Runnable() { // from class: com.corrodinggames.rts.appFramework.g.8
            @Override // java.lang.Runnable
            public void run() {
                g.this.n();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void n() {
        try {
            a(new Intent("android.intent.action.VIEW", Uri.parse("market://details?id=com.corrodinggames.rts")));
        } catch (ActivityNotFoundException e) {
            Toast.makeText(g(), "Failed to open Android Market", 0).show();
        }
    }

    public void m() {
    }
}