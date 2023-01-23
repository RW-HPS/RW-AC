package com.corrodinggames.rts.gameFramework.f;

import android.content.ComponentName;
import android.content.Intent;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import java.util.ArrayList;

/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/f/v.class */
public class v implements Menu {

    /* renamed from: a  reason: collision with root package name */
    public ArrayList f528a = new ArrayList();

    @Override // android.view.Menu
    public MenuItem add(CharSequence charSequence) {
        w wVar = new w();
        wVar.setTitle(charSequence);
        this.f528a.add(wVar);
        return wVar;
    }

    @Override // android.view.Menu
    public MenuItem add(int i) {
        throw new RuntimeException("not Implemented");
    }

    @Override // android.view.Menu
    public MenuItem add(int i, int i2, int i3, CharSequence charSequence) {
        w wVar = new w();
        wVar.setTitle(charSequence);
        wVar.a(i2);
        this.f528a.add(wVar);
        return wVar;
    }

    @Override // android.view.Menu
    public MenuItem add(int i, int i2, int i3, int i4) {
        throw new RuntimeException("not Implemented");
    }

    @Override // android.view.Menu
    public int addIntentOptions(int i, int i2, int i3, ComponentName componentName, Intent[] intentArr, Intent intent, int i4, MenuItem[] menuItemArr) {
        throw new RuntimeException("not Implemented");
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(CharSequence charSequence) {
        throw new RuntimeException("not Implemented");
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i) {
        throw new RuntimeException("not Implemented");
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i, int i2, int i3, CharSequence charSequence) {
        throw new RuntimeException("not Implemented");
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i, int i2, int i3, int i4) {
        throw new RuntimeException("not Implemented");
    }

    @Override // android.view.Menu
    public void clear() {
        this.f528a.clear();
    }

    @Override // android.view.Menu
    public MenuItem getItem(int i) {
        return (MenuItem) this.f528a.get(i);
    }

    @Override // android.view.Menu
    public void close() {
        throw new RuntimeException("not Implemented");
    }

    @Override // android.view.Menu
    public MenuItem findItem(int i) {
        throw new RuntimeException("not Implemented");
    }

    @Override // android.view.Menu
    public boolean hasVisibleItems() {
        throw new RuntimeException("not Implemented");
    }

    @Override // android.view.Menu
    public boolean isShortcutKey(int i, KeyEvent keyEvent) {
        throw new RuntimeException("not Implemented");
    }

    @Override // android.view.Menu
    public boolean performIdentifierAction(int i, int i2) {
        throw new RuntimeException("not Implemented");
    }

    @Override // android.view.Menu
    public boolean performShortcut(int i, KeyEvent keyEvent, int i2) {
        throw new RuntimeException("not Implemented");
    }

    @Override // android.view.Menu
    public void removeGroup(int i) {
        throw new RuntimeException("not Implemented");
    }

    @Override // android.view.Menu
    public void removeItem(int i) {
        throw new RuntimeException("not Implemented");
    }

    @Override // android.view.Menu
    public void setGroupCheckable(int i, boolean z, boolean z2) {
        throw new RuntimeException("not Implemented");
    }

    @Override // android.view.Menu
    public void setGroupEnabled(int i, boolean z) {
        throw new RuntimeException("not Implemented");
    }

    @Override // android.view.Menu
    public void setGroupVisible(int i, boolean z) {
        throw new RuntimeException("not Implemented");
    }

    @Override // android.view.Menu
    public void setQwertyMode(boolean z) {
        throw new RuntimeException("not Implemented");
    }

    @Override // android.view.Menu
    public int size() {
        return this.f528a.size();
    }
}