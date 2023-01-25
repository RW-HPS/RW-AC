package com.corrodinggames.rts.gameFramework.utility;

/* renamed from: com.corrodinggames.rts.gameFramework.utility.c */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/utility/c.class */
class C1121c extends Throwable {

    /* renamed from: a */
    final /* synthetic */ C1120b f7072a;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private C1121c(C1120b c1120b, C1121c c1121c) {
        super(r1, c1121c);
        String str;
        this.f7072a = c1120b;
        str = c1120b.f7070a;
    }

    @Override // java.lang.Throwable
    public Throwable fillInStackTrace() {
        StackTraceElement[] stackTraceElementArr;
        stackTraceElementArr = this.f7072a.f7071b;
        setStackTrace(stackTraceElementArr);
        return this;
    }
}