package android.support.p006v4.media;

import android.os.Bundle;
import android.os.Parcelable;
import android.support.p006v4.media.session.MediaSessionCompat;
import p009b.C0525b;

/* renamed from: android.support.v4.media.MediaBrowserCompat$ItemReceiver */
public class MediaBrowserCompat$ItemReceiver extends C0525b {
    /* renamed from: j */
    public void mo62j(int i, Bundle bundle) {
        MediaSessionCompat.m70a(bundle);
        if (i != 0 || bundle == null || !bundle.containsKey("media_item")) {
            throw null;
        }
        Parcelable parcelable = bundle.getParcelable("media_item");
        if (parcelable == null || (parcelable instanceof MediaBrowserCompat$MediaItem)) {
            MediaBrowserCompat$MediaItem mediaBrowserCompat$MediaItem = (MediaBrowserCompat$MediaItem) parcelable;
            throw null;
        }
        throw null;
    }
}
