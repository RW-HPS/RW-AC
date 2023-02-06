package com.corrodinggames.rts.gameFramework.utility;

/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/utility/c.class */
class c extends Throwable {
    final /* synthetic */ b a;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private c(b bVar, c cVar) {
        super(r1, cVar);
        String str;
        this.a = bVar;
        str = bVar.a;
    }

    @Override // java.lang.Throwable
    public Throwable fillInStackTrace() {
        StackTraceElement[] stackTraceElementArr;
        stackTraceElementArr = this.a.b;
        setStackTrace(stackTraceElementArr);
        return this;
    }
}