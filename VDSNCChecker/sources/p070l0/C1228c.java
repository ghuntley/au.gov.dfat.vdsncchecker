package p070l0;

import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;

/* renamed from: l0.c */
public class C1228c extends InputConnectionWrapper {

    /* renamed from: a */
    public final /* synthetic */ C1229d f4153a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C1228c(InputConnection inputConnection, boolean z, C1229d dVar) {
        super(inputConnection, z);
        this.f4153a = dVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:63:0x00db  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean performPrivateCommand(java.lang.String r14, android.os.Bundle r15) {
        /*
            r13 = this;
            l0.d r0 = r13.f4153a
            r1 = 0
            r2 = 1
            if (r15 != 0) goto L_0x0008
            goto L_0x00df
        L_0x0008:
            java.lang.String r3 = "androidx.core.view.inputmethod.InputConnectionCompat.COMMIT_CONTENT"
            boolean r3 = android.text.TextUtils.equals(r3, r14)
            if (r3 == 0) goto L_0x0012
            r3 = r1
            goto L_0x001b
        L_0x0012:
            java.lang.String r3 = "android.support.v13.view.inputmethod.InputConnectionCompat.COMMIT_CONTENT"
            boolean r3 = android.text.TextUtils.equals(r3, r14)
            if (r3 == 0) goto L_0x00df
            r3 = r2
        L_0x001b:
            r4 = 0
            if (r3 == 0) goto L_0x0021
            java.lang.String r5 = "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_RESULT_RECEIVER"
            goto L_0x0023
        L_0x0021:
            java.lang.String r5 = "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_RESULT_RECEIVER"
        L_0x0023:
            android.os.Parcelable r5 = r15.getParcelable(r5)     // Catch:{ all -> 0x00d7 }
            android.os.ResultReceiver r5 = (android.os.ResultReceiver) r5     // Catch:{ all -> 0x00d7 }
            if (r3 == 0) goto L_0x002e
            java.lang.String r6 = "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_URI"
            goto L_0x0030
        L_0x002e:
            java.lang.String r6 = "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_URI"
        L_0x0030:
            android.os.Parcelable r6 = r15.getParcelable(r6)     // Catch:{ all -> 0x00d5 }
            android.net.Uri r6 = (android.net.Uri) r6     // Catch:{ all -> 0x00d5 }
            if (r3 == 0) goto L_0x003b
            java.lang.String r7 = "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_DESCRIPTION"
            goto L_0x003d
        L_0x003b:
            java.lang.String r7 = "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_DESCRIPTION"
        L_0x003d:
            android.os.Parcelable r7 = r15.getParcelable(r7)     // Catch:{ all -> 0x00d5 }
            android.content.ClipDescription r7 = (android.content.ClipDescription) r7     // Catch:{ all -> 0x00d5 }
            if (r3 == 0) goto L_0x0048
            java.lang.String r8 = "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_LINK_URI"
            goto L_0x004a
        L_0x0048:
            java.lang.String r8 = "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_LINK_URI"
        L_0x004a:
            android.os.Parcelable r8 = r15.getParcelable(r8)     // Catch:{ all -> 0x00d5 }
            android.net.Uri r8 = (android.net.Uri) r8     // Catch:{ all -> 0x00d5 }
            if (r3 == 0) goto L_0x0055
            java.lang.String r9 = "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_FLAGS"
            goto L_0x0057
        L_0x0055:
            java.lang.String r9 = "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_FLAGS"
        L_0x0057:
            int r9 = r15.getInt(r9)     // Catch:{ all -> 0x00d5 }
            if (r3 == 0) goto L_0x0060
            java.lang.String r3 = "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_OPTS"
            goto L_0x0062
        L_0x0060:
            java.lang.String r3 = "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_OPTS"
        L_0x0062:
            android.os.Parcelable r3 = r15.getParcelable(r3)     // Catch:{ all -> 0x00d5 }
            android.os.Bundle r3 = (android.os.Bundle) r3     // Catch:{ all -> 0x00d5 }
            if (r6 == 0) goto L_0x00cf
            if (r7 == 0) goto L_0x00cf
            int r10 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x00d5 }
            r11 = 25
            if (r10 < r11) goto L_0x0078
            l0.e$a r12 = new l0.e$a     // Catch:{ all -> 0x00d5 }
            r12.<init>(r6, r7, r8)     // Catch:{ all -> 0x00d5 }
            goto L_0x007d
        L_0x0078:
            l0.e$b r12 = new l0.e$b     // Catch:{ all -> 0x00d5 }
            r12.<init>(r6, r7, r8)     // Catch:{ all -> 0x00d5 }
        L_0x007d:
            androidx.appcompat.widget.u r0 = (androidx.appcompat.widget.C0209u) r0     // Catch:{ all -> 0x00d5 }
            if (r10 < r11) goto L_0x00a1
            r6 = r9 & 1
            if (r6 == 0) goto L_0x00a1
            r12.mo4944a()     // Catch:{ Exception -> 0x00cf }
            java.lang.Object r6 = r12.mo4947d()     // Catch:{ all -> 0x00d5 }
            android.view.inputmethod.InputContentInfo r6 = (android.view.inputmethod.InputContentInfo) r6     // Catch:{ all -> 0x00d5 }
            if (r3 != 0) goto L_0x0096
            android.os.Bundle r3 = new android.os.Bundle     // Catch:{ all -> 0x00d5 }
            r3.<init>()     // Catch:{ all -> 0x00d5 }
            goto L_0x009c
        L_0x0096:
            android.os.Bundle r7 = new android.os.Bundle     // Catch:{ all -> 0x00d5 }
            r7.<init>(r3)     // Catch:{ all -> 0x00d5 }
            r3 = r7
        L_0x009c:
            java.lang.String r7 = "androidx.core.view.extra.INPUT_CONTENT_INFO"
            r3.putParcelable(r7, r6)     // Catch:{ all -> 0x00d5 }
        L_0x00a1:
            android.content.ClipData r6 = new android.content.ClipData     // Catch:{ all -> 0x00d5 }
            android.content.ClipDescription r7 = r12.mo4946c()     // Catch:{ all -> 0x00d5 }
            android.content.ClipData$Item r8 = new android.content.ClipData$Item     // Catch:{ all -> 0x00d5 }
            android.net.Uri r9 = r12.mo4948e()     // Catch:{ all -> 0x00d5 }
            r8.<init>(r9)     // Catch:{ all -> 0x00d5 }
            r6.<init>(r7, r8)     // Catch:{ all -> 0x00d5 }
            j0.c$a r7 = new j0.c$a     // Catch:{ all -> 0x00d5 }
            r8 = 2
            r7.<init>(r6, r8)     // Catch:{ all -> 0x00d5 }
            android.net.Uri r6 = r12.mo4945b()     // Catch:{ all -> 0x00d5 }
            r7.f3791d = r6     // Catch:{ all -> 0x00d5 }
            r7.f3792e = r3     // Catch:{ all -> 0x00d5 }
            j0.c r3 = new j0.c     // Catch:{ all -> 0x00d5 }
            r3.<init>(r7)     // Catch:{ all -> 0x00d5 }
            android.view.View r0 = r0.f935a     // Catch:{ all -> 0x00d5 }
            j0.c r0 = p058j0.C1061o.m3030k(r0, r3)     // Catch:{ all -> 0x00d5 }
            if (r0 != 0) goto L_0x00cf
            r1 = r2
        L_0x00cf:
            if (r5 == 0) goto L_0x00df
            r5.send(r1, r4)
            goto L_0x00df
        L_0x00d5:
            r14 = move-exception
            goto L_0x00d9
        L_0x00d7:
            r14 = move-exception
            r5 = r4
        L_0x00d9:
            if (r5 == 0) goto L_0x00de
            r5.send(r1, r4)
        L_0x00de:
            throw r14
        L_0x00df:
            if (r1 == 0) goto L_0x00e2
            return r2
        L_0x00e2:
            boolean r14 = super.performPrivateCommand(r14, r15)
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: p070l0.C1228c.performPrivateCommand(java.lang.String, android.os.Bundle):boolean");
    }
}
