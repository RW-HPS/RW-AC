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
public class RunnableC0752a implements Runnable {

    /* renamed from: e */
    public static float f4706e;

    /* renamed from: h */
    public ServerSocket f4707h;

    /* renamed from: a */
    public static boolean f4708a = false;

    /* renamed from: b */
    public static boolean f4709b = false;

    /* renamed from: c */
    public static boolean f4710c = false;

    /* renamed from: d */
    public static boolean f4711d = false;

    /* renamed from: g */
    public static boolean f4712g = true;

    /* renamed from: j */
    static ArrayList f4713j = new ArrayList();

    /* renamed from: f */
    boolean f4714f = true;

    /* renamed from: i */
    public boolean f4715i = true;

    /* renamed from: a */
    public static void m2415a() {
        if (!f4708a) {
            return;
        }
        GameEngine.m5460e("-----");
        GameEngine.m5460e("-----");
        GameEngine.m5460e("----- Debug Active ----");
        GameEngine.m5460e("-----");
        GameEngine.m5460e("-----");
        GameEngine.f6419aV = true;
        GameEngine.getGameEngine().mo971s();
        new RunnableC0752a().m2412b();
    }

    /* renamed from: b */
    public void m2412b() {
        if (f4709b) {
            m2414a(5677, VariableScope.nullOrMissingString);
        }
        GameEngine.getGameEngine().f6502eb.m752a(new RunnableC0754c(this));
    }

    /* renamed from: a */
    public void m2414a(int i, String str) {
        try {
            f4712g = true;
            GameEngine.f6417aT = true;
            GameEngine.m5460e(VariableScope.nullOrMissingString);
            GameEngine.m5460e("----- createDebugSocket ----");
            GameEngine.m5460e("port: " + i);
            GameEngine.m5460e("password: " + str);
            GameEngine.m5460e("------------------");
            GameEngine.m5460e(VariableScope.nullOrMissingString);
            if (i != -1) {
                this.f4707h = new ServerSocket(i);
                new Thread(this).start();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private RunnableC0752a() {
    }

    @Override // java.lang.Runnable
    public void run() {
        while (this.f4715i) {
            try {
                Socket accept = this.f4707h.accept();
                try {
                    accept.setTcpNoDelay(true);
                    new Thread(new RunnableC0753b(this, accept)).run();
                } catch (IOException e) {
                    GameEngine.m5460e("Got IOException on debug connection");
                    e.printStackTrace();
                    throw new RuntimeException(e);
                }
            } catch (IOException e2) {
                throw new RuntimeException(e2);
            }
        }
    }

    /* renamed from: a */
    public static String m2413a(String str) {
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