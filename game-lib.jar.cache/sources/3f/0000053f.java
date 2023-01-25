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

    /* renamed from: a */
    ReentrantLock f6105a = new ReentrantLock();

    /* renamed from: a */
    public HttpClient m1259a() {
        return mo103a(30000, false);
    }

    /* renamed from: b */
    public HttpClient m1258b() {
        return mo103a(30000, true);
    }

    /* renamed from: a */
    public HttpClient mo103a(int i, boolean z) {
        DefaultHttpClient defaultHttpClient;
        boolean z2 = false;
        try {
            z2 = this.f6105a.tryLock(300L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        if (!z2) {
            try {
                GameEngine.m1015b("LoadFromMasterServer", "Could not get getNewHttpClient lock! another thread maybe stuck in getNewHttpClient!");
            } catch (Throwable th) {
                if (z2) {
                    this.f6105a.unlock();
                }
                throw th;
            }
        }
        if (!z) {
            defaultHttpClient = AndroidHttpClient.m5132a((String) null);
        } else {
            defaultHttpClient = new DefaultHttpClient();
        }
        HttpParams params = defaultHttpClient.getParams();
        HttpConnectionParams.setConnectionTimeout(params, i);
        HttpConnectionParams.setSoTimeout(params, 20000);
        if (z2) {
            this.f6105a.unlock();
        }
        return defaultHttpClient;
    }

    /* renamed from: a */
    public void mo102a(HttpClient httpClient) {
        if (httpClient instanceof AndroidHttpClient) {
            ((AndroidHttpClient) httpClient).m5134a();
        }
    }
}