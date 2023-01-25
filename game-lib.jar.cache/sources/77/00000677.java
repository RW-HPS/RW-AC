package com.corrodinggames.rts.java;

import com.corrodinggames.rts.appFramework.ActivityC0097g;
import com.corrodinggames.rts.appFramework.C0121m;
import com.corrodinggames.rts.appFramework.InterfaceC0096f;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.unitAction.C0959a;
import com.corrodinggames.rts.gameFramework.unitAction.C0979n;
import com.corrodinggames.rts.gameFramework.unitAction.InterfaceC0977l;

/* renamed from: com.corrodinggames.rts.java.d */
/* loaded from: game-lib.jar:com/corrodinggames/rts/java/d.class */
public class C1205d implements InterfaceC0096f {

    /* renamed from: a */
    public int f7360a;

    /* renamed from: b */
    public int f7361b;

    /* renamed from: d */
    C0121m f7363d;

    /* renamed from: e */
    public Object f7364e = new Object();

    /* renamed from: f */
    public Object f7365f = new Object();

    /* renamed from: g */
    C0979n f7366g = new C0979n();

    /* renamed from: c */
    ActivityC1211h f7362c = new ActivityC1211h();

    @Override // com.corrodinggames.rts.appFramework.InterfaceC0096f
    /* renamed from: j */
    public void mo242j() {
    }

    @Override // com.corrodinggames.rts.appFramework.InterfaceC0096f
    /* renamed from: a */
    public void mo256a() {
    }

    @Override // com.corrodinggames.rts.appFramework.InterfaceC0096f
    /* renamed from: b */
    public boolean mo252b() {
        return true;
    }

    @Override // com.corrodinggames.rts.appFramework.InterfaceC0096f
    /* renamed from: c */
    public boolean mo249c() {
        return false;
    }

    @Override // com.corrodinggames.rts.appFramework.InterfaceC0096f
    /* renamed from: d */
    public C0959a mo248d() {
        return null;
    }

    @Override // com.corrodinggames.rts.appFramework.InterfaceC0096f
    /* renamed from: e */
    public boolean mo247e() {
        return false;
    }

    @Override // com.corrodinggames.rts.appFramework.InterfaceC0096f
    /* renamed from: f */
    public boolean mo246f() {
        GameEngine gameEngine = GameEngine.getGameEngine();
        if (gameEngine != null && gameEngine.settingsEngine.slick2dFullScreen) {
            return true;
        }
        return false;
    }

    @Override // com.corrodinggames.rts.appFramework.InterfaceC0096f
    /* renamed from: g */
    public Object mo245g() {
        return null;
    }

    /* renamed from: o */
    public int m237o() {
        return this.f7360a;
    }

    /* renamed from: p */
    public int m236p() {
        return this.f7361b;
    }

    @Override // com.corrodinggames.rts.appFramework.InterfaceC0096f
    /* renamed from: h */
    public void mo244h() {
    }

    @Override // com.corrodinggames.rts.appFramework.InterfaceC0096f
    /* renamed from: i */
    public ActivityC0097g mo243i() {
        return this.f7362c;
    }

    @Override // com.corrodinggames.rts.appFramework.InterfaceC0096f
    /* renamed from: k */
    public C0121m mo241k() {
        return this.f7363d;
    }

    @Override // com.corrodinggames.rts.appFramework.InterfaceC0096f
    /* renamed from: a */
    public void mo255a(float f, int i) {
        synchronized (this.f7365f) {
            this.f7365f.notifyAll();
        }
    }

    @Override // com.corrodinggames.rts.appFramework.InterfaceC0096f
    /* renamed from: b */
    public void mo251b(float f, int i) {
    }

    @Override // com.corrodinggames.rts.appFramework.InterfaceC0096f
    /* renamed from: l */
    public void mo240l() {
    }

    @Override // com.corrodinggames.rts.appFramework.InterfaceC0096f
    /* renamed from: b */
    public InterfaceC0977l mo250b(boolean z) {
        return this.f7366g;
    }

    @Override // com.corrodinggames.rts.appFramework.InterfaceC0096f
    /* renamed from: a */
    public void mo254a(InterfaceC0977l interfaceC0977l, boolean z) {
    }

    @Override // com.corrodinggames.rts.appFramework.InterfaceC0096f
    /* renamed from: m */
    public void mo239m() {
    }

    @Override // com.corrodinggames.rts.appFramework.InterfaceC0096f
    /* renamed from: n */
    public boolean mo238n() {
        return true;
    }

    @Override // com.corrodinggames.rts.appFramework.InterfaceC0096f
    /* renamed from: a */
    public void mo253a(boolean z) {
    }
}