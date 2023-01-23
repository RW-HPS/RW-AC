package com.corrodinggames.rts.gameFramework.b;

import android.graphics.Bitmap;
import java.util.ArrayList;
import java.util.HashMap;

/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/b/ac.class */
public class ac {

    /* renamed from: a  reason: collision with root package name */
    public k f426a;
    public ad b;
    public static Bitmap c = Bitmap.a(64, 64, Bitmap.Config.ARGB_8888);
    boolean g;
    HashMap d = new HashMap();
    ArrayList e = new ArrayList();
    int f = 0;
    boolean h = false;
    int i = 0;
    int j = 0;
    int k = 0;
    int l = 1;

    public ac(k kVar, int i, int i2) {
        this.f426a = kVar;
        this.b = new ad(kVar, i, i2);
    }

    public b a(Bitmap bitmap) {
        ae aeVar = (ae) this.d.get(bitmap);
        if (aeVar != null) {
            if (this.h) {
                this.e.add(bitmap);
            }
            return aeVar;
        }
        int b = bitmap.b();
        int c2 = bitmap.c();
        int b2 = this.b.b();
        int c3 = this.b.c();
        if (this.i + b > b2) {
            this.i = 0;
            this.j += this.k + this.l;
            this.k = 0;
        }
        if (this.j + c2 > c3) {
            if (!this.g) {
                this.g = true;
                return null;
            }
            return null;
        }
        ae aeVar2 = new ae();
        aeVar2.f431a = this.b.f431a;
        aeVar2.l = this.b;
        int i = this.i;
        int i2 = this.j;
        this.i += b + this.l;
        if (this.k < c2) {
            this.k = c2;
        }
        this.b.a(this.f426a, bitmap, i, i2);
        aeVar2.o = i;
        aeVar2.p = i2;
        aeVar2.m = i / this.b.e;
        aeVar2.n = i2 / this.b.f;
        aeVar2.e = this.b.e;
        aeVar2.f = this.b.f;
        aeVar2.g = this.b.g;
        aeVar2.h = this.b.h;
        aeVar2.c = b;
        aeVar2.d = c2;
        this.f++;
        this.d.put(bitmap, aeVar2);
        return aeVar2;
    }

    public void b(Bitmap bitmap) {
        if (((ae) this.d.get(bitmap)) != null) {
            this.d.remove(bitmap);
        }
    }
}