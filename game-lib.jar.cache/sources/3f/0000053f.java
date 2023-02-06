package com.corrodinggames.rts.gameFramework.net;

import android.net.http.AndroidHttpClient;
import com.corrodinggames.rts.gameFramework.GameEngine;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;
import org.apache.http.client.HttpClient;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.params.HttpConnectionParams;
import org.apache.http.params.HttpParams;

/* renamed from: com.corrodinggames.rts.gameFramework.j.r */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/j/r.class */
public class HTTPService {
    ReentrantLock a = new ReentrantLock();

    public HttpClient a() {
        return a(30000, false);
    }

    public HttpClient b() {
        return a(30000, true);
    }

    public HttpClient a(int i, boolean z) {
        DefaultHttpClient defaultHttpClient;
        boolean z2 = false;
        try {
            z2 = this.a.tryLock(300L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        if (!z2) {
            try {
                GameEngine.b("LoadFromMasterServer", "Could not get getNewHttpClient lock! another thread maybe stuck in getNewHttpClient!");
            } catch (Throwable th) {
                if (z2) {
                    this.a.unlock();
                }
                throw th;
            }
        }
        if (!z) {
            defaultHttpClient = AndroidHttpClient.a((String) null);
        } else {
            defaultHttpClient = new DefaultHttpClient();
        }
        HttpParams params = defaultHttpClient.getParams();
        HttpConnectionParams.setConnectionTimeout(params, i);
        HttpConnectionParams.setSoTimeout(params, 20000);
        if (z2) {
            this.a.unlock();
        }
        return defaultHttpClient;
    }

    public void a(HttpClient httpClient) {
        if (httpClient instanceof AndroidHttpClient) {
            ((AndroidHttpClient) httpClient).a();
        }
    }
}