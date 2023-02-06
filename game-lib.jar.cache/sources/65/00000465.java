package com.corrodinggames.rts.gameFramework.b;

import android.graphics.Bitmap;
import android.graphics.Paint;
import java.util.Map;

/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/b/f.class */
public class f {
    protected final k a;
    private Map b;
    private a c;
    private g d;
    private af e;

    public void a(b bVar) {
        this.a.c(bVar);
    }

    public void a() {
        this.a.d();
    }

    public k b() {
        return this.a;
    }

    public b a(Bitmap bitmap, com.corrodinggames.rts.gameFramework.unitAction.e eVar, af afVar) {
        this.e = afVar;
        b a = a(bitmap, eVar);
        if (afVar instanceof i) {
            a = ((i) afVar).a(a, this.a, new j() { // from class: com.corrodinggames.rts.gameFramework.b.f.1
                @Override // com.corrodinggames.rts.gameFramework.b.j
                public void a(b bVar, af afVar2, boolean z) {
                    f.this.a.a(bVar, 0, 0, bVar.b(), bVar.c(), afVar2, null);
                }
            });
        }
        return a;
    }

    public void a(Bitmap bitmap) {
        b bVar = (b) this.b.get(bitmap);
        if (bVar != null && (bVar instanceof ah)) {
            ((ah) bVar).l();
        }
        b().a(bitmap);
    }

    public b a(Bitmap bitmap, com.corrodinggames.rts.gameFramework.unitAction.e eVar) {
        e eVar2 = (b) this.b.get(bitmap);
        if (eVar2 == null) {
            this.a.e();
            c();
            eVar2 = new e(bitmap);
            eVar2.c(b());
            eVar2.j = eVar.d();
            n.b(eVar2.e, eVar2.f);
            this.b.put(bitmap, eVar2);
            d();
        }
        return eVar2;
    }

    public void a(float f, float f2, float f3, v vVar) {
        if (vVar.c() == Paint.Style.FILL) {
            this.d.a(0.5f);
        } else {
            float b = vVar.b();
            if (b == 0.0f) {
                b = 1.0f;
            }
            this.d.a(b / (2.0f * f3));
        }
        this.a.a(f - f3, f2 - f3, f3, vVar, this.d);
    }

    public void a(float f, float f2, float f3, float f4, v vVar) {
        this.a.a(f, f2, f3, f4, vVar, this.c);
    }

    public void c() {
        this.a.b();
    }

    public void d() {
        this.a.c();
    }

    public void e() {
        for (b bVar : this.b.values()) {
            bVar.j();
        }
        this.b.clear();
    }

    protected void finalize() {
        super.finalize();
        e();
    }

    public void a(int i, int i2, int i3, int i4) {
        this.a.a(i, i2, i3, i4);
    }

    public void a(String str, float f, float f2, Paint paint) {
        this.a.a(str, f, f2, paint);
    }

    public void a(float[] fArr, int i, int i2, v vVar) {
        this.a.a(fArr, i, i2, vVar, this.c);
    }
}