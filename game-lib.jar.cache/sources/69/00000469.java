package com.corrodinggames.rts.gameFramework.p031b;

import com.corrodinggames.rts.gameFramework.GameEngine;
import java.util.List;

/* renamed from: com.corrodinggames.rts.gameFramework.b.i */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/b/i.class */
public class C0707i extends C0700c {

    /* renamed from: a */
    protected List f4435a;

    /* renamed from: b */
    private final List f4436b;

    /* renamed from: c */
    private AbstractC0699b f4437c;

    /* renamed from: d */
    private AbstractC0699b f4438d;

    /* renamed from: a */
    private void m2609a(AbstractC0699b abstractC0699b) {
        m2610a();
        for (int i = 0; i < this.f4435a.size(); i++) {
            this.f4436b.add(new C0722x(abstractC0699b.mo2638b(), abstractC0699b.mo2637c(), false));
        }
    }

    /* renamed from: a */
    private void m2610a() {
        for (C0722x c0722x : this.f4436b) {
            c0722x.mo2632j();
        }
        this.f4436b.clear();
    }

    /* renamed from: a */
    public AbstractC0699b m2608a(AbstractC0699b abstractC0699b, InterfaceC0709k interfaceC0709k, InterfaceC0708j interfaceC0708j) {
        if (abstractC0699b instanceof C0722x) {
            if (!((C0722x) abstractC0699b).m2517k()) {
                return this.f4437c;
            }
        } else if (this.f4438d == abstractC0699b && this.f4437c != null) {
            return this.f4437c;
        }
        if (this.f4436b.size() != this.f4435a.size() || this.f4438d != abstractC0699b) {
            m2609a(abstractC0699b);
        }
        this.f4438d = abstractC0699b;
        C0722x c0722x = abstractC0699b;
        int i = 0;
        int size = this.f4436b.size();
        while (i < size) {
            C0722x c0722x2 = (C0722x) this.f4436b.get(i);
            InterfaceC0691af interfaceC0691af = (InterfaceC0691af) this.f4435a.get(i);
            interfaceC0709k.mo2556c(c0722x2);
            interfaceC0708j.mo2607a(c0722x, interfaceC0691af, i == 0);
            interfaceC0709k.mo2554d();
            c0722x = c0722x2;
            GameEngine.m5460e("FilterGroup: renderTarget");
            i++;
        }
        this.f4437c = c0722x;
        return c0722x;
    }
}