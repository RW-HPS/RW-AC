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
    public ServerSocket a;
    public boolean b = true;
    public static boolean c = false;
    public static boolean d = false;
    static ArrayList e = new ArrayList();

    public static boolean a() {
        return c;
    }

    /* renamed from: a */
    public static void addScriptFilePath(String filePath) {
        c = true;
        e.add(filePath);
    }

    public static void b() {
        if (e.size() == 0) {
            return;
        }
        new Thread(new Runnable() { // from class: com.corrodinggames.rts.a.a.1
            @Override // java.lang.Runnable
            public void run() {
                Iterator it = ScriptServerSocket.e.iterator();
                while (it.hasNext()) {
                    String str = (String) it.next();
                    GameEngine.m5e("Running debug script:" + str);
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
                                GameEngine.m5e("Running: " + trim);
                                GameEngine.m5e("got: " + ScriptServerSocket.b("script " + trim).trim());
                            }
                        }
                        bufferedReader.close();
                        fileReader.close();
                        GameEngine.m5e("End of:" + str);
                    } catch (IOException e2) {
                        throw new RuntimeException(e2);
                    }
                }
            }
        }).start();
    }

    public static void a(int i, String str) {
        try {
            c = true;
            GameEngine.aT = true;
            ScriptServerSocket scriptServerSocket = new ScriptServerSocket();
            if (i != -1) {
                scriptServerSocket.a = new ServerSocket(i);
                new Thread(scriptServerSocket).start();
            }
        } catch (IOException e2) {
            throw new RuntimeException(e2);
        }
    }

    private ScriptServerSocket() {
    }

    @Override // java.lang.Runnable
    public void run() {
        while (this.b) {
            try {
                Socket accept = this.a.accept();
                try {
                    accept.setTcpNoDelay(true);
                    new Thread(new b(this, accept)).run();
                } catch (IOException e2) {
                    GameEngine.m5e("Got IOException on debugSocket connection");
                    e2.printStackTrace();
                    throw new RuntimeException(e2);
                }
            } catch (IOException e3) {
                throw new RuntimeException(e3);
            }
        }
    }

    public static String b(String str) {
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
                    } catch (InterruptedException e2) {
                        e2.printStackTrace();
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
            c cVar = new c() { // from class: com.corrodinggames.rts.a.a.2
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        ScriptEngine.inDebugScript = true;
                        this.c = ScriptEngine.this.processArg(str3);
                        ScriptEngine.inDebugScript = false;
                    } catch (Throwable th) {
                        ScriptEngine.inDebugScript = false;
                        throw th;
                    }
                }
            };
            ScriptEngine.Action addRunnableToQueue = scriptEngine.addRunnableToQueue(cVar);
            addRunnableToQueue.tryToCatchCrash = true;
            boolean z = false;
            if (lowerCase.equalsIgnoreCase("functionNoTimeout")) {
                z = true;
            }
            if (addRunnableToQueue.waitForCompletionOrCrash(z) == null) {
                return (cVar.c == null ? "ok\n<NULL>" : "ok\n" + VariableScope.nullOrMissingString + cVar.c) + "\ufffd\ufffd";
            }
            return ("crash\n" + waitForCompletionOrCrash) + "\ufffd\ufffd";
        } else {
            return "unknown command";
        }
    }
}