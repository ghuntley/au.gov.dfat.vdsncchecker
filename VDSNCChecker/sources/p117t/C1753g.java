package p117t;

import java.util.ArrayList;
import java.util.List;

/* renamed from: t.g */
public class C1753g implements C1750d {

    /* renamed from: a */
    public C1750d f5361a = null;

    /* renamed from: b */
    public boolean f5362b = false;

    /* renamed from: c */
    public boolean f5363c = false;

    /* renamed from: d */
    public C1765q f5364d;

    /* renamed from: e */
    public C1754a f5365e = C1754a.UNKNOWN;

    /* renamed from: f */
    public int f5366f;

    /* renamed from: g */
    public int f5367g;

    /* renamed from: h */
    public int f5368h = 1;

    /* renamed from: i */
    public C1755h f5369i = null;

    /* renamed from: j */
    public boolean f5370j = false;

    /* renamed from: k */
    public List<C1750d> f5371k = new ArrayList();

    /* renamed from: l */
    public List<C1753g> f5372l = new ArrayList();

    /* renamed from: t.g$a */
    public enum C1754a {
        UNKNOWN,
        HORIZONTAL_DIMENSION,
        VERTICAL_DIMENSION,
        LEFT,
        RIGHT,
        TOP,
        BOTTOM,
        BASELINE
    }

    public C1753g(C1765q qVar) {
        this.f5364d = qVar;
    }

    /* renamed from: a */
    public void mo6011a(C1750d dVar) {
        for (C1753g gVar : this.f5372l) {
            if (!gVar.f5370j) {
                return;
            }
        }
        this.f5363c = true;
        C1750d dVar2 = this.f5361a;
        if (dVar2 != null) {
            dVar2.mo6011a(this);
        }
        if (this.f5362b) {
            this.f5364d.mo6011a(this);
            return;
        }
        C1753g gVar2 = null;
        int i = 0;
        for (C1753g next : this.f5372l) {
            if (!(next instanceof C1755h)) {
                i++;
                gVar2 = next;
            }
        }
        if (gVar2 != null && i == 1 && gVar2.f5370j) {
            C1755h hVar = this.f5369i;
            if (hVar != null) {
                if (hVar.f5370j) {
                    this.f5366f = this.f5368h * hVar.f5367g;
                } else {
                    return;
                }
            }
            mo6028c(gVar2.f5367g + this.f5366f);
        }
        C1750d dVar3 = this.f5361a;
        if (dVar3 != null) {
            dVar3.mo6011a(this);
        }
    }

    /* renamed from: b */
    public void mo6027b() {
        this.f5372l.clear();
        this.f5371k.clear();
        this.f5370j = false;
        this.f5367g = 0;
        this.f5363c = false;
        this.f5362b = false;
    }

    /* renamed from: c */
    public void mo6028c(int i) {
        if (!this.f5370j) {
            this.f5370j = true;
            this.f5367g = i;
            for (C1750d next : this.f5371k) {
                next.mo6011a(next);
            }
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f5364d.f5399b.f5215i0);
        sb.append(":");
        sb.append(this.f5365e);
        sb.append("(");
        sb.append(this.f5370j ? Integer.valueOf(this.f5367g) : "unresolved");
        sb.append(") <t=");
        sb.append(this.f5372l.size());
        sb.append(":d=");
        sb.append(this.f5371k.size());
        sb.append(">");
        return sb.toString();
    }
}
