package com.corrodinggames.rts.game.units.custom.p016a.p017a;

import android.graphics.PointF;
import com.corrodinggames.rts.game.units.AbstractC0244am;
import com.corrodinggames.rts.game.units.custom.C0454h;
import com.corrodinggames.rts.game.units.custom.C0456j;
import com.corrodinggames.rts.game.units.custom.C0458l;
import com.corrodinggames.rts.game.units.custom.EnumC0348af;
import com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean;
import com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope;
import com.corrodinggames.rts.game.units.custom.p016a.AbstractC0321a;
import com.corrodinggames.rts.game.units.custom.p016a.C0339d;
import com.corrodinggames.rts.game.units.p013a.AbstractC0224s;
import com.corrodinggames.rts.gameFramework.utility.C1107ab;

/* renamed from: com.corrodinggames.rts.game.units.custom.a.a.i */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/a/a/i.class */
public class C0330i extends AbstractC0321a {

    /* renamed from: a */
    VariableScope.MemoryWriter f1983a;

    /* renamed from: b */
    LogicBoolean f1984b;

    /* renamed from: c */
    C0454h f1985c;

    /* renamed from: a */
    public static void m4098a(C0458l c0458l, C1107ab c1107ab, String str, String str2, C0339d c0339d, String str3, boolean z) {
        LogicBoolean m671b = c1107ab.m671b(c0458l, str, str2 + "sendMessageTo", null);
        VariableScope.MemoryWriter memoryWriter = null;
        String m666b = c1107ab.m666b(str, str2 + "sendMessageWithData", (String) null);
        if (m666b != null) {
            memoryWriter = VariableScope.createGenericKeyValueWriter(m666b, c0458l, str, str2 + "sendMessageWithData");
        }
        C0454h m705a = c1107ab.m705a(c0458l, str, str2 + "sendMessageWithTags", (C0454h) null);
        if (m671b != null) {
            C0330i c0330i = new C0330i();
            c0330i.f1984b = m671b;
            c0330i.f1983a = memoryWriter;
            c0330i.f1985c = m705a;
            c0339d.f2112ac.add(c0330i);
        }
    }

    @Override // com.corrodinggames.rts.game.units.custom.p016a.AbstractC0321a
    /* renamed from: a */
    public boolean mo4093a(C0456j c0456j, AbstractC0224s abstractC0224s, PointF pointF, AbstractC0244am abstractC0244am, int i) {
        AbstractC0244am readUnit;
        if (this.f1984b != null && (readUnit = this.f1984b.readUnit(c0456j)) != null) {
            VariableScope variableScope = null;
            if (this.f1983a != null) {
                variableScope = new VariableScope();
                this.f1983a.writeToMemory(variableScope, c0456j);
            }
            readUnit.mo3649a(EnumC0348af.newMessage, c0456j, this.f1985c, variableScope);
            return true;
        }
        return true;
    }
}