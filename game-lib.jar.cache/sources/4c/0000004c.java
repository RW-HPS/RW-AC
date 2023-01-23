package android.net.http;

import android.util.Log;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: game-lib.jar:android/net/http/b.class */
public class b {

    /* renamed from: a  reason: collision with root package name */
    private final String f55a;
    private final int b;

    /* JADX INFO: Access modifiers changed from: private */
    public boolean a() {
        return Log.isLoggable(this.f55a, this.b);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str) {
        Log.a(this.b, this.f55a, str);
    }
}