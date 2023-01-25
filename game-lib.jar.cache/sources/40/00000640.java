package com.corrodinggames.rts.java.audio.p051a;

import com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

/* renamed from: com.corrodinggames.rts.java.audio.a.a */
/* loaded from: game-lib.jar:com/corrodinggames/rts/java/audio/a/a.class */
public class C1165a {

    /* renamed from: a */
    protected InputStream f7218a;

    /* renamed from: b */
    protected File f7219b;

    /* renamed from: c */
    protected String f7220c;

    public C1165a(String str) {
        this.f7219b = new File(str);
        this.f7220c = this.f7219b.getName();
    }

    public C1165a(InputStream inputStream, String str) {
        this.f7218a = inputStream;
        this.f7220c = str;
        if (this.f7218a == null) {
            throw new RuntimeException("inputStream==null");
        }
    }

    /* renamed from: a */
    public InputStream m383a() {
        if (this.f7218a != null) {
            return this.f7218a;
        }
        try {
            return new FileInputStream(this.f7219b);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: b */
    public String m382b() {
        String str = this.f7220c;
        int lastIndexOf = str.lastIndexOf(46);
        return lastIndexOf == -1 ? VariableScope.nullOrMissingString : str.substring(lastIndexOf + 1);
    }
}