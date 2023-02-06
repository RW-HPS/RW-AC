package com.corrodinggames.rts.gameFramework.b.a.a;

/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/b/a/a/a.class */
public class a extends b {
    private static final com.corrodinggames.rts.gameFramework.b.a.a[] a = {com.corrodinggames.rts.gameFramework.b.a.a.A_Position, com.corrodinggames.rts.gameFramework.b.a.a.A_TexCoordinate};

    @Override // com.corrodinggames.rts.gameFramework.b.a.a.b
    public void a() {
        super.a("uniform mat4 u_MVPMatrix;      \nattribute vec4 a_Position;     \nattribute vec2 a_TexCoordinate;\nvarying   vec2 v_TexCoordinate;\nvoid main()                    \n{                              \n   v_TexCoordinate = a_TexCoordinate; \n   gl_Position = u_MVPMatrix   \n               * a_Position;   \n}                              \n", "uniform sampler2D u_Texture;       \nprecision mediump float;       \nuniform lowp vec4 u_Color;          \nvarying vec2 v_TexCoordinate;  \nvoid main()                    \n{                              \n   gl_FragColor = texture2D(u_Texture, v_TexCoordinate).w * u_Color;\n}                             \n", a);
    }
}