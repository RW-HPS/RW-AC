package com.corrodinggames.rts.gameFramework.utility.a;

import android.content.Context;
import android.net.Uri;
import com.corrodinggames.rts.appFramework.common.SAFInterface;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/utility/a/c.class */
public class c {

    /* renamed from: a  reason: collision with root package name */
    String f666a;
    Uri b;
    boolean c;
    HashMap d;
    HashMap e;
    boolean f;
    int g;
    final /* synthetic */ b h;

    public c(b bVar, String str, Uri uri, boolean z) {
        this.h = bVar;
        this.f666a = str;
        this.b = uri;
        this.c = z;
    }

    public HashMap a() {
        if (this.d == null || this.f || this.g != this.h.g) {
            synchronized (this) {
                if (this.d == null || this.f || this.g != this.h.g) {
                    a(com.corrodinggames.rts.appFramework.c.a());
                }
            }
        }
        return this.d;
    }

    public void a(Context context) {
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        if (this.c) {
            Iterator it = a.f664a.listWithDetails(context, this.b).iterator();
            while (it.hasNext()) {
                SAFInterface.FileRow fileRow = (SAFInterface.FileRow) it.next();
                Uri childUri = a.f664a.getChildUri(this.b, fileRow.id);
                String str = fileRow.name;
                boolean z = fileRow.isDirectory;
                if (str.contains("/")) {
                    a.h("Name contains symbols: " + str);
                    str = str.replace("/", "_");
                }
                c cVar = new c(this.h, this.f666a + "/" + str, childUri, z);
                hashMap.put(str, cVar);
                String lowerCase = str.toLowerCase(Locale.ROOT);
                if (hashMap2.get(lowerCase) == null) {
                    hashMap2.put(lowerCase, cVar);
                }
            }
        }
        this.d = hashMap;
        this.e = hashMap2;
        this.f = false;
        this.g = this.h.g;
    }
}