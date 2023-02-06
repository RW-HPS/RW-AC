package com.corrodinggames.rts.gameFramework.writeErrorFile;

import com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope;
import com.corrodinggames.rts.gameFramework.GameEngine;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Locale;

/* renamed from: com.corrodinggames.rts.gameFramework.c.a */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/c/a.class */
public class a implements Runnable {
    public static float e;
    public ServerSocket h;
    public static boolean a = false;
    public static boolean b = false;
    public static boolean c = false;
    public static boolean d = false;
    public static boolean g = true;
    static ArrayList j = new ArrayList();
    boolean f = true;
    public boolean i = true;

    public static void a() {
        if (!a) {
            return;
        }
        GameEngine.m5e("-----");
        GameEngine.m5e("-----");
        GameEngine.m5e("----- Debug Active ----");
        GameEngine.m5e("-----");
        GameEngine.m5e("-----");
        GameEngine.aV = true;
        GameEngine.getGameEngine().s();
        new a().b();
    }

    public void b() {
        if (b) {
            a(5677, VariableScope.nullOrMissingString);
        }
        GameEngine.getGameEngine().eb.a(new c(this));
    }

    public void a(int i, String str) {
        try {
            g = true;
            GameEngine.aT = true;
            GameEngine.m5e(VariableScope.nullOrMissingString);
            GameEngine.m5e("----- createDebugSocket ----");
            GameEngine.m5e("port: " + i);
            GameEngine.m5e("password: " + str);
            GameEngine.m5e("------------------");
            GameEngine.m5e(VariableScope.nullOrMissingString);
            if (i != -1) {
                this.h = new ServerSocket(i);
                new Thread(this).start();
            }
        } catch (IOException e2) {
            throw new RuntimeException(e2);
        }
    }

    private a() {
    }

    @Override // java.lang.Runnable
    public void run() {
        while (this.i) {
            try {
                Socket accept = this.h.accept();
                try {
                    accept.setTcpNoDelay(true);
                    new Thread(new b(this, accept)).run();
                } catch (IOException e2) {
                    GameEngine.m5e("Got IOException on debug connection");
                    e2.printStackTrace();
                    throw new RuntimeException(e2);
                }
            } catch (IOException e3) {
                throw new RuntimeException(e3);
            }
        }
    }

    public static String a(String str) {
        int indexOf = str.indexOf(" ");
        if (indexOf == -1) {
            indexOf = str.length();
        }
        String lowerCase = str.substring(0, indexOf).toLowerCase(Locale.ENGLISH);
        if (indexOf != -1 && str.length() >= indexOf + 1) {
            str.substring(indexOf + 1).split(" ");
        }
        if (lowerCase.equalsIgnoreCase("ping")) {
            return "pong";
        }
        if (lowerCase.equalsIgnoreCase("script") || lowerCase.equalsIgnoreCase("function") || lowerCase.equalsIgnoreCase("functionNoTimeout")) {
            return "todo";
        }
        return "unknown command";
    }
}