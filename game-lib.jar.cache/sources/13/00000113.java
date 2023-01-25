package com.corrodinggames.rts.debug;

import com.corrodinggames.librocket.scripts.ScriptEngine;
import com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope;
import com.corrodinggames.rts.gameFramework.GameEngine;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;

/* renamed from: com.corrodinggames.rts.a.a */
/* loaded from: game-lib.jar:com/corrodinggames/rts/a/a.class */
public class ScriptServerSocket implements Runnable {

    /* renamed from: a */
    public ServerSocket f387a;

    /* renamed from: b */
    public boolean f388b = true;

    /* renamed from: c */
    public static boolean f389c = false;

    /* renamed from: d */
    public static boolean f390d = false;

    /* renamed from: e */
    static ArrayList f391e = new ArrayList();

    /* renamed from: a */
    public static boolean m5461a() {
        return f389c;
    }

    /* renamed from: a */
    public static void addScriptFilePath(String filePath) {
        f389c = true;
        f391e.add(filePath);
    }

    /* renamed from: b */
    public static void m5458b() {
        if (f391e.size() == 0) {
            return;
        }
        new Thread(new Runnable() { // from class: com.corrodinggames.rts.a.a.1
            @Override // java.lang.Runnable
            public void run() {
                Iterator it = ScriptServerSocket.f391e.iterator();
                while (it.hasNext()) {
                    String str = (String) it.next();
                    GameEngine.m5925e("Running debug script:" + str);
                    try {
                        FileReader fileReader = new FileReader(str);
                        BufferedReader bufferedReader = new BufferedReader(fileReader);
                        while (true) {
                            String readLine = bufferedReader.readLine();
                            if (readLine == null) {
                                break;
                            }
                            String trim = readLine.trim();
                            if (!trim.equals(VariableScope.nullOrMissingString) && !trim.startsWith("#")) {
                                GameEngine.m5925e("Running: " + trim);
                                GameEngine.m5925e("got: " + ScriptServerSocket.m5457b("script " + trim).trim());
                            }
                        }
                        bufferedReader.close();
                        fileReader.close();
                        GameEngine.m5925e("End of:" + str);
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        }).start();
    }

    /* renamed from: a */
    public static void m5460a(int i, String str) {
        try {
            f389c = true;
            GameEngine.f6417aT = true;
            ScriptServerSocket scriptServerSocket = new ScriptServerSocket();
            if (i != -1) {
                scriptServerSocket.f387a = new ServerSocket(i);
                new Thread(scriptServerSocket).start();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private ScriptServerSocket() {
    }

    @Override // java.lang.Runnable
    public void run() {
        while (this.f388b) {
            try {
                Socket accept = this.f387a.accept();
                try {
                    accept.setTcpNoDelay(true);
                    new Thread(new RunnableC0086b(this, accept)).run();
                } catch (IOException e) {
                    GameEngine.m5925e("Got IOException on debugSocket connection");
                    e.printStackTrace();
                    throw new RuntimeException(e);
                }
            } catch (IOException e2) {
                throw new RuntimeException(e2);
            }
        }
    }

    /* renamed from: b */
    public static String m5457b(String str) {
        String waitForCompletionOrCrash;
        String str2 = null;
        int indexOf = str.indexOf(" ");
        if (indexOf == -1) {
            indexOf = str.length();
        }
        String lowerCase = str.substring(0, indexOf).toLowerCase(Locale.ENGLISH);
        if (indexOf != -1 && str.length() >= indexOf + 1) {
            str2 = str.substring(indexOf + 1);
            str2.split(" ");
        }
        if (ScriptEngine.getInstance() == null) {
            GameEngine.print("DebugSocketConnection: waiting for ScriptEngine to start....");
            int i = 0;
            while (true) {
                if (i >= 100) {
                    break;
                } else if (ScriptEngine.getInstance() != null) {
                    GameEngine.print("started");
                    break;
                } else {
                    try {
                        Thread.sleep(100L);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    i++;
                }
            }
        }
        if (lowerCase.equalsIgnoreCase("ping")) {
            return "pong";
        }
        if (lowerCase.equalsIgnoreCase("crash")) {
            throw new RuntimeException("test crash");
        }
        if (lowerCase.equalsIgnoreCase("script")) {
            if (str2 == null) {
                return "argString==null";
            }
            String waitForCompletionOrCrash2 = ScriptEngine.getInstance().addScriptToQueue(str2).waitForCompletionOrCrash(false);
            if (waitForCompletionOrCrash2 == null) {
                return "done";
            }
            return waitForCompletionOrCrash2;
        } else if (lowerCase.equalsIgnoreCase("function") || lowerCase.equalsIgnoreCase("functionNoTimeout")) {
            if (str2 == null) {
                return "argString==null";
            }
            final ScriptEngine scriptEngine = ScriptEngine.getInstance();
            final String str3 = str2;
            AbstractRunnableC0087c abstractRunnableC0087c = new AbstractRunnableC0087c() { // from class: com.corrodinggames.rts.a.a.2
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        ScriptEngine.inDebugScript = true;
                        this.f421c = ScriptEngine.this.processArg(str3);
                        ScriptEngine.inDebugScript = false;
                    } catch (Throwable th) {
                        ScriptEngine.inDebugScript = false;
                        throw th;
                    }
                }
            };
            ScriptEngine.Action addRunnableToQueue = scriptEngine.addRunnableToQueue(abstractRunnableC0087c);
            addRunnableToQueue.tryToCatchCrash = true;
            boolean z = false;
            if (lowerCase.equalsIgnoreCase("functionNoTimeout")) {
                z = true;
            }
            if (addRunnableToQueue.waitForCompletionOrCrash(z) == null) {
                return (abstractRunnableC0087c.f421c == null ? "ok\n<NULL>" : "ok\n" + VariableScope.nullOrMissingString + abstractRunnableC0087c.f421c) + "\ufffd\ufffd";
            }
            return ("crash\n" + waitForCompletionOrCrash) + "\ufffd\ufffd";
        } else {
            return "unknown command";
        }
    }
}