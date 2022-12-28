class NestedClass {
    public static Object InerClass;
    String nama = "Zavier";
    String nim = "xxxxxxx205";

    public void printNama() {
        System.out.println(nama + " : " + nim);
    }

    static class StaticNestedClass {
        static String jurusan = "Informatika";

        static public void showNama() {
            NestedClass ns = new NestedClass();
            ns.printNama();
        }
    }

    class InnerClass {
        void showJurusan() {
            System.out.println("Jurusan : " + NestedClass.StaticNestedClass.jurusan);
        }
    }
}