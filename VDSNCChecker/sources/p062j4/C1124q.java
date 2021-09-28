package p062j4;

import java.util.List;
import java.util.RandomAccess;
import p025d3.C0802f;
import p126u2.C1838b;

/* renamed from: j4.q */
public final class C1124q extends C1838b<C1115i> implements RandomAccess {

    /* renamed from: e */
    public static final C1125a f3909e = new C1125a((C0802f) null);

    /* renamed from: j4.q$a */
    public static final class C1125a {
        public C1125a(C0802f fVar) {
        }

        /* renamed from: a */
        public final void mo4689a(long j, C1112f fVar, int i, List<? extends C1115i> list, int i2, int i3, List<Integer> list2) {
            int i4;
            int i5;
            int i6;
            int i7;
            C1112f fVar2;
            C1112f fVar3 = fVar;
            int i8 = i;
            List<? extends C1115i> list3 = list;
            int i9 = i2;
            int i10 = i3;
            List<Integer> list4 = list2;
            if (i9 < i10) {
                int i11 = i9;
                while (i11 < i10) {
                    if (((C1115i) list3.get(i11)).mo4669c() >= i8) {
                        i11++;
                    } else {
                        throw new IllegalArgumentException("Failed requirement.".toString());
                    }
                }
                C1115i iVar = (C1115i) list.get(i2);
                C1115i iVar2 = (C1115i) list3.get(i10 - 1);
                int i12 = -1;
                if (i8 == iVar.mo4669c()) {
                    int intValue = list4.get(i9).intValue();
                    int i13 = i9 + 1;
                    i4 = i13;
                    i5 = intValue;
                    iVar = (C1115i) list3.get(i13);
                } else {
                    i4 = i9;
                    i5 = -1;
                }
                if (iVar.mo4674f(i8) != iVar2.mo4674f(i8)) {
                    int i14 = 1;
                    for (int i15 = i4 + 1; i15 < i10; i15++) {
                        if (((C1115i) list3.get(i15 - 1)).mo4674f(i8) != ((C1115i) list3.get(i15)).mo4674f(i8)) {
                            i14++;
                        }
                    }
                    long b = mo4690b(fVar3) + j + ((long) 2) + ((long) (i14 * 2));
                    fVar3.mo4636a0(i14);
                    fVar3.mo4636a0(i5);
                    for (int i16 = i4; i16 < i10; i16++) {
                        byte f = ((C1115i) list3.get(i16)).mo4674f(i8);
                        if (i16 == i4 || f != ((C1115i) list3.get(i16 - 1)).mo4674f(i8)) {
                            fVar3.mo4636a0(f & 255);
                        }
                    }
                    C1112f fVar4 = new C1112f();
                    while (i4 < i10) {
                        byte f2 = ((C1115i) list3.get(i4)).mo4674f(i8);
                        int i17 = i4 + 1;
                        int i18 = i17;
                        while (true) {
                            if (i18 >= i10) {
                                i6 = i10;
                                break;
                            } else if (f2 != ((C1115i) list3.get(i18)).mo4674f(i8)) {
                                i6 = i18;
                                break;
                            } else {
                                i18++;
                            }
                        }
                        if (i17 == i6 && i8 + 1 == ((C1115i) list3.get(i4)).mo4669c()) {
                            fVar3.mo4636a0(list4.get(i4).intValue());
                            i7 = i6;
                            fVar2 = fVar4;
                        } else {
                            fVar3.mo4636a0(((int) (mo4690b(fVar4) + b)) * i12);
                            i7 = i6;
                            fVar2 = fVar4;
                            mo4689a(b, fVar4, i8 + 1, list, i4, i6, list2);
                        }
                        fVar4 = fVar2;
                        i4 = i7;
                        i12 = -1;
                    }
                    fVar3.mo4632W(fVar4);
                    return;
                }
                int min = Math.min(iVar.mo4669c(), iVar2.mo4669c());
                int i19 = i8;
                int i20 = 0;
                while (i19 < min && iVar.mo4674f(i19) == iVar2.mo4674f(i19)) {
                    i20++;
                    i19++;
                }
                long b2 = mo4690b(fVar3) + j + ((long) 2) + ((long) i20) + 1;
                fVar3.mo4636a0(-i20);
                fVar3.mo4636a0(i5);
                int i21 = i8 + i20;
                while (i8 < i21) {
                    fVar3.mo4636a0(iVar.mo4674f(i8) & 255);
                    i8++;
                }
                if (i4 + 1 == i10) {
                    if (i21 == ((C1115i) list3.get(i4)).mo4669c()) {
                        fVar3.mo4636a0(list4.get(i4).intValue());
                        return;
                    }
                    throw new IllegalStateException("Check failed.".toString());
                }
                C1112f fVar5 = new C1112f();
                fVar3.mo4636a0(((int) (mo4690b(fVar5) + b2)) * -1);
                mo4689a(b2, fVar5, i21, list, i4, i3, list2);
                fVar3.mo4632W(fVar5);
                return;
            }
            throw new IllegalArgumentException("Failed requirement.".toString());
        }

        /* renamed from: b */
        public final long mo4690b(C1112f fVar) {
            return fVar.f3888f / ((long) 4);
        }
    }
}
