package com.corrodinggames.rts.gameFramework.Interface.a;

import android.graphics.Color;
import com.corrodinggames.rts.gameFramework.translations.a;
import com.corrodinggames.rts.gameFramework.utility.SlickToAndroidKeycodes;

/* renamed from: com.corrodinggames.rts.gameFramework.f.a.f */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/f/a/f.class */
public class f extends n {
    g a;

    public static f a(String str, boolean z) {
        f fVar = new f();
        fVar.b = h.n;
        fVar.i = 200.0f;
        fVar.j = 200.0f;
        j jVar = new j();
        jVar.a(str);
        jVar.e(5.0f);
        jVar.f(5.0f);
        jVar.a(-1);
        fVar.a(jVar);
        fVar.a = new g(m.horizontal);
        fVar.a(fVar.a);
        if (z) {
            fVar.b(a.a("menus.common.cancel", new Object[0])).a(new k() { // from class: com.corrodinggames.rts.gameFramework.f.a.f.1
                @Override // com.corrodinggames.rts.gameFramework.Interface.a.k
                public boolean a(c cVar) {
                    f.this.i();
                    return true;
                }
            });
        }
        return fVar;
    }

    public b a(String str) {
        b bVar = new b();
        bVar.a(str);
        bVar.e(5.0f);
        bVar.f(5.0f);
        bVar.a(Color.a(255, 30, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_SATELLITE_SERVICE, 30));
        return bVar;
    }

    public b b(String str) {
        return a(str, (k) null);
    }

    public b a(String str, k kVar) {
        b a = a(str);
        a.a(kVar);
        this.a.a(a);
        return a;
    }

    public void u_() {
        if (!this.s) {
            return;
        }
        b();
    }

    @Override // com.corrodinggames.rts.gameFramework.Interface.a.l
    public void b() {
        super.b();
        d();
        this.i = this.z;
        this.j = this.y;
        this.i += this.m + this.n;
        this.j += this.k + this.l;
    }
}