package android.net.http;

import org.apache.http.HttpRequest;
import org.apache.http.HttpRequestInterceptor;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.protocol.HttpContext;

/* loaded from: game-lib.jar:android/net/http/a.class */
class a implements HttpRequestInterceptor {
    final /* synthetic */ AndroidHttpClient a;

    private a(AndroidHttpClient androidHttpClient) {
        this.a = androidHttpClient;
    }

    public void process(HttpRequest httpRequest, HttpContext httpContext) {
        boolean a;
        b a2 = AndroidHttpClient.a(this.a);
        if (a2 != null) {
            a = a2.a();
            if (a && (httpRequest instanceof HttpUriRequest)) {
                a2.a(AndroidHttpClient.a((HttpUriRequest) httpRequest, false));
            }
        }
    }
}