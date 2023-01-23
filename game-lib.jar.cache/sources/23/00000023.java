package android.content;

import android.content.pm.PackageManager;
import android.content.res.AssetManager;
import android.content.res.Resources;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

/* loaded from: game-lib.jar:android/content/ContextWrapper.class */
public class ContextWrapper extends Context {

    /* renamed from: a  reason: collision with root package name */
    Context f25a;

    public ContextWrapper(Context context) {
        this.f25a = context;
    }

    public Context k() {
        return this.f25a;
    }

    @Override // android.content.Context
    public AssetManager d() {
        return this.f25a.d();
    }

    @Override // android.content.Context
    public Resources e() {
        return this.f25a.e();
    }

    @Override // android.content.Context
    public PackageManager f() {
        return this.f25a.f();
    }

    @Override // android.content.Context
    public Context g() {
        return this.f25a.g();
    }

    @Override // android.content.Context
    public String h() {
        return this.f25a.h();
    }

    @Override // android.content.Context
    public SharedPreferences a(String str, int i) {
        return this.f25a.a(str, i);
    }

    @Override // android.content.Context
    public FileInputStream a(String str) {
        return this.f25a.a(str);
    }

    @Override // android.content.Context
    public FileOutputStream b(String str, int i) {
        return this.f25a.b(str, i);
    }

    @Override // android.content.Context
    public File b(String str) {
        return this.f25a.b(str);
    }

    @Override // android.content.Context
    public File i() {
        return this.f25a.i();
    }

    @Override // android.content.Context
    public File j() {
        return this.f25a.j();
    }

    @Override // android.content.Context
    public void a(Intent intent) {
        this.f25a.a(intent);
    }

    @Override // android.content.Context
    public Object c(String str) {
        return this.f25a.c(str);
    }
}