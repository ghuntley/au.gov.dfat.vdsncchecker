package com.google.android.material.internal;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.widget.Checkable;
import android.widget.ImageButton;
import androidx.appcompat.widget.C0183m;
import p007au.gov.dfat.vdsncchecker.R;
import p036f2.C0889a;
import p058j0.C1061o;
import p088o0.C1491a;

public class CheckableImageButton extends C0183m implements Checkable {

    /* renamed from: j */
    public static final int[] f2868j = {16842912};

    /* renamed from: g */
    public boolean f2869g;

    /* renamed from: h */
    public boolean f2870h = true;

    /* renamed from: i */
    public boolean f2871i = true;

    /* renamed from: com.google.android.material.internal.CheckableImageButton$a */
    public static class C0743a extends C1491a {
        public static final Parcelable.Creator<C0743a> CREATOR = new C0744a();

        /* renamed from: g */
        public boolean f2872g;

        /* renamed from: com.google.android.material.internal.CheckableImageButton$a$a */
        public static class C0744a implements Parcelable.ClassLoaderCreator<C0743a> {
            public Object createFromParcel(Parcel parcel) {
                return new C0743a(parcel, (ClassLoader) null);
            }

            public Object[] newArray(int i) {
                return new C0743a[i];
            }

            public Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new C0743a(parcel, classLoader);
            }
        }

        public C0743a(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f2872g = parcel.readInt() != 1 ? false : true;
        }

        public C0743a(Parcelable parcelable) {
            super(parcelable);
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeParcelable(this.f4651e, i);
            parcel.writeInt(this.f2872g ? 1 : 0);
        }
    }

    public CheckableImageButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.imageButtonStyle);
        C1061o.m3034o(this, new C0889a(this));
    }

    public boolean isChecked() {
        return this.f2869g;
    }

    public int[] onCreateDrawableState(int i) {
        if (!this.f2869g) {
            return super.onCreateDrawableState(i);
        }
        int[] iArr = f2868j;
        return ImageButton.mergeDrawableStates(super.onCreateDrawableState(i + iArr.length), iArr);
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof C0743a)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C0743a aVar = (C0743a) parcelable;
        super.onRestoreInstanceState(aVar.f4651e);
        setChecked(aVar.f2872g);
    }

    public Parcelable onSaveInstanceState() {
        C0743a aVar = new C0743a(super.onSaveInstanceState());
        aVar.f2872g = this.f2869g;
        return aVar;
    }

    public void setCheckable(boolean z) {
        if (this.f2870h != z) {
            this.f2870h = z;
            sendAccessibilityEvent(0);
        }
    }

    public void setChecked(boolean z) {
        if (this.f2870h && this.f2869g != z) {
            this.f2869g = z;
            refreshDrawableState();
            sendAccessibilityEvent(2048);
        }
    }

    public void setPressable(boolean z) {
        this.f2871i = z;
    }

    public void setPressed(boolean z) {
        if (this.f2871i) {
            super.setPressed(z);
        }
    }

    public void toggle() {
        setChecked(!this.f2869g);
    }
}
