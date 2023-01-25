package com.corrodinggames.rts.debug;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

/* renamed from: com.corrodinggames.rts.a.b */
/* loaded from: game-lib.jar:com/corrodinggames/rts/a/b.class */
public class RunnableC0086b implements Runnable {

    /* renamed from: a */
    Socket f419a;

    /* renamed from: b */
    final /* synthetic */ ScriptServerSocket f420b;

    public RunnableC0086b(ScriptServerSocket scriptServerSocket, Socket socket) {
        this.f420b = scriptServerSocket;
        this.f419a = socket;
    }

    @Override // java.lang.Runnable
    public void run() {
        String readLine;
        try {
            try {
                PrintWriter printWriter = new PrintWriter(this.f419a.getOutputStream(), true);
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(this.f419a.getInputStream()));
                while (this.f420b.f388b && (readLine = bufferedReader.readLine()) != null) {
                    printWriter.print(ScriptServerSocket.m5457b(readLine));
                    printWriter.flush();
                }
            } catch (IOException e) {
                e.printStackTrace();
                try {
                    this.f419a.close();
                } catch (IOException e2) {
                    e2.printStackTrace();
                }
            }
        } finally {
            try {
                this.f419a.close();
            } catch (IOException e3) {
                e3.printStackTrace();
            }
        }
    }
}