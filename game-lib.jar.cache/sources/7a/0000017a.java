package com.corrodinggames.rts.game.maps;

import android.graphics.RectF;
import com.corrodinggames.rts.game.PlayerData;
import com.corrodinggames.rts.game.units.am;
import com.corrodinggames.rts.game.units.ar;
import com.corrodinggames.rts.game.units.as;
import com.corrodinggames.rts.game.units.custom.bb;
import com.corrodinggames.rts.game.units.custom.bc;
import com.corrodinggames.rts.game.units.custom.j;
import com.corrodinggames.rts.game.units.custom.l;
import com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.f;
import com.corrodinggames.rts.gameFramework.net.GameNetEngine;
import com.corrodinggames.rts.gameFramework.utility.SlickToAndroidKeycodes;
import com.corrodinggames.rts.gameFramework.utility.m;
import com.corrodinggames.rts.gameFramework.utility.x;
import com.corrodinggames.rts.gameFramework.w;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Locale;
import java.util.Properties;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

/* renamed from: com.corrodinggames.rts.game.b.a */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/b/a.class */
public class a {
    public int a;
    public String b;
    public String c;
    public String d;
    public float e;
    public float f;
    public float g;
    public float h;
    public float i;
    private String p;
    public RectF j;
    public int k;
    public TileSet l;
    public int m;
    public Properties n;
    public m o = new m();

    static float a(Element element, String str) {
        String attribute = element.getAttribute(str);
        try {
            return Float.parseFloat(attribute);
        } catch (NumberFormatException e) {
            throw new f("Invalid map: Error reading '" + str + "' invalid float: " + attribute, e);
        }
    }

    public a(Element element, b bVar, ObjectGroup objectGroup) {
        PlayerData playerData;
        j a;
        NodeList elementsByTagName;
        String textContent;
        this.k = -1;
        this.m = -1;
        this.b = element.getAttribute("name");
        if (this.b != null) {
            this.c = this.b.trim().toLowerCase(Locale.ENGLISH);
        }
        this.d = element.getAttribute("type");
        this.e = Float.parseFloat(element.getAttribute("x"));
        this.f = Float.parseFloat(element.getAttribute("y"));
        if (element.hasAttribute("rotation")) {
            this.i = Float.parseFloat(element.getAttribute("rotation")) - 90.0f;
        }
        if (!element.getAttribute("width").equals(VariableScope.nullOrMissingString)) {
            this.g = a(element, "width");
        }
        if (!element.getAttribute("height").equals(VariableScope.nullOrMissingString)) {
            this.h = a(element, "height");
        }
        Element element2 = (Element) element.getElementsByTagName("image").item(0);
        if (element2 != null) {
            this.p = element2.getAttribute("source");
        }
        Element element3 = (Element) element.getElementsByTagName("properties").item(0);
        if (element3 != null && (elementsByTagName = element3.getElementsByTagName("property")) != null) {
            this.n = new Properties();
            for (int i = 0; i < elementsByTagName.getLength(); i++) {
                Element element4 = (Element) elementsByTagName.item(i);
                String attribute = element4.getAttribute("name");
                if (element4.hasAttribute("value")) {
                    textContent = element4.getAttribute("value");
                } else {
                    textContent = element4.getTextContent();
                }
                this.n.setProperty(attribute, textContent);
            }
        }
        if (element.hasAttribute("gid")) {
            this.k = Integer.parseInt(element.getAttribute("gid"));
            this.l = bVar.a(this.k);
            if (this.l != null) {
                this.l.p = true;
                this.l.r = true;
                this.m = this.k - this.l.l;
            } else {
                throw new RuntimeException("Unable to decode base 64 block, could not find tileId:" + this.k);
            }
        }
        Properties properties = this.n;
        this.j = new RectF(this.e, this.f, this.e + this.g, this.f + this.h);
        bVar.a(this.j);
        this.e = this.j.a;
        this.f = this.j.b;
        this.g = this.j.b();
        this.h = this.j.c();
        float d = this.j.d();
        float e = this.j.e();
        String attribute2 = element.getAttribute("type");
        if (attribute2 != null && !attribute2.equals(VariableScope.nullOrMissingString) && !attribute2.equals("unit") && !attribute2.equals("comment") && !objectGroup.b.equalsIgnoreCase("triggers")) {
            d("Triggers should be on triggers layer");
        }
        if (properties != null) {
            String property = properties.getProperty("unit");
            String property2 = properties.getProperty("customUnit");
            if (property != null || property2 != null) {
                String property3 = properties.getProperty("team");
                if (property3 == null) {
                    throw new f("Unit object team missing for:" + (property != null ? property : property2));
                }
                if ("none".equalsIgnoreCase(property3)) {
                    playerData = PlayerData.getPlayerData(-1);
                } else {
                    try {
                        playerData = PlayerData.getPlayerData(Integer.valueOf(property3).intValue());
                        if (playerData == null) {
                            GameEngine.b("map", "Unit object without team:" + property + " (skipping unit)");
                            return;
                        } else if (playerData.b()) {
                            GameEngine.b("map", "Unit team is marked as spectator:" + property + " (skipping unit)");
                            return;
                        }
                    } catch (NumberFormatException e2) {
                        throw new f("Unit object team invalid: " + e2.getMessage(), e2);
                    }
                }
                if (property2 != null) {
                    l n = l.n(property2);
                    if (n == null) {
                        throw new f("Could not find custom unit of:" + property2 + " at x:" + this.e + ", y:" + this.f);
                    }
                    as c = l.c(n);
                    if (c != null) {
                        if (c instanceof l) {
                            n = (l) c;
                        } else {
                            GameEngine.print("replacement not a custom unit:" + c.i());
                        }
                    }
                    a = l.a(false, n);
                    if (a == null) {
                        throw new RuntimeException("Metadata unit is null for:" + property2);
                    }
                } else {
                    as a2 = ar.a(property);
                    if (a2 != null) {
                        a = a2.a();
                    } else {
                        throw new f("Could not find unit type of:" + property + " at x:" + this.e + ", y:" + this.f);
                    }
                }
                a.eo = d;
                a.ep = e;
                if (!a.bI()) {
                    a.h(this.i);
                }
                if (playerData != null) {
                    a.b(playerData);
                    if (properties.getProperty("type") != null) {
                        a.a_(properties.getProperty("type"));
                    }
                    if (properties.getProperty("randomRotate") != null && !a.bI()) {
                        a.h(f.a(a, -180, (int) SlickToAndroidKeycodes.AndroidCodes.KEYCODE_STB_INPUT));
                    }
                    a.bO = "builder".equalsIgnoreCase(property) || "builder".equalsIgnoreCase(property2);
                    a.bP = "commandCenter".equalsIgnoreCase(property) || "commandCenter".equalsIgnoreCase(property2);
                    a.bM = true;
                    a.n();
                    PlayerData.c(a);
                    w.dL();
                    return;
                }
                throw new f("team is null:" + property);
            }
        }
    }

    public boolean a(am amVar) {
        return this.j.b((int) amVar.eo, (int) amVar.ep);
    }

    public void a(String str) {
        if (!this.o.contains(str)) {
            this.o.add(str);
        }
    }

    public String[] a() {
        if (this.n == null) {
            return x.h;
        }
        m mVar = new m();
        Enumeration<?> propertyNames = this.n.propertyNames();
        while (propertyNames.hasMoreElements()) {
            String str = (String) propertyNames.nextElement();
            if (!this.o.contains(str)) {
                mVar.add(str);
            }
        }
        return (String[]) mVar.toArray(x.h);
    }

    public String b(String str) {
        a(str);
        if (this.n == null) {
            return null;
        }
        return this.n.getProperty(str);
    }

    public String a(String str, String str2) {
        a(str);
        if (this.n == null) {
            return null;
        }
        return this.n.getProperty(str, str2);
    }

    public Integer c(String str) {
        String a = a(str, (String) null);
        if (a == null) {
            return null;
        }
        try {
            return Integer.valueOf(Integer.parseInt(a));
        } catch (NumberFormatException e) {
            throw new f(str + ": Unexpected integer value:'" + a + "'");
        }
    }

    public bb a(String str, bb bbVar) {
        String a = a(str, (String) null);
        if (a == null) {
            return bbVar;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(new bc(null, a));
        String str2 = str + "_";
        m mVar = new m();
        for (Object obj : this.n.keySet()) {
            if (obj instanceof String) {
                String str3 = (String) obj;
                if (str3.startsWith(str2)) {
                    mVar.add(str3);
                }
            } else {
                GameEngine.print("createLocaleStringFromProperty: Non string:" + obj);
            }
        }
        Iterator it = mVar.iterator();
        while (it.hasNext()) {
            String str4 = (String) it.next();
            String lowerCase = str4.substring(str2.length()).toLowerCase(Locale.ROOT);
            GameEngine.print("createLocaleStringFromProperty checking: " + str4);
            if (lowerCase.length() <= 4) {
                String b = b(str4);
                GameEngine.print("createLocaleStringFromProperty got: " + b);
                GameEngine.print("createLocaleStringFromProperty code: " + lowerCase);
                arrayList.add(new bc(lowerCase, b));
            }
        }
        bb bbVar2 = new bb((bc[]) arrayList.toArray(new bc[0]));
        bbVar2.b();
        GameEngine.print("createLocaleStringFromProperty final: " + bbVar2.b());
        GameEngine.print("createLocaleStringFromProperty locate: " + com.corrodinggames.rts.gameFramework.translations.a.c());
        return bbVar2;
    }

    public void d(String str) {
        GameNetEngine.g("(Map trigger: " + this.b + ", type:" + this.d + "): " + str);
    }

    public String b() {
        return "(Map trigger: " + this.b + ", type:" + this.d + ")";
    }
}