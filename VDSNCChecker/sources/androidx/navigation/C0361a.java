package androidx.navigation;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.AttributeSet;
import androidx.navigation.C0369e;
import com.dynamsoft.dbr.EnumBarcodeFormat;
import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p000a.C0001b;
import p136w0.C2015m;
import p136w0.C2037s;

@C0369e.C0371b("activity")
/* renamed from: androidx.navigation.a */
public class C0361a extends C0369e<C0362a> {

    /* renamed from: a */
    public Context f1736a;

    /* renamed from: b */
    public Activity f1737b;

    /* renamed from: androidx.navigation.a$a */
    public static class C0362a extends C0364b {

        /* renamed from: m */
        public Intent f1738m;

        /* renamed from: n */
        public String f1739n;

        public C0362a(C0369e<? extends C0362a> eVar) {
            super(eVar);
        }

        /* renamed from: e */
        public void mo1864e(Context context, AttributeSet attributeSet) {
            super.mo1864e(context, attributeSet);
            TypedArray obtainAttributes = context.getResources().obtainAttributes(attributeSet, C2037s.f5876a);
            String string = obtainAttributes.getString(4);
            if (string != null) {
                string = string.replace("${applicationId}", context.getPackageName());
            }
            if (this.f1738m == null) {
                this.f1738m = new Intent();
            }
            this.f1738m.setPackage(string);
            String string2 = obtainAttributes.getString(0);
            if (string2 != null) {
                if (string2.charAt(0) == '.') {
                    string2 = context.getPackageName() + string2;
                }
                ComponentName componentName = new ComponentName(context, string2);
                if (this.f1738m == null) {
                    this.f1738m = new Intent();
                }
                this.f1738m.setComponent(componentName);
            }
            String string3 = obtainAttributes.getString(1);
            if (this.f1738m == null) {
                this.f1738m = new Intent();
            }
            this.f1738m.setAction(string3);
            String string4 = obtainAttributes.getString(2);
            if (string4 != null) {
                Uri parse = Uri.parse(string4);
                if (this.f1738m == null) {
                    this.f1738m = new Intent();
                }
                this.f1738m.setData(parse);
            }
            this.f1739n = obtainAttributes.getString(3);
            obtainAttributes.recycle();
        }

        public String toString() {
            Intent intent = this.f1738m;
            String str = null;
            ComponentName component = intent == null ? null : intent.getComponent();
            StringBuilder sb = new StringBuilder();
            sb.append(super.toString());
            if (component != null) {
                sb.append(" class=");
                sb.append(component.getClassName());
            } else {
                Intent intent2 = this.f1738m;
                if (intent2 != null) {
                    str = intent2.getAction();
                }
                if (str != null) {
                    sb.append(" action=");
                    sb.append(str);
                }
            }
            return sb.toString();
        }
    }

    /* renamed from: androidx.navigation.a$b */
    public static final class C0363b implements C0369e.C0370a {
    }

    public C0361a(Context context) {
        this.f1736a = context;
        while (context instanceof ContextWrapper) {
            if (context instanceof Activity) {
                this.f1737b = (Activity) context;
                return;
            }
            context = ((ContextWrapper) context).getBaseContext();
        }
    }

    /* renamed from: a */
    public C0364b mo1861a() {
        return new C0362a(this);
    }

    /* renamed from: b */
    public C0364b mo1862b(C0364b bVar, Bundle bundle, C2015m mVar, C0369e.C0370a aVar) {
        Intent intent;
        int intExtra;
        C0362a aVar2 = (C0362a) bVar;
        if (aVar2.f1738m != null) {
            Intent intent2 = new Intent(aVar2.f1738m);
            if (bundle != null) {
                intent2.putExtras(bundle);
                String str = aVar2.f1739n;
                if (!TextUtils.isEmpty(str)) {
                    StringBuffer stringBuffer = new StringBuffer();
                    Matcher matcher = Pattern.compile("\\{(.+?)\\}").matcher(str);
                    while (matcher.find()) {
                        String group = matcher.group(1);
                        if (bundle.containsKey(group)) {
                            matcher.appendReplacement(stringBuffer, "");
                            stringBuffer.append(Uri.encode(bundle.get(group).toString()));
                        } else {
                            throw new IllegalArgumentException("Could not find " + group + " in " + bundle + " to fill data pattern " + str);
                        }
                    }
                    matcher.appendTail(stringBuffer);
                    intent2.setData(Uri.parse(stringBuffer.toString()));
                }
            }
            boolean z = aVar instanceof C0363b;
            if (z) {
                Objects.requireNonNull((C0363b) aVar);
                intent2.addFlags(0);
            }
            if (!(this.f1736a instanceof Activity)) {
                intent2.addFlags(EnumBarcodeFormat.BF_AZTEC);
            }
            if (mVar != null && mVar.f5852a) {
                intent2.addFlags(EnumBarcodeFormat.BF_MAXICODE);
            }
            Activity activity = this.f1737b;
            if (!(activity == null || (intent = activity.getIntent()) == null || (intExtra = intent.getIntExtra("android-support-navigation:ActivityNavigator:current", 0)) == 0)) {
                intent2.putExtra("android-support-navigation:ActivityNavigator:source", intExtra);
            }
            intent2.putExtra("android-support-navigation:ActivityNavigator:current", aVar2.f1742g);
            Resources resources = this.f1736a.getResources();
            if (mVar != null) {
                int i = mVar.f5857f;
                int i2 = mVar.f5858g;
                if ((i <= 0 || !resources.getResourceTypeName(i).equals("animator")) && (i2 <= 0 || !resources.getResourceTypeName(i2).equals("animator"))) {
                    intent2.putExtra("android-support-navigation:ActivityNavigator:popEnterAnim", i);
                    intent2.putExtra("android-support-navigation:ActivityNavigator:popExitAnim", i2);
                } else {
                    resources.getResourceName(i);
                    resources.getResourceName(i2);
                    aVar2.toString();
                }
            }
            if (z) {
                Objects.requireNonNull((C0363b) aVar);
            }
            this.f1736a.startActivity(intent2);
            if (mVar == null || this.f1737b == null) {
                return null;
            }
            int i3 = mVar.f5855d;
            int i4 = mVar.f5856e;
            if ((i3 > 0 && resources.getResourceTypeName(i3).equals("animator")) || (i4 > 0 && resources.getResourceTypeName(i4).equals("animator"))) {
                resources.getResourceName(i3);
                resources.getResourceName(i4);
                aVar2.toString();
                return null;
            } else if (i3 < 0 && i4 < 0) {
                return null;
            } else {
                this.f1737b.overridePendingTransition(Math.max(i3, 0), Math.max(i4, 0));
                return null;
            }
        } else {
            StringBuilder a = C0001b.m0a("Destination ");
            a.append(aVar2.f1742g);
            a.append(" does not have an Intent set.");
            throw new IllegalStateException(a.toString());
        }
    }

    /* renamed from: e */
    public boolean mo1863e() {
        Activity activity = this.f1737b;
        if (activity == null) {
            return false;
        }
        activity.finish();
        return true;
    }
}
