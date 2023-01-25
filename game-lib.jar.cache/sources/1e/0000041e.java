package com.corrodinggames.rts.gameFramework;

import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: com.corrodinggames.rts.gameFramework.a */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/a.class */
public class C0632a {

    /* renamed from: n */
    ArrayList f4036n = new ArrayList();

    /* renamed from: a */
    public C0675b f4037a = m2819a((byte) 1);

    /* renamed from: b */
    public C0675b f4038b = m2819a((byte) 2);

    /* renamed from: c */
    public C0675b f4039c = m2819a((byte) 3);

    /* renamed from: d */
    public C0675b f4040d = m2819a((byte) 4);

    /* renamed from: e */
    public C0675b f4041e = m2819a((byte) 10);

    /* renamed from: f */
    public C0675b f4042f = m2819a((byte) 11);

    /* renamed from: g */
    public C0675b f4043g = m2819a((byte) 13);

    /* renamed from: h */
    public C0675b f4044h = m2819a((byte) 21);

    /* renamed from: i */
    public C0675b f4045i = m2819a((byte) 35);

    /* renamed from: j */
    public C0675b f4046j = m2819a((byte) 40);

    /* renamed from: k */
    public C0675b f4047k = m2819a((byte) 45);

    /* renamed from: l */
    public C0675b f4048l = m2819a((byte) 52);

    /* renamed from: m */
    public C0675b f4049m = m2819a((byte) 60);

    public C0632a() {
        C0675b c0675b = this.f4037a;
        c0675b.m2723a(c0675b);
        c0675b.m2723a(m2819a((byte) 3));
        c0675b.m2723a(m2819a((byte) 4));
        c0675b.m2723a(m2819a((byte) 10));
        c0675b.m2723a(m2819a((byte) 11));
        c0675b.m2723a(m2819a((byte) 13));
        c0675b.m2723a(m2819a((byte) 21));
        this.f4047k.m2723a(m2819a((byte) 52));
        C0675b c0675b2 = this.f4049m;
        c0675b2.m2723a(c0675b2);
        c0675b2.m2723a(m2819a((byte) 3));
        c0675b2.m2723a(m2819a((byte) 4));
        c0675b2.m2723a(m2819a((byte) 10));
        c0675b2.m2723a(m2819a((byte) 11));
        c0675b2.m2723a(m2819a((byte) 13));
        c0675b2.m2723a(m2819a((byte) 21));
        C0675b m2819a = m2819a((byte) 10);
        m2819a.m2723a(m2819a((byte) 3));
        m2819a.m2723a(m2819a((byte) 4));
        m2819a.m2723a(m2819a((byte) 10));
        m2819a.m2723a(m2819a((byte) 13));
        m2819a.m2723a(m2819a((byte) 40));
        C0675b m2819a2 = m2819a((byte) 11);
        m2819a2.m2723a(m2819a((byte) 3));
        m2819a2.m2723a(m2819a((byte) 10));
        m2819a2.m2723a(m2819a((byte) 13));
        m2819a2.m2723a(m2819a((byte) 40));
        C0675b m2819a3 = m2819a((byte) 3);
        m2819a3.m2723a(m2819a((byte) 3));
        m2819a3.m2723a(m2819a((byte) 4));
        m2819a3.m2723a(m2819a((byte) 10));
        m2819a3.m2723a(m2819a((byte) 13));
        C0675b m2819a4 = m2819a((byte) 4);
        m2819a4.m2723a(m2819a((byte) 3));
        m2819a4.m2723a(m2819a((byte) 4));
        m2819a4.m2723a(m2819a((byte) 10));
        m2819a4.m2723a(m2819a((byte) 13));
        C0675b m2819a5 = m2819a((byte) 13);
        m2819a5.m2723a(m2819a((byte) 3));
        m2819a5.m2723a(m2819a((byte) 4));
        m2819a5.m2723a(m2819a((byte) 10));
        m2819a5.m2723a(m2819a((byte) 13));
        C0675b m2819a6 = m2819a((byte) 21);
        m2819a6.m2723a(m2819a((byte) 3));
        m2819a6.m2723a(m2819a((byte) 4));
        m2819a6.m2723a(m2819a((byte) 10));
        m2819a6.m2723a(m2819a((byte) 13));
        C0675b c0675b3 = this.f4045i;
        c0675b3.m2723a(m2819a((byte) 10));
        c0675b3.m2723a(m2819a((byte) 13));
    }

    /* renamed from: a */
    public C0675b m2819a(byte b) {
        Iterator it = this.f4036n.iterator();
        while (it.hasNext()) {
            C0675b c0675b = (C0675b) it.next();
            if (c0675b.f4266a == b) {
                return c0675b;
            }
        }
        C0675b c0675b2 = new C0675b();
        c0675b2.f4266a = b;
        this.f4036n.add(c0675b2);
        return c0675b2;
    }
}