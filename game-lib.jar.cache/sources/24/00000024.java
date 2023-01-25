package android.content;

import android.content.pm.PackageManager;
import android.content.res.AssetManager;
import android.content.res.Resources;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

/* loaded from: game-lib.jar:android/content/ServerContext.class */
public class ServerContext extends Context {

    /* renamed from: a */
    AssetManager f116a = new AssetManager();

    @Override // android.content.Context
    /* renamed from: d */
    public AssetManager mo5308d() {
        return this.f116a;
    }

    @Override // android.content.Context
    /* renamed from: e */
    public Resources mo5307e() {
        return null;
    }

    @Override // android.content.Context
    /* renamed from: f */
    public PackageManager mo5306f() {
        return null;
    }

    @Override // android.content.Context
    /* renamed from: g */
    public Context mo5305g() {
        return this;
    }

    @Override // android.content.Context
    /* renamed from: h */
    public String mo5304h() {
        return null;
    }

    @Override // android.content.Context
    /* renamed from: a */
    public SharedPreferences mo5312a(String str, int i) {
        return null;
    }

    @Override // android.content.Context
    /* renamed from: a */
    public FileInputStream mo5313a(String str) {
        return null;
    }

    @Override // android.content.Context
    /* renamed from: b */
    public FileOutputStream mo5310b(String str, int i) {
        return null;
    }

    @Override // android.content.Context
    /* renamed from: b */
    public File mo5311b(String str) {
        return null;
    }

    @Override // android.content.Context
    /* renamed from: i */
    public File mo5303i() {
        return null;
    }

    @Override // android.content.Context
    /* renamed from: j */
    public File mo5302j() {
        return null;
    }

    @Override // android.content.Context
    /* renamed from: a */
    public void mo5314a(Intent intent) {
    }

    @Override // android.content.Context
    /* renamed from: c */
    public Object mo5309c(String str) {
        return null;
    }
}