package com.corrodinggames.rts.gameFramework.status;

import android.graphics.PointF;
import com.corrodinggames.rts.game.maps.f;
import com.corrodinggames.rts.game.units.ar;
import com.corrodinggames.rts.game.units.as;
import com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope;
import com.corrodinggames.rts.gameFramework.GameEngine;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: com.corrodinggames.rts.gameFramework.n.g */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/n/g.class */
public class g {
    public ArrayList a = new ArrayList();
    public boolean b;
    public boolean c;
    public float d;
    public int e;
    public String f;
    public boolean g;
    public boolean h;
    final /* synthetic */ f i;

    public g(f fVar) {
        this.i = fVar;
    }

    public boolean a(String str) {
        String group;
        String str2;
        String trim = str.trim();
        GameEngine.m5e("Got:" + trim);
        if (trim.length() == 0) {
            return false;
        }
        GameEngine.m5e("..");
        String str3 = null;
        String str4 = null;
        String str5 = null;
        if (trim.startsWith("+")) {
            Matcher matcher = Pattern.compile("\\+([^ ]*)([^\\[-]*)(\\[(.*?)\\])? *(-.*)?").matcher(trim);
            if (matcher.matches()) {
                str3 = matcher.group(1);
                str4 = matcher.group(2);
                group = matcher.group(4);
                str5 = matcher.group(5);
                GameEngine.m5e("Got o:" + group + " d:" + str3 + " dn:" + str4 + " units:" + str5);
            } else {
                throw new f("Unknown wave line in map: " + trim);
            }
        } else if (trim.startsWith("!")) {
            Matcher matcher2 = Pattern.compile("\\!(.*)").matcher(trim);
            if (matcher2.matches()) {
                group = matcher2.group(1);
            } else {
                throw new f("Unknown wave line in map: " + trim);
            }
        } else {
            throw new f("Unknown wave format: " + trim);
        }
        if (str3 != null) {
            String[] split = str3.trim().split(":");
            String str6 = "0";
            if (split.length == 1) {
                str2 = split[0];
            } else if (split.length == 2) {
                str6 = split[0];
                str2 = split[1];
            } else {
                throw new f("Unknown time format in wave: " + trim);
            }
            try {
                this.d = Integer.parseInt(str2) + (Integer.parseInt(str6) * 60);
            } catch (NumberFormatException e) {
                throw new f("Failed to parse time on: " + trim, e);
            }
        }
        if (str4 != null) {
            this.f = str4.trim();
            this.h = true;
        }
        if (group != null) {
            for (String str7 : group.split(",")) {
                String[] split2 = str7.split(":");
                String trim2 = split2[0].trim();
                if (split2.length > 1) {
                    split2[1].trim();
                }
                if ("lockSpawn".equalsIgnoreCase(trim2)) {
                    this.b = true;
                } else if ("unlockSpawn".equalsIgnoreCase(trim2)) {
                    this.c = true;
                } else if ("noTimer".equalsIgnoreCase(trim2)) {
                    this.g = true;
                } else if (!"paused".equalsIgnoreCase(trim2) && !"win".equalsIgnoreCase(trim2) && !VariableScope.nullOrMissingString.equalsIgnoreCase(trim2)) {
                    throw new f("Unknown wave option '" + trim2 + "' in: " + trim);
                }
            }
        }
        if (str5 != null) {
            String trim3 = str5.trim();
            if (trim3.startsWith("-")) {
                trim3 = trim3.substring(1);
            }
            for (String str8 : trim3.split(",")) {
                String trim4 = str8.trim();
                if (!trim4.contains(" ")) {
                    throw new f("Unknown wave format '" + trim4 + "' in: " + trim);
                }
                int indexOf = trim4.indexOf(" ");
                String trim5 = trim4.substring(0, indexOf).trim();
                String trim6 = trim4.substring(indexOf + 1).trim();
                try {
                    int parseInt = Integer.parseInt(trim5);
                    as a = ar.a(trim6);
                    if (a == null) {
                        throw new f("Could not find unit '" + trim6 + "' in: " + trim);
                    }
                    i iVar = new i(this.i);
                    iVar.b(a, parseInt);
                    this.a.add(iVar);
                } catch (NumberFormatException e2) {
                    throw new f("Expected starting number in wave format '" + trim4 + "' in: " + trim);
                }
            }
            return true;
        }
        return true;
    }

    public void a() {
        GameEngine.m5e("Activating wave");
        if (!this.i.R) {
            this.i.e();
        }
        PointF pointF = this.i.P;
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((i) it.next()).a(pointF.x, pointF.y);
        }
        if (!this.i.Q) {
            this.i.e();
        }
        if (this.b) {
            this.i.Q = true;
        }
        if (this.c) {
            this.i.Q = false;
        }
    }
}