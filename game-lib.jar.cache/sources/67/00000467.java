package com.corrodinggames.rts.gameFramework.p031b;

/* renamed from: com.corrodinggames.rts.gameFramework.b.g */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/b/g.class */
public class C0705g extends C0676a {

    /* renamed from: a */
    private float f4434a;

    /* renamed from: a */
    public void m2613a(float f) {
        this.f4434a = f;
    }

    @Override // com.corrodinggames.rts.gameFramework.p031b.C0676a, com.corrodinggames.rts.gameFramework.p031b.InterfaceC0706h
    /* renamed from: a */
    public String mo2612a() {
        return "uniform mat4 uMatrix;\nuniform mat4 uProjection;\nattribute vec2 aPosition;\nvarying vec2 vDrawRegionCoord;\nvoid main() {\n  vec4 pos = vec4(aPosition, 0.0, 1.0);\n  gl_Position = uProjection * uMatrix * pos;\n  vDrawRegionCoord = pos.xy;\n}\n";
    }

    @Override // com.corrodinggames.rts.gameFramework.p031b.C0676a, com.corrodinggames.rts.gameFramework.p031b.InterfaceC0706h
    /* renamed from: b */
    public String mo2611b() {
        return "precision mediump float;\nvarying vec2 vDrawRegionCoord;\nuniform vec4 uColor;\nuniform float lineWidth;\nvoid main() {\n  float dx = vDrawRegionCoord.x - 0.5;\n  float dy = vDrawRegionCoord.y - 0.5;\n  float powVal = dx*dx + dy*dy; \n  float subRadius = 0.5 - lineWidth; \n  if(powVal >= subRadius * subRadius && powVal <= 0.5 * 0.5) {\n    gl_FragColor = uColor;\n  } else {\n    gl_FragColor = vec4(0, 0, 0, 0);\n  }\n \n}\n";
    }
}