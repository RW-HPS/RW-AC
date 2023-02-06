package com.corrodinggames.rts.debug;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

/* renamed from: com.corrodinggames.rts.a.b */
/* loaded from: game-lib.jar:com/corrodinggames/rts/a/b.class */
public class b implements Runnable {
    Socket a;
    final /* synthetic */ ScriptServerSocket b;

    public b(ScriptServerSocket scriptServerSocket, Socket socket) {
        this.b = scriptServerSocket;
        this.a = socket;
    }

    @Override // java.lang.Runnable
    public void run() {
        String readLine;
        try {
            try {
                PrintWriter printWriter = new PrintWriter(this.a.getOutputStream(), true);
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(this.a.getInputStream()));
                while (this.b.b && (readLine = bufferedReader.readLine()) != null) {
                    printWriter.print(ScriptServerSocket.b(readLine));
                    printWriter.flush();
                }
            } catch (IOException e) {
                e.printStackTrace();
                try {
                    this.a.close();
                } catch (IOException e2) {
                    e2.printStackTrace();
                }
            }
        } finally {
            try {
                this.a.close();
            } catch (IOException e3) {
                e3.printStackTrace();
            }
        }
    }
}