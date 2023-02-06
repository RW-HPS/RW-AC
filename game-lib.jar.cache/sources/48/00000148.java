package com.corrodinggames.rts.appFramework;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Handler;
import android.os.Message;
import android.text.Spanned;
import android.widget.EditText;
import android.widget.TextView;
import com.corrodinggames.rts.game.PlayerData;
import com.corrodinggames.rts.game.units.am;
import com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.net.EnterPasswordCallback;
import com.corrodinggames.rts.gameFramework.net.MapType;
import java.util.Iterator;

/* loaded from: game-lib.jar:com/corrodinggames/rts/appFramework/n.class */
public class n extends b {
    public static n c;
    boolean d;
    final Handler e;
    public static boolean f = false;
    public boolean g;
    TextView h;
    private Handler k;
    private Runnable l;
    private Runnable m;
    static EnterPasswordCallback i;
    static AlertDialog j;

    public static boolean l() {
        if (c == null) {
            return false;
        }
        return c.g;
    }

    public static void m() {
        if (c != null) {
            c.e.a(new Runnable() { // from class: com.corrodinggames.rts.appFramework.n.1
                @Override // java.lang.Runnable
                public void run() {
                    n.this.n();
                }
            });
        }
    }

    public static void d(String str) {
        n nVar = c;
        if (nVar == null) {
            return;
        }
        Message a = nVar.k.a();
        a.d().putString("text", str);
        nVar.k.c(a);
    }

    void n() {
        if (!this.d) {
            GameEngine.print("addMessageToChatLogInternal: !onCreateFinished");
            return;
        }
        GameEngine gameEngine = GameEngine.getGameEngine();
        Spanned b = gameEngine.netEngine.aC.b(true);
        if (this.h == null) {
            throw new RuntimeException("chatLog==null");
        }
        if (b == null) {
            throw new RuntimeException("chatLogHTML==null");
        }
        try {
            this.h.clearFocus();
            this.h.setTextKeepState(b);
        } catch (NullPointerException e) {
            GameEngine.a("chatLog.setText error", (Throwable) e);
            gameEngine.a("chatLog.setText error", 1);
        }
    }

    public static void a(String str, final String str2) {
        if (c != null) {
            c.e.a(new Runnable() { // from class: com.corrodinggames.rts.appFramework.n.2
                @Override // java.lang.Runnable
                public void run() {
                    n.this.b();
                    if (str2 != null) {
                    }
                }
            });
        }
    }

    public static void o() {
        GameEngine gameEngine = GameEngine.getGameEngine();
        if (gameEngine.netEngine != null) {
            gameEngine.netEngine.O();
            gameEngine.netEngine.d.c();
        }
        if (GameEngine.aU) {
            return;
        }
        if (gameEngine.netEngine != null && gameEngine.netEngine.aW) {
            return;
        }
        if (c != null) {
            c.e.a(c.l);
        } else {
            GameEngine.print("MultiplayerBattleroomActivity:updateUI() lastLoaded==null");
        }
    }

    public static void p() {
        if (c != null) {
            c.e.a(c.m);
            f = false;
            return;
        }
        GameEngine.print("MultiplayerBattleroomActivity:startGame() lastLoaded==null");
        GameEngine.T();
        f = true;
    }

    public static void q() {
        o oVar = new o("Starting unit count");
        o oVar2 = new o("Total unit HP");
        o oVar3 = new o("Team Credits");
        Iterator it = PlayerData.c().iterator();
        while (it.hasNext()) {
            PlayerData playerData = (PlayerData) it.next();
            int i2 = 0;
            int i3 = 0;
            am[] a = am.bE.a();
            int size = am.bE.size();
            for (int i4 = 0; i4 < size; i4++) {
                am amVar = a[i4];
                if (amVar.bX == playerData) {
                    i2++;
                    i3 = (int) (i3 + amVar.cu);
                }
            }
            if (i2 != 0) {
                oVar.a(playerData, i2);
                oVar2.a(playerData, i3);
                oVar3.a(playerData, (int) playerData.credits);
            }
        }
        if (!oVar.a()) {
            oVar2.a();
        }
        oVar3.a();
    }

    public static void r() {
        GameEngine gameEngine = GameEngine.getGameEngine();
        gameEngine.dm = null;
        if (gameEngine.netEngine.gameMapData.mapType == MapType.savedGame) {
            if (!gameEngine.netEngine.isServer) {
                gameEngine.ca.a(gameEngine.netEngine.aA, true, false, false);
                gameEngine.bS.h.a((String) null, "Note: Game was started from a saved game.");
            } else {
                gameEngine.ca.c(gameEngine.netEngine.gameMapData.mapName, true);
            }
            q();
        } else if (gameEngine.netEngine.gameMapData.mapType == MapType.customMap) {
            if (!gameEngine.netEngine.isServer) {
                gameEngine.dl = VariableScope.nullOrMissingString;
                gameEngine.dm = gameEngine.netEngine.aB;
                gameEngine.a(true, com.corrodinggames.rts.gameFramework.s.normal);
                gameEngine.bS.h.a((String) null, "Note: Game was started from a custom map on server.");
            } else {
                gameEngine.dl = gameEngine.netEngine.az;
                gameEngine.a(true, com.corrodinggames.rts.gameFramework.s.normal);
            }
            q();
        } else {
            gameEngine.dl = gameEngine.netEngine.az;
            gameEngine.a(true, com.corrodinggames.rts.gameFramework.s.normal);
        }
    }

    public static void a(final EnterPasswordCallback enterPasswordCallback) {
        AlertDialog.Builder builder = new AlertDialog.Builder(GameEngine.getGameEngine().aD());
        String str = "Password Required";
        String str2 = "This server requires a password to join";
        if (enterPasswordCallback.b != null) {
            str = "Server Question";
            str2 = com.corrodinggames.rts.gameFramework.translations.a.c(enterPasswordCallback.b);
        }
        if (enterPasswordCallback.e != null) {
            str = enterPasswordCallback.e;
        }
        builder.setTitle(str);
        builder.setMessage(str2);
        final EditText editText = new EditText(builder.getContext());
        builder.setView(editText);
        if (enterPasswordCallback.b != null) {
            editText.setHint("Enter text...");
        } else {
            editText.setHint("Enter password...");
        }
        builder.setPositiveButton(enterPasswordCallback.f != null ? enterPasswordCallback.f : "Submit", new DialogInterface.OnClickListener() { // from class: com.corrodinggames.rts.appFramework.n.3
            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i2) {
                enterPasswordCallback.a(editText.getText().toString());
                n.i = null;
                n.j = null;
            }
        });
        builder.setNegativeButton(enterPasswordCallback.g != null ? enterPasswordCallback.g : "Disconnect", new DialogInterface.OnClickListener() { // from class: com.corrodinggames.rts.appFramework.n.4
            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i2) {
                EnterPasswordCallback.this.a();
                n.i = null;
                n.j = null;
            }
        });
        builder.setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: com.corrodinggames.rts.appFramework.n.5
            @Override // android.content.DialogInterface.OnCancelListener
            public void onCancel(DialogInterface dialogInterface) {
                EnterPasswordCallback.this.a();
                n.i = null;
                n.j = null;
            }
        });
        AlertDialog alertDialog = j;
        if (alertDialog != null) {
            try {
                alertDialog.dismiss();
            } catch (IllegalArgumentException e) {
                e.printStackTrace();
            }
        }
        AlertDialog show = builder.show();
        i = enterPasswordCallback;
        j = show;
        editText.requestFocus();
    }
}