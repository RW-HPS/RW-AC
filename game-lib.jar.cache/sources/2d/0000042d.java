package com.corrodinggames.rts.gameFramework;

/* renamed from: com.corrodinggames.rts.gameFramework.af */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/af.class */
public abstract class AbstractC0647af {

    /* renamed from: a */
    public int f4185a = -1;

    /* renamed from: b */
    public int f4186b = 0;

    /* renamed from: c */
    protected boolean f4187c;

    /* renamed from: d */
    public boolean f4188d;

    /* renamed from: a */
    public abstract boolean mo2759a();

    /* renamed from: b */
    public abstract boolean mo2757b();

    /* renamed from: c */
    public abstract String mo2756c();

    /* renamed from: d */
    public abstract boolean mo2755d();

    /* renamed from: a */
    public boolean mo2758a(AbstractC0647af abstractC0647af) {
        if (this.f4186b != abstractC0647af.f4186b || this.f4185a != abstractC0647af.f4185a) {
            return false;
        }
        return true;
    }
}