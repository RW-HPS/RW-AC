package com.corrodinggames.rts.a;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

/* loaded from: game-lib.jar:com/corrodinggames/rts/a/b.class */
public class b implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    Socket f83a;
    final /* synthetic */ a b;

    public b(a aVar, Socket socket) {
        this.b = aVar;
        this.f83a = socket;
    }

    @Override // java.lang.Runnable
    public void run() {
        String readLine;
        try {
            try {
                PrintWriter printWriter = new PrintWriter(this.f83a.getOutputStream(), true);
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(this.f83a.getInputStream()));
                while (this.b.b && (readLine = bufferedReader.readLine()) != null) {
                    printWriter.print(a.b(readLine));
                    printWriter.flush();
                }
            } catch (IOException e) {
                e.printStackTrace();
                try {
                    this.f83a.close();
                } catch (IOException e2) {
                    e2.printStackTrace();
                }
            }
        } finally {
            try {
                this.f83a.close();
            } catch (IOException e3) {
                e3.printStackTrace();
            }
        }
    }
}