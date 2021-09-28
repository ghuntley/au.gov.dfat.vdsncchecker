package p025d3;

/* renamed from: d3.o */
public class C0811o {
    /* renamed from: a */
    public String mo4051a(C0803g gVar) {
        String obj = gVar.getClass().getGenericInterfaces()[0].toString();
        return obj.startsWith("kotlin.jvm.functions.") ? obj.substring(21) : obj;
    }
}
