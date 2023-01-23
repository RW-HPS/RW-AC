package com.corrodinggames.rts.gameFramework.utility;

import java.io.Serializable;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/utility/b.class */
public class b implements Serializable {

    /* renamed from: a  reason: collision with root package name */
    private final String f678a;
    private final StackTraceElement[] b;

    private b(String str, StackTraceElement[] stackTraceElementArr) {
        this.f678a = str;
        this.b = stackTraceElementArr;
    }
}