package com.corrodinggames.rts.appFramework;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.p003os.Handler;
import android.p003os.Message;
import android.text.Spanned;
import android.widget.EditText;
import android.widget.TextView;
import com.corrodinggames.rts.game.PlayerData;
import com.corrodinggames.rts.game.units.AbstractC0244am;
import com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope;
import com.corrodinggames.rts.gameFramework.EnumC1098s;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.net.EnterPasswordCallback;
import com.corrodinggames.rts.gameFramework.net.MapType;
import com.corrodinggames.rts.gameFramework.translations.C0855a;
import java.util.Iterator;

/* renamed from: com.corrodinggames.rts.appFramework.n */
/* loaded from: game-lib.jar:com/corrodinggames/rts/appFramework/n.class */
public class ActivityC0122n extends ActivityC0089b {

    /* renamed from: c */
    public static ActivityC0122n f515c;

    /* renamed from: d */
    boolean f516d;

    /* renamed from: e */
    final Handler f517e;

    /* renamed from: f */
    public static boolean f518f = false;

    /* renamed from: g */
    public boolean f519g;

    /* renamed from: h */
    TextView f520h;

    /* renamed from: k */
    private Handler f521k;

    /* renamed from: l */
    private Runnable f522l;

    /* renamed from: m */
    private Runnable f523m;

    /* renamed from: i */
    static EnterPasswordCallback f524i;

    /* renamed from: j */
    static AlertDialog f525j;

    /* renamed from: l */
    public static boolean m5048l() {
        if (f515c == null) {
            return false;
        }
        return f515c.f519g;
    }

    /* renamed from: m */
    public static void m5047m() {
        if (f515c != null) {
            f515c.f517e.m5270a(new RunnableC01231());
        }
    }

    /* renamed from: com.corrodinggames.rts.appFramework.n$1 */
    /* loaded from: game-lib.jar:com/corrodinggames/rts/appFramework/n$1.class */
    final class RunnableC01231 implements Runnable {
        RunnableC01231() {
        }

        public void run() {
            ActivityC0122n.this.m5046n();
        }
    }

    /* renamed from: d */
    public static void m5049d(String str) {
        ActivityC0122n activityC0122n = f515c;
        if (activityC0122n == null) {
            return;
        }
        Message m5274a = activityC0122n.f521k.m5274a();
        m5274a.m5248d().putString("text", str);
        activityC0122n.f521k.m5266c(m5274a);
    }

    /* renamed from: n */
    void m5046n() {
        if (!this.f516d) {
            GameEngine.print("addMessageToChatLogInternal: !onCreateFinished");
            return;
        }
        GameEngine gameEngine = GameEngine.getGameEngine();
        Spanned m1648b = gameEngine.netEngine.f5802aC.m1648b(true);
        if (this.f520h == null) {
            throw new RuntimeException("chatLog==null");
        }
        if (m1648b == null) {
            throw new RuntimeException("chatLogHTML==null");
        }
        try {
            this.f520h.clearFocus();
            this.f520h.setTextKeepState(m1648b);
        } catch (NullPointerException e) {
            GameEngine.m1069a("chatLog.setText error", (Throwable) e);
            gameEngine.m1073a("chatLog.setText error", 1);
        }
    }

    /* renamed from: a */
    public static void m5050a(String str, String str2) {
        if (f515c != null) {
            f515c.f517e.m5270a(new RunnableC01242(str2));
        }
    }

    /* renamed from: com.corrodinggames.rts.appFramework.n$2 */
    /* loaded from: game-lib.jar:com/corrodinggames/rts/appFramework/n$2.class */
    final class RunnableC01242 implements Runnable {

        /* renamed from: b */
        final /* synthetic */ String f528b;

        RunnableC01242(String str) {
            this.f528b = str;
        }

        public void run() {
            ActivityC0122n.this.mo5035b();
            if (this.f528b != null) {
            }
        }
    }

    /* renamed from: o */
    public static void m5045o() {
        GameEngine gameEngine = GameEngine.getGameEngine();
        if (gameEngine.netEngine != null) {
            gameEngine.netEngine.m1625O();
            gameEngine.netEngine.f5774d.mo407c();
        }
        if (GameEngine.f6418aU) {
            return;
        }
        if (gameEngine.netEngine != null && gameEngine.netEngine.f5749aW) {
            return;
        }
        if (f515c != null) {
            f515c.f517e.m5270a(f515c.f522l);
        } else {
            GameEngine.print("MultiplayerBattleroomActivity:updateUI() lastLoaded==null");
        }
    }

    /* renamed from: p */
    public static void m5044p() {
        if (f515c != null) {
            f515c.f517e.m5270a(f515c.f523m);
            f518f = false;
            return;
        }
        GameEngine.print("MultiplayerBattleroomActivity:startGame() lastLoaded==null");
        GameEngine.m1097T();
        f518f = true;
    }

    /* renamed from: q */
    public static void m5043q() {
        C0128o c0128o = new C0128o("Starting unit count");
        C0128o c0128o2 = new C0128o("Total unit HP");
        C0128o c0128o3 = new C0128o("Team Credits");
        Iterator it = PlayerData.m4530c().iterator();
        while (it.hasNext()) {
            PlayerData playerData = (PlayerData) it.next();
            int i = 0;
            int i2 = 0;
            AbstractC0244am[] m504a = AbstractC0244am.f1594bE.m504a();
            int size = AbstractC0244am.f1594bE.size();
            for (int i3 = 0; i3 < size; i3++) {
                AbstractC0244am abstractC0244am = m504a[i3];
                if (abstractC0244am.f1614bX == playerData) {
                    i++;
                    i2 = (int) (i2 + abstractC0244am.f1637cu);
                }
            }
            if (i != 0) {
                c0128o.m5040a(playerData, i);
                c0128o2.m5040a(playerData, i2);
                c0128o3.m5040a(playerData, (int) playerData.credits);
            }
        }
        if (!c0128o.m5041a()) {
            c0128o2.m5041a();
        }
        c0128o3.m5041a();
    }

    /* renamed from: r */
    public static void m5042r() {
        GameEngine gameEngine = GameEngine.getGameEngine();
        gameEngine.f6379dm = null;
        if (gameEngine.netEngine.gameMapData.f5852a == MapType.f5869c) {
            if (!gameEngine.netEngine.isServer) {
                gameEngine.f6338ca.m433a(gameEngine.netEngine.f5734aA, true, false, false);
                gameEngine.f6330bS.f5269h.m1798a((String) null, "Note: Game was started from a saved game.");
            } else {
                gameEngine.f6338ca.m423c(gameEngine.netEngine.gameMapData.f5853b, true);
            }
            m5043q();
        } else if (gameEngine.netEngine.gameMapData.f5852a == MapType.f5868b) {
            if (!gameEngine.netEngine.isServer) {
                gameEngine.f6378dl = VariableScope.nullOrMissingString;
                gameEngine.f6379dm = gameEngine.netEngine.f5735aB;
                gameEngine.mo4646a(true, EnumC1098s.normal);
                gameEngine.f6330bS.f5269h.m1798a((String) null, "Note: Game was started from a custom map on server.");
            } else {
                gameEngine.f6378dl = gameEngine.netEngine.f5801az;
                gameEngine.mo4646a(true, EnumC1098s.normal);
            }
            m5043q();
        } else {
            gameEngine.f6378dl = gameEngine.netEngine.f5801az;
            gameEngine.mo4646a(true, EnumC1098s.normal);
        }
    }

    /* renamed from: a */
    public static void m5051a(EnterPasswordCallback enterPasswordCallback) {
        AlertDialog.Builder builder = new AlertDialog.Builder(GameEngine.getGameEngine().m1060aD());
        String str = "Password Required";
        String str2 = "This server requires a password to join";
        if (enterPasswordCallback.f5839b != null) {
            str = "Server Question";
            str2 = C0855a.m1725c(enterPasswordCallback.f5839b);
        }
        if (enterPasswordCallback.f5842e != null) {
            str = enterPasswordCallback.f5842e;
        }
        builder.setTitle(str);
        builder.setMessage(str2);
        EditText editText = new EditText(builder.getContext());
        builder.setView(editText);
        if (enterPasswordCallback.f5839b != null) {
            editText.setHint("Enter text...");
        } else {
            editText.setHint("Enter password...");
        }
        builder.setPositiveButton(enterPasswordCallback.f5843f != null ? enterPasswordCallback.f5843f : "Submit", new DialogInterface$OnClickListenerC01253(editText, enterPasswordCallback));
        builder.setNegativeButton(enterPasswordCallback.f5844g != null ? enterPasswordCallback.f5844g : "Disconnect", new DialogInterface$OnClickListenerC01264(enterPasswordCallback));
        builder.setOnCancelListener(new DialogInterface$OnCancelListenerC01275(enterPasswordCallback));
        AlertDialog alertDialog = f525j;
        if (alertDialog != null) {
            try {
                alertDialog.dismiss();
            } catch (IllegalArgumentException e) {
                e.printStackTrace();
            }
        }
        AlertDialog show = builder.show();
        f524i = enterPasswordCallback;
        f525j = show;
        editText.requestFocus();
    }

    /* renamed from: com.corrodinggames.rts.appFramework.n$3 */
    /* loaded from: game-lib.jar:com/corrodinggames/rts/appFramework/n$3.class */
    final class DialogInterface$OnClickListenerC01253 implements DialogInterface.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ EditText f529a;

        /* renamed from: b */
        final /* synthetic */ EnterPasswordCallback f530b;

        DialogInterface$OnClickListenerC01253(EditText editText, EnterPasswordCallback enterPasswordCallback) {
            this.f529a = editText;
            this.f530b = enterPasswordCallback;
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            this.f530b.mo1444a(this.f529a.getText().toString());
            ActivityC0122n.f524i = null;
            ActivityC0122n.f525j = null;
        }
    }

    /* renamed from: com.corrodinggames.rts.appFramework.n$4 */
    /* loaded from: game-lib.jar:com/corrodinggames/rts/appFramework/n$4.class */
    final class DialogInterface$OnClickListenerC01264 implements DialogInterface.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ EnterPasswordCallback f531a;

        DialogInterface$OnClickListenerC01264(EnterPasswordCallback enterPasswordCallback) {
            this.f531a = enterPasswordCallback;
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            this.f531a.mo1445a();
            ActivityC0122n.f524i = null;
            ActivityC0122n.f525j = null;
        }
    }

    /* renamed from: com.corrodinggames.rts.appFramework.n$5 */
    /* loaded from: game-lib.jar:com/corrodinggames/rts/appFramework/n$5.class */
    final class DialogInterface$OnCancelListenerC01275 implements DialogInterface.OnCancelListener {

        /* renamed from: a */
        final /* synthetic */ EnterPasswordCallback f532a;

        DialogInterface$OnCancelListenerC01275(EnterPasswordCallback enterPasswordCallback) {
            this.f532a = enterPasswordCallback;
        }

        public void onCancel(DialogInterface dialogInterface) {
            this.f532a.mo1445a();
            ActivityC0122n.f524i = null;
            ActivityC0122n.f525j = null;
        }
    }
}