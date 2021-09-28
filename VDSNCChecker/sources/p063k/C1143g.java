package p063k;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.PorterDuff;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Xml;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import androidx.appcompat.view.menu.C0078g;
import androidx.appcompat.widget.C0136b1;
import androidx.appcompat.widget.C0169i0;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import p027e.C0856d;
import p028e0.C0861a;
import p028e0.C0862b;
import p039g.C0934b;
import p058j0.C1045b;
import p069l.C1216c;

/* renamed from: k.g */
public class C1143g extends MenuInflater {

    /* renamed from: e */
    public static final Class<?>[] f3951e;

    /* renamed from: f */
    public static final Class<?>[] f3952f;

    /* renamed from: a */
    public final Object[] f3953a;

    /* renamed from: b */
    public final Object[] f3954b;

    /* renamed from: c */
    public Context f3955c;

    /* renamed from: d */
    public Object f3956d;

    /* renamed from: k.g$a */
    public static class C1144a implements MenuItem.OnMenuItemClickListener {

        /* renamed from: c */
        public static final Class<?>[] f3957c = {MenuItem.class};

        /* renamed from: a */
        public Object f3958a;

        /* renamed from: b */
        public Method f3959b;

        public C1144a(Object obj, String str) {
            this.f3958a = obj;
            Class<?> cls = obj.getClass();
            try {
                this.f3959b = cls.getMethod(str, f3957c);
            } catch (Exception e) {
                StringBuilder a = C0856d.m2530a("Couldn't resolve menu item onClick handler ", str, " in class ");
                a.append(cls.getName());
                InflateException inflateException = new InflateException(a.toString());
                inflateException.initCause(e);
                throw inflateException;
            }
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            try {
                if (this.f3959b.getReturnType() == Boolean.TYPE) {
                    return ((Boolean) this.f3959b.invoke(this.f3958a, new Object[]{menuItem})).booleanValue();
                }
                this.f3959b.invoke(this.f3958a, new Object[]{menuItem});
                return true;
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
    }

    /* renamed from: k.g$b */
    public class C1145b {

        /* renamed from: A */
        public CharSequence f3960A;

        /* renamed from: B */
        public CharSequence f3961B;

        /* renamed from: C */
        public ColorStateList f3962C = null;

        /* renamed from: D */
        public PorterDuff.Mode f3963D = null;

        /* renamed from: a */
        public Menu f3965a;

        /* renamed from: b */
        public int f3966b;

        /* renamed from: c */
        public int f3967c;

        /* renamed from: d */
        public int f3968d;

        /* renamed from: e */
        public int f3969e;

        /* renamed from: f */
        public boolean f3970f;

        /* renamed from: g */
        public boolean f3971g;

        /* renamed from: h */
        public boolean f3972h;

        /* renamed from: i */
        public int f3973i;

        /* renamed from: j */
        public int f3974j;

        /* renamed from: k */
        public CharSequence f3975k;

        /* renamed from: l */
        public CharSequence f3976l;

        /* renamed from: m */
        public int f3977m;

        /* renamed from: n */
        public char f3978n;

        /* renamed from: o */
        public int f3979o;

        /* renamed from: p */
        public char f3980p;

        /* renamed from: q */
        public int f3981q;

        /* renamed from: r */
        public int f3982r;

        /* renamed from: s */
        public boolean f3983s;

        /* renamed from: t */
        public boolean f3984t;

        /* renamed from: u */
        public boolean f3985u;

        /* renamed from: v */
        public int f3986v;

        /* renamed from: w */
        public int f3987w;

        /* renamed from: x */
        public String f3988x;

        /* renamed from: y */
        public String f3989y;

        /* renamed from: z */
        public C1045b f3990z;

        public C1145b(Menu menu) {
            this.f3965a = menu;
            this.f3966b = 0;
            this.f3967c = 0;
            this.f3968d = 0;
            this.f3969e = 0;
            this.f3970f = true;
            this.f3971g = true;
        }

        /* renamed from: a */
        public SubMenu mo4739a() {
            this.f3972h = true;
            SubMenu addSubMenu = this.f3965a.addSubMenu(this.f3966b, this.f3973i, this.f3974j, this.f3975k);
            mo4741c(addSubMenu.getItem());
            return addSubMenu;
        }

        /* renamed from: b */
        public final <T> T mo4740b(String str, Class<?>[] clsArr, Object[] objArr) {
            try {
                Constructor<?> constructor = Class.forName(str, false, C1143g.this.f3955c.getClassLoader()).getConstructor(clsArr);
                constructor.setAccessible(true);
                return constructor.newInstance(objArr);
            } catch (Exception unused) {
                return null;
            }
        }

        /* renamed from: c */
        public final void mo4741c(MenuItem menuItem) {
            boolean z = false;
            menuItem.setChecked(this.f3983s).setVisible(this.f3984t).setEnabled(this.f3985u).setCheckable(this.f3982r >= 1).setTitleCondensed(this.f3976l).setIcon(this.f3977m);
            int i = this.f3986v;
            if (i >= 0) {
                menuItem.setShowAsAction(i);
            }
            if (this.f3989y != null) {
                if (!C1143g.this.f3955c.isRestricted()) {
                    C1143g gVar = C1143g.this;
                    if (gVar.f3956d == null) {
                        gVar.f3956d = gVar.mo4735a(gVar.f3955c);
                    }
                    menuItem.setOnMenuItemClickListener(new C1144a(gVar.f3956d, this.f3989y));
                } else {
                    throw new IllegalStateException("The android:onClick attribute cannot be used within a restricted context");
                }
            }
            if (this.f3982r >= 2) {
                if (menuItem instanceof C0078g) {
                    C0078g gVar2 = (C0078g) menuItem;
                    gVar2.f410x = (gVar2.f410x & -5) | 4;
                } else if (menuItem instanceof C1216c) {
                    C1216c cVar = (C1216c) menuItem;
                    try {
                        if (cVar.f4139e == null) {
                            cVar.f4139e = cVar.f4138d.getClass().getDeclaredMethod("setExclusiveCheckable", new Class[]{Boolean.TYPE});
                        }
                        cVar.f4139e.invoke(cVar.f4138d, new Object[]{Boolean.TRUE});
                    } catch (Exception unused) {
                    }
                }
            }
            String str = this.f3988x;
            if (str != null) {
                menuItem.setActionView((View) mo4740b(str, C1143g.f3951e, C1143g.this.f3953a));
                z = true;
            }
            int i2 = this.f3987w;
            if (i2 > 0 && !z) {
                menuItem.setActionView(i2);
            }
            C1045b bVar = this.f3990z;
            if (bVar != null && (menuItem instanceof C0862b)) {
                ((C0862b) menuItem).mo301a(bVar);
            }
            CharSequence charSequence = this.f3960A;
            boolean z2 = menuItem instanceof C0862b;
            if (z2) {
                ((C0862b) menuItem).setContentDescription(charSequence);
            } else if (Build.VERSION.SDK_INT >= 26) {
                menuItem.setContentDescription(charSequence);
            }
            CharSequence charSequence2 = this.f3961B;
            if (z2) {
                ((C0862b) menuItem).setTooltipText(charSequence2);
            } else if (Build.VERSION.SDK_INT >= 26) {
                menuItem.setTooltipText(charSequence2);
            }
            char c = this.f3978n;
            int i3 = this.f3979o;
            if (z2) {
                ((C0862b) menuItem).setAlphabeticShortcut(c, i3);
            } else if (Build.VERSION.SDK_INT >= 26) {
                menuItem.setAlphabeticShortcut(c, i3);
            }
            char c2 = this.f3980p;
            int i4 = this.f3981q;
            if (z2) {
                ((C0862b) menuItem).setNumericShortcut(c2, i4);
            } else if (Build.VERSION.SDK_INT >= 26) {
                menuItem.setNumericShortcut(c2, i4);
            }
            PorterDuff.Mode mode = this.f3963D;
            if (mode != null) {
                if (z2) {
                    ((C0862b) menuItem).setIconTintMode(mode);
                } else if (Build.VERSION.SDK_INT >= 26) {
                    menuItem.setIconTintMode(mode);
                }
            }
            ColorStateList colorStateList = this.f3962C;
            if (colorStateList == null) {
                return;
            }
            if (z2) {
                ((C0862b) menuItem).setIconTintList(colorStateList);
            } else if (Build.VERSION.SDK_INT >= 26) {
                menuItem.setIconTintList(colorStateList);
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v1, resolved type: java.lang.Class<?>[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    static {
        /*
            r0 = 1
            java.lang.Class[] r0 = new java.lang.Class[r0]
            r1 = 0
            java.lang.Class<android.content.Context> r2 = android.content.Context.class
            r0[r1] = r2
            f3951e = r0
            f3952f = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p063k.C1143g.<clinit>():void");
    }

    public C1143g(Context context) {
        super(context);
        this.f3955c = context;
        Object[] objArr = {context};
        this.f3953a = objArr;
        this.f3954b = objArr;
    }

    /* renamed from: a */
    public final Object mo4735a(Object obj) {
        return (!(obj instanceof Activity) && (obj instanceof ContextWrapper)) ? mo4735a(((ContextWrapper) obj).getBaseContext()) : obj;
    }

    /* renamed from: b */
    public final void mo4736b(XmlPullParser xmlPullParser, AttributeSet attributeSet, Menu menu) {
        char c;
        char c2;
        ColorStateList colorStateList;
        AttributeSet attributeSet2 = attributeSet;
        C1145b bVar = new C1145b(menu);
        int eventType = xmlPullParser.getEventType();
        while (true) {
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                if (name.equals("menu")) {
                    eventType = xmlPullParser.next();
                } else {
                    throw new RuntimeException(C1142f.m3365a("Expecting menu, got ", name));
                }
            } else {
                eventType = xmlPullParser.next();
                if (eventType == 1) {
                    break;
                }
                XmlPullParser xmlPullParser2 = xmlPullParser;
            }
        }
        String str = null;
        boolean z = false;
        boolean z2 = false;
        while (!z) {
            if (eventType != 1) {
                if (eventType != 2) {
                    if (eventType == 3) {
                        String name2 = xmlPullParser.getName();
                        if (z2 && name2.equals(str)) {
                            XmlPullParser xmlPullParser3 = xmlPullParser;
                            str = null;
                            z2 = false;
                            eventType = xmlPullParser.next();
                        } else if (name2.equals("group")) {
                            bVar.f3966b = 0;
                            bVar.f3967c = 0;
                            bVar.f3968d = 0;
                            bVar.f3969e = 0;
                            bVar.f3970f = true;
                            bVar.f3971g = true;
                        } else if (name2.equals("item")) {
                            if (!bVar.f3972h) {
                                C1045b bVar2 = bVar.f3990z;
                                if (bVar2 == null || !bVar2.mo4513a()) {
                                    bVar.f3972h = true;
                                    bVar.mo4741c(bVar.f3965a.add(bVar.f3966b, bVar.f3973i, bVar.f3974j, bVar.f3975k));
                                } else {
                                    bVar.mo4739a();
                                }
                            }
                        } else if (name2.equals("menu")) {
                            z = true;
                        }
                    }
                } else if (!z2) {
                    String name3 = xmlPullParser.getName();
                    if (name3.equals("group")) {
                        TypedArray obtainStyledAttributes = C1143g.this.f3955c.obtainStyledAttributes(attributeSet2, C0934b.f3473o);
                        bVar.f3966b = obtainStyledAttributes.getResourceId(1, 0);
                        bVar.f3967c = obtainStyledAttributes.getInt(3, 0);
                        bVar.f3968d = obtainStyledAttributes.getInt(4, 0);
                        bVar.f3969e = obtainStyledAttributes.getInt(5, 0);
                        bVar.f3970f = obtainStyledAttributes.getBoolean(2, true);
                        bVar.f3971g = obtainStyledAttributes.getBoolean(0, true);
                        obtainStyledAttributes.recycle();
                    } else if (name3.equals("item")) {
                        C0136b1 p = C0136b1.m360p(C1143g.this.f3955c, attributeSet2, C0934b.f3474p);
                        bVar.f3973i = p.mo772l(2, 0);
                        bVar.f3974j = (p.mo770j(5, bVar.f3967c) & -65536) | (p.mo770j(6, bVar.f3968d) & 65535);
                        bVar.f3975k = p.mo774n(7);
                        bVar.f3976l = p.mo774n(8);
                        bVar.f3977m = p.mo772l(0, 0);
                        String m = p.mo773m(9);
                        if (m == null) {
                            c = 0;
                        } else {
                            c = m.charAt(0);
                        }
                        bVar.f3978n = c;
                        bVar.f3979o = p.mo770j(16, 4096);
                        String m2 = p.mo773m(10);
                        if (m2 == null) {
                            c2 = 0;
                        } else {
                            c2 = m2.charAt(0);
                        }
                        bVar.f3980p = c2;
                        bVar.f3981q = p.mo770j(20, 4096);
                        bVar.f3982r = p.mo775o(11) ? p.mo761a(11, false) : bVar.f3969e;
                        bVar.f3983s = p.mo761a(3, false);
                        bVar.f3984t = p.mo761a(4, bVar.f3970f);
                        bVar.f3985u = p.mo761a(1, bVar.f3971g);
                        bVar.f3986v = p.mo770j(21, -1);
                        bVar.f3989y = p.mo773m(12);
                        bVar.f3987w = p.mo772l(13, 0);
                        bVar.f3988x = p.mo773m(15);
                        String m3 = p.mo773m(14);
                        bVar.f3990z = ((m3 != null) && bVar.f3987w == 0 && bVar.f3988x == null) ? (C1045b) bVar.mo4740b(m3, f3952f, C1143g.this.f3954b) : null;
                        bVar.f3960A = p.mo774n(17);
                        bVar.f3961B = p.mo774n(22);
                        if (p.mo775o(19)) {
                            bVar.f3963D = C0169i0.m488b(p.mo770j(19, -1), bVar.f3963D);
                            colorStateList = null;
                        } else {
                            colorStateList = null;
                            bVar.f3963D = null;
                        }
                        if (p.mo775o(18)) {
                            colorStateList = p.mo763c(18);
                        }
                        bVar.f3962C = colorStateList;
                        p.f692b.recycle();
                        bVar.f3972h = false;
                    } else {
                        if (name3.equals("menu")) {
                            mo4736b(xmlPullParser, attributeSet2, bVar.mo4739a());
                        } else {
                            XmlPullParser xmlPullParser4 = xmlPullParser;
                            str = name3;
                            z2 = true;
                        }
                        eventType = xmlPullParser.next();
                    }
                }
                XmlPullParser xmlPullParser5 = xmlPullParser;
                eventType = xmlPullParser.next();
            } else {
                throw new RuntimeException("Unexpected end of document");
            }
        }
    }

    public void inflate(int i, Menu menu) {
        if (!(menu instanceof C0861a)) {
            super.inflate(i, menu);
            return;
        }
        XmlResourceParser xmlResourceParser = null;
        try {
            xmlResourceParser = this.f3955c.getResources().getLayout(i);
            mo4736b(xmlResourceParser, Xml.asAttributeSet(xmlResourceParser), menu);
            xmlResourceParser.close();
        } catch (XmlPullParserException e) {
            throw new InflateException("Error inflating menu XML", e);
        } catch (IOException e2) {
            throw new InflateException("Error inflating menu XML", e2);
        } catch (Throwable th) {
            if (xmlResourceParser != null) {
                xmlResourceParser.close();
            }
            throw th;
        }
    }
}
