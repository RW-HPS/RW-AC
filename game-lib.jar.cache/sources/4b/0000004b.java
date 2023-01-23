package android.net.http;

import org.apache.http.HttpRequest;
import org.apache.http.HttpRequestInterceptor;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.protocol.HttpContext;

/* loaded from: game-lib.jar:android/net/http/a.class */
class a implements HttpRequestInterceptor {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ AndroidHttpClient f54a;

    private a(AndroidHttpClient androidHttpClient) {
        this.f54a = androidHttpClient;
    }

    public void process(HttpRequest httpRequest, HttpContext httpContext) {
        boolean a2;
        b a3 = AndroidHttpClient.a(this.f54a);
        if (a3 != null) {
            a2 = a3.a();
            if (a2 && (httpRequest instanceof HttpUriRequest)) {
                a3.a(AndroidHttpClient.a((HttpUriRequest) httpRequest, false));
            }
        }
    }
}