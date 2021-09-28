package p129v;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import android.util.Xml;
import android.view.View;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Iterator;
import org.xmlpull.v1.XmlPullParser;
import p063k.C1142f;
import p099q.C1600i;

/* renamed from: v.a */
public class C1955a {

    /* renamed from: a */
    public boolean f5760a = false;

    /* renamed from: b */
    public String f5761b;

    /* renamed from: c */
    public int f5762c;

    /* renamed from: d */
    public int f5763d;

    /* renamed from: e */
    public float f5764e;

    /* renamed from: f */
    public String f5765f;

    /* renamed from: g */
    public boolean f5766g;

    /* renamed from: h */
    public int f5767h;

    public C1955a(String str, int i, Object obj, boolean z) {
        this.f5761b = str;
        this.f5762c = i;
        this.f5760a = z;
        mo6453c(obj);
    }

    public C1955a(C1955a aVar, Object obj) {
        this.f5761b = aVar.f5761b;
        this.f5762c = aVar.f5762c;
        mo6453c(obj);
    }

    /* renamed from: a */
    public static void m5262a(Context context, XmlPullParser xmlPullParser, HashMap<String, C1955a> hashMap) {
        int i;
        float f;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), C1961e.f5787e);
        int indexCount = obtainStyledAttributes.getIndexCount();
        String str = null;
        int i2 = 0;
        boolean z = false;
        Object obj = null;
        for (int i3 = 0; i3 < indexCount; i3++) {
            int index = obtainStyledAttributes.getIndex(i3);
            int i4 = 1;
            if (index == 0) {
                str = obtainStyledAttributes.getString(index);
                if (str != null && str.length() > 0) {
                    str = Character.toUpperCase(str.charAt(0)) + str.substring(1);
                }
            } else if (index == 10) {
                str = obtainStyledAttributes.getString(index);
                z = true;
            } else if (index == 1) {
                obj = Boolean.valueOf(obtainStyledAttributes.getBoolean(index, false));
                i2 = 6;
            } else {
                if (index == 3) {
                    i4 = 3;
                } else if (index == 2) {
                    i4 = 4;
                } else {
                    if (index == 7) {
                        f = TypedValue.applyDimension(1, obtainStyledAttributes.getDimension(index, 0.0f), context.getResources().getDisplayMetrics());
                    } else if (index == 4) {
                        f = obtainStyledAttributes.getDimension(index, 0.0f);
                    } else if (index == 5) {
                        obj = Float.valueOf(obtainStyledAttributes.getFloat(index, Float.NaN));
                        i2 = 2;
                    } else {
                        if (index == 6) {
                            i = obtainStyledAttributes.getInteger(index, -1);
                        } else if (index == 9) {
                            obj = obtainStyledAttributes.getString(index);
                            i2 = 5;
                        } else if (index == 8) {
                            i = obtainStyledAttributes.getResourceId(index, -1);
                            if (i == -1) {
                                i = obtainStyledAttributes.getInt(index, -1);
                            }
                            i4 = 8;
                        }
                        obj = Integer.valueOf(i);
                        i2 = i4;
                    }
                    obj = Float.valueOf(f);
                    i2 = 7;
                }
                i = obtainStyledAttributes.getColor(index, 0);
                obj = Integer.valueOf(i);
                i2 = i4;
            }
        }
        if (!(str == null || obj == null)) {
            hashMap.put(str, new C1955a(str, i2, obj, z));
        }
        obtainStyledAttributes.recycle();
    }

    /* renamed from: b */
    public static void m5263b(View view, HashMap<String, C1955a> hashMap) {
        Class<?> cls = view.getClass();
        Iterator<String> it = hashMap.keySet().iterator();
        while (it.hasNext()) {
            String next = it.next();
            C1955a aVar = hashMap.get(next);
            if (!aVar.f5760a) {
                next = C1142f.m3365a("set", next);
            }
            try {
                switch (C1600i.m4504a(aVar.f5762c)) {
                    case 0:
                        cls.getMethod(next, new Class[]{Integer.TYPE}).invoke(view, new Object[]{Integer.valueOf(aVar.f5763d)});
                        break;
                    case 1:
                        cls.getMethod(next, new Class[]{Float.TYPE}).invoke(view, new Object[]{Float.valueOf(aVar.f5764e)});
                        break;
                    case 2:
                        cls.getMethod(next, new Class[]{Integer.TYPE}).invoke(view, new Object[]{Integer.valueOf(aVar.f5767h)});
                        break;
                    case 3:
                        Method method = cls.getMethod(next, new Class[]{Drawable.class});
                        ColorDrawable colorDrawable = new ColorDrawable();
                        colorDrawable.setColor(aVar.f5767h);
                        method.invoke(view, new Object[]{colorDrawable});
                        break;
                    case 4:
                        cls.getMethod(next, new Class[]{CharSequence.class}).invoke(view, new Object[]{aVar.f5765f});
                        break;
                    case 5:
                        cls.getMethod(next, new Class[]{Boolean.TYPE}).invoke(view, new Object[]{Boolean.valueOf(aVar.f5766g)});
                        break;
                    case 6:
                        cls.getMethod(next, new Class[]{Float.TYPE}).invoke(view, new Object[]{Float.valueOf(aVar.f5764e)});
                        break;
                    case 7:
                        cls.getMethod(next, new Class[]{Integer.TYPE}).invoke(view, new Object[]{Integer.valueOf(aVar.f5763d)});
                        break;
                }
            } catch (NoSuchMethodException e) {
                e.getMessage();
            } catch (IllegalAccessException e2) {
                e2.printStackTrace();
            } catch (InvocationTargetException e3) {
                e3.printStackTrace();
            }
        }
    }

    /* renamed from: c */
    public void mo6453c(Object obj) {
        switch (C1600i.m4504a(this.f5762c)) {
            case 0:
            case 7:
                this.f5763d = ((Integer) obj).intValue();
                return;
            case 1:
            case 6:
                this.f5764e = ((Float) obj).floatValue();
                return;
            case 2:
            case 3:
                this.f5767h = ((Integer) obj).intValue();
                return;
            case 4:
                this.f5765f = (String) obj;
                return;
            case 5:
                this.f5766g = ((Boolean) obj).booleanValue();
                return;
            default:
                return;
        }
    }
}
