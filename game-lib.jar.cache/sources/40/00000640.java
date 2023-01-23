package com.corrodinggames.rts.java.audio.a;

import com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

/* loaded from: game-lib.jar:com/corrodinggames/rts/java/audio/a/a.class */
public class a {

    /* renamed from: a  reason: collision with root package name */
    protected InputStream f711a;
    protected File b;
    protected String c;

    public a(String str) {
        this.b = new File(str);
        this.c = this.b.getName();
    }

    public a(InputStream inputStream, String str) {
        this.f711a = inputStream;
        this.c = str;
        if (this.f711a == null) {
            throw new RuntimeException("inputStream==null");
        }
    }

    public InputStream a() {
        if (this.f711a != null) {
            return this.f711a;
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