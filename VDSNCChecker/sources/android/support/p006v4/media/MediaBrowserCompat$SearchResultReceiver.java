package android.support.p006v4.media;

import android.os.Bundle;
import android.os.Parcelable;
import android.support.p006v4.media.session.MediaSessionCompat;
import java.util.ArrayList;
import p009b.C0525b;

/* renamed from: android.support.v4.media.MediaBrowserCompat$SearchResultReceiver */
public class MediaBrowserCompat$SearchResultReceiver extends C0525b {
    /* renamed from: j */
    public void mo62j(int i, Bundle bundle) {
        MediaSessionCompat.m70a(bundle);
        if (i != 0 || bundle == null || !bundle.containsKey("search_results")) {
            throw null;
        }
        Parcelable[] parcelableArray = bundle.getParcelableArray("search_results");
        if (parcelableArray != null) {
            ArrayList arrayList = new ArrayList();
            for (Parcelable parcelable : parcelableArray) {
                arrayList.add((MediaBrowserCompat$MediaItem) parcelable);
            }
        }
        throw null;
    }
}
