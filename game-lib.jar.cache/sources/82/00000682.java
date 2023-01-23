package com.corrodinggames.rts.java;

import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.net.HTTPService;
import java.io.IOException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;

/* renamed from: com.corrodinggames.rts.java.k */
/* loaded from: game-lib.jar:com/corrodinggames/rts/java/k.class */
public class HTTP extends HTTPService {
    @Override // com.corrodinggames.rts.gameFramework.net.HTTPService
    public HttpClient a(int i, boolean z) {
        RequestConfig.Builder connectionRequestTimeout = RequestConfig.custom().setConnectTimeout(i).setConnectionRequestTimeout(i);
        HttpClientBuilder create = HttpClientBuilder.create();
        create.setDefaultRequestConfig(connectionRequestTimeout.build());
        return create.build();
    }

    @Override // com.corrodinggames.rts.gameFramework.net.HTTPService
    public void a(HttpClient httpClient) {
        if (httpClient instanceof CloseableHttpClient) {
            try {
                ((CloseableHttpClient) httpClient).close();
                return;
            } catch (IOException e) {
                e.printStackTrace();
                return;
            }
        }
        GameEngine.m2e("closeHttpClient: Didn't close");
    }
}