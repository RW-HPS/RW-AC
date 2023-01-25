package com.corrodinggames.rts.gameFramework.p031b;

import android.graphics.Bitmap;

/* renamed from: com.corrodinggames.rts.gameFramework.b.ai */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/b/ai.class */
class C0695ai implements Cloneable {

    /* renamed from: a */
    public boolean f4380a;

    /* renamed from: b */
    public Bitmap.Config f4381b;

    /* renamed from: c */
    public int f4382c;

    private C0695ai() {
    }

    public int hashCode() {
        int hashCode = this.f4381b.hashCode() ^ this.f4382c;
        return this.f4380a ? hashCode : -hashCode;
    }

    public boolean equals(Object obj) {
        if (obj instanceof C0695ai) {
            C0695ai c0695ai = (C0695ai) obj;
            return this.f4380a == c0695ai.f4380a && this.f4381b == c0695ai.f4381b && this.f4382c == c0695ai.f4382c;
        }
        return false;
    }

    /* renamed from: a */
    public C0695ai clone() {
        try {
            return (C0695ai) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }
}