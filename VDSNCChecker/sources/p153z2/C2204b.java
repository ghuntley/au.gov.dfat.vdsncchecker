package p153z2;

/* renamed from: z2.b */
public final class C2204b {

    /* renamed from: a */
    public static final C2202a f6332a;

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v6, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v4, resolved type: z2.a} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0054  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00d5  */
    static {
        /*
            java.lang.Class<z2.a> r0 = p153z2.C2202a.class
            java.lang.String r1 = "java.specification.version"
            java.lang.String r1 = java.lang.System.getProperty(r1)
            if (r1 == 0) goto L_0x0044
            r2 = 6
            r3 = 46
            r4 = 0
            int r2 = p067k3.C1209l.m3444Y(r1, r3, r4, r4, r2)
            r5 = 65536(0x10000, float:9.18355E-41)
            if (r2 >= 0) goto L_0x001c
            int r1 = java.lang.Integer.parseInt(r1)     // Catch:{ NumberFormatException -> 0x0044 }
            int r1 = r1 * r5
            goto L_0x0047
        L_0x001c:
            int r6 = r2 + 1
            r7 = 4
            int r3 = p067k3.C1209l.m3444Y(r1, r3, r6, r4, r7)
            if (r3 >= 0) goto L_0x0029
            int r3 = r1.length()
        L_0x0029:
            java.lang.String r2 = r1.substring(r4, r2)
            java.lang.String r4 = "(this as java.lang.Strin…ing(startIndex, endIndex)"
            p072l2.C1241e.m3516f(r2, r4)
            java.lang.String r1 = r1.substring(r6, r3)
            p072l2.C1241e.m3516f(r1, r4)
            int r2 = java.lang.Integer.parseInt(r2)     // Catch:{ NumberFormatException -> 0x0044 }
            int r2 = r2 * r5
            int r1 = java.lang.Integer.parseInt(r1)     // Catch:{ NumberFormatException -> 0x0044 }
            int r1 = r1 + r2
            goto L_0x0047
        L_0x0044:
            r1 = 65542(0x10006, float:9.1844E-41)
        L_0x0047:
            r2 = 65544(0x10008, float:9.1847E-41)
            java.lang.String r3 = "ClassCastException(\"Inst…baseTypeCL\").initCause(e)"
            java.lang.String r4 = ", base type classloader: "
            java.lang.String r5 = "Instance classloader: "
            java.lang.String r6 = "Class.forName(\"kotlin.in…entations\").newInstance()"
            if (r1 < r2) goto L_0x00d0
            java.lang.Class<b3.a> r2 = p013b3.C0540a.class
            java.lang.Object r2 = r2.newInstance()     // Catch:{ ClassNotFoundException -> 0x0090 }
            p072l2.C1241e.m3516f(r2, r6)     // Catch:{ ClassNotFoundException -> 0x0090 }
            z2.a r2 = (p153z2.C2202a) r2     // Catch:{ ClassCastException -> 0x0061 }
            goto L_0x0156
        L_0x0061:
            r7 = move-exception
            java.lang.Class r2 = r2.getClass()     // Catch:{ ClassNotFoundException -> 0x0090 }
            java.lang.ClassLoader r2 = r2.getClassLoader()     // Catch:{ ClassNotFoundException -> 0x0090 }
            java.lang.ClassLoader r8 = r0.getClassLoader()     // Catch:{ ClassNotFoundException -> 0x0090 }
            java.lang.ClassCastException r9 = new java.lang.ClassCastException     // Catch:{ ClassNotFoundException -> 0x0090 }
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ ClassNotFoundException -> 0x0090 }
            r10.<init>()     // Catch:{ ClassNotFoundException -> 0x0090 }
            r10.append(r5)     // Catch:{ ClassNotFoundException -> 0x0090 }
            r10.append(r2)     // Catch:{ ClassNotFoundException -> 0x0090 }
            r10.append(r4)     // Catch:{ ClassNotFoundException -> 0x0090 }
            r10.append(r8)     // Catch:{ ClassNotFoundException -> 0x0090 }
            java.lang.String r2 = r10.toString()     // Catch:{ ClassNotFoundException -> 0x0090 }
            r9.<init>(r2)     // Catch:{ ClassNotFoundException -> 0x0090 }
            java.lang.Throwable r2 = r9.initCause(r7)     // Catch:{ ClassNotFoundException -> 0x0090 }
            p072l2.C1241e.m3516f(r2, r3)     // Catch:{ ClassNotFoundException -> 0x0090 }
            throw r2     // Catch:{ ClassNotFoundException -> 0x0090 }
        L_0x0090:
            java.lang.String r2 = "kotlin.internal.JRE8PlatformImplementations"
            java.lang.Class r2 = java.lang.Class.forName(r2)     // Catch:{ ClassNotFoundException -> 0x00d0 }
            java.lang.Object r2 = r2.newInstance()     // Catch:{ ClassNotFoundException -> 0x00d0 }
            p072l2.C1241e.m3516f(r2, r6)     // Catch:{ ClassNotFoundException -> 0x00d0 }
            z2.a r2 = (p153z2.C2202a) r2     // Catch:{ ClassCastException -> 0x00a1 }
            goto L_0x0156
        L_0x00a1:
            r7 = move-exception
            java.lang.Class r2 = r2.getClass()     // Catch:{ ClassNotFoundException -> 0x00d0 }
            java.lang.ClassLoader r2 = r2.getClassLoader()     // Catch:{ ClassNotFoundException -> 0x00d0 }
            java.lang.ClassLoader r8 = r0.getClassLoader()     // Catch:{ ClassNotFoundException -> 0x00d0 }
            java.lang.ClassCastException r9 = new java.lang.ClassCastException     // Catch:{ ClassNotFoundException -> 0x00d0 }
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ ClassNotFoundException -> 0x00d0 }
            r10.<init>()     // Catch:{ ClassNotFoundException -> 0x00d0 }
            r10.append(r5)     // Catch:{ ClassNotFoundException -> 0x00d0 }
            r10.append(r2)     // Catch:{ ClassNotFoundException -> 0x00d0 }
            r10.append(r4)     // Catch:{ ClassNotFoundException -> 0x00d0 }
            r10.append(r8)     // Catch:{ ClassNotFoundException -> 0x00d0 }
            java.lang.String r2 = r10.toString()     // Catch:{ ClassNotFoundException -> 0x00d0 }
            r9.<init>(r2)     // Catch:{ ClassNotFoundException -> 0x00d0 }
            java.lang.Throwable r2 = r9.initCause(r7)     // Catch:{ ClassNotFoundException -> 0x00d0 }
            p072l2.C1241e.m3516f(r2, r3)     // Catch:{ ClassNotFoundException -> 0x00d0 }
            throw r2     // Catch:{ ClassNotFoundException -> 0x00d0 }
        L_0x00d0:
            r2 = 65543(0x10007, float:9.1845E-41)
            if (r1 < r2) goto L_0x0151
            java.lang.Class<a3.a> r1 = p004a3.C0010a.class
            java.lang.Object r1 = r1.newInstance()     // Catch:{ ClassNotFoundException -> 0x0111 }
            p072l2.C1241e.m3516f(r1, r6)     // Catch:{ ClassNotFoundException -> 0x0111 }
            r2 = r1
            z2.a r2 = (p153z2.C2202a) r2     // Catch:{ ClassCastException -> 0x00e2 }
            goto L_0x0156
        L_0x00e2:
            r2 = move-exception
            java.lang.Class r1 = r1.getClass()     // Catch:{ ClassNotFoundException -> 0x0111 }
            java.lang.ClassLoader r1 = r1.getClassLoader()     // Catch:{ ClassNotFoundException -> 0x0111 }
            java.lang.ClassLoader r7 = r0.getClassLoader()     // Catch:{ ClassNotFoundException -> 0x0111 }
            java.lang.ClassCastException r8 = new java.lang.ClassCastException     // Catch:{ ClassNotFoundException -> 0x0111 }
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ ClassNotFoundException -> 0x0111 }
            r9.<init>()     // Catch:{ ClassNotFoundException -> 0x0111 }
            r9.append(r5)     // Catch:{ ClassNotFoundException -> 0x0111 }
            r9.append(r1)     // Catch:{ ClassNotFoundException -> 0x0111 }
            r9.append(r4)     // Catch:{ ClassNotFoundException -> 0x0111 }
            r9.append(r7)     // Catch:{ ClassNotFoundException -> 0x0111 }
            java.lang.String r1 = r9.toString()     // Catch:{ ClassNotFoundException -> 0x0111 }
            r8.<init>(r1)     // Catch:{ ClassNotFoundException -> 0x0111 }
            java.lang.Throwable r1 = r8.initCause(r2)     // Catch:{ ClassNotFoundException -> 0x0111 }
            p072l2.C1241e.m3516f(r1, r3)     // Catch:{ ClassNotFoundException -> 0x0111 }
            throw r1     // Catch:{ ClassNotFoundException -> 0x0111 }
        L_0x0111:
            java.lang.String r1 = "kotlin.internal.JRE7PlatformImplementations"
            java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch:{ ClassNotFoundException -> 0x0151 }
            java.lang.Object r1 = r1.newInstance()     // Catch:{ ClassNotFoundException -> 0x0151 }
            p072l2.C1241e.m3516f(r1, r6)     // Catch:{ ClassNotFoundException -> 0x0151 }
            r2 = r1
            z2.a r2 = (p153z2.C2202a) r2     // Catch:{ ClassCastException -> 0x0122 }
            goto L_0x0156
        L_0x0122:
            r2 = move-exception
            java.lang.Class r1 = r1.getClass()     // Catch:{ ClassNotFoundException -> 0x0151 }
            java.lang.ClassLoader r1 = r1.getClassLoader()     // Catch:{ ClassNotFoundException -> 0x0151 }
            java.lang.ClassLoader r0 = r0.getClassLoader()     // Catch:{ ClassNotFoundException -> 0x0151 }
            java.lang.ClassCastException r6 = new java.lang.ClassCastException     // Catch:{ ClassNotFoundException -> 0x0151 }
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ ClassNotFoundException -> 0x0151 }
            r7.<init>()     // Catch:{ ClassNotFoundException -> 0x0151 }
            r7.append(r5)     // Catch:{ ClassNotFoundException -> 0x0151 }
            r7.append(r1)     // Catch:{ ClassNotFoundException -> 0x0151 }
            r7.append(r4)     // Catch:{ ClassNotFoundException -> 0x0151 }
            r7.append(r0)     // Catch:{ ClassNotFoundException -> 0x0151 }
            java.lang.String r0 = r7.toString()     // Catch:{ ClassNotFoundException -> 0x0151 }
            r6.<init>(r0)     // Catch:{ ClassNotFoundException -> 0x0151 }
            java.lang.Throwable r0 = r6.initCause(r2)     // Catch:{ ClassNotFoundException -> 0x0151 }
            p072l2.C1241e.m3516f(r0, r3)     // Catch:{ ClassNotFoundException -> 0x0151 }
            throw r0     // Catch:{ ClassNotFoundException -> 0x0151 }
        L_0x0151:
            z2.a r2 = new z2.a
            r2.<init>()
        L_0x0156:
            f6332a = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p153z2.C2204b.<clinit>():void");
    }
}
