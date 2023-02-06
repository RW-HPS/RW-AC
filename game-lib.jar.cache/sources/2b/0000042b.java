package com.corrodinggames.rts.gameFramework;

import com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope;
import com.corrodinggames.rts.gameFramework.utility.SlickToAndroidKeycodes;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;

/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/ad.class */
public class ad {
    public String a;
    public boolean b = false;
    public ArrayList c = new ArrayList();
    public ArrayList d = new ArrayList();

    public boolean a() {
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            af afVar = (af) it.next();
            if (afVar.a == -1 && afVar.a()) {
                return true;
            }
        }
        return false;
    }

    public boolean b() {
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            af afVar = (af) it.next();
            if (afVar != null && afVar.a == -1 && afVar.b()) {
                return true;
            }
        }
        return false;
    }

    public String c() {
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            af afVar = (af) it.next();
            if (afVar != null) {
                return afVar.c().toUpperCase();
            }
        }
        return VariableScope.nullOrMissingString;
    }

    public af a(int i) {
        if (this.c.size() > i) {
            return (af) this.c.get(i);
        }
        return null;
    }

    public String b(int i) {
        if (this.c.size() > i) {
            af afVar = (af) this.c.get(i);
            if (afVar == null) {
                return "<null>";
            }
            return afVar.c().toUpperCase();
        }
        return VariableScope.nullOrMissingString;
    }

    public ad c(int i) {
        return a(i, 0, 0, false);
    }

    public ad a(int i, int i2, int i3, boolean z) {
        ag agVar = new ag();
        agVar.e = i;
        agVar.a = -1;
        agVar.b = i3;
        if (z) {
            agVar.d = true;
        }
        if (this.c.size() <= i2) {
            this.c.add(new ak());
        }
        if (this.c.size() <= i2) {
            this.c.add(new ak());
        }
        this.c.set(i2, agVar);
        return this;
    }

    public ad a(String str) {
        return a(str, -1);
    }

    public ad a(String str, int i) {
        if (str == null) {
            throw new RuntimeException("key==null");
        }
        return a(-1, str, i);
    }

    public ad a(int i, String str, int i2) {
        if (str == null) {
            throw new RuntimeException("key==null");
        }
        ag agVar = new ag();
        agVar.a = i;
        agVar.b = 0;
        String lowerCase = str.toLowerCase(Locale.ENGLISH);
        if (lowerCase.contains("alt+")) {
            lowerCase = lowerCase.replace("alt+", VariableScope.nullOrMissingString);
            agVar.b += 4;
        }
        if (lowerCase.contains("ctrl+")) {
            lowerCase = lowerCase.replace("ctrl+", VariableScope.nullOrMissingString);
            agVar.b++;
        }
        if (lowerCase.contains("shift+")) {
            lowerCase = lowerCase.replace("shift+", VariableScope.nullOrMissingString);
            agVar.b += 2;
        }
        try {
            agVar.e = ac.d(lowerCase);
            if (i2 == -1) {
                this.c.add(agVar);
            } else {
                if (this.c.size() <= i2) {
                    this.c.add(new ak());
                }
                if (this.c.size() <= i2) {
                    this.c.add(new ak());
                }
                this.c.set(i2, agVar);
            }
        } catch (SlickToAndroidKeycodes.MissingKey e) {
            e.printStackTrace();
            GameEngine gameEngine = GameEngine.getGameEngine();
            if (gameEngine != null) {
                gameEngine.a(e.getMessage(), 1);
            }
        }
        return this;
    }

    public ad b(int i, int i2, int i3, boolean z) {
        ah ahVar = new ah();
        ahVar.a = i;
        ahVar.e = i2;
        ahVar.f = i3;
        ahVar.g = z;
        try {
            ahVar.i = ahVar.a(true);
            this.c.add(ahVar);
            return this;
        } catch (IndexOutOfBoundsException e) {
            GameEngine.print("Failed to bind Axis:" + i3 + " on joystick:" + i2);
            return this;
        }
    }

    public boolean d() {
        return false;
    }

    public String e() {
        return this.a.replace("-", VariableScope.nullOrMissingString).replace("  ", " ").replace("  ", " ").replace(" ", "_").toLowerCase(Locale.ENGLISH);
    }
}