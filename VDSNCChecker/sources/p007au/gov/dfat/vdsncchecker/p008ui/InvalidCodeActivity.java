package p007au.gov.dfat.vdsncchecker.p008ui;

import android.os.Bundle;
import android.view.MenuItem;
import p007au.gov.dfat.vdsncchecker.R;
import p065k1.C1172f;
import p072l2.C1241e;

/* renamed from: au.gov.dfat.vdsncchecker.ui.InvalidCodeActivity */
public final class InvalidCodeActivity extends C1172f {
    public InvalidCodeActivity() {
        super(false, false, false, 5);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.activity_invalid_code);
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
