package com.corrodinggames.rts.gameFramework.unitAction;

/* renamed from: com.corrodinggames.rts.gameFramework.m.af */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/m/af.class */
public class C0965af {

    /* renamed from: a */
    public String f6583a;

    /* renamed from: c */
    public boolean f6585c;

    /* renamed from: d */
    public boolean f6586d;

    /* renamed from: f */
    public C0970e f6588f;

    /* renamed from: g */
    public boolean f6589g;

    /* renamed from: b */
    public int f6584b = -1;

    /* renamed from: e */
    public float[] f6587e = new float[1];

    /* renamed from: a */
    public void m921a(float f) {
        if (this.f6587e.length != 1) {
            this.f6587e = new float[1];
        }
        if (this.f6587e[0] == f) {
            return;
        }
        this.f6587e[0] = f;
        this.f6585c = true;
    }

    /* renamed from: a */
    public void m920a(float f, float f2) {
        if (this.f6587e.length != 2) {
            this.f6587e = new float[2];
        }
        if (this.f6587e[0] == f && this.f6587e[1] == f2) {
            return;
        }
        this.f6587e[0] = f;
        this.f6587e[1] = f2;
        this.f6585c = true;
    }

    /* renamed from: a */
    public void m919a(float f, float f2, float f3, float f4) {
        if (this.f6587e.length != 4) {
            this.f6587e = new float[4];
        }
        if (this.f6587e[0] == f && this.f6587e[1] == f2 && this.f6587e[2] == f3 && this.f6587e[3] == f4) {
            return;
        }
        this.f6587e[0] = f;
        this.f6587e[1] = f2;
        this.f6587e[2] = f3;
        this.f6587e[3] = f4;
        this.f6585c = true;
    }

    /* renamed from: a */
    public void m918a(C0970e c0970e) {
        if (this.f6588f != c0970e) {
            this.f6588f = c0970e;
            this.f6585c = true;
        }
    }

    /* renamed from: b */
    public void m917b(C0970e c0970e) {
        this.f6589g = true;
        if (this.f6588f != c0970e) {
            this.f6588f = c0970e;
            this.f6585c = true;
        }
    }
}