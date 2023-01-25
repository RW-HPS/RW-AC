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
class C0856b extends ResourceBundle {

    /* renamed from: a */
    ResourceBundle f5618a;

    /* renamed from: b */
    ResourceBundle f5619b;

    public C0856b(ResourceBundle resourceBundle, ResourceBundle resourceBundle2) {
        this.f5618a = resourceBundle;
        this.f5619b = resourceBundle2;
    }

    @Override // java.util.ResourceBundle
    public Enumeration getKeys() {
        GameEngine.m5460e("MultipleResourceBundle: Slow get keys");
        Vector vector = new Vector();
        vector.addAll(Collections.list(this.f5618a.getKeys()));
        if (this.f5619b != null) {
            Iterator it = Collections.list(this.f5619b.getKeys()).iterator();
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
            obj = this.f5618a.getObject(str);
        } catch (MissingResourceException e) {
            obj = null;
        }
        if (obj == null && this.f5619b != null) {
            try {
                obj = this.f5619b.getObject(str);
            } catch (MissingResourceException e2) {
                obj = null;
            }
        }
        return obj;
    }
}