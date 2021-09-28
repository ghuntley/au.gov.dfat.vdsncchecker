package p007au.gov.dfat.vdsncchecker.p008ui;

import android.content.pm.PackageManager;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TextView;
import p007au.gov.dfat.vdsncchecker.R;
import p065k1.C1167a;
import p065k1.C1172f;
import p072l2.C1241e;
import p136w0.C2035q;

/* renamed from: au.gov.dfat.vdsncchecker.ui.AboutActivity */
public final class AboutActivity extends C1172f {

    /* renamed from: v */
    public static final /* synthetic */ int f2239v = 0;

    public AboutActivity() {
        super(false, false, false, 5);
    }

    public void onCreate(Bundle bundle) {
        String str;
        super.onCreate(bundle);
        setContentView((int) R.layout.activity_about);
        TextView textView = (TextView) findViewById(R.id.versionNo);
        Object[] objArr = new Object[1];
        try {
            str = getPackageManager().getPackageInfo(getPackageName(), 0).versionName;
            C1241e.m3516f(str, "{\n        context.packageManager.getPackageInfo(context.packageName, 0).versionName\n    }");
        } catch (PackageManager.NameNotFoundException unused) {
            C2035q.m5362a(new Object[]{new Object[0]}, 1, "Unable to get version name", "java.lang.String.format(format, *args)");
            str = "";
        }
        objArr[0] = str;
        textView.setText(getString(R.string.versionNo, objArr));
        ((Button) findViewById(R.id.moreInfoButton)).setOnClickListener(new C1167a(this, 0));
        ((Button) findViewById(R.id.termsOfUseButton)).setOnClickListener(new C1167a(this, 1));
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        C1241e.m3517j(menuItem, "item");
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        finish();
        return true;
    }
}
