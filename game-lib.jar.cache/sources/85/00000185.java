package com.corrodinggames.rts.game.b;

import android.graphics.Rect;
import com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope;
import com.corrodinggames.rts.gameFramework.GameEngine;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Properties;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

/* loaded from: game-lib.jar:com/corrodinggames/rts/game/b/j.class */
public class j {

    /* renamed from: a  reason: collision with root package name */
    public String f155a;
    public com.corrodinggames.rts.gameFramework.m.e b;
    public String c;
    int d;
    int e;
    int f;
    int g;
    int j;
    float k;
    public int l;
    public short n;
    public b o;
    static String t = "[EMBED]";
    static ArrayList u = new ArrayList();
    int h = 0;
    int i = 0;
    public int m = Integer.MAX_VALUE;
    public boolean p = false;
    public boolean q = false;
    public boolean r = false;
    public boolean s = false;
    private HashMap x = new HashMap();
    Rect v = new Rect();
    int w = -1;

    public String a(b bVar, Element element) {
        Element element2 = (Element) element.getElementsByTagName("properties").item(0);
        if (element2 != null) {
            NodeList elementsByTagName = element2.getElementsByTagName("property");
            for (int i = 0; i < elementsByTagName.getLength(); i++) {
                Element element3 = (Element) elementsByTagName.item(i);
                if (element3.getAttribute("name").equals("embedded_png")) {
                    String attribute = element3.getAttribute("value");
                    if (attribute != null && !attribute.equals(VariableScope.nullOrMissingString)) {
                        return attribute;
                    }
                    Node firstChild = element3.getFirstChild();
                    if (firstChild != null) {
                        return firstChild.getNodeValue();
                    }
                }
            }
            return null;
        }
        return null;
    }

    public static Element a(b bVar, String str) {
        try {
            return DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(bVar.d("tilesets/", str)).getDocumentElement();
        } catch (Exception e) {
            GameEngine.getGameEngine().a("Unable to load or parse sourced tileset: tilesets/" + str, 1);
            throw new f("Unable to load or parse sourced tileset: tilesets/" + str, e);
        }
    }

    public j(b bVar, String str, int i) {
        this.o = bVar;
        this.l = i;
        Element a2 = a(bVar, str);
        this.f155a = str;
        a(a2);
    }

    public j(b bVar, Element element) {
        this.o = bVar;
        this.l = Integer.parseInt(element.getAttribute("firstgid"));
        String attribute = element.getAttribute("source");
        if (attribute != null && !attribute.equals(VariableScope.nullOrMissingString)) {
            element = a(bVar, attribute);
            this.f155a = attribute;
        }
        a(element);
    }

    public void a(Element element) {
        NodeList elementsByTagName = element.getElementsByTagName("image");
        if (elementsByTagName.getLength() > 0) {
            this.c = GameEngine.k(((Element) elementsByTagName.item(0)).getAttribute("source").trim());
        }
        String a2 = a(this.o, element);
        if (a2 != null) {
            this.c = a(a2, this.c);
        }
        if (this.c == null) {
            throw new f("Map tileset is missing an image tag or embedded image data");
        }
        this.d = this.o.n;
        this.e = this.o.o;
        if (element.hasAttribute("tilewidth")) {
            this.d = Integer.parseInt(element.getAttribute("tilewidth"));
            this.e = Integer.parseInt(element.getAttribute("tileheight"));
        }
        if (GameEngine.C()) {
            this.d = this.o.n;
            this.e = this.o.o;
        }
        int i = 0;
        if (element.hasAttribute("spacing")) {
            i = Integer.parseInt(element.getAttribute("spacing"));
        }
        this.f = this.d + i;
        this.g = this.e + i;
        NodeList elementsByTagName2 = element.getElementsByTagName("tile");
        for (int i2 = 0; i2 < elementsByTagName2.getLength(); i2++) {
            Element element2 = (Element) elementsByTagName2.item(i2);
            int parseInt = Integer.parseInt(element2.getAttribute("id")) + this.l;
            Properties properties = new Properties();
            Element element3 = (Element) element2.getElementsByTagName("properties").item(0);
            if (element3 != null) {
                NodeList elementsByTagName3 = element3.getElementsByTagName("property");
                for (int i3 = 0; i3 < elementsByTagName3.getLength(); i3++) {
                    Element element4 = (Element) elementsByTagName3.item(i3);
                    String attribute = element4.getAttribute("name");
                    String attribute2 = element4.getAttribute("value");
                    if ("unit".equalsIgnoreCase(attribute) || "customUnit".equalsIgnoreCase(attribute)) {
                        this.s = true;
                    }
                    properties.setProperty(attribute, attribute2);
                }
            }
            this.x.put(new Integer(parseInt), properties);
        }
    }

    public static String a(String str, String str2) {
        Iterator it = u.iterator();
        while (it.hasNext()) {
            k kVar = (k) it.next();
            if (str.equalsIgnoreCase(kVar.f)) {
                return kVar.d;
            }
        }
        k kVar2 = new k();
        kVar2.b = false;
        kVar2.e = null;
        kVar2.f = str;
        kVar2.c = t;
        kVar2.d = t + k.f156a;
        kVar2.g = str2;
        k.f156a++;
        u.add(kVar2);
        return kVar2.d;
    }

    public static com.corrodinggames.rts.gameFramework.m.e a(String str) {
        GameEngine gameEngine = GameEngine.getGameEngine();
        String str2 = "tilesets/bitmaps/";
        if (str.startsWith(t)) {
            str2 = t;
        }
        k kVar = null;
        Iterator it = u.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            k kVar2 = (k) it.next();
            if (str.equalsIgnoreCase(kVar2.d) && str2.equalsIgnoreCase(kVar2.c)) {
                kVar = kVar2;
                break;
            }
        }
        if (kVar != null) {
            if (kVar.f != null) {
                try {
                    com.corrodinggames.rts.gameFramework.m.e a2 = gameEngine.bO.a((InputStream) new BufferedInputStream(e.a(kVar.f, "base64", VariableScope.nullOrMissingString)), false);
                    if (a2 == null) {
                        throw new f("Embedded tilesetBitmap is null for: " + str);
                    }
                    kVar.e = a2;
                    kVar.f = null;
                } catch (RuntimeException e) {
                    e.printStackTrace();
                    throw new f("Error loading embedded base64 image:" + kVar.g + " - " + e.getMessage());
                }
            }
            kVar.b = true;
            return kVar.e;
        }
        try {
            InputStream d = gameEngine.bL.d(str2, str);
            com.corrodinggames.rts.gameFramework.m.e a3 = gameEngine.bO.a(d, false);
            if (d != null) {
                try {
                    d.close();
                } catch (IOException e2) {
                    e2.printStackTrace();
                }
            }
            if (a3 == null) {
                throw new RuntimeException("tilesetBitmap is null for: " + str);
            }
            a3.a("tilesets/" + str);
            k kVar3 = new k();
            kVar3.b = true;
            kVar3.e = a3;
            kVar3.c = str2;
            kVar3.d = str;
            u.add(kVar3);
            return kVar3.e;
        } catch (IOException e3) {
            throw new f("Image file could not be found or loaded: " + str2 + str, e3);
        }
    }

    public static void a() {
        Iterator it = u.iterator();
        while (it.hasNext()) {
            ((k) it.next()).b = false;
        }
    }

    public static void b() {
        Iterator it = u.iterator();
        while (it.hasNext()) {
            k kVar = (k) it.next();
            if (!kVar.b) {
                if (kVar.e != null) {
                    kVar.e.o();
                    kVar.e = null;
                }
                kVar.f = null;
                it.remove();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void c() {
        this.b = a(this.c);
        this.j = this.b.m() / this.f;
        if (this.j == 0) {
            this.j = 1;
        }
        this.k = 1.0f / this.j;
    }

    public Properties a(int i) {
        return (Properties) this.x.get(new Integer(i));
    }

    public final void a(int i, Rect rect) {
        int i2 = i % this.j;
        int i3 = (int) (i * this.k);
        int i4 = this.h + (i2 * this.f);
        int i5 = this.i + (i3 * this.g);
        rect.f47a = i4;
        rect.b = i5;
        rect.c = i4 + this.d;
        rect.d = i5 + this.e;
    }

    public final Rect b(int i) {
        if (this.w == i) {
            return this.v;
        }
        this.w = i;
        a(i, this.v);
        return this.v;
    }

    public void c(int i) {
        this.m = i;
    }

    public boolean d(int i) {
        return i >= this.l && i <= this.m;
    }

    public void d() {
        this.b = null;
        this.o = null;
        this.x = null;
    }

    public Integer b(String str, String str2) {
        for (Map.Entry entry : this.x.entrySet()) {
            Integer num = (Integer) entry.getKey();
            String property = ((Properties) entry.getValue()).getProperty(str);
            if (property != null && property.equals(str2)) {
                return num;
            }
        }
        return null;
    }

    public int a(int i, int i2) {
        int m;
        if (this.b == null) {
            GameEngine.m328e("getIndexOffsetByPosition tilesetBitmap == null");
            m = 3;
        } else if (this.d == 0) {
            GameEngine.m328e("getIndexOffsetByPosition tileWidth==0");
            m = 3;
        } else {
            m = this.b.m() / this.d;
        }
        return i + (i2 * m);
    }
}