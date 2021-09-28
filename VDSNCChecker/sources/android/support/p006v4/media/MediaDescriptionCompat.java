package android.support.p006v4.media;

import android.graphics.Bitmap;
import android.media.MediaDescription;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: android.support.v4.media.MediaDescriptionCompat */
public final class MediaDescriptionCompat implements Parcelable {
    public static final Parcelable.Creator<MediaDescriptionCompat> CREATOR = new C0031a();

    /* renamed from: e */
    public final String f105e;

    /* renamed from: f */
    public final CharSequence f106f;

    /* renamed from: g */
    public final CharSequence f107g;

    /* renamed from: h */
    public final CharSequence f108h;

    /* renamed from: i */
    public final Bitmap f109i;

    /* renamed from: j */
    public final Uri f110j;

    /* renamed from: k */
    public final Bundle f111k;

    /* renamed from: l */
    public final Uri f112l;

    /* renamed from: m */
    public Object f113m;

    /* renamed from: android.support.v4.media.MediaDescriptionCompat$a */
    public static class C0031a implements Parcelable.Creator<MediaDescriptionCompat> {
        public Object createFromParcel(Parcel parcel) {
            return MediaDescriptionCompat.m69j(MediaDescription.CREATOR.createFromParcel(parcel));
        }

        public Object[] newArray(int i) {
            return new MediaDescriptionCompat[i];
        }
    }

    public MediaDescriptionCompat(String str, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, Bitmap bitmap, Uri uri, Bundle bundle, Uri uri2) {
        this.f105e = str;
        this.f106f = charSequence;
        this.f107g = charSequence2;
        this.f108h = charSequence3;
        this.f109i = bitmap;
        this.f110j = uri;
        this.f111k = bundle;
        this.f112l = uri2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x004e  */
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.support.p006v4.media.MediaDescriptionCompat m69j(java.lang.Object r14) {
        /*
            r0 = 0
            if (r14 == 0) goto L_0x005b
            r1 = r14
            android.media.MediaDescription r1 = (android.media.MediaDescription) r1
            java.lang.String r3 = r1.getMediaId()
            java.lang.CharSequence r4 = r1.getTitle()
            java.lang.CharSequence r5 = r1.getSubtitle()
            java.lang.CharSequence r6 = r1.getDescription()
            android.graphics.Bitmap r7 = r1.getIconBitmap()
            android.net.Uri r8 = r1.getIconUri()
            android.os.Bundle r2 = r1.getExtras()
            java.lang.String r9 = "android.support.v4.media.description.MEDIA_URI"
            if (r2 == 0) goto L_0x0030
            android.support.p006v4.media.session.MediaSessionCompat.m70a(r2)
            android.os.Parcelable r10 = r2.getParcelable(r9)
            android.net.Uri r10 = (android.net.Uri) r10
            goto L_0x0031
        L_0x0030:
            r10 = r0
        L_0x0031:
            if (r10 == 0) goto L_0x004a
            java.lang.String r11 = "android.support.v4.media.description.NULL_BUNDLE_FLAG"
            boolean r12 = r2.containsKey(r11)
            if (r12 == 0) goto L_0x0044
            int r12 = r2.size()
            r13 = 2
            if (r12 != r13) goto L_0x0044
            r9 = r0
            goto L_0x004b
        L_0x0044:
            r2.remove(r9)
            r2.remove(r11)
        L_0x004a:
            r9 = r2
        L_0x004b:
            if (r10 == 0) goto L_0x004e
            goto L_0x0053
        L_0x004e:
            android.net.Uri r0 = r1.getMediaUri()
            r10 = r0
        L_0x0053:
            android.support.v4.media.MediaDescriptionCompat r0 = new android.support.v4.media.MediaDescriptionCompat
            r2 = r0
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10)
            r0.f113m = r14
        L_0x005b:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p006v4.media.MediaDescriptionCompat.m69j(java.lang.Object):android.support.v4.media.MediaDescriptionCompat");
    }

    public int describeContents() {
        return 0;
    }

    public String toString() {
        return this.f106f + ", " + this.f107g + ", " + this.f108h;
    }

    public void writeToParcel(Parcel parcel, int i) {
        Object obj = this.f113m;
        if (obj == null) {
            MediaDescription.Builder builder = new MediaDescription.Builder();
            builder.setMediaId(this.f105e);
            builder.setTitle(this.f106f);
            builder.setSubtitle(this.f107g);
            builder.setDescription(this.f108h);
            builder.setIconBitmap(this.f109i);
            builder.setIconUri(this.f110j);
            builder.setExtras(this.f111k);
            builder.setMediaUri(this.f112l);
            obj = builder.build();
            this.f113m = obj;
        }
        ((MediaDescription) obj).writeToParcel(parcel, i);
    }
}
