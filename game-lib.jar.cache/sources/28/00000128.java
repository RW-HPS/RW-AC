package com.corrodinggames.rts.appFramework;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;
import android.widget.Toast;
import com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope;
import com.corrodinggames.rts.gameFramework.GameEngine;
import java.io.File;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: game-lib.jar:com/corrodinggames/rts/appFramework/c.class */
public class c {
    static Handler a;
    static volatile Context b;
    public static final e c = e.dynamicDefault;
    public static e d = c;

    public static int a(String str) {
        String[] split;
        String str2 = null;
        if (str != null) {
            str2 = com.corrodinggames.rts.gameFramework.f.k(str);
        }
        if (str2 != null) {
            Matcher matcher = Pattern.compile("^ *\\[([^\\]]*)\\].*").matcher(str2);
            if (matcher.matches()) {
                for (String str3 : matcher.group(1).split(";")) {
                    if (str3.startsWith("p") && str3.length() >= 2) {
                        String substring = str3.substring(1);
                        try {
                            return Integer.parseInt(substring);
                        } catch (NumberFormatException e) {
                            GameEngine.m5e("getNumberOfPlayersInMap: NumberFormatException:" + substring);
                            return -1;
                        }
                    }
                }
            }
        }
        GameEngine.m5e("getNumberOfPlayersInMap: fail to match:" + str2);
        return -1;
    }

    public static String b(String str) {
        if (str == null) {
            return null;
        }
        if (str.contains(File.separator)) {
            String[] split = str.split(Pattern.quote(File.separator));
            str = split[split.length - 1];
        }
        if (str.contains("/")) {
            String[] split2 = str.split("/");
            str = split2[split2.length - 1];
        }
        String str2 = null;
        if (0 == 0) {
            Matcher matcher = Pattern.compile("^l\\d*;\\[.*\\](.+)\\.tmx").matcher(str);
            if (matcher.matches()) {
                str2 = matcher.group(1);
                if (str2.length() >= 1) {
                    str2 = str2.substring(0, 1).toUpperCase() + str2.substring(1);
                }
            }
        }
        if (str2 == null) {
            Matcher matcher2 = Pattern.compile("^l\\d*;(.+)\\.tmx").matcher(str);
            if (matcher2.matches()) {
                str2 = matcher2.group(1);
                if (str2.length() >= 1) {
                    str2 = str2.substring(0, 1).toUpperCase() + str2.substring(1);
                }
            }
        }
        if (str2 == null) {
            Matcher matcher3 = Pattern.compile("^ *\\[.*\\](.+)\\.tmx").matcher(str);
            if (matcher3.matches()) {
                str2 = matcher3.group(1);
                if (str2.length() >= 1) {
                    str2 = str2.substring(0, 1).toUpperCase() + str2.substring(1);
                }
            }
        }
        if (str2 == null) {
            Matcher matcher4 = Pattern.compile("(.*)\\.tmx").matcher(str);
            if (matcher4.matches()) {
                str2 = matcher4.group(1);
                if (str2.length() >= 1) {
                    str2 = str2.substring(0, 1).toUpperCase() + str2.substring(1);
                }
            }
        }
        if (str2 == null) {
            str2 = str;
        }
        String replace = str2.replace('_', ' ');
        if (replace.endsWith(".rwsave")) {
            replace = replace.replace(".rwsave", VariableScope.nullOrMissingString);
        }
        return replace;
    }

    public static String c(String str) {
        return str.replace(".tmx", VariableScope.nullOrMissingString) + "_map.png";
    }

    private static void c(Activity activity) {
        if (Build.VERSION.SDK_INT >= 19) {
            activity.a().getDecorView().setSystemUiVisibility(5894);
        }
    }

    private static void d(Activity activity) {
    }

    public static void a(Runnable runnable) {
        if (a == null) {
            a = new Handler(Looper.b());
        }
        a.a(runnable);
    }

    public static Context a() {
        if (b == null) {
            throw new RuntimeException("ApplicationContext==null");
        }
        return b;
    }

    public static void a(Activity activity) {
        if (b == null) {
            b = activity.g();
        }
    }

    public static void a(Context context) {
        if (b == null) {
            b = context.g();
        }
    }

    public static void a(Activity activity, boolean z, boolean z2) {
        a(activity);
        if (z2) {
            GameEngine gameEngine = GameEngine.getGameEngine();
            if (gameEngine != null && gameEngine.settingsEngine.immersiveFullScreen) {
                c(activity);
            }
        } else {
            d(activity);
        }
        GameEngine gameEngine2 = GameEngine.getGameEngine();
        if (gameEngine2 != null) {
            gameEngine2.ab();
        }
        if (z) {
            activity.a().setBackgroundDrawable(null);
        }
    }

    public static void a(Activity activity, boolean z) {
        if (z) {
            activity.a(0, 0);
        }
    }

    public static boolean a(Activity activity, Runnable runnable) {
        GameEngine.getGameEngine();
        if (a(activity, runnable, false)) {
            return true;
        }
        return false;
    }

    public static boolean a(final Activity activity, final Runnable runnable, boolean z) {
        final GameEngine gameEngine = GameEngine.getGameEngine();
        if ((!z && gameEngine.settingsEngine.hasSelectedAStorageType) || Build.VERSION.SDK_INT < 19) {
            return false;
        }
        DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener() { // from class: com.corrodinggames.rts.appFramework.c.1
            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i) {
                GameEngine.this.settingsEngine.storageType = 1;
                GameEngine.this.settingsEngine.hasSelectedAStorageType = true;
                com.corrodinggames.rts.gameFramework.file.a.b();
                GameEngine.this.settingsEngine.save();
                if (runnable != null) {
                    runnable.run();
                }
            }
        };
        DialogInterface.OnClickListener onClickListener2 = new DialogInterface.OnClickListener() { // from class: com.corrodinggames.rts.appFramework.c.2
            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i) {
                if (!com.corrodinggames.rts.gameFramework.file.a.a(true).b) {
                    GameEngine.m5e("Storage setup: Not using SAF, not showing setup folder popup");
                    if (c.b(Activity.this)) {
                        gameEngine.settingsEngine.storageType = 2;
                        gameEngine.settingsEngine.hasSelectedAStorageType = true;
                        com.corrodinggames.rts.gameFramework.file.a.b();
                        gameEngine.settingsEngine.save();
                    }
                } else if (Activity.this instanceof s) {
                    GameEngine.m5e("Storage setup: Already on settings page");
                    ((s) Activity.this).l();
                } else {
                    Intent intent = new Intent(Activity.this, s.class);
                    intent.putExtra("mode", "setupExternalFolder");
                    c.a(intent);
                    Activity.this.a(intent);
                    if (Activity.this instanceof b) {
                        if (runnable != null) {
                            ((b) Activity.this).a(new Runnable() { // from class: com.corrodinggames.rts.appFramework.c.2.1
                                @Override // java.lang.Runnable
                                public void run() {
                                    if (gameEngine.settingsEngine.hasSelectedAStorageType) {
                                        runnable.run();
                                    }
                                }
                            });
                            return;
                        }
                        return;
                    }
                    GameEngine.print("context not instance CommonActivity");
                }
            }
        };
        String a2 = com.corrodinggames.rts.gameFramework.translations.a.a("menus.mods.androidStorageSetupTitle", new Object[0]);
        String a3 = com.corrodinggames.rts.gameFramework.translations.a.a("menus.mods.androidStorageSetupMessage", new Object[0]);
        String a4 = com.corrodinggames.rts.gameFramework.translations.a.a("menus.mods.androidStorageSetupInternal", new Object[0]);
        new AlertDialog.Builder(activity).setIcon(17301543).setTitle(a2).setMessage(a3).setPositiveButton(a4, onClickListener).setNeutralButton(com.corrodinggames.rts.gameFramework.translations.a.a("menus.mods.androidStorageSetupExternal", new Object[0]), onClickListener2).show();
        GameEngine.m5e("Showing storage setup");
        return true;
    }

    public static boolean b(Context context) {
        if (GameEngine.aU || !com.corrodinggames.rts.gameFramework.file.a.f() || Build.VERSION.SDK_INT < 23 || ContextCompat.a(context, "android.permission.WRITE_EXTERNAL_STORAGE") == 0) {
            return true;
        }
        return false;
    }

    public static boolean b(Activity activity) {
        GameEngine gameEngine = GameEngine.getGameEngine();
        if (!GameEngine.aU && com.corrodinggames.rts.gameFramework.file.a.f() && Build.VERSION.SDK_INT >= 23) {
            if (gameEngine.aD() == null) {
            }
            if (ContextCompat.a(activity, "android.permission.WRITE_EXTERNAL_STORAGE") == 0) {
                gameEngine.settingsEngine.hadStoragePermissionInPast = true;
                GameEngine.m5e("File Permission is granted");
                return true;
            }
            GameEngine.m5e("Permission is revoked");
            ActivityCompat.a(activity, new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}, 1);
            return false;
        }
        return true;
    }

    public static void a(Intent intent) {
        intent.addFlags(65536);
    }

    public static void a(Activity activity, int i, boolean z, String str, Uri uri) {
        GameEngine.m5e("Show folder chooser. Write:" + z);
        Intent intent = new Intent("android.intent.action.OPEN_DOCUMENT_TREE");
        intent.addFlags(64);
        intent.addFlags(1);
        if (z) {
            intent.addFlags(2);
        }
        if (uri != null) {
            intent.putExtra("android.provider.extra.INITIAL_URI", uri);
        }
        intent.putExtra("android.content.extra.SHOW_ADVANCED", true);
        try {
            activity.a(Intent.createChooser(intent, str), i);
        } catch (ActivityNotFoundException e) {
            Toast.makeText(activity, "Failed to open file list. Please install a File Manager.", 0).show();
        }
    }
}