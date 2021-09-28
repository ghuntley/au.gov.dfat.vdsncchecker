package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import com.dynamsoft.dbr.EnumBarcodeFormat_2;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Objects;
import p099q.C1593e;
import p111s.C1693d;
import p111s.C1695e;
import p111s.C1696f;
import p111s.C1697g;
import p117t.C1746b;
import p129v.C1956b;
import p129v.C1959c;
import p129v.C1961e;
import p129v.C1962f;

public class ConstraintLayout extends ViewGroup {

    /* renamed from: v */
    public static C1962f f1011v;

    /* renamed from: e */
    public SparseArray<View> f1012e = new SparseArray<>();

    /* renamed from: f */
    public ArrayList<C0236a> f1013f = new ArrayList<>(4);

    /* renamed from: g */
    public C1696f f1014g = new C1696f();

    /* renamed from: h */
    public int f1015h = 0;

    /* renamed from: i */
    public int f1016i = 0;

    /* renamed from: j */
    public int f1017j = Integer.MAX_VALUE;

    /* renamed from: k */
    public int f1018k = Integer.MAX_VALUE;

    /* renamed from: l */
    public boolean f1019l = true;

    /* renamed from: m */
    public int f1020m = 257;

    /* renamed from: n */
    public C0237b f1021n = null;

    /* renamed from: o */
    public C1956b f1022o = null;

    /* renamed from: p */
    public int f1023p = -1;

    /* renamed from: q */
    public HashMap<String, Integer> f1024q = new HashMap<>();

    /* renamed from: r */
    public SparseArray<C1695e> f1025r = new SparseArray<>();

    /* renamed from: s */
    public C0235b f1026s = new C0235b(this);

    /* renamed from: t */
    public int f1027t = 0;

    /* renamed from: u */
    public int f1028u = 0;

    /* renamed from: androidx.constraintlayout.widget.ConstraintLayout$a */
    public static class C0233a extends ViewGroup.MarginLayoutParams {

        /* renamed from: A */
        public int f1029A = Integer.MIN_VALUE;

        /* renamed from: B */
        public int f1030B = Integer.MIN_VALUE;

        /* renamed from: C */
        public int f1031C = 0;

        /* renamed from: D */
        public float f1032D = 0.5f;

        /* renamed from: E */
        public float f1033E = 0.5f;

        /* renamed from: F */
        public String f1034F = null;

        /* renamed from: G */
        public float f1035G = -1.0f;

        /* renamed from: H */
        public float f1036H = -1.0f;

        /* renamed from: I */
        public int f1037I = 0;

        /* renamed from: J */
        public int f1038J = 0;

        /* renamed from: K */
        public int f1039K = 0;

        /* renamed from: L */
        public int f1040L = 0;

        /* renamed from: M */
        public int f1041M = 0;

        /* renamed from: N */
        public int f1042N = 0;

        /* renamed from: O */
        public int f1043O = 0;

        /* renamed from: P */
        public int f1044P = 0;

        /* renamed from: Q */
        public float f1045Q = 1.0f;

        /* renamed from: R */
        public float f1046R = 1.0f;

        /* renamed from: S */
        public int f1047S = -1;

        /* renamed from: T */
        public int f1048T = -1;

        /* renamed from: U */
        public int f1049U = -1;

        /* renamed from: V */
        public boolean f1050V = false;

        /* renamed from: W */
        public boolean f1051W = false;

        /* renamed from: X */
        public String f1052X = null;

        /* renamed from: Y */
        public int f1053Y = 0;

        /* renamed from: Z */
        public boolean f1054Z = true;

        /* renamed from: a */
        public int f1055a = -1;

        /* renamed from: a0 */
        public boolean f1056a0 = true;

        /* renamed from: b */
        public int f1057b = -1;

        /* renamed from: b0 */
        public boolean f1058b0 = false;

        /* renamed from: c */
        public float f1059c = -1.0f;

        /* renamed from: c0 */
        public boolean f1060c0 = false;

        /* renamed from: d */
        public int f1061d = -1;

        /* renamed from: d0 */
        public boolean f1062d0 = false;

        /* renamed from: e */
        public int f1063e = -1;

        /* renamed from: e0 */
        public boolean f1064e0 = false;

        /* renamed from: f */
        public int f1065f = -1;

        /* renamed from: f0 */
        public int f1066f0 = -1;

        /* renamed from: g */
        public int f1067g = -1;

        /* renamed from: g0 */
        public int f1068g0 = -1;

        /* renamed from: h */
        public int f1069h = -1;

        /* renamed from: h0 */
        public int f1070h0 = -1;

        /* renamed from: i */
        public int f1071i = -1;

        /* renamed from: i0 */
        public int f1072i0 = -1;

        /* renamed from: j */
        public int f1073j = -1;

        /* renamed from: j0 */
        public int f1074j0 = Integer.MIN_VALUE;

        /* renamed from: k */
        public int f1075k = -1;

        /* renamed from: k0 */
        public int f1076k0 = Integer.MIN_VALUE;

        /* renamed from: l */
        public int f1077l = -1;

        /* renamed from: l0 */
        public float f1078l0 = 0.5f;

        /* renamed from: m */
        public int f1079m = -1;

        /* renamed from: m0 */
        public int f1080m0;

        /* renamed from: n */
        public int f1081n = -1;

        /* renamed from: n0 */
        public int f1082n0;

        /* renamed from: o */
        public int f1083o = -1;

        /* renamed from: o0 */
        public float f1084o0;

        /* renamed from: p */
        public int f1085p = 0;

        /* renamed from: p0 */
        public C1695e f1086p0 = new C1695e();

        /* renamed from: q */
        public float f1087q = 0.0f;

        /* renamed from: r */
        public int f1088r = -1;

        /* renamed from: s */
        public int f1089s = -1;

        /* renamed from: t */
        public int f1090t = -1;

        /* renamed from: u */
        public int f1091u = -1;

        /* renamed from: v */
        public int f1092v = Integer.MIN_VALUE;

        /* renamed from: w */
        public int f1093w = Integer.MIN_VALUE;

        /* renamed from: x */
        public int f1094x = Integer.MIN_VALUE;

        /* renamed from: y */
        public int f1095y = Integer.MIN_VALUE;

        /* renamed from: z */
        public int f1096z = Integer.MIN_VALUE;

        /* renamed from: androidx.constraintlayout.widget.ConstraintLayout$a$a */
        public static class C0234a {

            /* renamed from: a */
            public static final SparseIntArray f1097a;

            static {
                SparseIntArray sparseIntArray = new SparseIntArray();
                f1097a = sparseIntArray;
                sparseIntArray.append(97, 64);
                sparseIntArray.append(74, 65);
                sparseIntArray.append(83, 8);
                sparseIntArray.append(84, 9);
                sparseIntArray.append(86, 10);
                sparseIntArray.append(87, 11);
                sparseIntArray.append(93, 12);
                sparseIntArray.append(92, 13);
                sparseIntArray.append(64, 14);
                sparseIntArray.append(63, 15);
                sparseIntArray.append(59, 16);
                sparseIntArray.append(61, 52);
                sparseIntArray.append(60, 53);
                sparseIntArray.append(65, 2);
                sparseIntArray.append(67, 3);
                sparseIntArray.append(66, 4);
                sparseIntArray.append(102, 49);
                sparseIntArray.append(103, 50);
                sparseIntArray.append(71, 5);
                sparseIntArray.append(72, 6);
                sparseIntArray.append(73, 7);
                sparseIntArray.append(0, 1);
                sparseIntArray.append(88, 17);
                sparseIntArray.append(89, 18);
                sparseIntArray.append(70, 19);
                sparseIntArray.append(69, 20);
                sparseIntArray.append(107, 21);
                sparseIntArray.append(110, 22);
                sparseIntArray.append(108, 23);
                sparseIntArray.append(105, 24);
                sparseIntArray.append(109, 25);
                sparseIntArray.append(106, 26);
                sparseIntArray.append(104, 55);
                sparseIntArray.append(111, 54);
                sparseIntArray.append(79, 29);
                sparseIntArray.append(94, 30);
                sparseIntArray.append(68, 44);
                sparseIntArray.append(81, 45);
                sparseIntArray.append(96, 46);
                sparseIntArray.append(80, 47);
                sparseIntArray.append(95, 48);
                sparseIntArray.append(57, 27);
                sparseIntArray.append(56, 28);
                sparseIntArray.append(98, 31);
                sparseIntArray.append(75, 32);
                sparseIntArray.append(100, 33);
                sparseIntArray.append(99, 34);
                sparseIntArray.append(101, 35);
                sparseIntArray.append(77, 36);
                sparseIntArray.append(76, 37);
                sparseIntArray.append(78, 38);
                sparseIntArray.append(82, 39);
                sparseIntArray.append(91, 40);
                sparseIntArray.append(85, 41);
                sparseIntArray.append(62, 42);
                sparseIntArray.append(58, 43);
                sparseIntArray.append(90, 51);
                sparseIntArray.append(113, 66);
            }
        }

        public C0233a(int i, int i2) {
            super(i, i2);
        }

        public C0233a(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1961e.f5784b);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                int i2 = C0234a.f1097a.get(index);
                switch (i2) {
                    case 1:
                        this.f1049U = obtainStyledAttributes.getInt(index, this.f1049U);
                        break;
                    case 2:
                        int resourceId = obtainStyledAttributes.getResourceId(index, this.f1083o);
                        this.f1083o = resourceId;
                        if (resourceId != -1) {
                            break;
                        } else {
                            this.f1083o = obtainStyledAttributes.getInt(index, -1);
                            break;
                        }
                    case 3:
                        this.f1085p = obtainStyledAttributes.getDimensionPixelSize(index, this.f1085p);
                        break;
                    case 4:
                        float f = obtainStyledAttributes.getFloat(index, this.f1087q) % 360.0f;
                        this.f1087q = f;
                        if (f >= 0.0f) {
                            break;
                        } else {
                            this.f1087q = (360.0f - f) % 360.0f;
                            break;
                        }
                    case 5:
                        this.f1055a = obtainStyledAttributes.getDimensionPixelOffset(index, this.f1055a);
                        break;
                    case 6:
                        this.f1057b = obtainStyledAttributes.getDimensionPixelOffset(index, this.f1057b);
                        break;
                    case 7:
                        this.f1059c = obtainStyledAttributes.getFloat(index, this.f1059c);
                        break;
                    case 8:
                        int resourceId2 = obtainStyledAttributes.getResourceId(index, this.f1061d);
                        this.f1061d = resourceId2;
                        if (resourceId2 != -1) {
                            break;
                        } else {
                            this.f1061d = obtainStyledAttributes.getInt(index, -1);
                            break;
                        }
                    case 9:
                        int resourceId3 = obtainStyledAttributes.getResourceId(index, this.f1063e);
                        this.f1063e = resourceId3;
                        if (resourceId3 != -1) {
                            break;
                        } else {
                            this.f1063e = obtainStyledAttributes.getInt(index, -1);
                            break;
                        }
                    case 10:
                        int resourceId4 = obtainStyledAttributes.getResourceId(index, this.f1065f);
                        this.f1065f = resourceId4;
                        if (resourceId4 != -1) {
                            break;
                        } else {
                            this.f1065f = obtainStyledAttributes.getInt(index, -1);
                            break;
                        }
                    case 11:
                        int resourceId5 = obtainStyledAttributes.getResourceId(index, this.f1067g);
                        this.f1067g = resourceId5;
                        if (resourceId5 != -1) {
                            break;
                        } else {
                            this.f1067g = obtainStyledAttributes.getInt(index, -1);
                            break;
                        }
                    case 12:
                        int resourceId6 = obtainStyledAttributes.getResourceId(index, this.f1069h);
                        this.f1069h = resourceId6;
                        if (resourceId6 != -1) {
                            break;
                        } else {
                            this.f1069h = obtainStyledAttributes.getInt(index, -1);
                            break;
                        }
                    case 13:
                        int resourceId7 = obtainStyledAttributes.getResourceId(index, this.f1071i);
                        this.f1071i = resourceId7;
                        if (resourceId7 != -1) {
                            break;
                        } else {
                            this.f1071i = obtainStyledAttributes.getInt(index, -1);
                            break;
                        }
                    case 14:
                        int resourceId8 = obtainStyledAttributes.getResourceId(index, this.f1073j);
                        this.f1073j = resourceId8;
                        if (resourceId8 != -1) {
                            break;
                        } else {
                            this.f1073j = obtainStyledAttributes.getInt(index, -1);
                            break;
                        }
                    case 15:
                        int resourceId9 = obtainStyledAttributes.getResourceId(index, this.f1075k);
                        this.f1075k = resourceId9;
                        if (resourceId9 != -1) {
                            break;
                        } else {
                            this.f1075k = obtainStyledAttributes.getInt(index, -1);
                            break;
                        }
                    case 16:
                        int resourceId10 = obtainStyledAttributes.getResourceId(index, this.f1077l);
                        this.f1077l = resourceId10;
                        if (resourceId10 != -1) {
                            break;
                        } else {
                            this.f1077l = obtainStyledAttributes.getInt(index, -1);
                            break;
                        }
                    case 17:
                        int resourceId11 = obtainStyledAttributes.getResourceId(index, this.f1088r);
                        this.f1088r = resourceId11;
                        if (resourceId11 != -1) {
                            break;
                        } else {
                            this.f1088r = obtainStyledAttributes.getInt(index, -1);
                            break;
                        }
                    case 18:
                        int resourceId12 = obtainStyledAttributes.getResourceId(index, this.f1089s);
                        this.f1089s = resourceId12;
                        if (resourceId12 != -1) {
                            break;
                        } else {
                            this.f1089s = obtainStyledAttributes.getInt(index, -1);
                            break;
                        }
                    case 19:
                        int resourceId13 = obtainStyledAttributes.getResourceId(index, this.f1090t);
                        this.f1090t = resourceId13;
                        if (resourceId13 != -1) {
                            break;
                        } else {
                            this.f1090t = obtainStyledAttributes.getInt(index, -1);
                            break;
                        }
                    case 20:
                        int resourceId14 = obtainStyledAttributes.getResourceId(index, this.f1091u);
                        this.f1091u = resourceId14;
                        if (resourceId14 != -1) {
                            break;
                        } else {
                            this.f1091u = obtainStyledAttributes.getInt(index, -1);
                            break;
                        }
                    case 21:
                        this.f1092v = obtainStyledAttributes.getDimensionPixelSize(index, this.f1092v);
                        break;
                    case 22:
                        this.f1093w = obtainStyledAttributes.getDimensionPixelSize(index, this.f1093w);
                        break;
                    case 23:
                        this.f1094x = obtainStyledAttributes.getDimensionPixelSize(index, this.f1094x);
                        break;
                    case 24:
                        this.f1095y = obtainStyledAttributes.getDimensionPixelSize(index, this.f1095y);
                        break;
                    case 25:
                        this.f1096z = obtainStyledAttributes.getDimensionPixelSize(index, this.f1096z);
                        break;
                    case 26:
                        this.f1029A = obtainStyledAttributes.getDimensionPixelSize(index, this.f1029A);
                        break;
                    case 27:
                        this.f1050V = obtainStyledAttributes.getBoolean(index, this.f1050V);
                        break;
                    case 28:
                        this.f1051W = obtainStyledAttributes.getBoolean(index, this.f1051W);
                        break;
                    case 29:
                        this.f1032D = obtainStyledAttributes.getFloat(index, this.f1032D);
                        break;
                    case 30:
                        this.f1033E = obtainStyledAttributes.getFloat(index, this.f1033E);
                        break;
                    case 31:
                        this.f1039K = obtainStyledAttributes.getInt(index, 0);
                        break;
                    case 32:
                        this.f1040L = obtainStyledAttributes.getInt(index, 0);
                        break;
                    case 33:
                        try {
                            this.f1041M = obtainStyledAttributes.getDimensionPixelSize(index, this.f1041M);
                            break;
                        } catch (Exception unused) {
                            if (obtainStyledAttributes.getInt(index, this.f1041M) != -2) {
                                break;
                            } else {
                                this.f1041M = -2;
                                break;
                            }
                        }
                    case 34:
                        try {
                            this.f1043O = obtainStyledAttributes.getDimensionPixelSize(index, this.f1043O);
                            break;
                        } catch (Exception unused2) {
                            if (obtainStyledAttributes.getInt(index, this.f1043O) != -2) {
                                break;
                            } else {
                                this.f1043O = -2;
                                break;
                            }
                        }
                    case 35:
                        this.f1045Q = Math.max(0.0f, obtainStyledAttributes.getFloat(index, this.f1045Q));
                        this.f1039K = 2;
                        break;
                    case 36:
                        try {
                            this.f1042N = obtainStyledAttributes.getDimensionPixelSize(index, this.f1042N);
                            break;
                        } catch (Exception unused3) {
                            if (obtainStyledAttributes.getInt(index, this.f1042N) != -2) {
                                break;
                            } else {
                                this.f1042N = -2;
                                break;
                            }
                        }
                    case 37:
                        try {
                            this.f1044P = obtainStyledAttributes.getDimensionPixelSize(index, this.f1044P);
                            break;
                        } catch (Exception unused4) {
                            if (obtainStyledAttributes.getInt(index, this.f1044P) != -2) {
                                break;
                            } else {
                                this.f1044P = -2;
                                break;
                            }
                        }
                    case 38:
                        this.f1046R = Math.max(0.0f, obtainStyledAttributes.getFloat(index, this.f1046R));
                        this.f1040L = 2;
                        break;
                    default:
                        switch (i2) {
                            case 44:
                                C0237b.m636j(this, obtainStyledAttributes.getString(index));
                                break;
                            case 45:
                                this.f1035G = obtainStyledAttributes.getFloat(index, this.f1035G);
                                break;
                            case 46:
                                this.f1036H = obtainStyledAttributes.getFloat(index, this.f1036H);
                                break;
                            case 47:
                                this.f1037I = obtainStyledAttributes.getInt(index, 0);
                                break;
                            case 48:
                                this.f1038J = obtainStyledAttributes.getInt(index, 0);
                                break;
                            case 49:
                                this.f1047S = obtainStyledAttributes.getDimensionPixelOffset(index, this.f1047S);
                                break;
                            case 50:
                                this.f1048T = obtainStyledAttributes.getDimensionPixelOffset(index, this.f1048T);
                                break;
                            case 51:
                                this.f1052X = obtainStyledAttributes.getString(index);
                                break;
                            case 52:
                                int resourceId15 = obtainStyledAttributes.getResourceId(index, this.f1079m);
                                this.f1079m = resourceId15;
                                if (resourceId15 != -1) {
                                    break;
                                } else {
                                    this.f1079m = obtainStyledAttributes.getInt(index, -1);
                                    break;
                                }
                            case 53:
                                int resourceId16 = obtainStyledAttributes.getResourceId(index, this.f1081n);
                                this.f1081n = resourceId16;
                                if (resourceId16 != -1) {
                                    break;
                                } else {
                                    this.f1081n = obtainStyledAttributes.getInt(index, -1);
                                    break;
                                }
                            case 54:
                                this.f1031C = obtainStyledAttributes.getDimensionPixelSize(index, this.f1031C);
                                break;
                            case 55:
                                this.f1030B = obtainStyledAttributes.getDimensionPixelSize(index, this.f1030B);
                                break;
                            default:
                                switch (i2) {
                                    case 64:
                                        C0237b.m635i(this, obtainStyledAttributes, index, 0);
                                        break;
                                    case 65:
                                        C0237b.m635i(this, obtainStyledAttributes, index, 1);
                                        break;
                                    case 66:
                                        this.f1053Y = obtainStyledAttributes.getInt(index, this.f1053Y);
                                        break;
                                }
                        }
                }
            }
            obtainStyledAttributes.recycle();
            mo1281a();
        }

        public C0233a(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        /* renamed from: a */
        public void mo1281a() {
            this.f1060c0 = false;
            this.f1054Z = true;
            this.f1056a0 = true;
            int i = this.width;
            if (i == -2 && this.f1050V) {
                this.f1054Z = false;
                if (this.f1039K == 0) {
                    this.f1039K = 1;
                }
            }
            int i2 = this.height;
            if (i2 == -2 && this.f1051W) {
                this.f1056a0 = false;
                if (this.f1040L == 0) {
                    this.f1040L = 1;
                }
            }
            if (i == 0 || i == -1) {
                this.f1054Z = false;
                if (i == 0 && this.f1039K == 1) {
                    this.width = -2;
                    this.f1050V = true;
                }
            }
            if (i2 == 0 || i2 == -1) {
                this.f1056a0 = false;
                if (i2 == 0 && this.f1040L == 1) {
                    this.height = -2;
                    this.f1051W = true;
                }
            }
            if (this.f1059c != -1.0f || this.f1055a != -1 || this.f1057b != -1) {
                this.f1060c0 = true;
                this.f1054Z = true;
                this.f1056a0 = true;
                if (!(this.f1086p0 instanceof C1697g)) {
                    this.f1086p0 = new C1697g();
                }
                ((C1697g) this.f1086p0).mo5956R(this.f1049U);
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:70:0x00d0, code lost:
            if (r1 > 0) goto L_0x00d2;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:76:0x00df, code lost:
            if (r1 > 0) goto L_0x00d2;
         */
        /* JADX WARNING: Removed duplicated region for block: B:15:0x004e  */
        /* JADX WARNING: Removed duplicated region for block: B:18:0x0055  */
        /* JADX WARNING: Removed duplicated region for block: B:21:0x005c  */
        /* JADX WARNING: Removed duplicated region for block: B:24:0x0062  */
        /* JADX WARNING: Removed duplicated region for block: B:27:0x0068  */
        /* JADX WARNING: Removed duplicated region for block: B:34:0x007a  */
        /* JADX WARNING: Removed duplicated region for block: B:35:0x0082  */
        /* JADX WARNING: Removed duplicated region for block: B:79:0x00e6  */
        /* JADX WARNING: Removed duplicated region for block: B:83:0x00f1  */
        @android.annotation.TargetApi(17)
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void resolveLayoutDirection(int r11) {
            /*
                r10 = this;
                int r0 = r10.leftMargin
                int r1 = r10.rightMargin
                super.resolveLayoutDirection(r11)
                int r11 = r10.getLayoutDirection()
                r2 = 0
                r3 = 1
                if (r3 != r11) goto L_0x0011
                r11 = r3
                goto L_0x0012
            L_0x0011:
                r11 = r2
            L_0x0012:
                r4 = -1
                r10.f1070h0 = r4
                r10.f1072i0 = r4
                r10.f1066f0 = r4
                r10.f1068g0 = r4
                r10.f1074j0 = r4
                r10.f1076k0 = r4
                int r5 = r10.f1092v
                r10.f1074j0 = r5
                int r5 = r10.f1094x
                r10.f1076k0 = r5
                float r5 = r10.f1032D
                r10.f1078l0 = r5
                int r6 = r10.f1055a
                r10.f1080m0 = r6
                int r7 = r10.f1057b
                r10.f1082n0 = r7
                float r8 = r10.f1059c
                r10.f1084o0 = r8
                r9 = -2147483648(0xffffffff80000000, float:-0.0)
                if (r11 == 0) goto L_0x0092
                int r11 = r10.f1088r
                if (r11 == r4) goto L_0x0043
                r10.f1070h0 = r11
            L_0x0041:
                r2 = r3
                goto L_0x004a
            L_0x0043:
                int r11 = r10.f1089s
                if (r11 == r4) goto L_0x004a
                r10.f1072i0 = r11
                goto L_0x0041
            L_0x004a:
                int r11 = r10.f1090t
                if (r11 == r4) goto L_0x0051
                r10.f1068g0 = r11
                r2 = r3
            L_0x0051:
                int r11 = r10.f1091u
                if (r11 == r4) goto L_0x0058
                r10.f1066f0 = r11
                r2 = r3
            L_0x0058:
                int r11 = r10.f1096z
                if (r11 == r9) goto L_0x005e
                r10.f1076k0 = r11
            L_0x005e:
                int r11 = r10.f1029A
                if (r11 == r9) goto L_0x0064
                r10.f1074j0 = r11
            L_0x0064:
                r11 = 1065353216(0x3f800000, float:1.0)
                if (r2 == 0) goto L_0x006c
                float r2 = r11 - r5
                r10.f1078l0 = r2
            L_0x006c:
                boolean r2 = r10.f1060c0
                if (r2 == 0) goto L_0x00b6
                int r2 = r10.f1049U
                if (r2 != r3) goto L_0x00b6
                r2 = -1082130432(0xffffffffbf800000, float:-1.0)
                int r3 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
                if (r3 == 0) goto L_0x0082
                float r11 = r11 - r8
                r10.f1084o0 = r11
                r10.f1080m0 = r4
                r10.f1082n0 = r4
                goto L_0x00b6
            L_0x0082:
                if (r6 == r4) goto L_0x008b
                r10.f1082n0 = r6
                r10.f1080m0 = r4
            L_0x0088:
                r10.f1084o0 = r2
                goto L_0x00b6
            L_0x008b:
                if (r7 == r4) goto L_0x00b6
                r10.f1080m0 = r7
                r10.f1082n0 = r4
                goto L_0x0088
            L_0x0092:
                int r11 = r10.f1088r
                if (r11 == r4) goto L_0x0098
                r10.f1068g0 = r11
            L_0x0098:
                int r11 = r10.f1089s
                if (r11 == r4) goto L_0x009e
                r10.f1066f0 = r11
            L_0x009e:
                int r11 = r10.f1090t
                if (r11 == r4) goto L_0x00a4
                r10.f1070h0 = r11
            L_0x00a4:
                int r11 = r10.f1091u
                if (r11 == r4) goto L_0x00aa
                r10.f1072i0 = r11
            L_0x00aa:
                int r11 = r10.f1096z
                if (r11 == r9) goto L_0x00b0
                r10.f1074j0 = r11
            L_0x00b0:
                int r11 = r10.f1029A
                if (r11 == r9) goto L_0x00b6
                r10.f1076k0 = r11
            L_0x00b6:
                int r11 = r10.f1090t
                if (r11 != r4) goto L_0x00fe
                int r11 = r10.f1091u
                if (r11 != r4) goto L_0x00fe
                int r11 = r10.f1089s
                if (r11 != r4) goto L_0x00fe
                int r11 = r10.f1088r
                if (r11 != r4) goto L_0x00fe
                int r11 = r10.f1065f
                if (r11 == r4) goto L_0x00d5
                r10.f1070h0 = r11
                int r11 = r10.rightMargin
                if (r11 > 0) goto L_0x00e2
                if (r1 <= 0) goto L_0x00e2
            L_0x00d2:
                r10.rightMargin = r1
                goto L_0x00e2
            L_0x00d5:
                int r11 = r10.f1067g
                if (r11 == r4) goto L_0x00e2
                r10.f1072i0 = r11
                int r11 = r10.rightMargin
                if (r11 > 0) goto L_0x00e2
                if (r1 <= 0) goto L_0x00e2
                goto L_0x00d2
            L_0x00e2:
                int r11 = r10.f1061d
                if (r11 == r4) goto L_0x00f1
                r10.f1066f0 = r11
                int r11 = r10.leftMargin
                if (r11 > 0) goto L_0x00fe
                if (r0 <= 0) goto L_0x00fe
            L_0x00ee:
                r10.leftMargin = r0
                goto L_0x00fe
            L_0x00f1:
                int r11 = r10.f1063e
                if (r11 == r4) goto L_0x00fe
                r10.f1068g0 = r11
                int r11 = r10.leftMargin
                if (r11 > 0) goto L_0x00fe
                if (r0 <= 0) goto L_0x00fe
                goto L_0x00ee
            L_0x00fe:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.C0233a.resolveLayoutDirection(int):void");
        }
    }

    /* renamed from: androidx.constraintlayout.widget.ConstraintLayout$b */
    public class C0235b implements C1746b.C1748b {

        /* renamed from: a */
        public ConstraintLayout f1098a;

        /* renamed from: b */
        public int f1099b;

        /* renamed from: c */
        public int f1100c;

        /* renamed from: d */
        public int f1101d;

        /* renamed from: e */
        public int f1102e;

        /* renamed from: f */
        public int f1103f;

        /* renamed from: g */
        public int f1104g;

        public C0235b(ConstraintLayout constraintLayout) {
            this.f1098a = constraintLayout;
        }

        /* renamed from: a */
        public final boolean mo1283a(int i, int i2, int i3) {
            if (i == i2) {
                return true;
            }
            int mode = View.MeasureSpec.getMode(i);
            View.MeasureSpec.getSize(i);
            int mode2 = View.MeasureSpec.getMode(i2);
            int size = View.MeasureSpec.getSize(i2);
            if (mode2 == 1073741824) {
                return (mode == Integer.MIN_VALUE || mode == 0) && i3 == size;
            }
            return false;
        }

        /* JADX WARNING: Removed duplicated region for block: B:114:0x019e  */
        /* JADX WARNING: Removed duplicated region for block: B:115:0x01a0  */
        /* JADX WARNING: Removed duplicated region for block: B:117:0x01a3  */
        /* JADX WARNING: Removed duplicated region for block: B:120:0x01b6  */
        /* JADX WARNING: Removed duplicated region for block: B:121:0x01b8  */
        /* JADX WARNING: Removed duplicated region for block: B:123:0x01bb  */
        /* JADX WARNING: Removed duplicated region for block: B:124:0x01bd  */
        /* JADX WARNING: Removed duplicated region for block: B:138:0x01d8  */
        /* JADX WARNING: Removed duplicated region for block: B:139:0x01da  */
        /* JADX WARNING: Removed duplicated region for block: B:143:0x01e3  */
        /* JADX WARNING: Removed duplicated region for block: B:144:0x01e5  */
        /* JADX WARNING: Removed duplicated region for block: B:146:0x01e8 A[RETURN] */
        /* JADX WARNING: Removed duplicated region for block: B:147:0x01e9  */
        @android.annotation.SuppressLint({"WrongCall"})
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo1284b(p111s.C1695e r18, p117t.C1746b.C1747a r19) {
            /*
                r17 = this;
                r0 = r17
                r1 = r18
                r2 = r19
                if (r1 != 0) goto L_0x0009
                return
            L_0x0009:
                int r3 = r1.f5213h0
                r4 = 8
                r5 = 0
                if (r3 != r4) goto L_0x001b
                boolean r3 = r1.f5176E
                if (r3 != 0) goto L_0x001b
                r2.f5345e = r5
                r2.f5346f = r5
                r2.f5347g = r5
                return
            L_0x001b:
                s.e r3 = r1.f5192U
                if (r3 != 0) goto L_0x0020
                return
            L_0x0020:
                int r3 = r2.f5341a
                int r4 = r2.f5342b
                int r6 = r2.f5343c
                int r7 = r2.f5344d
                int r8 = r0.f1099b
                int r9 = r0.f1100c
                int r8 = r8 + r9
                int r9 = r0.f1101d
                java.lang.Object r10 = r1.f5211g0
                android.view.View r10 = (android.view.View) r10
                int r11 = p099q.C1600i.m4504a(r3)
                r12 = 2
                r13 = 3
                r14 = -1
                r15 = 1
                if (r11 == 0) goto L_0x00b1
                if (r11 == r15) goto L_0x00a7
                if (r11 == r12) goto L_0x005d
                if (r11 == r13) goto L_0x0045
                goto L_0x00b7
            L_0x0045:
                int r6 = r0.f1103f
                s.d r11 = r1.f5180I
                if (r11 == 0) goto L_0x004f
                int r11 = r11.f5160g
                int r11 = r11 + r5
                goto L_0x0050
            L_0x004f:
                r11 = r5
            L_0x0050:
                s.d r5 = r1.f5182K
                if (r5 == 0) goto L_0x0057
                int r5 = r5.f5160g
                int r11 = r11 + r5
            L_0x0057:
                int r9 = r9 + r11
                int r5 = android.view.ViewGroup.getChildMeasureSpec(r6, r9, r14)
                goto L_0x00b7
            L_0x005d:
                int r5 = r0.f1103f
                r6 = -2
                int r5 = android.view.ViewGroup.getChildMeasureSpec(r5, r9, r6)
                int r6 = r1.f5230q
                if (r6 != r15) goto L_0x006a
                r6 = r15
                goto L_0x006b
            L_0x006a:
                r6 = 0
            L_0x006b:
                int r9 = r2.f5350j
                if (r9 == r15) goto L_0x0075
                if (r9 != r12) goto L_0x0072
                goto L_0x0075
            L_0x0072:
                r11 = 1073741824(0x40000000, float:2.0)
                goto L_0x00b7
            L_0x0075:
                int r9 = r10.getMeasuredHeight()
                int r11 = r18.mo5929l()
                if (r9 != r11) goto L_0x0081
                r9 = r15
                goto L_0x0082
            L_0x0081:
                r9 = 0
            L_0x0082:
                int r11 = r2.f5350j
                if (r11 == r12) goto L_0x0099
                if (r6 == 0) goto L_0x0099
                if (r6 == 0) goto L_0x008c
                if (r9 != 0) goto L_0x0099
            L_0x008c:
                boolean r6 = r10 instanceof androidx.constraintlayout.widget.C0246d
                if (r6 != 0) goto L_0x0099
                boolean r6 = r18.mo5889A()
                if (r6 == 0) goto L_0x0097
                goto L_0x0099
            L_0x0097:
                r6 = 0
                goto L_0x009a
            L_0x0099:
                r6 = r15
            L_0x009a:
                if (r6 == 0) goto L_0x0072
                int r5 = r18.mo5935r()
                r11 = 1073741824(0x40000000, float:2.0)
                int r5 = android.view.View.MeasureSpec.makeMeasureSpec(r5, r11)
                goto L_0x00b7
            L_0x00a7:
                r11 = 1073741824(0x40000000, float:2.0)
                int r5 = r0.f1103f
                r6 = -2
                int r5 = android.view.ViewGroup.getChildMeasureSpec(r5, r9, r6)
                goto L_0x00b7
            L_0x00b1:
                r11 = 1073741824(0x40000000, float:2.0)
                int r5 = android.view.View.MeasureSpec.makeMeasureSpec(r6, r11)
            L_0x00b7:
                int r6 = p099q.C1600i.m4504a(r4)
                if (r6 == 0) goto L_0x0137
                if (r6 == r15) goto L_0x012d
                if (r6 == r12) goto L_0x00e3
                if (r6 == r13) goto L_0x00c6
                r9 = 0
                goto L_0x013e
            L_0x00c6:
                int r6 = r0.f1104g
                s.d r7 = r1.f5180I
                if (r7 == 0) goto L_0x00d3
                s.d r7 = r1.f5181J
                int r7 = r7.f5160g
                r9 = 0
                int r7 = r7 + r9
                goto L_0x00d4
            L_0x00d3:
                r7 = 0
            L_0x00d4:
                s.d r9 = r1.f5182K
                if (r9 == 0) goto L_0x00dd
                s.d r9 = r1.f5183L
                int r9 = r9.f5160g
                int r7 = r7 + r9
            L_0x00dd:
                int r8 = r8 + r7
                int r6 = android.view.ViewGroup.getChildMeasureSpec(r6, r8, r14)
                goto L_0x013d
            L_0x00e3:
                int r6 = r0.f1104g
                r7 = -2
                int r6 = android.view.ViewGroup.getChildMeasureSpec(r6, r8, r7)
                int r7 = r1.f5231r
                if (r7 != r15) goto L_0x00f0
                r7 = r15
                goto L_0x00f1
            L_0x00f0:
                r7 = 0
            L_0x00f1:
                int r8 = r2.f5350j
                if (r8 == r15) goto L_0x00fb
                if (r8 != r12) goto L_0x00f8
                goto L_0x00fb
            L_0x00f8:
                r9 = 1073741824(0x40000000, float:2.0)
                goto L_0x013d
            L_0x00fb:
                int r8 = r10.getMeasuredWidth()
                int r9 = r18.mo5935r()
                if (r8 != r9) goto L_0x0107
                r8 = r15
                goto L_0x0108
            L_0x0107:
                r8 = 0
            L_0x0108:
                int r9 = r2.f5350j
                if (r9 == r12) goto L_0x011f
                if (r7 == 0) goto L_0x011f
                if (r7 == 0) goto L_0x0112
                if (r8 != 0) goto L_0x011f
            L_0x0112:
                boolean r7 = r10 instanceof androidx.constraintlayout.widget.C0246d
                if (r7 != 0) goto L_0x011f
                boolean r7 = r18.mo5890B()
                if (r7 == 0) goto L_0x011d
                goto L_0x011f
            L_0x011d:
                r7 = 0
                goto L_0x0120
            L_0x011f:
                r7 = r15
            L_0x0120:
                if (r7 == 0) goto L_0x00f8
                int r6 = r18.mo5929l()
                r9 = 1073741824(0x40000000, float:2.0)
                int r6 = android.view.View.MeasureSpec.makeMeasureSpec(r6, r9)
                goto L_0x013d
            L_0x012d:
                r9 = 1073741824(0x40000000, float:2.0)
                int r6 = r0.f1104g
                r7 = -2
                int r6 = android.view.ViewGroup.getChildMeasureSpec(r6, r8, r7)
                goto L_0x013d
            L_0x0137:
                r9 = 1073741824(0x40000000, float:2.0)
                int r6 = android.view.View.MeasureSpec.makeMeasureSpec(r7, r9)
            L_0x013d:
                r9 = r6
            L_0x013e:
                s.e r6 = r1.f5192U
                s.f r6 = (p111s.C1696f) r6
                if (r6 == 0) goto L_0x01b4
                androidx.constraintlayout.widget.ConstraintLayout r7 = androidx.constraintlayout.widget.ConstraintLayout.this
                int r7 = r7.f1020m
                r8 = 256(0x100, float:3.59E-43)
                boolean r7 = p111s.C1700j.m4764b(r7, r8)
                if (r7 == 0) goto L_0x01b4
                int r7 = r10.getMeasuredWidth()
                int r8 = r18.mo5935r()
                if (r7 != r8) goto L_0x01b4
                int r7 = r10.getMeasuredWidth()
                int r8 = r6.mo5935r()
                if (r7 >= r8) goto L_0x01b4
                int r7 = r10.getMeasuredHeight()
                int r8 = r18.mo5929l()
                if (r7 != r8) goto L_0x01b4
                int r7 = r10.getMeasuredHeight()
                int r6 = r6.mo5929l()
                if (r7 >= r6) goto L_0x01b4
                int r6 = r10.getBaseline()
                int r7 = r1.f5201b0
                if (r6 != r7) goto L_0x01b4
                boolean r6 = r18.mo5943z()
                if (r6 != 0) goto L_0x01b4
                int r6 = r1.f5178G
                int r7 = r18.mo5935r()
                boolean r6 = r0.mo1283a(r6, r5, r7)
                if (r6 == 0) goto L_0x01a0
                int r6 = r1.f5179H
                int r7 = r18.mo5929l()
                boolean r6 = r0.mo1283a(r6, r9, r7)
                if (r6 == 0) goto L_0x01a0
                r6 = r15
                goto L_0x01a1
            L_0x01a0:
                r6 = 0
            L_0x01a1:
                if (r6 == 0) goto L_0x01b4
                int r3 = r18.mo5935r()
                r2.f5345e = r3
                int r3 = r18.mo5929l()
                r2.f5346f = r3
                int r1 = r1.f5201b0
                r2.f5347g = r1
                return
            L_0x01b4:
                if (r3 != r13) goto L_0x01b8
                r6 = r15
                goto L_0x01b9
            L_0x01b8:
                r6 = 0
            L_0x01b9:
                if (r4 != r13) goto L_0x01bd
                r7 = r15
                goto L_0x01be
            L_0x01bd:
                r7 = 0
            L_0x01be:
                r8 = 4
                if (r4 == r8) goto L_0x01c6
                if (r4 != r15) goto L_0x01c4
                goto L_0x01c6
            L_0x01c4:
                r4 = 0
                goto L_0x01c7
            L_0x01c6:
                r4 = r15
            L_0x01c7:
                if (r3 == r8) goto L_0x01ce
                if (r3 != r15) goto L_0x01cc
                goto L_0x01ce
            L_0x01cc:
                r3 = 0
                goto L_0x01cf
            L_0x01ce:
                r3 = r15
            L_0x01cf:
                r8 = 0
                if (r6 == 0) goto L_0x01da
                float r11 = r1.f5195X
                int r11 = (r11 > r8 ? 1 : (r11 == r8 ? 0 : -1))
                if (r11 <= 0) goto L_0x01da
                r11 = r15
                goto L_0x01db
            L_0x01da:
                r11 = 0
            L_0x01db:
                if (r7 == 0) goto L_0x01e5
                float r13 = r1.f5195X
                int r8 = (r13 > r8 ? 1 : (r13 == r8 ? 0 : -1))
                if (r8 <= 0) goto L_0x01e5
                r8 = r15
                goto L_0x01e6
            L_0x01e5:
                r8 = 0
            L_0x01e6:
                if (r10 != 0) goto L_0x01e9
                return
            L_0x01e9:
                android.view.ViewGroup$LayoutParams r13 = r10.getLayoutParams()
                androidx.constraintlayout.widget.ConstraintLayout$a r13 = (androidx.constraintlayout.widget.ConstraintLayout.C0233a) r13
                int r14 = r2.f5350j
                if (r14 == r15) goto L_0x0209
                if (r14 == r12) goto L_0x0209
                if (r6 == 0) goto L_0x0209
                int r6 = r1.f5230q
                if (r6 != 0) goto L_0x0209
                if (r7 == 0) goto L_0x0209
                int r6 = r1.f5231r
                if (r6 == 0) goto L_0x0202
                goto L_0x0209
            L_0x0202:
                r0 = -1
                r4 = 0
                r9 = 0
                r14 = 0
                r15 = 0
                goto L_0x02ad
            L_0x0209:
                boolean r6 = r10 instanceof p129v.C1963g
                if (r6 == 0) goto L_0x0218
                boolean r6 = r1 instanceof p111s.C1701k
                if (r6 == 0) goto L_0x0218
                r6 = r1
                s.k r6 = (p111s.C1701k) r6
                r6 = r10
                v.g r6 = (p129v.C1963g) r6
                goto L_0x021b
            L_0x0218:
                r10.measure(r5, r9)
            L_0x021b:
                r1.f5178G = r5
                r1.f5179H = r9
                r6 = 0
                r1.f5210g = r6
                int r6 = r10.getMeasuredWidth()
                int r7 = r10.getMeasuredHeight()
                int r12 = r10.getBaseline()
                int r14 = r1.f5233t
                if (r14 <= 0) goto L_0x0237
                int r14 = java.lang.Math.max(r14, r6)
                goto L_0x0238
            L_0x0237:
                r14 = r6
            L_0x0238:
                int r15 = r1.f5234u
                if (r15 <= 0) goto L_0x0240
                int r14 = java.lang.Math.min(r15, r14)
            L_0x0240:
                int r15 = r1.f5236w
                if (r15 <= 0) goto L_0x024b
                int r15 = java.lang.Math.max(r15, r7)
                r16 = r5
                goto L_0x024e
            L_0x024b:
                r16 = r5
                r15 = r7
            L_0x024e:
                int r5 = r1.f5237x
                if (r5 <= 0) goto L_0x0256
                int r15 = java.lang.Math.min(r5, r15)
            L_0x0256:
                androidx.constraintlayout.widget.ConstraintLayout r5 = androidx.constraintlayout.widget.ConstraintLayout.this
                int r5 = r5.f1020m
                r0 = 1
                boolean r5 = p111s.C1700j.m4764b(r5, r0)
                if (r5 != 0) goto L_0x027a
                r0 = 1056964608(0x3f000000, float:0.5)
                if (r11 == 0) goto L_0x026f
                if (r4 == 0) goto L_0x026f
                float r3 = r1.f5195X
                float r4 = (float) r15
                float r4 = r4 * r3
                float r4 = r4 + r0
                int r0 = (int) r4
                r14 = r0
                goto L_0x027a
            L_0x026f:
                if (r8 == 0) goto L_0x027a
                if (r3 == 0) goto L_0x027a
                float r3 = r1.f5195X
                float r4 = (float) r14
                float r4 = r4 / r3
                float r4 = r4 + r0
                int r0 = (int) r4
                r15 = r0
            L_0x027a:
                if (r6 != r14) goto L_0x0283
                if (r7 == r15) goto L_0x027f
                goto L_0x0283
            L_0x027f:
                r4 = r12
                r0 = -1
                r9 = 0
                goto L_0x02ad
            L_0x0283:
                r0 = 1073741824(0x40000000, float:2.0)
                if (r6 == r14) goto L_0x028c
                int r5 = android.view.View.MeasureSpec.makeMeasureSpec(r14, r0)
                goto L_0x028e
            L_0x028c:
                r5 = r16
            L_0x028e:
                if (r7 == r15) goto L_0x0294
                int r9 = android.view.View.MeasureSpec.makeMeasureSpec(r15, r0)
            L_0x0294:
                r10.measure(r5, r9)
                r1.f5178G = r5
                r1.f5179H = r9
                r9 = 0
                r1.f5210g = r9
                int r0 = r10.getMeasuredWidth()
                int r3 = r10.getMeasuredHeight()
                int r4 = r10.getBaseline()
                r14 = r0
                r15 = r3
                r0 = -1
            L_0x02ad:
                if (r4 == r0) goto L_0x02b1
                r0 = 1
                goto L_0x02b2
            L_0x02b1:
                r0 = r9
            L_0x02b2:
                int r3 = r2.f5343c
                if (r14 != r3) goto L_0x02bd
                int r3 = r2.f5344d
                if (r15 == r3) goto L_0x02bb
                goto L_0x02bd
            L_0x02bb:
                r5 = r9
                goto L_0x02be
            L_0x02bd:
                r5 = 1
            L_0x02be:
                r2.f5349i = r5
                boolean r3 = r13.f1058b0
                if (r3 == 0) goto L_0x02c5
                r0 = 1
            L_0x02c5:
                if (r0 == 0) goto L_0x02d1
                r3 = -1
                if (r4 == r3) goto L_0x02d1
                int r1 = r1.f5201b0
                if (r1 == r4) goto L_0x02d1
                r1 = 1
                r2.f5349i = r1
            L_0x02d1:
                r2.f5345e = r14
                r2.f5346f = r15
                r2.f5348h = r0
                r2.f5347g = r4
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.C0235b.mo1284b(s.e, t.b$a):void");
        }
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        mo1252g(attributeSet, 0, 0);
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        mo1252g(attributeSet, i, 0);
    }

    private int getPaddingWidth() {
        int max = Math.max(0, getPaddingRight()) + Math.max(0, getPaddingLeft());
        int max2 = Math.max(0, getPaddingEnd()) + Math.max(0, getPaddingStart());
        return max2 > 0 ? max2 : max;
    }

    public static C1962f getSharedValues() {
        if (f1011v == null) {
            f1011v = new C1962f();
        }
        return f1011v;
    }

    /* renamed from: b */
    public C0233a generateDefaultLayoutParams() {
        return new C0233a(-2, -2);
    }

    /* renamed from: c */
    public Object mo1246c(int i, Object obj) {
        if (i != 0 || !(obj instanceof String)) {
            return null;
        }
        String str = (String) obj;
        HashMap<String, Integer> hashMap = this.f1024q;
        if (hashMap == null || !hashMap.containsKey(str)) {
            return null;
        }
        return this.f1024q.get(str);
    }

    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C0233a;
    }

    public void dispatchDraw(Canvas canvas) {
        Object tag;
        int size;
        ArrayList<C0236a> arrayList = this.f1013f;
        if (arrayList != null && (size = arrayList.size()) > 0) {
            for (int i = 0; i < size; i++) {
                Objects.requireNonNull(this.f1013f.get(i));
            }
        }
        super.dispatchDraw(canvas);
        if (isInEditMode()) {
            float width = (float) getWidth();
            float height = (float) getHeight();
            int childCount = getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = getChildAt(i2);
                if (!(childAt.getVisibility() == 8 || (tag = childAt.getTag()) == null || !(tag instanceof String))) {
                    String[] split = ((String) tag).split(",");
                    if (split.length == 4) {
                        int parseInt = Integer.parseInt(split[0]);
                        int parseInt2 = Integer.parseInt(split[1]);
                        int parseInt3 = Integer.parseInt(split[2]);
                        int i3 = (int) ((((float) parseInt) / 1080.0f) * width);
                        int i4 = (int) ((((float) parseInt2) / 1920.0f) * height);
                        Paint paint = new Paint();
                        paint.setColor(-65536);
                        float f = (float) i3;
                        float f2 = (float) (i3 + ((int) ((((float) parseInt3) / 1080.0f) * width)));
                        Canvas canvas2 = canvas;
                        float f3 = (float) i4;
                        float f4 = f;
                        float f5 = f;
                        float f6 = f3;
                        Paint paint2 = paint;
                        float f7 = f2;
                        Paint paint3 = paint2;
                        canvas2.drawLine(f4, f6, f7, f3, paint3);
                        float parseInt4 = (float) (i4 + ((int) ((((float) Integer.parseInt(split[3])) / 1920.0f) * height)));
                        float f8 = f2;
                        float f9 = parseInt4;
                        canvas2.drawLine(f8, f6, f7, f9, paint3);
                        float f10 = parseInt4;
                        float f11 = f5;
                        canvas2.drawLine(f8, f10, f11, f9, paint3);
                        float f12 = f5;
                        canvas2.drawLine(f12, f10, f11, f3, paint3);
                        Paint paint4 = paint2;
                        paint4.setColor(-16711936);
                        Paint paint5 = paint4;
                        float f13 = f2;
                        Paint paint6 = paint5;
                        canvas2.drawLine(f12, f3, f13, parseInt4, paint6);
                        canvas2.drawLine(f12, parseInt4, f13, f3, paint6);
                    }
                }
            }
        }
    }

    /* renamed from: e */
    public View mo1249e(int i) {
        return this.f1012e.get(i);
    }

    /* renamed from: f */
    public final C1695e mo1250f(View view) {
        if (view == this) {
            return this.f1014g;
        }
        if (view == null) {
            return null;
        }
        if (!(view.getLayoutParams() instanceof C0233a)) {
            view.setLayoutParams(generateLayoutParams(view.getLayoutParams()));
            if (!(view.getLayoutParams() instanceof C0233a)) {
                return null;
            }
        }
        return ((C0233a) view.getLayoutParams()).f1086p0;
    }

    public void forceLayout() {
        this.f1019l = true;
        super.forceLayout();
    }

    /* renamed from: g */
    public final void mo1252g(AttributeSet attributeSet, int i, int i2) {
        C1696f fVar = this.f1014g;
        fVar.f5211g0 = this;
        C0235b bVar = this.f1026s;
        fVar.f5255u0 = bVar;
        fVar.f5253s0.f5358f = bVar;
        this.f1012e.put(getId(), this);
        this.f1021n = null;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C1961e.f5784b, i, i2);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i3 = 0; i3 < indexCount; i3++) {
                int index = obtainStyledAttributes.getIndex(i3);
                if (index == 16) {
                    this.f1015h = obtainStyledAttributes.getDimensionPixelOffset(index, this.f1015h);
                } else if (index == 17) {
                    this.f1016i = obtainStyledAttributes.getDimensionPixelOffset(index, this.f1016i);
                } else if (index == 14) {
                    this.f1017j = obtainStyledAttributes.getDimensionPixelOffset(index, this.f1017j);
                } else if (index == 15) {
                    this.f1018k = obtainStyledAttributes.getDimensionPixelOffset(index, this.f1018k);
                } else if (index == 112) {
                    this.f1020m = obtainStyledAttributes.getInt(index, this.f1020m);
                } else if (index == 55) {
                    int resourceId = obtainStyledAttributes.getResourceId(index, 0);
                    if (resourceId != 0) {
                        try {
                            mo1262k(resourceId);
                        } catch (Resources.NotFoundException unused) {
                            this.f1022o = null;
                        }
                    }
                } else if (index == 34) {
                    int resourceId2 = obtainStyledAttributes.getResourceId(index, 0);
                    try {
                        C0237b bVar2 = new C0237b();
                        this.f1021n = bVar2;
                        bVar2.mo1313h(getContext(), resourceId2);
                    } catch (Resources.NotFoundException unused2) {
                        this.f1021n = null;
                    }
                    this.f1023p = resourceId2;
                }
            }
            obtainStyledAttributes.recycle();
        }
        this.f1014g.mo5954b0(this.f1020m);
    }

    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C0233a(getContext(), attributeSet);
    }

    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new C0233a(layoutParams);
    }

    public int getMaxHeight() {
        return this.f1018k;
    }

    public int getMaxWidth() {
        return this.f1017j;
    }

    public int getMinHeight() {
        return this.f1016i;
    }

    public int getMinWidth() {
        return this.f1015h;
    }

    public int getOptimizationLevel() {
        return this.f1014g.f5243D0;
    }

    /* renamed from: h */
    public boolean mo1261h() {
        return ((getContext().getApplicationInfo().flags & EnumBarcodeFormat_2.BF2_PLANET) != 0) && 1 == getLayoutDirection();
    }

    /* renamed from: k */
    public void mo1262k(int i) {
        this.f1022o = new C1956b(getContext(), this, i);
    }

    /* renamed from: l */
    public void mo1263l(int i, int i2, int i3, int i4, boolean z, boolean z2) {
        C0235b bVar = this.f1026s;
        int i5 = bVar.f1102e;
        int resolveSizeAndState = ViewGroup.resolveSizeAndState(i3 + bVar.f1101d, i, 0);
        int min = Math.min(this.f1017j, resolveSizeAndState & 16777215);
        int min2 = Math.min(this.f1018k, ViewGroup.resolveSizeAndState(i4 + i5, i2, 0) & 16777215);
        if (z) {
            min |= EnumBarcodeFormat_2.BF2_RM4SCC;
        }
        if (z2) {
            min2 |= EnumBarcodeFormat_2.BF2_RM4SCC;
        }
        setMeasuredDimension(min, min2);
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        View content;
        int childCount = getChildCount();
        boolean isInEditMode = isInEditMode();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            C0233a aVar = (C0233a) childAt.getLayoutParams();
            C1695e eVar = aVar.f1086p0;
            if ((childAt.getVisibility() != 8 || aVar.f1060c0 || aVar.f1062d0 || isInEditMode) && !aVar.f1064e0) {
                int s = eVar.mo5936s();
                int t = eVar.mo5937t();
                int r = eVar.mo5935r() + s;
                int l = eVar.mo5929l() + t;
                childAt.layout(s, t, r, l);
                if ((childAt instanceof C0246d) && (content = ((C0246d) childAt).getContent()) != null) {
                    content.setVisibility(0);
                    content.layout(s, t, r, l);
                }
            }
        }
        int size = this.f1013f.size();
        if (size > 0) {
            for (int i6 = 0; i6 < size; i6++) {
                Objects.requireNonNull(this.f1013f.get(i6));
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:204:0x049c  */
    /* JADX WARNING: Removed duplicated region for block: B:211:0x04b8  */
    /* JADX WARNING: Removed duplicated region for block: B:266:0x0550  */
    /* JADX WARNING: Removed duplicated region for block: B:289:0x05df  */
    /* JADX WARNING: Removed duplicated region for block: B:291:0x05e5  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00da  */
    /* JADX WARNING: Removed duplicated region for block: B:375:0x07a9  */
    /* JADX WARNING: Removed duplicated region for block: B:407:0x0554 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00f2  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x010c  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x0111  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x017c  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x017e  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x0181  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x01e4 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x01ef  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMeasure(int r28, int r29) {
        /*
            r27 = this;
            r7 = r27
            r1 = r28
            r2 = r29
            boolean r0 = r7.f1019l
            r3 = 1
            r4 = 0
            if (r0 != 0) goto L_0x0023
            int r0 = r27.getChildCount()
            r5 = r4
        L_0x0011:
            if (r5 >= r0) goto L_0x0023
            android.view.View r6 = r7.getChildAt(r5)
            boolean r6 = r6.isLayoutRequested()
            if (r6 == 0) goto L_0x0020
            r7.f1019l = r3
            goto L_0x0023
        L_0x0020:
            int r5 = r5 + 1
            goto L_0x0011
        L_0x0023:
            r7.f1027t = r1
            r7.f1028u = r2
            s.f r0 = r7.f1014g
            boolean r5 = r27.mo1261h()
            r0.f5256v0 = r5
            boolean r0 = r7.f1019l
            if (r0 == 0) goto L_0x0042
            r7.f1019l = r4
            boolean r0 = r27.mo1270r()
            if (r0 == 0) goto L_0x0042
            s.f r0 = r7.f1014g
            t.b r5 = r0.f5252r0
            r5.mo6010c(r0)
        L_0x0042:
            s.f r0 = r7.f1014g
            int r5 = r7.f1020m
            int r6 = android.view.View.MeasureSpec.getMode(r28)
            int r8 = android.view.View.MeasureSpec.getSize(r28)
            int r9 = android.view.View.MeasureSpec.getMode(r29)
            int r10 = android.view.View.MeasureSpec.getSize(r29)
            int r11 = r27.getPaddingTop()
            int r11 = java.lang.Math.max(r4, r11)
            int r12 = r27.getPaddingBottom()
            int r12 = java.lang.Math.max(r4, r12)
            int r13 = r11 + r12
            int r14 = r27.getPaddingWidth()
            androidx.constraintlayout.widget.ConstraintLayout$b r15 = r7.f1026s
            r15.f1099b = r11
            r15.f1100c = r12
            r15.f1101d = r14
            r15.f1102e = r13
            r15.f1103f = r1
            r15.f1104g = r2
            int r12 = r27.getPaddingStart()
            int r12 = java.lang.Math.max(r4, r12)
            int r15 = r27.getPaddingEnd()
            int r15 = java.lang.Math.max(r4, r15)
            if (r12 > 0) goto L_0x0098
            if (r15 <= 0) goto L_0x008f
            goto L_0x0098
        L_0x008f:
            int r12 = r27.getPaddingLeft()
            int r12 = java.lang.Math.max(r4, r12)
            goto L_0x009f
        L_0x0098:
            boolean r16 = r27.mo1261h()
            if (r16 == 0) goto L_0x009f
            r12 = r15
        L_0x009f:
            int r8 = r8 - r14
            int r10 = r10 - r13
            androidx.constraintlayout.widget.ConstraintLayout$b r13 = r7.f1026s
            int r14 = r13.f1102e
            int r13 = r13.f1101d
            int r15 = r27.getChildCount()
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = 1073741824(0x40000000, float:2.0)
            if (r6 == r3) goto L_0x00c9
            if (r6 == 0) goto L_0x00c2
            if (r6 == r4) goto L_0x00b7
            r4 = 1
            goto L_0x00c6
        L_0x00b7:
            int r4 = r7.f1017j
            int r4 = r4 - r13
            int r4 = java.lang.Math.min(r4, r8)
            r1 = r3
            r3 = r4
            r4 = 1
            goto L_0x00d8
        L_0x00c2:
            if (r15 != 0) goto L_0x00c5
            goto L_0x00cb
        L_0x00c5:
            r4 = 2
        L_0x00c6:
            r1 = r3
            r3 = 0
            goto L_0x00d8
        L_0x00c9:
            if (r15 != 0) goto L_0x00d3
        L_0x00cb:
            int r4 = r7.f1015h
            r3 = 0
            int r4 = java.lang.Math.max(r3, r4)
            goto L_0x00d4
        L_0x00d3:
            r4 = r8
        L_0x00d4:
            r3 = r4
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = 2
        L_0x00d8:
            if (r9 == r1) goto L_0x00f2
            if (r9 == 0) goto L_0x00ec
            r1 = 1073741824(0x40000000, float:2.0)
            if (r9 == r1) goto L_0x00e2
            r1 = 1
            goto L_0x00f0
        L_0x00e2:
            int r1 = r7.f1018k
            int r1 = r1 - r14
            int r1 = java.lang.Math.min(r1, r10)
            r15 = r1
            r1 = 1
            goto L_0x00ff
        L_0x00ec:
            if (r15 != 0) goto L_0x00ef
            goto L_0x00f4
        L_0x00ef:
            r1 = 2
        L_0x00f0:
            r15 = 0
            goto L_0x00ff
        L_0x00f2:
            if (r15 != 0) goto L_0x00fc
        L_0x00f4:
            int r1 = r7.f1016i
            r15 = 0
            int r1 = java.lang.Math.max(r15, r1)
            goto L_0x00fd
        L_0x00fc:
            r1 = r10
        L_0x00fd:
            r15 = r1
            r1 = 2
        L_0x00ff:
            int r2 = r0.mo5935r()
            if (r3 != r2) goto L_0x0111
            int r2 = r0.mo5929l()
            if (r15 == r2) goto L_0x010c
            goto L_0x0111
        L_0x010c:
            r17 = r10
            r2 = 0
            r10 = 1
            goto L_0x0119
        L_0x0111:
            t.f r2 = r0.f5253s0
            r17 = r10
            r10 = 1
            r2.f5355c = r10
            r2 = 0
        L_0x0119:
            r0.f5197Z = r2
            r0.f5199a0 = r2
            int r10 = r7.f1017j
            int r10 = r10 - r13
            r18 = r8
            int[] r8 = r0.f5173B
            r8[r2] = r10
            int r10 = r7.f1018k
            int r10 = r10 - r14
            r16 = 1
            r8[r16] = r10
            r0.mo5916L(r2)
            r0.mo5915K(r2)
            int[] r8 = r0.f5191T
            r8[r2] = r4
            r0.mo5918N(r3)
            int[] r2 = r0.f5191T
            r2[r16] = r1
            r0.mo5913I(r15)
            int r1 = r7.f1015h
            int r1 = r1 - r13
            r0.mo5916L(r1)
            int r1 = r7.f1016i
            int r1 = r1 - r14
            r0.mo5915K(r1)
            r0.f5258x0 = r12
            r0.f5259y0 = r11
            t.b r1 = r0.f5252r0
            java.util.Objects.requireNonNull(r1)
            s.d$a r2 = p111s.C1693d.C1694a.BOTTOM
            s.d$a r3 = p111s.C1693d.C1694a.RIGHT
            r4 = 3
            t.b$b r8 = r0.f5255u0
            java.util.ArrayList<s.e> r10 = r0.f5270q0
            int r10 = r10.size()
            int r11 = r0.mo5935r()
            int r12 = r0.mo5929l()
            r13 = 128(0x80, float:1.794E-43)
            boolean r13 = p111s.C1700j.m4764b(r5, r13)
            r14 = 64
            if (r13 != 0) goto L_0x017e
            boolean r5 = p111s.C1700j.m4764b(r5, r14)
            if (r5 == 0) goto L_0x017c
            goto L_0x017e
        L_0x017c:
            r5 = 0
            goto L_0x017f
        L_0x017e:
            r5 = 1
        L_0x017f:
            if (r5 == 0) goto L_0x01de
            r14 = 0
        L_0x0182:
            if (r14 >= r10) goto L_0x01de
            java.util.ArrayList<s.e> r15 = r0.f5270q0
            java.lang.Object r15 = r15.get(r14)
            s.e r15 = (p111s.C1695e) r15
            r21 = r5
            int r5 = r15.mo5930m()
            if (r5 != r4) goto L_0x0196
            r5 = 1
            goto L_0x0197
        L_0x0196:
            r5 = 0
        L_0x0197:
            int r7 = r15.mo5934q()
            if (r7 != r4) goto L_0x019f
            r7 = 1
            goto L_0x01a0
        L_0x019f:
            r7 = 0
        L_0x01a0:
            if (r5 == 0) goto L_0x01ad
            if (r7 == 0) goto L_0x01ad
            float r5 = r15.f5195X
            r7 = 0
            int r5 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r5 <= 0) goto L_0x01ad
            r5 = 1
            goto L_0x01ae
        L_0x01ad:
            r5 = 0
        L_0x01ae:
            boolean r7 = r15.mo5941x()
            if (r7 == 0) goto L_0x01b7
            if (r5 == 0) goto L_0x01b7
            goto L_0x01d9
        L_0x01b7:
            boolean r7 = r15.mo5942y()
            if (r7 == 0) goto L_0x01c0
            if (r5 == 0) goto L_0x01c0
            goto L_0x01d9
        L_0x01c0:
            boolean r5 = r15 instanceof p111s.C1701k
            if (r5 == 0) goto L_0x01c5
            goto L_0x01d9
        L_0x01c5:
            boolean r5 = r15.mo5941x()
            if (r5 != 0) goto L_0x01d9
            boolean r5 = r15.mo5942y()
            if (r5 == 0) goto L_0x01d2
            goto L_0x01d9
        L_0x01d2:
            int r14 = r14 + 1
            r7 = r27
            r5 = r21
            goto L_0x0182
        L_0x01d9:
            r5 = 1073741824(0x40000000, float:2.0)
            r21 = 0
            goto L_0x01e2
        L_0x01de:
            r21 = r5
            r5 = 1073741824(0x40000000, float:2.0)
        L_0x01e2:
            if (r6 != r5) goto L_0x01e6
            if (r9 == r5) goto L_0x01e8
        L_0x01e6:
            if (r13 == 0) goto L_0x01ea
        L_0x01e8:
            r5 = 1
            goto L_0x01eb
        L_0x01ea:
            r5 = 0
        L_0x01eb:
            r5 = r21 & r5
            if (r5 == 0) goto L_0x049c
            int[] r7 = r0.f5173B
            r14 = 0
            r7 = r7[r14]
            r14 = r18
            int r7 = java.lang.Math.min(r7, r14)
            int[] r14 = r0.f5173B
            r15 = 1
            r14 = r14[r15]
            r15 = r17
            int r14 = java.lang.Math.min(r14, r15)
            r15 = 1073741824(0x40000000, float:2.0)
            if (r6 != r15) goto L_0x0215
            int r4 = r0.mo5935r()
            if (r4 == r7) goto L_0x0215
            r0.mo5918N(r7)
            r0.mo5952Y()
        L_0x0215:
            if (r9 != r15) goto L_0x0223
            int r4 = r0.mo5929l()
            if (r4 == r14) goto L_0x0223
            r0.mo5913I(r14)
            r0.mo5952Y()
        L_0x0223:
            if (r6 != r15) goto L_0x03ee
            if (r9 != r15) goto L_0x03ee
            t.f r4 = r0.f5253s0
            r14 = 1
            r13 = r13 & r14
            boolean r14 = r4.f5354b
            if (r14 != 0) goto L_0x0236
            boolean r14 = r4.f5355c
            if (r14 == 0) goto L_0x0234
            goto L_0x0236
        L_0x0234:
            r14 = 0
            goto L_0x0273
        L_0x0236:
            s.f r14 = r4.f5353a
            java.util.ArrayList<s.e> r14 = r14.f5270q0
            java.util.Iterator r14 = r14.iterator()
        L_0x023e:
            boolean r15 = r14.hasNext()
            if (r15 == 0) goto L_0x025b
            java.lang.Object r15 = r14.next()
            s.e r15 = (p111s.C1695e) r15
            r15.mo5925h()
            r7 = 0
            r15.f5198a = r7
            t.m r7 = r15.f5204d
            r7.mo6033n()
            t.o r7 = r15.f5206e
            r7.mo6037m()
            goto L_0x023e
        L_0x025b:
            s.f r7 = r4.f5353a
            r7.mo5925h()
            s.f r7 = r4.f5353a
            r14 = 0
            r7.f5198a = r14
            t.m r7 = r7.f5204d
            r7.mo6033n()
            s.f r7 = r4.f5353a
            t.o r7 = r7.f5206e
            r7.mo6037m()
            r4.f5355c = r14
        L_0x0273:
            s.f r7 = r4.f5356d
            r4.mo6021b(r7)
            s.f r7 = r4.f5353a
            r7.f5197Z = r14
            r7.f5199a0 = r14
            int r7 = r7.mo5928k(r14)
            s.f r14 = r4.f5353a
            r15 = 1
            int r14 = r14.mo5928k(r15)
            boolean r15 = r4.f5354b
            if (r15 == 0) goto L_0x0290
            r4.mo6022c()
        L_0x0290:
            s.f r15 = r4.f5353a
            int r15 = r15.mo5936s()
            r21 = r5
            s.f r5 = r4.f5353a
            int r5 = r5.mo5937t()
            r22 = r2
            s.f r2 = r4.f5353a
            t.m r2 = r2.f5204d
            t.g r2 = r2.f5405h
            r2.mo6028c(r15)
            s.f r2 = r4.f5353a
            t.o r2 = r2.f5206e
            t.g r2 = r2.f5405h
            r2.mo6028c(r5)
            r4.mo6026g()
            r2 = 2
            if (r7 == r2) goto L_0x02c0
            if (r14 != r2) goto L_0x02bb
            goto L_0x02c0
        L_0x02bb:
            r23 = r3
            r24 = r8
            goto L_0x0326
        L_0x02c0:
            if (r13 == 0) goto L_0x02db
            java.util.ArrayList<t.q> r2 = r4.f5357e
            java.util.Iterator r2 = r2.iterator()
        L_0x02c8:
            boolean r23 = r2.hasNext()
            if (r23 == 0) goto L_0x02db
            java.lang.Object r23 = r2.next()
            t.q r23 = (p117t.C1765q) r23
            boolean r23 = r23.mo6016k()
            if (r23 != 0) goto L_0x02c8
            r13 = 0
        L_0x02db:
            if (r13 == 0) goto L_0x0302
            r2 = 2
            if (r7 != r2) goto L_0x0302
            s.f r2 = r4.f5353a
            r23 = r3
            int[] r3 = r2.f5191T
            r24 = r8
            r8 = 0
            r16 = 1
            r3[r8] = r16
            int r3 = r4.mo6023d(r2, r8)
            r2.mo5918N(r3)
            s.f r2 = r4.f5353a
            t.m r3 = r2.f5204d
            t.h r3 = r3.f5402e
            int r2 = r2.mo5935r()
            r3.mo6028c(r2)
            goto L_0x0306
        L_0x0302:
            r23 = r3
            r24 = r8
        L_0x0306:
            if (r13 == 0) goto L_0x0326
            r2 = 2
            if (r14 != r2) goto L_0x0326
            s.f r2 = r4.f5353a
            int[] r3 = r2.f5191T
            r8 = 1
            r3[r8] = r8
            int r3 = r4.mo6023d(r2, r8)
            r2.mo5913I(r3)
            s.f r2 = r4.f5353a
            t.o r3 = r2.f5206e
            t.h r3 = r3.f5402e
            int r2 = r2.mo5929l()
            r3.mo6028c(r2)
        L_0x0326:
            s.f r2 = r4.f5353a
            int[] r3 = r2.f5191T
            r8 = 0
            r13 = r3[r8]
            r25 = r11
            r11 = 1
            if (r13 == r11) goto L_0x033a
            r3 = r3[r8]
            r8 = 4
            if (r3 != r8) goto L_0x0338
            goto L_0x033a
        L_0x0338:
            r2 = 0
            goto L_0x037f
        L_0x033a:
            int r2 = r2.mo5935r()
            int r2 = r2 + r15
            s.f r3 = r4.f5353a
            t.m r3 = r3.f5204d
            t.g r3 = r3.f5406i
            r3.mo6028c(r2)
            s.f r3 = r4.f5353a
            t.m r3 = r3.f5204d
            t.h r3 = r3.f5402e
            int r2 = r2 - r15
            r3.mo6028c(r2)
            r4.mo6026g()
            s.f r2 = r4.f5353a
            int[] r3 = r2.f5191T
            r8 = 1
            r11 = r3[r8]
            if (r11 == r8) goto L_0x0363
            r3 = r3[r8]
            r8 = 4
            if (r3 != r8) goto L_0x037b
        L_0x0363:
            int r2 = r2.mo5929l()
            int r2 = r2 + r5
            s.f r3 = r4.f5353a
            t.o r3 = r3.f5206e
            t.g r3 = r3.f5406i
            r3.mo6028c(r2)
            s.f r3 = r4.f5353a
            t.o r3 = r3.f5206e
            t.h r3 = r3.f5402e
            int r2 = r2 - r5
            r3.mo6028c(r2)
        L_0x037b:
            r4.mo6026g()
            r2 = 1
        L_0x037f:
            java.util.ArrayList<t.q> r3 = r4.f5357e
            java.util.Iterator r3 = r3.iterator()
        L_0x0385:
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L_0x03a0
            java.lang.Object r5 = r3.next()
            t.q r5 = (p117t.C1765q) r5
            s.e r8 = r5.f5399b
            s.f r11 = r4.f5353a
            if (r8 != r11) goto L_0x039c
            boolean r8 = r5.f5404g
            if (r8 != 0) goto L_0x039c
            goto L_0x0385
        L_0x039c:
            r5.mo6013e()
            goto L_0x0385
        L_0x03a0:
            java.util.ArrayList<t.q> r3 = r4.f5357e
            java.util.Iterator r3 = r3.iterator()
        L_0x03a6:
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L_0x03dd
            java.lang.Object r5 = r3.next()
            t.q r5 = (p117t.C1765q) r5
            if (r2 != 0) goto L_0x03bb
            s.e r8 = r5.f5399b
            s.f r11 = r4.f5353a
            if (r8 != r11) goto L_0x03bb
            goto L_0x03a6
        L_0x03bb:
            t.g r8 = r5.f5405h
            boolean r8 = r8.f5370j
            if (r8 != 0) goto L_0x03c2
            goto L_0x03db
        L_0x03c2:
            t.g r8 = r5.f5406i
            boolean r8 = r8.f5370j
            if (r8 != 0) goto L_0x03cd
            boolean r8 = r5 instanceof p117t.C1758k
            if (r8 != 0) goto L_0x03cd
            goto L_0x03db
        L_0x03cd:
            t.h r8 = r5.f5402e
            boolean r8 = r8.f5370j
            if (r8 != 0) goto L_0x03a6
            boolean r8 = r5 instanceof p117t.C1749c
            if (r8 != 0) goto L_0x03a6
            boolean r5 = r5 instanceof p117t.C1758k
            if (r5 != 0) goto L_0x03a6
        L_0x03db:
            r2 = 0
            goto L_0x03de
        L_0x03dd:
            r2 = 1
        L_0x03de:
            s.f r3 = r4.f5353a
            r3.mo5914J(r7)
            s.f r3 = r4.f5353a
            r3.mo5917M(r14)
            r3 = r2
            r2 = 1073741824(0x40000000, float:2.0)
            r5 = 2
            goto L_0x048c
        L_0x03ee:
            r22 = r2
            r23 = r3
            r21 = r5
            r24 = r8
            r25 = r11
            t.f r2 = r0.f5253s0
            boolean r3 = r2.f5354b
            if (r3 == 0) goto L_0x0455
            s.f r3 = r2.f5353a
            java.util.ArrayList<s.e> r3 = r3.f5270q0
            java.util.Iterator r3 = r3.iterator()
        L_0x0406:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x042f
            java.lang.Object r4 = r3.next()
            s.e r4 = (p111s.C1695e) r4
            r4.mo5925h()
            r5 = 0
            r4.f5198a = r5
            t.m r7 = r4.f5204d
            t.h r8 = r7.f5402e
            r8.f5370j = r5
            r7.f5404g = r5
            r7.mo6033n()
            t.o r4 = r4.f5206e
            t.h r7 = r4.f5402e
            r7.f5370j = r5
            r4.f5404g = r5
            r4.mo6037m()
            goto L_0x0406
        L_0x042f:
            r5 = 0
            s.f r3 = r2.f5353a
            r3.mo5925h()
            s.f r3 = r2.f5353a
            r3.f5198a = r5
            t.m r3 = r3.f5204d
            t.h r4 = r3.f5402e
            r4.f5370j = r5
            r3.f5404g = r5
            r3.mo6033n()
            s.f r3 = r2.f5353a
            t.o r3 = r3.f5206e
            t.h r4 = r3.f5402e
            r4.f5370j = r5
            r3.f5404g = r5
            r3.mo6037m()
            r2.mo6022c()
            goto L_0x0456
        L_0x0455:
            r5 = 0
        L_0x0456:
            s.f r3 = r2.f5356d
            r2.mo6021b(r3)
            s.f r3 = r2.f5353a
            r3.f5197Z = r5
            r3.f5199a0 = r5
            t.m r3 = r3.f5204d
            t.g r3 = r3.f5405h
            r3.mo6028c(r5)
            s.f r2 = r2.f5353a
            t.o r2 = r2.f5206e
            t.g r2 = r2.f5405h
            r2.mo6028c(r5)
            r2 = 1073741824(0x40000000, float:2.0)
            if (r6 != r2) goto L_0x0480
            boolean r3 = r0.mo5951X(r13, r5)
            r4 = 1
            r16 = r3 & 1
            r5 = r4
            r3 = r16
            goto L_0x0483
        L_0x0480:
            r4 = 1
            r3 = r4
            r5 = 0
        L_0x0483:
            if (r9 != r2) goto L_0x048c
            boolean r7 = r0.mo5951X(r13, r4)
            r3 = r3 & r7
            int r5 = r5 + 1
        L_0x048c:
            if (r3 == 0) goto L_0x04a8
            if (r6 != r2) goto L_0x0492
            r4 = 1
            goto L_0x0493
        L_0x0492:
            r4 = 0
        L_0x0493:
            if (r9 != r2) goto L_0x0497
            r2 = 1
            goto L_0x0498
        L_0x0497:
            r2 = 0
        L_0x0498:
            r0.mo5919O(r4, r2)
            goto L_0x04a8
        L_0x049c:
            r22 = r2
            r23 = r3
            r21 = r5
            r24 = r8
            r25 = r11
            r3 = 0
            r5 = 0
        L_0x04a8:
            if (r3 == 0) goto L_0x04b2
            r2 = 2
            if (r5 == r2) goto L_0x04ae
            goto L_0x04b2
        L_0x04ae:
            r7 = r27
            goto L_0x07af
        L_0x04b2:
            int r2 = r0.f5243D0
            r3 = 8
            if (r10 <= 0) goto L_0x05d2
            java.util.ArrayList<s.e> r4 = r0.f5270q0
            int r4 = r4.size()
            r5 = 64
            boolean r5 = r0.mo5953a0(r5)
            t.b$b r6 = r0.f5255u0
            r7 = 0
        L_0x04c7:
            if (r7 >= r4) goto L_0x0558
            java.util.ArrayList<s.e> r8 = r0.f5270q0
            java.lang.Object r8 = r8.get(r7)
            s.e r8 = (p111s.C1695e) r8
            boolean r9 = r8 instanceof p111s.C1697g
            if (r9 == 0) goto L_0x04d6
            goto L_0x04f6
        L_0x04d6:
            boolean r9 = r8 instanceof p111s.C1690a
            if (r9 == 0) goto L_0x04db
            goto L_0x04f6
        L_0x04db:
            boolean r9 = r8.f5177F
            if (r9 == 0) goto L_0x04e0
            goto L_0x04f6
        L_0x04e0:
            if (r5 == 0) goto L_0x04f9
            t.m r9 = r8.f5204d
            if (r9 == 0) goto L_0x04f9
            t.o r11 = r8.f5206e
            if (r11 == 0) goto L_0x04f9
            t.h r9 = r9.f5402e
            boolean r9 = r9.f5370j
            if (r9 == 0) goto L_0x04f9
            t.h r9 = r11.f5402e
            boolean r9 = r9.f5370j
            if (r9 == 0) goto L_0x04f9
        L_0x04f6:
            r9 = 3
            r13 = 0
            goto L_0x0554
        L_0x04f9:
            r9 = 0
            int r11 = r8.mo5928k(r9)
            r9 = 1
            int r13 = r8.mo5928k(r9)
            r14 = 3
            if (r11 != r14) goto L_0x0512
            int r15 = r8.f5230q
            if (r15 == r9) goto L_0x0512
            if (r13 != r14) goto L_0x0512
            int r14 = r8.f5231r
            if (r14 == r9) goto L_0x0512
            r14 = r9
            goto L_0x0513
        L_0x0512:
            r14 = 0
        L_0x0513:
            if (r14 != 0) goto L_0x054b
            boolean r15 = r0.mo5953a0(r9)
            if (r15 == 0) goto L_0x054b
            boolean r9 = r8 instanceof p111s.C1701k
            if (r9 != 0) goto L_0x054b
            r9 = 3
            if (r11 != r9) goto L_0x052f
            int r15 = r8.f5230q
            if (r15 != 0) goto L_0x052f
            if (r13 == r9) goto L_0x052f
            boolean r15 = r8.mo5941x()
            if (r15 != 0) goto L_0x052f
            r14 = 1
        L_0x052f:
            if (r13 != r9) goto L_0x053e
            int r15 = r8.f5231r
            if (r15 != 0) goto L_0x053e
            if (r11 == r9) goto L_0x053e
            boolean r15 = r8.mo5941x()
            if (r15 != 0) goto L_0x053e
            r14 = 1
        L_0x053e:
            if (r11 == r9) goto L_0x0542
            if (r13 != r9) goto L_0x054c
        L_0x0542:
            float r11 = r8.f5195X
            r13 = 0
            int r11 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r11 <= 0) goto L_0x054d
            r14 = 1
            goto L_0x054d
        L_0x054b:
            r9 = 3
        L_0x054c:
            r13 = 0
        L_0x054d:
            if (r14 == 0) goto L_0x0550
            goto L_0x0554
        L_0x0550:
            r11 = 0
            r1.mo6008a(r6, r8, r11)
        L_0x0554:
            int r7 = r7 + 1
            goto L_0x04c7
        L_0x0558:
            androidx.constraintlayout.widget.ConstraintLayout$b r6 = (androidx.constraintlayout.widget.ConstraintLayout.C0235b) r6
            androidx.constraintlayout.widget.ConstraintLayout r4 = r6.f1098a
            int r4 = r4.getChildCount()
            r5 = 0
        L_0x0561:
            if (r5 >= r4) goto L_0x05b5
            androidx.constraintlayout.widget.ConstraintLayout r7 = r6.f1098a
            android.view.View r7 = r7.getChildAt(r5)
            boolean r8 = r7 instanceof androidx.constraintlayout.widget.C0246d
            if (r8 == 0) goto L_0x05b2
            androidx.constraintlayout.widget.d r7 = (androidx.constraintlayout.widget.C0246d) r7
            android.view.View r8 = r7.f1257f
            if (r8 != 0) goto L_0x0574
            goto L_0x05b2
        L_0x0574:
            android.view.ViewGroup$LayoutParams r8 = r7.getLayoutParams()
            androidx.constraintlayout.widget.ConstraintLayout$a r8 = (androidx.constraintlayout.widget.ConstraintLayout.C0233a) r8
            android.view.View r7 = r7.f1257f
            android.view.ViewGroup$LayoutParams r7 = r7.getLayoutParams()
            androidx.constraintlayout.widget.ConstraintLayout$a r7 = (androidx.constraintlayout.widget.ConstraintLayout.C0233a) r7
            s.e r9 = r7.f1086p0
            r11 = 0
            r9.f5213h0 = r11
            s.e r9 = r8.f1086p0
            int r9 = r9.mo5930m()
            r11 = 1
            if (r9 == r11) goto L_0x059b
            s.e r9 = r8.f1086p0
            s.e r13 = r7.f1086p0
            int r13 = r13.mo5935r()
            r9.mo5918N(r13)
        L_0x059b:
            s.e r9 = r8.f1086p0
            int r9 = r9.mo5934q()
            if (r9 == r11) goto L_0x05ae
            s.e r8 = r8.f1086p0
            s.e r9 = r7.f1086p0
            int r9 = r9.mo5929l()
            r8.mo5913I(r9)
        L_0x05ae:
            s.e r7 = r7.f1086p0
            r7.f5213h0 = r3
        L_0x05b2:
            int r5 = r5 + 1
            goto L_0x0561
        L_0x05b5:
            androidx.constraintlayout.widget.ConstraintLayout r4 = r6.f1098a
            java.util.ArrayList<androidx.constraintlayout.widget.a> r4 = r4.f1013f
            int r4 = r4.size()
            if (r4 <= 0) goto L_0x05d2
            r5 = 0
        L_0x05c0:
            if (r5 >= r4) goto L_0x05d2
            androidx.constraintlayout.widget.ConstraintLayout r7 = r6.f1098a
            java.util.ArrayList<androidx.constraintlayout.widget.a> r7 = r7.f1013f
            java.lang.Object r7 = r7.get(r5)
            androidx.constraintlayout.widget.a r7 = (androidx.constraintlayout.widget.C0236a) r7
            java.util.Objects.requireNonNull(r7)
            int r5 = r5 + 1
            goto L_0x05c0
        L_0x05d2:
            r1.mo6010c(r0)
            java.util.ArrayList<s.e> r4 = r1.f5338a
            int r4 = r4.size()
            r5 = r25
            if (r10 <= 0) goto L_0x05e3
            r6 = 0
            r1.mo6009b(r0, r6, r5, r12)
        L_0x05e3:
            if (r4 <= 0) goto L_0x07a9
            int r6 = r0.mo5930m()
            r7 = 2
            if (r6 != r7) goto L_0x05ee
            r6 = 1
            goto L_0x05ef
        L_0x05ee:
            r6 = 0
        L_0x05ef:
            int r8 = r0.mo5934q()
            if (r8 != r7) goto L_0x05f7
            r7 = 1
            goto L_0x05f8
        L_0x05f7:
            r7 = 0
        L_0x05f8:
            int r8 = r0.mo5935r()
            s.f r9 = r1.f5340c
            int r9 = r9.f5203c0
            int r8 = java.lang.Math.max(r8, r9)
            int r9 = r0.mo5929l()
            s.f r10 = r1.f5340c
            int r10 = r10.f5205d0
            int r9 = java.lang.Math.max(r9, r10)
            r10 = r8
            r11 = r9
            r8 = 0
            r9 = 0
        L_0x0614:
            if (r8 >= r4) goto L_0x06af
            java.util.ArrayList<s.e> r13 = r1.f5338a
            java.lang.Object r13 = r13.get(r8)
            s.e r13 = (p111s.C1695e) r13
            boolean r14 = r13 instanceof p111s.C1701k
            if (r14 != 0) goto L_0x062d
            r17 = r2
            r15 = r22
            r14 = r23
            r3 = r24
            r2 = 0
            goto L_0x06a1
        L_0x062d:
            int r14 = r13.mo5935r()
            int r15 = r13.mo5929l()
            r17 = r2
            r3 = r24
            r2 = 1
            boolean r18 = r1.mo6008a(r3, r13, r2)
            r2 = r9 | r18
            int r9 = r13.mo5935r()
            r18 = r2
            int r2 = r13.mo5929l()
            if (r9 == r14) goto L_0x0671
            r13.mo5918N(r9)
            if (r6 == 0) goto L_0x066c
            int r9 = r13.mo5933p()
            if (r9 <= r10) goto L_0x066c
            int r9 = r13.mo5933p()
            r14 = r23
            s.d r18 = r13.mo5926i(r14)
            int r18 = r18.mo5899d()
            int r9 = r18 + r9
            int r10 = java.lang.Math.max(r10, r9)
            goto L_0x066e
        L_0x066c:
            r14 = r23
        L_0x066e:
            r18 = 1
            goto L_0x0673
        L_0x0671:
            r14 = r23
        L_0x0673:
            if (r2 == r15) goto L_0x069a
            r13.mo5913I(r2)
            if (r7 == 0) goto L_0x0695
            int r2 = r13.mo5927j()
            if (r2 <= r11) goto L_0x0695
            int r2 = r13.mo5927j()
            r15 = r22
            s.d r9 = r13.mo5926i(r15)
            int r9 = r9.mo5899d()
            int r9 = r9 + r2
            int r2 = java.lang.Math.max(r11, r9)
            r11 = r2
            goto L_0x0697
        L_0x0695:
            r15 = r22
        L_0x0697:
            r18 = 1
            goto L_0x069c
        L_0x069a:
            r15 = r22
        L_0x069c:
            s.k r13 = (p111s.C1701k) r13
            r2 = 0
            r9 = r18 | 0
        L_0x06a1:
            int r8 = r8 + 1
            r24 = r3
            r23 = r14
            r22 = r15
            r2 = r17
            r3 = 8
            goto L_0x0614
        L_0x06af:
            r17 = r2
            r15 = r22
            r14 = r23
            r3 = r24
            r2 = 0
            r8 = r2
            r13 = r11
            r11 = 2
        L_0x06bb:
            if (r8 >= r11) goto L_0x07a6
            r26 = r9
            r9 = r2
            r2 = r13
            r13 = r10
            r10 = r26
        L_0x06c4:
            if (r9 >= r4) goto L_0x0780
            java.util.ArrayList<s.e> r11 = r1.f5338a
            java.lang.Object r11 = r11.get(r9)
            s.e r11 = (p111s.C1695e) r11
            r18 = r4
            boolean r4 = r11 instanceof p111s.C1698h
            if (r4 == 0) goto L_0x06d8
            boolean r4 = r11 instanceof p111s.C1701k
            if (r4 == 0) goto L_0x06dc
        L_0x06d8:
            boolean r4 = r11 instanceof p111s.C1697g
            if (r4 == 0) goto L_0x06e1
        L_0x06dc:
            r19 = r0
            r0 = 8
            goto L_0x0701
        L_0x06e1:
            int r4 = r11.f5213h0
            r19 = r0
            r0 = 8
            if (r4 != r0) goto L_0x06ea
            goto L_0x0701
        L_0x06ea:
            if (r21 == 0) goto L_0x06fd
            t.m r4 = r11.f5204d
            t.h r4 = r4.f5402e
            boolean r4 = r4.f5370j
            if (r4 == 0) goto L_0x06fd
            t.o r4 = r11.f5206e
            t.h r4 = r4.f5402e
            boolean r4 = r4.f5370j
            if (r4 == 0) goto L_0x06fd
            goto L_0x0701
        L_0x06fd:
            boolean r4 = r11 instanceof p111s.C1701k
            if (r4 == 0) goto L_0x0708
        L_0x0701:
            r24 = r3
            r25 = r5
            r20 = r12
            goto L_0x0771
        L_0x0708:
            int r4 = r11.mo5935r()
            int r0 = r11.mo5929l()
            r25 = r5
            int r5 = r11.f5201b0
            r20 = r12
            r12 = 1
            if (r8 != r12) goto L_0x071a
            r12 = 2
        L_0x071a:
            boolean r12 = r1.mo6008a(r3, r11, r12)
            r10 = r10 | r12
            int r12 = r11.mo5935r()
            r24 = r3
            int r3 = r11.mo5929l()
            if (r12 == r4) goto L_0x0748
            r11.mo5918N(r12)
            if (r6 == 0) goto L_0x0747
            int r4 = r11.mo5933p()
            if (r4 <= r13) goto L_0x0747
            int r4 = r11.mo5933p()
            s.d r10 = r11.mo5926i(r14)
            int r10 = r10.mo5899d()
            int r10 = r10 + r4
            int r13 = java.lang.Math.max(r13, r10)
        L_0x0747:
            r10 = 1
        L_0x0748:
            if (r3 == r0) goto L_0x0768
            r11.mo5913I(r3)
            if (r7 == 0) goto L_0x0767
            int r0 = r11.mo5927j()
            if (r0 <= r2) goto L_0x0767
            int r0 = r11.mo5927j()
            s.d r3 = r11.mo5926i(r15)
            int r3 = r3.mo5899d()
            int r3 = r3 + r0
            int r0 = java.lang.Math.max(r2, r3)
            r2 = r0
        L_0x0767:
            r10 = 1
        L_0x0768:
            boolean r0 = r11.f5175D
            if (r0 == 0) goto L_0x0771
            int r0 = r11.f5201b0
            if (r5 == r0) goto L_0x0771
            r10 = 1
        L_0x0771:
            int r9 = r9 + 1
            r4 = r18
            r0 = r19
            r12 = r20
            r3 = r24
            r5 = r25
            r11 = 2
            goto L_0x06c4
        L_0x0780:
            r19 = r0
            r24 = r3
            r18 = r4
            r25 = r5
            r20 = r12
            if (r10 == 0) goto L_0x07a4
            int r8 = r8 + 1
            r0 = r19
            r4 = r20
            r3 = r25
            r1.mo6009b(r0, r8, r3, r4)
            r5 = r3
            r12 = r4
            r10 = r13
            r4 = r18
            r3 = r24
            r9 = 0
            r11 = 2
            r13 = r2
            r2 = 0
            goto L_0x06bb
        L_0x07a4:
            r0 = r19
        L_0x07a6:
            r1 = r17
            goto L_0x07aa
        L_0x07a9:
            r1 = r2
        L_0x07aa:
            r0.mo5954b0(r1)
            goto L_0x04ae
        L_0x07af:
            s.f r0 = r7.f1014g
            int r3 = r0.mo5935r()
            s.f r0 = r7.f1014g
            int r4 = r0.mo5929l()
            s.f r0 = r7.f1014g
            boolean r5 = r0.f5244E0
            boolean r6 = r0.f5245F0
            r0 = r27
            r1 = r28
            r2 = r29
            r0.mo1263l(r1, r2, r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.onMeasure(int, int):void");
    }

    public void onViewAdded(View view) {
        super.onViewAdded(view);
        C1695e f = mo1250f(view);
        if ((view instanceof Guideline) && !(f instanceof C1697g)) {
            C0233a aVar = (C0233a) view.getLayoutParams();
            C1697g gVar = new C1697g();
            aVar.f1086p0 = gVar;
            aVar.f1060c0 = true;
            gVar.mo5956R(aVar.f1049U);
        }
        if (view instanceof C0236a) {
            C0236a aVar2 = (C0236a) view;
            aVar2.mo1298k();
            ((C0233a) view.getLayoutParams()).f1062d0 = true;
            if (!this.f1013f.contains(aVar2)) {
                this.f1013f.add(aVar2);
            }
        }
        this.f1012e.put(view.getId(), view);
        this.f1019l = true;
    }

    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        this.f1012e.remove(view.getId());
        C1695e f = mo1250f(view);
        this.f1014g.f5270q0.remove(f);
        f.mo5907C();
        this.f1013f.remove(view);
        this.f1019l = true;
    }

    /* renamed from: p */
    public void mo1268p(int i, Object obj, Object obj2) {
        if (i == 0 && (obj instanceof String) && (obj2 instanceof Integer)) {
            if (this.f1024q == null) {
                this.f1024q = new HashMap<>();
            }
            String str = (String) obj;
            int indexOf = str.indexOf("/");
            if (indexOf != -1) {
                str = str.substring(indexOf + 1);
            }
            this.f1024q.put(str, Integer.valueOf(((Integer) obj2).intValue()));
        }
    }

    /* renamed from: q */
    public final void mo1269q(C1695e eVar, C0233a aVar, SparseArray<C1695e> sparseArray, int i, C1693d.C1694a aVar2) {
        View view = this.f1012e.get(i);
        C1695e eVar2 = sparseArray.get(i);
        if (eVar2 != null && view != null && (view.getLayoutParams() instanceof C0233a)) {
            aVar.f1058b0 = true;
            C1693d.C1694a aVar3 = C1693d.C1694a.BASELINE;
            if (aVar2 == aVar3) {
                C0233a aVar4 = (C0233a) view.getLayoutParams();
                aVar4.f1058b0 = true;
                aVar4.f1086p0.f5175D = true;
            }
            eVar.mo5926i(aVar3).mo5896a(eVar2.mo5926i(aVar2), aVar.f1031C, aVar.f1030B, true);
            eVar.f5175D = true;
            eVar.mo5926i(C1693d.C1694a.TOP).mo5903h();
            eVar.mo5926i(C1693d.C1694a.BOTTOM).mo5903h();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:146:0x02e4  */
    /* JADX WARNING: Removed duplicated region for block: B:150:0x02f8 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:157:0x0315  */
    /* JADX WARNING: Removed duplicated region for block: B:161:0x032b  */
    /* JADX WARNING: Removed duplicated region for block: B:169:0x034c  */
    /* JADX WARNING: Removed duplicated region for block: B:172:0x0361  */
    /* JADX WARNING: Removed duplicated region for block: B:180:0x0382  */
    /* JADX WARNING: Removed duplicated region for block: B:181:0x0386  */
    /* JADX WARNING: Removed duplicated region for block: B:191:0x03aa  */
    /* JADX WARNING: Removed duplicated region for block: B:194:0x03b2  */
    /* JADX WARNING: Removed duplicated region for block: B:269:0x04e7  */
    /* renamed from: r */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo1270r() {
        /*
            r21 = this;
            r6 = r21
            int r0 = r21.getChildCount()
            r7 = 0
            r1 = r7
        L_0x0008:
            r8 = 1
            if (r1 >= r0) goto L_0x001a
            android.view.View r2 = r6.getChildAt(r1)
            boolean r2 = r2.isLayoutRequested()
            if (r2 == 0) goto L_0x0017
            r9 = r8
            goto L_0x001b
        L_0x0017:
            int r1 = r1 + 1
            goto L_0x0008
        L_0x001a:
            r9 = r7
        L_0x001b:
            if (r9 == 0) goto L_0x0563
            boolean r10 = r21.isInEditMode()
            int r11 = r21.getChildCount()
            r0 = r7
        L_0x0026:
            if (r0 >= r11) goto L_0x0039
            android.view.View r1 = r6.getChildAt(r0)
            s.e r1 = r6.mo1250f(r1)
            if (r1 != 0) goto L_0x0033
            goto L_0x0036
        L_0x0033:
            r1.mo5907C()
        L_0x0036:
            int r0 = r0 + 1
            goto L_0x0026
        L_0x0039:
            r0 = 0
            r12 = -1
            if (r10 == 0) goto L_0x00a1
            r1 = r7
        L_0x003e:
            if (r1 >= r11) goto L_0x00a1
            android.view.View r2 = r6.getChildAt(r1)
            android.content.res.Resources r3 = r21.getResources()     // Catch:{ NotFoundException -> 0x009e }
            int r4 = r2.getId()     // Catch:{ NotFoundException -> 0x009e }
            java.lang.String r3 = r3.getResourceName(r4)     // Catch:{ NotFoundException -> 0x009e }
            int r4 = r2.getId()     // Catch:{ NotFoundException -> 0x009e }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch:{ NotFoundException -> 0x009e }
            r6.mo1268p(r7, r3, r4)     // Catch:{ NotFoundException -> 0x009e }
            r4 = 47
            int r4 = r3.indexOf(r4)     // Catch:{ NotFoundException -> 0x009e }
            if (r4 == r12) goto L_0x0069
            int r4 = r4 + 1
            java.lang.String r3 = r3.substring(r4)     // Catch:{ NotFoundException -> 0x009e }
        L_0x0069:
            int r2 = r2.getId()     // Catch:{ NotFoundException -> 0x009e }
            if (r2 != 0) goto L_0x0070
            goto L_0x008d
        L_0x0070:
            android.util.SparseArray<android.view.View> r4 = r6.f1012e     // Catch:{ NotFoundException -> 0x009e }
            java.lang.Object r4 = r4.get(r2)     // Catch:{ NotFoundException -> 0x009e }
            android.view.View r4 = (android.view.View) r4     // Catch:{ NotFoundException -> 0x009e }
            if (r4 != 0) goto L_0x008b
            android.view.View r4 = r6.findViewById(r2)     // Catch:{ NotFoundException -> 0x009e }
            if (r4 == 0) goto L_0x008b
            if (r4 == r6) goto L_0x008b
            android.view.ViewParent r2 = r4.getParent()     // Catch:{ NotFoundException -> 0x009e }
            if (r2 != r6) goto L_0x008b
            r6.onViewAdded(r4)     // Catch:{ NotFoundException -> 0x009e }
        L_0x008b:
            if (r4 != r6) goto L_0x0090
        L_0x008d:
            s.f r2 = r6.f1014g     // Catch:{ NotFoundException -> 0x009e }
            goto L_0x009c
        L_0x0090:
            if (r4 != 0) goto L_0x0094
            r2 = r0
            goto L_0x009c
        L_0x0094:
            android.view.ViewGroup$LayoutParams r2 = r4.getLayoutParams()     // Catch:{ NotFoundException -> 0x009e }
            androidx.constraintlayout.widget.ConstraintLayout$a r2 = (androidx.constraintlayout.widget.ConstraintLayout.C0233a) r2     // Catch:{ NotFoundException -> 0x009e }
            s.e r2 = r2.f1086p0     // Catch:{ NotFoundException -> 0x009e }
        L_0x009c:
            r2.f5215i0 = r3     // Catch:{ NotFoundException -> 0x009e }
        L_0x009e:
            int r1 = r1 + 1
            goto L_0x003e
        L_0x00a1:
            int r1 = r6.f1023p
            if (r1 == r12) goto L_0x00c3
            r1 = r7
        L_0x00a6:
            if (r1 >= r11) goto L_0x00c3
            android.view.View r2 = r6.getChildAt(r1)
            int r3 = r2.getId()
            int r4 = r6.f1023p
            if (r3 != r4) goto L_0x00c0
            boolean r3 = r2 instanceof androidx.constraintlayout.widget.C0244c
            if (r3 == 0) goto L_0x00c0
            androidx.constraintlayout.widget.c r2 = (androidx.constraintlayout.widget.C0244c) r2
            androidx.constraintlayout.widget.b r2 = r2.getConstraintSet()
            r6.f1021n = r2
        L_0x00c0:
            int r1 = r1 + 1
            goto L_0x00a6
        L_0x00c3:
            androidx.constraintlayout.widget.b r1 = r6.f1021n
            if (r1 == 0) goto L_0x00ca
            r1.mo1307b(r6, r8)
        L_0x00ca:
            s.f r1 = r6.f1014g
            java.util.ArrayList<s.e> r1 = r1.f5270q0
            r1.clear()
            java.util.ArrayList<androidx.constraintlayout.widget.a> r1 = r6.f1013f
            int r1 = r1.size()
            r13 = 2
            if (r1 <= 0) goto L_0x0170
            r2 = r7
        L_0x00db:
            if (r2 >= r1) goto L_0x0170
            java.util.ArrayList<androidx.constraintlayout.widget.a> r3 = r6.f1013f
            java.lang.Object r3 = r3.get(r2)
            androidx.constraintlayout.widget.a r3 = (androidx.constraintlayout.widget.C0236a) r3
            boolean r4 = r3.isInEditMode()
            if (r4 == 0) goto L_0x00f0
            java.lang.String r4 = r3.f1110i
            r3.setIds(r4)
        L_0x00f0:
            s.h r4 = r3.f1109h
            if (r4 != 0) goto L_0x00f6
            goto L_0x016a
        L_0x00f6:
            s.i r4 = (p111s.C1699i) r4
            r4.f5268r0 = r7
            s.e[] r4 = r4.f5267q0
            java.util.Arrays.fill(r4, r0)
            r4 = r7
        L_0x0100:
            int r5 = r3.f1107f
            if (r4 >= r5) goto L_0x0163
            int[] r5 = r3.f1106e
            r5 = r5[r4]
            android.view.View r14 = r6.mo1249e(r5)
            if (r14 != 0) goto L_0x0131
            java.util.HashMap<java.lang.Integer, java.lang.String> r15 = r3.f1113l
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            java.lang.Object r5 = r15.get(r5)
            java.lang.String r5 = (java.lang.String) r5
            int r15 = r3.mo1297h(r6, r5)
            if (r15 == 0) goto L_0x0131
            int[] r14 = r3.f1106e
            r14[r4] = r15
            java.util.HashMap<java.lang.Integer, java.lang.String> r14 = r3.f1113l
            java.lang.Integer r0 = java.lang.Integer.valueOf(r15)
            r14.put(r0, r5)
            android.view.View r14 = r6.mo1249e(r15)
        L_0x0131:
            if (r14 == 0) goto L_0x015e
            s.h r0 = r3.f1109h
            s.e r5 = r6.mo1250f(r14)
            s.i r0 = (p111s.C1699i) r0
            java.util.Objects.requireNonNull(r0)
            if (r5 == r0) goto L_0x015e
            if (r5 != 0) goto L_0x0143
            goto L_0x015e
        L_0x0143:
            int r14 = r0.f5268r0
            int r14 = r14 + r8
            s.e[] r15 = r0.f5267q0
            int r7 = r15.length
            if (r14 <= r7) goto L_0x0155
            int r7 = r15.length
            int r7 = r7 * r13
            java.lang.Object[] r7 = java.util.Arrays.copyOf(r15, r7)
            s.e[] r7 = (p111s.C1695e[]) r7
            r0.f5267q0 = r7
        L_0x0155:
            s.e[] r7 = r0.f5267q0
            int r14 = r0.f5268r0
            r7[r14] = r5
            int r14 = r14 + r8
            r0.f5268r0 = r14
        L_0x015e:
            int r4 = r4 + 1
            r0 = 0
            r7 = 0
            goto L_0x0100
        L_0x0163:
            s.h r0 = r3.f1109h
            s.f r3 = r6.f1014g
            r0.mo5957a(r3)
        L_0x016a:
            int r2 = r2 + 1
            r0 = 0
            r7 = 0
            goto L_0x00db
        L_0x0170:
            r0 = 0
        L_0x0171:
            if (r0 >= r11) goto L_0x01aa
            android.view.View r1 = r6.getChildAt(r0)
            boolean r2 = r1 instanceof androidx.constraintlayout.widget.C0246d
            if (r2 == 0) goto L_0x01a7
            androidx.constraintlayout.widget.d r1 = (androidx.constraintlayout.widget.C0246d) r1
            int r2 = r1.f1256e
            if (r2 != r12) goto L_0x018c
            boolean r2 = r1.isInEditMode()
            if (r2 != 0) goto L_0x018c
            int r2 = r1.f1258g
            r1.setVisibility(r2)
        L_0x018c:
            int r2 = r1.f1256e
            android.view.View r2 = r6.findViewById(r2)
            r1.f1257f = r2
            if (r2 == 0) goto L_0x01a7
            android.view.ViewGroup$LayoutParams r2 = r2.getLayoutParams()
            androidx.constraintlayout.widget.ConstraintLayout$a r2 = (androidx.constraintlayout.widget.ConstraintLayout.C0233a) r2
            r2.f1064e0 = r8
            android.view.View r2 = r1.f1257f
            r3 = 0
            r2.setVisibility(r3)
            r1.setVisibility(r3)
        L_0x01a7:
            int r0 = r0 + 1
            goto L_0x0171
        L_0x01aa:
            android.util.SparseArray<s.e> r0 = r6.f1025r
            r0.clear()
            android.util.SparseArray<s.e> r0 = r6.f1025r
            s.f r1 = r6.f1014g
            r2 = 0
            r0.put(r2, r1)
            android.util.SparseArray<s.e> r0 = r6.f1025r
            int r1 = r21.getId()
            s.f r2 = r6.f1014g
            r0.put(r1, r2)
            r0 = 0
        L_0x01c3:
            if (r0 >= r11) goto L_0x01d9
            android.view.View r1 = r6.getChildAt(r0)
            s.e r2 = r6.mo1250f(r1)
            android.util.SparseArray<s.e> r3 = r6.f1025r
            int r1 = r1.getId()
            r3.put(r1, r2)
            int r0 = r0 + 1
            goto L_0x01c3
        L_0x01d9:
            r7 = 0
        L_0x01da:
            if (r7 >= r11) goto L_0x0563
            android.view.View r0 = r6.getChildAt(r7)
            s.e r14 = r6.mo1250f(r0)
            if (r14 != 0) goto L_0x01e8
            goto L_0x0264
        L_0x01e8:
            android.view.ViewGroup$LayoutParams r1 = r0.getLayoutParams()
            r15 = r1
            androidx.constraintlayout.widget.ConstraintLayout$a r15 = (androidx.constraintlayout.widget.ConstraintLayout.C0233a) r15
            s.f r1 = r6.f1014g
            java.util.ArrayList<s.e> r2 = r1.f5270q0
            r2.add(r14)
            s.e r2 = r14.f5192U
            if (r2 == 0) goto L_0x0204
            s.l r2 = (p111s.C1702l) r2
            java.util.ArrayList<s.e> r2 = r2.f5270q0
            r2.remove(r14)
            r14.mo5907C()
        L_0x0204:
            r14.f5192U = r1
            android.util.SparseArray<s.e> r3 = r6.f1025r
            r16 = 4
            s.d$a r5 = p111s.C1693d.C1694a.RIGHT
            s.d$a r4 = p111s.C1693d.C1694a.LEFT
            s.d$a r2 = p111s.C1693d.C1694a.BOTTOM
            s.d$a r1 = p111s.C1693d.C1694a.TOP
            r15.mo1281a()
            int r13 = r0.getVisibility()
            r14.f5213h0 = r13
            boolean r13 = r15.f1064e0
            if (r13 == 0) goto L_0x0225
            r14.f5176E = r8
            r13 = 8
            r14.f5213h0 = r13
        L_0x0225:
            r14.f5211g0 = r0
            boolean r13 = r0 instanceof androidx.constraintlayout.widget.C0236a
            if (r13 == 0) goto L_0x0234
            androidx.constraintlayout.widget.a r0 = (androidx.constraintlayout.widget.C0236a) r0
            s.f r13 = r6.f1014g
            boolean r13 = r13.f5256v0
            r0.mo1240j(r14, r13)
        L_0x0234:
            boolean r0 = r15.f1060c0
            if (r0 == 0) goto L_0x0272
            s.g r14 = (p111s.C1697g) r14
            int r0 = r15.f1080m0
            int r1 = r15.f1082n0
            float r2 = r15.f1084o0
            r3 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r4 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r4 == 0) goto L_0x024f
            if (r4 <= 0) goto L_0x0264
            r14.f5261q0 = r2
            r14.f5262r0 = r12
            r14.f5263s0 = r12
            goto L_0x0264
        L_0x024f:
            if (r0 == r12) goto L_0x025a
            if (r0 <= r12) goto L_0x0264
            r14.f5261q0 = r3
            r14.f5262r0 = r0
            r14.f5263s0 = r12
            goto L_0x0264
        L_0x025a:
            if (r1 == r12) goto L_0x0264
            if (r1 <= r12) goto L_0x0264
            r14.f5261q0 = r3
            r14.f5262r0 = r12
            r14.f5263s0 = r1
        L_0x0264:
            r19 = r7
            r5 = r8
            r18 = r9
            r20 = r10
            r17 = r11
            r3 = r12
            r0 = 2
            r4 = 0
            goto L_0x0554
        L_0x0272:
            int r0 = r15.f1066f0
            int r13 = r15.f1068g0
            int r8 = r15.f1070h0
            int r12 = r15.f1072i0
            int r6 = r15.f1074j0
            r17 = r11
            int r11 = r15.f1076k0
            r18 = r9
            float r9 = r15.f1078l0
            r19 = r7
            int r7 = r15.f1083o
            r20 = r10
            r10 = -1
            if (r7 == r10) goto L_0x02b0
            java.lang.Object r0 = r3.get(r7)
            s.e r0 = (p111s.C1695e) r0
            if (r0 == 0) goto L_0x02aa
            float r3 = r15.f1087q
            int r6 = r15.f1085p
            s.d$a r7 = p111s.C1693d.C1694a.CENTER
            s.d r8 = r14.mo5926i(r7)
            s.d r0 = r0.mo5926i(r7)
            r7 = 0
            r9 = 1
            r8.mo5896a(r0, r6, r7, r9)
            r14.f5174C = r3
        L_0x02aa:
            r8 = r1
            r10 = r2
            r11 = r4
            r6 = r5
            goto L_0x03b4
        L_0x02b0:
            r7 = r10
            if (r0 == r7) goto L_0x02c7
            java.lang.Object r0 = r3.get(r0)
            s.e r0 = (p111s.C1695e) r0
            if (r0 == 0) goto L_0x02df
            int r10 = r15.leftMargin
            s.d r13 = r14.mo5926i(r4)
            s.d r0 = r0.mo5926i(r4)
        L_0x02c5:
            r7 = 1
            goto L_0x02dc
        L_0x02c7:
            if (r13 == r7) goto L_0x02e1
            java.lang.Object r0 = r3.get(r13)
            s.e r0 = (p111s.C1695e) r0
            if (r0 == 0) goto L_0x02df
            int r10 = r15.leftMargin
            s.d r13 = r14.mo5926i(r4)
            s.d r0 = r0.mo5926i(r5)
            goto L_0x02c5
        L_0x02dc:
            r13.mo5896a(r0, r10, r6, r7)
        L_0x02df:
            r0 = -1
            goto L_0x02e2
        L_0x02e1:
            r0 = r7
        L_0x02e2:
            if (r8 == r0) goto L_0x02f8
            java.lang.Object r6 = r3.get(r8)
            s.e r6 = (p111s.C1695e) r6
            if (r6 == 0) goto L_0x0310
            int r7 = r15.rightMargin
            s.d r8 = r14.mo5926i(r5)
            s.d r6 = r6.mo5926i(r4)
        L_0x02f6:
            r0 = 1
            goto L_0x030d
        L_0x02f8:
            if (r12 == r0) goto L_0x0310
            java.lang.Object r0 = r3.get(r12)
            s.e r0 = (p111s.C1695e) r0
            if (r0 == 0) goto L_0x0310
            int r7 = r15.rightMargin
            s.d r8 = r14.mo5926i(r5)
            s.d r6 = r0.mo5926i(r5)
            goto L_0x02f6
        L_0x030d:
            r8.mo5896a(r6, r7, r11, r0)
        L_0x0310:
            int r0 = r15.f1069h
            r6 = -1
            if (r0 == r6) goto L_0x032b
            java.lang.Object r0 = r3.get(r0)
            s.e r0 = (p111s.C1695e) r0
            if (r0 == 0) goto L_0x0347
            int r7 = r15.topMargin
            int r8 = r15.f1093w
            s.d r10 = r14.mo5926i(r1)
            s.d r0 = r0.mo5926i(r1)
        L_0x0329:
            r6 = 1
            goto L_0x0344
        L_0x032b:
            int r0 = r15.f1071i
            if (r0 == r6) goto L_0x0347
            java.lang.Object r0 = r3.get(r0)
            s.e r0 = (p111s.C1695e) r0
            if (r0 == 0) goto L_0x0347
            int r7 = r15.topMargin
            int r8 = r15.f1093w
            s.d r10 = r14.mo5926i(r1)
            s.d r0 = r0.mo5926i(r2)
            goto L_0x0329
        L_0x0344:
            r10.mo5896a(r0, r7, r8, r6)
        L_0x0347:
            int r0 = r15.f1073j
            r6 = -1
            if (r0 == r6) goto L_0x0361
            java.lang.Object r0 = r3.get(r0)
            s.e r0 = (p111s.C1695e) r0
            if (r0 == 0) goto L_0x037d
            int r7 = r15.bottomMargin
            int r8 = r15.f1095y
            s.d r10 = r14.mo5926i(r2)
            s.d r0 = r0.mo5926i(r1)
            goto L_0x0379
        L_0x0361:
            int r0 = r15.f1075k
            if (r0 == r6) goto L_0x037d
            java.lang.Object r0 = r3.get(r0)
            s.e r0 = (p111s.C1695e) r0
            if (r0 == 0) goto L_0x037d
            int r7 = r15.bottomMargin
            int r8 = r15.f1095y
            s.d r10 = r14.mo5926i(r2)
            s.d r0 = r0.mo5926i(r2)
        L_0x0379:
            r6 = 1
            r10.mo5896a(r0, r7, r8, r6)
        L_0x037d:
            int r0 = r15.f1077l
            r6 = -1
            if (r0 == r6) goto L_0x0386
            s.d$a r7 = p111s.C1693d.C1694a.BASELINE
            r6 = r0
            goto L_0x0393
        L_0x0386:
            int r0 = r15.f1079m
            if (r0 == r6) goto L_0x038d
            r6 = r0
            r7 = r1
            goto L_0x0393
        L_0x038d:
            int r0 = r15.f1081n
            if (r0 == r6) goto L_0x03a1
            r6 = r0
            r7 = r2
        L_0x0393:
            r0 = r21
            r8 = r1
            r1 = r14
            r10 = r2
            r2 = r15
            r11 = r4
            r4 = r6
            r6 = r5
            r5 = r7
            r0.mo1269q(r1, r2, r3, r4, r5)
            goto L_0x03a5
        L_0x03a1:
            r8 = r1
            r10 = r2
            r11 = r4
            r6 = r5
        L_0x03a5:
            r0 = 0
            int r1 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r1 < 0) goto L_0x03ac
            r14.f5207e0 = r9
        L_0x03ac:
            float r1 = r15.f1033E
            int r2 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r2 < 0) goto L_0x03b4
            r14.f5209f0 = r1
        L_0x03b4:
            if (r20 == 0) goto L_0x03c5
            int r0 = r15.f1047S
            r1 = -1
            if (r0 != r1) goto L_0x03bf
            int r2 = r15.f1048T
            if (r2 == r1) goto L_0x03c5
        L_0x03bf:
            int r1 = r15.f1048T
            r14.f5197Z = r0
            r14.f5199a0 = r1
        L_0x03c5:
            boolean r0 = r15.f1054Z
            r1 = -2
            r2 = 3
            if (r0 != 0) goto L_0x03f9
            int r0 = r15.width
            r3 = -1
            if (r0 != r3) goto L_0x03f0
            boolean r0 = r15.f1050V
            if (r0 == 0) goto L_0x03da
            int[] r0 = r14.f5191T
            r3 = 0
            r0[r3] = r2
            goto L_0x03df
        L_0x03da:
            r3 = 0
            int[] r0 = r14.f5191T
            r0[r3] = r16
        L_0x03df:
            s.d r0 = r14.mo5926i(r11)
            int r4 = r15.leftMargin
            r0.f5160g = r4
            s.d r0 = r14.mo5926i(r6)
            int r4 = r15.rightMargin
            r0.f5160g = r4
            goto L_0x040d
        L_0x03f0:
            r3 = 0
            int[] r0 = r14.f5191T
            r0[r3] = r2
            r14.mo5918N(r3)
            goto L_0x040d
        L_0x03f9:
            r3 = 0
            int[] r0 = r14.f5191T
            r4 = 1
            r0[r3] = r4
            int r0 = r15.width
            r14.mo5918N(r0)
            int r0 = r15.width
            if (r0 != r1) goto L_0x040d
            int[] r0 = r14.f5191T
            r4 = 2
            r0[r3] = r4
        L_0x040d:
            boolean r0 = r15.f1056a0
            if (r0 != 0) goto L_0x0440
            int r0 = r15.height
            r3 = -1
            if (r0 != r3) goto L_0x0436
            boolean r0 = r15.f1051W
            if (r0 == 0) goto L_0x0420
            int[] r0 = r14.f5191T
            r4 = 1
            r0[r4] = r2
            goto L_0x0425
        L_0x0420:
            r4 = 1
            int[] r0 = r14.f5191T
            r0[r4] = r16
        L_0x0425:
            s.d r0 = r14.mo5926i(r8)
            int r1 = r15.topMargin
            r0.f5160g = r1
            s.d r0 = r14.mo5926i(r10)
            int r1 = r15.bottomMargin
            r0.f5160g = r1
            goto L_0x0454
        L_0x0436:
            r4 = 1
            int[] r0 = r14.f5191T
            r0[r4] = r2
            r0 = 0
            r14.mo5913I(r0)
            goto L_0x0454
        L_0x0440:
            r3 = -1
            r4 = 1
            int[] r0 = r14.f5191T
            r0[r4] = r4
            int r0 = r15.height
            r14.mo5913I(r0)
            int r0 = r15.height
            if (r0 != r1) goto L_0x0454
            int[] r0 = r14.f5191T
            r1 = 2
            r0[r4] = r1
        L_0x0454:
            java.lang.String r0 = r15.f1034F
            if (r0 == 0) goto L_0x04ec
            int r1 = r0.length()
            if (r1 != 0) goto L_0x0460
            goto L_0x04ec
        L_0x0460:
            int r1 = r0.length()
            r4 = 44
            int r4 = r0.indexOf(r4)
            if (r4 <= 0) goto L_0x048e
            int r5 = r1 + -1
            if (r4 >= r5) goto L_0x048e
            r5 = 0
            java.lang.String r6 = r0.substring(r5, r4)
            java.lang.String r5 = "W"
            boolean r5 = r6.equalsIgnoreCase(r5)
            if (r5 == 0) goto L_0x047f
            r5 = 0
            goto L_0x048a
        L_0x047f:
            java.lang.String r5 = "H"
            boolean r5 = r6.equalsIgnoreCase(r5)
            if (r5 == 0) goto L_0x0489
            r5 = 1
            goto L_0x048a
        L_0x0489:
            r5 = r3
        L_0x048a:
            int r4 = r4 + 1
            r10 = r5
            goto L_0x0490
        L_0x048e:
            r10 = r3
            r4 = 0
        L_0x0490:
            r5 = 58
            int r5 = r0.indexOf(r5)
            if (r5 < 0) goto L_0x04d2
            int r1 = r1 + -1
            if (r5 >= r1) goto L_0x04d2
            java.lang.String r1 = r0.substring(r4, r5)
            int r5 = r5 + 1
            java.lang.String r0 = r0.substring(r5)
            int r4 = r1.length()
            if (r4 <= 0) goto L_0x04e1
            int r4 = r0.length()
            if (r4 <= 0) goto L_0x04e1
            float r1 = java.lang.Float.parseFloat(r1)     // Catch:{ NumberFormatException -> 0x04e1 }
            float r0 = java.lang.Float.parseFloat(r0)     // Catch:{ NumberFormatException -> 0x04e1 }
            r4 = 0
            int r5 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r5 <= 0) goto L_0x04e1
            int r5 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r5 <= 0) goto L_0x04e1
            r4 = 1
            if (r10 != r4) goto L_0x04cc
            float r0 = r0 / r1
            float r0 = java.lang.Math.abs(r0)     // Catch:{ NumberFormatException -> 0x04e1 }
            goto L_0x04e2
        L_0x04cc:
            float r1 = r1 / r0
            float r0 = java.lang.Math.abs(r1)     // Catch:{ NumberFormatException -> 0x04e1 }
            goto L_0x04e2
        L_0x04d2:
            java.lang.String r0 = r0.substring(r4)
            int r1 = r0.length()
            if (r1 <= 0) goto L_0x04e1
            float r0 = java.lang.Float.parseFloat(r0)     // Catch:{ NumberFormatException -> 0x04e1 }
            goto L_0x04e2
        L_0x04e1:
            r0 = 0
        L_0x04e2:
            r1 = 0
            int r4 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r4 <= 0) goto L_0x04ef
            r14.f5195X = r0
            r14.f5196Y = r10
            goto L_0x04ef
        L_0x04ec:
            r1 = 0
            r14.f5195X = r1
        L_0x04ef:
            float r0 = r15.f1035G
            float[] r1 = r14.f5221l0
            r4 = 0
            r1[r4] = r0
            float r0 = r15.f1036H
            r5 = 1
            r1[r5] = r0
            int r0 = r15.f1037I
            r14.f5217j0 = r0
            int r0 = r15.f1038J
            r14.f5219k0 = r0
            int r0 = r15.f1053Y
            if (r0 < 0) goto L_0x050b
            if (r0 > r2) goto L_0x050b
            r14.f5228p = r0
        L_0x050b:
            int r0 = r15.f1039K
            int r1 = r15.f1041M
            int r2 = r15.f1043O
            float r6 = r15.f1045Q
            r14.f5230q = r0
            r14.f5233t = r1
            r1 = 2147483647(0x7fffffff, float:NaN)
            if (r2 != r1) goto L_0x051d
            r2 = r4
        L_0x051d:
            r14.f5234u = r2
            r14.f5235v = r6
            r2 = 0
            int r7 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            r2 = 1065353216(0x3f800000, float:1.0)
            if (r7 <= 0) goto L_0x0531
            int r6 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r6 >= 0) goto L_0x0531
            if (r0 != 0) goto L_0x0531
            r0 = 2
            r14.f5230q = r0
        L_0x0531:
            int r0 = r15.f1040L
            int r6 = r15.f1042N
            int r7 = r15.f1044P
            float r8 = r15.f1046R
            r14.f5231r = r0
            r14.f5236w = r6
            if (r7 != r1) goto L_0x0540
            r7 = r4
        L_0x0540:
            r14.f5237x = r7
            r14.f5238y = r8
            r1 = 0
            int r1 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            if (r1 <= 0) goto L_0x0553
            int r1 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r1 >= 0) goto L_0x0553
            if (r0 != 0) goto L_0x0553
            r0 = 2
            r14.f5231r = r0
            goto L_0x0554
        L_0x0553:
            r0 = 2
        L_0x0554:
            int r7 = r19 + 1
            r6 = r21
            r13 = r0
            r12 = r3
            r8 = r5
            r11 = r17
            r9 = r18
            r10 = r20
            goto L_0x01da
        L_0x0563:
            r18 = r9
            return r18
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.mo1270r():boolean");
    }

    public void requestLayout() {
        this.f1019l = true;
        super.requestLayout();
    }

    public void setConstraintSet(C0237b bVar) {
        this.f1021n = bVar;
    }

    public void setId(int i) {
        this.f1012e.remove(getId());
        super.setId(i);
        this.f1012e.put(getId(), this);
    }

    public void setMaxHeight(int i) {
        if (i != this.f1018k) {
            this.f1018k = i;
            requestLayout();
        }
    }

    public void setMaxWidth(int i) {
        if (i != this.f1017j) {
            this.f1017j = i;
            requestLayout();
        }
    }

    public void setMinHeight(int i) {
        if (i != this.f1016i) {
            this.f1016i = i;
            requestLayout();
        }
    }

    public void setMinWidth(int i) {
        if (i != this.f1015h) {
            this.f1015h = i;
            requestLayout();
        }
    }

    public void setOnConstraintsChanged(C1959c cVar) {
        C1956b bVar = this.f1022o;
        if (bVar != null) {
            Objects.requireNonNull(bVar);
        }
    }

    public void setOptimizationLevel(int i) {
        this.f1020m = i;
        C1696f fVar = this.f1014g;
        fVar.f5243D0 = i;
        C1593e.f4940p = fVar.mo5953a0(512);
    }

    public boolean shouldDelayChildPressedState() {
        return false;
    }
}
