public class NestedDemo {
    public static void main(String[] args) {
        NestedClass.StaticNestedClass.showNama();
        NestedClass ns = new NestedClass();
        NestedClass.InnerClass nsInner = ns.new InnerClass();
        nsInner.showJurusan();
    }
}
