package androidx.appcompat.widget;

import android.app.Activity;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Editable;
import android.text.Selection;
import android.text.Spannable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.DragEvent;
import android.view.View;
import android.view.textclassifier.TextClassifier;
import android.widget.EditText;
import java.util.WeakHashMap;
import p007au.gov.dfat.vdsncchecker.R;
import p058j0.C1047c;
import p058j0.C1059m;
import p058j0.C1061o;
import p058j0.C1070q;
import p076m0.C1423d;
import p076m0.C1425e;

/* renamed from: androidx.appcompat.widget.l */
public class C0179l extends EditText implements C1059m {

    /* renamed from: e */
    public final C0157f f832e;

    /* renamed from: f */
    public final C0134b0 f833f;

    /* renamed from: g */
    public final C0231z f834g;

    /* renamed from: h */
    public final C1425e f835h;

    public C0179l(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.editTextStyle);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C0179l(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C0230y0.m607a(context);
        C0216w0.m569a(this, getContext());
        C0157f fVar = new C0157f(this);
        this.f832e = fVar;
        fVar.mo886d(attributeSet, i);
        C0134b0 b0Var = new C0134b0(this);
        this.f833f = b0Var;
        b0Var.mo750e(attributeSet, i);
        b0Var.mo748b();
        this.f834g = new C0231z(this);
        this.f835h = new C1425e();
    }

    /* renamed from: a */
    public C1047c mo986a(C1047c cVar) {
        return this.f835h.mo4536a(this, cVar);
    }

    public void drawableStateChanged() {
        super.drawableStateChanged();
        C0157f fVar = this.f832e;
        if (fVar != null) {
            fVar.mo883a();
        }
        C0134b0 b0Var = this.f833f;
        if (b0Var != null) {
            b0Var.mo748b();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0157f fVar = this.f832e;
        if (fVar != null) {
            return fVar.mo884b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0157f fVar = this.f832e;
        if (fVar != null) {
            return fVar.mo885c();
        }
        return null;
    }

    public Editable getText() {
        return Build.VERSION.SDK_INT >= 28 ? super.getText() : super.getEditableText();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
        r0 = r2.f834g;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.textclassifier.TextClassifier getTextClassifier() {
        /*
            r2 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r0 >= r1) goto L_0x0010
            androidx.appcompat.widget.z r0 = r2.f834g
            if (r0 != 0) goto L_0x000b
            goto L_0x0010
        L_0x000b:
            android.view.textclassifier.TextClassifier r0 = r0.mo1235b()
            return r0
        L_0x0010:
            android.view.textclassifier.TextClassifier r0 = super.getTextClassifier()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.C0179l.getTextClassifier():android.view.textclassifier.TextClassifier");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0050, code lost:
        if (r8 != null) goto L_0x006b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0066, code lost:
        if (r8 != null) goto L_0x006b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.inputmethod.InputConnection onCreateInputConnection(android.view.inputmethod.EditorInfo r8) {
        /*
            r7 = this;
            android.view.inputmethod.InputConnection r0 = super.onCreateInputConnection(r8)
            androidx.appcompat.widget.b0 r1 = r7.f833f
            r1.mo752g(r7, r0, r8)
            p039g.C0933a.m2712f(r0, r8, r7)
            java.util.WeakHashMap<android.view.View, j0.q> r1 = p058j0.C1061o.f3808a
            r1 = 2131296720(0x7f0901d0, float:1.8211365E38)
            java.lang.Object r1 = r7.getTag(r1)
            java.lang.String[] r1 = (java.lang.String[]) r1
            if (r0 == 0) goto L_0x0075
            if (r1 == 0) goto L_0x0075
            int r2 = android.os.Build.VERSION.SDK_INT
            java.lang.String r3 = "android.support.v13.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES"
            java.lang.String r4 = "androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES"
            r5 = 25
            if (r2 < r5) goto L_0x0028
            r8.contentMimeTypes = r1
            goto L_0x003d
        L_0x0028:
            android.os.Bundle r6 = r8.extras
            if (r6 != 0) goto L_0x0033
            android.os.Bundle r6 = new android.os.Bundle
            r6.<init>()
            r8.extras = r6
        L_0x0033:
            android.os.Bundle r6 = r8.extras
            r6.putStringArray(r4, r1)
            android.os.Bundle r6 = r8.extras
            r6.putStringArray(r3, r1)
        L_0x003d:
            androidx.appcompat.widget.u r1 = new androidx.appcompat.widget.u
            r1.<init>(r7)
            r6 = 0
            if (r2 < r5) goto L_0x004c
            l0.b r8 = new l0.b
            r8.<init>(r0, r6, r1)
        L_0x004a:
            r0 = r8
            goto L_0x0075
        L_0x004c:
            if (r2 < r5) goto L_0x0053
            java.lang.String[] r8 = r8.contentMimeTypes
            if (r8 == 0) goto L_0x0069
            goto L_0x006b
        L_0x0053:
            android.os.Bundle r2 = r8.extras
            if (r2 != 0) goto L_0x0058
            goto L_0x0069
        L_0x0058:
            java.lang.String[] r2 = r2.getStringArray(r4)
            if (r2 != 0) goto L_0x0065
            android.os.Bundle r8 = r8.extras
            java.lang.String[] r8 = r8.getStringArray(r3)
            goto L_0x0066
        L_0x0065:
            r8 = r2
        L_0x0066:
            if (r8 == 0) goto L_0x0069
            goto L_0x006b
        L_0x0069:
            java.lang.String[] r8 = p070l0.C1226a.f4151a
        L_0x006b:
            int r8 = r8.length
            if (r8 != 0) goto L_0x006f
            goto L_0x0075
        L_0x006f:
            l0.c r8 = new l0.c
            r8.<init>(r0, r6, r1)
            goto L_0x004a
        L_0x0075:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.C0179l.onCreateInputConnection(android.view.inputmethod.EditorInfo):android.view.inputmethod.InputConnection");
    }

    /* JADX INFO: finally extract failed */
    public boolean onDragEvent(DragEvent dragEvent) {
        Activity activity;
        boolean z = false;
        if (dragEvent.getLocalState() == null) {
            WeakHashMap<View, C1070q> weakHashMap = C1061o.f3808a;
            if (((String[]) getTag(R.id.tag_on_receive_content_mime_types)) != null) {
                Context context = getContext();
                while (true) {
                    if (!(context instanceof ContextWrapper)) {
                        activity = null;
                        break;
                    } else if (context instanceof Activity) {
                        activity = (Activity) context;
                        break;
                    } else {
                        context = ((ContextWrapper) context).getBaseContext();
                    }
                }
                if (activity == null) {
                    toString();
                } else if (dragEvent.getAction() != 1 && dragEvent.getAction() == 3) {
                    activity.requestDragAndDropPermissions(dragEvent);
                    int offsetForPosition = getOffsetForPosition(dragEvent.getX(), dragEvent.getY());
                    beginBatchEdit();
                    try {
                        Selection.setSelection((Spannable) getText(), offsetForPosition);
                        C1061o.m3030k(this, new C1047c(new C1047c.C1048a(dragEvent.getClipData(), 3)));
                        endBatchEdit();
                        z = true;
                    } catch (Throwable th) {
                        endBatchEdit();
                        throw th;
                    }
                }
            }
        }
        if (z) {
            return true;
        }
        return super.onDragEvent(dragEvent);
    }

    public boolean onTextContextMenuItem(int i) {
        int i2 = 0;
        if (i == 16908322 || i == 16908337) {
            WeakHashMap<View, C1070q> weakHashMap = C1061o.f3808a;
            if (((String[]) getTag(R.id.tag_on_receive_content_mime_types)) != null) {
                ClipboardManager clipboardManager = (ClipboardManager) getContext().getSystemService("clipboard");
                ClipData primaryClip = clipboardManager == null ? null : clipboardManager.getPrimaryClip();
                if (primaryClip != null && primaryClip.getItemCount() > 0) {
                    C1047c.C1048a aVar = new C1047c.C1048a(primaryClip, 1);
                    if (i != 16908322) {
                        i2 = 1;
                    }
                    aVar.f3790c = i2;
                    C1061o.m3030k(this, new C1047c(aVar));
                }
                i2 = 1;
            }
        }
        if (i2 != 0) {
            return true;
        }
        return super.onTextContextMenuItem(i);
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0157f fVar = this.f832e;
        if (fVar != null) {
            fVar.mo887e();
        }
    }

    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C0157f fVar = this.f832e;
        if (fVar != null) {
            fVar.mo888f(i);
        }
    }

    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(C1423d.m4086f(this, callback));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0157f fVar = this.f832e;
        if (fVar != null) {
            fVar.mo890h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0157f fVar = this.f832e;
        if (fVar != null) {
            fVar.mo891i(mode);
        }
    }

    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        C0134b0 b0Var = this.f833f;
        if (b0Var != null) {
            b0Var.mo751f(context, i);
        }
    }

    public void setTextClassifier(TextClassifier textClassifier) {
        C0231z zVar;
        if (Build.VERSION.SDK_INT >= 28 || (zVar = this.f834g) == null) {
            super.setTextClassifier(textClassifier);
        } else {
            zVar.f1003b = textClassifier;
        }
    }
}
