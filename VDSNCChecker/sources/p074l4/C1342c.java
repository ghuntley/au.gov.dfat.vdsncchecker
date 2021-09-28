package p074l4;

import java.io.OutputStream;
import p045h.C0990o;

/* renamed from: l4.c */
public class C1342c extends C1393s {

    /* renamed from: f */
    public static final C1342c f4362f = new C1342c((byte) 0);

    /* renamed from: g */
    public static final C1342c f4363g = new C1342c((byte) -1);

    /* renamed from: e */
    public final byte f4364e;

    public C1342c(byte b) {
        this.f4364e = b;
    }

    public int hashCode() {
        return mo5165q() ? 1 : 0;
    }

    /* renamed from: i */
    public boolean mo5153i(C1393s sVar) {
        return (sVar instanceof C1342c) && mo5165q() == ((C1342c) sVar).mo5165q();
    }

    /* renamed from: j */
    public void mo5154j(C0990o oVar, boolean z) {
        byte b = this.f4364e;
        if (z) {
            ((OutputStream) oVar.f3645b).write(1);
        }
        oVar.mo4397k(1);
        ((OutputStream) oVar.f3645b).write(b);
    }

    /* renamed from: k */
    public int mo5155k() {
        return 3;
    }

    /* renamed from: n */
    public boolean mo5156n() {
        return false;
    }

    /* renamed from: o */
    public C1393s mo5159o() {
        return mo5165q() ? f4363g : f4362f;
    }

    /* renamed from: q */
    public boolean mo5165q() {
        return this.f4364e != 0;
    }

    public String toString() {
        return mo5165q() ? "TRUE" : "FALSE";
    }
}
