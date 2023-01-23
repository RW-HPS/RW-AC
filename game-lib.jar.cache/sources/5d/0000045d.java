package com.corrodinggames.rts.gameFramework.b;

import android.graphics.Bitmap;

/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/b/ai.class */
class ai implements Cloneable {

    /* renamed from: a  reason: collision with root package name */
    public boolean f427a;
    public Bitmap.Config b;
    public int c;

    private ai() {
    }

    public int hashCode() {
        int hashCode = this.b.hashCode() ^ this.c;
        return this.f427a ? hashCode : -hashCode;
    }

    public boolean equals(Object obj) {
        if (obj instanceof ai) {
            ai aiVar = (ai) obj;
            return this.f427a == aiVar.f427a && this.b == aiVar.b && this.c == aiVar.c;
        }
        return false;
    }

    /* renamed from: a */
    public ai clone() {
        try {
            return (ai) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }
}