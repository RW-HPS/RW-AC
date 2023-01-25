package com.corrodinggames.rts.gameFramework.p037f;

import com.corrodinggames.rts.gameFramework.C0773f;

/* renamed from: com.corrodinggames.rts.gameFramework.f.au */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/f/au.class */
abstract class AbstractC0817au implements Comparable {

    /* renamed from: c */
    long f5218c;

    /* renamed from: d */
    long f5219d = 5000;

    /* renamed from: e */
    float f5220e;

    /* renamed from: f */
    float f5221f;

    /* renamed from: g */
    String f5222g;

    /* renamed from: h */
    boolean f5223h;

    /* renamed from: i */
    boolean f5224i;

    /* renamed from: b */
    public abstract void mo1934b(AbstractC0817au abstractC0817au);

    /* renamed from: a */
    public abstract String mo1937a();

    public AbstractC0817au(float f, float f2) {
        this.f5220e = f;
        this.f5221f = f2;
    }

    @Override // java.lang.Comparable
    /* renamed from: c */
    public int compareTo(AbstractC0817au abstractC0817au) {
        return (int) (abstractC0817au.f5218c - this.f5218c);
    }

    /* renamed from: a */
    public boolean mo1936a(AbstractC0817au abstractC0817au) {
        if (this.f5218c + mo1935b() < System.currentTimeMillis() || C0773f.m2216a(this.f5220e, this.f5221f, abstractC0817au.f5220e, abstractC0817au.f5221f) > 90000.0f) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    protected long mo1935b() {
        return 5000L;
    }
}