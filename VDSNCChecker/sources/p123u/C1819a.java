package p123u;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.View;
import androidx.appcompat.widget.C0131a0;

@SuppressLint({"LogConditional"})
/* renamed from: u.a */
public class C1819a {
    /* renamed from: a */
    public static String m5005a(Context context, int i) {
        if (i == -1) {
            return "UNKNOWN";
        }
        try {
            return context.getResources().getResourceEntryName(i);
        } catch (Exception unused) {
            return C0131a0.m344a("?", i);
        }
    }

    /* renamed from: b */
    public static String m5006b(View view) {
        try {
            return view.getContext().getResources().getResourceEntryName(view.getId());
        } catch (Exception unused) {
            return "UNKNOWN";
        }
    }
}
