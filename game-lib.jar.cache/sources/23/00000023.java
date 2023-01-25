package android.content;

import android.content.pm.PackageManager;
import android.content.res.AssetManager;
import android.content.res.Resources;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

/* loaded from: game-lib.jar:android/content/ContextWrapper.class */
public class ContextWrapper extends Context {

    /* renamed from: a */
    Context f115a;

    public ContextWrapper(Context context) {
        this.f115a = context;
    }

    /* renamed from: k */
    public Context m5315k() {
        return this.f115a;
    }

    @Override // android.content.Context
    /* renamed from: d */
    public AssetManager mo5308d() {
        return this.f115a.mo5308d();
    }

    @Override // android.content.Context
    /* renamed from: e */
    public Resources mo5307e() {
        return this.f115a.mo5307e();
    }

    @Override // android.content.Context
    /* renamed from: f */
    public PackageManager mo5306f() {
        return this.f115a.mo5306f();
    }

    @Override // android.content.Context
    /* renamed from: g */
    public Context mo5305g() {
        return this.f115a.mo5305g();
    }

    @Override // android.content.Context
    /* renamed from: h */
    public String mo5304h() {
        return this.f115a.mo5304h();
    }

    @Override // android.content.Context
    /* renamed from: a */
    public SharedPreferences mo5312a(String str, int i) {
        return this.f115a.mo5312a(str, i);
    }

    @Override // android.content.Context
    /* renamed from: a */
    public FileInputStream mo5313a(String str) {
        return this.f115a.mo5313a(str);
    }

    @Override // android.content.Context
    /* renamed from: b */
    public FileOutputStream mo5310b(String str, int i) {
        return this.f115a.mo5310b(str, i);
    }

    @Override // android.content.Context
    /* renamed from: b */
    public File mo5311b(String str) {
        return this.f115a.mo5311b(str);
    }

    @Override // android.content.Context
    /* renamed from: i */
    public File mo5303i() {
        return this.f115a.mo5303i();
    }

    @Override // android.content.Context
    /* renamed from: j */
    public File mo5302j() {
        return this.f115a.mo5302j();
    }

    @Override // android.content.Context
    /* renamed from: a */
    public void mo5314a(Intent intent) {
        this.f115a.mo5314a(intent);
    }

    @Override // android.content.Context
    /* renamed from: c */
    public Object mo5309c(String str) {
        return this.f115a.mo5309c(str);
    }
}