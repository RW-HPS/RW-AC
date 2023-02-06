package com.corrodinggames.rts.java.audio.a;

import com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

/* loaded from: game-lib.jar:com/corrodinggames/rts/java/audio/a/a.class */
public class a {
    protected InputStream a;
    protected File b;
    protected String c;

    public a(String str) {
        this.b = new File(str);
        this.c = this.b.getName();
    }

    public a(InputStream inputStream, String str) {
        this.a = inputStream;
        this.c = str;
        if (this.a == null) {
            throw new RuntimeException("inputStream==null");
        }
    }

    public InputStream a() {
        if (this.a != null) {
            return this.a;
        }
        try {
            return new FileInputStream(this.b);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public String b() {
        String str = this.c;
        int lastIndexOf = str.lastIndexOf(46);
        return lastIndexOf == -1 ? VariableScope.nullOrMissingString : str.substring(lastIndexOf + 1);
    }
}