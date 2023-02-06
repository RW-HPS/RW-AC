package com.corrodinggames.rts.gameFramework.b.a;

import android.opengl.GLES20;
import android.util.Log;

/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/b/a/f.class */
public class f {
    public static int a(int i, int i2, a[] aVarArr) {
        int glCreateProgram = GLES20.glCreateProgram();
        if (glCreateProgram != 0) {
            GLES20.glAttachShader(glCreateProgram, i);
            GLES20.glAttachShader(glCreateProgram, i2);
            for (a aVar : aVarArr) {
                GLES20.glBindAttribLocation(glCreateProgram, aVar.a(), aVar.b());
            }
            GLES20.glLinkProgram(glCreateProgram);
            int[] iArr = new int[1];
            GLES20.glGetProgramiv(glCreateProgram, 35714, iArr, 0);
            if (iArr[0] == 0) {
                Log.a("Utilities", GLES20.glGetProgramInfoLog(glCreateProgram));
                GLES20.glDeleteProgram(glCreateProgram);
                glCreateProgram = 0;
            }
        }
        if (glCreateProgram == 0) {
            throw new RuntimeException("Error creating program.");
        }
        return glCreateProgram;
    }

    public static int a(int i, String str) {
        int glCreateShader = GLES20.glCreateShader(i);
        if (glCreateShader != 0) {
            GLES20.glShaderSource(glCreateShader, str);
            GLES20.glCompileShader(glCreateShader);
            int[] iArr = new int[1];
            GLES20.glGetShaderiv(glCreateShader, 35713, iArr, 0);
            if (iArr[0] == 0) {
                Log.a("Utilities", "Shader fail info: " + GLES20.glGetShaderInfoLog(glCreateShader));
                GLES20.glDeleteShader(glCreateShader);
                glCreateShader = 0;
            }
        }
        if (glCreateShader == 0) {
            throw new RuntimeException("Error creating shader " + i);
        }
        return glCreateShader;
    }
}