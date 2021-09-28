package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.drawable.ColorDrawable;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import android.util.Xml;
import android.view.View;
import androidx.constraintlayout.widget.C0244c;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import org.xmlpull.v1.XmlPullParserException;
import p000a.C0001b;
import p105r.C1632a;
import p123u.C1819a;
import p129v.C1955a;
import p129v.C1960d;
import p129v.C1961e;

/* renamed from: androidx.constraintlayout.widget.b */
public class C0237b {

    /* renamed from: d */
    public static final int[] f1114d = {0, 4, 8};

    /* renamed from: e */
    public static SparseIntArray f1115e = new SparseIntArray();

    /* renamed from: f */
    public static SparseIntArray f1116f = new SparseIntArray();

    /* renamed from: a */
    public HashMap<String, C1955a> f1117a = new HashMap<>();

    /* renamed from: b */
    public boolean f1118b = true;

    /* renamed from: c */
    public HashMap<Integer, C0238a> f1119c = new HashMap<>();

    /* renamed from: androidx.constraintlayout.widget.b$a */
    public static class C0238a {

        /* renamed from: a */
        public int f1120a;

        /* renamed from: b */
        public final C0242d f1121b = new C0242d();

        /* renamed from: c */
        public final C0241c f1122c = new C0241c();

        /* renamed from: d */
        public final C0240b f1123d = new C0240b();

        /* renamed from: e */
        public final C0243e f1124e = new C0243e();

        /* renamed from: f */
        public HashMap<String, C1955a> f1125f = new HashMap<>();

        /* renamed from: g */
        public C0239a f1126g;

        /* renamed from: androidx.constraintlayout.widget.b$a$a */
        public static class C0239a {

            /* renamed from: a */
            public int[] f1127a = new int[10];

            /* renamed from: b */
            public int[] f1128b = new int[10];

            /* renamed from: c */
            public int f1129c = 0;

            /* renamed from: d */
            public int[] f1130d = new int[10];

            /* renamed from: e */
            public float[] f1131e = new float[10];

            /* renamed from: f */
            public int f1132f = 0;

            /* renamed from: g */
            public int[] f1133g = new int[5];

            /* renamed from: h */
            public String[] f1134h = new String[5];

            /* renamed from: i */
            public int f1135i = 0;

            /* renamed from: j */
            public int[] f1136j = new int[4];

            /* renamed from: k */
            public boolean[] f1137k = new boolean[4];

            /* renamed from: l */
            public int f1138l = 0;

            /* renamed from: a */
            public void mo1319a(int i, float f) {
                int i2 = this.f1132f;
                int[] iArr = this.f1130d;
                if (i2 >= iArr.length) {
                    this.f1130d = Arrays.copyOf(iArr, iArr.length * 2);
                    float[] fArr = this.f1131e;
                    this.f1131e = Arrays.copyOf(fArr, fArr.length * 2);
                }
                int[] iArr2 = this.f1130d;
                int i3 = this.f1132f;
                iArr2[i3] = i;
                float[] fArr2 = this.f1131e;
                this.f1132f = i3 + 1;
                fArr2[i3] = f;
            }

            /* renamed from: b */
            public void mo1320b(int i, int i2) {
                int i3 = this.f1129c;
                int[] iArr = this.f1127a;
                if (i3 >= iArr.length) {
                    this.f1127a = Arrays.copyOf(iArr, iArr.length * 2);
                    int[] iArr2 = this.f1128b;
                    this.f1128b = Arrays.copyOf(iArr2, iArr2.length * 2);
                }
                int[] iArr3 = this.f1127a;
                int i4 = this.f1129c;
                iArr3[i4] = i;
                int[] iArr4 = this.f1128b;
                this.f1129c = i4 + 1;
                iArr4[i4] = i2;
            }

            /* renamed from: c */
            public void mo1321c(int i, String str) {
                int i2 = this.f1135i;
                int[] iArr = this.f1133g;
                if (i2 >= iArr.length) {
                    this.f1133g = Arrays.copyOf(iArr, iArr.length * 2);
                    String[] strArr = this.f1134h;
                    this.f1134h = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
                }
                int[] iArr2 = this.f1133g;
                int i3 = this.f1135i;
                iArr2[i3] = i;
                String[] strArr2 = this.f1134h;
                this.f1135i = i3 + 1;
                strArr2[i3] = str;
            }

            /* renamed from: d */
            public void mo1322d(int i, boolean z) {
                int i2 = this.f1138l;
                int[] iArr = this.f1136j;
                if (i2 >= iArr.length) {
                    this.f1136j = Arrays.copyOf(iArr, iArr.length * 2);
                    boolean[] zArr = this.f1137k;
                    this.f1137k = Arrays.copyOf(zArr, zArr.length * 2);
                }
                int[] iArr2 = this.f1136j;
                int i3 = this.f1138l;
                iArr2[i3] = i;
                boolean[] zArr2 = this.f1137k;
                this.f1138l = i3 + 1;
                zArr2[i3] = z;
            }
        }

        /* renamed from: a */
        public void mo1315a(ConstraintLayout.C0233a aVar) {
            C0240b bVar = this.f1123d;
            aVar.f1061d = bVar.f1180h;
            aVar.f1063e = bVar.f1182i;
            aVar.f1065f = bVar.f1184j;
            aVar.f1067g = bVar.f1186k;
            aVar.f1069h = bVar.f1188l;
            aVar.f1071i = bVar.f1190m;
            aVar.f1073j = bVar.f1192n;
            aVar.f1075k = bVar.f1194o;
            aVar.f1077l = bVar.f1196p;
            aVar.f1079m = bVar.f1197q;
            aVar.f1081n = bVar.f1198r;
            aVar.f1088r = bVar.f1199s;
            aVar.f1089s = bVar.f1200t;
            aVar.f1090t = bVar.f1201u;
            aVar.f1091u = bVar.f1202v;
            aVar.leftMargin = bVar.f1145F;
            aVar.rightMargin = bVar.f1146G;
            aVar.topMargin = bVar.f1147H;
            aVar.bottomMargin = bVar.f1148I;
            aVar.f1096z = bVar.f1157R;
            aVar.f1029A = bVar.f1156Q;
            aVar.f1093w = bVar.f1153N;
            aVar.f1095y = bVar.f1155P;
            aVar.f1032D = bVar.f1203w;
            aVar.f1033E = bVar.f1204x;
            aVar.f1083o = bVar.f1206z;
            aVar.f1085p = bVar.f1140A;
            aVar.f1087q = bVar.f1141B;
            aVar.f1034F = bVar.f1205y;
            aVar.f1047S = bVar.f1142C;
            aVar.f1048T = bVar.f1143D;
            aVar.f1036H = bVar.f1159T;
            aVar.f1035G = bVar.f1160U;
            aVar.f1038J = bVar.f1162W;
            aVar.f1037I = bVar.f1161V;
            aVar.f1050V = bVar.f1189l0;
            aVar.f1051W = bVar.f1191m0;
            aVar.f1039K = bVar.f1163X;
            aVar.f1040L = bVar.f1164Y;
            aVar.f1043O = bVar.f1165Z;
            aVar.f1044P = bVar.f1167a0;
            aVar.f1041M = bVar.f1169b0;
            aVar.f1042N = bVar.f1171c0;
            aVar.f1045Q = bVar.f1173d0;
            aVar.f1046R = bVar.f1175e0;
            aVar.f1049U = bVar.f1144E;
            aVar.f1059c = bVar.f1178g;
            aVar.f1055a = bVar.f1174e;
            aVar.f1057b = bVar.f1176f;
            aVar.width = bVar.f1170c;
            aVar.height = bVar.f1172d;
            String str = bVar.f1187k0;
            if (str != null) {
                aVar.f1052X = str;
            }
            aVar.f1053Y = bVar.f1195o0;
            aVar.setMarginStart(bVar.f1150K);
            aVar.setMarginEnd(this.f1123d.f1149J);
            aVar.mo1281a();
        }

        /* renamed from: b */
        public final void mo1316b(int i, ConstraintLayout.C0233a aVar) {
            this.f1120a = i;
            C0240b bVar = this.f1123d;
            bVar.f1180h = aVar.f1061d;
            bVar.f1182i = aVar.f1063e;
            bVar.f1184j = aVar.f1065f;
            bVar.f1186k = aVar.f1067g;
            bVar.f1188l = aVar.f1069h;
            bVar.f1190m = aVar.f1071i;
            bVar.f1192n = aVar.f1073j;
            bVar.f1194o = aVar.f1075k;
            bVar.f1196p = aVar.f1077l;
            bVar.f1197q = aVar.f1079m;
            bVar.f1198r = aVar.f1081n;
            bVar.f1199s = aVar.f1088r;
            bVar.f1200t = aVar.f1089s;
            bVar.f1201u = aVar.f1090t;
            bVar.f1202v = aVar.f1091u;
            bVar.f1203w = aVar.f1032D;
            bVar.f1204x = aVar.f1033E;
            bVar.f1205y = aVar.f1034F;
            bVar.f1206z = aVar.f1083o;
            bVar.f1140A = aVar.f1085p;
            bVar.f1141B = aVar.f1087q;
            bVar.f1142C = aVar.f1047S;
            bVar.f1143D = aVar.f1048T;
            bVar.f1144E = aVar.f1049U;
            bVar.f1178g = aVar.f1059c;
            bVar.f1174e = aVar.f1055a;
            bVar.f1176f = aVar.f1057b;
            bVar.f1170c = aVar.width;
            bVar.f1172d = aVar.height;
            bVar.f1145F = aVar.leftMargin;
            bVar.f1146G = aVar.rightMargin;
            bVar.f1147H = aVar.topMargin;
            bVar.f1148I = aVar.bottomMargin;
            bVar.f1151L = aVar.f1031C;
            bVar.f1159T = aVar.f1036H;
            bVar.f1160U = aVar.f1035G;
            bVar.f1162W = aVar.f1038J;
            bVar.f1161V = aVar.f1037I;
            bVar.f1189l0 = aVar.f1050V;
            bVar.f1191m0 = aVar.f1051W;
            bVar.f1163X = aVar.f1039K;
            bVar.f1164Y = aVar.f1040L;
            bVar.f1165Z = aVar.f1043O;
            bVar.f1167a0 = aVar.f1044P;
            bVar.f1169b0 = aVar.f1041M;
            bVar.f1171c0 = aVar.f1042N;
            bVar.f1173d0 = aVar.f1045Q;
            bVar.f1175e0 = aVar.f1046R;
            bVar.f1187k0 = aVar.f1052X;
            bVar.f1153N = aVar.f1093w;
            bVar.f1155P = aVar.f1095y;
            bVar.f1152M = aVar.f1092v;
            bVar.f1154O = aVar.f1094x;
            bVar.f1157R = aVar.f1096z;
            bVar.f1156Q = aVar.f1029A;
            bVar.f1158S = aVar.f1030B;
            bVar.f1195o0 = aVar.f1053Y;
            bVar.f1149J = aVar.getMarginEnd();
            this.f1123d.f1150K = aVar.getMarginStart();
        }

        /* renamed from: c */
        public final void mo1317c(int i, C0244c.C0245a aVar) {
            mo1316b(i, aVar);
            this.f1121b.f1225d = aVar.f1246q0;
            C0243e eVar = this.f1124e;
            eVar.f1229b = aVar.f1249t0;
            eVar.f1230c = aVar.f1250u0;
            eVar.f1231d = aVar.f1251v0;
            eVar.f1232e = aVar.f1252w0;
            eVar.f1233f = aVar.f1253x0;
            eVar.f1234g = aVar.f1254y0;
            eVar.f1235h = aVar.f1255z0;
            eVar.f1237j = aVar.f1243A0;
            eVar.f1238k = aVar.f1244B0;
            eVar.f1239l = aVar.f1245C0;
            eVar.f1241n = aVar.f1248s0;
            eVar.f1240m = aVar.f1247r0;
        }

        public Object clone() {
            C0238a aVar = new C0238a();
            C0240b bVar = aVar.f1123d;
            C0240b bVar2 = this.f1123d;
            Objects.requireNonNull(bVar);
            bVar.f1166a = bVar2.f1166a;
            bVar.f1170c = bVar2.f1170c;
            bVar.f1168b = bVar2.f1168b;
            bVar.f1172d = bVar2.f1172d;
            bVar.f1174e = bVar2.f1174e;
            bVar.f1176f = bVar2.f1176f;
            bVar.f1178g = bVar2.f1178g;
            bVar.f1180h = bVar2.f1180h;
            bVar.f1182i = bVar2.f1182i;
            bVar.f1184j = bVar2.f1184j;
            bVar.f1186k = bVar2.f1186k;
            bVar.f1188l = bVar2.f1188l;
            bVar.f1190m = bVar2.f1190m;
            bVar.f1192n = bVar2.f1192n;
            bVar.f1194o = bVar2.f1194o;
            bVar.f1196p = bVar2.f1196p;
            bVar.f1197q = bVar2.f1197q;
            bVar.f1198r = bVar2.f1198r;
            bVar.f1199s = bVar2.f1199s;
            bVar.f1200t = bVar2.f1200t;
            bVar.f1201u = bVar2.f1201u;
            bVar.f1202v = bVar2.f1202v;
            bVar.f1203w = bVar2.f1203w;
            bVar.f1204x = bVar2.f1204x;
            bVar.f1205y = bVar2.f1205y;
            bVar.f1206z = bVar2.f1206z;
            bVar.f1140A = bVar2.f1140A;
            bVar.f1141B = bVar2.f1141B;
            bVar.f1142C = bVar2.f1142C;
            bVar.f1143D = bVar2.f1143D;
            bVar.f1144E = bVar2.f1144E;
            bVar.f1145F = bVar2.f1145F;
            bVar.f1146G = bVar2.f1146G;
            bVar.f1147H = bVar2.f1147H;
            bVar.f1148I = bVar2.f1148I;
            bVar.f1149J = bVar2.f1149J;
            bVar.f1150K = bVar2.f1150K;
            bVar.f1151L = bVar2.f1151L;
            bVar.f1152M = bVar2.f1152M;
            bVar.f1153N = bVar2.f1153N;
            bVar.f1154O = bVar2.f1154O;
            bVar.f1155P = bVar2.f1155P;
            bVar.f1156Q = bVar2.f1156Q;
            bVar.f1157R = bVar2.f1157R;
            bVar.f1158S = bVar2.f1158S;
            bVar.f1159T = bVar2.f1159T;
            bVar.f1160U = bVar2.f1160U;
            bVar.f1161V = bVar2.f1161V;
            bVar.f1162W = bVar2.f1162W;
            bVar.f1163X = bVar2.f1163X;
            bVar.f1164Y = bVar2.f1164Y;
            bVar.f1165Z = bVar2.f1165Z;
            bVar.f1167a0 = bVar2.f1167a0;
            bVar.f1169b0 = bVar2.f1169b0;
            bVar.f1171c0 = bVar2.f1171c0;
            bVar.f1173d0 = bVar2.f1173d0;
            bVar.f1175e0 = bVar2.f1175e0;
            bVar.f1177f0 = bVar2.f1177f0;
            bVar.f1179g0 = bVar2.f1179g0;
            bVar.f1181h0 = bVar2.f1181h0;
            bVar.f1187k0 = bVar2.f1187k0;
            int[] iArr = bVar2.f1183i0;
            if (iArr != null) {
                bVar.f1183i0 = Arrays.copyOf(iArr, iArr.length);
            } else {
                bVar.f1183i0 = null;
            }
            bVar.f1185j0 = bVar2.f1185j0;
            bVar.f1189l0 = bVar2.f1189l0;
            bVar.f1191m0 = bVar2.f1191m0;
            bVar.f1193n0 = bVar2.f1193n0;
            bVar.f1195o0 = bVar2.f1195o0;
            C0241c cVar = aVar.f1122c;
            C0241c cVar2 = this.f1122c;
            Objects.requireNonNull(cVar);
            cVar.f1208a = cVar2.f1208a;
            cVar.f1209b = cVar2.f1209b;
            cVar.f1211d = cVar2.f1211d;
            cVar.f1212e = cVar2.f1212e;
            cVar.f1213f = cVar2.f1213f;
            cVar.f1216i = cVar2.f1216i;
            cVar.f1214g = cVar2.f1214g;
            cVar.f1215h = cVar2.f1215h;
            C0242d dVar = aVar.f1121b;
            C0242d dVar2 = this.f1121b;
            Objects.requireNonNull(dVar);
            dVar.f1222a = dVar2.f1222a;
            dVar.f1223b = dVar2.f1223b;
            dVar.f1225d = dVar2.f1225d;
            dVar.f1226e = dVar2.f1226e;
            dVar.f1224c = dVar2.f1224c;
            C0243e eVar = aVar.f1124e;
            C0243e eVar2 = this.f1124e;
            Objects.requireNonNull(eVar);
            eVar.f1228a = eVar2.f1228a;
            eVar.f1229b = eVar2.f1229b;
            eVar.f1230c = eVar2.f1230c;
            eVar.f1231d = eVar2.f1231d;
            eVar.f1232e = eVar2.f1232e;
            eVar.f1233f = eVar2.f1233f;
            eVar.f1234g = eVar2.f1234g;
            eVar.f1235h = eVar2.f1235h;
            eVar.f1236i = eVar2.f1236i;
            eVar.f1237j = eVar2.f1237j;
            eVar.f1238k = eVar2.f1238k;
            eVar.f1239l = eVar2.f1239l;
            eVar.f1240m = eVar2.f1240m;
            eVar.f1241n = eVar2.f1241n;
            aVar.f1120a = this.f1120a;
            aVar.f1126g = this.f1126g;
            return aVar;
        }
    }

    /* renamed from: androidx.constraintlayout.widget.b$b */
    public static class C0240b {

        /* renamed from: p0 */
        public static SparseIntArray f1139p0;

        /* renamed from: A */
        public int f1140A = 0;

        /* renamed from: B */
        public float f1141B = 0.0f;

        /* renamed from: C */
        public int f1142C = -1;

        /* renamed from: D */
        public int f1143D = -1;

        /* renamed from: E */
        public int f1144E = -1;

        /* renamed from: F */
        public int f1145F = 0;

        /* renamed from: G */
        public int f1146G = 0;

        /* renamed from: H */
        public int f1147H = 0;

        /* renamed from: I */
        public int f1148I = 0;

        /* renamed from: J */
        public int f1149J = 0;

        /* renamed from: K */
        public int f1150K = 0;

        /* renamed from: L */
        public int f1151L = 0;

        /* renamed from: M */
        public int f1152M = Integer.MIN_VALUE;

        /* renamed from: N */
        public int f1153N = Integer.MIN_VALUE;

        /* renamed from: O */
        public int f1154O = Integer.MIN_VALUE;

        /* renamed from: P */
        public int f1155P = Integer.MIN_VALUE;

        /* renamed from: Q */
        public int f1156Q = Integer.MIN_VALUE;

        /* renamed from: R */
        public int f1157R = Integer.MIN_VALUE;

        /* renamed from: S */
        public int f1158S = Integer.MIN_VALUE;

        /* renamed from: T */
        public float f1159T = -1.0f;

        /* renamed from: U */
        public float f1160U = -1.0f;

        /* renamed from: V */
        public int f1161V = 0;

        /* renamed from: W */
        public int f1162W = 0;

        /* renamed from: X */
        public int f1163X = 0;

        /* renamed from: Y */
        public int f1164Y = 0;

        /* renamed from: Z */
        public int f1165Z = -1;

        /* renamed from: a */
        public boolean f1166a = false;

        /* renamed from: a0 */
        public int f1167a0 = -1;

        /* renamed from: b */
        public boolean f1168b = false;

        /* renamed from: b0 */
        public int f1169b0 = -1;

        /* renamed from: c */
        public int f1170c;

        /* renamed from: c0 */
        public int f1171c0 = -1;

        /* renamed from: d */
        public int f1172d;

        /* renamed from: d0 */
        public float f1173d0 = 1.0f;

        /* renamed from: e */
        public int f1174e = -1;

        /* renamed from: e0 */
        public float f1175e0 = 1.0f;

        /* renamed from: f */
        public int f1176f = -1;

        /* renamed from: f0 */
        public int f1177f0 = -1;

        /* renamed from: g */
        public float f1178g = -1.0f;

        /* renamed from: g0 */
        public int f1179g0 = 0;

        /* renamed from: h */
        public int f1180h = -1;

        /* renamed from: h0 */
        public int f1181h0 = -1;

        /* renamed from: i */
        public int f1182i = -1;

        /* renamed from: i0 */
        public int[] f1183i0;

        /* renamed from: j */
        public int f1184j = -1;

        /* renamed from: j0 */
        public String f1185j0;

        /* renamed from: k */
        public int f1186k = -1;

        /* renamed from: k0 */
        public String f1187k0;

        /* renamed from: l */
        public int f1188l = -1;

        /* renamed from: l0 */
        public boolean f1189l0 = false;

        /* renamed from: m */
        public int f1190m = -1;

        /* renamed from: m0 */
        public boolean f1191m0 = false;

        /* renamed from: n */
        public int f1192n = -1;

        /* renamed from: n0 */
        public boolean f1193n0 = true;

        /* renamed from: o */
        public int f1194o = -1;

        /* renamed from: o0 */
        public int f1195o0 = 0;

        /* renamed from: p */
        public int f1196p = -1;

        /* renamed from: q */
        public int f1197q = -1;

        /* renamed from: r */
        public int f1198r = -1;

        /* renamed from: s */
        public int f1199s = -1;

        /* renamed from: t */
        public int f1200t = -1;

        /* renamed from: u */
        public int f1201u = -1;

        /* renamed from: v */
        public int f1202v = -1;

        /* renamed from: w */
        public float f1203w = 0.5f;

        /* renamed from: x */
        public float f1204x = 0.5f;

        /* renamed from: y */
        public String f1205y = null;

        /* renamed from: z */
        public int f1206z = -1;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f1139p0 = sparseIntArray;
            sparseIntArray.append(42, 24);
            f1139p0.append(43, 25);
            f1139p0.append(45, 28);
            f1139p0.append(46, 29);
            f1139p0.append(51, 35);
            f1139p0.append(50, 34);
            f1139p0.append(23, 4);
            f1139p0.append(22, 3);
            f1139p0.append(18, 1);
            f1139p0.append(60, 6);
            f1139p0.append(61, 7);
            f1139p0.append(30, 17);
            f1139p0.append(31, 18);
            f1139p0.append(32, 19);
            f1139p0.append(0, 26);
            f1139p0.append(47, 31);
            f1139p0.append(48, 32);
            f1139p0.append(29, 10);
            f1139p0.append(28, 9);
            f1139p0.append(65, 13);
            f1139p0.append(68, 16);
            f1139p0.append(66, 14);
            f1139p0.append(63, 11);
            f1139p0.append(67, 15);
            f1139p0.append(64, 12);
            f1139p0.append(54, 38);
            f1139p0.append(40, 37);
            f1139p0.append(39, 39);
            f1139p0.append(53, 40);
            f1139p0.append(38, 20);
            f1139p0.append(52, 36);
            f1139p0.append(27, 5);
            f1139p0.append(41, 76);
            f1139p0.append(49, 76);
            f1139p0.append(44, 76);
            f1139p0.append(21, 76);
            f1139p0.append(17, 76);
            f1139p0.append(3, 23);
            f1139p0.append(5, 27);
            f1139p0.append(7, 30);
            f1139p0.append(8, 8);
            f1139p0.append(4, 33);
            f1139p0.append(6, 2);
            f1139p0.append(1, 22);
            f1139p0.append(2, 21);
            f1139p0.append(55, 41);
            f1139p0.append(33, 42);
            f1139p0.append(16, 41);
            f1139p0.append(15, 42);
            f1139p0.append(70, 97);
            f1139p0.append(24, 61);
            f1139p0.append(26, 62);
            f1139p0.append(25, 63);
            f1139p0.append(59, 69);
            f1139p0.append(37, 70);
            f1139p0.append(12, 71);
            f1139p0.append(10, 72);
            f1139p0.append(11, 73);
            f1139p0.append(13, 74);
            f1139p0.append(9, 75);
        }

        /* renamed from: a */
        public void mo1323a(Context context, AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1961e.f5788f);
            this.f1168b = true;
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                int i2 = f1139p0.get(index);
                if (i2 == 80) {
                    this.f1189l0 = obtainStyledAttributes.getBoolean(index, this.f1189l0);
                } else if (i2 == 81) {
                    this.f1191m0 = obtainStyledAttributes.getBoolean(index, this.f1191m0);
                } else if (i2 != 97) {
                    switch (i2) {
                        case 1:
                            int i3 = this.f1196p;
                            int[] iArr = C0237b.f1114d;
                            int resourceId = obtainStyledAttributes.getResourceId(index, i3);
                            if (resourceId == -1) {
                                resourceId = obtainStyledAttributes.getInt(index, -1);
                            }
                            this.f1196p = resourceId;
                            break;
                        case 2:
                            this.f1148I = obtainStyledAttributes.getDimensionPixelSize(index, this.f1148I);
                            break;
                        case 3:
                            int i4 = this.f1194o;
                            int[] iArr2 = C0237b.f1114d;
                            int resourceId2 = obtainStyledAttributes.getResourceId(index, i4);
                            if (resourceId2 == -1) {
                                resourceId2 = obtainStyledAttributes.getInt(index, -1);
                            }
                            this.f1194o = resourceId2;
                            break;
                        case 4:
                            int i5 = this.f1192n;
                            int[] iArr3 = C0237b.f1114d;
                            int resourceId3 = obtainStyledAttributes.getResourceId(index, i5);
                            if (resourceId3 == -1) {
                                resourceId3 = obtainStyledAttributes.getInt(index, -1);
                            }
                            this.f1192n = resourceId3;
                            break;
                        case 5:
                            this.f1205y = obtainStyledAttributes.getString(index);
                            break;
                        case 6:
                            this.f1142C = obtainStyledAttributes.getDimensionPixelOffset(index, this.f1142C);
                            break;
                        case 7:
                            this.f1143D = obtainStyledAttributes.getDimensionPixelOffset(index, this.f1143D);
                            break;
                        case 8:
                            this.f1149J = obtainStyledAttributes.getDimensionPixelSize(index, this.f1149J);
                            break;
                        case 9:
                            int i6 = this.f1202v;
                            int[] iArr4 = C0237b.f1114d;
                            int resourceId4 = obtainStyledAttributes.getResourceId(index, i6);
                            if (resourceId4 == -1) {
                                resourceId4 = obtainStyledAttributes.getInt(index, -1);
                            }
                            this.f1202v = resourceId4;
                            break;
                        case 10:
                            int i7 = this.f1201u;
                            int[] iArr5 = C0237b.f1114d;
                            int resourceId5 = obtainStyledAttributes.getResourceId(index, i7);
                            if (resourceId5 == -1) {
                                resourceId5 = obtainStyledAttributes.getInt(index, -1);
                            }
                            this.f1201u = resourceId5;
                            break;
                        case 11:
                            this.f1155P = obtainStyledAttributes.getDimensionPixelSize(index, this.f1155P);
                            break;
                        case 12:
                            this.f1156Q = obtainStyledAttributes.getDimensionPixelSize(index, this.f1156Q);
                            break;
                        case 13:
                            this.f1152M = obtainStyledAttributes.getDimensionPixelSize(index, this.f1152M);
                            break;
                        case 14:
                            this.f1154O = obtainStyledAttributes.getDimensionPixelSize(index, this.f1154O);
                            break;
                        case 15:
                            this.f1157R = obtainStyledAttributes.getDimensionPixelSize(index, this.f1157R);
                            break;
                        case 16:
                            this.f1153N = obtainStyledAttributes.getDimensionPixelSize(index, this.f1153N);
                            break;
                        case 17:
                            this.f1174e = obtainStyledAttributes.getDimensionPixelOffset(index, this.f1174e);
                            break;
                        case 18:
                            this.f1176f = obtainStyledAttributes.getDimensionPixelOffset(index, this.f1176f);
                            break;
                        case 19:
                            this.f1178g = obtainStyledAttributes.getFloat(index, this.f1178g);
                            break;
                        case 20:
                            this.f1203w = obtainStyledAttributes.getFloat(index, this.f1203w);
                            break;
                        case 21:
                            this.f1172d = obtainStyledAttributes.getLayoutDimension(index, this.f1172d);
                            break;
                        case 22:
                            this.f1170c = obtainStyledAttributes.getLayoutDimension(index, this.f1170c);
                            break;
                        case 23:
                            this.f1145F = obtainStyledAttributes.getDimensionPixelSize(index, this.f1145F);
                            break;
                        case 24:
                            int i8 = this.f1180h;
                            int[] iArr6 = C0237b.f1114d;
                            int resourceId6 = obtainStyledAttributes.getResourceId(index, i8);
                            if (resourceId6 == -1) {
                                resourceId6 = obtainStyledAttributes.getInt(index, -1);
                            }
                            this.f1180h = resourceId6;
                            break;
                        case 25:
                            int i9 = this.f1182i;
                            int[] iArr7 = C0237b.f1114d;
                            int resourceId7 = obtainStyledAttributes.getResourceId(index, i9);
                            if (resourceId7 == -1) {
                                resourceId7 = obtainStyledAttributes.getInt(index, -1);
                            }
                            this.f1182i = resourceId7;
                            break;
                        case 26:
                            this.f1144E = obtainStyledAttributes.getInt(index, this.f1144E);
                            break;
                        case 27:
                            this.f1146G = obtainStyledAttributes.getDimensionPixelSize(index, this.f1146G);
                            break;
                        case 28:
                            int i10 = this.f1184j;
                            int[] iArr8 = C0237b.f1114d;
                            int resourceId8 = obtainStyledAttributes.getResourceId(index, i10);
                            if (resourceId8 == -1) {
                                resourceId8 = obtainStyledAttributes.getInt(index, -1);
                            }
                            this.f1184j = resourceId8;
                            break;
                        case 29:
                            int i11 = this.f1186k;
                            int[] iArr9 = C0237b.f1114d;
                            int resourceId9 = obtainStyledAttributes.getResourceId(index, i11);
                            if (resourceId9 == -1) {
                                resourceId9 = obtainStyledAttributes.getInt(index, -1);
                            }
                            this.f1186k = resourceId9;
                            break;
                        case 30:
                            this.f1150K = obtainStyledAttributes.getDimensionPixelSize(index, this.f1150K);
                            break;
                        case 31:
                            int i12 = this.f1199s;
                            int[] iArr10 = C0237b.f1114d;
                            int resourceId10 = obtainStyledAttributes.getResourceId(index, i12);
                            if (resourceId10 == -1) {
                                resourceId10 = obtainStyledAttributes.getInt(index, -1);
                            }
                            this.f1199s = resourceId10;
                            break;
                        case 32:
                            int i13 = this.f1200t;
                            int[] iArr11 = C0237b.f1114d;
                            int resourceId11 = obtainStyledAttributes.getResourceId(index, i13);
                            if (resourceId11 == -1) {
                                resourceId11 = obtainStyledAttributes.getInt(index, -1);
                            }
                            this.f1200t = resourceId11;
                            break;
                        case 33:
                            this.f1147H = obtainStyledAttributes.getDimensionPixelSize(index, this.f1147H);
                            break;
                        case 34:
                            int i14 = this.f1190m;
                            int[] iArr12 = C0237b.f1114d;
                            int resourceId12 = obtainStyledAttributes.getResourceId(index, i14);
                            if (resourceId12 == -1) {
                                resourceId12 = obtainStyledAttributes.getInt(index, -1);
                            }
                            this.f1190m = resourceId12;
                            break;
                        case 35:
                            int i15 = this.f1188l;
                            int[] iArr13 = C0237b.f1114d;
                            int resourceId13 = obtainStyledAttributes.getResourceId(index, i15);
                            if (resourceId13 == -1) {
                                resourceId13 = obtainStyledAttributes.getInt(index, -1);
                            }
                            this.f1188l = resourceId13;
                            break;
                        case 36:
                            this.f1204x = obtainStyledAttributes.getFloat(index, this.f1204x);
                            break;
                        case 37:
                            this.f1160U = obtainStyledAttributes.getFloat(index, this.f1160U);
                            break;
                        case 38:
                            this.f1159T = obtainStyledAttributes.getFloat(index, this.f1159T);
                            break;
                        case 39:
                            this.f1161V = obtainStyledAttributes.getInt(index, this.f1161V);
                            break;
                        case 40:
                            this.f1162W = obtainStyledAttributes.getInt(index, this.f1162W);
                            break;
                        case 41:
                            C0237b.m635i(this, obtainStyledAttributes, index, 0);
                            break;
                        case 42:
                            C0237b.m635i(this, obtainStyledAttributes, index, 1);
                            break;
                        default:
                            switch (i2) {
                                case 54:
                                    this.f1163X = obtainStyledAttributes.getInt(index, this.f1163X);
                                    break;
                                case 55:
                                    this.f1164Y = obtainStyledAttributes.getInt(index, this.f1164Y);
                                    break;
                                case 56:
                                    this.f1165Z = obtainStyledAttributes.getDimensionPixelSize(index, this.f1165Z);
                                    break;
                                case 57:
                                    this.f1167a0 = obtainStyledAttributes.getDimensionPixelSize(index, this.f1167a0);
                                    break;
                                case 58:
                                    this.f1169b0 = obtainStyledAttributes.getDimensionPixelSize(index, this.f1169b0);
                                    break;
                                case 59:
                                    this.f1171c0 = obtainStyledAttributes.getDimensionPixelSize(index, this.f1171c0);
                                    break;
                                default:
                                    switch (i2) {
                                        case 61:
                                            int i16 = this.f1206z;
                                            int[] iArr14 = C0237b.f1114d;
                                            int resourceId14 = obtainStyledAttributes.getResourceId(index, i16);
                                            if (resourceId14 == -1) {
                                                resourceId14 = obtainStyledAttributes.getInt(index, -1);
                                            }
                                            this.f1206z = resourceId14;
                                            break;
                                        case 62:
                                            this.f1140A = obtainStyledAttributes.getDimensionPixelSize(index, this.f1140A);
                                            break;
                                        case 63:
                                            this.f1141B = obtainStyledAttributes.getFloat(index, this.f1141B);
                                            break;
                                        default:
                                            switch (i2) {
                                                case 69:
                                                    this.f1173d0 = obtainStyledAttributes.getFloat(index, 1.0f);
                                                    break;
                                                case 70:
                                                    this.f1175e0 = obtainStyledAttributes.getFloat(index, 1.0f);
                                                    break;
                                                case 71:
                                                    break;
                                                case 72:
                                                    this.f1177f0 = obtainStyledAttributes.getInt(index, this.f1177f0);
                                                    break;
                                                case 73:
                                                    this.f1179g0 = obtainStyledAttributes.getDimensionPixelSize(index, this.f1179g0);
                                                    break;
                                                case 74:
                                                    this.f1185j0 = obtainStyledAttributes.getString(index);
                                                    break;
                                                case 75:
                                                    this.f1193n0 = obtainStyledAttributes.getBoolean(index, this.f1193n0);
                                                    break;
                                                case 76:
                                                    Integer.toHexString(index);
                                                    f1139p0.get(index);
                                                    break;
                                                case 77:
                                                    this.f1187k0 = obtainStyledAttributes.getString(index);
                                                    break;
                                                default:
                                                    switch (i2) {
                                                        case 91:
                                                            int i17 = this.f1197q;
                                                            int[] iArr15 = C0237b.f1114d;
                                                            int resourceId15 = obtainStyledAttributes.getResourceId(index, i17);
                                                            if (resourceId15 == -1) {
                                                                resourceId15 = obtainStyledAttributes.getInt(index, -1);
                                                            }
                                                            this.f1197q = resourceId15;
                                                            continue;
                                                        case 92:
                                                            int i18 = this.f1198r;
                                                            int[] iArr16 = C0237b.f1114d;
                                                            int resourceId16 = obtainStyledAttributes.getResourceId(index, i18);
                                                            if (resourceId16 == -1) {
                                                                resourceId16 = obtainStyledAttributes.getInt(index, -1);
                                                            }
                                                            this.f1198r = resourceId16;
                                                            continue;
                                                        case 93:
                                                            this.f1151L = obtainStyledAttributes.getDimensionPixelSize(index, this.f1151L);
                                                            continue;
                                                        case 94:
                                                            this.f1158S = obtainStyledAttributes.getDimensionPixelSize(index, this.f1158S);
                                                            continue;
                                                    }
                                                    Integer.toHexString(index);
                                                    f1139p0.get(index);
                                                    break;
                                            }
                                    }
                            }
                    }
                } else {
                    this.f1195o0 = obtainStyledAttributes.getInt(index, this.f1195o0);
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: androidx.constraintlayout.widget.b$c */
    public static class C0241c {

        /* renamed from: o */
        public static SparseIntArray f1207o;

        /* renamed from: a */
        public boolean f1208a = false;

        /* renamed from: b */
        public int f1209b = -1;

        /* renamed from: c */
        public int f1210c = 0;

        /* renamed from: d */
        public String f1211d = null;

        /* renamed from: e */
        public int f1212e = -1;

        /* renamed from: f */
        public int f1213f = 0;

        /* renamed from: g */
        public float f1214g = Float.NaN;

        /* renamed from: h */
        public int f1215h = -1;

        /* renamed from: i */
        public float f1216i = Float.NaN;

        /* renamed from: j */
        public float f1217j = Float.NaN;

        /* renamed from: k */
        public int f1218k = -1;

        /* renamed from: l */
        public String f1219l = null;

        /* renamed from: m */
        public int f1220m = -3;

        /* renamed from: n */
        public int f1221n = -1;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f1207o = sparseIntArray;
            sparseIntArray.append(3, 1);
            f1207o.append(5, 2);
            f1207o.append(9, 3);
            f1207o.append(2, 4);
            f1207o.append(1, 5);
            f1207o.append(0, 6);
            f1207o.append(4, 7);
            f1207o.append(8, 8);
            f1207o.append(7, 9);
            f1207o.append(6, 10);
        }

        /* renamed from: a */
        public void mo1324a(Context context, AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1961e.f5789g);
            this.f1208a = true;
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                switch (f1207o.get(index)) {
                    case 1:
                        this.f1216i = obtainStyledAttributes.getFloat(index, this.f1216i);
                        break;
                    case 2:
                        this.f1212e = obtainStyledAttributes.getInt(index, this.f1212e);
                        break;
                    case 3:
                        this.f1211d = obtainStyledAttributes.peekValue(index).type == 3 ? obtainStyledAttributes.getString(index) : C1632a.f5008c[obtainStyledAttributes.getInteger(index, 0)];
                        break;
                    case 4:
                        this.f1213f = obtainStyledAttributes.getInt(index, 0);
                        break;
                    case 5:
                        int i2 = this.f1209b;
                        int[] iArr = C0237b.f1114d;
                        int resourceId = obtainStyledAttributes.getResourceId(index, i2);
                        if (resourceId == -1) {
                            resourceId = obtainStyledAttributes.getInt(index, -1);
                        }
                        this.f1209b = resourceId;
                        break;
                    case 6:
                        this.f1210c = obtainStyledAttributes.getInteger(index, this.f1210c);
                        break;
                    case 7:
                        this.f1214g = obtainStyledAttributes.getFloat(index, this.f1214g);
                        break;
                    case 8:
                        this.f1218k = obtainStyledAttributes.getInteger(index, this.f1218k);
                        break;
                    case 9:
                        this.f1217j = obtainStyledAttributes.getFloat(index, this.f1217j);
                        break;
                    case 10:
                        int i3 = obtainStyledAttributes.peekValue(index).type;
                        if (i3 != 1) {
                            if (i3 != 3) {
                                this.f1220m = obtainStyledAttributes.getInteger(index, this.f1221n);
                                break;
                            } else {
                                String string = obtainStyledAttributes.getString(index);
                                this.f1219l = string;
                                if (string.indexOf("/") <= 0) {
                                    this.f1220m = -1;
                                    break;
                                } else {
                                    this.f1221n = obtainStyledAttributes.getResourceId(index, -1);
                                }
                            }
                        } else {
                            int resourceId2 = obtainStyledAttributes.getResourceId(index, -1);
                            this.f1221n = resourceId2;
                            if (resourceId2 == -1) {
                                break;
                            }
                        }
                        this.f1220m = -2;
                        break;
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: androidx.constraintlayout.widget.b$d */
    public static class C0242d {

        /* renamed from: a */
        public boolean f1222a = false;

        /* renamed from: b */
        public int f1223b = 0;

        /* renamed from: c */
        public int f1224c = 0;

        /* renamed from: d */
        public float f1225d = 1.0f;

        /* renamed from: e */
        public float f1226e = Float.NaN;

        /* renamed from: a */
        public void mo1325a(Context context, AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1961e.f5791i);
            this.f1222a = true;
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == 1) {
                    this.f1225d = obtainStyledAttributes.getFloat(index, this.f1225d);
                } else if (index == 0) {
                    int i2 = obtainStyledAttributes.getInt(index, this.f1223b);
                    this.f1223b = i2;
                    int[] iArr = C0237b.f1114d;
                    this.f1223b = C0237b.f1114d[i2];
                } else if (index == 4) {
                    this.f1224c = obtainStyledAttributes.getInt(index, this.f1224c);
                } else if (index == 3) {
                    this.f1226e = obtainStyledAttributes.getFloat(index, this.f1226e);
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: androidx.constraintlayout.widget.b$e */
    public static class C0243e {

        /* renamed from: o */
        public static SparseIntArray f1227o;

        /* renamed from: a */
        public boolean f1228a = false;

        /* renamed from: b */
        public float f1229b = 0.0f;

        /* renamed from: c */
        public float f1230c = 0.0f;

        /* renamed from: d */
        public float f1231d = 0.0f;

        /* renamed from: e */
        public float f1232e = 1.0f;

        /* renamed from: f */
        public float f1233f = 1.0f;

        /* renamed from: g */
        public float f1234g = Float.NaN;

        /* renamed from: h */
        public float f1235h = Float.NaN;

        /* renamed from: i */
        public int f1236i = -1;

        /* renamed from: j */
        public float f1237j = 0.0f;

        /* renamed from: k */
        public float f1238k = 0.0f;

        /* renamed from: l */
        public float f1239l = 0.0f;

        /* renamed from: m */
        public boolean f1240m = false;

        /* renamed from: n */
        public float f1241n = 0.0f;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f1227o = sparseIntArray;
            sparseIntArray.append(6, 1);
            f1227o.append(7, 2);
            f1227o.append(8, 3);
            f1227o.append(4, 4);
            f1227o.append(5, 5);
            f1227o.append(0, 6);
            f1227o.append(1, 7);
            f1227o.append(2, 8);
            f1227o.append(3, 9);
            f1227o.append(9, 10);
            f1227o.append(10, 11);
            f1227o.append(11, 12);
        }

        /* renamed from: a */
        public void mo1326a(Context context, AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1961e.f5793k);
            this.f1228a = true;
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                switch (f1227o.get(index)) {
                    case 1:
                        this.f1229b = obtainStyledAttributes.getFloat(index, this.f1229b);
                        break;
                    case 2:
                        this.f1230c = obtainStyledAttributes.getFloat(index, this.f1230c);
                        break;
                    case 3:
                        this.f1231d = obtainStyledAttributes.getFloat(index, this.f1231d);
                        break;
                    case 4:
                        this.f1232e = obtainStyledAttributes.getFloat(index, this.f1232e);
                        break;
                    case 5:
                        this.f1233f = obtainStyledAttributes.getFloat(index, this.f1233f);
                        break;
                    case 6:
                        this.f1234g = obtainStyledAttributes.getDimension(index, this.f1234g);
                        break;
                    case 7:
                        this.f1235h = obtainStyledAttributes.getDimension(index, this.f1235h);
                        break;
                    case 8:
                        this.f1237j = obtainStyledAttributes.getDimension(index, this.f1237j);
                        break;
                    case 9:
                        this.f1238k = obtainStyledAttributes.getDimension(index, this.f1238k);
                        break;
                    case 10:
                        this.f1239l = obtainStyledAttributes.getDimension(index, this.f1239l);
                        break;
                    case 11:
                        this.f1240m = true;
                        this.f1241n = obtainStyledAttributes.getDimension(index, this.f1241n);
                        break;
                    case 12:
                        int i2 = this.f1236i;
                        int[] iArr = C0237b.f1114d;
                        int resourceId = obtainStyledAttributes.getResourceId(index, i2);
                        if (resourceId == -1) {
                            resourceId = obtainStyledAttributes.getInt(index, -1);
                        }
                        this.f1236i = resourceId;
                        break;
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    static {
        f1115e.append(81, 25);
        f1115e.append(82, 26);
        f1115e.append(84, 29);
        f1115e.append(85, 30);
        f1115e.append(91, 36);
        f1115e.append(90, 35);
        f1115e.append(62, 4);
        f1115e.append(61, 3);
        f1115e.append(57, 1);
        f1115e.append(59, 91);
        f1115e.append(58, 92);
        f1115e.append(100, 6);
        f1115e.append(101, 7);
        f1115e.append(69, 17);
        f1115e.append(70, 18);
        f1115e.append(71, 19);
        f1115e.append(0, 27);
        f1115e.append(86, 32);
        f1115e.append(87, 33);
        f1115e.append(68, 10);
        f1115e.append(67, 9);
        f1115e.append(105, 13);
        f1115e.append(108, 16);
        f1115e.append(106, 14);
        f1115e.append(103, 11);
        f1115e.append(107, 15);
        f1115e.append(104, 12);
        f1115e.append(94, 40);
        f1115e.append(79, 39);
        f1115e.append(78, 41);
        f1115e.append(93, 42);
        f1115e.append(77, 20);
        f1115e.append(92, 37);
        f1115e.append(66, 5);
        f1115e.append(80, 87);
        f1115e.append(89, 87);
        f1115e.append(83, 87);
        f1115e.append(60, 87);
        f1115e.append(56, 87);
        f1115e.append(5, 24);
        f1115e.append(7, 28);
        f1115e.append(23, 31);
        f1115e.append(24, 8);
        f1115e.append(6, 34);
        f1115e.append(8, 2);
        f1115e.append(3, 23);
        f1115e.append(4, 21);
        f1115e.append(95, 95);
        f1115e.append(72, 96);
        f1115e.append(2, 22);
        f1115e.append(13, 43);
        f1115e.append(26, 44);
        f1115e.append(21, 45);
        f1115e.append(22, 46);
        f1115e.append(20, 60);
        f1115e.append(18, 47);
        f1115e.append(19, 48);
        f1115e.append(14, 49);
        f1115e.append(15, 50);
        f1115e.append(16, 51);
        f1115e.append(17, 52);
        f1115e.append(25, 53);
        f1115e.append(96, 54);
        f1115e.append(73, 55);
        f1115e.append(97, 56);
        f1115e.append(74, 57);
        f1115e.append(98, 58);
        f1115e.append(75, 59);
        f1115e.append(63, 61);
        f1115e.append(65, 62);
        f1115e.append(64, 63);
        f1115e.append(28, 64);
        f1115e.append(120, 65);
        f1115e.append(35, 66);
        f1115e.append(121, 67);
        f1115e.append(112, 79);
        f1115e.append(1, 38);
        f1115e.append(111, 68);
        f1115e.append(99, 69);
        f1115e.append(76, 70);
        f1115e.append(110, 97);
        f1115e.append(32, 71);
        f1115e.append(30, 72);
        f1115e.append(31, 73);
        f1115e.append(33, 74);
        f1115e.append(29, 75);
        f1115e.append(113, 76);
        f1115e.append(88, 77);
        f1115e.append(122, 78);
        f1115e.append(55, 80);
        f1115e.append(54, 81);
        f1115e.append(115, 82);
        f1115e.append(119, 83);
        f1115e.append(118, 84);
        f1115e.append(117, 85);
        f1115e.append(116, 86);
        f1116f.append(84, 6);
        f1116f.append(84, 7);
        f1116f.append(0, 27);
        f1116f.append(88, 13);
        f1116f.append(91, 16);
        f1116f.append(89, 14);
        f1116f.append(86, 11);
        f1116f.append(90, 15);
        f1116f.append(87, 12);
        f1116f.append(77, 40);
        f1116f.append(70, 39);
        f1116f.append(69, 41);
        f1116f.append(76, 42);
        f1116f.append(68, 20);
        f1116f.append(75, 37);
        f1116f.append(59, 5);
        f1116f.append(71, 87);
        f1116f.append(74, 87);
        f1116f.append(72, 87);
        f1116f.append(56, 87);
        f1116f.append(55, 87);
        f1116f.append(5, 24);
        f1116f.append(7, 28);
        f1116f.append(23, 31);
        f1116f.append(24, 8);
        f1116f.append(6, 34);
        f1116f.append(8, 2);
        f1116f.append(3, 23);
        f1116f.append(4, 21);
        f1116f.append(78, 95);
        f1116f.append(63, 96);
        f1116f.append(2, 22);
        f1116f.append(13, 43);
        f1116f.append(26, 44);
        f1116f.append(21, 45);
        f1116f.append(22, 46);
        f1116f.append(20, 60);
        f1116f.append(18, 47);
        f1116f.append(19, 48);
        f1116f.append(14, 49);
        f1116f.append(15, 50);
        f1116f.append(16, 51);
        f1116f.append(17, 52);
        f1116f.append(25, 53);
        f1116f.append(79, 54);
        f1116f.append(64, 55);
        f1116f.append(80, 56);
        f1116f.append(65, 57);
        f1116f.append(81, 58);
        f1116f.append(66, 59);
        f1116f.append(58, 62);
        f1116f.append(57, 63);
        f1116f.append(28, 64);
        f1116f.append(104, 65);
        f1116f.append(34, 66);
        f1116f.append(105, 67);
        f1116f.append(95, 79);
        f1116f.append(1, 38);
        f1116f.append(96, 98);
        f1116f.append(94, 68);
        f1116f.append(82, 69);
        f1116f.append(67, 70);
        f1116f.append(32, 71);
        f1116f.append(30, 72);
        f1116f.append(31, 73);
        f1116f.append(33, 74);
        f1116f.append(29, 75);
        f1116f.append(97, 76);
        f1116f.append(73, 77);
        f1116f.append(106, 78);
        f1116f.append(54, 80);
        f1116f.append(53, 81);
        f1116f.append(99, 82);
        f1116f.append(103, 83);
        f1116f.append(102, 84);
        f1116f.append(101, 85);
        f1116f.append(100, 86);
        f1116f.append(93, 97);
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0041  */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m635i(java.lang.Object r8, android.content.res.TypedArray r9, int r10, int r11) {
        /*
            if (r8 != 0) goto L_0x0003
            return
        L_0x0003:
            android.util.TypedValue r0 = r9.peekValue(r10)
            int r0 = r0.type
            r1 = 3
            r2 = 21
            r3 = 23
            r4 = 1
            r5 = -1
            r6 = 5
            r7 = 0
            if (r0 == r1) goto L_0x006a
            r1 = -2
            if (r0 == r6) goto L_0x0029
            int r9 = r9.getInt(r10, r7)
            r10 = -4
            if (r9 == r10) goto L_0x0027
            r10 = -3
            if (r9 == r10) goto L_0x0025
            if (r9 == r1) goto L_0x002d
            if (r9 == r5) goto L_0x002d
        L_0x0025:
            r4 = r7
            goto L_0x002f
        L_0x0027:
            r7 = r1
            goto L_0x002f
        L_0x0029:
            int r9 = r9.getDimensionPixelSize(r10, r7)
        L_0x002d:
            r4 = r7
            r7 = r9
        L_0x002f:
            boolean r9 = r8 instanceof androidx.constraintlayout.widget.ConstraintLayout.C0233a
            if (r9 == 0) goto L_0x0041
            androidx.constraintlayout.widget.ConstraintLayout$a r8 = (androidx.constraintlayout.widget.ConstraintLayout.C0233a) r8
            if (r11 != 0) goto L_0x003c
            r8.width = r7
            r8.f1050V = r4
            goto L_0x0069
        L_0x003c:
            r8.height = r7
            r8.f1051W = r4
            goto L_0x0069
        L_0x0041:
            boolean r9 = r8 instanceof androidx.constraintlayout.widget.C0237b.C0240b
            if (r9 == 0) goto L_0x0053
            androidx.constraintlayout.widget.b$b r8 = (androidx.constraintlayout.widget.C0237b.C0240b) r8
            if (r11 != 0) goto L_0x004e
            r8.f1170c = r7
            r8.f1189l0 = r4
            goto L_0x0069
        L_0x004e:
            r8.f1172d = r7
            r8.f1191m0 = r4
            goto L_0x0069
        L_0x0053:
            boolean r9 = r8 instanceof androidx.constraintlayout.widget.C0237b.C0238a.C0239a
            if (r9 == 0) goto L_0x0069
            androidx.constraintlayout.widget.b$a$a r8 = (androidx.constraintlayout.widget.C0237b.C0238a.C0239a) r8
            if (r11 != 0) goto L_0x0061
            r8.mo1320b(r3, r7)
            r9 = 80
            goto L_0x0066
        L_0x0061:
            r8.mo1320b(r2, r7)
            r9 = 81
        L_0x0066:
            r8.mo1322d(r9, r4)
        L_0x0069:
            return
        L_0x006a:
            java.lang.String r9 = r9.getString(r10)
            if (r9 != 0) goto L_0x0072
            goto L_0x016c
        L_0x0072:
            r10 = 61
            int r10 = r9.indexOf(r10)
            int r0 = r9.length()
            if (r10 <= 0) goto L_0x016c
            int r0 = r0 + r5
            if (r10 >= r0) goto L_0x016c
            java.lang.String r0 = r9.substring(r7, r10)
            int r10 = r10 + r4
            java.lang.String r9 = r9.substring(r10)
            int r10 = r9.length()
            if (r10 <= 0) goto L_0x016c
            java.lang.String r10 = r0.trim()
            java.lang.String r9 = r9.trim()
            java.lang.String r0 = "ratio"
            boolean r0 = r0.equalsIgnoreCase(r10)
            if (r0 == 0) goto L_0x00c7
            boolean r10 = r8 instanceof androidx.constraintlayout.widget.ConstraintLayout.C0233a
            if (r10 == 0) goto L_0x00b2
            androidx.constraintlayout.widget.ConstraintLayout$a r8 = (androidx.constraintlayout.widget.ConstraintLayout.C0233a) r8
            if (r11 != 0) goto L_0x00ab
            r8.width = r7
            goto L_0x00ad
        L_0x00ab:
            r8.height = r7
        L_0x00ad:
            m636j(r8, r9)
            goto L_0x016c
        L_0x00b2:
            boolean r10 = r8 instanceof androidx.constraintlayout.widget.C0237b.C0240b
            if (r10 == 0) goto L_0x00bc
            androidx.constraintlayout.widget.b$b r8 = (androidx.constraintlayout.widget.C0237b.C0240b) r8
            r8.f1205y = r9
            goto L_0x016c
        L_0x00bc:
            boolean r10 = r8 instanceof androidx.constraintlayout.widget.C0237b.C0238a.C0239a
            if (r10 == 0) goto L_0x016c
            androidx.constraintlayout.widget.b$a$a r8 = (androidx.constraintlayout.widget.C0237b.C0238a.C0239a) r8
            r8.mo1321c(r6, r9)
            goto L_0x016c
        L_0x00c7:
            java.lang.String r0 = "weight"
            boolean r0 = r0.equalsIgnoreCase(r10)
            if (r0 == 0) goto L_0x0112
            float r9 = java.lang.Float.parseFloat(r9)     // Catch:{ NumberFormatException -> 0x016c }
            boolean r10 = r8 instanceof androidx.constraintlayout.widget.ConstraintLayout.C0233a     // Catch:{ NumberFormatException -> 0x016c }
            if (r10 == 0) goto L_0x00e7
            androidx.constraintlayout.widget.ConstraintLayout$a r8 = (androidx.constraintlayout.widget.ConstraintLayout.C0233a) r8     // Catch:{ NumberFormatException -> 0x016c }
            if (r11 != 0) goto L_0x00e1
            r8.width = r7     // Catch:{ NumberFormatException -> 0x016c }
            r8.f1035G = r9     // Catch:{ NumberFormatException -> 0x016c }
            goto L_0x016c
        L_0x00e1:
            r8.height = r7     // Catch:{ NumberFormatException -> 0x016c }
            r8.f1036H = r9     // Catch:{ NumberFormatException -> 0x016c }
            goto L_0x016c
        L_0x00e7:
            boolean r10 = r8 instanceof androidx.constraintlayout.widget.C0237b.C0240b     // Catch:{ NumberFormatException -> 0x016c }
            if (r10 == 0) goto L_0x00fb
            androidx.constraintlayout.widget.b$b r8 = (androidx.constraintlayout.widget.C0237b.C0240b) r8     // Catch:{ NumberFormatException -> 0x016c }
            if (r11 != 0) goto L_0x00f5
            r8.f1170c = r7     // Catch:{ NumberFormatException -> 0x016c }
            r8.f1160U = r9     // Catch:{ NumberFormatException -> 0x016c }
            goto L_0x016c
        L_0x00f5:
            r8.f1172d = r7     // Catch:{ NumberFormatException -> 0x016c }
            r8.f1159T = r9     // Catch:{ NumberFormatException -> 0x016c }
            goto L_0x016c
        L_0x00fb:
            boolean r10 = r8 instanceof androidx.constraintlayout.widget.C0237b.C0238a.C0239a     // Catch:{ NumberFormatException -> 0x016c }
            if (r10 == 0) goto L_0x016c
            androidx.constraintlayout.widget.b$a$a r8 = (androidx.constraintlayout.widget.C0237b.C0238a.C0239a) r8     // Catch:{ NumberFormatException -> 0x016c }
            if (r11 != 0) goto L_0x0109
            r8.mo1320b(r3, r7)     // Catch:{ NumberFormatException -> 0x016c }
            r10 = 39
            goto L_0x010e
        L_0x0109:
            r8.mo1320b(r2, r7)     // Catch:{ NumberFormatException -> 0x016c }
            r10 = 40
        L_0x010e:
            r8.mo1319a(r10, r9)     // Catch:{ NumberFormatException -> 0x016c }
            goto L_0x016c
        L_0x0112:
            java.lang.String r0 = "parent"
            boolean r10 = r0.equalsIgnoreCase(r10)
            if (r10 == 0) goto L_0x016c
            r10 = 1065353216(0x3f800000, float:1.0)
            float r9 = java.lang.Float.parseFloat(r9)     // Catch:{ NumberFormatException -> 0x016c }
            float r9 = java.lang.Math.min(r10, r9)     // Catch:{ NumberFormatException -> 0x016c }
            r10 = 0
            float r9 = java.lang.Math.max(r10, r9)     // Catch:{ NumberFormatException -> 0x016c }
            boolean r10 = r8 instanceof androidx.constraintlayout.widget.ConstraintLayout.C0233a     // Catch:{ NumberFormatException -> 0x016c }
            r0 = 2
            if (r10 == 0) goto L_0x0140
            androidx.constraintlayout.widget.ConstraintLayout$a r8 = (androidx.constraintlayout.widget.ConstraintLayout.C0233a) r8     // Catch:{ NumberFormatException -> 0x016c }
            if (r11 != 0) goto L_0x0139
            r8.width = r7     // Catch:{ NumberFormatException -> 0x016c }
            r8.f1045Q = r9     // Catch:{ NumberFormatException -> 0x016c }
            r8.f1039K = r0     // Catch:{ NumberFormatException -> 0x016c }
            goto L_0x016c
        L_0x0139:
            r8.height = r7     // Catch:{ NumberFormatException -> 0x016c }
            r8.f1046R = r9     // Catch:{ NumberFormatException -> 0x016c }
            r8.f1040L = r0     // Catch:{ NumberFormatException -> 0x016c }
            goto L_0x016c
        L_0x0140:
            boolean r10 = r8 instanceof androidx.constraintlayout.widget.C0237b.C0240b     // Catch:{ NumberFormatException -> 0x016c }
            if (r10 == 0) goto L_0x0156
            androidx.constraintlayout.widget.b$b r8 = (androidx.constraintlayout.widget.C0237b.C0240b) r8     // Catch:{ NumberFormatException -> 0x016c }
            if (r11 != 0) goto L_0x014f
            r8.f1170c = r7     // Catch:{ NumberFormatException -> 0x016c }
            r8.f1173d0 = r9     // Catch:{ NumberFormatException -> 0x016c }
            r8.f1163X = r0     // Catch:{ NumberFormatException -> 0x016c }
            goto L_0x016c
        L_0x014f:
            r8.f1172d = r7     // Catch:{ NumberFormatException -> 0x016c }
            r8.f1175e0 = r9     // Catch:{ NumberFormatException -> 0x016c }
            r8.f1164Y = r0     // Catch:{ NumberFormatException -> 0x016c }
            goto L_0x016c
        L_0x0156:
            boolean r9 = r8 instanceof androidx.constraintlayout.widget.C0237b.C0238a.C0239a     // Catch:{ NumberFormatException -> 0x016c }
            if (r9 == 0) goto L_0x016c
            androidx.constraintlayout.widget.b$a$a r8 = (androidx.constraintlayout.widget.C0237b.C0238a.C0239a) r8     // Catch:{ NumberFormatException -> 0x016c }
            if (r11 != 0) goto L_0x0164
            r8.mo1320b(r3, r7)     // Catch:{ NumberFormatException -> 0x016c }
            r9 = 54
            goto L_0x0169
        L_0x0164:
            r8.mo1320b(r2, r7)     // Catch:{ NumberFormatException -> 0x016c }
            r9 = 55
        L_0x0169:
            r8.mo1320b(r9, r0)     // Catch:{ NumberFormatException -> 0x016c }
        L_0x016c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.C0237b.m635i(java.lang.Object, android.content.res.TypedArray, int, int):void");
    }

    /* renamed from: j */
    public static void m636j(ConstraintLayout.C0233a aVar, String str) {
        if (str != null) {
            int length = str.length();
            int indexOf = str.indexOf(44);
            int i = 0;
            int i2 = -1;
            if (indexOf > 0 && indexOf < length - 1) {
                String substring = str.substring(0, indexOf);
                if (!substring.equalsIgnoreCase("W")) {
                    i = substring.equalsIgnoreCase("H") ? 1 : -1;
                }
                i2 = i;
                i = indexOf + 1;
            }
            int indexOf2 = str.indexOf(58);
            if (indexOf2 < 0 || indexOf2 >= length - 1) {
                String substring2 = str.substring(i);
                if (substring2.length() > 0) {
                    Float.parseFloat(substring2);
                }
            } else {
                String substring3 = str.substring(i, indexOf2);
                String substring4 = str.substring(indexOf2 + 1);
                if (substring3.length() > 0 && substring4.length() > 0) {
                    try {
                        float parseFloat = Float.parseFloat(substring3);
                        float parseFloat2 = Float.parseFloat(substring4);
                        if (parseFloat > 0.0f && parseFloat2 > 0.0f) {
                            if (i2 == 1) {
                                Math.abs(parseFloat2 / parseFloat);
                            } else {
                                Math.abs(parseFloat / parseFloat2);
                            }
                        }
                    } catch (NumberFormatException unused) {
                    }
                }
            }
        }
        aVar.f1034F = str;
    }

    /* renamed from: a */
    public void mo1306a(ConstraintLayout constraintLayout) {
        mo1307b(constraintLayout, true);
        constraintLayout.setConstraintSet((C0237b) null);
        constraintLayout.requestLayout();
    }

    /* renamed from: b */
    public void mo1307b(ConstraintLayout constraintLayout, boolean z) {
        int childCount = constraintLayout.getChildCount();
        HashSet hashSet = new HashSet(this.f1119c.keySet());
        for (int i = 0; i < childCount; i++) {
            View childAt = constraintLayout.getChildAt(i);
            int id = childAt.getId();
            if (!this.f1119c.containsKey(Integer.valueOf(id))) {
                C1819a.m5006b(childAt);
            } else if (this.f1118b && id == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            } else if (id != -1 && this.f1119c.containsKey(Integer.valueOf(id))) {
                hashSet.remove(Integer.valueOf(id));
                C0238a aVar = this.f1119c.get(Integer.valueOf(id));
                if (aVar != null) {
                    if (childAt instanceof Barrier) {
                        aVar.f1123d.f1181h0 = 1;
                        Barrier barrier = (Barrier) childAt;
                        barrier.setId(id);
                        barrier.setType(aVar.f1123d.f1177f0);
                        barrier.setMargin(aVar.f1123d.f1179g0);
                        barrier.setAllowsGoneWidget(aVar.f1123d.f1193n0);
                        C0240b bVar = aVar.f1123d;
                        int[] iArr = bVar.f1183i0;
                        if (iArr != null) {
                            barrier.setReferencedIds(iArr);
                        } else {
                            String str = bVar.f1185j0;
                            if (str != null) {
                                bVar.f1183i0 = mo1310e(barrier, str);
                                barrier.setReferencedIds(aVar.f1123d.f1183i0);
                            }
                        }
                    }
                    ConstraintLayout.C0233a aVar2 = (ConstraintLayout.C0233a) childAt.getLayoutParams();
                    aVar2.mo1281a();
                    aVar.mo1315a(aVar2);
                    if (z) {
                        C1955a.m5263b(childAt, aVar.f1125f);
                    }
                    childAt.setLayoutParams(aVar2);
                    C0242d dVar = aVar.f1121b;
                    if (dVar.f1224c == 0) {
                        childAt.setVisibility(dVar.f1223b);
                    }
                    childAt.setAlpha(aVar.f1121b.f1225d);
                    childAt.setRotation(aVar.f1124e.f1229b);
                    childAt.setRotationX(aVar.f1124e.f1230c);
                    childAt.setRotationY(aVar.f1124e.f1231d);
                    childAt.setScaleX(aVar.f1124e.f1232e);
                    childAt.setScaleY(aVar.f1124e.f1233f);
                    C0243e eVar = aVar.f1124e;
                    if (eVar.f1236i != -1) {
                        View findViewById = ((View) childAt.getParent()).findViewById(aVar.f1124e.f1236i);
                        if (findViewById != null) {
                            float bottom = ((float) (findViewById.getBottom() + findViewById.getTop())) / 2.0f;
                            float right = ((float) (findViewById.getRight() + findViewById.getLeft())) / 2.0f;
                            if (childAt.getRight() - childAt.getLeft() > 0 && childAt.getBottom() - childAt.getTop() > 0) {
                                childAt.setPivotX(right - ((float) childAt.getLeft()));
                                childAt.setPivotY(bottom - ((float) childAt.getTop()));
                            }
                        }
                    } else {
                        if (!Float.isNaN(eVar.f1234g)) {
                            childAt.setPivotX(aVar.f1124e.f1234g);
                        }
                        if (!Float.isNaN(aVar.f1124e.f1235h)) {
                            childAt.setPivotY(aVar.f1124e.f1235h);
                        }
                    }
                    childAt.setTranslationX(aVar.f1124e.f1237j);
                    childAt.setTranslationY(aVar.f1124e.f1238k);
                    childAt.setTranslationZ(aVar.f1124e.f1239l);
                    C0243e eVar2 = aVar.f1124e;
                    if (eVar2.f1240m) {
                        childAt.setElevation(eVar2.f1241n);
                    }
                }
            }
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            C0238a aVar3 = this.f1119c.get(num);
            if (aVar3 != null) {
                if (aVar3.f1123d.f1181h0 == 1) {
                    Barrier barrier2 = new Barrier(constraintLayout.getContext());
                    barrier2.setId(num.intValue());
                    C0240b bVar2 = aVar3.f1123d;
                    int[] iArr2 = bVar2.f1183i0;
                    if (iArr2 != null) {
                        barrier2.setReferencedIds(iArr2);
                    } else {
                        String str2 = bVar2.f1185j0;
                        if (str2 != null) {
                            bVar2.f1183i0 = mo1310e(barrier2, str2);
                            barrier2.setReferencedIds(aVar3.f1123d.f1183i0);
                        }
                    }
                    barrier2.setType(aVar3.f1123d.f1177f0);
                    barrier2.setMargin(aVar3.f1123d.f1179g0);
                    ConstraintLayout.C0233a b = constraintLayout.generateDefaultLayoutParams();
                    barrier2.mo1298k();
                    aVar3.mo1315a(b);
                    constraintLayout.addView(barrier2, b);
                }
                if (aVar3.f1123d.f1166a) {
                    Guideline guideline = new Guideline(constraintLayout.getContext());
                    guideline.setId(num.intValue());
                    ConstraintLayout.C0233a b2 = constraintLayout.generateDefaultLayoutParams();
                    aVar3.mo1315a(b2);
                    constraintLayout.addView(guideline, b2);
                }
            }
        }
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt2 = constraintLayout.getChildAt(i2);
            if (childAt2 instanceof C0236a) {
                ((C0236a) childAt2).mo1295g(constraintLayout);
            }
        }
    }

    /* renamed from: c */
    public void mo1308c(ConstraintLayout constraintLayout) {
        C1955a aVar;
        C0237b bVar = this;
        int childCount = constraintLayout.getChildCount();
        bVar.f1119c.clear();
        int i = 0;
        while (i < childCount) {
            View childAt = constraintLayout.getChildAt(i);
            ConstraintLayout.C0233a aVar2 = (ConstraintLayout.C0233a) childAt.getLayoutParams();
            int id = childAt.getId();
            if (!bVar.f1118b || id != -1) {
                if (!bVar.f1119c.containsKey(Integer.valueOf(id))) {
                    bVar.f1119c.put(Integer.valueOf(id), new C0238a());
                }
                C0238a aVar3 = bVar.f1119c.get(Integer.valueOf(id));
                if (aVar3 != null) {
                    HashMap<String, C1955a> hashMap = bVar.f1117a;
                    HashMap<String, C1955a> hashMap2 = new HashMap<>();
                    Class<?> cls = childAt.getClass();
                    for (String next : hashMap.keySet()) {
                        C1955a aVar4 = hashMap.get(next);
                        try {
                            if (next.equals("BackgroundColor")) {
                                aVar = new C1955a(aVar4, Integer.valueOf(((ColorDrawable) childAt.getBackground()).getColor()));
                            } else {
                                try {
                                    aVar = new C1955a(aVar4, cls.getMethod("getMap" + next, new Class[0]).invoke(childAt, new Object[0]));
                                } catch (NoSuchMethodException e) {
                                    e = e;
                                    e.printStackTrace();
                                } catch (IllegalAccessException e2) {
                                    e = e2;
                                    e.printStackTrace();
                                } catch (InvocationTargetException e3) {
                                    e = e3;
                                    e.printStackTrace();
                                }
                            }
                            hashMap2.put(next, aVar);
                        } catch (NoSuchMethodException e4) {
                            e = e4;
                            e.printStackTrace();
                        } catch (IllegalAccessException e5) {
                            e = e5;
                            e.printStackTrace();
                        } catch (InvocationTargetException e6) {
                            e = e6;
                            e.printStackTrace();
                        }
                    }
                    aVar3.f1125f = hashMap2;
                    aVar3.mo1316b(id, aVar2);
                    aVar3.f1121b.f1223b = childAt.getVisibility();
                    aVar3.f1121b.f1225d = childAt.getAlpha();
                    aVar3.f1124e.f1229b = childAt.getRotation();
                    aVar3.f1124e.f1230c = childAt.getRotationX();
                    aVar3.f1124e.f1231d = childAt.getRotationY();
                    aVar3.f1124e.f1232e = childAt.getScaleX();
                    aVar3.f1124e.f1233f = childAt.getScaleY();
                    float pivotX = childAt.getPivotX();
                    float pivotY = childAt.getPivotY();
                    if (!(((double) pivotX) == 0.0d && ((double) pivotY) == 0.0d)) {
                        C0243e eVar = aVar3.f1124e;
                        eVar.f1234g = pivotX;
                        eVar.f1235h = pivotY;
                    }
                    aVar3.f1124e.f1237j = childAt.getTranslationX();
                    aVar3.f1124e.f1238k = childAt.getTranslationY();
                    aVar3.f1124e.f1239l = childAt.getTranslationZ();
                    C0243e eVar2 = aVar3.f1124e;
                    if (eVar2.f1240m) {
                        eVar2.f1241n = childAt.getElevation();
                    }
                    if (childAt instanceof Barrier) {
                        Barrier barrier = (Barrier) childAt;
                        aVar3.f1123d.f1193n0 = barrier.getAllowsGoneWidget();
                        aVar3.f1123d.f1183i0 = barrier.getReferencedIds();
                        aVar3.f1123d.f1177f0 = barrier.getType();
                        aVar3.f1123d.f1179g0 = barrier.getMargin();
                    }
                }
                i++;
                bVar = this;
            } else {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
        }
    }

    /* renamed from: d */
    public void mo1309d(int i, int i2, int i3, int i4, int i5) {
        C0240b bVar;
        C0240b bVar2;
        C0240b bVar3;
        if (!this.f1119c.containsKey(Integer.valueOf(i))) {
            this.f1119c.put(Integer.valueOf(i), new C0238a());
        }
        C0238a aVar = this.f1119c.get(Integer.valueOf(i));
        if (aVar != null) {
            switch (i2) {
                case 1:
                    if (i4 == 1) {
                        C0240b bVar4 = aVar.f1123d;
                        bVar4.f1180h = i3;
                        bVar4.f1182i = -1;
                    } else if (i4 == 2) {
                        C0240b bVar5 = aVar.f1123d;
                        bVar5.f1182i = i3;
                        bVar5.f1180h = -1;
                    } else {
                        StringBuilder a = C0001b.m0a("Left to ");
                        a.append(mo1314k(i4));
                        a.append(" undefined");
                        throw new IllegalArgumentException(a.toString());
                    }
                    aVar.f1123d.f1145F = i5;
                    return;
                case 2:
                    if (i4 == 1) {
                        C0240b bVar6 = aVar.f1123d;
                        bVar6.f1184j = i3;
                        bVar6.f1186k = -1;
                    } else if (i4 == 2) {
                        C0240b bVar7 = aVar.f1123d;
                        bVar7.f1186k = i3;
                        bVar7.f1184j = -1;
                    } else {
                        StringBuilder a2 = C0001b.m0a("right to ");
                        a2.append(mo1314k(i4));
                        a2.append(" undefined");
                        throw new IllegalArgumentException(a2.toString());
                    }
                    aVar.f1123d.f1146G = i5;
                    return;
                case 3:
                    if (i4 == 3) {
                        bVar = aVar.f1123d;
                        bVar.f1188l = i3;
                        bVar.f1190m = -1;
                    } else if (i4 == 4) {
                        bVar = aVar.f1123d;
                        bVar.f1190m = i3;
                        bVar.f1188l = -1;
                    } else {
                        StringBuilder a3 = C0001b.m0a("right to ");
                        a3.append(mo1314k(i4));
                        a3.append(" undefined");
                        throw new IllegalArgumentException(a3.toString());
                    }
                    bVar.f1196p = -1;
                    bVar.f1197q = -1;
                    bVar.f1198r = -1;
                    aVar.f1123d.f1147H = i5;
                    return;
                case 4:
                    if (i4 == 4) {
                        bVar2 = aVar.f1123d;
                        bVar2.f1194o = i3;
                        bVar2.f1192n = -1;
                    } else if (i4 == 3) {
                        bVar2 = aVar.f1123d;
                        bVar2.f1192n = i3;
                        bVar2.f1194o = -1;
                    } else {
                        StringBuilder a4 = C0001b.m0a("right to ");
                        a4.append(mo1314k(i4));
                        a4.append(" undefined");
                        throw new IllegalArgumentException(a4.toString());
                    }
                    bVar2.f1196p = -1;
                    bVar2.f1197q = -1;
                    bVar2.f1198r = -1;
                    aVar.f1123d.f1148I = i5;
                    return;
                case 5:
                    if (i4 == 5) {
                        bVar3 = aVar.f1123d;
                        bVar3.f1196p = i3;
                    } else if (i4 == 3) {
                        bVar3 = aVar.f1123d;
                        bVar3.f1197q = i3;
                    } else if (i4 == 4) {
                        bVar3 = aVar.f1123d;
                        bVar3.f1198r = i3;
                    } else {
                        StringBuilder a5 = C0001b.m0a("right to ");
                        a5.append(mo1314k(i4));
                        a5.append(" undefined");
                        throw new IllegalArgumentException(a5.toString());
                    }
                    bVar3.f1194o = -1;
                    bVar3.f1192n = -1;
                    bVar3.f1188l = -1;
                    bVar3.f1190m = -1;
                    return;
                case 6:
                    if (i4 == 6) {
                        C0240b bVar8 = aVar.f1123d;
                        bVar8.f1200t = i3;
                        bVar8.f1199s = -1;
                    } else if (i4 == 7) {
                        C0240b bVar9 = aVar.f1123d;
                        bVar9.f1199s = i3;
                        bVar9.f1200t = -1;
                    } else {
                        StringBuilder a6 = C0001b.m0a("right to ");
                        a6.append(mo1314k(i4));
                        a6.append(" undefined");
                        throw new IllegalArgumentException(a6.toString());
                    }
                    aVar.f1123d.f1150K = i5;
                    return;
                case 7:
                    if (i4 == 7) {
                        C0240b bVar10 = aVar.f1123d;
                        bVar10.f1202v = i3;
                        bVar10.f1201u = -1;
                    } else if (i4 == 6) {
                        C0240b bVar11 = aVar.f1123d;
                        bVar11.f1201u = i3;
                        bVar11.f1202v = -1;
                    } else {
                        StringBuilder a7 = C0001b.m0a("right to ");
                        a7.append(mo1314k(i4));
                        a7.append(" undefined");
                        throw new IllegalArgumentException(a7.toString());
                    }
                    aVar.f1123d.f1149J = i5;
                    return;
                default:
                    throw new IllegalArgumentException(mo1314k(i2) + " to " + mo1314k(i4) + " unknown");
            }
        }
    }

    /* renamed from: e */
    public final int[] mo1310e(View view, String str) {
        int i;
        Object c;
        String[] split = str.split(",");
        Context context = view.getContext();
        int[] iArr = new int[split.length];
        int i2 = 0;
        int i3 = 0;
        while (i2 < split.length) {
            String trim = split[i2].trim();
            try {
                i = C1960d.class.getField(trim).getInt((Object) null);
            } catch (Exception unused) {
                i = 0;
            }
            if (i == 0) {
                i = context.getResources().getIdentifier(trim, "id", context.getPackageName());
            }
            if (i == 0 && view.isInEditMode() && (view.getParent() instanceof ConstraintLayout) && (c = ((ConstraintLayout) view.getParent()).mo1246c(0, trim)) != null && (c instanceof Integer)) {
                i = ((Integer) c).intValue();
            }
            iArr[i3] = i;
            i2++;
            i3++;
        }
        return i3 != split.length ? Arrays.copyOf(iArr, i3) : iArr;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x02f1, code lost:
        if (r5 == -1) goto L_0x02f3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x02f3, code lost:
        r5 = r1.getInt(r14, -1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x02ff, code lost:
        r5 = r1.getFloat(r14, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x0303, code lost:
        r12.mo1319a(r4, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:162:0x043d, code lost:
        if (r6.f1221n != -1) goto L_0x0460;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:309:0x09eb, code lost:
        r5 = r5 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00a4, code lost:
        r16 = r5;
        r5 = r1.getLayoutDimension(r14, r4);
        r4 = r16;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x0183, code lost:
        r5 = r1.getDimension(r14, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x0252, code lost:
        if (r5 == -1) goto L_0x02f3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x025c, code lost:
        r5 = r1.getInteger(r14, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x0292, code lost:
        r12.mo1322d(r4, r1.getBoolean(r14, r5));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x02b4, code lost:
        r5 = 1.0f;
     */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final androidx.constraintlayout.widget.C0237b.C0238a mo1311f(android.content.Context r18, android.util.AttributeSet r19, boolean r20) {
        /*
            r17 = this;
            androidx.constraintlayout.widget.b$a r0 = new androidx.constraintlayout.widget.b$a
            r0.<init>()
            if (r20 == 0) goto L_0x000a
            int[] r1 = p129v.C1961e.f5785c
            goto L_0x000c
        L_0x000a:
            int[] r1 = p129v.C1961e.f5783a
        L_0x000c:
            r2 = r18
            r3 = r19
            android.content.res.TypedArray r1 = r2.obtainStyledAttributes(r3, r1)
            java.lang.String r2 = "/"
            r3 = 3
            r4 = 0
            r9 = 1
            r10 = -1
            if (r20 == 0) goto L_0x0394
            int r11 = r1.getIndexCount()
            androidx.constraintlayout.widget.b$a$a r12 = new androidx.constraintlayout.widget.b$a$a
            r12.<init>()
            r0.f1126g = r12
            androidx.constraintlayout.widget.b$c r13 = r0.f1122c
            r13.f1208a = r4
            androidx.constraintlayout.widget.b$b r13 = r0.f1123d
            r13.f1168b = r4
            androidx.constraintlayout.widget.b$d r13 = r0.f1121b
            r13.f1222a = r4
            androidx.constraintlayout.widget.b$e r13 = r0.f1124e
            r13.f1228a = r4
            r13 = r4
        L_0x0038:
            if (r13 >= r11) goto L_0x09ef
            int r14 = r1.getIndex(r13)
            android.util.SparseIntArray r15 = f1116f
            int r15 = r15.get(r14)
            r8 = 28
            r5 = 8
            r6 = 34
            r4 = 31
            r7 = 2
            if (r15 == r7) goto L_0x0382
            if (r15 == r4) goto L_0x037b
            if (r15 == r6) goto L_0x0375
            r4 = 5
            if (r15 == r4) goto L_0x036b
            r4 = 7
            r6 = 6
            if (r15 == r6) goto L_0x0361
            if (r15 == r4) goto L_0x035c
            if (r15 == r5) goto L_0x0356
            r4 = 27
            if (r15 == r4) goto L_0x034d
            if (r15 == r8) goto L_0x0348
            switch(r15) {
                case 11: goto L_0x00f7;
                case 12: goto L_0x00ef;
                case 13: goto L_0x00e7;
                case 14: goto L_0x00df;
                case 15: goto L_0x00d7;
                case 16: goto L_0x00cf;
                case 17: goto L_0x00c7;
                case 18: goto L_0x00bf;
                case 19: goto L_0x00b7;
                case 20: goto L_0x00af;
                case 21: goto L_0x0099;
                case 22: goto L_0x0089;
                case 23: goto L_0x0082;
                case 24: goto L_0x007a;
                default: goto L_0x0067;
            }
        L_0x0067:
            switch(r15) {
                case 37: goto L_0x01bd;
                case 38: goto L_0x01b1;
                case 39: goto L_0x01a9;
                case 40: goto L_0x01a1;
                case 41: goto L_0x0199;
                case 42: goto L_0x0191;
                case 43: goto L_0x0189;
                case 44: goto L_0x017a;
                case 45: goto L_0x0172;
                case 46: goto L_0x016a;
                case 47: goto L_0x0162;
                case 48: goto L_0x015a;
                case 49: goto L_0x0153;
                case 50: goto L_0x014c;
                case 51: goto L_0x0145;
                case 52: goto L_0x013e;
                case 53: goto L_0x0137;
                case 54: goto L_0x012f;
                case 55: goto L_0x0127;
                case 56: goto L_0x011f;
                case 57: goto L_0x0117;
                case 58: goto L_0x010f;
                case 59: goto L_0x0107;
                case 60: goto L_0x00ff;
                default: goto L_0x006a;
            }
        L_0x006a:
            switch(r15) {
                case 62: goto L_0x0308;
                case 63: goto L_0x02f9;
                case 64: goto L_0x02e7;
                case 65: goto L_0x02cf;
                case 66: goto L_0x02c5;
                case 67: goto L_0x02be;
                case 68: goto L_0x02b7;
                case 69: goto L_0x02b2;
                case 70: goto L_0x02af;
                case 71: goto L_0x038f;
                case 72: goto L_0x02a7;
                case 73: goto L_0x029f;
                case 74: goto L_0x029b;
                case 75: goto L_0x028c;
                case 76: goto L_0x0284;
                case 77: goto L_0x0280;
                case 78: goto L_0x0278;
                case 79: goto L_0x0270;
                case 80: goto L_0x0269;
                case 81: goto L_0x0262;
                case 82: goto L_0x0256;
                case 83: goto L_0x0248;
                case 84: goto L_0x0241;
                case 85: goto L_0x0239;
                case 86: goto L_0x01c5;
                default: goto L_0x006d;
            }
        L_0x006d:
            switch(r15) {
                case 93: goto L_0x0341;
                case 94: goto L_0x033a;
                case 95: goto L_0x0335;
                case 96: goto L_0x0330;
                case 97: goto L_0x0329;
                case 98: goto L_0x0310;
                default: goto L_0x0070;
            }
        L_0x0070:
            java.lang.Integer.toHexString(r14)
            android.util.SparseIntArray r4 = f1115e
            r4.get(r14)
            goto L_0x038f
        L_0x007a:
            androidx.constraintlayout.widget.b$b r4 = r0.f1123d
            int r4 = r4.f1145F
            r8 = 24
            goto L_0x0387
        L_0x0082:
            androidx.constraintlayout.widget.b$b r4 = r0.f1123d
            int r4 = r4.f1170c
            r5 = 23
            goto L_0x00a4
        L_0x0089:
            r4 = 22
            int[] r5 = f1114d
            androidx.constraintlayout.widget.b$d r6 = r0.f1121b
            int r6 = r6.f1223b
            int r6 = r1.getInt(r14, r6)
            r5 = r5[r6]
            goto L_0x038c
        L_0x0099:
            r4 = 21
            androidx.constraintlayout.widget.b$b r5 = r0.f1123d
            int r5 = r5.f1172d
            r16 = r5
            r5 = r4
            r4 = r16
        L_0x00a4:
            int r4 = r1.getLayoutDimension(r14, r4)
            r16 = r5
            r5 = r4
            r4 = r16
            goto L_0x038c
        L_0x00af:
            r4 = 20
            androidx.constraintlayout.widget.b$b r5 = r0.f1123d
            float r5 = r5.f1203w
            goto L_0x02ff
        L_0x00b7:
            r4 = 19
            androidx.constraintlayout.widget.b$b r5 = r0.f1123d
            float r5 = r5.f1178g
            goto L_0x02ff
        L_0x00bf:
            r4 = 18
            androidx.constraintlayout.widget.b$b r5 = r0.f1123d
            int r5 = r5.f1176f
            goto L_0x0366
        L_0x00c7:
            r4 = 17
            androidx.constraintlayout.widget.b$b r5 = r0.f1123d
            int r5 = r5.f1174e
            goto L_0x0366
        L_0x00cf:
            r8 = 16
            androidx.constraintlayout.widget.b$b r4 = r0.f1123d
            int r4 = r4.f1153N
            goto L_0x0387
        L_0x00d7:
            r8 = 15
            androidx.constraintlayout.widget.b$b r4 = r0.f1123d
            int r4 = r4.f1157R
            goto L_0x0387
        L_0x00df:
            r8 = 14
            androidx.constraintlayout.widget.b$b r4 = r0.f1123d
            int r4 = r4.f1154O
            goto L_0x0387
        L_0x00e7:
            r8 = 13
            androidx.constraintlayout.widget.b$b r4 = r0.f1123d
            int r4 = r4.f1152M
            goto L_0x0387
        L_0x00ef:
            r8 = 12
            androidx.constraintlayout.widget.b$b r4 = r0.f1123d
            int r4 = r4.f1156Q
            goto L_0x0387
        L_0x00f7:
            r8 = 11
            androidx.constraintlayout.widget.b$b r4 = r0.f1123d
            int r4 = r4.f1155P
            goto L_0x0387
        L_0x00ff:
            r4 = 60
            androidx.constraintlayout.widget.b$e r5 = r0.f1124e
            float r5 = r5.f1229b
            goto L_0x02ff
        L_0x0107:
            r8 = 59
            androidx.constraintlayout.widget.b$b r4 = r0.f1123d
            int r4 = r4.f1171c0
            goto L_0x0387
        L_0x010f:
            r8 = 58
            androidx.constraintlayout.widget.b$b r4 = r0.f1123d
            int r4 = r4.f1169b0
            goto L_0x0387
        L_0x0117:
            r8 = 57
            androidx.constraintlayout.widget.b$b r4 = r0.f1123d
            int r4 = r4.f1167a0
            goto L_0x0387
        L_0x011f:
            r8 = 56
            androidx.constraintlayout.widget.b$b r4 = r0.f1123d
            int r4 = r4.f1165Z
            goto L_0x0387
        L_0x0127:
            r4 = 55
            androidx.constraintlayout.widget.b$b r5 = r0.f1123d
            int r5 = r5.f1164Y
            goto L_0x0351
        L_0x012f:
            r4 = 54
            androidx.constraintlayout.widget.b$b r5 = r0.f1123d
            int r5 = r5.f1163X
            goto L_0x0351
        L_0x0137:
            r4 = 53
            androidx.constraintlayout.widget.b$e r5 = r0.f1124e
            float r5 = r5.f1239l
            goto L_0x0183
        L_0x013e:
            r4 = 52
            androidx.constraintlayout.widget.b$e r5 = r0.f1124e
            float r5 = r5.f1238k
            goto L_0x0183
        L_0x0145:
            r4 = 51
            androidx.constraintlayout.widget.b$e r5 = r0.f1124e
            float r5 = r5.f1237j
            goto L_0x0183
        L_0x014c:
            r4 = 50
            androidx.constraintlayout.widget.b$e r5 = r0.f1124e
            float r5 = r5.f1235h
            goto L_0x0183
        L_0x0153:
            r4 = 49
            androidx.constraintlayout.widget.b$e r5 = r0.f1124e
            float r5 = r5.f1234g
            goto L_0x0183
        L_0x015a:
            r4 = 48
            androidx.constraintlayout.widget.b$e r5 = r0.f1124e
            float r5 = r5.f1233f
            goto L_0x02ff
        L_0x0162:
            r4 = 47
            androidx.constraintlayout.widget.b$e r5 = r0.f1124e
            float r5 = r5.f1232e
            goto L_0x02ff
        L_0x016a:
            r4 = 46
            androidx.constraintlayout.widget.b$e r5 = r0.f1124e
            float r5 = r5.f1231d
            goto L_0x02ff
        L_0x0172:
            r4 = 45
            androidx.constraintlayout.widget.b$e r5 = r0.f1124e
            float r5 = r5.f1230c
            goto L_0x02ff
        L_0x017a:
            r4 = 44
            r12.mo1322d(r4, r9)
            androidx.constraintlayout.widget.b$e r5 = r0.f1124e
            float r5 = r5.f1241n
        L_0x0183:
            float r5 = r1.getDimension(r14, r5)
            goto L_0x0303
        L_0x0189:
            r4 = 43
            androidx.constraintlayout.widget.b$d r5 = r0.f1121b
            float r5 = r5.f1225d
            goto L_0x02ff
        L_0x0191:
            r4 = 42
            androidx.constraintlayout.widget.b$b r5 = r0.f1123d
            int r5 = r5.f1162W
            goto L_0x0351
        L_0x0199:
            r4 = 41
            androidx.constraintlayout.widget.b$b r5 = r0.f1123d
            int r5 = r5.f1161V
            goto L_0x0351
        L_0x01a1:
            r4 = 40
            androidx.constraintlayout.widget.b$b r5 = r0.f1123d
            float r5 = r5.f1159T
            goto L_0x02ff
        L_0x01a9:
            r4 = 39
            androidx.constraintlayout.widget.b$b r5 = r0.f1123d
            float r5 = r5.f1160U
            goto L_0x02ff
        L_0x01b1:
            int r4 = r0.f1120a
            int r5 = r1.getResourceId(r14, r4)
            r0.f1120a = r5
            r4 = 38
            goto L_0x038c
        L_0x01bd:
            r4 = 37
            androidx.constraintlayout.widget.b$b r5 = r0.f1123d
            float r5 = r5.f1204x
            goto L_0x02ff
        L_0x01c5:
            android.util.TypedValue r4 = r1.peekValue(r14)
            int r4 = r4.type
            r5 = 89
            r6 = 88
            if (r4 != r9) goto L_0x01e7
            androidx.constraintlayout.widget.b$c r4 = r0.f1122c
            int r7 = r1.getResourceId(r14, r10)
            r4.f1221n = r7
            androidx.constraintlayout.widget.b$c r4 = r0.f1122c
            int r4 = r4.f1221n
            r12.mo1320b(r5, r4)
            androidx.constraintlayout.widget.b$c r4 = r0.f1122c
            int r5 = r4.f1221n
            if (r5 == r10) goto L_0x038f
            goto L_0x0215
        L_0x01e7:
            if (r4 != r3) goto L_0x0226
            androidx.constraintlayout.widget.b$c r4 = r0.f1122c
            java.lang.String r7 = r1.getString(r14)
            r4.f1219l = r7
            r4 = 90
            androidx.constraintlayout.widget.b$c r7 = r0.f1122c
            java.lang.String r7 = r7.f1219l
            r12.mo1321c(r4, r7)
            androidx.constraintlayout.widget.b$c r4 = r0.f1122c
            java.lang.String r4 = r4.f1219l
            int r4 = r4.indexOf(r2)
            if (r4 <= 0) goto L_0x021d
            androidx.constraintlayout.widget.b$c r4 = r0.f1122c
            int r7 = r1.getResourceId(r14, r10)
            r4.f1221n = r7
            androidx.constraintlayout.widget.b$c r4 = r0.f1122c
            int r4 = r4.f1221n
            r12.mo1320b(r5, r4)
            androidx.constraintlayout.widget.b$c r4 = r0.f1122c
        L_0x0215:
            r5 = -2
            r4.f1220m = r5
            r12.mo1320b(r6, r5)
            goto L_0x038f
        L_0x021d:
            androidx.constraintlayout.widget.b$c r4 = r0.f1122c
            r4.f1220m = r10
            r12.mo1320b(r6, r10)
            goto L_0x038f
        L_0x0226:
            androidx.constraintlayout.widget.b$c r4 = r0.f1122c
            int r5 = r4.f1221n
            int r5 = r1.getInteger(r14, r5)
            r4.f1220m = r5
            androidx.constraintlayout.widget.b$c r4 = r0.f1122c
            int r4 = r4.f1220m
            r12.mo1320b(r6, r4)
            goto L_0x038f
        L_0x0239:
            r4 = 85
            androidx.constraintlayout.widget.b$c r5 = r0.f1122c
            float r5 = r5.f1217j
            goto L_0x02ff
        L_0x0241:
            r4 = 84
            androidx.constraintlayout.widget.b$c r5 = r0.f1122c
            int r5 = r5.f1218k
            goto L_0x025c
        L_0x0248:
            r4 = 83
            androidx.constraintlayout.widget.b$e r5 = r0.f1124e
            int r5 = r5.f1236i
            int r5 = r1.getResourceId(r14, r5)
            if (r5 != r10) goto L_0x038c
            goto L_0x02f3
        L_0x0256:
            r4 = 82
            androidx.constraintlayout.widget.b$c r5 = r0.f1122c
            int r5 = r5.f1210c
        L_0x025c:
            int r5 = r1.getInteger(r14, r5)
            goto L_0x038c
        L_0x0262:
            r4 = 81
            androidx.constraintlayout.widget.b$b r5 = r0.f1123d
            boolean r5 = r5.f1191m0
            goto L_0x0292
        L_0x0269:
            r4 = 80
            androidx.constraintlayout.widget.b$b r5 = r0.f1123d
            boolean r5 = r5.f1189l0
            goto L_0x0292
        L_0x0270:
            r4 = 79
            androidx.constraintlayout.widget.b$c r5 = r0.f1122c
            float r5 = r5.f1214g
            goto L_0x02ff
        L_0x0278:
            r4 = 78
            androidx.constraintlayout.widget.b$d r5 = r0.f1121b
            int r5 = r5.f1224c
            goto L_0x0351
        L_0x0280:
            r4 = 77
            goto L_0x036b
        L_0x0284:
            r4 = 76
            androidx.constraintlayout.widget.b$c r5 = r0.f1122c
            int r5 = r5.f1212e
            goto L_0x0351
        L_0x028c:
            r4 = 75
            androidx.constraintlayout.widget.b$b r5 = r0.f1123d
            boolean r5 = r5.f1193n0
        L_0x0292:
            boolean r5 = r1.getBoolean(r14, r5)
            r12.mo1322d(r4, r5)
            goto L_0x038f
        L_0x029b:
            r4 = 74
            goto L_0x036b
        L_0x029f:
            r8 = 73
            androidx.constraintlayout.widget.b$b r4 = r0.f1123d
            int r4 = r4.f1179g0
            goto L_0x0387
        L_0x02a7:
            r4 = 72
            androidx.constraintlayout.widget.b$b r5 = r0.f1123d
            int r5 = r5.f1177f0
            goto L_0x0351
        L_0x02af:
            r4 = 70
            goto L_0x02b4
        L_0x02b2:
            r4 = 69
        L_0x02b4:
            r5 = 1065353216(0x3f800000, float:1.0)
            goto L_0x02ff
        L_0x02b7:
            r4 = 68
            androidx.constraintlayout.widget.b$d r5 = r0.f1121b
            float r5 = r5.f1226e
            goto L_0x02ff
        L_0x02be:
            r4 = 67
            androidx.constraintlayout.widget.b$c r5 = r0.f1122c
            float r5 = r5.f1216i
            goto L_0x02ff
        L_0x02c5:
            r4 = 66
            r5 = 0
            int r6 = r1.getInt(r14, r5)
            r5 = r6
            goto L_0x038c
        L_0x02cf:
            r5 = 0
            android.util.TypedValue r4 = r1.peekValue(r14)
            int r4 = r4.type
            r6 = 65
            if (r4 != r3) goto L_0x02dd
            r4 = r6
            goto L_0x036b
        L_0x02dd:
            java.lang.String[] r4 = p105r.C1632a.f5008c
            int r7 = r1.getInteger(r14, r5)
            r4 = r4[r7]
            goto L_0x0371
        L_0x02e7:
            r4 = 64
            androidx.constraintlayout.widget.b$c r5 = r0.f1122c
            int r5 = r5.f1209b
            int r5 = r1.getResourceId(r14, r5)
            if (r5 != r10) goto L_0x038c
        L_0x02f3:
            int r5 = r1.getInt(r14, r10)
            goto L_0x038c
        L_0x02f9:
            r4 = 63
            androidx.constraintlayout.widget.b$b r5 = r0.f1123d
            float r5 = r5.f1141B
        L_0x02ff:
            float r5 = r1.getFloat(r14, r5)
        L_0x0303:
            r12.mo1319a(r4, r5)
            goto L_0x038f
        L_0x0308:
            r8 = 62
            androidx.constraintlayout.widget.b$b r4 = r0.f1123d
            int r4 = r4.f1140A
            goto L_0x0387
        L_0x0310:
            int r4 = p123u.C1822d.f5491S
            android.util.TypedValue r4 = r1.peekValue(r14)
            int r4 = r4.type
            if (r4 != r3) goto L_0x031f
            r1.getString(r14)
            goto L_0x038f
        L_0x031f:
            int r4 = r0.f1120a
            int r4 = r1.getResourceId(r14, r4)
            r0.f1120a = r4
            goto L_0x038f
        L_0x0329:
            r4 = 97
            androidx.constraintlayout.widget.b$b r5 = r0.f1123d
            int r5 = r5.f1195o0
            goto L_0x0351
        L_0x0330:
            m635i(r12, r1, r14, r9)
            goto L_0x038f
        L_0x0335:
            r4 = 0
            m635i(r12, r1, r14, r4)
            goto L_0x038f
        L_0x033a:
            r8 = 94
            androidx.constraintlayout.widget.b$b r4 = r0.f1123d
            int r4 = r4.f1158S
            goto L_0x0387
        L_0x0341:
            r8 = 93
            androidx.constraintlayout.widget.b$b r4 = r0.f1123d
            int r4 = r4.f1151L
            goto L_0x0387
        L_0x0348:
            androidx.constraintlayout.widget.b$b r4 = r0.f1123d
            int r4 = r4.f1146G
            goto L_0x0387
        L_0x034d:
            androidx.constraintlayout.widget.b$b r5 = r0.f1123d
            int r5 = r5.f1144E
        L_0x0351:
            int r5 = r1.getInt(r14, r5)
            goto L_0x038c
        L_0x0356:
            androidx.constraintlayout.widget.b$b r4 = r0.f1123d
            int r4 = r4.f1149J
            r8 = r5
            goto L_0x0387
        L_0x035c:
            androidx.constraintlayout.widget.b$b r5 = r0.f1123d
            int r5 = r5.f1143D
            goto L_0x0366
        L_0x0361:
            androidx.constraintlayout.widget.b$b r4 = r0.f1123d
            int r5 = r4.f1142C
            r4 = r6
        L_0x0366:
            int r5 = r1.getDimensionPixelOffset(r14, r5)
            goto L_0x038c
        L_0x036b:
            java.lang.String r5 = r1.getString(r14)
            r6 = r4
            r4 = r5
        L_0x0371:
            r12.mo1321c(r6, r4)
            goto L_0x038f
        L_0x0375:
            androidx.constraintlayout.widget.b$b r4 = r0.f1123d
            int r4 = r4.f1147H
            r8 = r6
            goto L_0x0387
        L_0x037b:
            androidx.constraintlayout.widget.b$b r5 = r0.f1123d
            int r5 = r5.f1150K
            r8 = r4
            r4 = r5
            goto L_0x0387
        L_0x0382:
            androidx.constraintlayout.widget.b$b r4 = r0.f1123d
            int r4 = r4.f1148I
            r8 = r7
        L_0x0387:
            int r5 = r1.getDimensionPixelSize(r14, r4)
            r4 = r8
        L_0x038c:
            r12.mo1320b(r4, r5)
        L_0x038f:
            int r13 = r13 + 1
            r4 = 0
            goto L_0x0038
        L_0x0394:
            int r4 = r1.getIndexCount()
            r5 = 0
        L_0x0399:
            if (r5 >= r4) goto L_0x09ef
            int r6 = r1.getIndex(r5)
            r7 = 23
            r8 = 24
            if (r6 == r9) goto L_0x03b9
            if (r7 == r6) goto L_0x03b9
            if (r8 == r6) goto L_0x03b9
            androidx.constraintlayout.widget.b$c r11 = r0.f1122c
            r11.f1208a = r9
            androidx.constraintlayout.widget.b$b r11 = r0.f1123d
            r11.f1168b = r9
            androidx.constraintlayout.widget.b$d r11 = r0.f1121b
            r11.f1222a = r9
            androidx.constraintlayout.widget.b$e r11 = r0.f1124e
            r11.f1228a = r9
        L_0x03b9:
            android.util.SparseIntArray r11 = f1115e
            int r11 = r11.get(r6)
            switch(r11) {
                case 1: goto L_0x09d7;
                case 2: goto L_0x09c8;
                case 3: goto L_0x09b3;
                case 4: goto L_0x099e;
                case 5: goto L_0x0991;
                case 6: goto L_0x0982;
                case 7: goto L_0x0973;
                case 8: goto L_0x0963;
                case 9: goto L_0x094d;
                case 10: goto L_0x0937;
                case 11: goto L_0x0927;
                case 12: goto L_0x0917;
                case 13: goto L_0x0907;
                case 14: goto L_0x08f7;
                case 15: goto L_0x08e7;
                case 16: goto L_0x08d7;
                case 17: goto L_0x08c7;
                case 18: goto L_0x08b7;
                case 19: goto L_0x08a7;
                case 20: goto L_0x0897;
                case 21: goto L_0x0887;
                case 22: goto L_0x086d;
                case 23: goto L_0x085d;
                case 24: goto L_0x084d;
                case 25: goto L_0x0837;
                case 26: goto L_0x0821;
                case 27: goto L_0x0811;
                case 28: goto L_0x0801;
                case 29: goto L_0x07eb;
                case 30: goto L_0x07d5;
                case 31: goto L_0x07c5;
                case 32: goto L_0x07af;
                case 33: goto L_0x0799;
                case 34: goto L_0x0789;
                case 35: goto L_0x0773;
                case 36: goto L_0x075d;
                case 37: goto L_0x074d;
                case 38: goto L_0x073f;
                case 39: goto L_0x072f;
                case 40: goto L_0x071f;
                case 41: goto L_0x070f;
                case 42: goto L_0x06ff;
                case 43: goto L_0x06ef;
                case 44: goto L_0x06dd;
                case 45: goto L_0x06cd;
                case 46: goto L_0x06bd;
                case 47: goto L_0x06ad;
                case 48: goto L_0x069d;
                case 49: goto L_0x068d;
                case 50: goto L_0x067d;
                case 51: goto L_0x066d;
                case 52: goto L_0x065d;
                case 53: goto L_0x064d;
                case 54: goto L_0x063d;
                case 55: goto L_0x062d;
                case 56: goto L_0x061d;
                case 57: goto L_0x060d;
                case 58: goto L_0x05fd;
                case 59: goto L_0x05ed;
                case 60: goto L_0x05dd;
                case 61: goto L_0x05c7;
                case 62: goto L_0x05b7;
                case 63: goto L_0x05a7;
                case 64: goto L_0x0591;
                case 65: goto L_0x0570;
                case 66: goto L_0x0562;
                case 67: goto L_0x0553;
                case 68: goto L_0x0544;
                case 69: goto L_0x0537;
                case 70: goto L_0x052a;
                case 71: goto L_0x0440;
                case 72: goto L_0x051d;
                case 73: goto L_0x0510;
                case 74: goto L_0x0505;
                case 75: goto L_0x04f8;
                case 76: goto L_0x04eb;
                case 77: goto L_0x04e0;
                case 78: goto L_0x04d4;
                case 79: goto L_0x04c8;
                case 80: goto L_0x04bc;
                case 81: goto L_0x04b0;
                case 82: goto L_0x04a4;
                case 83: goto L_0x0492;
                case 84: goto L_0x0486;
                case 85: goto L_0x047a;
                case 86: goto L_0x0429;
                case 87: goto L_0x0420;
                case 88: goto L_0x03c2;
                case 89: goto L_0x03c2;
                case 90: goto L_0x03c2;
                case 91: goto L_0x040f;
                case 92: goto L_0x03fe;
                case 93: goto L_0x03f3;
                case 94: goto L_0x03e8;
                case 95: goto L_0x03e1;
                case 96: goto L_0x03db;
                case 97: goto L_0x03d0;
                default: goto L_0x03c2;
            }
        L_0x03c2:
            r11 = -2
            r13 = 1065353216(0x3f800000, float:1.0)
            r14 = 0
            java.lang.Integer.toHexString(r6)
            android.util.SparseIntArray r12 = f1115e
            r12.get(r6)
            goto L_0x09eb
        L_0x03d0:
            androidx.constraintlayout.widget.b$b r11 = r0.f1123d
            int r12 = r11.f1195o0
            int r6 = r1.getInt(r6, r12)
            r11.f1195o0 = r6
            goto L_0x0440
        L_0x03db:
            androidx.constraintlayout.widget.b$b r11 = r0.f1123d
            m635i(r11, r1, r6, r9)
            goto L_0x0440
        L_0x03e1:
            androidx.constraintlayout.widget.b$b r11 = r0.f1123d
            r12 = 0
            m635i(r11, r1, r6, r12)
            goto L_0x0440
        L_0x03e8:
            androidx.constraintlayout.widget.b$b r11 = r0.f1123d
            int r12 = r11.f1158S
            int r6 = r1.getDimensionPixelSize(r6, r12)
            r11.f1158S = r6
            goto L_0x0440
        L_0x03f3:
            androidx.constraintlayout.widget.b$b r11 = r0.f1123d
            int r12 = r11.f1151L
            int r6 = r1.getDimensionPixelSize(r6, r12)
            r11.f1151L = r6
            goto L_0x0440
        L_0x03fe:
            androidx.constraintlayout.widget.b$b r11 = r0.f1123d
            int r12 = r11.f1198r
            int r12 = r1.getResourceId(r6, r12)
            if (r12 != r10) goto L_0x040c
            int r12 = r1.getInt(r6, r10)
        L_0x040c:
            r11.f1198r = r12
            goto L_0x0440
        L_0x040f:
            androidx.constraintlayout.widget.b$b r11 = r0.f1123d
            int r12 = r11.f1197q
            int r12 = r1.getResourceId(r6, r12)
            if (r12 != r10) goto L_0x041d
            int r12 = r1.getInt(r6, r10)
        L_0x041d:
            r11.f1197q = r12
            goto L_0x0440
        L_0x0420:
            java.lang.Integer.toHexString(r6)
            android.util.SparseIntArray r11 = f1115e
            r11.get(r6)
            goto L_0x0440
        L_0x0429:
            android.util.TypedValue r11 = r1.peekValue(r6)
            int r11 = r11.type
            if (r11 != r9) goto L_0x0442
            androidx.constraintlayout.widget.b$c r11 = r0.f1122c
            int r6 = r1.getResourceId(r6, r10)
            r11.f1221n = r6
            androidx.constraintlayout.widget.b$c r6 = r0.f1122c
            int r11 = r6.f1221n
            if (r11 == r10) goto L_0x0440
            goto L_0x0460
        L_0x0440:
            r11 = -2
            goto L_0x0469
        L_0x0442:
            if (r11 != r3) goto L_0x046e
            androidx.constraintlayout.widget.b$c r11 = r0.f1122c
            java.lang.String r12 = r1.getString(r6)
            r11.f1219l = r12
            androidx.constraintlayout.widget.b$c r11 = r0.f1122c
            java.lang.String r11 = r11.f1219l
            int r11 = r11.indexOf(r2)
            if (r11 <= 0) goto L_0x0464
            androidx.constraintlayout.widget.b$c r11 = r0.f1122c
            int r6 = r1.getResourceId(r6, r10)
            r11.f1221n = r6
            androidx.constraintlayout.widget.b$c r6 = r0.f1122c
        L_0x0460:
            r11 = -2
            r6.f1220m = r11
            goto L_0x0469
        L_0x0464:
            r11 = -2
            androidx.constraintlayout.widget.b$c r6 = r0.f1122c
            r6.f1220m = r10
        L_0x0469:
            r13 = 1065353216(0x3f800000, float:1.0)
        L_0x046b:
            r14 = 0
            goto L_0x09eb
        L_0x046e:
            r11 = -2
            androidx.constraintlayout.widget.b$c r12 = r0.f1122c
            int r13 = r12.f1221n
            int r6 = r1.getInteger(r6, r13)
            r12.f1220m = r6
            goto L_0x0469
        L_0x047a:
            r11 = -2
            androidx.constraintlayout.widget.b$c r12 = r0.f1122c
            float r13 = r12.f1217j
            float r6 = r1.getFloat(r6, r13)
            r12.f1217j = r6
            goto L_0x0469
        L_0x0486:
            r11 = -2
            androidx.constraintlayout.widget.b$c r12 = r0.f1122c
            int r13 = r12.f1218k
            int r6 = r1.getInteger(r6, r13)
            r12.f1218k = r6
            goto L_0x0469
        L_0x0492:
            r11 = -2
            androidx.constraintlayout.widget.b$e r12 = r0.f1124e
            int r13 = r12.f1236i
            int r13 = r1.getResourceId(r6, r13)
            if (r13 != r10) goto L_0x04a1
            int r13 = r1.getInt(r6, r10)
        L_0x04a1:
            r12.f1236i = r13
            goto L_0x0469
        L_0x04a4:
            r11 = -2
            androidx.constraintlayout.widget.b$c r12 = r0.f1122c
            int r13 = r12.f1210c
            int r6 = r1.getInteger(r6, r13)
            r12.f1210c = r6
            goto L_0x0469
        L_0x04b0:
            r11 = -2
            androidx.constraintlayout.widget.b$b r12 = r0.f1123d
            boolean r13 = r12.f1191m0
            boolean r6 = r1.getBoolean(r6, r13)
            r12.f1191m0 = r6
            goto L_0x0469
        L_0x04bc:
            r11 = -2
            androidx.constraintlayout.widget.b$b r12 = r0.f1123d
            boolean r13 = r12.f1189l0
            boolean r6 = r1.getBoolean(r6, r13)
            r12.f1189l0 = r6
            goto L_0x0469
        L_0x04c8:
            r11 = -2
            androidx.constraintlayout.widget.b$c r12 = r0.f1122c
            float r13 = r12.f1214g
            float r6 = r1.getFloat(r6, r13)
            r12.f1214g = r6
            goto L_0x0469
        L_0x04d4:
            r11 = -2
            androidx.constraintlayout.widget.b$d r12 = r0.f1121b
            int r13 = r12.f1224c
            int r6 = r1.getInt(r6, r13)
            r12.f1224c = r6
            goto L_0x0469
        L_0x04e0:
            r11 = -2
            androidx.constraintlayout.widget.b$b r12 = r0.f1123d
            java.lang.String r6 = r1.getString(r6)
            r12.f1187k0 = r6
            goto L_0x0469
        L_0x04eb:
            r11 = -2
            androidx.constraintlayout.widget.b$c r12 = r0.f1122c
            int r13 = r12.f1212e
            int r6 = r1.getInt(r6, r13)
            r12.f1212e = r6
            goto L_0x0469
        L_0x04f8:
            r11 = -2
            androidx.constraintlayout.widget.b$b r12 = r0.f1123d
            boolean r13 = r12.f1193n0
            boolean r6 = r1.getBoolean(r6, r13)
            r12.f1193n0 = r6
            goto L_0x0469
        L_0x0505:
            r11 = -2
            androidx.constraintlayout.widget.b$b r12 = r0.f1123d
            java.lang.String r6 = r1.getString(r6)
            r12.f1185j0 = r6
            goto L_0x0469
        L_0x0510:
            r11 = -2
            androidx.constraintlayout.widget.b$b r12 = r0.f1123d
            int r13 = r12.f1179g0
            int r6 = r1.getDimensionPixelSize(r6, r13)
            r12.f1179g0 = r6
            goto L_0x0469
        L_0x051d:
            r11 = -2
            androidx.constraintlayout.widget.b$b r12 = r0.f1123d
            int r13 = r12.f1177f0
            int r6 = r1.getInt(r6, r13)
            r12.f1177f0 = r6
            goto L_0x0469
        L_0x052a:
            r11 = -2
            androidx.constraintlayout.widget.b$b r12 = r0.f1123d
            r13 = 1065353216(0x3f800000, float:1.0)
            float r6 = r1.getFloat(r6, r13)
            r12.f1175e0 = r6
            goto L_0x046b
        L_0x0537:
            r11 = -2
            r13 = 1065353216(0x3f800000, float:1.0)
            androidx.constraintlayout.widget.b$b r12 = r0.f1123d
            float r6 = r1.getFloat(r6, r13)
            r12.f1173d0 = r6
            goto L_0x046b
        L_0x0544:
            r11 = -2
            r13 = 1065353216(0x3f800000, float:1.0)
            androidx.constraintlayout.widget.b$d r12 = r0.f1121b
            float r14 = r12.f1226e
            float r6 = r1.getFloat(r6, r14)
            r12.f1226e = r6
            goto L_0x046b
        L_0x0553:
            r11 = -2
            r13 = 1065353216(0x3f800000, float:1.0)
            androidx.constraintlayout.widget.b$c r12 = r0.f1122c
            float r14 = r12.f1216i
            float r6 = r1.getFloat(r6, r14)
            r12.f1216i = r6
            goto L_0x046b
        L_0x0562:
            r11 = -2
            r13 = 1065353216(0x3f800000, float:1.0)
            androidx.constraintlayout.widget.b$c r12 = r0.f1122c
            r14 = 0
            int r6 = r1.getInt(r6, r14)
            r12.f1213f = r6
            goto L_0x09eb
        L_0x0570:
            r11 = -2
            r13 = 1065353216(0x3f800000, float:1.0)
            r14 = 0
            android.util.TypedValue r12 = r1.peekValue(r6)
            int r12 = r12.type
            if (r12 != r3) goto L_0x0583
            androidx.constraintlayout.widget.b$c r12 = r0.f1122c
            java.lang.String r6 = r1.getString(r6)
            goto L_0x058d
        L_0x0583:
            androidx.constraintlayout.widget.b$c r12 = r0.f1122c
            java.lang.String[] r15 = p105r.C1632a.f5008c
            int r6 = r1.getInteger(r6, r14)
            r6 = r15[r6]
        L_0x058d:
            r12.f1211d = r6
            goto L_0x09eb
        L_0x0591:
            r11 = -2
            r13 = 1065353216(0x3f800000, float:1.0)
            r14 = 0
            androidx.constraintlayout.widget.b$c r12 = r0.f1122c
            int r15 = r12.f1209b
            int r15 = r1.getResourceId(r6, r15)
            if (r15 != r10) goto L_0x05a3
            int r15 = r1.getInt(r6, r10)
        L_0x05a3:
            r12.f1209b = r15
            goto L_0x09eb
        L_0x05a7:
            r11 = -2
            r13 = 1065353216(0x3f800000, float:1.0)
            r14 = 0
            androidx.constraintlayout.widget.b$b r12 = r0.f1123d
            float r15 = r12.f1141B
            float r6 = r1.getFloat(r6, r15)
            r12.f1141B = r6
            goto L_0x09eb
        L_0x05b7:
            r11 = -2
            r13 = 1065353216(0x3f800000, float:1.0)
            r14 = 0
            androidx.constraintlayout.widget.b$b r12 = r0.f1123d
            int r15 = r12.f1140A
            int r6 = r1.getDimensionPixelSize(r6, r15)
            r12.f1140A = r6
            goto L_0x09eb
        L_0x05c7:
            r11 = -2
            r13 = 1065353216(0x3f800000, float:1.0)
            r14 = 0
            androidx.constraintlayout.widget.b$b r12 = r0.f1123d
            int r15 = r12.f1206z
            int r15 = r1.getResourceId(r6, r15)
            if (r15 != r10) goto L_0x05d9
            int r15 = r1.getInt(r6, r10)
        L_0x05d9:
            r12.f1206z = r15
            goto L_0x09eb
        L_0x05dd:
            r11 = -2
            r13 = 1065353216(0x3f800000, float:1.0)
            r14 = 0
            androidx.constraintlayout.widget.b$e r12 = r0.f1124e
            float r15 = r12.f1229b
            float r6 = r1.getFloat(r6, r15)
            r12.f1229b = r6
            goto L_0x09eb
        L_0x05ed:
            r11 = -2
            r13 = 1065353216(0x3f800000, float:1.0)
            r14 = 0
            androidx.constraintlayout.widget.b$b r12 = r0.f1123d
            int r15 = r12.f1171c0
            int r6 = r1.getDimensionPixelSize(r6, r15)
            r12.f1171c0 = r6
            goto L_0x09eb
        L_0x05fd:
            r11 = -2
            r13 = 1065353216(0x3f800000, float:1.0)
            r14 = 0
            androidx.constraintlayout.widget.b$b r12 = r0.f1123d
            int r15 = r12.f1169b0
            int r6 = r1.getDimensionPixelSize(r6, r15)
            r12.f1169b0 = r6
            goto L_0x09eb
        L_0x060d:
            r11 = -2
            r13 = 1065353216(0x3f800000, float:1.0)
            r14 = 0
            androidx.constraintlayout.widget.b$b r12 = r0.f1123d
            int r15 = r12.f1167a0
            int r6 = r1.getDimensionPixelSize(r6, r15)
            r12.f1167a0 = r6
            goto L_0x09eb
        L_0x061d:
            r11 = -2
            r13 = 1065353216(0x3f800000, float:1.0)
            r14 = 0
            androidx.constraintlayout.widget.b$b r12 = r0.f1123d
            int r15 = r12.f1165Z
            int r6 = r1.getDimensionPixelSize(r6, r15)
            r12.f1165Z = r6
            goto L_0x09eb
        L_0x062d:
            r11 = -2
            r13 = 1065353216(0x3f800000, float:1.0)
            r14 = 0
            androidx.constraintlayout.widget.b$b r12 = r0.f1123d
            int r15 = r12.f1164Y
            int r6 = r1.getInt(r6, r15)
            r12.f1164Y = r6
            goto L_0x09eb
        L_0x063d:
            r11 = -2
            r13 = 1065353216(0x3f800000, float:1.0)
            r14 = 0
            androidx.constraintlayout.widget.b$b r12 = r0.f1123d
            int r15 = r12.f1163X
            int r6 = r1.getInt(r6, r15)
            r12.f1163X = r6
            goto L_0x09eb
        L_0x064d:
            r11 = -2
            r13 = 1065353216(0x3f800000, float:1.0)
            r14 = 0
            androidx.constraintlayout.widget.b$e r12 = r0.f1124e
            float r15 = r12.f1239l
            float r6 = r1.getDimension(r6, r15)
            r12.f1239l = r6
            goto L_0x09eb
        L_0x065d:
            r11 = -2
            r13 = 1065353216(0x3f800000, float:1.0)
            r14 = 0
            androidx.constraintlayout.widget.b$e r12 = r0.f1124e
            float r15 = r12.f1238k
            float r6 = r1.getDimension(r6, r15)
            r12.f1238k = r6
            goto L_0x09eb
        L_0x066d:
            r11 = -2
            r13 = 1065353216(0x3f800000, float:1.0)
            r14 = 0
            androidx.constraintlayout.widget.b$e r12 = r0.f1124e
            float r15 = r12.f1237j
            float r6 = r1.getDimension(r6, r15)
            r12.f1237j = r6
            goto L_0x09eb
        L_0x067d:
            r11 = -2
            r13 = 1065353216(0x3f800000, float:1.0)
            r14 = 0
            androidx.constraintlayout.widget.b$e r12 = r0.f1124e
            float r15 = r12.f1235h
            float r6 = r1.getDimension(r6, r15)
            r12.f1235h = r6
            goto L_0x09eb
        L_0x068d:
            r11 = -2
            r13 = 1065353216(0x3f800000, float:1.0)
            r14 = 0
            androidx.constraintlayout.widget.b$e r12 = r0.f1124e
            float r15 = r12.f1234g
            float r6 = r1.getDimension(r6, r15)
            r12.f1234g = r6
            goto L_0x09eb
        L_0x069d:
            r11 = -2
            r13 = 1065353216(0x3f800000, float:1.0)
            r14 = 0
            androidx.constraintlayout.widget.b$e r12 = r0.f1124e
            float r15 = r12.f1233f
            float r6 = r1.getFloat(r6, r15)
            r12.f1233f = r6
            goto L_0x09eb
        L_0x06ad:
            r11 = -2
            r13 = 1065353216(0x3f800000, float:1.0)
            r14 = 0
            androidx.constraintlayout.widget.b$e r12 = r0.f1124e
            float r15 = r12.f1232e
            float r6 = r1.getFloat(r6, r15)
            r12.f1232e = r6
            goto L_0x09eb
        L_0x06bd:
            r11 = -2
            r13 = 1065353216(0x3f800000, float:1.0)
            r14 = 0
            androidx.constraintlayout.widget.b$e r12 = r0.f1124e
            float r15 = r12.f1231d
            float r6 = r1.getFloat(r6, r15)
            r12.f1231d = r6
            goto L_0x09eb
        L_0x06cd:
            r11 = -2
            r13 = 1065353216(0x3f800000, float:1.0)
            r14 = 0
            androidx.constraintlayout.widget.b$e r12 = r0.f1124e
            float r15 = r12.f1230c
            float r6 = r1.getFloat(r6, r15)
            r12.f1230c = r6
            goto L_0x09eb
        L_0x06dd:
            r11 = -2
            r13 = 1065353216(0x3f800000, float:1.0)
            r14 = 0
            androidx.constraintlayout.widget.b$e r12 = r0.f1124e
            r12.f1240m = r9
            float r15 = r12.f1241n
            float r6 = r1.getDimension(r6, r15)
            r12.f1241n = r6
            goto L_0x09eb
        L_0x06ef:
            r11 = -2
            r13 = 1065353216(0x3f800000, float:1.0)
            r14 = 0
            androidx.constraintlayout.widget.b$d r12 = r0.f1121b
            float r15 = r12.f1225d
            float r6 = r1.getFloat(r6, r15)
            r12.f1225d = r6
            goto L_0x09eb
        L_0x06ff:
            r11 = -2
            r13 = 1065353216(0x3f800000, float:1.0)
            r14 = 0
            androidx.constraintlayout.widget.b$b r12 = r0.f1123d
            int r15 = r12.f1162W
            int r6 = r1.getInt(r6, r15)
            r12.f1162W = r6
            goto L_0x09eb
        L_0x070f:
            r11 = -2
            r13 = 1065353216(0x3f800000, float:1.0)
            r14 = 0
            androidx.constraintlayout.widget.b$b r12 = r0.f1123d
            int r15 = r12.f1161V
            int r6 = r1.getInt(r6, r15)
            r12.f1161V = r6
            goto L_0x09eb
        L_0x071f:
            r11 = -2
            r13 = 1065353216(0x3f800000, float:1.0)
            r14 = 0
            androidx.constraintlayout.widget.b$b r12 = r0.f1123d
            float r15 = r12.f1159T
            float r6 = r1.getFloat(r6, r15)
            r12.f1159T = r6
            goto L_0x09eb
        L_0x072f:
            r11 = -2
            r13 = 1065353216(0x3f800000, float:1.0)
            r14 = 0
            androidx.constraintlayout.widget.b$b r12 = r0.f1123d
            float r15 = r12.f1160U
            float r6 = r1.getFloat(r6, r15)
            r12.f1160U = r6
            goto L_0x09eb
        L_0x073f:
            r11 = -2
            r13 = 1065353216(0x3f800000, float:1.0)
            r14 = 0
            int r12 = r0.f1120a
            int r6 = r1.getResourceId(r6, r12)
            r0.f1120a = r6
            goto L_0x09eb
        L_0x074d:
            r11 = -2
            r13 = 1065353216(0x3f800000, float:1.0)
            r14 = 0
            androidx.constraintlayout.widget.b$b r12 = r0.f1123d
            float r15 = r12.f1204x
            float r6 = r1.getFloat(r6, r15)
            r12.f1204x = r6
            goto L_0x09eb
        L_0x075d:
            r11 = -2
            r13 = 1065353216(0x3f800000, float:1.0)
            r14 = 0
            androidx.constraintlayout.widget.b$b r12 = r0.f1123d
            int r15 = r12.f1188l
            int r15 = r1.getResourceId(r6, r15)
            if (r15 != r10) goto L_0x076f
            int r15 = r1.getInt(r6, r10)
        L_0x076f:
            r12.f1188l = r15
            goto L_0x09eb
        L_0x0773:
            r11 = -2
            r13 = 1065353216(0x3f800000, float:1.0)
            r14 = 0
            androidx.constraintlayout.widget.b$b r12 = r0.f1123d
            int r15 = r12.f1190m
            int r15 = r1.getResourceId(r6, r15)
            if (r15 != r10) goto L_0x0785
            int r15 = r1.getInt(r6, r10)
        L_0x0785:
            r12.f1190m = r15
            goto L_0x09eb
        L_0x0789:
            r11 = -2
            r13 = 1065353216(0x3f800000, float:1.0)
            r14 = 0
            androidx.constraintlayout.widget.b$b r12 = r0.f1123d
            int r15 = r12.f1147H
            int r6 = r1.getDimensionPixelSize(r6, r15)
            r12.f1147H = r6
            goto L_0x09eb
        L_0x0799:
            r11 = -2
            r13 = 1065353216(0x3f800000, float:1.0)
            r14 = 0
            androidx.constraintlayout.widget.b$b r12 = r0.f1123d
            int r15 = r12.f1200t
            int r15 = r1.getResourceId(r6, r15)
            if (r15 != r10) goto L_0x07ab
            int r15 = r1.getInt(r6, r10)
        L_0x07ab:
            r12.f1200t = r15
            goto L_0x09eb
        L_0x07af:
            r11 = -2
            r13 = 1065353216(0x3f800000, float:1.0)
            r14 = 0
            androidx.constraintlayout.widget.b$b r12 = r0.f1123d
            int r15 = r12.f1199s
            int r15 = r1.getResourceId(r6, r15)
            if (r15 != r10) goto L_0x07c1
            int r15 = r1.getInt(r6, r10)
        L_0x07c1:
            r12.f1199s = r15
            goto L_0x09eb
        L_0x07c5:
            r11 = -2
            r13 = 1065353216(0x3f800000, float:1.0)
            r14 = 0
            androidx.constraintlayout.widget.b$b r12 = r0.f1123d
            int r15 = r12.f1150K
            int r6 = r1.getDimensionPixelSize(r6, r15)
            r12.f1150K = r6
            goto L_0x09eb
        L_0x07d5:
            r11 = -2
            r13 = 1065353216(0x3f800000, float:1.0)
            r14 = 0
            androidx.constraintlayout.widget.b$b r12 = r0.f1123d
            int r15 = r12.f1186k
            int r15 = r1.getResourceId(r6, r15)
            if (r15 != r10) goto L_0x07e7
            int r15 = r1.getInt(r6, r10)
        L_0x07e7:
            r12.f1186k = r15
            goto L_0x09eb
        L_0x07eb:
            r11 = -2
            r13 = 1065353216(0x3f800000, float:1.0)
            r14 = 0
            androidx.constraintlayout.widget.b$b r12 = r0.f1123d
            int r15 = r12.f1184j
            int r15 = r1.getResourceId(r6, r15)
            if (r15 != r10) goto L_0x07fd
            int r15 = r1.getInt(r6, r10)
        L_0x07fd:
            r12.f1184j = r15
            goto L_0x09eb
        L_0x0801:
            r11 = -2
            r13 = 1065353216(0x3f800000, float:1.0)
            r14 = 0
            androidx.constraintlayout.widget.b$b r12 = r0.f1123d
            int r15 = r12.f1146G
            int r6 = r1.getDimensionPixelSize(r6, r15)
            r12.f1146G = r6
            goto L_0x09eb
        L_0x0811:
            r11 = -2
            r13 = 1065353216(0x3f800000, float:1.0)
            r14 = 0
            androidx.constraintlayout.widget.b$b r12 = r0.f1123d
            int r15 = r12.f1144E
            int r6 = r1.getInt(r6, r15)
            r12.f1144E = r6
            goto L_0x09eb
        L_0x0821:
            r11 = -2
            r13 = 1065353216(0x3f800000, float:1.0)
            r14 = 0
            androidx.constraintlayout.widget.b$b r12 = r0.f1123d
            int r15 = r12.f1182i
            int r15 = r1.getResourceId(r6, r15)
            if (r15 != r10) goto L_0x0833
            int r15 = r1.getInt(r6, r10)
        L_0x0833:
            r12.f1182i = r15
            goto L_0x09eb
        L_0x0837:
            r11 = -2
            r13 = 1065353216(0x3f800000, float:1.0)
            r14 = 0
            androidx.constraintlayout.widget.b$b r12 = r0.f1123d
            int r15 = r12.f1180h
            int r15 = r1.getResourceId(r6, r15)
            if (r15 != r10) goto L_0x0849
            int r15 = r1.getInt(r6, r10)
        L_0x0849:
            r12.f1180h = r15
            goto L_0x09eb
        L_0x084d:
            r11 = -2
            r13 = 1065353216(0x3f800000, float:1.0)
            r14 = 0
            androidx.constraintlayout.widget.b$b r12 = r0.f1123d
            int r15 = r12.f1145F
            int r6 = r1.getDimensionPixelSize(r6, r15)
            r12.f1145F = r6
            goto L_0x09eb
        L_0x085d:
            r11 = -2
            r13 = 1065353216(0x3f800000, float:1.0)
            r14 = 0
            androidx.constraintlayout.widget.b$b r12 = r0.f1123d
            int r15 = r12.f1170c
            int r6 = r1.getLayoutDimension(r6, r15)
            r12.f1170c = r6
            goto L_0x09eb
        L_0x086d:
            r11 = -2
            r13 = 1065353216(0x3f800000, float:1.0)
            r14 = 0
            androidx.constraintlayout.widget.b$d r12 = r0.f1121b
            int r15 = r12.f1223b
            int r6 = r1.getInt(r6, r15)
            r12.f1223b = r6
            androidx.constraintlayout.widget.b$d r6 = r0.f1121b
            int[] r12 = f1114d
            int r15 = r6.f1223b
            r12 = r12[r15]
            r6.f1223b = r12
            goto L_0x09eb
        L_0x0887:
            r11 = -2
            r13 = 1065353216(0x3f800000, float:1.0)
            r14 = 0
            androidx.constraintlayout.widget.b$b r12 = r0.f1123d
            int r15 = r12.f1172d
            int r6 = r1.getLayoutDimension(r6, r15)
            r12.f1172d = r6
            goto L_0x09eb
        L_0x0897:
            r11 = -2
            r13 = 1065353216(0x3f800000, float:1.0)
            r14 = 0
            androidx.constraintlayout.widget.b$b r12 = r0.f1123d
            float r15 = r12.f1203w
            float r6 = r1.getFloat(r6, r15)
            r12.f1203w = r6
            goto L_0x09eb
        L_0x08a7:
            r11 = -2
            r13 = 1065353216(0x3f800000, float:1.0)
            r14 = 0
            androidx.constraintlayout.widget.b$b r12 = r0.f1123d
            float r15 = r12.f1178g
            float r6 = r1.getFloat(r6, r15)
            r12.f1178g = r6
            goto L_0x09eb
        L_0x08b7:
            r11 = -2
            r13 = 1065353216(0x3f800000, float:1.0)
            r14 = 0
            androidx.constraintlayout.widget.b$b r12 = r0.f1123d
            int r15 = r12.f1176f
            int r6 = r1.getDimensionPixelOffset(r6, r15)
            r12.f1176f = r6
            goto L_0x09eb
        L_0x08c7:
            r11 = -2
            r13 = 1065353216(0x3f800000, float:1.0)
            r14 = 0
            androidx.constraintlayout.widget.b$b r12 = r0.f1123d
            int r15 = r12.f1174e
            int r6 = r1.getDimensionPixelOffset(r6, r15)
            r12.f1174e = r6
            goto L_0x09eb
        L_0x08d7:
            r11 = -2
            r13 = 1065353216(0x3f800000, float:1.0)
            r14 = 0
            androidx.constraintlayout.widget.b$b r12 = r0.f1123d
            int r15 = r12.f1153N
            int r6 = r1.getDimensionPixelSize(r6, r15)
            r12.f1153N = r6
            goto L_0x09eb
        L_0x08e7:
            r11 = -2
            r13 = 1065353216(0x3f800000, float:1.0)
            r14 = 0
            androidx.constraintlayout.widget.b$b r12 = r0.f1123d
            int r15 = r12.f1157R
            int r6 = r1.getDimensionPixelSize(r6, r15)
            r12.f1157R = r6
            goto L_0x09eb
        L_0x08f7:
            r11 = -2
            r13 = 1065353216(0x3f800000, float:1.0)
            r14 = 0
            androidx.constraintlayout.widget.b$b r12 = r0.f1123d
            int r15 = r12.f1154O
            int r6 = r1.getDimensionPixelSize(r6, r15)
            r12.f1154O = r6
            goto L_0x09eb
        L_0x0907:
            r11 = -2
            r13 = 1065353216(0x3f800000, float:1.0)
            r14 = 0
            androidx.constraintlayout.widget.b$b r12 = r0.f1123d
            int r15 = r12.f1152M
            int r6 = r1.getDimensionPixelSize(r6, r15)
            r12.f1152M = r6
            goto L_0x09eb
        L_0x0917:
            r11 = -2
            r13 = 1065353216(0x3f800000, float:1.0)
            r14 = 0
            androidx.constraintlayout.widget.b$b r12 = r0.f1123d
            int r15 = r12.f1156Q
            int r6 = r1.getDimensionPixelSize(r6, r15)
            r12.f1156Q = r6
            goto L_0x09eb
        L_0x0927:
            r11 = -2
            r13 = 1065353216(0x3f800000, float:1.0)
            r14 = 0
            androidx.constraintlayout.widget.b$b r12 = r0.f1123d
            int r15 = r12.f1155P
            int r6 = r1.getDimensionPixelSize(r6, r15)
            r12.f1155P = r6
            goto L_0x09eb
        L_0x0937:
            r11 = -2
            r13 = 1065353216(0x3f800000, float:1.0)
            r14 = 0
            androidx.constraintlayout.widget.b$b r12 = r0.f1123d
            int r15 = r12.f1201u
            int r15 = r1.getResourceId(r6, r15)
            if (r15 != r10) goto L_0x0949
            int r15 = r1.getInt(r6, r10)
        L_0x0949:
            r12.f1201u = r15
            goto L_0x09eb
        L_0x094d:
            r11 = -2
            r13 = 1065353216(0x3f800000, float:1.0)
            r14 = 0
            androidx.constraintlayout.widget.b$b r12 = r0.f1123d
            int r15 = r12.f1202v
            int r15 = r1.getResourceId(r6, r15)
            if (r15 != r10) goto L_0x095f
            int r15 = r1.getInt(r6, r10)
        L_0x095f:
            r12.f1202v = r15
            goto L_0x09eb
        L_0x0963:
            r11 = -2
            r13 = 1065353216(0x3f800000, float:1.0)
            r14 = 0
            androidx.constraintlayout.widget.b$b r12 = r0.f1123d
            int r15 = r12.f1149J
            int r6 = r1.getDimensionPixelSize(r6, r15)
            r12.f1149J = r6
            goto L_0x09eb
        L_0x0973:
            r11 = -2
            r13 = 1065353216(0x3f800000, float:1.0)
            r14 = 0
            androidx.constraintlayout.widget.b$b r12 = r0.f1123d
            int r15 = r12.f1143D
            int r6 = r1.getDimensionPixelOffset(r6, r15)
            r12.f1143D = r6
            goto L_0x09eb
        L_0x0982:
            r11 = -2
            r13 = 1065353216(0x3f800000, float:1.0)
            r14 = 0
            androidx.constraintlayout.widget.b$b r12 = r0.f1123d
            int r15 = r12.f1142C
            int r6 = r1.getDimensionPixelOffset(r6, r15)
            r12.f1142C = r6
            goto L_0x09eb
        L_0x0991:
            r11 = -2
            r13 = 1065353216(0x3f800000, float:1.0)
            r14 = 0
            androidx.constraintlayout.widget.b$b r12 = r0.f1123d
            java.lang.String r6 = r1.getString(r6)
            r12.f1205y = r6
            goto L_0x09eb
        L_0x099e:
            r11 = -2
            r13 = 1065353216(0x3f800000, float:1.0)
            r14 = 0
            androidx.constraintlayout.widget.b$b r12 = r0.f1123d
            int r15 = r12.f1192n
            int r15 = r1.getResourceId(r6, r15)
            if (r15 != r10) goto L_0x09b0
            int r15 = r1.getInt(r6, r10)
        L_0x09b0:
            r12.f1192n = r15
            goto L_0x09eb
        L_0x09b3:
            r11 = -2
            r13 = 1065353216(0x3f800000, float:1.0)
            r14 = 0
            androidx.constraintlayout.widget.b$b r12 = r0.f1123d
            int r15 = r12.f1194o
            int r15 = r1.getResourceId(r6, r15)
            if (r15 != r10) goto L_0x09c5
            int r15 = r1.getInt(r6, r10)
        L_0x09c5:
            r12.f1194o = r15
            goto L_0x09eb
        L_0x09c8:
            r11 = -2
            r13 = 1065353216(0x3f800000, float:1.0)
            r14 = 0
            androidx.constraintlayout.widget.b$b r12 = r0.f1123d
            int r15 = r12.f1148I
            int r6 = r1.getDimensionPixelSize(r6, r15)
            r12.f1148I = r6
            goto L_0x09eb
        L_0x09d7:
            r11 = -2
            r13 = 1065353216(0x3f800000, float:1.0)
            r14 = 0
            androidx.constraintlayout.widget.b$b r12 = r0.f1123d
            int r15 = r12.f1196p
            int r15 = r1.getResourceId(r6, r15)
            if (r15 != r10) goto L_0x09e9
            int r15 = r1.getInt(r6, r10)
        L_0x09e9:
            r12.f1196p = r15
        L_0x09eb:
            int r5 = r5 + 1
            goto L_0x0399
        L_0x09ef:
            r1.recycle()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.C0237b.mo1311f(android.content.Context, android.util.AttributeSet, boolean):androidx.constraintlayout.widget.b$a");
    }

    /* renamed from: g */
    public final C0238a mo1312g(int i) {
        if (!this.f1119c.containsKey(Integer.valueOf(i))) {
            this.f1119c.put(Integer.valueOf(i), new C0238a());
        }
        return this.f1119c.get(Integer.valueOf(i));
    }

    /* renamed from: h */
    public void mo1313h(Context context, int i) {
        XmlResourceParser xml = context.getResources().getXml(i);
        try {
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType == 0) {
                    xml.getName();
                } else if (eventType == 2) {
                    String name = xml.getName();
                    C0238a f = mo1311f(context, Xml.asAttributeSet(xml), false);
                    if (name.equalsIgnoreCase("Guideline")) {
                        f.f1123d.f1166a = true;
                    }
                    this.f1119c.put(Integer.valueOf(f.f1120a), f);
                }
            }
        } catch (XmlPullParserException e) {
            e.printStackTrace();
        } catch (IOException e2) {
            e2.printStackTrace();
        }
    }

    /* renamed from: k */
    public final String mo1314k(int i) {
        switch (i) {
            case 1:
                return "left";
            case 2:
                return "right";
            case 3:
                return "top";
            case 4:
                return "bottom";
            case 5:
                return "baseline";
            case 6:
                return "start";
            case 7:
                return "end";
            default:
                return "undefined";
        }
    }
}
