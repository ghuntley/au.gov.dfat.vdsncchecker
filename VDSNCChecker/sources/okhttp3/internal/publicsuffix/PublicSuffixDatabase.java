package okhttp3.internal.publicsuffix;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;
import p025d3.C0802f;
import p042g2.C0955a;
import p067k3.C1209l;
import p072l2.C1241e;
import p126u2.C1850k;
import p126u2.C1852m;
import p130v0.C1964a;
import p144x3.C2129c;

public final class PublicSuffixDatabase {

    /* renamed from: e */
    public static final byte[] f4783e = {(byte) 42};

    /* renamed from: f */
    public static final List<String> f4784f = C0955a.m2747u("*");

    /* renamed from: g */
    public static final PublicSuffixDatabase f4785g = new PublicSuffixDatabase();

    /* renamed from: h */
    public static final C1544a f4786h = new C1544a((C0802f) null);

    /* renamed from: a */
    public final AtomicBoolean f4787a = new AtomicBoolean(false);

    /* renamed from: b */
    public final CountDownLatch f4788b = new CountDownLatch(1);

    /* renamed from: c */
    public byte[] f4789c;

    /* renamed from: d */
    public byte[] f4790d;

    /* renamed from: okhttp3.internal.publicsuffix.PublicSuffixDatabase$a */
    public static final class C1544a {
        public C1544a(C0802f fVar) {
        }

        /* renamed from: a */
        public static final String m4279a(C1544a aVar, byte[] bArr, byte[][] bArr2, int i) {
            int i2;
            boolean z;
            byte b;
            int i3;
            byte[] bArr3 = bArr;
            byte[][] bArr4 = bArr2;
            int length = bArr3.length;
            int i4 = 0;
            while (i4 < length) {
                int i5 = (i4 + length) / 2;
                while (i5 > -1 && bArr3[i5] != ((byte) 10)) {
                    i5--;
                }
                int i6 = i5 + 1;
                int i7 = 1;
                while (true) {
                    i2 = i6 + i7;
                    if (bArr3[i2] == ((byte) 10)) {
                        break;
                    }
                    i7++;
                }
                int i8 = i2 - i6;
                int i9 = i;
                boolean z2 = false;
                int i10 = 0;
                int i11 = 0;
                while (true) {
                    if (z2) {
                        b = 46;
                        z = false;
                    } else {
                        byte b2 = bArr4[i9][i10];
                        byte[] bArr5 = C2129c.f6169a;
                        byte b3 = b2 & 255;
                        z = z2;
                        b = b3;
                    }
                    byte b4 = bArr3[i6 + i11];
                    byte[] bArr6 = C2129c.f6169a;
                    i3 = b - (b4 & 255);
                    if (i3 == 0) {
                        i11++;
                        i10++;
                        if (i11 == i8) {
                            break;
                        } else if (bArr4[i9].length != i10) {
                            z2 = z;
                        } else if (i9 == bArr4.length - 1) {
                            break;
                        } else {
                            i9++;
                            i10 = -1;
                            z2 = true;
                        }
                    } else {
                        break;
                    }
                }
                if (i3 >= 0) {
                    if (i3 <= 0) {
                        int i12 = i8 - i11;
                        int length2 = bArr4[i9].length - i10;
                        int length3 = bArr4.length;
                        for (int i13 = i9 + 1; i13 < length3; i13++) {
                            length2 += bArr4[i13].length;
                        }
                        if (length2 >= i12) {
                            if (length2 <= i12) {
                                Charset charset = StandardCharsets.UTF_8;
                                C1241e.m3516f(charset, "UTF_8");
                                return new String(bArr3, i6, i8, charset);
                            }
                        }
                    }
                    i4 = i2 + 1;
                }
                length = i6 - 1;
            }
            return null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0033, code lost:
        if (r1 == false) goto L_0x0059;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0035, code lost:
        java.lang.Thread.currentThread().interrupt();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0023, code lost:
        if (r1 != false) goto L_0x0035;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:14:0x003d */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00ce  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00f0  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x0108  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x014a A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x014b  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String mo5493a(java.lang.String r14) {
        /*
            r13 = this;
            java.lang.String r0 = java.net.IDN.toUnicode(r14)
            java.lang.String r1 = "unicodeDomain"
            p072l2.C1241e.m3516f(r0, r1)
            java.util.List r0 = r13.mo5495c(r0)
            java.util.concurrent.atomic.AtomicBoolean r1 = r13.f4787a
            boolean r1 = r1.get()
            r2 = 0
            r3 = 1
            if (r1 != 0) goto L_0x004c
            java.util.concurrent.atomic.AtomicBoolean r1 = r13.f4787a
            boolean r1 = r1.compareAndSet(r2, r3)
            if (r1 == 0) goto L_0x004c
            r1 = r2
        L_0x0020:
            r13.mo5494b()     // Catch:{ InterruptedIOException -> 0x003d, IOException -> 0x0028 }
            if (r1 == 0) goto L_0x0059
            goto L_0x0035
        L_0x0026:
            r14 = move-exception
            goto L_0x0042
        L_0x0028:
            r4 = move-exception
            e4.e$a r5 = p032e4.C0879e.f3347c     // Catch:{ all -> 0x0026 }
            e4.e r5 = p032e4.C0879e.f3345a     // Catch:{ all -> 0x0026 }
            java.lang.String r6 = "Failed to read public suffix list"
            r7 = 5
            r5.mo4181i(r6, r7, r4)     // Catch:{ all -> 0x0026 }
            if (r1 == 0) goto L_0x0059
        L_0x0035:
            java.lang.Thread r1 = java.lang.Thread.currentThread()
            r1.interrupt()
            goto L_0x0059
        L_0x003d:
            java.lang.Thread.interrupted()     // Catch:{ all -> 0x0026 }
            r1 = r3
            goto L_0x0020
        L_0x0042:
            if (r1 == 0) goto L_0x004b
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            r0.interrupt()
        L_0x004b:
            throw r14
        L_0x004c:
            java.util.concurrent.CountDownLatch r1 = r13.f4788b     // Catch:{ InterruptedException -> 0x0052 }
            r1.await()     // Catch:{ InterruptedException -> 0x0052 }
            goto L_0x0059
        L_0x0052:
            java.lang.Thread r1 = java.lang.Thread.currentThread()
            r1.interrupt()
        L_0x0059:
            byte[] r1 = r13.f4789c
            if (r1 == 0) goto L_0x005f
            r1 = r3
            goto L_0x0060
        L_0x005f:
            r1 = r2
        L_0x0060:
            if (r1 == 0) goto L_0x01cf
            int r1 = r0.size()
            byte[][] r4 = new byte[r1][]
            r5 = r2
        L_0x0069:
            if (r5 >= r1) goto L_0x008b
            java.lang.Object r6 = r0.get(r5)
            java.lang.String r6 = (java.lang.String) r6
            java.nio.charset.Charset r7 = java.nio.charset.StandardCharsets.UTF_8
            java.lang.String r8 = "UTF_8"
            p072l2.C1241e.m3516f(r7, r8)
            java.lang.String r8 = "null cannot be cast to non-null type java.lang.String"
            java.util.Objects.requireNonNull(r6, r8)
            byte[] r6 = r6.getBytes(r7)
            java.lang.String r7 = "(this as java.lang.String).getBytes(charset)"
            p072l2.C1241e.m3516f(r6, r7)
            r4[r5] = r6
            int r5 = r5 + 1
            goto L_0x0069
        L_0x008b:
            r5 = r2
        L_0x008c:
            java.lang.String r6 = "publicSuffixListBytes"
            r7 = 0
            if (r5 >= r1) goto L_0x00a5
            okhttp3.internal.publicsuffix.PublicSuffixDatabase$a r8 = f4786h
            byte[] r9 = r13.f4789c
            if (r9 == 0) goto L_0x00a1
            java.lang.String r8 = okhttp3.internal.publicsuffix.PublicSuffixDatabase.C1544a.m4279a(r8, r9, r4, r5)
            if (r8 == 0) goto L_0x009e
            goto L_0x00a6
        L_0x009e:
            int r5 = r5 + 1
            goto L_0x008c
        L_0x00a1:
            p072l2.C1241e.m3524r(r6)
            throw r7
        L_0x00a5:
            r8 = r7
        L_0x00a6:
            if (r1 <= r3) goto L_0x00cb
            java.lang.Object r5 = r4.clone()
            byte[][] r5 = (byte[][]) r5
            int r9 = r5.length
            int r9 = r9 - r3
            r10 = r2
        L_0x00b1:
            if (r10 >= r9) goto L_0x00cb
            byte[] r11 = f4783e
            r5[r10] = r11
            okhttp3.internal.publicsuffix.PublicSuffixDatabase$a r11 = f4786h
            byte[] r12 = r13.f4789c
            if (r12 == 0) goto L_0x00c7
            java.lang.String r11 = okhttp3.internal.publicsuffix.PublicSuffixDatabase.C1544a.m4279a(r11, r12, r5, r10)
            if (r11 == 0) goto L_0x00c4
            goto L_0x00cc
        L_0x00c4:
            int r10 = r10 + 1
            goto L_0x00b1
        L_0x00c7:
            p072l2.C1241e.m3524r(r6)
            throw r7
        L_0x00cb:
            r11 = r7
        L_0x00cc:
            if (r11 == 0) goto L_0x00e8
            int r1 = r1 - r3
            r5 = r2
        L_0x00d0:
            if (r5 >= r1) goto L_0x00e8
            okhttp3.internal.publicsuffix.PublicSuffixDatabase$a r6 = f4786h
            byte[] r9 = r13.f4790d
            if (r9 == 0) goto L_0x00e2
            java.lang.String r6 = okhttp3.internal.publicsuffix.PublicSuffixDatabase.C1544a.m4279a(r6, r9, r4, r5)
            if (r6 == 0) goto L_0x00df
            goto L_0x00e9
        L_0x00df:
            int r5 = r5 + 1
            goto L_0x00d0
        L_0x00e2:
            java.lang.String r14 = "publicSuffixExceptionListBytes"
            p072l2.C1241e.m3524r(r14)
            throw r7
        L_0x00e8:
            r6 = r7
        L_0x00e9:
            r1 = 6
            r4 = 46
            r5 = 33
            if (r6 == 0) goto L_0x0108
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            r8.append(r5)
            r8.append(r6)
            java.lang.String r6 = r8.toString()
            char[] r8 = new char[r3]
            r8[r2] = r4
            java.util.List r1 = p067k3.C1209l.m3451f0(r6, r8, r2, r2, r1)
            goto L_0x0134
        L_0x0108:
            if (r8 != 0) goto L_0x010f
            if (r11 != 0) goto L_0x010f
            java.util.List<java.lang.String> r1 = f4784f
            goto L_0x0134
        L_0x010f:
            if (r8 == 0) goto L_0x011a
            char[] r6 = new char[r3]
            r6[r2] = r4
            java.util.List r6 = p067k3.C1209l.m3451f0(r8, r6, r2, r2, r1)
            goto L_0x011c
        L_0x011a:
            u2.m r6 = p126u2.C1852m.f5542e
        L_0x011c:
            if (r11 == 0) goto L_0x0127
            char[] r8 = new char[r3]
            r8[r2] = r4
            java.util.List r1 = p067k3.C1209l.m3451f0(r11, r8, r2, r2, r1)
            goto L_0x0129
        L_0x0127:
            u2.m r1 = p126u2.C1852m.f5542e
        L_0x0129:
            int r4 = r6.size()
            int r8 = r1.size()
            if (r4 <= r8) goto L_0x0134
            r1 = r6
        L_0x0134:
            int r4 = r0.size()
            int r6 = r1.size()
            if (r4 != r6) goto L_0x014b
            java.lang.Object r4 = r1.get(r2)
            java.lang.String r4 = (java.lang.String) r4
            char r4 = r4.charAt(r2)
            if (r4 == r5) goto L_0x014b
            return r7
        L_0x014b:
            java.lang.Object r4 = r1.get(r2)
            java.lang.String r4 = (java.lang.String) r4
            char r4 = r4.charAt(r2)
            int r0 = r0.size()
            int r1 = r1.size()
            if (r4 != r5) goto L_0x0160
            goto L_0x0162
        L_0x0160:
            int r1 = r1 + 1
        L_0x0162:
            int r0 = r0 - r1
            java.util.List r14 = r13.mo5495c(r14)
            u2.j r1 = new u2.j
            r1.<init>(r14)
            if (r0 < 0) goto L_0x0170
            r14 = r3
            goto L_0x0171
        L_0x0170:
            r14 = r2
        L_0x0171:
            if (r14 == 0) goto L_0x01bd
            if (r0 != 0) goto L_0x0176
            goto L_0x0187
        L_0x0176:
            boolean r14 = r1 instanceof p061j3.C1095c
            if (r14 == 0) goto L_0x0181
            j3.c r1 = (p061j3.C1095c) r1
            j3.d r1 = r1.mo4589a(r0)
            goto L_0x0187
        L_0x0181:
            j3.b r14 = new j3.b
            r14.<init>(r1, r0)
            r1 = r14
        L_0x0187:
            java.lang.String r14 = ""
            java.lang.String r0 = "$this$joinToString"
            p072l2.C1241e.m3517j(r1, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r14)
            java.util.Iterator r1 = r1.iterator()
        L_0x019a:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L_0x01b0
            java.lang.Object r4 = r1.next()
            int r2 = r2 + r3
            if (r2 <= r3) goto L_0x01ac
            java.lang.String r5 = "."
            r0.append(r5)
        L_0x01ac:
            p042g2.C0955a.m2728b(r0, r4, r7)
            goto L_0x019a
        L_0x01b0:
            r0.append(r14)
            java.lang.String r14 = r0.toString()
            java.lang.String r0 = "joinTo(StringBuilder(), …ed, transform).toString()"
            p072l2.C1241e.m3516f(r14, r0)
            return r14
        L_0x01bd:
            java.lang.String r14 = "Requested element count "
            java.lang.String r1 = " is less than zero."
            java.lang.String r14 = p130v0.C1964a.m5271a(r14, r0, r1)
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r14 = r14.toString()
            r0.<init>(r14)
            throw r0
        L_0x01cf:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r0 = "Unable to load publicsuffixes.gz resource from the classpath."
            java.lang.String r0 = r0.toString()
            r14.<init>(r0)
            throw r14
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.publicsuffix.PublicSuffixDatabase.mo5493a(java.lang.String):java.lang.String");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0051, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0052, code lost:
        p042g2.C0955a.m2730d(r0, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0055, code lost:
        throw r2;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo5494b() {
        /*
            r5 = this;
            java.lang.Class<okhttp3.internal.publicsuffix.PublicSuffixDatabase> r0 = okhttp3.internal.publicsuffix.PublicSuffixDatabase.class
            java.lang.String r1 = "publicsuffixes.gz"
            java.io.InputStream r0 = r0.getResourceAsStream(r1)
            if (r0 == 0) goto L_0x0056
            j4.m r1 = new j4.m
            java.util.logging.Logger r2 = p062j4.C1123p.f3908a
            java.lang.String r2 = "$this$source"
            p072l2.C1241e.m3517j(r0, r2)
            j4.o r2 = new j4.o
            j4.a0 r3 = new j4.a0
            r3.<init>()
            r2.<init>(r0, r3)
            r1.<init>(r2)
            j4.h r0 = p062j4.C1106b.m3134d(r1)
            r1 = 0
            int r2 = r0.mo4662w()     // Catch:{ all -> 0x004f }
            long r2 = (long) r2     // Catch:{ all -> 0x004f }
            byte[] r2 = r0.mo4623M(r2)     // Catch:{ all -> 0x004f }
            int r3 = r0.mo4662w()     // Catch:{ all -> 0x004f }
            long r3 = (long) r3     // Catch:{ all -> 0x004f }
            byte[] r3 = r0.mo4623M(r3)     // Catch:{ all -> 0x004f }
            p042g2.C0955a.m2730d(r0, r1)
            monitor-enter(r5)
            p072l2.C1241e.m3515e(r2)     // Catch:{ all -> 0x004c }
            r5.f4789c = r2     // Catch:{ all -> 0x004c }
            p072l2.C1241e.m3515e(r3)     // Catch:{ all -> 0x004c }
            r5.f4790d = r3     // Catch:{ all -> 0x004c }
            monitor-exit(r5)
            java.util.concurrent.CountDownLatch r0 = r5.f4788b
            r0.countDown()
            return
        L_0x004c:
            r0 = move-exception
            monitor-exit(r5)
            throw r0
        L_0x004f:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0051 }
        L_0x0051:
            r2 = move-exception
            p042g2.C0955a.m2730d(r0, r1)
            throw r2
        L_0x0056:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.publicsuffix.PublicSuffixDatabase.mo5494b():void");
    }

    /* renamed from: c */
    public final List<String> mo5495c(String str) {
        int i = 0;
        List<String> f0 = C1209l.m3451f0(str, new char[]{'.'}, false, 0, 6);
        if (!C1241e.m3513b((String) C1850k.m5052N(f0), "")) {
            return f0;
        }
        int size = f0.size() - 1;
        if (size < 0) {
            size = 0;
        }
        if (!(size >= 0)) {
            throw new IllegalArgumentException(C1964a.m5271a("Requested element count ", size, " is less than zero.").toString());
        } else if (size == 0) {
            return C1852m.f5542e;
        } else {
            if (size >= f0.size()) {
                return C1850k.m5054P(f0);
            }
            if (size == 1) {
                return C0955a.m2747u(C1850k.m5049K(f0));
            }
            ArrayList arrayList = new ArrayList(size);
            Iterator<T> it = f0.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next());
                i++;
                if (i == size) {
                    break;
                }
            }
            return C0955a.m2751y(arrayList);
        }
    }
}
