package com.corrodinggames.rts.gameFramework.unitAction;

import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.LightingColorFilter;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.p031b.AbstractC0699b;
import com.corrodinggames.rts.gameFramework.p031b.C0688ac;
import com.corrodinggames.rts.gameFramework.p031b.C0700c;
import com.corrodinggames.rts.gameFramework.p031b.C0703f;
import com.corrodinggames.rts.gameFramework.p031b.C0712n;
import com.corrodinggames.rts.gameFramework.p031b.C0720v;
import com.corrodinggames.rts.gameFramework.p031b.InterfaceC0710l;
import java.util.concurrent.locks.Lock;

/* renamed from: com.corrodinggames.rts.gameFramework.m.k */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/m/k.class */
public class C0976k implements InterfaceC0977l {

    /* renamed from: a */
    public C0703f f6665a;

    /* renamed from: b */
    public C0712n f6666b;

    /* renamed from: c */
    C0720v f6667c;

    /* renamed from: e */
    Rect f6669e;

    /* renamed from: f */
    RectF f6670f;

    /* renamed from: g */
    C0700c f6671g;

    /* renamed from: h */
    RectF f6672h;

    /* renamed from: i */
    float[] f6673i;

    /* renamed from: j */
    static C0970e f6674j;

    /* renamed from: n */
    C0970e f6678n;

    /* renamed from: o */
    boolean f6679o;

    /* renamed from: d */
    public static boolean f6668d = false;

    /* renamed from: k */
    static Rect f6675k = new Rect(0, 0, 1, 1);

    /* renamed from: l */
    static Paint f6676l = new Paint();

    /* renamed from: m */
    static Rect f6677m = new Rect();

    /* renamed from: b */
    public void m878b(C0970e c0970e) {
        this.f6665a.m2620a(this.f6665a.m2621a(c0970e.mo391b(), c0970e, this.f6671g));
    }

    /* renamed from: d */
    public void m876d() {
        this.f6665a.m2627a();
    }

    /* renamed from: a */
    public C0720v m881a(Paint paint) {
        this.f6666b.m2577a((C0964ae) null);
        if (paint == null) {
            return null;
        }
        this.f6667c.m2526a(paint.m5192d());
        this.f6667c.m2527a(paint.m5188e());
        this.f6667c.m2528a(paint.m5184g());
        return this.f6667c;
    }

    @Override // com.corrodinggames.rts.gameFramework.unitAction.InterfaceC0977l
    /* renamed from: a */
    public void mo865a(Rect rect) {
        this.f6665a.m2624a(rect.f230a, rect.f231b, rect.f232c, rect.f233d);
    }

    @Override // com.corrodinggames.rts.gameFramework.unitAction.InterfaceC0977l
    /* renamed from: a */
    public void mo863a(RectF rectF) {
        this.f6665a.m2624a((int) rectF.f234a, (int) rectF.f235b, (int) rectF.f236c, (int) rectF.f237d);
    }

    @Override // com.corrodinggames.rts.gameFramework.unitAction.InterfaceC0977l
    /* renamed from: a */
    public void mo859a(C0970e c0970e, float f, float f2, Paint paint) {
        this.f6669e.m5166a(0, 0, c0970e.mo387m(), c0970e.mo388l());
        this.f6670f.m5152a(f, f2, f + c0970e.mo387m(), f2 + c0970e.mo388l());
        m877b(c0970e, this.f6669e, this.f6670f, paint);
    }

    @Override // com.corrodinggames.rts.gameFramework.unitAction.InterfaceC0977l
    /* renamed from: a */
    public void mo858a(C0970e c0970e, Rect rect, Rect rect2, Paint paint) {
        this.f6670f.m5151a(rect2);
        m877b(c0970e, rect, this.f6670f, paint);
    }

    /* renamed from: a */
    public AbstractC0699b m882a(Bitmap bitmap, C0970e c0970e) {
        AbstractC0699b m2674a;
        C0712n c0712n = this.f6666b;
        if (c0712n.f4439a == null) {
            c0712n.f4439a = new C0688ac(c0712n, 1024, 1024);
        }
        if (bitmap.m5269b() < 450 && bitmap.m5266c() < 100 && (m2674a = c0712n.f4439a.m2674a(bitmap)) != null) {
            return m2674a;
        }
        return this.f6665a.m2621a(bitmap, c0970e, this.f6671g);
    }

    @Override // com.corrodinggames.rts.gameFramework.unitAction.InterfaceC0977l
    /* renamed from: a */
    public void mo857a(C0970e c0970e, Rect rect, RectF rectF, Paint paint) {
        m877b(c0970e, rect, rectF, paint);
    }

    /* renamed from: b */
    public void m877b(C0970e c0970e, Rect rect, RectF rectF, Paint paint) {
        Bitmap m950a = C0960aa.m950a(c0970e);
        this.f6672h.m5151a(rect);
        if (m950a == null) {
            throw new RuntimeException("bitmap==null. sourceImage: " + c0970e.mo65a());
        }
        AbstractC0699b m882a = m882a(m950a, c0970e);
        C0712n c0712n = this.f6666b;
        boolean z = true;
        if (paint == null) {
            c0712n.f4484w = -1;
        } else {
            int m5188e = paint.m5188e();
            if (m5188e != -1 && paint.m5183h() == null) {
                m5188e = Color.m5237a(Color.m5239a(m5188e), 255, 255, 255);
            }
            c0712n.f4484w = m5188e;
            if (paint instanceof C0966ag) {
                z = ((C0966ag) paint).m909p();
            } else {
                z = paint.m5196c();
            }
        }
        c0712n.m2586a(m882a, z ? 9729 : 9728);
        C0964ae c0964ae = null;
        if (paint instanceof C0966ag) {
            c0964ae = ((C0966ag) paint).m908q();
        }
        if (c0970e != null && c0964ae == null) {
            c0964ae = c0970e.mo906B();
        }
        if (c0964ae != null) {
            boolean mo885a = c0964ae.mo885a(paint, c0970e);
            this.f6666b.m2577a(c0964ae);
            if (mo885a) {
                this.f6666b.mo2551e();
                this.f6666b.m2541o();
            }
        } else {
            this.f6666b.m2577a((C0964ae) null);
        }
        c0712n.m2581a(m882a, this.f6672h, rectF, this.f6671g, (InterfaceC0710l) null);
    }

    @Override // com.corrodinggames.rts.gameFramework.unitAction.InterfaceC0977l
    /* renamed from: a */
    public void mo866a(Bitmap bitmap) {
        this.f6665a.m2623a(bitmap);
    }

    @Override // com.corrodinggames.rts.gameFramework.unitAction.InterfaceC0977l
    /* renamed from: a */
    public void mo869a(float f, float f2, float f3, Paint paint) {
        this.f6665a.m2625a(f, f2, f3, m881a(paint));
    }

    @Override // com.corrodinggames.rts.gameFramework.unitAction.InterfaceC0977l
    /* renamed from: a */
    public void mo867a(int i, PorterDuff.Mode mode) {
        this.f6666b.m2573a(m879b(i));
    }

    @Override // com.corrodinggames.rts.gameFramework.unitAction.InterfaceC0977l
    /* renamed from: a */
    public void mo868a(int i) {
        this.f6666b.m2573a(m879b(i));
    }

    /* renamed from: b */
    float[] m879b(int i) {
        float f = ((i >>> 24) & 255) * 0.003921569f * 1.0f;
        float f2 = ((i >>> 16) & 255) * 0.003921569f * f;
        float f3 = ((i >>> 8) & 255) * 0.003921569f * f;
        this.f6673i[0] = f;
        this.f6673i[1] = f2;
        this.f6673i[2] = f3;
        this.f6673i[3] = (i & 255) * 0.003921569f * f;
        return this.f6673i;
    }

    @Override // com.corrodinggames.rts.gameFramework.unitAction.InterfaceC0977l
    /* renamed from: a */
    public void mo870a(float f, float f2, float f3, float f4, Paint paint) {
        this.f6665a.m2626a(f, f2, f3, f4, m881a(paint));
    }

    @Override // com.corrodinggames.rts.gameFramework.unitAction.InterfaceC0977l
    /* renamed from: a */
    public void mo848a(float[] fArr, int i, int i2, Paint paint) {
        this.f6665a.m2618a(fArr, i, i2, m881a(paint));
    }

    /* renamed from: b */
    public void m880b(float f, float f2, float f3, float f4, Paint paint) {
        if (f6674j == null) {
            Bitmap m5278a = Bitmap.m5278a(1, 1, Bitmap.Config.ARGB_8888);
            m5278a.m5280a(0, 0, -1);
            C0970e c0970e = new C0970e();
            c0970e.mo394a(m5278a);
            f6674j = c0970e;
            f6676l.mo914a(false);
            f6676l.m5219a(new LightingColorFilter(-1, -16777216));
        }
        f6676l.m5200b(paint.m5188e());
        if (paint.m5192d() == Paint.Style.STROKE) {
            float m5184g = paint.m5184g();
            if (m5184g == 0.0f) {
                m5184g = 1.0f;
            }
            this.f6670f.m5152a(f, f2, f3, f2 + m5184g);
            m877b(f6674j, f6675k, this.f6670f, f6676l);
            this.f6670f.m5152a(f, f4, f3, f4 + m5184g);
            m877b(f6674j, f6675k, this.f6670f, f6676l);
            this.f6670f.m5152a(f, f2, f + m5184g, f4);
            m877b(f6674j, f6675k, this.f6670f, f6676l);
            this.f6670f.m5152a(f3, f2, f3 + m5184g, f4);
            m877b(f6674j, f6675k, this.f6670f, f6676l);
            return;
        }
        this.f6670f.m5152a(f, f2, f3, f4);
        m877b(f6674j, f6675k, this.f6670f, f6676l);
    }

    @Override // com.corrodinggames.rts.gameFramework.unitAction.InterfaceC0977l
    /* renamed from: a */
    public void mo864a(Rect rect, Paint paint) {
        m880b(rect.f230a, rect.f231b, rect.f232c, rect.f233d, paint);
    }

    @Override // com.corrodinggames.rts.gameFramework.unitAction.InterfaceC0977l
    /* renamed from: a */
    public void mo862a(RectF rectF, Paint paint) {
        m880b(rectF.f234a, rectF.f235b, rectF.f236c, rectF.f237d, paint);
    }

    @Override // com.corrodinggames.rts.gameFramework.unitAction.InterfaceC0977l
    /* renamed from: a */
    public void mo851a(String str, float f, float f2, Paint paint) {
        this.f6666b.m2561b((C0964ae) null);
        C0712n.f4492E = this;
        this.f6665a.m2619a(str, f, f2, paint);
    }

    public boolean equals(Object obj) {
        return this.f6665a.equals(obj);
    }

    public int hashCode() {
        return this.f6665a.hashCode();
    }

    @Override // com.corrodinggames.rts.gameFramework.unitAction.InterfaceC0977l
    /* renamed from: a */
    public void mo874a() {
        this.f6666b.mo2558c();
    }

    @Override // com.corrodinggames.rts.gameFramework.unitAction.InterfaceC0977l
    /* renamed from: a */
    public void mo872a(float f, float f2, float f3) {
        C0712n c0712n = this.f6666b;
        c0712n.m2602a(f2, f3);
        c0712n.m2603a(f);
        c0712n.m2602a(-f2, -f3);
    }

    @Override // com.corrodinggames.rts.gameFramework.unitAction.InterfaceC0977l
    /* renamed from: b */
    public void mo847b() {
        this.f6666b.mo2566b();
    }

    @Override // com.corrodinggames.rts.gameFramework.unitAction.InterfaceC0977l
    /* renamed from: a */
    public void mo871a(float f, float f2, float f3, float f4) {
        C0712n c0712n = this.f6666b;
        c0712n.m2602a(f3, f4);
        c0712n.m2601a(f, f2, 1.0f);
        c0712n.m2602a(-f3, -f4);
    }

    @Override // com.corrodinggames.rts.gameFramework.unitAction.InterfaceC0977l
    /* renamed from: a */
    public void mo873a(float f, float f2) {
        this.f6666b.m2601a(f, f2, 1.0f);
    }

    @Override // com.corrodinggames.rts.gameFramework.unitAction.InterfaceC0977l
    /* renamed from: a */
    public void mo860a(C0970e c0970e) {
        if (this.f6678n != null) {
            m876d();
        }
        if (c0970e != null) {
            m878b(c0970e);
        }
        this.f6678n = c0970e;
    }

    public String toString() {
        return this.f6665a.toString();
    }

    @Override // com.corrodinggames.rts.gameFramework.unitAction.InterfaceC0977l
    /* renamed from: b */
    public void mo846b(float f, float f2) {
        this.f6666b.m2602a(f, f2);
    }

    @Override // com.corrodinggames.rts.gameFramework.unitAction.InterfaceC0977l
    /* renamed from: a */
    public void mo849a(boolean z) {
        this.f6679o = z;
    }

    @Override // com.corrodinggames.rts.gameFramework.unitAction.InterfaceC0977l
    /* renamed from: c */
    public boolean mo844c() {
        return this.f6679o;
    }

    @Override // com.corrodinggames.rts.gameFramework.unitAction.InterfaceC0977l
    /* renamed from: a */
    public void mo856a(AbstractC0978m abstractC0978m) {
        abstractC0978m.mo875a(GameEngine.getGameEngine().f6374bO);
    }

    @Override // com.corrodinggames.rts.gameFramework.unitAction.InterfaceC0977l
    /* renamed from: a */
    public void mo850a(Lock lock) {
    }

    @Override // com.corrodinggames.rts.gameFramework.unitAction.InterfaceC0977l
    /* renamed from: b */
    public void mo845b(Lock lock) {
    }

    @Override // com.corrodinggames.rts.gameFramework.unitAction.InterfaceC0977l
    /* renamed from: a */
    public boolean mo861a(C0964ae c0964ae) {
        return this.f6666b.m2552d(c0964ae);
    }
}