package android.app;

import android.content.ComponentCallbacks;
import android.content.ComponentCallbacks2;
import android.content.ContextWrapper;
import android.content.res.Configuration;
import java.util.ArrayList;

/* loaded from: game-lib.jar:android/app/Application.class */
public class Application extends ContextWrapper implements ComponentCallbacks2 {
    private ArrayList b;
    private ArrayList c;
    private ArrayList d;

    /* loaded from: game-lib.jar:android/app/Application$ActivityLifecycleCallbacks.class */
    public interface ActivityLifecycleCallbacks {
    }

    /* loaded from: game-lib.jar:android/app/Application$OnProvideAssistDataListener.class */
    public interface OnProvideAssistDataListener {
    }

    public Application() {
        super(null);
        this.b = new ArrayList();
        this.c = new ArrayList();
        this.d = null;
    }

    @Override // android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        Object[] a2 = a();
        if (a2 != null) {
            for (Object obj : a2) {
                ((ComponentCallbacks) obj).onConfigurationChanged(configuration);
            }
        }
    }

    @Override // android.content.ComponentCallbacks
    public void onLowMemory() {
        Object[] a2 = a();
        if (a2 != null) {
            for (Object obj : a2) {
                ((ComponentCallbacks) obj).onLowMemory();
            }
        }
    }

    @Override // android.content.ComponentCallbacks2
    public void onTrimMemory(int i) {
        Object[] a2 = a();
        if (a2 != null) {
            for (Object obj : a2) {
                if (obj instanceof ComponentCallbacks2) {
                    ((ComponentCallbacks2) obj).onTrimMemory(i);
                }
            }
        }
    }

    private Object[] a() {
        Object[] objArr = null;
        synchronized (this.b) {
            if (this.b.size() > 0) {
                objArr = this.b.toArray();
            }
        }
        return objArr;
    }
}