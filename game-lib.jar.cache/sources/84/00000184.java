package com.corrodinggames.rts.game.b;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Properties;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

/* loaded from: game-lib.jar:com/corrodinggames/rts/game/b/i.class */
public class i {

    /* renamed from: a  reason: collision with root package name */
    public int f154a;
    public String b;
    public ArrayList c;
    public int d;
    public int e;
    public Properties f;

    public a a(String str) {
        if (this.c != null) {
            Iterator it = this.c.iterator();
            while (it.hasNext()) {
                a aVar = (a) it.next();
                if (str.equalsIgnoreCase(aVar.b)) {
                    return aVar;
                }
            }
            return null;
        }
        return null;
    }

    public i(Element element, b bVar) {
        NodeList elementsByTagName;
        this.b = element.getAttribute("name");
        if (element.hasAttribute("width")) {
            this.d = Integer.parseInt(element.getAttribute("width"));
        }
        if (element.hasAttribute("height")) {
            this.e = Integer.parseInt(element.getAttribute("height"));
        }
        this.c = new ArrayList();
        Element element2 = (Element) element.getElementsByTagName("properties").item(0);
        if (element2 != null && (elementsByTagName = element2.getElementsByTagName("property")) != null) {
            this.f = new Properties();
            for (int i = 0; i < elementsByTagName.getLength(); i++) {
                Element element3 = (Element) elementsByTagName.item(i);
                this.f.setProperty(element3.getAttribute("name"), element3.getAttribute("value"));
            }
        }
        NodeList elementsByTagName2 = element.getElementsByTagName("object");
        for (int i2 = 0; i2 < elementsByTagName2.getLength(); i2++) {
            a aVar = new a((Element) elementsByTagName2.item(i2), bVar, this);
            aVar.f145a = i2;
            this.c.add(aVar);
        }
    }
}