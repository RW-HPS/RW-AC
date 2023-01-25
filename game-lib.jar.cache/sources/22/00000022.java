package android.content;

import android.content.pm.PackageManager;
import android.content.res.AssetManager;
import android.content.res.Resources;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

/* loaded from: game-lib.jar:android/content/Context.class */
public abstract class Context {
    /* renamed from: d */
    public abstract AssetManager mo5308d();

    /* renamed from: e */
    public abstract Resources mo5307e();

    /* renamed from: f */
    public abstract PackageManager mo5306f();

    /* renamed from: g */
    public abstract Context mo5305g();

    /* renamed from: h */
    public abstract String mo5304h();

    /* renamed from: a */
    public abstract SharedPreferences mo5312a(String str, int i);

    /* renamed from: a */
    public abstract FileInputStream mo5313a(String str);

    /* renamed from: b */
    public abstract FileOutputStream mo5310b(String str, int i);

    /* renamed from: b */
    public abstract File mo5311b(String str);

    /* renamed from: i */
    public abstract File mo5303i();

    /* renamed from: j */
    public abstract File mo5302j();

    /* renamed from: a */
    public abstract void mo5314a(Intent intent);

    /* renamed from: c */
    public abstract Object mo5309c(String str);
}