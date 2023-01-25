package com.corrodinggames.rts.gameFramework.utility.p049a;

import android.content.Context;
import android.net.Uri;
import com.corrodinggames.rts.appFramework.C0090c;
import com.corrodinggames.rts.appFramework.common.SAFInterface;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;

/* renamed from: com.corrodinggames.rts.gameFramework.utility.a.c */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/utility/a/c.class */
class C1105c {

    /* renamed from: a */
    String f7023a;

    /* renamed from: b */
    Uri f7024b;

    /* renamed from: c */
    boolean f7025c;

    /* renamed from: d */
    HashMap f7026d;

    /* renamed from: e */
    HashMap f7027e;

    /* renamed from: f */
    boolean f7028f;

    /* renamed from: g */
    int f7029g;

    /* renamed from: h */
    final /* synthetic */ C1104b f7030h;

    public C1105c(C1104b c1104b, String str, Uri uri, boolean z) {
        this.f7030h = c1104b;
        this.f7023a = str;
        this.f7024b = uri;
        this.f7025c = z;
    }

    /* renamed from: a */
    public HashMap m710a() {
        if (this.f7026d == null || this.f7028f || this.f7029g != this.f7030h.f7022g) {
            synchronized (this) {
                if (this.f7026d == null || this.f7028f || this.f7029g != this.f7030h.f7022g) {
                    m709a(C0090c.m4947a());
                }
            }
        }
        return this.f7026d;
    }

    /* renamed from: a */
    public void m709a(Context context) {
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        if (this.f7025c) {
            Iterator it = C1103a.f7013a.listWithDetails(context, this.f7024b).iterator();
            while (it.hasNext()) {
                SAFInterface.FileRow fileRow = (SAFInterface.FileRow) it.next();
                Uri childUri = C1103a.f7013a.getChildUri(this.f7024b, fileRow.id);
                String str = fileRow.name;
                boolean z = fileRow.isDirectory;
                if (str.contains("/")) {
                    C1103a.m734h("Name contains symbols: " + str);
                    str = str.replace("/", "_");
                }
                C1105c c1105c = new C1105c(this.f7030h, this.f7023a + "/" + str, childUri, z);
                hashMap.put(str, c1105c);
                String lowerCase = str.toLowerCase(Locale.ROOT);
                if (hashMap2.get(lowerCase) == null) {
                    hashMap2.put(lowerCase, c1105c);
                }
            }
        }
        this.f7026d = hashMap;
        this.f7027e = hashMap2;
        this.f7028f = false;
        this.f7029g = this.f7030h.f7022g;
    }
}