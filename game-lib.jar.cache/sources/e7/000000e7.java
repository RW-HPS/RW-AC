package com.corrodinggames.librocket;

import android.graphics.Rect;
import android.graphics.RectF;
import com.Element;
import com.ElementDocument;
import com.LibRocket;
import com.corrodinggames.librocket.scripts.ScriptEngine;
import com.corrodinggames.rts.game.units.ar;
import com.corrodinggames.rts.game.units.as;
import com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope;
import com.corrodinggames.rts.gameFramework.FileChangeEngine;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.bt;
import com.corrodinggames.rts.gameFramework.f;
import java.io.File;
import java.util.HashMap;
import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: game-lib.jar:com/corrodinggames/librocket/b.class */
public abstract class b extends LibRocket {

    /* renamed from: a */
    public static bt f71a = new bt("LoadResources");
    public static String b = VariableScope.nullOrMissingString;
    public boolean e;
    private d j;
    private d k;
    protected int d = 0;
    protected Rect f = new Rect();
    protected RectF g = new RectF();
    protected boolean h = false;
    Pattern i = Pattern.compile("\\$\\{([^\\}]*?)\\}");
    public ScriptEngine c = ScriptEngine.createScriptEngine(this);

    @Override // com.LibRocket
    public abstract void EnableScissorRegion(boolean z);

    public void a() {
        this.d = 0;
    }

    public static String a(String str) {
        GameEngine.m2e("convertTexturePath for: " + str);
        String o = f.o(str);
        if (o.startsWith("base:")) {
            return b + o.substring("base:".length());
        }
        if (o.startsWith("drawable:")) {
            return b + "res/drawable/" + o.substring("drawable:".length());
        }
        if (o.startsWith("assets:")) {
            String substring = o.substring("assets:".length());
            String e = com.corrodinggames.rts.gameFramework.file.a.e(substring);
            boolean z = true;
            if (GameEngine.aZ && e != null && e.startsWith(b)) {
                z = false;
            }
            if (GameEngine.aZ && e != null && e.startsWith("/private")) {
                z = false;
            }
            GameEngine.m2e("convertTexturePath  (basePath:" + z + "):" + substring + " > " + e);
            if (z) {
                return b + e;
            }
            return e;
        } else if (o.startsWith(b + "assets/gui/")) {
            GameEngine.m2e("convertTexturePath already had path:" + o);
            return o;
        } else {
            return b + "assets/gui/" + o;
        }
    }

    public Matcher a(String str, String str2) {
        Matcher matcher = Pattern.compile(str).matcher(str2);
        if (matcher.matches()) {
            return matcher;
        }
        return null;
    }

    public void ReleaseTexture(int i) {
        removeTextureHolder(i);
    }

    public boolean LoadTexture(int i, String str) {
        f71a.a();
        c cVar = (c) findTextureHolder(i);
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        as asVar = null;
        if (str.startsWith("lazy:")) {
            str = str.substring("lazy:".length());
            z = true;
        }
        if (str.startsWith("nocolor:")) {
            str = str.substring("nocolor:".length());
            z2 = true;
        }
        if (str.startsWith("unit:")) {
            str = str.substring("unit:".length());
            asVar = ar.a(str);
            z = true;
        }
        if (str.startsWith("thumbnail:")) {
            str = str.substring("thumbnail:".length());
            z3 = true;
        }
        Matcher a2 = a("^(alpha\\((.*)\\):).*", str);
        if (a2 != null) {
            String group = a2.group(1);
            String group2 = a2.group(2);
            GameEngine.m2e("alpha=" + group2);
            cVar.e = Float.parseFloat(group2);
            str = str.substring(group.length());
        }
        String a3 = a(str);
        cVar.b = z;
        cVar.c = z3;
        cVar.d = z2;
        cVar.f = asVar;
        cVar.f72a = a3;
        if (!z && !cVar.a()) {
            f71a.b();
            return false;
        }
        f71a.b();
        return true;
    }

    public void SetScissorRegion(int i, int i2, int i3, int i4) {
        this.f.a(i, i2, i + i3, i2 + i4);
        this.g.a(i, i2, i + i3, i2 + i4);
        EnableScissorRegion(true);
    }

    public boolean b() {
        if (getActiveDocument() != null || this.k != null || this.j != null) {
            return false;
        }
        return true;
    }

    public void HandleEvent(String str) {
        this.e = true;
        try {
            this.c.processScript(str);
        } finally {
            this.e = false;
        }
    }

    public Object b(String str) {
        HashMap activeDocumentMetadata = getActiveDocumentMetadata();
        if (activeDocumentMetadata == null) {
            return null;
        }
        return activeDocumentMetadata.get(str);
    }

    public void newDocumentLoaded(ElementDocument elementDocument) {
        this.c.getRootNoCheck().convertTextOnPage();
    }

    public void newDocumentShown(ElementDocument elementDocument) {
        if (this.k != null) {
            this.k.f73a.pullToFront();
        }
        if (this.j != null) {
            this.j.f73a.pullToFront();
        }
    }

    public ElementDocument c() {
        if (this.k != null) {
            return this.k.f73a;
        }
        return null;
    }

    public ElementDocument d() {
        if (this.j != null) {
            return this.j.f73a;
        }
        return null;
    }

    public ElementDocument e() {
        ElementDocument d = d();
        if (d != null) {
            return d;
        }
        return c();
    }

    public ElementDocument f() {
        ElementDocument c = c();
        if (c != null) {
            return c;
        }
        return getActiveDocument();
    }

    public ElementDocument g() {
        ElementDocument d = d();
        if (d != null) {
            return d;
        }
        ElementDocument c = c();
        if (c != null) {
            return c;
        }
        return getActiveDocument();
    }

    public void c(String str) {
        d dVar = new d();
        dVar.b = null;
        dVar.c = str;
        a(dVar);
    }

    public void b(String str, String str2) {
        d dVar = new d();
        dVar.b = str;
        dVar.c = str2;
        a(dVar);
    }

    public void a(String str, String str2, String str3, String str4, String str5, boolean z) {
        d dVar = new d();
        dVar.b = str;
        dVar.c = str2;
        dVar.d = str3;
        dVar.e = str4;
        dVar.f = str5;
        dVar.h = z;
        a(dVar);
    }

    public void a(String str, String str2, String str3, e eVar, e eVar2, boolean z) {
        d dVar = new d();
        dVar.b = str;
        dVar.c = str2;
        dVar.d = str3;
        dVar.e = eVar;
        dVar.f = eVar2;
        dVar.h = z;
        a(dVar);
    }

    public ElementDocument a(String str, String str2, String str3, Object obj, Object obj2, boolean z, boolean z2) {
        d dVar = new d();
        dVar.b = str;
        dVar.c = str2;
        dVar.d = str3;
        dVar.e = obj;
        dVar.f = obj2;
        dVar.g = z;
        dVar.h = z2;
        return a(dVar);
    }

    public ElementDocument a(d dVar) {
        ScriptEngine.checkThreadAccess();
        ElementDocument createPopup = createPopup("messagebox.rml", null);
        HashMap metadataMap = createPopup.getMetadataMap();
        createPopup.getElementById("message").setTextWithNewlines(dVar.c);
        if (dVar.b == null) {
            dVar.b = VariableScope.nullOrMissingString;
        }
        createPopup.getElementById("title").setText(dVar.b);
        a(createPopup, "button_1", dVar.e, metadataMap);
        a(createPopup, "button_2", dVar.f, metadataMap);
        Element elementById = createPopup.getElementById("button_back");
        elementById.loadCharsetIfNeededWithCurrentText();
        String str = "closePopup();";
        if (dVar.d != null) {
            str = str + "hideKeyboard();";
        }
        elementById.setAttribute("onclick", str);
        if (!dVar.h) {
            elementById.hide();
        }
        if (dVar.e == null && dVar.f == null) {
            elementById.setText(com.corrodinggames.rts.gameFramework.translations.a.a("menus.common.ok", new Object[0]));
            elementById.focus();
        }
        if (dVar.d != null) {
            createPopup.getElementById("textInputWrapper").show();
            Element elementById2 = createPopup.getElementById("textInput");
            elementById2.setAttribute("value", dVar.d);
            elementById2.focus();
        }
        dVar.f73a = createPopup;
        if (dVar.g) {
            if (b(dVar)) {
                return createPopup;
            }
            closeDocument(createPopup);
            return null;
        }
        return createPopup;
    }

    public boolean b(d dVar) {
        if (this.j != null) {
            GameEngine.m2e("AlertPopup already visible closing");
            closeDocument(this.j.f73a);
            this.j = null;
        }
        this.j = dVar;
        GameEngine.m2e("Showing popup: " + dVar.b);
        if (!this.e) {
            update();
        } else {
            GameEngine.m2e("insideEvent");
        }
        GameEngine.m2e("popup ready..");
        dVar.f73a.show(4);
        GameEngine.m2e("Popup shown..");
        return true;
    }

    public boolean a(ElementDocument elementDocument) {
        return c(new d(elementDocument));
    }

    public boolean c(d dVar) {
        if (this.k != null) {
            GameEngine.m2e("Popup already visible, cannot show: " + dVar.f73a.getMetadata("sourceDocumentId"));
            if (this.j != null) {
                this.j.f73a.pullToFront();
                return false;
            }
            this.k.f73a.pullToFront();
            return false;
        }
        this.k = dVar;
        GameEngine.m2e("Showing popup: " + dVar.b);
        if (!this.e) {
            update();
        } else {
            GameEngine.m2e("insideEvent");
        }
        GameEngine.m2e("popup ready..");
        dVar.f73a.show(4);
        GameEngine.m2e("Popup shown..");
        return true;
    }

    public ElementDocument a(String str, Object obj, String str2, boolean z) {
        ScriptEngine.checkThreadAccess();
        ElementDocument createPopup = createPopup("messagebox.rml", obj);
        createPopup.setMetadata("sourceDocumentId", str);
        String a2 = f.a(new File(a(str)));
        createPopup.getElementById("mainButtons").hide();
        Element elementById = createPopup.getElementById("message");
        elementById.setInnerRML(a2);
        a(elementById, false);
        if (str2 == null) {
            str2 = VariableScope.nullOrMissingString;
        }
        createPopup.getElementById("title").setText(str2);
        if (z) {
            if (b(createPopup)) {
                return createPopup;
            }
            return null;
        }
        return createPopup;
    }

    public boolean b(ElementDocument elementDocument) {
        if (c(new d(elementDocument))) {
            return true;
        }
        closeDocument(elementDocument);
        return false;
    }

    public void a(Element element, boolean z) {
        if (element == null) {
            GameEngine.m2e("loadCharsetIfNeededOnChildren: root is null");
            return;
        }
        Iterator it = element.getAllNestedChildren().iterator();
        while (it.hasNext()) {
            Element element2 = (Element) it.next();
            boolean z2 = false;
            String tagName = element2.getTagName();
            if (tagName.equals("p") || tagName.startsWith("h") || tagName.startsWith("label") || tagName.startsWith("button") || tagName.startsWith("select")) {
                z2 = true;
            }
            if (z && tagName.equals("option")) {
                z2 = true;
            }
            if (z2) {
                element2.loadCharsetIfNeededWithCurrentText();
            }
        }
    }

    public void a(ElementDocument elementDocument, String str, Object obj, HashMap hashMap) {
        Element elementById = elementDocument.getElementById(str);
        if (obj == null) {
            elementById.hide();
        } else if (obj instanceof String) {
            String str2 = (String) obj;
            int indexOf = str2.indexOf(":");
            String substring = str2.substring(0, indexOf);
            String str3 = VariableScope.nullOrMissingString;
            if (indexOf + 1 < str2.length()) {
                str3 = str2.substring(indexOf + 1);
            }
            if (substring.startsWith("[onenter]")) {
                substring = substring.substring("[onenter]".length());
                elementDocument.getElementById("textInput").setAttribute("onenter", str3);
            }
            elementById.setText(substring);
            elementById.setAttribute("onclick", str3);
        } else if (obj instanceof e) {
            e eVar = (e) obj;
            String str4 = "action_" + str;
            hashMap.put(str4, eVar.b);
            elementById.setText(eVar.f74a);
            elementById.setAttribute("onclick", "runRunnable(" + str4 + ");");
            if (eVar.c) {
                elementDocument.getElementById("textInput").setAttribute("onenter", "runRunnable(" + str4 + ");");
            }
        } else {
            GameEngine.g("Unhandled type:" + obj);
        }
    }

    public boolean h() {
        if (i() || j()) {
            return true;
        }
        return false;
    }

    public boolean i() {
        d dVar = this.j;
        if (dVar != null) {
            GameEngine.m2e("Closing alert");
            closeDocument(dVar.f73a);
            this.j = null;
            if (dVar.i != null) {
                dVar.i.run();
                return true;
            }
            return true;
        }
        return false;
    }

    public boolean j() {
        d dVar = this.k;
        if (dVar != null) {
            GameEngine.m2e("Closing popup");
            closeDocument(dVar.f73a);
            this.k = null;
            if (dVar.i != null) {
                dVar.i.run();
                return true;
            }
            return true;
        }
        return false;
    }

    public String k() {
        return e().getElementById("textInput").getAttribute("value");
    }

    public String d(String str) {
        String replaceFirst;
        Object processArg;
        String str2 = null;
        if (str != null && str.contains("class=\"log-entry\"")) {
            System.out.println("parseText: skipping log line:" + str);
            return null;
        }
        int i = 0;
        Matcher matcher = this.i.matcher(str);
        while (matcher.find()) {
            i++;
            if (i > 100) {
                System.out.println("parseText too many loops!!");
                return null;
            }
            String group = matcher.group(1);
            String str3 = null;
            if (this.debug) {
                System.out.println("parseText:" + group);
            }
            if (group.startsWith("i:")) {
                str3 = com.corrodinggames.rts.gameFramework.translations.a.a(group.substring(2), new Object[0]);
            }
            if (str3 == null && (processArg = this.c.processArg(group)) != null) {
                str3 = processArg.toString();
            }
            if (str3 == null) {
                replaceFirst = matcher.replaceFirst("(unhandled:" + group + ")");
            } else {
                replaceFirst = matcher.replaceFirst(str3);
            }
            if (str3 != null) {
                ElementDocument activeDocument = getActiveDocument();
                if (activeDocument != null && !activeDocument.translatedToUnicode && f.n(str3)) {
                    activeDocument.translatedToUnicode = true;
                }
                ElementDocument g = g();
                if (g != null && !g.translatedToUnicode && f.n(str3)) {
                    g.translatedToUnicode = true;
                }
            }
            matcher = this.i.matcher(replaceFirst);
            str2 = replaceFirst;
        }
        return str2;
    }

    public String TranslateString(String str) {
        try {
            String d = d(str);
            if (d != null) {
                return d;
            }
            return null;
        } catch (Exception e) {
            ScriptEngine.throwDelayedException("TranslateString exception on: " + str, e);
            GameEngine.a("Exception in TranslateString", (Throwable) e);
            GameEngine.print("start");
            e.printStackTrace();
            GameEngine.print("end");
            GameEngine.print("start logStack");
            GameEngine.T();
            GameEngine.print("end logStack");
            System.err.flush();
            System.out.flush();
            return null;
        }
    }

    public long getFileLastModified(String str) {
        return FileChangeEngine.a(str, false);
    }

    public void postUpdate() {
        boolean z = this.queueExtraUpdate;
        super.postUpdate();
        if (z) {
            this.c.checkForErrors();
        }
    }
}