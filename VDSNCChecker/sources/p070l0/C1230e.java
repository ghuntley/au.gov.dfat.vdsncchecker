package p070l0;

import android.content.ClipDescription;
import android.net.Uri;
import android.view.inputmethod.InputContentInfo;

/* renamed from: l0.e */
public final class C1230e {

    /* renamed from: a */
    public final C1233c f4154a;

    /* renamed from: l0.e$a */
    public static final class C1231a implements C1233c {

        /* renamed from: a */
        public final InputContentInfo f4155a;

        public C1231a(Uri uri, ClipDescription clipDescription, Uri uri2) {
            this.f4155a = new InputContentInfo(uri, clipDescription, uri2);
        }

        public C1231a(Object obj) {
            this.f4155a = (InputContentInfo) obj;
        }

        /* renamed from: a */
        public void mo4944a() {
            this.f4155a.requestPermission();
        }

        /* renamed from: b */
        public Uri mo4945b() {
            return this.f4155a.getLinkUri();
        }

        /* renamed from: c */
        public ClipDescription mo4946c() {
            return this.f4155a.getDescription();
        }

        /* renamed from: d */
        public Object mo4947d() {
            return this.f4155a;
        }

        /* renamed from: e */
        public Uri mo4948e() {
            return this.f4155a.getContentUri();
        }
    }

    /* renamed from: l0.e$b */
    public static final class C1232b implements C1233c {

        /* renamed from: a */
        public final Uri f4156a;

        /* renamed from: b */
        public final ClipDescription f4157b;

        /* renamed from: c */
        public final Uri f4158c;

        public C1232b(Uri uri, ClipDescription clipDescription, Uri uri2) {
            this.f4156a = uri;
            this.f4157b = clipDescription;
            this.f4158c = uri2;
        }

        /* renamed from: a */
        public void mo4944a() {
        }

        /* renamed from: b */
        public Uri mo4945b() {
            return this.f4158c;
        }

        /* renamed from: c */
        public ClipDescription mo4946c() {
            return this.f4157b;
        }

        /* renamed from: d */
        public Object mo4947d() {
            return null;
        }

        /* renamed from: e */
        public Uri mo4948e() {
            return this.f4156a;
        }
    }

    /* renamed from: l0.e$c */
    public interface C1233c {
        /* renamed from: a */
        void mo4944a();

        /* renamed from: b */
        Uri mo4945b();

        /* renamed from: c */
        ClipDescription mo4946c();

        /* renamed from: d */
        Object mo4947d();

        /* renamed from: e */
        Uri mo4948e();
    }

    public C1230e(C1233c cVar) {
        this.f4154a = cVar;
    }
}
