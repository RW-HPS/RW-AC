package android.net.http;

import org.apache.http.HttpRequest;
import org.apache.http.HttpRequestInterceptor;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.protocol.HttpContext;

/* renamed from: android.net.http.a */
/* loaded from: game-lib.jar:android/net/http/a.class */
class C0036a implements HttpRequestInterceptor {

    /* renamed from: a */
    final /* synthetic */ AndroidHttpClient f265a;

    private C0036a(AndroidHttpClient androidHttpClient) {
        this.f265a = androidHttpClient;
    }

    public void process(HttpRequest httpRequest, HttpContext httpContext) {
        boolean m5126a;
        C0037b m5133a = AndroidHttpClient.m5133a(this.f265a);
        if (m5133a != null) {
            m5126a = m5133a.m5126a();
            if (m5126a && (httpRequest instanceof HttpUriRequest)) {
                m5133a.m5123a(AndroidHttpClient.m5129a((HttpUriRequest) httpRequest, false));
            }
        }
    }
}