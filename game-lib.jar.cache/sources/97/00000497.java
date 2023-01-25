package com.corrodinggames.rts.gameFramework.writeErrorFile;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

/* renamed from: com.corrodinggames.rts.gameFramework.c.b */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/c/b.class */
public class RunnableC0753b implements Runnable {

    /* renamed from: a */
    Socket f4716a;

    /* renamed from: b */
    final /* synthetic */ RunnableC0752a f4717b;

    public RunnableC0753b(RunnableC0752a runnableC0752a, Socket socket) {
        this.f4717b = runnableC0752a;
        this.f4716a = socket;
    }

    @Override // java.lang.Runnable
    public void run() {
        String readLine;
        try {
            try {
                PrintWriter printWriter = new PrintWriter(this.f4716a.getOutputStream(), true);
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(this.f4716a.getInputStream()));
                while (this.f4717b.f4715i && (readLine = bufferedReader.readLine()) != null) {
                    printWriter.print(RunnableC0752a.m2413a(readLine));
                    printWriter.flush();
                }
            } catch (IOException e) {
                e.printStackTrace();
                try {
                    this.f4716a.close();
                } catch (IOException e2) {
                    e2.printStackTrace();
                }
            }
        } finally {
            try {
                this.f4716a.close();
            } catch (IOException e3) {
                e3.printStackTrace();
            }
        }
    }
}