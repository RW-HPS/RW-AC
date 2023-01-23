package android.net.http;

import android.content.Context;
import android.net.SSLCertificateSocketFactory;
import android.net.SSLSessionCache;
import android.os.Looper;
import android.util.Base64;
import android.util.Log;
import java.io.ByteArrayOutputStream;
import java.net.URI;
import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.HttpEntityEnclosingRequest;
import org.apache.http.HttpHost;
import org.apache.http.HttpRequest;
import org.apache.http.HttpRequestInterceptor;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.ResponseHandler;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.client.params.HttpClientParams;
import org.apache.http.conn.ClientConnectionManager;
import org.apache.http.conn.scheme.PlainSocketFactory;
import org.apache.http.conn.scheme.Scheme;
import org.apache.http.conn.scheme.SchemeRegistry;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.impl.client.RequestWrapper;
import org.apache.http.impl.conn.tsccm.ThreadSafeClientConnManager;
import org.apache.http.params.BasicHttpParams;
import org.apache.http.params.HttpConnectionParams;
import org.apache.http.params.HttpParams;
import org.apache.http.params.HttpProtocolParams;
import org.apache.http.protocol.BasicHttpContext;
import org.apache.http.protocol.BasicHttpProcessor;
import org.apache.http.protocol.HttpContext;

/* loaded from: game-lib.jar:android/net/http/AndroidHttpClient.class */
public final class AndroidHttpClient implements HttpClient {

    /* renamed from: a */
    public static long f51a = 256;
    private static String[] b = {"text/", "application/xml", "application/json"};
    private static final HttpRequestInterceptor c = new HttpRequestInterceptor() { // from class: android.net.http.AndroidHttpClient.1
        public void process(HttpRequest httpRequest, HttpContext httpContext) {
            if (Looper.d() != null && Looper.d() == Looper.b()) {
                throw new RuntimeException("This thread forbids HTTP requests");
            }
        }
    };
    private final HttpClient d;
    private RuntimeException e = new IllegalStateException("AndroidHttpClient created and never closed");
    private volatile b f;

    public static AndroidHttpClient a(String str, Context context) {
        BasicHttpParams basicHttpParams = new BasicHttpParams();
        HttpConnectionParams.setStaleCheckingEnabled(basicHttpParams, false);
        HttpConnectionParams.setConnectionTimeout(basicHttpParams, 60000);
        HttpConnectionParams.setSoTimeout(basicHttpParams, 60000);
        HttpConnectionParams.setSocketBufferSize(basicHttpParams, 8192);
        HttpClientParams.setRedirecting(basicHttpParams, false);
        SSLSessionCache sSLSessionCache = context == null ? null : new SSLSessionCache(context);
        HttpProtocolParams.setUserAgent(basicHttpParams, str);
        SchemeRegistry schemeRegistry = new SchemeRegistry();
        schemeRegistry.register(new Scheme("http", PlainSocketFactory.getSocketFactory(), 80));
        schemeRegistry.register(new Scheme("https", SSLCertificateSocketFactory.getHttpSocketFactory(60000, sSLSessionCache), 443));
        return new AndroidHttpClient(new ThreadSafeClientConnManager(basicHttpParams, schemeRegistry), basicHttpParams);
    }

    public static AndroidHttpClient a(String str) {
        return a(str, (Context) null);
    }

    private AndroidHttpClient(ClientConnectionManager clientConnectionManager, HttpParams httpParams) {
        this.d = new DefaultHttpClient(clientConnectionManager, httpParams) { // from class: android.net.http.AndroidHttpClient.2
            {
                AndroidHttpClient.this = this;
            }

            protected BasicHttpProcessor createHttpProcessor() {
                BasicHttpProcessor createHttpProcessor = super.createHttpProcessor();
                createHttpProcessor.addRequestInterceptor(AndroidHttpClient.c);
                createHttpProcessor.addRequestInterceptor(new a(AndroidHttpClient.this));
                return createHttpProcessor;
            }

            protected HttpContext createHttpContext() {
                BasicHttpContext basicHttpContext = new BasicHttpContext();
                basicHttpContext.setAttribute("http.authscheme-registry", getAuthSchemes());
                basicHttpContext.setAttribute("http.cookiespec-registry", getCookieSpecs());
                basicHttpContext.setAttribute("http.auth.credentials-provider", getCredentialsProvider());
                return basicHttpContext;
            }
        };
    }

    protected void finalize() {
        super.finalize();
        if (this.e != null) {
            Log.b("AndroidHttpClient", "Leak found", this.e);
            this.e = null;
        }
    }

    public void a() {
        if (this.e != null) {
            getConnectionManager().shutdown();
            this.e = null;
        }
    }

    public HttpParams getParams() {
        return this.d.getParams();
    }

    public ClientConnectionManager getConnectionManager() {
        return this.d.getConnectionManager();
    }

    public HttpResponse execute(HttpUriRequest httpUriRequest) {
        return this.d.execute(httpUriRequest);
    }

    public HttpResponse execute(HttpUriRequest httpUriRequest, HttpContext httpContext) {
        return this.d.execute(httpUriRequest, httpContext);
    }

    public HttpResponse execute(HttpHost httpHost, HttpRequest httpRequest) {
        return this.d.execute(httpHost, httpRequest);
    }

    public HttpResponse execute(HttpHost httpHost, HttpRequest httpRequest, HttpContext httpContext) {
        return this.d.execute(httpHost, httpRequest, httpContext);
    }

    public Object execute(HttpUriRequest httpUriRequest, ResponseHandler responseHandler) {
        return this.d.execute(httpUriRequest, responseHandler);
    }

    public Object execute(HttpUriRequest httpUriRequest, ResponseHandler responseHandler, HttpContext httpContext) {
        return this.d.execute(httpUriRequest, responseHandler, httpContext);
    }

    public Object execute(HttpHost httpHost, HttpRequest httpRequest, ResponseHandler responseHandler) {
        return this.d.execute(httpHost, httpRequest, responseHandler);
    }

    public Object execute(HttpHost httpHost, HttpRequest httpRequest, ResponseHandler responseHandler, HttpContext httpContext) {
        return this.d.execute(httpHost, httpRequest, responseHandler, httpContext);
    }

    public static String b(HttpUriRequest httpUriRequest, boolean z) {
        Header[] allHeaders;
        HttpEntity entity;
        StringBuilder sb = new StringBuilder();
        sb.append("curl ");
        sb.append("-X ");
        sb.append(httpUriRequest.getMethod());
        sb.append(" ");
        for (Header header : httpUriRequest.getAllHeaders()) {
            if (z || (!header.getName().equals("Authorization") && !header.getName().equals("Cookie"))) {
                sb.append("--header \"");
                sb.append(header.toString().trim());
                sb.append("\" ");
            }
        }
        URI uri = httpUriRequest.getURI();
        if (httpUriRequest instanceof RequestWrapper) {
            HttpUriRequest original = ((RequestWrapper) httpUriRequest).getOriginal();
            if (original instanceof HttpUriRequest) {
                uri = original.getURI();
            }
        }
        sb.append("\"");
        sb.append(uri);
        sb.append("\"");
        if ((httpUriRequest instanceof HttpEntityEnclosingRequest) && (entity = ((HttpEntityEnclosingRequest) httpUriRequest).getEntity()) != null && entity.isRepeatable()) {
            if (entity.getContentLength() < 1024) {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                entity.writeTo(byteArrayOutputStream);
                if (a(httpUriRequest)) {
                    sb.insert(0, "echo '" + Base64.encodeToString(byteArrayOutputStream.toByteArray(), 2) + "' | base64 -d > /tmp/$$.bin; ");
                    sb.append(" --data-binary @/tmp/$$.bin");
                } else {
                    sb.append(" --data-ascii \"").append(byteArrayOutputStream.toString()).append("\"");
                }
            } else {
                sb.append(" [TOO MUCH DATA TO INCLUDE]");
            }
        }
        return sb.toString();
    }

    private static boolean a(HttpUriRequest httpUriRequest) {
        Header[] headers = httpUriRequest.getHeaders("content-encoding");
        if (headers != null) {
            for (Header header : headers) {
                if ("gzip".equalsIgnoreCase(header.getValue())) {
                    return true;
                }
            }
        }
        Header[] headers2 = httpUriRequest.getHeaders("content-type");
        if (headers2 != null) {
            for (Header header2 : headers2) {
                for (String str : b) {
                    if (header2.getValue().startsWith(str)) {
                        return false;
                    }
                }
            }
            return true;
        }
        return true;
    }
}