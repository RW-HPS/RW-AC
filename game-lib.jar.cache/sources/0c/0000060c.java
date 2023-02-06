package com.corrodinggames.rts.gameFramework.utility;

import java.io.Serializable;

/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/utility/b.class */
class b implements Serializable {
    private final String a;
    private final StackTraceElement[] b;

    private b(String str, StackTraceElement[] stackTraceElementArr) {
        this.a = str;
        this.b = stackTraceElementArr;
    }
}