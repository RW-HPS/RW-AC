package com.corrodinggames.rts.appFramework;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.ProgressDialog;
import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.p003os.Handler;
import android.p003os.Looper;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import com.corrodinggames.rts.C0067R;
import com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope;
import com.corrodinggames.rts.gameFramework.C0773f;
import com.corrodinggames.rts.gameFramework.EnumC1098s;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.steam.SteamEngine;
import com.corrodinggames.rts.gameFramework.translations.C0855a;

/* renamed from: com.corrodinggames.rts.appFramework.g */
/* loaded from: game-lib.jar:com/corrodinggames/rts/appFramework/g.class */
public class ActivityC0097g extends ActivityC0089b {

    /* renamed from: c */
    InterfaceC0096f f440c;

    /* renamed from: e */
    ProgressDialog f442e;

    /* renamed from: d */
    final Handler f441d = new Handler(Looper.m5260b());

    /* renamed from: f */
    boolean f443f = true;

    @Override // android.app.Activity
    /* renamed from: b */
    public void mo5035b() {
        GameEngine.m5616e("IngameActivity: finish");
        super.mo5035b();
        C0090c.m5094a((Activity) this, true);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        if (z) {
            C0090c.m5093a((Activity) this, false, true);
        }
        this.f440c.mo257a(z);
    }

    @Override // android.app.Activity
    /* renamed from: a */
    public boolean mo5471a(Menu menu) {
        super.mo5471a(menu);
        menu.clear();
        GameEngine gameEngine = GameEngine.getGameEngine();
        menu.add(0, 12, 0, C0855a.m1729a("menus.ingame.save", new Object[0])).setIcon(17301582);
        if (gameEngine.f6313bv && !GameEngine.f6423aZ) {
            menu.add(0, 18, 0, C0855a.m1729a("menus.ingame.exportMap", new Object[0])).setIcon(17301582);
        }
        menu.add(0, 2, 0, C0855a.m1729a("menus.ingame.settings", new Object[0])).setIcon(17301577);
        if (!gameEngine.m1103N()) {
        }
        if (gameEngine.f6339cb != null && gameEngine.f6339cb.m2505j()) {
            menu.add(0, 22, 0, C0855a.m1729a("menus.ingame.hideInterface", new Object[0])).setIcon(17301584);
        }
        if (gameEngine.m1103N()) {
            menu.add(0, 13, 0, C0855a.m1729a("menus.ingame.chat", new Object[0])).setIcon(17301584);
            menu.add(0, 14, 0, C0855a.m1729a("menus.ingame.players", new Object[0])).setIcon(17301661);
            if (gameEngine.netEngine.isServer && SteamEngine.getSteamEngine().m760e()) {
                menu.add(0, 17, 0, C0855a.m1729a("menus.ingame.steam_reinvite", new Object[0])).setIcon(17301584);
            }
            boolean z = false;
            if (gameEngine.f6312bs != null && gameEngine.f6312bs.f1332G) {
                z = true;
            }
            if (!z && !gameEngine.f6481dq) {
                menu.add(0, 19, 0, C0855a.m1729a("menus.ingame.surrender", new Object[0])).setIcon(17301552);
            }
            if (!gameEngine.netEngine.isServer) {
                menu.add(0, 10, 0, C0855a.m1729a("menus.ingame.disconnect", new Object[0])).setIcon(17301552);
            } else {
                menu.add(0, 10, 0, C0855a.m1729a("menus.ingame.exitGame", new Object[0])).setIcon(17301552);
            }
        } else {
            if (gameEngine.f6342ce != null && gameEngine.f6342ce.f6880h != null) {
                menu.add(0, 11, 0, C0855a.m1729a("menus.ingame.briefing", new Object[0])).setIcon(17301659);
            }
            menu.add(0, 15, 0, C0855a.m1729a("menus.ingame.exitGame", new Object[0])).setIcon(17301552);
        }
        if (gameEngine != null && gameEngine.settingsEngine.allowGameRecording) {
            if (!gameEngine.f6447bo) {
                menu.add(0, 9, 0, "Start Recording");
                return true;
            }
            menu.add(0, 9, 0, "Stop Recording");
            return true;
        }
        return true;
    }

    /* renamed from: c */
    public void m5077c(final int i) {
        GameEngine.m5616e("outer selectMenuOption: " + i);
        this.f441d.m5270a(new Runnable() { // from class: com.corrodinggames.rts.appFramework.g.1
            @Override // java.lang.Runnable
            public void run() {
                GameEngine.m5616e("inner selectMenuOption: " + i);
                ActivityC0097g.this.m5076d(i);
            }
        });
    }

    /* renamed from: d */
    public void m5076d(int i) {
        switch (i) {
            case 2:
                m5473a(new Intent(m5467k(), ActivityC0133s.class), 0);
                return;
            case 3:
                new AlertDialog.Builder(this).setIcon(17301543).setTitle("Skip?").setMessage("Are you sure you want to skip this level?").setPositiveButton("Yes", new DialogInterface.OnClickListener() { // from class: com.corrodinggames.rts.appFramework.g.9
                    @Override // android.content.DialogInterface.OnClickListener
                    public void onClick(DialogInterface dialogInterface, int i2) {
                        GameEngine.getGameEngine().f6485du = true;
                    }
                }).setNegativeButton("No", (DialogInterface.OnClickListener) null).show();
                return;
            case 4:
                GameEngine.getGameEngine().f6459ch = !GameEngine.getGameEngine().f6459ch;
                return;
            case 5:
                new AlertDialog.Builder(this).setIcon(17301543).setTitle("Restart?").setMessage("Are you sure you want to restart this level?").setPositiveButton("Yes", new DialogInterface.OnClickListener() { // from class: com.corrodinggames.rts.appFramework.g.10
                    @Override // android.content.DialogInterface.OnClickListener
                    public void onClick(DialogInterface dialogInterface, int i2) {
                        GameEngine gameEngine = GameEngine.getGameEngine();
                        gameEngine.m1105L();
                        gameEngine.mo4646a(true, EnumC1098s.normal);
                        gameEngine.m1107J();
                    }
                }).setNegativeButton("No", (DialogInterface.OnClickListener) null).show();
                return;
            case 6:
                GameEngine gameEngine = GameEngine.getGameEngine();
                gameEngine.f6444bl = !gameEngine.f6444bl;
                return;
            case 7:
            case 8:
            case 17:
            default:
                return;
            case 9:
                GameEngine gameEngine2 = GameEngine.getGameEngine();
                if (!gameEngine2.f6447bo) {
                    gameEngine2.f6447bo = true;
                    return;
                } else {
                    gameEngine2.f6447bo = false;
                    return;
                }
            case 10:
                GameEngine gameEngine3 = GameEngine.getGameEngine();
                String m1729a = C0855a.m1729a("menus.ingame.multiplayerClose.titleDisconnect", new Object[0]);
                String m1729a2 = C0855a.m1729a("menus.ingame.multiplayerClose.messageDisconnect", new Object[0]);
                String m1729a3 = C0855a.m1729a("menus.ingame.multiplayerClose.disconnectButton", new Object[0]);
                if (gameEngine3.netEngine.isServer) {
                    m1729a = C0855a.m1729a("menus.ingame.multiplayerClose.title", new Object[0]);
                    m1729a2 = C0855a.m1729a("menus.ingame.multiplayerClose.messageEndGame", new Object[0]);
                    m1729a3 = C0855a.m1729a("menus.ingame.exitGame", new Object[0]);
                }
                AlertDialog.Builder negativeButton = new AlertDialog.Builder(this).setIcon(17301543).setTitle(m1729a).setMessage(m1729a2).setPositiveButton(m1729a3, new DialogInterface.OnClickListener() { // from class: com.corrodinggames.rts.appFramework.g.13
                    @Override // android.content.DialogInterface.OnClickListener
                    public void onClick(DialogInterface dialogInterface, int i2) {
                        GameEngine.getGameEngine().netEngine.closeServer("exited");
                        ActivityC0097g.this.mo5035b();
                    }
                }).setNegativeButton(C0855a.m1729a("menus.common.back", new Object[0]), (DialogInterface.OnClickListener) null);
                if (gameEngine3.netEngine.isServer) {
                    negativeButton.setNeutralButton(C0855a.m1729a("menus.ingame.multiplayerClose.returnToBattleroom", new Object[0]), new DialogInterface.OnClickListener() { // from class: com.corrodinggames.rts.appFramework.g.14
                        @Override // android.content.DialogInterface.OnClickListener
                        public void onClick(DialogInterface dialogInterface, int i2) {
                            GameEngine.m5616e("Returning to battleroom clicked.");
                            GameEngine gameEngine4 = GameEngine.getGameEngine();
                            gameEngine4.netEngine.m1558ag();
                            gameEngine4.f6330bS.f5282u = false;
                        }
                    });
                }
                negativeButton.show();
                return;
            case 11:
                GameEngine gameEngine4 = GameEngine.getGameEngine();
                if (gameEngine4.f6342ce != null && gameEngine4.f6342ce.f6880h != null) {
                    gameEngine4.m1072a("Briefing", gameEngine4.f6342ce.f6880h);
                    return;
                }
                return;
            case 12:
                Runnable runnable = new Runnable() { // from class: com.corrodinggames.rts.appFramework.g.11
                    @Override // java.lang.Runnable
                    public void run() {
                        if (C0090c.m5088b(this)) {
                            ActivityC0097g.this.m5073f(null);
                        }
                    }
                };
                if (!C0090c.m5096a(this, runnable)) {
                    runnable.run();
                    return;
                }
                return;
            case 13:
                m5079a(false);
                return;
            case 14:
                GameEngine gameEngine5 = GameEngine.getGameEngine();
                if (gameEngine5.netEngine != null) {
                    gameEngine5.netEngine.m1632H();
                    return;
                }
                return;
            case 15:
                new AlertDialog.Builder(this).setIcon(17301543).setTitle("Exit?").setMessage("Are you sure you want to exit this game?").setPositiveButton("Yes", new DialogInterface.OnClickListener() { // from class: com.corrodinggames.rts.appFramework.g.15
                    @Override // android.content.DialogInterface.OnClickListener
                    public void onClick(DialogInterface dialogInterface, int i2) {
                        ActivityC0097g.this.mo5035b();
                    }
                }).setNegativeButton("No", (DialogInterface.OnClickListener) null).show();
                return;
            case 16:
                m5079a(true);
                return;
            case 18:
                if (C0090c.m5088b((Activity) this)) {
                    m5074e(null);
                    return;
                }
                return;
            case 19:
                new AlertDialog.Builder(this).setIcon(17301543).setTitle("Disconnect?").setMessage("Are you sure you want to surrender this game?").setPositiveButton("Surrender", new DialogInterface.OnClickListener() { // from class: com.corrodinggames.rts.appFramework.g.12
                    @Override // android.content.DialogInterface.OnClickListener
                    public void onClick(DialogInterface dialogInterface, int i2) {
                        GameEngine.getGameEngine().netEngine.m1463m("-surrender");
                    }
                }).setNegativeButton("No", (DialogInterface.OnClickListener) null).show();
                return;
            case 20:
                mo5035b();
                return;
            case 21:
                mo5035b();
                ActivityC0122n.m5045o();
                ActivityC0122n.m5047m();
                return;
            case 22:
                GameEngine gameEngine6 = GameEngine.getGameEngine();
                gameEngine6.f6374cU = true;
                gameEngine6.f6330bS.f5282u = false;
                return;
            case 23:
                GameEngine.m5616e("TODO display leaderboard settings");
                return;
        }
    }

    /* renamed from: a */
    private void m5079a(final boolean z) {
        GameEngine gameEngine = GameEngine.getGameEngine();
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        if (!z) {
            builder.setTitle("Send Message");
        } else {
            builder.setTitle("Send Team Message");
        }
        View inflate = LayoutInflater.from(this).inflate(C0067R.layout.alert_chat, (ViewGroup) null);
        builder.setView(inflate);
        TextView textView = (TextView) inflate.findViewById(C0067R.C0068id.chat_messages);
        final EditText editText = (EditText) inflate.findViewById(C0067R.C0068id.chat_text);
        textView.setText(gameEngine.netEngine.f5802aC.m1654a());
        editText.setText(VariableScope.nullOrMissingString);
        editText.requestFocus();
        builder.setPositiveButton(z ? "Send Team" : "Send", new DialogInterface.OnClickListener() { // from class: com.corrodinggames.rts.appFramework.g.16
            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i) {
                String obj = editText.getText().toString();
                GameEngine gameEngine2 = GameEngine.getGameEngine();
                if (!obj.trim().equals(VariableScope.nullOrMissingString)) {
                    if (z) {
                        gameEngine2.netEngine.m1465l(obj);
                    } else {
                        gameEngine2.netEngine.m1463m(obj);
                    }
                }
                gameEngine2.f6330bS.f5282u = false;
            }
        });
        builder.setNeutralButton("Send & Ping Map", new DialogInterface.OnClickListener() { // from class: com.corrodinggames.rts.appFramework.g.2
            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i) {
                String obj = editText.getText().toString();
                GameEngine gameEngine2 = GameEngine.getGameEngine();
                if (!obj.trim().equals(VariableScope.nullOrMissingString)) {
                    if (z) {
                        gameEngine2.netEngine.m1465l(obj);
                    } else {
                        gameEngine2.netEngine.m1463m(obj);
                    }
                }
                gameEngine2.f6330bS.f5282u = false;
                gameEngine2.f6330bS.m1922I();
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
    /* renamed from: e */
    public void m5074e(String str) {
        final GameEngine gameEngine = GameEngine.getGameEngine();
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Export Map");
        builder.setMessage("Enter a name to export the map as");
        final EditText editText = new EditText(this);
        if (str == null) {
            editText.setText(("New " + gameEngine.m1046al() + " (" + C0773f.m2204a("d MMM yyyy").replace(".", VariableScope.nullOrMissingString) + " " + C0773f.m2204a("HH.mm.ss") + ")").replace("  ", " "));
        } else {
            editText.setText(str);
        }
        builder.setView(editText);
        builder.setPositiveButton("Ok", new DialogInterface.OnClickListener() { // from class: com.corrodinggames.rts.appFramework.g.4
            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i) {
                final String obj = editText.getText().toString();
                if (obj.contains("/") || obj.contains("\\") || obj.contains(":") || obj.contains("*") || obj.contains("?") || obj.contains("\"") || obj.contains("<") || obj.contains(">")) {
                    AlertDialog.Builder builder2 = new AlertDialog.Builder(ActivityC0097g.this);
                    builder2.setTitle("Bad Map Name");
                    builder2.setMessage("The characters /\\:*?\"<> are not allowed (fat32 formatting)");
                    builder2.setPositiveButton("Ok", new DialogInterface.OnClickListener() { // from class: com.corrodinggames.rts.appFramework.g.4.1
                        @Override // android.content.DialogInterface.OnClickListener
                        public void onClick(DialogInterface dialogInterface2, int i2) {
                            ActivityC0097g.this.m5074e(obj);
                        }
                    });
                    builder2.show();
                    return;
                }
                gameEngine.f6323bL.m4788a(gameEngine.f6378dl, "/SD/rustedWarfare/maps/" + obj + ".tmx");
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
    /* renamed from: f */
    public void m5073f(String str) {
        GameEngine gameEngine = GameEngine.getGameEngine();
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Save Game");
        builder.setMessage("Enter a name to save the game under");
        final EditText editText = new EditText(this);
        if (str == null) {
            editText.setText(gameEngine.m1046al() + " (" + C0773f.m2204a("d MMM yyyy").replace(".", VariableScope.nullOrMissingString) + " " + C0773f.m2204a("HH.mm.ss") + ")");
        } else {
            editText.setText(str);
        }
        builder.setView(editText);
        builder.setPositiveButton("Ok", new DialogInterface.OnClickListener() { // from class: com.corrodinggames.rts.appFramework.g.6
            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i) {
                final String obj = editText.getText().toString();
                if (obj.contains("/") || obj.contains("\\") || obj.contains(":") || obj.contains("*") || obj.contains("?") || obj.contains("\"") || obj.contains("<") || obj.contains(">")) {
                    AlertDialog.Builder builder2 = new AlertDialog.Builder(ActivityC0097g.this);
                    builder2.setTitle("Bad Save Name");
                    builder2.setMessage("The characters /\\:*?\"<> are not allowed (fat32 formatting)");
                    builder2.setPositiveButton("Ok", new DialogInterface.OnClickListener() { // from class: com.corrodinggames.rts.appFramework.g.6.1
                        @Override // android.content.DialogInterface.OnClickListener
                        public void onClick(DialogInterface dialogInterface2, int i2) {
                            ActivityC0097g.this.m5073f(obj);
                        }
                    });
                    builder2.show();
                    return;
                }
                ActivityC0097g.this.m5075d(obj);
            }
        });
        builder.setNegativeButton("Cancel", new DialogInterface.OnClickListener() { // from class: com.corrodinggames.rts.appFramework.g.7
            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i) {
            }
        });
        builder.show();
    }

    /* renamed from: d */
    public void m5075d(String str) {
        m5476a(0);
        RunnableC0116h runnableC0116h = new RunnableC0116h(this);
        runnableC0116h.f473a = str;
        new Thread(runnableC0116h).start();
    }

    /* renamed from: l */
    public void m5072l() {
        this.f441d.m5270a(new Runnable() { // from class: com.corrodinggames.rts.appFramework.g.8
            @Override // java.lang.Runnable
            public void run() {
                ActivityC0097g.this.m5070n();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: n */
    public void m5070n() {
        try {
            mo5466a(new Intent("android.intent.action.VIEW", Uri.parse("market://details?id=com.corrodinggames.rts")));
        } catch (ActivityNotFoundException e) {
            Toast.makeText(mo5457g(), "Failed to open Android Market", 0).show();
        }
    }

    /* renamed from: m */
    public void m5071m() {
    }
}