package com.corrodinggames.rts.gameFramework.translations;

import com.corrodinggames.rts.gameFramework.GameEngine;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.MissingResourceException;
import java.util.ResourceBundle;
import java.util.Vector;

/* renamed from: com.corrodinggames.rts.gameFramework.h.b */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/h/b.class */
class b extends ResourceBundle {
    ResourceBundle a;
    ResourceBundle b;

    public b(ResourceBundle resourceBundle, ResourceBundle resourceBundle2) {
        this.a = resourceBundle;
        this.b = resourceBundle2;
    }

    @Override // java.util.ResourceBundle
    public Enumeration getKeys() {
        GameEngine.m5e("MultipleResourceBundle: Slow get keys");
        Vector vector = new Vector();
        vector.addAll(Collections.list(this.a.getKeys()));
        if (this.b != null) {
            Iterator it = Collections.list(this.b.getKeys()).iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                if (!vector.contains(str)) {
                    vector.add(str);
                }
            }
        }
        return vector.elements();
    }

    @Override // java.util.ResourceBundle
    protected Object handleGetObject(String str) {
        Object obj;
        try {
            obj = this.a.getObject(str);
        } catch (MissingResourceException e) {
            obj = null;
        }
        if (obj == null && this.b != null) {
            try {
                obj = this.b.getObject(str);
            } catch (MissingResourceException e2) {
                obj = null;
            }
        }
        return obj;
    }
}