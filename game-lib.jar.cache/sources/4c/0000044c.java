package com.corrodinggames.rts.gameFramework.p031b.p032a.p033a;

import com.corrodinggames.rts.gameFramework.p031b.p032a.EnumC0677a;

/* renamed from: com.corrodinggames.rts.gameFramework.b.a.a.a */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/b/a/a/a.class */
public class C0678a extends AbstractC0679b {

    /* renamed from: a */
    private static final EnumC0677a[] f4273a = {EnumC0677a.A_Position, EnumC0677a.A_TexCoordinate};

    @Override // com.corrodinggames.rts.gameFramework.p031b.p032a.p033a.AbstractC0679b
    /* renamed from: a */
    public void mo2720a() {
        super.m2719a("uniform mat4 u_MVPMatrix;      \nattribute vec4 a_Position;     \nattribute vec2 a_TexCoordinate;\nvarying   vec2 v_TexCoordinate;\nvoid main()                    \n{                              \n   v_TexCoordinate = a_TexCoordinate; \n   gl_Position = u_MVPMatrix   \n               * a_Position;   \n}                              \n", "uniform sampler2D u_Texture;       \nprecision mediump float;       \nuniform lowp vec4 u_Color;          \nvarying vec2 v_TexCoordinate;  \nvoid main()                    \n{                              \n   gl_FragColor = texture2D(u_Texture, v_TexCoordinate).w * u_Color;\n}                             \n", f4273a);
    }
}